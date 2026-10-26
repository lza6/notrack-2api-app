package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c93 implements vw0 {
    public final /* synthetic */ d93 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ g93 c;

    public c93(d93 d93Var, Object obj, g93 g93Var) {
        this.a = d93Var;
        this.b = obj;
        this.c = g93Var;
    }

    @Override // defpackage.vw0
    public final void dispose() {
        d93 d93Var = this.a;
        fi2 fi2Var = d93Var.b;
        Object obj = this.b;
        Object objJ = fi2Var.j(obj);
        g93 g93Var = this.c;
        if (objJ == g93Var) {
            Map map = d93Var.a;
            Map mapPerformSave = g93Var.performSave();
            if (mapPerformSave.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, mapPerformSave);
            }
        }
    }
}
