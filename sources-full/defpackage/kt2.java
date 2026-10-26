package defpackage;

import androidx.compose.ui.text.input.OffsetMapping$Companion;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class kt2 implements de4 {
    @Override // defpackage.de4
    public final f54 a(hg hgVar) {
        return new f54(new hg(to3.n0(hgVar.d.length(), String.valueOf(Typography.bullet))), OffsetMapping$Companion.getIdentity());
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kt2);
    }

    public final int hashCode() {
        return Character.hashCode(Typography.bullet);
    }
}
