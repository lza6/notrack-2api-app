package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l53 {
    public final tk1 a;
    public final String b;
    public final th1 c;
    public final av1 d;
    public final Map e;
    public pz f;

    public l53(tk1 tk1Var, String str, th1 th1Var, av1 av1Var, Map map) {
        tk1Var.getClass();
        str.getClass();
        this.a = tk1Var;
        this.b = str;
        this.c = th1Var;
        this.d = av1Var;
        this.e = map;
    }

    public final vu a() {
        vu vuVar = new vu();
        vuVar.m = new LinkedHashMap();
        vuVar.c = this.a;
        vuVar.d = this.b;
        vuVar.l = this.d;
        Map map = this.e;
        vuVar.m = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        vuVar.h = this.c.g();
        return vuVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        th1 th1Var = this.c;
        if (th1Var.size() != 0) {
            sb.append(", headers=[");
            Iterator it = th1Var.iterator();
            int i = 0;
            while (true) {
                a0 a0Var = (a0) it;
                if (!a0Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = a0Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    kr1.m0();
                    throw null;
                }
                ps2 ps2Var = (ps2) next;
                String str = (String) ps2Var.c;
                String str2 = (String) ps2Var.d;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
