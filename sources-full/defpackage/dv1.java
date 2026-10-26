package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class dv1 extends of2 implements cv1 {
    public le1 c;
    public le1 d;

    @Override // defpackage.cv1
    public final boolean R(KeyEvent keyEvent) {
        le1 le1Var = this.c;
        if (le1Var != null) {
            return ((Boolean) le1Var.invoke(new yu1(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.cv1
    public final boolean j(KeyEvent keyEvent) {
        le1 le1Var = this.d;
        if (le1Var != null) {
            return ((Boolean) le1Var.invoke(new yu1(keyEvent))).booleanValue();
        }
        return false;
    }
}
