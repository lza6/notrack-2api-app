package defpackage;

import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ir extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir(int i, long j, Object obj) {
        super(1);
        this.c = i;
        this.d = j;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(z22 z22Var, long j) {
        super(1);
        this.c = 1;
        this.h = z22Var;
        this.d = j;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("background");
                long j = this.d;
                inspectorInfo.setValue(new re0(j));
                inspectorInfo.getProperties().set("color", new re0(j));
                inspectorInfo.getProperties().set("shape", (rg3) obj2);
                break;
            case 1:
                tz0 tz0Var = (tz0) obj;
                z22 z22Var = (z22) obj2;
                if (((Boolean) z22Var.s.getValue()).booleanValue() || ((Boolean) z22Var.t.getValue()).booleanValue()) {
                    tz0.f(tz0Var, this.d, 0L, 0L, 0.0f, null, 126);
                }
                break;
            case 2:
                tz0.f((tz0) obj, this.d, 0L, 0L, py.w(((Number) ((gn3) obj2).getValue()).floatValue(), 0.0f, 1.0f), null, 118);
                break;
            default:
                tz0.f((tz0) obj, this.d, 0L, 0L, ((Number) ((je1) obj2).invoke()).floatValue(), null, 118);
                break;
        }
        return w84Var;
    }
}
