package defpackage;

import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class rb3 implements gc3 {
    public static final fp1 i;
    public final ct2 a;
    public float e;
    public final ct2 b = new ct2(0);
    public final hh2 c = new hh2();
    public final ct2 d = new ct2(IntCompanionObject.MAX_VALUE);
    public final mt0 f = new mt0(new pj2(10, this));
    public final fv0 g = cl3.b(new qb3(this, 1));
    public final fv0 h = cl3.b(new qb3(this, 0));

    static {
        y93 y93Var = y93.K;
        ba3 ba3Var = ba3.z;
        fp1 fp1Var = z93.a;
        i = new fp1(y93Var, ba3Var);
    }

    public rb3(int i2) {
        this.a = new ct2(i2);
    }

    @Override // defpackage.gc3
    public final boolean a() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.gc3
    public final boolean b() {
        return this.f.b();
    }

    @Override // defpackage.gc3
    public final boolean c() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // defpackage.gc3
    public final Object d(ri2 ri2Var, ne1 ne1Var, uo0 uo0Var) {
        Object objD = this.f.d(ri2Var, ne1Var, uo0Var);
        return objD == hq0.c ? objD : w84.a;
    }

    @Override // defpackage.gc3
    public final float e(float f) {
        return this.f.e(f);
    }

    public final void f(int i2) {
        ct2 ct2Var = this.a;
        this.d.h(i2);
        pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
        le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
        pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (ct2Var.f() > i2) {
                ct2Var.h(i2);
            }
        } finally {
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
        }
    }
}
