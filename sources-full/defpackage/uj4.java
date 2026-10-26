package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uj4 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ q43 d;
    public final /* synthetic */ u23 h;
    public final /* synthetic */ q43 l;
    public final /* synthetic */ q43 m;

    public /* synthetic */ uj4(q43 q43Var, u23 u23Var, q43 q43Var2, q43 q43Var3) {
        this.d = q43Var;
        this.h = u23Var;
        this.l = q43Var2;
        this.m = q43Var3;
    }

    public /* synthetic */ uj4(u23 u23Var, q43 q43Var, q43 q43Var2, q43 q43Var3) {
        this.h = u23Var;
        this.d = q43Var;
        this.l = q43Var2;
        this.m = q43Var3;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.c;
        w84 w84Var = w84.a;
        q43 q43Var = this.m;
        q43 q43Var2 = this.l;
        u23 u23Var = this.h;
        q43 q43Var3 = this.d;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue != 21589) {
                    return w84Var;
                }
                if (jLongValue >= 1) {
                    byte b = u23Var.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue >= j) {
                        if (z) {
                            q43Var3.c = Integer.valueOf(u23Var.c());
                        }
                        if (z2) {
                            q43Var2.c = Integer.valueOf(u23Var.c());
                        }
                        if (!z3) {
                            return w84Var;
                        }
                        q43Var.c = Integer.valueOf(u23Var.c());
                        return w84Var;
                    }
                    m51.l("bad zip: extended timestamp extra too short");
                } else {
                    m51.l("bad zip: extended timestamp extra too short");
                }
                return null;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 != 1) {
                    return w84Var;
                }
                if (q43Var3.c != null) {
                    m51.l("bad zip: NTFS extra attribute tag 0x0001 repeated");
                } else {
                    if (jLongValue2 == 24) {
                        q43Var3.c = Long.valueOf(u23Var.h());
                        q43Var2.c = Long.valueOf(u23Var.h());
                        q43Var.c = Long.valueOf(u23Var.h());
                        return w84Var;
                    }
                    m51.l("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                }
                return null;
        }
    }
}
