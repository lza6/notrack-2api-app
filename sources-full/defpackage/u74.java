package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u74 extends zy2 {
    public static final u74 c = new u74(v74.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((s74) obj).c.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        t74 t74Var = (t74) obj;
        t74Var.getClass();
        byte bT = nk0Var.c(this.b, i).t();
        t74Var.b(t74Var.d() + 1);
        byte[] bArr = t74Var.a;
        int i2 = t74Var.b;
        t74Var.b = i2 + 1;
        bArr[i2] = bT;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        byte[] bArr = ((s74) obj).c;
        t74 t74Var = new t74();
        t74Var.a = bArr;
        t74Var.b = bArr.length;
        t74Var.b(10);
        return t74Var;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new s74(new byte[0]);
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        byte[] bArr = ((s74) obj).c;
        do3Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            do3Var.j(this.b, i2).d(bArr[i2]);
        }
    }
}
