package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class r11 {
    public static final ww0 a = new ww0();

    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, le1 le1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(obj) | kk0Var.h(obj2) | kk0Var.h(obj3);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new uw0(le1Var);
            kk0Var.l0(objP);
        }
    }

    public static final void DisposableEffect(Object obj, Object obj2, le1 le1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(obj) | kk0Var.h(obj2);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new uw0(le1Var);
            kk0Var.l0(objP);
        }
    }

    public static final void DisposableEffect(Object obj, le1 le1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(obj);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new uw0(le1Var);
            kk0Var.l0(objP);
        }
    }

    @cv0
    public static final void DisposableEffect(le1 le1Var, ck0 ck0Var, int i) {
        throw new IllegalStateException("DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.");
    }

    public static final void DisposableEffect(Object[] objArr, le1 le1Var, ck0 ck0Var, int i) {
        boolean zH = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zH |= ((kk0) ck0Var).h(obj);
        }
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            kk0Var.l0(new uw0(le1Var));
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, ne1 ne1Var, ck0 ck0Var, int i) {
        xp0 xp0VarH = ((kk0) ck0Var).b.h();
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(obj) | kk0Var.h(obj2) | kk0Var.h(obj3);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new xw1(xp0VarH, ne1Var);
            kk0Var.l0(objP);
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, ne1 ne1Var, ck0 ck0Var, int i) {
        xp0 xp0VarH = ((kk0) ck0Var).b.h();
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(obj) | kk0Var.h(obj2);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new xw1(xp0VarH, ne1Var);
            kk0Var.l0(objP);
        }
    }

    public static final void LaunchedEffect(Object obj, ne1 ne1Var, ck0 ck0Var, int i) {
        xp0 xp0VarH = ((kk0) ck0Var).b.h();
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(obj);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new xw1(xp0VarH, ne1Var);
            kk0Var.l0(objP);
        }
    }

    @cv0
    public static final void LaunchedEffect(ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-805415771);
        int i2 = i & 1;
        int i3 = 0;
        if (kk0Var.S(i2, i2 != 0)) {
            u41.r("LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.");
            return;
        }
        kk0Var.V();
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new q11(i, i3, ne1Var));
        }
    }

    public static final void LaunchedEffect(Object[] objArr, ne1 ne1Var, ck0 ck0Var, int i) {
        xp0 xp0VarH = ((kk0) ck0Var).b.h();
        boolean zH = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zH |= ((kk0) ck0Var).h(obj);
        }
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            kk0Var.l0(new xw1(xp0VarH, ne1Var));
        }
    }

    public static final void SideEffect(je1 je1Var, ck0 ck0Var, int i) {
        hq2 hq2Var = ((kk0) ck0Var).L.b.k;
        hq2Var.S(up2.c);
        xr0.q0(hq2Var, 0, je1Var);
    }

    public static final gq0 a(xp0 xp0Var, kk0 kk0Var) {
        if (xp0Var.get(bg1.s) == null) {
            return new e53(kk0Var.b.h(), xp0Var);
        }
        is1 is1VarC = yo4.c();
        is1VarC.M(new dg0(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return yo4.a(is1VarC);
    }

    public static final gq0 rememberCoroutineScope(je1 je1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            je1Var = d4.C;
        }
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = a((xp0) je1Var.invoke(), kk0Var);
            kk0Var.l0(objP);
        }
        return (gq0) objP;
    }
}
