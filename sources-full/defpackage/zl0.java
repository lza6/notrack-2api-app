package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zl0 {
    public static final dh2 a;

    static {
        t63 t63Var = ef0.e;
        int i = t63Var.c;
        wl0 wl0Var = new wl0(t63Var, t63Var, 1);
        int i2 = t63Var.c;
        vn2 vn2Var = ef0.x;
        int i3 = (vn2Var.c << 6) | i2;
        yl0 yl0Var = new yl0(t63Var, vn2Var, 0);
        int i4 = (i2 << 6) | vn2Var.c;
        yl0 yl0Var2 = new yl0(vn2Var, t63Var, 0);
        dh2 dh2Var = hq1.a;
        dh2 dh2Var2 = new dh2();
        dh2Var2.h(i | (i << 6), wl0Var);
        dh2Var2.h(i3, yl0Var);
        dh2Var2.h(i4, yl0Var2);
        a = dh2Var2;
    }
}
