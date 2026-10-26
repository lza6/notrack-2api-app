package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uf2 {
    public static final uf2 b = new uf2(Collections.unmodifiableMap(new HashMap()));
    public final Map a;

    public uf2(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uf2) {
            return this.a.equals(((uf2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
