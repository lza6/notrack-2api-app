package defpackage;

import app.template.extension.BuildConfig;
import notrack.ai.data.account.AccountEnvelope;
import notrack.ai.data.account.Entitlements;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ k2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(so0 so0Var, k2 k2Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = k2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        k2 k2Var = this.d;
        switch (i) {
            case 0:
                return new j2(so0Var, k2Var, 0);
            default:
                return new j2(so0Var, k2Var, 1);
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
        return ((j2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object q2Var;
        int i = this.c;
        k2 k2Var = this.d;
        switch (i) {
            case 0:
                fy2 fy2Var = k2Var.b;
                g13.O(obj);
                try {
                    String strE = fy2Var.e();
                    try {
                        vu vuVar = new vu();
                        vuVar.p(k2Var.c + "/api/account.php");
                        vuVar.m("X-Requested-With", "nt");
                        if (strE != null) {
                            vuVar.m("Authorization", "Bearer ".concat(strE));
                        }
                        String string = new JSONObject().put("do", "logout").toString();
                        string.getClass();
                        vuVar.o("POST", Options$Companion.create(string, k2Var.e));
                        l53 l53VarG = vuVar.g();
                        tn2 tn2Var = k2Var.a.d.k;
                        tn2Var.getClass();
                        new y23(tn2Var, l53VarG).f().close();
                        break;
                    } catch (Exception unused) {
                    }
                    fy2Var.b();
                    Entitlements.Companion.getClass();
                    return new q2(Entitlements.ANONYMOUS);
                } catch (Exception e) {
                    return new o2(e.getMessage());
                }
            default:
                fy2 fy2Var2 = k2Var.b;
                g13.O(obj);
                try {
                    vu vuVar2 = new vu();
                    vuVar2.p(k2Var.c + "/api/account.php?do=me");
                    vuVar2.h();
                    String strE2 = fy2Var2.e();
                    if (strE2 != null) {
                        vuVar2.m("Authorization", "Bearer ".concat(strE2));
                    }
                    tn2 tn2Var2 = k2Var.a.d.k;
                    l53 l53VarG2 = vuVar2.g();
                    tn2Var2.getClass();
                    f63 f63VarF = new y23(tn2Var2, l53VarG2).f();
                    try {
                        int i2 = f63VarF.l;
                        if (i2 == 503) {
                            l2 l2Var = l2.a;
                            f63VarF.close();
                            return l2Var;
                        }
                        m33 m33Var = f63VarF.o;
                        String strL = m33Var != null ? m33Var.l() : null;
                        if (strL == null) {
                            strL = BuildConfig.VERSION_NAME;
                        }
                        AccountEnvelope accountEnvelopeB = k2.b(k2Var, strL);
                        if (f63VarF.c()) {
                            if (!accountEnvelopeB.getEntitlements().getSignedIn() && fy2Var2.e() != null) {
                                fy2Var2.b();
                            }
                            fy2Var2.h(accountEnvelopeB.getEntitlements());
                            q2Var = new q2(accountEnvelopeB.getEntitlements());
                            f63VarF.close();
                        } else {
                            String code = accountEnvelopeB.getCode();
                            if (code == null) {
                                code = "http_" + i2;
                            }
                            q2Var = new n2(code, accountEnvelopeB.getMessage(), null);
                            f63VarF.close();
                        }
                        return q2Var;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            jr1.i(f63VarF, th);
                            throw th2;
                        }
                    }
                } catch (Exception e2) {
                    return new o2(e2.getMessage());
                }
        }
    }
}
