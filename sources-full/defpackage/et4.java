package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class et4 extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ ft4 c;

    public et4(ft4 ft4Var, boolean z) {
        this.c = ft4Var;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Bundle bundle, fu fuVar, int i, gr4 gr4Var, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            ft4 ft4Var = this.c;
            if (byteArray != null) {
                ((fy2) ft4Var.c).n(ar4.t(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((fy2) ft4Var.c).n(go4.b(23, i, fuVar, null, gr4Var), j, z);
            }
        } catch (Throwable unused) {
            tm4.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gr4 gr4Var;
        fu fuVarE;
        long j;
        fu fuVar;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        gr4 gr4Var2 = gr4.LOCAL_PURCHASES_UPDATED_ACTION;
        gr4 gr4Var3 = gr4.PURCHASES_UPDATED_ACTION;
        gr4 gr4Var4 = gr4.ALTERNATIVE_BILLING_ACTION;
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    gr4Var = gr4Var4;
                } else {
                    gr4Var = gr4.BROADCAST_ACTION_UNSPECIFIED;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                gr4Var = gr4Var2;
            } else {
                gr4Var = gr4.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            gr4Var = gr4Var3;
        } else {
            gr4Var = gr4.BROADCAST_ACTION_UNSPECIFIED;
        }
        int i = (gr4Var.equals(gr4Var2) || gr4Var.equals(gr4Var4)) ? 2 : gr4Var.equals(gr4Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        ft4 ft4Var = this.c;
        if (extras == null) {
            tm4.h("BillingBroadcastManager", "Bundle is null.");
            ho4 ho4Var = ft4Var.c;
            fu fuVar2 = jo4.f;
            ((fy2) ho4Var).l(go4.b(11, i, fuVar2, null, gr4Var));
            tw2 tw2Var = ft4Var.b;
            if (tw2Var != null) {
                tw2Var.d(fuVar2, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i2 = tm4.a;
            eu euVarA = fu.a();
            euVarA.c = tm4.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                tm4.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    tm4.g("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                } else {
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        tm4.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                    }
                    euVarA.d = iIntValue;
                    euVarA.h = tm4.f("BillingBroadcastManager", intent.getExtras());
                    fuVarE = euVarA.m();
                }
            }
            iIntValue = 0;
            euVarA.d = iIntValue;
            euVarA.h = tm4.f("BillingBroadcastManager", intent.getExtras());
            fuVarE = euVarA.m();
        } else {
            fuVarE = tm4.e(intent, "BillingBroadcastManager");
        }
        long j2 = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!gr4Var.equals(gr4Var3) && !gr4Var.equals(gr4Var2)) {
            if (gr4Var.equals(gr4Var4)) {
                if (fuVarE.a != 0) {
                    b(extras, fuVarE, i, gr4Var, j2, z);
                    tw2 tw2Var2 = ft4Var.b;
                    pm4 pm4Var = xm4.d;
                    tw2Var2.d(fuVarE, cn4.m);
                    return;
                }
                ft4Var.getClass();
                tm4.h("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                ho4 ho4Var2 = ft4Var.c;
                fu fuVar3 = jo4.f;
                ((fy2) ho4Var2).n(go4.b(141, i, fuVar3, null, gr4Var), j2, z);
                tw2 tw2Var3 = ft4Var.b;
                pm4 pm4Var2 = xm4.d;
                tw2Var3.d(fuVar3, cn4.m);
                return;
            }
            return;
        }
        zm4 zm4Var = ft4Var.g;
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j = 0;
            u13 u13VarJ = tm4.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"), zm4Var);
            if (u13VarJ == null) {
                tm4.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
            } else {
                arrayList.add(u13VarJ);
            }
        } else {
            j = 0;
            tm4.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i3 = 0; i3 < stringArrayList.size() && i3 < stringArrayList2.size(); i3++) {
                u13 u13VarJ2 = tm4.j(stringArrayList.get(i3), stringArrayList2.get(i3), zm4Var);
                if (u13VarJ2 != null) {
                    arrayList.add(u13VarJ2);
                }
            }
        }
        if (fuVarE.a == 0) {
            ho4 ho4Var3 = ft4Var.c;
            cr4 cr4VarC = go4.c(i, gr4Var);
            fy2 fy2Var = (fy2) ho4Var3;
            fy2Var.getClass();
            try {
                br4 br4Var = (br4) cr4VarC.l();
                or4 or4Var = (or4) cr4VarC.r().l();
                or4Var.b();
                qr4.q((qr4) or4Var.d, z);
                br4Var.b();
                cr4.t((cr4) br4Var.d, (qr4) or4Var.a());
                cr4 cr4Var = (cr4) br4Var.a();
                lr4 lr4Var = (lr4) fy2Var.c;
                if (j2 != j) {
                    kr4 kr4Var = (kr4) lr4Var.l();
                    kr4Var.e(j2);
                    lr4Var = (lr4) kr4Var.a();
                }
                fy2Var.v(cr4Var, lr4Var);
            } catch (Throwable th) {
                tm4.i("BillingLogger", "Unable to log.", th);
            }
            fuVar = fuVarE;
        } else {
            fuVar = fuVarE;
            b(extras, fuVar, i, gr4Var, j2, z);
        }
        ft4Var.b.d(fuVar, arrayList);
    }
}
