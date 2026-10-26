package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xq2 extends ww1 implements le1 {
    public static final xq2 A;
    public static final xq2 B;
    public static final xq2 C;
    public static final xq2 D;
    public static final xq2 E;
    public static final xq2 F;
    public static final xq2 G;
    public static final xq2 H;
    public static final xq2 I;
    public static final xq2 J;
    public static final xq2 K;
    public static final xq2 L;
    public static final xq2 M;
    public static final xq2 d;
    public static final xq2 h;
    public static final xq2 l;
    public static final xq2 m;
    public static final xq2 n;
    public static final xq2 o;
    public static final xq2 p;
    public static final xq2 q;
    public static final xq2 r;
    public static final xq2 s;
    public static final xq2 t;
    public static final xq2 u;
    public static final xq2 v;
    public static final xq2 w;
    public static final xq2 x;
    public static final xq2 y;
    public static final xq2 z;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new xq2(i, 0);
        h = new xq2(i, 1);
        l = new xq2(i, 2);
        m = new xq2(i, 3);
        n = new xq2(i, 4);
        o = new xq2(i, 5);
        p = new xq2(i, 6);
        q = new xq2(i, 7);
        r = new xq2(i, 8);
        s = new xq2(i, 9);
        t = new xq2(i, 10);
        u = new xq2(i, 11);
        v = new xq2(i, 12);
        w = new xq2(i, 13);
        x = new xq2(i, 14);
        y = new xq2(i, 15);
        z = new xq2(i, 16);
        A = new xq2(i, 17);
        B = new xq2(i, 18);
        C = new xq2(i, 19);
        D = new xq2(i, 20);
        E = new xq2(i, 21);
        F = new xq2(i, 22);
        G = new xq2(i, 23);
        H = new xq2(i, 24);
        I = new xq2(i, 25);
        J = new xq2(i, 26);
        K = new xq2(i, 27);
        L = new xq2(i, 28);
        M = new xq2(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xq2(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        gg ggVar;
        int i = this.c;
        dz3Var = null;
        dz3 dz3Var = null;
        dz3Var = null;
        dz3 dz3Var2 = null;
        k42Var = null;
        k42 k42Var = null;
        l42Var = null;
        l42 l42Var = null;
        ea4Var = null;
        ea4 ea4Var = null;
        ic4Var = null;
        ic4 ic4Var = null;
        em3Var = null;
        em3 em3Var = null;
        xs2Var = null;
        xs2 xs2Var = null;
        w84 w84Var = w84.a;
        int i2 = 0;
        switch (i) {
            case 0:
                return w84Var;
            case 1:
                return w84Var;
            case 2:
                su2 su2Var = (su2) obj;
                is2 is2Var = ac.b;
                o13 localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                su2Var.getClass();
                Context context = (Context) yo4.O(su2Var, localContext);
                wu0 wu0Var = (wu0) yo4.O(su2Var, CompositionLocalsKt.getLocalDensity());
                nr2 nr2Var = (nr2) yo4.O(su2Var, or2.a);
                if (nr2Var == null) {
                    return null;
                }
                return new cb(context, wu0Var, nr2Var.a, nr2Var.b);
            case 3:
                obj.getClass();
                return Boolean.valueOf(!((zr2) obj).isValidOwnerScope());
            case 4:
                ux1 ux1Var = (ux1) obj;
                if (ux1Var.F()) {
                    ux1Var.R(false);
                }
                return w84Var;
            case 5:
                ux1 ux1Var2 = (ux1) obj;
                if (ux1Var2.F()) {
                    ux1Var2.R(false);
                }
                return w84Var;
            case 6:
                ux1 ux1Var3 = (ux1) obj;
                if (ux1Var3.F()) {
                    ux1Var3.P(false);
                }
                return w84Var;
            case 7:
                ux1 ux1Var4 = (ux1) obj;
                if (ux1Var4.F()) {
                    ux1Var4.P(false);
                }
                return w84Var;
            case 8:
                ux1 ux1Var5 = (ux1) obj;
                if (ux1Var5.F()) {
                    ux1.Q(ux1Var5, false, 7);
                }
                return w84Var;
            case 9:
                ux1 ux1Var6 = (ux1) obj;
                if (ux1Var6.F()) {
                    ux1.S(ux1Var6, false, 7);
                }
                return w84Var;
            case 10:
                ux1 ux1Var7 = (ux1) obj;
                if (ux1Var7.F()) {
                    ux1Var7.D();
                }
                return w84Var;
            case 11:
                return w84Var;
            case 12:
                rx2 rx2Var = (rx2) obj;
                if (rx2Var.isAttachedToWindow()) {
                    rx2Var.g();
                }
                return w84Var;
            case 13:
                return w84Var;
            case 14:
                ef3.i((gf3) obj, h03.d);
                return w84Var;
            case 15:
                return w84Var;
            case 16:
                return new d93((Map) obj);
            case 17:
                return obj;
            case 18:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(1);
                List list2 = (kr1.n(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((le1) ca3.b.d).invoke(obj2);
                Object obj3 = list.get(0);
                String str = obj3 != null ? (String) obj3 : null;
                str.getClass();
                return new hg(list2, str);
            case 19:
                obj.getClass();
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                while (i2 < size) {
                    Object obj4 = list3.get(i2);
                    gg ggVar2 = (kr1.n(obj4, Boolean.FALSE) || obj4 == null) ? null : (gg) ((le1) ca3.c.d).invoke(obj4);
                    ggVar2.getClass();
                    arrayList.add(ggVar2);
                    i2++;
                }
                return arrayList;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                obj.getClass();
                List list4 = (List) obj;
                Object obj5 = list4.get(0);
                kg kgVar = obj5 != null ? (kg) obj5 : null;
                kgVar.getClass();
                Object obj6 = list4.get(2);
                Integer num = obj6 != null ? (Integer) obj6 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj7 = list4.get(3);
                Integer num2 = obj7 != null ? (Integer) obj7 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj8 = list4.get(4);
                String str2 = obj8 != null ? (String) obj8 : null;
                str2.getClass();
                switch (kgVar.ordinal()) {
                    case 0:
                        Object obj9 = list4.get(1);
                        fp1 fp1Var = ca3.h;
                        if (!kr1.n(obj9, Boolean.FALSE) && obj9 != null) {
                            xs2Var = (xs2) ((le1) fp1Var.d).invoke(obj9);
                        }
                        xs2Var.getClass();
                        ggVar = new gg(iIntValue, iIntValue2, xs2Var, str2);
                        break;
                    case 1:
                        Object obj10 = list4.get(1);
                        fp1 fp1Var2 = ca3.i;
                        if (!kr1.n(obj10, Boolean.FALSE) && obj10 != null) {
                            em3Var = (em3) ((le1) fp1Var2.d).invoke(obj10);
                        }
                        em3Var.getClass();
                        ggVar = new gg(iIntValue, iIntValue2, em3Var, str2);
                        break;
                    case 2:
                        Object obj11 = list4.get(1);
                        fp1 fp1Var3 = ca3.d;
                        if (!kr1.n(obj11, Boolean.FALSE) && obj11 != null) {
                            ic4Var = (ic4) ((le1) fp1Var3.d).invoke(obj11);
                        }
                        ic4Var.getClass();
                        ggVar = new gg(iIntValue, iIntValue2, ic4Var, str2);
                        break;
                    case 3:
                        Object obj12 = list4.get(1);
                        fp1 fp1Var4 = ca3.e;
                        if (!kr1.n(obj12, Boolean.FALSE) && obj12 != null) {
                            ea4Var = (ea4) ((le1) fp1Var4.d).invoke(obj12);
                        }
                        ea4Var.getClass();
                        ggVar = new gg(iIntValue, iIntValue2, ea4Var, str2);
                        break;
                    case 4:
                        Object obj13 = list4.get(1);
                        fp1 fp1Var5 = ca3.f;
                        if (!kr1.n(obj13, Boolean.FALSE) && obj13 != null) {
                            l42Var = (l42) ((le1) fp1Var5.d).invoke(obj13);
                        }
                        l42Var.getClass();
                        ggVar = new gg(iIntValue, iIntValue2, l42Var, str2);
                        break;
                    case 5:
                        Object obj14 = list4.get(1);
                        fp1 fp1Var6 = ca3.g;
                        if (!kr1.n(obj14, Boolean.FALSE) && obj14 != null) {
                            k42Var = (k42) ((le1) fp1Var6.d).invoke(obj14);
                        }
                        k42Var.getClass();
                        ggVar = new gg(iIntValue, iIntValue2, k42Var, str2);
                        break;
                    case 6:
                        Object obj15 = list4.get(1);
                        String str3 = obj15 != null ? (String) obj15 : null;
                        str3.getClass();
                        ggVar = new gg(iIntValue, iIntValue2, new io3(str3), str2);
                        break;
                    default:
                        u41.e();
                        return null;
                }
                return ggVar;
            case 21:
                obj.getClass();
                return new zr(((Float) obj).floatValue());
            case 22:
                obj.getClass();
                List list5 = (List) obj;
                Object obj16 = list5.get(0);
                String str4 = obj16 != null ? (String) obj16 : null;
                str4.getClass();
                Object obj17 = list5.get(1);
                fp1 fp1Var7 = ca3.j;
                if (!kr1.n(obj17, Boolean.FALSE) && obj17 != null) {
                    dz3Var2 = (dz3) ((le1) fp1Var7.d).invoke(obj17);
                }
                return new k42(str4, dz3Var2);
            case 23:
                if (kr1.n(obj, Boolean.FALSE)) {
                    return new re0(re0.i);
                }
                obj.getClass();
                return new re0(gb2.b(((Integer) obj).intValue()));
            case 24:
                obj.getClass();
                return new ic1(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                List list6 = (List) obj;
                Object obj18 = list6.get(0);
                z32 z32Var = obj18 != null ? (z32) obj18 : null;
                z32Var.getClass();
                float f = z32Var.a;
                Object obj19 = list6.get(1);
                b42 b42Var = obj19 != null ? (b42) obj19 : null;
                b42Var.getClass();
                int i3 = b42Var.a;
                Object obj20 = list6.get(2);
                (obj20 != null ? (a42) obj20 : null).getClass();
                return new c42(f, i3);
            case 26:
                obj.getClass();
                List list7 = (List) obj;
                Object obj21 = list7.get(0);
                String str5 = obj21 != null ? (String) obj21 : null;
                str5.getClass();
                Object obj22 = list7.get(1);
                fp1 fp1Var8 = ca3.j;
                if (!kr1.n(obj22, Boolean.FALSE) && obj22 != null) {
                    dz3Var = (dz3) ((le1) fp1Var8.d).invoke(obj22);
                }
                return new l42(str5, dz3Var);
            case 27:
                obj.getClass();
                List list8 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list8.size());
                int size2 = list8.size();
                while (i2 < size2) {
                    Object obj23 = list8.get(i2);
                    f72 f72Var = (kr1.n(obj23, Boolean.FALSE) || obj23 == null) ? null : (f72) ((le1) ca3.v.d).invoke(obj23);
                    f72Var.getClass();
                    arrayList2.add(f72Var);
                    i2++;
                }
                return new g72(arrayList2);
            case 28:
                obj.getClass();
                String str6 = (String) obj;
                yv2.a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str6);
                if (kr1.n(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new f72(localeForLanguageTag);
            default:
                if (kr1.n(obj, Boolean.FALSE)) {
                    return new ln2(9205357640488583168L);
                }
                obj.getClass();
                List list9 = (List) obj;
                Object obj24 = list9.get(0);
                Float f2 = obj24 != null ? (Float) obj24 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj25 = list9.get(1);
                Float f3 = obj25 != null ? (Float) obj25 : null;
                f3.getClass();
                return new ln2((((long) Float.floatToRawIntBits(f3.floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue)) << 32));
        }
    }
}
