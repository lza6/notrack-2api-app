package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class tg4 {
    public static final wg4 b;
    public final wg4 a;

    static {
        ng4 lg4Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            lg4Var = new mg4();
        } else {
            lg4Var = i >= 29 ? new lg4() : new jg4();
        }
        b = lg4Var.b().a.a().a.b().a.c();
    }

    public tg4(wg4 wg4Var) {
        this.a = wg4Var;
    }

    public wg4 a() {
        return this.a;
    }

    public wg4 b() {
        return this.a;
    }

    public wg4 c() {
        return this.a;
    }

    public void d(View view) {
    }

    public void e(wg4 wg4Var) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg4)) {
            return false;
        }
        tg4 tg4Var = (tg4) obj;
        return p() == tg4Var.p() && o() == tg4Var.o() && Objects.equals(l(), tg4Var.l()) && Objects.equals(j(), tg4Var.j()) && Objects.equals(f(), tg4Var.f());
    }

    public tw0 f() {
        return null;
    }

    public pp1 g(int i) {
        return pp1.e;
    }

    public pp1 h(int i) {
        if ((i & 8) == 0) {
            return pp1.e;
        }
        u41.k("Unable to query the maximum insets for IME");
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public pp1 i() {
        return l();
    }

    public pp1 j() {
        return pp1.e;
    }

    public pp1 k() {
        return l();
    }

    public pp1 l() {
        return pp1.e;
    }

    public pp1 m() {
        return l();
    }

    public wg4 n(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i) {
        return true;
    }

    public void r(pp1[] pp1VarArr) {
    }

    public void s(pp1 pp1Var) {
    }

    public void t(wg4 wg4Var) {
    }

    public void u(pp1 pp1Var) {
    }
}
