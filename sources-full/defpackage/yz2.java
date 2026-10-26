package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yz2 {
    public final String a;
    public final String b;

    public yz2(JSONObject jSONObject) {
        this.b = jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        this.a = jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
