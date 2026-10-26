package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class d53 {
    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final <T> T rememberSaveable(Object[] objArr, x93 x93Var, String str, je1 je1Var, ck0 ck0Var, int i, int i2) {
        Object[] objArr2;
        T t;
        Object objConsumeRestored;
        if ((i2 & 2) != 0) {
            x93Var = z93.a;
        }
        x93 x93Var2 = x93Var;
        if ((i2 & 4) != 0) {
            str = null;
        }
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        if (str == null || str.length() == 0) {
            yo4.m(36);
            str = Integer.toString(currentCompositeKeyHash, 36);
            str.getClass();
        }
        String str2 = str;
        x93Var2.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        g93 g93Var = (g93) kk0Var.l(i93.a);
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            Object objJ = (g93Var == null || (objConsumeRestored = g93Var.consumeRestored(str2)) == null) ? null : x93Var2.j(objConsumeRestored);
            if (objJ == null) {
                objJ = je1Var.invoke();
            }
            objArr2 = objArr;
            a93 a93Var = new a93(x93Var2, g93Var, str2, objJ, objArr2);
            kk0Var.l0(a93Var);
            objP = a93Var;
        } else {
            objArr2 = objArr;
        }
        a93 a93Var2 = (a93) objP;
        Object objInvoke = Arrays.equals(objArr2, a93Var2.m) ? a93Var2.l : null;
        if (objInvoke == null) {
            objInvoke = je1Var.invoke();
        }
        boolean zJ = kk0Var.j(a93Var2) | ((((i & 112) ^ 48) > 32 && kk0Var.j(x93Var2)) || (i & 48) == 32) | kk0Var.j(g93Var) | kk0Var.h(str2) | kk0Var.j(objInvoke) | kk0Var.j(objArr2);
        Object objP2 = kk0Var.P();
        if (zJ || objP2 == Composer$Companion.getEmpty()) {
            Object[] objArr3 = objArr2;
            t = (T) objInvoke;
            c53 c53Var = new c53(a93Var2, x93Var2, g93Var, str2, t, objArr3);
            kk0Var.l0(c53Var);
            objP2 = c53Var;
        } else {
            t = (T) objInvoke;
        }
        r11.SideEffect((je1) objP2, kk0Var, 0);
        return t;
    }

    /* JADX INFO: renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> mi2 m175x619fbe04(Object[] objArr, x93 x93Var, String str, je1 je1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x93Var.getClass();
        ea eaVar = new ea(10, x93Var);
        pj2 pj2Var = new pj2(8, x93Var);
        fp1 fp1Var = z93.a;
        return (mi2) rememberSaveable(objArrCopyOf, (x93) new fp1(eaVar, pj2Var), str2, je1Var, ck0Var, i & 8064, 0);
    }
}
