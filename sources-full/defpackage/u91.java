package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class u91 {
    public static final rq0 a = new rq0(Alignment$Companion.getTop());
    public static final qq0 b = new qq0(Alignment$Companion.getStart());

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x013c  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x014a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x015d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0163  */
    /* JADX WARN: Code duplicated, block: B:127:0x0186  */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:131:0x0191  */
    /* JADX WARN: Code duplicated, block: B:132:0x0193  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x019f  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01de  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:151:0x0208  */
    /* JADX WARN: Code duplicated, block: B:153:0x020f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0213  */
    /* JADX WARN: Code duplicated, block: B:157:0x021e  */
    /* JADX WARN: Code duplicated, block: B:159:0x022c  */
    /* JADX WARN: Code duplicated, block: B:161:0x024d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0252  */
    /* JADX WARN: Code duplicated, block: B:166:0x0264  */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    @cv0
    public static final void FlowColumn(c cVar, gl glVar, el elVar, y7 y7Var, int i, int i2, m81 m81Var, oe1 oe1Var, ck0 ck0Var, int i3, int i4) {
        c cVar2;
        int i5;
        gl glVar2;
        int i6;
        el elVar2;
        int i7;
        int i8;
        y7 y7Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z;
        gl glVar3;
        el elVar3;
        y7 y7Var3;
        int i19;
        int i20;
        m81 m81Var2;
        w33 w33VarV;
        c cVar3;
        gl glVar4;
        el elVar4;
        y7 start;
        int i21;
        c cVar4;
        int i22;
        m81 m81Var3;
        int i23;
        boolean z2;
        Object objP;
        y91 y91Var;
        lg2 lg2VarColumnMeasurementMultiContentHelper;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj;
        yg0 yg0VarA;
        boolean zH;
        Object objP2;
        vb2 vb2Var;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1385862766);
        int i24 = i4 & 1;
        if (i24 != 0) {
            i5 = i3 | 6;
            cVar2 = cVar;
        } else if ((i3 & 6) == 0) {
            cVar2 = cVar;
            i5 = (kk0Var.h(cVar2) ? 4 : 2) | i3;
        } else {
            cVar2 = cVar;
            i5 = i3;
        }
        int i25 = i4 & 2;
        if (i25 == 0) {
            if ((i3 & 48) == 0) {
                glVar2 = glVar;
                i5 |= kk0Var.h(glVar2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    elVar2 = elVar;
                    if (kk0Var.h(elVar2)) {
                        i7 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i7 = Uuid.SIZE_BITS;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        y7Var2 = y7Var;
                        if (kk0Var.h(y7Var2)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 24576) == 0) {
                            i11 = i;
                            if (kk0Var.f(i11)) {
                                i12 = 16384;
                            } else {
                                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                            }
                            i5 |= i12;
                        }
                        i13 = i4 & 32;
                        if (i13 != 0) {
                            i5 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            if (kk0Var.f(i2)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        i15 = i4 & 64;
                        if (i15 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            if (kk0Var.h(m81Var)) {
                                i16 = 1048576;
                            } else {
                                i16 = 524288;
                            }
                            i5 |= i16;
                        }
                        if ((i4 & Uuid.SIZE_BITS) != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            if (kk0Var.j(oe1Var)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i5 |= i17;
                        }
                        i18 = i5;
                        if ((i18 & 4793491) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i18 & 1, z)) {
                            if (i24 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i25 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i8 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var2;
                            }
                            i21 = IntCompanionObject.MAX_VALUE;
                            cVar4 = cVar3;
                            if (i10 != 0) {
                                i22 = Integer.MAX_VALUE;
                            } else {
                                i22 = i11;
                            }
                            if (i13 == 0) {
                                i21 = i2;
                            }
                            if (i15 != 0) {
                                m81Var3 = m81.f;
                            } else {
                                m81Var3 = m81Var;
                            }
                            i23 = i18 & 3670016;
                            if (i23 == 1048576) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2 || objP == Composer$Companion.getEmpty()) {
                                objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                                kk0Var.l0(objP);
                            }
                            y91Var = (y91) objP;
                            lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                            if (i23 == 1048576) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if ((i18 & 29360128) == 8388608) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            boolean z7 = z3 | z4;
                            if ((i18 & 458752) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = z7 | z5;
                            Object objP3 = kk0Var.P();
                            if (!z6 || objP3 == Composer$Companion.getEmpty()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new yg0(-763839774, new p91(oe1Var), true));
                                m81Var3.a(y91Var, arrayList);
                                kk0Var.l0(arrayList);
                                obj = arrayList;
                            } else {
                                obj = objP3;
                            }
                            yg0VarA = ix1.a((List) obj);
                            zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                            objP2 = kk0Var.P();
                            if (zH || objP2 == Composer$Companion.getEmpty()) {
                                objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                                kk0Var.l0(objP2);
                            }
                            vb2Var = (vb2) objP2;
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN = kk0Var.n();
                            cVarD = b.d(kk0Var, cVar4);
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
                            peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            }
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            yg0VarA.invoke(kk0Var, 0);
                            kk0Var.r(true);
                            i19 = i22;
                            m81Var2 = m81Var3;
                            elVar3 = elVar4;
                            i20 = i21;
                            cVar2 = cVar4;
                            y7Var3 = start;
                            glVar3 = glVar4;
                        } else {
                            kk0Var.V();
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            y7Var3 = y7Var2;
                            i19 = i11;
                            i20 = i2;
                            m81Var2 = m81Var;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 24576;
                    i11 = i;
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (kk0Var.f(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (kk0Var.h(m81Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i4 & Uuid.SIZE_BITS) != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i5 |= i17;
                    }
                    i18 = i5;
                    if ((i18 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i18 & 1, z)) {
                        if (i24 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i25 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i8 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        i21 = IntCompanionObject.MAX_VALUE;
                        cVar4 = cVar3;
                        if (i10 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i11;
                        }
                        if (i13 == 0) {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            m81Var3 = m81.f;
                        } else {
                            m81Var3 = m81Var;
                        }
                        i23 = i18 & 3670016;
                        if (i23 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                            kk0Var.l0(objP);
                        } else {
                            objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                            kk0Var.l0(objP);
                        }
                        y91Var = (y91) objP;
                        lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                        if (i23 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i18 & 29360128) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z8 = z3 | z4;
                        if ((i18 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z8 | z5;
                        Object objP4 = kk0Var.P();
                        if (z6) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new yg0(-763839774, new p91(oe1Var), true));
                            m81Var3.a(y91Var, arrayList2);
                            kk0Var.l0(arrayList2);
                            obj = arrayList2;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new yg0(-763839774, new p91(oe1Var), true));
                            m81Var3.a(y91Var, arrayList3);
                            kk0Var.l0(arrayList3);
                            obj = arrayList3;
                        }
                        yg0VarA = ix1.a((List) obj);
                        zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        }
                        vb2Var = (vb2) objP2;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVar4);
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
                        peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        yg0VarA.invoke(kk0Var, 0);
                        kk0Var.r(true);
                        i19 = i22;
                        m81Var2 = m81Var3;
                        elVar3 = elVar4;
                        i20 = i21;
                        cVar2 = cVar4;
                        y7Var3 = start;
                        glVar3 = glVar4;
                    } else {
                        kk0Var.V();
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        y7Var3 = y7Var2;
                        i19 = i11;
                        i20 = i2;
                        m81Var2 = m81Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                    }
                }
                i5 |= 3072;
                y7Var2 = y7Var;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (kk0Var.f(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (kk0Var.f(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (kk0Var.h(m81Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i4 & Uuid.SIZE_BITS) != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i5 |= i17;
                    }
                    i18 = i5;
                    if ((i18 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i18 & 1, z)) {
                        if (i24 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i25 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i8 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        i21 = IntCompanionObject.MAX_VALUE;
                        cVar4 = cVar3;
                        if (i10 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i11;
                        }
                        if (i13 == 0) {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            m81Var3 = m81.f;
                        } else {
                            m81Var3 = m81Var;
                        }
                        i23 = i18 & 3670016;
                        if (i23 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                            kk0Var.l0(objP);
                        } else {
                            objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                            kk0Var.l0(objP);
                        }
                        y91Var = (y91) objP;
                        lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                        if (i23 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i18 & 29360128) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z9 = z3 | z4;
                        if ((i18 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z9 | z5;
                        Object objP5 = kk0Var.P();
                        if (z6) {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(new yg0(-763839774, new p91(oe1Var), true));
                            m81Var3.a(y91Var, arrayList4);
                            kk0Var.l0(arrayList4);
                            obj = arrayList4;
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(new yg0(-763839774, new p91(oe1Var), true));
                            m81Var3.a(y91Var, arrayList5);
                            kk0Var.l0(arrayList5);
                            obj = arrayList5;
                        }
                        yg0VarA = ix1.a((List) obj);
                        zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        }
                        vb2Var = (vb2) objP2;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVar4);
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
                        peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        yg0VarA.invoke(kk0Var, 0);
                        kk0Var.r(true);
                        i19 = i22;
                        m81Var2 = m81Var3;
                        elVar3 = elVar4;
                        i20 = i21;
                        cVar2 = cVar4;
                        y7Var3 = start;
                        glVar3 = glVar4;
                    } else {
                        kk0Var.V();
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        y7Var3 = y7Var2;
                        i19 = i11;
                        i20 = i2;
                        m81Var2 = m81Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(m81Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i8 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        m81Var3 = m81.f;
                    } else {
                        m81Var3 = m81Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z10 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z10 | z5;
                    Object objP6 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList6);
                        kk0Var.l0(arrayList6);
                        obj = arrayList6;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList7);
                        kk0Var.l0(arrayList7);
                        obj = arrayList7;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    m81Var2 = m81Var3;
                    elVar3 = elVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    y7Var3 = start;
                    glVar3 = glVar4;
                } else {
                    kk0Var.V();
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    y7Var3 = y7Var2;
                    i19 = i11;
                    i20 = i2;
                    m81Var2 = m81Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 384;
            elVar2 = elVar;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    y7Var2 = y7Var;
                    if (kk0Var.h(y7Var2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (kk0Var.f(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (kk0Var.f(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (kk0Var.h(m81Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i4 & Uuid.SIZE_BITS) != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i5 |= i17;
                    }
                    i18 = i5;
                    if ((i18 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i18 & 1, z)) {
                        if (i24 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i25 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i8 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        i21 = IntCompanionObject.MAX_VALUE;
                        cVar4 = cVar3;
                        if (i10 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i11;
                        }
                        if (i13 == 0) {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            m81Var3 = m81.f;
                        } else {
                            m81Var3 = m81Var;
                        }
                        i23 = i18 & 3670016;
                        if (i23 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                            kk0Var.l0(objP);
                        } else {
                            objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                            kk0Var.l0(objP);
                        }
                        y91Var = (y91) objP;
                        lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                        if (i23 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i18 & 29360128) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z11 = z3 | z4;
                        if ((i18 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z11 | z5;
                        Object objP7 = kk0Var.P();
                        if (z6) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(new yg0(-763839774, new p91(oe1Var), true));
                            m81Var3.a(y91Var, arrayList8);
                            kk0Var.l0(arrayList8);
                            obj = arrayList8;
                        } else {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(new yg0(-763839774, new p91(oe1Var), true));
                            m81Var3.a(y91Var, arrayList9);
                            kk0Var.l0(arrayList9);
                            obj = arrayList9;
                        }
                        yg0VarA = ix1.a((List) obj);
                        zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        }
                        vb2Var = (vb2) objP2;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVar4);
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
                        peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        yg0VarA.invoke(kk0Var, 0);
                        kk0Var.r(true);
                        i19 = i22;
                        m81Var2 = m81Var3;
                        elVar3 = elVar4;
                        i20 = i21;
                        cVar2 = cVar4;
                        y7Var3 = start;
                        glVar3 = glVar4;
                    } else {
                        kk0Var.V();
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        y7Var3 = y7Var2;
                        i19 = i11;
                        i20 = i2;
                        m81Var2 = m81Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(m81Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i8 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        m81Var3 = m81.f;
                    } else {
                        m81Var3 = m81Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z12 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z12 | z5;
                    Object objP8 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList10 = new ArrayList();
                        arrayList10.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList10);
                        kk0Var.l0(arrayList10);
                        obj = arrayList10;
                    } else {
                        ArrayList arrayList11 = new ArrayList();
                        arrayList11.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList11);
                        kk0Var.l0(arrayList11);
                        obj = arrayList11;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    m81Var2 = m81Var3;
                    elVar3 = elVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    y7Var3 = start;
                    glVar3 = glVar4;
                } else {
                    kk0Var.V();
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    y7Var3 = y7Var2;
                    i19 = i11;
                    i20 = i2;
                    m81Var2 = m81Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 3072;
            y7Var2 = y7Var;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (kk0Var.f(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(m81Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i8 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        m81Var3 = m81.f;
                    } else {
                        m81Var3 = m81Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z13 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z13 | z5;
                    Object objP9 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList12 = new ArrayList();
                        arrayList12.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList12);
                        kk0Var.l0(arrayList12);
                        obj = arrayList12;
                    } else {
                        ArrayList arrayList13 = new ArrayList();
                        arrayList13.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList13);
                        kk0Var.l0(arrayList13);
                        obj = arrayList13;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    m81Var2 = m81Var3;
                    elVar3 = elVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    y7Var3 = start;
                    glVar3 = glVar4;
                } else {
                    kk0Var.V();
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    y7Var3 = y7Var2;
                    i19 = i11;
                    i20 = i2;
                    m81Var2 = m81Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (kk0Var.f(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (kk0Var.h(m81Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & Uuid.SIZE_BITS) != 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            i18 = i5;
            if ((i18 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i18 & 1, z)) {
                if (i24 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i25 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i8 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var2;
                }
                i21 = IntCompanionObject.MAX_VALUE;
                cVar4 = cVar3;
                if (i10 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i11;
                }
                if (i13 == 0) {
                    i21 = i2;
                }
                if (i15 != 0) {
                    m81Var3 = m81.f;
                } else {
                    m81Var3 = m81Var;
                }
                i23 = i18 & 3670016;
                if (i23 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = kk0Var.P();
                if (z2) {
                    objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                    kk0Var.l0(objP);
                } else {
                    objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                    kk0Var.l0(objP);
                }
                y91Var = (y91) objP;
                lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                if (i23 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i18 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z14 = z3 | z4;
                if ((i18 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z14 | z5;
                Object objP10 = kk0Var.P();
                if (z6) {
                    ArrayList arrayList14 = new ArrayList();
                    arrayList14.add(new yg0(-763839774, new p91(oe1Var), true));
                    m81Var3.a(y91Var, arrayList14);
                    kk0Var.l0(arrayList14);
                    obj = arrayList14;
                } else {
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(new yg0(-763839774, new p91(oe1Var), true));
                    m81Var3.a(y91Var, arrayList15);
                    kk0Var.l0(arrayList15);
                    obj = arrayList15;
                }
                yg0VarA = ix1.a((List) obj);
                zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                }
                vb2Var = (vb2) objP2;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVar4);
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
                peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                yg0VarA.invoke(kk0Var, 0);
                kk0Var.r(true);
                i19 = i22;
                m81Var2 = m81Var3;
                elVar3 = elVar4;
                i20 = i21;
                cVar2 = cVar4;
                y7Var3 = start;
                glVar3 = glVar4;
            } else {
                kk0Var.V();
                glVar3 = glVar2;
                elVar3 = elVar2;
                y7Var3 = y7Var2;
                i19 = i11;
                i20 = i2;
                m81Var2 = m81Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
            }
        }
        i5 |= 48;
        glVar2 = glVar;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                elVar2 = elVar;
                if (kk0Var.h(elVar2)) {
                    i7 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i7 = Uuid.SIZE_BITS;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    y7Var2 = y7Var;
                    if (kk0Var.h(y7Var2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (kk0Var.f(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (kk0Var.f(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (kk0Var.h(m81Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i4 & Uuid.SIZE_BITS) != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i5 |= i17;
                    }
                    i18 = i5;
                    if ((i18 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i18 & 1, z)) {
                        if (i24 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i25 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i8 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var2;
                        }
                        i21 = IntCompanionObject.MAX_VALUE;
                        cVar4 = cVar3;
                        if (i10 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i11;
                        }
                        if (i13 == 0) {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            m81Var3 = m81.f;
                        } else {
                            m81Var3 = m81Var;
                        }
                        i23 = i18 & 3670016;
                        if (i23 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                            kk0Var.l0(objP);
                        } else {
                            objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                            kk0Var.l0(objP);
                        }
                        y91Var = (y91) objP;
                        lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                        if (i23 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i18 & 29360128) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z15 = z3 | z4;
                        if ((i18 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z15 | z5;
                        Object objP11 = kk0Var.P();
                        if (z6) {
                            ArrayList arrayList16 = new ArrayList();
                            arrayList16.add(new yg0(-763839774, new p91(oe1Var), true));
                            m81Var3.a(y91Var, arrayList16);
                            kk0Var.l0(arrayList16);
                            obj = arrayList16;
                        } else {
                            ArrayList arrayList17 = new ArrayList();
                            arrayList17.add(new yg0(-763839774, new p91(oe1Var), true));
                            m81Var3.a(y91Var, arrayList17);
                            kk0Var.l0(arrayList17);
                            obj = arrayList17;
                        }
                        yg0VarA = ix1.a((List) obj);
                        zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        }
                        vb2Var = (vb2) objP2;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVar4);
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
                        peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        yg0VarA.invoke(kk0Var, 0);
                        kk0Var.r(true);
                        i19 = i22;
                        m81Var2 = m81Var3;
                        elVar3 = elVar4;
                        i20 = i21;
                        cVar2 = cVar4;
                        y7Var3 = start;
                        glVar3 = glVar4;
                    } else {
                        kk0Var.V();
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        y7Var3 = y7Var2;
                        i19 = i11;
                        i20 = i2;
                        m81Var2 = m81Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(m81Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i8 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        m81Var3 = m81.f;
                    } else {
                        m81Var3 = m81Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z16 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z16 | z5;
                    Object objP12 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList18 = new ArrayList();
                        arrayList18.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList18);
                        kk0Var.l0(arrayList18);
                        obj = arrayList18;
                    } else {
                        ArrayList arrayList19 = new ArrayList();
                        arrayList19.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList19);
                        kk0Var.l0(arrayList19);
                        obj = arrayList19;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    m81Var2 = m81Var3;
                    elVar3 = elVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    y7Var3 = start;
                    glVar3 = glVar4;
                } else {
                    kk0Var.V();
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    y7Var3 = y7Var2;
                    i19 = i11;
                    i20 = i2;
                    m81Var2 = m81Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 3072;
            y7Var2 = y7Var;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (kk0Var.f(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(m81Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i8 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        m81Var3 = m81.f;
                    } else {
                        m81Var3 = m81Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z17 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z17 | z5;
                    Object objP13 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList110 = new ArrayList();
                        arrayList110.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList110);
                        kk0Var.l0(arrayList110);
                        obj = arrayList110;
                    } else {
                        ArrayList arrayList111 = new ArrayList();
                        arrayList111.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList111);
                        kk0Var.l0(arrayList111);
                        obj = arrayList111;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    m81Var2 = m81Var3;
                    elVar3 = elVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    y7Var3 = start;
                    glVar3 = glVar4;
                } else {
                    kk0Var.V();
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    y7Var3 = y7Var2;
                    i19 = i11;
                    i20 = i2;
                    m81Var2 = m81Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (kk0Var.f(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (kk0Var.h(m81Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & Uuid.SIZE_BITS) != 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            i18 = i5;
            if ((i18 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i18 & 1, z)) {
                if (i24 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i25 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i8 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var2;
                }
                i21 = IntCompanionObject.MAX_VALUE;
                cVar4 = cVar3;
                if (i10 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i11;
                }
                if (i13 == 0) {
                    i21 = i2;
                }
                if (i15 != 0) {
                    m81Var3 = m81.f;
                } else {
                    m81Var3 = m81Var;
                }
                i23 = i18 & 3670016;
                if (i23 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = kk0Var.P();
                if (z2) {
                    objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                    kk0Var.l0(objP);
                } else {
                    objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                    kk0Var.l0(objP);
                }
                y91Var = (y91) objP;
                lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                if (i23 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i18 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z18 = z3 | z4;
                if ((i18 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z18 | z5;
                Object objP14 = kk0Var.P();
                if (z6) {
                    ArrayList arrayList112 = new ArrayList();
                    arrayList112.add(new yg0(-763839774, new p91(oe1Var), true));
                    m81Var3.a(y91Var, arrayList112);
                    kk0Var.l0(arrayList112);
                    obj = arrayList112;
                } else {
                    ArrayList arrayList113 = new ArrayList();
                    arrayList113.add(new yg0(-763839774, new p91(oe1Var), true));
                    m81Var3.a(y91Var, arrayList113);
                    kk0Var.l0(arrayList113);
                    obj = arrayList113;
                }
                yg0VarA = ix1.a((List) obj);
                zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                }
                vb2Var = (vb2) objP2;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVar4);
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
                peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                yg0VarA.invoke(kk0Var, 0);
                kk0Var.r(true);
                i19 = i22;
                m81Var2 = m81Var3;
                elVar3 = elVar4;
                i20 = i21;
                cVar2 = cVar4;
                y7Var3 = start;
                glVar3 = glVar4;
            } else {
                kk0Var.V();
                glVar3 = glVar2;
                elVar3 = elVar2;
                y7Var3 = y7Var2;
                i19 = i11;
                i20 = i2;
                m81Var2 = m81Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
            }
        }
        i5 |= 384;
        elVar2 = elVar;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                y7Var2 = y7Var;
                if (kk0Var.h(y7Var2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (kk0Var.f(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(m81Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i8 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        m81Var3 = m81.f;
                    } else {
                        m81Var3 = m81Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z19 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z19 | z5;
                    Object objP15 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList114 = new ArrayList();
                        arrayList114.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList114);
                        kk0Var.l0(arrayList114);
                        obj = arrayList114;
                    } else {
                        ArrayList arrayList115 = new ArrayList();
                        arrayList115.add(new yg0(-763839774, new p91(oe1Var), true));
                        m81Var3.a(y91Var, arrayList115);
                        kk0Var.l0(arrayList115);
                        obj = arrayList115;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    m81Var2 = m81Var3;
                    elVar3 = elVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    y7Var3 = start;
                    glVar3 = glVar4;
                } else {
                    kk0Var.V();
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    y7Var3 = y7Var2;
                    i19 = i11;
                    i20 = i2;
                    m81Var2 = m81Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (kk0Var.f(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (kk0Var.h(m81Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & Uuid.SIZE_BITS) != 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            i18 = i5;
            if ((i18 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i18 & 1, z)) {
                if (i24 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i25 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i8 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var2;
                }
                i21 = IntCompanionObject.MAX_VALUE;
                cVar4 = cVar3;
                if (i10 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i11;
                }
                if (i13 == 0) {
                    i21 = i2;
                }
                if (i15 != 0) {
                    m81Var3 = m81.f;
                } else {
                    m81Var3 = m81Var;
                }
                i23 = i18 & 3670016;
                if (i23 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = kk0Var.P();
                if (z2) {
                    objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                    kk0Var.l0(objP);
                } else {
                    objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                    kk0Var.l0(objP);
                }
                y91Var = (y91) objP;
                lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                if (i23 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i18 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z110 = z3 | z4;
                if ((i18 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z110 | z5;
                Object objP16 = kk0Var.P();
                if (z6) {
                    ArrayList arrayList116 = new ArrayList();
                    arrayList116.add(new yg0(-763839774, new p91(oe1Var), true));
                    m81Var3.a(y91Var, arrayList116);
                    kk0Var.l0(arrayList116);
                    obj = arrayList116;
                } else {
                    ArrayList arrayList117 = new ArrayList();
                    arrayList117.add(new yg0(-763839774, new p91(oe1Var), true));
                    m81Var3.a(y91Var, arrayList117);
                    kk0Var.l0(arrayList117);
                    obj = arrayList117;
                }
                yg0VarA = ix1.a((List) obj);
                zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                }
                vb2Var = (vb2) objP2;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVar4);
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
                peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                yg0VarA.invoke(kk0Var, 0);
                kk0Var.r(true);
                i19 = i22;
                m81Var2 = m81Var3;
                elVar3 = elVar4;
                i20 = i21;
                cVar2 = cVar4;
                y7Var3 = start;
                glVar3 = glVar4;
            } else {
                kk0Var.V();
                glVar3 = glVar2;
                elVar3 = elVar2;
                y7Var3 = y7Var2;
                i19 = i11;
                i20 = i2;
                m81Var2 = m81Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
            }
        }
        i5 |= 3072;
        y7Var2 = y7Var;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                i11 = i;
                if (kk0Var.f(i11)) {
                    i12 = 16384;
                } else {
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i12;
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (kk0Var.f(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (kk0Var.h(m81Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & Uuid.SIZE_BITS) != 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            i18 = i5;
            if ((i18 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i18 & 1, z)) {
                if (i24 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i25 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i8 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var2;
                }
                i21 = IntCompanionObject.MAX_VALUE;
                cVar4 = cVar3;
                if (i10 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i11;
                }
                if (i13 == 0) {
                    i21 = i2;
                }
                if (i15 != 0) {
                    m81Var3 = m81.f;
                } else {
                    m81Var3 = m81Var;
                }
                i23 = i18 & 3670016;
                if (i23 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = kk0Var.P();
                if (z2) {
                    objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                    kk0Var.l0(objP);
                } else {
                    objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                    kk0Var.l0(objP);
                }
                y91Var = (y91) objP;
                lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                if (i23 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i18 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z111 = z3 | z4;
                if ((i18 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z111 | z5;
                Object objP17 = kk0Var.P();
                if (z6) {
                    ArrayList arrayList118 = new ArrayList();
                    arrayList118.add(new yg0(-763839774, new p91(oe1Var), true));
                    m81Var3.a(y91Var, arrayList118);
                    kk0Var.l0(arrayList118);
                    obj = arrayList118;
                } else {
                    ArrayList arrayList119 = new ArrayList();
                    arrayList119.add(new yg0(-763839774, new p91(oe1Var), true));
                    m81Var3.a(y91Var, arrayList119);
                    kk0Var.l0(arrayList119);
                    obj = arrayList119;
                }
                yg0VarA = ix1.a((List) obj);
                zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                }
                vb2Var = (vb2) objP2;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVar4);
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
                peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                yg0VarA.invoke(kk0Var, 0);
                kk0Var.r(true);
                i19 = i22;
                m81Var2 = m81Var3;
                elVar3 = elVar4;
                i20 = i21;
                cVar2 = cVar4;
                y7Var3 = start;
                glVar3 = glVar4;
            } else {
                kk0Var.V();
                glVar3 = glVar2;
                elVar3 = elVar2;
                y7Var3 = y7Var2;
                i19 = i11;
                i20 = i2;
                m81Var2 = m81Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
            }
        }
        i5 |= 24576;
        i11 = i;
        i13 = i4 & 32;
        if (i13 != 0) {
            i5 |= 196608;
        } else if ((i3 & 196608) == 0) {
            if (kk0Var.f(i2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i5 |= i14;
        }
        i15 = i4 & 64;
        if (i15 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            if (kk0Var.h(m81Var)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i5 |= i16;
        }
        if ((i4 & Uuid.SIZE_BITS) != 0) {
            i5 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            if (kk0Var.j(oe1Var)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i5 |= i17;
        }
        i18 = i5;
        if ((i18 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i18 & 1, z)) {
            if (i24 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            if (i25 != 0) {
                glVar4 = hl.c;
            } else {
                glVar4 = glVar2;
            }
            if (i6 != 0) {
                elVar4 = hl.a;
            } else {
                elVar4 = elVar2;
            }
            if (i8 != 0) {
                start = Alignment$Companion.getStart();
            } else {
                start = y7Var2;
            }
            i21 = IntCompanionObject.MAX_VALUE;
            cVar4 = cVar3;
            if (i10 != 0) {
                i22 = Integer.MAX_VALUE;
            } else {
                i22 = i11;
            }
            if (i13 == 0) {
                i21 = i2;
            }
            if (i15 != 0) {
                m81Var3 = m81.f;
            } else {
                m81Var3 = m81Var;
            }
            i23 = i18 & 3670016;
            if (i23 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP = kk0Var.P();
            if (z2) {
                objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                kk0Var.l0(objP);
            } else {
                objP = new y91(m81Var3.a, m81Var3.b, m81Var3.c);
                kk0Var.l0(objP);
            }
            y91Var = (y91) objP;
            lg2VarColumnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(glVar4, elVar4, start, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
            if (i23 == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i18 & 29360128) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z112 = z3 | z4;
            if ((i18 & 458752) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z112 | z5;
            Object objP18 = kk0Var.P();
            if (z6) {
                ArrayList arrayList1110 = new ArrayList();
                arrayList1110.add(new yg0(-763839774, new p91(oe1Var), true));
                m81Var3.a(y91Var, arrayList1110);
                kk0Var.l0(arrayList1110);
                obj = arrayList1110;
            } else {
                ArrayList arrayList1111 = new ArrayList();
                arrayList1111.add(new yg0(-763839774, new p91(oe1Var), true));
                m81Var3.a(y91Var, arrayList1111);
                kk0Var.l0(arrayList1111);
                obj = arrayList1111;
            }
            yg0VarA = ix1.a((List) obj);
            zH = kk0Var.h(lg2VarColumnMeasurementMultiContentHelper);
            objP2 = kk0Var.P();
            if (zH) {
                objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                kk0Var.l0(objP2);
            } else {
                objP2 = new mg2(lg2VarColumnMeasurementMultiContentHelper);
                kk0Var.l0(objP2);
            }
            vb2Var = (vb2) objP2;
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVar4);
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
            peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            yg0VarA.invoke(kk0Var, 0);
            kk0Var.r(true);
            i19 = i22;
            m81Var2 = m81Var3;
            elVar3 = elVar4;
            i20 = i21;
            cVar2 = cVar4;
            y7Var3 = start;
            glVar3 = glVar4;
        } else {
            kk0Var.V();
            glVar3 = glVar2;
            elVar3 = elVar2;
            y7Var3 = y7Var2;
            i19 = i11;
            i20 = i2;
            m81Var2 = m81Var;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new n91(cVar2, glVar3, elVar3, y7Var3, i19, i20, m81Var2, oe1Var, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:105:0x014d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    public static final void FlowColumn(c cVar, gl glVar, el elVar, y7 y7Var, int i, int i2, oe1 oe1Var, ck0 ck0Var, int i3, int i4) {
        int i5;
        gl glVar2;
        int i6;
        el elVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        kk0 kk0Var;
        c cVar2;
        y7 y7Var2;
        gl glVar3;
        el elVar3;
        int i16;
        int i17;
        w33 w33VarV;
        int i18;
        c cVar3;
        gl glVar4;
        int i19;
        el elVar4;
        y7 start;
        int i20;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-208106226);
        int i21 = i4 & 1;
        if (i21 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (kk0Var2.h(cVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i22 = i4 & 2;
        if (i22 == 0) {
            if ((i3 & 48) == 0) {
                glVar2 = glVar;
                i5 |= kk0Var2.h(glVar2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    elVar2 = elVar;
                    if (kk0Var2.h(elVar2)) {
                        i7 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i7 = Uuid.SIZE_BITS;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        if (kk0Var2.h(y7Var)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 24576) == 0) {
                            if (kk0Var2.f(i)) {
                                i11 = 16384;
                            } else {
                                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                            }
                            i5 |= i11;
                        }
                        i12 = i4 & 32;
                        if (i12 != 0) {
                            if ((196608 & i3) == 0) {
                                i13 = i2;
                                if (kk0Var2.f(i13)) {
                                    i14 = 131072;
                                } else {
                                    i14 = 65536;
                                }
                                i5 |= i14;
                            }
                            if ((i4 & 64) != 0) {
                                if ((i3 & 1572864) == 0) {
                                    if (kk0Var2.j(oe1Var)) {
                                        i15 = 1048576;
                                    } else {
                                        i15 = 524288;
                                    }
                                    i5 |= i15;
                                }
                                if ((i5 & 599187) != 599186) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (kk0Var2.S(i5 & 1, z)) {
                                    if (i21 != 0) {
                                        cVar3 = c.i;
                                        i18 = i8;
                                    } else {
                                        i18 = i8;
                                        cVar3 = cVar;
                                    }
                                    if (i22 != 0) {
                                        glVar4 = hl.c;
                                    } else {
                                        glVar4 = glVar2;
                                    }
                                    if (i6 != 0) {
                                        elVar4 = hl.a;
                                        i19 = i10;
                                    } else {
                                        i19 = i10;
                                        elVar4 = elVar2;
                                    }
                                    if (i18 != 0) {
                                        start = Alignment$Companion.getStart();
                                    } else {
                                        start = y7Var;
                                    }
                                    if (i19 != 0) {
                                        i20 = Integer.MAX_VALUE;
                                    } else {
                                        i20 = i;
                                    }
                                    if (i12 != 0) {
                                        i13 = Integer.MAX_VALUE;
                                    }
                                    kk0Var = kk0Var2;
                                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                    cVar2 = cVar3;
                                    glVar3 = glVar4;
                                    elVar3 = elVar4;
                                    y7Var2 = start;
                                    i16 = i20;
                                } else {
                                    kk0Var = kk0Var2;
                                    kk0Var.V();
                                    cVar2 = cVar;
                                    y7Var2 = y7Var;
                                    glVar3 = glVar2;
                                    elVar3 = elVar2;
                                    i16 = i;
                                }
                                i17 = i13;
                                w33VarV = kk0Var.v();
                                if (w33VarV != null) {
                                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                                }
                            }
                            i5 |= 1572864;
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = glVar2;
                                }
                                if (i6 != 0) {
                                    elVar4 = hl.a;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    elVar4 = elVar2;
                                }
                                if (i18 != 0) {
                                    start = Alignment$Companion.getStart();
                                } else {
                                    start = y7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                glVar3 = glVar4;
                                elVar3 = elVar4;
                                y7Var2 = start;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                y7Var2 = y7Var;
                                glVar3 = glVar2;
                                elVar3 = elVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 196608;
                        i13 = i2;
                        if ((i4 & 64) != 0) {
                            if ((i3 & 1572864) == 0) {
                                if (kk0Var2.j(oe1Var)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = glVar2;
                                }
                                if (i6 != 0) {
                                    elVar4 = hl.a;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    elVar4 = elVar2;
                                }
                                if (i18 != 0) {
                                    start = Alignment$Companion.getStart();
                                } else {
                                    start = y7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                glVar3 = glVar4;
                                elVar3 = elVar4;
                                y7Var2 = start;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                y7Var2 = y7Var;
                                glVar3 = glVar2;
                                elVar3 = elVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 1572864;
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 24576;
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        if ((196608 & i3) == 0) {
                            i13 = i2;
                            if (kk0Var2.f(i13)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        if ((i4 & 64) != 0) {
                            if ((i3 & 1572864) == 0) {
                                if (kk0Var2.j(oe1Var)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = glVar2;
                                }
                                if (i6 != 0) {
                                    elVar4 = hl.a;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    elVar4 = elVar2;
                                }
                                if (i18 != 0) {
                                    start = Alignment$Companion.getStart();
                                } else {
                                    start = y7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                glVar3 = glVar4;
                                elVar3 = elVar4;
                                y7Var2 = start;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                y7Var2 = y7Var;
                                glVar3 = glVar2;
                                elVar3 = elVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 1572864;
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 196608;
                    i13 = i2;
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 3072;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        if (kk0Var2.f(i)) {
                            i11 = 16384;
                        } else {
                            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        if ((196608 & i3) == 0) {
                            i13 = i2;
                            if (kk0Var2.f(i13)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        if ((i4 & 64) != 0) {
                            if ((i3 & 1572864) == 0) {
                                if (kk0Var2.j(oe1Var)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = glVar2;
                                }
                                if (i6 != 0) {
                                    elVar4 = hl.a;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    elVar4 = elVar2;
                                }
                                if (i18 != 0) {
                                    start = Alignment$Companion.getStart();
                                } else {
                                    start = y7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                glVar3 = glVar4;
                                elVar3 = elVar4;
                                y7Var2 = start;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                y7Var2 = y7Var;
                                glVar3 = glVar2;
                                elVar3 = elVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 1572864;
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 196608;
                    i13 = i2;
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 384;
            elVar2 = elVar;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    if (kk0Var2.h(y7Var)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        if (kk0Var2.f(i)) {
                            i11 = 16384;
                        } else {
                            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        if ((196608 & i3) == 0) {
                            i13 = i2;
                            if (kk0Var2.f(i13)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        if ((i4 & 64) != 0) {
                            if ((i3 & 1572864) == 0) {
                                if (kk0Var2.j(oe1Var)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = glVar2;
                                }
                                if (i6 != 0) {
                                    elVar4 = hl.a;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    elVar4 = elVar2;
                                }
                                if (i18 != 0) {
                                    start = Alignment$Companion.getStart();
                                } else {
                                    start = y7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                glVar3 = glVar4;
                                elVar3 = elVar4;
                                y7Var2 = start;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                y7Var2 = y7Var;
                                glVar3 = glVar2;
                                elVar3 = elVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 1572864;
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 196608;
                    i13 = i2;
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 3072;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    if (kk0Var2.f(i)) {
                        i11 = 16384;
                    } else {
                        i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i12 = i4 & 32;
            if (i12 != 0) {
                if ((196608 & i3) == 0) {
                    i13 = i2;
                    if (kk0Var2.f(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 196608;
            i13 = i2;
            if ((i4 & 64) != 0) {
                if ((i3 & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 1572864;
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    elVar4 = hl.a;
                    i19 = i10;
                } else {
                    i19 = i10;
                    elVar4 = elVar2;
                }
                if (i18 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                glVar3 = glVar4;
                elVar3 = elVar4;
                y7Var2 = start;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                y7Var2 = y7Var;
                glVar3 = glVar2;
                elVar3 = elVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 48;
        glVar2 = glVar;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                elVar2 = elVar;
                if (kk0Var2.h(elVar2)) {
                    i7 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i7 = Uuid.SIZE_BITS;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    if (kk0Var2.h(y7Var)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        if (kk0Var2.f(i)) {
                            i11 = 16384;
                        } else {
                            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        if ((196608 & i3) == 0) {
                            i13 = i2;
                            if (kk0Var2.f(i13)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        if ((i4 & 64) != 0) {
                            if ((i3 & 1572864) == 0) {
                                if (kk0Var2.j(oe1Var)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    glVar4 = hl.c;
                                } else {
                                    glVar4 = glVar2;
                                }
                                if (i6 != 0) {
                                    elVar4 = hl.a;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    elVar4 = elVar2;
                                }
                                if (i18 != 0) {
                                    start = Alignment$Companion.getStart();
                                } else {
                                    start = y7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                glVar3 = glVar4;
                                elVar3 = elVar4;
                                y7Var2 = start;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                y7Var2 = y7Var;
                                glVar3 = glVar2;
                                elVar3 = elVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 1572864;
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 196608;
                    i13 = i2;
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 3072;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    if (kk0Var2.f(i)) {
                        i11 = 16384;
                    } else {
                        i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i12 = i4 & 32;
            if (i12 != 0) {
                if ((196608 & i3) == 0) {
                    i13 = i2;
                    if (kk0Var2.f(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 196608;
            i13 = i2;
            if ((i4 & 64) != 0) {
                if ((i3 & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 1572864;
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    elVar4 = hl.a;
                    i19 = i10;
                } else {
                    i19 = i10;
                    elVar4 = elVar2;
                }
                if (i18 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                glVar3 = glVar4;
                elVar3 = elVar4;
                y7Var2 = start;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                y7Var2 = y7Var;
                glVar3 = glVar2;
                elVar3 = elVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 384;
        elVar2 = elVar;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                if (kk0Var2.h(y7Var)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    if (kk0Var2.f(i)) {
                        i11 = 16384;
                    } else {
                        i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i6 != 0) {
                                elVar4 = hl.a;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                elVar4 = elVar2;
                            }
                            if (i18 != 0) {
                                start = Alignment$Companion.getStart();
                            } else {
                                start = y7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            glVar3 = glVar4;
                            elVar3 = elVar4;
                            y7Var2 = start;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            y7Var2 = y7Var;
                            glVar3 = glVar2;
                            elVar3 = elVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i12 = i4 & 32;
            if (i12 != 0) {
                if ((196608 & i3) == 0) {
                    i13 = i2;
                    if (kk0Var2.f(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 196608;
            i13 = i2;
            if ((i4 & 64) != 0) {
                if ((i3 & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 1572864;
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    elVar4 = hl.a;
                    i19 = i10;
                } else {
                    i19 = i10;
                    elVar4 = elVar2;
                }
                if (i18 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                glVar3 = glVar4;
                elVar3 = elVar4;
                y7Var2 = start;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                y7Var2 = y7Var;
                glVar3 = glVar2;
                elVar3 = elVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 3072;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                if (kk0Var2.f(i)) {
                    i11 = 16384;
                } else {
                    i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i11;
            }
            i12 = i4 & 32;
            if (i12 != 0) {
                if ((196608 & i3) == 0) {
                    i13 = i2;
                    if (kk0Var2.f(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i6 != 0) {
                            elVar4 = hl.a;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            elVar4 = elVar2;
                        }
                        if (i18 != 0) {
                            start = Alignment$Companion.getStart();
                        } else {
                            start = y7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        glVar3 = glVar4;
                        elVar3 = elVar4;
                        y7Var2 = start;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        y7Var2 = y7Var;
                        glVar3 = glVar2;
                        elVar3 = elVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 196608;
            i13 = i2;
            if ((i4 & 64) != 0) {
                if ((i3 & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 1572864;
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    elVar4 = hl.a;
                    i19 = i10;
                } else {
                    i19 = i10;
                    elVar4 = elVar2;
                }
                if (i18 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                glVar3 = glVar4;
                elVar3 = elVar4;
                y7Var2 = start;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                y7Var2 = y7Var;
                glVar3 = glVar2;
                elVar3 = elVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 24576;
        i12 = i4 & 32;
        if (i12 != 0) {
            if ((196608 & i3) == 0) {
                i13 = i2;
                if (kk0Var2.f(i13)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            if ((i4 & 64) != 0) {
                if ((i3 & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i6 != 0) {
                        elVar4 = hl.a;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        elVar4 = elVar2;
                    }
                    if (i18 != 0) {
                        start = Alignment$Companion.getStart();
                    } else {
                        start = y7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    glVar3 = glVar4;
                    elVar3 = elVar4;
                    y7Var2 = start;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    y7Var2 = y7Var;
                    glVar3 = glVar2;
                    elVar3 = elVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 1572864;
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    elVar4 = hl.a;
                    i19 = i10;
                } else {
                    i19 = i10;
                    elVar4 = elVar2;
                }
                if (i18 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                glVar3 = glVar4;
                elVar3 = elVar4;
                y7Var2 = start;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                y7Var2 = y7Var;
                glVar3 = glVar2;
                elVar3 = elVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 196608;
        i13 = i2;
        if ((i4 & 64) != 0) {
            if ((i3 & 1572864) == 0) {
                if (kk0Var2.j(oe1Var)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i6 != 0) {
                    elVar4 = hl.a;
                    i19 = i10;
                } else {
                    i19 = i10;
                    elVar4 = elVar2;
                }
                if (i18 != 0) {
                    start = Alignment$Companion.getStart();
                } else {
                    start = y7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                glVar3 = glVar4;
                elVar3 = elVar4;
                y7Var2 = start;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                y7Var2 = y7Var;
                glVar3 = glVar2;
                elVar3 = elVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 1572864;
        if ((i5 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var2.S(i5 & 1, z)) {
            if (i21 != 0) {
                cVar3 = c.i;
                i18 = i8;
            } else {
                i18 = i8;
                cVar3 = cVar;
            }
            if (i22 != 0) {
                glVar4 = hl.c;
            } else {
                glVar4 = glVar2;
            }
            if (i6 != 0) {
                elVar4 = hl.a;
                i19 = i10;
            } else {
                i19 = i10;
                elVar4 = elVar2;
            }
            if (i18 != 0) {
                start = Alignment$Companion.getStart();
            } else {
                start = y7Var;
            }
            if (i19 != 0) {
                i20 = Integer.MAX_VALUE;
            } else {
                i20 = i;
            }
            if (i12 != 0) {
                i13 = Integer.MAX_VALUE;
            }
            kk0Var = kk0Var2;
            FlowColumn(cVar3, glVar4, elVar4, start, i20, i13, m81.f, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
            cVar2 = cVar3;
            glVar3 = glVar4;
            elVar3 = elVar4;
            y7Var2 = start;
            i16 = i20;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar2 = cVar;
            y7Var2 = y7Var;
            glVar3 = glVar2;
            elVar3 = elVar2;
            i16 = i;
        }
        i17 = i13;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new o91(cVar2, glVar3, elVar3, y7Var2, i16, i17, oe1Var, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x013c  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x014a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x015d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0163  */
    /* JADX WARN: Code duplicated, block: B:127:0x0186  */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:131:0x0191  */
    /* JADX WARN: Code duplicated, block: B:132:0x0193  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x019f  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01de  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:151:0x0208  */
    /* JADX WARN: Code duplicated, block: B:153:0x020f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0213  */
    /* JADX WARN: Code duplicated, block: B:157:0x021e  */
    /* JADX WARN: Code duplicated, block: B:159:0x022c  */
    /* JADX WARN: Code duplicated, block: B:161:0x024d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0252  */
    /* JADX WARN: Code duplicated, block: B:166:0x0264  */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    @cv0
    public static final void FlowRow(c cVar, el elVar, gl glVar, z7 z7Var, int i, int i2, ba1 ba1Var, oe1 oe1Var, ck0 ck0Var, int i3, int i4) {
        c cVar2;
        int i5;
        el elVar2;
        int i6;
        gl glVar2;
        int i7;
        int i8;
        z7 z7Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z;
        el elVar3;
        gl glVar3;
        z7 z7Var3;
        int i19;
        int i20;
        ba1 ba1Var2;
        w33 w33VarV;
        c cVar3;
        el elVar4;
        gl glVar4;
        z7 top;
        int i21;
        c cVar4;
        int i22;
        ba1 ba1Var3;
        int i23;
        boolean z2;
        Object objP;
        y91 y91Var;
        lg2 lg2VarRowMeasurementMultiContentHelper;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj;
        yg0 yg0VarA;
        boolean zH;
        Object objP2;
        vb2 vb2Var;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-218661582);
        int i24 = i4 & 1;
        if (i24 != 0) {
            i5 = i3 | 6;
            cVar2 = cVar;
        } else if ((i3 & 6) == 0) {
            cVar2 = cVar;
            i5 = (kk0Var.h(cVar2) ? 4 : 2) | i3;
        } else {
            cVar2 = cVar;
            i5 = i3;
        }
        int i25 = i4 & 2;
        if (i25 == 0) {
            if ((i3 & 48) == 0) {
                elVar2 = elVar;
                i5 |= kk0Var.h(elVar2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    glVar2 = glVar;
                    if (kk0Var.h(glVar2)) {
                        i7 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i7 = Uuid.SIZE_BITS;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        z7Var2 = z7Var;
                        if (kk0Var.h(z7Var2)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 24576) == 0) {
                            i11 = i;
                            if (kk0Var.f(i11)) {
                                i12 = 16384;
                            } else {
                                i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                            }
                            i5 |= i12;
                        }
                        i13 = i4 & 32;
                        if (i13 != 0) {
                            i5 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            if (kk0Var.f(i2)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        i15 = i4 & 64;
                        if (i15 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            if (kk0Var.h(ba1Var)) {
                                i16 = 1048576;
                            } else {
                                i16 = 524288;
                            }
                            i5 |= i16;
                        }
                        if ((i4 & Uuid.SIZE_BITS) != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            if (kk0Var.j(oe1Var)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i5 |= i17;
                        }
                        i18 = i5;
                        if ((i18 & 4793491) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i18 & 1, z)) {
                            if (i24 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i25 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                            } else {
                                glVar4 = glVar2;
                            }
                            if (i8 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var2;
                            }
                            i21 = IntCompanionObject.MAX_VALUE;
                            cVar4 = cVar3;
                            if (i10 != 0) {
                                i22 = Integer.MAX_VALUE;
                            } else {
                                i22 = i11;
                            }
                            if (i13 == 0) {
                                i21 = i2;
                            }
                            if (i15 != 0) {
                                ba1Var3 = ba1.g;
                            } else {
                                ba1Var3 = ba1Var;
                            }
                            i23 = i18 & 3670016;
                            if (i23 == 1048576) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2 || objP == Composer$Companion.getEmpty()) {
                                objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                                kk0Var.l0(objP);
                            }
                            y91Var = (y91) objP;
                            lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                            if (i23 == 1048576) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if ((i18 & 29360128) == 8388608) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            boolean z7 = z3 | z4;
                            if ((i18 & 458752) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = z7 | z5;
                            Object objP3 = kk0Var.P();
                            if (!z6 || objP3 == Composer$Companion.getEmpty()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new yg0(702094978, new q91(oe1Var), true));
                                ba1Var3.a(y91Var, arrayList);
                                kk0Var.l0(arrayList);
                                obj = arrayList;
                            } else {
                                obj = objP3;
                            }
                            yg0VarA = ix1.a((List) obj);
                            zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                            objP2 = kk0Var.P();
                            if (zH || objP2 == Composer$Companion.getEmpty()) {
                                objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                                kk0Var.l0(objP2);
                            }
                            vb2Var = (vb2) objP2;
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN = kk0Var.n();
                            cVarD = b.d(kk0Var, cVar4);
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
                            peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            }
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            yg0VarA.invoke(kk0Var, 0);
                            kk0Var.r(true);
                            i19 = i22;
                            ba1Var2 = ba1Var3;
                            glVar3 = glVar4;
                            i20 = i21;
                            cVar2 = cVar4;
                            z7Var3 = top;
                            elVar3 = elVar4;
                        } else {
                            kk0Var.V();
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            z7Var3 = z7Var2;
                            i19 = i11;
                            i20 = i2;
                            ba1Var2 = ba1Var;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 24576;
                    i11 = i;
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (kk0Var.f(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (kk0Var.h(ba1Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i4 & Uuid.SIZE_BITS) != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i5 |= i17;
                    }
                    i18 = i5;
                    if ((i18 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i18 & 1, z)) {
                        if (i24 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i25 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i8 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        i21 = IntCompanionObject.MAX_VALUE;
                        cVar4 = cVar3;
                        if (i10 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i11;
                        }
                        if (i13 == 0) {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            ba1Var3 = ba1.g;
                        } else {
                            ba1Var3 = ba1Var;
                        }
                        i23 = i18 & 3670016;
                        if (i23 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                            kk0Var.l0(objP);
                        } else {
                            objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                            kk0Var.l0(objP);
                        }
                        y91Var = (y91) objP;
                        lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                        if (i23 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i18 & 29360128) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z8 = z3 | z4;
                        if ((i18 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z8 | z5;
                        Object objP4 = kk0Var.P();
                        if (z6) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new yg0(702094978, new q91(oe1Var), true));
                            ba1Var3.a(y91Var, arrayList2);
                            kk0Var.l0(arrayList2);
                            obj = arrayList2;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new yg0(702094978, new q91(oe1Var), true));
                            ba1Var3.a(y91Var, arrayList3);
                            kk0Var.l0(arrayList3);
                            obj = arrayList3;
                        }
                        yg0VarA = ix1.a((List) obj);
                        zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        }
                        vb2Var = (vb2) objP2;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVar4);
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
                        peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        yg0VarA.invoke(kk0Var, 0);
                        kk0Var.r(true);
                        i19 = i22;
                        ba1Var2 = ba1Var3;
                        glVar3 = glVar4;
                        i20 = i21;
                        cVar2 = cVar4;
                        z7Var3 = top;
                        elVar3 = elVar4;
                    } else {
                        kk0Var.V();
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        z7Var3 = z7Var2;
                        i19 = i11;
                        i20 = i2;
                        ba1Var2 = ba1Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                    }
                }
                i5 |= 3072;
                z7Var2 = z7Var;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (kk0Var.f(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (kk0Var.f(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (kk0Var.h(ba1Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i4 & Uuid.SIZE_BITS) != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i5 |= i17;
                    }
                    i18 = i5;
                    if ((i18 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i18 & 1, z)) {
                        if (i24 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i25 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i8 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        i21 = IntCompanionObject.MAX_VALUE;
                        cVar4 = cVar3;
                        if (i10 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i11;
                        }
                        if (i13 == 0) {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            ba1Var3 = ba1.g;
                        } else {
                            ba1Var3 = ba1Var;
                        }
                        i23 = i18 & 3670016;
                        if (i23 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                            kk0Var.l0(objP);
                        } else {
                            objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                            kk0Var.l0(objP);
                        }
                        y91Var = (y91) objP;
                        lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                        if (i23 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i18 & 29360128) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z9 = z3 | z4;
                        if ((i18 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z9 | z5;
                        Object objP5 = kk0Var.P();
                        if (z6) {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(new yg0(702094978, new q91(oe1Var), true));
                            ba1Var3.a(y91Var, arrayList4);
                            kk0Var.l0(arrayList4);
                            obj = arrayList4;
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(new yg0(702094978, new q91(oe1Var), true));
                            ba1Var3.a(y91Var, arrayList5);
                            kk0Var.l0(arrayList5);
                            obj = arrayList5;
                        }
                        yg0VarA = ix1.a((List) obj);
                        zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        }
                        vb2Var = (vb2) objP2;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVar4);
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
                        peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        yg0VarA.invoke(kk0Var, 0);
                        kk0Var.r(true);
                        i19 = i22;
                        ba1Var2 = ba1Var3;
                        glVar3 = glVar4;
                        i20 = i21;
                        cVar2 = cVar4;
                        z7Var3 = top;
                        elVar3 = elVar4;
                    } else {
                        kk0Var.V();
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        z7Var3 = z7Var2;
                        i19 = i11;
                        i20 = i2;
                        ba1Var2 = ba1Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(ba1Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i8 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        ba1Var3 = ba1.g;
                    } else {
                        ba1Var3 = ba1Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z10 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z10 | z5;
                    Object objP6 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList6);
                        kk0Var.l0(arrayList6);
                        obj = arrayList6;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList7);
                        kk0Var.l0(arrayList7);
                        obj = arrayList7;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    ba1Var2 = ba1Var3;
                    glVar3 = glVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    z7Var3 = top;
                    elVar3 = elVar4;
                } else {
                    kk0Var.V();
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    z7Var3 = z7Var2;
                    i19 = i11;
                    i20 = i2;
                    ba1Var2 = ba1Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 384;
            glVar2 = glVar;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    z7Var2 = z7Var;
                    if (kk0Var.h(z7Var2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (kk0Var.f(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (kk0Var.f(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (kk0Var.h(ba1Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i4 & Uuid.SIZE_BITS) != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i5 |= i17;
                    }
                    i18 = i5;
                    if ((i18 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i18 & 1, z)) {
                        if (i24 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i25 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i8 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        i21 = IntCompanionObject.MAX_VALUE;
                        cVar4 = cVar3;
                        if (i10 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i11;
                        }
                        if (i13 == 0) {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            ba1Var3 = ba1.g;
                        } else {
                            ba1Var3 = ba1Var;
                        }
                        i23 = i18 & 3670016;
                        if (i23 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                            kk0Var.l0(objP);
                        } else {
                            objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                            kk0Var.l0(objP);
                        }
                        y91Var = (y91) objP;
                        lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                        if (i23 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i18 & 29360128) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z11 = z3 | z4;
                        if ((i18 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z11 | z5;
                        Object objP7 = kk0Var.P();
                        if (z6) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(new yg0(702094978, new q91(oe1Var), true));
                            ba1Var3.a(y91Var, arrayList8);
                            kk0Var.l0(arrayList8);
                            obj = arrayList8;
                        } else {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(new yg0(702094978, new q91(oe1Var), true));
                            ba1Var3.a(y91Var, arrayList9);
                            kk0Var.l0(arrayList9);
                            obj = arrayList9;
                        }
                        yg0VarA = ix1.a((List) obj);
                        zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        }
                        vb2Var = (vb2) objP2;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVar4);
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
                        peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        yg0VarA.invoke(kk0Var, 0);
                        kk0Var.r(true);
                        i19 = i22;
                        ba1Var2 = ba1Var3;
                        glVar3 = glVar4;
                        i20 = i21;
                        cVar2 = cVar4;
                        z7Var3 = top;
                        elVar3 = elVar4;
                    } else {
                        kk0Var.V();
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        z7Var3 = z7Var2;
                        i19 = i11;
                        i20 = i2;
                        ba1Var2 = ba1Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(ba1Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i8 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        ba1Var3 = ba1.g;
                    } else {
                        ba1Var3 = ba1Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z12 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z12 | z5;
                    Object objP8 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList10 = new ArrayList();
                        arrayList10.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList10);
                        kk0Var.l0(arrayList10);
                        obj = arrayList10;
                    } else {
                        ArrayList arrayList11 = new ArrayList();
                        arrayList11.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList11);
                        kk0Var.l0(arrayList11);
                        obj = arrayList11;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    ba1Var2 = ba1Var3;
                    glVar3 = glVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    z7Var3 = top;
                    elVar3 = elVar4;
                } else {
                    kk0Var.V();
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    z7Var3 = z7Var2;
                    i19 = i11;
                    i20 = i2;
                    ba1Var2 = ba1Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 3072;
            z7Var2 = z7Var;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (kk0Var.f(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(ba1Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i8 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        ba1Var3 = ba1.g;
                    } else {
                        ba1Var3 = ba1Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z13 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z13 | z5;
                    Object objP9 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList12 = new ArrayList();
                        arrayList12.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList12);
                        kk0Var.l0(arrayList12);
                        obj = arrayList12;
                    } else {
                        ArrayList arrayList13 = new ArrayList();
                        arrayList13.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList13);
                        kk0Var.l0(arrayList13);
                        obj = arrayList13;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    ba1Var2 = ba1Var3;
                    glVar3 = glVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    z7Var3 = top;
                    elVar3 = elVar4;
                } else {
                    kk0Var.V();
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    z7Var3 = z7Var2;
                    i19 = i11;
                    i20 = i2;
                    ba1Var2 = ba1Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (kk0Var.f(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (kk0Var.h(ba1Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & Uuid.SIZE_BITS) != 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            i18 = i5;
            if ((i18 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i18 & 1, z)) {
                if (i24 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i25 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i8 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var2;
                }
                i21 = IntCompanionObject.MAX_VALUE;
                cVar4 = cVar3;
                if (i10 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i11;
                }
                if (i13 == 0) {
                    i21 = i2;
                }
                if (i15 != 0) {
                    ba1Var3 = ba1.g;
                } else {
                    ba1Var3 = ba1Var;
                }
                i23 = i18 & 3670016;
                if (i23 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = kk0Var.P();
                if (z2) {
                    objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                    kk0Var.l0(objP);
                } else {
                    objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                    kk0Var.l0(objP);
                }
                y91Var = (y91) objP;
                lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                if (i23 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i18 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z14 = z3 | z4;
                if ((i18 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z14 | z5;
                Object objP10 = kk0Var.P();
                if (z6) {
                    ArrayList arrayList14 = new ArrayList();
                    arrayList14.add(new yg0(702094978, new q91(oe1Var), true));
                    ba1Var3.a(y91Var, arrayList14);
                    kk0Var.l0(arrayList14);
                    obj = arrayList14;
                } else {
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(new yg0(702094978, new q91(oe1Var), true));
                    ba1Var3.a(y91Var, arrayList15);
                    kk0Var.l0(arrayList15);
                    obj = arrayList15;
                }
                yg0VarA = ix1.a((List) obj);
                zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                }
                vb2Var = (vb2) objP2;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVar4);
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
                peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                yg0VarA.invoke(kk0Var, 0);
                kk0Var.r(true);
                i19 = i22;
                ba1Var2 = ba1Var3;
                glVar3 = glVar4;
                i20 = i21;
                cVar2 = cVar4;
                z7Var3 = top;
                elVar3 = elVar4;
            } else {
                kk0Var.V();
                elVar3 = elVar2;
                glVar3 = glVar2;
                z7Var3 = z7Var2;
                i19 = i11;
                i20 = i2;
                ba1Var2 = ba1Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
            }
        }
        i5 |= 48;
        elVar2 = elVar;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                glVar2 = glVar;
                if (kk0Var.h(glVar2)) {
                    i7 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i7 = Uuid.SIZE_BITS;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    z7Var2 = z7Var;
                    if (kk0Var.h(z7Var2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (kk0Var.f(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (kk0Var.f(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (kk0Var.h(ba1Var)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i4 & Uuid.SIZE_BITS) != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i5 |= i17;
                    }
                    i18 = i5;
                    if ((i18 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i18 & 1, z)) {
                        if (i24 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i25 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                        } else {
                            glVar4 = glVar2;
                        }
                        if (i8 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var2;
                        }
                        i21 = IntCompanionObject.MAX_VALUE;
                        cVar4 = cVar3;
                        if (i10 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i11;
                        }
                        if (i13 == 0) {
                            i21 = i2;
                        }
                        if (i15 != 0) {
                            ba1Var3 = ba1.g;
                        } else {
                            ba1Var3 = ba1Var;
                        }
                        i23 = i18 & 3670016;
                        if (i23 == 1048576) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                            kk0Var.l0(objP);
                        } else {
                            objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                            kk0Var.l0(objP);
                        }
                        y91Var = (y91) objP;
                        lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                        if (i23 == 1048576) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i18 & 29360128) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z15 = z3 | z4;
                        if ((i18 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z15 | z5;
                        Object objP11 = kk0Var.P();
                        if (z6) {
                            ArrayList arrayList16 = new ArrayList();
                            arrayList16.add(new yg0(702094978, new q91(oe1Var), true));
                            ba1Var3.a(y91Var, arrayList16);
                            kk0Var.l0(arrayList16);
                            obj = arrayList16;
                        } else {
                            ArrayList arrayList17 = new ArrayList();
                            arrayList17.add(new yg0(702094978, new q91(oe1Var), true));
                            ba1Var3.a(y91Var, arrayList17);
                            kk0Var.l0(arrayList17);
                            obj = arrayList17;
                        }
                        yg0VarA = ix1.a((List) obj);
                        zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                            kk0Var.l0(objP2);
                        }
                        vb2Var = (vb2) objP2;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVar4);
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
                        peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        yg0VarA.invoke(kk0Var, 0);
                        kk0Var.r(true);
                        i19 = i22;
                        ba1Var2 = ba1Var3;
                        glVar3 = glVar4;
                        i20 = i21;
                        cVar2 = cVar4;
                        z7Var3 = top;
                        elVar3 = elVar4;
                    } else {
                        kk0Var.V();
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        z7Var3 = z7Var2;
                        i19 = i11;
                        i20 = i2;
                        ba1Var2 = ba1Var;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(ba1Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i8 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        ba1Var3 = ba1.g;
                    } else {
                        ba1Var3 = ba1Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z16 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z16 | z5;
                    Object objP12 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList18 = new ArrayList();
                        arrayList18.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList18);
                        kk0Var.l0(arrayList18);
                        obj = arrayList18;
                    } else {
                        ArrayList arrayList19 = new ArrayList();
                        arrayList19.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList19);
                        kk0Var.l0(arrayList19);
                        obj = arrayList19;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    ba1Var2 = ba1Var3;
                    glVar3 = glVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    z7Var3 = top;
                    elVar3 = elVar4;
                } else {
                    kk0Var.V();
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    z7Var3 = z7Var2;
                    i19 = i11;
                    i20 = i2;
                    ba1Var2 = ba1Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 3072;
            z7Var2 = z7Var;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (kk0Var.f(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(ba1Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i8 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        ba1Var3 = ba1.g;
                    } else {
                        ba1Var3 = ba1Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z17 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z17 | z5;
                    Object objP13 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList110 = new ArrayList();
                        arrayList110.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList110);
                        kk0Var.l0(arrayList110);
                        obj = arrayList110;
                    } else {
                        ArrayList arrayList111 = new ArrayList();
                        arrayList111.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList111);
                        kk0Var.l0(arrayList111);
                        obj = arrayList111;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    ba1Var2 = ba1Var3;
                    glVar3 = glVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    z7Var3 = top;
                    elVar3 = elVar4;
                } else {
                    kk0Var.V();
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    z7Var3 = z7Var2;
                    i19 = i11;
                    i20 = i2;
                    ba1Var2 = ba1Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (kk0Var.f(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (kk0Var.h(ba1Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & Uuid.SIZE_BITS) != 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            i18 = i5;
            if ((i18 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i18 & 1, z)) {
                if (i24 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i25 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i8 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var2;
                }
                i21 = IntCompanionObject.MAX_VALUE;
                cVar4 = cVar3;
                if (i10 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i11;
                }
                if (i13 == 0) {
                    i21 = i2;
                }
                if (i15 != 0) {
                    ba1Var3 = ba1.g;
                } else {
                    ba1Var3 = ba1Var;
                }
                i23 = i18 & 3670016;
                if (i23 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = kk0Var.P();
                if (z2) {
                    objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                    kk0Var.l0(objP);
                } else {
                    objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                    kk0Var.l0(objP);
                }
                y91Var = (y91) objP;
                lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                if (i23 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i18 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z18 = z3 | z4;
                if ((i18 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z18 | z5;
                Object objP14 = kk0Var.P();
                if (z6) {
                    ArrayList arrayList112 = new ArrayList();
                    arrayList112.add(new yg0(702094978, new q91(oe1Var), true));
                    ba1Var3.a(y91Var, arrayList112);
                    kk0Var.l0(arrayList112);
                    obj = arrayList112;
                } else {
                    ArrayList arrayList113 = new ArrayList();
                    arrayList113.add(new yg0(702094978, new q91(oe1Var), true));
                    ba1Var3.a(y91Var, arrayList113);
                    kk0Var.l0(arrayList113);
                    obj = arrayList113;
                }
                yg0VarA = ix1.a((List) obj);
                zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                }
                vb2Var = (vb2) objP2;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVar4);
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
                peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                yg0VarA.invoke(kk0Var, 0);
                kk0Var.r(true);
                i19 = i22;
                ba1Var2 = ba1Var3;
                glVar3 = glVar4;
                i20 = i21;
                cVar2 = cVar4;
                z7Var3 = top;
                elVar3 = elVar4;
            } else {
                kk0Var.V();
                elVar3 = elVar2;
                glVar3 = glVar2;
                z7Var3 = z7Var2;
                i19 = i11;
                i20 = i2;
                ba1Var2 = ba1Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
            }
        }
        i5 |= 384;
        glVar2 = glVar;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                z7Var2 = z7Var;
                if (kk0Var.h(z7Var2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (kk0Var.f(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (kk0Var.f(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (kk0Var.h(ba1Var)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & Uuid.SIZE_BITS) != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i5 |= i17;
                }
                i18 = i5;
                if ((i18 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i18 & 1, z)) {
                    if (i24 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i25 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                    } else {
                        glVar4 = glVar2;
                    }
                    if (i8 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var2;
                    }
                    i21 = IntCompanionObject.MAX_VALUE;
                    cVar4 = cVar3;
                    if (i10 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i11;
                    }
                    if (i13 == 0) {
                        i21 = i2;
                    }
                    if (i15 != 0) {
                        ba1Var3 = ba1.g;
                    } else {
                        ba1Var3 = ba1Var;
                    }
                    i23 = i18 & 3670016;
                    if (i23 == 1048576) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    } else {
                        objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                        kk0Var.l0(objP);
                    }
                    y91Var = (y91) objP;
                    lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                    if (i23 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i18 & 29360128) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z19 = z3 | z4;
                    if ((i18 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z19 | z5;
                    Object objP15 = kk0Var.P();
                    if (z6) {
                        ArrayList arrayList114 = new ArrayList();
                        arrayList114.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList114);
                        kk0Var.l0(arrayList114);
                        obj = arrayList114;
                    } else {
                        ArrayList arrayList115 = new ArrayList();
                        arrayList115.add(new yg0(702094978, new q91(oe1Var), true));
                        ba1Var3.a(y91Var, arrayList115);
                        kk0Var.l0(arrayList115);
                        obj = arrayList115;
                    }
                    yg0VarA = ix1.a((List) obj);
                    zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                        kk0Var.l0(objP2);
                    }
                    vb2Var = (vb2) objP2;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVar4);
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
                    peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    yg0VarA.invoke(kk0Var, 0);
                    kk0Var.r(true);
                    i19 = i22;
                    ba1Var2 = ba1Var3;
                    glVar3 = glVar4;
                    i20 = i21;
                    cVar2 = cVar4;
                    z7Var3 = top;
                    elVar3 = elVar4;
                } else {
                    kk0Var.V();
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    z7Var3 = z7Var2;
                    i19 = i11;
                    i20 = i2;
                    ba1Var2 = ba1Var;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (kk0Var.f(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (kk0Var.h(ba1Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & Uuid.SIZE_BITS) != 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            i18 = i5;
            if ((i18 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i18 & 1, z)) {
                if (i24 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i25 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i8 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var2;
                }
                i21 = IntCompanionObject.MAX_VALUE;
                cVar4 = cVar3;
                if (i10 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i11;
                }
                if (i13 == 0) {
                    i21 = i2;
                }
                if (i15 != 0) {
                    ba1Var3 = ba1.g;
                } else {
                    ba1Var3 = ba1Var;
                }
                i23 = i18 & 3670016;
                if (i23 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = kk0Var.P();
                if (z2) {
                    objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                    kk0Var.l0(objP);
                } else {
                    objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                    kk0Var.l0(objP);
                }
                y91Var = (y91) objP;
                lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                if (i23 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i18 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z110 = z3 | z4;
                if ((i18 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z110 | z5;
                Object objP16 = kk0Var.P();
                if (z6) {
                    ArrayList arrayList116 = new ArrayList();
                    arrayList116.add(new yg0(702094978, new q91(oe1Var), true));
                    ba1Var3.a(y91Var, arrayList116);
                    kk0Var.l0(arrayList116);
                    obj = arrayList116;
                } else {
                    ArrayList arrayList117 = new ArrayList();
                    arrayList117.add(new yg0(702094978, new q91(oe1Var), true));
                    ba1Var3.a(y91Var, arrayList117);
                    kk0Var.l0(arrayList117);
                    obj = arrayList117;
                }
                yg0VarA = ix1.a((List) obj);
                zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                }
                vb2Var = (vb2) objP2;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVar4);
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
                peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                yg0VarA.invoke(kk0Var, 0);
                kk0Var.r(true);
                i19 = i22;
                ba1Var2 = ba1Var3;
                glVar3 = glVar4;
                i20 = i21;
                cVar2 = cVar4;
                z7Var3 = top;
                elVar3 = elVar4;
            } else {
                kk0Var.V();
                elVar3 = elVar2;
                glVar3 = glVar2;
                z7Var3 = z7Var2;
                i19 = i11;
                i20 = i2;
                ba1Var2 = ba1Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
            }
        }
        i5 |= 3072;
        z7Var2 = z7Var;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                i11 = i;
                if (kk0Var.f(i11)) {
                    i12 = 16384;
                } else {
                    i12 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i12;
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (kk0Var.f(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (kk0Var.h(ba1Var)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & Uuid.SIZE_BITS) != 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            i18 = i5;
            if ((i18 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i18 & 1, z)) {
                if (i24 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i25 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    glVar4 = hl.c;
                } else {
                    glVar4 = glVar2;
                }
                if (i8 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var2;
                }
                i21 = IntCompanionObject.MAX_VALUE;
                cVar4 = cVar3;
                if (i10 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i11;
                }
                if (i13 == 0) {
                    i21 = i2;
                }
                if (i15 != 0) {
                    ba1Var3 = ba1.g;
                } else {
                    ba1Var3 = ba1Var;
                }
                i23 = i18 & 3670016;
                if (i23 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = kk0Var.P();
                if (z2) {
                    objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                    kk0Var.l0(objP);
                } else {
                    objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                    kk0Var.l0(objP);
                }
                y91Var = (y91) objP;
                lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
                if (i23 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i18 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z111 = z3 | z4;
                if ((i18 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z111 | z5;
                Object objP17 = kk0Var.P();
                if (z6) {
                    ArrayList arrayList118 = new ArrayList();
                    arrayList118.add(new yg0(702094978, new q91(oe1Var), true));
                    ba1Var3.a(y91Var, arrayList118);
                    kk0Var.l0(arrayList118);
                    obj = arrayList118;
                } else {
                    ArrayList arrayList119 = new ArrayList();
                    arrayList119.add(new yg0(702094978, new q91(oe1Var), true));
                    ba1Var3.a(y91Var, arrayList119);
                    kk0Var.l0(arrayList119);
                    obj = arrayList119;
                }
                yg0VarA = ix1.a((List) obj);
                zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                    kk0Var.l0(objP2);
                }
                vb2Var = (vb2) objP2;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVar4);
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
                peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                yg0VarA.invoke(kk0Var, 0);
                kk0Var.r(true);
                i19 = i22;
                ba1Var2 = ba1Var3;
                glVar3 = glVar4;
                i20 = i21;
                cVar2 = cVar4;
                z7Var3 = top;
                elVar3 = elVar4;
            } else {
                kk0Var.V();
                elVar3 = elVar2;
                glVar3 = glVar2;
                z7Var3 = z7Var2;
                i19 = i11;
                i20 = i2;
                ba1Var2 = ba1Var;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
            }
        }
        i5 |= 24576;
        i11 = i;
        i13 = i4 & 32;
        if (i13 != 0) {
            i5 |= 196608;
        } else if ((i3 & 196608) == 0) {
            if (kk0Var.f(i2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i5 |= i14;
        }
        i15 = i4 & 64;
        if (i15 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            if (kk0Var.h(ba1Var)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i5 |= i16;
        }
        if ((i4 & Uuid.SIZE_BITS) != 0) {
            i5 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            if (kk0Var.j(oe1Var)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i5 |= i17;
        }
        i18 = i5;
        if ((i18 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i18 & 1, z)) {
            if (i24 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            if (i25 != 0) {
                elVar4 = hl.a;
            } else {
                elVar4 = elVar2;
            }
            if (i6 != 0) {
                glVar4 = hl.c;
            } else {
                glVar4 = glVar2;
            }
            if (i8 != 0) {
                top = Alignment$Companion.getTop();
            } else {
                top = z7Var2;
            }
            i21 = IntCompanionObject.MAX_VALUE;
            cVar4 = cVar3;
            if (i10 != 0) {
                i22 = Integer.MAX_VALUE;
            } else {
                i22 = i11;
            }
            if (i13 == 0) {
                i21 = i2;
            }
            if (i15 != 0) {
                ba1Var3 = ba1.g;
            } else {
                ba1Var3 = ba1Var;
            }
            i23 = i18 & 3670016;
            if (i23 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP = kk0Var.P();
            if (z2) {
                objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                kk0Var.l0(objP);
            } else {
                objP = new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c);
                kk0Var.l0(objP);
            }
            y91Var = (y91) objP;
            lg2VarRowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(elVar4, glVar4, top, i22, i21, y91Var, kk0Var, (i18 >> 3) & 65534);
            if (i23 == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i18 & 29360128) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z112 = z3 | z4;
            if ((i18 & 458752) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z112 | z5;
            Object objP18 = kk0Var.P();
            if (z6) {
                ArrayList arrayList1110 = new ArrayList();
                arrayList1110.add(new yg0(702094978, new q91(oe1Var), true));
                ba1Var3.a(y91Var, arrayList1110);
                kk0Var.l0(arrayList1110);
                obj = arrayList1110;
            } else {
                ArrayList arrayList1111 = new ArrayList();
                arrayList1111.add(new yg0(702094978, new q91(oe1Var), true));
                ba1Var3.a(y91Var, arrayList1111);
                kk0Var.l0(arrayList1111);
                obj = arrayList1111;
            }
            yg0VarA = ix1.a((List) obj);
            zH = kk0Var.h(lg2VarRowMeasurementMultiContentHelper);
            objP2 = kk0Var.P();
            if (zH) {
                objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                kk0Var.l0(objP2);
            } else {
                objP2 = new mg2(lg2VarRowMeasurementMultiContentHelper);
                kk0Var.l0(objP2);
            }
            vb2Var = (vb2) objP2;
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVar4);
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
            peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            yg0VarA.invoke(kk0Var, 0);
            kk0Var.r(true);
            i19 = i22;
            ba1Var2 = ba1Var3;
            glVar3 = glVar4;
            i20 = i21;
            cVar2 = cVar4;
            z7Var3 = top;
            elVar3 = elVar4;
        } else {
            kk0Var.V();
            elVar3 = elVar2;
            glVar3 = glVar2;
            z7Var3 = z7Var2;
            i19 = i11;
            i20 = i2;
            ba1Var2 = ba1Var;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new n91(cVar2, elVar3, glVar3, z7Var3, i19, i20, ba1Var2, oe1Var, i3, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:105:0x014d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    public static final void FlowRow(c cVar, el elVar, gl glVar, z7 z7Var, int i, int i2, oe1 oe1Var, ck0 ck0Var, int i3, int i4) {
        int i5;
        el elVar2;
        int i6;
        gl glVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        kk0 kk0Var;
        c cVar2;
        z7 z7Var2;
        el elVar3;
        gl glVar3;
        int i16;
        int i17;
        w33 w33VarV;
        int i18;
        c cVar3;
        el elVar4;
        int i19;
        gl glVar4;
        z7 top;
        int i20;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-2070229740);
        int i21 = i4 & 1;
        if (i21 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (kk0Var2.h(cVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i22 = i4 & 2;
        if (i22 == 0) {
            if ((i3 & 48) == 0) {
                elVar2 = elVar;
                i5 |= kk0Var2.h(elVar2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    glVar2 = glVar;
                    if (kk0Var2.h(glVar2)) {
                        i7 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i7 = Uuid.SIZE_BITS;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        if (kk0Var2.h(z7Var)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 24576) == 0) {
                            if (kk0Var2.f(i)) {
                                i11 = 16384;
                            } else {
                                i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                            }
                            i5 |= i11;
                        }
                        i12 = i4 & 32;
                        if (i12 != 0) {
                            if ((196608 & i3) == 0) {
                                i13 = i2;
                                if (kk0Var2.f(i13)) {
                                    i14 = 131072;
                                } else {
                                    i14 = 65536;
                                }
                                i5 |= i14;
                            }
                            if ((i4 & 64) != 0) {
                                if ((i3 & 1572864) == 0) {
                                    if (kk0Var2.j(oe1Var)) {
                                        i15 = 1048576;
                                    } else {
                                        i15 = 524288;
                                    }
                                    i5 |= i15;
                                }
                                if ((i5 & 599187) != 599186) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (kk0Var2.S(i5 & 1, z)) {
                                    if (i21 != 0) {
                                        cVar3 = c.i;
                                        i18 = i8;
                                    } else {
                                        i18 = i8;
                                        cVar3 = cVar;
                                    }
                                    if (i22 != 0) {
                                        elVar4 = hl.a;
                                    } else {
                                        elVar4 = elVar2;
                                    }
                                    if (i6 != 0) {
                                        glVar4 = hl.c;
                                        i19 = i10;
                                    } else {
                                        i19 = i10;
                                        glVar4 = glVar2;
                                    }
                                    if (i18 != 0) {
                                        top = Alignment$Companion.getTop();
                                    } else {
                                        top = z7Var;
                                    }
                                    if (i19 != 0) {
                                        i20 = Integer.MAX_VALUE;
                                    } else {
                                        i20 = i;
                                    }
                                    if (i12 != 0) {
                                        i13 = Integer.MAX_VALUE;
                                    }
                                    kk0Var = kk0Var2;
                                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                    cVar2 = cVar3;
                                    elVar3 = elVar4;
                                    glVar3 = glVar4;
                                    z7Var2 = top;
                                    i16 = i20;
                                } else {
                                    kk0Var = kk0Var2;
                                    kk0Var.V();
                                    cVar2 = cVar;
                                    z7Var2 = z7Var;
                                    elVar3 = elVar2;
                                    glVar3 = glVar2;
                                    i16 = i;
                                }
                                i17 = i13;
                                w33VarV = kk0Var.v();
                                if (w33VarV != null) {
                                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                                }
                            }
                            i5 |= 1572864;
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = elVar2;
                                }
                                if (i6 != 0) {
                                    glVar4 = hl.c;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    glVar4 = glVar2;
                                }
                                if (i18 != 0) {
                                    top = Alignment$Companion.getTop();
                                } else {
                                    top = z7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                elVar3 = elVar4;
                                glVar3 = glVar4;
                                z7Var2 = top;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                z7Var2 = z7Var;
                                elVar3 = elVar2;
                                glVar3 = glVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 196608;
                        i13 = i2;
                        if ((i4 & 64) != 0) {
                            if ((i3 & 1572864) == 0) {
                                if (kk0Var2.j(oe1Var)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = elVar2;
                                }
                                if (i6 != 0) {
                                    glVar4 = hl.c;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    glVar4 = glVar2;
                                }
                                if (i18 != 0) {
                                    top = Alignment$Companion.getTop();
                                } else {
                                    top = z7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                elVar3 = elVar4;
                                glVar3 = glVar4;
                                z7Var2 = top;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                z7Var2 = z7Var;
                                elVar3 = elVar2;
                                glVar3 = glVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 1572864;
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 24576;
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        if ((196608 & i3) == 0) {
                            i13 = i2;
                            if (kk0Var2.f(i13)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        if ((i4 & 64) != 0) {
                            if ((i3 & 1572864) == 0) {
                                if (kk0Var2.j(oe1Var)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = elVar2;
                                }
                                if (i6 != 0) {
                                    glVar4 = hl.c;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    glVar4 = glVar2;
                                }
                                if (i18 != 0) {
                                    top = Alignment$Companion.getTop();
                                } else {
                                    top = z7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                elVar3 = elVar4;
                                glVar3 = glVar4;
                                z7Var2 = top;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                z7Var2 = z7Var;
                                elVar3 = elVar2;
                                glVar3 = glVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 1572864;
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 196608;
                    i13 = i2;
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 3072;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        if (kk0Var2.f(i)) {
                            i11 = 16384;
                        } else {
                            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        if ((196608 & i3) == 0) {
                            i13 = i2;
                            if (kk0Var2.f(i13)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        if ((i4 & 64) != 0) {
                            if ((i3 & 1572864) == 0) {
                                if (kk0Var2.j(oe1Var)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = elVar2;
                                }
                                if (i6 != 0) {
                                    glVar4 = hl.c;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    glVar4 = glVar2;
                                }
                                if (i18 != 0) {
                                    top = Alignment$Companion.getTop();
                                } else {
                                    top = z7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                elVar3 = elVar4;
                                glVar3 = glVar4;
                                z7Var2 = top;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                z7Var2 = z7Var;
                                elVar3 = elVar2;
                                glVar3 = glVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 1572864;
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 196608;
                    i13 = i2;
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 384;
            glVar2 = glVar;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    if (kk0Var2.h(z7Var)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        if (kk0Var2.f(i)) {
                            i11 = 16384;
                        } else {
                            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        if ((196608 & i3) == 0) {
                            i13 = i2;
                            if (kk0Var2.f(i13)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        if ((i4 & 64) != 0) {
                            if ((i3 & 1572864) == 0) {
                                if (kk0Var2.j(oe1Var)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = elVar2;
                                }
                                if (i6 != 0) {
                                    glVar4 = hl.c;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    glVar4 = glVar2;
                                }
                                if (i18 != 0) {
                                    top = Alignment$Companion.getTop();
                                } else {
                                    top = z7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                elVar3 = elVar4;
                                glVar3 = glVar4;
                                z7Var2 = top;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                z7Var2 = z7Var;
                                elVar3 = elVar2;
                                glVar3 = glVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 1572864;
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 196608;
                    i13 = i2;
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 3072;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    if (kk0Var2.f(i)) {
                        i11 = 16384;
                    } else {
                        i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i12 = i4 & 32;
            if (i12 != 0) {
                if ((196608 & i3) == 0) {
                    i13 = i2;
                    if (kk0Var2.f(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 196608;
            i13 = i2;
            if ((i4 & 64) != 0) {
                if ((i3 & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 1572864;
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    glVar4 = hl.c;
                    i19 = i10;
                } else {
                    i19 = i10;
                    glVar4 = glVar2;
                }
                if (i18 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                elVar3 = elVar4;
                glVar3 = glVar4;
                z7Var2 = top;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                z7Var2 = z7Var;
                elVar3 = elVar2;
                glVar3 = glVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 48;
        elVar2 = elVar;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                glVar2 = glVar;
                if (kk0Var2.h(glVar2)) {
                    i7 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i7 = Uuid.SIZE_BITS;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    if (kk0Var2.h(z7Var)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        if (kk0Var2.f(i)) {
                            i11 = 16384;
                        } else {
                            i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        if ((196608 & i3) == 0) {
                            i13 = i2;
                            if (kk0Var2.f(i13)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        if ((i4 & 64) != 0) {
                            if ((i3 & 1572864) == 0) {
                                if (kk0Var2.j(oe1Var)) {
                                    i15 = 1048576;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                            if ((i5 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var2.S(i5 & 1, z)) {
                                if (i21 != 0) {
                                    cVar3 = c.i;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    cVar3 = cVar;
                                }
                                if (i22 != 0) {
                                    elVar4 = hl.a;
                                } else {
                                    elVar4 = elVar2;
                                }
                                if (i6 != 0) {
                                    glVar4 = hl.c;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    glVar4 = glVar2;
                                }
                                if (i18 != 0) {
                                    top = Alignment$Companion.getTop();
                                } else {
                                    top = z7Var;
                                }
                                if (i19 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                kk0Var = kk0Var2;
                                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                cVar2 = cVar3;
                                elVar3 = elVar4;
                                glVar3 = glVar4;
                                z7Var2 = top;
                                i16 = i20;
                            } else {
                                kk0Var = kk0Var2;
                                kk0Var.V();
                                cVar2 = cVar;
                                z7Var2 = z7Var;
                                elVar3 = elVar2;
                                glVar3 = glVar2;
                                i16 = i;
                            }
                            i17 = i13;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                            }
                        }
                        i5 |= 1572864;
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 196608;
                    i13 = i2;
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 24576;
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 3072;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    if (kk0Var2.f(i)) {
                        i11 = 16384;
                    } else {
                        i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i12 = i4 & 32;
            if (i12 != 0) {
                if ((196608 & i3) == 0) {
                    i13 = i2;
                    if (kk0Var2.f(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 196608;
            i13 = i2;
            if ((i4 & 64) != 0) {
                if ((i3 & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 1572864;
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    glVar4 = hl.c;
                    i19 = i10;
                } else {
                    i19 = i10;
                    glVar4 = glVar2;
                }
                if (i18 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                elVar3 = elVar4;
                glVar3 = glVar4;
                z7Var2 = top;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                z7Var2 = z7Var;
                elVar3 = elVar2;
                glVar3 = glVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 384;
        glVar2 = glVar;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                if (kk0Var2.h(z7Var)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    if (kk0Var2.f(i)) {
                        i11 = 16384;
                    } else {
                        i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 32;
                if (i12 != 0) {
                    if ((196608 & i3) == 0) {
                        i13 = i2;
                        if (kk0Var2.f(i13)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                        if ((i5 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var2.S(i5 & 1, z)) {
                            if (i21 != 0) {
                                cVar3 = c.i;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                cVar3 = cVar;
                            }
                            if (i22 != 0) {
                                elVar4 = hl.a;
                            } else {
                                elVar4 = elVar2;
                            }
                            if (i6 != 0) {
                                glVar4 = hl.c;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                glVar4 = glVar2;
                            }
                            if (i18 != 0) {
                                top = Alignment$Companion.getTop();
                            } else {
                                top = z7Var;
                            }
                            if (i19 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            kk0Var = kk0Var2;
                            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            cVar2 = cVar3;
                            elVar3 = elVar4;
                            glVar3 = glVar4;
                            z7Var2 = top;
                            i16 = i20;
                        } else {
                            kk0Var = kk0Var2;
                            kk0Var.V();
                            cVar2 = cVar;
                            z7Var2 = z7Var;
                            elVar3 = elVar2;
                            glVar3 = glVar2;
                            i16 = i;
                        }
                        i17 = i13;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                        }
                    }
                    i5 |= 1572864;
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 196608;
                i13 = i2;
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 24576;
            i12 = i4 & 32;
            if (i12 != 0) {
                if ((196608 & i3) == 0) {
                    i13 = i2;
                    if (kk0Var2.f(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 196608;
            i13 = i2;
            if ((i4 & 64) != 0) {
                if ((i3 & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 1572864;
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    glVar4 = hl.c;
                    i19 = i10;
                } else {
                    i19 = i10;
                    glVar4 = glVar2;
                }
                if (i18 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                elVar3 = elVar4;
                glVar3 = glVar4;
                z7Var2 = top;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                z7Var2 = z7Var;
                elVar3 = elVar2;
                glVar3 = glVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 3072;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                if (kk0Var2.f(i)) {
                    i11 = 16384;
                } else {
                    i11 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i5 |= i11;
            }
            i12 = i4 & 32;
            if (i12 != 0) {
                if ((196608 & i3) == 0) {
                    i13 = i2;
                    if (kk0Var2.f(i13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                if ((i4 & 64) != 0) {
                    if ((i3 & 1572864) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                    if ((i5 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var2.S(i5 & 1, z)) {
                        if (i21 != 0) {
                            cVar3 = c.i;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            cVar3 = cVar;
                        }
                        if (i22 != 0) {
                            elVar4 = hl.a;
                        } else {
                            elVar4 = elVar2;
                        }
                        if (i6 != 0) {
                            glVar4 = hl.c;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            glVar4 = glVar2;
                        }
                        if (i18 != 0) {
                            top = Alignment$Companion.getTop();
                        } else {
                            top = z7Var;
                        }
                        if (i19 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        kk0Var = kk0Var2;
                        FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        cVar2 = cVar3;
                        elVar3 = elVar4;
                        glVar3 = glVar4;
                        z7Var2 = top;
                        i16 = i20;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        cVar2 = cVar;
                        z7Var2 = z7Var;
                        elVar3 = elVar2;
                        glVar3 = glVar2;
                        i16 = i;
                    }
                    i17 = i13;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                    }
                }
                i5 |= 1572864;
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 196608;
            i13 = i2;
            if ((i4 & 64) != 0) {
                if ((i3 & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 1572864;
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    glVar4 = hl.c;
                    i19 = i10;
                } else {
                    i19 = i10;
                    glVar4 = glVar2;
                }
                if (i18 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                elVar3 = elVar4;
                glVar3 = glVar4;
                z7Var2 = top;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                z7Var2 = z7Var;
                elVar3 = elVar2;
                glVar3 = glVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 24576;
        i12 = i4 & 32;
        if (i12 != 0) {
            if ((196608 & i3) == 0) {
                i13 = i2;
                if (kk0Var2.f(i13)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            if ((i4 & 64) != 0) {
                if ((i3 & 1572864) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
                if ((i5 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i5 & 1, z)) {
                    if (i21 != 0) {
                        cVar3 = c.i;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        cVar3 = cVar;
                    }
                    if (i22 != 0) {
                        elVar4 = hl.a;
                    } else {
                        elVar4 = elVar2;
                    }
                    if (i6 != 0) {
                        glVar4 = hl.c;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        glVar4 = glVar2;
                    }
                    if (i18 != 0) {
                        top = Alignment$Companion.getTop();
                    } else {
                        top = z7Var;
                    }
                    if (i19 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i;
                    }
                    if (i12 != 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                    kk0Var = kk0Var2;
                    FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                    cVar2 = cVar3;
                    elVar3 = elVar4;
                    glVar3 = glVar4;
                    z7Var2 = top;
                    i16 = i20;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar2 = cVar;
                    z7Var2 = z7Var;
                    elVar3 = elVar2;
                    glVar3 = glVar2;
                    i16 = i;
                }
                i17 = i13;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
                }
            }
            i5 |= 1572864;
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    glVar4 = hl.c;
                    i19 = i10;
                } else {
                    i19 = i10;
                    glVar4 = glVar2;
                }
                if (i18 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                elVar3 = elVar4;
                glVar3 = glVar4;
                z7Var2 = top;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                z7Var2 = z7Var;
                elVar3 = elVar2;
                glVar3 = glVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 196608;
        i13 = i2;
        if ((i4 & 64) != 0) {
            if ((i3 & 1572864) == 0) {
                if (kk0Var2.j(oe1Var)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i5 & 1, z)) {
                if (i21 != 0) {
                    cVar3 = c.i;
                    i18 = i8;
                } else {
                    i18 = i8;
                    cVar3 = cVar;
                }
                if (i22 != 0) {
                    elVar4 = hl.a;
                } else {
                    elVar4 = elVar2;
                }
                if (i6 != 0) {
                    glVar4 = hl.c;
                    i19 = i10;
                } else {
                    i19 = i10;
                    glVar4 = glVar2;
                }
                if (i18 != 0) {
                    top = Alignment$Companion.getTop();
                } else {
                    top = z7Var;
                }
                if (i19 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i;
                }
                if (i12 != 0) {
                    i13 = Integer.MAX_VALUE;
                }
                kk0Var = kk0Var2;
                FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                cVar2 = cVar3;
                elVar3 = elVar4;
                glVar3 = glVar4;
                z7Var2 = top;
                i16 = i20;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                z7Var2 = z7Var;
                elVar3 = elVar2;
                glVar3 = glVar2;
                i16 = i;
            }
            i17 = i13;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
            }
        }
        i5 |= 1572864;
        if ((i5 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var2.S(i5 & 1, z)) {
            if (i21 != 0) {
                cVar3 = c.i;
                i18 = i8;
            } else {
                i18 = i8;
                cVar3 = cVar;
            }
            if (i22 != 0) {
                elVar4 = hl.a;
            } else {
                elVar4 = elVar2;
            }
            if (i6 != 0) {
                glVar4 = hl.c;
                i19 = i10;
            } else {
                i19 = i10;
                glVar4 = glVar2;
            }
            if (i18 != 0) {
                top = Alignment$Companion.getTop();
            } else {
                top = z7Var;
            }
            if (i19 != 0) {
                i20 = Integer.MAX_VALUE;
            } else {
                i20 = i;
            }
            if (i12 != 0) {
                i13 = Integer.MAX_VALUE;
            }
            kk0Var = kk0Var2;
            FlowRow(cVar3, elVar4, glVar4, top, i20, i13, ba1.g, oe1Var, kk0Var, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
            cVar2 = cVar3;
            elVar3 = elVar4;
            glVar3 = glVar4;
            z7Var2 = top;
            i16 = i20;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar2 = cVar;
            z7Var2 = z7Var;
            elVar3 = elVar2;
            glVar3 = glVar2;
            i16 = i;
        }
        i17 = i13;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new o91(cVar2, elVar3, glVar3, z7Var2, i16, i17, oe1Var, i3, i4));
        }
    }

    public static final long a(qb2 qb2Var, aa1 aa1Var, long j, le1 le1Var) {
        boolean z = aa1Var.a;
        if (sf3.G(sf3.F(qb2Var)) != 0.0f) {
            int iM = z ? qb2Var.M(IntCompanionObject.MAX_VALUE) : qb2Var.R(IntCompanionObject.MAX_VALUE);
            return dq1.a(iM, z ? qb2Var.R(iM) : qb2Var.M(iM));
        }
        sf3.F(qb2Var);
        nv2 nv2VarC = qb2Var.c(j);
        le1Var.invoke(nv2VarC);
        return dq1.a(aa1Var.i(nv2VarC), aa1Var.h(nv2VarC));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037 A[PHI: r7
  0x0037: PHI (r7v3 el) = (r7v1 el), (r7v4 el) binds: [B:17:0x0035, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    public static final vb2 columnMeasurementHelper(gl glVar, el elVar, int i, ck0 ck0Var, int i2) {
        el elVar2;
        boolean z;
        int i3;
        boolean z2;
        kk0 kk0Var;
        Object objP;
        int i4 = 0;
        boolean z3 = true;
        boolean z4 = (((i2 & 14) ^ 6) > 4 && ((kk0) ck0Var).h(glVar)) || (i2 & 6) == 4;
        if (((i2 & 112) ^ 48) > 32) {
            elVar2 = elVar;
            if (((kk0) ck0Var).h(elVar2)) {
                z = true;
            }
            boolean z5 = z4 | z;
            if (((i2 & 896) ^ 384) > 256) {
                i3 = i;
                if (!((kk0) ck0Var).f(i3)) {
                }
                z2 = z5 | z3;
                kk0Var = (kk0) ck0Var;
                objP = kk0Var.P();
                if (z2 || objP == Composer$Companion.getEmpty()) {
                    float fA = glVar.a();
                    float fA2 = elVar2.a();
                    ba1 ba1Var = ba1.f;
                    objP = new s91(new aa1(false, elVar2, glVar, fA, b, fA2, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var.a, ba1Var.b, ba1Var.c)), i4);
                    kk0Var.l0(objP);
                }
                return (vb2) objP;
            }
            i3 = i;
            if ((i2 & 384) != 256) {
                z3 = false;
            }
            z2 = z5 | z3;
            kk0Var = (kk0) ck0Var;
            objP = kk0Var.P();
            if (z2) {
                float fA3 = glVar.a();
                float fA4 = elVar2.a();
                ba1 ba1Var2 = ba1.f;
                objP = new s91(new aa1(false, elVar2, glVar, fA3, b, fA4, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var2.a, ba1Var2.b, ba1Var2.c)), i4);
                kk0Var.l0(objP);
            } else {
                float fA5 = glVar.a();
                float fA6 = elVar2.a();
                ba1 ba1Var3 = ba1.f;
                objP = new s91(new aa1(false, elVar2, glVar, fA5, b, fA6, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c)), i4);
                kk0Var.l0(objP);
            }
            return (vb2) objP;
        }
        elVar2 = elVar;
        if ((i2 & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean z6 = z4 | z;
        if (((i2 & 896) ^ 384) > 256) {
            i3 = i;
            if (!((kk0) ck0Var).f(i3)) {
            }
            z2 = z6 | z3;
            kk0Var = (kk0) ck0Var;
            objP = kk0Var.P();
            if (z2) {
                float fA7 = glVar.a();
                float fA8 = elVar2.a();
                ba1 ba1Var4 = ba1.f;
                objP = new s91(new aa1(false, elVar2, glVar, fA7, b, fA8, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var4.a, ba1Var4.b, ba1Var4.c)), i4);
                kk0Var.l0(objP);
            } else {
                float fA9 = glVar.a();
                float fA10 = elVar2.a();
                ba1 ba1Var5 = ba1.f;
                objP = new s91(new aa1(false, elVar2, glVar, fA9, b, fA10, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var5.a, ba1Var5.b, ba1Var5.c)), i4);
                kk0Var.l0(objP);
            }
            return (vb2) objP;
        }
        i3 = i;
        if ((i2 & 384) != 256) {
            z3 = false;
        }
        z2 = z6 | z3;
        kk0Var = (kk0) ck0Var;
        objP = kk0Var.P();
        if (z2) {
            float fA11 = glVar.a();
            float fA12 = elVar2.a();
            ba1 ba1Var6 = ba1.f;
            objP = new s91(new aa1(false, elVar2, glVar, fA11, b, fA12, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var6.a, ba1Var6.b, ba1Var6.c)), i4);
            kk0Var.l0(objP);
        } else {
            float fA13 = glVar.a();
            float fA14 = elVar2.a();
            ba1 ba1Var7 = ba1.f;
            objP = new s91(new aa1(false, elVar2, glVar, fA13, b, fA14, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var7.a, ba1Var7.b, ba1Var7.c)), i4);
            kk0Var.l0(objP);
        }
        return (vb2) objP;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[PHI: r9
  0x0020: PHI (r9v3 gl) = (r9v1 gl), (r9v4 gl) binds: [B:9:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e A[PHI: r8
  0x003e: PHI (r8v3 el) = (r8v1 el), (r8v4 el) binds: [B:19:0x003c, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[PHI: r13
  0x0077: PHI (r13v3 int) = (r13v1 int), (r13v4 int) binds: [B:37:0x0075, B:33:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098 A[PHI: r14
  0x0098: PHI (r14v3 int) = (r14v1 int), (r14v4 int) binds: [B:47:0x0096, B:43:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    public static final lg2 columnMeasurementMultiContentHelper(gl glVar, el elVar, y7 y7Var, int i, int i2, y91 y91Var, ck0 ck0Var, int i3) {
        gl glVar2;
        boolean z;
        el elVar2;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        kk0 kk0Var;
        boolean zH;
        Object objP;
        if (((i3 & 14) ^ 6) > 4) {
            glVar2 = glVar;
            if (((kk0) ck0Var).h(glVar2)) {
                z = true;
            }
            if (((i3 & 112) ^ 48) > 32) {
                elVar2 = elVar;
                if (!((kk0) ck0Var).h(elVar2)) {
                    z2 = true;
                }
                boolean z4 = z | z2 | ((((i3 & 896) ^ 384) <= 256 && ((kk0) ck0Var).h(y7Var)) || (i3 & 384) == 256);
                if (((i3 & 7168) ^ 3072) > 2048) {
                    i4 = i;
                    if (!((kk0) ck0Var).f(i4)) {
                        z3 = true;
                    }
                    boolean z5 = z4 | z3;
                    if (((57344 & i3) ^ 24576) > 16384) {
                        i5 = i2;
                        if (!((kk0) ck0Var).f(i5)) {
                        }
                        boolean z6 = z5 | z;
                        kk0Var = (kk0) ck0Var;
                        zH = z6 | kk0Var.h(y91Var);
                        objP = kk0Var.P();
                        if (zH || objP == Composer$Companion.getEmpty()) {
                            aa1 aa1Var = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                            kk0Var.l0(aa1Var);
                            objP = aa1Var;
                        }
                        return (aa1) objP;
                    }
                    i5 = i2;
                    boolean z7 = (i3 & 24576) == 16384;
                    boolean z8 = z5 | z7;
                    kk0Var = (kk0) ck0Var;
                    zH = z8 | kk0Var.h(y91Var);
                    objP = kk0Var.P();
                    if (zH) {
                        aa1 aa1Var2 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var2);
                        objP = aa1Var2;
                    } else {
                        aa1 aa1Var3 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var3);
                        objP = aa1Var3;
                    }
                    return (aa1) objP;
                }
                i4 = i;
                if ((i3 & 3072) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z9 = z4 | z3;
                if (((57344 & i3) ^ 24576) > 16384) {
                    i5 = i2;
                    if (!((kk0) ck0Var).f(i5)) {
                    }
                    boolean z10 = z9 | z7;
                    kk0Var = (kk0) ck0Var;
                    zH = z10 | kk0Var.h(y91Var);
                    objP = kk0Var.P();
                    if (zH) {
                        aa1 aa1Var4 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var4);
                        objP = aa1Var4;
                    } else {
                        aa1 aa1Var5 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var5);
                        objP = aa1Var5;
                    }
                    return (aa1) objP;
                }
                i5 = i2;
                if ((i3 & 24576) == 16384) {
                }
                boolean z11 = z9 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z11 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var6 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var6);
                    objP = aa1Var6;
                } else {
                    aa1 aa1Var7 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var7);
                    objP = aa1Var7;
                }
                return (aa1) objP;
            }
            elVar2 = elVar;
            if ((i3 & 48) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z12 = z | z2 | ((((i3 & 896) ^ 384) <= 256 && ((kk0) ck0Var).h(y7Var)) || (i3 & 384) == 256);
            if (((i3 & 7168) ^ 3072) > 2048) {
                i4 = i;
                if (!((kk0) ck0Var).f(i4)) {
                    z3 = true;
                }
                boolean z13 = z12 | z3;
                if (((57344 & i3) ^ 24576) > 16384) {
                    i5 = i2;
                    if (!((kk0) ck0Var).f(i5)) {
                    }
                    boolean z14 = z13 | z7;
                    kk0Var = (kk0) ck0Var;
                    zH = z14 | kk0Var.h(y91Var);
                    objP = kk0Var.P();
                    if (zH) {
                        aa1 aa1Var8 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var8);
                        objP = aa1Var8;
                    } else {
                        aa1 aa1Var9 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var9);
                        objP = aa1Var9;
                    }
                    return (aa1) objP;
                }
                i5 = i2;
                if ((i3 & 24576) == 16384) {
                }
                boolean z15 = z13 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z15 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var10 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var10);
                    objP = aa1Var10;
                } else {
                    aa1 aa1Var11 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var11);
                    objP = aa1Var11;
                }
                return (aa1) objP;
            }
            i4 = i;
            if ((i3 & 3072) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z16 = z12 | z3;
            if (((57344 & i3) ^ 24576) > 16384) {
                i5 = i2;
                if (!((kk0) ck0Var).f(i5)) {
                }
                boolean z17 = z16 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z17 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var12 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var12);
                    objP = aa1Var12;
                } else {
                    aa1 aa1Var13 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var13);
                    objP = aa1Var13;
                }
                return (aa1) objP;
            }
            i5 = i2;
            if ((i3 & 24576) == 16384) {
            }
            boolean z18 = z16 | z7;
            kk0Var = (kk0) ck0Var;
            zH = z18 | kk0Var.h(y91Var);
            objP = kk0Var.P();
            if (zH) {
                aa1 aa1Var14 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var14);
                objP = aa1Var14;
            } else {
                aa1 aa1Var15 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var15);
                objP = aa1Var15;
            }
            return (aa1) objP;
        }
        glVar2 = glVar;
        if ((i3 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if (((i3 & 112) ^ 48) > 32) {
            elVar2 = elVar;
            if (!((kk0) ck0Var).h(elVar2)) {
                z2 = true;
            }
            boolean z19 = z | z2 | ((((i3 & 896) ^ 384) <= 256 && ((kk0) ck0Var).h(y7Var)) || (i3 & 384) == 256);
            if (((i3 & 7168) ^ 3072) > 2048) {
                i4 = i;
                if (!((kk0) ck0Var).f(i4)) {
                    z3 = true;
                }
                boolean z110 = z19 | z3;
                if (((57344 & i3) ^ 24576) > 16384) {
                    i5 = i2;
                    if (!((kk0) ck0Var).f(i5)) {
                    }
                    boolean z111 = z110 | z7;
                    kk0Var = (kk0) ck0Var;
                    zH = z111 | kk0Var.h(y91Var);
                    objP = kk0Var.P();
                    if (zH) {
                        aa1 aa1Var16 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var16);
                        objP = aa1Var16;
                    } else {
                        aa1 aa1Var17 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var17);
                        objP = aa1Var17;
                    }
                    return (aa1) objP;
                }
                i5 = i2;
                if ((i3 & 24576) == 16384) {
                }
                boolean z112 = z110 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z112 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var18 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var18);
                    objP = aa1Var18;
                } else {
                    aa1 aa1Var19 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var19);
                    objP = aa1Var19;
                }
                return (aa1) objP;
            }
            i4 = i;
            if ((i3 & 3072) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z113 = z19 | z3;
            if (((57344 & i3) ^ 24576) > 16384) {
                i5 = i2;
                if (!((kk0) ck0Var).f(i5)) {
                }
                boolean z114 = z113 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z114 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var110 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var110);
                    objP = aa1Var110;
                } else {
                    aa1 aa1Var111 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var111);
                    objP = aa1Var111;
                }
                return (aa1) objP;
            }
            i5 = i2;
            if ((i3 & 24576) == 16384) {
            }
            boolean z115 = z113 | z7;
            kk0Var = (kk0) ck0Var;
            zH = z115 | kk0Var.h(y91Var);
            objP = kk0Var.P();
            if (zH) {
                aa1 aa1Var112 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var112);
                objP = aa1Var112;
            } else {
                aa1 aa1Var113 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var113);
                objP = aa1Var113;
            }
            return (aa1) objP;
        }
        elVar2 = elVar;
        if ((i3 & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z116 = z | z2 | ((((i3 & 896) ^ 384) <= 256 && ((kk0) ck0Var).h(y7Var)) || (i3 & 384) == 256);
        if (((i3 & 7168) ^ 3072) > 2048) {
            i4 = i;
            if (!((kk0) ck0Var).f(i4)) {
                z3 = true;
            }
            boolean z117 = z116 | z3;
            if (((57344 & i3) ^ 24576) > 16384) {
                i5 = i2;
                if (!((kk0) ck0Var).f(i5)) {
                }
                boolean z118 = z117 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z118 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var114 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var114);
                    objP = aa1Var114;
                } else {
                    aa1 aa1Var115 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var115);
                    objP = aa1Var115;
                }
                return (aa1) objP;
            }
            i5 = i2;
            if ((i3 & 24576) == 16384) {
            }
            boolean z119 = z117 | z7;
            kk0Var = (kk0) ck0Var;
            zH = z119 | kk0Var.h(y91Var);
            objP = kk0Var.P();
            if (zH) {
                aa1 aa1Var116 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var116);
                objP = aa1Var116;
            } else {
                aa1 aa1Var117 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var117);
                objP = aa1Var117;
            }
            return (aa1) objP;
        }
        i4 = i;
        if ((i3 & 3072) == 2048) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z1110 = z116 | z3;
        if (((57344 & i3) ^ 24576) > 16384) {
            i5 = i2;
            if (!((kk0) ck0Var).f(i5)) {
            }
            boolean z1111 = z1110 | z7;
            kk0Var = (kk0) ck0Var;
            zH = z1111 | kk0Var.h(y91Var);
            objP = kk0Var.P();
            if (zH) {
                aa1 aa1Var118 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var118);
                objP = aa1Var118;
            } else {
                aa1 aa1Var119 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var119);
                objP = aa1Var119;
            }
            return (aa1) objP;
        }
        i5 = i2;
        if ((i3 & 24576) == 16384) {
        }
        boolean z1112 = z1110 | z7;
        kk0Var = (kk0) ck0Var;
        zH = z1112 | kk0Var.h(y91Var);
        objP = kk0Var.P();
        if (zH) {
            aa1 aa1Var1110 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
            kk0Var.l0(aa1Var1110);
            objP = aa1Var1110;
        } else {
            aa1 aa1Var1111 = new aa1(false, elVar2, glVar2, glVar2.a(), new qq0(y7Var), elVar2.a(), i4, i5, y91Var);
            kk0Var.l0(aa1Var1111);
            objP = aa1Var1111;
        }
        return (aa1) objP;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037 A[PHI: r8
  0x0037: PHI (r8v3 gl) = (r8v1 gl), (r8v4 gl) binds: [B:17:0x0035, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[PHI: r12
  0x0056: PHI (r12v3 int) = (r12v1 int), (r12v4 int) binds: [B:27:0x0054, B:23:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    public static final vb2 rowMeasurementHelper(el elVar, gl glVar, int i, ck0 ck0Var, int i2) {
        gl glVar2;
        boolean z;
        int i3;
        boolean z2;
        kk0 kk0Var;
        Object objP;
        int i4 = 1;
        boolean z3 = (((i2 & 14) ^ 6) > 4 && ((kk0) ck0Var).h(elVar)) || (i2 & 6) == 4;
        if (((i2 & 112) ^ 48) > 32) {
            glVar2 = glVar;
            if (((kk0) ck0Var).h(glVar2)) {
                z = true;
            }
            boolean z4 = z3 | z;
            if (((i2 & 896) ^ 384) > 256) {
                i3 = i;
                if (!((kk0) ck0Var).f(i3)) {
                }
                z2 = z4 | z;
                kk0Var = (kk0) ck0Var;
                objP = kk0Var.P();
                if (z2 || objP == Composer$Companion.getEmpty()) {
                    float fA = elVar.a();
                    float fA2 = glVar2.a();
                    ba1 ba1Var = ba1.f;
                    objP = new s91(new aa1(true, elVar, glVar2, fA, a, fA2, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var.a, ba1Var.b, ba1Var.c)), i4);
                    kk0Var.l0(objP);
                }
                return (vb2) objP;
            }
            i3 = i;
            boolean z5 = (i2 & 384) == 256;
            z2 = z4 | z5;
            kk0Var = (kk0) ck0Var;
            objP = kk0Var.P();
            if (z2) {
                float fA3 = elVar.a();
                float fA4 = glVar2.a();
                ba1 ba1Var2 = ba1.f;
                objP = new s91(new aa1(true, elVar, glVar2, fA3, a, fA4, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var2.a, ba1Var2.b, ba1Var2.c)), i4);
                kk0Var.l0(objP);
            } else {
                float fA5 = elVar.a();
                float fA6 = glVar2.a();
                ba1 ba1Var3 = ba1.f;
                objP = new s91(new aa1(true, elVar, glVar2, fA5, a, fA6, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var3.a, ba1Var3.b, ba1Var3.c)), i4);
                kk0Var.l0(objP);
            }
            return (vb2) objP;
        }
        glVar2 = glVar;
        if ((i2 & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean z6 = z3 | z;
        if (((i2 & 896) ^ 384) > 256) {
            i3 = i;
            if (!((kk0) ck0Var).f(i3)) {
            }
            z2 = z6 | z5;
            kk0Var = (kk0) ck0Var;
            objP = kk0Var.P();
            if (z2) {
                float fA7 = elVar.a();
                float fA8 = glVar2.a();
                ba1 ba1Var4 = ba1.f;
                objP = new s91(new aa1(true, elVar, glVar2, fA7, a, fA8, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var4.a, ba1Var4.b, ba1Var4.c)), i4);
                kk0Var.l0(objP);
            } else {
                float fA9 = elVar.a();
                float fA10 = glVar2.a();
                ba1 ba1Var5 = ba1.f;
                objP = new s91(new aa1(true, elVar, glVar2, fA9, a, fA10, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var5.a, ba1Var5.b, ba1Var5.c)), i4);
                kk0Var.l0(objP);
            }
            return (vb2) objP;
        }
        i3 = i;
        if ((i2 & 384) == 256) {
        }
        z2 = z6 | z5;
        kk0Var = (kk0) ck0Var;
        objP = kk0Var.P();
        if (z2) {
            float fA11 = elVar.a();
            float fA12 = glVar2.a();
            ba1 ba1Var6 = ba1.f;
            objP = new s91(new aa1(true, elVar, glVar2, fA11, a, fA12, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var6.a, ba1Var6.b, ba1Var6.c)), i4);
            kk0Var.l0(objP);
        } else {
            float fA13 = elVar.a();
            float fA14 = glVar2.a();
            ba1 ba1Var7 = ba1.f;
            objP = new s91(new aa1(true, elVar, glVar2, fA13, a, fA14, i3, IntCompanionObject.MAX_VALUE, new y91(ba1Var7.a, ba1Var7.b, ba1Var7.c)), i4);
            kk0Var.l0(objP);
        }
        return (vb2) objP;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[PHI: r8
  0x0020: PHI (r8v3 el) = (r8v1 el), (r8v4 el) binds: [B:9:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e A[PHI: r9
  0x003e: PHI (r9v3 gl) = (r9v1 gl), (r9v4 gl) binds: [B:19:0x003c, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[PHI: r13
  0x0077: PHI (r13v3 int) = (r13v1 int), (r13v4 int) binds: [B:37:0x0075, B:33:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098 A[PHI: r14
  0x0098: PHI (r14v3 int) = (r14v1 int), (r14v4 int) binds: [B:47:0x0096, B:43:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    public static final lg2 rowMeasurementMultiContentHelper(el elVar, gl glVar, z7 z7Var, int i, int i2, y91 y91Var, ck0 ck0Var, int i3) {
        el elVar2;
        boolean z;
        gl glVar2;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        kk0 kk0Var;
        boolean zH;
        Object objP;
        if (((i3 & 14) ^ 6) > 4) {
            elVar2 = elVar;
            if (((kk0) ck0Var).h(elVar2)) {
                z = true;
            }
            if (((i3 & 112) ^ 48) > 32) {
                glVar2 = glVar;
                if (!((kk0) ck0Var).h(glVar2)) {
                    z2 = true;
                }
                boolean z4 = z | z2 | ((((i3 & 896) ^ 384) <= 256 && ((kk0) ck0Var).h(z7Var)) || (i3 & 384) == 256);
                if (((i3 & 7168) ^ 3072) > 2048) {
                    i4 = i;
                    if (!((kk0) ck0Var).f(i4)) {
                        z3 = true;
                    }
                    boolean z5 = z4 | z3;
                    if (((57344 & i3) ^ 24576) > 16384) {
                        i5 = i2;
                        if (!((kk0) ck0Var).f(i5)) {
                        }
                        boolean z6 = z5 | z;
                        kk0Var = (kk0) ck0Var;
                        zH = z6 | kk0Var.h(y91Var);
                        objP = kk0Var.P();
                        if (zH || objP == Composer$Companion.getEmpty()) {
                            aa1 aa1Var = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                            kk0Var.l0(aa1Var);
                            objP = aa1Var;
                        }
                        return (aa1) objP;
                    }
                    i5 = i2;
                    boolean z7 = (i3 & 24576) == 16384;
                    boolean z8 = z5 | z7;
                    kk0Var = (kk0) ck0Var;
                    zH = z8 | kk0Var.h(y91Var);
                    objP = kk0Var.P();
                    if (zH) {
                        aa1 aa1Var2 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var2);
                        objP = aa1Var2;
                    } else {
                        aa1 aa1Var3 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var3);
                        objP = aa1Var3;
                    }
                    return (aa1) objP;
                }
                i4 = i;
                if ((i3 & 3072) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z9 = z4 | z3;
                if (((57344 & i3) ^ 24576) > 16384) {
                    i5 = i2;
                    if (!((kk0) ck0Var).f(i5)) {
                    }
                    boolean z10 = z9 | z7;
                    kk0Var = (kk0) ck0Var;
                    zH = z10 | kk0Var.h(y91Var);
                    objP = kk0Var.P();
                    if (zH) {
                        aa1 aa1Var4 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var4);
                        objP = aa1Var4;
                    } else {
                        aa1 aa1Var5 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var5);
                        objP = aa1Var5;
                    }
                    return (aa1) objP;
                }
                i5 = i2;
                if ((i3 & 24576) == 16384) {
                }
                boolean z11 = z9 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z11 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var6 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var6);
                    objP = aa1Var6;
                } else {
                    aa1 aa1Var7 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var7);
                    objP = aa1Var7;
                }
                return (aa1) objP;
            }
            glVar2 = glVar;
            if ((i3 & 48) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z12 = z | z2 | ((((i3 & 896) ^ 384) <= 256 && ((kk0) ck0Var).h(z7Var)) || (i3 & 384) == 256);
            if (((i3 & 7168) ^ 3072) > 2048) {
                i4 = i;
                if (!((kk0) ck0Var).f(i4)) {
                    z3 = true;
                }
                boolean z13 = z12 | z3;
                if (((57344 & i3) ^ 24576) > 16384) {
                    i5 = i2;
                    if (!((kk0) ck0Var).f(i5)) {
                    }
                    boolean z14 = z13 | z7;
                    kk0Var = (kk0) ck0Var;
                    zH = z14 | kk0Var.h(y91Var);
                    objP = kk0Var.P();
                    if (zH) {
                        aa1 aa1Var8 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var8);
                        objP = aa1Var8;
                    } else {
                        aa1 aa1Var9 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var9);
                        objP = aa1Var9;
                    }
                    return (aa1) objP;
                }
                i5 = i2;
                if ((i3 & 24576) == 16384) {
                }
                boolean z15 = z13 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z15 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var10 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var10);
                    objP = aa1Var10;
                } else {
                    aa1 aa1Var11 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var11);
                    objP = aa1Var11;
                }
                return (aa1) objP;
            }
            i4 = i;
            if ((i3 & 3072) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z16 = z12 | z3;
            if (((57344 & i3) ^ 24576) > 16384) {
                i5 = i2;
                if (!((kk0) ck0Var).f(i5)) {
                }
                boolean z17 = z16 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z17 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var12 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var12);
                    objP = aa1Var12;
                } else {
                    aa1 aa1Var13 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var13);
                    objP = aa1Var13;
                }
                return (aa1) objP;
            }
            i5 = i2;
            if ((i3 & 24576) == 16384) {
            }
            boolean z18 = z16 | z7;
            kk0Var = (kk0) ck0Var;
            zH = z18 | kk0Var.h(y91Var);
            objP = kk0Var.P();
            if (zH) {
                aa1 aa1Var14 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var14);
                objP = aa1Var14;
            } else {
                aa1 aa1Var15 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var15);
                objP = aa1Var15;
            }
            return (aa1) objP;
        }
        elVar2 = elVar;
        if ((i3 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if (((i3 & 112) ^ 48) > 32) {
            glVar2 = glVar;
            if (!((kk0) ck0Var).h(glVar2)) {
                z2 = true;
            }
            boolean z19 = z | z2 | ((((i3 & 896) ^ 384) <= 256 && ((kk0) ck0Var).h(z7Var)) || (i3 & 384) == 256);
            if (((i3 & 7168) ^ 3072) > 2048) {
                i4 = i;
                if (!((kk0) ck0Var).f(i4)) {
                    z3 = true;
                }
                boolean z110 = z19 | z3;
                if (((57344 & i3) ^ 24576) > 16384) {
                    i5 = i2;
                    if (!((kk0) ck0Var).f(i5)) {
                    }
                    boolean z111 = z110 | z7;
                    kk0Var = (kk0) ck0Var;
                    zH = z111 | kk0Var.h(y91Var);
                    objP = kk0Var.P();
                    if (zH) {
                        aa1 aa1Var16 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var16);
                        objP = aa1Var16;
                    } else {
                        aa1 aa1Var17 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                        kk0Var.l0(aa1Var17);
                        objP = aa1Var17;
                    }
                    return (aa1) objP;
                }
                i5 = i2;
                if ((i3 & 24576) == 16384) {
                }
                boolean z112 = z110 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z112 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var18 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var18);
                    objP = aa1Var18;
                } else {
                    aa1 aa1Var19 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var19);
                    objP = aa1Var19;
                }
                return (aa1) objP;
            }
            i4 = i;
            if ((i3 & 3072) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z113 = z19 | z3;
            if (((57344 & i3) ^ 24576) > 16384) {
                i5 = i2;
                if (!((kk0) ck0Var).f(i5)) {
                }
                boolean z114 = z113 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z114 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var110 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var110);
                    objP = aa1Var110;
                } else {
                    aa1 aa1Var111 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var111);
                    objP = aa1Var111;
                }
                return (aa1) objP;
            }
            i5 = i2;
            if ((i3 & 24576) == 16384) {
            }
            boolean z115 = z113 | z7;
            kk0Var = (kk0) ck0Var;
            zH = z115 | kk0Var.h(y91Var);
            objP = kk0Var.P();
            if (zH) {
                aa1 aa1Var112 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var112);
                objP = aa1Var112;
            } else {
                aa1 aa1Var113 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var113);
                objP = aa1Var113;
            }
            return (aa1) objP;
        }
        glVar2 = glVar;
        if ((i3 & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z116 = z | z2 | ((((i3 & 896) ^ 384) <= 256 && ((kk0) ck0Var).h(z7Var)) || (i3 & 384) == 256);
        if (((i3 & 7168) ^ 3072) > 2048) {
            i4 = i;
            if (!((kk0) ck0Var).f(i4)) {
                z3 = true;
            }
            boolean z117 = z116 | z3;
            if (((57344 & i3) ^ 24576) > 16384) {
                i5 = i2;
                if (!((kk0) ck0Var).f(i5)) {
                }
                boolean z118 = z117 | z7;
                kk0Var = (kk0) ck0Var;
                zH = z118 | kk0Var.h(y91Var);
                objP = kk0Var.P();
                if (zH) {
                    aa1 aa1Var114 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var114);
                    objP = aa1Var114;
                } else {
                    aa1 aa1Var115 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                    kk0Var.l0(aa1Var115);
                    objP = aa1Var115;
                }
                return (aa1) objP;
            }
            i5 = i2;
            if ((i3 & 24576) == 16384) {
            }
            boolean z119 = z117 | z7;
            kk0Var = (kk0) ck0Var;
            zH = z119 | kk0Var.h(y91Var);
            objP = kk0Var.P();
            if (zH) {
                aa1 aa1Var116 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var116);
                objP = aa1Var116;
            } else {
                aa1 aa1Var117 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var117);
                objP = aa1Var117;
            }
            return (aa1) objP;
        }
        i4 = i;
        if ((i3 & 3072) == 2048) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z1110 = z116 | z3;
        if (((57344 & i3) ^ 24576) > 16384) {
            i5 = i2;
            if (!((kk0) ck0Var).f(i5)) {
            }
            boolean z1111 = z1110 | z7;
            kk0Var = (kk0) ck0Var;
            zH = z1111 | kk0Var.h(y91Var);
            objP = kk0Var.P();
            if (zH) {
                aa1 aa1Var118 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var118);
                objP = aa1Var118;
            } else {
                aa1 aa1Var119 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
                kk0Var.l0(aa1Var119);
                objP = aa1Var119;
            }
            return (aa1) objP;
        }
        i5 = i2;
        if ((i3 & 24576) == 16384) {
        }
        boolean z1112 = z1110 | z7;
        kk0Var = (kk0) ck0Var;
        zH = z1112 | kk0Var.h(y91Var);
        objP = kk0Var.P();
        if (zH) {
            aa1 aa1Var1110 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
            kk0Var.l0(aa1Var1110);
            objP = aa1Var1110;
        } else {
            aa1 aa1Var1111 = new aa1(true, elVar2, glVar2, elVar2.a(), new rq0(z7Var), glVar2.a(), i4, i5, y91Var);
            kk0Var.l0(aa1Var1111);
            objP = aa1Var1111;
        }
        return (aa1) objP;
    }
}
