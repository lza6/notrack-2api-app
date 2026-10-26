package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dp implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String h;

    public /* synthetic */ dp(String str, String str2, int i) {
        this.c = i;
        this.d = str;
        this.h = str2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) throws JSONException {
        int i = this.c;
        w84 w84Var = w84.a;
        String str = this.h;
        String str2 = this.d;
        switch (i) {
            case 0:
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.getClass();
                jSONObject.put("slot", str2);
                jSONObject.put("avatar", str);
                break;
            default:
                gf3 gf3Var = (gf3) obj;
                gf3Var.getClass();
                if (str2 != null) {
                    str = str2;
                }
                ef3.f(gf3Var, str);
                break;
        }
        return w84Var;
    }
}
