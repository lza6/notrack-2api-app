package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import java.util.Map;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class zp1 {
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:60:0x014b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void InstrGateDialog(final l50 l50Var, je1 je1Var, je1 je1Var2, je1 je1Var3, ck0 ck0Var, int i, int i2) {
        int i3;
        je1 je1Var4;
        final boolean z;
        boolean z2;
        kk0 kk0Var;
        je1 je1Var5;
        w33 w33VarV;
        je1 je1Var6;
        final String str;
        String strInstrWait;
        String strValueOf;
        final String strStringResource;
        int i4;
        l50Var.getClass();
        Map map = l50Var.e;
        je1Var3.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(2082837685);
        int i5 = 2;
        if ((i & 6) == 0) {
            i3 = (kk0Var2.j(l50Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var2.j(je1Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                je1Var4 = je1Var2;
                i3 |= kk0Var2.j(je1Var4) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            if ((i & 3072) == 0) {
                if (kk0Var2.j(je1Var3)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            z = false;
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (kk0Var2.S(i3 & 1, z2)) {
                if (i6 != 0) {
                    je1Var6 = null;
                } else {
                    je1Var6 = je1Var4;
                }
                str = l50Var.b;
                if (mo3.C0(str)) {
                    str = "free";
                }
                strInstrWait = wa0.instrWait(l50Var.d, kk0Var2, 0);
                strValueOf = String.valueOf(l50Var.c);
                if (str.equals("pro")) {
                    kk0Var2.a0(152268420);
                    strStringResource = ko3.stringResource(R.string.instr_gate_pro_body, new Object[]{strInstrWait}, kk0Var2, 0);
                    kk0Var2.r(false);
                } else if (str.equals("plus")) {
                    kk0Var2.a0(152270536);
                    strStringResource = ko3.stringResource(R.string.instr_gate_plus_body, new Object[]{strValueOf, strInstrWait}, kk0Var2, 0);
                    kk0Var2.r(false);
                } else {
                    kk0Var2.a0(152272707);
                    strStringResource = ko3.stringResource(R.string.instr_gate_body, new Object[]{strValueOf, strInstrWait}, kk0Var2, 0);
                    kk0Var2.r(false);
                }
                if (map.get("free") != null && map.get("plus") != null) {
                    z = true;
                }
                kk0Var = kk0Var2;
                i9.m215x93865de1(je1Var3, zg0.rememberComposableLambda(-373851395, true, new oj1(je1Var, str, je1Var6, i5), kk0Var2, 54), null, zg0.rememberComposableLambda(-304203521, true, new g10(je1Var3, 5), kk0Var2, 54), ti0.d, ti0.e, zg0.rememberComposableLambda(-199731710, true, new ne1() { // from class: yp1
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return zp1.InstrGateDialog$lambda$7(strStringResource, z, str, l50Var, (ck0) obj, iIntValue);
                    }
                }, kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i3 >> 9) & 14) | 1797168, 0, 16260);
                je1Var5 = je1Var6;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                je1Var5 = je1Var4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new wv(l50Var, je1Var, je1Var5, je1Var3, i, i2, 2));
            }
        }
        i3 |= 384;
        je1Var4 = je1Var2;
        if ((i & 3072) == 0) {
            if (kk0Var2.j(je1Var3)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        z = false;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kk0Var2.S(i3 & 1, z2)) {
            if (i6 != 0) {
                je1Var6 = null;
            } else {
                je1Var6 = je1Var4;
            }
            str = l50Var.b;
            if (mo3.C0(str)) {
                str = "free";
            }
            strInstrWait = wa0.instrWait(l50Var.d, kk0Var2, 0);
            strValueOf = String.valueOf(l50Var.c);
            if (str.equals("pro")) {
                kk0Var2.a0(152268420);
                strStringResource = ko3.stringResource(R.string.instr_gate_pro_body, new Object[]{strInstrWait}, kk0Var2, 0);
                kk0Var2.r(false);
            } else if (str.equals("plus")) {
                kk0Var2.a0(152270536);
                strStringResource = ko3.stringResource(R.string.instr_gate_plus_body, new Object[]{strValueOf, strInstrWait}, kk0Var2, 0);
                kk0Var2.r(false);
            } else {
                kk0Var2.a0(152272707);
                strStringResource = ko3.stringResource(R.string.instr_gate_body, new Object[]{strValueOf, strInstrWait}, kk0Var2, 0);
                kk0Var2.r(false);
            }
            if (map.get("free") != null) {
                z = true;
            }
            kk0Var = kk0Var2;
            i9.m215x93865de1(je1Var3, zg0.rememberComposableLambda(-373851395, true, new oj1(je1Var, str, je1Var6, i5), kk0Var2, 54), null, zg0.rememberComposableLambda(-304203521, true, new g10(je1Var3, 5), kk0Var2, 54), ti0.d, ti0.e, zg0.rememberComposableLambda(-199731710, true, new ne1() { // from class: yp1
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return zp1.InstrGateDialog$lambda$7(strStringResource, z, str, l50Var, (ck0) obj, iIntValue);
                }
            }, kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i3 >> 9) & 14) | 1797168, 0, 16260);
            je1Var5 = je1Var6;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            je1Var5 = je1Var4;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wv(l50Var, je1Var, je1Var5, je1Var3, i, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 InstrGateDialog$lambda$2(je1 je1Var, String str, je1 je1Var2, ck0 ck0Var, int i) {
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        if (kk0Var2.S(i & 1, (i & 3) != 2)) {
            if (je1Var == null || kr1.n(str, "pro")) {
                kk0Var = kk0Var2;
                kk0Var.a0(-561494331);
            } else {
                kk0Var2.a0(-556638677);
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
                bz.Button(je1Var, null, false, null, uy.a.m1833x1b9ca94(gx.getBrandGreen(kk0Var2, 0), 0L, 0L, 0L, kk0Var2, 0, 14), null, null, null, null, ti0.a, kk0Var2, 805306368, 494);
                kk0Var = kk0Var2;
                if (kr1.n(str, "plus") || kr1.n(str, "pro") || je1Var2 == null) {
                    kk0Var.a0(903357876);
                } else {
                    kk0Var.a0(908592133);
                    bz.TextButton(je1Var2, null, false, null, null, null, null, null, null, ti0.b, kk0Var, 805306368, 510);
                    kk0Var = kk0Var;
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
    public static final w84 InstrGateDialog$lambda$3(je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            bz.OutlinedButton(je1Var, null, false, null, null, null, null, null, null, ti0.c, kk0Var, 805306368, 510);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 InstrGateDialog$lambda$7(String str, boolean z, String str2, l50 l50Var, ck0 ck0Var, int i) {
        boolean z2;
        String strValueOf;
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
            if (!z || kr1.n(str2, "pro")) {
                z2 = true;
                kk0Var.a0(-515086646);
            } else {
                kk0Var.a0(-511655907);
                cm3.Spacer(d.d(modifier$Companion, 16.0f), kk0Var, 6);
                c cVarB = androidx.compose.foundation.a.b(xr0.N(d.a, z73.a(12.0f)), re0.b(0.5f, ab2Var.getColorScheme(kk0Var, 0).r), k43.a);
                vb2 vb2VarColumnMeasurePolicy2 = if0.columnMeasurePolicy(dlVar, Alignment$Companion.getStart(), kk0Var, 0);
                int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN2 = kk0Var.n();
                c cVarD2 = b.d(kk0Var, cVarB);
                d4 constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                pe peVarH2 = fq2.h(kk0Var, vb2VarColumnMeasurePolicy2, kk0Var, su2VarN2);
                if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                kk0Var.a0(1615136085);
                int i2 = 0;
                for (Object obj : kr1.U("free", "plus", "pro")) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kr1.m0();
                        throw null;
                    }
                    String str3 = (String) obj;
                    String strStringResource = ko3.stringResource(kr1.n(str3, "free") ? R.string.voice_gate_free : kr1.n(str3, "plus") ? R.string.voice_gate_plus : R.string.voice_gate_pro, kk0Var, 0);
                    if (kr1.n(str3, "pro")) {
                        kk0Var.a0(-1966295748);
                        strValueOf = ko3.stringResource(R.string.voice_gate_unlimited, kk0Var, 0);
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(-1966292327);
                        kk0Var.r(false);
                        strValueOf = String.valueOf(l50Var.e.get(str3));
                    }
                    pe4.QuotaRow(strStringResource, strValueOf, kr1.n(str3, str2), kr1.n(str3, "pro"), i2 == 2, kk0Var, 0);
                    i2 = i3;
                }
                kk0Var.r(false);
                z2 = true;
                kk0Var.r(true);
            }
            kk0Var.r(false);
            kk0Var.r(z2);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }
}
