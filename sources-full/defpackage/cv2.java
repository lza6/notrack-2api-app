package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cv2 extends t {
    public final uu2 c;

    public cv2(uu2 uu2Var) {
        this.c = uu2Var;
    }

    @Override // defpackage.t
    public final int b() {
        uu2 uu2Var = this.c;
        uu2Var.getClass();
        return uu2Var.d;
    }

    @Override // defpackage.t, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        n64 n64Var = this.c.c;
        o64[] o64VarArr = new o64[8];
        for (int i = 0; i < 8; i++) {
            o64VarArr[i] = new p64(2);
        }
        return new bv2(n64Var, o64VarArr);
    }
}
