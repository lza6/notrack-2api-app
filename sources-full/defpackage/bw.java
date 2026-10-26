package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bw extends zy2 {
    public static final bw c = new bw(cw.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        zv zvVar = (zv) obj;
        zvVar.getClass();
        boolean zS = nk0Var.s(this.b, i);
        zvVar.b(zvVar.d() + 1);
        boolean[] zArr = zvVar.a;
        int i2 = zvVar.b;
        zvVar.b = i2 + 1;
        zArr[i2] = zS;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        zv zvVar = new zv();
        zvVar.a = zArr;
        zvVar.b = zArr.length;
        zvVar.b(10);
        return zvVar;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new boolean[0];
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        do3Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            do3Var.c(this.b, i2, zArr[i2]);
        }
    }
}
