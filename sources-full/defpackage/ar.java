package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ar extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar(int i, Object obj, boolean z) {
        super(0);
        this.c = i;
        this.d = z;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(cr crVar, boolean z) {
        super(0);
        this.c = 0;
        this.h = crVar;
        this.d = z;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        ki2 ki2VarI;
        int i = this.c;
        Object obj = this.h;
        boolean z = this.d;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                cr crVar = (cr) obj;
                crVar.a = z;
                je1 je1Var = crVar.c;
                if (je1Var != null) {
                    je1Var.invoke();
                }
                break;
            case 1:
                if (z) {
                    ((ki2) obj).f(w84Var);
                }
                break;
            case 2:
                if (z) {
                    ((je1) obj).invoke();
                }
                break;
            default:
                if (z && (ki2VarI = ((rb) obj).i()) != null) {
                    ((ah3) ki2VarI).f(w84Var);
                }
                break;
        }
        return w84Var;
    }
}
