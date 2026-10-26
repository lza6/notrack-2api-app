package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class rt0 extends nm3 {
    public final pt0 b;
    public AnimatorSet c;

    public rt0(pt0 pt0Var) {
        this.b = pt0Var;
    }

    @Override // defpackage.nm3
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.c;
        animatorSet.getClass();
        animatorSet.start();
        if (nd1.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // defpackage.nm3
    public final void b(zq zqVar, ViewGroup viewGroup) {
        zqVar.getClass();
        viewGroup.getClass();
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // defpackage.nm3
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        pt0 pt0Var = this.b;
        if (pt0Var.E()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        mi4 mi4VarR = pt0Var.R(context);
        this.c = mi4VarR != null ? (AnimatorSet) mi4VarR.h : null;
        throw null;
    }
}
