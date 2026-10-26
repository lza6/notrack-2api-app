package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ve1 extends b00 implements ue1, fu1 {
    private final int arity;
    private final int flags;

    public ve1(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // defpackage.b00
    public du1 computeReflected() {
        r43.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ve1) {
            ve1 ve1Var = (ve1) obj;
            return getName().equals(ve1Var.getName()) && getSignature().equals(ve1Var.getSignature()) && this.flags == ve1Var.flags && this.arity == ve1Var.arity && kr1.n(getBoundReceiver(), ve1Var.getBoundReceiver()) && kr1.n(getOwner(), ve1Var.getOwner());
        }
        if (obj instanceof fu1) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.ue1
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.b00
    public fu1 getReflected() {
        du1 du1VarCompute = compute();
        if (du1VarCompute != this) {
            return (fu1) du1VarCompute;
        }
        throw new mq0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.fu1
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.fu1
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.fu1
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.fu1
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.b00, defpackage.du1
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        du1 du1VarCompute = compute();
        if (du1VarCompute != this) {
            return du1VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
