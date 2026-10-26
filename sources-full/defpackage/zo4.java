package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class zo4 extends sp4 {
    private static final zo4 zzb;
    private int zzd;
    private String zze = BuildConfig.VERSION_NAME;

    static {
        zo4 zo4Var = new zo4();
        zzb = zo4Var;
        sp4.f(zo4.class, zo4Var);
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zo4();
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
