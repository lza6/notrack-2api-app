package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zr4 extends sp4 {
    private static final zr4 zzb;
    private int zzd;
    private er4 zze;
    private long zzf;

    static {
        zr4 zr4Var = new zr4();
        zzb = zr4Var;
        sp4.f(zr4.class, zr4Var);
    }

    public static yr4 p() {
        return (yr4) zzb.k();
    }

    public static /* synthetic */ void q(zr4 zr4Var, er4 er4Var) {
        zr4Var.zze = er4Var;
        zr4Var.zzd |= 1;
    }

    public static /* synthetic */ void r(zr4 zr4Var, long j) {
        zr4Var.zzd |= 2;
        zr4Var.zzf = j;
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zr4();
        }
        if (i2 == 4) {
            return new yr4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
