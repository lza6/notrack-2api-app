package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.text.Bidi;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class xp1 {
    public static Context a;
    public static Boolean b;
    public static final int[] c = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] d = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] e = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] f = {R.attr.name, R.attr.pathData};
    public static final d5 g = new d5("UNDEFINED", 16);
    public static final d5 h = new d5("REUSABLE_CLAIMED", 16);
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final long[] j = new long[0];

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A(ab1 ab1Var) {
        sx sxVar = sx.J;
        of2 of2Var = (of2) ab1Var;
        of2 node = of2Var.getNode();
        oi2 oi2Var = null;
        while (node != null) {
            if (node instanceof db1) {
                db1 db1Var = (db1) node;
                if (db1Var.w0().a) {
                    db1Var.z0(7);
                    return;
                } else {
                    yh4.x(db1Var, 7, sxVar);
                    return;
                }
            }
            if ((node.getKindSet$ui_release() & 1024) != 0 && (node instanceof ju0)) {
                int i2 = 0;
                for (of2 child$ui_release = ((ju0) node).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & 1024) != 0) {
                        i2++;
                        if (i2 == 1) {
                            node = child$ui_release;
                        } else {
                            if (oi2Var == null) {
                                oi2Var = new oi2(0, new of2[16]);
                            }
                            if (node != null) {
                                oi2Var.c(node);
                                node = null;
                            }
                            oi2Var.c(child$ui_release);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            node = y64.e(oi2Var);
        }
        if (!of2Var.getNode().isAttached()) {
            po1.b("visitChildren called on an unattached node");
        }
        oi2 oi2Var2 = new oi2(0, new of2[16]);
        of2 child$ui_release2 = of2Var.getNode().getChild$ui_release();
        if (child$ui_release2 == null) {
            y64.d(oi2Var2, of2Var.getNode());
        } else {
            oi2Var2.c(child$ui_release2);
        }
        while (true) {
            int i3 = oi2Var2.h;
            if (i3 == 0) {
                return;
            }
            of2 of2VarE = (of2) oi2Var2.m(i3 - 1);
            if ((of2VarE.getAggregateChildKindSet$ui_release() & 1024) == 0) {
                y64.d(oi2Var2, of2VarE);
            } else {
                while (of2VarE != null) {
                    if ((of2VarE.getKindSet$ui_release() & 1024) != 0) {
                        oi2 oi2Var3 = null;
                        while (of2VarE != null) {
                            if (of2VarE instanceof db1) {
                                db1 db1Var2 = (db1) of2VarE;
                                if (db1Var2.w0().a) {
                                    db1Var2.z0(7);
                                    return;
                                } else {
                                    yh4.x(db1Var2, 7, sxVar);
                                    return;
                                }
                            }
                            if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                int i4 = 0;
                                for (of2 child$ui_release3 = ((ju0) of2VarE).d; child$ui_release3 != null; child$ui_release3 = child$ui_release3.getChild$ui_release()) {
                                    if ((child$ui_release3.getKindSet$ui_release() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            of2VarE = child$ui_release3;
                                        } else {
                                            if (oi2Var3 == null) {
                                                oi2Var3 = new oi2(0, new of2[16]);
                                            }
                                            if (of2VarE != null) {
                                                oi2Var3.c(of2VarE);
                                                of2VarE = null;
                                            }
                                            oi2Var3.c(child$ui_release3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            of2VarE = y64.e(oi2Var3);
                        }
                        break;
                    }
                    of2VarE = of2VarE.getChild$ui_release();
                }
            }
        }
    }

    public static final void B(so0 so0Var, Object obj) {
        if (!(so0Var instanceof nw0)) {
            so0Var.resumeWith(obj);
            return;
        }
        nw0 nw0Var = (nw0) so0Var;
        zp0 zp0Var = nw0Var.l;
        so0 so0Var2 = nw0Var.m;
        Throwable thA = j63.a(obj);
        Object dg0Var = thA == null ? obj : new dg0(thA, false);
        if (D(zp0Var, so0Var2.getContext())) {
            nw0Var.n = dg0Var;
            nw0Var.h = 1;
            C(zp0Var, so0Var2.getContext(), nw0Var);
            return;
        }
        v41 v41VarA = i04.a();
        if (v41VarA.c >= 4294967296L) {
            nw0Var.n = dg0Var;
            nw0Var.h = 1;
            v41VarA.R(nw0Var);
            return;
        }
        v41VarA.S(true);
        try {
            gs1 gs1Var = (gs1) so0Var2.getContext().get(bg1.s);
            if (gs1Var == null || gs1Var.a()) {
                Object obj2 = nw0Var.o;
                xp0 context = so0Var2.getContext();
                Object objD0 = yh4.d0(context, obj2);
                o84 o84VarE0 = objD0 != yh4.p ? yh4.e0(so0Var2, context, objD0) : null;
                try {
                    so0Var2.resumeWith(obj);
                    if (o84VarE0 == null || o84VarE0.i0()) {
                        yh4.R(context, objD0);
                    }
                } catch (Throwable th) {
                    if (o84VarE0 == null || o84VarE0.i0()) {
                        yh4.R(context, objD0);
                    }
                    throw th;
                }
            } else {
                nw0Var.resumeWith(g13.w(gs1Var.x()));
            }
            while (v41VarA.U()) {
            }
        } catch (Throwable th2) {
            try {
                nw0Var.i(th2);
            } finally {
                v41VarA.Q(true);
            }
        }
    }

    public static final void C(zp0 zp0Var, xp0 xp0Var, Runnable runnable) {
        try {
            zp0Var.dispatch(xp0Var, runnable);
        } catch (Throwable th) {
            throw new mw0(th, zp0Var, xp0Var);
        }
    }

    public static final boolean D(zp0 zp0Var, xp0 xp0Var) throws mw0 {
        try {
            return zp0Var.isDispatchNeeded(xp0Var);
        } catch (Throwable th) {
            throw new mw0(th, zp0Var, xp0Var);
        }
    }

    public static final void E(ck0 ck0Var, Object obj, ne1 ne1Var) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.O || !kr1.n(kk0Var.P(), obj)) {
            kk0Var.l0(obj);
            kk0Var.c(obj, ne1Var);
        }
    }

    public static void F(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            p44.a(view, charSequence);
            return;
        }
        r44 r44Var = r44.s;
        if (r44Var != null && r44Var.c == view) {
            r44.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new r44(view, charSequence);
            return;
        }
        r44 r44Var2 = r44.t;
        if (r44Var2 != null && r44Var2.c == view) {
            r44Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final androidx.compose.ui.platform.ClipEntry G(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final void H(yw2 yw2Var, long j2, le1 le1Var, boolean z) {
        cr1 cr1Var = yw2Var.b;
        MotionEvent motionEvent = cr1Var != null ? (MotionEvent) ((fp1) cr1Var.c).d : null;
        if (motionEvent == null) {
            u41.k("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
        le1Var.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        motionEvent.setAction(action);
    }

    public static final String I(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        return b2 == 127 ? "invalid token" : "valid token";
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final s31 J(s31 s31Var, pm1 pm1Var, jq2 jq2Var, bg1 bg1Var, uo0 uo0Var) throws Throwable {
        z31 z31Var;
        List list;
        boolean z;
        Bitmap bitmapJ;
        s31 s31Var2;
        int size;
        Bitmap bitmap;
        bg1 bg1Var2;
        int i2;
        pm1 pm1Var2;
        int i3;
        if (uo0Var instanceof z31) {
            z31Var = (z31) uo0Var;
            int i4 = z31Var.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z31Var.r = i4 - Integer.MIN_VALUE;
            } else {
                z31Var = new z31(uo0Var);
            }
        } else {
            z31Var = new z31(uo0Var);
        }
        Object obj = z31Var.q;
        int i5 = z31Var.r;
        if (i5 == 0) {
            g13.O(obj);
            list = (List) y64.z(pm1Var, rm1.a);
            if (list.isEmpty()) {
                return s31Var;
            }
            am1 am1Var = s31Var.a;
            boolean z2 = am1Var instanceof gv;
            if (!z2 && !((Boolean) y64.z(pm1Var, rm1.d)).booleanValue()) {
                return s31Var;
            }
            if (z2) {
                Bitmap bitmap2 = ((gv) am1Var).a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (vl.f0(ta4.a, config)) {
                    bitmapJ = bitmap2;
                } else {
                    Drawable drawableT = vl0.t(am1Var, jq2Var.a.getResources());
                    Bitmap.Config config2 = (Bitmap.Config) y64.A(jq2Var, sm1.b);
                    ai3 ai3Var = jq2Var.b;
                    ma3 ma3Var = jq2Var.c;
                    if (jq2Var.d == wx2.d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bitmapJ = av1.j(drawableT, config2, ai3Var, ma3Var, z);
                }
            } else {
                Drawable drawableT2 = vl0.t(am1Var, jq2Var.a.getResources());
                Bitmap.Config config3 = (Bitmap.Config) y64.A(jq2Var, sm1.b);
                ai3 ai3Var2 = jq2Var.b;
                ma3 ma3Var2 = jq2Var.c;
                if (jq2Var.d == wx2.d) {
                    z = true;
                } else {
                    z = false;
                }
                bitmapJ = av1.j(drawableT2, config3, ai3Var2, ma3Var2, z);
            }
            bg1Var.getClass();
            s31Var2 = s31Var;
            size = list.size();
            bitmap = bitmapJ;
            bg1Var2 = bg1Var;
            i2 = 0;
            pm1Var2 = pm1Var;
            i3 = 0;
        } else {
            if (i5 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            size = z31Var.p;
            int i6 = z31Var.o;
            int i7 = z31Var.n;
            List list2 = z31Var.m;
            bg1Var2 = z31Var.l;
            jq2 jq2Var2 = z31Var.h;
            pm1Var2 = z31Var.d;
            s31Var2 = z31Var.c;
            g13.O(obj);
            yo4.v(z31Var.getContext());
            i3 = i6 + 1;
            i2 = i7;
            jq2Var = jq2Var2;
            bitmap = (Bitmap) obj;
            list = list2;
        }
        if (i3 >= size) {
            bg1Var2.getClass();
            return new s31(new gv(bitmap), s31Var2.b, s31Var2.c, s31Var2.d);
        }
        if (list.get(i3) != null) {
            m51.t();
            return null;
        }
        ai3 ai3Var3 = jq2Var.b;
        z31Var.c = s31Var2;
        z31Var.d = pm1Var2;
        z31Var.h = jq2Var;
        z31Var.l = bg1Var2;
        z31Var.m = list;
        z31Var.n = i2;
        z31Var.o = i3;
        z31Var.p = size;
        z31Var.r = 1;
        throw null;
    }

    public static final void K(ze3 ze3Var, int i2, hb3 hb3Var) {
        oi2 oi2Var = new oi2(0, new ze3[16]);
        List listG = ze3Var.g(false, false);
        while (true) {
            oi2Var.f(oi2Var.h, listG);
            while (true) {
                int i3 = oi2Var.h;
                if (i3 == 0) {
                    return;
                }
                ze3 ze3Var2 = (ze3) oi2Var.m(i3 - 1);
                if (!SemanticsUtils_androidKt.isHidden(ze3Var2)) {
                    ue3 ue3Var = ze3Var2.d;
                    ue3 ue3Var2 = ze3Var2.d;
                    if (ue3Var.c.c(cf3.i)) {
                        continue;
                    } else {
                        wl2 wl2VarC = ze3Var2.c();
                        if (wl2VarC == null) {
                            throw fq2.i("Expected semantics node to have a coordinator.");
                        }
                        mq1 mq1VarX = p23.X(y64.n(wl2VarC));
                        if (mq1VarX.a < mq1VarX.c && mq1VarX.b < mq1VarX.d) {
                            Object objG = ue3Var2.c.g(te3.e);
                            if (objG == null) {
                                objG = null;
                            }
                            ne1 ne1Var = (ne1) objG;
                            Object objG2 = ue3Var2.c.g(cf3.t);
                            fb3 fb3Var = (fb3) (objG2 != null ? objG2 : null);
                            if (ne1Var == null || fb3Var == null || ((Number) fb3Var.b.invoke()).floatValue() <= 0.0f) {
                                listG = ze3Var2.g(false, false);
                            } else {
                                int i4 = i2 + 1;
                                hb3Var.invoke(new jb3(ze3Var2, i4, mq1VarX, wl2VarC));
                                K(ze3Var2, i4, hb3Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void L(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            u41.k("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] M(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        if (i4 < 0 || bArr.length - i4 < i2 || bArr2.length - i4 < i3) {
            u41.k("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i5] = (byte) (bArr[i5 + i2] ^ bArr2[i5 + i3]);
        }
        return bArr3;
    }

    public static final byte[] N(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return M(0, 0, bArr.length, bArr, bArr2);
        }
        u41.k("The lengths of x and y should match.");
        return null;
    }

    public static final h43 a(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new h43(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3));
    }

    public static final boolean b(boolean z, c22 c22Var, int i2) {
        g22 g22Var = (g22) c22Var.c;
        if (z) {
            if (c22Var.c() > i2) {
                return true;
            }
            return c22Var.c() == i2 && g22Var.d.c.f() > 0;
        }
        if (c22Var.c() < i2) {
            return true;
        }
        return c22Var.c() == i2 && g22Var.d.c.f() < 0;
    }

    public static final boolean c(yx0 yx0Var, long j2) {
        if (!yx0Var.getNode().isAttached()) {
            return false;
        }
        xo1 xo1Var = (xo1) y64.M(yx0Var).N.c;
        if (!xo1Var.z()) {
            return false;
        }
        long jL = xo1Var.L(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        long j3 = yx0Var.l;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb A[Catch: zr1 -> 0x0193, TRY_ENTER, TRY_LEAVE, TryCatch #2 {zr1 -> 0x0193, blocks: (B:34:0x00bb, B:38:0x00cb, B:51:0x00f1, B:53:0x0105, B:57:0x011a), top: B:101:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:69:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x016c -> B:18:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.c22 r27, int r28, int r29, defpackage.wu0 r30, defpackage.uo0 r31) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.d(c22, int, int, wu0, uo0):java.lang.Object");
    }

    public static final int e(long[] jArr, long j2) {
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            long j3 = jArr[i3];
            if (j2 > j3) {
                i2 = i3 + 1;
            } else {
                if (j2 >= j3) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final byte f(char c2) {
        if (c2 < '~') {
            return m30.b[c2];
        }
        return (byte) 0;
    }

    public static final void g(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    ud2.u(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    gb2.l(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static byte[] h(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > IntCompanionObject.MAX_VALUE - bArr2.length) {
                m51.v("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final boolean i(h43 h43Var, float f2, float f3) {
        float f4 = h43Var.a;
        if (f2 > h43Var.c || f4 > f2) {
            return false;
        }
        return f3 <= h43Var.d && h43Var.b <= f3;
    }

    public static Handler j(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return og.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            m51.n(cause);
            return null;
        }
    }

    public static final Object k(ix2 ix2Var, xt3 xt3Var, so0 so0Var) {
        Object objQ = yo4.q(new df(ix2Var, xt3Var, null, 7), so0Var);
        return objQ == hq0.c ? objQ : w84.a;
    }

    public static final vc0 l(tf3 tf3Var) {
        tf3Var.getClass();
        if (tf3Var instanceof uf3) {
            return l(((uf3) tf3Var).a);
        }
        return null;
    }

    public static final float m(int i2, int i3, float[] fArr) {
        return fArr[((i2 - i3) * 2) + 1];
    }

    public static final float n(Layout layout, int i2, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        lt3 lt3Var = bz3.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : qn1.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float o(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        lt3 lt3Var = bz3.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? qn1.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final Class p(vc0 vc0Var) {
        Class clsA = vc0Var.a();
        clsA.getClass();
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class q(vc0 vc0Var) {
        vc0Var.getClass();
        Class clsA = vc0Var.a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static Intent r(zh zhVar) {
        Intent parentActivityIntent = zhVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strT = t(zhVar, zhVar.getComponentName());
            if (strT == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(zhVar, strT);
            try {
                return t(zhVar, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strT + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent s(zh zhVar, ComponentName componentName) {
        String strT = t(zhVar, componentName);
        if (strT == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strT);
        return t(zhVar, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String t(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    public static final int u(vy3 vy3Var, Layout layout, vu vuVar, int i2, RectF rectF, wc3 wc3Var, ea eaVar, boolean z) {
        ex1[] ex1VarArr;
        ex1[] ex1VarArr2;
        int i3;
        int iB;
        int i4;
        int i5;
        int iA;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i2);
        int lineBottom = layout.getLineBottom(i2);
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout2 = vy3Var.f;
        int lineStart2 = layout2.getLineStart(i2);
        int iF = vy3Var.f(i2);
        if (i6 < (iF - lineStart2) * 2) {
            qo1.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        ui1 ui1Var = new ui1(vy3Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i2) == 1;
        int i7 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = ui1Var.a(lineStart2, z2, z2, true);
                fA3 = ui1Var.a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = ui1Var.a(lineStart2, false, false, false);
                fA = ui1Var.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = ui1Var.a(lineStart2, false, false, true);
                    fA = ui1Var.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = ui1Var.a(lineStart2, false, false, false);
                    fA2 = ui1Var.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i7] = fA;
            fArr[i7 + 1] = fA3;
            i7 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) vuVar.c;
        int lineStart3 = layout3.getLineStart(i2);
        int lineEnd2 = layout3.getLineEnd(i2);
        int iK = vuVar.k(lineStart3, false);
        int iL = vuVar.l(iK);
        int i8 = lineStart3 - iL;
        int i9 = lineEnd2 - iL;
        Bidi bidiF = vuVar.f(iK);
        if (bidiF == null || (bidiCreateLineBidi = bidiF.createLineBidi(i8, i9)) == null) {
            ex1VarArr = new ex1[]{new ex1(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            ex1VarArr = new ex1[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int i11 = runCount;
                ex1VarArr[i10] = new ex1(bidiCreateLineBidi.getRunStart(i10) + lineStart3, bidiCreateLineBidi.getRunLimit(i10) + lineStart3, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
                i10++;
                runCount = i11;
            }
        }
        jq1 lq1Var = z ? new lq1(0, ex1VarArr.length - 1, 1) : new jq1(ex1VarArr.length - 1, 0, -1);
        int i12 = lq1Var.c;
        int i13 = lq1Var.d;
        int i14 = lq1Var.h;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            ex1 ex1Var = ex1VarArr[i12];
            boolean z4 = ex1Var.c;
            int iC = ex1Var.a;
            int iD = ex1Var.b;
            float f2 = z4 ? fArr[((iD - 1) - lineStart) * 2] : fArr[(iC - lineStart) * 2];
            float fM = z4 ? m(iC, lineStart, fArr) : m(iD - 1, lineStart, fArr);
            float f3 = rectF.left;
            int i15 = i14;
            if (!z) {
                ex1VarArr2 = ex1VarArr;
                if (fM < f3) {
                    iD = -1;
                    break;
                }
                float f4 = rectF.right;
                if (f2 <= f4) {
                    if ((z4 || f4 < fM) && (!z4 || f3 > f2)) {
                        int i16 = iD;
                        int i17 = iC;
                        while (i16 - i17 > 1) {
                            int i18 = (i16 + i17) / 2;
                            float f5 = fArr[(i18 - lineStart) * 2];
                            int i19 = i16;
                            if ((z4 || f5 <= rectF.right) && (!z4 || f5 >= rectF.left)) {
                                i16 = i19;
                                i17 = i18;
                            } else {
                                i16 = i18;
                            }
                        }
                        i3 = z4 ? i16 : i17;
                    } else {
                        i3 = iD - 1;
                    }
                    int iA2 = wc3Var.a(i3 + 1);
                    if (iA2 == -1 || (iB = wc3Var.b(iA2)) <= iC) {
                        iD = -1;
                        break;
                    }
                    if (iA2 < iC) {
                        iA2 = iC;
                    }
                    if (iB <= iD) {
                        iD = iB;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iA3 = iA2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iD - 1) - lineStart) * 2] : fArr[(iA3 - lineStart) * 2];
                        rectF2.right = z4 ? m(iA3, lineStart, fArr) : m(iD - 1, lineStart, fArr);
                        if (((Boolean) eaVar.invoke(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iD = wc3Var.d(iD);
                        if (iD == -1 || iD <= iC) {
                            iD = -1;
                            break;
                        }
                        iA3 = wc3Var.a(iD);
                        if (iA3 < iC) {
                            iA3 = iC;
                        }
                    }
                } else {
                    iD = -1;
                    break;
                }
                iC = iD;
            } else {
                if (fM < f3) {
                    ex1VarArr2 = ex1VarArr;
                    iC = -1;
                    break;
                }
                float f6 = rectF.right;
                if (f2 <= f6) {
                    if ((z4 || f3 > f2) && (!z4 || f6 < fM)) {
                        int i20 = iD;
                        int i21 = iC;
                        while (true) {
                            i4 = i20;
                            if (i20 - i21 <= 1) {
                                break;
                            }
                            int i22 = (i4 + i21) / 2;
                            float f7 = fArr[(i22 - lineStart) * 2];
                            if ((z4 || f7 <= rectF.left) && (!z4 || f7 >= rectF.right)) {
                                i20 = i4;
                                i21 = i22;
                            } else {
                                i20 = i22;
                            }
                        }
                        i5 = z4 ? i4 : i21;
                    } else {
                        i5 = iC;
                    }
                    int iB2 = wc3Var.b(i5);
                    if (iB2 != -1 && (iA = wc3Var.a(iB2)) < iD) {
                        if (iA >= iC) {
                            iC = iA;
                        }
                        if (iB2 > iD) {
                            iB2 = iD;
                        }
                        ex1VarArr2 = ex1VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iB3 = iB2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iB3 - 1) - lineStart) * 2] : fArr[(iC - lineStart) * 2];
                            rectF3.right = z4 ? m(iC, lineStart, fArr) : m(iB3 - 1, lineStart, fArr);
                            if (((Boolean) eaVar.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iC = wc3Var.c(iC);
                            if (iC != -1 && iC < iD) {
                                iB3 = wc3Var.b(iC);
                                if (iB3 > iD) {
                                    iB3 = iD;
                                }
                            }
                        }
                    } else {
                        ex1VarArr2 = ex1VarArr;
                    }
                    iC = -1;
                    break;
                } else {
                    ex1VarArr2 = ex1VarArr;
                    iC = -1;
                    break;
                }
            }
            if (iC >= 0) {
                return iC;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i15;
            i14 = i15;
            ex1VarArr = ex1VarArr2;
        }
    }

    public static final boolean v(c22 c22Var, int i2) {
        return i2 <= c22Var.d() && c22Var.c() <= i2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final void w(PlatformTextInputSession platformTextInputSession, c cVar, az3 az3Var, in1 in1Var, l lVar, hu3 hu3Var, ki2 ki2Var, ViewConfiguration viewConfiguration, uo0 uo0Var) throws Throwable {
        ud udVar;
        if (uo0Var instanceof ud) {
            udVar = (ud) uo0Var;
            int i2 = udVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                udVar.d = i2 - Integer.MIN_VALUE;
            } else {
                udVar = new ud(uo0Var);
            }
        } else {
            udVar = new ud(uo0Var);
        }
        ud udVar2 = udVar;
        Object obj = udVar2.c;
        int i3 = udVar2.d;
        if (i3 != 0) {
            if (i3 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                g13.O(obj);
                u41.p();
                return;
            }
        }
        g13.O(obj);
        View view = platformTextInputSession.getView();
        fy2 uj0Var = Build.VERSION.SDK_INT >= 34 ? new uj0(view) : new fy2(view);
        udVar2.d = 1;
        x(platformTextInputSession, cVar, az3Var, in1Var, lVar, hu3Var, uj0Var, ki2Var, viewConfiguration, udVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final void x(PlatformTextInputSession platformTextInputSession, c cVar, az3 az3Var, in1 in1Var, le1 le1Var, je1 je1Var, fy2 fy2Var, ki2 ki2Var, ViewConfiguration viewConfiguration, uo0 uo0Var) throws Throwable {
        vd vdVar;
        if (uo0Var instanceof vd) {
            vdVar = (vd) uo0Var;
            int i2 = vdVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vdVar.d = i2 - Integer.MIN_VALUE;
            } else {
                vdVar = new vd(uo0Var);
            }
        } else {
            vdVar = new vd(uo0Var);
        }
        Object obj = vdVar.c;
        int i3 = vdVar.d;
        if (i3 == 0) {
            g13.O(obj);
            zd zdVar = new zd(ki2Var, cVar, az3Var, fy2Var, platformTextInputSession, in1Var, le1Var, je1Var, viewConfiguration, null, 0);
            vdVar.d = 1;
            if (yo4.q(zdVar, vdVar) == hq0.c) {
                return;
            }
        } else {
            if (i3 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            g13.O(obj);
        }
        u41.p();
    }

    public static final List y(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        c52 c52VarA = kr1.A();
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(columnIndex);
            int i3 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            string.getClass();
            String string2 = cursor.getString(columnIndex4);
            string2.getClass();
            c52VarA.add(new ur3(i2, i3, string, string2));
        }
        c52 c52VarQ = kr1.q(c52VarA);
        c52VarQ.getClass();
        if (c52VarQ.b() <= 1) {
            return ke0.O0(c52VarQ);
        }
        Object[] array = c52VarQ.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static final vr3 z(be1 be1Var, String str, boolean z) throws IOException {
        Cursor cursorL = be1Var.L(new d5(fq2.n("PRAGMA index_xinfo(`", str, "`)"), 14));
        try {
            int columnIndex = cursorL.getColumnIndex("seqno");
            int columnIndex2 = cursorL.getColumnIndex("cid");
            int columnIndex3 = cursorL.getColumnIndex("name");
            int columnIndex4 = cursorL.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorL.moveToNext()) {
                    if (cursorL.getInt(columnIndex2) >= 0) {
                        int i2 = cursorL.getInt(columnIndex);
                        String string = cursorL.getString(columnIndex3);
                        String str2 = cursorL.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i2);
                        string.getClass();
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                collectionValues.getClass();
                List listO0 = ke0.O0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                collectionValues2.getClass();
                vr3 vr3Var = new vr3(str, z, listO0, ke0.O0(collectionValues2));
                cursorL.close();
                return vr3Var;
            }
            cursorL.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jr1.i(cursorL, th);
                throw th2;
            }
        }
    }
}
