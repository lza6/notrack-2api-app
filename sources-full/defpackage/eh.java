package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eh extends ww1 implements je1 {
    public final /* synthetic */ v44 c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(v44 v44Var, float f) {
        super(0);
        this.c = v44Var;
        this.d = f;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        w44 w44VarC;
        v44 v44Var = this.c;
        Float fValueOf = (v44Var == null || (w44VarC = v44Var.c()) == null) ? null : Float.valueOf(w44VarC.a.f());
        float f = -this.d;
        if (!kr1.m(fValueOf, f)) {
            w44 w44VarC2 = v44Var != null ? v44Var.c() : null;
            if (w44VarC2 != null) {
                w44VarC2.a.h(f);
            }
        }
        return w84.a;
    }
}
