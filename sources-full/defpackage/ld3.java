package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ld3 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ le3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld3(ne1 ne1Var, le3 le3Var) {
        super(2);
        this.c = ne1Var;
        this.d = le3Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

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
    public final void invoke(ck0 ck0Var, int i) {
        ed3 ed3Var;
        vg2 vg2VarC;
        ed3 ed3Var2;
        vg2 vg2VarC2;
        int i2 = 1;
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 3) != 2)) {
            kk0Var.V();
            return;
        }
        this.c.invoke(kk0Var, 0);
        le3 le3Var = this.d;
        if (le3Var.g() && ((Boolean) le3Var.i.getValue()).booleanValue()) {
            fd3 fd3VarE = le3Var.e();
            if (!(fd3VarE == null ? true : kr1.n(fd3VarE.a, fd3VarE.b))) {
                kk0Var.a0(-881553831);
                fd3 fd3VarE2 = le3Var.e();
                if (fd3VarE2 == null) {
                    kk0Var.a0(-881514989);
                } else {
                    kk0Var.a0(-881514988);
                    kk0Var.a0(1495586214);
                    List listU = kr1.U(Boolean.TRUE, Boolean.FALSE);
                    int size = listU.size();
                    int i3 = 0;
                    while (i3 < size) {
                        boolean zBooleanValue = ((Boolean) listU.get(i3)).booleanValue();
                        boolean zI = kk0Var.i(zBooleanValue);
                        Object objP = kk0Var.P();
                        if (zI || objP == Composer$Companion.getEmpty()) {
                            objP = new ke3(zBooleanValue, le3Var);
                            kk0Var.l0(objP);
                        }
                        xt3 xt3Var = (xt3) objP;
                        boolean zI2 = kk0Var.i(zBooleanValue);
                        Object objP2 = kk0Var.P();
                        if (zI2 || objP2 == Composer$Companion.getEmpty()) {
                            objP2 = zBooleanValue ? new kd3(le3Var, 0) : new kd3(le3Var, i2);
                            kk0Var.l0(objP2);
                        }
                        je1 je1Var = (je1) objP2;
                        u53 u53Var = zBooleanValue ? fd3VarE2.a.a : fd3VarE2.b.a;
                        float fU = 0.0f;
                        if (zBooleanValue) {
                            fd3 fd3VarE3 = le3Var.e();
                            if (fd3VarE3 != null && (vg2VarC2 = le3Var.c((ed3Var2 = fd3VarE3.a))) != null) {
                                int i4 = ed3Var2.b;
                                xy3 xy3Var = (xy3) vg2VarC2.c.invoke();
                                if (xy3Var != null) {
                                    fU = jr1.u(xy3Var, i4);
                                }
                            }
                        } else {
                            fd3 fd3VarE4 = le3Var.e();
                            if (fd3VarE4 != null && (vg2VarC = le3Var.c((ed3Var = fd3VarE4.b))) != null) {
                                int i5 = ed3Var.b;
                                xy3 xy3Var2 = (xy3) vg2VarC.c.invoke();
                                if (xy3Var2 != null) {
                                    fU = jr1.u(xy3Var2, i5);
                                }
                            }
                        }
                        int i6 = size;
                        pd3 pd3Var = new pd3(je1Var);
                        int i7 = i3;
                        u53 u53Var2 = u53Var;
                        boolean z = fd3VarE2.c;
                        Modifier$Companion modifier$Companion = c.i;
                        boolean zJ = kk0Var.j(xt3Var);
                        Object objP3 = kk0Var.P();
                        if (zJ || objP3 == Composer$Companion.getEmpty()) {
                            objP3 = new jd3(xt3Var, 0);
                            kk0Var.l0(objP3);
                        }
                        od.m1779x3a93ba2d(pd3Var, zBooleanValue, u53Var2, z, 0L, fU, oq3.b(modifier$Companion, xt3Var, (PointerInputEventHandler) objP3), kk0Var, 0, 16);
                        i3 = i7 + 1;
                        size = i6;
                        i2 = 1;
                    }
                    kk0Var.r(false);
                }
                kk0Var.r(false);
                kk0Var.r(false);
                return;
            }
        }
        kk0Var.a0(-879541497);
        kk0Var.r(false);
    }
}
