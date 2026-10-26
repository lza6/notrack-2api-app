package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cs4 extends sp4 {
    private static final cs4 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        cs4 cs4Var = new cs4();
        zzb = cs4Var;
        sp4.f(cs4.class, cs4Var);
    }

    public static bs4 p() {
        return (bs4) zzb.k();
    }

    public static /* synthetic */ void q(cs4 cs4Var, boolean z) {
        cs4Var.zzd |= 8;
        cs4Var.zzh = z;
    }

    public static /* synthetic */ void r(cs4 cs4Var) {
        cs4Var.zzd |= 16;
        cs4Var.zzi = 0;
    }

    public static /* synthetic */ void s(cs4 cs4Var, long j) {
        cs4Var.zzd |= 4;
        cs4Var.zzg = j;
    }

    public static /* synthetic */ void t(cs4 cs4Var, int i) {
        cs4Var.zzd |= 32;
        cs4Var.zzj = i;
    }

    public static /* synthetic */ void u(cs4 cs4Var) {
        cs4Var.zzd |= 2;
        cs4Var.zzf = true;
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new cs4();
        }
        if (i2 == 4) {
            return new bs4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
