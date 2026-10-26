package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class io1 {
    public static final gn3 animateFloat(go1 go1Var, float f, float f2, do1 do1Var, String str, ck0 ck0Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        int i3 = i << 3;
        return animateValue(go1Var, fValueOf, fValueOf2, mb4.a, do1Var, str, ck0Var, (i & 1022) | (57344 & i3) | (i3 & 458752), 0);
    }

    @cv0
    public static final /* synthetic */ gn3 animateValue(go1 go1Var, Object obj, Object obj2, w64 w64Var, do1 do1Var, ck0 ck0Var, int i) {
        int i2 = (i >> 3) & 8;
        return animateValue(go1Var, obj, obj2, w64Var, do1Var, "ValueAnimation", ck0Var, (i & 14) | 196608 | (i2 << 3) | (i & 112) | (i2 << 6) | (i & 896) | (i & 7168) | (i & 57344), 0);
    }

    public static final <T, V extends cg> gn3 animateValue(go1 go1Var, T t, T t2, w64 w64Var, do1 do1Var, String str, ck0 ck0Var, int i, int i2) {
        go1 go1Var2;
        T t3;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            go1Var2 = go1Var;
            eo1 eo1Var = new eo1(go1Var2, t, t2, w64Var, do1Var);
            t3 = t2;
            kk0Var.l0(eo1Var);
            objP = eo1Var;
        } else {
            go1Var2 = go1Var;
            t3 = t2;
        }
        eo1 eo1Var2 = (eo1) objP;
        boolean z = true;
        boolean z2 = ((((i & 112) ^ 48) > 32 && kk0Var.j(t)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && kk0Var.j(t3)) || (i & 384) == 256);
        if ((((57344 & i) ^ 24576) <= 16384 || !kk0Var.j(do1Var)) && (i & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP2 = kk0Var.P();
        if (z3 || objP2 == Composer$Companion.getEmpty()) {
            qa qaVar = new qa(t, eo1Var2, t3, do1Var, 1);
            kk0Var.l0(qaVar);
            objP2 = qaVar;
        }
        r11.SideEffect((je1) objP2, kk0Var, 0);
        boolean zJ = kk0Var.j(go1Var2);
        Object objP3 = kk0Var.P();
        if (zJ || objP3 == Composer$Companion.getEmpty()) {
            objP3 = new rc(go1Var2, 22, eo1Var2);
            kk0Var.l0(objP3);
        }
        r11.DisposableEffect(eo1Var2, (le1) objP3, kk0Var, 6);
        return eo1Var2;
    }

    public static final go1 rememberInfiniteTransition(String str, ck0 ck0Var, int i, int i2) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new go1();
            kk0Var.l0(objP);
        }
        go1 go1Var = (go1) objP;
        go1Var.run$animation_core_release(kk0Var, 0);
        return go1Var;
    }
}
