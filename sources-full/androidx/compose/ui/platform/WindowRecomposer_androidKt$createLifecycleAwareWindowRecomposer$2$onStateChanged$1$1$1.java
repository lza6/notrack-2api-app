package androidx.compose.ui.platform;

import defpackage.g13;
import defpackage.gq0;
import defpackage.hn3;
import defpackage.hq0;
import defpackage.l81;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.so0;
import defpackage.u41;
import defpackage.vr0;
import defpackage.w84;

/* JADX INFO: loaded from: classes.dex */
@vr0(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {383}, m = "invokeSuspend")
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends mq3 implements ne1 {
    final /* synthetic */ hn3 $durationScaleStateFlow;
    final /* synthetic */ MotionDurationScaleImpl $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(hn3 hn3Var, MotionDurationScaleImpl motionDurationScaleImpl, so0 so0Var) {
        super(2, so0Var);
        this.$durationScaleStateFlow = hn3Var;
        this.$it = motionDurationScaleImpl;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.$durationScaleStateFlow, this.$it, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(gq0 gq0Var, so0 so0Var) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create(gq0Var, so0Var)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            g13.O(obj);
            hn3 hn3Var = this.$durationScaleStateFlow;
            final MotionDurationScaleImpl motionDurationScaleImpl = this.$it;
            l81 l81Var = new l81() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1.1
                public final Object emit(float f, so0 so0Var) {
                    motionDurationScaleImpl.setScaleFactor(f);
                    return w84.a;
                }

                @Override // defpackage.l81
                public /* bridge */ /* synthetic */ Object emit(Object obj2, so0 so0Var) {
                    return emit(((Number) obj2).floatValue(), so0Var);
                }
            };
            this.label = 1;
            Object objA = hn3Var.a(l81Var, this);
            hq0 hq0Var = hq0.c;
            if (objA == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        u41.p();
        return null;
    }
}
