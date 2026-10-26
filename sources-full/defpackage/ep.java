package defpackage;

import notrack.ai.data.chatmeta.ChatEntry;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ep implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ ep(String str, int i) {
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) throws JSONException {
        int i = this.c;
        w84 w84Var = w84.a;
        String str = this.d;
        switch (i) {
            case 0:
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.getClass();
                jSONObject.put("slot", str);
                return w84Var;
            case 1:
                gf3 gf3Var = (gf3) obj;
                gf3Var.getClass();
                ef3.f(gf3Var, str);
                return w84Var;
            case 2:
                gf3 gf3Var2 = (gf3) obj;
                gf3Var2.getClass();
                ef3.f(gf3Var2, str);
                return w84Var;
            case 3:
                ChatEntry chatEntry = (ChatEntry) obj;
                chatEntry.getClass();
                return ChatEntry.copy$default(chatEntry, this.d, false, null, 0L, 62);
            case 4:
                gf3 gf3Var3 = (gf3) obj;
                gf3Var3.getClass();
                ef3.f(gf3Var3, str);
                return w84Var;
            case 5:
                ChatEntry chatEntry2 = (ChatEntry) obj;
                chatEntry2.getClass();
                if (mo3.C0(str)) {
                    str = null;
                }
                return ChatEntry.copy$default(chatEntry2, null, false, str, 0L, 47);
            default:
                gf3 gf3Var4 = (gf3) obj;
                gf3Var4.getClass();
                ef3.f(gf3Var4, str);
                return w84Var;
        }
    }
}
