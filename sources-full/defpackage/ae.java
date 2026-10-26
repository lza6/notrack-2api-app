package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ae extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(int i, long j, Object obj) {
        super(0);
        this.c = i;
        this.h = obj;
        this.d = j;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        long j = this.d;
        Object obj = this.h;
        switch (i) {
            case 0:
                return ((ng3) ((yx) obj)).b(j);
            case 1:
                o82 o82VarN0 = ((s82) obj).n.a().N0();
                o82VarN0.getClass();
                o82VarN0.c(j);
                return w84.a;
            default:
                z21 z21Var = z21.c;
                return new ay3((String) obj, j, new fp1((xz3) null, new p84(z21Var, z21Var, 100)));
        }
    }
}
