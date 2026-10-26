package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class az3 {
    public final bw3 a;
    public ne1 b;
    public final bw3 c;
    public final ft2 d;
    public final ft2 e;
    public final ft2 f;
    public final ft2 g;
    public final mx h;

    public az3() {
        bw3 bw3Var = new bw3();
        this.a = bw3Var;
        this.c = bw3Var;
        t73 t73Var = t73.t;
        this.d = new ft2(null, t73Var);
        this.e = new ft2(null, t73Var);
        this.f = new ft2(null, t73Var);
        this.g = cl3.d(new rx0(0.0f));
        this.h = new mx();
    }

    public final long a(long j) {
        h43 h43VarG;
        cx1 cx1VarD = d();
        h43 h43Var = h43.e;
        if (cx1VarD != null) {
            if (cx1VarD.z()) {
                cx1 cx1Var = (cx1) this.f.getValue();
                h43VarG = cx1Var != null ? cx1Var.G(cx1VarD, true) : null;
            } else {
                h43VarG = h43Var;
            }
            if (h43VarG != null) {
                h43Var = h43VarG;
            }
        }
        return kr1.y(j, h43Var);
    }

    public final xy3 b() {
        return (xy3) this.c.getValue();
    }

    public final int c(long j, boolean z) {
        xy3 xy3VarB = b();
        if (xy3VarB == null) {
            return -1;
        }
        if (z) {
            j = a(j);
        }
        return xy3VarB.b.g(kr1.E(this, j));
    }

    public final cx1 d() {
        return (cx1) this.d.getValue();
    }

    public final boolean e(long j) {
        xy3 xy3VarB = b();
        if (xy3VarB == null) {
            return false;
        }
        long jE = kr1.E(this, a(j));
        int iE = xy3VarB.b.e(Float.intBitsToFloat((int) (4294967295L & jE)));
        int i = (int) (jE >> 32);
        return Float.intBitsToFloat(i) >= xy3VarB.e(iE) && Float.intBitsToFloat(i) <= xy3VarB.f(iE);
    }
}
