package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j21 implements i21 {
    public final int c;
    public int d = -1;
    public int h = -1;

    public j21(int i) {
        this.c = i;
    }

    @Override // defpackage.i21
    public final Object a() {
        return this;
    }

    @Override // defpackage.i21
    public final boolean b(CharSequence charSequence, int i, int i2, h74 h74Var) {
        int i3 = this.c;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.d = i;
        this.h = i2;
        return false;
    }
}
