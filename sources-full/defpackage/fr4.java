package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fr4 extends sp4 {
    private static final fr4 zzb;

    static {
        fr4 fr4Var = new fr4();
        zzb = fr4Var;
        sp4.f(fr4.class, fr4Var);
    }

    public static fr4 p() {
        return zzb;
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new fr4();
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
