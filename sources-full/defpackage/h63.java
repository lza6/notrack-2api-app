package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h63 extends g63 implements ue1 {
    public final int c;

    public h63(int i, so0 so0Var) {
        super(so0Var);
        this.c = i;
    }

    @Override // defpackage.ue1
    public final int getArity() {
        return this.c;
    }

    @Override // defpackage.wr
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        r43.a.getClass();
        return s43.a(this);
    }
}
