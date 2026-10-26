package defpackage;

import androidx.compose.ui.autofill.a;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bf3 extends ww1 implements ne1 {
    public static final bf3 A;
    public static final bf3 B;
    public static final bf3 C;
    public static final bf3 D;
    public static final bf3 E;
    public static final bf3 F;
    public static final bf3 G;
    public static final bf3 H;
    public static final bf3 I;
    public static final bf3 J;
    public static final bf3 K;
    public static final bf3 L;
    public static final bf3 M;
    public static final bf3 d;
    public static final bf3 h;
    public static final bf3 l;
    public static final bf3 m;
    public static final bf3 n;
    public static final bf3 o;
    public static final bf3 p;
    public static final bf3 q;
    public static final bf3 r;
    public static final bf3 s;
    public static final bf3 t;
    public static final bf3 u;
    public static final bf3 v;
    public static final bf3 w;
    public static final bf3 x;
    public static final bf3 y;
    public static final bf3 z;
    public final /* synthetic */ int c;

    static {
        int i = 2;
        d = new bf3(i, 0);
        h = new bf3(i, 1);
        l = new bf3(i, 2);
        m = new bf3(i, 3);
        n = new bf3(i, 4);
        o = new bf3(i, 5);
        p = new bf3(i, 6);
        q = new bf3(i, 7);
        r = new bf3(i, 8);
        s = new bf3(i, 9);
        t = new bf3(i, 10);
        u = new bf3(i, 11);
        v = new bf3(i, 12);
        w = new bf3(i, 13);
        x = new bf3(i, 14);
        y = new bf3(i, 15);
        z = new bf3(i, 16);
        A = new bf3(i, 17);
        B = new bf3(i, 18);
        C = new bf3(i, 19);
        D = new bf3(i, 20);
        E = new bf3(i, 21);
        F = new bf3(i, 22);
        G = new bf3(i, 23);
        H = new bf3(i, 24);
        I = new bf3(i, 25);
        J = new bf3(i, 26);
        K = new bf3(i, 27);
        L = new bf3(i, 28);
        M = new bf3(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf3(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        String str;
        se1 se1Var;
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 1:
                return (a) obj;
            case 2:
                return (w84) obj;
            case 3:
                return (w84) obj;
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 6:
                return (w84) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 8:
                n73 n73Var = (n73) obj;
                int i2 = ((n73) obj2).a;
                return n73Var;
            case 9:
                return (String) obj;
            case 10:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.addAll(list4);
                return arrayList2;
            case 11:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 12:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 13:
                z0 z0Var = (z0) obj;
                z0 z0Var2 = (z0) obj2;
                if (z0Var == null || (str = z0Var.a) == null) {
                    str = z0Var2.a;
                }
                if (z0Var == null || (se1Var = z0Var.b) == null) {
                    se1Var = z0Var2.b;
                }
                return new z0(str, se1Var);
            case 14:
                return obj == null ? obj2 : obj;
            case 15:
                return (ih3) ((ft2) ((hh3) obj2).c.g).getValue();
            case 16:
                return Integer.valueOf(((qb2) obj).d(((Number) obj2).intValue()));
            case 17:
                return Integer.valueOf(((qb2) obj).Q(((Number) obj2).intValue()));
            case 18:
                return Integer.valueOf(((qb2) obj).R(((Number) obj2).intValue()));
            case 19:
                return Integer.valueOf(((qb2) obj).M(((Number) obj2).intValue()));
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                rw3 rw3Var = (rw3) obj2;
                return kr1.U(Float.valueOf(rw3Var.a.f()), Boolean.valueOf(((nq2) rw3Var.f.getValue()) == nq2.c));
            case 21:
                a93 a93Var = (a93) obj;
                ey3 ey3Var = (ey3) obj2;
                return kr1.o(ca3.a(ey3Var.a, ca3.a, a93Var), ca3.a(new jz3(ey3Var.b), ca3.p, a93Var));
            case 22:
                w44 w44Var = (w44) obj2;
                return kr1.U(Float.valueOf(w44Var.a.f()), Float.valueOf(w44Var.c.f()), Float.valueOf(w44Var.b.f()));
            case 23:
                ug1 ug1Var = (ug1) obj;
                ug1Var.k = (String) obj2;
                ug1Var.c();
                return w84Var;
            case 24:
                ug1 ug1Var2 = (ug1) obj;
                ug1Var2.l = ((Number) obj2).floatValue();
                ug1Var2.s = true;
                ug1Var2.c();
                return w84Var;
            case 25:
                ug1 ug1Var3 = (ug1) obj;
                ug1Var3.m = ((Number) obj2).floatValue();
                ug1Var3.s = true;
                ug1Var3.c();
                return w84Var;
            case 26:
                ug1 ug1Var4 = (ug1) obj;
                ug1Var4.n = ((Number) obj2).floatValue();
                ug1Var4.s = true;
                ug1Var4.c();
                return w84Var;
            case 27:
                ug1 ug1Var5 = (ug1) obj;
                ug1Var5.o = ((Number) obj2).floatValue();
                ug1Var5.s = true;
                ug1Var5.c();
                return w84Var;
            case 28:
                ug1 ug1Var6 = (ug1) obj;
                ug1Var6.p = ((Number) obj2).floatValue();
                ug1Var6.s = true;
                ug1Var6.c();
                return w84Var;
            default:
                ug1 ug1Var7 = (ug1) obj;
                ug1Var7.q = ((Number) obj2).floatValue();
                ug1Var7.s = true;
                ug1Var7.c();
                return w84Var;
        }
    }
}
