package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class l93 implements k32, Closeable {
    public final String c;
    public final k93 d;
    public boolean h;

    public l93(String str, k93 k93Var) {
        this.c = str;
        this.d = k93Var;
    }

    public final void a(h32 h32Var, t93 t93Var) {
        t93Var.getClass();
        h32Var.getClass();
        if (this.h) {
            u41.r("Already attached to lifecycleOwner");
            return;
        }
        this.h = true;
        h32Var.a(this);
        t93Var.c(this.c, this.d.e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.k32
    public final void onStateChanged(n32 n32Var, f32 f32Var) {
        if (f32Var == f32.ON_DESTROY) {
            this.h = false;
            n32Var.h().b(this);
        }
    }
}
