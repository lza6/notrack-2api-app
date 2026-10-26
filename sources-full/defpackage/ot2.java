package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ot2 extends wa4 {
    public yx b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public yx g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public vo3 q;
    public final ic r;
    public ic s;
    public final ly1 t;

    public ot2() {
        int i = pb4.a;
        this.d = z21.c;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        ic icVarA = kc.a();
        this.r = icVarA;
        this.s = icVarA;
        this.t = yo4.H(q22.d, bb2.m);
    }

    @Override // defpackage.wa4
    public final void a(tz0 tz0Var) {
        tz0 tz0Var2;
        vo3 vo3Var;
        if (this.n) {
            y64.V(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        yx yxVar = this.b;
        if (yxVar != null) {
            tz0Var2 = tz0Var;
            tz0.h(tz0Var2, this.s, yxVar, this.c, null, 56);
        } else {
            tz0Var2 = tz0Var;
        }
        yx yxVar2 = this.g;
        if (yxVar2 != null) {
            vo3 vo3Var2 = this.q;
            if (this.o || vo3Var2 == null) {
                vo3 vo3Var3 = new vo3(this.h, this.f, this.i, this.j, 16);
                this.q = vo3Var3;
                this.o = false;
                vo3Var = vo3Var3;
            } else {
                vo3Var = vo3Var2;
            }
            tz0.h(tz0Var2, this.s, yxVar2, this.e, vo3Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        ic icVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = icVar;
            return;
        }
        if (kr1.n(this.s, icVar)) {
            this.s = kc.a();
        } else {
            int i = this.s.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.s.a.rewind();
            this.s.f(i);
        }
        ly1 ly1Var = this.t;
        ((jc) ly1Var.getValue()).a.setPath(icVar != null ? icVar.a : null, false);
        float length = ((jc) ly1Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((jc) ly1Var.getValue()).a(f4, f5, this.s);
        } else {
            ((jc) ly1Var.getValue()).a(f4, length, this.s);
            ((jc) ly1Var.getValue()).a(0.0f, f5, this.s);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
