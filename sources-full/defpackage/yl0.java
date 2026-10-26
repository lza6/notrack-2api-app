package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class yl0 {
    public final bf0 a;
    public final bf0 b;
    public final bf0 c;
    public final float[] d;

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Illegal instructions before constructor call */
    public yl0(bf0 bf0Var, bf0 bf0Var2, int i) {
        float[] fArr;
        bf0 bf0VarH = g13.y(bf0Var.b, 12884901888L) ? p23.h(bf0Var) : bf0Var;
        bf0 bf0VarH2 = g13.y(bf0Var2.b, 12884901888L) ? p23.h(bf0Var2) : bf0Var2;
        float[] fArrA = yh4.n;
        if (i == 3) {
            boolean zY = g13.y(bf0Var.b, 12884901888L);
            boolean zY2 = g13.y(bf0Var2.b, 12884901888L);
            if (!(zY && zY2) && (zY || zY2)) {
                rf4 rf4Var = ((t63) (zY ? bf0Var : bf0Var2)).d;
                float[] fArrA2 = zY ? rf4Var.a() : fArrA;
                fArrA = zY2 ? rf4Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(bf0Var2, bf0VarH, bf0VarH2, fArr);
    }

    public yl0(bf0 bf0Var, bf0 bf0Var2, bf0 bf0Var3, float[] fArr) {
        this.a = bf0Var;
        this.b = bf0Var2;
        this.c = bf0Var3;
        this.d = fArr;
    }

    public long a(long j) {
        float fH = re0.h(j);
        float fG = re0.g(j);
        float fE = re0.e(j);
        float fD = re0.d(j);
        bf0 bf0Var = this.b;
        long jD = bf0Var.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = bf0Var.e(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.f(f, f2, fE2, fD, this.a);
    }
}
