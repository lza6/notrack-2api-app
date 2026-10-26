package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sr4 extends sp4 {
    private static final sr4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private lr4 zzg;
    private mr4 zzh;

    static {
        sr4 sr4Var = new sr4();
        zzb = sr4Var;
        sp4.f(sr4.class, sr4Var);
    }

    public static /* synthetic */ void p(sr4 sr4Var, zr4 zr4Var) {
        sr4Var.zzf = zr4Var;
        sr4Var.zze = 8;
    }

    public static /* synthetic */ void q(sr4 sr4Var, as4 as4Var) {
        sr4Var.zzf = as4Var;
        sr4Var.zze = 4;
    }

    public static rr4 r() {
        return (rr4) zzb.k();
    }

    public static /* synthetic */ void s(sr4 sr4Var, ar4 ar4Var) {
        sr4Var.zzf = ar4Var;
        sr4Var.zze = 2;
    }

    public static /* synthetic */ void t(sr4 sr4Var, cr4 cr4Var) {
        sr4Var.zzf = cr4Var;
        sr4Var.zze = 3;
    }

    public static /* synthetic */ void u(sr4 sr4Var, fr4 fr4Var) {
        fr4Var.getClass();
        sr4Var.zzf = fr4Var;
        sr4Var.zze = 7;
    }

    public static /* synthetic */ void v(sr4 sr4Var, jr4 jr4Var) {
        sr4Var.zzf = jr4Var;
        sr4Var.zze = 5;
    }

    public static /* synthetic */ void w(sr4 sr4Var, lr4 lr4Var) {
        lr4Var.getClass();
        sr4Var.zzg = lr4Var;
        sr4Var.zzd |= 1;
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", ar4.class, cr4.class, as4.class, jr4.class, "zzh", fr4.class, zr4.class});
        }
        if (i2 == 3) {
            return new sr4();
        }
        if (i2 == 4) {
            return new rr4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
