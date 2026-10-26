package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.c;
import app.template.extension.BuildConfig;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.coroutines.flow.SharingStarted$Companion;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class sf3 {
    public static final d5 a = new d5("CLOSED", 16);
    public static final f61 b = new f61(Boolean.TRUE);
    public static final Object c = new Object();
    public static final o61 d;
    public static final o61[] e;

    static {
        o61 o61Var = new o61("CLIENT_TELEMETRY", -1, 1L, false);
        d = o61Var;
        e = new o61[]{o61Var};
    }

    public static final Object A(vc3 vc3Var, long j, ne1 ne1Var) {
        while (true) {
            if (vc3Var.e >= j && !vc3Var.f()) {
                return vc3Var;
            }
            Object objD = vc3Var.d();
            d5 d5Var = a;
            if (objD == d5Var) {
                return d5Var;
            }
            vc3 vc3Var2 = (vc3) ((il0) objD);
            if (vc3Var2 == null) {
                vc3Var2 = (vc3) ne1Var.invoke(Long.valueOf(vc3Var.e + 1), vc3Var);
                if (vc3Var.i(vc3Var2)) {
                    if (vc3Var.f()) {
                        vc3Var.h();
                    }
                }
            }
            vc3Var = vc3Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object B(pm0 pm0Var, uo0 uo0Var) throws Throwable {
        f91 f91Var;
        q43 q43Var;
        d e2;
        nb nbVar;
        d5 d5Var = av1.c;
        if (uo0Var instanceof f91) {
            f91Var = (f91) uo0Var;
            int i = f91Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                f91Var.l = i - Integer.MIN_VALUE;
            } else {
                f91Var = new f91(uo0Var);
            }
        } else {
            f91Var = new f91(uo0Var);
        }
        Object obj = f91Var.h;
        int i2 = f91Var.l;
        if (i2 == 0) {
            g13.O(obj);
            q43Var = new q43();
            q43Var.c = d5Var;
            nb nbVar2 = new nb(4, q43Var);
            try {
                f91Var.c = q43Var;
                f91Var.d = nbVar2;
                f91Var.l = 1;
                Object objA = pm0Var.a(nbVar2, f91Var);
                Object obj2 = hq0.c;
                if (objA == obj2) {
                    return obj2;
                }
            } catch (d e3) {
                e2 = e3;
                nbVar = nbVar2;
                if (e2.c == nbVar) {
                    throw e2;
                }
                yo4.v(f91Var.getContext());
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nbVar = f91Var.d;
            q43Var = f91Var.c;
            try {
                g13.O(obj);
            } catch (d e4) {
                e2 = e4;
                if (e2.c == nbVar) {
                    throw e2;
                }
                yo4.v(f91Var.getContext());
            }
        }
        Object obj3 = q43Var.c;
        if (obj3 != d5Var) {
            return obj3;
        }
        j93.g("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object C(k81 k81Var, ne1 ne1Var, uo0 uo0Var) throws Throwable {
        g91 g91Var;
        q43 q43Var;
        d e2;
        ha0 ha0Var;
        d5 d5Var = av1.c;
        if (uo0Var instanceof g91) {
            g91Var = (g91) uo0Var;
            int i = g91Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                g91Var.l = i - Integer.MIN_VALUE;
            } else {
                g91Var = new g91(uo0Var);
            }
        } else {
            g91Var = new g91(uo0Var);
        }
        Object obj = g91Var.h;
        int i2 = g91Var.l;
        if (i2 == 0) {
            g13.O(obj);
            q43 q43Var2 = new q43();
            q43Var2.c = d5Var;
            ha0 ha0Var2 = new ha0(ne1Var, 3, q43Var2);
            try {
                g91Var.c = q43Var2;
                g91Var.d = ha0Var2;
                g91Var.l = 1;
                Object objA = k81Var.a(ha0Var2, g91Var);
                Object obj2 = hq0.c;
                if (objA == obj2) {
                    return obj2;
                }
                q43Var = q43Var2;
            } catch (d e3) {
                q43Var = q43Var2;
                e2 = e3;
                ha0Var = ha0Var2;
                if (e2.c == ha0Var) {
                    throw e2;
                }
                yo4.v(g91Var.getContext());
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ha0Var = g91Var.d;
            q43Var = g91Var.c;
            try {
                g13.O(obj);
            } catch (d e4) {
                e2 = e4;
                if (e2.c == ha0Var) {
                    throw e2;
                }
                yo4.v(g91Var.getContext());
            }
        }
        Object obj3 = q43Var.c;
        if (obj3 != d5Var) {
            return obj3;
        }
        j93.g("Expected at least one element matching the predicate");
        return null;
    }

    public static final void D(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = ai1.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final int E(ic1 ic1Var, int i) {
        boolean z = kr1.z(ic1Var.c, ic1.d.c) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final d83 F(qb2 qb2Var) {
        Object objI = qb2Var.i();
        if (objI instanceof d83) {
            return (d83) objI;
        }
        return null;
    }

    public static final float G(d83 d83Var) {
        if (d83Var != null) {
            return d83Var.a;
        }
        return 0.0f;
    }

    public static final void H(xp0 xp0Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = bq0.a.iterator();
        while (it.hasNext()) {
            try {
                ((aq0) it.next()).L(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    gb2.l(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            gb2.l(th, new nv0(xp0Var));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static boolean I(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean J() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final boolean K(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final boolean L(ux1 ux1Var) {
        if (ux1Var.p == null) {
            return false;
        }
        ux1 ux1VarT = ux1Var.t();
        return (ux1VarT != null ? ux1VarT.p : null) == null || ux1Var.O.b;
    }

    public static qf3 M(ne1 ne1Var) {
        qf3 qf3Var = new qf3();
        qf3Var.h = gm4.o(qf3Var, qf3Var, ne1Var);
        return qf3Var;
    }

    public static final wm1 N(wm1 wm1Var, boolean z) {
        if (!z) {
            return wm1Var;
        }
        ny nyVarD = wm1Var.D();
        return (nyVarD.G(0L, fs0.b) || nyVarD.G(0L, fs0.a)) ? py.f(new u23(new zd1(wm1Var.D())), wm1Var.getFileSystem()) : wm1Var;
    }

    public static int O(Object obj, za3 za3Var, byte[] bArr, int i, int i2, jl jlVar) throws sr1 {
        int iT = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iT = t(i3, bArr, iT, jlVar);
            i3 = jlVar.a;
        }
        int i4 = iT;
        if (i3 < 0 || i3 > i2 - i4) {
            throw sr1.g();
        }
        int i5 = i4 + i3;
        za3Var.g(obj, bArr, i4, i5, jlVar);
        jlVar.c = obj;
        return i5;
    }

    public static be2 P(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & UShort.MAX_VALUE;
        if (i > 100) {
            m51.l("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    be2 be2Var = new be2();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    be2Var.l = byteBufferDuplicate;
                    be2Var.c = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    be2Var.d = i6;
                    be2Var.h = ((ByteBuffer) be2Var.l).getShort(i6);
                    return be2Var;
                }
            }
        }
        m51.l("Cannot read metadata.");
        return null;
    }

    public static final void Q(fp1 fp1Var, au3 au3Var, au3 au3Var2, mi4 mi4Var, boolean z) {
        oi2 oi2Var = (oi2) mi4Var.d;
        int i = oi2Var.h;
        if (i > 1) {
            fp1Var.l(new xz3(0, au3Var.d.toString(), au3Var2.d.toString(), au3Var.h, au3Var2.h, 0L, false, 32));
            return;
        }
        if (i == 1) {
            u20 u20Var = (u20) oi2Var.c[0];
            long jD = p23.d(u20Var.c, u20Var.d);
            u20 u20Var2 = (u20) ((oi2) mi4Var.d).c[0];
            long jD2 = p23.d(u20Var2.a, u20Var2.b);
            if (jz3.c(jD) && jz3.c(jD2)) {
                return;
            }
            fp1Var.l(new xz3(jz3.f(jD), p23.b0(jD, au3Var), p23.b0(jD2, au3Var2), au3Var.h, au3Var2.h, 0L, z, 32));
        }
    }

    public static final Object R(Object obj) {
        return obj instanceof dg0 ? g13.w(((dg0) obj).a) : obj;
    }

    public static final void S(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final long T(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final s23 U(pm0 pm0Var, qo0 qo0Var, fn3 fn3Var, Float f) throws Throwable {
        w20.a.getClass();
        v20 v20Var = v20.a;
        fy2 fy2Var = new fy2(pm0Var, x21.c);
        jn3 jn3VarF = gb2.f(f);
        py.E(qo0Var, (xp0) fy2Var.d, fn3Var.equals(SharingStarted$Companion.getEagerly()) ? jq0.c : jq0.l, new qb(fn3Var, (k81) fy2Var.c, jn3VarF, f, null, 15));
        return new s23(jn3VarF);
    }

    public static final int V(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final long W(long j, long j2) {
        int iD;
        int iF = jz3.f(j);
        int iE = jz3.e(j);
        if ((jz3.f(j2) < jz3.e(j)) && (jz3.f(j) < jz3.e(j2))) {
            if (jz3.a(j2, j)) {
                iF = jz3.f(j2);
                iE = iF;
            } else {
                if (jz3.a(j, j2)) {
                    iD = jz3.d(j2);
                } else {
                    int iF2 = jz3.f(j2);
                    if (iF >= jz3.e(j2) || iF2 > iF) {
                        iE = jz3.f(j2);
                    } else {
                        iF = jz3.f(j2);
                        iD = jz3.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > jz3.f(j2)) {
            iF -= jz3.d(j2);
            iD = jz3.d(j2);
            iE -= iD;
        }
        return p23.d(iF, iE);
    }

    public static final Object X(xp0 xp0Var, Object obj, Object obj2, ne1 ne1Var, so0 so0Var) {
        Object objInvoke;
        Object objD0 = yh4.d0(xp0Var, obj2);
        try {
            um3 um3Var = new um3(so0Var, xp0Var);
            if (ne1Var == null) {
                objInvoke = gm4.S(ne1Var, obj, um3Var);
            } else {
                y64.l(2, ne1Var);
                objInvoke = ne1Var.invoke(obj, um3Var);
            }
            yh4.R(xp0Var, objD0);
            if (objInvoke == hq0.c) {
                so0Var.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            yh4.R(xp0Var, objD0);
            throw th;
        }
    }

    public static xu0 a() {
        return new xu0(1.0f, 1.0f);
    }

    public static ib b(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap;
        t63 t63Var = ef0.e;
        Bitmap.Config configQ = gm4.Q(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, gm4.Q(i3), true, df0.a(t63Var));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configQ);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new ib(bitmapCreateBitmap);
    }

    public static final int c(int i, oi2 oi2Var) {
        int i2 = oi2Var.h - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = oi2Var.c;
            int i5 = ((dr1) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((dr1) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final boolean d(int i, KeyEvent keyEvent) {
        return ((int) (av1.y(keyEvent) >> 32)) == i;
    }

    public static final String e(Object[] objArr, int i, int i2, h0 h0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == h0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void f(go2 go2Var, sg0 sg0Var, le1 le1Var) {
        go2Var.getClass();
        go2Var.a(sg0Var, new fd1(le1Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(wz2 wz2Var, je1 je1Var, uo0 uo0Var) throws Throwable {
        uz2 uz2Var;
        if (uo0Var instanceof uz2) {
            uz2Var = (uz2) uo0Var;
            int i = uz2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                uz2Var.h = i - Integer.MIN_VALUE;
            } else {
                uz2Var = new uz2(uo0Var);
            }
        } else {
            uz2Var = new uz2(uo0Var);
        }
        Object obj = uz2Var.d;
        int i2 = uz2Var.h;
        int i3 = 1;
        try {
            if (i2 == 0) {
                g13.O(obj);
                if (uz2Var.getContext().get(bg1.s) != wz2Var) {
                    u41.r("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                uz2Var.c = je1Var;
                uz2Var.h = 1;
                t00 t00Var = new t00(1, gm4.G(uz2Var));
                t00Var.u();
                wz2Var.n.z(new qa0(i3, t00Var));
                Object objS = t00Var.s();
                hq0 hq0Var = hq0.c;
                if (objS == hq0Var) {
                    return hq0Var;
                }
            } else {
                if (i2 != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                je1Var = uz2Var.c;
                g13.O(obj);
            }
            je1Var.invoke();
            return w84.a;
        } catch (Throwable th) {
            je1Var.invoke();
            throw th;
        }
    }

    public static final c h(c cVar, float f, long j, rg3 rg3Var) {
        return cVar.then(new BorderModifierNodeElement(f, new vl3(j), rg3Var));
    }

    public static k81 i(k81 k81Var, int i) {
        fy fyVar;
        if (i < 0 && i != -2 && i != -1) {
            u41.h(ud2.m(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            fyVar = fy.d;
        } else {
            fyVar = fy.c;
        }
        return k81Var instanceof xe1 ? gm4.y((xe1) k81Var, null, i, fyVar, 1) : new a30(k81Var, x21.c, i, fyVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable j(k81 k81Var, l81 l81Var, uo0 uo0Var) throws Throwable {
        u81 u81Var;
        q43 q43Var;
        Throwable th;
        gs1 gs1Var;
        CancellationException cancellationExceptionX;
        if (uo0Var instanceof u81) {
            u81Var = (u81) uo0Var;
            int i = u81Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                u81Var.h = i - Integer.MIN_VALUE;
            } else {
                u81Var = new u81(uo0Var);
            }
        } else {
            u81Var = new u81(uo0Var);
        }
        Object obj = u81Var.d;
        int i2 = u81Var.h;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q43Var = u81Var.c;
            try {
                g13.O(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
                th = (Throwable) q43Var.c;
                if ((th == null && th.equals(th)) || ((gs1Var = (gs1) u81Var.getContext().get(bg1.s)) != null && gs1Var.isCancelled() && (cancellationExceptionX = gs1Var.x()) != null && cancellationExceptionX.equals(th))) {
                    throw th;
                }
                if (th == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    gb2.l(th, th);
                    throw th;
                }
                gb2.l(th, th);
                throw th;
            }
        }
        g13.O(obj);
        q43 q43Var2 = new q43();
        try {
            l81 ha0Var = new ha0(l81Var, i3, q43Var2);
            u81Var.c = q43Var2;
            u81Var.h = 1;
            Object objA = k81Var.a(ha0Var, u81Var);
            hq0 hq0Var = hq0.c;
            if (objA == hq0Var) {
                return hq0Var;
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            q43Var = q43Var2;
            th = (Throwable) q43Var.c;
            if (th == null) {
                if (th == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    gb2.l(th, th);
                    throw th;
                }
                gb2.l(th, th);
                throw th;
            }
            if (th == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                gb2.l(th, th);
                throw th;
            }
            gb2.l(th, th);
            throw th;
            throw th;
        }
    }

    public static final void k(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbS = ud2.s("Expected '-' (hyphen) at index ", ", but was '", i);
        sbS.append(str.charAt(i));
        sbS.append('\'');
        throw new IllegalArgumentException(sbS.toString().toString());
    }

    public static final Object l(k81 k81Var, ne1 ne1Var, mq3 mq3Var) {
        int i = d91.a;
        Object objA = i(new e30(new c91(ne1Var, null), k81Var, x21.c, -2, fy.c), 0).a(gm2.c, mq3Var);
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        if (objA != hq0Var) {
            objA = w84Var;
        }
        return objA == hq0Var ? objA : w84Var;
    }

    public static int m(byte[] bArr, int i, jl jlVar) throws sr1 {
        int iU = u(bArr, i, jlVar);
        int i2 = jlVar.a;
        if (i2 < 0) {
            throw sr1.e();
        }
        if (i2 > bArr.length - iU) {
            throw sr1.g();
        }
        if (i2 == 0) {
            jlVar.c = mz.d;
            return iU;
        }
        jlVar.c = mz.g(bArr, iU, i2);
        return iU + i2;
    }

    public static int n(int i, byte[] bArr) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public static long o(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int p(za3 za3Var, int i, byte[] bArr, int i2, int i3, yq1 yq1Var, jl jlVar) throws sr1 {
        Object objJ = za3Var.j();
        za3 za3Var2 = za3Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        jl jlVar2 = jlVar;
        int iO = O(objJ, za3Var2, bArr2, i2, i4, jlVar2);
        za3Var2.d(objJ);
        jlVar2.c = objJ;
        yq1Var.add(objJ);
        while (iO < i4) {
            jl jlVar3 = jlVar2;
            int i5 = i4;
            int iU = u(bArr2, iO, jlVar3);
            if (i != jlVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            za3 za3Var3 = za3Var2;
            Object objJ2 = za3Var3.j();
            iO = O(objJ2, za3Var3, bArr3, iU, i5, jlVar3);
            za3Var2 = za3Var3;
            bArr2 = bArr3;
            i4 = i5;
            jlVar2 = jlVar3;
            za3Var2.d(objJ2);
            jlVar2.c = objJ2;
            yq1Var.add(objJ2);
        }
        return iO;
    }

    public static int q(byte[] bArr, int i, jl jlVar) throws sr1 {
        int iU = u(bArr, i, jlVar);
        int i2 = jlVar.a;
        if (i2 < 0) {
            throw sr1.e();
        }
        if (i2 == 0) {
            jlVar.c = BuildConfig.VERSION_NAME;
            return iU;
        }
        jlVar.c = new String(bArr, iU, i2, zq1.a);
        return iU + i2;
    }

    public static int r(byte[] bArr, int i, jl jlVar) throws sr1 {
        int iU = u(bArr, i, jlVar);
        int i2 = jlVar.a;
        if (i2 < 0) {
            throw sr1.e();
        }
        if (i2 == 0) {
            jlVar.c = BuildConfig.VERSION_NAME;
            return iU;
        }
        jlVar.c = ha4.a.m(bArr, iU, i2);
        return iU + i2;
    }

    public static int s(int i, byte[] bArr, int i2, int i3, y84 y84Var, jl jlVar) throws sr1 {
        if ((i >>> 3) == 0) {
            throw sr1.a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iW = w(bArr, i2, jlVar);
            y84Var.d(i, Long.valueOf(jlVar.b));
            return iW;
        }
        if (i4 == 1) {
            y84Var.d(i, Long.valueOf(o(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iU = u(bArr, i2, jlVar);
            int i5 = jlVar.a;
            if (i5 < 0) {
                throw sr1.e();
            }
            if (i5 > bArr.length - iU) {
                throw sr1.g();
            }
            if (i5 == 0) {
                y84Var.d(i, mz.d);
            } else {
                y84Var.d(i, mz.g(bArr, iU, i5));
            }
            return iU + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw sr1.a();
            }
            y84Var.d(i, Integer.valueOf(n(i2, bArr)));
            return i2 + 4;
        }
        y84 y84VarC = y84.c();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iU2 = u(bArr, i2, jlVar);
            i7 = jlVar.a;
            if (i7 == i6) {
                i2 = iU2;
                break;
            }
            i2 = s(i7, bArr, iU2, i3, y84VarC, jlVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw sr1.f();
        }
        y84Var.d(i, y84VarC);
        return i2;
    }

    public static int t(int i, byte[] bArr, int i2, jl jlVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            jlVar.a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            jlVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            jlVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            jlVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                jlVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int u(byte[] bArr, int i, jl jlVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return t(b2, bArr, i2, jlVar);
        }
        jlVar.a = b2;
        return i2;
    }

    public static int v(int i, byte[] bArr, int i2, int i3, yq1 yq1Var, jl jlVar) {
        bq1 bq1Var = (bq1) yq1Var;
        int iU = u(bArr, i2, jlVar);
        bq1Var.d(jlVar.a);
        while (iU < i3) {
            int iU2 = u(bArr, iU, jlVar);
            if (i != jlVar.a) {
                break;
            }
            iU = u(bArr, iU2, jlVar);
            bq1Var.d(jlVar.a);
        }
        return iU;
    }

    public static int w(byte[] bArr, int i, jl jlVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            jlVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & ByteCompanionObject.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & ByteCompanionObject.MAX_VALUE)) << i4;
            b2 = b3;
            i3 = i5;
        }
        jlVar.b = j2;
        return i3;
    }

    public static final k81 x(k81 k81Var) {
        if (k81Var instanceof hn3) {
            return k81Var;
        }
        oj0 oj0Var = p23.e;
        if (k81Var instanceof bx0) {
            bx0 bx0Var = (bx0) k81Var;
            if (bx0Var.d == oj0Var) {
                return bx0Var;
            }
        }
        return new bx0(k81Var, oj0Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ci4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final int y(int i, String str) {
        y11 y11VarA;
        ?? r6;
        ?? r7;
        int spanEnd;
        Integer num = null;
        if (y11.d()) {
            y11VarA = y11.a();
            if (y11VarA.c() != 1) {
                y11VarA = null;
            }
        } else {
            y11VarA = null;
        }
        if (y11VarA != null) {
            if (!(y11VarA.c() == 1)) {
                u41.r("Not initialized yet");
                return 0;
            }
            p23.n(str, "charSequence cannot be null");
            ?? r5 = (ci4) y11VarA.e.b;
            r5.getClass();
            if (i < 0 || i >= str.length()) {
                r7 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                i74[] i74VarArr = (i74[]) spanned.getSpans(i, i + 1, i74.class);
                if (i74VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(i74VarArr[0]);
                    r7 = str;
                } else {
                    ?? r8 = str;
                    spanEnd = ((j21) r5.F(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), IntCompanionObject.MAX_VALUE, true, new j21(i))).h;
                    r7 = r8;
                }
            } else {
                ?? r9 = str;
                spanEnd = ((j21) r5.F(r9, Math.max(0, i - 16), Math.min(str.length(), i + 16), IntCompanionObject.MAX_VALUE, true, new j21(i))).h;
                r7 = r9;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r6 = r7;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r6 = str;
        }
        if (num != null) {
            r6 = r7;
            return num.intValue();
        }
        r6 = r7;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r6);
        return characterInstance.following(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final int z(int i, String str) {
        y11 y11VarA;
        Integer num = null;
        if (y11.d()) {
            y11VarA = y11.a();
            if (y11VarA.c() != 1) {
                y11VarA = null;
            }
        } else {
            y11VarA = null;
        }
        if (y11VarA != null) {
            int iB = y11VarA.b(Math.max(0, i - 1), str);
            Integer numValueOf = Integer.valueOf(iB);
            if (iB != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }
}
