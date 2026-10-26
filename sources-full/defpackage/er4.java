package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class er4 extends sp4 {
    private static final er4 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzh = BuildConfig.VERSION_NAME;

    static {
        er4 er4Var = new er4();
        zzb = er4Var;
        sp4.f(er4.class, er4Var);
    }

    public static /* synthetic */ void p(er4 er4Var, int i) {
        er4Var.zzd |= 1;
        er4Var.zze = i;
    }

    public static dr4 q() {
        return (dr4) zzb.k();
    }

    public static /* synthetic */ void r(er4 er4Var, String str) {
        er4Var.zzd |= 8;
        er4Var.zzh = str;
    }

    public static /* synthetic */ void s(er4 er4Var, String str) {
        str.getClass();
        er4Var.zzd |= 2;
        er4Var.zzf = str;
    }

    public static /* synthetic */ void t(er4 er4Var, int i) {
        er4Var.zzd |= 32;
        er4Var.zzj = i;
    }

    public static /* synthetic */ void u(er4 er4Var, int i) {
        er4Var.zzd |= 16;
        er4Var.zzi = i;
    }

    public static void v(er4 er4Var, int i) {
        er4Var.zzg = ud2.e(i);
        er4Var.zzd |= 4;
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", bp4.d, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new er4();
        }
        if (i2 == 4) {
            return new dr4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
