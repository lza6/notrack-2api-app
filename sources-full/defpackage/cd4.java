package defpackage;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd4 extends we1 implements le1 {
    public static final cd4 c = new cd4(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
