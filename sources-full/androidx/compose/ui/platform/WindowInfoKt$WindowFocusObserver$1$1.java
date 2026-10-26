package androidx.compose.ui.platform;

import defpackage.cl3;
import defpackage.g13;
import defpackage.gn3;
import defpackage.gq0;
import defpackage.hq0;
import defpackage.je1;
import defpackage.l81;
import defpackage.le1;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.pm0;
import defpackage.so0;
import defpackage.u41;
import defpackage.vr0;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
@vr0(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", l = {63}, m = "invokeSuspend")
public final class WindowInfoKt$WindowFocusObserver$1$1 extends mq3 implements ne1 {
    final /* synthetic */ gn3 $callback;
    final /* synthetic */ WindowInfo $windowInfo;
    int label;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements je1 {
        final /* synthetic */ WindowInfo $windowInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WindowInfo windowInfo) {
            super(0);
            this.$windowInfo = windowInfo;
        }

        @Override // defpackage.je1
        public final Boolean invoke() {
            return Boolean.valueOf(this.$windowInfo.isWindowFocused());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, gn3 gn3Var, so0 so0Var) {
        super(2, so0Var);
        this.$windowInfo = windowInfo;
        this.$callback = gn3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(gq0 gq0Var, so0 so0Var) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(gq0Var, so0Var)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            g13.O(obj);
            pm0 pm0VarE = cl3.e(new AnonymousClass1(this.$windowInfo));
            final gn3 gn3Var = this.$callback;
            l81 l81Var = new l81() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.2
                @Override // defpackage.l81
                public /* bridge */ /* synthetic */ Object emit(Object obj2, so0 so0Var) {
                    return emit(((Boolean) obj2).booleanValue(), so0Var);
                }

                public final Object emit(boolean z, so0 so0Var) {
                    ((le1) gn3Var.getValue()).invoke(Boolean.valueOf(z));
                    return w84.a;
                }
            };
            this.label = 1;
            Object objA = pm0VarE.a(l81Var, this);
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
        return w84.a;
    }
}
