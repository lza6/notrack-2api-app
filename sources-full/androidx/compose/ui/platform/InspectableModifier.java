package androidx.compose.ui.platform;

import androidx.compose.ui.c;
import defpackage.cv0;
import defpackage.le1;
import defpackage.ne1;
import defpackage.nf2;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final class InspectableModifier extends InspectorValueInfo implements nf2 {
    public static final int $stable = 0;
    private final End end;

    public final class End implements nf2 {
        public End() {
        }

        @Override // defpackage.nf2, androidx.compose.ui.c
        public /* bridge */ /* synthetic */ boolean all(le1 le1Var) {
            return super.all(le1Var);
        }

        public boolean any(le1 le1Var) {
            return ((Boolean) le1Var.invoke(this)).booleanValue();
        }

        @Override // defpackage.nf2, androidx.compose.ui.c
        public Object foldIn(Object obj, ne1 ne1Var) {
            return ne1Var.invoke(obj, this);
        }

        public Object foldOut(Object obj, ne1 ne1Var) {
            return ne1Var.invoke(this, obj);
        }

        @Override // androidx.compose.ui.c
        public /* bridge */ /* synthetic */ c then(c cVar) {
            return super.then(cVar);
        }
    }

    public InspectableModifier(le1 le1Var) {
        super(le1Var);
        this.end = new End();
    }

    @Override // defpackage.nf2, androidx.compose.ui.c
    public /* bridge */ /* synthetic */ boolean all(le1 le1Var) {
        return super.all(le1Var);
    }

    public boolean any(le1 le1Var) {
        return ((Boolean) le1Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.nf2, androidx.compose.ui.c
    public Object foldIn(Object obj, ne1 ne1Var) {
        return ne1Var.invoke(obj, this);
    }

    public Object foldOut(Object obj, ne1 ne1Var) {
        return ne1Var.invoke(this, obj);
    }

    public final End getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.c
    public /* bridge */ /* synthetic */ c then(c cVar) {
        return super.then(cVar);
    }
}
