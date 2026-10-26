package androidx.compose.ui.platform;

import android.graphics.Matrix;
import defpackage.ne1;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class RenderNodeLayer$Companion$getMatrix$1 extends ww1 implements ne1 {
    public static final RenderNodeLayer$Companion$getMatrix$1 INSTANCE = new RenderNodeLayer$Companion$getMatrix$1();

    public RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // defpackage.ne1
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((DeviceRenderNode) obj, (Matrix) obj2);
        return w84.a;
    }

    public final void invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
        deviceRenderNode.getMatrix(matrix);
    }
}
