package androidx.compose.ui.viewinterop;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.eb1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class FocusTargetPropertiesElement extends tf2 {
    public static final FocusTargetPropertiesElement c = new FocusTargetPropertiesElement();

    private FocusTargetPropertiesElement() {
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new eb1();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return -659549572;
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("FocusTargetProperties");
    }

    @Override // defpackage.tf2
    public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
    }
}
