package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class lh4 {
    public static final c a(c cVar) {
        return b.a(cVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new lb4(1, 27) : InspectableValueKt.getNoInspectorInfo(), new gh4(3));
    }

    public abstract pn4 b(oo4 oo4Var);

    public abstract tn4 c(oo4 oo4Var);

    public abstract void d(tn4 tn4Var, tn4 tn4Var2);

    public abstract void e(tn4 tn4Var, Thread thread);

    public abstract boolean f(oo4 oo4Var, pn4 pn4Var, pn4 pn4Var2);

    public abstract boolean g(un4 un4Var, Object obj, Object obj2);

    public abstract boolean h(un4 un4Var, tn4 tn4Var, tn4 tn4Var2);
}
