package defpackage;

import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class l9 extends ww1 implements pe1 {
    public final /* synthetic */ m9 c;
    public final /* synthetic */ ux1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(m9 m9Var, ux1 ux1Var) {
        super(4);
        this.c = m9Var;
        this.d = ux1Var;
    }

    @Override // defpackage.pe1
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        m9 m9Var = this.c;
        m9Var.f.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        sz0 sz0Var = m9Var.a;
        ((AutofillManager) sz0Var.c).requestAutofill(m9Var.c, this.d.d, m9Var.f);
        return w84.a;
    }
}
