package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ml extends je0 {
    public final ll b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(qu1 qu1Var) {
        super(qu1Var);
        qu1Var.getClass();
        tf3 descriptor = qu1Var.getDescriptor();
        descriptor.getClass();
        this.b = new ll(descriptor);
    }

    @Override // defpackage.u
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.u
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.u
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.u
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }

    @Override // defpackage.je0
    public final void i(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
