package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fs4 {
    public final String a;
    public final String b;
    public final boolean c;

    public fs4(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            u41.k("Given String is empty or null");
            throw null;
        }
        this.a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            u41.k("Given String is empty or null");
            throw null;
        }
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs4)) {
            return false;
        }
        fs4 fs4Var = (fs4) obj;
        return gb2.D(this.a, fs4Var.a) && gb2.D(this.b, fs4Var.b) && gb2.D(null, null) && this.c == fs4Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        g13.s(null);
        throw null;
    }
}
