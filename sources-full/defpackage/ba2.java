package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class ba2 extends f0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final List d;

    public ba2(int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(0);
        new ArrayList(0);
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = arrayList;
    }

    public static void k(ir3 ir3Var, String str, String str2, kv kvVar) {
        str2.getClass();
        ir3Var.K();
        int iA0 = ir3Var.a0();
        jm3 jm3Var = (jm3) ir3Var.h;
        StringBuilder sb = jm3Var.c;
        sb.append(Typography.nbsp);
        sb.append('\n');
        ((pa2) ir3Var.c).c.getClass();
        jm3Var.b(sb.length(), str2);
        sb.append((CharSequence) str2);
        ir3Var.K();
        jm3Var.a(Typography.nbsp);
        yo4.h.b((ua2) ir3Var.d, str);
        ir3Var.i0(kvVar, iA0);
        ir3Var.G(kvVar);
    }

    @Override // defpackage.f0
    public final void b(jr0 jr0Var) {
        if (jr0Var.getMovementMethod() == null) {
            jr0Var.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // defpackage.f0
    public final void d(jr0 jr0Var, SpannableStringBuilder spannableStringBuilder) {
        lq2[] lq2VarArr = (lq2[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), lq2.class);
        if (lq2VarArr != null) {
            TextPaint paint = jr0Var.getPaint();
            for (lq2 lq2Var : lq2VarArr) {
                lq2Var.l = (int) (paint.measureText(lq2Var.d) + 0.5f);
            }
        }
        c04[] c04VarArr = (c04[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c04.class);
        if (c04VarArr != null) {
            for (c04 c04Var : c04VarArr) {
                spannableStringBuilder.removeSpan(c04Var);
            }
        }
        spannableStringBuilder.setSpan(new c04(jr0Var), 0, spannableStringBuilder.length(), 18);
    }

    @Override // defpackage.f0
    public final void h(ua2 ua2Var) {
        rv rvVar = new rv(1);
        ua2Var.b(yo3.class, new rv(9));
        ua2Var.b(r21.class, new rv(3));
        ua2Var.b(nv.class, new rv(0));
        ua2Var.b(sd0.class, new rv(2));
        ua2Var.b(p61.class, rvVar);
        ua2Var.b(rn1.class, rvVar);
        ua2Var.b(h52.class, new rv(7));
        ua2Var.b(vh1.class, new rv(4));
        ua2Var.b(j42.class, new rv(6));
        ua2Var.b(d04.class, new rv(10));
    }

    @Override // defpackage.f0
    public final void i(va2 va2Var) {
        va2Var.g = this.a;
        va2Var.a = this.c;
        int iX = gb2.X(re0.i);
        int i = this.b;
        if (i != iX) {
            va2Var.f = i;
        }
    }

    @Override // defpackage.f0
    public final void j(ua2 ua2Var) {
        ua2Var.a(it3.class, new lj1(this, 2));
        ua2Var.a(yo3.class, aa2.i);
        ua2Var.a(r21.class, aa2.d);
        ua2Var.a(nv.class, aa2.b);
        ua2Var.a(sd0.class, aa2.c);
        ua2Var.a(p61.class, new aa2(this, 10));
        ua2Var.a(rn1.class, new aa2(this, 11));
        ua2Var.a(zl1.class, new z92());
        int i = 14;
        ua2Var.a(ry.class, new aa2(i));
        ua2Var.a(kq2.class, new aa2(i));
        ua2Var.a(h52.class, new aa2(this, 12));
        ua2Var.a(d04.class, aa2.j);
        ua2Var.a(vh1.class, aa2.f);
        ua2Var.a(sl3.class, aa2.h);
        ua2Var.a(mh1.class, aa2.e);
        ua2Var.a(rs2.class, new aa2(this, 13));
        ua2Var.a(j42.class, aa2.g);
    }
}
