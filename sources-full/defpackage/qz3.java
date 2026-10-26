package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class qz3 {
    public static final List a = kr1.U(Float.valueOf(0.85f), Float.valueOf(0.92f), Float.valueOf(1.0f), Float.valueOf(1.12f), Float.valueOf(1.25f));
    public static final dl0 b = new dl0(new b72(17));

    private static final void StepLetter(String str, int i, String str2, je1 je1Var, ck0 ck0Var, int i2) {
        String str3;
        int i3;
        int i4;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1495263415);
        if ((i2 & 6) == 0) {
            str3 = str;
            i3 = (kk0Var.h(str3) ? 4 : 2) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= kk0Var.f(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            i3 |= kk0Var.h(str2) ? 256 : Uuid.SIZE_BITS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= kk0Var.j(je1Var) ? 2048 : 1024;
        }
        if (kk0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            c cVarE = a.e(xr0.N(d.j(c.i, 40.0f), z73.a), false, null, je1Var, 7);
            boolean z = (i3 & 896) == 256;
            Object objP = kk0Var.P();
            if (z || objP == Composer$Companion.getEmpty()) {
                objP = new ep(str2, 6);
                kk0Var.l0(objP);
            }
            c cVarB = we3.b(cVarE, false, (le1) objP);
            vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarB);
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
            pe peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            uy3.m1842xe1e389ce(str3, (c) null, ab2.a.getColorScheme(kk0Var, 0).q, gm4.D(i4), (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, (i3 & 14) | 196608, 0, 131026);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new en(str, i, str2, je1Var, i2));
        }
    }

    public static final void TextSizeGlyph(c cVar, ck0 ck0Var, int i, int i2) {
        c cVar2;
        int i3;
        int i4;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1253054055);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            cVar2 = cVar;
        } else if ((i & 6) == 0) {
            cVar2 = cVar;
            i3 = i | (kk0Var.h(cVar2) ? 4 : 2);
        } else {
            cVar2 = cVar;
            i3 = i;
        }
        if (kk0Var.S(i3 & 1, (i3 & 3) != 2)) {
            c cVar3 = i5 != 0 ? c.i : cVar2;
            c cVarJ = d.j(cVar3, 20.0f);
            vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarJ);
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
            pe peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            i4 = 1;
            uy3.m1842xe1e389ce("Aa", (c) null, gx.getBrandGreen(kk0Var, 0), gm4.D(14), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 1, 0, (le1) null, (uz3) null, (ck0) kk0Var, 199686, 3456, 118738);
            kk0Var = kk0Var;
            kk0Var.r(true);
            cVar2 = cVar3;
        } else {
            i4 = 1;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new tr2(cVar2, i, i2, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x011a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void TextSizePanel(float f, final le1 le1Var, final je1 je1Var, c cVar, ck0 ck0Var, final int i, final int i2) {
        final float f2;
        int i3;
        c cVar2;
        boolean z;
        kk0 kk0Var;
        final c cVar3;
        w33 w33VarV;
        int iIndexOf;
        Object objP;
        Object objP2;
        le1Var.getClass();
        je1Var.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(2102737704);
        if ((i & 6) == 0) {
            f2 = f;
            i3 = (kk0Var2.e(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var2.j(le1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= kk0Var2.j(je1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var2.h(cVar2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i3 & 1, z)) {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                lh1 lh1Var = (lh1) kk0Var2.l(CompositionLocalsKt.getLocalHapticFeedback());
                iIndexOf = a.indexOf(Float.valueOf(d(f2)));
                if (iIndexOf < 0) {
                    iIndexOf = 0;
                }
                c cVarThen = d.o(cVar3, 460.0f, 1).then(d.a);
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = fq2.j(kk0Var2);
                }
                gh2 gh2Var = (gh2) objP;
                objP2 = kk0Var2.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new b72(16);
                    kk0Var2.l0(objP2);
                }
                c cVarD = a.d(cVarThen, gh2Var, null, false, null, (je1) objP2, 28);
                y73 y73VarA = z73.a(20.0f);
                ab2 ab2Var = ab2.a;
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(cVarD, y73VarA, ab2Var.getColorScheme(kk0Var2, 0).p, 0L, 0.0f, 12.0f, gm4.a(1.0f, re0.b(0.35f, ab2Var.getColorScheme(kk0Var2, 0).A)), zg0.rememberComposableLambda(1153267971, true, new j10(iIndexOf, je1Var, lh1Var, le1Var), kk0Var2, 54), kk0Var, 12804096, 8);
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar3 = cVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: pz3
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qz3.TextSizePanel(f2, le1Var, je1Var, cVar3, (ck0) obj, sf3.V(i | 1), i2);
                        return w84.a;
                    }
                });
            }
        }
        i3 |= 3072;
        cVar2 = cVar;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var2.S(i3 & 1, z)) {
            if (i4 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            lh1 lh1Var2 = (lh1) kk0Var2.l(CompositionLocalsKt.getLocalHapticFeedback());
            iIndexOf = a.indexOf(Float.valueOf(d(f2)));
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            c cVarThen2 = d.o(cVar3, 460.0f, 1).then(d.a);
            objP = kk0Var2.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = fq2.j(kk0Var2);
            }
            gh2 gh2Var2 = (gh2) objP;
            objP2 = kk0Var2.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = new b72(16);
                kk0Var2.l0(objP2);
            }
            c cVarD2 = a.d(cVarThen2, gh2Var2, null, false, null, (je1) objP2, 28);
            y73 y73VarA2 = z73.a(20.0f);
            ab2 ab2Var2 = ab2.a;
            kk0Var = kk0Var2;
            hq3.m210x8dcae10(cVarD2, y73VarA2, ab2Var2.getColorScheme(kk0Var2, 0).p, 0L, 0.0f, 12.0f, gm4.a(1.0f, re0.b(0.35f, ab2Var2.getColorScheme(kk0Var2, 0).A)), zg0.rememberComposableLambda(1153267971, true, new j10(iIndexOf, je1Var, lh1Var2, le1Var), kk0Var2, 54), kk0Var, 12804096, 8);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar3 = cVar2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: pz3
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qz3.TextSizePanel(f2, le1Var, je1Var, cVar3, (ck0) obj, sf3.V(i | 1), i2);
                    return w84.a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static final w84 TextSizePanel$lambda$16(final int i, je1 je1Var, final lh1 lh1Var, final le1 le1Var, ck0 ck0Var, int i2) {
        boolean z;
        final int i3 = 0;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i2 & 1, (i2 & 3) != 2);
        xk xkVar = kk0Var.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarN = androidx.compose.foundation.layout.a.n(modifier$Companion, 20.0f, 8.0f, 8.0f, 14.0f);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarN);
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
            String strStringResource = ko3.stringResource(R.string.chat_text_size, kk0Var, 0);
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(strStringResource, (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).i, (ck0) kk0Var, 196608, 0, 65502);
            cm3.Spacer(d.n(modifier$Companion, 10.0f), kk0Var, 6);
            List list = a;
            uy3.m1842xe1e389ce(gb2.R(((Number) list.get(i)).floatValue() * 100.0f) + "%", (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).k, (ck0) kk0Var, 0, 0, 65530);
            cm3.Spacer(new LayoutWeightElement(1.0f, true), kk0Var, 0);
            rl1.IconButton(je1Var, null, false, null, null, pj0.a, kk0Var, 196608, 30);
            kk0Var.r(true);
            xt centerVertically2 = Alignment$Companion.getCenterVertically();
            c cVarO = androidx.compose.foundation.layout.a.o(modifier$Companion, 0.0f, 0.0f, 12.0f, 0.0f, 11);
            vb2 vb2VarRowMeasurePolicy2 = e83.rowMeasurePolicy(clVar, centerVertically2, kk0Var, 48);
            int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN3 = kk0Var.n();
            c cVarD3 = b.d(kk0Var, cVarO);
            d4 constructor3 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor3);
            } else {
                kk0Var.o0();
            }
            pe peVarH3 = fq2.h(kk0Var, vb2VarRowMeasurePolicy2, kk0Var, su2VarN3);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
            String strStringResource2 = ko3.stringResource(R.string.chat_text_smaller, kk0Var, 0);
            boolean zF = kk0Var.f(i) | kk0Var.j(lh1Var) | kk0Var.h(le1Var);
            Object objP = kk0Var.P();
            if (zF || objP == Composer$Companion.getEmpty()) {
                objP = new je1() { // from class: nz3
                    @Override // defpackage.je1
                    public final Object invoke() {
                        int i4 = i3;
                        w84 w84Var = w84.a;
                        le1 le1Var2 = le1Var;
                        lh1 lh1Var2 = lh1Var;
                        int i5 = i;
                        switch (i4) {
                            case 0:
                                qz3.c(i5, lh1Var2, le1Var2, i5 - 1);
                                break;
                            default:
                                qz3.c(i5, lh1Var2, le1Var2, i5 + 1);
                                break;
                        }
                        return w84Var;
                    }
                };
                kk0Var.l0(objP);
            }
            StepLetter("A", 14, strStringResource2, (je1) objP, kk0Var, 54);
            float f = i;
            od0 od0Var = new od0(0.0f, list.size() - 1);
            int size = list.size() - 2;
            ii3 ii3VarM1776xe9175d64 = ni3.a.m1776xe9175d64(gx.getBrandGreen(kk0Var, 0), gx.getBrandGreen(kk0Var, 0), re0.b(0.7f, ab2Var.getColorScheme(kk0Var, 0).b), ab2Var.getColorScheme(kk0Var, 0).r, re0.b(0.55f, ab2Var.getColorScheme(kk0Var, 0).s), 0L, 0L, 0L, 0L, 0L, kk0Var, 0, 6, 992);
            c cVarM = androidx.compose.foundation.layout.a.m(new LayoutWeightElement(1.0f, true), 6.0f, 0.0f, 2);
            boolean zF2 = kk0Var.f(i) | kk0Var.j(lh1Var) | kk0Var.h(le1Var);
            Object objP2 = kk0Var.P();
            if (zF2 || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new le1() { // from class: oz3
                    @Override // defpackage.le1
                    public final Object invoke(Object obj) {
                        qz3.c(i, lh1Var, le1Var, gb2.R(((Float) obj).floatValue()));
                        return w84.a;
                    }
                };
                kk0Var.l0(objP2);
            }
            rj3.Slider(f, (le1) objP2, cVarM, false, od0Var, size, null, ii3VarM1776xe9175d64, null, kk0Var, 0, 328);
            String strStringResource3 = ko3.stringResource(R.string.chat_text_larger, kk0Var, 0);
            boolean zF3 = kk0Var.f(i) | kk0Var.j(lh1Var) | kk0Var.h(le1Var);
            Object objP3 = kk0Var.P();
            if (zF3 || objP3 == Composer$Companion.getEmpty()) {
                z = true;
                final char c = 1 == true ? 1 : 0;
                objP3 = new je1() { // from class: nz3
                    @Override // defpackage.je1
                    public final Object invoke() {
                        int i4 = c;
                        w84 w84Var = w84.a;
                        le1 le1Var2 = le1Var;
                        lh1 lh1Var2 = lh1Var;
                        int i5 = i;
                        switch (i4) {
                            case 0:
                                qz3.c(i5, lh1Var2, le1Var2, i5 - 1);
                                break;
                            default:
                                qz3.c(i5, lh1Var2, le1Var2, i5 + 1);
                                break;
                        }
                        return w84Var;
                    }
                };
                kk0Var.l0(objP3);
            } else {
                z = true;
            }
            StepLetter("A", 22, strStringResource3, (je1) objP3, kk0Var, 54);
            kk0Var.r(z);
            kk0Var.r(z);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static void a(String str, int i, String str2, je1 je1Var, ck0 ck0Var, int i2) {
        StepLetter(str, i, str2, je1Var, ck0Var, sf3.V(i2 | 1));
    }

    public static final void c(int i, lh1 lh1Var, le1 le1Var, int i2) {
        List list = a;
        int iX = py.x(i2, 0, kr1.H(list));
        if (iX != i) {
            lh1Var.mo63x70bb4fce(9);
            le1Var.invoke(list.get(iX));
        }
    }

    public static final float d(float f) {
        Iterator it = a.iterator();
        if (!it.hasNext()) {
            m51.o();
            return 0.0f;
        }
        Object next = it.next();
        if (it.hasNext()) {
            float fAbs = Math.abs(((Number) next).floatValue() - f);
            do {
                Object next2 = it.next();
                float fAbs2 = Math.abs(((Number) next2).floatValue() - f);
                if (Float.compare(fAbs, fAbs2) > 0) {
                    next = next2;
                    fAbs = fAbs2;
                }
            } while (it.hasNext());
        }
        return ((Number) next).floatValue();
    }
}
