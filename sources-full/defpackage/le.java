package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class le extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ bd4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le(bd4 bd4Var, int i) {
        super(0);
        this.c = i;
        this.d = bd4Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        bd4 bd4Var = this.d;
        switch (i) {
            case 0:
                bd4Var.getLayoutNode().A();
                return w84Var;
            case 1:
                if (bd4Var.m && bd4Var.isAttachedToWindow() && bd4Var.getView().getParent() == bd4Var) {
                    bd4Var.getSnapshotObserver().a(bd4Var, v1.r, bd4Var.getUpdate());
                }
                return w84Var;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                bd4Var.H.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                bd4Var.getReleaseBlock().invoke(bd4Var.H);
                bd4.o(bd4Var);
                return w84Var;
            case 4:
                bd4Var.getResetBlock().invoke(bd4Var.H);
                return w84Var;
            default:
                bd4Var.getUpdateBlock().invoke(bd4Var.H);
                return w84Var;
        }
    }
}
