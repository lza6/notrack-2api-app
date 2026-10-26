package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.b12;
import defpackage.j64;
import defpackage.kr1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends tf2 {
    public final b12 c;

    public TraversablePrefetchStateModifierElement(b12 b12Var) {
        this.c = b12Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        j64 j64Var = new j64();
        j64Var.c = this.c;
        return j64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && kr1.n(this.c, ((TraversablePrefetchStateModifierElement) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("traversablePrefetchState");
        inspectorInfo.setValue(this.c);
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((j64) of2Var).c = this.c;
    }
}
