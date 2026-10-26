package defpackage;

import android.view.View;
import java.util.List;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ay3 {
    public final fp1 a;
    public final zt3 b;
    public final ft2 d;
    public final ft2 c = cl3.d(Boolean.FALSE);
    public final sk3 e = new sk3(11, this);
    public final oi2 f = new oi2(0, new xd[16]);

    public ay3(String str, long j, fp1 fp1Var) {
        this.a = fp1Var;
        this.b = new zt3(new au3(str, p23.p(j, str.length()), (jz3) null, (List) null, 28), null, null, 14);
        this.d = cl3.d(new au3(str, j, (jz3) null, (List) null, 28));
    }

    public static final void a(ay3 ay3Var, boolean z, wu3 wu3Var) {
        au3 au3VarB = ay3Var.b();
        if (((oi2) ay3Var.b.a().d).h == 0 && jz3.b(au3VarB.h, ay3Var.b.l)) {
            if (kr1.n(au3VarB.l, ay3Var.b.m) && kr1.n(au3VarB.m, ay3Var.b.o) && kr1.n(au3VarB.c, ay3Var.b.n)) {
                return;
            }
            au3 au3VarB2 = ay3Var.b();
            String string = ay3Var.b.d.toString();
            zt3 zt3Var = ay3Var.b;
            long j = zt3Var.l;
            jz3 jz3Var = zt3Var.m;
            ay3Var.c(au3VarB2, new au3(string, j, jz3Var, zt3Var.o, by3.a(jz3Var, zt3Var.n)), z);
            return;
        }
        boolean z2 = ((oi2) ay3Var.b.a().d).h != 0;
        String string2 = ay3Var.b.d.toString();
        zt3 zt3Var2 = ay3Var.b;
        long j2 = zt3Var2.l;
        jz3 jz3Var2 = zt3Var2.m;
        au3 au3Var = new au3(string2, j2, jz3Var2, zt3Var2.o, by3.a(jz3Var2, zt3Var2.n));
        ay3Var.c(au3VarB, au3Var, z2 && z);
        mi4 mi4VarA = ay3Var.b.a();
        fp1 fp1Var = ay3Var.a;
        int iOrdinal = wu3Var.ordinal();
        if (iOrdinal == 0) {
            sf3.Q(fp1Var, au3VarB, au3Var, mi4VarA, true);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            sf3.Q(fp1Var, au3VarB, au3Var, mi4VarA, false);
        } else {
            ((ft2) fp1Var.d).setValue(null);
            p84 p84Var = (p84) fp1Var.c;
            p84Var.b.clear();
            p84Var.c.clear();
        }
    }

    public final au3 b() {
        return (au3) this.d.getValue();
    }

    public final void c(au3 au3Var, au3 au3Var2, boolean z) {
        this.d.setValue(au3Var2);
        this.c.setValue(Boolean.FALSE);
        oi2 oi2Var = this.f;
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            xd xdVar = (xd) objArr[i2];
            boolean z2 = (!z || to3.i0(au3Var.d, au3Var2) || au3Var.l == null) ? false : true;
            fy2 fy2Var = xdVar.a;
            long j = au3Var.h;
            jz3 jz3Var = au3Var.l;
            long j2 = au3Var2.h;
            jz3 jz3Var2 = au3Var2.l;
            if (z2) {
                fy2Var.i().restartInput((View) fy2Var.c);
            } else if (!jz3.b(j, j2) || !kr1.n(jz3Var, jz3Var2)) {
                fy2Var.i().updateSelection((View) fy2Var.c, jz3.f(j2), jz3.e(j2), jz3Var2 != null ? jz3.f(jz3Var2.a) : -1, jz3Var2 != null ? jz3.e(jz3Var2.a) : -1);
            }
        }
    }

    public final String toString() {
        pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
        le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
        pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            return "TextFieldState(selection=" + ((Object) jz3.h(b().h)) + ", text=\"" + ((Object) b().d) + "\")";
        } finally {
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
        }
    }
}
