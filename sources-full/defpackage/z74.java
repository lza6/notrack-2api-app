package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z74 extends zy2 {
    public static final z74 c = new z74(a84.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((x74) obj).c.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        y74 y74Var = (y74) obj;
        y74Var.getClass();
        int iO = nk0Var.c(this.b, i).o();
        y74Var.b(y74Var.d() + 1);
        int[] iArr = y74Var.a;
        int i2 = y74Var.b;
        y74Var.b = i2 + 1;
        iArr[i2] = iO;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        int[] iArr = ((x74) obj).c;
        y74 y74Var = new y74();
        y74Var.a = iArr;
        y74Var.b = iArr.length;
        y74Var.b(10);
        return y74Var;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new x74(new int[0]);
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        int[] iArr = ((x74) obj).c;
        do3Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            do3Var.j(this.b, i2).k(iArr[i2]);
        }
    }
}
