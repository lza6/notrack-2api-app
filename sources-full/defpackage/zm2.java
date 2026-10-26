package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zm2 implements qu1 {
    public final qu1 a;
    public final uf3 b;

    public zm2(qu1 qu1Var) {
        qu1Var.getClass();
        this.a = qu1Var;
        this.b = new uf3(qu1Var.getDescriptor());
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        if (hs0Var.e()) {
            return hs0Var.a(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zm2.class == obj.getClass() && kr1.n(this.a, ((zm2) obj).a);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        if (obj != null) {
            do3Var.r(this.a, obj);
        } else {
            do3Var.o();
        }
    }
}
