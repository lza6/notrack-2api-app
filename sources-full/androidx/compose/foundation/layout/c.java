package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.dx;
import defpackage.e8;
import defpackage.jp3;
import defpackage.kr1;
import defpackage.um0;
import defpackage.wu0;
import defpackage.yt;
import defpackage.zw;

/* JADX INFO: loaded from: classes.dex */
public final class c implements dx, zw {
    public final wu0 a;
    public final long b;

    public c(jp3 jp3Var, long j) {
        this.a = jp3Var;
        this.b = j;
    }

    @Override // defpackage.zw
    public final androidx.compose.ui.c a(androidx.compose.ui.c cVar, yt ytVar) {
        return cVar.then(new BoxChildDataElement(ytVar, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new e8(7, ytVar) : InspectableValueKt.getNoInspectorInfo()));
    }

    public final float b() {
        long j = this.b;
        if (!um0.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.q0(um0.h(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kr1.n(this.a, cVar.a) && um0.b(this.b, cVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) um0.l(this.b)) + ')';
    }
}
