package defpackage;

import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ru3 extends ww1 implements le1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ uq1 h;
    public final /* synthetic */ bu3 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru3(float f, float f2, uq1 uq1Var, bu3 bu3Var, boolean z, boolean z2) {
        super(1);
        this.c = z;
        this.d = z2;
        this.h = uq1Var;
        this.l = bu3Var;
        this.m = f;
        this.n = f2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        InspectorInfo inspectorInfo = (InspectorInfo) obj;
        inspectorInfo.setName("indicatorLine");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.c));
        inspectorInfo.getProperties().set("isError", Boolean.valueOf(this.d));
        inspectorInfo.getProperties().set("interactionSource", this.h);
        inspectorInfo.getProperties().set("colors", this.l);
        fq2.l(this.m, inspectorInfo.getProperties(), "focusedIndicatorLineThickness", inspectorInfo).set("unfocusedIndicatorLineThickness", new rx0(this.n));
        return w84.a;
    }
}
