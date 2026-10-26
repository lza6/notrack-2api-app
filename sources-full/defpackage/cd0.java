package defpackage;

import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class cd0 extends ww1 implements le1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd0(gh2 gh2Var, rw3 rw3Var, boolean z) {
        super(1);
        this.h = rw3Var;
        this.l = gh2Var;
        this.d = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd0(boolean z, String str, je1 je1Var) {
        super(1);
        this.d = z;
        this.h = str;
        this.l = je1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        boolean z = this.d;
        Object obj2 = this.l;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", (String) obj3);
                inspectorInfo.getProperties().set("role", null);
                inspectorInfo.getProperties().set("onClick", (je1) obj2);
                break;
            default:
                InspectorInfo inspectorInfo2 = (InspectorInfo) obj;
                inspectorInfo2.setName("textFieldScrollable");
                inspectorInfo2.getProperties().set("scrollerPosition", (rw3) obj3);
                inspectorInfo2.getProperties().set("interactionSource", (gh2) obj2);
                inspectorInfo2.getProperties().set("enabled", Boolean.valueOf(z));
                break;
        }
        return w84Var;
    }
}
