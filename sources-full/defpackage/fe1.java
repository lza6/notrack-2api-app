package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class fe1 implements aq3 {
    public final Context c;
    public final String d;
    public final gj h;
    public final boolean l;
    public final boolean m;
    public final yq3 n;
    public boolean o;

    public fe1(Context context, String str, gj gjVar, boolean z, boolean z2) {
        gjVar.getClass();
        this.c = context;
        this.d = str;
        this.h = gjVar;
        this.l = z;
        this.m = z2;
        this.n = new yq3(new j(15, this));
    }

    @Override // defpackage.aq3
    public final be1 J() {
        return ((ee1) this.n.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n.d != t73.C) {
            ((ee1) this.n.getValue()).close();
        }
    }

    @Override // defpackage.aq3
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.n.d != t73.C) {
            ee1 ee1Var = (ee1) this.n.getValue();
            ee1Var.getClass();
            ee1Var.setWriteAheadLoggingEnabled(z);
        }
        this.o = z;
    }
}
