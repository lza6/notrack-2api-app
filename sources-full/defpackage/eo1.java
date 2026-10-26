package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eo1 implements gn3 {
    public Object c;
    public Object d;
    public final w64 h;
    public final ft2 l;
    public qs3 m;
    public boolean n;
    public boolean o;
    public long p;
    public final /* synthetic */ go1 q;

    public eo1(go1 go1Var, Object obj, Object obj2, w64 w64Var, do1 do1Var) {
        this.q = go1Var;
        this.c = obj;
        this.d = obj2;
        this.h = w64Var;
        this.l = cl3.d(obj);
        this.m = new qs3(do1Var, w64Var, this.c, this.d, null);
    }

    @Override // defpackage.gn3
    public final Object getValue() {
        return this.l.getValue();
    }
}
