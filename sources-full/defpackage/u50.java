package defpackage;

import app.template.extension.BuildConfig;
import java.net.URLEncoder;
import java.util.regex.Pattern;
import okhttp3.Protocol$Companion;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u50 extends mq3 implements ne1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ e60 l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(String str, boolean z, e60 e60Var, String str2, so0 so0Var) {
        super(2, so0Var);
        this.d = str;
        this.h = z;
        this.l = e60Var;
        this.m = str2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        u50 u50Var = new u50(this.d, this.h, this.l, this.m, so0Var);
        u50Var.c = obj;
        return u50Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((u50) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object i63Var;
        String strOptString;
        Object a20Var;
        z10 z10Var = z10.a;
        g13.O(obj);
        String string = new JSONObject().put("op", "carry_start").put("text", this.d).put("keep_instr", this.h).toString();
        string.getClass();
        Pattern pattern = ac2.d;
        n53 n53VarCreate = Options$Companion.create(string, Options$Companion.get("application/json; charset=utf-8"));
        vu vuVar = new vu();
        e60 e60Var = this.l;
        vuVar.p(e60Var.l + "/api/chat?id=" + URLEncoder.encode(this.m, "UTF-8"));
        vuVar.o("POST", n53VarCreate);
        l53 l53VarG = vuVar.g();
        try {
            tn2 tn2Var = e60Var.k;
            tn2Var.getClass();
            f63 f63VarF = new y23(tn2Var, l53VarG).f();
            try {
                m33 m33Var = f63VarF.o;
                String strL = m33Var != null ? m33Var.l() : null;
                if (strL == null) {
                    strL = BuildConfig.VERSION_NAME;
                }
                try {
                    i63Var = new JSONObject(strL);
                } catch (Throwable th) {
                    i63Var = new i63(th);
                }
                boolean z = i63Var instanceof i63;
                Object obj2 = i63Var;
                if (z) {
                    obj2 = null;
                }
                JSONObject jSONObject = (JSONObject) obj2;
                int i = f63VarF.l;
                if (i != 200) {
                    if (i == 413) {
                        a20Var = new c20(jSONObject != null ? jSONObject.optInt("max") : 0);
                    } else if (i == 422) {
                        a20Var = z10.b;
                    } else if (i != 429) {
                        a20Var = z10Var;
                    } else {
                        a20Var = new b20(jSONObject != null ? Protocol$Companion.parse(jSONObject) : null);
                    }
                } else if (jSONObject == null || (strOptString = jSONObject.optString("chat_id")) == null) {
                    a20Var = z10Var;
                } else {
                    String str = mo3.C0(strOptString) ? null : strOptString;
                    if (str != null) {
                        String strOptString2 = jSONObject.optString("title");
                        strOptString2.getClass();
                        a20Var = new a20(str, strOptString2);
                    } else {
                        a20Var = z10Var;
                    }
                }
                f63VarF.close();
                return a20Var;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    jr1.i(f63VarF, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return z10Var;
        }
    }
}
