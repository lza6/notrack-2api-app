package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lk0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ lk0(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return kr1.z(((tr1) obj).b, ((tr1) obj2).b);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                ps2 ps2Var = (ps2) obj;
                ps2 ps2Var2 = (ps2) obj2;
                return (((Number) ps2Var.d).intValue() - ((Number) ps2Var.c).intValue()) - (((Number) ps2Var2.d).intValue() - ((Number) ps2Var2.c).intValue());
            case 3:
                ux1 ux1Var = (ux1) obj;
                ux1 ux1Var2 = (ux1) obj2;
                float f = ux1Var.O.p.M;
                float f2 = ux1Var2.O.p.M;
                return f == f2 ? kr1.z(ux1Var.u(), ux1Var2.u()) : Float.compare(f, f2);
            default:
                return kr1.z(((t02) obj).getIndex(), ((t02) obj2).getIndex());
        }
    }
}
