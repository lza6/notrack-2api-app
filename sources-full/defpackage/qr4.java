package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class qr4 extends sp4 {
    private static final qr4 zzb;
    private int zzd;
    private vp4 zze = gq4.m;
    private String zzf = BuildConfig.VERSION_NAME;
    private boolean zzg;

    static {
        qr4 qr4Var = new qr4();
        zzb = qr4Var;
        sp4.f(qr4.class, qr4Var);
    }

    public static qr4 p() {
        return zzb;
    }

    public static /* synthetic */ void q(qr4 qr4Var, boolean z) {
        qr4Var.zzd |= 2;
        qr4Var.zzg = z;
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", pr4.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new qr4();
        }
        if (i2 == 4) {
            return new or4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
