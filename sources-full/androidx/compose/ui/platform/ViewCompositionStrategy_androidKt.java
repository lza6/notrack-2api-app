package androidx.compose.ui.platform;

import defpackage.f32;
import defpackage.g32;
import defpackage.h32;
import defpackage.je1;
import defpackage.k32;
import defpackage.m51;
import defpackage.n32;
import defpackage.p32;
import defpackage.q93;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class ViewCompositionStrategy_androidKt {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ww1 implements je1 {
        final /* synthetic */ h32 $lifecycle;
        final /* synthetic */ k32 $observer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(h32 h32Var, k32 k32Var) {
            super(0);
            this.$lifecycle = h32Var;
            this.$observer = k32Var;
        }

        @Override // defpackage.je1
        public /* bridge */ /* synthetic */ Object invoke() {
            m131invoke();
            return w84.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m131invoke() {
            this.$lifecycle.b(this.$observer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final je1 installForLifecycle(AbstractComposeView abstractComposeView, h32 h32Var) {
        if (((p32) h32Var).c.compareTo(g32.c) <= 0) {
            m51.m("Cannot configure ", abstractComposeView, " to disposeComposition at Lifecycle ON_DESTROY: ", h32Var, "is already destroyed");
            return null;
        }
        q93 q93Var = new q93(1, abstractComposeView);
        h32Var.a(q93Var);
        return new AnonymousClass2(h32Var, q93Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installForLifecycle$lambda$1(AbstractComposeView abstractComposeView, n32 n32Var, f32 f32Var) {
        if (f32Var == f32.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }
}
