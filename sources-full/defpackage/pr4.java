package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class pr4 extends sp4 {
    private static final pr4 zzb;
    private int zzd;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;

    static {
        pr4 pr4Var = new pr4();
        zzb = pr4Var;
        sp4.f(pr4.class, pr4Var);
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", bp4.h, "zzf"});
        }
        if (i2 == 3) {
            return new pr4();
        }
        if (i2 == 4) {
            return new uo4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
