package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pa0 implements le1 {
    public final /* synthetic */ yd2 c;
    public final /* synthetic */ mi2 d;
    public final /* synthetic */ mi2 h;
    public final /* synthetic */ mi2 l;

    public pa0(yd2 yd2Var, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3) {
        this.c = yd2Var;
        this.d = mi2Var;
        this.h = mi2Var2;
        this.l = mi2Var3;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        this.d.setValue(this.c.a);
        this.h.setValue(str);
        this.l.setValue(str);
        return w84.a;
    }
}
