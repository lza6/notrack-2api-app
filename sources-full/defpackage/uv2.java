package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class uv2 {
    /* JADX WARN: Code duplicated, block: B:101:0x022f  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0134  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x014c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0151  */
    /* JADX WARN: Code duplicated, block: B:82:0x0159  */
    /* JADX WARN: Code duplicated, block: B:94:0x0214  */
    /* JADX WARN: Code duplicated, block: B:96:0x0221  */
    /* JADX WARN: Code duplicated, block: B:98:0x0225  */
    private static final void PeriodHalf(final String str, final String str2, final boolean z, final je1 je1Var, c cVar, ck0 ck0Var, final int i, final int i2) {
        int i3;
        c cVar2;
        boolean z2;
        final c cVar3;
        w33 w33VarV;
        c cVar4;
        long jB;
        boolean z3;
        Object objP;
        vb2 vb2VarColumnMeasurePolicy;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        ab2 ab2Var;
        ic1 ic1Var;
        long jF;
        long jF2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1048601274);
        if ((i & 6) == 0) {
            i3 = (kk0Var.h(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var.h(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= kk0Var.i(z) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i3 |= kk0Var.j(je1Var) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (kk0Var.S(i3 & 1, z2)) {
                if (i4 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                c cVarN = xr0.N(cVar4, z73.a(11.0f));
                if (z) {
                    kk0Var.a0(-1611480947);
                    jB = re0.b(0.16f, gx.getBrandGreen(kk0Var, 0));
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(-1611479035);
                    kk0Var.r(false);
                    jB = re0.h;
                }
                c cVarB = a.b(cVarN, jB, k43.a);
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP = kk0Var.P();
                if (z3 || objP == Composer$Companion.getEmpty()) {
                    objP = new lp(je1Var, 17);
                    kk0Var.l0(objP);
                }
                c cVarM = androidx.compose.foundation.layout.a.m(a.e(cVarB, false, null, (je1) objP, 7), 0.0f, 8.0f, 1);
                vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getCenterHorizontally(), kk0Var, 48);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarM);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
                if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                ab2Var = ab2.a;
                uz3 uz3Var = ab2Var.getTypography(kk0Var, 0).m;
                if (z) {
                    ic1Var = ic1.m;
                } else {
                    ic1Var = ic1.h;
                }
                ic1 ic1Var2 = ic1Var;
                if (z) {
                    jF = fq2.f(kk0Var, 1906889262, kk0Var, 0, false);
                } else {
                    kk0Var.a0(1906890612);
                    jF = ab2Var.getColorScheme(kk0Var, 0).s;
                    kk0Var.r(false);
                }
                c cVar5 = cVar4;
                int i5 = i3;
                boolean z4 = false;
                uy3.m1842xe1e389ce(str, (c) null, jF, 0L, (gc1) null, ic1Var2, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var, (ck0) kk0Var, i3 & 14, 0, 65498);
                kk0Var = kk0Var;
                if (str2 != null || mo3.C0(str2)) {
                    kk0Var.a0(-1023969858);
                } else {
                    kk0Var.a0(-1015865311);
                    uz3 uz3Var2 = ab2Var.getTypography(kk0Var, 0).o;
                    if (z) {
                        jF2 = fq2.f(kk0Var, 1906897038, kk0Var, 0, false);
                    } else {
                        kk0Var.a0(1906898388);
                        jF2 = ab2Var.getColorScheme(kk0Var, 0).s;
                        kk0Var.r(false);
                    }
                    uy3.m1842xe1e389ce(str2, (c) null, jF2, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var2, (ck0) kk0Var, (i5 >> 3) & 14, 0, 65530);
                    kk0Var = kk0Var;
                    z4 = false;
                }
                kk0Var.r(z4);
                kk0Var.r(true);
                cVar3 = cVar5;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: tv2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uv2.a(str, str2, z, je1Var, cVar3, (ck0) obj, i, i2);
                        return w84.a;
                    }
                });
            }
        }
        i3 |= 24576;
        cVar2 = cVar;
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kk0Var.S(i3 & 1, z2)) {
            if (i4 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            c cVarN2 = xr0.N(cVar4, z73.a(11.0f));
            if (z) {
                kk0Var.a0(-1611480947);
                jB = re0.b(0.16f, gx.getBrandGreen(kk0Var, 0));
                kk0Var.r(false);
            } else {
                kk0Var.a0(-1611479035);
                kk0Var.r(false);
                jB = re0.h;
            }
            c cVarB2 = a.b(cVarN2, jB, k43.a);
            if ((i3 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP = kk0Var.P();
            if (z3) {
                objP = new lp(je1Var, 17);
                kk0Var.l0(objP);
            } else {
                objP = new lp(je1Var, 17);
                kk0Var.l0(objP);
            }
            c cVarM2 = androidx.compose.foundation.layout.a.m(a.e(cVarB2, false, null, (je1) objP, 7), 0.0f, 8.0f, 1);
            vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getCenterHorizontally(), kk0Var, 48);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarM2);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (kk0Var.a != null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            ab2Var = ab2.a;
            uz3 uz3Var3 = ab2Var.getTypography(kk0Var, 0).m;
            if (z) {
                ic1Var = ic1.m;
            } else {
                ic1Var = ic1.h;
            }
            ic1 ic1Var3 = ic1Var;
            if (z) {
                jF = fq2.f(kk0Var, 1906889262, kk0Var, 0, false);
            } else {
                kk0Var.a0(1906890612);
                jF = ab2Var.getColorScheme(kk0Var, 0).s;
                kk0Var.r(false);
            }
            c cVar6 = cVar4;
            int i6 = i3;
            boolean z5 = false;
            uy3.m1842xe1e389ce(str, (c) null, jF, 0L, (gc1) null, ic1Var3, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var3, (ck0) kk0Var, i3 & 14, 0, 65498);
            kk0Var = kk0Var;
            if (str2 != null) {
                kk0Var.a0(-1023969858);
            } else {
                kk0Var.a0(-1023969858);
            }
            kk0Var.r(z5);
            kk0Var.r(true);
            cVar3 = cVar6;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: tv2
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uv2.a(str, str2, z, je1Var, cVar3, (ck0) obj, i, i2);
                    return w84.a;
                }
            });
        }
    }

    private static final void PeriodSwitch(boolean z, le1 le1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(429652287);
        if ((i & 6) == 0) {
            i2 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(le1Var) ? 32 : 16;
        }
        int i3 = 1;
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            y73 y73VarA = z73.a(14.0f);
            long jB = re0.b(0.45f, ab2.a.getColorScheme(kk0Var, 0).r);
            Modifier$Companion modifier$Companion = c.i;
            hq3.m210x8dcae10(d.a, y73VarA, jB, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1497805542, true, new x80(i3, le1Var, z), kk0Var, 54), kk0Var, 12582918, 120);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new w30(i, le1Var, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 PeriodSwitch$lambda$19(boolean z, le1 le1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            c cVarK = androidx.compose.foundation.layout.a.k(c.i, 4.0f);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getTop(), kk0Var, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarK);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (kk0Var.a == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            pe peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            String strStringResource = ko3.stringResource(R.string.plans_bill_month, kk0Var, 0);
            boolean z2 = !z;
            boolean zH = kk0Var.h(le1Var);
            Object objP = kk0Var.P();
            if (zH || objP == Composer$Companion.getEmpty()) {
                objP = new f40(le1Var, 5);
                kk0Var.l0(objP);
            }
            PeriodHalf(strStringResource, null, z2, (je1) objP, new LayoutWeightElement(1.0f, true), kk0Var, 48, 0);
            String strStringResource2 = ko3.stringResource(R.string.plans_bill_year, kk0Var, 0);
            String strStringResource3 = ko3.stringResource(R.string.plans_bill_save, kk0Var, 0);
            boolean zH2 = kk0Var.h(le1Var);
            Object objP2 = kk0Var.P();
            if (zH2 || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new f40(le1Var, 6);
                kk0Var.l0(objP2);
            }
            PeriodHalf(strStringResource2, strStringResource3, z, (je1) objP2, new LayoutWeightElement(1.0f, true), kk0Var, 0, 0);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    private static final void PlanCard(uw2 uw2Var, boolean z, le1 le1Var, ck0 ck0Var, int i) {
        int i2;
        le1 le1Var2;
        kk0 kk0Var;
        List listU;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-362163768);
        if ((i & 6) == 0) {
            i2 = (kk0Var2.h(uw2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var2.i(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            le1Var2 = le1Var;
            i2 |= kk0Var2.j(le1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        } else {
            le1Var2 = le1Var;
        }
        if (kk0Var2.S(i2 & 1, (i2 & 147) != 146)) {
            boolean zJ0 = to3.j0(uw2Var.a, "_pro", false);
            if (zJ0) {
                kk0Var2.a0(-262787366);
                listU = kr1.U(ko3.stringResource(R.string.plans_f_pro_all, kk0Var2, 0), ko3.stringResource(R.string.plans_f_pro_limits, kk0Var2, 0), ko3.stringResource(R.string.plans_f_pro_queue, kk0Var2, 0), ko3.stringResource(R.string.plans_f_voice_max, kk0Var2, 0));
                kk0Var2.r(false);
            } else {
                kk0Var2.a0(-262527865);
                listU = kr1.U(ko3.stringResource(R.string.plans_f_models, kk0Var2, 0), ko3.stringResource(R.string.plans_f_memory, kk0Var2, 0), ko3.stringResource(R.string.plans_f_noads, kk0Var2, 0), ko3.stringResource(R.string.plans_f_voice, kk0Var2, 0));
                kk0Var2.r(false);
            }
            y73 y73VarA = z73.a(18.0f);
            long jB = re0.b(zJ0 ? 0.55f : 0.35f, ab2.a.getColorScheme(kk0Var2, 0).r);
            c cVarH = c.i;
            FillElement fillElement = d.a;
            if (zJ0) {
                kk0Var2.a0(-146994225);
                cVarH = sf3.h(cVarH, 1.0f, re0.b(0.45f, gx.getBrandGreen(kk0Var2, 0)), z73.a(18.0f));
                kk0Var2.r(false);
            } else {
                kk0Var2.a0(-146991312);
                kk0Var2.r(false);
            }
            kk0Var = kk0Var2;
            hq3.m210x8dcae10(fillElement.then(cVarH), y73VarA, jB, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(526233293, true, new em1(listU, zJ0, le1Var2, uw2Var, z), kk0Var2, 54), kk0Var, 12582912, 120);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new b70(uw2Var, z, le1Var, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    public static final w84 PlanCard$lambda$35(List list, boolean z, le1 le1Var, uw2 uw2Var, boolean z2, ck0 ck0Var, int i) {
        long jB;
        long jF;
        ?? r5 = 0;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i & 1, (i & 3) != 2);
        xk xkVar = kk0Var.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarK = androidx.compose.foundation.layout.a.k(modifier$Companion, 16.0f);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarK);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            pe peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            xt centerVertically = Alignment$Companion.getCenterVertically();
            cl clVar = hl.a;
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(clVar, centerVertically, kk0Var, 48);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN2 = kk0Var.n();
            c cVarD2 = b.d(kk0Var, modifier$Companion);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            pe peVarH2 = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN2);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            String str = uw2Var.c;
            ab2 ab2Var = ab2.a;
            uz3 uz3Var = ab2Var.getTypography(kk0Var, 0).h;
            ic1 ic1Var = ic1.n;
            uy3.m1842xe1e389ce(str, (c) null, gx.getBrandGreen(kk0Var, 0), 0L, (gc1) null, ic1Var, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var, (ck0) kk0Var, 196608, 0, 65498);
            kk0 kk0Var2 = kk0Var;
            if (z) {
                kk0Var2.a0(1071323470);
                cm3.Spacer(d.j(modifier$Companion, 8.0f), kk0Var2, 6);
                c cVarL = androidx.compose.foundation.layout.a.l(a.b(xr0.N(modifier$Companion, z73.a), re0.b(0.14f, gx.getBrandGreen(kk0Var2, 0)), k43.a), 8.0f, 2.0f);
                vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
                su2 su2VarN3 = kk0Var2.n();
                c cVarD3 = b.d(kk0Var2, cVarL);
                d4 constructor3 = ComposeUiNode$Companion.getConstructor();
                kk0Var2.e0();
                if (kk0Var2.O) {
                    kk0Var2.m(constructor3);
                } else {
                    kk0Var2.o0();
                }
                pe peVarH3 = fq2.h(kk0Var2, vb2VarC, kk0Var2, su2VarN3);
                if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                    fq2.v(currentCompositeKeyHash3, kk0Var2, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(kk0Var2, cVarD3, ComposeUiNode$Companion.getSetModifier());
                uy3.m1842xe1e389ce(ko3.stringResource(R.string.plans_tag_no_ceiling, kk0Var2, 0), (c) null, gx.getBrandGreen(kk0Var2, 0), 0L, (gc1) null, ic1.l, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).o, (ck0) kk0Var2, 196608, 0, 65498);
                kk0Var2 = kk0Var2;
                kk0Var2.r(true);
            } else {
                kk0Var2.a0(1061158043);
            }
            kk0Var2.r(false);
            kk0Var2.r(true);
            int i2 = 6;
            cm3.Spacer(d.d(modifier$Companion, 8.0f), kk0Var2, 6);
            vb2 vb2VarRowMeasurePolicy2 = e83.rowMeasurePolicy(clVar, Alignment$Companion.getBottom(), kk0Var2, 48);
            int currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN4 = kk0Var2.n();
            c cVarD4 = b.d(kk0Var2, modifier$Companion);
            d4 constructor4 = ComposeUiNode$Companion.getConstructor();
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor4);
            } else {
                kk0Var2.o0();
            }
            pe peVarH4 = fq2.h(kk0Var2, vb2VarRowMeasurePolicy2, kk0Var2, su2VarN4);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                fq2.v(currentCompositeKeyHash4, kk0Var2, currentCompositeKeyHash4, peVarH4);
            }
            xp1.E(kk0Var2, cVarD4, ComposeUiNode$Companion.getSetModifier());
            kk0 kk0Var3 = kk0Var2;
            cl clVar2 = clVar;
            uy3.m1842xe1e389ce(uw2Var.d, (c) null, 0L, 0L, (gc1) null, ic1Var, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).f, (ck0) kk0Var3, 196608, 0, 65502);
            cm3.Spacer(d.j(modifier$Companion, 6.0f), kk0Var3, 6);
            uy3.m1842xe1e389ce(ko3.stringResource(uw2Var.a() ? R.string.plans_per_year : R.string.plans_per_month, kk0Var3, 0), androidx.compose.foundation.layout.a.o(modifier$Companion, 0.0f, 0.0f, 0.0f, 3.0f, 7), ab2Var.getColorScheme(kk0Var3, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var3, 0).l, (ck0) kk0Var3, 48, 0, 65528);
            kk0 kk0Var4 = kk0Var3;
            kk0Var4.r(true);
            float f = 12.0f;
            cm3.Spacer(d.d(modifier$Companion, 12.0f), kk0Var4, 6);
            kk0Var4.a0(1939971444);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!mo3.C0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i3 = 0;
            kk0 kk0Var5 = kk0Var4;
            while (i3 < size) {
                int i4 = i3 + 1;
                String str2 = (String) arrayList.get(i3);
                Modifier$Companion modifier$Companion2 = c.i;
                c cVarO = androidx.compose.foundation.layout.a.o(modifier$Companion2, 0.0f, 0.0f, 0.0f, 6.0f, 7);
                cl clVar3 = clVar2;
                vb2 vb2VarRowMeasurePolicy3 = e83.rowMeasurePolicy(clVar3, Alignment$Companion.getTop(), kk0Var5, r5);
                int currentCompositeKeyHash5 = rj0.getCurrentCompositeKeyHash(kk0Var5, r5);
                su2 su2VarN5 = kk0Var5.n();
                c cVarD5 = b.d(kk0Var5, cVarO);
                androidx.compose.ui.node.a.j.getClass();
                d4 constructor5 = ComposeUiNode$Companion.getConstructor();
                kk0Var5.e0();
                if (kk0Var5.O) {
                    kk0Var5.m(constructor5);
                } else {
                    kk0Var5.o0();
                }
                pe peVarH5 = fq2.h(kk0Var5, vb2VarRowMeasurePolicy3, kk0Var5, su2VarN5);
                if (kk0Var5.O || !kr1.n(kk0Var5.P(), Integer.valueOf(currentCompositeKeyHash5))) {
                    fq2.v(currentCompositeKeyHash5, kk0Var5, currentCompositeKeyHash5, peVarH5);
                }
                xp1.E(kk0Var5, cVarD5, ComposeUiNode$Companion.getSetModifier());
                clVar2 = clVar3;
                kk0 kk0Var6 = kk0Var5;
                uy3.m1842xe1e389ce("•", (c) null, gx.getBrandGreen(kk0Var5, r5), 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var5, r5).l, (ck0) kk0Var6, 6, 0, 65530);
                cm3.Spacer(d.j(modifier$Companion2, 8.0f), kk0Var6, 6);
                uy3.m1842xe1e389ce(str2, (c) null, ab2Var.getColorScheme(kk0Var6, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var6, 0).l, (ck0) kk0Var6, 0, 0, 65530);
                kk0 kk0Var7 = kk0Var6;
                kk0Var7.r(true);
                i3 = i4;
                size = size;
                f = 12.0f;
                r5 = 0;
                kk0Var5 = kk0Var7;
            }
            kk0Var5.r(r5);
            cm3.Spacer(d.d(c.i, 10.0f), kk0Var5, 6);
            y73 y73VarA = z73.a(f);
            uy uyVar = uy.a;
            if (z) {
                jB = fq2.f(kk0Var5, 1939998285, kk0Var5, r5, r5);
            } else {
                kk0Var5.a0(1939999158);
                jB = re0.b(0.18f, gx.getBrandGreen(kk0Var5, r5));
                kk0Var5.r(r5);
            }
            if (z) {
                kk0Var5.a0(1940002344);
                kk0Var5.r(r5);
                jF = re0.b;
            } else {
                jF = fq2.f(kk0Var5, 1940002701, kk0Var5, r5, r5);
            }
            ty tyVarM1833x1b9ca94 = uyVar.m1833x1b9ca94(jB, jF, 0L, 0L, kk0Var5, 0, 12);
            FillElement fillElement = d.a;
            boolean zH = kk0Var5.h(le1Var) | kk0Var5.h(uw2Var);
            Object objP = kk0Var5.P();
            if (zH || objP == Composer$Companion.getEmpty()) {
                objP = new ye(le1Var, 21, uw2Var);
                kk0Var5.l0(objP);
            }
            kk0 kk0Var8 = kk0Var5;
            bz.Button((je1) objP, fillElement, z2, y73VarA, tyVarM1833x1b9ca94, null, null, null, null, zg0.rememberComposableLambda(-1636522189, true, new s00(i2, uw2Var), kk0Var5, 54), kk0Var8, 805306416, 480);
            kk0Var8.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 PlanCard$lambda$35$lambda$34$lambda$33(uw2 uw2Var, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            uy3.m1842xe1e389ce(ko3.stringResource(R.string.plans_get, new Object[]{uw2Var.c}, kk0Var, 0), (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196608, 0, 131038);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static final void PlansSheet(final List<uw2> list, final boolean z, final String str, final le1 le1Var, final je1 je1Var, final je1 je1Var2, ck0 ck0Var, final int i) {
        kk0 kk0Var;
        boolean z2;
        final boolean z3;
        list.getClass();
        le1Var.getClass();
        je1Var.getClass();
        je1Var2.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(1185621388);
        int i2 = (i & 6) == 0 ? (kk0Var2.j(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= kk0Var2.i(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var2.h(str) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var2.j(le1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= kk0Var2.j(je1Var) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= kk0Var2.j(je1Var2) ? 131072 : 65536;
        }
        if (kk0Var2.S(i2 & 1, (74899 & i2) != 74898)) {
            hh3 hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(true, null, kk0Var2, 6, 2);
            Object objP = kk0Var2.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = cl3.d(Boolean.FALSE);
                kk0Var2.l0(objP);
            }
            final mi2 mi2Var = (mi2) objP;
            final ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((uw2) obj).a() == ((Boolean) mi2Var.getValue()).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((uw2) it.next()).a()) {
                            if (list.isEmpty()) {
                                break;
                            }
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!((uw2) it2.next()).a()) {
                                        z2 = true;
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    z2 = true;
                    z3 = false;
                    break;
                }
            }
            z2 = true;
            z3 = false;
            break;
            kk0Var = kk0Var2;
            hf2.m206x750f78f8(je1Var2, null, hh3VarRememberModalBottomSheetState, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, zg0.rememberComposableLambda(-281857943, z2, new oe1() { // from class: rv2
                @Override // defpackage.oe1
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return uv2.PlansSheet$lambda$12(list, z3, arrayList, z, le1Var, str, je1Var, mi2Var, (lf0) obj2, (ck0) obj3, iIntValue);
                }
            }, kk0Var2, 54), kk0Var, (i2 >> 15) & 14, 384, 4090);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: sv2
                @Override // defpackage.ne1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    uv2.PlansSheet(list, z, str, le1Var, je1Var, je1Var2, (ck0) obj2, sf3.V(i | 1));
                    return w84.a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 PlansSheet$lambda$12(List list, boolean z, List list2, boolean z2, le1 le1Var, String str, je1 je1Var, mi2 mi2Var, lf0 lf0Var, ck0 ck0Var, int i) {
        lf0Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i & 1, (i & 17) != 16);
        xk xkVar = kk0Var.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarO = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.m(mb3.a(modifier$Companion, mb3.rememberScrollState(0, kk0Var, 0, 1), true), 20.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 28.0f, 7);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarO);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            pe peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            String strStringResource = ko3.stringResource(R.string.plans_title, kk0Var, 0);
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(strStringResource, (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).g, (ck0) kk0Var, 196608, 0, 65502);
            int i2 = 6;
            cm3.Spacer(d.d(modifier$Companion, 4.0f), kk0Var, 6);
            uy3.m1842xe1e389ce(ko3.stringResource(R.string.plans_manage_in_play, kk0Var, 0), (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).l, (ck0) kk0Var, 0, 0, 65530);
            kk0 kk0Var2 = kk0Var;
            if (list.isEmpty()) {
                kk0Var2.a0(1625818338);
                cm3.Spacer(d.d(modifier$Companion, 20.0f), kk0Var2, 6);
                vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var2, 48);
                int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
                su2 su2VarN2 = kk0Var2.n();
                c cVarD2 = b.d(kk0Var2, modifier$Companion);
                d4 constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var2.e0();
                if (kk0Var2.O) {
                    kk0Var2.m(constructor2);
                } else {
                    kk0Var2.o0();
                }
                pe peVarH2 = fq2.h(kk0Var2, vb2VarRowMeasurePolicy, kk0Var2, su2VarN2);
                if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                    fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var2, cVarD2, ComposeUiNode$Companion.getSetModifier());
                z03.m1882xe8727fba(d.d(d.n(modifier$Companion, 18.0f), 18.0f), 0L, 2.0f, 0L, 0, kk0Var2, 390, 26);
                cm3.Spacer(d.n(modifier$Companion, 12.0f), kk0Var2, 6);
                uy3.m1842xe1e389ce(ko3.stringResource(R.string.plans_loading, kk0Var2, 0), (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).k, (ck0) kk0Var2, 0, 0, 65534);
                kk0Var2 = kk0Var2;
                kk0Var2.r(true);
                kk0Var2.r(false);
            } else {
                kk0Var2.a0(1626557409);
                if (z) {
                    kk0Var2.a0(1626586363);
                    cm3.Spacer(d.d(modifier$Companion, 16.0f), kk0Var2, 6);
                    boolean zBooleanValue = ((Boolean) mi2Var.getValue()).booleanValue();
                    Object objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new m70(i2, mi2Var);
                        kk0Var2.l0(objP);
                    }
                    PeriodSwitch(zBooleanValue, (le1) objP, kk0Var2, 48);
                } else {
                    kk0Var2.a0(1621353935);
                }
                kk0Var2.r(false);
                cm3.Spacer(d.d(modifier$Companion, 16.0f), kk0Var2, 6);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    PlanCard((uw2) it.next(), !z2, le1Var, kk0Var2, 0);
                    cm3.Spacer(d.d(c.i, 12.0f), kk0Var2, 6);
                }
                kk0Var2.r(false);
            }
            if (str != null) {
                kk0Var2.a0(1627011404);
                cm3.Spacer(d.d(c.i, 8.0f), kk0Var2, 6);
                kk0 kk0Var3 = kk0Var2;
                uy3.m1842xe1e389ce(str, (c) null, ab2Var.getColorScheme(kk0Var2, 0).w, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).l, (ck0) kk0Var3, 0, 0, 65530);
                kk0Var2 = kk0Var3;
            } else {
                kk0Var2.a0(1621353935);
            }
            kk0Var2.r(false);
            cm3.Spacer(d.d(c.i, 8.0f), kk0Var2, 6);
            String strStringResource2 = ko3.stringResource(R.string.plans_manage_link, kk0Var2, 0);
            uz3 uz3Var = ab2Var.getTypography(kk0Var2, 0).l;
            long brandGreen = gx.getBrandGreen(kk0Var2, 0);
            FillElement fillElement = d.a;
            boolean zH = kk0Var2.h(je1Var);
            Object objP2 = kk0Var2.P();
            if (zH || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new lp(je1Var, 16);
                kk0Var2.l0(objP2);
            }
            kk0 kk0Var4 = kk0Var2;
            uy3.m1842xe1e389ce(strStringResource2, androidx.compose.foundation.layout.a.m(a.e(fillElement, false, null, (je1) objP2, 7), 0.0f, 10.0f, 1), brandGreen, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var, (ck0) kk0Var4, 0, 0, 65528);
            kk0Var4.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static void a(String str, String str2, boolean z, je1 je1Var, c cVar, ck0 ck0Var, int i, int i2) {
        PeriodHalf(str, str2, z, je1Var, cVar, ck0Var, sf3.V(i | 1), i2);
    }

    public static void c(boolean z, le1 le1Var, ck0 ck0Var, int i) {
        PeriodSwitch(z, le1Var, ck0Var, sf3.V(i | 1));
    }

    public static void e(uw2 uw2Var, boolean z, le1 le1Var, ck0 ck0Var, int i) {
        PlanCard(uw2Var, z, le1Var, ck0Var, sf3.V(i | 1));
    }
}
