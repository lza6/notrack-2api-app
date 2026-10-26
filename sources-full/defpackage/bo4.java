package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bo4 implements ql4 {
    public final /* synthetic */ int c;
    public final sk3 d;

    public /* synthetic */ bo4(sk3 sk3Var, int i) {
        this.c = i;
        this.d = sk3Var;
    }

    @Override // defpackage.ql4
    public final Object f() {
        int i = this.c;
        sk3 sk3Var = this.d;
        switch (i) {
            case 0:
                return new um4(((tu) sk3Var.d).a);
            default:
                return new xs4(((tu) sk3Var.d).a);
        }
    }
}
