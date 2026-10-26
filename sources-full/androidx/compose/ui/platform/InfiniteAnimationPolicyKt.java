package androidx.compose.ui.platform;

import defpackage.g13;
import defpackage.hq0;
import defpackage.le1;
import defpackage.mq3;
import defpackage.so0;
import defpackage.u41;
import defpackage.vr0;
import defpackage.w84;
import defpackage.yo4;

/* JADX INFO: loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2, reason: invalid class name */
    @vr0(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {66}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends mq3 implements le1 {
        final /* synthetic */ le1 $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(le1 le1Var, so0 so0Var) {
            super(1, so0Var);
            this.$onFrame = le1Var;
        }

        @Override // defpackage.wr
        public final so0 create(so0 so0Var) {
            return new AnonymousClass2(this.$onFrame, so0Var);
        }

        @Override // defpackage.le1
        public final Object invoke(so0 so0Var) {
            return ((AnonymousClass2) create(so0Var)).invokeSuspend(w84.a);
        }

        @Override // defpackage.wr
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    g13.O(obj);
                    return obj;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
            le1 le1Var = this.$onFrame;
            this.label = 1;
            Object objWithFrameNanos = yo4.z(getContext()).withFrameNanos(le1Var, this);
            hq0 hq0Var = hq0.c;
            return objWithFrameNanos == hq0Var ? hq0Var : objWithFrameNanos;
        }
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(le1 le1Var, so0 so0Var) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) so0Var.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? yo4.z(so0Var.getContext()).withFrameNanos(le1Var, so0Var) : infiniteAnimationPolicy.onInfiniteOperation(new AnonymousClass2(le1Var, null), so0Var);
    }
}
