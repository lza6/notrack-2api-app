package androidx.compose.ui.viewinterop;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ia1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class FocusGroupPropertiesElement extends tf2 {
    public static final FocusGroupPropertiesElement c = new FocusGroupPropertiesElement();

    private FocusGroupPropertiesElement() {
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new ia1();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return -1929324230;
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("FocusGroupProperties");
    }

    @Override // defpackage.tf2
    public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
    }
}
