package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q33 {
    public long a;
    public final Object b;
    public final Object c;

    public q33() {
        this.b = new fc4();
        this.c = new fc4();
    }

    public q33(long j, kn4 kn4Var) {
        this.a = j;
        this.b = kn4Var;
        this.c = new p33(this, j);
    }

    public void a(cc2 cc2Var, am1 am1Var, Map map, long j) {
        p33 p33Var = (p33) this.c;
        long j2 = p33Var.c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) p33Var.h;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(cc2Var);
            if (objRemove != null) {
                p33Var.d = p33Var.f() - p33Var.j(cc2Var, objRemove);
                p33Var.c(cc2Var, objRemove, null);
            }
            ((kn4) this.b).o(cc2Var, am1Var, map, j);
            return;
        }
        o33 o33Var = new o33(am1Var, map, j);
        Object objPut = linkedHashMap.put(cc2Var, o33Var);
        p33Var.d = p33Var.j(cc2Var, o33Var) + p33Var.f();
        if (objPut != null) {
            p33Var.d = p33Var.f() - p33Var.j(cc2Var, objPut);
            p33Var.c(cc2Var, objPut, o33Var);
        }
        p33Var.l(p33Var.c);
    }
}
