package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pv extends i {
    public final nv a = new nv();

    @Override // defpackage.i
    public final kv e() {
        return this.a;
    }

    @Override // defpackage.i
    public final lv h(ix0 ix0Var) {
        char cCharAt;
        int i = ix0Var.e;
        CharSequence charSequence = ix0Var.a;
        if (ix0Var.g >= 4 || i >= charSequence.length() || charSequence.charAt(i) != '>') {
            return null;
        }
        int i2 = ix0Var.c + ix0Var.g;
        int i3 = i2 + 1;
        CharSequence charSequence2 = ix0Var.a;
        int i4 = i + 1;
        if (i4 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new lv(-1, i3, false);
    }
}
