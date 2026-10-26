package androidx.compose.ui.platform;

import defpackage.cl3;
import defpackage.g13;
import defpackage.hq0;
import defpackage.mi2;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.so0;
import defpackage.u41;
import defpackage.uo0;
import defpackage.vr0;
import defpackage.w84;
import defpackage.yr2;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class ChainedPlatformTextInputInterceptor {
    private final mi2 interceptor$delegate;
    private final ChainedPlatformTextInputInterceptor parent;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1, reason: invalid class name */
    @vr0(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {219}, m = "textInputSession")
    public static final class AnonymousClass1 extends uo0 {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(so0 so0Var) {
            super(so0Var);
        }

        @Override // defpackage.wr
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChainedPlatformTextInputInterceptor.this.textInputSession(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2, reason: invalid class name */
    @vr0(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends mq3 implements ne1 {
        final /* synthetic */ ne1 $session;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ne1 ne1Var, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, so0 so0Var) {
            super(2, so0Var);
            this.$session = ne1Var;
            this.this$0 = chainedPlatformTextInputInterceptor;
        }

        @Override // defpackage.wr
        public final so0 create(Object obj, so0 so0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$session, this.this$0, so0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.ne1
        public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, so0 so0Var) {
            return ((AnonymousClass2) create(platformTextInputSessionScope, so0Var)).invokeSuspend(w84.a);
        }

        @Override // defpackage.wr
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                g13.O(obj);
                ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1((PlatformTextInputSessionScope) this.L$0, new AtomicReference(null), this.this$0);
                ne1 ne1Var = this.$session;
                this.label = 1;
                Object objInvoke = ne1Var.invoke(chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, this);
                hq0 hq0Var = hq0.c;
                if (objInvoke == hq0Var) {
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

    public ChainedPlatformTextInputInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.parent = chainedPlatformTextInputInterceptor;
        this.interceptor$delegate = cl3.d(platformTextInputInterceptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlatformTextInputInterceptor getInterceptor() {
        return (PlatformTextInputInterceptor) this.interceptor$delegate.getValue();
    }

    private final void setInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor) {
        this.interceptor$delegate.setValue(platformTextInputInterceptor);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object textInputSession(yr2 yr2Var, ne1 ne1Var, so0 so0Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (so0Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) so0Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(so0Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(so0Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            g13.O(obj);
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = this.parent;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(ne1Var, this, null);
            anonymousClass1.label = 1;
            Object objInterceptedTextInputSession = PlatformTextInputModifierNodeKt.interceptedTextInputSession(yr2Var, chainedPlatformTextInputInterceptor, anonymousClass2, anonymousClass1);
            hq0 hq0Var = hq0.c;
            if (objInterceptedTextInputSession == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        u41.p();
        return null;
    }

    public final void updateInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor) {
        setInterceptor(platformTextInputInterceptor);
    }
}
