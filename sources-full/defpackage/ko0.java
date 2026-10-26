package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class ko0 {
    public static final ux2 a = new ux2(14);
    public static final wn0 b;

    static {
        long j = re0.e;
        long j2 = re0.b;
        b = new wn0(j, j2, j2, re0.b(0.38f, j2), re0.b(0.38f, j2));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0126  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void ContextMenuColumn(wn0 wn0Var, c cVar, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        boolean z;
        w33 w33VarV;
        c cVar3;
        y73 y73VarA;
        boolean z2;
        long j;
        c cVarThen;
        int i5;
        vb2 vb2VarColumnMeasurePolicy;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-921259293);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(wn0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i4 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i4 = Uuid.SIZE_BITS;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i6 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                xt xtVar = do0.a;
                y73VarA = z73.a(4.0f);
                if (Float.compare(3.0f, 0.0f) > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                j = ig1.a;
                if (Float.compare(3.0f, 0.0f) <= 0 || z2) {
                    cVarThen = cVar3.then(new ShadowGraphicsLayerElement(y73VarA, z2, j, j));
                } else {
                    cVarThen = cVar3;
                }
                c cVarA = mb3.a(a.m(a.p(androidx.compose.foundation.a.b(cVarThen, wn0Var.a, k43.a)), 0.0f, do0.d, 1), mb3.rememberScrollState(0, kk0Var, 0, 1), true);
                i5 = (i3 << 3) & 7168;
                vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarA);
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
                oe1Var.invoke(mf0.a, kk0Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
                kk0Var.r(true);
                cVar2 = cVar3;
            } else {
                kk0Var.V();
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ra(i, i2, 2, oe1Var, wn0Var, cVar2));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (kk0Var.j(oe1Var)) {
                i4 = FontInfo.NUMBER_OF_CHAR_CODES;
            } else {
                i4 = Uuid.SIZE_BITS;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i6 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            xt xtVar2 = do0.a;
            y73VarA = z73.a(4.0f);
            if (Float.compare(3.0f, 0.0f) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            j = ig1.a;
            if (Float.compare(3.0f, 0.0f) <= 0) {
                cVarThen = cVar3.then(new ShadowGraphicsLayerElement(y73VarA, z2, j, j));
            } else {
                cVarThen = cVar3.then(new ShadowGraphicsLayerElement(y73VarA, z2, j, j));
            }
            c cVarA2 = mb3.a(a.m(a.p(androidx.compose.foundation.a.b(cVarThen, wn0Var.a, k43.a)), 0.0f, do0.d, 1), mb3.rememberScrollState(0, kk0Var, 0, 1), true);
            i5 = (i3 << 3) & 7168;
            vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarA2);
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
            oe1Var.invoke(mf0.a, kk0Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            kk0Var.r(true);
            cVar2 = cVar3;
        } else {
            kk0Var.V();
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ra(i, i2, 2, oe1Var, wn0Var, cVar2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015e  */
    /* JADX WARN: Code duplicated, block: B:103:0x016a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0176  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:124:0x023b  */
    /* JADX WARN: Code duplicated, block: B:126:0x023f  */
    /* JADX WARN: Code duplicated, block: B:129:0x024a  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0141  */
    /* JADX WARN: Code duplicated, block: B:95:0x0145  */
    /* JADX WARN: Code duplicated, block: B:98:0x0150  */
    public static final void ContextMenuItem(String str, boolean z, wn0 wn0Var, c cVar, oe1 oe1Var, je1 je1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        oe1 oe1Var2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        c cVar3;
        oe1 oe1Var3;
        w33 w33VarV;
        c cVar4;
        oe1 oe1Var4;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objP;
        vb2 vb2VarRowMeasurePolicy;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        int currentCompositeKeyHash2;
        d4 constructor2;
        pe peVarH2;
        long j;
        boolean z6;
        long j2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(791018367);
        xk xkVar = kk0Var.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.i(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.h(wn0Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i5 = 16384;
                    } else {
                        i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i5;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var.j(je1Var)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((74899 & i3) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kk0Var.S(i7 & 1, z2)) {
                    if (i8 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        oe1Var4 = null;
                    } else {
                        oe1Var4 = oe1Var2;
                    }
                    xt xtVar = do0.a;
                    float f = do0.c;
                    fl flVar = new fl(f);
                    if ((i7 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i7 & 458752) == 131072) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z4 | z3;
                    objP = kk0Var.P();
                    if (z5 || objP == Composer$Companion.getEmpty()) {
                        objP = new ar(2, je1Var, z);
                        kk0Var.l0(objP);
                    }
                    c cVarM = a.m(d.l(androidx.compose.foundation.a.e(cVar4, z, str, (je1) objP, 4).then(d.a), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
                    vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(flVar, xtVar, kk0Var, 54);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarM);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (xkVar != null) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
                    if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    if (oe1Var4 == null) {
                        kk0Var.a0(554788141);
                        z6 = false;
                    } else {
                        kk0Var.a0(554788142);
                        Modifier$Companion modifier$Companion = c.i;
                        float f2 = do0.e;
                        c cVarI = d.i(modifier$Companion, f2, 0.0f, f2, f2, 2);
                        vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
                        currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2 su2VarN2 = kk0Var.n();
                        c cVarD2 = b.d(kk0Var, cVarI);
                        constructor2 = ComposeUiNode$Companion.getConstructor();
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor2);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH2 = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN2);
                        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                            fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                        }
                        xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                        if (z) {
                            j = wn0Var.c;
                        } else {
                            j = wn0Var.e;
                        }
                        z6 = false;
                        oe1Var4.invoke(new re0(j), kk0Var, 0);
                        kk0Var.r(true);
                    }
                    kk0Var.r(z6);
                    if (z) {
                        j2 = wn0Var.b;
                    } else {
                        j2 = wn0Var.d;
                    }
                    long j3 = j2;
                    uz3 uz3Var = new uz3(j3, do0.f, do0.g, do0.i, do0.b, 0, do0.h, 16613240);
                    Modifier$Companion modifier$Companion2 = c.i;
                    c cVar5 = cVar4;
                    gt.m200x4738c6f7(str, (c) new LayoutWeightElement(1.0f, true), uz3Var, (le1) null, 0, false, 1, 0, (xe0) null, (rt3) null, (ck0) kk0Var, (i7 & 14) | 1572864, 952);
                    kk0Var.r(true);
                    oe1Var3 = oe1Var4;
                    cVar3 = cVar5;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    oe1Var3 = oe1Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(str, z, wn0Var, cVar3, oe1Var3, je1Var, i, i2));
                }
            }
            i3 |= 24576;
            oe1Var2 = oe1Var;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var.j(je1Var)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((74899 & i3) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (kk0Var.S(i7 & 1, z2)) {
                if (i8 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    oe1Var4 = null;
                } else {
                    oe1Var4 = oe1Var2;
                }
                xt xtVar2 = do0.a;
                float f3 = do0.c;
                fl flVar2 = new fl(f3);
                if ((i7 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i7 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z4 | z3;
                objP = kk0Var.P();
                if (z5) {
                    objP = new ar(2, je1Var, z);
                    kk0Var.l0(objP);
                } else {
                    objP = new ar(2, je1Var, z);
                    kk0Var.l0(objP);
                }
                c cVarM2 = a.m(d.l(androidx.compose.foundation.a.e(cVar4, z, str, (je1) objP, 4).then(d.a), 112.0f, 48.0f, 280.0f, 48.0f), f3, 0.0f, 2);
                vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(flVar2, xtVar2, kk0Var, 54);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarM2);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                if (oe1Var4 == null) {
                    kk0Var.a0(554788141);
                    z6 = false;
                } else {
                    kk0Var.a0(554788142);
                    Modifier$Companion modifier$Companion3 = c.i;
                    float f4 = do0.e;
                    c cVarI2 = d.i(modifier$Companion3, f4, 0.0f, f4, f4, 2);
                    vb2 vb2VarC2 = vw.c(Alignment$Companion.getTopStart(), false);
                    currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2 su2VarN3 = kk0Var.n();
                    c cVarD3 = b.d(kk0Var, cVarI2);
                    constructor2 = ComposeUiNode$Companion.getConstructor();
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor2);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH2 = fq2.h(kk0Var, vb2VarC2, kk0Var, su2VarN3);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                    } else {
                        fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                    }
                    xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
                    if (z) {
                        j = wn0Var.c;
                    } else {
                        j = wn0Var.e;
                    }
                    z6 = false;
                    oe1Var4.invoke(new re0(j), kk0Var, 0);
                    kk0Var.r(true);
                }
                kk0Var.r(z6);
                if (z) {
                    j2 = wn0Var.b;
                } else {
                    j2 = wn0Var.d;
                }
                long j4 = j2;
                uz3 uz3Var2 = new uz3(j4, do0.f, do0.g, do0.i, do0.b, 0, do0.h, 16613240);
                Modifier$Companion modifier$Companion4 = c.i;
                c cVar6 = cVar4;
                gt.m200x4738c6f7(str, (c) new LayoutWeightElement(1.0f, true), uz3Var2, (le1) null, 0, false, 1, 0, (xe0) null, (rt3) null, (ck0) kk0Var, (i7 & 14) | 1572864, 952);
                kk0Var.r(true);
                oe1Var3 = oe1Var4;
                cVar3 = cVar6;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                oe1Var3 = oe1Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(str, z, wn0Var, cVar3, oe1Var3, je1Var, i, i2));
            }
        }
        i3 |= 3072;
        cVar2 = cVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                oe1Var2 = oe1Var;
                if (kk0Var.j(oe1Var2)) {
                    i5 = 16384;
                } else {
                    i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i5;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var.j(je1Var)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((74899 & i3) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (kk0Var.S(i7 & 1, z2)) {
                if (i8 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    oe1Var4 = null;
                } else {
                    oe1Var4 = oe1Var2;
                }
                xt xtVar3 = do0.a;
                float f5 = do0.c;
                fl flVar3 = new fl(f5);
                if ((i7 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i7 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z4 | z3;
                objP = kk0Var.P();
                if (z5) {
                    objP = new ar(2, je1Var, z);
                    kk0Var.l0(objP);
                } else {
                    objP = new ar(2, je1Var, z);
                    kk0Var.l0(objP);
                }
                c cVarM3 = a.m(d.l(androidx.compose.foundation.a.e(cVar4, z, str, (je1) objP, 4).then(d.a), 112.0f, 48.0f, 280.0f, 48.0f), f5, 0.0f, 2);
                vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(flVar3, xtVar3, kk0Var, 54);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarM3);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (xkVar != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                if (oe1Var4 == null) {
                    kk0Var.a0(554788141);
                    z6 = false;
                } else {
                    kk0Var.a0(554788142);
                    Modifier$Companion modifier$Companion5 = c.i;
                    float f6 = do0.e;
                    c cVarI3 = d.i(modifier$Companion5, f6, 0.0f, f6, f6, 2);
                    vb2 vb2VarC3 = vw.c(Alignment$Companion.getTopStart(), false);
                    currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2 su2VarN4 = kk0Var.n();
                    c cVarD4 = b.d(kk0Var, cVarI3);
                    constructor2 = ComposeUiNode$Companion.getConstructor();
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor2);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH2 = fq2.h(kk0Var, vb2VarC3, kk0Var, su2VarN4);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                    } else {
                        fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                    }
                    xp1.E(kk0Var, cVarD4, ComposeUiNode$Companion.getSetModifier());
                    if (z) {
                        j = wn0Var.c;
                    } else {
                        j = wn0Var.e;
                    }
                    z6 = false;
                    oe1Var4.invoke(new re0(j), kk0Var, 0);
                    kk0Var.r(true);
                }
                kk0Var.r(z6);
                if (z) {
                    j2 = wn0Var.b;
                } else {
                    j2 = wn0Var.d;
                }
                long j5 = j2;
                uz3 uz3Var3 = new uz3(j5, do0.f, do0.g, do0.i, do0.b, 0, do0.h, 16613240);
                Modifier$Companion modifier$Companion6 = c.i;
                c cVar7 = cVar4;
                gt.m200x4738c6f7(str, (c) new LayoutWeightElement(1.0f, true), uz3Var3, (le1) null, 0, false, 1, 0, (xe0) null, (rt3) null, (ck0) kk0Var, (i7 & 14) | 1572864, 952);
                kk0Var.r(true);
                oe1Var3 = oe1Var4;
                cVar3 = cVar7;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                oe1Var3 = oe1Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(str, z, wn0Var, cVar3, oe1Var3, je1Var, i, i2));
            }
        }
        i3 |= 24576;
        oe1Var2 = oe1Var;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (kk0Var.j(je1Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        i7 = i3;
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kk0Var.S(i7 & 1, z2)) {
            if (i8 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            if (i4 != 0) {
                oe1Var4 = null;
            } else {
                oe1Var4 = oe1Var2;
            }
            xt xtVar4 = do0.a;
            float f7 = do0.c;
            fl flVar4 = new fl(f7);
            if ((i7 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i7 & 458752) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z4 | z3;
            objP = kk0Var.P();
            if (z5) {
                objP = new ar(2, je1Var, z);
                kk0Var.l0(objP);
            } else {
                objP = new ar(2, je1Var, z);
                kk0Var.l0(objP);
            }
            c cVarM4 = a.m(d.l(androidx.compose.foundation.a.e(cVar4, z, str, (je1) objP, 4).then(d.a), 112.0f, 48.0f, 280.0f, 48.0f), f7, 0.0f, 2);
            vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(flVar4, xtVar4, kk0Var, 54);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarM4);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar != null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            if (oe1Var4 == null) {
                kk0Var.a0(554788141);
                z6 = false;
            } else {
                kk0Var.a0(554788142);
                Modifier$Companion modifier$Companion7 = c.i;
                float f8 = do0.e;
                c cVarI4 = d.i(modifier$Companion7, f8, 0.0f, f8, f8, 2);
                vb2 vb2VarC4 = vw.c(Alignment$Companion.getTopStart(), false);
                currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN5 = kk0Var.n();
                c cVarD5 = b.d(kk0Var, cVarI4);
                constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                peVarH2 = fq2.h(kk0Var, vb2VarC4, kk0Var, su2VarN5);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                } else {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD5, ComposeUiNode$Companion.getSetModifier());
                if (z) {
                    j = wn0Var.c;
                } else {
                    j = wn0Var.e;
                }
                z6 = false;
                oe1Var4.invoke(new re0(j), kk0Var, 0);
                kk0Var.r(true);
            }
            kk0Var.r(z6);
            if (z) {
                j2 = wn0Var.b;
            } else {
                j2 = wn0Var.d;
            }
            long j6 = j2;
            uz3 uz3Var4 = new uz3(j6, do0.f, do0.g, do0.i, do0.b, 0, do0.h, 16613240);
            Modifier$Companion modifier$Companion8 = c.i;
            c cVar8 = cVar4;
            gt.m200x4738c6f7(str, (c) new LayoutWeightElement(1.0f, true), uz3Var4, (le1) null, 0, false, 1, 0, (xe0) null, (rt3) null, (ck0) kk0Var, (i7 & 14) | 1572864, 952);
            kk0Var.r(true);
            oe1Var3 = oe1Var4;
            cVar3 = cVar8;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
            oe1Var3 = oe1Var2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new jf(str, z, wn0Var, cVar3, oe1Var3, je1Var, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void ContextMenuPopup(tx2 tx2Var, je1 je1Var, c cVar, le1 le1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        le1 le1Var2;
        int i4;
        boolean z;
        c cVar3;
        w33 w33VarV;
        c cVar4;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(712057293);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(tx2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
                le1Var2 = le1Var;
            } else {
                le1Var2 = le1Var;
                if ((i & 3072) == 0) {
                    if (kk0Var.j(le1Var2)) {
                        i4 = 2048;
                    } else {
                        i4 = 1024;
                    }
                    i3 |= i4;
                }
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i5 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                ContextMenuPopup(tx2Var, je1Var, cVar4, computeContextMenuColors(0, 0, kk0Var, 0, 3), le1Var2, kk0Var, (i3 & 1022) | ((i3 << 3) & 57344), 0);
                cVar3 = cVar4;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new uc(tx2Var, je1Var, cVar3, le1Var, i, i2, 1));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            le1Var2 = le1Var;
        } else {
            le1Var2 = le1Var;
            if ((i & 3072) == 0) {
                if (kk0Var.j(le1Var2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i5 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            ContextMenuPopup(tx2Var, je1Var, cVar4, computeContextMenuColors(0, 0, kk0Var, 0, 3), le1Var2, kk0Var, (i3 & 1022) | ((i3 << 3) & 57344), 0);
            cVar3 = cVar4;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new uc(tx2Var, je1Var, cVar3, le1Var, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0090  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void ContextMenuPopup(tx2 tx2Var, je1 je1Var, c cVar, wn0 wn0Var, le1 le1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        int i5;
        boolean z;
        c cVar3;
        w33 w33VarV;
        c cVar4;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1447189339);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(tx2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (kk0Var.h(wn0Var)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (kk0Var.j(le1Var)) {
                    i5 = 16384;
                } else {
                    i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i6 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                yc.Popup(tx2Var, je1Var, a, zg0.rememberComposableLambda(795909757, true, new jo0(wn0Var, cVar4, le1Var), kk0Var, 54), kk0Var, (i3 & 14) | 3456 | (i3 & 112), 0);
                cVar3 = cVar4;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new qe(tx2Var, je1Var, cVar3, wn0Var, le1Var, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (kk0Var.h(wn0Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (kk0Var.j(le1Var)) {
                i5 = 16384;
            } else {
                i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i3 |= i5;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i6 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            yc.Popup(tx2Var, je1Var, a, zg0.rememberComposableLambda(795909757, true, new jo0(wn0Var, cVar4, le1Var), kk0Var, 54), kk0Var, (i3 & 14) | 3456 | (i3 & 112), 0);
            cVar3 = cVar4;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new qe(tx2Var, je1Var, cVar3, wn0Var, le1Var, i, i2));
        }
    }

    public static final wn0 computeContextMenuColors(int i, int i2, ck0 ck0Var, int i3, int i4) {
        int i5 = (i4 & 1) != 0 ? R.style.Widget.PopupMenu : i;
        int i6 = (i4 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i2;
        kk0 kk0Var = (kk0) ck0Var;
        Context context = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zH = kk0Var.h((Configuration) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())) | kk0Var.h(context);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            wn0 wn0Var = b;
            long jB = wn0Var.a;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i5, new int[]{R.attr.colorBackground});
            int iX = gb2.X(jB);
            int color = typedArrayObtainStyledAttributes.getColor(0, iX);
            typedArrayObtainStyledAttributes.recycle();
            if (color != iX) {
                jB = gb2.b(color);
            }
            long j = jB;
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i6, new int[]{R.attr.textColorPrimary});
            ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
            typedArrayObtainStyledAttributes2.recycle();
            long jB2 = wn0Var.b;
            int iX2 = gb2.X(jB2);
            Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iX2)) : null;
            if (numValueOf != null && numValueOf.intValue() != iX2) {
                jB2 = gb2.b(numValueOf.intValue());
            }
            long j2 = jB2;
            long jB3 = wn0Var.d;
            int iX3 = gb2.X(jB3);
            Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iX3)) : null;
            if (numValueOf2 != null && numValueOf2.intValue() != iX3) {
                jB3 = gb2.b(numValueOf2.intValue());
            }
            long j3 = jB3;
            wn0 wn0Var2 = new wn0(j, j2, j2, j3, j3);
            kk0Var.l0(wn0Var2);
            objP = wn0Var2;
        }
        return (wn0) objP;
    }
}
