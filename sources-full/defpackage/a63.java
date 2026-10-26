package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a63 {
    public final Resources a;
    public final Resources.Theme b;

    public a63(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a63.class == obj.getClass()) {
            a63 a63Var = (a63) obj;
            if (this.a.equals(a63Var.a) && Objects.equals(this.b, a63Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
