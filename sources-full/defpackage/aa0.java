package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.widget.Toast;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class aa0 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ Context d;
    public final /* synthetic */ hb0 h;
    public final /* synthetic */ gn3 l;
    public final /* synthetic */ mi2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(Context context, hb0 hb0Var, gn3 gn3Var, mi2 mi2Var, so0 so0Var) {
        super(2, so0Var);
        this.d = context;
        this.h = hb0Var;
        this.l = gn3Var;
        this.m = mi2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(hb0 hb0Var, Context context, gn3 gn3Var, mi2 mi2Var, so0 so0Var) {
        super(2, so0Var);
        this.h = hb0Var;
        this.d = context;
        this.l = gn3Var;
        this.m = mi2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new aa0(this.h, this.d, this.l, this.m, so0Var);
            default:
                return new aa0(this.d, this.h, this.l, this.m, so0Var);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                ((aa0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            default:
                ((aa0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        int i = this.c;
        w84 w84Var = w84.a;
        hb0 hb0Var = this.h;
        Context context = this.d;
        mi2 mi2Var = this.m;
        gn3 gn3Var = this.l;
        switch (i) {
            case 0:
                g13.O(obj);
                String str = ((xa0) gn3Var.getValue()).k0;
                if (str != null) {
                    if (str.equals("ok")) {
                        hb0Var.d0(false);
                        wa0.g1(mi2Var, true);
                    } else {
                        Toast.makeText(context, context.getString(wa0.t1(str)), 1).show();
                    }
                    jn3 jn3Var = hb0Var.c;
                    do {
                        value = jn3Var.getValue();
                    } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1073741825, KotlinVersion.MAX_COMPONENT_VALUE)));
                }
                break;
            default:
                g13.O(obj);
                if (((xa0) gn3Var.getValue()).j0) {
                    wa0.g1(mi2Var, false);
                    Toast.makeText(context, context.getString(R.string.acc_del_done), 1).show();
                    jn3 jn3Var2 = hb0Var.c;
                    do {
                        value2 = jn3Var2.getValue();
                    } while (!jn3Var2.n(value2, xa0.a((xa0) value2, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -536870913, KotlinVersion.MAX_COMPONENT_VALUE)));
                }
                break;
        }
        return w84Var;
    }
}
