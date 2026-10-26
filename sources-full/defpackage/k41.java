package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class k41 {
    public static final l41 a = new l41(new p54((j61) null, (hi3) null, (t20) null, (na3) null, (LinkedHashMap) null, 63));

    public final l41 a(k41 k41Var) {
        j61 j61Var = ((l41) k41Var).b.a;
        if (j61Var == null) {
            j61Var = ((l41) this).b.a;
        }
        p54 p54Var = ((l41) k41Var).b;
        hi3 hi3Var = p54Var.b;
        if (hi3Var == null) {
            hi3Var = ((l41) this).b.b;
        }
        t20 t20Var = p54Var.c;
        if (t20Var == null) {
            t20Var = ((l41) this).b.c;
        }
        na3 na3Var = p54Var.d;
        if (na3Var == null) {
            na3Var = ((l41) this).b.d;
        }
        Map map = ((l41) this).b.f;
        Map map2 = p54Var.f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new l41(new p54(j61Var, hi3Var, t20Var, na3Var, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k41) && ((l41) ((k41) obj)).b.equals(((l41) this).b);
    }

    public final int hashCode() {
        return ((l41) this).b.hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        p54 p54Var = ((l41) this).b;
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
        return sb.toString();
    }
}
