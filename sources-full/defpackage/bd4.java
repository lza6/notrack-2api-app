package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.ViewRootForInspector;

/* JADX INFO: loaded from: classes.dex */
public final class bd4 extends me implements ViewRootForInspector {
    public final View H;
    public final fk2 I;
    public f93 J;
    public le1 K;
    public le1 L;
    public le1 M;

    public bd4(Context context, le1 le1Var, qk0 qk0Var, g93 g93Var, int i, yr2 yr2Var) {
        View view = (View) le1Var.invoke(context);
        fk2 fk2Var = new fk2();
        super(context, qk0Var, i, fk2Var, view, yr2Var);
        this.H = view;
        this.I = fk2Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objConsumeRestored = g93Var != null ? g93Var.consumeRestored(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (g93Var != null) {
            setSavableRegistryEntry(g93Var.registerProvider(strValueOf, new le(this, 2)));
        }
        v1 v1Var = v1.u;
        this.K = v1Var;
        this.L = v1Var;
        this.M = v1Var;
    }

    public static final void o(bd4 bd4Var) {
        bd4Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(f93 f93Var) {
        f93 f93Var2 = this.J;
        if (f93Var2 != null) {
            ((iy2) f93Var2).q();
        }
        this.J = f93Var;
    }

    public final fk2 getDispatcher() {
        return this.I;
    }

    public final le1 getReleaseBlock() {
        return this.M;
    }

    public final le1 getResetBlock() {
        return this.L;
    }

    public final le1 getUpdateBlock() {
        return this.K;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(le1 le1Var) {
        this.M = le1Var;
        setRelease(new le(this, 3));
    }

    public final void setResetBlock(le1 le1Var) {
        this.L = le1Var;
        setReset(new le(this, 4));
    }

    public final void setUpdateBlock(le1 le1Var) {
        this.K = le1Var;
        setUpdate(new le(this, 5));
    }
}
