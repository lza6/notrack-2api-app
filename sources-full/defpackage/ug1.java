package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ug1 extends wa4 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = re0.i;
    public List f;
    public boolean g;
    public ic h;
    public le1 i;
    public final e8 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public ug1() {
        int i = pb4.a;
        this.f = z21.c;
        this.g = true;
        this.j = new e8(18, this);
        this.k = BuildConfig.VERSION_NAME;
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.wa4
    public final void a(tz0 tz0Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = ob2.a();
                this.b = fArrA;
            } else {
                ob2.d(fArrA);
            }
            ob2.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            ob2.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                ic icVarA = this.h;
                if (icVarA == null) {
                    icVarA = kc.a();
                    this.h = icVarA;
                }
                y64.V(this.f, icVarA);
            }
            this.g = false;
        }
        ci4 ci4VarA = tz0Var.A();
        long jC = ci4VarA.C();
        ci4VarA.y().l();
        try {
            ci4 ci4Var = (ci4) ((jb) ci4VarA.d).d;
            float[] fArr = this.b;
            if (fArr != null) {
                ci4Var.y().q(fArr);
            }
            ic icVar = this.h;
            if (!this.f.isEmpty() && icVar != null) {
                ci4Var.y().o(icVar);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((wa4) arrayList.get(i)).a(tz0Var);
            }
        } finally {
            fq2.x(ci4VarA, jC);
        }
    }

    @Override // defpackage.wa4
    public final le1 b() {
        return this.i;
    }

    @Override // defpackage.wa4
    public final void d(e8 e8Var) {
        this.i = e8Var;
    }

    public final void e(int i, wa4 wa4Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, wa4Var);
        } else {
            arrayList.add(wa4Var);
        }
        g(wa4Var);
        wa4Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = pb4.a;
            if (re0.h(j2) == re0.h(j) && re0.g(j2) == re0.g(j) && re0.e(j2) == re0.e(j)) {
                return;
            }
            this.d = false;
            this.e = re0.i;
        }
    }

    public final void g(wa4 wa4Var) {
        if (!(wa4Var instanceof ot2)) {
            if (wa4Var instanceof ug1) {
                ug1 ug1Var = (ug1) wa4Var;
                if (ug1Var.d && this.d) {
                    f(ug1Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = re0.i;
                    return;
                }
            }
            return;
        }
        ot2 ot2Var = (ot2) wa4Var;
        yx yxVar = ot2Var.b;
        if (this.d && yxVar != null) {
            if (yxVar instanceof vl3) {
                f(((vl3) yxVar).a);
            } else {
                this.d = false;
                this.e = re0.i;
            }
        }
        yx yxVar2 = ot2Var.g;
        if (this.d && yxVar2 != null) {
            if (yxVar2 instanceof vl3) {
                f(((vl3) yxVar2).a);
            } else {
                this.d = false;
                this.e = re0.i;
            }
        }
    }

    public final void h(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                ((wa4) arrayList.get(i)).d(null);
                arrayList.remove(i);
            }
        }
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wa4 wa4Var = (wa4) arrayList.get(i);
            sb.append("\t");
            sb.append(wa4Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
