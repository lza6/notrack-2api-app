package defpackage;

import androidx.compose.material3.internal.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ve2 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ hh3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve2(hh3 hh3Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = hh3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        hh3 hh3Var = this.h;
        switch (i) {
            case 0:
                return new ve2(hh3Var, so0Var, 0);
            case 1:
                return new ve2(hh3Var, so0Var, 1);
            case 2:
                return new ve2(hh3Var, so0Var, 2);
            case 3:
                return new ve2(hh3Var, so0Var, 3);
            case 4:
                return new ve2(hh3Var, so0Var, 4);
            default:
                return new ve2(hh3Var, so0Var, 5);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((ve2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        ih3 ih3Var = ih3.d;
        w84 w84Var = w84.a;
        hh3 hh3Var = this.h;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return hh3Var.d(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i2 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return hh3Var.b(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i3 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i4 = this.d;
                if (i4 != 0) {
                    if (i4 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                this.d = 1;
                Map map = hh3Var.c.f().a;
                ih3 ih3Var2 = ih3.h;
                if (map.containsKey(ih3Var2)) {
                    ih3Var = ih3Var2;
                }
                Object objA = hh3.a(hh3Var, ih3Var, this);
                if (objA != hq0Var) {
                    objA = w84Var;
                }
                return objA == hq0Var ? hq0Var : w84Var;
            case 3:
                int i5 = this.d;
                if (i5 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return hh3Var.b(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i5 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                int i6 = this.d;
                if (i6 != 0) {
                    if (i6 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                this.d = 1;
                ji4 ji4Var = hh3Var.c;
                Object objC = a.c(ji4Var, ih3Var, ((bt2) ji4Var.k).f(), this);
                if (objC != hq0Var) {
                    objC = w84Var;
                }
                return objC == hq0Var ? hq0Var : w84Var;
            default:
                int i7 = this.d;
                if (i7 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return hh3Var.d(this) == hq0Var ? hq0Var : w84Var;
                }
                if (i7 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
