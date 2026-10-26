package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g61 {
    public static final g61 b = new g61(av1.L(new LinkedHashMap()));
    public final Map a;

    public g61(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g61) && kr1.n(this.a, ((g61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.a + ')';
    }
}
