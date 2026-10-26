package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.ui.contentcapture.ContentCaptureManager$Companion;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fa implements et0, View.OnAttachStateChangeListener {
    public final AndroidComposeView c;
    public final je1 d;
    public ContentCaptureSessionCompat h;
    public final ArrayList l = new ArrayList();
    public final long m = 100;
    public aa n = aa.c;
    public boolean o = true;
    public final jy p = gm4.b(1, 6, null);
    public final Handler q = new Handler(Looper.getMainLooper());
    public gq1 r;
    public long s;
    public final dh2 t;
    public SemanticsNodeCopy u;
    public boolean v;
    public final m3 w;

    public fa(AndroidComposeView androidComposeView, je1 je1Var) {
        this.c = androidComposeView;
        this.d = je1Var;
        dh2 dh2Var = hq1.a;
        dh2Var.getClass();
        this.r = dh2Var;
        this.t = new dh2();
        this.u = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().a(), dh2Var);
        this.w = new m3(3, this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (defpackage.p23.u(r5, r0) == r4) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.so0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.ca
            if (r0 == 0) goto L13
            r0 = r9
            ca r0 = (defpackage.ca) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            ca r0 = new ca
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.h
            int r1 = r0.m
            r2 = 2
            r3 = 1
            hq0 r4 = defpackage.hq0.c
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L31
            gy r8 = r0.d
            fa r1 = r0.c
            defpackage.g13.O(r9)
        L2d:
            r7 = r1
            r1 = r8
            r8 = r7
            goto L4d
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r8)
            r8 = 0
            return r8
        L38:
            gy r8 = r0.d
            fa r1 = r0.c
            defpackage.g13.O(r9)
            goto L5d
        L40:
            defpackage.g13.O(r9)
            jy r9 = r8.p
            r9.getClass()
            gy r1 = new gy
            r1.<init>(r9)
        L4d:
            r0.c = r8
            r0.d = r1
            r0.m = r3
            java.lang.Object r9 = r1.b(r0)
            if (r9 != r4) goto L5a
            goto L8c
        L5a:
            r7 = r1
            r1 = r8
            r8 = r7
        L5d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            r8.c()
            boolean r9 = r1.d()
            if (r9 == 0) goto L71
            r1.e()
        L71:
            boolean r9 = r1.v
            if (r9 != 0) goto L7e
            r1.v = r3
            android.os.Handler r9 = r1.q
            m3 r5 = r1.w
            r9.post(r5)
        L7e:
            long r5 = r1.m
            r0.c = r1
            r0.d = r8
            r0.m = r2
            java.lang.Object r9 = defpackage.p23.u(r5, r0)
            if (r9 != r4) goto L2d
        L8c:
            return r4
        L8d:
            w84 r8 = defpackage.w84.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa.a(so0):java.lang.Object");
    }

    public final void b(ze3 ze3Var, ne1 ne1Var) {
        ze3Var.getClass();
        List listH = ze3.h(ze3Var, 4);
        int size = listH.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listH.get(i2);
            if (c().a(((ze3) obj).g)) {
                ne1Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final gq1 c() {
        if (this.o) {
            this.o = false;
            this.r = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.c.getSemanticsOwner());
            this.s = System.currentTimeMillis();
        }
        return this.r;
    }

    public final boolean d() {
        return ContentCaptureManager$Companion.isEnabled() && this.h != null;
    }

    public final void e() {
        AutofillId autofillIdNewAutofillId;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.h;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.l;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                en0 en0Var = (en0) arrayList.get(i);
                int iOrdinal = en0Var.c.ordinal();
                if (iOrdinal == 0) {
                    ViewStructureCompat viewStructureCompat = en0Var.d;
                    if (viewStructureCompat != null) {
                        contentCaptureSessionCompat.notifyViewAppeared(viewStructureCompat.toViewStructure());
                    }
                } else if (iOrdinal == 1 && (autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(en0Var.a)) != null) {
                    contentCaptureSessionCompat.notifyViewDisappeared(autofillIdNewAutofillId);
                }
            }
            contentCaptureSessionCompat.flush();
            arrayList.clear();
        }
    }

    public final void f(ze3 ze3Var, SemanticsNodeCopy semanticsNodeCopy) {
        int i = 0;
        b(ze3Var, new da(semanticsNodeCopy, i, this));
        List listH = ze3.h(ze3Var, 4);
        int size = listH.size();
        while (i < size) {
            ze3 ze3Var2 = (ze3) listH.get(i);
            gq1 gq1VarC = c();
            int i2 = ze3Var2.g;
            if (gq1VarC.a(i2)) {
                dh2 dh2Var = this.t;
                if (dh2Var.a(i2)) {
                    Object objB = dh2Var.b(i2);
                    if (objB == null) {
                        throw fq2.i("node not present in pruned tree before this change");
                    }
                    f(ze3Var2, (SemanticsNodeCopy) objB);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void g(int i, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = this.h) != null) {
            AutofillId autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(i);
            if (autofillIdNewAutofillId == null) {
                throw fq2.i("Invalid content capture ID");
            }
            contentCaptureSessionCompat.notifyViewTextChanged(autofillIdNewAutofillId, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public final void h(ze3 ze3Var, int i) {
        le1 le1Var;
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        ViewStructureCompat viewStructureCompat;
        wl2 wl2VarC;
        String strM124x239bb0bb;
        le1 le1Var2;
        if (d()) {
            fi2 fi2Var = ze3Var.d.c;
            Object objG = fi2Var.g(cf3.B);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.n == aa.c && kr1.n(bool, Boolean.TRUE)) {
                Object objG2 = fi2Var.g(te3.l);
                if (objG2 == null) {
                    objG2 = null;
                }
                z0 z0Var = (z0) objG2;
                if (z0Var != null && (le1Var2 = (le1) z0Var.b) != null) {
                }
            } else if (this.n == aa.d && kr1.n(bool, Boolean.FALSE)) {
                Object objG3 = fi2Var.g(te3.l);
                if (objG3 == null) {
                    objG3 = null;
                }
                z0 z0Var2 = (z0) objG3;
                if (z0Var2 != null && (le1Var = (le1) z0Var2.b) != null) {
                }
            }
            int i2 = ze3Var.g;
            ContentCaptureSessionCompat contentCaptureSessionCompat = this.h;
            int i3 = 0;
            if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || (autofillId = ViewCompatShims.getAutofillId(this.c)) == null) {
                viewStructureCompat = null;
            } else {
                ze3 ze3VarJ = ze3Var.j();
                int i4 = ze3Var.g;
                if (ze3VarJ != null) {
                    autofillId2 = contentCaptureSessionCompat.newAutofillId(ze3VarJ.g);
                    if (autofillId2 == null) {
                        viewStructureCompat = null;
                    }
                } else {
                    autofillId2 = autofillId.toAutofillId();
                }
                ViewStructureCompat viewStructureCompatNewVirtualViewStructure = contentCaptureSessionCompat.newVirtualViewStructure(autofillId2, i4);
                if (viewStructureCompatNewVirtualViewStructure == null) {
                    viewStructureCompat = null;
                } else {
                    ue3 ue3Var = ze3Var.d;
                    ff3 ff3Var = cf3.I;
                    fi2 fi2Var2 = ue3Var.c;
                    if (fi2Var2.c(ff3Var)) {
                        viewStructureCompat = null;
                    } else {
                        Bundle extras = viewStructureCompatNewVirtualViewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.s);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objG4 = fi2Var2.g(cf3.x);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        String str = (String) objG4;
                        if (str != null) {
                            viewStructureCompatNewVirtualViewStructure.setId(i4, null, null, str);
                        }
                        Object objG5 = fi2Var2.g(cf3.m);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (((Boolean) objG5) != null) {
                            viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objG6 = fi2Var2.g(cf3.z);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        List list = (List) objG6;
                        if (list != null) {
                            viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                            viewStructureCompatNewVirtualViewStructure.setText(k62.a(62, "\n", list));
                        }
                        Object objG7 = fi2Var2.g(cf3.D);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        hg hgVar = (hg) objG7;
                        if (hgVar != null) {
                            viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                            viewStructureCompatNewVirtualViewStructure.setText(hgVar);
                        }
                        Object objG8 = fi2Var2.g(cf3.a);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        List list2 = (List) objG8;
                        if (list2 != null) {
                            viewStructureCompatNewVirtualViewStructure.setContentDescription(k62.a(62, "\n", list2));
                        }
                        Object objG9 = fi2Var2.g(cf3.w);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        n73 n73Var = (n73) objG9;
                        if (n73Var != null && (strM124x239bb0bb = SemanticsUtils_androidKt.m124x239bb0bb(n73Var.a)) != null) {
                            viewStructureCompatNewVirtualViewStructure.setClassName(strM124x239bb0bb);
                        }
                        xy3 textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(ue3Var);
                        if (textLayoutResult != null) {
                            wy3 wy3Var = textLayoutResult.a;
                            uz3 uz3Var = wy3Var.b;
                            wu0 wu0Var = wy3Var.g;
                            viewStructureCompatNewVirtualViewStructure.setTextStyle(wu0Var.l() * wu0Var.getDensity() * yz3.c(uz3Var.a.b), 0, 0, 0);
                        }
                        ze3 ze3VarJ2 = ze3Var.j();
                        h43 h43VarG = h43.e;
                        if (ze3VarJ2 != null && (wl2VarC = ze3Var.c()) != null) {
                            wl2 wl2Var = wl2VarC.z() ? wl2VarC : null;
                            if (wl2Var != null) {
                                h43VarG = y64.K(ze3VarJ2.a, 8).G(wl2Var, true);
                            }
                        }
                        float f = h43VarG.a;
                        float f2 = h43VarG.b;
                        viewStructureCompatNewVirtualViewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (h43VarG.c - f), (int) (h43VarG.d - f2));
                        viewStructureCompat = viewStructureCompatNewVirtualViewStructure;
                    }
                }
            }
            if (viewStructureCompat != null) {
                this.l.add(new en0(i2, this.s, fn0.c, viewStructureCompat));
            }
            b(ze3Var, new ea(i3, this));
        }
    }

    public final void i(ze3 ze3Var) {
        if (d()) {
            this.l.add(new en0(ze3Var.g, this.s, fn0.d, null));
            List listH = ze3.h(ze3Var, 4);
            int size = listH.size();
            for (int i = 0; i < size; i++) {
                i((ze3) listH.get(i));
            }
        }
    }

    @Override // defpackage.et0
    public final void onStart(n32 n32Var) {
        this.h = (ContentCaptureSessionCompat) this.d.invoke();
        h(this.c.getSemanticsOwner().a(), -1);
        e();
    }

    @Override // defpackage.et0
    public final void onStop(n32 n32Var) {
        i(this.c.getSemanticsOwner().a());
        e();
        this.h = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.q.removeCallbacks(this.w);
        this.h = null;
    }
}
