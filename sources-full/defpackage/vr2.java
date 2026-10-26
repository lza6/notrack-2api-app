package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import notrack.ai.data.promo.OwnCard;
import notrack.ai.data.promo.OwnConfig;
import notrack.ai.data.promo.OwnPlans;
import okhttp3.Protocol$Companion;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class vr2 {
    public static final void OwnCardView(OwnCard ownCard, OwnConfig ownConfig, int i, je1 je1Var, je1 je1Var2, ck0 ck0Var, int i2) {
        int i3;
        OwnConfig ownConfig2;
        kk0 kk0Var;
        ownCard.getClass();
        ownConfig.getClass();
        je1Var.getClass();
        je1Var2.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(940860641);
        if ((i2 & 6) == 0) {
            i3 = (kk0Var2.h(ownCard) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ownConfig2 = ownConfig;
            i3 |= kk0Var2.j(ownConfig2) ? 32 : 16;
        } else {
            ownConfig2 = ownConfig;
        }
        if ((i2 & 384) == 0) {
            i3 |= kk0Var2.f(i) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= kk0Var2.j(je1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= kk0Var2.j(je1Var2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if (kk0Var2.S(i3 & 1, (i3 & 9363) != 9362)) {
            long jB = re0.b(0.55f, ab2.a.getColorScheme(kk0Var2, 0).r);
            y73 y73VarA = z73.a(18.0f);
            Modifier$Companion modifier$Companion = c.i;
            kk0Var = kk0Var2;
            hq3.m210x8dcae10(d.a, y73VarA, jB, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(1014667196, true, new ur2(ownConfig2, je1Var, je1Var2, ownCard, i), kk0Var2, 54), kk0Var, 12582918, 120);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wv(ownCard, ownConfig, i, je1Var, je1Var2, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 OwnCardView$lambda$5(OwnConfig ownConfig, je1 je1Var, je1 je1Var2, OwnCard ownCard, int i, ck0 ck0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i2 & 1, (i2 & 3) != 2);
        xk xkVar = kk0Var.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarN = a.n(modifier$Companion, 16.0f, 12.0f, 8.0f, 16.0f);
            wt start = Alignment$Companion.getStart();
            dl dlVar = hl.c;
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(dlVar, start, kk0Var, 0);
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
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getTop(), kk0Var, 48);
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
            c cVarO = a.o(new LayoutWeightElement(1.0f, true), 0.0f, 4.0f, 4.0f, 0.0f, 9);
            vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
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
            pe peVarH3 = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN3);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
            if (kr1.n(ownCard.getId(), "plans")) {
                kk0Var.a0(77043510);
                PlansMiniature(ownConfig, i, kk0Var, 0);
                kk0Var.r(false);
                z = true;
                i3 = 6;
            } else {
                kk0Var.a0(77046675);
                vb2 vb2VarColumnMeasurePolicy2 = if0.columnMeasurePolicy(dlVar, Alignment$Companion.getStart(), kk0Var, 0);
                int currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN4 = kk0Var.n();
                c cVarD4 = b.d(kk0Var, modifier$Companion);
                d4 constructor4 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor4);
                } else {
                    kk0Var.o0();
                }
                pe peVarH4 = fq2.h(kk0Var, vb2VarColumnMeasurePolicy2, kk0Var, su2VarN4);
                if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                    fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                }
                xp1.E(kk0Var, cVarD4, ComposeUiNode$Companion.getSetModifier());
                hg hgVarBrandify = brandify(Protocol$Companion.fill(ownCard.getTitle(), ownConfig.getFacts(), i), kk0Var, 0);
                ab2 ab2Var = ab2.a;
                uz3 uz3Var = ab2Var.getTypography(kk0Var, 0).i;
                ic1 ic1Var = ic1.m;
                i3 = 6;
                uy3.m1843xf9a47e34(hgVarBrandify, null, 0L, 0L, null, ic1Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, uz3Var, kk0Var, 196608, 0, 131038);
                kk0Var = kk0Var;
                if (mo3.C0(ownCard.getBody())) {
                    i4 = -1413672544;
                    kk0Var.a0(-1413672544);
                } else {
                    kk0Var.a0(-1410919248);
                    cm3.Spacer(d.d(modifier$Companion, 6.0f), kk0Var, 6);
                    i4 = -1413672544;
                    uy3.m1843xf9a47e34(brandify(Protocol$Companion.fill(ownCard.getBody(), ownConfig.getFacts(), i), kk0Var, 0), null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ab2Var.getTypography(kk0Var, 0).k, kk0Var, 0, 0, 131066);
                    kk0Var = kk0Var;
                }
                kk0Var.r(false);
                if (mo3.C0(ownConfig.getPriceLine())) {
                    kk0Var.a0(i4);
                } else {
                    kk0Var.a0(-1410108443);
                    cm3.Spacer(d.d(modifier$Companion, 8.0f), kk0Var, 6);
                    kk0 kk0Var2 = kk0Var;
                    uy3.m1843xf9a47e34(brandify(ownConfig.getPriceLine(), kk0Var, 0), null, 0L, 0L, null, ic1Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ab2Var.getTypography(kk0Var, 0).l, kk0Var2, 196608, 0, 131038);
                    kk0Var = kk0Var2;
                }
                kk0Var.r(false);
                z = true;
                kk0Var.r(true);
                kk0Var.r(false);
            }
            kk0Var.r(z);
            rl1.IconButton(je1Var2, d.j(modifier$Companion, 28.0f), false, null, null, gj0.a, kk0Var, 196656, 28);
            kk0Var.r(z);
            if (mo3.C0(ownConfig.getCta())) {
                kk0Var.a0(741652508);
            } else {
                kk0Var.a0(746095800);
                cm3.Spacer(d.d(modifier$Companion, 12.0f), kk0Var, i3);
                kk0 kk0Var3 = kk0Var;
                bz.Button(je1Var, new HorizontalAlignElement(Alignment$Companion.getCenterHorizontally()), false, null, uy.a.m1833x1b9ca94(gx.getBrandGreen(kk0Var, 0), 0L, 0L, 0L, kk0Var3, 0, 14), null, null, null, null, zg0.rememberComposableLambda(-259442981, true, new s00(5, ownConfig), kk0Var3, 54), kk0Var3, 805306368, 492);
                kk0Var = kk0Var3;
            }
            kk0Var.r(false);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 OwnCardView$lambda$5$lambda$4$lambda$3(OwnConfig ownConfig, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            uy3.m1842xe1e389ce(ownConfig.getCta(), (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131070);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:105:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:109:0x032f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0347 A[LOOP:1: B:113:0x0345->B:114:0x0347, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x039e  */
    /* JADX WARN: Code duplicated, block: B:118:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:121:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x013a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    /* JADX WARN: Code duplicated, block: B:84:0x015a  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4  */
    private static final void PlanColumn(String str, String str2, String str3, String str4, List<String> list, c cVar, ck0 ck0Var, int i, int i2) {
        c cVar2;
        int i3;
        boolean z;
        kk0 kk0Var;
        c cVar3;
        w33 w33VarV;
        c cVar4;
        vb2 vb2VarColumnMeasurePolicy;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        int currentCompositeKeyHash2;
        d4 constructor2;
        pe peVarH2;
        ab2 ab2Var;
        uz3 uz3Var;
        kk0 kk0Var2;
        int i4;
        boolean z2;
        String strConcat;
        ArrayList arrayList;
        int size;
        int i5;
        kk0 kk0Var3 = (kk0) ck0Var;
        kk0Var3.c0(-58192807);
        xk xkVar = kk0Var3.a;
        int i6 = (i & 6) == 0 ? (kk0Var3.h(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= kk0Var3.h(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= kk0Var3.h(str3) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i6 |= kk0Var3.h(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= kk0Var3.j(list) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((i & 196608) == 0) {
                cVar2 = cVar;
                i6 |= kk0Var3.h(cVar2) ? 131072 : 65536;
            }
            i3 = i6;
            if ((i3 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var3.S(i3 & 1, z)) {
                if (i7 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var3, 0);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
                su2VarN = kk0Var3.n();
                cVarD = b.d(kk0Var3, cVar4);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var3.e0();
                if (kk0Var3.O) {
                    kk0Var3.m(constructor);
                } else {
                    kk0Var3.o0();
                }
                peVarH = fq2.h(kk0Var3, vb2VarColumnMeasurePolicy, kk0Var3, su2VarN);
                if (kk0Var3.O || !kr1.n(kk0Var3.P(), Integer.valueOf(currentCompositeKeyHash))) {
                    fq2.v(currentCompositeKeyHash, kk0Var3, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var3, cVarD, ComposeUiNode$Companion.getSetModifier());
                xt centerVertically = Alignment$Companion.getCenterVertically();
                Modifier$Companion modifier$Companion = c.i;
                vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, centerVertically, kk0Var3, 48);
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
                su2 su2VarN2 = kk0Var3.n();
                c cVarD2 = b.d(kk0Var3, modifier$Companion);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var3.e0();
                if (kk0Var3.O) {
                    kk0Var3.m(constructor2);
                } else {
                    kk0Var3.o0();
                }
                peVarH2 = fq2.h(kk0Var3, vb2VarRowMeasurePolicy, kk0Var3, su2VarN2);
                if (kk0Var3.O || !kr1.n(kk0Var3.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                    fq2.v(currentCompositeKeyHash2, kk0Var3, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var3, cVarD2, ComposeUiNode$Companion.getSetModifier());
                ab2Var = ab2.a;
                if (str4 != null) {
                    kk0Var3.a0(-701150518);
                    uz3Var = ab2Var.getTypography(kk0Var3, 0).h;
                    kk0Var3.r(false);
                } else {
                    kk0Var3.a0(-701148407);
                    uz3Var = ab2Var.getTypography(kk0Var3, 0).i;
                    kk0Var3.r(false);
                }
                uz3 uz3Var2 = uz3Var;
                c cVar5 = cVar4;
                uy3.m1842xe1e389ce(str, (c) null, gx.getBrandGreen(kk0Var3, 0), 0L, (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var2, (ck0) kk0Var3, (i3 & 14) | 196608, 0, 65498);
                kk0Var2 = kk0Var3;
                if (str4 != null || mo3.C0(str4)) {
                    i4 = 6;
                    z2 = false;
                    kk0Var2.a0(-267368189);
                } else {
                    kk0Var2.a0(-260596208);
                    cm3.Spacer(d.j(modifier$Companion, 6.0f), kk0Var2, 6);
                    c cVarL = a.l(androidx.compose.foundation.a.b(xr0.N(modifier$Companion, z73.a), re0.b(0.14f, gx.getBrandGreen(kk0Var2, 0)), k43.a), 7.0f, 2.0f);
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
                    i4 = 6;
                    uy3.m1842xe1e389ce(str4, (c) null, gx.getBrandGreen(kk0Var2, 0), 0L, (gc1) null, ic1.l, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).o, (ck0) kk0Var2, ((i3 >> 9) & 14) | 196608, 0, 65498);
                    kk0Var2 = kk0Var2;
                    kk0Var2.r(true);
                    z2 = false;
                }
                kk0Var2.r(z2);
                kk0Var2.r(true);
                cm3.Spacer(d.d(modifier$Companion, 2.0f), kk0Var2, i4);
                if (mo3.C0(str3)) {
                    strConcat = BuildConfig.VERSION_NAME;
                } else {
                    strConcat = " ".concat(str3);
                }
                kk0 kk0Var4 = kk0Var2;
                uy3.m1842xe1e389ce(fq2.n("$", str2, strConcat), (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, r0.getTypography(kk0Var2, 0).l, (ck0) kk0Var4, 196608, 0, 65502);
                kk0Var = kk0Var4;
                cm3.Spacer(d.d(modifier$Companion, 6.0f), kk0Var, i4);
                kk0Var.a0(928465061);
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!mo3.C0((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                size = arrayList.size();
                for (i5 = 0; i5 < size; i5++) {
                    kk0 kk0Var5 = kk0Var;
                    uy3.m1842xe1e389ce((String) arrayList.get(i5), a.o(c.i, 0.0f, 0.0f, 0.0f, 2.0f, 7), ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).l, (ck0) kk0Var5, 48, 0, 65528);
                    kk0Var = kk0Var5;
                }
                kk0Var.r(false);
                kk0Var.r(true);
                cVar3 = cVar5;
            } else {
                kk0Var = kk0Var3;
                kk0Var.V();
                cVar3 = cVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new sr2(str, str2, str3, str4, list, cVar3, i, i2, 0));
            }
        }
        i6 |= 196608;
        cVar2 = cVar;
        i3 = i6;
        if ((i3 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var3.S(i3 & 1, z)) {
            if (i7 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var3, 0);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
            su2VarN = kk0Var3.n();
            cVarD = b.d(kk0Var3, cVar4);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar != null) {
                rj0.a();
                throw null;
            }
            kk0Var3.e0();
            if (kk0Var3.O) {
                kk0Var3.m(constructor);
            } else {
                kk0Var3.o0();
            }
            peVarH = fq2.h(kk0Var3, vb2VarColumnMeasurePolicy, kk0Var3, su2VarN);
            if (kk0Var3.O) {
                fq2.v(currentCompositeKeyHash, kk0Var3, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var3, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var3, cVarD, ComposeUiNode$Companion.getSetModifier());
            xt centerVertically2 = Alignment$Companion.getCenterVertically();
            Modifier$Companion modifier$Companion2 = c.i;
            vb2 vb2VarRowMeasurePolicy2 = e83.rowMeasurePolicy(hl.a, centerVertically2, kk0Var3, 48);
            currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
            su2 su2VarN4 = kk0Var3.n();
            c cVarD4 = b.d(kk0Var3, modifier$Companion2);
            constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var3.e0();
            if (kk0Var3.O) {
                kk0Var3.m(constructor2);
            } else {
                kk0Var3.o0();
            }
            peVarH2 = fq2.h(kk0Var3, vb2VarRowMeasurePolicy2, kk0Var3, su2VarN4);
            if (kk0Var3.O) {
                fq2.v(currentCompositeKeyHash2, kk0Var3, currentCompositeKeyHash2, peVarH2);
            } else {
                fq2.v(currentCompositeKeyHash2, kk0Var3, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var3, cVarD4, ComposeUiNode$Companion.getSetModifier());
            ab2Var = ab2.a;
            if (str4 != null) {
                kk0Var3.a0(-701150518);
                uz3Var = ab2Var.getTypography(kk0Var3, 0).h;
                kk0Var3.r(false);
            } else {
                kk0Var3.a0(-701148407);
                uz3Var = ab2Var.getTypography(kk0Var3, 0).i;
                kk0Var3.r(false);
            }
            uz3 uz3Var3 = uz3Var;
            c cVar6 = cVar4;
            uy3.m1842xe1e389ce(str, (c) null, gx.getBrandGreen(kk0Var3, 0), 0L, (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var3, (ck0) kk0Var3, (i3 & 14) | 196608, 0, 65498);
            kk0Var2 = kk0Var3;
            if (str4 != null) {
                i4 = 6;
                z2 = false;
                kk0Var2.a0(-267368189);
            } else {
                i4 = 6;
                z2 = false;
                kk0Var2.a0(-267368189);
            }
            kk0Var2.r(z2);
            kk0Var2.r(true);
            cm3.Spacer(d.d(modifier$Companion2, 2.0f), kk0Var2, i4);
            if (mo3.C0(str3)) {
                strConcat = " ".concat(str3);
            } else {
                strConcat = BuildConfig.VERSION_NAME;
            }
            kk0 kk0Var6 = kk0Var2;
            uy3.m1842xe1e389ce(fq2.n("$", str2, strConcat), (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, r0.getTypography(kk0Var2, 0).l, (ck0) kk0Var6, 196608, 0, 65502);
            kk0Var = kk0Var6;
            cm3.Spacer(d.d(modifier$Companion2, 6.0f), kk0Var, i4);
            kk0Var.a0(928465061);
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                if (!mo3.C0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            size = arrayList.size();
            while (i5 < size) {
                kk0 kk0Var7 = kk0Var;
                uy3.m1842xe1e389ce((String) arrayList.get(i5), a.o(c.i, 0.0f, 0.0f, 0.0f, 2.0f, 7), ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).l, (ck0) kk0Var7, 48, 0, 65528);
                kk0Var = kk0Var7;
            }
            kk0Var.r(false);
            kk0Var.r(true);
            cVar3 = cVar6;
        } else {
            kk0Var = kk0Var3;
            kk0Var.V();
            cVar3 = cVar2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new sr2(str, str2, str3, str4, list, cVar3, i, i2, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
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
    private static final void PlansMiniature(OwnConfig ownConfig, int i, ck0 ck0Var, int i2) {
        int i3;
        int i4;
        kk0 kk0Var;
        Modifier$Companion modifier$Companion;
        float f;
        int i5;
        ?? r15;
        kk0 kk0Var2;
        kk0 kk0Var3 = (kk0) ck0Var;
        kk0Var3.c0(1741239444);
        xk xkVar = kk0Var3.a;
        if ((i2 & 6) == 0) {
            i3 = i2 | (kk0Var3.j(ownConfig) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= kk0Var3.f(i) ? 32 : 16;
        }
        if (kk0Var3.S(i3 & 1, (i3 & 19) != 18)) {
            OwnPlans plans = ownConfig.getPlans();
            Modifier$Companion modifier$Companion2 = c.i;
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var3, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
            su2 su2VarN = kk0Var3.n();
            c cVarD = b.d(kk0Var3, modifier$Companion2);
            androidx.compose.ui.node.a.j.getClass();
            je1 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var3.e0();
            if (kk0Var3.O) {
                kk0Var3.m(constructor);
            } else {
                kk0Var3.o0();
            }
            pe peVarH = fq2.h(kk0Var3, vb2VarColumnMeasurePolicy, kk0Var3, su2VarN);
            if (kk0Var3.O || !kr1.n(kk0Var3.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var3, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var3, cVarD, ComposeUiNode$Companion.getSetModifier());
            if (mo3.C0(plans.getNow())) {
                modifier$Companion = modifier$Companion2;
                f = 12.0f;
                i5 = 6;
                r15 = 0;
                kk0Var3.a0(-165874236);
                kk0Var2 = kk0Var3;
            } else {
                kk0Var3.a0(-160710318);
                String strFill = Protocol$Companion.fill(plans.getNow(), ownConfig.getFacts(), i);
                ab2 ab2Var = ab2.a;
                modifier$Companion = modifier$Companion2;
                f = 12.0f;
                i5 = 6;
                uy3.m1842xe1e389ce(strFill, (c) null, ab2Var.getColorScheme(kk0Var3, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var3, 0).l, (ck0) kk0Var3, 0, 0, 65530);
                kk0 kk0Var4 = kk0Var3;
                cm3.Spacer(d.d(modifier$Companion, 12.0f), kk0Var4, 6);
                r15 = 0;
                kk0Var2 = kk0Var4;
            }
            kk0Var2.r(r15);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(new fl(f), Alignment$Companion.getTop(), kk0Var2, i5);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var2, r15);
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
            i4 = i;
            PlanColumn("Plus", ownConfig.getFacts().getPlusUsd(), plans.getPerMonth(), null, kr1.U(plans.getCellModels(), Protocol$Companion.fill(plans.getCellPlusMem(), ownConfig.getFacts(), i4), plans.getCellNoAds()), new LayoutWeightElement(1.0f, true), kk0Var2, 3078, 0);
            PlanColumn("Pro", ownConfig.getFacts().getProUsd(), plans.getPerMonth(), plans.getBadgePro(), kr1.U(plans.getCellProAll(), plans.getCellProLimits(), plans.getCellProQueue()), new LayoutWeightElement(1.0f, true), kk0Var2, 6, 0);
            kk0Var2.r(true);
            kk0Var2.r(true);
            kk0Var = kk0Var2;
        } else {
            i4 = i;
            kk0Var3.V();
            kk0Var = kk0Var3;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new tr2(ownConfig, i4, i2, 0));
        }
    }

    public static void a(OwnConfig ownConfig, int i, ck0 ck0Var, int i2) {
        PlansMiniature(ownConfig, i, ck0Var, sf3.V(i2 | 1));
    }

    private static final hg brandify(String str, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1174850240);
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(str);
        kk0Var.a0(-1174848196);
        for (String str2 : kr1.U("Plus", "Pro")) {
            int iA0 = mo3.A0(str, str2, 0, false, 6);
            kk0Var.a0(-1174846218);
            while (iA0 >= 0) {
                int length = str2.length() + iA0;
                boolean z = true;
                boolean z2 = iA0 == 0 || !Character.isLetter(str.charAt(iA0 + (-1)));
                if (length < str.length() && Character.isLetter(str.charAt(length))) {
                    z = false;
                }
                if (z2 && z) {
                    kk0Var.a0(392043249);
                    arrayList.add(new eg(new em3(gx.getBrandGreen(kk0Var, 0), 0L, ic1.m, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65530), iA0, length, 8));
                } else {
                    kk0Var.a0(383291329);
                }
                kk0Var.r(false);
                iA0 = mo3.A0(str, str2, length, false, 4);
            }
            kk0Var.r(false);
        }
        kk0Var.r(false);
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((eg) arrayList.get(i2)).a(sb.length()));
        }
        hg hgVar = new hg(string, arrayList2);
        kk0Var.r(false);
        return hgVar;
    }

    public static void c(String str, String str2, String str3, String str4, List list, c cVar, ck0 ck0Var, int i, int i2) {
        PlanColumn(str, str2, str3, str4, list, cVar, ck0Var, sf3.V(i | 1), i2);
    }
}
