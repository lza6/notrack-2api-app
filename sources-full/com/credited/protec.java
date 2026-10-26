package com.credited;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class protec {
    private static void b() {
        try {
            Class.forName("com.credited.setting");
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Integrity check failed");
        }
    }

    public static void my() {
        my(null);
    }

    public static void my(Context context) {
        setting.v(context);
        b();
    }
}
