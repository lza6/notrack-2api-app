package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zz2 {
    public final String a;
    public final String b;
    public final sh1 c;

    public zz2(JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.optString("basePlanId");
        jSONObject.optString("offerId").getClass();
        this.b = jSONObject.getString("offerIdToken");
        this.c = new sh1(jSONObject.getJSONArray("pricingPhases"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.getInt("commitmentPaymentsCount");
            jSONObjectOptJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getString("productId");
            jSONObjectOptJSONObject2.optString("title");
            jSONObjectOptJSONObject2.optString("name");
            jSONObjectOptJSONObject2.optString("description");
            jSONObjectOptJSONObject2.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.optString("billingPeriod");
                jSONObjectOptJSONObject3.optString("priceCurrencyCode");
                jSONObjectOptJSONObject3.optString("formattedPrice");
                jSONObjectOptJSONObject3.optLong("priceAmountMicros");
                jSONObjectOptJSONObject3.optInt("recurrenceMode");
                jSONObjectOptJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
        }
    }
}
