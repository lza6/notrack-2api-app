package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k92 implements rd2 {
    public rd2[] a;

    @Override // defpackage.rd2
    public final o23 a(Class cls) {
        for (rd2 rd2Var : this.a) {
            if (rd2Var.b(cls)) {
                return rd2Var.a(cls);
            }
        }
        j93.k("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.rd2
    public final boolean b(Class cls) {
        for (rd2 rd2Var : this.a) {
            if (rd2Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
