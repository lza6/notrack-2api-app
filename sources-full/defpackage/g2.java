package defpackage;

import app.template.extension.BuildConfig;
import notrack.ai.data.account.AccountEnvelope;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ k2 d;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(so0 so0Var, String str, k2 k2Var) {
        super(2, so0Var);
        this.h = str;
        this.d = k2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(so0 so0Var, k2 k2Var, String str) {
        super(2, so0Var);
        this.d = k2Var;
        this.h = str;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        String str = this.h;
        k2 k2Var = this.d;
        switch (i) {
            case 0:
                return new g2(so0Var, str, k2Var);
            default:
                return new g2(so0Var, k2Var, str);
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
        }
        return ((g2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        String str = BuildConfig.VERSION_NAME;
        String str2 = this.h;
        k2 k2Var = this.d;
        switch (i) {
            case 0:
                fy2 fy2Var = k2Var.b;
                g13.O(obj);
                try {
                    String string = new JSONObject().put("do", "account.delete").put("password", str2).toString();
                    string.getClass();
                    vu vuVar = new vu();
                    vuVar.p(k2Var.c + "/api/account.php");
                    vuVar.m("X-Requested-With", "nt");
                    String strE = fy2Var.e();
                    if (strE != null) {
                        vuVar.m("Authorization", "Bearer ".concat(strE));
                    }
                    vuVar.o("POST", Options$Companion.create(string, k2Var.e));
                    l53 l53VarG = vuVar.g();
                    tn2 tn2Var = k2Var.a.d.k;
                    tn2Var.getClass();
                    f63 f63VarF = new y23(tn2Var, l53VarG).f();
                    try {
                        m33 m33Var = f63VarF.o;
                        String strL = m33Var != null ? m33Var.l() : null;
                        if (strL != null) {
                            str = strL;
                        }
                        AccountEnvelope accountEnvelopeB = k2.b(k2Var, str);
                        if (f63VarF.c() && accountEnvelopeB.getOk()) {
                            fy2Var.b();
                            m2 m2Var = m2.a;
                            f63VarF.close();
                            return m2Var;
                        }
                        String code = accountEnvelopeB.getCode();
                        if (code == null && (code = accountEnvelopeB.getError()) == null) {
                            code = "unknown";
                        }
                        n2 n2Var = new n2(code, accountEnvelopeB.getMessage(), null);
                        f63VarF.close();
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
            default:
                fy2 fy2Var2 = k2Var.b;
                g13.O(obj);
                try {
                    vu vuVar2 = new vu();
                    vuVar2.p(k2Var.c + "/api/account.php");
                    vuVar2.m("X-Requested-With", "nt");
                    String string2 = new JSONObject().put("do", "oauth.exchange").put("code", str2).toString();
                    string2.getClass();
                    vuVar2.o("POST", Options$Companion.create(string2, k2Var.e));
                    l53 l53VarG2 = vuVar2.g();
                    tn2 tn2Var2 = k2Var.a.d.k;
                    tn2Var2.getClass();
                    f63 f63VarF2 = new y23(tn2Var2, l53VarG2).f();
                    try {
                        if (f63VarF2.l == 503) {
                            l2 l2Var = l2.a;
                            f63VarF2.close();
                            return l2Var;
                        }
                        m33 m33Var2 = f63VarF2.o;
                        String strL2 = m33Var2 != null ? m33Var2.l() : null;
                        if (strL2 != null) {
                            str = strL2;
                        }
                        AccountEnvelope accountEnvelopeB2 = k2.b(k2Var, str);
                        if (f63VarF2.c() && accountEnvelopeB2.getOk()) {
                            String strC = k2.c(k2Var, f63VarF2.n.k());
                            if (strC != null) {
                                fy2Var2.j(strC);
                            }
                            fy2Var2.h(accountEnvelopeB2.getEntitlements());
                            String recoveryCode = accountEnvelopeB2.getRecoveryCode();
                            Object q2Var = (!accountEnvelopeB2.getCreated() || recoveryCode == null || mo3.C0(recoveryCode)) ? new q2(accountEnvelopeB2.getEntitlements()) : new p2(accountEnvelopeB2.getEntitlements(), recoveryCode);
                            f63VarF2.close();
                            return q2Var;
                        }
                        String code2 = accountEnvelopeB2.getCode();
                        if (code2 == null && (code2 = accountEnvelopeB2.getError()) == null) {
                            code2 = "bad_code";
                        }
                        n2 n2Var2 = new n2(code2, accountEnvelopeB2.getMessage(), null);
                        f63VarF2.close();
                        return n2Var2;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jr1.i(f63VarF2, th3);
                            throw th4;
                        }
                    }
                } catch (Exception e2) {
                    return new o2(e2.getMessage());
                }
        }
    }
}
