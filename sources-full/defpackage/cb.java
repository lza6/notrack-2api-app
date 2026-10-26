package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class cb implements qr2 {
    public final Context a;
    public final wu0 b;
    public final long c;
    public final hs2 d;

    public cb(Context context, wu0 wu0Var, long j, hs2 hs2Var) {
        this.a = context;
        this.b = wu0Var;
        this.c = j;
        this.d = hs2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!cb.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        cb cbVar = (cb) obj;
        return kr1.n(this.a, cbVar.a) && kr1.n(this.b, cbVar.b) && re0.c(this.c, cbVar.c) && kr1.n(this.d, cbVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = re0.j;
        return this.d.hashCode() + ud2.h(iHashCode, 31, this.c);
    }
}
