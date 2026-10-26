package defpackage;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import notrack.ai.data.account.AccountEnvelope;
import notrack.ai.data.account.AccountSummary;
import notrack.ai.data.account.Entitlements;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class k2 {
    public final g50 a;
    public final fy2 b;
    public final String c;
    public final kt1 d;
    public final ac2 e;

    public k2(g50 g50Var, fy2 fy2Var, String str) {
        fy2Var.getClass();
        str.getClass();
        this.a = g50Var;
        this.b = fy2Var;
        this.c = str;
        this.d = xr0.G(new f2(0));
        Pattern pattern = ac2.d;
        this.e = Options$Companion.get("application/json; charset=utf-8");
    }

    public static final String a(k2 k2Var) {
        return mo3.T0(64, "Android · " + Build.MANUFACTURER + " " + Build.MODEL);
    }

    public static final AccountEnvelope b(k2 k2Var, String str) {
        try {
            kt1 kt1Var = k2Var.d;
            kt1Var.getClass();
            AccountEnvelope accountEnvelope = (AccountEnvelope) kt1Var.b(AccountEnvelope.Companion.serializer(), str);
            AccountSummary account = accountEnvelope.getAccount();
            return account != null ? AccountEnvelope.copy$default(accountEnvelope, Entitlements.copy$default(accountEnvelope.getEntitlements(), account.getAvatar(), account.getAvatarAi(), 2047)) : accountEnvelope;
        } catch (Exception unused) {
            Entitlements.Companion.getClass();
            return new AccountEnvelope(false, Entitlements.ANONYMOUS, null, null, null, "bad_response", null, null, null, false);
        }
    }

    public static final String c(k2 k2Var, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!to3.q0((String) next, "nt_session=", false));
        String str = (String) next;
        if (str != null) {
            String strR0 = mo3.R0(';', mo3.P0(str, "nt_session="));
            if (!mo3.C0(strR0)) {
                return strR0;
            }
        }
        return null;
    }
}
