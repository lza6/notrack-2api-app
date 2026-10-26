package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k84 extends zy2 {
    public static final k84 c = new k84(l84.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((i84) obj).c.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        j84 j84Var = (j84) obj;
        j84Var.getClass();
        short sX = nk0Var.c(this.b, i).x();
        j84Var.b(j84Var.d() + 1);
        short[] sArr = j84Var.a;
        int i2 = j84Var.b;
        j84Var.b = i2 + 1;
        sArr[i2] = sX;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        short[] sArr = ((i84) obj).c;
        j84 j84Var = new j84();
        j84Var.a = sArr;
        j84Var.b = sArr.length;
        j84Var.b(10);
        return j84Var;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new i84(new short[0]);
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        short[] sArr = ((i84) obj).c;
        do3Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            do3Var.j(this.b, i2).s(sArr[i2]);
        }
    }
}
