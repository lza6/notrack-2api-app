package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface xk {
    void c(int i, Object obj);

    void clear();

    void d(Object obj);

    default void e() {
        Object objI = i();
        vj0 vj0Var = objI instanceof vj0 ? (vj0) objI : null;
        if (vj0Var != null) {
            vj0Var.d();
        }
    }

    void f(int i, Object obj);

    default void g() {
    }

    void h(int i, int i2, int i3);

    Object i();

    void j(int i, int i2);

    void l();
}
