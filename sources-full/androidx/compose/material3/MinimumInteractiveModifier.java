package androidx.compose.material3;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.je2;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
public final class MinimumInteractiveModifier extends tf2 {
    public static final MinimumInteractiveModifier c = new MinimumInteractiveModifier();

    private MinimumInteractiveModifier() {
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new je2();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("minimumInteractiveComponentSize");
        inspectorInfo.getProperties().set("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
    }

    @Override // defpackage.tf2
    public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
    }
}
