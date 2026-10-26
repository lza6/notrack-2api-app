package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends ww1 implements le1 {
    public static final v1 A;
    public static final v1 B;
    public static final v1 C;
    public static final v1 D;
    public static final v1 E;
    public static final v1 F;
    public static final v1 G;
    public static final v1 H;
    public static final v1 I;
    public static final v1 J;
    public static final v1 K;
    public static final v1 L;
    public static final v1 d;
    public static final v1 h;
    public static final v1 l;
    public static final v1 m;
    public static final v1 n;
    public static final v1 o;
    public static final v1 p;
    public static final v1 q;
    public static final v1 r;
    public static final v1 s;
    public static final v1 t;
    public static final v1 u;
    public static final v1 v;
    public static final v1 w;
    public static final v1 x;
    public static final v1 y;
    public static final v1 z;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new v1(i, 0);
        h = new v1(i, 1);
        l = new v1(i, 2);
        m = new v1(i, 3);
        n = new v1(i, 4);
        o = new v1(i, 5);
        p = new v1(i, 6);
        q = new v1(i, 7);
        r = new v1(i, 8);
        s = new v1(i, 9);
        t = new v1(i, 10);
        u = new v1(i, 11);
        v = new v1(i, 12);
        w = new v1(i, 13);
        x = new v1(i, 14);
        y = new v1(i, 15);
        z = new v1(i, 16);
        A = new v1(i, 17);
        B = new v1(i, 18);
        C = new v1(i, 19);
        D = new v1(i, 20);
        E = new v1(i, 21);
        F = new v1(i, 22);
        G = new v1(i, 23);
        H = new v1(i, 24);
        I = new v1(i, 25);
        J = new v1(i, 26);
        K = new v1(i, 27);
        L = new v1(i, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return w84Var;
            case 1:
                pu1[] pu1VarArr = ef3.a;
                ((ue3) ((gf3) obj)).j(cf3.v, w84Var);
                return w84Var;
            case 2:
                ((Number) obj).longValue();
                return w84Var;
            case 3:
                ((Number) obj).longValue();
                return w84Var;
            case 4:
                return w84Var;
            case 5:
                pu1[] pu1VarArr2 = ef3.a;
                ((ue3) ((gf3) obj)).j(cf3.u, w84Var);
                return w84Var;
            case 6:
                return w84Var;
            case 7:
                ((Number) obj).longValue();
                return w84Var;
            case 8:
                me meVar = (me) obj;
                meVar.getHandler().post(new k4(meVar.y, 2));
                return w84Var;
            case 9:
                return w84Var;
            case 10:
                return w84Var;
            case 11:
                return w84Var;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 13:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 14:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 15:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 16:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return bool5;
            case 17:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return bool6;
            case 18:
                return Boolean.valueOf(!(((dg) obj) instanceof xs2));
            case 19:
                return w84Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                ((mr) obj).x0();
                return w84Var;
            case 21:
                return w84Var;
            case 22:
                return w84Var;
            case 23:
                return w84Var;
            case 24:
                return w84Var;
            case 25:
                return Long.valueOf(((Number) obj).longValue());
            case 26:
                ((wx1) obj).a();
                return w84Var;
            case 27:
                List list = (List) obj;
                float fFloatValue = ((Number) list.get(0)).floatValue();
                float fFloatValue2 = ((Number) list.get(1)).floatValue();
                float fFloatValue3 = ((Number) list.get(2)).floatValue();
                float f = wh.a;
                return new lw(fFloatValue, fFloatValue2, fFloatValue3);
            default:
                return w84Var;
        }
    }
}
