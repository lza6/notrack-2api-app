package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* JADX INFO: loaded from: classes.dex */
public final class a03 {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ArrayList i;
    public final ArrayList j;

    public a03(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.c = strOptString;
        String strOptString2 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
        this.d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            u41.k("Product id cannot be empty.");
            throw null;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            u41.k("Product type cannot be empty.");
            throw null;
        }
        this.e = jSONObject.optString("title");
        this.f = jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.g = jSONObject.optString("skuDetailsToken");
        this.h = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new zz2(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.i = arrayList;
        } else {
            this.i = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new xz2(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.j = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.j = null;
        } else {
            arrayList2.add(new xz2(jSONObjectOptJSONObject));
            this.j = arrayList2;
        }
    }

    public final xz2 a() {
        ArrayList arrayList = this.j;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (xz2) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a03) {
            return TextUtils.equals(this.a, ((a03) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String string = this.b.toString();
        String strValueOf = String.valueOf(this.i);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        ud2.v(sb, this.a, "', parsedJson=", string, ", productId='");
        sb.append(this.c);
        sb.append("', productType='");
        sb.append(this.d);
        sb.append("', title='");
        sb.append(this.e);
        sb.append("', productDetailsToken='");
        sb.append(this.g);
        sb.append("', subscriptionOfferDetails=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
