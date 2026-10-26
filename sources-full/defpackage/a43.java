package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a43 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a43(int i, int i2, so0 so0Var) {
        super(i, so0Var);
        this.c = i2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                a43 a43Var = new a43(2, 0, so0Var);
                a43Var.d = obj;
                return a43Var;
            default:
                a43 a43Var2 = new a43(2, 1, so0Var);
                a43Var2.d = obj;
                return a43Var2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((a43) create((z33) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((a43) create((ch3) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.c) {
            case 0:
                g13.O(obj);
                return Boolean.valueOf(((z33) this.d) == z33.c);
            default:
                g13.O(obj);
                return Boolean.valueOf(((ch3) this.d) != ch3.c);
        }
    }
}
