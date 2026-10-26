package defpackage;

import androidx.compose.material3.a;

/* JADX INFO: loaded from: classes.dex */
public final class lw implements a {
    public final bt2 b;
    public final bt2 c;
    public final bt2 d;

    public lw(float f, float f2, float f3) {
        this.b = new bt2(f);
        this.c = new bt2(f3);
        this.d = new bt2(f2);
    }

    public final float a() {
        bt2 bt2Var = this.b;
        if (bt2Var.f() == 0.0f) {
            return 0.0f;
        }
        return this.d.f() / bt2Var.f();
    }
}
