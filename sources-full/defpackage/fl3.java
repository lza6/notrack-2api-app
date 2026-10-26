package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class fl3 {
    public static final <T> gn3 produceState(T t, Object obj, Object obj2, Object obj3, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(t);
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        boolean zJ = kk0Var.j(ne1Var);
        Object objP2 = kk0Var.P();
        int i2 = 3;
        if (zJ || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new el3(ne1Var, mi2Var, null, i2);
            kk0Var.l0(objP2);
        }
        r11.LaunchedEffect(obj, obj2, obj3, (ne1) objP2, kk0Var, (i >> 3) & 1022);
        return mi2Var;
    }

    public static final <T> gn3 produceState(T t, Object obj, Object obj2, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(t);
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        boolean zJ = kk0Var.j(ne1Var);
        Object objP2 = kk0Var.P();
        if (zJ || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new el3(ne1Var, mi2Var, null, 2);
            kk0Var.l0(objP2);
        }
        r11.LaunchedEffect(obj, obj2, (ne1) objP2, kk0Var, (i >> 3) & 126);
        return mi2Var;
    }

    public static final <T> gn3 produceState(T t, Object obj, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(t);
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        boolean zJ = kk0Var.j(ne1Var);
        Object objP2 = kk0Var.P();
        if (zJ || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new el3(ne1Var, mi2Var, null, 1);
            kk0Var.l0(objP2);
        }
        r11.LaunchedEffect(obj, (ne1) objP2, kk0Var, (i >> 3) & 14);
        return mi2Var;
    }

    public static final <T> gn3 produceState(T t, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(t);
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        boolean zJ = kk0Var.j(ne1Var);
        Object objP2 = kk0Var.P();
        if (zJ || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new el3(ne1Var, mi2Var, null, 0);
            kk0Var.l0(objP2);
        }
        r11.LaunchedEffect(w84.a, (ne1) objP2, kk0Var, 6);
        return mi2Var;
    }

    public static final <T> gn3 produceState(T t, Object[] objArr, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(t);
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zJ = kk0Var.j(ne1Var);
        Object objP2 = kk0Var.P();
        if (zJ || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new el3(ne1Var, mi2Var, null, 4);
            kk0Var.l0(objP2);
        }
        r11.LaunchedEffect(objArrCopyOf, (ne1) objP2, (ck0) kk0Var, 0);
        return mi2Var;
    }
}
