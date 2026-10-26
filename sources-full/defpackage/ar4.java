package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ar4 extends sp4 {
    private static final ar4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private er4 zzh;
    private int zzi;

    static {
        ar4 ar4Var = new ar4();
        zzb = ar4Var;
        sp4.f(ar4.class, ar4Var);
    }

    public static /* synthetic */ void p(ar4 ar4Var, qr4 qr4Var) {
        ar4Var.zzf = qr4Var;
        ar4Var.zze = 7;
    }

    public static /* synthetic */ void q(ar4 ar4Var, cs4 cs4Var) {
        ar4Var.zzf = cs4Var;
        ar4Var.zze = 6;
    }

    public static /* synthetic */ void r(ar4 ar4Var, int i) {
        ar4Var.zzg = i - 1;
        ar4Var.zzd |= 1;
    }

    public static zq4 s() {
        return (zq4) zzb.k();
    }

    public static ar4 t(byte[] bArr) throws zp4 {
        sp4 sp4Var = zzb;
        int length = bArr.length;
        op4 op4Var = op4.a;
        int i = gp4.a;
        op4 op4Var2 = op4.a;
        if (length != 0) {
            sp4 sp4VarN = sp4Var.n();
            try {
                jq4 jq4VarA = fq4.b.a(sp4VarN.getClass());
                hp4 hp4Var = new hp4();
                op4Var2.getClass();
                jq4VarA.e(sp4VarN, bArr, 0, length, hp4Var);
                jq4VarA.a(sp4VarN);
                sp4Var = sp4VarN;
            } catch (IOException e) {
                if (e.getCause() instanceof zp4) {
                    throw ((zp4) e.getCause());
                }
                throw new zp4(e.getMessage(), e);
            } catch (IndexOutOfBoundsException unused) {
                j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (lq4 e2) {
                j93.l(e2.getMessage());
                return null;
            } catch (zp4 e3) {
                throw e3;
            }
        }
        if (sp4Var == null || sp4.i(sp4Var, true)) {
            return (ar4) sp4Var;
        }
        j93.l(new lq4().getMessage());
        return null;
    }

    public static void v(ar4 ar4Var, gr4 gr4Var) {
        ar4Var.zzi = gr4Var.c;
        ar4Var.zzd |= 4;
    }

    public static /* synthetic */ void w(ar4 ar4Var, er4 er4Var) {
        ar4Var.zzh = er4Var;
        ar4Var.zzd |= 2;
    }

    @Override // defpackage.sp4
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new iq4(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", bp4.c, "zzh", nr4.class, "zzi", bp4.e, cs4.class, qr4.class});
        }
        if (i2 == 3) {
            return new ar4();
        }
        if (i2 == 4) {
            return new zq4(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final qr4 u() {
        return this.zze == 7 ? (qr4) this.zzf : qr4.p();
    }
}
