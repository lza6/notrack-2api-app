package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ww1 implements ue1, Serializable {
    private final int arity;

    public ww1(int i) {
        this.arity = i;
    }

    @Override // defpackage.ue1
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        r43.a.getClass();
        return s43.a(this);
    }
}
