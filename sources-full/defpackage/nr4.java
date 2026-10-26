package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nr4 extends sp4 {
    private static final nr4 zzb;
    private int zzd;
    private int zze;

    static {
        nr4 nr4Var = new nr4();
        zzb = nr4Var;
        sp4.f(nr4.class, nr4Var);
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", bp4.g});
        }
        if (i2 == 3) {
            return new nr4();
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
