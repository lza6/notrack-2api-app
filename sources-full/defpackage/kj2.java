package defpackage;

import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class kj2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj2(float f, int i) {
        super(1);
        this.c = i;
        this.d = f;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        float f = this.d;
        switch (i) {
            case 0:
                gz0 gz0Var = (gz0) obj;
                gz0Var.a(i01.c, f);
                gz0Var.a(i01.d, 0.0f);
                break;
            case 1:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(new rx0(f));
                break;
            case 2:
                InspectorInfo inspectorInfo2 = (InspectorInfo) obj;
                inspectorInfo2.setName("height");
                inspectorInfo2.setValue(new rx0(f));
                break;
            case 3:
                InspectorInfo inspectorInfo3 = (InspectorInfo) obj;
                inspectorInfo3.setName("size");
                inspectorInfo3.setValue(new rx0(f));
                break;
            default:
                InspectorInfo inspectorInfo4 = (InspectorInfo) obj;
                inspectorInfo4.setName("width");
                inspectorInfo4.setValue(new rx0(f));
                break;
        }
        return w84Var;
    }
}
