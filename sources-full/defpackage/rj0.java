package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class rj0 {
    public static final <T, E extends xk> void ComposeNode(je1 je1Var, le1 le1Var, ck0 ck0Var, int i) {
        xk xkVar = ((kk0) ck0Var).a;
        kr1.f0();
        throw null;
    }

    public static final <T, E extends xk> void ComposeNode(je1 je1Var, le1 le1Var, ne1 ne1Var, ck0 ck0Var, int i) {
        xk xkVar = ((kk0) ck0Var).a;
        kr1.f0();
        throw null;
    }

    public static final <T, E extends xk> void ComposeNode(je1 je1Var, le1 le1Var, oe1 oe1Var, ne1 ne1Var, ck0 ck0Var, int i) {
        xk xkVar = ((kk0) ck0Var).a;
        kr1.f0();
        throw null;
    }

    public static final <T, E extends xk> void ReusableComposeNode(je1 je1Var, le1 le1Var, ck0 ck0Var, int i) {
        xk xkVar = ((kk0) ck0Var).a;
        kr1.f0();
        throw null;
    }

    public static final <T, E extends xk> void ReusableComposeNode(je1 je1Var, le1 le1Var, ne1 ne1Var, ck0 ck0Var, int i) {
        xk xkVar = ((kk0) ck0Var).a;
        kr1.f0();
        throw null;
    }

    public static final <T, E extends xk> void ReusableComposeNode(je1 je1Var, le1 le1Var, oe1 oe1Var, ne1 ne1Var, ck0 ck0Var, int i) {
        xk xkVar = ((kk0) ck0Var).a;
        kr1.f0();
        throw null;
    }

    public static final void ReusableContent(Object obj, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.d0(obj);
        ne1Var.invoke(kk0Var, Integer.valueOf((i >> 3) & 14));
        kk0Var.w();
    }

    public static final void ReusableContentHost(boolean z, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.d0(Boolean.valueOf(z));
        boolean zI = kk0Var.i(z);
        if (z) {
            ne1Var.invoke(kk0Var, Integer.valueOf((i >> 3) & 14));
        } else {
            kk0Var.o(zI);
        }
        kk0Var.w();
    }

    public static final void a() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final ck0 getCurrentComposer(ck0 ck0Var, int i) {
        throw new im2("Implemented as an intrinsic");
    }

    public static final int getCurrentCompositeKeyHash(ck0 ck0Var, int i) {
        return ((kk0) ck0Var).P;
    }

    public static final xk0 getCurrentCompositionLocalContext(ck0 ck0Var, int i) {
        return new xk0(((kk0) ck0Var).d().f());
    }

    public static final v33 getCurrentRecomposeScope(ck0 ck0Var, int i) {
        w33 w33VarC = ((kk0) ck0Var).C();
        if (w33VarC != null) {
            w33VarC.setUsed(true);
            return w33VarC;
        }
        u41.r("no recompose scope found");
        return null;
    }

    public static final <T> T key(Object[] objArr, ne1 ne1Var, ck0 ck0Var, int i) {
        return (T) ne1Var.invoke(ck0Var, Integer.valueOf((i >> 3) & 14));
    }

    public static final <T> T remember(Object obj, Object obj2, Object obj3, je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(obj) | kk0Var.h(obj2) | kk0Var.h(obj3);
        T t = (T) kk0Var.P();
        if (!zH && t != Composer$Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) je1Var.invoke();
        kk0Var.l0(t2);
        return t2;
    }

    public static final <T> T remember(Object obj, Object obj2, je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(obj) | kk0Var.h(obj2);
        T t = (T) kk0Var.P();
        if (!zH && t != Composer$Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) je1Var.invoke();
        kk0Var.l0(t2);
        return t2;
    }

    public static final <T> T remember(Object obj, je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(obj);
        T t = (T) kk0Var.P();
        if (!zH && t != Composer$Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) je1Var.invoke();
        kk0Var.l0(t2);
        return t2;
    }

    public static final <T> T remember(je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        T t = (T) kk0Var.P();
        if (t != Composer$Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) je1Var.invoke();
        kk0Var.l0(t2);
        return t2;
    }

    public static final <T> T remember(Object[] objArr, je1 je1Var, ck0 ck0Var, int i) {
        boolean zH = false;
        for (Object obj : objArr) {
            zH |= ((kk0) ck0Var).h(obj);
        }
        kk0 kk0Var = (kk0) ck0Var;
        T t = (T) kk0Var.P();
        if (!zH && t != Composer$Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) je1Var.invoke();
        kk0Var.l0(t2);
        return t2;
    }

    public static final qk0 rememberCompositionContext(ck0 ck0Var, int i) {
        return ((kk0) ck0Var).d();
    }
}
