package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qz1 implements mk3 {
    public final /* synthetic */ wz1 a;
    public final /* synthetic */ nk3 b;

    public qz1(wz1 wz1Var, nk3 nk3Var) {
        this.a = wz1Var;
        this.b = nk3Var;
    }

    @Override // defpackage.mk3
    public final float a(float f) {
        float fAbs = Math.abs(f);
        jz1 jz1VarG = this.a.g();
        List list = jz1VarG.l;
        int iB = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iB += rz1.b((kz1) it.next(), jz1VarG.q);
            }
            iB /= size;
        }
        float f2 = fAbs - iB;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        return Math.signum(f) * f2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
    @Override // defpackage.mk3
    public final float b(float f) {
        wz1 wz1Var = this.a;
        List list = wz1Var.g().l;
        int size = list.size();
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            kz1 kz1Var = (kz1) list.get(i);
            jz1 jz1VarG = wz1Var.g();
            int iE = (int) (jz1VarG.q == nq2.c ? jz1VarG.e() & 4294967295L : jz1VarG.e() >> 32);
            int i2 = -wz1Var.g().m;
            int i3 = wz1Var.g().r;
            int iB = rz1.b(kz1Var, wz1Var.g().q);
            int iA = rz1.a(kz1Var, wz1Var.g().q);
            int i4 = wz1Var.g().o;
            ((bg1) this.b).getClass();
            float f4 = iA - ((((iE - i2) - i3) / 2) - (iB / 2));
            if (f4 <= 0.0f && f4 > f2) {
                f2 = f4;
            }
            if (f4 >= 0.0f && f4 < f3) {
                f3 = f4;
            }
        }
        char c = Math.abs(f) >= ((jz1) wz1Var.e.getValue()).i.w(400.0f) ? f > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c == 0) {
            if (Math.abs(f3) <= Math.abs(f2)) {
                f2 = f3;
            }
        } else if (c == 1) {
            f2 = f3;
        } else if (c != 2) {
            f2 = 0.0f;
        }
        if (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f2;
    }
}
