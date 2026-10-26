package androidx.compose.ui.platform;

import androidx.compose.ui.c;
import defpackage.kr1;
import defpackage.le1;
import defpackage.ne1;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class TestTagElement extends tf2 {
    private final String tag;

    public TestTagElement(String str) {
        this.tag = str;
    }

    @Override // defpackage.nf2, androidx.compose.ui.c
    public /* bridge */ /* synthetic */ boolean all(le1 le1Var) {
        return super.all(le1Var);
    }

    public boolean any(le1 le1Var) {
        return ((Boolean) le1Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.tf2
    public TestTagNode create() {
        return new TestTagNode(this.tag);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestTagElement) {
            return kr1.n(this.tag, ((TestTagElement) obj).tag);
        }
        return false;
    }

    @Override // defpackage.nf2, androidx.compose.ui.c
    public Object foldIn(Object obj, ne1 ne1Var) {
        return ne1Var.invoke(obj, this);
    }

    public Object foldOut(Object obj, ne1 ne1Var) {
        return ne1Var.invoke(this, obj);
    }

    public int hashCode() {
        return this.tag.hashCode();
    }

    @Override // defpackage.tf2
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("testTag");
        inspectorInfo.getProperties().set("tag", this.tag);
    }

    @Override // androidx.compose.ui.c
    public /* bridge */ /* synthetic */ c then(c cVar) {
        return super.then(cVar);
    }

    @Override // defpackage.tf2
    public void update(TestTagNode testTagNode) {
        testTagNode.setTag(this.tag);
    }
}
