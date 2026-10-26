package defpackage;

import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class cn0 implements pf2 {
    public final le1 c;
    public e d;

    public cn0(le1 le1Var) {
        this.c = le1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cn0) && ((cn0) obj).c == this.c;
    }

    @Override // defpackage.pf2
    public final void g(sf2 sf2Var) {
        e eVar = (e) sf2Var.c(fh4.a);
        if (kr1.n(eVar, this.d)) {
            return;
        }
        this.d = eVar;
        this.c.invoke(eVar);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
