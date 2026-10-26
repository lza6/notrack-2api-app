package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kv extends im0 {
    @Override // defpackage.im0
    public final im0 c() {
        return (kv) ((im0) this.b);
    }

    @Override // defpackage.im0
    public final void f(im0 im0Var) {
        if (im0Var instanceof kv) {
            this.b = im0Var;
        } else {
            u41.k("Parent of block must also be block (can not be inline)");
        }
    }
}
