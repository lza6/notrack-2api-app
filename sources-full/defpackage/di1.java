package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di1 {
    public static final di1 d;
    public final boolean a;
    public final bi1 b;
    public final ci1 c;

    static {
        bi1 bi1Var = bi1.a;
        ci1 ci1Var = ci1.b;
        d = new di1(false, bi1Var, ci1Var);
        new di1(true, bi1Var, ci1Var);
    }

    public di1(boolean z, bi1 bi1Var, ci1 ci1Var) {
        bi1Var.getClass();
        ci1Var.getClass();
        this.a = z;
        this.b = bi1Var;
        this.c = ci1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a(sb, "        ");
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.c.a(sb, "        ");
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
