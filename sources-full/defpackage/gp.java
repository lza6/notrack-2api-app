package defpackage;

import app.template.extension.BuildConfig;
import java.util.regex.Pattern;
import notrack.ai.data.avatars.AvatarCatalogue;
import notrack.ai.data.avatars.AvatarView;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gp {
    public final g50 a;
    public final g50 b;
    public final String c;
    public final kt1 d;
    public final ac2 e;
    public volatile AvatarCatalogue f;
    public volatile long g;
    public volatile String h;

    public gp(g50 g50Var, g50 g50Var2, String str) {
        str.getClass();
        this.a = g50Var;
        this.b = g50Var2;
        this.c = str;
        this.d = xr0.G(new f2(3));
        Pattern pattern = ac2.d;
        this.e = Options$Companion.get("application/json; charset=utf-8");
        this.h = BuildConfig.VERSION_NAME;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    public static final vq a(gp gpVar, int i, boolean z, String str) {
        Object i63Var;
        Object i63Var2;
        AvatarView avatarView;
        if (i == 401) {
            return sq.a;
        }
        if (i == 402) {
            return uq.a;
        }
        if (i == 413) {
            return new rq("too_large");
        }
        try {
            i63Var = new JSONObject(str);
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        boolean z2 = i63Var instanceof i63;
        Object obj = i63Var;
        if (z2) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (!z || jSONObject == null || !jSONObject.optBoolean("ok")) {
            String strOptString = jSONObject != null ? jSONObject.optString("error") : null;
            if (strOptString == null) {
                strOptString = BuildConfig.VERSION_NAME;
            }
            if (mo3.C0(strOptString)) {
                strOptString = ud2.m(i, "http_");
            }
            return new rq(strOptString);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("view");
        if (jSONObjectOptJSONObject != null) {
            try {
                kt1 kt1Var = gpVar.d;
                qu1 qu1VarSerializer = AvatarView.Companion.serializer();
                String string = jSONObjectOptJSONObject.toString();
                string.getClass();
                i63Var2 = (AvatarView) kt1Var.b(qu1VarSerializer, string);
            } catch (Throwable th2) {
                i63Var2 = new i63(th2);
            }
            avatarView = (AvatarView) (i63Var2 instanceof i63 ? null : i63Var2);
            if (avatarView == null) {
                String strOptString2 = jSONObject.optString("slot", "me");
                strOptString2.getClass();
                avatarView = new AvatarView(null, strOptString2, null, null, null, null, null, null, 509);
            }
        } else {
            String strOptString3 = jSONObject.optString("slot", "me");
            strOptString3.getClass();
            avatarView = new AvatarView(null, strOptString3, null, null, null, null, null, null, 509);
        }
        return new tq(avatarView);
    }
}
