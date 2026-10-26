package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q61 extends i {
    public final p61 a;
    public String b;
    public final StringBuilder c;

    public q61(char c, int i, int i2) {
        p61 p61Var = new p61();
        this.a = p61Var;
        this.c = new StringBuilder();
        p61Var.g = c;
        p61Var.h = i;
        p61Var.i = i2;
    }

    @Override // defpackage.i
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // defpackage.i
    public final void d() {
        String strA = t41.a(this.b.trim());
        p61 p61Var = this.a;
        p61Var.j = strA;
        p61Var.k = this.c.toString();
    }

    @Override // defpackage.i
    public final kv e() {
        return this.a;
    }

    @Override // defpackage.i
    public final lv h(ix0 ix0Var) {
        int i = ix0Var.e;
        int i2 = ix0Var.b;
        CharSequence charSequence = ix0Var.a;
        int i3 = ix0Var.g;
        p61 p61Var = this.a;
        if (i3 < 4) {
            char c = p61Var.g;
            int i4 = p61Var.h;
            int iY = p23.Y(c, i, charSequence.length(), charSequence) - i;
            if (iY >= i4 && p23.Z(i + iY, charSequence.length(), charSequence) == charSequence.length()) {
                return new lv(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i5 = p61Var.i; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return lv.a(i2);
    }
}
