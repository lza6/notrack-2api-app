package androidx.compose.ui.platform;

import android.view.View;
import defpackage.a43;
import defpackage.d43;
import defpackage.g13;
import defpackage.gq0;
import defpackage.hq0;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.sf3;
import defpackage.so0;
import defpackage.u41;
import defpackage.vr0;
import defpackage.w84;

/* JADX INFO: loaded from: classes.dex */
@vr0(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {227}, m = "invokeSuspend")
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends mq3 implements ne1 {
    final /* synthetic */ d43 $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(d43 d43Var, View view, so0 so0Var) {
        super(2, so0Var);
        this.$newRecomposer = d43Var;
        this.$rootView = view;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.$newRecomposer, this.$rootView, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(gq0 gq0Var, so0 so0Var) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create(gq0Var, so0Var)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        w84 w84Var = w84.a;
        try {
            if (i == 0) {
                g13.O(obj);
                d43 d43Var = this.$newRecomposer;
                this.label = 1;
                Object objC = sf3.C(d43Var.t, new a43(2, 0, null), this);
                hq0 hq0Var = hq0.c;
                if (objC != hq0Var) {
                    objC = w84Var;
                }
                if (objC == hq0Var) {
                    return hq0Var;
                }
            } else {
                if (i != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
            }
            if (WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
            return w84Var;
        } catch (Throwable th) {
            if (WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
            throw th;
        }
    }
}
