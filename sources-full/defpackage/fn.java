package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class fn {
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void AttachmentChip(hn hnVar, je1 je1Var, je1 je1Var2, ck0 ck0Var, int i, int i2) {
        int i3;
        je1 je1Var3;
        int i4;
        je1 je1Var4;
        int i5;
        int i6;
        boolean z;
        kk0 kk0Var;
        je1 je1Var5;
        je1 je1Var6;
        w33 w33VarV;
        je1 je1Var7;
        Object objP;
        hnVar.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1784598740);
        if ((i & 6) == 0) {
            i3 = (kk0Var2.h(hnVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                je1Var3 = je1Var;
                i3 |= kk0Var2.j(je1Var3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    je1Var4 = je1Var2;
                    if (kk0Var2.j(je1Var4)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                i6 = 0;
                if ((i3 & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i3 & 1, z)) {
                    if (i7 != 0) {
                        je1Var5 = null;
                    } else {
                        je1Var5 = je1Var3;
                    }
                    if (i4 != 0) {
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = new lg(2);
                            kk0Var2.l0(objP);
                        }
                        je1Var7 = (je1) objP;
                    } else {
                        je1Var7 = je1Var4;
                    }
                    kk0Var = kk0Var2;
                    hq3.m210x8dcae10(a.e(d.o(c.i, 200.0f, 1), false, null, je1Var7, 7), z73.a(12.0f), ab2.a.getColorScheme(kk0Var2, 0).r, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(138434311, true, new dn(hnVar, i6, je1Var5), kk0Var2, 54), kk0Var, 12582912, 120);
                    je1Var6 = je1Var7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    je1Var5 = je1Var3;
                    je1Var6 = je1Var4;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new en(i, i2, 0, je1Var5, hnVar, je1Var6));
                }
            }
            i3 |= 384;
            je1Var4 = je1Var2;
            i6 = 0;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i3 & 1, z)) {
                if (i7 != 0) {
                    je1Var5 = null;
                } else {
                    je1Var5 = je1Var3;
                }
                if (i4 != 0) {
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new lg(2);
                        kk0Var2.l0(objP);
                    }
                    je1Var7 = (je1) objP;
                } else {
                    je1Var7 = je1Var4;
                }
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(a.e(d.o(c.i, 200.0f, 1), false, null, je1Var7, 7), z73.a(12.0f), ab2.a.getColorScheme(kk0Var2, 0).r, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(138434311, true, new dn(hnVar, i6, je1Var5), kk0Var2, 54), kk0Var, 12582912, 120);
                je1Var6 = je1Var7;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                je1Var5 = je1Var3;
                je1Var6 = je1Var4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new en(i, i2, 0, je1Var5, hnVar, je1Var6));
            }
        }
        i3 |= 48;
        je1Var3 = je1Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                je1Var4 = je1Var2;
                if (kk0Var2.j(je1Var4)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            i6 = 0;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i3 & 1, z)) {
                if (i7 != 0) {
                    je1Var5 = null;
                } else {
                    je1Var5 = je1Var3;
                }
                if (i4 != 0) {
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = new lg(2);
                        kk0Var2.l0(objP);
                    }
                    je1Var7 = (je1) objP;
                } else {
                    je1Var7 = je1Var4;
                }
                kk0Var = kk0Var2;
                hq3.m210x8dcae10(a.e(d.o(c.i, 200.0f, 1), false, null, je1Var7, 7), z73.a(12.0f), ab2.a.getColorScheme(kk0Var2, 0).r, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(138434311, true, new dn(hnVar, i6, je1Var5), kk0Var2, 54), kk0Var, 12582912, 120);
                je1Var6 = je1Var7;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                je1Var5 = je1Var3;
                je1Var6 = je1Var4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new en(i, i2, 0, je1Var5, hnVar, je1Var6));
            }
        }
        i3 |= 384;
        je1Var4 = je1Var2;
        i6 = 0;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var2.S(i3 & 1, z)) {
            if (i7 != 0) {
                je1Var5 = null;
            } else {
                je1Var5 = je1Var3;
            }
            if (i4 != 0) {
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new lg(2);
                    kk0Var2.l0(objP);
                }
                je1Var7 = (je1) objP;
            } else {
                je1Var7 = je1Var4;
            }
            kk0Var = kk0Var2;
            hq3.m210x8dcae10(a.e(d.o(c.i, 200.0f, 1), false, null, je1Var7, 7), z73.a(12.0f), ab2.a.getColorScheme(kk0Var2, 0).r, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(138434311, true, new dn(hnVar, i6, je1Var5), kk0Var2, 54), kk0Var, 12582912, 120);
            je1Var6 = je1Var7;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            je1Var5 = je1Var3;
            je1Var6 = je1Var4;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new en(i, i2, 0, je1Var5, hnVar, je1Var6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AttachmentChip$lambda$5(hn hnVar, je1 je1Var, ck0 ck0Var, int i) {
        ym1 file;
        int i2;
        s22 s22Var;
        String str;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i & 1, (i & 3) != 2);
        xk xkVar = kk0Var.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarL = androidx.compose.foundation.layout.a.l(modifier$Companion, 8.0f, 6.0f);
            xt centerVertically = Alignment$Companion.getCenterVertically();
            cl clVar = hl.a;
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(clVar, centerVertically, kk0Var, 48);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarL);
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
            pe peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            String str2 = hnVar.f;
            long j = hnVar.d;
            s22 s22Var2 = s22.a;
            if (str2 == null || !mo3.u0(str2, "image", false)) {
                String str3 = hnVar.f;
                if (str3 == null || !mo3.u0(str3, "pdf", false)) {
                    kk0Var.a0(-883474969);
                    file = s22Var2.getFile(kk0Var, 6);
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(-883476245);
                    file = s22Var2.getFileText(kk0Var, 6);
                    kk0Var.r(false);
                }
            } else {
                kk0Var.a0(-883478584);
                file = s22Var2.getImage(kk0Var, 6);
                kk0Var.r(false);
            }
            ul1.m1829xf2a7a69(file, (String) null, d.j(modifier$Companion, 20.0f), gx.getBrandGreen(kk0Var, 0), kk0Var, 432, 0);
            cm3.Spacer(d.n(modifier$Companion, 8.0f), kk0Var, 6);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN2 = kk0Var.n();
            c cVarD2 = b.d(kk0Var, layoutWeightElement);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            pe peVarH2 = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN2);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            uy3.m1842xe1e389ce(hnVar.c, (c) null, 0L, gm4.D(12), (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 2, false, 1, 0, (le1) null, (uz3) null, (ck0) kk0Var, 3072, 3120, 120822);
            kk0 kk0Var2 = kk0Var;
            vb2 vb2VarRowMeasurePolicy2 = e83.rowMeasurePolicy(clVar, Alignment$Companion.getCenterVertically(), kk0Var2, 48);
            int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN3 = kk0Var2.n();
            c cVarD3 = b.d(kk0Var2, modifier$Companion);
            d4 constructor3 = ComposeUiNode$Companion.getConstructor();
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor3);
            } else {
                kk0Var2.o0();
            }
            pe peVarH3 = fq2.h(kk0Var2, vb2VarRowMeasurePolicy2, kk0Var2, su2VarN3);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                fq2.v(currentCompositeKeyHash3, kk0Var2, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var2, cVarD3, ComposeUiNode$Companion.getSetModifier());
            if (j > 0) {
                kk0Var2.a0(1367322509);
                if (j < 1024) {
                    str = j + " B";
                } else {
                    long j2 = j / 1024;
                    if (j2 < 1024) {
                        str = j2 + " KB";
                    } else {
                        str = (j2 / 1024) + " MB";
                    }
                }
                String str4 = str;
                i2 = 1364672505;
                uy3.m1842xe1e389ce(str4, (c) null, ab2.a.getColorScheme(kk0Var2, 0).s, gm4.D(10), (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var2, 3072, 0, 131058);
                kk0Var2 = kk0Var2;
            } else {
                i2 = 1364672505;
                kk0Var2.a0(1364672505);
            }
            kk0Var2.r(false);
            if (hnVar.h) {
                kk0Var2.a0(1367634276);
                cm3.Spacer(d.n(modifier$Companion, 4.0f), kk0Var2, 6);
                s22Var = s22Var2;
                ul1.m1829xf2a7a69(s22Var.getAlertTriangle(kk0Var2, 6), (String) null, d.j(modifier$Companion, 10.0f), re0.c, kk0Var2, 3504, 0);
            } else {
                s22Var = s22Var2;
                kk0Var2.a0(i2);
            }
            kk0Var2.r(false);
            kk0Var2.r(true);
            kk0Var2.r(true);
            cm3.Spacer(d.n(modifier$Companion, 4.0f), kk0Var2, 6);
            int iOrdinal = hnVar.e.ordinal();
            if (iOrdinal == 0) {
                kk0Var2.a0(-1616472375);
                kk0 kk0Var3 = kk0Var2;
                z03.m1882xe8727fba(d.j(modifier$Companion, 14.0f), 0L, 2.0f, 0L, 0, kk0Var3, 390, 26);
                kk0Var2 = kk0Var3;
                kk0Var2.r(false);
            } else if (iOrdinal == 1) {
                kk0Var2.a0(-1616312663);
                ul1.m1829xf2a7a69(s22Var.getCircleCheck(kk0Var2, 6), (String) null, d.j(modifier$Companion, 16.0f), gx.getBrandGreen(kk0Var2, 0), kk0Var2, 432, 0);
                kk0Var2.r(false);
            } else {
                if (iOrdinal != 2) {
                    kk0Var2.a0(-883430175);
                    kk0Var2.r(false);
                    u41.e();
                    return null;
                }
                kk0Var2.a0(-1616152486);
                ul1.m1829xf2a7a69(s22Var.getAlertTriangle(kk0Var2, 6), hnVar.g, d.j(modifier$Companion, 16.0f), ue0.i, kk0Var2, 3456, 0);
                kk0Var2.r(false);
            }
            if (je1Var != null) {
                kk0Var2.a0(-1615969214);
                kk0 kk0Var4 = kk0Var2;
                rl1.IconButton(je1Var, d.j(modifier$Companion, 24.0f), false, null, null, xh0.a, kk0Var4, 196656, 28);
                kk0Var2 = kk0Var4;
            } else {
                kk0Var2.a0(-1619795265);
            }
            kk0Var2.r(false);
            kk0Var2.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }
}
