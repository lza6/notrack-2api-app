package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import notrack.ai.data.account.Entitlements;
import notrack.ai.data.avatars.AvatarView;

/* JADX INFO: loaded from: classes.dex */
public class fy2 implements io2, ho4 {
    public Object c;
    public Object d;

    public fy2(int i) {
        switch (i) {
            case 9:
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            case 10:
            default:
                this.c = new fi2();
                this.d = new fi2();
                break;
            case 11:
                this.c = new sb3(4);
                this.d = new t82(16);
                break;
        }
    }

    public fy2(Context context, lr4 lr4Var) {
        wu wuVar = new wu();
        try {
            g64.b(context);
            iy2 iy2VarC = g64.a().c(oz.e);
            j31 j31Var = new j31("proto");
            sb3 sb3Var = new sb3(13);
            Set set = (Set) iy2VarC.d;
            if (!set.contains(j31Var)) {
                throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", j31Var, set));
            }
            wuVar.b = new iy2((vo) iy2VarC.h, j31Var, sb3Var, (g64) iy2VarC.l);
            this.d = wuVar;
            this.c = lr4Var;
        } catch (Throwable unused) {
            wuVar.a = true;
        }
    }

    public fy2(View view) {
        this.c = view;
    }

    public fy2(fz2 fz2Var) {
        this.c = new HashMap(fz2Var.a);
        this.d = new HashMap(fz2Var.b);
    }

