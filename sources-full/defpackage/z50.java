package defpackage;

import app.template.extension.BuildConfig;
import java.util.regex.Pattern;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z50 extends mq3 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String h;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ e60 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z50(String str, String str2, String str3, String str4, e60 e60Var, so0 so0Var, int i) {
        super(1, so0Var);
        this.c = i;
        this.d = str;
        this.h = str2;
        this.l = str3;
        this.m = str4;
        this.n = e60Var;
    }

    @Override // defpackage.wr
    public final so0 create(so0 so0Var) {
        switch (this.c) {
            case 0:
                return new z50(this.d, this.h, this.l, this.m, this.n, so0Var, 0);
            default:
                return new z50(this.d, this.h, this.l, this.m, this.n, so0Var, 1);
        }
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        so0 so0Var = (so0) obj;
        switch (i) {
            case 0:
                ((z50) create(so0Var)).invokeSuspend(w84Var);
                break;
            default:
                ((z50) create(so0Var)).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        String str = this.m;
        String str2 = this.l;
        String str3 = this.h;
        String str4 = this.d;
        e60 e60Var = this.n;
        switch (i) {
            case 0:
                g13.O(obj);
                try {
                    String string = new JSONObject().put("e", str4).put("p", str3).put("loc", py.Q()).put("cc", BuildConfig.VERSION_NAME).put("tier", BuildConfig.VERSION_NAME).put("offer", str2).put("qa", 0).put("v", str).toString();
                    string.getClass();
                    vu vuVar = new vu();
                    vuVar.p(e60Var.l + "/promo_log.php");
                    Pattern pattern = ac2.d;
                    vuVar.o("POST", Options$Companion.create(string, Options$Companion.get("application/json")));
                    l53 l53VarG = vuVar.g();
                    tn2 tn2Var = e60Var.k;
                    tn2Var.getClass();
                    new y23(tn2Var, l53VarG).f().close();
                } catch (Exception unused) {
                }
                break;
            default:
                g13.O(obj);
                try {
                    String str5 = "{\"e\":\"" + str4 + "\",\"p\":\"" + str3 + "\",\"s\":\"" + str2 + "\",\"loc\":\"" + str + "\",\"cc\":\"\",\"tier\":\"low\",\"offer\":\"own\",\"qa\":0,\"v\":\"app\"}";
                    vu vuVar2 = new vu();
                    vuVar2.p(e60Var.l + "/promo_log.php");
                    Pattern pattern2 = ac2.d;
                    vuVar2.o("POST", Options$Companion.create(str5, Options$Companion.get("application/json")));
                    l53 l53VarG2 = vuVar2.g();
                    tn2 tn2Var2 = e60Var.k;
                    tn2Var2.getClass();
                    new y23(tn2Var2, l53VarG2).f().close();
                } catch (Exception unused2) {
                }
                break;
        }
        return w84Var;
        return w84Var;
    }
}
