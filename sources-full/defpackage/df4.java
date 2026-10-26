package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class df4 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 1;
    public int d;
    public final /* synthetic */ ef4 h;
    public final /* synthetic */ int l;
    public final /* synthetic */ String m;
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df4(ef4 ef4Var, int i, String str, int i2, String str2, so0 so0Var) {
        super(2, so0Var);
        this.h = ef4Var;
        this.l = i;
        this.m = str;
        this.n = i2;
        this.o = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df4(ef4 ef4Var, String str, int i, String str2, int i2, so0 so0Var) {
        super(2, so0Var);
        this.h = ef4Var;
        this.m = str;
        this.l = i;
        this.o = str2;
        this.n = i2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new df4(this.h, this.m, this.l, this.o, this.n, so0Var);
            default:
                return new df4(this.h, this.l, this.m, this.n, this.o, so0Var);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((df4) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [df4, uo0] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [df4] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r8;
        switch (this.c) {
            case 0:
                hq0 hq0Var = hq0.c;
                int i = this.d;
                if (i != 0) {
                    if (i == 1) {
                        g13.O(obj);
                        return obj;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                ef4 ef4Var = this.h;
                ge4 ge4Var = ef4Var.b;
                String str = this.m;
                int i2 = this.l;
                String str2 = this.o;
                int i3 = this.n;
                String str3 = ef4Var.m;
                String str4 = this.h.o;
                this.d = 1;
                Object objC = ge4Var.c(str, i2, str2, i3, str3, str4, this);
                return objC == hq0Var ? hq0Var : objC;
            default:
                hq0 hq0Var2 = hq0.c;
                int i4 = this.d;
                try {
                    if (i4 == 0) {
                        g13.O(obj);
                        ef4 ef4Var2 = this.h;
                        int i5 = this.l;
                        String str5 = this.m;
                        int i6 = this.n;
                        String str6 = this.o;
                        this.d = 1;
                        try {
                            Object objA = ef4.a(ef4Var2, i5, str5, i6, str6, this);
                            this = objA;
                            if (objA == hq0Var2) {
                                return hq0Var2;
                            }
                        } catch (Exception unused) {
                            r8 = this;
                            if (r8.l == r8.h.h) {
                                r8.h.f(true, true);
                                r8.h.f.f(re4.a);
                            }
                        }
                    } else {
                        if (i4 != 1) {
                            u41.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g13.O(obj);
                        this = this;
                    }
                    break;
                } catch (Exception unused2) {
                    r8 = this;
                }
                return w84.a;
        }
    }
}
