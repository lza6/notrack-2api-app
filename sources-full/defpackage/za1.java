package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class za1 {
    public static final za1 b = new za1();
    public static final za1 c = new za1();
    public static final za1 d = new za1();
    public final oi2 a = new oi2(0, new ab1[16]);

    public static void b(za1 za1Var) {
        za1Var.getClass();
        za1Var.a(new lb4(1, 21));
    }

    public final boolean a(le1 le1Var) {
        if (this == b) {
            u41.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (this == c) {
            u41.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        oi2 oi2Var = this.a;
        int i = oi2Var.h;
        if (i == 0) {
            u41.r("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = oi2Var.c;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            iu0 iu0Var = (ab1) objArr[i2];
            if (!((of2) iu0Var).getNode().isAttached()) {
                po1.b("visitChildren called on an unattached node");
            }
            oi2 oi2Var2 = new oi2(0, new of2[16]);
            of2 of2Var = (of2) iu0Var;
            of2 child$ui_release = of2Var.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                y64.d(oi2Var2, of2Var.getNode());
            } else {
                oi2Var2.c(child$ui_release);
            }
            while (true) {
                int i3 = oi2Var2.h;
                if (i3 == 0) {
                    break;
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
                                    db1 db1Var = (db1) of2VarE;
                                    if (db1Var.w0().a ? ((Boolean) le1Var.invoke(db1Var)).booleanValue() : yh4.x(db1Var, 7, le1Var)) {
                                        z = true;
                                        break;
                                    }
                                } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                    int i4 = 0;
                                    for (of2 child$ui_release2 = ((ju0) of2VarE).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                        if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                of2VarE = child$ui_release2;
                                            } else {
                                                if (oi2Var3 == null) {
                                                    oi2Var3 = new oi2(0, new of2[16]);
                                                }
                                                if (of2VarE != null) {
                                                    oi2Var3.c(of2VarE);
                                                    of2VarE = null;
                                                }
                                                oi2Var3.c(child$ui_release2);
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
        return z;
    }
}
