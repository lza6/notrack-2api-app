package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dz extends zy2 {
    public static final dz c = new dz(gz.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        cz czVar = (cz) obj;
        czVar.getClass();
        byte bM = nk0Var.m(this.b, i);
        czVar.b(czVar.d() + 1);
        byte[] bArr = czVar.a;
        int i2 = czVar.b;
        czVar.b = i2 + 1;
        bArr[i2] = bM;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        cz czVar = new cz();
        czVar.a = bArr;
        czVar.b = bArr.length;
        czVar.b(10);
        return czVar;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new byte[0];
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        do3Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            yy2 yy2Var = this.b;
            yy2Var.getClass();
            do3Var.g(yy2Var, i2);
            do3Var.d(b);
        }
    }
}
