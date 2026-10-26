package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yk2 {
    public static final yk2 b = new yk2(y92.W(new LinkedHashMap()));
    public final Map a;

    public yk2(Map map) {
        this.a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List list = (List) this.a.get(lowerCase);
        if (list != null) {
            return (String) ke0.F0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yk2) && this.a.equals(((yk2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.a + ')';
    }
}
