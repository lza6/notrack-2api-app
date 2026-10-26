package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gu {
    public final int a;
    public final CharSequence b;

    public gu(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj;
        if (this.a != guVar.a) {
            return false;
        }
        CharSequence charSequence = guVar.b;
        CharSequence charSequence2 = this.b;
        String string = charSequence2 != null ? charSequence2.toString() : null;
        String string2 = charSequence != null ? charSequence.toString() : null;
        if (string == null && string2 == null) {
            return true;
        }
        return string != null && string.equals(string2);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
