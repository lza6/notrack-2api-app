package defpackage;

import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class jh4 extends ww1 implements le1 {
    public static final jh4 d = new jh4(1, 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh4(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                ((InspectorInfo) obj).setName("systemBarsPadding");
                break;
            default:
                break;
        }
        return w84Var;
    }
}
