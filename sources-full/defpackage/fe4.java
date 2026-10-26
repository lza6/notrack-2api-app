package defpackage;

import java.util.regex.Pattern;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class fe4 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ge4 d;
    public final /* synthetic */ String h;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe4(ge4 ge4Var, String str, String str2, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = ge4Var;
        this.h = str;
        this.l = str2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new fe4(this.d, this.h, this.l, so0Var, 0);
            default:
                return new fe4(this.d, this.h, this.l, so0Var, 1);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                return ((fe4) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            default:
                ((fe4) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zC;
        int i = this.c;
        String str = this.l;
        String str2 = this.h;
        ge4 ge4Var = this.d;
        switch (i) {
            case 0:
                g13.O(obj);
                String str3 = "{\"chat_id\":" + ge4.a(ge4Var, str2) + ",\"voice\":" + ge4.a(ge4Var, str) + "}";
                try {
                    tn2 tn2Var = ge4Var.a.d.k;
                    vu vuVar = new vu();
                    vuVar.p(ge4Var.b + "/speak.php?do=setvoice");
                    Pattern pattern = ac2.d;
                    vuVar.o("POST", Options$Companion.create(str3, Options$Companion.get("application/json")));
                    l53 l53VarG = vuVar.g();
                    tn2Var.getClass();
                    f63 f63VarF = new y23(tn2Var, l53VarG).f();
                    try {
                        zC = f63VarF.c();
                        f63VarF.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            jr1.i(f63VarF, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused) {
                    zC = false;
                }
                return Boolean.valueOf(zC);
            default:
                g13.O(obj);
                StringBuilder sb = new StringBuilder("{\"chat_id\":");
                sb.append(ge4.a(ge4Var, str2));
                if (str != null && str.length() != 0) {
                    sb.append(",\"token\":");
                    sb.append(ge4.a(ge4Var, str));
                }
                sb.append('}');
                String string = sb.toString();
                try {
                    tn2 tn2Var2 = ge4Var.a.d.k;
                    vu vuVar2 = new vu();
                    vuVar2.p(ge4Var.b + "/speak.php?do=stop");
                    Pattern pattern2 = ac2.d;
                    vuVar2.o("POST", Options$Companion.create(string, Options$Companion.get("application/json")));
                    l53 l53VarG2 = vuVar2.g();
                    tn2Var2.getClass();
                    new y23(tn2Var2, l53VarG2).f().close();
                    break;
                } catch (Exception unused2) {
                }
                return w84.a;
        }
    }
}
