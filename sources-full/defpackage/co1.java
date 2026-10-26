package defpackage;

import androidx.compose.ui.platform.InfiniteAnimationPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class co1 {
    public static final Object a(le1 le1Var, uo0 uo0Var) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) uo0Var.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? yo4.z(uo0Var.getContext()).withFrameNanos(le1Var, uo0Var) : infiniteAnimationPolicy.onInfiniteOperation(new bo1(le1Var, null), uo0Var);
    }
}
