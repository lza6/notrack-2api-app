package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ol4 extends Exception {
    public final ml0 c;

    public ol4(ml0 ml0Var) {
        if ((ml0Var.d == 0 || ml0Var.h == null) ? false : true) {
            this.c = ml0Var;
        } else {
            u41.k("ResolvableConnectionException can only be created with a connection result containing a resolution.");
            throw null;
        }
    }
}
