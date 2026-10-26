package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class cy2 {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void PredictiveBackHandler(boolean z, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        boolean z2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-642000585);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(ne1Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && kk0Var.F()) {
            kk0Var.V();
            z2 = z;
        } else {
            z2 = i4 != 0 ? true : z;
            gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(ne1Var, kk0Var, (i3 >> 3) & 14);
            kk0Var.b0(-723524056);
            kk0Var.b0(-3687241);
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                al0 al0Var = new al0(r11.a(x21.c, kk0Var));
                kk0Var.l0(al0Var);
                objP = al0Var;
            }
            kk0Var.r(false);
            gq0 gq0Var = ((al0) objP).c;
            kk0Var.r(false);
            kk0Var.b0(-1071578902);
            Object objP2 = kk0Var.P();
            Object obj = objP2;
            if (objP2 == Composer$Companion.getEmpty()) {
                ne1 ne1Var2 = (ne1) gn3VarRememberUpdatedState.getValue();
                by2 by2Var = new by2(z2);
                by2Var.d = gq0Var;
                by2Var.e = ne1Var2;
                kk0Var.l0(by2Var);
                obj = by2Var;
            }
            by2 by2Var2 = (by2) obj;
            kk0Var.r(false);
            ne1 ne1Var3 = (ne1) gn3VarRememberUpdatedState.getValue();
            kk0Var.b0(-1071578713);
            boolean zH = kk0Var.h(ne1Var3) | kk0Var.h(gq0Var);
            Object objP3 = kk0Var.P();
            if (zH || objP3 == Composer$Companion.getEmpty()) {
                by2Var2.e = (ne1) gn3VarRememberUpdatedState.getValue();
                by2Var2.d = gq0Var;
                kk0Var.l0(w84.a);
            }
            kk0Var.r(false);
            Boolean boolValueOf = Boolean.valueOf(z2);
            kk0Var.b0(-1071578541);
            boolean zH2 = kk0Var.h(by2Var2) | kk0Var.i(z2);
            Object objP4 = kk0Var.P();
            if (zH2 || objP4 == Composer$Companion.getEmpty()) {
                objP4 = new ia2(by2Var2, z2, (so0) null);
                kk0Var.l0(objP4);
            }
            kk0Var.r(false);
            r11.LaunchedEffect(boolValueOf, (ne1) objP4, kk0Var, i3 & 14);
            ho2 current = e72.a.getCurrent(kk0Var, 6);
            if (current == null) {
                u41.r("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            go2 go2VarA = current.a();
            n32 n32Var = (n32) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            kk0Var.b0(-1071578150);
            boolean zH3 = kk0Var.h(go2VarA) | kk0Var.h(n32Var) | kk0Var.h(by2Var2);
            Object objP5 = kk0Var.P();
            if (zH3 || objP5 == Composer$Companion.getEmpty()) {
                objP5 = new ie(go2VarA, n32Var, by2Var2, 20);
                kk0Var.l0(objP5);
            }
            kk0Var.r(false);
            r11.DisposableEffect(n32Var, go2VarA, (le1) objP5, kk0Var, 0);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new br(z2, ne1Var, i, i2, 1));
        }
    }
}
