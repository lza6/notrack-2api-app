package defpackage;

import android.view.View;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.NoSuchElementException;
import notrack.ai.MainActivity;
import notrack.ai.ui.components.HtmlPreviewActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m51 implements bz2, kv1, wn2, r3, nx0 {
    public final /* synthetic */ int c;

    public /* synthetic */ m51(int i) {
        this.c = i;
    }

    public static /* synthetic */ void A(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void B(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void e() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void h(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void i(Object obj, Object obj2) {
        throw new pp3("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void k(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void l(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void n(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void o() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void p(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void q(Object obj, Object obj2, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj + obj2);
    }

    public static /* synthetic */ void r(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void s(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void t() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void v(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void w(Object obj, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj);
    }

    public static /* synthetic */ void x(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void z(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    @Override // defpackage.bz2
    public Object a(kr1 kr1Var) throws GeneralSecurityException {
        qc0 qc0Var = new qc0();
        if (ud2.b(2)) {
            return qc0Var;
        }
        v("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        return null;
    }

    @Override // defpackage.r3
    public void b(Object obj) {
        switch (this.c) {
            case 16:
                ((Boolean) obj).booleanValue();
                int i = MainActivity.L;
                break;
            default:
                ((q3) obj).getClass();
                break;
        }
    }

    @Override // defpackage.nx0
    public double c(double d) {
        return d;
    }

    @Override // defpackage.kv1
    public kr1 d(f13 f13Var) throws GeneralSecurityException {
        if (!((String) f13Var.a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            u41.k("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            ki1 ki1VarE = ki1.E((mz) f13Var.c, b61.a());
            if (ki1VarE.C() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ir3 ir3Var = new ir3();
            ir3Var.c = null;
            ir3Var.d = null;
            ir3Var.h = null;
            ir3Var.l = d5.I;
            ir3Var.c = Integer.valueOf(ki1VarE.A().size());
            ir3Var.d = Integer.valueOf(ki1VarE.B().A());
            ir3Var.h = ri1.a(ki1VarE.B().z());
            ir3Var.l = ri1.b((lr2) f13Var.e);
            oi1 oi1VarH = ir3Var.H();
            ci4 ci4Var = new ci4(20, false);
            ci4Var.h = null;
            ci4Var.l = null;
            ci4Var.d = oi1VarH;
            ci4Var.h = new sz0(nz.a(ki1VarE.A().k()));
            ci4Var.l = (Integer) f13Var.f;
            return ci4Var.p();
        } catch (IllegalArgumentException | sr1 unused) {
            v("Parsing HmacKey failed");
            return null;
        }
    }

    @Override // defpackage.wn2
    public wg4 f(View view, wg4 wg4Var) {
        String str = HtmlPreviewActivity.D;
        view.getClass();
        pp1 pp1VarG = wg4Var.a.g(135);
        pp1VarG.getClass();
        view.setPadding(pp1VarG.a, pp1VarG.b, pp1VarG.c, pp1VarG.d);
        return wg4.b;
    }
}
