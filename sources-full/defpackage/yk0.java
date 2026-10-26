package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class yk0 {
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
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
    public static final void CompositionLocalProvider(s13 s13Var, ne1 ne1Var, ck0 ck0Var, int i) {
        bb4 bb4Var;
        boolean z;
        w33 w33VarV;
        kn4 kn4VarU;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1350970552);
        rq1 rq1Var = kk0Var.w;
        su2 su2VarN = kk0Var.n();
        kk0Var.Y(201, mk0.b);
        Object objP = kk0Var.P();
        if (kr1.n(objP, Composer$Companion.getEmpty())) {
            bb4Var = null;
        } else {
            objP.getClass();
            bb4Var = (bb4) objP;
        }
        vk0 vk0Var = s13Var.a;
        vk0Var.getClass();
        Object objB = vk0Var.b(s13Var, bb4Var);
        boolean zEquals = objB.equals(bb4Var);
        if (!zEquals) {
            kk0Var.l0(objB);
        }
        if (!kk0Var.O) {
            wj3 wj3Var = kk0Var.F;
            Object objB2 = wj3Var.b(wj3Var.b, wj3Var.g);
            objB2.getClass();
            su2 su2Var = (su2) objB2;
            if (!(kk0Var.F() && zEquals) && (s13Var.h || !su2VarN.containsKey(vk0Var))) {
                kn4 kn4VarU2 = su2VarN.c.u(vk0Var.hashCode(), 0, vk0Var, objB);
                if (kn4VarU2 != null) {
                    su2VarN = new su2((n64) kn4VarU2.c, su2VarN.d + kn4VarU2.b);
                }
            } else if ((zEquals && !kk0Var.v) || !kk0Var.v) {
                su2VarN = su2Var;
            }
            if (kk0Var.x || su2Var != su2VarN) {
                z = true;
            }
            if (z && !kk0Var.O) {
                kk0Var.N(su2VarN);
            }
            rq1Var.e(kk0Var.v ? 1 : 0);
            kk0Var.v = z;
            kk0Var.J = su2VarN;
            kk0Var.W(202, 0, mk0.c, su2VarN);
            ne1Var.invoke(kk0Var, Integer.valueOf((i >> 3) & 14));
            kk0Var.r(false);
            kk0Var.r(false);
            kk0Var.v = rq1Var.d() != 0;
            kk0Var.J = null;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new wc(i, 5, s13Var, ne1Var));
            }
        }
        if ((s13Var.h || !su2VarN.containsKey(vk0Var)) && (kn4VarU = su2VarN.c.u(vk0Var.hashCode(), 0, vk0Var, objB)) != null) {
            su2VarN = new su2((n64) kn4VarU.c, su2VarN.d + kn4VarU.b);
        }
        kk0Var.I = true;
        z = false;
        if (z) {
            kk0Var.N(su2VarN);
        }
        rq1Var.e(kk0Var.v ? 1 : 0);
        kk0Var.v = z;
        kk0Var.J = su2VarN;
        kk0Var.W(202, 0, mk0.c, su2VarN);
        ne1Var.invoke(kk0Var, Integer.valueOf((i >> 3) & 14));
        kk0Var.r(false);
        kk0Var.r(false);
        kk0Var.v = rq1Var.d() != 0;
        kk0Var.J = null;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, 5, s13Var, ne1Var));
        }
    }

    public static final void CompositionLocalProvider(xk0 xk0Var, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1853897736);
        int i2 = (i & 6) == 0 ? (kk0Var.h(xk0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            su2 su2Var = xk0Var.a;
            su2Var.getClass();
            ArrayList arrayList = new ArrayList(su2Var.d);
            for (Map.Entry entry : (av2) su2Var.entrySet()) {
                arrayList.add(((bb4) entry.getValue()).a((vk0) entry.getKey()));
            }
            s13[] s13VarArr = (s13[]) arrayList.toArray(new s13[0]);
            CompositionLocalProvider((s13[]) Arrays.copyOf(s13VarArr, s13VarArr.length), ne1Var, kk0Var, i2 & 112);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, 6, xk0Var, ne1Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void CompositionLocalProvider(s13[] s13VarArr, ne1 ne1Var, ck0 ck0Var, int i) {
        su2 su2VarK0;
        boolean z;
        w33 w33VarV;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1390796515);
        rq1 rq1Var = kk0Var.w;
        su2 su2VarN = kk0Var.n();
        kk0Var.Y(201, mk0.b);
        if (kk0Var.O) {
            su2VarK0 = kk0Var.k0(su2VarN, yo4.a0(s13VarArr, su2VarN, su2.l));
            kk0Var.I = true;
        } else {
            wj3 wj3Var = kk0Var.F;
            Object objG = wj3Var.g(wj3Var.g, 0);
            objG.getClass();
            su2 su2Var = (su2) objG;
            wj3 wj3Var2 = kk0Var.F;
            Object objG2 = wj3Var2.g(wj3Var2.g, 1);
            objG2.getClass();
            su2 su2Var2 = (su2) objG2;
            su2 su2VarA0 = yo4.a0(s13VarArr, su2VarN, su2Var2);
            if (!kk0Var.F() || kk0Var.x || !su2Var2.equals(su2VarA0)) {
                su2VarK0 = kk0Var.k0(su2VarN, su2VarA0);
                if (kk0Var.x || !kr1.n(su2VarK0, su2Var)) {
                    z = true;
                }
                if (z && !kk0Var.O) {
                    kk0Var.N(su2VarK0);
                }
                rq1Var.e(kk0Var.v ? 1 : 0);
                kk0Var.v = z;
                kk0Var.J = su2VarK0;
                kk0Var.W(202, 0, mk0.c, su2VarK0);
                ne1Var.invoke(kk0Var, Integer.valueOf((i >> 3) & 14));
                kk0Var.r(false);
                kk0Var.r(false);
                kk0Var.v = rq1Var.d() != 0;
                kk0Var.J = null;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new wc(i, 4, s13VarArr, ne1Var));
                }
            }
            kk0Var.k = kk0Var.F.p() + kk0Var.k;
            su2VarK0 = su2Var;
        }
        z = false;
        if (z) {
            kk0Var.N(su2VarK0);
        }
        rq1Var.e(kk0Var.v ? 1 : 0);
        kk0Var.v = z;
        kk0Var.J = su2VarK0;
        kk0Var.W(202, 0, mk0.c, su2VarK0);
        ne1Var.invoke(kk0Var, Integer.valueOf((i >> 3) & 14));
        kk0Var.r(false);
        kk0Var.r(false);
        kk0Var.v = rq1Var.d() != 0;
        kk0Var.J = null;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, 4, s13VarArr, ne1Var));
        }
    }
}
