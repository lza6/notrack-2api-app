package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ko extends nq0 {
    public final Context a;
    public final ld0 b;
    public final ld0 c;
    public final String d;

    public ko(Context context, ld0 ld0Var, ld0 ld0Var2, String str) {
        if (context == null) {
            m51.x("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (ld0Var == null) {
            m51.x("Null wallClock");
            throw null;
        }
        this.b = ld0Var;
        if (ld0Var2 == null) {
            m51.x("Null monotonicClock");
            throw null;
        }
        this.c = ld0Var2;
        if (str != null) {
            this.d = str;
        } else {
            m51.x("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nq0) {
            ko koVar = (ko) ((nq0) obj);
            if (this.a.equals(koVar.a) && this.b.equals(koVar.b) && this.c.equals(koVar.c) && this.d.equals(koVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return fq2.r(sb, this.d, "}");
    }
}
