package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class su0 implements pf3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final se1 c;

    public su0(CharSequence charSequence, ne1 ne1Var) {
        this.a = 0;
        charSequence.getClass();
        this.b = charSequence;
        this.c = ne1Var;
    }

    public /* synthetic */ su0(Object obj, le1 le1Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = le1Var;
    }

    @Override // defpackage.pf3
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ru0(this);
            case 1:
                return new gf1(this);
            default:
                return new i54(this);
        }
    }
}
