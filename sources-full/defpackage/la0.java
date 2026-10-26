package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class la0 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ mi2 b;
    public final /* synthetic */ mi2 c;

    public la0(boolean z, mi2 mi2Var, mi2 mi2Var2) {
        this.a = z;
        this.b = mi2Var;
        this.c = mi2Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ix2 ix2Var, so0 so0Var) {
        final boolean z = this.a;
        final mi2 mi2Var = this.b;
        final mi2 mi2Var2 = this.c;
        Object objF = os3.f(ix2Var, null, null, new le1() { // from class: ka0
            @Override // defpackage.le1
            public final Object invoke(Object obj) {
                mi2 mi2Var3 = mi2Var;
                if (((String) mi2Var3.getValue()) != null && !z) {
                    mi2Var3.setValue(null);
                }
                mi2 mi2Var4 = mi2Var2;
                if (((Boolean) mi2Var4.getValue()).booleanValue()) {
                    mi2Var4.setValue(Boolean.FALSE);
                }
                return w84.a;
            }
        }, so0Var, 7);
        return objF == hq0.c ? objF : w84.a;
    }
}
