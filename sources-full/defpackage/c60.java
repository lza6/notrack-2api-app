package defpackage;

import java.util.regex.Pattern;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c60 extends mq3 implements le1 {
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String h;
    public final /* synthetic */ e60 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(String str, String str2, String str3, e60 e60Var, so0 so0Var) {
        super(1, so0Var);
        this.c = str;
        this.d = str2;
        this.h = str3;
        this.l = e60Var;
    }

    @Override // defpackage.wr
    public final so0 create(so0 so0Var) {
        return new c60(this.c, this.d, this.h, this.l, so0Var);
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) throws Throwable {
        c60 c60Var = (c60) create((so0) obj);
        w84 w84Var = w84.a;
        c60Var.invokeSuspend(w84Var);
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        e60 e60Var = this.l;
        g13.O(obj);
        try {
            String string = new JSONObject().put("reason", this.c).put("text", mo3.T0(4000, this.d)).put("lang", this.h).toString();
            string.getClass();
            vu vuVar = new vu();
            vuVar.p(e60Var.l + "/report.php");
            Pattern pattern = ac2.d;
            vuVar.o("POST", Options$Companion.create(string, Options$Companion.get("application/json")));
            l53 l53VarG = vuVar.g();
            tn2 tn2Var = e60Var.k;
            tn2Var.getClass();
            new y23(tn2Var, l53VarG).f().close();
        } catch (Exception unused) {
        }
        return w84.a;
    }
}
