package androidx.compose.ui.platform;

import ai.notrack.app.R;
import android.view.View;
import defpackage.cd4;
import defpackage.h32;
import defpackage.j93;
import defpackage.je1;
import defpackage.n32;
import defpackage.po1;
import defpackage.px2;
import defpackage.q43;
import defpackage.rf3;
import defpackage.u41;
import defpackage.ud4;

/* JADX INFO: loaded from: classes.dex */
public interface ViewCompositionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public je1 installFor(final AbstractComposeView abstractComposeView) {
            ?? r1 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    abstractComposeView.disposeComposition();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r1);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(abstractComposeView, r1);
        }
    }

    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public je1 installFor(final AbstractComposeView abstractComposeView) {
            ?? r3 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    AbstractComposeView abstractComposeView2 = abstractComposeView;
                    abstractComposeView2.getClass();
                    for (Object obj : rf3.Z(abstractComposeView2.getParent(), cd4.c)) {
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                return;
                            }
                        }
                    }
                    abstractComposeView.disposeComposition();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r3);
            j93 j93Var = new j93(10);
            px2 px2Var = (px2) abstractComposeView.getTag(R.id.pooling_container_listener_holder_tag);
            if (px2Var == null) {
                px2Var = new px2();
                abstractComposeView.setTag(R.id.pooling_container_listener_holder_tag, px2Var);
            }
            px2Var.a.add(j93Var);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(abstractComposeView, r3, j93Var);
        }
    }

    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;
        private final h32 lifecycle;

        public DisposeOnLifecycleDestroyed(h32 h32Var) {
            this.lifecycle = h32Var;
        }

        public DisposeOnLifecycleDestroyed(n32 n32Var) {
            this(n32Var.h());
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public je1 installFor(AbstractComposeView abstractComposeView) {
            return ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, this.lifecycle);
        }
    }

    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public je1 installFor(final AbstractComposeView abstractComposeView) {
            if (!abstractComposeView.isAttachedToWindow()) {
                final q43 q43Var = new q43();
                ?? r0 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        n32 n32VarA = ud4.a(abstractComposeView);
                        AbstractComposeView abstractComposeView2 = abstractComposeView;
                        if (n32VarA != null) {
                            q43Var.c = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView2, n32VarA.h());
                            abstractComposeView.removeOnAttachStateChangeListener(this);
                        } else {
                            po1.c("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner");
                            u41.p();
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }
                };
                abstractComposeView.addOnAttachStateChangeListener(r0);
                q43Var.c = new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(abstractComposeView, r0);
                return new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(q43Var);
            }
            n32 n32VarA = ud4.a(abstractComposeView);
            if (n32VarA != null) {
                return ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, n32VarA.h());
            }
            po1.c("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
            u41.p();
            return null;
        }
    }

    je1 installFor(AbstractComposeView abstractComposeView);
}
