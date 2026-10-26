package defpackage;

import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class mn2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn2(float f, float f2, int i) {
        super(1);
        this.c = i;
        this.d = f;
        this.h = f2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        float f = this.h;
        float f2 = this.d;
        switch (i) {
            case 0:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("offset");
                fq2.l(f2, inspectorInfo.getProperties(), "x", inspectorInfo).set("y", new rx0(f));
                break;
            case 1:
                InspectorInfo inspectorInfo2 = (InspectorInfo) obj;
                inspectorInfo2.setName("padding");
                fq2.l(f2, inspectorInfo2.getProperties(), "horizontal", inspectorInfo2).set("vertical", new rx0(f));
                break;
            case 2:
                InspectorInfo inspectorInfo3 = (InspectorInfo) obj;
                inspectorInfo3.setName("heightIn");
                fq2.l(f2, inspectorInfo3.getProperties(), "min", inspectorInfo3).set("max", new rx0(f));
                break;
            case 3:
                InspectorInfo inspectorInfo4 = (InspectorInfo) obj;
                inspectorInfo4.setName("size");
                fq2.l(f2, inspectorInfo4.getProperties(), "width", inspectorInfo4).set("height", new rx0(f));
                break;
            default:
                InspectorInfo inspectorInfo5 = (InspectorInfo) obj;
                inspectorInfo5.setName("widthIn");
                fq2.l(f2, inspectorInfo5.getProperties(), "min", inspectorInfo5).set("max", new rx0(f));
                break;
        }
        return w84Var;
    }
}
