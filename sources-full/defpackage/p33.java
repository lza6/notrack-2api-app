package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class p33 implements cg2, xb4 {
    public long c;
    public long d;
    public final Object h;
    public final Object l;

    public p33(q33 q33Var, long j) {
        this.l = q33Var;
        this.h = new LinkedHashMap(0, 0.75f, true);
        this.c = j;
        if (j > 0) {
            return;
        }
        u41.k("maxSize <= 0");
        throw null;
    }

    public p33(rd3 rd3Var, qe3 qe3Var, long j) {
        this.h = rd3Var;
        this.l = qe3Var;
        this.d = j;
        this.c = 0L;
    }

    public p33(zb4 zb4Var, k53 k53Var) {
        this.h = zb4Var;
        this.l = k53Var;
        this.c = ((long) (zb4Var.t() + zb4Var.k())) * 1000000;
        this.d = 0L;
    }

    @Override // defpackage.xb4
    public boolean a() {
        return true;
    }

    @Override // defpackage.xb4
    public long b(cg cgVar, cg cgVar2, cg cgVar3) {
        return LongCompanionObject.MAX_VALUE;
    }

    public void c(Object obj, Object obj2, o33 o33Var) {
        o33 o33Var2 = (o33) obj2;
        ((kn4) ((q33) this.l).b).o((cc2) obj, o33Var2.a, o33Var2.b, o33Var2.c);
    }

    @Override // defpackage.cg2
    public void d() {
        kd3 kd3Var = ((qe3) this.l).h;
        if (kd3Var != null) {
            kd3Var.invoke();
        }
    }

    @Override // defpackage.cg2
    public boolean e(long j, gd3 gd3Var) {
        cx1 cx1Var = (cx1) ((rd3) this.h).invoke();
        if (cx1Var == null) {
            return false;
        }
        qe3 qe3Var = (qe3) this.l;
        long j2 = this.d;
        if (!cx1Var.z()) {
            return false;
        }
        gc gcVar = qe3Var.f;
        if (gcVar != null) {
            gcVar.b(Boolean.FALSE, cx1Var, new ln2(j), gd3Var);
        }
        this.c = j;
        return re3.a(qe3Var, j2);
    }

    public long f() {
        if (this.d == -1) {
            long j = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.h).entrySet()) {
                j += j(entry.getKey(), entry.getValue());
            }
            this.d = j;
        }
        return this.d;
    }

    @Override // defpackage.cg2
    public boolean g(long j, gd3 gd3Var) {
        cx1 cx1Var = (cx1) ((rd3) this.h).invoke();
        if (cx1Var == null) {
            return true;
        }
        qe3 qe3Var = (qe3) this.l;
        long j2 = this.d;
        if (!cx1Var.z() || !re3.a(qe3Var, j2)) {
            return false;
        }
        if (!qe3Var.b(cx1Var, j, this.c, gd3Var, false)) {
            return true;
        }
        this.c = j;
        return true;
    }

    public long h(long j) {
        long j2 = this.d;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.c;
        long j5 = j3 / j4;
        return (((k53) this.l) == k53.c || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public cg i(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? ((zb4) this.h).s(j4 - j2, cgVar, cgVar3, cgVar2) : cgVar2;
    }

    public long j(Object obj, Object obj2) throws Exception {
        try {
            long j = ((o33) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.d = -1L;
            throw e;
        }
    }

    public void l(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
        while (f() > j) {
            if (linkedHashMap.isEmpty()) {
                if (f() == 0) {
                    return;
                }
                u41.r("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) ke0.x0(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.d = f() - j(key, value);
                c(key, value, null);
            }
        }
    }

    @Override // defpackage.xb4
    public cg s(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        return ((zb4) this.h).s(h(j), cgVar, cgVar2, i(j, cgVar, cgVar3, cgVar2));
    }

    @Override // defpackage.xb4
    public cg u(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        return ((zb4) this.h).u(h(j), cgVar, cgVar2, i(j, cgVar, cgVar3, cgVar2));
    }
}
