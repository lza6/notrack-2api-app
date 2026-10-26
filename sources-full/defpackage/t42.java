package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t42 extends u {
    public final qu1 a;
    public final s42 b;

    public t42(qu1 qu1Var) {
        lo3 lo3Var = lo3.a;
        this.a = qu1Var;
        this.b = new s42(lo3.b, qu1Var.getDescriptor());
    }

    @Override // defpackage.u
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // defpackage.u
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // defpackage.u
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        lo3 lo3Var = lo3.a;
        s42 s42Var = this.b;
        Object objV = nk0Var.v(s42Var, i, lo3Var, null);
        int iH = nk0Var.h(s42Var);
        if (iH != i + 1) {
            u41.h(ud2.l(i, iH, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objV);
        qu1 qu1Var = this.a;
        map.put(objV, (!zContainsKey || (qu1Var.getDescriptor().c() instanceof cz2)) ? nk0Var.v(s42Var, iH, qu1Var, null) : nk0Var.v(s42Var, iH, qu1Var, y92.R(objV, map)));
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.u
    public final Object h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        d(obj);
        s42 s42Var = this.b;
        s42Var.getClass();
        do3 do3VarA = do3Var.a(s42Var);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            do3VarA.q(s42Var, i, lo3.a, key);
            i += 2;
            do3VarA.q(s42Var, i2, this.a, value);
        }
        do3VarA.v(s42Var);
    }
}
