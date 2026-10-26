package defpackage;

import app.template.extension.BuildConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class cb0 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 1;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ hb0 l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(hb0 hb0Var, String str, so0 so0Var) {
        super(2, so0Var);
        this.l = hb0Var;
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(String str, hb0 hb0Var, so0 so0Var) {
        super(2, so0Var);
        this.m = str;
        this.l = hb0Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        String str = this.m;
        hb0 hb0Var = this.l;
        switch (i) {
            case 0:
                cb0 cb0Var = new cb0(str, hb0Var, so0Var);
                cb0Var.h = obj;
                return cb0Var;
            default:
                cb0 cb0Var2 = new cb0(hb0Var, str, so0Var);
                cb0Var2.h = obj;
                return cb0Var2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((cb0) create((String) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((cb0) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        Object obj2 = w84.a;
        hb0 hb0Var = this.l;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                String str = (String) this.h;
                int i2 = this.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        g13.O(obj);
                        return obj2;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                String str2 = this.m;
                if (str2 == null) {
                    return obj2;
                }
                ge4 ge4Var = (ge4) hb0Var.b.m.getValue();
                this.h = null;
                this.d = 1;
                ge4Var.getClass();
                jt0 jt0Var = sw0.a;
                return py.Y(at0.c, new fe4(ge4Var, str2, str, null, 0), this) == hq0Var ? hq0Var : obj2;
            default:
                int i3 = this.d;
                try {
                    if (i3 == 0) {
                        g13.O(obj);
                        String str3 = this.m;
                        e60 e60Var = hb0Var.b;
                        String language = Locale.getDefault().getLanguage();
                        language.getClass();
                        this.h = null;
                        this.d = 1;
                        if (e60Var.n("click", str3, language, BuildConfig.VERSION_NAME, this) == hq0Var) {
                            obj2 = hq0Var;
                        }
                    } else {
                        if (i3 != 1) {
                            u41.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g13.O(obj);
                    }
                    return obj2;
                } catch (Throwable unused) {
                    return obj2;
                }
        }
    }
}
