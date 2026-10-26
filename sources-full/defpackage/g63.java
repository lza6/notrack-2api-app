package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class g63 extends wr {
    public g63(so0 so0Var) {
        super(so0Var);
        if (so0Var == null || so0Var.getContext() == x21.c) {
            return;
        }
        u41.k("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.so0
    public final xp0 getContext() {
        return x21.c;
    }
}
