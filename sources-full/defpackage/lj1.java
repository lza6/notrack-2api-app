package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lj1 implements wa2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ lj1(f0 f0Var, int i) {
        this.a = i;
        this.b = f0Var;
    }

    @Override // defpackage.wa2
    public final void a(ir3 ir3Var, im0 im0Var) {
        int i = this.a;
        f0 f0Var = this.b;
        switch (i) {
            case 0:
                mj1.k((mj1) f0Var, ir3Var, ((kj1) im0Var).g);
                break;
            case 1:
                mj1.k((mj1) f0Var, ir3Var, ((ij1) im0Var).g);
                break;
            default:
                pa2 pa2Var = (pa2) ir3Var.c;
                String str = ((it3) im0Var).g;
                jm3 jm3Var = (jm3) ir3Var.h;
                jm3Var.c.append(str);
                List<u42> list = ((ba2) f0Var).d;
                if (!list.isEmpty()) {
                    int iA0 = ir3Var.a0() - str.length();
                    for (u42 u42Var : list) {
                        u42Var.getClass();
                        dm3 dm3VarJ = pa2Var.g.j(j42.class);
                        if (dm3VarJ != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                            if (Linkify.addLinks(spannableStringBuilder, u42Var.a)) {
                                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                                    ua2 ua2Var = (ua2) ir3Var.d;
                                    for (URLSpan uRLSpan : uRLSpanArr) {
                                        yo4.f.b(ua2Var, uRLSpan.getURL());
                                        jm3.c(jm3Var, dm3VarJ.a(pa2Var, ua2Var), spannableStringBuilder.getSpanStart(uRLSpan) + iA0, spannableStringBuilder.getSpanEnd(uRLSpan) + iA0);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
