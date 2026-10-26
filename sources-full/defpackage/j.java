package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj) {
        super(0);
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kk0 kk0Var, jg2 jg2Var) {
        super(0);
        this.c = 8;
        this.d = kk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x02ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [vh2] */
    /* JADX WARN: Type inference failed for: r11v2, types: [vh2] */
    /* JADX WARN: Type inference failed for: r13v107, types: [le1] */
    /* JADX WARN: Type inference failed for: r6v5, types: [bv1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.je1
    public final Object invoke() {
        float fW;
        w44 w44VarC;
        ee1 ee1Var;
        r00 r00VarU;
        z = false;
        boolean z = false;
        cx1 cx1Var = null;
        switch (this.c) {
            case 0:
                ((r) this.d).p.invoke();
                return Boolean.TRUE;
            case 1:
                ft2 ft2Var = ((cd) this.d).r;
                ft2Var.setValue(Boolean.valueOf(!((Boolean) ft2Var.getValue()).booleanValue()));
                return w84.a;
            case 2:
                kr1.O((dd) this.d);
                return w84.a;
            case 3:
                v44 v44Var = (v44) this.d;
                if (v44Var == null || (w44VarC = v44Var.c()) == null) {
                    fW = 0.0f;
                } else {
                    bt2 bt2Var = w44VarC.a;
                    if (bt2Var.f() == 0.0f) {
                        fW = 0.0f;
                    } else {
                        fW = 1.0f - (py.w(bt2Var.f() - w44VarC.b.f(), bt2Var.f(), 0.0f) / bt2Var.f());
                    }
                }
                return Float.valueOf(fW > 0.01f ? 1.0f : 0.0f);
            case 4:
                mi2 mi2Var = (mi2) this.d;
                if (mi2Var != null) {
                    return (List) mi2Var.getValue();
                }
                return null;
            case 5:
                return (hg) this.d;
            case 6:
                return (h43) this.d;
            case 7:
                je1 je1Var = ((sf0) this.d).B;
                if (je1Var != null) {
                    je1Var.invoke();
                }
                return Boolean.TRUE;
            case 8:
                throw null;
            case 9:
                return ((z22) this.d).d();
            case 10:
                return new rw3((nq2) this.d, 0.0f);
            case 11:
                return ((br0) this.d).a();
            case 12:
                h01 h01Var = (h01) this.d;
                wu0 wu0Var = (wu0) h01Var.b.getValue();
                if (wu0Var != null) {
                    t64 t64Var = uj2.a;
                    return Float.valueOf(wu0Var.w(400.0f));
                }
                j93.i(h01Var, ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?", "The density on DrawerState (");
                return null;
            case 13:
                ((db1) this.d).w0();
                return w84.a;
            case 14:
                return Boolean.valueOf(((gb1) this.d).p.z0(7));
            case 15:
                fe1 fe1Var = (fe1) this.d;
                Context context = fe1Var.c;
                String str = fe1Var.d;
                if (str == null || !fe1Var.l) {
                    ee1Var = new ee1(context, fe1Var.d, new sz0(5), fe1Var.h, fe1Var.m);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    ee1Var = new ee1(context, new File(noBackupFilesDir, str).getAbsolutePath(), new sz0(5), fe1Var.h, fe1Var.m);
                }
                ee1Var.setWriteAheadLoggingEnabled(fe1Var.o);
                return ee1Var;
            case 16:
                return (List) this.d;
            case 17:
                return Float.valueOf(vl0.L(((gq0) this.d).getCoroutineContext()));
            case 18:
                Object systemService = ((View) ((ci4) this.d).d).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 19:
                Object systemService2 = ((View) ((fp1) this.d).c).getContext().getSystemService("input_method");
                systemService2.getClass();
                return (InputMethodManager) systemService2;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                yx1 yx1Var = ((ux1) this.d).O;
                yx1Var.p.H = true;
                s82 s82Var = yx1Var.q;
                if (s82Var != null) {
                    s82Var.B = true;
                }
                return w84.a;
            case 21:
                return new BaseInputConnection(((a32) this.d).a, false);
            case 22:
                qf2 qf2Var = (qf2) this.d;
                oi2 oi2Var = qf2Var.c;
                oi2 oi2Var2 = qf2Var.b;
                oi2 oi2Var3 = qf2Var.e;
                qf2Var.f = false;
                HashSet hashSet = new HashSet();
                oi2 oi2Var4 = qf2Var.d;
                Object[] objArr = oi2Var4.c;
                int i = oi2Var4.h;
                for (int i2 = 0; i2 < i; i2++) {
                    ux1 ux1Var = (ux1) objArr[i2];
                    p13 p13Var = (p13) oi2Var3.c[i2];
                    if (((of2) ux1Var.N.f).isAttached()) {
                        qf2.b((of2) ux1Var.N.f, p13Var, hashSet);
                    }
                }
                oi2Var4.i();
                oi2Var3.i();
                Object[] objArr2 = oi2Var2.c;
                int i3 = oi2Var2.h;
                for (int i4 = 0; i4 < i3; i4++) {
                    mr mrVar = (mr) objArr2[i4];
                    p13 p13Var2 = (p13) oi2Var.c[i4];
                    if (mrVar.isAttached()) {
                        qf2.b(mrVar, p13Var2, hashSet);
                    }
                }
                oi2Var2.i();
                oi2Var.i();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((mr) it.next()).x0();
                }
                return w84.a;
            case 23:
                return (dg2) h30.a(((w20) this.d).h());
            case 24:
                return ((fk2) this.d).d;
            case 25:
                return ((ik2) this.d).v0();
            case 26:
                ?? r13 = (le1) this.d;
                n63 n63Var = wl2.O;
                r13.invoke(n63Var);
                n63Var.y = n63Var.s.l(n63Var.v, n63Var.x, n63Var.w);
                return w84.a;
            case 27:
                ArrayList arrayList = ((ou2) this.d).a;
                fi2 fi2Var = new fi2(arrayList.size());
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ?? r6 = (bv1) arrayList.get(i5);
                    Object obj = r6.b;
                    int i6 = r6.a;
                    Object ps1Var = obj != null ? new ps1(Integer.valueOf(i6), r6.b) : Integer.valueOf(i6);
                    int iF = fi2Var.f(ps1Var);
                    ?? r9 = iF < 0;
                    Object obj2 = r9 != false ? null : fi2Var.c[iF];
                    if (obj2 != null) {
                        if (obj2 instanceof vh2) {
                            ?? r10 = (vh2) obj2;
                            r10.g(r6);
                            r6 = r10;
                        } else {
                            Object[] objArr3 = en2.a;
                            ?? vh2Var = new vh2(2);
                            vh2Var.g(obj2);
                            vh2Var.g(r6);
                            r6 = vh2Var;
                        }
                    }
                    if (r9 == true) {
                        int i7 = ~iF;
                        fi2Var.b[i7] = ps1Var;
                        fi2Var.c[i7] = r6;
                    } else {
                        fi2Var.c[iF] = r6;
                    }
                }
                return new ug2(fi2Var);
            case 28:
                rx2 rx2Var = (rx2) this.d;
                cx1 parentLayoutCoordinates = rx2Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.z()) {
                    cx1Var = parentLayoutCoordinates;
                }
                if (cx1Var != null && rx2Var.m1805x99e2a2d4() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                d43 d43Var = (d43) this.d;
                synchronized (d43Var.b) {
                    r00VarU = d43Var.u();
                    if (((z33) d43Var.t.getValue()).compareTo(z33.d) <= 0) {
                        Throwable th = d43Var.d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (r00VarU != null) {
                    ((t00) r00VarU).resumeWith(w84.a);
                }
                return w84.a;
        }
    }
}
