package androidx.compose.ui.platform;

import defpackage.cl3;
import defpackage.g13;
import defpackage.hq0;
import defpackage.je1;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.pm0;
import defpackage.sf3;
import defpackage.so0;
import defpackage.u41;
import defpackage.vr0;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
@vr0(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend")
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends mq3 implements ne1 {
    final /* synthetic */ PlatformTextInputSessionScope $parentSession;
    final /* synthetic */ PlatformTextInputMethodRequest $request;
    int label;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements je1 {
        final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
            super(0);
            this.this$0 = chainedPlatformTextInputInterceptor;
        }

        @Override // defpackage.je1
        public final PlatformTextInputInterceptor invoke() {
            return this.this$0.getInterceptor();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    @vr0(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends mq3 implements ne1 {
        final /* synthetic */ PlatformTextInputSessionScope $parentSession;
        final /* synthetic */ PlatformTextInputMethodRequest $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, so0 so0Var) {
            super(2, so0Var);
            this.$request = platformTextInputMethodRequest;
            this.$parentSession = platformTextInputSessionScope;
        }

        @Override // defpackage.wr
        public final so0 create(Object obj, so0 so0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, so0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.ne1
        public final Object invoke(PlatformTextInputInterceptor platformTextInputInterceptor, so0 so0Var) {
            return ((AnonymousClass2) create(platformTextInputInterceptor, so0Var)).invokeSuspend(w84.a);
        }

        @Override // defpackage.wr
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                g13.O(obj);
                PlatformTextInputInterceptor platformTextInputInterceptor = (PlatformTextInputInterceptor) this.L$0;
                PlatformTextInputMethodRequest platformTextInputMethodRequest = this.$request;
                PlatformTextInputSessionScope platformTextInputSessionScope = this.$parentSession;
                this.label = 1;
                Object objInterceptStartInputMethod = platformTextInputInterceptor.interceptStartInputMethod(platformTextInputMethodRequest, platformTextInputSessionScope, this);
                hq0 hq0Var = hq0.c;
                if (objInterceptStartInputMethod == hq0Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, so0 so0Var) {
        super(2, so0Var);
        this.this$0 = chainedPlatformTextInputInterceptor;
        this.$request = platformTextInputMethodRequest;
        this.$parentSession = platformTextInputSessionScope;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.this$0, this.$request, this.$parentSession, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(w84 w84Var, so0 so0Var) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3) create(w84Var, so0Var)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            g13.O(obj);
            pm0 pm0VarE = cl3.e(new AnonymousClass1(this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, null);
            this.label = 1;
            Object objL = sf3.l(pm0VarE, anonymousClass2, this);
            hq0 hq0Var = hq0.c;
            if (objL == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        u41.r("Interceptors flow should never terminate.");
        return null;
    }
}
