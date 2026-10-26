package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum z34 extends e44 {
    public z34() {
        super("CdataSection", 66);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        String strC;
        StringBuilder sb = o14Var.h;
        int iP = p30Var.p("]]>");
        String[] strArr = p30Var.h;
        char[] cArr = p30Var.a;
        if (iP != -1) {
            strC = p30.c(cArr, strArr, p30Var.e, iP);
            p30Var.e += iP;
        } else {
            p30Var.b();
            int i = p30Var.e;
            strC = p30.c(cArr, strArr, i, p30Var.c - i);
            p30Var.e = p30Var.c;
        }
        sb.append(strC);
        if (p30Var.k("]]>") || p30Var.j()) {
            String string = sb.toString();
            f14 f14Var = new f14(5);
            f14Var.b = string;
            o14Var.g(f14Var);
            o14Var.c = e44.c;
        }
    }
}
