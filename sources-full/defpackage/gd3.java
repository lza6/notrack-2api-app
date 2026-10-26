package defpackage;

import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd3 {
    public final /* synthetic */ int a;

    public final fd3 a(fe3 fe3Var) {
        ed3 ed3VarK;
        ed3 ed3VarK2;
        int i = this.a;
        boolean z = true;
        sq0 sq0Var = sq0.c;
        switch (i) {
            case 0:
                return new fd3(fe3Var.e().a(fe3Var.e().c), fe3Var.j().a(fe3Var.j().d), fe3Var.k() == sq0Var);
            case 1:
                return SelectionAdjustment$Companion.a(fe3Var);
            case 2:
                return gb2.i(fe3Var, bg1.z);
            case 3:
                return gb2.i(fe3Var, t73.y);
            default:
                fd3 fd3VarC = fe3Var.c();
                if (fd3VarC == null) {
                    return gb2.i(fe3Var, bg1.z);
                }
                ed3 ed3Var = fd3VarC.b;
                ed3 ed3Var2 = fd3VarC.a;
                if (fe3Var.a()) {
                    ed3VarK2 = gb2.k(fe3Var, fe3Var.e(), ed3Var2);
                    ed3VarK = ed3Var;
                    ed3Var = ed3Var2;
                    ed3Var2 = ed3VarK2;
                } else {
                    ed3VarK = gb2.k(fe3Var, fe3Var.j(), ed3Var);
                    ed3VarK2 = ed3VarK;
                }
                if (kr1.n(ed3VarK2, ed3Var)) {
                    return fd3VarC;
                }
                if (fe3Var.k() != sq0Var && (fe3Var.k() != sq0.h || ed3Var2.b <= ed3VarK.b)) {
                    z = false;
                }
                return gb2.C(new fd3(ed3Var2, ed3VarK, z), fe3Var);
        }
    }
}
