package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m3(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public /* synthetic */ m3(vt0 vt0Var, om3 om3Var) {
        this.c = 6;
        this.d = vt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        char c;
        long j;
        long j2;
        long j3;
        AndroidComposeView androidComposeView;
        gq1 gq1Var;
        int[] iArr;
        long[] jArr;
        gq1 gq1Var2;
        int[] iArr2;
        long[] jArr2;
        AndroidComposeView androidComposeView2;
        long j4;
        int i;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        long[] jArr5;
        AndroidComposeView androidComposeView3;
        long[] jArr6;
        int i2;
        char c2;
        long j5;
        View viewFindFocus;
        int i3 = 3;
        int i4 = 2;
        boolean z = true;
        int i5 = 0;
        Boolean bool = null;
        switch (this.c) {
            case 0:
                Activity activity = (Activity) this.d;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = o3.g;
                Method method = o3.f;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i6 != 26 && i6 != 27) || method != null) && (o3.e != null || o3.d != null)) {
                    try {
                        Object obj2 = o3.c.get(activity);
                        if (obj2 != null && (obj = o3.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            n3 n3Var = new n3(activity);
                            application.registerActivityLifecycleCallbacks(n3Var);
                            handler.post(new io4(n3Var, i4, obj2));
                            if (i6 != 26 && i6 != 27) {
                                z = false;
                            }
                            try {
                                if (z) {
                                    Boolean bool2 = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool2, null, null, bool2, bool2);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new io4(application, i3, n3Var));
                                return;
                            } catch (Throwable th) {
                                handler.post(new io4(application, i3, n3Var));
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                AndroidComposeView.sendHoverExitEvent$lambda$10((AndroidComposeView) this.d);
                return;
            case 2:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$37((AndroidComposeViewAccessibilityDelegateCompat) this.d);
                return;
            case 3:
                fa faVar = (fa) this.d;
                boolean zD = faVar.d();
                dh2 dh2Var = faVar.t;
                AndroidComposeView androidComposeView4 = faVar.c;
                if (zD) {
                    androidComposeView4.measureAndLayout(true);
                    int[] iArr3 = dh2Var.b;
                    long[] jArr7 = dh2Var.a;
                    int length = jArr7.length - 2;
                    char c3 = 7;
                    int i7 = 8;
                    long j6 = -9187201950435737472L;
                    if (length >= 0) {
                        int i8 = 0;
                        j2 = 128;
                        while (true) {
                            long j7 = jArr7[i8];
                            j3 = 255;
                            if ((((~j7) << c3) & j7 & j6) != j6) {
                                int i9 = 8 - ((~(i8 - length)) >>> 31);
                                int i10 = 0;
                                while (i10 < i9) {
                                    if ((j7 & 255) < 128) {
                                        c2 = c3;
                                        int i11 = iArr3[(i8 << 3) + i10];
                                        j5 = j6;
                                        if (!faVar.c().a(i11)) {
                                            faVar.l.add(new en0(i11, faVar.s, fn0.d, null));
                                            faVar.p.i(w84.a);
                                        }
                                    } else {
                                        c2 = c3;
                                        j5 = j6;
                                    }
                                    j7 >>= 8;
                                    i10++;
                                    c3 = c2;
                                    i4 = i4;
                                    jArr7 = jArr7;
                                    j6 = j5;
                                }
                                jArr6 = jArr7;
                                c = c3;
                                j = j6;
                                i2 = i4;
                                if (i9 == 8) {
                                }
                            } else {
                                jArr6 = jArr7;
                                c = c3;
                                j = j6;
                                i2 = i4;
                            }
                            if (i8 != length) {
                                i8++;
                                c3 = c;
                                i4 = i2;
                                jArr7 = jArr6;
                                j6 = j;
                            }
                        }
                    } else {
                        c = 7;
                        j = -9187201950435737472L;
                        j2 = 128;
                        j3 = 255;
                    }
                    faVar.f(androidComposeView4.getSemanticsOwner().a(), faVar.u);
                    gq1 gq1VarC = faVar.c();
                    int[] iArr4 = gq1VarC.b;
                    long[] jArr8 = gq1VarC.a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j8 = jArr8[i12];
                            if ((((~j8) << c) & j8 & j) != j) {
                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                int i14 = i5;
                                while (i14 < i13) {
                                    if ((j8 & j3) < j2) {
                                        int i15 = iArr4[(i12 << 3) + i14];
                                        SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) dh2Var.b(i15);
                                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) gq1VarC.b(i15);
                                        ze3 semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                                        if (semanticsNode == null) {
                                            throw fq2.i("no value for specified key");
                                        }
                                        int i16 = semanticsNode.g;
                                        fi2 fi2Var = semanticsNode.d.c;
                                        if (semanticsNodeCopy == null) {
                                            Object[] objArr3 = fi2Var.b;
                                            int i17 = i7;
                                            long[] jArr9 = fi2Var.a;
                                            gq1Var2 = gq1VarC;
                                            int length3 = jArr9.length - 2;
                                            iArr2 = iArr4;
                                            if (length3 >= 0) {
                                                j4 = j8;
                                                int i18 = 0;
                                                while (true) {
                                                    long j9 = jArr9[i18];
                                                    long[] jArr10 = jArr9;
                                                    Object[] objArr4 = objArr3;
                                                    if ((((~j9) << c) & j9 & j) != j) {
                                                        int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                                        int i20 = 0;
                                                        while (i20 < i19) {
                                                            if ((j9 & j3) < j2) {
                                                                jArr5 = jArr8;
                                                                ff3 ff3Var = (ff3) objArr4[(i18 << 3) + i20];
                                                                androidComposeView3 = androidComposeView4;
                                                                ff3 ff3Var2 = cf3.z;
                                                                if (kr1.n(ff3Var, ff3Var2)) {
                                                                    Object objG = fi2Var.g(ff3Var2);
                                                                    if (objG == null) {
                                                                        objG = null;
                                                                    }
                                                                    List list = (List) objG;
                                                                    faVar.g(i16, String.valueOf(list != null ? (hg) ke0.z0(list) : null));
                                                                }
                                                            } else {
                                                                jArr5 = jArr8;
                                                                androidComposeView3 = androidComposeView4;
                                                            }
                                                            j9 >>= i17;
                                                            i20++;
                                                            androidComposeView4 = androidComposeView3;
                                                            jArr8 = jArr5;
                                                        }
                                                        jArr2 = jArr8;
                                                        androidComposeView2 = androidComposeView4;
                                                        if (i19 == i17) {
                                                        }
                                                    } else {
                                                        jArr2 = jArr8;
                                                        androidComposeView2 = androidComposeView4;
                                                    }
                                                    if (i18 != length3) {
                                                        i18++;
                                                        objArr3 = objArr4;
                                                        jArr9 = jArr10;
                                                        androidComposeView4 = androidComposeView2;
                                                        jArr8 = jArr2;
                                                        i17 = 8;
                                                    }
                                                }
                                            } else {
                                                jArr2 = jArr8;
                                                androidComposeView2 = androidComposeView4;
                                                j4 = j8;
                                            }
                                        } else {
                                            gq1Var2 = gq1VarC;
                                            iArr2 = iArr4;
                                            jArr2 = jArr8;
                                            androidComposeView2 = androidComposeView4;
                                            j4 = j8;
                                            Object[] objArr5 = fi2Var.b;
                                            long[] jArr11 = fi2Var.a;
                                            int length4 = jArr11.length - 2;
                                            if (length4 >= 0) {
                                                int i21 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i21];
                                                    SemanticsNodeCopy semanticsNodeCopy2 = semanticsNodeCopy;
                                                    if ((((~j10) << c) & j10 & j) != j) {
                                                        int i22 = 8 - ((~(i21 - length4)) >>> 31);
                                                        int i23 = 0;
                                                        while (i23 < i22) {
                                                            if ((j10 & j3) < j2) {
                                                                objArr2 = objArr5;
                                                                ff3 ff3Var3 = (ff3) objArr5[(i21 << 3) + i23];
                                                                jArr4 = jArr11;
                                                                ff3 ff3Var4 = cf3.z;
                                                                if (kr1.n(ff3Var3, ff3Var4)) {
                                                                    List list2 = (List) y64.B(semanticsNodeCopy2.getUnmergedConfig(), ff3Var4);
                                                                    hg hgVar = list2 != null ? (hg) ke0.z0(list2) : null;
                                                                    Object objG2 = fi2Var.g(ff3Var4);
                                                                    if (objG2 == null) {
                                                                        objG2 = null;
                                                                    }
                                                                    List list3 = (List) objG2;
                                                                    hg hgVar2 = list3 != null ? (hg) ke0.z0(list3) : null;
                                                                    if (!kr1.n(hgVar, hgVar2)) {
                                                                        faVar.g(i16, String.valueOf(hgVar2));
                                                                    }
                                                                }
                                                            } else {
                                                                objArr2 = objArr5;
                                                                jArr4 = jArr11;
                                                            }
                                                            j10 >>= 8;
                                                            i23++;
                                                            jArr11 = jArr4;
                                                            objArr5 = objArr2;
                                                        }
                                                        objArr = objArr5;
                                                        jArr3 = jArr11;
                                                        if (i22 == 8) {
                                                        }
                                                    } else {
                                                        objArr = objArr5;
                                                        jArr3 = jArr11;
                                                    }
                                                    if (i21 != length4) {
                                                        i21++;
                                                        semanticsNodeCopy = semanticsNodeCopy2;
                                                        jArr11 = jArr3;
                                                        objArr5 = objArr;
                                                    }
                                                }
                                            }
                                        }
                                        i = 8;
                                    } else {
                                        gq1Var2 = gq1VarC;
                                        iArr2 = iArr4;
                                        jArr2 = jArr8;
                                        androidComposeView2 = androidComposeView4;
                                        j4 = j8;
                                        i = i7;
                                    }
                                    j8 = j4 >> i;
                                    i14++;
                                    i7 = i;
                                    gq1VarC = gq1Var2;
                                    iArr4 = iArr2;
                                    androidComposeView4 = androidComposeView2;
                                    jArr8 = jArr2;
                                }
                                gq1Var = gq1VarC;
                                iArr = iArr4;
                                jArr = jArr8;
                                androidComposeView = androidComposeView4;
                                if (i13 == i7) {
                                }
                            } else {
                                gq1Var = gq1VarC;
                                iArr = iArr4;
                                jArr = jArr8;
                                androidComposeView = androidComposeView4;
                            }
                            if (i12 != length2) {
                                i12++;
                                gq1VarC = gq1Var;
                                iArr4 = iArr;
                                androidComposeView4 = androidComposeView;
                                jArr8 = jArr;
                                i5 = 0;
                                i7 = 8;
                            }
                        }
                    } else {
                        androidComposeView = androidComposeView4;
                    }
                    dh2Var.c();
                    gq1 gq1VarC2 = faVar.c();
                    int[] iArr5 = gq1VarC2.b;
                    Object[] objArr6 = gq1VarC2.c;
                    long[] jArr12 = gq1VarC2.a;
                    int length5 = jArr12.length - 2;
                    if (length5 >= 0) {
                        int i24 = 0;
                        while (true) {
                            long j11 = jArr12[i24];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i25 = 8 - ((~(i24 - length5)) >>> 31);
                                for (int i26 = 0; i26 < i25; i26++) {
                                    if ((j11 & j3) < j2) {
                                        int i27 = (i24 << 3) + i26;
                                        dh2Var.h(iArr5[i27], new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds) objArr6[i27]).getSemanticsNode(), faVar.c()));
                                    }
                                    j11 >>= 8;
                                }
                                if (i25 == 8) {
                                }
                            }
                            if (i24 != length5) {
                                i24++;
                            }
                        }
                    }
                    faVar.u = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().a(), faVar.c());
                    faVar.v = false;
                    return;
                }
                return;
            case 4:
                mg0 mg0Var = (mg0) this.d;
                Runnable runnable = mg0Var.d;
                if (runnable != null) {
                    runnable.run();
                    mg0Var.d = null;
                    return;
                }
                return;
            case 5:
                sg0.c((sg0) this.d);
                return;
            case 6:
                ((vt0) this.d).a(null);
                return;
            case 7:
                tb1 tb1Var = (tb1) this.d;
                synchronized (tb1Var.d) {
                    try {
                        if (tb1Var.h == null) {
                            return;
                        }
                        try {
                            lc1 lc1VarC = tb1Var.c();
                            int i28 = lc1VarC.e;
                            if (i28 == 2) {
                                synchronized (tb1Var.d) {
                                }
                            }
                            if (i28 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i28 + ")");
                            }
                            try {
                                int i29 = z44.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                rn0 rn0Var = tb1Var.c;
                                Context context = tb1Var.a;
                                rn0Var.getClass();
                                lc1[] lc1VarArr = {lc1VarC};
                                gm4 gm4Var = b74.a;
                                Trace.beginSection(jr1.O("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typefaceQ = b74.a.q(context, lc1VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferK = yo4.K(tb1Var.a, lc1VarC.a);
                                    if (mappedByteBufferK == null || typefaceQ == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        ir3 ir3Var = new ir3(typefaceQ, sf3.P(mappedByteBufferK));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (tb1Var.d) {
                                            try {
                                                yo4 yo4Var = tb1Var.h;
                                                if (yo4Var != null) {
                                                    yo4Var.M(ir3Var);
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                            break;
                                        }
                                        tb1Var.b();
                                        return;
                                    } catch (Throwable th3) {
                                        int i30 = z44.a;
                                        Trace.endSection();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                int i31 = z44.a;
                                Trace.endSection();
                                throw th5;
                            }
                            break;
                        } catch (Throwable th6) {
                            synchronized (tb1Var.d) {
                                try {
                                    yo4 yo4Var2 = tb1Var.h;
                                    if (yo4Var2 != null) {
                                        yo4Var2.L(th6);
                                    }
                                    tb1Var.b();
                                    return;
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        }
                    } catch (Throwable th8) {
                        throw th8;
                    }
                }
            case 8:
                Iterator it = ((nd1) this.d).n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    m51.t();
                    return;
                }
                return;
            case 9:
                gs1 gs1Var = (gs1) this.d;
                if (gs1Var != null) {
                    gs1Var.c(null);
                    return;
                }
                return;
            case 10:
                pz2 pz2Var = (pz2) this.d;
                p32 p32Var = pz2Var.n;
                if (pz2Var.d == 0) {
                    pz2Var.h = true;
                    p32Var.e(f32.ON_PAUSE);
                }
                if (pz2Var.c == 0 && pz2Var.h) {
                    p32Var.e(f32.ON_STOP);
                    pz2Var.l = true;
                    return;
                }
                return;
            case 11:
                e73.setRippleState$lambda$2((e73) this.d);
                return;
            case 12:
                View view = (View) this.d;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 13:
                ny3 ny3Var = (ny3) this.d;
                ci4 ci4Var = ny3Var.b;
                ny3Var.n = null;
                oi2 oi2Var = ny3Var.m;
                View view2 = ny3Var.a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    oi2Var.i();
                    return;
                }
                Object[] objArr7 = oi2Var.c;
                int i32 = oi2Var.h;
                Boolean boolValueOf = null;
                for (int i33 = 0; i33 < i32; i33++) {
                    my3 my3Var = (my3) objArr7[i33];
                    int iOrdinal = my3Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if ((iOrdinal == 2 || iOrdinal == 3) && !kr1.n(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(my3Var == my3.h);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                oi2Var.i();
                if (kr1.n(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((ly1) ci4Var.h).getValue()).restartInput((View) ci4Var.d);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((sk3) ((sk3) ci4Var.l).d).n();
                    } else {
                        ((sk3) ((sk3) ci4Var.l).d).j();
                    }
                }
                if (kr1.n(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((ly1) ci4Var.h).getValue()).restartInput((View) ci4Var.d);
                    return;
                }
                return;
            default:
                ir3 ir3Var2 = (ir3) this.d;
                ((o83) ir3Var2.l).x(new f4(10, ir3Var2));
                return;
        }
    }
}
