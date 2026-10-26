package defpackage;

import ai.notrack.app.R;
import android.text.SpannableStringBuilder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dn1 extends f0 {
    public static final HashMap b = new HashMap(2);
    public final cn1 a;

    public dn1(cn1 cn1Var) {
        this.a = cn1Var;
    }

    @Override // defpackage.f0
    public final void b(jr0 jr0Var) {
        jr0Var.getClass();
        Integer num = (Integer) jr0Var.getTag(R.id.markwon_drawables_scheduler_last_text_hashcode);
        int iHashCode = jr0Var.getText().hashCode();
        if (num == null || num.intValue() != iHashCode) {
            jr0Var.setTag(R.id.markwon_drawables_scheduler_last_text_hashcode, Integer.valueOf(iHashCode));
            jm[] jmVarArrD = vl0.D(jr0Var);
            if (jmVarArrD == null || jmVarArrD.length <= 0) {
                return;
            }
            int i = 0;
            if (jr0Var.getTag(R.id.markwon_drawables_scheduler) == null) {
                gm gmVar = new gm(jr0Var, i);
                jr0Var.addOnAttachStateChangeListener(gmVar);
                jr0Var.setTag(R.id.markwon_drawables_scheduler, gmVar);
            }
            im imVar = new im(0, jr0Var);
            int length = jmVarArrD.length;
            while (i < length) {
                em emVar = jmVarArrD[i].d;
                emVar.c(new hm(jr0Var, imVar, emVar.getBounds()));
                i++;
            }
        }
    }

    @Override // defpackage.f0
    public final void d(jr0 jr0Var, SpannableStringBuilder spannableStringBuilder) {
        jr0Var.getClass();
        vl0.g0(jr0Var);
    }

    @Override // defpackage.f0
    public final void f(pa2 pa2Var) {
        pa2Var.b = this.a;
    }

    @Override // defpackage.f0
    public final void h(ua2 ua2Var) {
        ua2Var.b(zl1.class, new rv(5));
    }
}
