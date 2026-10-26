package defpackage;

import androidx.compose.ui.c;
import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class uf0 implements c {
    public final c c;
    public final c d;

    public uf0(c cVar, c cVar2) {
        this.c = cVar;
        this.d = cVar2;
    }

    @Override // androidx.compose.ui.c
    public final boolean all(le1 le1Var) {
        return this.c.all(le1Var) && this.d.all(le1Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uf0)) {
            return false;
        }
        uf0 uf0Var = (uf0) obj;
        return this.c.equals(uf0Var.c) && kr1.n(this.d, uf0Var.d);
    }

    @Override // androidx.compose.ui.c
    public final Object foldIn(Object obj, ne1 ne1Var) {
        return this.d.foldIn(this.c.foldIn(obj, ne1Var), ne1Var);
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return ud2.r(new StringBuilder("["), (String) foldIn(BuildConfig.VERSION_NAME, pe.w), ']');
    }
}
