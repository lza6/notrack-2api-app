package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g71 implements pf3 {
    public final pf3 a;
    public final boolean b;
    public final le1 c;

    public g71(pf3 pf3Var, boolean z, le1 le1Var) {
        this.a = pf3Var;
        this.b = z;
        this.c = le1Var;
    }

    @Override // defpackage.pf3
    public final Iterator iterator() {
        return new f71(this);
    }
}
