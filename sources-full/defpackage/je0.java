package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class je0 extends u {
    public final qu1 a;

    public je0(qu1 qu1Var) {
        this.a = qu1Var;
    }

    @Override // defpackage.u
    public void f(nk0 nk0Var, int i, Object obj) {
        i(obj, i, nk0Var.v(getDescriptor(), i, this.a, null));
    }

    public abstract void i(Object obj, int i, Object obj2);

    @Override // defpackage.qu1
    public void serialize(do3 do3Var, Object obj) {
        int iD = d(obj);
        tf3 descriptor = getDescriptor();
        descriptor.getClass();
        do3 do3VarA = do3Var.a(descriptor);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            do3VarA.q(getDescriptor(), i, this.a, itC.next());
        }
        do3VarA.v(descriptor);
    }
}
