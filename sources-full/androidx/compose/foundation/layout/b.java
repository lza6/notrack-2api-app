package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.e8;
import defpackage.lb4;
import defpackage.yt;
import defpackage.zw;

/* JADX INFO: loaded from: classes.dex */
public final class b implements zw {
    public static final b a = new b();

    @Override // defpackage.zw
    public final androidx.compose.ui.c a(androidx.compose.ui.c cVar, yt ytVar) {
        return cVar.then(new BoxChildDataElement(ytVar, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new e8(7, ytVar) : InspectableValueKt.getNoInspectorInfo()));
    }

    public final androidx.compose.ui.c b(androidx.compose.ui.c cVar) {
        return new BoxChildDataElement(Alignment$Companion.getCenter(), true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new lb4(1, 16) : InspectableValueKt.getNoInspectorInfo());
    }
}
