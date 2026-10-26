package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.Brush$Companion;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import java.util.Locale;
import kotlin.uuid.Uuid;
import notrack.ai.data.promo.BonusBar;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class xv {
    public static final long a = gb2.b(737523240);
    public static final long b = gb2.b(234200587);
    public static final long c = gb2.d(2161418263L);
    public static final long d = gb2.b(620745303);
    public static final long e = gb2.d(4294955607L);
    public static final long f = gb2.d(4294288139L);
    public static final long g = gb2.d(4282000896L);

    /* JADX WARN: Code duplicated, block: B:101:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:104:0x042f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0433  */
    /* JADX WARN: Code duplicated, block: B:110:0x044c  */
    /* JADX WARN: Code duplicated, block: B:113:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:114:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x04da  */
    /* JADX WARN: Code duplicated, block: B:122:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:123:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:125:0x051b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0521  */
    /* JADX WARN: Code duplicated, block: B:130:0x052a  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0203  */
    /* JADX WARN: Code duplicated, block: B:80:0x021c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0228  */
    /* JADX WARN: Code duplicated, block: B:84:0x0244  */
    /* JADX WARN: Code duplicated, block: B:86:0x0255  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:96:0x0307  */
    /* JADX WARN: Code duplicated, block: B:99:0x0364  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean, int] */
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
    public static final void BonusBarCard(BonusBar bonusBar, je1 je1Var, je1 je1Var2, c cVar, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        boolean z;
        kk0 kk0Var;
        w33 w33VarV;
        c cVar3;
        String lowerCase;
        yv yvVar;
        re0 re0VarC;
        re0 re0VarC2;
        long j;
        long j2;
        long j3;
        long j4;
        boolean z2;
        long j5;
        Object objP;
        yv yvVar2;
        vb2 vb2VarRowMeasurePolicy;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        je1 constructor;
        pe peVarH;
        String icon;
        yv yvVar3;
        float f2;
        long j6;
        long j7;
        ?? r8;
        ?? r5;
        kk0 kk0Var2;
        int currentCompositeKeyHash2;
        je1 constructor2;
        pe peVarH2;
        ab2 ab2Var;
        kk0 kk0Var3;
        kk0 kk0Var4;
        int currentCompositeKeyHash3;
        d4 constructor3;
        pe peVarH3;
        kk0 kk0Var5;
        int currentCompositeKeyHash4;
        d4 constructor4;
        pe peVarH4;
        String dismiss;
        String str;
        bonusBar.getClass();
        je1Var.getClass();
        je1Var2.getClass();
        kk0 kk0Var6 = (kk0) ck0Var;
        kk0Var6.c0(1939761407);
        xk xkVar = kk0Var6.a;
        if ((i & 6) == 0) {
            i3 = (kk0Var6.h(bonusBar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var6.j(je1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= kk0Var6.j(je1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var6.h(cVar2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var6.S(i3 & 1, z)) {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                lowerCase = bonusBar.getTheme().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (lowerCase.equals("ai")) {
                    yvVar = new yv(gb2.b(728534271), gb2.b(227237110), gb2.b(1720297471), gb2.b(614844671), gb2.d(4283399673L), gb2.d(4286340348L), gb2.d(4294967295L), false);
                } else {
                    yvVar = new yv(a, b, c, d, e, f, g, true);
                }
                re0VarC = c(bonusBar.getAccent());
                re0VarC2 = c(bonusBar.getBg());
                if (re0VarC2 != null) {
                    j = re0VarC2.a;
                } else {
                    j = yvVar.a;
                }
                if (re0VarC != null) {
                    j2 = re0VarC.a;
                } else {
                    j2 = yvVar.c;
                }
                if (re0VarC != null) {
                    j3 = re0VarC.a;
                } else {
                    j3 = yvVar.f;
                }
                if (re0VarC != null) {
                    j4 = re0VarC.a;
                } else {
                    j4 = yvVar.e;
                }
                if (yvVar.h || !mo3.C0(bonusBar.getIcon())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                j5 = j3;
                c cVarH = sf3.h(a.a(a.a(xr0.N(androidx.compose.foundation.layout.a.l(cVar3.then(d.a), 12.0f, 6.0f), z73.a(14.0f)), Brush$Companion.m7xd6c5694e(kr1.U(new re0(j), new re0(yvVar.b))), null, 6), new h23(kr1.U(new re0(yvVar.d), new re0(re0.h)), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), 260.0f), null, 6), 1.0f, j2, z73.a(14.0f));
                objP = kk0Var6.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = fq2.j(kk0Var6);
                }
                yvVar2 = yvVar;
                c cVarN = androidx.compose.foundation.layout.a.n(a.d(cVarH, (gh2) objP, null, false, null, je1Var, 28), 10.0f, 8.0f, 2.0f, 8.0f);
                vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var6, 48);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var6, 0);
                su2VarN = kk0Var6.n();
                cVarD = b.d(kk0Var6, cVarN);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var6.e0();
                if (kk0Var6.O) {
                    kk0Var6.m(constructor);
                } else {
                    kk0Var6.o0();
                }
                peVarH = fq2.h(kk0Var6, vb2VarRowMeasurePolicy, kk0Var6, su2VarN);
                if (kk0Var6.O || !kr1.n(kk0Var6.P(), Integer.valueOf(currentCompositeKeyHash))) {
                    fq2.v(currentCompositeKeyHash, kk0Var6, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var6, cVarD, ComposeUiNode$Companion.getSetModifier());
                if (z2) {
                    kk0Var6.a0(-1381227214);
                    CoinStackIcon(kk0Var6, 0);
                    kk0Var6.r(false);
                    f2 = 1.0f;
                    j7 = j4;
                    yvVar3 = yvVar2;
                    j6 = j5;
                    r8 = 0;
                    r5 = 1;
                    kk0Var2 = kk0Var6;
                } else {
                    kk0Var6.a0(-1381226253);
                    icon = bonusBar.getIcon();
                    if (mo3.C0(icon)) {
                        icon = "✨";
                    }
                    yvVar3 = yvVar2;
                    String str2 = icon;
                    f2 = 1.0f;
                    j6 = j5;
                    j7 = j4;
                    r8 = 0;
                    r5 = 1;
                    uy3.m1842xe1e389ce(str2, (c) null, 0L, gm4.D(20), (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var6, 3072, 0, 131062);
                    kk0 kk0Var7 = kk0Var6;
                    kk0Var7.r(false);
                    kk0Var2 = kk0Var7;
                }
                Modifier$Companion modifier$Companion = c.i;
                cm3.Spacer(d.n(modifier$Companion, 9.0f), kk0Var2, 6);
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f2, r5);
                vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var2, r8);
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var2, r8);
                su2 su2VarN2 = kk0Var2.n();
                c cVarD2 = b.d(kk0Var2, layoutWeightElement);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var2.e0();
                if (kk0Var2.O) {
                    kk0Var2.m(constructor2);
                } else {
                    kk0Var2.o0();
                }
                peVarH2 = fq2.h(kk0Var2, vb2VarColumnMeasurePolicy, kk0Var2, su2VarN2);
                if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                    fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var2, cVarD2, ComposeUiNode$Companion.getSetModifier());
                String text = bonusBar.getText();
                long jC = gm4.C(13.2d);
                ic1 ic1Var = ic1.o;
                long jD = gm4.D(16);
                ab2Var = ab2.a;
                c cVar4 = cVar3;
                kk0 kk0Var8 = kk0Var2;
                uy3.m1842xe1e389ce(text, (c) null, ab2Var.getColorScheme(kk0Var2, r8).q, jC, (gc1) null, ic1Var, (lb1) null, 0L, (tt3) null, (jt3) null, jD, 2, false, 2, 0, (le1) null, (uz3) null, (ck0) kk0Var8, 199680, 3126, 119762);
                kk0Var3 = kk0Var8;
                if (mo3.C0(bonusBar.getSub())) {
                    kk0Var3.a0(1070429577);
                    kk0Var4 = kk0Var3;
                } else {
                    kk0Var3.a0(1077146750);
                    uy3.m1842xe1e389ce(bonusBar.getSub(), (c) null, re0.b(0.62f, ab2Var.getColorScheme(kk0Var3, r8).q), gm4.C(11.8d), (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, gm4.D(14), 2, false, 1, 0, (le1) null, (uz3) null, (ck0) kk0Var3, 3072, 3126, 119794);
                    kk0Var4 = kk0Var3;
                }
                kk0Var4.r(r8);
                kk0Var4.r(r5);
                cm3.Spacer(d.n(modifier$Companion, 8.0f), kk0Var4, 6);
                c cVarL = androidx.compose.foundation.layout.a.l(a.e(a.a(xr0.N(d.f(d.o(modifier$Companion, 132.0f, r5), 36.0f, 0.0f, 2), z73.a(10.0f)), Brush$Companion.m7xd6c5694e(kr1.U(new re0(j7), new re0(j6))), null, 6), r8, null, je1Var, 7), 12.0f, 8.0f);
                vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), r8);
                currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var4, r8);
                su2 su2VarN3 = kk0Var4.n();
                c cVarD3 = b.d(kk0Var4, cVarL);
                constructor3 = ComposeUiNode$Companion.getConstructor();
                kk0Var4.e0();
                if (kk0Var4.O) {
                    kk0Var4.m(constructor3);
                } else {
                    kk0Var4.o0();
                }
                peVarH3 = fq2.h(kk0Var4, vb2VarC, kk0Var4, su2VarN3);
                if (kk0Var4.O || !kr1.n(kk0Var4.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                    fq2.v(currentCompositeKeyHash3, kk0Var4, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(kk0Var4, cVarD3, ComposeUiNode$Companion.getSetModifier());
                kk0 kk0Var9 = kk0Var4;
                uy3.m1842xe1e389ce(bonusBar.getCta(), (c) null, yvVar3.g, gm4.C(12.5d), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, gm4.D(15), 3, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var9, 199680, 54, 127954);
                kk0Var5 = kk0Var9;
                kk0Var5.r(r5);
                c cVarE = a.e(d.j(modifier$Companion, 44.0f), r8, null, je1Var2, 7);
                vb2 vb2VarC2 = vw.c(Alignment$Companion.getCenter(), r8);
                currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var5, r8);
                su2 su2VarN4 = kk0Var5.n();
                c cVarD4 = b.d(kk0Var5, cVarE);
                constructor4 = ComposeUiNode$Companion.getConstructor();
                kk0Var5.e0();
                if (kk0Var5.O) {
                    kk0Var5.m(constructor4);
                } else {
                    kk0Var5.o0();
                }
                peVarH4 = fq2.h(kk0Var5, vb2VarC2, kk0Var5, su2VarN4);
                if (kk0Var5.O || !kr1.n(kk0Var5.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                    fq2.v(currentCompositeKeyHash4, kk0Var5, currentCompositeKeyHash4, peVarH4);
                }
                xp1.E(kk0Var5, cVarD4, ComposeUiNode$Companion.getSetModifier());
                ym1 x = s22.a.getX(kk0Var5, 6);
                dismiss = bonusBar.getDismiss();
                if (mo3.C0(dismiss)) {
                    str = null;
                } else {
                    str = dismiss;
                }
                ul1.m1829xf2a7a69(x, str, d.j(modifier$Companion, 16.0f), re0.b(0.45f, ab2Var.getColorScheme(kk0Var5, r8).q), kk0Var5, 384, 0);
                kk0Var5.r(r5);
                kk0Var5.r(r5);
                cVar2 = cVar4;
                kk0Var = kk0Var5;
            } else {
                kk0Var6.V();
                kk0Var = kk0Var6;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new wv(bonusBar, je1Var, je1Var2, cVar2, i, i2, 0));
            }
        }
        i3 |= 3072;
        cVar2 = cVar;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var6.S(i3 & 1, z)) {
            if (i4 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            lowerCase = bonusBar.getTheme().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("ai")) {
                yvVar = new yv(gb2.b(728534271), gb2.b(227237110), gb2.b(1720297471), gb2.b(614844671), gb2.d(4283399673L), gb2.d(4286340348L), gb2.d(4294967295L), false);
            } else {
                yvVar = new yv(a, b, c, d, e, f, g, true);
            }
            re0VarC = c(bonusBar.getAccent());
            re0VarC2 = c(bonusBar.getBg());
            if (re0VarC2 != null) {
                j = re0VarC2.a;
            } else {
                j = yvVar.a;
            }
            if (re0VarC != null) {
                j2 = re0VarC.a;
            } else {
                j2 = yvVar.c;
            }
            if (re0VarC != null) {
                j3 = re0VarC.a;
            } else {
                j3 = yvVar.f;
            }
            if (re0VarC != null) {
                j4 = re0VarC.a;
            } else {
                j4 = yvVar.e;
            }
            if (yvVar.h) {
                z2 = false;
            } else {
                z2 = false;
            }
            j5 = j3;
            c cVarH2 = sf3.h(a.a(a.a(xr0.N(androidx.compose.foundation.layout.a.l(cVar3.then(d.a), 12.0f, 6.0f), z73.a(14.0f)), Brush$Companion.m7xd6c5694e(kr1.U(new re0(j), new re0(yvVar.b))), null, 6), new h23(kr1.U(new re0(yvVar.d), new re0(re0.h)), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), 260.0f), null, 6), 1.0f, j2, z73.a(14.0f));
            objP = kk0Var6.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = fq2.j(kk0Var6);
            }
            yvVar2 = yvVar;
            c cVarN2 = androidx.compose.foundation.layout.a.n(a.d(cVarH2, (gh2) objP, null, false, null, je1Var, 28), 10.0f, 8.0f, 2.0f, 8.0f);
            vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var6, 48);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var6, 0);
            su2VarN = kk0Var6.n();
            cVarD = b.d(kk0Var6, cVarN2);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar != null) {
                rj0.a();
                throw null;
            }
            kk0Var6.e0();
            if (kk0Var6.O) {
                kk0Var6.m(constructor);
            } else {
                kk0Var6.o0();
            }
            peVarH = fq2.h(kk0Var6, vb2VarRowMeasurePolicy, kk0Var6, su2VarN);
            if (kk0Var6.O) {
                fq2.v(currentCompositeKeyHash, kk0Var6, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var6, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var6, cVarD, ComposeUiNode$Companion.getSetModifier());
            if (z2) {
                kk0Var6.a0(-1381227214);
                CoinStackIcon(kk0Var6, 0);
                kk0Var6.r(false);
                f2 = 1.0f;
                j7 = j4;
                yvVar3 = yvVar2;
                j6 = j5;
                r8 = 0;
                r5 = 1;
                kk0Var2 = kk0Var6;
            } else {
                kk0Var6.a0(-1381226253);
                icon = bonusBar.getIcon();
                if (mo3.C0(icon)) {
                    icon = "✨";
                }
                yvVar3 = yvVar2;
                String str3 = icon;
                f2 = 1.0f;
                j6 = j5;
                j7 = j4;
                r8 = 0;
                r5 = 1;
                uy3.m1842xe1e389ce(str3, (c) null, 0L, gm4.D(20), (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var6, 3072, 0, 131062);
                kk0 kk0Var10 = kk0Var6;
                kk0Var10.r(false);
                kk0Var2 = kk0Var10;
            }
            Modifier$Companion modifier$Companion2 = c.i;
            cm3.Spacer(d.n(modifier$Companion2, 9.0f), kk0Var2, 6);
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f2, r5);
            vb2 vb2VarColumnMeasurePolicy2 = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var2, r8);
            currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var2, r8);
            su2 su2VarN5 = kk0Var2.n();
            c cVarD5 = b.d(kk0Var2, layoutWeightElement2);
            constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor2);
            } else {
                kk0Var2.o0();
            }
            peVarH2 = fq2.h(kk0Var2, vb2VarColumnMeasurePolicy2, kk0Var2, su2VarN5);
            if (kk0Var2.O) {
                fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarH2);
            } else {
                fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var2, cVarD5, ComposeUiNode$Companion.getSetModifier());
            String text2 = bonusBar.getText();
            long jC2 = gm4.C(13.2d);
            ic1 ic1Var2 = ic1.o;
            long jD2 = gm4.D(16);
            ab2Var = ab2.a;
            c cVar5 = cVar3;
            kk0 kk0Var11 = kk0Var2;
            uy3.m1842xe1e389ce(text2, (c) null, ab2Var.getColorScheme(kk0Var2, r8).q, jC2, (gc1) null, ic1Var2, (lb1) null, 0L, (tt3) null, (jt3) null, jD2, 2, false, 2, 0, (le1) null, (uz3) null, (ck0) kk0Var11, 199680, 3126, 119762);
            kk0Var3 = kk0Var11;
            if (mo3.C0(bonusBar.getSub())) {
                kk0Var3.a0(1077146750);
                uy3.m1842xe1e389ce(bonusBar.getSub(), (c) null, re0.b(0.62f, ab2Var.getColorScheme(kk0Var3, r8).q), gm4.C(11.8d), (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, gm4.D(14), 2, false, 1, 0, (le1) null, (uz3) null, (ck0) kk0Var3, 3072, 3126, 119794);
                kk0Var4 = kk0Var3;
            } else {
                kk0Var3.a0(1070429577);
                kk0Var4 = kk0Var3;
            }
            kk0Var4.r(r8);
            kk0Var4.r(r5);
            cm3.Spacer(d.n(modifier$Companion2, 8.0f), kk0Var4, 6);
            c cVarL2 = androidx.compose.foundation.layout.a.l(a.e(a.a(xr0.N(d.f(d.o(modifier$Companion2, 132.0f, r5), 36.0f, 0.0f, 2), z73.a(10.0f)), Brush$Companion.m7xd6c5694e(kr1.U(new re0(j7), new re0(j6))), null, 6), r8, null, je1Var, 7), 12.0f, 8.0f);
            vb2 vb2VarC3 = vw.c(Alignment$Companion.getCenter(), r8);
            currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var4, r8);
            su2 su2VarN6 = kk0Var4.n();
            c cVarD6 = b.d(kk0Var4, cVarL2);
            constructor3 = ComposeUiNode$Companion.getConstructor();
            kk0Var4.e0();
            if (kk0Var4.O) {
                kk0Var4.m(constructor3);
            } else {
                kk0Var4.o0();
            }
            peVarH3 = fq2.h(kk0Var4, vb2VarC3, kk0Var4, su2VarN6);
            if (kk0Var4.O) {
                fq2.v(currentCompositeKeyHash3, kk0Var4, currentCompositeKeyHash3, peVarH3);
            } else {
                fq2.v(currentCompositeKeyHash3, kk0Var4, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var4, cVarD6, ComposeUiNode$Companion.getSetModifier());
            kk0 kk0Var12 = kk0Var4;
            uy3.m1842xe1e389ce(bonusBar.getCta(), (c) null, yvVar3.g, gm4.C(12.5d), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, gm4.D(15), 3, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var12, 199680, 54, 127954);
            kk0Var5 = kk0Var12;
            kk0Var5.r(r5);
            c cVarE2 = a.e(d.j(modifier$Companion2, 44.0f), r8, null, je1Var2, 7);
            vb2 vb2VarC4 = vw.c(Alignment$Companion.getCenter(), r8);
            currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var5, r8);
            su2 su2VarN7 = kk0Var5.n();
            c cVarD7 = b.d(kk0Var5, cVarE2);
            constructor4 = ComposeUiNode$Companion.getConstructor();
            kk0Var5.e0();
            if (kk0Var5.O) {
                kk0Var5.m(constructor4);
            } else {
                kk0Var5.o0();
            }
            peVarH4 = fq2.h(kk0Var5, vb2VarC4, kk0Var5, su2VarN7);
            if (kk0Var5.O) {
                fq2.v(currentCompositeKeyHash4, kk0Var5, currentCompositeKeyHash4, peVarH4);
            } else {
                fq2.v(currentCompositeKeyHash4, kk0Var5, currentCompositeKeyHash4, peVarH4);
            }
            xp1.E(kk0Var5, cVarD7, ComposeUiNode$Companion.getSetModifier());
            ym1 x2 = s22.a.getX(kk0Var5, 6);
            dismiss = bonusBar.getDismiss();
            if (mo3.C0(dismiss)) {
                str = null;
            } else {
                str = dismiss;
            }
            ul1.m1829xf2a7a69(x2, str, d.j(modifier$Companion2, 16.0f), re0.b(0.45f, ab2Var.getColorScheme(kk0Var5, r8).q), kk0Var5, 384, 0);
            kk0Var5.r(r5);
            kk0Var5.r(r5);
            cVar2 = cVar5;
            kk0Var = kk0Var5;
        } else {
            kk0Var6.V();
            kk0Var = kk0Var6;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wv(bonusBar, je1Var, je1Var2, cVar2, i, i2, 0));
        }
    }

    private static final void CoinStackIcon(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1727557946);
        if (kk0Var.S(i & 1, i != 0)) {
            c cVarK = d.k(c.i, 29.0f, 23.0f);
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new f2(5);
                kk0Var.l0(objP);
            }
            c10.Canvas(cVarK, (le1) objP, kk0Var, 54);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new qp(i, 1));
        }
    }

    public static void a(ck0 ck0Var, int i) {
        CoinStackIcon(ck0Var, sf3.V(i | 1));
    }

    public static final void b(tz0 tz0Var, float f2, String str, float f3, float f4, float f5, int i) {
        y00 y00VarY = tz0Var.A().y();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(f5 * f2);
        paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        p9.a(y00VarY).drawText(str, f3 * f2, f4 * f2, paint);
    }

    public static final re0 c(String str) {
        Object i63Var;
        try {
            String strJ0 = mo3.J0(mo3.U0(str).toString(), "#");
            int length = strJ0.length();
            if (length == 6) {
                String strConcat = "ff".concat(strJ0);
                yo4.m(16);
                i63Var = new re0(gb2.d(Long.parseLong(strConcat, 16)));
            } else if (length != 8) {
                i63Var = null;
            } else {
                yo4.m(16);
                i63Var = new re0(gb2.d(Long.parseLong(strJ0, 16)));
            }
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        return (re0) (i63Var instanceof i63 ? null : i63Var);
    }
}
