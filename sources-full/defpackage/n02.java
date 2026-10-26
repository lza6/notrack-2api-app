package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n02 {
    public final b93 a;
    public final ap0 b;
    public final fi2 c;

    public n02(b93 b93Var, ap0 ap0Var) {
        this.a = b93Var;
        this.b = ap0Var;
        long[] jArr = qa3.a;
        this.c = new fi2();
    }

    public final ne1 a(Object obj, int i, Object obj2) {
        fi2 fi2Var = this.c;
        m02 m02Var = (m02) fi2Var.g(obj);
        if (m02Var != null && m02Var.c == i && kr1.n(m02Var.b, obj2)) {
            yg0 yg0Var = m02Var.d;
            if (yg0Var != null) {
                return yg0Var;
            }
            yg0 yg0Var2 = new yg0(1403994769, new l02(m02Var.e, m02Var), true);
            m02Var.d = yg0Var2;
            return yg0Var2;
        }
        m02 m02Var2 = new m02(this, i, obj, obj2);
        fi2Var.l(obj, m02Var2);
        yg0 yg0Var3 = m02Var2.d;
        if (yg0Var3 != null) {
            return yg0Var3;
        }
        yg0 yg0Var4 = new yg0(1403994769, new l02(this, m02Var2), true);
        m02Var2.d = yg0Var4;
        return yg0Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        m02 m02Var = (m02) this.c.g(obj);
        if (m02Var != null) {
            return m02Var.b;
        }
        q02 q02Var = (q02) this.b.invoke();
        int iD = q02Var.d(obj);
        if (iD != -1) {
            return q02Var.c(iD);
        }
        return null;
    }
}
