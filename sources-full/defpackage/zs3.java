package defpackage;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zs3 implements ce4 {
    public static final Pattern c = Pattern.compile("^\\[([xX\\s])]\\s+(.*)");

    @Override // defpackage.ce4
    public final void A(rs2 rs2Var) {
        a(rs2Var);
    }

    @Override // defpackage.ce4
    public final void B(sd0 sd0Var) {
        a(sd0Var);
    }

    @Override // defpackage.ce4
    public final void C(sl3 sl3Var) {
        a(sl3Var);
    }

    @Override // defpackage.ce4
    public final void D(j42 j42Var) {
        a(j42Var);
    }

    public final void a(im0 im0Var) {
        im0 im0Var2 = (im0) im0Var.c;
        while (im0Var2 != null) {
            im0 im0Var3 = (im0) im0Var2.f;
            im0Var2.a(this);
            im0Var2 = im0Var3;
        }
    }

    @Override // defpackage.ce4
    public final void c(ry ryVar) {
        a(ryVar);
    }

    @Override // defpackage.ce4
    public final void d(kj1 kj1Var) {
        a(kj1Var);
    }

    @Override // defpackage.ce4
    public final void e(gr0 gr0Var) {
        a(gr0Var);
    }

    @Override // defpackage.ce4
    public final void f(er0 er0Var) {
        a(er0Var);
    }

    @Override // defpackage.ce4
    public final void g(kq2 kq2Var) {
        a(kq2Var);
    }

    @Override // defpackage.ce4
    public final void h(vh1 vh1Var) {
        a(vh1Var);
    }

    @Override // defpackage.ce4
    public final void i(ij1 ij1Var) {
        a(ij1Var);
    }

    @Override // defpackage.ce4
    public final void j(n42 n42Var) {
        a(n42Var);
    }

    @Override // defpackage.ce4
    public final void l(it3 it3Var) {
        a(it3Var);
    }

    @Override // defpackage.ce4
    public final void m(h52 h52Var) {
        im0 im0Var = (im0) h52Var.c;
        if (im0Var instanceof rs2) {
            im0 im0Var2 = (im0) im0Var.c;
            if (im0Var2 instanceof it3) {
                Matcher matcher = c.matcher(((it3) im0Var2).g);
                if (matcher.matches()) {
                    boolean z = true;
                    String strGroup = matcher.group(1);
                    if (!"x".equals(strGroup) && !"X".equals(strGroup)) {
                        z = false;
                    }
                    ys3 ys3Var = new ys3(z);
                    rs2 rs2Var = new rs2();
                    ys3Var.k();
                    im0 im0Var3 = (im0) h52Var.e;
                    ys3Var.e = im0Var3;
                    if (im0Var3 != null) {
                        im0Var3.f = ys3Var;
                    }
                    ys3Var.f = h52Var;
                    h52Var.e = ys3Var;
                    im0 im0Var4 = (im0) h52Var.b;
                    ys3Var.b = im0Var4;
                    if (((im0) ys3Var.e) == null) {
                        im0Var4.c = ys3Var;
                    }
                    String strGroup2 = matcher.group(2);
                    if (!TextUtils.isEmpty(strGroup2)) {
                        rs2Var.b(new it3(strGroup2));
                    }
                    im0 im0Var5 = (im0) im0Var2.f;
                    while (im0Var5 != null) {
                        im0 im0Var6 = (im0) im0Var5.f;
                        rs2Var.b(im0Var5);
                        im0Var5 = im0Var6;
                    }
                    ys3Var.b(rs2Var);
                    im0 im0Var7 = (im0) im0Var.f;
                    while (im0Var7 != null) {
                        im0 im0Var8 = (im0) im0Var7.f;
                        ys3Var.b(im0Var7);
                        im0Var7 = im0Var8;
                    }
                    h52Var.k();
                    a(ys3Var);
                    return;
                }
            }
        }
        a(h52Var);
    }

    @Override // defpackage.ce4
    public final void n(yo3 yo3Var) {
        a(yo3Var);
    }

    @Override // defpackage.ce4
    public final void o(zl1 zl1Var) {
        a(zl1Var);
    }

    @Override // defpackage.ce4
    public final void p(rn1 rn1Var) {
        a(rn1Var);
    }

    @Override // defpackage.ce4
    public final void q(d04 d04Var) {
        a(d04Var);
    }

    @Override // defpackage.ce4
    public final void r(p61 p61Var) {
        a(p61Var);
    }

    @Override // defpackage.ce4
    public final void v(r21 r21Var) {
        a(r21Var);
    }

    @Override // defpackage.ce4
    public final void x(mh1 mh1Var) {
        a(mh1Var);
    }

    @Override // defpackage.ce4
    public final void y(nv nvVar) {
        a(nvVar);
    }

    @Override // defpackage.ce4
    public final void z(gx0 gx0Var) {
        a(gx0Var);
    }
}
