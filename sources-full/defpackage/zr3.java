package defpackage;

import ai.notrack.app.R;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import io.noties.markwon.ext.tables.a;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zr3 extends f0 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public zr3(h61 h61Var) {
        this.b = new yr3(h61Var);
    }

    public zr3(xs3 xs3Var) {
        this.b = xs3Var;
    }

    @Override // defpackage.f0
    public void b(jr0 jr0Var) {
        switch (this.a) {
            case 0:
                CharSequence text = jr0Var.getText();
                Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), a.class);
                if (spans != null && spans.length > 0) {
                    if (jr0Var.getTag(R.id.markwon_tables_scheduler) == null) {
                        gm gmVar = new gm(jr0Var, 1);
                        jr0Var.addOnAttachStateChangeListener(gmVar);
                        jr0Var.setTag(R.id.markwon_tables_scheduler, gmVar);
                    }
                    bv0 bv0Var = new bv0(jr0Var);
                    for (Object obj : spans) {
                        ((a) obj).r = bv0Var;
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f0
    public void c() {
        switch (this.a) {
            case 0:
                yr3 yr3Var = (yr3) this.b;
                yr3Var.b = null;
                yr3Var.c = false;
                yr3Var.d = 0;
                break;
        }
    }

    @Override // defpackage.f0
    public void d(jr0 jr0Var, SpannableStringBuilder spannableStringBuilder) {
        switch (this.a) {
            case 0:
                CharSequence text = jr0Var.getText();
                Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), a.class);
                if (spans != null && spans.length > 0) {
                    for (Object obj : spans) {
                        ((a) obj).r = null;
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f0
    public final void g(ir3 ir3Var) {
        switch (this.a) {
            case 0:
                ir3Var.L(Collections.singleton(new ho3(2)));
                break;
            default:
                ((ArrayList) ir3Var.h).add(new at3());
                break;
        }
    }

    @Override // defpackage.f0
    public void h(ua2 ua2Var) {
        switch (this.a) {
            case 1:
                ua2Var.b(ys3.class, new ct3((xs3) this.b));
                break;
        }
    }

    @Override // defpackage.f0
    public final void j(ua2 ua2Var) {
        switch (this.a) {
            case 0:
                yr3 yr3Var = (yr3) this.b;
                ua2Var.a(mr3.class, new aa2(17));
                ua2Var.a(or3.class, new xr3(yr3Var, 3));
                ua2Var.a(as3.class, new xr3(yr3Var, 2));
                ua2Var.a(rr3.class, new xr3(yr3Var, 1));
                ua2Var.a(qr3.class, new xr3(yr3Var, 0));
                break;
            default:
                ua2Var.a(ys3.class, new aa2(18));
                break;
        }
    }
}
