package defpackage;

import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class np4 {
    public final ts4 a;
    public final um4 b;
    public final Context c;

    public np4(ts4 ts4Var, um4 um4Var, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = ts4Var;
        this.b = um4Var;
        this.c = context;
    }

    public static void b(wk wkVar, e4 e4Var, ct4 ct4Var) {
        if (wkVar == null || e4Var == null || wkVar.a(ct4Var) == null || wkVar.f) {
            return;
        }
        wkVar.f = true;
        IntentSender intentSender = wkVar.a(ct4Var).getIntentSender();
        intentSender.getClass();
        e4Var.a(new sq1(intentSender, null, 0, 0), null);
    }

    public final sd a() {
        String packageName = this.c.getPackageName();
        ts4 ts4Var = this.a;
        dt4 dt4Var = ts4Var.a;
        if (dt4Var == null) {
            return ts4.c();
        }
        ts4.e.f("requestUpdateInfo(%s)", packageName);
        us3 us3Var = new us3();
        dt4Var.a().post(new es4(dt4Var, us3Var, us3Var, new es4(ts4Var, us3Var, packageName, us3Var), 2));
        return us3Var.a;
    }
}
