package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class qf2 {
    public final AndroidComposeView a;
    public final oi2 b = new oi2(0, new mr[16]);
    public final oi2 c = new oi2(0, new p13[16]);
    public final oi2 d = new oi2(0, new ux1[16]);
    public final oi2 e = new oi2(0, new p13[16]);
    public boolean f;

    public qf2(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [of2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static void b(of2 of2Var, p13 p13Var, HashSet hashSet) {
        if (!of2Var.getNode().isAttached()) {
            po1.b("visitSubtreeIf called on an unattached node");
        }
        oi2 oi2Var = new oi2(0, new of2[16]);
        of2 child$ui_release = of2Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            y64.d(oi2Var, of2Var.getNode());
        } else {
            oi2Var.c(child$ui_release);
        }
        while (true) {
            int i = oi2Var.h;
            if (i == 0) {
                return;
            }
            of2 of2Var2 = (of2) oi2Var.m(i - 1);
            if ((of2Var2.getAggregateChildKindSet$ui_release() & 32) != 0) {
                of2 child$ui_release2 = of2Var2;
                while (true) {
                    if (child$ui_release2 != null) {
                        if ((child$ui_release2.getKindSet$ui_release() & 32) != 0) {
                            ?? E = child$ui_release2;
                            ?? oi2Var2 = 0;
                            while (E != 0) {
                                if (E instanceof rf2) {
                                    rf2 rf2Var = (rf2) E;
                                    if (rf2Var instanceof mr) {
                                        mr mrVar = (mr) rf2Var;
                                        if ((mrVar.c instanceof pf2) && mrVar.h.contains(p13Var)) {
                                            hashSet.add(rf2Var);
                                        }
                                    }
                                    if (rf2Var.i().n(p13Var)) {
                                        break;
                                    }
                                } else if ((E.getKindSet$ui_release() & 32) != 0 && (E instanceof ju0)) {
                                    of2 child$ui_release3 = ((ju0) E).d;
                                    int i2 = 0;
                                    E = E;
                                    oi2Var2 = oi2Var2;
                                    while (child$ui_release3 != null) {
                                        if ((child$ui_release3.getKindSet$ui_release() & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oi2Var2 = oi2Var2;
                                                E = child$ui_release3;
                                            } else {
                                                if (oi2Var2 == 0) {
                                                    oi2Var2 = new oi2(0, new of2[16]);
                                                }
                                                if (E != 0) {
                                                    oi2Var2.c(E);
                                                    E = 0;
                                                }
                                                oi2Var2.c(child$ui_release3);
                                            }
                                        }
                                        child$ui_release3 = child$ui_release3.getChild$ui_release();
                                        E = E;
                                        oi2Var2 = oi2Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = y64.e(oi2Var2);
                            }
                        }
                        child$ui_release2 = child$ui_release2.getChild$ui_release();
                    }
                }
            }
            y64.d(oi2Var, of2Var2);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.registerOnEndApplyChangesListener(new j(22, this));
    }
}
