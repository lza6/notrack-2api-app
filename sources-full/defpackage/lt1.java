package defpackage;

import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class lt1 extends JsonPrimitive {
    public final boolean c;
    public final String d;

    public lt1(String str, boolean z) {
        str.getClass();
        this.c = z;
        this.d = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lt1.class != obj.getClass()) {
            return false;
        }
        lt1 lt1Var = (lt1) obj;
        return this.c == lt1Var.c && kr1.n(this.d, lt1Var.d);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String getContent() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (Boolean.hashCode(this.c) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z = this.c;
        String str = this.d;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        jo3.a(sb, str);
        return sb.toString();
    }
}
