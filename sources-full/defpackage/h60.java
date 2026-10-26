package defpackage;

import android.content.Context;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h60 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ hb0 d;

    public /* synthetic */ h60(hb0 hb0Var, int i) {
        this.c = i;
        this.d = hb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.je1
    public final Object invoke() {
        Object value;
        Object value2;
        int i = this.c;
        Object[] objArr = 0;
        w84 w84Var = w84.a;
        hb0 hb0Var = this.d;
        switch (i) {
            case 0:
                hb0Var.r(true);
                return w84Var;
            case 1:
                hb0Var.d0(false);
                s23 s23Var = hb0Var.d;
                qt qtVar = ((xa0) s23Var.c.getValue()).y;
                if (qtVar != null) {
                    qt qtVar2 = qtVar.a ? qtVar : null;
                    if (qtVar2 != null) {
                        tt ttVarN = hb0.n((xa0) s23Var.c.getValue());
                        if (ttVarN == null) {
                            ttVarN = new tt(qtVar2.g.d, qtVar2.h.d, 11, qtVar2.n);
                        }
                        jn3 jn3Var = hb0Var.c;
                        do {
                            value = jn3Var.getValue();
                        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, ttVarN.a(qtVar2), false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -201326593, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                        if (!hb0.m((xa0) s23Var.c.getValue())) {
                            hb0Var.z("impr", "chatbg_gate", "chatbg_app");
                        }
                    }
                }
                return w84Var;
            case 2:
                hb0Var.d0(false);
                hb0Var.Q();
                return w84Var;
            case 3:
                if (((xa0) hb0Var.d.c.getValue()).t) {
                    jn3 jn3Var2 = hb0Var.c;
                    do {
                        value2 = jn3Var2.getValue();
                    } while (!jn3Var2.n(value2, xa0.a((xa0) value2, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, true, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -4194305, -32769, KotlinVersion.MAX_COMPONENT_VALUE)));
                    py.F(id4.a(hb0Var), null, null, new bb0(hb0Var, objArr == true ? 1 : 0, 9), 3);
                }
                return w84Var;
            case 4:
                hb0Var.N();
                return w84Var;
            case 5:
                hb0Var.X(new a50("chat_avatar"));
                return w84Var;
            case 6:
                hb0Var.j();
                hb0Var.P("ai");
                return w84Var;
            case 7:
                hb0Var.X(x40.a);
                return w84Var;
            default:
                e60 e60Var = hb0Var.b;
                Context context = e60Var.b;
                context.getClass();
                return new ef4(context, (ge4) e60Var.m.getValue(), id4.a(hb0Var));
        }
    }
}
