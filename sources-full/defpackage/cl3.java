package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cl3 {
    public static final oi2 a() {
        iy2 iy2Var = dl3.b;
        oi2 oi2Var = (oi2) iy2Var.get();
        if (oi2Var != null) {
            return oi2Var;
        }
        oi2 oi2Var2 = new oi2(0, new ik0[0]);
        iy2Var.p(oi2Var2);
        return oi2Var2;
    }

    public static final fv0 b(je1 je1Var) {
        iy2 iy2Var = dl3.a;
        return new fv0(je1Var, null);
    }

    public static final fv0 c(je1 je1Var, bl3 bl3Var) {
        iy2 iy2Var = dl3.a;
        return new fv0(je1Var, bl3Var);
    }

    public static final <T> gn3 collectAsState(hn3 hn3Var, xp0 xp0Var, ck0 ck0Var, int i, int i2) {
        return jl3.collectAsState(hn3Var, xp0Var, ck0Var, i, i2);
    }

    public static final <T extends R, R> gn3 collectAsState(k81 k81Var, R r, xp0 xp0Var, ck0 ck0Var, int i, int i2) {
        return jl3.collectAsState(k81Var, r, xp0Var, ck0Var, i, i2);
    }

    public static ft2 d(Object obj) {
        return new ft2(obj, t73.A);
    }

    public static final pm0 e(je1 je1Var) {
        return new pm0(3, new v31(je1Var, null));
    }

    public static final <T> gn3 produceState(T t, Object obj, Object obj2, Object obj3, ne1 ne1Var, ck0 ck0Var, int i) {
        return fl3.produceState(t, obj, obj2, obj3, ne1Var, ck0Var, i);
    }

    public static final <T> gn3 produceState(T t, Object obj, Object obj2, ne1 ne1Var, ck0 ck0Var, int i) {
        return fl3.produceState(t, obj, obj2, ne1Var, ck0Var, i);
    }

    public static final <T> gn3 produceState(T t, Object obj, ne1 ne1Var, ck0 ck0Var, int i) {
        return fl3.produceState(t, obj, ne1Var, ck0Var, i);
    }

    public static final <T> gn3 produceState(T t, ne1 ne1Var, ck0 ck0Var, int i) {
        return fl3.produceState(t, ne1Var, ck0Var, i);
    }

    public static final <T> gn3 produceState(T t, Object[] objArr, ne1 ne1Var, ck0 ck0Var, int i) {
        return fl3.produceState((Object) t, objArr, ne1Var, ck0Var, i);
    }

    public static final <T> gn3 rememberUpdatedState(T t, ck0 ck0Var, int i) {
        return kl3.rememberUpdatedState(t, ck0Var, i);
    }
}
