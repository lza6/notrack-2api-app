package defpackage;

import android.os.Build;
import app.template.extension.BuildConfig;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class lr4 extends sp4 {
    private static final lr4 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = BuildConfig.VERSION_NAME;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzg = BuildConfig.VERSION_NAME;
    private String zzo = BuildConfig.VERSION_NAME;
    private String zzp = BuildConfig.VERSION_NAME;
    private String zzq = BuildConfig.VERSION_NAME;
    private String zzr = BuildConfig.VERSION_NAME;

    static {
        lr4 lr4Var = new lr4();
        zzb = lr4Var;
        sp4.f(lr4.class, lr4Var);
    }

    public static /* synthetic */ void A(lr4 lr4Var, int i) {
        lr4Var.zzd |= Uuid.SIZE_BITS;
        lr4Var.zzl = i;
    }

    public static /* synthetic */ void B(lr4 lr4Var, int i) {
        lr4Var.zzd |= FontInfo.NUMBER_OF_CHAR_CODES;
        lr4Var.zzm = i;
    }

    public static /* synthetic */ void C(lr4 lr4Var, int i) {
        lr4Var.zzd |= 8;
        lr4Var.zzh = i;
    }

    public static /* synthetic */ void D(lr4 lr4Var, long j) {
        lr4Var.zzd |= 16;
        lr4Var.zzi = j;
    }

    public static /* synthetic */ void E(lr4 lr4Var, long j) {
        lr4Var.zzd |= 32;
        lr4Var.zzj = j;
    }

    public static /* synthetic */ void p(lr4 lr4Var) {
        lr4Var.zzd |= ConstantsKt.MINIMUM_BLOCK_SIZE;
        lr4Var.zzn = 926300087L;
    }

    public static /* synthetic */ void q(lr4 lr4Var, String str) {
        str.getClass();
        lr4Var.zzd |= 4;
        lr4Var.zzg = str;
    }

    public static /* synthetic */ void r(lr4 lr4Var) {
        String str = Build.BRAND;
        str.getClass();
        lr4Var.zzd |= 1024;
        lr4Var.zzo = str;
    }

    public static /* synthetic */ void s(lr4 lr4Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        lr4Var.zzd |= ConstantsKt.DEFAULT_BUFFER_SIZE;
        lr4Var.zzr = str;
    }

    public static /* synthetic */ void t(lr4 lr4Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        lr4Var.zzd |= ConstantsKt.DEFAULT_BLOCK_SIZE;
        lr4Var.zzq = str;
    }

    public static /* synthetic */ void u(lr4 lr4Var) {
        String str = Build.MODEL;
        str.getClass();
        lr4Var.zzd |= 2048;
        lr4Var.zzp = str;
    }

    public static /* synthetic */ void v(lr4 lr4Var, int i) {
        lr4Var.zzd |= 16384;
        lr4Var.zzs = i;
    }

    public static /* synthetic */ void w(lr4 lr4Var) {
        lr4Var.zzd |= 64;
        lr4Var.zzk = false;
    }

    public static /* synthetic */ void x(lr4 lr4Var) {
        lr4Var.zzd |= 1;
        lr4Var.zze = "9.1.0";
    }

    public static /* synthetic */ void y(lr4 lr4Var, String str) {
        lr4Var.zzd |= 2;
        lr4Var.zzf = str;
    }

    public static kr4 z() {
        return (kr4) zzb.k();
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new lr4();
        }
        if (i2 == 4) {
            return new kr4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
