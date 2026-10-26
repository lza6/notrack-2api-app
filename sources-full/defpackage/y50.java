package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
import notrack.ai.data.api.DispatchRequest;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class y50 extends mq3 implements ne1 {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e60 h;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(e60 e60Var, String str, String str2, ArrayList arrayList, boolean z, boolean z2, String str3, String str4, so0 so0Var) {
        super(2, so0Var);
        this.h = e60Var;
        this.l = str;
        this.m = str2;
        this.n = arrayList;
        this.o = z;
        this.p = z2;
        this.q = str3;
        this.r = str4;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        y50 y50Var = new y50(this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, so0Var);
        y50Var.d = obj;
        return y50Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((y50) create((wz2) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        wz2 wz2Var = (wz2) this.d;
        int i = this.c;
        if (i == 0) {
            g13.O(obj);
            e60 e60Var = this.h;
            kt1 kt1Var = e60Var.j;
            qu1 qu1VarSerializer = DispatchRequest.Companion.serializer();
            String strQ = py.Q();
            String str = this.r;
            String strC = kt1Var.c(qu1VarSerializer, new DispatchRequest(this.l, this.m, this.n, this.o, this.p, this.q, strQ, (str == null || this.m != null || mo3.C0(str)) ? null : str, e60Var.m()));
            Pattern pattern = ac2.d;
            n53 n53VarCreate = Options$Companion.create(strC, Options$Companion.get("application/json"));
            vu vuVar = new vu();
            vuVar.p(e60Var.l + "/api/dispatch");
            vuVar.o("POST", n53VarCreate);
            l53 l53VarG = vuVar.g();
            tn2 tn2Var = e60Var.k;
            tn2Var.getClass();
            y23 y23Var = new y23(tn2Var, l53VarG);
            y23Var.e(new fp1(wz2Var, e60Var));
            t50 t50Var = new t50(y23Var, 1);
            this.d = null;
            this.c = 1;
            Object objG = sf3.g(wz2Var, t50Var, this);
            hq0 hq0Var = hq0.c;
            if (objG == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }
}
