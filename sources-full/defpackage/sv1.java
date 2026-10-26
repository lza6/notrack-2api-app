package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class sv1 {
    public Object a;
    public Object b;
    public final Object c;

    public sv1(WorkDatabase workDatabase) {
        workDatabase.getClass();
        this.a = workDatabase;
        this.b = new AtomicBoolean(false);
        this.c = new yq3(new i43(6, this));
    }

    public sv1(Class cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.a = uuidRandomUUID;
        String string = ((UUID) this.a).toString();
        string.getClass();
        this.b = new hi4(string, 0, cls.getName(), (String) null, (or0) null, (or0) null, 0L, 0L, 0L, (tm0) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, 16777210);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(y92.S(1));
        linkedHashSet.add(strArr[0]);
        this.c = linkedHashSet;
    }

    public sv1(Class cls, a5... a5VarArr) {
        this.a = cls;
        HashMap map = new HashMap();
        for (a5 a5Var : a5VarArr) {
            boolean zContainsKey = map.containsKey(a5Var.a);
            Class cls2 = a5Var.a;
            if (zContainsKey) {
                u41.k(ud2.n(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                throw null;
            }
            map.put(cls2, a5Var);
        }
        if (a5VarArr.length > 0) {
            this.b = a5VarArr[0].a;
        } else {
            this.b = Void.class;
        }
        this.c = Collections.unmodifiableMap(map);
    }

    public he1 a() {
        WorkDatabase workDatabase = (WorkDatabase) this.a;
        workDatabase.a();
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            return (he1) ((yq3) this.c).getValue();
        }
        String strD = d();
        workDatabase.getClass();
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().J().h(strD);
    }

    public fi4 b() {
        fi4 fi4VarC = c();
        tm0 tm0Var = ((hi4) this.b).j;
        boolean z = !tm0Var.i.isEmpty() || tm0Var.e || tm0Var.c || tm0Var.d;
        hi4 hi4Var = (hi4) this.b;
        if (hi4Var.q) {
            if (z) {
                u41.k("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (hi4Var.g > 0) {
                u41.k("Expedited jobs cannot be delayed");
                return null;
            }
        }
        if (hi4Var.x == null) {
            List listM0 = mo3.M0(hi4Var.c, new String[]{"."});
            String strT0 = listM0.size() == 1 ? (String) listM0.get(0) : (String) ke0.E0(listM0);
            if (strT0.length() > 127) {
                strT0 = mo3.T0(127, strT0);
            }
            hi4Var.x = strT0;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.a = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        hi4 hi4Var2 = (hi4) this.b;
        hi4Var2.getClass();
        this.b = new hi4(string, hi4Var2.b, hi4Var2.c, hi4Var2.d, new or0(hi4Var2.e), new or0(hi4Var2.f), hi4Var2.g, hi4Var2.h, hi4Var2.i, new tm0(hi4Var2.j), hi4Var2.k, hi4Var2.l, hi4Var2.m, hi4Var2.n, hi4Var2.o, hi4Var2.p, hi4Var2.q, hi4Var2.r, hi4Var2.s, hi4Var2.u, hi4Var2.v, hi4Var2.w, hi4Var2.x, 524288);
        return fi4VarC;
    }

    public abstract fi4 c();

    public abstract String d();

    public int e() {
        return 1;
    }

    public abstract String f();

    public abstract qq4 g();

    public abstract wu1 h();

    public abstract g0 i(mz mzVar);

    public void j(he1 he1Var) {
        he1Var.getClass();
        if (he1Var == ((he1) ((yq3) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public abstract void k(g0 g0Var);
}
