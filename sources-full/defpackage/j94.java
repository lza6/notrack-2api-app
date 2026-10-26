package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j94 implements ly1, Serializable {
    public je1 c;
    public Object d;

    @Override // defpackage.ly1
    public final Object getValue() {
        if (this.d == t73.C) {
            je1 je1Var = this.c;
            je1Var.getClass();
            this.d = je1Var.invoke();
            this.c = null;
        }
        return this.d;
    }

    public final String toString() {
        return this.d != t73.C ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
