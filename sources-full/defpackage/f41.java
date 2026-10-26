package defpackage;

import androidx.compose.animation.b;

/* JADX INFO: loaded from: classes.dex */
public final class f41 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ k41 d;
    public final /* synthetic */ x51 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f41(k41 k41Var, x51 x51Var, int i) {
        super(1);
        this.c = i;
        this.d = k41Var;
        this.h = x51Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        o71 o71Var;
        o71 o71Var2;
        na3 na3Var;
        int i = this.c;
        d41 d41Var = d41.h;
        d41 d41Var2 = d41.d;
        d41 d41Var3 = d41.c;
        float f = 1.0f;
        k41 k41Var = this.d;
        x51 x51Var = this.h;
        switch (i) {
            case 0:
                l54 l54Var = (l54) obj;
                if (l54Var.a(d41Var3, d41Var2)) {
                    j61 j61Var = ((l41) k41Var).b.a;
                    return (j61Var == null || (o71Var2 = j61Var.a) == null) ? b.b : o71Var2;
                }
                if (!l54Var.a(d41Var2, d41Var)) {
                    return b.b;
                }
                j61 j61Var2 = ((y51) x51Var).c.a;
                return (j61Var2 == null || (o71Var = j61Var2.a) == null) ? b.b : o71Var;
            case 1:
                int iOrdinal = ((d41) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            u41.e();
                            return null;
                        }
                        if (((y51) x51Var).c.a != null) {
                            f = 0.0f;
                        }
                    }
                } else if (((l41) k41Var).b.a != null) {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            case 2:
                l54 l54Var2 = (l54) obj;
                if (l54Var2.a(d41Var3, d41Var2)) {
                    na3 na3Var2 = ((l41) k41Var).b.d;
                    return na3Var2 != null ? na3Var2.b : b.b;
                }
                if (l54Var2.a(d41Var2, d41Var) && (na3Var = ((y51) x51Var).c.d) != null) {
                    return na3Var.b;
                }
                return b.b;
            default:
                int iOrdinal2 = ((d41) obj).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            u41.e();
                            return null;
                        }
                        if (((y51) x51Var).c.d != null) {
                            f = 0.5f;
                        }
                    }
                } else if (((l41) k41Var).b.d != null) {
                    f = 0.5f;
                }
                return Float.valueOf(f);
        }
    }
}
