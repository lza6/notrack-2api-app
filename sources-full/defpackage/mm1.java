package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mm1 {
    public final Context a;
    public nm1 b;
    public Object c;
    public ps3 d;
    public String e;
    public final Map f;
    public String g;
    public xp0 h;
    public xp0 i;
    public xp0 j;
    public final le1 k;
    public final le1 l;
    public final le1 m;
    public gi3 n;
    public ma3 o;
    public wx2 p;
    public final g61 q;

    public mm1(Context context) {
        this.a = context;
        this.b = nm1.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = a31.c;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        ma4 ma4Var = ma4.c;
        this.k = ma4Var;
        this.l = ma4Var;
        this.m = ma4Var;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = g61.b;
    }

    public mm1(pm1 pm1Var, Context context) {
        this.a = context;
        this.b = pm1Var.v;
        this.c = pm1Var.b;
        this.d = pm1Var.c;
        this.e = pm1Var.d;
        this.f = pm1Var.e;
        this.g = pm1Var.f;
        om1 om1Var = pm1Var.u;
        this.h = om1Var.a;
        this.i = om1Var.b;
        this.j = om1Var.c;
        this.k = om1Var.d;
        this.l = om1Var.e;
        this.m = om1Var.f;
        this.n = om1Var.g;
        this.o = om1Var.h;
        this.p = om1Var.i;
        this.q = pm1Var.t;
    }

    public final pm1 a() {
        Object obj = this.c;
        if (obj == null) {
            obj = tm2.a;
        }
        Object obj2 = obj;
        ps3 ps3Var = this.d;
        String str = this.e;
        Boolean bool = Boolean.FALSE;
        Map mapL = this.f;
        if (kr1.n(mapL, bool)) {
            mapL.getClass();
            mapL = av1.L(y64.k(mapL));
        } else if (mapL == null) {
            throw new AssertionError();
        }
        Map map = mapL;
        map.getClass();
        String str2 = this.g;
        nm1 nm1Var = this.b;
        a71 a71Var = nm1Var.a;
        tz tzVar = nm1Var.e;
        tz tzVar2 = nm1Var.f;
        tz tzVar3 = nm1Var.g;
        xp0 xp0Var = this.h;
        if (xp0Var == null) {
            xp0Var = nm1Var.b;
        }
        xp0 xp0Var2 = xp0Var;
        xp0 xp0Var3 = this.i;
        if (xp0Var3 == null) {
            xp0Var3 = nm1Var.c;
        }
        xp0 xp0Var4 = xp0Var3;
        xp0 xp0Var5 = this.j;
        if (xp0Var5 == null) {
            xp0Var5 = nm1Var.d;
        }
        xp0 xp0Var6 = xp0Var5;
        le1 le1Var = this.k;
        if (le1Var == null) {
            le1Var = nm1Var.h;
        }
        le1 le1Var2 = le1Var;
        le1 le1Var3 = this.l;
        if (le1Var3 == null) {
            le1Var3 = nm1Var.i;
        }
        le1 le1Var4 = le1Var3;
        le1 le1Var5 = this.m;
        if (le1Var5 == null) {
            le1Var5 = nm1Var.j;
        }
        le1 le1Var6 = le1Var5;
        gi3 gi3Var = this.n;
        if (gi3Var == null) {
            gi3Var = nm1Var.k;
        }
        gi3 gi3Var2 = gi3Var;
        ma3 ma3Var = this.o;
        if (ma3Var == null) {
            ma3Var = nm1Var.l;
        }
        ma3 ma3Var2 = ma3Var;
        wx2 wx2Var = this.p;
        if (wx2Var == null) {
            wx2Var = nm1Var.m;
        }
        wx2 wx2Var2 = wx2Var;
        g61 g61Var = this.q;
        if (g61Var == null) {
            throw new AssertionError();
        }
        return new pm1(this.a, obj2, ps3Var, str, map, str2, a71Var, xp0Var2, xp0Var4, xp0Var6, tzVar, tzVar2, tzVar3, le1Var2, le1Var4, le1Var6, gi3Var2, ma3Var2, wx2Var2, g61Var, new om1(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p), this.b);
    }
}
