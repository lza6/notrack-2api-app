package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vx1 {
    public final f8 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public f8 h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public vx1(f8 f8Var, int i) {
        this.j = i;
        this.a = f8Var;
    }

    public static final void a(vx1 vx1Var, ti1 ti1Var, int i, wl2 wl2Var) {
        HashMap map = vx1Var.i;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jI = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (vx1Var.j) {
                    case 0:
                        wr2 wr2Var = wl2Var.N;
                        if (wr2Var != null) {
                            jI = wr2Var.mo84xc59c8b2a(jI, false);
                        }
                        jI = g13.I(jI, wl2Var.E);
                        break;
                    default:
                        o82 o82VarN0 = wl2Var.N0();
                        o82VarN0.getClass();
                        long j = o82VarN0.u;
                        jI = ln2.i((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jI);
                        break;
                }
                wl2Var = wl2Var.v;
                wl2Var.getClass();
                if (wl2Var.equals(vx1Var.a.o())) {
                    int iRound = Math.round(ti1Var instanceof ti1 ? Float.intBitsToFloat((int) (jI & 4294967295L)) : Float.intBitsToFloat((int) (jI >> 32)));
                    if (map.containsKey(ti1Var)) {
                        int iIntValue = ((Number) y92.R(ti1Var, map)).intValue();
                        ti1 ti1Var2 = d8.a;
                        iRound = ((Number) ti1Var.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(ti1Var, Integer.valueOf(iRound));
                    return;
                }
            } while (!vx1Var.b(wl2Var).containsKey(ti1Var));
            float fC = vx1Var.c(wl2Var, ti1Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(wl2 wl2Var) {
        switch (this.j) {
            case 0:
                return wl2Var.y0().a();
            default:
                o82 o82VarN0 = wl2Var.N0();
                o82VarN0.getClass();
                return o82VarN0.y0().a();
        }
    }

    public final int c(wl2 wl2Var, ti1 ti1Var) {
        switch (this.j) {
            case 0:
                return wl2Var.U(ti1Var);
            default:
                o82 o82VarN0 = wl2Var.N0();
                o82VarN0.getClass();
                return o82VarN0.U(ti1Var);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        f8 f8Var = this.a;
        f8 f8VarP = f8Var.p();
        if (f8VarP == null) {
            return;
        }
        if (this.c) {
            f8VarP.P();
        } else if (this.e || this.d) {
            f8VarP.requestLayout();
        }
        if (this.f) {
            f8Var.P();
        }
        if (this.g) {
            f8Var.requestLayout();
        }
        f8VarP.a().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        e8 e8Var = new e8(0, this);
        f8 f8Var = this.a;
        f8Var.m(e8Var);
        map.putAll(b(f8Var.o()));
        this.b = false;
    }

    public final void h() {
        vx1 vx1VarA;
        vx1 vx1VarA2;
        boolean zD = d();
        f8 f8Var = this.a;
        if (!zD) {
            f8 f8VarP = f8Var.p();
            if (f8VarP == null) {
                return;
            }
            f8Var = f8VarP.a().h;
            if (f8Var == null || !f8Var.a().d()) {
                f8 f8Var2 = this.h;
                if (f8Var2 == null || f8Var2.a().d()) {
                    return;
                }
                f8 f8VarP2 = f8Var2.p();
                if (f8VarP2 != null && (vx1VarA2 = f8VarP2.a()) != null) {
                    vx1VarA2.h();
                }
                f8 f8VarP3 = f8Var2.p();
                f8Var = (f8VarP3 == null || (vx1VarA = f8VarP3.a()) == null) ? null : vx1VarA.h;
            }
        }
        this.h = f8Var;
    }
}
