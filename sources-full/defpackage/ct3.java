package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ct3 implements dm3 {
    public final xs3 a;

    public ct3(xs3 xs3Var) {
        this.a = xs3Var;
    }

    @Override // defpackage.dm3
    public final Object a(pa2 pa2Var, ua2 ua2Var) {
        va2 va2Var = pa2Var.a;
        c13 c13Var = p23.h;
        Object obj = Boolean.FALSE;
        Object obj2 = ua2Var.a.get(c13Var);
        if (obj2 != null) {
            obj = obj2;
        }
        return new bt3(va2Var, this.a, ((Boolean) obj).booleanValue());
    }
}
