package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class k21 {
    public int a = 1;
    public final ce2 b;
    public ce2 c;
    public ce2 d;
    public int e;
    public int f;

    public k21(ce2 ce2Var) {
        this.b = ce2Var;
        this.c = ce2Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        ae2 ae2VarB = this.c.b.b();
        int iA = ae2VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) ae2VarB.l).get(iA + ae2VarB.c) == 0) || this.e == 65039;
    }
}
