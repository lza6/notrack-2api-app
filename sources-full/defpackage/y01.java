package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y01 implements qu1 {
    public static final y01 a = new y01();
    public static final gz2 b = new gz2("kotlin.time.Duration", cz2.v);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        int i = v01.l;
        String strY = hs0Var.y();
        strY.getClass();
        try {
            return new v01(gb2.j(strY));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(fq2.n("Invalid ISO duration string format: '", strY, "'."), e);
        }
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        long j = ((v01) obj).c;
        int i = v01.l;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jG = j < 0 ? v01.g(j) : j;
        long jF = v01.f(jG, z01.HOURS);
        boolean z = false;
        int iF = v01.d(jG) ? 0 : (int) (v01.f(jG, z01.MINUTES) % 60);
        int iF2 = v01.d(jG) ? 0 : (int) (v01.f(jG, z01.SECONDS) % 60);
        int iC = v01.c(jG);
        if (v01.d(j)) {
            jF = 9999999999999L;
        }
        boolean z2 = jF != 0;
        boolean z3 = (iF2 == 0 && iC == 0) ? false : true;
        if (iF != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jF);
            sb.append('H');
        }
        if (z) {
            sb.append(iF);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            v01.b(sb, iF2, iC, 9, "S", true);
        }
        do3Var.t(sb.toString());
    }
}
