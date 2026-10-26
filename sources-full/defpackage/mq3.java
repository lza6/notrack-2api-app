package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mq3 extends uo0 implements ue1 {
    private final int arity;

    public mq3(int i, so0 so0Var) {
        super(so0Var);
        this.arity = i;
    }

    @Override // defpackage.ue1
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.wr
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        r43.a.getClass();
        return s43.a(this);
    }
}
