package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y93 extends ww1 implements ne1 {
    public static final y93 A;
    public static final y93 B;
    public static final y93 C;
    public static final y93 D;
    public static final y93 E;
    public static final y93 F;
    public static final y93 G;
    public static final y93 H;
    public static final y93 I;
    public static final y93 J;
    public static final y93 K;
    public static final y93 L;
    public static final y93 M;
    public static final y93 d;
    public static final y93 h;
    public static final y93 l;
    public static final y93 m;
    public static final y93 n;
    public static final y93 o;
    public static final y93 p;
    public static final y93 q;
    public static final y93 r;
    public static final y93 s;
    public static final y93 t;
    public static final y93 u;
    public static final y93 v;
    public static final y93 w;
    public static final y93 x;
    public static final y93 y;
    public static final y93 z;
    public final /* synthetic */ int c;

    static {
        int i = 2;
        d = new y93(i, 0);
        h = new y93(i, 1);
        l = new y93(i, 2);
        m = new y93(i, 3);
        n = new y93(i, 4);
        o = new y93(i, 5);
        p = new y93(i, 6);
        q = new y93(i, 7);
        r = new y93(i, 8);
        s = new y93(i, 9);
        t = new y93(i, 10);
        u = new y93(i, 11);
        v = new y93(i, 12);
        w = new y93(i, 13);
        x = new y93(i, 14);
        y = new y93(i, 15);
        z = new y93(i, 16);
        A = new y93(i, 17);
        B = new y93(i, 18);
        C = new y93(i, 19);
        D = new y93(i, 20);
        E = new y93(i, 21);
        F = new y93(i, 22);
        G = new y93(i, 23);
        H = new y93(i, 24);
        I = new y93(i, 25);
        J = new y93(i, 26);
        K = new y93(i, 27);
        L = new y93(i, 28);
        M = new y93(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y93(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        kg kgVar;
        Object objA;
        int i = 0;
        switch (this.c) {
            case 0:
                return obj2;
            case 1:
                hg hgVar = (hg) obj2;
                String str = hgVar.d;
                fp1 fp1Var = ca3.a;
                return kr1.o(str, ca3.a(hgVar.c, ca3.b, (a93) obj));
            case 2:
                a93 a93Var = (a93) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    arrayList.add(ca3.a((gg) list.get(i), ca3.c, a93Var));
                    i++;
                }
                return arrayList;
            case 3:
                a93 a93Var2 = (a93) obj;
                gg ggVar = (gg) obj2;
                Object obj3 = ggVar.a;
                if (obj3 instanceof xs2) {
                    kgVar = kg.c;
                } else if (obj3 instanceof em3) {
                    kgVar = kg.d;
                } else if (obj3 instanceof ic4) {
                    kgVar = kg.h;
                } else if (obj3 instanceof ea4) {
                    kgVar = kg.l;
                } else if (obj3 instanceof l42) {
                    kgVar = kg.m;
                } else if (obj3 instanceof k42) {
                    kgVar = kg.n;
                } else {
                    if (!(obj3 instanceof io3)) {
                        m51.e();
                        return null;
                    }
                    kgVar = kg.o;
                }
                switch (kgVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objA = ca3.a((xs2) obj3, ca3.h, a93Var2);
                        break;
                    case 1:
                        obj3.getClass();
                        objA = ca3.a((em3) obj3, ca3.i, a93Var2);
                        break;
                    case 2:
                        obj3.getClass();
                        objA = ca3.a((ic4) obj3, ca3.d, a93Var2);
                        break;
                    case 3:
                        obj3.getClass();
                        objA = ca3.a((ea4) obj3, ca3.e, a93Var2);
                        break;
                    case 4:
                        obj3.getClass();
                        objA = ca3.a((l42) obj3, ca3.f, a93Var2);
                        break;
                    case 5:
                        obj3.getClass();
                        objA = ca3.a((k42) obj3, ca3.g, a93Var2);
                        break;
                    case 6:
                        obj3.getClass();
                        objA = ((io3) obj3).a;
                        fp1 fp1Var2 = ca3.a;
                        break;
                    default:
                        u41.e();
                        return null;
                }
                return kr1.o(kgVar, objA, Integer.valueOf(ggVar.b), Integer.valueOf(ggVar.c), ggVar.d);
            case 4:
                return Float.valueOf(((zr) obj2).a);
            case 5:
                k42 k42Var = (k42) obj2;
                String str2 = k42Var.a;
                fp1 fp1Var3 = ca3.a;
                return kr1.o(str2, ca3.a(k42Var.b, ca3.j, (a93) obj));
            case 6:
                long j = ((re0) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(gb2.X(j));
            case 7:
                return Integer.valueOf(((ic1) obj2).c);
            case 8:
                c42 c42Var = (c42) obj2;
                z32 z32Var = new z32(c42Var.a);
                fp1 fp1Var4 = ca3.a;
                return kr1.o(z32Var, new b42(c42Var.b), new a42());
            case 9:
                l42 l42Var = (l42) obj2;
                String str3 = l42Var.a;
                fp1 fp1Var5 = ca3.a;
                return kr1.o(str3, ca3.a(l42Var.b, ca3.j, (a93) obj));
            case 10:
                a93 a93Var3 = (a93) obj;
                List list2 = ((g72) obj2).c;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i < size2) {
                    arrayList2.add(ca3.a((f72) list2.get(i), ca3.v, a93Var3));
                    i++;
                }
                return arrayList2;
            case 11:
                return ((f72) obj2).a.toLanguageTag();
            case 12:
                long j2 = ((ln2) obj2).a;
                if (ln2.c(j2, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float fValueOf = Float.valueOf(Float.intBitsToFloat((int) (j2 >> 32)));
                fp1 fp1Var6 = ca3.a;
                return kr1.o(fValueOf, Float.valueOf(Float.intBitsToFloat((int) (j2 & 4294967295L))));
            case 13:
                a93 a93Var4 = (a93) obj;
                xs2 xs2Var = (xs2) obj2;
                jt3 jt3Var = new jt3(xs2Var.a);
                fp1 fp1Var7 = ca3.a;
                wt3 wt3Var = new wt3(xs2Var.b);
                Object objA2 = ca3.a(new yz3(xs2Var.c), ca3.s, a93Var4);
                ky3 ky3Var = xs2Var.d;
                ky3 ky3Var2 = ky3.c;
                Object objA3 = ca3.a(ky3Var, ca3.m, a93Var4);
                Object objA4 = ca3.a(xs2Var.e, da3.a, a93Var4);
                c42 c42Var2 = xs2Var.f;
                c42 c42Var3 = c42.c;
                return kr1.o(jt3Var, wt3Var, objA2, objA3, objA4, ca3.a(c42Var2, ca3.w, a93Var4), ca3.a(new x32(xs2Var.g), da3.b, a93Var4), new vk1(xs2Var.h), ca3.a(xs2Var.i, da3.c, a93Var4));
            case 14:
                a93 a93Var5 = (a93) obj;
                pg3 pg3Var = (pg3) obj2;
                return kr1.o(ca3.a(new re0(pg3Var.a), ca3.r, a93Var5), ca3.a(new ln2(pg3Var.b), ca3.t, a93Var5), Float.valueOf(pg3Var.c));
            case 15:
                a93 a93Var6 = (a93) obj;
                em3 em3Var = (em3) obj2;
                re0 re0Var = new re0(em3Var.a.a());
                aa3 aa3Var = ca3.r;
                Object objA5 = ca3.a(re0Var, aa3Var, a93Var6);
                yz3 yz3Var = new yz3(em3Var.b);
                aa3 aa3Var2 = ca3.s;
                Object objA6 = ca3.a(yz3Var, aa3Var2, a93Var6);
                ic1 ic1Var = em3Var.c;
                ic1 ic1Var2 = ic1.d;
                Object objA7 = ca3.a(ic1Var, ca3.n, a93Var6);
                gc1 gc1Var = em3Var.d;
                hc1 hc1Var = em3Var.e;
                String str4 = em3Var.g;
                Object objA8 = ca3.a(new yz3(em3Var.h), aa3Var2, a93Var6);
                Object objA9 = ca3.a(em3Var.i, ca3.o, a93Var6);
                Object objA10 = ca3.a(em3Var.j, ca3.l, a93Var6);
                g72 g72Var = em3Var.k;
                g72 g72Var2 = g72.h;
                Object objA11 = ca3.a(g72Var, ca3.u, a93Var6);
                Object objA12 = ca3.a(new re0(em3Var.l), aa3Var, a93Var6);
                Object objA13 = ca3.a(em3Var.m, ca3.k, a93Var6);
                pg3 pg3Var2 = em3Var.n;
                pg3 pg3Var3 = pg3.d;
                return kr1.o(objA5, objA6, objA7, gc1Var, hc1Var, -1, str4, objA8, objA9, objA10, objA11, objA12, objA13, ca3.a(pg3Var2, ca3.q, a93Var6));
            case 16:
                return Integer.valueOf(((tt3) obj2).a);
            case 17:
                iy3 iy3Var = (iy3) obj2;
                return kr1.o(Float.valueOf(iy3Var.a), Float.valueOf(iy3Var.b));
            case 18:
                a93 a93Var7 = (a93) obj;
                ky3 ky3Var3 = (ky3) obj2;
                yz3 yz3Var2 = new yz3(ky3Var3.a);
                aa3 aa3Var3 = ca3.s;
                return kr1.o(ca3.a(yz3Var2, aa3Var3, a93Var7), ca3.a(new yz3(ky3Var3.b), aa3Var3, a93Var7));
            case 19:
                a93 a93Var8 = (a93) obj;
                dz3 dz3Var = (dz3) obj2;
                em3 em3Var2 = dz3Var.a;
                fp1 fp1Var8 = ca3.i;
                return kr1.o(ca3.a(em3Var2, fp1Var8, a93Var8), ca3.a(dz3Var.b, fp1Var8, a93Var8), ca3.a(dz3Var.c, fp1Var8, a93Var8), ca3.a(dz3Var.d, fp1Var8, a93Var8));
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                long j3 = ((jz3) obj2).a;
                int i2 = jz3.c;
                Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                fp1 fp1Var9 = ca3.a;
                return kr1.o(numValueOf, Integer.valueOf((int) (j3 & 4294967295L)));
            case 21:
                long j4 = ((yz3) obj2).a;
                if (yz3.a(j4, yz3.c)) {
                    return Boolean.FALSE;
                }
                Float fValueOf2 = Float.valueOf(yz3.c(j4));
                fp1 fp1Var10 = ca3.a;
                return kr1.o(fValueOf2, new zz3(yz3.b(j4)));
            case 22:
                String str5 = ((ea4) obj2).a;
                fp1 fp1Var11 = ca3.a;
                return str5;
            case 23:
                String str6 = ((ic4) obj2).a;
                fp1 fp1Var12 = ca3.a;
                return str6;
            case 24:
                return Integer.valueOf(((x32) obj2).a);
            case 25:
                Boolean boolValueOf = Boolean.valueOf(((fw2) obj2).a);
                fp1 fp1Var13 = ca3.a;
                return kr1.o(boolValueOf, new l21());
            case 26:
                hz3 hz3Var = (hz3) obj2;
                gz3 gz3Var = new gz3(hz3Var.a);
                fp1 fp1Var14 = ca3.a;
                return kr1.o(gz3Var, Boolean.valueOf(hz3Var.b));
            case 27:
                return Integer.valueOf(((rb3) obj2).a.f());
            case 28:
                return Long.valueOf(((qe3) obj2).d.get());
            default:
                return (ga) obj;
        }
    }
}
