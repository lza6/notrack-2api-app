package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class z8 extends mq3 implements oe1 {
    public final /* synthetic */ int c = 1;
    public int d;
    public /* synthetic */ Object h;
    public /* synthetic */ Serializable l;

    public /* synthetic */ z8(int i, so0 so0Var) {
        super(i, so0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(b9 b9Var, q8 q8Var, so0 so0Var) {
        super(3, so0Var);
        this.h = b9Var;
        this.l = q8Var;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return new z8((b9) this.h, (q8) this.l, (so0) obj3).invokeSuspend(w84Var);
            default:
                z8 z8Var = new z8(3, (so0) obj3);
                z8Var.h = (l81) obj;
                z8Var.l = (Object[]) obj2;
                return z8Var.invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        bn0 bn0Var;
        int i = this.c;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        bn0 bn0Var2 = null;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                a9 a9Var = ((b9) this.h).a;
                q8 q8Var = (q8) this.l;
                this.d = 1;
                return q8Var.invoke(a9Var, this) == hq0Var ? hq0Var : w84Var;
            default:
                int i3 = this.d;
                if (i3 != 0) {
                    if (i3 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                l81 l81Var = (l81) this.h;
                bn0[] bn0VarArr = (bn0[]) ((Object[]) this.l);
                int length = bn0VarArr.length;
                int i4 = 0;
                while (true) {
                    bn0Var = zm0.a;
                    if (i4 < length) {
                        bn0 bn0Var3 = bn0VarArr[i4];
                        if (kr1.n(bn0Var3, bn0Var)) {
                            i4++;
                        } else {
                            bn0Var2 = bn0Var3;
                        }
                    }
                }
                if (bn0Var2 != null) {
                    bn0Var = bn0Var2;
                }
                this.d = 1;
                return l81Var.emit(bn0Var, this) == hq0Var ? hq0Var : w84Var;
        }
    }
}
