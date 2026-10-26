package defpackage;

import app.template.extension.BuildConfig;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class jr4 extends sp4 {
    private static final jr4 zzb;
    private int zzd;
    private int zzf;
    private er4 zzi;
    private boolean zzj;
    private boolean zzk;
    private xr4 zzl;
    private String zze = BuildConfig.VERSION_NAME;
    private up4 zzg = tp4.m;
    private vp4 zzh = gq4.m;

    static {
        jr4 jr4Var = new jr4();
        zzb = jr4Var;
        sp4.f(jr4.class, jr4Var);
    }

    public static ir4 p() {
        return (ir4) zzb.k();
    }

    public static void q(jr4 jr4Var, gr4 gr4Var) {
        RandomAccess randomAccess = jr4Var.zzg;
        if (!((fp4) randomAccess).c) {
            tp4 tp4Var = (tp4) randomAccess;
            int i = tp4Var.h;
            jr4Var.zzg = tp4Var.a(i + i);
        }
        ((tp4) jr4Var.zzg).j(gr4Var.c);
    }

    public static /* synthetic */ void r(jr4 jr4Var, er4 er4Var) {
        jr4Var.zzi = er4Var;
        jr4Var.zzd |= 4;
    }

    public static /* synthetic */ void s(jr4 jr4Var) {
        jr4Var.zzd |= 1;
        jr4Var.zze = "ProxyBillingBroadcastReceiver";
    }

    public static /* synthetic */ void t(jr4 jr4Var, xr4 xr4Var) {
        jr4Var.zzl = xr4Var;
        jr4Var.zzd |= 32;
    }

    public static /* synthetic */ void u(jr4 jr4Var, int i) {
        jr4Var.zzf = i - 1;
        jr4Var.zzd |= 2;
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"zzd", "zze", "zzf", bp4.f, "zzg", bp4.e, "zzh", tr4.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new jr4();
        }
        if (i2 == 4) {
            return new ir4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
