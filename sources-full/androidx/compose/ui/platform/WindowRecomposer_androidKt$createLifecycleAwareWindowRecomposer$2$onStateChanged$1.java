package androidx.compose.ui.platform;

import android.view.View;
import defpackage.c43;
import defpackage.d43;
import defpackage.g13;
import defpackage.gq0;
import defpackage.gs1;
import defpackage.hn3;
import defpackage.hq0;
import defpackage.mq3;
import defpackage.n32;
import defpackage.ne1;
import defpackage.pb;
import defpackage.py;
import defpackage.q43;
import defpackage.so0;
import defpackage.u41;
import defpackage.vr0;
import defpackage.w84;
import defpackage.yo4;

/* JADX INFO: loaded from: classes.dex */
@vr0(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {388}, m = "invokeSuspend")
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends mq3 implements ne1 {
    final /* synthetic */ d43 $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt.AnonymousClass2 $self;
    final /* synthetic */ n32 $source;
    final /* synthetic */ q43 $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(q43 q43Var, d43 d43Var, n32 n32Var, WindowRecomposer_androidKt.AnonymousClass2 anonymousClass2, View view, so0 so0Var) {
        super(2, so0Var);
        this.$systemDurationScaleSettingConsumer = q43Var;
        this.$recomposer = d43Var;
        this.$source = n32Var;
        this.$self = anonymousClass2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, so0Var);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    @Override // defpackage.ne1
    public final Object invoke(gq0 gq0Var, so0 so0Var) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(gq0Var, so0Var)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [gs1] */
    /* JADX WARN: Type inference failed for: r0v15, types: [gs1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [gs1] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? F = this.label;
        w84 w84Var = w84.a;
        try {
            if (F == 0) {
                g13.O(obj);
                gq0 gq0Var = (gq0) this.L$0;
                try {
                    MotionDurationScaleImpl motionDurationScaleImpl = (MotionDurationScaleImpl) this.$systemDurationScaleSettingConsumer.c;
                    if (motionDurationScaleImpl != null) {
                        hn3 animationScaleFlowFor = WindowRecomposer_androidKt.getAnimationScaleFlowFor(this.$this_createLifecycleAwareWindowRecomposer.getContext().getApplicationContext());
                        motionDurationScaleImpl.setScaleFactor(((Number) animationScaleFlowFor.getValue()).floatValue());
                        F = py.F(gq0Var, null, null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(animationScaleFlowFor, motionDurationScaleImpl, null), 3);
                    } else {
                        F = 0;
                    }
                    d43 d43Var = this.$recomposer;
                    this.L$0 = F;
                    this.label = 1;
                    d43Var.getClass();
                    Object objY = py.Y(d43Var.a, new pb(d43Var, new c43(d43Var, null), yo4.z(getContext()), null), this);
                    hq0 hq0Var = hq0.c;
                    if (objY != hq0Var) {
                        objY = w84Var;
                    }
                    if (objY != hq0Var) {
                        objY = w84Var;
                    }
                    if (objY == hq0Var) {
                        return hq0Var;
                    }
                } catch (Throwable th) {
                    th = th;
                    F = 0;
                    if (F != 0) {
                        F.c(null);
                    }
                    this.$source.h().b(this.$self);
                    throw th;
                }
            } else {
                if (F != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                F = (gs1) this.L$0;
                g13.O(obj);
            }
            if (F != 0) {
                F.c(null);
            }
            this.$source.h().b(this.$self);
            return w84Var;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
