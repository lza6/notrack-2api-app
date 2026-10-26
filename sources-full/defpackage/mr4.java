package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mr4 extends sp4 {
    private static final mr4 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        mr4 mr4Var = new mr4();
        zzb = mr4Var;
        sp4.f(mr4.class, mr4Var);
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new mr4();
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
