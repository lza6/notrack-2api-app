package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import app.template.extension.BuildConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class to4 extends BroadcastReceiver {
    public fu a;
    public boolean b = false;
    public final ho4 c;

    public to4(fy2 fy2Var) {
        this.c = fy2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            tm4.h("ProxyBillingReceiver", "Null intent!");
            return;
        }
        tm4.g("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        boolean zEquals = Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
        ho4 ho4Var = this.c;
        if (zEquals) {
            if (!intent.hasExtra("RESPONSE_CODE")) {
                tm4.h("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
                if (ho4Var != null) {
                    ((fy2) ho4Var).q(null, intent.getLongExtra("billingClientTransactionId", 0L));
                    return;
                }
                return;
            }
            eu euVarA = fu.a();
            euVarA.c = intent.getIntExtra("RESPONSE_CODE", 0);
            String stringExtra = intent.getStringExtra("DEBUG_MESSAGE");
            if (stringExtra == null) {
                stringExtra = BuildConfig.VERSION_NAME;
            }
            euVarA.h = stringExtra;
            fu fuVarM = euVarA.m();
            this.a = fuVarM;
            if (ho4Var != null) {
                ((fy2) ho4Var).q(fuVarM, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
            tm4.h("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
            return;
        }
        this.b = true;
        if (ho4Var != null) {
            long longExtra = intent.getLongExtra("billingClientTransactionId", 0L);
            fy2 fy2Var = (fy2) ho4Var;
            try {
                ir4 ir4VarP = jr4.p();
                ir4VarP.b();
                jr4.u((jr4) ir4VarP.d, 4);
                gr4 gr4Var = gr4.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                ir4VarP.b();
                jr4.q((jr4) ir4VarP.d, gr4Var);
                jr4 jr4Var = (jr4) ir4VarP.a();
                rr4 rr4VarR = sr4.r();
                lr4 lr4Var = (lr4) fy2Var.c;
                if (longExtra != 0) {
                    kr4 kr4Var = (kr4) lr4Var.l();
                    kr4Var.e(longExtra);
                    lr4Var = (lr4) kr4Var.a();
                }
                rr4VarR.c(lr4Var);
                rr4VarR.b();
                sr4.v((sr4) rr4VarR.d, jr4Var);
                ((wu) fy2Var.d).n((sr4) rr4VarR.a());
            } catch (Throwable th) {
                tm4.i("BillingLogger", "Unable to log.", th);
            }
        }
    }
}
