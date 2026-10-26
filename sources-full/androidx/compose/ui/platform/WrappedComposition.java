package androidx.compose.ui.platform;

import ai.notrack.app.R;
import android.view.View;
import androidx.compose.runtime.Composer$Companion;
import defpackage.bk3;
import defpackage.bl0;
import defpackage.ck0;
import defpackage.cl0;
import defpackage.f32;
import defpackage.g32;
import defpackage.gu1;
import defpackage.h32;
import defpackage.k32;
import defpackage.kk0;
import defpackage.le1;
import defpackage.lu1;
import defpackage.n32;
import defpackage.ne1;
import defpackage.p32;
import defpackage.pk0;
import defpackage.r11;
import defpackage.sk0;
import defpackage.vp1;
import defpackage.w84;
import defpackage.ww1;
import defpackage.yg0;
import defpackage.yj3;
import defpackage.yk0;
import defpackage.zg0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class WrappedComposition implements pk0, k32, cl0 {
    private h32 addedToLifecycle;
    private boolean disposed;
    private ne1 lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m56x91a61cbf();
    private final pk0 original;
    private final AndroidComposeView owner;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements le1 {
        final /* synthetic */ ne1 $content;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00001 extends ww1 implements ne1 {
            final /* synthetic */ ne1 $content;
            final /* synthetic */ WrappedComposition this$0;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ww1 implements ne1 {
                final /* synthetic */ ne1 $content;
                final /* synthetic */ WrappedComposition this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(WrappedComposition wrappedComposition, ne1 ne1Var) {
                    super(2);
                    this.this$0 = wrappedComposition;
                    this.$content = ne1Var;
                }

                @Override // defpackage.ne1
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((ck0) obj, ((Number) obj2).intValue());
                    return w84.a;
                }

                public final void invoke(ck0 ck0Var, int i) {
                    kk0 kk0Var = (kk0) ck0Var;
                    if (kk0Var.S(i & 1, (i & 3) != 2)) {
                        AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(this.this$0.getOwner(), this.$content, kk0Var, 0);
                    } else {
                        kk0Var.V();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(WrappedComposition wrappedComposition, ne1 ne1Var) {
                super(2);
                this.this$0 = wrappedComposition;
                this.$content = ne1Var;
            }

            @Override // defpackage.ne1
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ck0) obj, ((Number) obj2).intValue());
                return w84.a;
            }

            public final void invoke(ck0 ck0Var, int i) {
                kk0 kk0Var = (kk0) ck0Var;
                if (!kk0Var.S(i & 1, (i & 3) != 2)) {
                    kk0Var.V();
                    return;
                }
                Object tag = this.this$0.getOwner().getTag(R.id.inspection_slot_table_set);
                Set set = (!(tag instanceof Set) || ((tag instanceof gu1) && !(tag instanceof lu1))) ? null : (Set) tag;
                if (set == null) {
                    Object parent = this.this$0.getOwner().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                    set = (!(tag2 instanceof Set) || ((tag2 instanceof gu1) && !(tag2 instanceof lu1))) ? null : (Set) tag2;
                }
                if (set != null) {
                    sk0 sk0Var = kk0Var.Q;
                    if (sk0Var == null) {
                        sk0Var = new sk0(kk0Var.g);
                        kk0Var.Q = sk0Var;
                    }
                    set.add(sk0Var);
                    kk0Var.p = true;
                    kk0Var.B = true;
                    kk0Var.c.d();
                    kk0Var.G.d();
                    bk3 bk3Var = kk0Var.H;
                    yj3 yj3Var = bk3Var.a;
                    bk3Var.e = yj3Var.r;
                    bk3Var.f = yj3Var.s;
                }
                AndroidComposeView owner = this.this$0.getOwner();
                boolean zJ = kk0Var.j(this.this$0);
                WrappedComposition wrappedComposition = this.this$0;
                Object objP = kk0Var.P();
                if (zJ || objP == Composer$Companion.getEmpty()) {
                    objP = new WrappedComposition$setContent$1$1$1$1(wrappedComposition, null);
                    kk0Var.l0(objP);
                }
                r11.LaunchedEffect(owner, (ne1) objP, kk0Var, 0);
                AndroidComposeView owner2 = this.this$0.getOwner();
                boolean zJ2 = kk0Var.j(this.this$0);
                WrappedComposition wrappedComposition2 = this.this$0;
                Object objP2 = kk0Var.P();
                if (zJ2 || objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new WrappedComposition$setContent$1$1$2$1(wrappedComposition2, null);
                    kk0Var.l0(objP2);
                }
                r11.LaunchedEffect(owner2, (ne1) objP2, kk0Var, 0);
                yk0.CompositionLocalProvider(vp1.a.c(set), zg0.rememberComposableLambda(-1193460702, true, new AnonymousClass3(this.this$0, this.$content), kk0Var, 54), kk0Var, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ne1 ne1Var) {
            super(1);
            this.$content = ne1Var;
        }

        @Override // defpackage.le1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AndroidComposeView.ViewTreeOwners) obj);
            return w84.a;
        }

        public final void invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
            if (WrappedComposition.this.disposed) {
                return;
            }
            p32 p32VarH = viewTreeOwners.getLifecycleOwner().h();
            WrappedComposition.this.lastContent = this.$content;
            if (WrappedComposition.this.addedToLifecycle == null) {
                WrappedComposition.this.addedToLifecycle = p32VarH;
                p32VarH.a(WrappedComposition.this);
            } else if (p32VarH.c.compareTo(g32.h) >= 0) {
                WrappedComposition.this.getOriginal().setContent(new yg0(-2000640158, new C00001(WrappedComposition.this, this.$content), true));
            }
        }
    }

    public WrappedComposition(AndroidComposeView androidComposeView, pk0 pk0Var) {
        this.owner = androidComposeView;
        this.original = pk0Var;
    }

    @Override // defpackage.pk0
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            h32 h32Var = this.addedToLifecycle;
            if (h32Var != null) {
                h32Var.b(this);
            }
        }
        this.original.dispose();
    }

    @Override // defpackage.cl0
    public <T> T getCompositionService(bl0 bl0Var) {
        pk0 pk0Var = this.original;
        cl0 cl0Var = pk0Var instanceof cl0 ? (cl0) pk0Var : null;
        if (cl0Var != null) {
            return (T) cl0Var.getCompositionService(bl0Var);
        }
        return null;
    }

    @Override // defpackage.pk0
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    public final pk0 getOriginal() {
        return this.original;
    }

    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // defpackage.pk0
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override // defpackage.k32
    public void onStateChanged(n32 n32Var, f32 f32Var) {
        if (f32Var == f32.ON_DESTROY) {
            dispose();
        } else {
            if (f32Var != f32.ON_CREATE || this.disposed) {
                return;
            }
            setContent(this.lastContent);
        }
    }

    @Override // defpackage.pk0
    public void setContent(ne1 ne1Var) {
        this.owner.setOnViewTreeOwnersAvailable(new AnonymousClass1(ne1Var));
    }
}
