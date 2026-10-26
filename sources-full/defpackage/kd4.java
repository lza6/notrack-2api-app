package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface kd4 {
    default gd4 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default gd4 b(Class cls, zg2 zg2Var) {
        return a(cls);
    }

    default gd4 c(vc0 vc0Var, zg2 zg2Var) {
        return b(xp1.p(vc0Var), zg2Var);
    }
}
