package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u61 {
    public final String a;
    public final Map b;

    public u61(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static u61 a(String str) {
        return new u61(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u61)) {
            return false;
        }
        u61 u61Var = (u61) obj;
        return this.a.equals(u61Var.a) && this.b.equals(u61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
