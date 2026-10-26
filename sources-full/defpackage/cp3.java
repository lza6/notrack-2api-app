package defpackage;

import androidx.compose.ui.input.pointer.a;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public final class cp3 extends wi1 {
    @Override // defpackage.i64
    public final /* bridge */ /* synthetic */ Object o() {
        return "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // defpackage.wi1
    public final void w0(a aVar) {
        cx2 cx2Var = (cx2) gm4.t(this, CompositionLocalsKt.getLocalPointerIconService());
        if (cx2Var != null) {
            cx2Var.setStylusHoverIcon(aVar);
        }
    }

    @Override // defpackage.wi1
    public final boolean y0(int i) {
        return i == 3 || i == 4;
    }
}
