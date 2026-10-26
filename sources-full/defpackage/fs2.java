package defpackage;

import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class fs2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float h;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs2(float f, float f2, float f3, float f4, int i) {
        super(1);
        this.c = i;
        this.d = f;
        this.h = f2;
        this.l = f3;
        this.m = f4;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        float f = this.m;
        float f2 = this.l;
        float f3 = this.h;
        float f4 = this.d;
        switch (i) {
            case 0:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("padding");
                fq2.l(f2, fq2.l(f3, fq2.l(f4, inspectorInfo.getProperties(), "start", inspectorInfo), "top", inspectorInfo), "end", inspectorInfo).set("bottom", new rx0(f));
                break;
            case 1:
                InspectorInfo inspectorInfo2 = (InspectorInfo) obj;
                inspectorInfo2.setName("requiredSizeIn");
                fq2.l(f2, fq2.l(f3, fq2.l(f4, inspectorInfo2.getProperties(), "minWidth", inspectorInfo2), "minHeight", inspectorInfo2), "maxWidth", inspectorInfo2).set("maxHeight", new rx0(f));
                break;
            default:
                InspectorInfo inspectorInfo3 = (InspectorInfo) obj;
                inspectorInfo3.setName("sizeIn");
                fq2.l(f2, fq2.l(f3, fq2.l(f4, inspectorInfo3.getProperties(), "minWidth", inspectorInfo3), "minHeight", inspectorInfo3), "maxWidth", inspectorInfo3).set("maxHeight", new rx0(f));
                break;
        }
        return w84Var;
    }
}
