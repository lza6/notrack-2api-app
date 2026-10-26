package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import app.template.extension.BuildConfig;
import java.util.Arrays;
import java.util.Objects;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class an4 extends ck4 {
    public final rm4 e;
    public final Boolean f;
    public final int g;
    public final /* synthetic */ au h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an4(au auVar, rm4 rm4Var, Boolean bool, int i) {
        super("com.android.vending.billing.IInAppBillingInitializeCallback", 1);
        Objects.requireNonNull(auVar);
        this.h = auVar;
        this.e = rm4Var;
        this.f = bool;
        this.g = i;
    }

    @Override // defpackage.ck4
    public final boolean g(Parcel parcel, int i) {
        zm4 jn4Var;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) bm4.a(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(ud2.m(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        if (bundle == null) {
            tm4.h("BillingClient", "Response bundle is null.");
            i(this.e, jo4.f, 122, this.f.booleanValue(), null, this.g);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            tm4.h("BillingClient", "Response bundle doesn't contain a response code");
            i(this.e, jo4.f, 129, this.f.booleanValue(), null, this.g);
            return true;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            i(this.e, jo4.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", BuildConfig.VERSION_NAME)), 130, this.f.booleanValue(), ud2.m(bundle.getInt("RESPONSE_CODE"), "Response code from Phonesky: "), this.g);
            return true;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            tm4.h("BillingClient", "Billing API version not found in response bundle.");
            i(this.e, jo4.f, Uuid.SIZE_BITS, this.f.booleanValue(), null, this.g);
            return true;
        }
        int i2 = bundle.getInt("BILLING_API_VERSION_KEY");
        au auVar = this.h;
        au.k(auVar, i2);
        auVar.k = i2 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
            } catch (Throwable th) {
                tm4.i("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th);
            }
            try {
                bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th2) {
                tm4.i("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                ki4.a = bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th3) {
                tm4.i("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                ki4.b = bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
            } catch (Throwable th4) {
                tm4.i("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th4);
            }
            try {
                ki4.c = bundle2.getBoolean("ENABLE_DEDUPLICATE_SERVICE_DISCONNECTED_CALLBACK");
            } catch (Throwable th5) {
                tm4.i("BillingClient", "Error reading EnableDeduplicateServiceDisconnectedCallback experiment flag: ".concat(bundle2.toString()), th5);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            Object[] objArrCopyOf = new Object[4];
            int i3 = 0;
            for (ap4 ap4Var : ap4.values()) {
                if (bundle3.getBoolean(ap4Var.name(), false)) {
                    int length = objArrCopyOf.length;
                    int i4 = i3 + 1;
                    int iC = bh4.c(length, i4);
                    if (iC > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iC);
                    }
                    objArrCopyOf[i3] = ap4Var;
                    i3 = i4;
                }
            }
            au auVar2 = this.h;
            if (i3 == 0) {
                jn4Var = in4.r;
            } else if (i3 != 1) {
                jn4Var = zm4.o(i3, objArrCopyOf);
                jn4Var.size();
            } else {
                Object obj = objArrCopyOf[0];
                Objects.requireNonNull(obj);
                jn4Var = new jn4(obj);
            }
            auVar2.z = jn4Var;
            if (auVar2.f != null) {
                auVar2.f.g = auVar2.z;
            }
        }
        au auVar3 = this.h;
        if (auVar3.l < 3) {
            tm4.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
            i(this.e, jo4.a, 36, this.f.booleanValue(), null, this.g);
        } else {
            rm4 rm4Var = this.e;
            Boolean bool = this.f;
            int i5 = this.g;
            boolean zBooleanValue = bool.booleanValue();
            au.l(auVar3, 0);
            synchronized (auVar3.a) {
                try {
                    if (auVar3.b != 3) {
                        rm4Var.c(i5, zBooleanValue);
                        rm4Var.d(jo4.g);
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }
        return true;
    }

    public final void i(rm4 rm4Var, fu fuVar, int i, boolean z, String str, int i2) {
        this.h.v(0);
        rm4Var.b(fuVar, i, str, z, i2);
        rm4Var.d(fuVar);
    }
}
