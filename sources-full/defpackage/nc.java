package defpackage;

import androidx.compose.ui.input.pointer.a;

/* JADX INFO: loaded from: classes.dex */
public final class nc implements a {
    public final int b;

    public nc(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((nc) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return fq2.p(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
