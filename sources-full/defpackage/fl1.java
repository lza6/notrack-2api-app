package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fl1 extends ww1 implements le1 {
    public static final fl1 A;
    public static final fl1 B;
    public static final fl1 C;
    public static final fl1 D;
    public static final fl1 E;
    public static final fl1 F;
    public static final fl1 G;
    public static final fl1 H;
    public static final fl1 I;
    public static final fl1 J;
    public static final fl1 K;
    public static final fl1 L;
    public static final fl1 M;
    public static final fl1 d;
    public static final fl1 h;
    public static final fl1 l;
    public static final fl1 m;
    public static final fl1 n;
    public static final fl1 o;
    public static final fl1 p;
    public static final fl1 q;
    public static final fl1 r;
    public static final fl1 s;
    public static final fl1 t;
    public static final fl1 u;
    public static final fl1 v;
    public static final fl1 w;
    public static final fl1 x;
    public static final fl1 y;
    public static final fl1 z;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new fl1(i, 0);
        h = new fl1(i, 1);
        l = new fl1(i, 2);
        m = new fl1(i, 3);
        n = new fl1(i, 4);
        o = new fl1(i, 5);
        p = new fl1(i, 6);
        q = new fl1(i, 7);
        r = new fl1(i, 8);
        s = new fl1(i, 9);
        t = new fl1(i, 10);
        u = new fl1(i, 11);
        v = new fl1(i, 12);
        w = new fl1(i, 13);
        x = new fl1(i, 14);
        y = new fl1(i, 15);
        z = new fl1(i, 16);
        A = new fl1(i, 17);
        B = new fl1(i, 18);
        C = new fl1(i, 19);
        D = new fl1(i, 20);
        E = new fl1(i, 21);
        F = new fl1(i, 22);
        G = new fl1(i, 23);
        H = new fl1(i, 24);
        I = new fl1(i, 25);
        J = new fl1(i, 26);
        K = new fl1(i, 27);
        L = new fl1(i, 28);
        M = new fl1(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl1(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                ef3.j((gf3) obj, 0);
                return w84Var;
            case 1:
                ef3.j((gf3) obj, 1);
                return w84Var;
            case 2:
                ef3.j((gf3) obj, 0);
                return w84Var;
            case 3:
                ef3.j((gf3) obj, 1);
                return w84Var;
            case 4:
                ef3.j((gf3) obj, 0);
                return w84Var;
            case 5:
                ef3.j((gf3) obj, 1);
                return w84Var;
            case 6:
                return w84Var;
            case 7:
                ((zt3) obj).e(null);
                return w84Var;
            case 8:
                return w84Var;
            case 9:
                List list = (List) obj;
                return new wz1(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 10:
                ((Number) obj).intValue();
                return z21.c;
            case 11:
                return w84Var;
            case 12:
                ((Number) obj).intValue();
                return null;
            case 13:
                List list2 = (List) obj;
                return new g22(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 14:
                return w84Var;
            case 15:
                return w84Var;
            case 16:
                int i2 = ((en1) obj).a;
                return w84Var;
            case 17:
                return w84Var;
            case 18:
                pv2 pv2Var = (pv2) obj;
                if (pv2Var.isValidOwnerScope()) {
                    pv2Var.d.o0(pv2Var);
                }
                return w84Var;
            case 19:
                ((Number) obj).longValue();
                return w84Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                ef3.k((gf3) obj);
                return w84Var;
            case 21:
                return Boolean.TRUE;
            case 22:
                pu1[] pu1VarArr = ef3.a;
                ((ue3) ((gf3) obj)).j(cf3.v, w84Var);
                return w84Var;
            case 23:
                ((Number) obj).longValue();
                return w84Var;
            case 24:
                ss2 ss2Var = (ss2) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(ss2Var.b);
                sb.append(", ");
                return fq2.p(sb, ss2Var.c, ')');
            case 25:
                ef3.j((gf3) obj, 4);
                return w84Var;
            case 26:
                return Boolean.TRUE;
            case 27:
                wr2 wr2Var = ((wl2) obj).N;
                if (wr2Var != null) {
                    wr2Var.invalidate();
                }
                return w84Var;
            case 28:
                wl2 wl2Var = (wl2) obj;
                if (wl2Var.isValidOwnerScope() && wl2Var.m1(true)) {
                    ux1 ux1Var = wl2Var.t;
                    yx1 yx1Var = ux1Var.O;
                    if (yx1Var.l > 0) {
                        if (yx1Var.k || yx1Var.j) {
                            ux1Var.R(false);
                        }
                        yx1Var.p.v0();
                    }
                    yr2 yr2VarA = xx1.a(ux1Var);
                    yr2VarA.getRectManager().e(ux1Var);
                    yr2VarA.requestOnPositionedCallback(ux1Var);
                }
                return w84Var;
            default:
                kn2 kn2Var = (kn2) obj;
                if (kn2Var.isValidOwnerScope()) {
                    kn2Var.c.F();
                }
                return w84Var;
        }
    }
}
