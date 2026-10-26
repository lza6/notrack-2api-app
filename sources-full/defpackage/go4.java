package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class go4 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = ho4.k;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = BuildConfig.VERSION_NAME;
            }
            String str = simpleName + ":" + message;
            int i = tm4.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static ar4 b(int i, int i2, fu fuVar, String str, gr4 gr4Var) {
        try {
            dr4 dr4VarQ = er4.q();
            int i3 = fuVar.a;
            dr4VarQ.b();
            er4.p((er4) dr4VarQ.d, i3);
            String str2 = fuVar.c;
            dr4VarQ.b();
            er4.s((er4) dr4VarQ.d, str2);
            int i4 = fuVar.b;
            if (i4 != 0) {
                dr4VarQ.b();
                er4.u((er4) dr4VarQ.d, i4);
            }
            if (i != 0) {
                dr4VarQ.b();
                er4.v((er4) dr4VarQ.d, i);
            }
            if (str != null) {
                dr4VarQ.b();
                er4.r((er4) dr4VarQ.d, str);
            }
            zq4 zq4VarS = ar4.s();
            zq4VarS.c(dr4VarQ);
            zq4VarS.b();
            ar4.r((ar4) zq4VarS.d, i2);
            if (!gr4Var.equals(gr4.BROADCAST_ACTION_UNSPECIFIED)) {
                zq4VarS.b();
                ar4.v((ar4) zq4VarS.d, gr4Var);
            }
            return (ar4) zq4VarS.a();
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static cr4 c(int i, gr4 gr4Var) {
        try {
            br4 br4VarQ = cr4.q();
            br4VarQ.b();
            cr4.p((cr4) br4VarQ.d, i);
            if (!gr4Var.equals(gr4.BROADCAST_ACTION_UNSPECIFIED)) {
                br4VarQ.b();
                cr4.s((cr4) br4VarQ.d, gr4Var);
            }
            return (cr4) br4VarQ.a();
        } catch (Exception e) {
            tm4.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
