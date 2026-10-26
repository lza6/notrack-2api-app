package defpackage;

import androidx.compose.ui.platform.coreshims.ViewStructureCompat;

/* JADX INFO: loaded from: classes.dex */
public final class en0 {
    public final int a;
    public final long b;
    public final fn0 c;
    public final ViewStructureCompat d;

    public en0(int i, long j, fn0 fn0Var, ViewStructureCompat viewStructureCompat) {
        this.a = i;
        this.b = j;
        this.c = fn0Var;
        this.d = viewStructureCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en0)) {
            return false;
        }
        en0 en0Var = (en0) obj;
        return this.a == en0Var.a && this.b == en0Var.b && this.c == en0Var.c && kr1.n(this.d, en0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ud2.h(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        ViewStructureCompat viewStructureCompat = this.d;
        return iHashCode + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
