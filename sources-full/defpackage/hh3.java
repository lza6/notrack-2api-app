package defpackage;

import androidx.compose.material3.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class hh3 {
    public final boolean a;
    public final boolean b;
    public final ji4 c;

    public hh3(boolean z, wu0 wu0Var, ih3 ih3Var, le1 le1Var, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && ih3Var == ih3.h) {
            u41.k("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        if (z2 && ih3Var == ih3.c) {
            u41.k("The initial value must not be set to Hidden if skipHiddenState is set to true.");
            throw null;
        }
        this.c = new ji4(ih3Var, new pj2(16, wu0Var), new i43(7, wu0Var), fh3.a, le1Var);
    }

    public static Object a(hh3 hh3Var, ih3 ih3Var, mq3 mq3Var) {
        ji4 ji4Var = hh3Var.c;
        Object objC = a.c(ji4Var, ih3Var, ((bt2) ji4Var.k).f(), mq3Var);
        return objC == hq0.c ? objC : w84.a;
    }

    public final Object b(mq3 mq3Var) {
        if (this.b) {
            u41.r("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        Object objA = a(this, ih3.c, mq3Var);
        return objA == hq0.c ? objA : w84.a;
    }

    public final boolean c() {
        return ((ft2) this.c.g).getValue() != ih3.c;
    }

    public final Object d(mq3 mq3Var) {
        if (this.a) {
            u41.r("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        Object objA = a(this, ih3.h, mq3Var);
        return objA == hq0.c ? objA : w84.a;
    }
}
