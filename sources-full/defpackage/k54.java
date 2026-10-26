package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k54 {
    public final w64 a;
    public final ft2 b = cl3.d(null);
    public final /* synthetic */ o54 c;

    public k54(o54 o54Var, w64 w64Var, String str) {
        this.c = o54Var;
        this.a = w64Var;
    }

    public final j54 a(le1 le1Var, le1 le1Var2) {
        ft2 ft2Var = this.b;
        j54 j54Var = (j54) ft2Var.getValue();
        o54 o54Var = this.c;
        if (j54Var == null) {
            Object objInvoke = le1Var2.invoke(o54Var.b());
            Object objInvoke2 = le1Var2.invoke(o54Var.b());
            w64 w64Var = this.a;
            cg cgVar = (cg) ((x64) w64Var).a.invoke(objInvoke2);
            cgVar.d();
            n54 n54Var = new n54(o54Var, objInvoke, cgVar, w64Var);
            j54Var = new j54(this, n54Var, le1Var, le1Var2);
            ft2Var.setValue(j54Var);
            o54Var.i.add(n54Var);
        }
        j54Var.h = le1Var2;
        j54Var.d = le1Var;
        j54Var.b(o54Var.e());
        return j54Var;
    }
}
