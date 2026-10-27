#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""DuckFlow 入口（薄壳）：实际实现在 gateway/wb_proxy.py。

用法与原先完全一致：
    python wb_proxy.py --port 8788
"""
import os
import sys

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "gateway"))

from gateway.wb_proxy import main  # noqa: E402

if __name__ == "__main__":
    main()