    public /* synthetic */ fy2(Object obj, Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.io2
    public void a(sd sdVar) {
        ((Map) ((bi4) this.d).d).remove((us3) this.c);
    }

    public void b() {
        d().edit().remove("session_token").remove("plan").remove("plan_active").remove("nickname").remove("avatar_me").remove("avatar_ai").apply();
    }

    public Long c(String str) {
        q73 q73VarA = q73.a(1, "SELECT long_value FROM Preference where `key`=?");
        q73VarA.i(1, str);
        WorkDatabase workDatabase = (WorkDatabase) this.c;
        workDatabase.b();
        Cursor cursorM = workDatabase.m(q73VarA);
        try {
            Long lValueOf = null;
            if (cursorM.moveToFirst() && !cursorM.isNull(0)) {
                lValueOf = Long.valueOf(cursorM.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM.close();
            q73VarA.l();
        }
    }

    public SharedPreferences d() {
        return (SharedPreferences) ((yq3) this.c).getValue();
    }

    public String e() {
        return d().getString("session_token", null);
    }

    public void f(ey2 ey2Var) {
        WorkDatabase workDatabase = (WorkDatabase) this.c;
        workDatabase.b();
        workDatabase.c();
        try {
            ((av0) this.d).m(ey2Var);
            workDatabase.p();
        } finally {
            workDatabase.k();
        }
    }

    public void g(xb1 xb1Var) {
        ou ouVar = (ou) this.d;
        sk3 sk3Var = (sk3) this.c;
        int i = xb1Var.b;
        if (i != 0) {
            ouVar.execute(new j00(sk3Var, i));
        } else {
            ouVar.execute(new io4(sk3Var, 6, xb1Var.a));
        }
    }

    public void h(Entitlements entitlements) {
        kt1 kt1Var = (kt1) this.d;
        entitlements.getClass();
        String plan = entitlements.getPlan();
        plan.getClass();
        d().edit().putString("plan", plan).apply();
        d().edit().putBoolean("plan_active", entitlements.getPlanActive()).apply();
        d().edit().putString("nickname", entitlements.getNickname()).apply();
        AvatarView avatar = entitlements.getAvatar();
        SharedPreferences.Editor editorEdit = d().edit();
        if (avatar == null) {
            editorEdit.remove("avatar_me");
        } else {
            editorEdit.putString("avatar_me", kt1Var.c(AvatarView.Companion.serializer(), avatar));
        }
        editorEdit.apply();
        AvatarView avatarAi = entitlements.getAvatarAi();
        SharedPreferences.Editor editorEdit2 = d().edit();
        if (avatarAi == null) {
            editorEdit2.remove("avatar_ai");
        } else {
            editorEdit2.putString("avatar_ai", kt1Var.c(AvatarView.Companion.serializer(), avatarAi));
        }
        editorEdit2.apply();
    }

    public InputMethodManager i() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.d;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = ((View) this.c).getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.d = inputMethodManager2;
        return inputMethodManager2;
    }

    public void j(String str) {
        SharedPreferences.Editor editorEdit = d().edit();
        if (mo3.C0(str)) {
            editorEdit.remove("session_token");
        } else {
            editorEdit.putString("session_token", str);
        }
        editorEdit.apply();
    }

    public void k() {
    }

    public void l(ar4 ar4Var) {
        try {
            u(ar4Var, (lr4) this.c);
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void m(ar4 ar4Var, int i, long j) {
        try {
            kr4 kr4Var = (kr4) ((lr4) this.c).l();
            kr4Var.b();
            lr4.C((lr4) kr4Var.d, i);
            lr4 lr4Var = (lr4) kr4Var.a();
            this.c = lr4Var;
            if (j != 0) {
                kr4 kr4Var2 = (kr4) lr4Var.l();
                kr4Var2.e(j);
                lr4Var = (lr4) kr4Var2.a();
            }
            u(ar4Var, lr4Var);
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void n(ar4 ar4Var, long j, boolean z) {
        try {
            zq4 zq4Var = (zq4) ar4Var.l();
            or4 or4Var = (or4) ar4Var.u().l();
            or4Var.b();
            qr4.q((qr4) or4Var.d, z);
            zq4Var.b();
            ar4.p((ar4) zq4Var.d, (qr4) or4Var.a());
            ar4 ar4Var2 = (ar4) zq4Var.a();
            lr4 lr4Var = (lr4) this.c;
            if (j != 0) {
                kr4 kr4Var = (kr4) lr4Var.l();
                kr4Var.e(j);
                lr4Var = (lr4) kr4Var.a();
            }
            u(ar4Var2, lr4Var);
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void o(ar4 ar4Var, int i, long j, boolean z) {
        try {
            kr4 kr4Var = (kr4) ((lr4) this.c).l();
            kr4Var.b();
            lr4.C((lr4) kr4Var.d, i);
            this.c = (lr4) kr4Var.a();
            zq4 zq4Var = (zq4) ar4Var.l();
            or4 or4Var = (or4) ar4Var.u().l();
            or4Var.b();
            qr4.q((qr4) or4Var.d, z);
            zq4Var.b();
            ar4.p((ar4) zq4Var.d, (qr4) or4Var.a());
            ar4 ar4Var2 = (ar4) zq4Var.a();
            lr4 lr4Var = (lr4) this.c;
            if (j != 0) {
                kr4 kr4Var2 = (kr4) lr4Var.l();
                kr4Var2.e(j);
                lr4Var = (lr4) kr4Var2.a();
            }
            u(ar4Var2, lr4Var);
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void p(fr4 fr4Var) {
        try {
            rr4 rr4VarR = sr4.r();
            rr4VarR.c((lr4) this.c);
            rr4VarR.b();
            sr4.u((sr4) rr4VarR.d, fr4Var);
            ((wu) this.d).n((sr4) rr4VarR.a());
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void q(fu fuVar, long j) {
        try {
            ir4 ir4VarP = jr4.p();
            ir4VarP.b();
            jr4.u((jr4) ir4VarP.d, 4);
            gr4 gr4Var = gr4.IN_APP_BILLING_RESULT_UPDATE_ACTION;
            ir4VarP.b();
            jr4.q((jr4) ir4VarP.d, gr4Var);
            if (fuVar != null) {
                dr4 dr4VarQ = er4.q();
                int i = fuVar.a;
                dr4VarQ.b();
                er4.p((er4) dr4VarQ.d, i);
                String str = fuVar.c;
                dr4VarQ.b();
                er4.s((er4) dr4VarQ.d, str);
                ir4VarP.b();
                jr4.r((jr4) ir4VarP.d, (er4) dr4VarQ.a());
            }
            rr4 rr4VarR = sr4.r();
            lr4 lr4Var = (lr4) this.c;
            if (j != 0) {
                kr4 kr4Var = (kr4) lr4Var.l();
                kr4Var.e(j);
                lr4Var = (lr4) kr4Var.a();
            }
            rr4VarR.c(lr4Var);
            rr4VarR.b();
            sr4.v((sr4) rr4VarR.d, (jr4) ir4VarP.a());
            ((wu) this.d).n((sr4) rr4VarR.a());
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void r(xr4 xr4Var) {
        try {
            rr4 rr4VarR = sr4.r();
            rr4VarR.c((lr4) this.c);
            ir4 ir4VarP = jr4.p();
            ir4VarP.b();
            jr4.s((jr4) ir4VarP.d);
            ir4VarP.b();
            jr4.u((jr4) ir4VarP.d, 2);
            ir4VarP.b();
            jr4.t((jr4) ir4VarP.d, xr4Var);
            rr4VarR.b();
            sr4.v((sr4) rr4VarR.d, (jr4) ir4VarP.a());
            ((wu) this.d).n((sr4) rr4VarR.a());
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void s(zr4 zr4Var) {
        try {
            wu wuVar = (wu) this.d;
            rr4 rr4VarR = sr4.r();
            rr4VarR.c((lr4) this.c);
            rr4VarR.b();
            sr4.p((sr4) rr4VarR.d, zr4Var);
            wuVar.n((sr4) rr4VarR.a());
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void t(as4 as4Var) {
        if (as4Var == null) {
            return;
        }
        try {
            rr4 rr4VarR = sr4.r();
            rr4VarR.c((lr4) this.c);
            rr4VarR.b();
            sr4.q((sr4) rr4VarR.d, as4Var);
            ((wu) this.d).n((sr4) rr4VarR.a());
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void u(ar4 ar4Var, lr4 lr4Var) {
        if (ar4Var == null) {
            return;
        }
        try {
            rr4 rr4VarR = sr4.r();
            rr4VarR.c(lr4Var);
            rr4VarR.b();
            sr4.s((sr4) rr4VarR.d, ar4Var);
            ((wu) this.d).n((sr4) rr4VarR.a());
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void v(cr4 cr4Var, lr4 lr4Var) {
        try {
            rr4 rr4VarR = sr4.r();
            rr4VarR.c(lr4Var);
            rr4VarR.b();
            sr4.t((sr4) rr4VarR.d, cr4Var);
            ((wu) this.d).n((sr4) rr4VarR.a());
        } catch (Throwable th) {
            tm4.i("BillingLogger", "Unable to log.", th);
        }
    }
}
