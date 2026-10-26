package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class x51 {
    public static final y51 a = new y51(new p54((j61) null, (hi3) null, (t20) null, (na3) null, (LinkedHashMap) null, 63));
    public static final y51 b = new y51(new p54((j61) null, (hi3) null, (t20) null, (na3) null, (LinkedHashMap) null, 47));

    public final y51 a(x51 x51Var) {
        j61 j61Var = ((y51) x51Var).c.a;
        if (j61Var == null) {
            j61Var = ((y51) this).c.a;
        }
        p54 p54Var = ((y51) x51Var).c;
        hi3 hi3Var = p54Var.b;
        if (hi3Var == null) {
            hi3Var = ((y51) this).c.b;
        }
        t20 t20Var = p54Var.c;
        if (t20Var == null) {
            t20Var = ((y51) this).c.c;
        }
        na3 na3Var = p54Var.d;
        if (na3Var == null) {
            na3Var = ((y51) this).c.d;
        }
        boolean z = p54Var.e || ((y51) this).c.e;
        Map map = ((y51) this).c.f;
        Map map2 = p54Var.f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new y51(new p54(j61Var, hi3Var, t20Var, na3Var, z, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x51) && ((y51) ((x51) obj)).c.equals(((y51) this).c);
    }

    public final int hashCode() {
        return ((y51) this).c.hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "ExitTransition.None";
        }
        if (equals(b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        p54 p54Var = ((y51) this).c;
        j61 j61Var = p54Var.a;
        sb.append(j61Var != null ? j61Var.toString() : null);
        sb.append(",\nSlide - ");
        hi3 hi3Var = p54Var.b;
        sb.append(hi3Var != null ? hi3Var.toString() : null);
        sb.append(",\nShrink - ");
        t20 t20Var = p54Var.c;
        sb.append(t20Var != null ? t20Var.toString() : null);
        sb.append(",\nScale - ");
        na3 na3Var = p54Var.d;
        sb.append(na3Var != null ? na3Var.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(p54Var.e);
        return sb.toString();
    }
}
