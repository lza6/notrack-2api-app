package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class zq {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public zq(BackEvent backEvent) {
        rg rgVar = rg.a;
        float fD = rgVar.d(backEvent);
        float fE = rgVar.e(backEvent);
        float fB = rgVar.b(backEvent);
        int iC = rgVar.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return fq2.p(sb, this.d, '}');
    }
}
