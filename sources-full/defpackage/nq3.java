package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nq3 implements PointerInputEventHandler, te1 {
    public final /* synthetic */ ne1 a;

    public nq3(ne1 ne1Var) {
        this.a = ne1Var;
    }

    @Override // defpackage.te1
    public final se1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof te1)) {
            return false;
        }
        return kr1.n(this.a, ((te1) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(ix2 ix2Var, so0 so0Var) {
        return this.a.invoke(ix2Var, so0Var);
    }
}
