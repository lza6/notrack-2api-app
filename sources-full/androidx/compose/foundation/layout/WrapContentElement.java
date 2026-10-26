package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dj4;
import defpackage.fw0;
import defpackage.ne1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends tf2 {
    public static final /* synthetic */ int m = 0;
    public final fw0 c;
    public final ne1 d;
    public final Object h;
    public final String l;

    public WrapContentElement(fw0 fw0Var, ne1 ne1Var, Object obj, String str) {
        this.c = fw0Var;
        this.d = ne1Var;
        this.h = obj;
        this.l = str;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        dj4 dj4Var = new dj4();
        dj4Var.c = this.c;
        dj4Var.d = this.d;
        return dj4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.c == wrapContentElement.c && this.h.equals(wrapContentElement.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ud2.k(this.c.hashCode() * 31, 31, false);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.l);
        inspectorInfo.getProperties().set("align", this.h);
        inspectorInfo.getProperties().set("unbounded", Boolean.FALSE);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        dj4 dj4Var = (dj4) of2Var;
        dj4Var.c = this.c;
        dj4Var.d = this.d;
    }
}
