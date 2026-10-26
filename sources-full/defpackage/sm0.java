package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class sm0 {
    public final Uri a;
    public final boolean b;

    public sm0(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sm0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        sm0 sm0Var = (sm0) obj;
        return this.a.equals(sm0Var.a) && this.b == sm0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
