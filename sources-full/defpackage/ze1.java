package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ze1 {
    public final /* synthetic */ int a;
    public int b;
    public char[] c;
    public int d;
    public int e;

    public final int a() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                i = this.e;
                i2 = this.d;
                break;
            default:
                i = this.e;
                i2 = this.d;
                break;
        }
        return i - i2;
    }

    public final String toString() {
        switch (this.a) {
        }
        return BuildConfig.VERSION_NAME;
    }
}
