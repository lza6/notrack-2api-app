package defpackage;

import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class tw0 {
    public final DisplayCutout a;

    public tw0(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tw0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((tw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
