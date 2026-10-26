package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d13 extends b00 implements pu1 {
    private final boolean syntheticJavaProperty;

    public d13(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // defpackage.b00
    public du1 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d13) {
            d13 d13Var = (d13) obj;
            return getOwner().equals(d13Var.getOwner()) && getName().equals(d13Var.getName()) && getSignature().equals(d13Var.getSignature()) && kr1.n(getBoundReceiver(), d13Var.getBoundReceiver());
        }
        if (obj instanceof pu1) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.b00
    public pu1 getReflected() {
        if (this.syntheticJavaProperty) {
            j93.k("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        du1 du1VarCompute = compute();
        if (du1VarCompute != this) {
            return (pu1) du1VarCompute;
        }
        throw new mq0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.pu1
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.pu1
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        du1 du1VarCompute = compute();
        if (du1VarCompute != this) {
            return du1VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
