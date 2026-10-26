package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j02 extends of2 implements rz0 {
    public b c;

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        ArrayList arrayList = this.c.h;
        if (arrayList.size() <= 0) {
            wx1Var.a();
        } else {
            fq2.y(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j02) && kr1.n(this.c, ((j02) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.of2
    public final void onAttach() {
        this.c.getClass();
    }

    @Override // defpackage.of2
    public final void onDetach() {
        b bVar = this.c;
        bVar.d();
        bVar.b = null;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.c + ')';
    }
}
