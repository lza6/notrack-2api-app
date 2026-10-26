package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class i4 {
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
    public static final <I, O> j92 rememberLauncherForActivityResult(s3 s3Var, le1 le1Var, ck0 ck0Var, int i) {
        s3 s3Var2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.b0(-1408504823);
        cl3.rememberUpdatedState(s3Var, kk0Var, i & 14);
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(le1Var, kk0Var, (i >> 3) & 14);
        String str = (String) d53.rememberSaveable(new Object[0], (x93) null, (String) null, (je1) d4.h, (ck0) kk0Var, 3072, 6);
        j4 current = z62.a.getCurrent(kk0Var, 6);
        if (current == null) {
            u41.r("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        ng0 ng0VarF = current.f();
        kk0Var.b0(-1672765924);
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new z3();
            kk0Var.l0(objP);
        }
        z3 z3Var = (z3) objP;
        kk0Var.r(false);
        kk0Var.b0(-1672765850);
        Object objP2 = kk0Var.P();
        if (objP2 == Composer$Companion.getEmpty()) {
            objP2 = new j92(z3Var);
            kk0Var.l0(objP2);
        }
        j92 j92Var = (j92) objP2;
        kk0Var.r(false);
        kk0Var.b0(-1672765582);
        boolean zH = kk0Var.h(z3Var) | kk0Var.h(ng0VarF) | kk0Var.h(str) | kk0Var.h(s3Var) | kk0Var.h(gn3VarRememberUpdatedState);
        Object objP3 = kk0Var.P();
        if (zH || objP3 == Composer$Companion.getEmpty()) {
            h4 h4Var = new h4(z3Var, ng0VarF, str, s3Var, gn3VarRememberUpdatedState, 0);
            s3Var2 = s3Var;
            kk0Var.l0(h4Var);
            objP3 = h4Var;
        } else {
            s3Var2 = s3Var;
        }
        kk0Var.r(false);
        r11.DisposableEffect(ng0VarF, str, s3Var2, (le1) objP3, kk0Var, (i << 6) & 896);
        kk0Var.r(false);
        return j92Var;
    }
}
