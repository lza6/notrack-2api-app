package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vo4 extends sp4 {
    private static final vo4 zzb;
    private int zzd;
    private zo4 zze;
    private zo4 zzf;
    private int zzg;

    static {
        vo4 vo4Var = new vo4();
        zzb = vo4Var;
        sp4.f(vo4.class, vo4Var);
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", bp4.b});
        }
        if (i2 == 3) {
            return new vo4();
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
