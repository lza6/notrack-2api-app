package androidx.compose.ui.platform;

import defpackage.gg1;
import defpackage.le1;
import defpackage.ne1;
import defpackage.tz0;
import defpackage.w84;
import defpackage.ww1;
import defpackage.y00;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayerOwnerLayer$recordLambda$1 extends ww1 implements le1 {
    final /* synthetic */ GraphicsLayerOwnerLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayerOwnerLayer$recordLambda$1(GraphicsLayerOwnerLayer graphicsLayerOwnerLayer) {
        super(1);
        this.this$0 = graphicsLayerOwnerLayer;
    }

    @Override // defpackage.le1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((tz0) obj);
        return w84.a;
    }

    public final void invoke(tz0 tz0Var) {
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
        y00 y00VarY = tz0Var.A().y();
        ne1 ne1Var = graphicsLayerOwnerLayer.drawBlock;
        if (ne1Var != null) {
            ne1Var.invoke(y00VarY, (gg1) tz0Var.A().h);
        }
    }
}
