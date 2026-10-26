package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wg3 {
    public static final un3 a = new un3(bb2.w);

    public static final rg3 getValue(tg3 tg3Var, ck0 ck0Var, int i) {
        vg3 shapes = ab2.a.getShapes(ck0Var, 6);
        switch (tg3Var.ordinal()) {
            case 0:
                return shapes.e;
            case 1:
                return y73.a(shapes.e, null, new sx0(0.0f), new sx0(0.0f), 3);
            case 2:
                return shapes.a;
            case 3:
                return y73.a(shapes.a, null, new sx0(0.0f), new sx0(0.0f), 3);
            case 4:
                return z73.a;
            case 5:
                return shapes.d;
            case 6:
                return y73.a(shapes.d, new sx0(0.0f), null, new sx0(0.0f), 6);
            case 7:
                return y73.a(shapes.d, null, new sx0(0.0f), new sx0(0.0f), 3);
            case 8:
                return shapes.c;
            case 9:
                return k43.a;
            case 10:
                return shapes.b;
            default:
                u41.e();
                return null;
        }
    }
}
