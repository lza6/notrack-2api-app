package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wd2 implements za3 {
    public final g0 a;
    public final z84 b;
    public final c61 c;

    public wd2(z84 z84Var, c61 c61Var, g0 g0Var) {
        this.b = z84Var;
        c61Var.getClass();
        this.c = c61Var;
        this.a = g0Var;
    }

    @Override // defpackage.za3
    public final void a(Object obj, jb jbVar) {
        this.c.getClass();
        fq2.y(obj);
        throw null;
    }

    @Override // defpackage.za3
    public final int b(ef1 ef1Var) {
        this.b.getClass();
        return ef1Var.unknownFields.hashCode();
    }

    @Override // defpackage.za3
    public final void c(Object obj, Object obj2) {
        cb3.w(this.b, obj, obj2);
    }

    @Override // defpackage.za3
    public final void d(Object obj) {
        this.b.getClass();
        ((ef1) obj).unknownFields.e = false;
        this.c.getClass();
        fq2.y(obj);
        throw null;
    }

    @Override // defpackage.za3
    public final int e(ef1 ef1Var) {
        this.b.getClass();
        y84 y84Var = ef1Var.unknownFields;
        int i = y84Var.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < y84Var.a; i2++) {
            int i3 = y84Var.b[i2] >>> 3;
            iA += de0.a(3, (mz) y84Var.c[i2]) + de0.i(i3) + de0.h(2) + (de0.h(1) * 2);
        }
        y84Var.d = iA;
        return iA;
    }

    @Override // defpackage.za3
    public final boolean f(Object obj) {
        this.c.getClass();
        fq2.y(obj);
        throw null;
    }

    @Override // defpackage.za3
    public final void g(Object obj, byte[] bArr, int i, int i2, jl jlVar) {
        ef1 ef1Var = (ef1) obj;
        if (ef1Var.unknownFields == y84.f) {
            ef1Var.unknownFields = y84.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.za3
    public final boolean h(ef1 ef1Var, ef1 ef1Var2) {
        this.b.getClass();
        return ef1Var.unknownFields.equals(ef1Var2.unknownFields);
    }

    @Override // defpackage.za3
    public final void i(Object obj, ce0 ce0Var, b61 b61Var) {
        this.b.getClass();
        z84.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.za3
    public final Object j() {
        g0 g0Var = this.a;
        return g0Var instanceof ef1 ? ((ef1) g0Var).q() : g0Var.d().c();
    }
}
