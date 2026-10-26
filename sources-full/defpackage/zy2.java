package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class zy2 extends je0 {
    public final yy2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy2(qu1 qu1Var) {
        super(qu1Var);
        qu1Var.getClass();
        this.b = new yy2(qu1Var.getDescriptor());
    }

    @Override // defpackage.u
    public final Object a() {
        return (xy2) g(j());
    }

    @Override // defpackage.u
    public final int b(Object obj) {
        xy2 xy2Var = (xy2) obj;
        xy2Var.getClass();
        return xy2Var.d();
    }

    @Override // defpackage.u
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.u, defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return e(hs0Var);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.u
    public final Object h(Object obj) {
        xy2 xy2Var = (xy2) obj;
        xy2Var.getClass();
        return xy2Var.a();
    }

    @Override // defpackage.je0
    public final void i(Object obj, int i, Object obj2) {
        ((xy2) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(do3 do3Var, Object obj, int i);

    @Override // defpackage.je0, defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        int iD = d(obj);
        yy2 yy2Var = this.b;
        yy2Var.getClass();
        do3 do3VarA = do3Var.a(yy2Var);
        k(do3VarA, obj, iD);
        do3VarA.v(yy2Var);
    }
}
