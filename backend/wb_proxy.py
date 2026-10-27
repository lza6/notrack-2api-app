#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""DuckFlow 入口（薄壳）：实际实现在 gateway/ 子目录。"""
import os
import sys

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "gateway"))

from gateway.wb_proxy import main  # noqa: E402

if __name__ == "__main__":
    main()
