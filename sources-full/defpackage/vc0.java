package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vc0 implements tc0, eu1, cu1 {
    public static final Map d;
    public final Class c;

    static {
        List listU = kr1.U(je1.class, le1.class, ne1.class, oe1.class, pe1.class, wg0.class, qe1.class, re1.class, wg0.class, wg0.class, wg0.class, wg0.class, ke1.class, wg0.class, wg0.class, wg0.class, wg0.class, wg0.class, wg0.class, wg0.class, wg0.class, wg0.class, me1.class);
        ArrayList arrayList = new ArrayList(le0.q0(listU, 10));
        int i = 0;
        for (Object obj : listU) {
            int i2 = i + 1;
            if (i < 0) {
                kr1.m0();
                throw null;
            }
            arrayList.add(new ps2((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = y92.V(arrayList);
    }

    public vc0(Class cls) {
        cls.getClass();
        this.c = cls;
    }

    @Override // defpackage.tc0
    public final Class a() {
        return this.c;
    }

    public final boolean b(Object obj) {
        Class clsQ = this.c;
        clsQ.getClass();
        Map map = d;
        map.getClass();
        Integer num = (Integer) map.get(clsQ);
        if (num != null) {
            return y64.E(num.intValue(), obj);
        }
        if (clsQ.isPrimitive()) {
            clsQ = xp1.q(r43.a(clsQ));
        }
        return clsQ.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vc0) && xp1.q(this).equals(xp1.q((vc0) obj));
    }

    public final int hashCode() {
        return xp1.q(this).hashCode();
    }

    public final String toString() {
        return this.c + " (Kotlin reflection is not available)";
    }
}
