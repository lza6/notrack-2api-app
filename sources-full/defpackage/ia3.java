package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ia3 extends ww1 implements ne1 {
    public final /* synthetic */ e c;
    public final /* synthetic */ jp3 d;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ int l;
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ oe1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia3(e eVar, jp3 jp3Var, ArrayList arrayList, int i, ArrayList arrayList2, Integer num, oe1 oe1Var) {
        super(2);
        this.c = eVar;
        this.d = jp3Var;
        this.h = arrayList;
        this.l = i;
        this.m = arrayList2;
        this.n = num;
        this.o = oe1Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        Integer num;
        if ((i & 3) == 2) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        e eVar = this.c;
        jp3 jp3Var = this.d;
        tp1 tp1Var = new tp1(eVar, jp3Var);
        this.o.invoke(new is2(a.f(tp1Var, jp3Var.getLayoutDirection()), this.h.isEmpty() ? tp1Var.d() : jp3Var.q0(this.l), a.e(tp1Var, jp3Var.getLayoutDirection()), (this.m.isEmpty() || (num = this.n) == null) ? tp1Var.c() : jp3Var.q0(num.intValue())), ck0Var, 0);
    }
}
