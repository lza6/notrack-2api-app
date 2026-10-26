package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class la2 extends ww1 implements le1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ uz3 d;
    public final /* synthetic */ long h;
    public final /* synthetic */ Integer l;
    public final /* synthetic */ Integer m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ je1 r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la2(long j, uz3 uz3Var, long j2, Integer num, Integer num2, int i, int i2, boolean z, boolean z2, je1 je1Var, boolean z3, boolean z4) {
        super(1);
        this.c = j;
        this.d = uz3Var;
        this.h = j2;
        this.l = num;
        this.m = num2;
        this.n = i;
        this.o = i2;
        this.p = z;
        this.q = z2;
        this.r = je1Var;
        this.s = z3;
        this.t = z4;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        long j = re0.i;
        long jB = this.c;
        if (jB == j) {
            jB = this.d.b();
            if (jB == j) {
                jB = this.h;
            }
        }
        jr0 jr0Var = new jr0(context);
        Integer num = this.l;
        if (num != null) {
            jr0Var.setId(num.intValue());
        }
        Integer num2 = this.m;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            Context context2 = jr0Var.getContext();
            ThreadLocal threadLocal = b63.a;
            jr0Var.setTypeface(context2.isRestricted() ? null : b63.a(context2, iIntValue, new TypedValue(), 0, null, false));
        }
        jr0Var.setImportantForAccessibility(this.n);
        jr0Var.setMaxLines(this.o);
        jr0Var.setLinkTextColor(gb2.X(jB));
        jr0Var.setWrapMultilineTextWidth(this.p);
        jr0Var.setTextIsSelectable(this.q);
        jr0Var.setOnBlockClickListener(this.r);
        boolean z = this.s;
        jr0Var.setLinkClicksEnabled(!z);
        jr0Var.setMovementMethod(z ? null : LinkMovementMethod.getInstance());
        if (this.t) {
            jr0Var.addOnLayoutChangeListener(new qt3(jr0Var));
        }
        return jr0Var;
    }
}
