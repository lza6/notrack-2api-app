package androidx.compose.ui.platform;

import defpackage.le1;
import defpackage.ne1;
import defpackage.so0;
import defpackage.vp0;
import defpackage.wp0;
import defpackage.xp0;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
public interface InfiniteAnimationPolicy extends vp0 {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r, ne1 ne1Var) {
            return (R) y64.v(infiniteAnimationPolicy, r, ne1Var);
        }

        public static <E extends vp0> E get(InfiniteAnimationPolicy infiniteAnimationPolicy, wp0 wp0Var) {
            return (E) y64.w(infiniteAnimationPolicy, wp0Var);
        }

        @Deprecated
        public static wp0 getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.super.getKey();
        }

        public static xp0 minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, wp0 wp0Var) {
            return y64.H(infiniteAnimationPolicy, wp0Var);
        }

        public static xp0 plus(InfiniteAnimationPolicy infiniteAnimationPolicy, xp0 xp0Var) {
            return y64.I(infiniteAnimationPolicy, xp0Var);
        }
    }

    public static final class Key implements wp0 {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // defpackage.xp0
    /* synthetic */ Object fold(Object obj, ne1 ne1Var);

    @Override // defpackage.xp0
    /* synthetic */ vp0 get(wp0 wp0Var);

    @Override // defpackage.vp0
    default wp0 getKey() {
        return Key;
    }

    @Override // defpackage.xp0
    /* synthetic */ xp0 minusKey(wp0 wp0Var);

    <R> Object onInfiniteOperation(le1 le1Var, so0 so0Var);

    @Override // defpackage.xp0
    /* synthetic */ xp0 plus(xp0 xp0Var);
}
