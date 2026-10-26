package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class py implements wc3 {
    public static final d5 h;
    public static final d5 l;
    public static final d5 m;
    public static final d5 n;
    public static final d5 o;
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final byte[] d = new byte[0];
    public static final u21 p = new u21(false);
    public static final u21 q = new u21(true);
    public static final StackTraceElement[] r = new StackTraceElement[0];

    static {
        int i = 16;
        h = new d5("COMPLETING_ALREADY", i);
        l = new d5("COMPLETING_WAITING_CHILDREN", i);
        m = new d5("COMPLETING_RETRY", i);
        n = new d5("TOO_LATE_TO_CANCEL", i);
        o = new d5("SEALED", i);
    }

    public static final long A() {
        return Thread.currentThread().getId();
    }

    public static final void B(pg2 pg2Var, y00 y00Var, yx yxVar, float f, pg3 pg3Var, tt3 tt3Var, uz0 uz0Var) {
        ArrayList arrayList = pg2Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ss2 ss2Var = (ss2) arrayList.get(i);
            ss2Var.a.g(y00Var, yxVar, f, pg3Var, tt3Var, uz0Var);
            y00Var.g(0.0f, ss2Var.a.b());
        }
    }

    public static Set C() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final boolean D(dx2 dx2Var, long j, long j2) {
        int i = dx2Var.i == 1 ? 1 : 0;
        long j3 = dx2Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final ym3 E(gq0 gq0Var, xp0 xp0Var, jq0 jq0Var, ne1 ne1Var) throws Throwable {
        xp0 xp0VarL = yh4.L(gq0Var, xp0Var);
        jq0Var.getClass();
        ym3 n22Var = jq0Var == jq0.d ? new n22(xp0VarL, ne1Var) : new ym3(xp0VarL, true);
        n22Var.g0(jq0Var, n22Var, ne1Var);
        return n22Var;
    }

    public static /* synthetic */ ym3 F(gq0 gq0Var, xp0 xp0Var, jq0 jq0Var, ne1 ne1Var, int i) {
        if ((i & 1) != 0) {
            xp0Var = x21.c;
        }
        if ((i & 2) != 0) {
            jq0Var = jq0.c;
        }
        return E(gq0Var, xp0Var, jq0Var, ne1Var);
    }

    public static i00 G(xp0 xp0Var, ne1 ne1Var) {
        xp0Var.getClass();
        return kr1.G(new it0(xp0Var, jq0.c, ne1Var, 1));
    }

    public static final t73 H(final t73 t73Var, final String str, Executor executor, final je1 je1Var) {
        w84 w84Var = w84.a;
        t73Var.getClass();
        executor.getClass();
        final ih2 ih2Var = new ih2(0);
        final f00 f00Var = new f00();
        f00Var.c = new t53();
        i00 i00Var = new i00(f00Var);
        f00Var.b = i00Var;
        f00Var.a = fq2.class;
        try {
            executor.execute(new Runnable() { // from class: gq2
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    je1 je1Var2 = je1Var;
                    ih2 ih2Var2 = ih2Var;
                    f00 f00Var2 = f00Var;
                    t73Var.getClass();
                    boolean zB = jr1.B();
                    if (zB) {
                        try {
                            Trace.beginSection(jr1.O(str2));
                        } catch (Throwable th) {
                            if (zB) {
                                Trace.endSection();
                            }
                            throw th;
                        }
                    }
                    try {
                        je1Var2.invoke();
                        yp2 yp2Var = t73.v;
                        ih2Var2.e(yp2Var);
                        f00Var2.a(yp2Var);
                    } catch (Throwable th2) {
                        ih2Var2.e(new xp2(th2));
                        f00Var2.b(th2);
                    }
                    if (zB) {
                        Trace.endSection();
                    }
                }
            });
            f00Var.a = w84Var;
        } catch (Exception e) {
            i00Var.d.j(e);
        }
        return new t73(11);
    }

    public static final long L(dx2 dx2Var, boolean z) {
        long jH = ln2.h(dx2Var.c, dx2Var.g);
        if (z || !dx2Var.b()) {
            return jH;
        }
        return 0L;
    }

    public static final void N(t00 t00Var, so0 so0Var, boolean z) {
        Object objT = t00Var.t();
        Throwable thF = t00Var.f(objT);
        Object i63Var = thF != null ? new i63(thF) : t00Var.h(objT);
        if (!z) {
            so0Var.resumeWith(i63Var);
            return;
        }
        so0Var.getClass();
        nw0 nw0Var = (nw0) so0Var;
        so0 so0Var2 = nw0Var.m;
        Object obj = nw0Var.o;
        xp0 context = so0Var2.getContext();
        Object objD0 = yh4.d0(context, obj);
        o84 o84VarE0 = objD0 != yh4.p ? yh4.e0(so0Var2, context, objD0) : null;
        try {
            so0Var2.resumeWith(i63Var);
        } finally {
            if (o84VarE0 == null || o84VarE0.i0()) {
                yh4.R(context, objD0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static final int O(yc3 yc3Var, int i) {
        int i2;
        int[] iArr = yc3Var.n;
        int i3 = i + 1;
        int length = yc3Var.m.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 < i3) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = (-i5) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static final String P(Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            int iHashCode = language.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 3365) {
                    if (iHashCode != 3374) {
                        if (iHashCode != 3588) {
                            if (iHashCode != 3704) {
                                if (iHashCode != 3886) {
                                    if (iHashCode != 3520) {
                                        if (iHashCode == 3521 && language.equals("no")) {
                                            return "nb";
                                        }
                                    } else if (language.equals("nn")) {
                                        return "nb";
                                    }
                                } else if (language.equals("zh")) {
                                    return (kr1.n(locale.getScript(), "Hant") || S("TW", "HK", "MO").contains(locale.getCountry())) ? "zh-TW" : "zh-CN";
                                }
                            } else if (language.equals("tl")) {
                                return "fil";
                            }
                        } else if (language.equals("pt")) {
                            return kr1.n(locale.getCountry(), "PT") ? "pt-PT" : "pt-BR";
                        }
                    } else if (language.equals("iw")) {
                        return "he";
                    }
                } else if (language.equals("in")) {
                    return "id";
                }
            } else if (language.equals(BuildConfig.VERSION_NAME)) {
                return "en";
            }
        }
        language.getClass();
        return language;
    }

    public static /* synthetic */ String Q() {
        Locale localeB = li.b().b(0);
        if (localeB == null) {
            localeB = Locale.getDefault();
            localeB.getClass();
        }
        return P(localeB);
    }

    public static Set R(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static Set S(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return f31.c;
        }
        if (length == 1) {
            return R(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y92.S(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static jq1 T(lq1 lq1Var, int i) {
        lq1Var.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = lq1Var.c;
        int i3 = lq1Var.d;
        if (lq1Var.h <= 0) {
            i = -i;
        }
        return new jq1(i2, i3, i);
    }

    public static final w74 U(String str) {
        int i;
        yo4.m(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (kr1.z(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647 || Integer.compare(i4, -1717986919) > 0) {
                    return null;
                }
                i3 = 429496729;
            }
            int i5 = i2 * 10;
            int i6 = iDigit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new w74(i2);
    }

    public static final b84 V(String str) {
        str.getClass();
        int i = 10;
        yo4.m(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (kr1.z(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            long j3 = j ^ Long.MIN_VALUE;
            int i3 = length;
            if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
                    return null;
                }
                j2 = 1844674407370955161L;
            }
            long j4 = j * 10;
            long j5 = (((long) iDigit) & 4294967295L) + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = j5;
            length = i3;
            i = 10;
        }
        return new b84(j);
    }

    public static final Object W(Object obj) {
        nn1 nn1Var;
        on1 on1Var = obj instanceof on1 ? (on1) obj : null;
        return (on1Var == null || (nn1Var = on1Var.a) == null) ? obj : nn1Var;
    }

    public static lq1 X(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new lq1(i, i2 - 1, 1);
        }
        lq1 lq1Var = lq1.l;
        return lq1.l;
    }

    public static final Object Y(xp0 xp0Var, ne1 ne1Var, so0 so0Var) throws Throwable {
        xp0 context = so0Var.getContext();
        xp0 xp0VarPlus = !((Boolean) xp0Var.fold(Boolean.FALSE, new oj0(5))).booleanValue() ? context.plus(xp0Var) : yh4.A(context, xp0Var, false);
        yo4.v(xp0VarPlus);
        if (xp0VarPlus == context) {
            db3 db3Var = new db3(so0Var, xp0VarPlus);
            return vl0.c0(db3Var, true, db3Var, ne1Var);
        }
        t73 t73Var = t73.m;
        if (kr1.n(xp0VarPlus.get(t73Var), context.get(t73Var))) {
            o84 o84Var = new o84(so0Var, xp0VarPlus);
            xp0 xp0Var2 = o84Var.m;
            Object objD0 = yh4.d0(xp0Var2, null);
            try {
                return vl0.c0(o84Var, true, o84Var, ne1Var);
            } finally {
                yh4.R(xp0Var2, objD0);
            }
        }
        ow0 ow0Var = new ow0(so0Var, xp0VarPlus);
        try {
            xp1.B(gm4.G(gm4.o(ow0Var, ow0Var, ne1Var)), w84.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ow0.o;
            do {
                int i = atomicIntegerFieldUpdater.get(ow0Var);
                if (i != 0) {
                    if (i != 2) {
                        u41.r("Already suspended");
                        return null;
                    }
                    Object objW = W(ow0Var.E());
                    if (objW instanceof dg0) {
                        throw ((dg0) objW).a;
                    }
                    return objW;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(ow0Var, 0, 1));
            return hq0.c;
        } catch (Throwable th) {
            th = th;
            if (th instanceof mw0) {
                th = ((mw0) th).c;
            }
            ow0Var.resumeWith(g13.w(th));
            throw th;
        }
    }

    public static void Z(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iE0 = e0(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        f0(parcel, iE0);
    }

    public static void a0(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iE0 = e0(parcel, i);
        parcel.writeString(str);
        f0(parcel, iE0);
    }

    public static void b0(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iE0 = e0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        f0(parcel, iE0);
    }

    public static void c0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iE0 = e0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        f0(parcel, iE0);
    }

    public static void d0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static y61 e(mt2 mt2Var, a71 a71Var, String str, b33 b33Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            b33Var = null;
        }
        return new y61(mt2Var, a71Var, str, b33Var);
    }

    public static int e0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static yl3 f(ny nyVar, a71 a71Var) {
        return new yl3(nyVar, a71Var, null);
    }

    public static void f0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static rp3 g() {
        return new rp3(null);
    }

    public static final ExecutorService h(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new kl0(z));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void i(l81 l81Var, Object obj, Object obj2, uo0 uo0Var) throws Throwable {
        z81 z81Var;
        if (uo0Var instanceof z81) {
            z81Var = (z81) uo0Var;
            int i = z81Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                z81Var.h = i - Integer.MIN_VALUE;
            } else {
                z81Var = new z81(uo0Var);
            }
        } else {
            z81Var = new z81(uo0Var);
        }
        Object obj3 = z81Var.d;
        int i2 = z81Var.h;
        if (i2 == 0) {
            g13.O(obj3);
            z81Var.c = obj2;
            z81Var.h = 1;
            if (l81Var.emit(obj, z81Var) == hq0.c) {
                return;
            }
        } else if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            obj2 = z81Var.c;
            g13.O(obj3);
        }
        throw new d(obj2);
    }

    public static final h43 j(wu0 wu0Var, int i, f54 f54Var, xy3 xy3Var, boolean z, int i2) {
        h43 h43VarC = xy3Var != null ? xy3Var.c(f54Var.b.o(i)) : h43.e;
        float f = h43VarC.a;
        int iO = wu0Var.O(2.0f);
        return h43.a(h43VarC, z ? (i2 - f) - iO : f, z ? i2 - f : iO + f, 0.0f, 10);
    }

    public static final boolean k(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final void l(do3 do3Var) {
        do3Var.getClass();
        if ((do3Var instanceof do3 ? do3Var : null) != null) {
            return;
        }
        m51.B(r43.a(do3Var.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final bt1 n(hs0 hs0Var) {
        hs0Var.getClass();
        bt1 bt1Var = hs0Var instanceof bt1 ? (bt1) hs0Var : null;
        if (bt1Var != null) {
            return bt1Var;
        }
        m51.B(r43.a(hs0Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static yt0 o(gq0 gq0Var, xp0 xp0Var, ne1 ne1Var) throws Throwable {
        yt0 yt0Var = new yt0(yh4.L(gq0Var, xp0Var), true);
        yt0Var.g0(jq0.c, yt0Var, ne1Var);
        return yt0Var;
    }

    public static ig3 p(ig3 ig3Var) {
        o92 o92Var = ig3Var.c;
        o92Var.b();
        return o92Var.q > 0 ? ig3Var : ig3.d;
    }

    public static final List q(q02 q02Var, y02 y02Var, jx jxVar) {
        lq1 lq1Var;
        oi2 oi2Var = jxVar.a;
        if (!(oi2Var.h != 0) && y02Var.c.isEmpty()) {
            return z21.c;
        }
        ArrayList arrayList = new ArrayList();
        if (jxVar.a.h != 0) {
            int i = oi2Var.h;
            if (i == 0) {
                j93.g("MutableVector is empty.");
                return null;
            }
            Object[] objArr = oi2Var.c;
            int i2 = ((d02) objArr[0]).a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((d02) objArr[i3]).a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                so1.a("negative minIndex");
            }
            int i5 = oi2Var.h;
            if (i5 == 0) {
                j93.g("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = oi2Var.c;
            int i6 = ((d02) objArr2[0]).b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((d02) objArr2[i7]).b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            lq1Var = new lq1(i2, Math.min(i6, q02Var.a() - 1), 1);
        } else {
            lq1Var = lq1.l;
        }
        int size = y02Var.c.size();
        for (int i9 = 0; i9 < size; i9++) {
            w02 w02Var = (w02) y02Var.get(i9);
            int iX = xr0.X(w02Var.c, q02Var, w02Var.a);
            int i10 = lq1Var.c;
            if ((iX > lq1Var.d || i10 > iX) && iX >= 0 && iX < q02Var.a()) {
                arrayList.add(Integer.valueOf(iX));
            }
        }
        int i11 = lq1Var.c;
        int i12 = lq1Var.d;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static final boolean s(dx2 dx2Var) {
        return !dx2Var.h && dx2Var.d;
    }

    public static final boolean t(dx2 dx2Var) {
        return (dx2Var.b() || !dx2Var.h || dx2Var.d) ? false : true;
    }

    public static final boolean u(dx2 dx2Var) {
        return dx2Var.h && !dx2Var.d;
    }

    public static double v(double d2, double d3, double d4) {
        if (d3 <= d4) {
            if (d2 < d3) {
                return d3;
            }
            return d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float w(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int x(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long y(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static Comparable z(Comparable comparable, pd0 pd0Var) {
        od0 od0Var = (od0) pd0Var;
        float f = od0Var.b;
        float f2 = od0Var.a;
        if (f2 <= f) {
            if (!od0Var.a(comparable, Float.valueOf(f2)) || od0Var.a(Float.valueOf(f2), comparable)) {
                return (!od0Var.a(Float.valueOf(f), comparable) || od0Var.a(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f);
            }
            return Float.valueOf(f2);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + pd0Var + '.');
    }

    public abstract void I(em emVar);

    public abstract int J(int i);

    public abstract void K(em emVar);

    public abstract int M(int i);

    @Override // defpackage.wc3
    public int a(int i) {
        return M(i);
    }

    @Override // defpackage.wc3
    public int b(int i) {
        return J(i);
    }

    @Override // defpackage.wc3
    public int c(int i) {
        int iJ = J(i);
        if (iJ == -1 || J(iJ) == -1) {
            return -1;
        }
        return iJ;
    }

    @Override // defpackage.wc3
    public int d(int i) {
        int iM = M(i);
        if (iM == -1 || M(iM) == -1) {
            return -1;
        }
        return iM;
    }

    public abstract int m(int i, dx1 dx1Var);

    public abstract void r(em emVar);
}
