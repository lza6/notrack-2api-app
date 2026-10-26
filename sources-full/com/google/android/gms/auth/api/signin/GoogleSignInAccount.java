package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.p3;
import defpackage.py;
import defpackage.u41;
import defpackage.v0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends v0 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new p3(16);
    public final int c;
    public final String d;
    public final String h;
    public final String l;
    public final String m;
    public final Uri n;
    public String o;
    public final long p;
    public final String q;
    public final List r;
    public final String s;
    public final String t;
    public final HashSet u = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.c = i;
        this.d = str;
        this.h = str2;
        this.l = str3;
        this.m = str4;
        this.n = uri;
        this.o = str5;
        this.p = j;
        this.q = str6;
        this.r = arrayList;
        this.s = str7;
        this.t = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (TextUtils.isEmpty(string)) {
            u41.k("Given String is empty or null");
            return null;
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.o = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.q.equals(this.q)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.r);
        hashSet.addAll(googleSignInAccount.u);
        HashSet hashSet2 = new HashSet(this.r);
        hashSet2.addAll(this.u);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.q.hashCode() + 527;
        HashSet hashSet = new HashSet(this.r);
        hashSet.addAll(this.u);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        py.a0(parcel, 2, this.d);
        py.a0(parcel, 3, this.h);
        py.a0(parcel, 4, this.l);
        py.a0(parcel, 5, this.m);
        py.Z(parcel, 6, this.n, i);
        py.a0(parcel, 7, this.o);
        py.d0(parcel, 8, 8);
        parcel.writeLong(this.p);
        py.a0(parcel, 9, this.q);
        py.c0(parcel, 10, this.r);
        py.a0(parcel, 11, this.s);
        py.a0(parcel, 12, this.t);
        py.f0(parcel, iE0);
    }
}
