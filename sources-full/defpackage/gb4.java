package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gb4 extends ww1 implements ne1 {
    public static final gb4 d;
    public static final gb4 h;
    public static final gb4 l;
    public static final gb4 m;
    public static final gb4 n;
    public static final gb4 o;
    public static final gb4 p;
    public static final gb4 q;
    public static final gb4 r;
    public static final gb4 s;
    public static final gb4 t;
    public static final gb4 u;
    public static final gb4 v;
    public static final gb4 w;
    public static final gb4 x;
    public static final gb4 y;
    public final /* synthetic */ int c;

    static {
        int i = 2;
        d = new gb4(i, 0);
        h = new gb4(i, 1);
        l = new gb4(i, 2);
        m = new gb4(i, 3);
        n = new gb4(i, 4);
        o = new gb4(i, 5);
        p = new gb4(i, 6);
        q = new gb4(i, 7);
        r = new gb4(i, 8);
        s = new gb4(i, 9);
        t = new gb4(i, 10);
        u = new gb4(i, 11);
        v = new gb4(i, 12);
        w = new gb4(i, 13);
        x = new gb4(i, 14);
        y = new gb4(i, 15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb4(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                ug1 ug1Var = (ug1) obj;
                ug1Var.r = ((Number) obj2).floatValue();
                ug1Var.s = true;
                ug1Var.c();
                break;
            case 1:
                ug1 ug1Var2 = (ug1) obj;
                ug1Var2.f = (List) obj2;
                ug1Var2.g = true;
                ug1Var2.c();
                break;
            case 2:
                ot2 ot2Var = (ot2) obj;
                ot2Var.h = ((wo3) obj2).a;
                ot2Var.o = true;
                ot2Var.c();
                break;
            case 3:
                ot2 ot2Var2 = (ot2) obj;
                ot2Var2.j = ((Number) obj2).floatValue();
                ot2Var2.o = true;
                ot2Var2.c();
                break;
            case 4:
                ot2 ot2Var3 = (ot2) obj;
                ot2Var3.k = ((Number) obj2).floatValue();
                ot2Var3.p = true;
                ot2Var3.c();
                break;
            case 5:
                ot2 ot2Var4 = (ot2) obj;
                ot2Var4.l = ((Number) obj2).floatValue();
                ot2Var4.p = true;
                ot2Var4.c();
                break;
            case 6:
                ot2 ot2Var5 = (ot2) obj;
                ot2Var5.m = ((Number) obj2).floatValue();
                ot2Var5.p = true;
                ot2Var5.c();
                break;
            case 7:
                ((ot2) obj).c();
                break;
            case 8:
                ot2 ot2Var6 = (ot2) obj;
                ot2Var6.d = (List) obj2;
                ot2Var6.n = true;
                ot2Var6.c();
                break;
            case 9:
                ot2 ot2Var7 = (ot2) obj;
                ot2Var7.s.f(((pt2) obj2).a);
                ot2Var7.c();
                break;
            case 10:
                ot2 ot2Var8 = (ot2) obj;
                ot2Var8.b = (yx) obj2;
                ot2Var8.c();
                break;
            case 11:
                ot2 ot2Var9 = (ot2) obj;
                ot2Var9.c = ((Number) obj2).floatValue();
                ot2Var9.c();
                break;
            case 12:
                ot2 ot2Var10 = (ot2) obj;
                ot2Var10.g = (yx) obj2;
                ot2Var10.c();
                break;
            case 13:
                ot2 ot2Var11 = (ot2) obj;
                ot2Var11.e = ((Number) obj2).floatValue();
                ot2Var11.c();
                break;
            case 14:
                ot2 ot2Var12 = (ot2) obj;
                ot2Var12.f = ((Number) obj2).floatValue();
                ot2Var12.o = true;
                ot2Var12.c();
                break;
            case 15:
                ot2 ot2Var13 = (ot2) obj;
                ot2Var13.i = ((xo3) obj2).a;
                ot2Var13.o = true;
                ot2Var13.c();
                break;
            default:
                ((ux1) obj).M = true;
                break;
        }
        return w84Var;
    }
}
