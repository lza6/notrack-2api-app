package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a20 extends d20 {
    public final String a;
    public final String b;

    public a20(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a20)) {
            return false;
        }
        a20 a20Var = (a20) obj;
        return this.a.equals(a20Var.a) && this.b.equals(a20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Ok(chatId=" + this.a + ", title=" + this.b + ")";
    }
}
