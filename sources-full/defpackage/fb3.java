package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fb3 {
    public final je1 a;
    public final je1 b;
    public final boolean c;

    public fb3(je1 je1Var, je1 je1Var2, boolean z) {
        this.a = je1Var;
        this.b = je1Var2;
        this.c = z;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.b.invoke()).floatValue() + ", reverseScrolling=" + this.c + ')';
    }
}
