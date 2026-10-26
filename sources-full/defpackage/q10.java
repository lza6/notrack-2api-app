package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import androidx.compose.ui.platform.CompositionLocalsKt;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class q10 {
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void CarriedPill(r10 r10Var, je1 je1Var, c cVar, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        boolean z;
        w33 w33VarV;
        c cVar3;
        vb2 vb2VarC;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        r10Var.getClass();
        je1Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-74390714);
        if ((i & 6) == 0) {
            i3 = (kk0Var.j(r10Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = 1;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i5 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                c cVarThen = cVar3.then(d.a);
                vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarThen);
                a.j.getClass();
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
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                hq3.m213xde3417d4(je1Var, null, false, z73.a(20.0f), re0.b(0.12f, gx.getBrandGreen(kk0Var, 0)), 0L, 0.0f, 0.0f, null, null, zg0.rememberComposableLambda(-1728270699, true, new h10(r10Var, i4), kk0Var, 54), kk0Var, (i3 >> 3) & 14, 6, 998);
                kk0Var.r(true);
                cVar2 = cVar3;
            } else {
                kk0Var.V();
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new en(i, i2, 1, je1Var, r10Var, cVar2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = 1;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i5 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            c cVarThen2 = cVar3.then(d.a);
            vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarThen2);
            a.j.getClass();
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
            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            hq3.m213xde3417d4(je1Var, null, false, z73.a(20.0f), re0.b(0.12f, gx.getBrandGreen(kk0Var, 0)), 0L, 0.0f, 0.0f, null, null, zg0.rememberComposableLambda(-1728270699, true, new h10(r10Var, i4), kk0Var, 54), kk0Var, (i3 >> 3) & 14, 6, 998);
            kk0Var.r(true);
            cVar2 = cVar3;
        } else {
            kk0Var.V();
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new en(i, i2, 1, je1Var, r10Var, cVar2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CarriedPill$lambda$65$lambda$64(r10 r10Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarL = androidx.compose.foundation.layout.a.l(modifier$Companion, 14.0f, 8.0f);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var, 48);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarL);
            a.j.getClass();
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
            uy3.m1842xe1e389ce(r10Var.a("continued"), (c) null, gx.getBrandGreen(kk0Var, 0), 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2.a.getTypography(kk0Var, 0).m, (ck0) kk0Var, 0, 0, 65530);
            cm3.Spacer(d.n(modifier$Companion, 6.0f), kk0Var, 6);
            ul1.m1829xf2a7a69(s22.a.getArrowRight(kk0Var, 6), (String) null, d.j(modifier$Companion, 16.0f), gx.getBrandGreen(kk0Var, 0), kk0Var, 432, 0);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void CarryCard(final r10 r10Var, final w10 w10Var, je1 je1Var, c cVar, ck0 ck0Var, int i, int i2) {
        int i3;
        je1 je1Var2;
        c cVar2;
        boolean z;
        c cVar3;
        w33 w33VarV;
        c cVar4;
        Object objP;
        mi2 mi2Var;
        Object objP2;
        final kx kxVar;
        Object objP3;
        final fh2 fh2Var;
        float fW;
        boolean zH;
        Object objP4;
        mi2 mi2Var2;
        String string;
        r10Var.getClass();
        w10Var.getClass();
        je1Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(97979457);
        if ((i & 6) == 0) {
            i3 = (kk0Var.j(r10Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var.h(w10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            je1Var2 = je1Var;
            i3 |= kk0Var.j(je1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        } else {
            je1Var2 = je1Var;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i4 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                Object[] objArr = {w10Var.b};
                objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new lg(7);
                    kk0Var.l0(objP);
                }
                mi2Var = (mi2) d53.rememberSaveable(objArr, (x93) null, (String) null, (je1) objP, (ck0) kk0Var, 3072, 6);
                objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new mx();
                    kk0Var.l0(objP2);
                }
                kxVar = (kx) objP2;
                objP3 = kk0Var.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    objP3 = new ct2(0);
                    kk0Var.l0(objP3);
                }
                fh2Var = (fh2) objP3;
                fW = ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(72.0f);
                Boolean bool = (Boolean) mi2Var.getValue();
                bool.getClass();
                zH = kk0Var.h(mi2Var) | kk0Var.j(kxVar) | kk0Var.e(fW);
                objP4 = kk0Var.P();
                if (!zH || objP4 == Composer$Companion.getEmpty()) {
                    mi2Var2 = mi2Var;
                    p10 p10Var = new p10(kxVar, fW, mi2Var2, fh2Var, null);
                    kk0Var.l0(p10Var);
                    objP4 = p10Var;
                } else {
                    mi2Var2 = mi2Var;
                }
                r11.LaunchedEffect(bool, (ne1) objP4, kk0Var, 0);
                string = mo3.U0(mo3.J0(w10Var.c, "↩")).toString();
                if (string.length() > 60) {
                    string = ud2.p(mo3.W0(mo3.T0(59, string)).toString(), "…");
                }
                final je1 je1Var3 = je1Var2;
                final mi2 mi2Var3 = mi2Var2;
                final String str = string;
                hq3.m210x8dcae10(cVar4.then(d.a), z73.a(14.0f), re0.b(0.08f, gx.getBrandGreen(kk0Var, 0)), 0L, 0.0f, 0.0f, gm4.a(1.0f, re0.b(0.25f, gx.getBrandGreen(kk0Var, 0))), zg0.rememberComposableLambda(-1908984634, true, new ne1() { // from class: f10
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return q10.CarryCard$lambda$55(r10Var, str, w10Var, kxVar, mi2Var3, fh2Var, je1Var3, (ck0) obj, iIntValue);
                    }
                }, kk0Var, 54), kk0Var, 12582912, 56);
                kk0Var = kk0Var;
                cVar3 = cVar4;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new wv(r10Var, w10Var, je1Var, cVar3, i, i2));
            }
        }
        i3 |= 3072;
        cVar2 = cVar;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i4 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            Object[] objArr2 = {w10Var.b};
            objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new lg(7);
                kk0Var.l0(objP);
            }
            mi2Var = (mi2) d53.rememberSaveable(objArr2, (x93) null, (String) null, (je1) objP, (ck0) kk0Var, 3072, 6);
            objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = new mx();
                kk0Var.l0(objP2);
            }
            kxVar = (kx) objP2;
            objP3 = kk0Var.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                objP3 = new ct2(0);
                kk0Var.l0(objP3);
            }
            fh2Var = (fh2) objP3;
            fW = ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(72.0f);
            Boolean bool2 = (Boolean) mi2Var.getValue();
            bool2.getClass();
            zH = kk0Var.h(mi2Var) | kk0Var.j(kxVar) | kk0Var.e(fW);
            objP4 = kk0Var.P();
            if (zH) {
                mi2Var2 = mi2Var;
                p10 p10Var2 = new p10(kxVar, fW, mi2Var2, fh2Var, null);
                kk0Var.l0(p10Var2);
                objP4 = p10Var2;
            } else {
                mi2Var2 = mi2Var;
                p10 p10Var3 = new p10(kxVar, fW, mi2Var2, fh2Var, null);
                kk0Var.l0(p10Var3);
                objP4 = p10Var3;
            }
            r11.LaunchedEffect(bool2, (ne1) objP4, kk0Var, 0);
            string = mo3.U0(mo3.J0(w10Var.c, "↩")).toString();
            if (string.length() > 60) {
                string = ud2.p(mo3.W0(mo3.T0(59, string)).toString(), "…");
            }
            final je1 je1Var4 = je1Var2;
            final mi2 mi2Var4 = mi2Var2;
            final String str2 = string;
            hq3.m210x8dcae10(cVar4.then(d.a), z73.a(14.0f), re0.b(0.08f, gx.getBrandGreen(kk0Var, 0)), 0L, 0.0f, 0.0f, gm4.a(1.0f, re0.b(0.25f, gx.getBrandGreen(kk0Var, 0))), zg0.rememberComposableLambda(-1908984634, true, new ne1() { // from class: f10
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return q10.CarryCard$lambda$55(r10Var, str2, w10Var, kxVar, mi2Var4, fh2Var, je1Var4, (ck0) obj, iIntValue);
                }
            }, kk0Var, 54), kk0Var, 12582912, 56);
            kk0Var = kk0Var;
            cVar3 = cVar4;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wv(r10Var, w10Var, je1Var, cVar3, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:64:0x0233  */
    public static final w84 CarryCard$lambda$55(r10 r10Var, String str, w10 w10Var, kx kxVar, mi2 mi2Var, fh2 fh2Var, je1 je1Var, ck0 ck0Var, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        String strX0;
        int i5;
        int i6 = 1;
        int i7 = 0;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i & 1, (i & 3) != 2);
        xk xkVar = kk0Var.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarK = androidx.compose.foundation.layout.a.k(modifier$Companion, 14.0f);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarK);
            a.j.getClass();
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
            String strT = y64.t(r10Var.a("card_title"), new ps2("title", str));
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(strT, (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 2, false, 2, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).i, (ck0) kk0Var, 196608, 3120, 55262);
            kk0 kk0Var2 = kk0Var;
            int i8 = 6;
            if (((Boolean) mi2Var.getValue()).booleanValue()) {
                kk0Var2.a0(1595804265);
                cm3.Spacer(d.d(modifier$Companion, 8.0f), kk0Var2, 6);
                String str2 = w10Var.a;
                fg fgVar = new fg();
                lq1 lq1Var = new lq1(1, 5, 1);
                char c = '\n';
                ArrayList arrayList = new ArrayList(le0.q0(lq1Var, 10));
                Iterator it = lq1Var.iterator();
                while (true) {
                    kq1 kq1Var = (kq1) it;
                    if (!kq1Var.h) {
                        break;
                    }
                    arrayList.add(r10Var.a("h" + kq1Var.nextInt()));
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    if (!mo3.C0((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                int i10 = 0;
                for (Object obj2 : mo3.G0(str2)) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        kr1.m0();
                        throw null;
                    }
                    String str3 = (String) obj2;
                    StringBuilder sb = fgVar.c;
                    if (i10 > 0) {
                        sb.append(c);
                    }
                    int iZ0 = mo3.z0(':', i7, i8, str3);
                    if (i6 > iZ0 || iZ0 >= 41) {
                        strX0 = BuildConfig.VERSION_NAME;
                    } else {
                        String strY0 = mo3.Y0(mo3.U0(str3.substring(i7, iZ0)).toString(), '#', '*', ' ');
                        char[] cArr = new char[i6];
                        cArr[i7] = '*';
                        strX0 = mo3.X0(strY0, cArr);
                    }
                    if (strX0.length() <= 0) {
                        i5 = i7;
                        sb.append(str3);
                    } else {
                        if (arrayList2.isEmpty()) {
                            i5 = i7;
                        } else {
                            if (arrayList2.isEmpty()) {
                                i5 = i7;
                            } else {
                                int size2 = arrayList2.size();
                                i5 = i7;
                                while (true) {
                                    if (i7 < size2) {
                                        Object obj3 = arrayList2.get(i7);
                                        i7++;
                                        if (to3.k0((String) obj3, strX0)) {
                                        }
                                    }
                                }
                            }
                            sb.append(str3);
                        }
                        int iC = fgVar.c(new em3(0L, 0L, ic1.m, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65531));
                        try {
                            sb.append(strX0 + ":");
                            fgVar.b(iC);
                            String strSubstring = str3.substring(iZ0 + 1);
                            char[] cArr2 = new char[1];
                            cArr2[i5] = '*';
                            sb.append(mo3.X0(strSubstring, cArr2));
                        } catch (Throwable th) {
                            fgVar.b(iC);
                            throw th;
                        }
                    }
                    i10 = i11;
                    i7 = i5;
                    i6 = 1;
                    i8 = 6;
                    c = '\n';
                }
                i2 = 6;
                uy3.m1843xf9a47e34(fgVar.d(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ab2Var.getTypography(kk0Var2, i7).k, kk0Var2, 0, 0, 131070);
                kk0Var2 = kk0Var2;
                z = false;
            } else {
                z = false;
                i2 = 6;
                kk0Var2.a0(1582334982);
            }
            kk0Var2.r(z);
            Modifier$Companion modifier$Companion2 = c.i;
            cm3.Spacer(d.d(modifier$Companion2, 6.0f), kk0Var2, i2);
            xt centerVertically = Alignment$Companion.getCenterVertically();
            c cVarA = androidx.compose.foundation.relocation.a.a(modifier$Companion2, kxVar);
            Object objP = kk0Var2.P();
            if (objP == Composer$Companion.getEmpty()) {
                i3 = 0;
                objP = new k10(fh2Var, i3);
                kk0Var2.l0(objP);
            } else {
                i3 = 0;
            }
            c cVarE = androidx.compose.ui.layout.a.e(cVarA, (le1) objP);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, centerVertically, kk0Var2, 48);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var2, i3);
            su2 su2VarN2 = kk0Var2.n();
            c cVarD2 = b.d(kk0Var2, cVarE);
            a.j.getClass();
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
            boolean zH = kk0Var2.h(mi2Var);
            Object objP2 = kk0Var2.P();
            if (zH || objP2 == Composer$Companion.getEmpty()) {
                i4 = 0;
                objP2 = new l10(i4, mi2Var);
                kk0Var2.l0(objP2);
            } else {
                i4 = 0;
            }
            kk0 kk0Var3 = kk0Var2;
            bz.TextButton((je1) objP2, null, false, null, null, null, null, androidx.compose.foundation.layout.a.a(0.0f, 0.0f, 2), null, zg0.rememberComposableLambda(370177053, true, new m10(r10Var, i4, mi2Var), kk0Var2, 54), kk0Var3, 817889280, 382);
            kk0 kk0Var4 = kk0Var3;
            if (mo3.C0(w10Var.b)) {
                z2 = false;
                kk0Var4.a0(-1204495678);
            } else {
                kk0Var4.a0(-1190320494);
                cm3.Spacer(d.n(modifier$Companion2, 16.0f), kk0Var4, i2);
                bz.TextButton(je1Var, null, false, null, null, null, null, androidx.compose.foundation.layout.a.a(0.0f, 0.0f, 2), null, zg0.rememberComposableLambda(1995832312, true, new n10(r10Var, 0), kk0Var4, 54), kk0Var4, 817889280, 382);
                kk0Var4 = kk0Var4;
                z2 = false;
            }
            kk0Var4.r(z2);
            kk0Var4.r(true);
            kk0Var4.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CarryCard$lambda$55$lambda$54$lambda$53$lambda$51(r10 r10Var, mi2 mi2Var, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            uy3.m1842xe1e389ce(r10Var.a(((Boolean) mi2Var.getValue()).booleanValue() ? "card_hide" : "card_show"), (c) null, gx.getBrandGreen(kk0Var, 0), 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131066);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CarryCard$lambda$55$lambda$54$lambda$53$lambda$52(r10 r10Var, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            uy3.m1842xe1e389ce(r10Var.a("card_open_old"), (c) null, ab2.a.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131066);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static final void CarryGateDialog(r10 r10Var, x10 x10Var, je1 je1Var, je1 je1Var2, je1 je1Var3, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var;
        String strT;
        r10Var.getClass();
        x10Var.getClass();
        je1Var3.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1723198156);
        if ((i & 6) == 0) {
            i2 = (kk0Var2.j(r10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var2.j(x10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var2.j(je1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var2.j(je1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= kk0Var2.j(je1Var3) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if (kk0Var2.S(i2 & 1, (i2 & 9363) != 9362)) {
            String str = x10Var.a;
            if (mo3.C0(str)) {
                str = "free";
            }
            String strInstrWait = wa0.instrWait(x10Var.c, kk0Var2, 0);
            Map map = x10Var.d;
            if (map.isEmpty()) {
                map = r10Var.b;
            }
            if (str.equals("pro")) {
                strT = y64.t(r10Var.a("gate_pro_body"), new ps2("t", strInstrWait));
            } else if (str.equals("plus")) {
                String strA = r10Var.a("gate_plus_body");
                Integer num = (Integer) map.get("plus");
                strT = y64.t(strA, new ps2("n", Integer.valueOf(num != null ? num.intValue() : x10Var.b)), new ps2("t", strInstrWait));
            } else {
                strT = y64.t(r10Var.a("gate_body"), new ps2("t", strInstrWait));
            }
            kk0Var = kk0Var2;
            i9.m215x93865de1(je1Var3, zg0.rememberComposableLambda(34393980, true, new rp(je1Var, str, je1Var2, r10Var), kk0Var2, 54), null, zg0.rememberComposableLambda(420256382, true, new g10(je1Var3, 0), kk0Var2, 54), gi0.c, zg0.rememberComposableLambda(806118784, true, new h10(r10Var, 0), kk0Var2, 54), zg0.rememberComposableLambda(999049985, true, new rp(strT, str, map, r10Var), kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i2 >> 12) & 14) | 1797168, 0, 16260);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new i10(r10Var, x10Var, je1Var, je1Var2, je1Var3, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CarryGateDialog$lambda$28(je1 je1Var, String str, je1 je1Var2, r10 r10Var, ck0 ck0Var, int i) {
        kk0 kk0Var;
        int i2 = 1;
        int i3 = 2;
        kk0 kk0Var2 = (kk0) ck0Var;
        if (kk0Var2.S(i & 1, (i & 3) != 2)) {
            if (je1Var == null || kr1.n(str, "pro")) {
                kk0Var = kk0Var2;
                kk0Var.a0(-1877191322);
            } else {
                kk0Var2.a0(-1866059315);
                wt centerHorizontally = Alignment$Companion.getCenterHorizontally();
                Modifier$Companion modifier$Companion = c.i;
                vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, centerHorizontally, kk0Var2, 48);
                int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
                su2 su2VarN = kk0Var2.n();
                c cVarD = b.d(kk0Var2, modifier$Companion);
                a.j.getClass();
                d4 constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var2.a == null) {
                    rj0.a();
                    throw null;
                }
                kk0Var2.e0();
                if (kk0Var2.O) {
                    kk0Var2.m(constructor);
                } else {
                    kk0Var2.o0();
                }
                pe peVarH = fq2.h(kk0Var2, vb2VarColumnMeasurePolicy, kk0Var2, su2VarN);
                if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
                    fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var2, cVarD, ComposeUiNode$Companion.getSetModifier());
                kk0Var = kk0Var2;
                bz.Button(je1Var, null, false, null, uy.a.m1833x1b9ca94(gx.getBrandGreen(kk0Var2, 0), 0L, 0L, 0L, kk0Var2, 0, 14), null, null, null, null, zg0.rememberComposableLambda(-1676744323, true, new n10(r10Var, i2), kk0Var, 54), kk0Var, 805306368, 494);
                if (kr1.n(str, "plus") || je1Var2 == null) {
                    kk0Var.a0(1146748277);
                } else {
                    kk0Var.a0(1158147411);
                    bz.TextButton(je1Var2, null, false, null, null, null, null, null, null, zg0.rememberComposableLambda(643670757, true, new n10(r10Var, i3), kk0Var, 54), kk0Var, 805306368, 510);
                }
                kk0Var.r(false);
                kk0Var.r(true);
            }
            kk0Var.r(false);
        } else {
            kk0Var2.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CarryGateDialog$lambda$28$lambda$27$lambda$25(r10 r10Var, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            uy3.m1842xe1e389ce(r10Var.a("get_pro"), (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131070);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CarryGateDialog$lambda$28$lambda$27$lambda$26(r10 r10Var, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            String strA = r10Var.a("or_plus");
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(strA, (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).n, (ck0) kk0Var, 0, 0, 65530);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CarryGateDialog$lambda$29(je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            bz.OutlinedButton(je1Var, null, false, null, null, null, null, null, null, gi0.b, kk0Var, 805306368, 510);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CarryGateDialog$lambda$30(r10 r10Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            String strA = r10Var.a("gate_title");
            uz3 uz3Var = ab2.a.getTypography(kk0Var, 0).g;
            ic1 ic1Var = ic1.d;
            uy3.m1842xe1e389ce(strA, (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var, (ck0) kk0Var, 196608, 0, 65502);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CarryGateDialog$lambda$34(String str, String str2, Map map, r10 r10Var, ck0 ck0Var, int i) {
        boolean z;
        Object obj;
        Object obj2;
        Object obj3;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i & 1, (i & 3) != 2);
        xk xkVar = kk0Var.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            wt start = Alignment$Companion.getStart();
            dl dlVar = hl.c;
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(dlVar, start, kk0Var, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, modifier$Companion);
            a.j.getClass();
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
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(str, (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).k, (ck0) kk0Var, 0, 0, 65530);
            kk0 kk0Var2 = kk0Var;
            if (kr1.n(str2, "pro") || map.get("free") == null || map.get("plus") == null) {
                z = true;
                kk0Var2.a0(-1368141973);
            } else {
                kk0Var2.a0(-1358192523);
                cm3.Spacer(d.d(modifier$Companion, 16.0f), kk0Var2, 6);
                if (mo3.C0(r10Var.a("gate_rows"))) {
                    obj = "pro";
                    obj2 = "free";
                    obj3 = "plus";
                    kk0Var2.a0(-1368141973);
                } else {
                    kk0Var2.a0(-1358107800);
                    obj3 = "plus";
                    obj2 = "free";
                    obj = "pro";
                    uy3.m1842xe1e389ce(r10Var.a("gate_rows"), (c) null, ab2Var.getColorScheme(kk0Var2, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).n, (ck0) kk0Var2, 0, 0, 65530);
                    kk0Var2 = kk0Var2;
                    cm3.Spacer(d.d(modifier$Companion, 6.0f), kk0Var2, 6);
                }
                kk0Var2.r(false);
                c cVarB = androidx.compose.foundation.a.b(xr0.N(d.a, z73.a(12.0f)), re0.b(0.5f, ab2Var.getColorScheme(kk0Var2, 0).r), k43.a);
                vb2 vb2VarColumnMeasurePolicy2 = if0.columnMeasurePolicy(dlVar, Alignment$Companion.getStart(), kk0Var2, 0);
                int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
                su2 su2VarN2 = kk0Var2.n();
                c cVarD2 = b.d(kk0Var2, cVarB);
                d4 constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var2.e0();
                if (kk0Var2.O) {
                    kk0Var2.m(constructor2);
                } else {
                    kk0Var2.o0();
                }
                pe peVarH2 = fq2.h(kk0Var2, vb2VarColumnMeasurePolicy2, kk0Var2, su2VarN2);
                if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                    fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var2, cVarD2, ComposeUiNode$Companion.getSetModifier());
                kk0Var2.a0(-1985804784);
                Object obj4 = obj;
                int i2 = 0;
                for (Object obj5 : kr1.U(new ps2(obj2, "Free"), new ps2(obj3, "Plus"), new ps2(obj4, "Pro"))) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kr1.m0();
                        throw null;
                    }
                    ps2 ps2Var = (ps2) obj5;
                    String str3 = (String) ps2Var.c;
                    String str4 = (String) ps2Var.d;
                    Integer num = (Integer) map.get(str3);
                    int iIntValue = num != null ? num.intValue() : 0;
                    pe4.QuotaRow(str4, (kr1.n(str3, obj4) || iIntValue == 0) ? r10Var.a("unlimited") : String.valueOf(iIntValue), kr1.n(str3, str2), kr1.n(str3, obj4), i2 == 2, kk0Var2, 0);
                    i2 = i3;
                }
                kk0Var2.r(false);
                z = true;
                kk0Var2.r(true);
            }
            kk0Var2.r(false);
            kk0Var2.r(z);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static final void CarryHintBar(r10 r10Var, je1 je1Var, je1 je1Var2, ck0 ck0Var, int i) {
        int i2;
        r10Var.getClass();
        je1Var.getClass();
        je1Var2.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-419690843);
        xk xkVar = kk0Var.a;
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(r10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(je1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if (kk0Var.S(i2 & 1, (i2 & 147) != 146)) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarN = xr0.N(androidx.compose.foundation.layout.a.l(d.a, 14.0f, 4.0f), z73.a(12.0f));
            ab2 ab2Var = ab2.a;
            c cVarO = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.b(cVarN, re0.b(0.7f, ab2Var.getColorScheme(kk0Var, 0).r), k43.a), 12.0f, 0.0f, 0.0f, 0.0f, 14);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var, 48);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarO);
            a.j.getClass();
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
            c cVarM = androidx.compose.foundation.layout.a.m(new LayoutWeightElement(1.0f, true), 0.0f, 6.0f, 1);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN2 = kk0Var.n();
            c cVarD2 = b.d(kk0Var, cVarM);
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
            int i3 = i2;
            uy3.m1842xe1e389ce(r10Var.a("hint"), (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).l, (ck0) kk0Var, 0, 0, 65530);
            String strA = r10Var.a("hint_go");
            uz3 uz3Var = ab2Var.getTypography(kk0Var, 0).l;
            long brandGreen = gx.getBrandGreen(kk0Var, 0);
            ic1 ic1Var = ic1.m;
            boolean z = (i3 & 112) == 32;
            Object objP = kk0Var.P();
            if (z || objP == Composer$Companion.getEmpty()) {
                objP = new lp(je1Var, 1);
                kk0Var.l0(objP);
            }
            uy3.m1842xe1e389ce(strA, androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.e(modifier$Companion, false, null, (je1) objP, 7), 0.0f, 2.0f, 0.0f, 0.0f, 13), brandGreen, 0L, (gc1) null, ic1Var, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var, (ck0) kk0Var, 196608, 0, 65496);
            kk0Var = kk0Var;
            kk0Var.r(true);
            rl1.IconButton(je1Var2, d.j(modifier$Companion, 40.0f), false, null, null, gi0.d, kk0Var, ((i3 >> 6) & 14) | 196656, 28);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new j10(r10Var, je1Var, je1Var2, i, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01de  */
    public static final void CarrySheet(final r10 r10Var, final String str, final boolean z, final long j, final String str2, final int i, final y10 y10Var, final String str3, final boolean z2, final boolean z3, final boolean z4, final le1 le1Var, final le1 le1Var2, final je1 je1Var, final je1 je1Var2, final je1 je1Var3, final je1 je1Var4, ck0 ck0Var, final int i2, final int i3) {
        int i4;
        boolean z5;
        int i5;
        kk0 kk0Var;
        Map map;
        Integer num;
        Integer num2;
        int iIntValue;
        int iIntValue2;
        String strA;
        final String str4;
        r10Var.getClass();
        str.getClass();
        str3.getClass();
        le1Var.getClass();
        le1Var2.getClass();
        je1Var.getClass();
        je1Var2.getClass();
        je1Var4.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-757534891);
        if ((i2 & 6) == 0) {
            i4 = (kk0Var2.j(r10Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= kk0Var2.h(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= kk0Var2.i(z) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= kk0Var2.g(j) ? 2048 : 1024;
        }
        int i6 = i2 & 24576;
        int i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
        if (i6 == 0) {
            i4 |= kk0Var2.h(str2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= kk0Var2.f(i) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= kk0Var2.j(y10Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= kk0Var2.h(str3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            z5 = z2;
            i4 |= kk0Var2.i(z5) ? 67108864 : 33554432;
        } else {
            z5 = z2;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= kk0Var2.i(z3) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (kk0Var2.i(z4) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= kk0Var2.j(le1Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= kk0Var2.j(le1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i3 & 3072) == 0) {
            i5 |= kk0Var2.j(je1Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            if (kk0Var2.j(je1Var2)) {
                i7 = 16384;
            }
            i5 |= i7;
        }
        if ((i3 & 196608) == 0) {
            i5 |= kk0Var2.j(je1Var3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= kk0Var2.j(je1Var4) ? 1048576 : 524288;
        }
        if (kk0Var2.S(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 599187) == 599186) ? false : true)) {
            if (y10Var != null) {
                int i8 = y10Var.d;
                Integer numValueOf = Integer.valueOf(i8);
                if (i8 <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue2 = numValueOf.intValue();
                } else {
                    map = r10Var.c;
                    num = (Integer) map.get(str3);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        num2 = (Integer) map.get("free");
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 1500;
                        }
                        iIntValue2 = iIntValue;
                    }
                }
            } else {
                map = r10Var.c;
                num = (Integer) map.get(str3);
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    num2 = (Integer) map.get("free");
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 1500;
                    }
                    iIntValue2 = iIntValue;
                }
            }
            final boolean z6 = str.length() > iIntValue2;
            final boolean z7 = str.length() >= (iIntValue2 * 9) / 10;
            Object objP = kk0Var2.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new ct2(0);
                kk0Var2.l0(objP);
            }
            final fh2 fh2Var = (fh2) objP;
            Boolean boolValueOf = Boolean.valueOf(z);
            Long lValueOf = Long.valueOf(j);
            final int i9 = iIntValue2;
            boolean z8 = ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
            Object objP2 = kk0Var2.P();
            if (z8 || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new je(z, j, fh2Var, (so0) null);
                kk0Var2.l0(objP2);
            }
            r11.LaunchedEffect(boolValueOf, lValueOf, (ne1) objP2, kk0Var2, (i4 >> 6) & 126);
            if (str2 == null) {
                str4 = null;
            } else {
                if (str2.equals("too_long")) {
                    strA = y64.t(r10Var.a("err_too_long"), new ps2("max", Integer.valueOf(i > 0 ? i : i9)));
                } else {
                    strA = r10Var.a("err_".concat(str2));
                    if (mo3.C0(strA)) {
                        strA = r10Var.a("err_failed");
                    }
                }
                str4 = strA;
            }
            boolean z9 = kr1.n(str2, "unavailable") || kr1.n(str2, "short");
            hh3 hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(true, null, kk0Var2, 6, 2);
            final boolean z10 = z9;
            kk0Var = kk0Var2;
            final boolean z11 = z5;
            hf2.m206x750f78f8(je1Var4, null, hh3VarRememberModalBottomSheetState, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, zg0.rememberComposableLambda(-418109518, true, new oe1() { // from class: o10
                @Override // defpackage.oe1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue3 = ((Integer) obj3).intValue();
                    return q10.CarrySheet$lambda$21(r10Var, z, z10, str, le1Var, z11, le1Var2, z3, y10Var, str4, fh2Var, i9, z6, z7, je1Var3, z4, je1Var, je1Var2, (lf0) obj, (ck0) obj2, iIntValue3);
                }
            }, kk0Var, 54), kk0Var, (i5 >> 18) & 14, 384, 4090);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: e10
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = sf3.V(i2 | 1);
                    int iV2 = sf3.V(i3);
                    q10.CarrySheet(r10Var, str, z, j, str2, i, y10Var, str3, z2, z3, z4, le1Var, le1Var2, je1Var, je1Var2, je1Var3, je1Var4, (ck0) obj, iV, iV2);
                    return w84.a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:105:0x055a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v28, types: [ab2] */
    /* JADX WARN: Type inference failed for: r13v10, types: [ck0, kk0] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14, types: [ck0, kk0] */
    /* JADX WARN: Type inference failed for: r13v15, types: [kk0] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v22, types: [kk0] */
    /* JADX WARN: Type inference failed for: r13v26, types: [kk0] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v7, types: [ck0, kk0] */
    /* JADX WARN: Type inference failed for: r13v8, types: [ck0, kk0] */
    /* JADX WARN: Type inference failed for: r13v9, types: [ck0, kk0] */
    /* JADX WARN: Type inference failed for: r1v18, types: [uy] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v35, types: [ab2] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ab2] */
    /* JADX WARN: Type inference failed for: r20v11, types: [ck0, kk0] */
    /* JADX WARN: Type inference failed for: r28v1, types: [ck0] */
    /* JADX WARN: Type inference failed for: r28v2, types: [ck0] */
    /* JADX WARN: Type inference failed for: r28v5, types: [ck0] */
    /* JADX WARN: Type inference failed for: r44v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r52v1, types: [ck0] */
    /* JADX WARN: Type inference failed for: r61v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v43, types: [kb0] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
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
    public static final w84 CarrySheet$lambda$21(r10 r10Var, boolean z, boolean z2, String str, le1 le1Var, boolean z3, le1 le1Var2, boolean z4, y10 y10Var, String str2, fh2 fh2Var, int i, boolean z5, boolean z6, je1 je1Var, boolean z7, je1 je1Var2, je1 je1Var3, lf0 lf0Var, ck0 ck0Var, int i2) {
        char c;
        cl clVar;
        int i3;
        boolean z8;
        kk0 kk0Var;
        int i4;
        Modifier$Companion modifier$Companion;
        ?? r1;
        FillElement fillElement;
        cl clVar2;
        ?? r0;
        int i5;
        String str3;
        ?? r13;
        String str4;
        r10 r10Var2;
        ?? r14;
        ?? r2;
        Modifier$Companion modifier$Companion2;
        ?? r15;
        int i6;
        ?? r16;
        Object obj;
        long j;
        ?? r17;
        Object obj2;
        Object obj3;
        int i7;
        c cVarH;
        int i8;
        Object obj4;
        long jD;
        lf0Var.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        boolean zS = kk0Var2.S(i2 & 1, (i2 & 17) != 16);
        xk xkVar = kk0Var2.a;
        if (zS) {
            Modifier$Companion modifier$Companion3 = c.i;
            FillElement fillElement2 = d.a;
            c cVarM = androidx.compose.foundation.layout.a.m(lh4.a(fillElement2), 20.0f, 0.0f, 2);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var2, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN = kk0Var2.n();
            c cVarD = b.d(kk0Var2, cVarM);
            a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor);
            } else {
                kk0Var2.o0();
            }
            pe peVarH = fq2.h(kk0Var2, vb2VarColumnMeasurePolicy, kk0Var2, su2VarN);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var2, cVarD, ComposeUiNode$Companion.getSetModifier());
            String strA = r10Var.a("title");
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(strA, (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).g, (ck0) kk0Var2, 196608, 0, 65502);
            cm3.Spacer(d.d(modifier$Companion3, 6.0f), kk0Var2, 6);
            uy3.m1842xe1e389ce(r10Var.a("lead"), (c) null, ab2Var.getColorScheme(kk0Var2, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).k, (ck0) kk0Var2, 0, 0, 65530);
            kk0 kk0Var3 = kk0Var2;
            cm3.Spacer(d.d(modifier$Companion3, 14.0f), kk0Var3, 6);
            cl clVar3 = hl.a;
            if (z) {
                kk0Var3.a0(1910374067);
                vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(clVar3, Alignment$Companion.getCenterVertically(), kk0Var3, 48);
                int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
                su2 su2VarN2 = kk0Var3.n();
                c cVarD2 = b.d(kk0Var3, modifier$Companion3);
                d4 constructor2 = ComposeUiNode$Companion.getConstructor();
                if (xkVar == null) {
                    rj0.a();
                    throw null;
                }
                kk0Var3.e0();
                if (kk0Var3.O) {
                    kk0Var3.m(constructor2);
                } else {
                    kk0Var3.o0();
                }
                pe peVarH2 = fq2.h(kk0Var3, vb2VarRowMeasurePolicy, kk0Var3, su2VarN2);
                if (kk0Var3.O || !kr1.n(kk0Var3.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                    fq2.v(currentCompositeKeyHash2, kk0Var3, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var3, cVarD2, ComposeUiNode$Companion.getSetModifier());
                clVar = clVar3;
                i3 = 1906504678;
                z03.m1882xe8727fba(d.j(modifier$Companion3, 16.0f), gx.getBrandGreen(kk0Var3, 0), 2.0f, 0L, 0, kk0Var3, 390, 24);
                cm3.Spacer(d.n(modifier$Companion3, 8.0f), kk0Var3, 6);
                uy3.m1842xe1e389ce(r10Var.a("making") + " \u2066" + ((ct2) fh2Var).f() + " s\u2069", (c) null, ab2Var.getColorScheme(kk0Var3, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var3, 0).l, (ck0) kk0Var3, 0, 0, 65530);
                kk0 kk0Var4 = kk0Var3;
                kk0Var4.r(true);
                c = 6;
                cm3.Spacer(d.d(modifier$Companion3, 8.0f), kk0Var4, 6);
                z8 = false;
                kk0Var = kk0Var4;
            } else {
                c = 6;
                clVar = clVar3;
                i3 = 1906504678;
                z8 = false;
                kk0Var3.a0(1906504678);
                kk0Var = kk0Var3;
            }
            kk0Var.r(z8);
            if (z2) {
                i4 = i3;
                modifier$Companion = modifier$Companion3;
                r1 = ab2Var;
                fillElement = fillElement2;
                clVar2 = clVar;
                r0 = 0;
                i5 = 48;
                str3 = null;
                kk0Var.a0(i4);
                kk0Var.r(false);
                r13 = kk0Var;
            } else {
                kk0Var.a0(1910914614);
                c cVarE = d.e(fillElement2, 160.0f, 360.0f);
                if (z) {
                    kk0Var.a0(1308577573);
                    i7 = 0;
                    cVarH = sf3.h(modifier$Companion3, 1.0f, ab2Var.getColorScheme(kk0Var, 0).A, z73.a(4.0f));
                    kk0Var.r(false);
                } else {
                    i7 = 0;
                    kk0Var.a0(1308580036);
                    kk0Var.r(false);
                    cVarH = modifier$Companion3;
                }
                c cVarThen = cVarE.then(cVarH);
                uz3 uz3Var = ab2Var.getTypography(kk0Var, i7).k;
                boolean zI = kk0Var.i(z) | kk0Var.h(le1Var);
                Object objP = kk0Var.P();
                if (zI || objP == Composer$Companion.getEmpty()) {
                    i8 = 0;
                    d10 d10Var = new d10(i8, le1Var, z);
                    kk0Var.l0(d10Var);
                    obj4 = d10Var;
                } else {
                    i8 = 0;
                    obj4 = objP;
                }
                ?? r20 = kk0Var;
                modifier$Companion = modifier$Companion3;
                ?? r3 = i8;
                ir2.OutlinedTextField(str, (le1) obj4, cVarThen, false, z, uz3Var, (ne1) null, (ne1) null, (ne1) null, (ne1) null, (ne1) null, (ne1) null, (ne1) null, false, (de4) null, (yv1) null, (wv1) null, false, 0, 0, (gh2) null, (rg3) null, (bu3) null, (ck0) r20, 0, 0, 0, 8388552);
                c cVarO = androidx.compose.foundation.layout.a.o(fillElement2, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                fillElement = fillElement2;
                clVar2 = clVar;
                i5 = 48;
                vb2 vb2VarRowMeasurePolicy2 = e83.rowMeasurePolicy(clVar2, Alignment$Companion.getCenterVertically(), r20, 48);
                int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(r20, r3 == true ? 1 : 0);
                su2 su2VarN3 = r20.n();
                c cVarD3 = b.d(r20, cVarO);
                d4 constructor3 = ComposeUiNode$Companion.getConstructor();
                if (xkVar == null) {
                    rj0.a();
                    throw null;
                }
                r20.e0();
                if (r20.O) {
                    r20.m(constructor3);
                } else {
                    r20.o0();
                }
                pe peVarH3 = fq2.h(r20, vb2VarRowMeasurePolicy2, r20, su2VarN3);
                if (r20.O || !kr1.n(r20.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                    fq2.v(currentCompositeKeyHash3, r20, currentCompositeKeyHash3, peVarH3);
                }
                xp1.E(r20, cVarD3, ComposeUiNode$Companion.getSetModifier());
                String str5 = "\u2066" + str.length() + " / " + i + "\u2069";
                ?? r4 = ab2Var;
                uz3 uz3VarA = uz3.a(r4.getTypography(r20, r3 == true ? 1 : 0).o, 0L, 0L, null, null, 0L, 1, 0L, null, null, 16711679);
                if (z5) {
                    r20.a0(-1735063637);
                    jD = r4.getColorScheme(r20, r3 == true ? 1 : 0).w;
                } else {
                    if (z6) {
                        r20.a0(-1735063145);
                        r20.r(r3);
                        jD = gb2.d(4292911360L);
                    } else {
                        r20.a0(-1735061450);
                        jD = r4.getColorScheme(r20, r3 == true ? 1 : 0).s;
                    }
                    uy3.m1842xe1e389ce(str5, (c) null, jD, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3VarA, (ck0) r20, 0, 0, 65530);
                    ?? r18 = r20;
                    r18.r(true);
                    r18.r(r3);
                    str3 = null;
                    i4 = 1906504678;
                    r0 = r3;
                    r1 = r4;
                    r13 = r18;
                }
                r20.r(r3);
                uy3.m1842xe1e389ce(str5, (c) null, jD, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3VarA, (ck0) r20, 0, 0, 65530);
                ?? r19 = r20;
                r19.r(true);
                r19.r(r3);
                str3 = null;
                i4 = 1906504678;
                r0 = r3;
                r1 = r4;
                r13 = r19;
            }
            if (!z3 || z2) {
                str4 = str3;
                r10Var2 = r10Var;
                r13.a0(i4);
                r2 = r1;
                r14 = r13;
            } else {
                r13.a0(1912006155);
                boolean zH = r13.h(le1Var2) | r13.i(z4);
                Object objP2 = r13.P();
                if (zH || objP2 == Composer$Companion.getEmpty()) {
                    obj3 = objP2;
                    fq fqVar = new fq(le1Var2, z4);
                    r13.l0(fqVar);
                    obj3 = fqVar;
                }
                obj3 = objP2;
                c cVarM2 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.e(fillElement, r0, str3, (je1) obj3, 7), 0.0f, 4.0f, 1);
                vb2 vb2VarRowMeasurePolicy3 = e83.rowMeasurePolicy(clVar2, Alignment$Companion.getCenterVertically(), r13, i5);
                int currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(r13, r0);
                su2 su2VarN4 = r13.n();
                c cVarD4 = b.d(r13, cVarM2);
                d4 constructor4 = ComposeUiNode$Companion.getConstructor();
                if (xkVar == null) {
                    ?? r61 = str3;
                    rj0.a();
                    throw r61;
                }
                r13.e0();
                if (r13.O) {
                    r13.m(constructor4);
                } else {
                    r13.o0();
                }
                pe peVarH4 = fq2.h(r13, vb2VarRowMeasurePolicy3, r13, su2VarN4);
                if (r13.O || !kr1.n(r13.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                    fq2.v(currentCompositeKeyHash4, r13, currentCompositeKeyHash4, peVarH4);
                }
                xp1.E(r13, cVarD4, ComposeUiNode$Companion.getSetModifier());
                ?? r28 = r13;
                ?? r11 = r1;
                qb0.Checkbox(z4, le1Var2, null, false, kb0.a.m222xf75ebbd3(gx.getBrandGreen(r13, r0), 0L, 0L, 0L, 0L, 0L, r28, 0, 62), null, r28, 0, 44);
                r10Var2 = r10Var;
                i5 = i5;
                clVar2 = clVar2;
                str4 = null;
                i4 = i4;
                r2 = r11;
                uy3.m1842xe1e389ce(r10Var2.a("keep_instr"), (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, r11.getTypography(r28, r0).k, (ck0) r28, 0, 0, 65534);
                ?? r110 = r28;
                r110.r(true);
                r14 = r110;
            }
            r14.r(r0);
            if (y10Var != null) {
                int i9 = y10Var.c;
                String str6 = y10Var.a;
                int i10 = y10Var.b;
                if (i10 <= 0 || ((!str6.equals("free") && i9 > 3) || z2)) {
                    modifier$Companion2 = modifier$Companion;
                    r14.a0(i4);
                    r15 = r14;
                } else {
                    r14.a0(1912699687);
                    c cVarO2 = androidx.compose.foundation.layout.a.o(modifier$Companion, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    vb2 vb2VarRowMeasurePolicy4 = e83.rowMeasurePolicy(clVar2, Alignment$Companion.getCenterVertically(), r14, i5);
                    int currentCompositeKeyHash5 = rj0.getCurrentCompositeKeyHash(r14, r0);
                    su2 su2VarN5 = r14.n();
                    c cVarD5 = b.d(r14, cVarO2);
                    d4 constructor5 = ComposeUiNode$Companion.getConstructor();
                    if (xkVar == null) {
                        rj0.a();
                        throw null;
                    }
                    r14.e0();
                    if (r14.O) {
                        r14.m(constructor5);
                    } else {
                        r14.o0();
                    }
                    pe peVarH5 = fq2.h(r14, vb2VarRowMeasurePolicy4, r14, su2VarN5);
                    if (r14.O || !kr1.n(r14.P(), Integer.valueOf(currentCompositeKeyHash5))) {
                        fq2.v(currentCompositeKeyHash5, r14, currentCompositeKeyHash5, peVarH5);
                    }
                    xp1.E(r14, cVarD5, ComposeUiNode$Companion.getSetModifier());
                    ?? r29 = r14;
                    modifier$Companion2 = modifier$Companion;
                    uy3.m1842xe1e389ce(y64.t(r10Var2.a("quota"), new ps2("left", Integer.valueOf(i9)), new ps2("n", Integer.valueOf(i10))), (c) null, r2.getColorScheme(r14, r0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, r2.getTypography(r14, r0).l, (ck0) r29, 0, 0, 65530);
                    ?? r111 = r29;
                    if (je1Var == null || str6.equals("pro") || mo3.C0(r10Var2.a("more"))) {
                        r111.a0(1578483678);
                        r17 = r111;
                    } else {
                        r111.a0(1585059212);
                        uy3.m1842xe1e389ce(" · ", (c) null, r2.getColorScheme(r111, r0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, r2.getTypography(r111, r0).l, (ck0) r111, 6, 0, 65530);
                        String strA2 = r10Var2.a("more");
                        uz3 uz3Var2 = r2.getTypography(r111, r0).l;
                        long brandGreen = gx.getBrandGreen(r111, r0);
                        boolean zH2 = r111.h(je1Var);
                        Object objP3 = r111.P();
                        if (zH2 || objP3 == Composer$Companion.getEmpty()) {
                            obj2 = objP3;
                            lp lpVar = new lp(je1Var, 2);
                            r111.l0(lpVar);
                            obj2 = lpVar;
                        }
                        obj2 = objP3;
                        uy3.m1842xe1e389ce(strA2, androidx.compose.foundation.a.e(modifier$Companion2, r0, str4, (je1) obj2, 7), brandGreen, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var2, (ck0) r111, 0, 0, 65528);
                        r17 = r111;
                    }
                    r17.r(r0);
                    r17.r(true);
                    r15 = r17;
                }
            } else {
                modifier$Companion2 = modifier$Companion;
                r14.a0(i4);
                r15 = r14;
            }
            r15.r(r0);
            if (str2 != null) {
                r15.a0(1913478531);
                i6 = 6;
                cm3.Spacer(d.d(modifier$Companion2, 8.0f), r15, 6);
                uz3 uz3Var3 = r2.getTypography(r15, r0).k;
                if (z2) {
                    r15.a0(1308656972);
                    j = r2.getColorScheme(r15, r0).s;
                } else {
                    r15.a0(1308658497);
                    j = r2.getColorScheme(r15, r0).w;
                }
                r15.r(r0);
                ?? r210 = r15;
                uy3.m1842xe1e389ce(str2, (c) null, j, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var3, (ck0) r210, 0, 0, 65530);
                r16 = r210;
            } else {
                i6 = 6;
                r15.a0(1906504678);
                r16 = r15;
            }
            r16.r(r0);
            cm3.Spacer(d.d(modifier$Companion2, 14.0f), r16, i6);
            if (z2) {
                r16.a0(1308701466);
                cm3.Spacer(d.d(modifier$Companion2, 18.0f), r16, i6);
                r16.r(r0);
            } else {
                r16.a0(1913836457);
                c cVarO3 = androidx.compose.foundation.layout.a.o(fillElement, 0.0f, 0.0f, 0.0f, 18.0f, 7);
                vb2 vb2VarRowMeasurePolicy5 = e83.rowMeasurePolicy(clVar2, Alignment$Companion.getCenterVertically(), r16, 48);
                int currentCompositeKeyHash6 = rj0.getCurrentCompositeKeyHash(r16, r0);
                su2 su2VarN6 = r16.n();
                c cVarD6 = b.d(r16, cVarO3);
                d4 constructor6 = ComposeUiNode$Companion.getConstructor();
                if (xkVar == null) {
                    rj0.a();
                    throw null;
                }
                r16.e0();
                if (r16.O) {
                    r16.m(constructor6);
                } else {
                    r16.o0();
                }
                pe peVarH6 = fq2.h(r16, vb2VarRowMeasurePolicy5, r16, su2VarN6);
                if (r16.O || !kr1.n(r16.P(), Integer.valueOf(currentCompositeKeyHash6))) {
                    fq2.v(currentCompositeKeyHash6, r16, currentCompositeKeyHash6, peVarH6);
                }
                xp1.E(r16, cVarD6, ComposeUiNode$Companion.getSetModifier());
                String strA3 = r10Var2.a("again");
                ?? r9 = (z || z7) ? r0 : 1;
                c cVarJ = d.j(modifier$Companion2, 44.0f);
                boolean zH3 = r16.h(strA3);
                Object objP4 = r16.P();
                if (zH3 || objP4 == Composer$Companion.getEmpty()) {
                    obj = objP4;
                    ep epVar = new ep(strA3, 1);
                    r16.l0(epVar);
                    obj = epVar;
                }
                obj = objP4;
                rl1.IconButton(je1Var2, we3.b(cVarJ, r0, (le1) obj), r9, null, null, gi0.a, r16, 196608, 24);
                cm3.Spacer(new LayoutWeightElement(1.0f, true), r16, r0);
                ?? r52 = r16;
                bz.Button(je1Var3, null, (z || z7 || z5 || mo3.C0(str)) ? r0 : 1, null, uy.a.m1833x1b9ca94(gx.getBrandGreen(r16, r0), gx.getBrandOnAccent(r16, r0), 0L, 0L, r52, 0, 12), null, null, null, null, zg0.rememberComposableLambda(-1702867694, true, new eq(1, r10Var2, z7), r16, 54), r52, 805306368, 490);
                r16.r(true);
                r16.r(r0);
            }
            r16.r(true);
        } else {
            kk0Var2.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CarrySheet$lambda$21$lambda$20$lambda$19$lambda$18(boolean z, r10 r10Var, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            if (z) {
                kk0Var.a0(2022274714);
                Modifier$Companion modifier$Companion = c.i;
                z03.m1882xe8727fba(d.j(modifier$Companion, 16.0f), gx.getBrandOnAccent(kk0Var, 0), 2.0f, 0L, 0, kk0Var, 390, 24);
                cm3.Spacer(d.n(modifier$Companion, 8.0f), kk0Var, 6);
            } else {
                kk0Var.a0(2014053328);
            }
            kk0Var.r(false);
            uy3.m1842xe1e389ce(r10Var.a("start"), (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131070);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }
}
