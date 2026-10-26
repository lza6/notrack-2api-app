package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pv3 extends ww1 implements le1 {
    public static final pv3 A;
    public static final pv3 B;
    public static final pv3 C;
    public static final pv3 D;
    public static final pv3 E;
    public static final pv3 F;
    public static final pv3 G;
    public static final pv3 H;
    public static final pv3 I;
    public static final pv3 J;
    public static final pv3 K;
    public static final pv3 L;
    public static final pv3 M;
    public static final pv3 d;
    public static final pv3 h;
    public static final pv3 l;
    public static final pv3 m;
    public static final pv3 n;
    public static final pv3 o;
    public static final pv3 p;
    public static final pv3 q;
    public static final pv3 r;
    public static final pv3 s;
    public static final pv3 t;
    public static final pv3 u;
    public static final pv3 v;
    public static final pv3 w;
    public static final pv3 x;
    public static final pv3 y;
    public static final pv3 z;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new pv3(i, 0);
        h = new pv3(i, 1);
        l = new pv3(i, 2);
        m = new pv3(i, 3);
        n = new pv3(i, 4);
        o = new pv3(i, 5);
        p = new pv3(i, 6);
        q = new pv3(i, 7);
        r = new pv3(i, 8);
        s = new pv3(i, 9);
        t = new pv3(i, 10);
        u = new pv3(i, 11);
        v = new pv3(i, 12);
        w = new pv3(i, 13);
        x = new pv3(i, 14);
        y = new pv3(i, 15);
        z = new pv3(i, 16);
        A = new pv3(i, 17);
        B = new pv3(i, 18);
        C = new pv3(i, 19);
        D = new pv3(i, 20);
        E = new pv3(i, 21);
        F = new pv3(i, 22);
        G = new pv3(i, 23);
        H = new pv3(i, 24);
        I = new pv3(i, 25);
        J = new pv3(i, 26);
        K = new pv3(i, 27);
        L = new pv3(i, 28);
        M = new pv3(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv3(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        dz3 dz3VarA;
        em3 em3Var;
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                jw3 jw3Var = (jw3) obj;
                Integer numE = jw3Var.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j = jw3Var.f;
                int i2 = jz3.c;
                return new pu0(((int) (j & 4294967295L)) - iIntValue, 0);
            case 1:
                jw3 jw3Var2 = (jw3) obj;
                Integer numD = jw3Var2.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j2 = jw3Var2.f;
                int i3 = jz3.c;
                return new pu0(0, iIntValue2 - ((int) (j2 & 4294967295L)));
            case 2:
                jw3 jw3Var3 = (jw3) obj;
                Integer numC = jw3Var3.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j3 = jw3Var3.f;
                int i4 = jz3.c;
                return new pu0(((int) (j3 & 4294967295L)) - iIntValue3, 0);
            case 3:
                jw3 jw3Var4 = (jw3) obj;
                Integer numB = jw3Var4.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j4 = jw3Var4.f;
                int i5 = jz3.c;
                return new pu0(0, iIntValue4 - ((int) (j4 & 4294967295L)));
            case 4:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                nq2 nq2Var = ((Boolean) obj2).booleanValue() ? nq2.c : nq2.d;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new rw3(nq2Var, ((Float) obj3).floatValue());
            case 5:
                return w84Var;
            case 6:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                fp1 fp1Var = ca3.a;
                Boolean bool = Boolean.FALSE;
                hg hgVar = (kr1.n(obj4, bool) || obj4 == null) ? null : (hg) ((le1) fp1Var.d).invoke(obj4);
                hgVar.getClass();
                Object obj5 = list2.get(1);
                int i6 = jz3.c;
                jz3 jz3Var = (kr1.n(obj5, bool) || obj5 == null) ? null : (jz3) ((le1) ca3.p.d).invoke(obj5);
                jz3Var.getClass();
                return new ey3(hgVar, jz3Var.a, (jz3) null);
            case 7:
                return w84Var;
            case 8:
                int i7 = ((en1) obj).a;
                return w84Var;
            case 9:
                return w84Var;
            case 10:
                int i8 = ((en1) obj).a;
                return w84Var;
            case 11:
                return w84Var;
            case 12:
                return w84Var;
            case 13:
                return w84Var;
            case 14:
                gg ggVar = (gg) obj;
                Object obj6 = ggVar.a;
                if (!(obj6 instanceof m42) || (dz3VarA = ((m42) obj6).a()) == null || (dz3VarA.a == null && dz3VarA.b == null && dz3VarA.c == null && dz3VarA.d == null)) {
                    return kr1.o(ggVar);
                }
                Object obj7 = ggVar.a;
                obj7.getClass();
                dz3 dz3VarA2 = ((m42) obj7).a();
                if (dz3VarA2 == null || (em3Var = dz3VarA2.a) == null) {
                    em3Var = new em3(0L, 0L, (ic1) null, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65535);
                }
                return kr1.o(ggVar, new gg(ggVar.b, ggVar.c, em3Var));
            case 15:
                ((ue3) ((gf3) obj)).j(cf3.y, w84Var);
                return w84Var;
            case 16:
                List list3 = (List) obj;
                return new w44(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue(), ((Number) list3.get(2)).floatValue());
            case 17:
                ((je1) obj).invoke();
                return w84Var;
            case 18:
                long j5 = ((tx0) obj).a;
                return new zf(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
            case 19:
                zf zfVar = (zf) obj;
                return new tx0((((long) Float.floatToRawIntBits(zfVar.a)) << 32) | (((long) Float.floatToRawIntBits(zfVar.b)) & 4294967295L));
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return new yf(((rx0) obj).c);
            case 21:
                return new rx0(((yf) obj).a);
            case 22:
                return new yf(((Number) obj).floatValue());
            case 23:
                return Float.valueOf(((yf) obj).a);
            case 24:
                long j6 = ((iq1) obj).a;
                return new zf((int) (j6 >> 32), (int) (j6 & 4294967295L));
            case 25:
                zf zfVar2 = (zf) obj;
                return new iq1((((long) Math.round(zfVar2.a)) << 32) | (((long) Math.round(zfVar2.b)) & 4294967295L));
            case 26:
                long j7 = ((qq1) obj).a;
                return new zf((int) (j7 >> 32), (int) (j7 & 4294967295L));
            case 27:
                zf zfVar3 = (zf) obj;
                int iRound = Math.round(zfVar3.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(zfVar3.b);
                return new qq1((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
            case 28:
                return new yf(((Number) obj).intValue());
            default:
                return Integer.valueOf((int) ((yf) obj).a);
        }
    }
}
