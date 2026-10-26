package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class fm1 {
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3 A[EDGE_INSN: B:64:0x00c3->B:72:0x00df BREAK  A[LOOP:0: B:66:0x00ca->B:80:?]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x014e  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[LOOP:0: B:66:0x00ca->B:80:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void ImageGateDialog(lm1 lm1Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, ck0 ck0Var, int i, int i2) {
        int i3;
        je1 je1Var5;
        int i4;
        je1 je1Var6;
        int i5;
        int i6;
        boolean z;
        kk0 kk0Var;
        je1 je1Var7;
        je1 je1Var8;
        w33 w33VarV;
        je1 je1Var9;
        je1 je1Var10;
        String str;
        Map map;
        List listU;
        Iterator it;
        boolean z2;
        int i7;
        lm1Var.getClass();
        je1Var4.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-834793839);
        int i8 = 4;
        if ((i & 6) == 0) {
            i3 = (kk0Var2.j(lm1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var2.j(je1Var) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                je1Var5 = je1Var2;
                i3 |= kk0Var2.j(je1Var5) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    je1Var6 = je1Var3;
                    if (kk0Var2.j(je1Var6)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if (kk0Var2.j(je1Var4)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i6 = 1;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i3 & 1, z)) {
                    if (i9 != 0) {
                        je1Var9 = null;
                    } else {
                        je1Var9 = je1Var5;
                    }
                    if (i4 != 0) {
                        je1Var10 = null;
                    } else {
                        je1Var10 = je1Var6;
                    }
                    str = lm1Var.a;
                    if (mo3.C0(str)) {
                        str = "free";
                    }
                    boolean z3 = !str.equals("free");
                    map = lm1Var.c;
                    listU = kr1.U("free", "plus", "pro");
                    if (listU.isEmpty()) {
                        it = listU.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z2 = true;
                                break;
                            } else if (map.get((String) it.next()) != null) {
                                z2 = false;
                                break;
                            }
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                    kk0Var = kk0Var2;
                    i9.m215x93865de1(je1Var4, zg0.rememberComposableLambda(-1820673319, true, new oj1(je1Var, str, je1Var9, i6), kk0Var2, 54), null, zg0.rememberComposableLambda(110452315, true, new g10(je1Var4, i8), kk0Var2, 54), si0.d, zg0.rememberComposableLambda(2041577949, true, new z70(i8, z3), kk0Var2, 54), zg0.rememberComposableLambda(-1287826530, true, new em1(z3, z2, je1Var10, map, str), kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i3 >> 12) & 14) | 1797168, 0, 16260);
                    je1Var8 = je1Var10;
                    je1Var7 = je1Var9;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    je1Var7 = je1Var5;
                    je1Var8 = je1Var6;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new p40(lm1Var, je1Var, je1Var7, je1Var8, je1Var4, i, i2));
                }
            }
            i3 |= 3072;
            je1Var6 = je1Var3;
            if ((i & 24576) == 0) {
                if (kk0Var2.j(je1Var4)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            i6 = 1;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i3 & 1, z)) {
                if (i9 != 0) {
                    je1Var9 = null;
                } else {
                    je1Var9 = je1Var5;
                }
                if (i4 != 0) {
                    je1Var10 = null;
                } else {
                    je1Var10 = je1Var6;
                }
                str = lm1Var.a;
                if (mo3.C0(str)) {
                    str = "free";
                }
                boolean z4 = !str.equals("free");
                map = lm1Var.c;
                listU = kr1.U("free", "plus", "pro");
                if (listU.isEmpty()) {
                    it = listU.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z2 = true;
                            break;
                        } else if (map.get((String) it.next()) != null) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    z2 = true;
                    break;
                }
                kk0Var = kk0Var2;
                i9.m215x93865de1(je1Var4, zg0.rememberComposableLambda(-1820673319, true, new oj1(je1Var, str, je1Var9, i6), kk0Var2, 54), null, zg0.rememberComposableLambda(110452315, true, new g10(je1Var4, i8), kk0Var2, 54), si0.d, zg0.rememberComposableLambda(2041577949, true, new z70(i8, z4), kk0Var2, 54), zg0.rememberComposableLambda(-1287826530, true, new em1(z4, z2, je1Var10, map, str), kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i3 >> 12) & 14) | 1797168, 0, 16260);
                je1Var8 = je1Var10;
                je1Var7 = je1Var9;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                je1Var7 = je1Var5;
                je1Var8 = je1Var6;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new p40(lm1Var, je1Var, je1Var7, je1Var8, je1Var4, i, i2));
            }
        }
        i3 |= 384;
        je1Var5 = je1Var2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                je1Var6 = je1Var3;
                if (kk0Var2.j(je1Var6)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if (kk0Var2.j(je1Var4)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            i6 = 1;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i3 & 1, z)) {
                if (i9 != 0) {
                    je1Var9 = null;
                } else {
                    je1Var9 = je1Var5;
                }
                if (i4 != 0) {
                    je1Var10 = null;
                } else {
                    je1Var10 = je1Var6;
                }
                str = lm1Var.a;
                if (mo3.C0(str)) {
                    str = "free";
                }
                boolean z5 = !str.equals("free");
                map = lm1Var.c;
                listU = kr1.U("free", "plus", "pro");
                if (listU.isEmpty()) {
                    it = listU.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z2 = true;
                            break;
                        } else if (map.get((String) it.next()) != null) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    z2 = true;
                    break;
                }
                kk0Var = kk0Var2;
                i9.m215x93865de1(je1Var4, zg0.rememberComposableLambda(-1820673319, true, new oj1(je1Var, str, je1Var9, i6), kk0Var2, 54), null, zg0.rememberComposableLambda(110452315, true, new g10(je1Var4, i8), kk0Var2, 54), si0.d, zg0.rememberComposableLambda(2041577949, true, new z70(i8, z5), kk0Var2, 54), zg0.rememberComposableLambda(-1287826530, true, new em1(z5, z2, je1Var10, map, str), kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i3 >> 12) & 14) | 1797168, 0, 16260);
                je1Var8 = je1Var10;
                je1Var7 = je1Var9;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                je1Var7 = je1Var5;
                je1Var8 = je1Var6;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new p40(lm1Var, je1Var, je1Var7, je1Var8, je1Var4, i, i2));
            }
        }
        i3 |= 3072;
        je1Var6 = je1Var3;
        if ((i & 24576) == 0) {
            if (kk0Var2.j(je1Var4)) {
                i7 = 16384;
            } else {
                i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i3 |= i7;
        }
        i6 = 1;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var2.S(i3 & 1, z)) {
            if (i9 != 0) {
                je1Var9 = null;
            } else {
                je1Var9 = je1Var5;
            }
            if (i4 != 0) {
                je1Var10 = null;
            } else {
                je1Var10 = je1Var6;
            }
            str = lm1Var.a;
            if (mo3.C0(str)) {
                str = "free";
            }
            boolean z6 = !str.equals("free");
            map = lm1Var.c;
            listU = kr1.U("free", "plus", "pro");
            if (listU.isEmpty()) {
                it = listU.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z2 = true;
                        break;
                    } else if (map.get((String) it.next()) != null) {
                        z2 = false;
                        break;
                    }
                }
            } else {
                z2 = true;
                break;
            }
            kk0Var = kk0Var2;
            i9.m215x93865de1(je1Var4, zg0.rememberComposableLambda(-1820673319, true, new oj1(je1Var, str, je1Var9, i6), kk0Var2, 54), null, zg0.rememberComposableLambda(110452315, true, new g10(je1Var4, i8), kk0Var2, 54), si0.d, zg0.rememberComposableLambda(2041577949, true, new z70(i8, z6), kk0Var2, 54), zg0.rememberComposableLambda(-1287826530, true, new em1(z6, z2, je1Var10, map, str), kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i3 >> 12) & 14) | 1797168, 0, 16260);
            je1Var8 = je1Var10;
            je1Var7 = je1Var9;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            je1Var7 = je1Var5;
            je1Var8 = je1Var6;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new p40(lm1Var, je1Var, je1Var7, je1Var8, je1Var4, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ImageGateDialog$lambda$3(je1 je1Var, String str, je1 je1Var2, ck0 ck0Var, int i) {
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        if (kk0Var2.S(i & 1, (i & 3) != 2)) {
            if (je1Var == null || kr1.n(str, "pro")) {
                kk0Var = kk0Var2;
                kk0Var.a0(1457684809);
            } else {
                kk0Var2.a0(1463273427);
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
                bz.Button(je1Var, null, false, null, uy.a.m1833x1b9ca94(gx.getBrandGreen(kk0Var2, 0), 0L, 0L, 0L, kk0Var2, 0, 14), null, null, null, null, si0.a, kk0Var2, 805306368, 494);
                kk0Var = kk0Var2;
                if (kr1.n(str, "plus") || kr1.n(str, "pro") || je1Var2 == null) {
                    kk0Var.a0(1125413240);
                } else {
                    kk0Var.a0(1131499625);
                    bz.TextButton(je1Var2, null, false, null, null, null, null, null, null, si0.b, kk0Var, 805306368, 510);
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
    public static final w84 ImageGateDialog$lambda$4(je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            bz.OutlinedButton(je1Var, null, false, null, null, null, null, null, null, si0.c, kk0Var, 805306368, 510);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ImageGateDialog$lambda$5(boolean z, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            String strStringResource = ko3.stringResource(z ? R.string.image_gate_paid_title : R.string.image_gate_title, kk0Var, 0);
            uz3 uz3Var = ab2.a.getTypography(kk0Var, 0).g;
            ic1 ic1Var = ic1.d;
            uy3.m1842xe1e389ce(strStringResource, (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var, (ck0) kk0Var, 196608, 0, 65502);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ImageGateDialog$lambda$9(boolean z, boolean z2, je1 je1Var, Map map, String str, ck0 ck0Var, int i) {
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
            String strStringResource = ko3.stringResource(z ? R.string.image_gate_paid_body : R.string.image_gate_body, kk0Var, 0);
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(strStringResource, (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).k, (ck0) kk0Var, 0, 0, 65530);
            if (z2) {
                kk0Var.a0(-1990714392);
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
                kk0Var.a0(-2125569750);
                int i2 = 0;
                for (Object obj : kr1.U("free", "plus", "pro")) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kr1.m0();
                        throw null;
                    }
                    String str2 = (String) obj;
                    String strStringResource2 = ko3.stringResource(kr1.n(str2, "free") ? R.string.voice_gate_free : kr1.n(str2, "plus") ? R.string.voice_gate_plus : R.string.voice_gate_pro, kk0Var, 0);
                    if (kr1.n(str2, "pro")) {
                        kk0Var.a0(834557048);
                        String strStringResource3 = ko3.stringResource(R.string.voice_gate_unlimited, kk0Var, 0);
                        kk0Var.r(false);
                        strValueOf = strStringResource3;
                    } else {
                        kk0Var.a0(834560309);
                        kk0Var.r(false);
                        strValueOf = String.valueOf(map.get(str2));
                    }
                    pe4.QuotaRow(strStringResource2, strValueOf, kr1.n(str2, str), kr1.n(str2, "pro"), i2 == 2, kk0Var, 0);
                    i2 = i3;
                }
                kk0Var.r(false);
                kk0Var.r(true);
            } else {
                kk0Var.a0(-1994176658);
            }
            kk0Var.r(false);
            if (je1Var != null) {
                kk0Var.a0(-1988882881);
                cm3.Spacer(d.d(c.i, 14.0f), kk0Var, 6);
                pe4.WebSubHint(je1Var, kk0Var, 0);
            } else {
                kk0Var.a0(-1994176658);
            }
            kk0Var.r(false);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }
}
