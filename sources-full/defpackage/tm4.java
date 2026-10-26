package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public abstract class tm4 {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        h(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", "9.1.0");
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(int i, fu fuVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", fuVar.a);
        bundle.putString("DEBUG_MESSAGE", fuVar.c);
        bundle.putInt("LOG_REASON", ud2.e(i));
        return bundle;
    }

    public static Bundle d(String str, ArrayList arrayList, zf3 zf3Var, long j) {
        Bundle bundle = new Bundle();
        b(bundle, str, j);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        pm4 pm4Var = xm4.d;
        Object[] objArr = {"subs", "inapp"};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                m51.x(ud2.m(i, "at index "));
                return null;
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(xm4.n(2, objArr)));
        Object[] objArr2 = {"inapp"};
        for (int i2 = 0; i2 < 1; i2++) {
            if (objArr2[i2] == null) {
                m51.x(ud2.m(i2, "at index "));
                return null;
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(xm4.n(1, objArr2)));
        Object[] objArr3 = {"inapp"};
        for (int i3 = 0; i3 < 1; i3++) {
            if (objArr3[i3] == null) {
                m51.x(ud2.m(i3, "at index "));
                return null;
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(xm4.n(1, objArr3)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            d23 d23Var = (d23) arrayList.get(i4);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            d23Var.getClass();
            arrayList4.add(null);
            z2 |= !TextUtils.isEmpty(null);
            if (d23Var.b.equals("first_party")) {
                m51.x("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                return null;
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z2) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static fu e(Intent intent, String str) {
        if (intent != null) {
            eu euVarA = fu.a();
            euVarA.c = a(str, intent.getExtras());
            euVarA.h = f(str, intent.getExtras());
            return euVarA.m();
        }
        h("BillingHelper", "Got null intent!");
        eu euVarA2 = fu.a();
        euVarA2.c = 6;
        euVarA2.h = "An internal error occurred.";
        return euVarA2.m();
    }

    public static String f(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return BuildConfig.VERSION_NAME;
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return BuildConfig.VERSION_NAME;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        h(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return BuildConfig.VERSION_NAME;
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i -= iMin;
            }
        }
    }

    public static void h(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static u13 j(String str, String str2, Set set) {
        u13 u13Var = null;
        if (str == null || str2 == null) {
            g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            u13 u13Var2 = new u13(str, str2);
            try {
                set.isEmpty();
                return u13Var2;
            } catch (JSONException e) {
                e = e;
                u13Var = u13Var2;
                h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return u13Var;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }
}
