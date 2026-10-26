package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import app.template.extension.BuildConfig;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class hc implements us2 {
    public final String c;
    public final uz3 d;
    public final List h;
    public final List l;
    public final kb1 m;
    public final wu0 n;
    public final be o;
    public final CharSequence p;
    public final gx1 q;
    public iy2 r;
    public final boolean s;
    public final int t;

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX WARN: Code duplicated, block: B:217:0x043e  */
    /* JADX WARN: Code duplicated, block: B:229:0x047d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0487  */
    /* JADX WARN: Code duplicated, block: B:232:0x0492  */
    /* JADX WARN: Code duplicated, block: B:233:0x0499  */
    /* JADX WARN: Code duplicated, block: B:236:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:237:0x04af  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:240:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:242:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:245:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:247:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:256:0x0515  */
    /* JADX WARN: Code duplicated, block: B:269:0x0532  */
    /* JADX WARN: Code duplicated, block: B:272:0x056c  */
    /* JADX WARN: Code duplicated, block: B:274:0x0572  */
    /* JADX WARN: Code duplicated, block: B:277:0x0580  */
    /* JADX WARN: Code duplicated, block: B:279:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:281:0x05b0 A[LOOP:8: B:280:0x05ae->B:281:0x05b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:284:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:286:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:288:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:290:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:291:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:293:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:304:0x061d  */
    /* JADX WARN: Code duplicated, block: B:309:0x0638  */
    /* JADX WARN: Code duplicated, block: B:311:0x0644  */
    /* JADX WARN: Code duplicated, block: B:318:0x0658  */
    /* JADX WARN: Code duplicated, block: B:372:0x0793  */
    /* JADX WARN: Code duplicated, block: B:374:0x079a  */
    /* JADX WARN: Code duplicated, block: B:376:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:383:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:397:0x0809  */
    /* JADX WARN: Code duplicated, block: B:399:0x081a  */
    /* JADX WARN: Code duplicated, block: B:400:0x081e  */
    /* JADX WARN: Code duplicated, block: B:402:0x0829  */
    /* JADX WARN: Code duplicated, block: B:405:0x0833 A[LOOP:6: B:404:0x0831->B:405:0x0833, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:408:0x0844  */
    /* JADX WARN: Code duplicated, block: B:410:0x0851  */
    /* JADX WARN: Code duplicated, block: B:412:0x085e A[LOOP:7: B:411:0x085c->B:412:0x085e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:415:0x086b  */
    /* JADX WARN: Code duplicated, block: B:419:0x087d  */
    /* JADX WARN: Code duplicated, block: B:431:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:410:0x0851, please report this as an issue */
    public hc(String str, uz3 uz3Var, List list, List list2, kb1 kb1Var, wu0 wu0Var) throws Throwable {
        Locale locale;
        int i;
        Object obj;
        ic1 ic1Var;
        int i2;
        Typeface typeface;
        long j;
        CharSequence charSequence;
        int i3;
        ky3 ky3Var;
        xs2 xs2Var;
        ArrayList arrayList;
        int size;
        int i4;
        em3 em3Var;
        lb1 lb1Var;
        em3 em3Var2;
        lf lfVar;
        int size2;
        int i5;
        int[] iArr;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9;
        int size4;
        em3 em3VarC;
        int i10;
        ArrayList arrayList2;
        em3 em3Var3;
        int i11;
        int i12;
        int i13;
        int size5;
        int i14;
        boolean z;
        wu0 wu0Var2;
        List list3;
        ky3 ky3Var2;
        int size6;
        int i15;
        int i16;
        gg ggVar;
        long j2;
        long jB;
        int size7;
        int i17;
        gg ggVar2;
        dg dgVar;
        List list4;
        int i18;
        gg ggVar3;
        Object obj2;
        wu0 wu0Var3;
        xs2 xs2Var2;
        int i19;
        int i20;
        int i21;
        gg ggVar4;
        Object obj3;
        em3 em3Var4;
        int i22;
        long j3;
        long j4;
        long jB2;
        float fC;
        long jB3;
        float fC2;
        fw2 fw2Var;
        CharSequence charSequence2;
        this.c = str;
        this.d = uz3Var;
        this.h = list;
        this.l = list2;
        this.m = kb1Var;
        this.n = wu0Var;
        float density = wu0Var.getDensity();
        be beVar = new be(1);
        ((TextPaint) beVar).density = density;
        beVar.b = tt3.b;
        beVar.c = 3;
        beVar.d = pg3.d;
        this.o = beVar;
        jw2 jw2Var = uz3Var.c;
        em3 em3Var5 = uz3Var.a;
        xs2 xs2Var3 = uz3Var.b;
        jb jbVar = b21.a;
        jb jbVar2 = b21.a;
        gn3 gn3VarV = (gn3) jbVar2.d;
        if (gn3VarV == null) {
            if (y11.d()) {
                gn3VarV = jbVar2.v();
                jbVar2.d = gn3VarV;
            } else {
                gn3VarV = av1.b;
            }
        }
        this.s = ((Boolean) gn3VarV.getValue()).booleanValue();
        int i23 = xs2Var3.b;
        g72 g72Var = em3Var5.k;
        int i24 = 0;
        if (i23 == 4) {
            i = 2;
        } else if (i23 == 5) {
            i = 3;
        } else if (i23 == 1) {
            i = 0;
        } else if (i23 == 2) {
            i = 1;
        } else {
            if (i23 != 3 && i23 != Integer.MIN_VALUE) {
                u41.r("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((g72Var == null || (locale = ((f72) g72Var.c.get(0)).a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        this.t = i;
        gc gcVar = new gc(i24, this);
        hz3 hz3Var = xs2Var3.i;
        hz3Var = hz3Var == null ? hz3.c : hz3Var;
        beVar.setFlags(hz3Var.b ? beVar.getFlags() | Uuid.SIZE_BITS : beVar.getFlags() & (-129));
        int i25 = hz3Var.a;
        if (i25 == 1) {
            beVar.setFlags(beVar.getFlags() | 64);
            beVar.setHinting(0);
        } else if (i25 == 2) {
            beVar.getFlags();
            beVar.setHinting(1);
        } else if (i25 == 3) {
            beVar.getFlags();
            beVar.setHinting(0);
        } else {
            beVar.getFlags();
        }
        int size8 = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i26);
            if (((gg) obj).a instanceof em3) {
                break;
            } else {
                i26++;
            }
        }
        boolean z2 = obj != null;
        long j5 = em3Var5.b;
        ic1 ic1Var2 = em3Var5.c;
        gc1 gc1Var = em3Var5.d;
        String str2 = em3Var5.g;
        g72 g72Var2 = em3Var5.k;
        hy3 hy3Var = em3Var5.a;
        iy3 iy3Var = em3Var5.j;
        long j6 = em3Var5.h;
        boolean z3 = z2;
        long jB4 = yz3.b(j5);
        if (zz3.a(jB4, 4294967296L)) {
            beVar.setTextSize(wu0Var.f0(j5));
        } else if (zz3.a(jB4, 8589934592L)) {
            beVar.setTextSize(yz3.c(j5) * beVar.getTextSize());
        }
        lb1 lb1Var2 = em3Var5.f;
        if (lb1Var2 != null || gc1Var != null || ic1Var2 != null) {
            if (ic1Var2 == null) {
                ic1Var = ic1.h;
            }
            if (gc1Var != null) {
                ic1Var = ic1Var2;
                i2 = gc1Var.a;
            } else {
                ic1Var = ic1Var2;
                i2 = 0;
            }
            hc1 hc1Var = em3Var5.e;
            int i27 = hc1Var != null ? hc1Var.a : 65535;
            hc hcVar = (hc) gcVar.d;
            k74 k74VarB = ((mb1) hcVar.m).b(lb1Var2, ic1Var, i2, i27);
            if (k74VarB instanceof k74) {
                Object obj4 = k74VarB.c;
                obj4.getClass();
                typeface = (Typeface) obj4;
            } else {
                iy2 iy2Var = new iy2(k74VarB, hcVar.r);
                hcVar.r = iy2Var;
                Object obj5 = iy2Var.l;
                obj5.getClass();
                typeface = (Typeface) obj5;
            }
            beVar.setTypeface(typeface);
        }
        if (g72Var2 != null) {
            g72 g72Var3 = g72.h;
            if (!g72Var2.equals(yv2.a.z())) {
                ArrayList arrayList3 = new ArrayList(le0.q0(g72Var2, 10));
                Iterator it = g72Var2.c.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((f72) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                beVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals(BuildConfig.VERSION_NAME)) {
            beVar.setFontFeatureSettings(str2);
        }
        if (iy3Var != null && !iy3Var.equals(iy3.c)) {
            beVar.setTextScaleX(beVar.getTextScaleX() * iy3Var.a);
            beVar.setTextSkewX(beVar.getTextSkewX() + iy3Var.b);
        }
        beVar.d(hy3Var.a());
        beVar.c(hy3Var.b(), 9205357640488583168L, hy3Var.getAlpha());
        beVar.f(em3Var5.n);
        beVar.g(em3Var5.m);
        beVar.e(em3Var5.p);
        if (!zz3.a(yz3.b(j6), 4294967296L) || yz3.c(j6) == 0.0f) {
            j = j6;
            if (zz3.a(yz3.b(j), 8589934592L)) {
                beVar.setLetterSpacing(yz3.c(j));
            }
        } else {
            float textScaleX = beVar.getTextScaleX() * beVar.getTextSize();
            j = j6;
            float fF0 = wu0Var.f0(j);
            if (textScaleX != 0.0f) {
                beVar.setLetterSpacing(fF0 / textScaleX);
            }
        }
        long j7 = em3Var5.l;
        zr zrVar = em3Var5.i;
        boolean z4 = z3 && zz3.a(yz3.b(j), 4294967296L) && yz3.c(j) != 0.0f;
        long j8 = re0.i;
        boolean z5 = (re0.c(j7, j8) || re0.c(j7, re0.h)) ? false : true;
        boolean z6 = (zrVar == null || Float.compare(zrVar.a, 0.0f) == 0) ? false : true;
        em3 em3Var6 = (z4 || z5 || z6) ? new em3(0L, 0L, (ic1) null, (gc1) null, (hc1) null, (lb1) null, (String) null, z4 ? j : yz3.c, z6 ? zrVar : null, (iy3) null, (g72) null, z5 ? j7 : j8, (tt3) null, (pg3) null, 63103) : null;
        List list5 = this.h;
        if (em3Var6 != null) {
            int size9 = list5.size() + 1;
            ArrayList arrayList4 = new ArrayList(size9);
            int i28 = 0;
            while (i28 < size9) {
                arrayList4.add(i28 == 0 ? new gg(0, this.c.length(), em3Var6) : (gg) this.h.get(i28 - 1));
                i28++;
            }
            list5 = arrayList4;
        }
        String str3 = this.c;
        float textSize = this.o.getTextSize();
        uz3 uz3Var2 = this.d;
        List list6 = this.l;
        wu0 wu0Var4 = this.n;
        boolean z7 = this.s;
        ec ecVar = fc.a;
        if (z7 && y11.d()) {
            jw2 jw2Var2 = uz3Var2.c;
            if (jw2Var2 != null) {
                fw2 fw2Var2 = jw2Var2.b;
            }
            CharSequence charSequenceG = y11.a().g(0, str3.length(), 0, str3);
            charSequenceG.getClass();
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (!list5.isEmpty() || !list6.isEmpty() || !kr1.n(uz3Var2.b.d, ky3.c) || (uz3Var2.b.c & 1095216660480L) != 0) {
            charSequence2 = charSequence;
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            em3 em3Var7 = uz3Var2.a;
            xs2 xs2Var4 = uz3Var2.b;
            if (kr1.n(em3Var7.m, tt3.c)) {
                spannableString.setSpan(fc.a, 0, str3.length(), 33);
            }
            jw2 jw2Var3 = uz3Var2.c;
            if (((jw2Var3 == null || (fw2Var = jw2Var3.b) == null) ? false : fw2Var.a) && xs2Var4.f == null) {
                float fP = gb2.P(xs2Var4.c, textSize, wu0Var4);
                if (!Float.isNaN(fP)) {
                    spannableString.setSpan(new y32(fP), 0, spannableString.length(), 33);
                }
            } else {
                c42 c42Var = xs2Var4.f;
                c42Var = c42Var == null ? c42.c : c42Var;
                float fP2 = gb2.P(xs2Var4.c, textSize, wu0Var4);
                if (!Float.isNaN(fP2)) {
                    int length = (spannableString.length() == 0 || mo3.D0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i29 = c42Var.b;
                    i3 = 0;
                    spannableString.setSpan(new d42(fP2, length, (i29 & 1) > 0, (i29 & 16) > 0, c42Var.a, false), 0, spannableString.length(), 33);
                }
                ky3Var = xs2Var4.d;
                if (ky3Var != null) {
                    i22 = i3;
                    j3 = ky3Var.a;
                    j4 = ky3Var.b;
                    if ((!yz3.a(j3, gm4.D(i22)) && yz3.a(j4, gm4.D(i22))) || (j3 & 1095216660480L) == r13 || (j4 & 1095216660480L) == 0) {
                        xs2Var = xs2Var4;
                    } else {
                        jB2 = yz3.b(j3);
                        xs2Var = xs2Var4;
                        if (zz3.a(jB2, 4294967296L)) {
                            fC = wu0Var4.f0(j3);
                        } else if (zz3.a(jB2, 8589934592L)) {
                            fC = yz3.c(j3) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB3 = yz3.b(j4);
                        if (zz3.a(jB3, 4294967296L)) {
                            fC2 = wu0Var4.f0(j4);
                        } else if (zz3.a(jB3, 8589934592L)) {
                            fC2 = yz3.c(j4) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                } else {
                    xs2Var = xs2Var4;
                }
                arrayList = new ArrayList(list5.size());
                size = list5.size();
                for (i4 = 0; i4 < size; i4++) {
                    ggVar4 = (gg) list5.get(i4);
                    obj3 = ggVar4.a;
                    if (obj3 instanceof em3) {
                        em3Var4 = (em3) obj3;
                        if (em3Var4.f == null || em3Var4.d != null || em3Var4.c != null || ((em3) obj3).e != null) {
                            arrayList.add(ggVar4);
                        }
                    }
                }
                em3Var = uz3Var2.a;
                lb1Var = em3Var.f;
                if (lb1Var != null && em3Var.d == null && em3Var.c == null && em3Var.e == null) {
                    em3Var2 = null;
                } else {
                    em3Var2 = new em3(0L, 0L, em3Var.c, em3Var.d, em3Var.e, lb1Var, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65475);
                }
                lfVar = new lf(spannableString, 2, gcVar);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i5 = size2 * 2;
                    iArr = new int[i5];
                    size3 = arrayList.size();
                    for (i6 = 0; i6 < size3; i6++) {
                        gg ggVar5 = (gg) arrayList.get(i6);
                        iArr[i6] = ggVar5.b;
                        iArr[i6 + size2] = ggVar5.c;
                    }
                    if (i5 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i5 != 0) {
                        j93.g("Array is empty.");
                        throw null;
                    }
                    i7 = iArr[0];
                    i8 = 0;
                    while (i8 < i5) {
                        i9 = iArr[i8];
                        if (i9 == i7) {
                            arrayList2 = arrayList;
                            em3Var3 = em3Var2;
                            i11 = i8;
                        } else {
                            size4 = arrayList.size();
                            em3VarC = em3Var2;
                            i10 = 0;
                            while (i10 < size4) {
                                ArrayList arrayList5 = arrayList;
                                gg ggVar6 = (gg) arrayList.get(i10);
                                em3 em3Var8 = em3Var2;
                                i12 = ggVar6.b;
                                int i30 = i8;
                                i13 = ggVar6.c;
                                if (i12 == i13 && ig.b(i7, i9, i12, i13)) {
                                    em3 em3Var9 = (em3) ggVar6.a;
                                    em3VarC = em3VarC != null ? em3VarC.c(em3Var9) : em3Var9;
                                }
                                i10++;
                                arrayList = arrayList5;
                                em3Var2 = em3Var8;
                                i8 = i30;
                            }
                            arrayList2 = arrayList;
                            em3Var3 = em3Var2;
                            i11 = i8;
                            if (em3VarC != null) {
                                lfVar.invoke(em3VarC, Integer.valueOf(i7), Integer.valueOf(i9));
                            }
                            i7 = i9;
                        }
                        i8 = i11 + 1;
                        arrayList = arrayList2;
                        em3Var2 = em3Var3;
                    }
                } else if (!arrayList.isEmpty()) {
                    em3 em3Var10 = (em3) ((gg) arrayList.get(0)).a;
                    lfVar.invoke(em3Var2 != null ? em3Var2.c(em3Var10) : em3Var10, Integer.valueOf(((gg) arrayList.get(0)).b), Integer.valueOf(((gg) arrayList.get(0)).c));
                }
                size5 = list5.size();
                i14 = 0;
                z = false;
                while (i14 < size5) {
                    ggVar3 = (gg) list5.get(i14);
                    obj2 = ggVar3.a;
                    if (obj2 instanceof em3) {
                        i19 = ggVar3.b;
                        int i31 = ggVar3.c;
                        if (i19 >= 0 || i19 >= spannableString.length() || i31 <= i19 || i31 > spannableString.length()) {
                            size5 = size5;
                            z = z;
                            wu0Var3 = wu0Var4;
                            xs2Var2 = xs2Var;
                        } else {
                            em3 em3Var11 = (em3) obj2;
                            long j9 = em3Var11.h;
                            zr zrVar2 = em3Var11.i;
                            hy3 hy3Var2 = em3Var11.a;
                            if (zrVar2 != null) {
                                spannableString.setSpan(new as(zrVar2.a, 0), i19, i31, 33);
                            }
                            gb2.T(spannableString, hy3Var2.a(), i19, i31);
                            yx yxVarB = hy3Var2.b();
                            float alpha = hy3Var2.getAlpha();
                            if (yxVarB != null) {
                                if (yxVarB instanceof vl3) {
                                    gb2.T(spannableString, ((vl3) yxVarB).a, i19, i31);
                                } else {
                                    spannableString.setSpan(new og3((ng3) yxVarB, alpha), i19, i31, 33);
                                }
                            }
                            tt3 tt3Var = em3Var11.m;
                            if (tt3Var != null) {
                                int i32 = tt3Var.a;
                                ut3 ut3Var = new ut3((i32 | 1) == i32, (i32 | 2) == i32);
                                i20 = 33;
                                spannableString.setSpan(ut3Var, i19, i31, 33);
                            } else {
                                i20 = 33;
                            }
                            int i33 = i20;
                            xs2Var2 = xs2Var;
                            gb2.U(spannableString, em3Var11.b, wu0Var4, i19, i31);
                            String str4 = em3Var11.g;
                            if (str4 != null) {
                                spannableString.setSpan(new yd0(1, str4), i19, i31, i33);
                            }
                            iy3 iy3Var2 = em3Var11.j;
                            if (iy3Var2 != null) {
                                spannableString.setSpan(new ScaleXSpan(iy3Var2.a), i19, i31, i33);
                                spannableString.setSpan(new as(iy3Var2.b, 1), i19, i31, i33);
                            }
                            gb2.V(spannableString, em3Var11.k, i19, i31);
                            wu0Var3 = wu0Var4;
                            long j10 = em3Var11.l;
                            if (j10 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(gb2.X(j10)), i19, i31, i33);
                            }
                            pg3 pg3Var = em3Var11.n;
                            if (pg3Var != null) {
                                long j11 = pg3Var.b;
                                int iX = gb2.X(pg3Var.a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                                float f = pg3Var.c;
                                qg3 qg3Var = new qg3(iX, fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f);
                                i21 = 33;
                                spannableString.setSpan(qg3Var, i19, i31, 33);
                            } else {
                                i21 = i33;
                            }
                            uz0 uz0Var = em3Var11.p;
                            if (uz0Var != null) {
                                spannableString.setSpan(new vz0(uz0Var), i19, i31, i21);
                            }
                            z = (zz3.a(yz3.b(j9), 4294967296L) || zz3.a(yz3.b(j9), 8589934592L)) ? true : z;
                        }
                        z = z;
                    } else {
                        size5 = size5;
                        z = z;
                        wu0Var3 = wu0Var4;
                        xs2Var2 = xs2Var;
                        z = z;
                    }
                    i14++;
                    xs2Var = xs2Var2;
                    wu0Var4 = wu0Var3;
                    size5 = size5;
                }
                wu0Var2 = wu0Var4;
                xs2 xs2Var5 = xs2Var;
                if (z) {
                    size7 = list5.size();
                    i17 = 0;
                    while (i17 < size7) {
                        ggVar2 = (gg) list5.get(i17);
                        dgVar = (dg) ggVar2.a;
                        if (dgVar instanceof em3) {
                            i18 = ggVar2.b;
                            int i34 = ggVar2.c;
                            if (i18 >= 0 || i18 >= spannableString.length() || i34 <= i18 || i34 > spannableString.length()) {
                                list4 = list6;
                            } else {
                                long j12 = ((em3) dgVar).h;
                                long jB5 = yz3.b(j12);
                                list4 = list6;
                                Object d32Var = zz3.a(jB5, 4294967296L) ? new d32(wu0Var2.f0(j12)) : zz3.a(jB5, 8589934592L) ? new c32(yz3.c(j12)) : null;
                                if (d32Var != null) {
                                    spannableString.setSpan(d32Var, i18, i34, 33);
                                }
                            }
                        } else {
                            list4 = list6;
                        }
                        i17++;
                        list6 = list4;
                    }
                }
                list3 = list6;
                ky3Var2 = xs2Var5.d;
                if (ky3Var2 != null) {
                    j2 = ky3Var2.a;
                    jB = yz3.b(j2);
                    if (zz3.a(jB, 4294967296L)) {
                        wu0Var2.f0(j2);
                    } else if (zz3.a(jB, 8589934592L)) {
                        yz3.c(j2);
                    }
                }
                size6 = list5.size();
                for (i15 = 0; i15 < size6; i15++) {
                    Object obj6 = ((gg) list5.get(i15)).a;
                }
                charSequence2 = spannableString;
                if (list3.size() > 0) {
                    ggVar = (gg) list3.get(0);
                    if (ggVar.a == null) {
                        m51.t();
                        throw null;
                    }
                    for (Object obj7 : spannableString.getSpans(ggVar.b, ggVar.c, i74.class)) {
                        spannableString.removeSpan((i74) obj7);
                    }
                    throw null;
                }
            }
            i3 = 0;
            ky3Var = xs2Var4.d;
            if (ky3Var != null) {
                i22 = i3;
                j3 = ky3Var.a;
                j4 = ky3Var.b;
                if (!yz3.a(j3, gm4.D(i22))) {
                    jB2 = yz3.b(j3);
                    xs2Var = xs2Var4;
                    if (zz3.a(jB2, 4294967296L)) {
                        fC = wu0Var4.f0(j3);
                    } else if (zz3.a(jB2, 8589934592L)) {
                        fC = yz3.c(j3) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = yz3.b(j4);
                    if (zz3.a(jB3, 4294967296L)) {
                        fC2 = wu0Var4.f0(j4);
                    } else if (zz3.a(jB3, 8589934592L)) {
                        fC2 = yz3.c(j4) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                } else {
                    jB2 = yz3.b(j3);
                    xs2Var = xs2Var4;
                    if (zz3.a(jB2, 4294967296L)) {
                        fC = wu0Var4.f0(j3);
                    } else if (zz3.a(jB2, 8589934592L)) {
                        fC = yz3.c(j3) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = yz3.b(j4);
                    if (zz3.a(jB3, 4294967296L)) {
                        fC2 = wu0Var4.f0(j4);
                    } else if (zz3.a(jB3, 8589934592L)) {
                        fC2 = yz3.c(j4) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                }
            } else {
                xs2Var = xs2Var4;
            }
            arrayList = new ArrayList(list5.size());
            size = list5.size();
            while (i4 < size) {
                ggVar4 = (gg) list5.get(i4);
                obj3 = ggVar4.a;
                if (obj3 instanceof em3) {
                    em3Var4 = (em3) obj3;
                    if (em3Var4.f == null) {
                        arrayList.add(ggVar4);
                    } else {
                        arrayList.add(ggVar4);
                    }
                }
            }
            em3Var = uz3Var2.a;
            lb1Var = em3Var.f;
            if (lb1Var != null) {
                em3Var2 = new em3(0L, 0L, em3Var.c, em3Var.d, em3Var.e, lb1Var, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65475);
            } else {
                em3Var2 = new em3(0L, 0L, em3Var.c, em3Var.d, em3Var.e, lb1Var, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65475);
            }
            lfVar = new lf(spannableString, 2, gcVar);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i5 = size2 * 2;
                iArr = new int[i5];
                size3 = arrayList.size();
                while (i6 < size3) {
                    gg ggVar7 = (gg) arrayList.get(i6);
                    iArr[i6] = ggVar7.b;
                    iArr[i6 + size2] = ggVar7.c;
                }
                if (i5 > 1) {
                    Arrays.sort(iArr);
                }
                if (i5 != 0) {
                    j93.g("Array is empty.");
                    throw null;
                }
                i7 = iArr[0];
                i8 = 0;
                while (i8 < i5) {
                    i9 = iArr[i8];
                    if (i9 == i7) {
                        arrayList2 = arrayList;
                        em3Var3 = em3Var2;
                        i11 = i8;
                    } else {
                        size4 = arrayList.size();
                        em3VarC = em3Var2;
                        i10 = 0;
                        while (i10 < size4) {
                            ArrayList arrayList6 = arrayList;
                            gg ggVar8 = (gg) arrayList.get(i10);
                            em3 em3Var12 = em3Var2;
                            i12 = ggVar8.b;
                            int i35 = i8;
                            i13 = ggVar8.c;
                            if (i12 == i13) {
                            }
                            i10++;
                            arrayList = arrayList6;
                            em3Var2 = em3Var12;
                            i8 = i35;
                        }
                        arrayList2 = arrayList;
                        em3Var3 = em3Var2;
                        i11 = i8;
                        if (em3VarC != null) {
                            lfVar.invoke(em3VarC, Integer.valueOf(i7), Integer.valueOf(i9));
                        }
                        i7 = i9;
                    }
                    i8 = i11 + 1;
                    arrayList = arrayList2;
                    em3Var2 = em3Var3;
                }
            } else if (!arrayList.isEmpty()) {
                em3 em3Var13 = (em3) ((gg) arrayList.get(0)).a;
                lfVar.invoke(em3Var2 != null ? em3Var2.c(em3Var13) : em3Var13, Integer.valueOf(((gg) arrayList.get(0)).b), Integer.valueOf(((gg) arrayList.get(0)).c));
            }
            size5 = list5.size();
            i14 = 0;
            z = false;
            while (i14 < size5) {
                ggVar3 = (gg) list5.get(i14);
                obj2 = ggVar3.a;
                if (obj2 instanceof em3) {
                    i19 = ggVar3.b;
                    int i36 = ggVar3.c;
                    if (i19 >= 0) {
                        size5 = size5;
                        z = z;
                        wu0Var3 = wu0Var4;
                        xs2Var2 = xs2Var;
                        z = z;
                    } else {
                        size5 = size5;
                        z = z;
                        wu0Var3 = wu0Var4;
                        xs2Var2 = xs2Var;
                        z = z;
                    }
                } else {
                    size5 = size5;
                    z = z;
                    wu0Var3 = wu0Var4;
                    xs2Var2 = xs2Var;
                    z = z;
                }
                i14++;
                xs2Var = xs2Var2;
                wu0Var4 = wu0Var3;
                size5 = size5;
            }
            wu0Var2 = wu0Var4;
            xs2 xs2Var6 = xs2Var;
            if (z) {
                size7 = list5.size();
                i17 = 0;
                while (i17 < size7) {
                    ggVar2 = (gg) list5.get(i17);
                    dgVar = (dg) ggVar2.a;
                    if (dgVar instanceof em3) {
                        i18 = ggVar2.b;
                        int i37 = ggVar2.c;
                        if (i18 >= 0) {
                            list4 = list6;
                        } else {
                            list4 = list6;
                        }
                    } else {
                        list4 = list6;
                    }
                    i17++;
                    list6 = list4;
                }
            }
            list3 = list6;
            ky3Var2 = xs2Var6.d;
            if (ky3Var2 != null) {
                j2 = ky3Var2.a;
                jB = yz3.b(j2);
                if (zz3.a(jB, 4294967296L)) {
                    wu0Var2.f0(j2);
                } else if (zz3.a(jB, 8589934592L)) {
                    yz3.c(j2);
                }
            }
            size6 = list5.size();
            while (i15 < size6) {
                Object obj8 = ((gg) list5.get(i15)).a;
            }
            charSequence2 = spannableString;
            if (list3.size() > 0) {
                ggVar = (gg) list3.get(0);
                if (ggVar.a == null) {
                    m51.t();
                    throw null;
                }
                while (i16 < r1) {
                    spannableString.removeSpan((i74) obj7);
                }
                throw null;
            }
        }
        charSequence2 = charSequence;
        this.p = charSequence2;
        this.q = new gx1(charSequence2, this.o, this.t);
    }

    @Override // defpackage.us2
    public final float a() {
        gx1 gx1Var = this.q;
        float f = gx1Var.e;
        TextPaint textPaint = gx1Var.b;
        if (!Float.isNaN(f)) {
            return gx1Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = gx1Var.a;
        lineInstance.setText(new n30(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new lk0(2));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new ps2(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                ps2 ps2Var = (ps2) priorityQueue.peek();
                if (ps2Var != null && ((Number) ps2Var.d).intValue() - ((Number) ps2Var.c).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new ps2(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                m51.o();
                return 0.0f;
            }
            ps2 ps2Var2 = (ps2) it.next();
            desiredWidth = Layout.getDesiredWidth(gx1Var.b(), ((Number) ps2Var2.c).intValue(), ((Number) ps2Var2.d).intValue(), textPaint);
            while (it.hasNext()) {
                ps2 ps2Var3 = (ps2) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(gx1Var.b(), ((Number) ps2Var3.c).intValue(), ((Number) ps2Var3.d).intValue(), textPaint));
            }
        }
        gx1Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.us2
    public final boolean b() {
        iy2 iy2Var = this.r;
        if (iy2Var != null ? iy2Var.k() : false) {
            return true;
        }
        if (!this.s) {
            jw2 jw2Var = this.d.c;
            jb jbVar = b21.a;
            jb jbVar2 = b21.a;
            gn3 gn3VarV = (gn3) jbVar2.d;
            if (gn3VarV == null) {
                if (y11.d()) {
                    gn3VarV = jbVar2.v();
                    jbVar2.d = gn3VarV;
                } else {
                    gn3VarV = av1.b;
                }
            }
            if (((Boolean) gn3VarV.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.us2
    public final float c() {
        return this.q.c();
    }
}
