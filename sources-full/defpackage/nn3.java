package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nn3 {
    public long a;
    public nn3 b;

    public nn3(long j) {
        this.a = j;
    }

    public abstract void a(nn3 nn3Var);

    public abstract nn3 b();

    public nn3 c(long j) {
        nn3 nn3VarB = b();
        nn3VarB.a = j;
        return nn3VarB;
    }
}
