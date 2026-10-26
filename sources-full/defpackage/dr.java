package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class dr {
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
    public static final void BackHandler(boolean z, je1 je1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        boolean z2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-361453782);
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
            i3 |= kk0Var.h(je1Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && kk0Var.F()) {
            kk0Var.V();
            z2 = z;
        } else {
            z2 = i4 != 0 ? true : z;
            gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(je1Var, kk0Var, (i3 >> 3) & 14);
            kk0Var.b0(-971159753);
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new cr(z2, gn3VarRememberUpdatedState);
                kk0Var.l0(objP);
            }
            cr crVar = (cr) objP;
            kk0Var.r(false);
            kk0Var.b0(-971159481);
            boolean zH = kk0Var.h(crVar) | kk0Var.i(z2);
            Object objP2 = kk0Var.P();
            if (zH || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new ar(crVar, z2);
                kk0Var.l0(objP2);
            }
            kk0Var.r(false);
            r11.SideEffect((je1) objP2, kk0Var, 0);
            ho2 current = e72.a.getCurrent(kk0Var, 6);
            if (current == null) {
                u41.r("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            go2 go2VarA = current.a();
            n32 n32Var = (n32) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            kk0Var.b0(-971159120);
            boolean zH2 = kk0Var.h(go2VarA) | kk0Var.h(n32Var) | kk0Var.h(crVar);
            Object objP3 = kk0Var.P();
            if (zH2 || objP3 == Composer$Companion.getEmpty()) {
                objP3 = new ie(go2VarA, n32Var, crVar, 4);
                kk0Var.l0(objP3);
            }
            kk0Var.r(false);
            r11.DisposableEffect(n32Var, go2VarA, (le1) objP3, kk0Var, 0);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new br(z2, je1Var, i, i2, 0));
        }
    }
}
