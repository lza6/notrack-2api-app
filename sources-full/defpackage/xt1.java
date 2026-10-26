package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class xt1 extends h63 implements oe1 {
    public int d;
    public /* synthetic */ ks0 h;
    public final /* synthetic */ kn4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt1(kn4 kn4Var, so0 so0Var) {
        super(3, so0Var);
        this.l = kn4Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xt1 xt1Var = new xt1(this.l, (so0) obj3);
        xt1Var.h = (ks0) obj;
        return xt1Var.invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        kn4 kn4Var = this.l;
        tz1 tz1Var = (tz1) kn4Var.c;
        int i = this.d;
        if (i == 0) {
            g13.O(obj);
            ks0 ks0Var = this.h;
            byte bS = tz1Var.s();
            if (bS == 1) {
                return kn4Var.l(true);
            }
            if (bS == 0) {
                return kn4Var.l(false);
            }
            if (bS != 6) {
                if (bS == 8) {
                    return kn4Var.k();
                }
                tz1.l(tz1Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.d = 1;
            obj = kn4.a(kn4Var, ks0Var, this);
            hq0 hq0Var = hq0.c;
            if (obj == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return (JsonElement) obj;
    }
}
