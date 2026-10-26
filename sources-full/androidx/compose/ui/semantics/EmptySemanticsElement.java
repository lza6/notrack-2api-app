package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.d31;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
public final class EmptySemanticsElement extends tf2 {
    public final d31 c;

    public EmptySemanticsElement(d31 d31Var) {
        this.c = d31Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // defpackage.tf2
    public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
    }
}
