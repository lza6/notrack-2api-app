package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements xk {
    public final Object c;
    public final ArrayList d = new ArrayList();
    public Object h;

    public h(Object obj) {
        this.c = obj;
        this.h = obj;
    }

    public abstract void a();

    @Override // defpackage.xk
    public final void clear() {
        this.d.clear();
        this.h = this.c;
        a();
    }

    @Override // defpackage.xk
    public final void d(Object obj) {
        this.d.add(this.h);
        this.h = obj;
    }

    @Override // defpackage.xk
    public final Object i() {
        return this.h;
    }

    @Override // defpackage.xk
    public final void l() {
        ArrayList arrayList = this.d;
        this.h = arrayList.remove(arrayList.size() - 1);
    }
}
