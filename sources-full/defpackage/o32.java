package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o32 {
    public g32 a;
    public k32 b;

    public final void a(n32 n32Var, f32 f32Var) {
        g32 g32VarA = f32Var.a();
        g32 g32Var = this.a;
        g32Var.getClass();
        if (g32VarA.compareTo(g32Var) < 0) {
            g32Var = g32VarA;
        }
        this.a = g32Var;
        this.b.onStateChanged(n32Var, f32Var);
        this.a = g32VarA;
    }
}
