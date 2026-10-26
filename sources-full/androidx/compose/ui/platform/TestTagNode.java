package androidx.compose.ui.platform;

import defpackage.cf3;
import defpackage.ef3;
import defpackage.ff3;
import defpackage.gf3;
import defpackage.of2;
import defpackage.pu1;
import defpackage.xe3;

/* JADX INFO: loaded from: classes.dex */
final class TestTagNode extends of2 implements xe3 {
    private String tag;

    public TestTagNode(String str) {
        this.tag = str;
    }

    @Override // defpackage.xe3
    public void applySemantics(gf3 gf3Var) {
        String str = this.tag;
        pu1[] pu1VarArr = ef3.a;
        ff3 ff3Var = cf3.x;
        pu1 pu1Var = ef3.a[13];
        ff3Var.a(gf3Var, str);
    }

    @Override // defpackage.xe3
    public /* bridge */ /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.xe3
    public /* bridge */ /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    public final String getTag() {
        return this.tag;
    }

    @Override // defpackage.iu0
    public /* bridge */ /* synthetic */ void onDensityChange() {
    }

    @Override // defpackage.iu0
    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
    }

    public final void setTag(String str) {
        this.tag = str;
    }
}
