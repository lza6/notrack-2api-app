package defpackage;

import app.template.extension.BuildConfig;
import notrack.ai.data.account.AccountEnvelope;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String h;
    public final /* synthetic */ k2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(String str, String str2, k2 k2Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 1;
        this.d = str;
        this.h = str2;
        this.l = k2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(so0 so0Var, String str, String str2, k2 k2Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = str;
        this.h = str2;
        this.l = k2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new i2(so0Var, this.d, this.h, this.l, 0);
            case 1:
                return new i2(this.d, this.h, this.l, so0Var);
            default:
                return new i2(so0Var, this.d, this.h, this.l, 2);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((i2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object n2Var;
        int i = this.c;
        l2 l2Var = l2.a;
        String str = BuildConfig.VERSION_NAME;
        String str2 = this.h;
        String str3 = this.d;
        k2 k2Var = this.l;
        switch (i) {
            case 0:
                fy2 fy2Var = k2Var.b;
                g13.O(obj);
                try {
                    String string = new JSONObject().put("do", "login").put("nickname", str3).put("password", str2).put("device", k2.a(k2Var)).toString();
                    string.getClass();
                    vu vuVar = new vu();
                    vuVar.p(k2Var.c + "/api/account.php");
                    vuVar.m("X-Requested-With", "nt");
                    vuVar.o("POST", Options$Companion.create(string, k2Var.e));
                    l53 l53VarG = vuVar.g();
                    tn2 tn2Var = k2Var.a.d.k;
                    tn2Var.getClass();
                    f63 f63VarF = new y23(tn2Var, l53VarG).f();
                    try {
                        if (f63VarF.l == 503) {
                            f63VarF.close();
                            return l2Var;
                        }
                        m33 m33Var = f63VarF.o;
                        String strL = m33Var != null ? m33Var.l() : null;
                        if (strL != null) {
                            str = strL;
                        }
                        AccountEnvelope accountEnvelopeB = k2.b(k2Var, str);
                        if (f63VarF.c() && accountEnvelopeB.getOk()) {
                            String strC = k2.c(k2Var, f63VarF.n.k());
                            if (strC != null) {
                                fy2Var.j(strC);
                            }
                            fy2Var.h(accountEnvelopeB.getEntitlements());
                            n2Var = new q2(accountEnvelopeB.getEntitlements());
                            f63VarF.close();
                        } else {
                            String code = accountEnvelopeB.getCode();
                            if (code == null && (code = accountEnvelopeB.getError()) == null) {
                                code = "unknown";
                            }
                            n2Var = new n2(code, accountEnvelopeB.getMessage(), null);
                            f63VarF.close();
                        }
                        return n2Var;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            jr1.i(f63VarF, th);
                            throw th2;
                        }
                    }
                } catch (Exception e) {
                    return new o2(e.getMessage());
                }
            case 1:
                fy2 fy2Var2 = k2Var.b;
                g13.O(obj);
                try {
                    String string2 = new JSONObject().put("do", "play.verify").put("purchase_token", str3).put("product_id", str2).put("package_name", "ai.notrack.app").toString();
                    string2.getClass();
                    vu vuVar2 = new vu();
                    vuVar2.p(k2Var.c + "/api/account.php");
                    vuVar2.m("X-Requested-With", "nt");
                    String strE = fy2Var2.e();
                    if (strE != null) {
                        vuVar2.m("Authorization", "Bearer ".concat(strE));
                    }
                    vuVar2.o("POST", Options$Companion.create(string2, k2Var.e));
                    l53 l53VarG2 = vuVar2.g();
                    tn2 tn2Var2 = k2Var.a.d.k;
                    tn2Var2.getClass();
                    f63 f63VarF2 = new y23(tn2Var2, l53VarG2).f();
                    try {
                        m33 m33Var2 = f63VarF2.o;
                        String strL2 = m33Var2 != null ? m33Var2.l() : null;
                        if (strL2 != null) {
                            str = strL2;
                        }
                        AccountEnvelope accountEnvelopeB2 = k2.b(k2Var, str);
                        if (f63VarF2.c() && accountEnvelopeB2.getOk()) {
                            fy2Var2.h(accountEnvelopeB2.getEntitlements());
                            String strOptString = new JSONObject(str).optString("plan");
                            strOptString.getClass();
                            if (mo3.C0(strOptString)) {
                                strOptString = null;
                            }
                            f63VarF2.close();
                            return strOptString;
                        }
                        f63VarF2.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jr1.i(f63VarF2, th3);
                            throw th4;
                        }
                    }
                } catch (Exception unused) {
                }
                return null;
            default:
                fy2 fy2Var3 = k2Var.b;
                g13.O(obj);
                try {
                    String string3 = new JSONObject().put("do", "register").put("nickname", str3).put("password", str2).put("device", k2.a(k2Var)).toString();
                    string3.getClass();
                    vu vuVar3 = new vu();
                    vuVar3.p(k2Var.c + "/api/account.php");
                    vuVar3.m("X-Requested-With", "nt");
                    vuVar3.o("POST", Options$Companion.create(string3, k2Var.e));
                    l53 l53VarG3 = vuVar3.g();
                    tn2 tn2Var3 = k2Var.a.d.k;
                    tn2Var3.getClass();
                    f63 f63VarF3 = new y23(tn2Var3, l53VarG3).f();
                    try {
                        if (f63VarF3.l == 503) {
                            f63VarF3.close();
                            return l2Var;
                        }
                        m33 m33Var3 = f63VarF3.o;
                        String strL3 = m33Var3 != null ? m33Var3.l() : null;
                        if (strL3 != null) {
                            str = strL3;
                        }
                        AccountEnvelope accountEnvelopeB3 = k2.b(k2Var, str);
                        if (f63VarF3.c() && accountEnvelopeB3.getOk()) {
                            String strC2 = k2.c(k2Var, f63VarF3.n.k());
                            if (strC2 != null) {
                                fy2Var3.j(strC2);
                            }
                            fy2Var3.h(accountEnvelopeB3.getEntitlements());
                            String recoveryCode = accountEnvelopeB3.getRecoveryCode();
                            if (recoveryCode != null && !mo3.C0(recoveryCode)) {
                                p2 p2Var = new p2(accountEnvelopeB3.getEntitlements(), recoveryCode);
                                f63VarF3.close();
                                return p2Var;
                            }
                            n2 n2Var2 = new n2("no_recovery_code", null, null);
                            f63VarF3.close();
                            return n2Var2;
                        }
                        String code2 = accountEnvelopeB3.getCode();
                        if (code2 == null && (code2 = accountEnvelopeB3.getError()) == null) {
                            code2 = "unknown";
                        }
                        n2 n2Var3 = new n2(code2, accountEnvelopeB3.getMessage(), accountEnvelopeB3.getSuggestion());
                        f63VarF3.close();
                        return n2Var3;
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            jr1.i(f63VarF3, th5);
                            throw th6;
                        }
                    }
                } catch (Exception e2) {
                    return new o2(e2.getMessage());
                }
        }
    }
}
