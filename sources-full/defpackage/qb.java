package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class qb extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public Object h;
    public Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(hb0 hb0Var, String str, byte[] bArr, le1 le1Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 8;
        this.h = hb0Var;
        this.m = str;
        this.n = bArr;
        this.l = le1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb(Object obj, Object obj2, Object obj3, Object obj4, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb(Object obj, Object obj2, Object obj3, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(mi2 mi2Var, go1 go1Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 16;
        this.m = mi2Var;
        this.n = go1Var;
    }

    private final Object a(Object obj) throws Throwable {
        int i = this.d;
        if (i == 0) {
            g13.O(obj);
            pb pbVar = new pb((WorkDatabase_Impl) this.l, (l81) this.h, (String[]) this.m, (ii4) this.n, null, 7);
            this.d = 1;
            Object objQ = yo4.q(pbVar, this);
            hq0 hq0Var = hq0.c;
            if (objQ == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.a(r4, r17) == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r3.a(r4, r17) == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (defpackage.sf3.l(r1, r2, r17) == r9) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.l
            r3 = r1
            k81 r3 = (defpackage.k81) r3
            java.lang.Object r1 = r0.h
            fn3 r1 = (defpackage.fn3) r1
            java.lang.Object r2 = r0.m
            r4 = r2
            jn3 r4 = (defpackage.jn3) r4
            int r2 = r0.d
            r8 = 4
            r5 = 3
            r6 = 1
            r7 = 2
            hq0 r9 = defpackage.hq0.c
            if (r2 == 0) goto L33
            if (r2 == r6) goto L2e
            if (r2 == r7) goto L2a
            if (r2 == r5) goto L2e
            if (r2 != r8) goto L23
            goto L2e
        L23:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r0)
            r0 = 0
            return r0
        L2a:
            defpackage.g13.O(r18)
            goto L5e
        L2e:
            defpackage.g13.O(r18)
            goto La3
        L33:
            defpackage.g13.O(r18)
            sb3 r2 = kotlinx.coroutines.flow.SharingStarted$Companion.getEagerly()
            if (r1 != r2) goto L45
            r0.d = r6
            java.lang.Object r0 = r3.a(r4, r0)
            if (r0 != r9) goto La3
            goto La2
        L45:
            zf3 r2 = kotlinx.coroutines.flow.SharingStarted$Companion.getLazily()
            r10 = 0
            if (r1 != r2) goto L67
            mp3 r1 = r4.k()
            h91 r2 = new h91
            r2.<init>(r7, r10)
            r0.d = r7
            java.lang.Object r1 = defpackage.sf3.C(r1, r2, r0)
            if (r1 != r9) goto L5e
            goto La2
        L5e:
            r0.d = r5
            java.lang.Object r0 = r3.a(r4, r0)
            if (r0 != r9) goto La3
            goto La2
        L67:
            mp3 r13 = r4.k()
            en3 r12 = new en3
            r12.<init>(r1, r10)
            int r1 = defpackage.d91.a
            e30 r11 = new e30
            r15 = -2
            fy r16 = defpackage.fy.c
            x21 r14 = defpackage.x21.c
            r11.<init>(r12, r13, r14, r15, r16)
            a43 r1 = new a43
            r1.<init>(r7, r6, r10)
            t81 r2 = new t81
            r2.<init>(r11, r1, r7)
            k81 r1 = defpackage.sf3.x(r2)
            k81 r1 = defpackage.sf3.x(r1)
            qb r2 = new qb
            java.lang.Object r5 = r0.n
            java.lang.Float r5 = (java.lang.Float) r5
            r7 = 14
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r0.d = r8
            java.lang.Object r0 = defpackage.sf3.l(r1, r2, r0)
            if (r0 != r9) goto La3
        La2:
            return r9
        La3:
            w84 r0 = defpackage.w84.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.h(java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj) throws Throwable {
        jn3 jn3Var = (jn3) this.m;
        int i = this.d;
        if (i == 0) {
            g13.O(obj);
            int iOrdinal = ((ch3) this.h).ordinal();
            if (iOrdinal == 0) {
                k81 k81Var = (k81) this.l;
                this.d = 1;
                Object objA = k81Var.a(jn3Var, this);
                hq0 hq0Var = hq0.c;
                if (objA == hq0Var) {
                    return hq0Var;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    u41.e();
                    return null;
                }
                Float f = (Float) this.n;
                if (f == xr0.d) {
                    jn3Var.c();
                    throw null;
                }
                jn3Var.f(f);
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041 A[PHI: r9 r10
  0x0041: PHI (r9v2 n43) = (r9v0 n43), (r9v1 n43), (r9v1 n43), (r9v4 n43) binds: [B:10:0x002f, B:15:0x0063, B:17:0x007f, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r10v2 gq0) = (r10v0 gq0), (r10v1 gq0), (r10v1 gq0), (r10v4 gq0) binds: [B:10:0x002f, B:15:0x0063, B:17:0x007f, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x005e A[PHI: r9 r10
  0x005e: PHI (r9v1 n43) = (r9v2 n43), (r9v3 n43) binds: [B:12:0x005b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x005e: PHI (r10v1 gq0) = (r10v2 gq0), (r10v3 gq0) binds: [B:12:0x005b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0063 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:11:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object j(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.d
            r1 = 0
            r2 = 1
            r3 = 2
            hq0 r4 = defpackage.hq0.c
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L21
            if (r0 != r3) goto L1b
            java.lang.Object r0 = r12.l
            n43 r0 = (defpackage.n43) r0
            java.lang.Object r5 = r12.h
            gq0 r5 = (defpackage.gq0) r5
            defpackage.g13.O(r13)
            r9 = r0
            r10 = r5
            goto L41
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r12)
            return r1
        L21:
            java.lang.Object r0 = r12.l
            n43 r0 = (defpackage.n43) r0
            java.lang.Object r5 = r12.h
            gq0 r5 = (defpackage.gq0) r5
            defpackage.g13.O(r13)
            r9 = r0
            r10 = r5
            goto L5e
        L2f:
            defpackage.g13.O(r13)
            java.lang.Object r13 = r12.h
            gq0 r13 = (defpackage.gq0) r13
            n43 r0 = new n43
            r0.<init>()
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.c = r5
            r10 = r13
            r9 = r0
        L41:
            cp0 r6 = new cp0
            java.lang.Object r13 = r12.m
            r7 = r13
            mi2 r7 = (defpackage.mi2) r7
            java.lang.Object r13 = r12.n
            r8 = r13
            go1 r8 = (defpackage.go1) r8
            r11 = 1
            r6.<init>(r7, r8, r9, r10, r11)
            r12.h = r10
            r12.l = r9
            r12.d = r2
            java.lang.Object r13 = defpackage.co1.a(r6, r12)
            if (r13 != r4) goto L5e
            goto L81
        L5e:
            float r13 = r9.c
            r0 = 0
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 != 0) goto L41
            j r13 = new j
            r0 = 17
            r13.<init>(r0, r10)
            pm0 r13 = defpackage.cl3.e(r13)
            fo1 r0 = new fo1
            r0.<init>(r3, r1)
            r12.h = r10
            r12.l = r9
            r12.d = r3
            java.lang.Object r13 = defpackage.sf3.C(r13, r0, r12)
            if (r13 != r4) goto L41
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.j(java.lang.Object):java.lang.Object");
    }

    private final Object k(Object obj) throws Throwable {
        l43 l43Var;
        int i = this.d;
        so0 so0Var = null;
        boolean z = true;
        if (i == 0) {
            g13.O(obj);
            if (((by2) this.l).a) {
                l43 l43Var2 = new l43();
                ne1 ne1Var = (ne1) this.m;
                r81 r81Var = new r81(new x20((jy) ((cr1) this.n).b, z), new xn2(l43Var2, so0Var, 0));
                this.h = l43Var2;
                this.d = 1;
                Object objInvoke = ne1Var.invoke(r81Var, this);
                hq0 hq0Var = hq0.c;
                if (objInvoke == hq0Var) {
                    return hq0Var;
                }
                l43Var = l43Var2;
            }
            return w84.a;
        }
        if (i != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l43Var = (l43) this.h;
        g13.O(obj);
        if (!l43Var.c) {
            u41.r("You must collect the progress flow");
            return null;
        }
        return w84.a;
    }

    private final Object l(Object obj) throws Throwable {
        hg3 hg3Var;
        Throwable th;
        hg3 hg3Var2;
        ne1 ne1Var;
        AtomicReference atomicReference = (AtomicReference) this.m;
        int i = this.d;
        hq0 hq0Var = hq0.c;
        try {
            try {
                if (i == 0) {
                    g13.O(obj);
                    gq0 gq0Var = (gq0) this.h;
                    hg3Var = new hg3(yo4.y(gq0Var.getCoroutineContext()), ((le1) this.l).invoke(gq0Var));
                    hg3 hg3Var3 = (hg3) atomicReference.getAndSet(hg3Var);
                    if (hg3Var3 != null) {
                        gs1 gs1Var = hg3Var3.a;
                        this.h = hg3Var;
                        this.d = 1;
                        gs1Var.c(null);
                        Object objK = gs1Var.K(this);
                        if (objK != hq0Var) {
                            objK = w84.a;
                        }
                        if (objK != hq0Var) {
                        }
                    }
                    return hq0Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hg3Var2 = (hg3) this.h;
                    try {
                        g13.O(obj);
                        while (!atomicReference.compareAndSet(hg3Var2, null) && atomicReference.get() == hg3Var2) {
                        }
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        while (!atomicReference.compareAndSet(hg3Var2, null)) {
                        }
                        throw th;
                    }
                }
                hg3Var = (hg3) this.h;
                g13.O(obj);
                Object obj2 = hg3Var.b;
                this.h = hg3Var;
                this.d = 2;
                obj = ne1Var.invoke(obj2, this);
                if (obj != hq0Var) {
                    hg3Var2 = hg3Var;
                    while (!atomicReference.compareAndSet(hg3Var2, null)) {
                    }
                    return obj;
                }
                return hq0Var;
            } catch (Throwable th3) {
                th = th3;
                hg3Var2 = hg3Var;
                while (!atomicReference.compareAndSet(hg3Var2, null) && atomicReference.get() == hg3Var2) {
                }
                throw th;
            }
            ne1Var = (ne1) this.n;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final Object n(Object obj) throws Throwable {
        int i = this.d;
        if (i == 0) {
            g13.O(obj);
            ix2 ix2Var = (ix2) this.h;
            n23 n23Var = (n23) this.l;
            qb qbVar = new qb(ix2Var, n23Var, new iy2(n23Var, (gh2) this.m, (gh2) this.n, 4), (so0) null, 19);
            this.d = 1;
            Object objQ = yo4.q(qbVar, this);
            hq0 hq0Var = hq0.c;
            if (objQ == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }

    private final Object o(Object obj) throws Throwable {
        int i = this.d;
        if (i == 0) {
            g13.O(obj);
            gq0 gq0Var = (gq0) this.h;
            ix2 ix2Var = (ix2) this.l;
            pj3 pj3Var = new pj3((n23) this.m, (iy2) this.n, gq0Var, null);
            this.d = 1;
            Object objL = p23.l(ix2Var, pj3Var, this);
            hq0 hq0Var = hq0.c;
            if (objL == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }

    private final Object p(Object obj) throws Throwable {
        int i = this.d;
        w84 w84Var = w84.a;
        if (i != 0) {
            if (i == 1) {
                g13.O(obj);
                return w84Var;
            }
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g13.O(obj);
        nu3 nu3Var = (nu3) this.h;
        gh2 gh2Var = nu3Var.r;
        wx3 wx3Var = (wx3) this.l;
        ix2 ix2Var = (ix2) this.m;
        c9 c9Var = (c9) this.n;
        hu3 hu3Var = new hu3(nu3Var, 10);
        this.d = 1;
        wx3Var.getClass();
        Object objE = os3.e(ix2Var, new ox3(gh2Var, wx3Var, null), new ie(c9Var, wx3Var, hu3Var, 27), this);
        hq0 hq0Var = hq0.c;
        if (objE != hq0Var) {
            objE = w84Var;
        }
        return objE == hq0Var ? hq0Var : w84Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                qb qbVar = new qb((le1) this.l, (rb) obj3, (t22) obj2, so0Var, 0);
                qbVar.h = obj;
                return qbVar;
            case 1:
                return new qb(this.h, (ue) this.l, (gn3) obj3, (gn3) obj2, so0Var, 1);
            case 2:
                return new qb((g22) this.h, (ah2) this.l, (gn3) obj3, (mi2) obj2, so0Var, 2);
            case 3:
                return new qb((hb0) this.h, (String) this.l, (Uri) obj3, (qt) obj2, so0Var, 3);
            case 4:
                return new qb((xa0) this.h, (hb0) this.l, (String) obj3, (String) obj2, so0Var, 4);
            case 5:
                return new qb((hb0) this.h, (String) this.l, (String) obj3, (yd2) obj2, so0Var, 5);
            case 6:
                return new qb((hb0) this.h, (String) this.l, (String) obj3, (ArrayList) obj2, so0Var, 6);
            case 7:
                return new qb((hb0) this.h, (yd2) this.l, (String) obj3, (ArrayList) obj2, so0Var, 7);
            case 8:
                return new qb((hb0) this.h, (String) obj3, (byte[]) obj2, (le1) this.l, so0Var);
            case 9:
                return new qb((zj0) this.h, (ScrollCaptureSession) this.l, (Rect) obj3, (Consumer) obj2, so0Var, 9);
            case 10:
                return new qb((sh1) this.h, (hi4) this.l, (AtomicInteger) obj3, (m62) obj2, so0Var, 10);
            case 11:
                return new qb((ConstraintTrackingWorker) this.h, (s62) this.l, (sh1) obj3, (hi4) obj2, so0Var, 11);
            case 12:
                qb qbVar2 = new qb((jn0) this.l, (s94) obj3, (a) obj2, so0Var, 12);
                qbVar2.h = obj;
                return qbVar2;
            case 13:
                qb qbVar3 = new qb((WorkDatabase_Impl) this.l, (String[]) obj3, (ii4) obj2, so0Var, 13);
                qbVar3.h = obj;
                return qbVar3;
            case 14:
                qb qbVar4 = new qb((k81) this.l, (jn3) obj3, (Float) obj2, so0Var, 14);
                qbVar4.h = obj;
                return qbVar4;
            case 15:
                return new qb((fn3) this.h, (k81) this.l, (jn3) obj3, (Float) obj2, so0Var, 15);
            case 16:
                qb qbVar5 = new qb((mi2) obj3, (go1) obj2, so0Var);
                qbVar5.h = obj;
                return qbVar5;
            case 17:
                return new qb((by2) this.l, (ne1) obj3, (cr1) obj2, so0Var, 17);
            case 18:
                qb qbVar6 = new qb((le1) this.l, (AtomicReference) obj3, (ne1) obj2, so0Var, 18);
                qbVar6.h = obj;
                return qbVar6;
            case 19:
                qb qbVar7 = new qb((ix2) this.l, (n23) obj3, (iy2) obj2, so0Var, 19);
                qbVar7.h = obj;
                return qbVar7;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                qb qbVar8 = new qb((n23) this.l, (gh2) obj3, (gh2) obj2, so0Var, 20);
                qbVar8.h = obj;
                return qbVar8;
            case 21:
                return new qb((nu3) this.h, (wx3) this.l, (ix2) obj3, (c9) obj2, so0Var, 21);
            default:
                return new qb((s62) this.h, (hi4) this.l, (uh4) obj3, (Context) obj2, so0Var, 22);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        hq0 hq0Var = hq0.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                ((qb) create((PlatformTextInputSession) obj, (so0) obj2)).invokeSuspend(w84Var);
                return hq0Var;
            case 1:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 2:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 3:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 4:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 5:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 6:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 7:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 8:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 9:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 10:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 11:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 12:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 13:
                return ((qb) create((l81) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 14:
                return ((qb) create((ch3) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 15:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 16:
                ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return hq0Var;
            case 17:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 18:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 19:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return ((qb) create((ix2) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 21:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((qb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00db */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r95) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
