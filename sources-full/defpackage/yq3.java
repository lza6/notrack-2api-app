package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class yq3 implements ly1, Serializable {
    public je1 c;
    public volatile Object d;
    public final Object h;

    public yq3(je1 je1Var) {
        je1Var.getClass();
        this.c = je1Var;
        this.d = t73.C;
        this.h = this;
    }

    @Override // defpackage.ly1
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.d;
        t73 t73Var = t73.C;
        if (obj != t73Var) {
            return obj;
        }
        synchronized (this.h) {
            objInvoke = this.d;
            if (objInvoke == t73Var) {
                je1 je1Var = this.c;
                je1Var.getClass();
                objInvoke = je1Var.invoke();
                this.d = objInvoke;
                this.c = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.d != t73.C ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
