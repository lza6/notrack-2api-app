package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cr4 extends sp4 {
    private static final cr4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        cr4 cr4Var = new cr4();
        zzb = cr4Var;
        sp4.f(cr4.class, cr4Var);
    }

    public static /* synthetic */ void p(cr4 cr4Var, int i) {
        cr4Var.zzg = i - 1;
        cr4Var.zzd |= 1;
    }

    public static br4 q() {
        return (br4) zzb.k();
    }

    public static void s(cr4 cr4Var, gr4 gr4Var) {
        cr4Var.zzh = gr4Var.c;
        cr4Var.zzd |= 2;
    }

    public static /* synthetic */ void t(cr4 cr4Var, qr4 qr4Var) {
        cr4Var.zzf = qr4Var;
        cr4Var.zze = 4;
    }

    public static /* synthetic */ void u(cr4 cr4Var, cs4 cs4Var) {
        cr4Var.zzf = cs4Var;
        cr4Var.zze = 3;
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", bp4.c, nr4.class, cs4.class, qr4.class, "zzh", bp4.e});
        }
        if (i2 == 3) {
            return new cr4();
        }
        if (i2 == 4) {
            return new br4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final qr4 r() {
        return this.zze == 4 ? (qr4) this.zzf : qr4.p();
    }
}
