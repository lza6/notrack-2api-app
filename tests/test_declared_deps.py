"""依赖声明完整性：gateway/ 里 import 的三方模块必须在 requirements.txt 里声明。

CI 第一次运行就是被这个绊倒的：`mihomo_runner.parse_clash_yaml` 依赖 PyYAML，
但 requirements.txt 没写——本机恰好装了 PyYAML，所以本地一直绿，干净环境直接
ModuleNotFoundError。这个用例把「本机能跑」与「声明完整」分开检查。
"""
import ast
import os
import re
import sys

import pytest

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
GATEWAY = os.path.join(ROOT, "gateway")

# 发行版可能不含的本地模块（按需 import，调用点已做降级）：不是三方依赖
OPTIONAL_LOCAL = {
    "wb_agents", "wb_quota_scan", "wb_tasks", "wb_window_probe",
    "wb_modelsdev", "wb_webprompts", "wb_ipintel", "wb_activity", "wb_atrest",
}


def _requirements_names():
    text = open(os.path.join(ROOT, "requirements.txt"), encoding="utf-8").read()
    names = set()
    for line in text.splitlines():
        line = line.strip()
        if not line or line.startswith("#"):
            continue
        name = re.split(r"[<>=!~\[;]", line)[0].strip().lower()
        if name:
            names.add(name)
    return names


def _import_top_modules():
    stdlib = set(sys.stdlib_module_names)
    local = {os.path.splitext(f)[0] for f in os.listdir(GATEWAY) if f.endswith(".py")}
    found = {}
    for name in os.listdir(GATEWAY):
        if not name.endswith(".py"):
            continue
        path = os.path.join(GATEWAY, name)
        tree = ast.parse(open(path, encoding="utf-8").read())
        for node in ast.walk(tree):
            mods = []
            if isinstance(node, ast.Import):
                mods = [a.name.split(".")[0] for a in node.names]
            elif isinstance(node, ast.ImportFrom) and node.module and node.level == 0:
                mods = [node.module.split(".")[0]]
            for m in mods:
                if not m or m in stdlib or m in local or m == "gateway":
                    continue
                if m in OPTIONAL_LOCAL:
                    continue
                found.setdefault(m, set()).add(name)
    return found


# 发行名与 import 名不同的映射
DIST_ALIASES = {
    "yaml": {"pyyaml"},
    "websocket": {"websocket-client", "websocket_client"},
    "curl_cffi": {"curl_cffi", "curl-cffi"},
    "cryptography": {"cryptography"},
    "requests": {"requests"},
}


def test_all_third_party_imports_declared():
    declared = _requirements_names()
    missing = []
    for mod in sorted(_import_top_modules()):
        accepted = DIST_ALIASES.get(mod, {mod})
        if not (accepted & declared):
            missing.append(mod)
    assert not missing, (
        "以下三方模块被 import 但未在 requirements.txt 声明：%s "
        "（干净环境会 ModuleNotFoundError，本机装了才不报）" % missing)


def test_requirements_pins_are_parseable():
    """requirements 每行都能解析出包名（防止写成说明文字混进去）。"""
    for line in open(os.path.join(ROOT, "requirements.txt"), encoding="utf-8"):
        line = line.strip()
        if not line or line.startswith("#"):
            continue
        assert re.split(r"[<>=!~\[;]", line)[0].strip(), "无法解析的行: %r" % line


@pytest.mark.parametrize("module", ["yaml", "websocket"])
def test_ci_critical_modules_importable_or_declared(module):
    """CI 踩过的两个模块：要么能导入，要么明确声明（由 CI 安装）。"""
    import importlib.util
    declared = _requirements_names()
    alias = DIST_ALIASES.get(module, {module})
    assert importlib.util.find_spec(module) is not None or (alias & declared), (
        "%s 既不可导入也没声明" % module)
