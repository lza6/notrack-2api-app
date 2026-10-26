package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ir0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[hr0.values().length];
        try {
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
