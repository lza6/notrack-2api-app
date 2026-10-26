package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class hf2 {
    public static final long a = av1.b(0.5f, 0.0f);

    /* JADX WARN: Code duplicated, block: B:100:0x0113  */
    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:103:0x011a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x012e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0137  */
    /* JADX WARN: Code duplicated, block: B:114:0x013b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x014a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0151  */
    /* JADX WARN: Code duplicated, block: B:125:0x0158  */
    /* JADX WARN: Code duplicated, block: B:127:0x015c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0166  */
    /* JADX WARN: Code duplicated, block: B:130:0x0169  */
    /* JADX WARN: Code duplicated, block: B:134:0x0171  */
    /* JADX WARN: Code duplicated, block: B:136:0x0176  */
    /* JADX WARN: Code duplicated, block: B:138:0x017a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0182  */
    /* JADX WARN: Code duplicated, block: B:141:0x0185  */
    /* JADX WARN: Code duplicated, block: B:145:0x0193  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:175:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0217  */
    /* JADX WARN: Code duplicated, block: B:177:0x021a  */
    /* JADX WARN: Code duplicated, block: B:180:0x021f  */
    /* JADX WARN: Code duplicated, block: B:182:0x022a  */
    /* JADX WARN: Code duplicated, block: B:183:0x022d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0235  */
    /* JADX WARN: Code duplicated, block: B:187:0x023d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0242  */
    /* JADX WARN: Code duplicated, block: B:193:0x024c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0257  */
    /* JADX WARN: Code duplicated, block: B:196:0x025b  */
    /* JADX WARN: Code duplicated, block: B:197:0x025e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0264  */
    /* JADX WARN: Code duplicated, block: B:201:0x026c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0270  */
    /* JADX WARN: Code duplicated, block: B:204:0x0273  */
    /* JADX WARN: Code duplicated, block: B:207:0x0279  */
    /* JADX WARN: Code duplicated, block: B:208:0x027e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0282  */
    /* JADX WARN: Code duplicated, block: B:212:0x0299  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:218:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:220:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:226:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:227:0x02de  */
    /* JADX WARN: Code duplicated, block: B:230:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:232:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:235:0x0301  */
    /* JADX WARN: Code duplicated, block: B:237:0x0307  */
    /* JADX WARN: Code duplicated, block: B:243:0x0312  */
    /* JADX WARN: Code duplicated, block: B:244:0x0314  */
    /* JADX WARN: Code duplicated, block: B:247:0x031c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0322  */
    /* JADX WARN: Code duplicated, block: B:252:0x033a  */
    /* JADX WARN: Code duplicated, block: B:255:0x0347  */
    /* JADX WARN: Code duplicated, block: B:257:0x034d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0361  */
    /* JADX WARN: Code duplicated, block: B:264:0x0363  */
    /* JADX WARN: Code duplicated, block: B:267:0x036b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0371  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:272:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:274:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:276:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:281:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:283:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:288:0x0401  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a  */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x01b9, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    public static final void m206x750f78f8(je1 je1Var, c cVar, hh3 hh3Var, float f, rg3 rg3Var, long j, long j2, float f2, long j3, ne1 ne1Var, ne1 ne1Var2, if2 if2Var, oe1 oe1Var, ck0 ck0Var, int i, int i2, int i3) {
        int i4;
        c cVar2;
        hh3 hh3VarRememberModalBottomSheetState;
        int i5;
        int i6;
        rg3 expandedShape;
        long containerColor;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        c cVar3;
        float f3;
        int i18;
        ow owVar;
        int i19;
        long jM2x310ea166;
        float f4;
        long scrimColor;
        ne1 ne1Var3;
        ne1 ne1Var4;
        if2 if2Var2;
        c cVar4;
        ne1 ne1Var5;
        float f5;
        long j4;
        float f6;
        rg3 rg3Var2;
        ne1 ne1Var6;
        long j5;
        long j6;
        Object objP;
        gq0 gq0Var;
        int i20;
        int i21;
        boolean z;
        boolean z2;
        Object objP2;
        boolean z3;
        boolean z4;
        Object objP3;
        Object objP4;
        ue ueVar;
        boolean z5;
        boolean z6;
        Object objP5;
        kk0 kk0Var;
        hh3 hh3Var2;
        if2 if2Var3;
        long j7;
        float f7;
        rg3 rg3Var3;
        long j8;
        long j9;
        float f8;
        ne1 ne1Var7;
        ne1 ne1Var8;
        boolean z7;
        Object objP6;
        w33 w33VarV;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(2132719801);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (kk0Var2.j(je1Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i27 = i3 & 2;
        if (i27 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i4 |= kk0Var2.h(cVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0) {
                    hh3VarRememberModalBottomSheetState = hh3Var;
                    if (kk0Var2.h(hh3VarRememberModalBottomSheetState)) {
                        i26 = FontInfo.NUMBER_OF_CHAR_CODES;
                    }
                    i4 |= i26;
                } else {
                    hh3VarRememberModalBottomSheetState = hh3Var;
                }
                i26 = Uuid.SIZE_BITS;
                i4 |= i26;
            } else {
                hh3VarRememberModalBottomSheetState = hh3Var;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    if (kk0Var2.e(f)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        expandedShape = rg3Var;
                        if (kk0Var2.h(expandedShape)) {
                            i25 = 16384;
                        }
                        i4 |= i25;
                    } else {
                        expandedShape = rg3Var;
                    }
                    i25 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i4 |= i25;
                } else {
                    expandedShape = rg3Var;
                }
                if ((i & 196608) == 0) {
                    containerColor = j;
                    if ((i3 & 32) == 0 || !kk0Var2.g(containerColor)) {
                        i24 = 65536;
                    } else {
                        i24 = 131072;
                    }
                    i4 |= i24;
                } else {
                    containerColor = j;
                }
                if ((i & 1572864) != 0) {
                    if ((i3 & 64) == 0 || !kk0Var2.g(j2)) {
                        i23 = 524288;
                    } else {
                        i23 = 1048576;
                    }
                    i4 |= i23;
                }
                i7 = i3 & Uuid.SIZE_BITS;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var2.e(f2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                        i22 = i4;
                        int i28 = kk0Var2.g(j3) ? 67108864 : 33554432;
                        i9 = i22 | i28;
                    } else {
                        i22 = i4;
                    }
                    i9 = i22 | i28;
                } else {
                    i9 = i4;
                }
                i10 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i10 != 0) {
                    i12 = i9 | 805306368;
                } else {
                    if ((i & 805306368) == 0) {
                        int i29 = i9;
                        if (kk0Var2.j(ne1Var)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i11 = i29 | i13;
                    } else {
                        i11 = i9;
                    }
                    i12 = i11;
                }
                if ((i2 & 6) == 0) {
                    i14 = (((i3 & 1024) == 0 || !kk0Var2.j(ne1Var2)) ? 2 : 4) | i2;
                } else {
                    i14 = i2;
                }
                i15 = i3 & 2048;
                if (i15 != 0) {
                    if ((i2 & 48) == 0) {
                        if (kk0Var2.h(if2Var)) {
                            i16 = 32;
                        } else {
                            i16 = 16;
                        }
                        i14 |= i16;
                    }
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        if ((i2 & 384) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i17 = FontInfo.NUMBER_OF_CHAR_CODES;
                            } else {
                                i17 = Uuid.SIZE_BITS;
                            }
                            i14 |= i17;
                        }
                        if ((i12 & 306783379) != 306783378 && (i14 & 147) == 146 && kk0Var2.F()) {
                            kk0Var2.V();
                            ne1Var8 = ne1Var2;
                            if2Var3 = if2Var;
                            kk0Var = kk0Var2;
                            j8 = containerColor;
                            cVar4 = cVar2;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            rg3Var3 = expandedShape;
                            f7 = f;
                            j9 = j2;
                            f8 = f2;
                            j7 = j3;
                            ne1Var7 = ne1Var;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0 || kk0Var2.D()) {
                                if (i27 != 0) {
                                    cVar3 = c.i;
                                } else {
                                    cVar3 = cVar2;
                                }
                                if ((i3 & 4) != 0) {
                                    i12 &= -897;
                                    hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i5 != 0) {
                                    f3 = 640.0f;
                                } else {
                                    f3 = f;
                                }
                                i18 = i3 & 16;
                                owVar = ow.a;
                                if (i18 != 0) {
                                    i19 = 6;
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i12 &= -57345;
                                } else {
                                    i19 = 6;
                                }
                                if ((i3 & 32) != 0) {
                                    containerColor = owVar.getContainerColor(kk0Var2, i19);
                                    i12 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                    i12 &= -3670017;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if (i7 != 0) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = f2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                    i12 &= -234881025;
                                } else {
                                    scrimColor = j3;
                                }
                                if (i10 != 0) {
                                    ne1Var3 = cj0.a;
                                } else {
                                    ne1Var3 = ne1Var;
                                }
                                if ((i3 & 1024) != 0) {
                                    i14 &= -15;
                                    ne1Var4 = ue2.c;
                                } else {
                                    ne1Var4 = ne1Var2;
                                }
                                if (i15 != 0) {
                                    if2Var2 = le2.a;
                                } else {
                                    if2Var2 = if2Var;
                                }
                                cVar4 = cVar3;
                                ne1Var5 = ne1Var3;
                                f5 = f3;
                                j4 = containerColor;
                                f6 = f4;
                                rg3Var2 = expandedShape;
                                ne1Var6 = ne1Var4;
                                j5 = jM2x310ea166;
                                j6 = scrimColor;
                            } else {
                                kk0Var2.V();
                                if ((i3 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i3 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i12 &= -234881025;
                                }
                                if ((i3 & 1024) != 0) {
                                    i14 &= -15;
                                }
                                f5 = f;
                                j5 = j2;
                                f6 = f2;
                                ne1Var5 = ne1Var;
                                ne1Var6 = ne1Var2;
                                if2Var2 = if2Var;
                                j4 = containerColor;
                                cVar4 = cVar2;
                                rg3Var2 = expandedShape;
                                j6 = j3;
                            }
                            kk0Var2.s();
                            objP = kk0Var2.P();
                            if (objP == Composer$Companion.getEmpty()) {
                                al0 al0Var = new al0(r11.a(x21.c, kk0Var2));
                                kk0Var2.l0(al0Var);
                                objP = al0Var;
                            }
                            gq0Var = ((al0) objP).c;
                            i20 = (i12 & 896) ^ 384;
                            boolean zJ = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                            i21 = i12 & 14;
                            if (i21 == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = zJ | z;
                            objP2 = kk0Var2.P();
                            if (z2 || objP2 == Composer$Companion.getEmpty()) {
                                objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                                kk0Var2.l0(objP2);
                            }
                            je1 je1Var2 = (je1) objP2;
                            boolean zJ2 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                            if (i21 == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z4 = zJ2 | z3;
                            objP3 = kk0Var2.P();
                            if (z4 || objP3 == Composer$Companion.getEmpty()) {
                                objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                                kk0Var2.l0(objP3);
                            }
                            le1 le1Var = (le1) objP3;
                            objP4 = kk0Var2.P();
                            if (objP4 == Composer$Companion.getEmpty()) {
                                objP4 = kr1.a(0.0f);
                                kk0Var2.l0(objP4);
                            }
                            ueVar = (ue) objP4;
                            boolean zJ3 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                            if (i21 == 4) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = zJ3 | z5;
                            objP5 = kk0Var2.P();
                            if (z6 || objP5 == Composer$Companion.getEmpty()) {
                                objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                                kk0Var2.l0(objP5);
                            }
                            mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var2, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                            kk0Var = kk0Var2;
                            if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                                z7 = (i20 <= 256 && kk0Var.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256;
                                objP6 = kk0Var.P();
                                if (z7 || objP6 == Composer$Companion.getEmpty()) {
                                    objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                    kk0Var.l0(objP6);
                                }
                                r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                            }
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            if2Var3 = if2Var2;
                            j7 = j6;
                            f7 = f5;
                            rg3Var3 = rg3Var2;
                            j8 = j4;
                            j9 = j5;
                            f8 = f6;
                            ne1Var7 = ne1Var5;
                            ne1Var8 = ne1Var6;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                        }
                    }
                    i14 |= 384;
                    if ((i12 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        } else {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        }
                        kk0Var2.s();
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            al0 al0Var2 = new al0(r11.a(x21.c, kk0Var2));
                            kk0Var2.l0(al0Var2);
                            objP = al0Var2;
                        }
                        gq0Var = ((al0) objP).c;
                        i20 = (i12 & 896) ^ 384;
                        boolean zJ4 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                        i21 = i12 & 14;
                        if (i21 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = zJ4 | z;
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        }
                        je1 je1Var3 = (je1) objP2;
                        boolean zJ5 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                        if (i21 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = zJ5 | z3;
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        }
                        le1 le1Var2 = (le1) objP3;
                        objP4 = kk0Var2.P();
                        if (objP4 == Composer$Companion.getEmpty()) {
                            objP4 = kr1.a(0.0f);
                            kk0Var2.l0(objP4);
                        }
                        ueVar = (ue) objP4;
                        boolean zJ6 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                        if (i21 == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zJ6 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        }
                        mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var3, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var2, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                        kk0Var = kk0Var2;
                        if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                            if (i20 <= 256) {
                            }
                            objP6 = kk0Var.P();
                            if (z7) {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            } else {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            }
                            r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                        }
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        if2Var3 = if2Var2;
                        j7 = j6;
                        f7 = f5;
                        rg3Var3 = rg3Var2;
                        j8 = j4;
                        j9 = j5;
                        f8 = f6;
                        ne1Var7 = ne1Var5;
                        ne1Var8 = ne1Var6;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        } else {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        }
                        kk0Var2.s();
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            al0 al0Var3 = new al0(r11.a(x21.c, kk0Var2));
                            kk0Var2.l0(al0Var3);
                            objP = al0Var3;
                        }
                        gq0Var = ((al0) objP).c;
                        i20 = (i12 & 896) ^ 384;
                        boolean zJ7 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                        i21 = i12 & 14;
                        if (i21 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = zJ7 | z;
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        }
                        je1 je1Var4 = (je1) objP2;
                        boolean zJ8 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                        if (i21 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = zJ8 | z3;
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        }
                        le1 le1Var3 = (le1) objP3;
                        objP4 = kk0Var2.P();
                        if (objP4 == Composer$Companion.getEmpty()) {
                            objP4 = kr1.a(0.0f);
                            kk0Var2.l0(objP4);
                        }
                        ueVar = (ue) objP4;
                        boolean zJ9 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                        if (i21 == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zJ9 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        }
                        mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var4, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var3, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                        kk0Var = kk0Var2;
                        if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                            if (i20 <= 256) {
                            }
                            objP6 = kk0Var.P();
                            if (z7) {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            } else {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            }
                            r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                        }
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        if2Var3 = if2Var2;
                        j7 = j6;
                        f7 = f5;
                        rg3Var3 = rg3Var2;
                        j8 = j4;
                        j9 = j5;
                        f8 = f6;
                        ne1Var7 = ne1Var5;
                        ne1Var8 = ne1Var6;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                    }
                }
                i14 |= 48;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    if ((i2 & 384) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i17 = FontInfo.NUMBER_OF_CHAR_CODES;
                        } else {
                            i17 = Uuid.SIZE_BITS;
                        }
                        i14 |= i17;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        } else {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        }
                        kk0Var2.s();
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            al0 al0Var4 = new al0(r11.a(x21.c, kk0Var2));
                            kk0Var2.l0(al0Var4);
                            objP = al0Var4;
                        }
                        gq0Var = ((al0) objP).c;
                        i20 = (i12 & 896) ^ 384;
                        boolean zJ10 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                        i21 = i12 & 14;
                        if (i21 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = zJ10 | z;
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        }
                        je1 je1Var5 = (je1) objP2;
                        boolean zJ11 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                        if (i21 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = zJ11 | z3;
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        }
                        le1 le1Var4 = (le1) objP3;
                        objP4 = kk0Var2.P();
                        if (objP4 == Composer$Companion.getEmpty()) {
                            objP4 = kr1.a(0.0f);
                            kk0Var2.l0(objP4);
                        }
                        ueVar = (ue) objP4;
                        boolean zJ12 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                        if (i21 == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zJ12 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        }
                        mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var5, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var4, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                        kk0Var = kk0Var2;
                        if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                            if (i20 <= 256) {
                            }
                            objP6 = kk0Var.P();
                            if (z7) {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            } else {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            }
                            r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                        }
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        if2Var3 = if2Var2;
                        j7 = j6;
                        f7 = f5;
                        rg3Var3 = rg3Var2;
                        j8 = j4;
                        j9 = j5;
                        f8 = f6;
                        ne1Var7 = ne1Var5;
                        ne1Var8 = ne1Var6;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        } else {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        }
                        kk0Var2.s();
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            al0 al0Var5 = new al0(r11.a(x21.c, kk0Var2));
                            kk0Var2.l0(al0Var5);
                            objP = al0Var5;
                        }
                        gq0Var = ((al0) objP).c;
                        i20 = (i12 & 896) ^ 384;
                        boolean zJ13 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                        i21 = i12 & 14;
                        if (i21 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = zJ13 | z;
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        }
                        je1 je1Var6 = (je1) objP2;
                        boolean zJ14 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                        if (i21 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = zJ14 | z3;
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        }
                        le1 le1Var5 = (le1) objP3;
                        objP4 = kk0Var2.P();
                        if (objP4 == Composer$Companion.getEmpty()) {
                            objP4 = kr1.a(0.0f);
                            kk0Var2.l0(objP4);
                        }
                        ueVar = (ue) objP4;
                        boolean zJ15 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                        if (i21 == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zJ15 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        }
                        mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var6, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var5, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                        kk0Var = kk0Var2;
                        if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                            if (i20 <= 256) {
                            }
                            objP6 = kk0Var.P();
                            if (z7) {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            } else {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            }
                            r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                        }
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        if2Var3 = if2Var2;
                        j7 = j6;
                        f7 = f5;
                        rg3Var3 = rg3Var2;
                        j8 = j4;
                        j9 = j5;
                        f8 = f6;
                        ne1Var7 = ne1Var5;
                        ne1Var8 = ne1Var6;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                    }
                }
                i14 |= 384;
                if ((i12 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var6 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var6);
                        objP = al0Var6;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ16 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ16 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var7 = (je1) objP2;
                    boolean zJ17 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ17 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var6 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ18 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ18 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var7, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var6, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var7 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var7);
                        objP = al0Var7;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ19 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ19 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var8 = (je1) objP2;
                    boolean zJ110 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ110 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var7 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ111 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ111 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var8, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var7, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                }
            }
            i4 |= 3072;
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    expandedShape = rg3Var;
                    if (kk0Var2.h(expandedShape)) {
                        i25 = 16384;
                    }
                    i4 |= i25;
                } else {
                    expandedShape = rg3Var;
                }
                i25 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i4 |= i25;
            } else {
                expandedShape = rg3Var;
            }
            if ((i & 196608) == 0) {
                containerColor = j;
                if ((i3 & 32) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i4 |= i24;
            } else {
                containerColor = j;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i4 |= i23;
            }
            i7 = i3 & Uuid.SIZE_BITS;
            if (i7 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.e(f2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                    i22 = i4;
                    if (kk0Var2.g(j3)) {
                    }
                    i9 = i22 | i28;
                } else {
                    i22 = i4;
                }
                i9 = i22 | i28;
            } else {
                i9 = i4;
            }
            i10 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i10 != 0) {
                i12 = i9 | 805306368;
            } else {
                if ((i & 805306368) == 0) {
                    int i210 = i9;
                    if (kk0Var2.j(ne1Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i11 = i210 | i13;
                } else {
                    i11 = i9;
                }
                i12 = i11;
            }
            if ((i2 & 6) == 0) {
                i14 = (((i3 & 1024) == 0 || !kk0Var2.j(ne1Var2)) ? 2 : 4) | i2;
            } else {
                i14 = i2;
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
                if ((i2 & 48) == 0) {
                    if (kk0Var2.h(if2Var)) {
                        i16 = 32;
                    } else {
                        i16 = 16;
                    }
                    i14 |= i16;
                }
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    if ((i2 & 384) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i17 = FontInfo.NUMBER_OF_CHAR_CODES;
                        } else {
                            i17 = Uuid.SIZE_BITS;
                        }
                        i14 |= i17;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        } else {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        }
                        kk0Var2.s();
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            al0 al0Var8 = new al0(r11.a(x21.c, kk0Var2));
                            kk0Var2.l0(al0Var8);
                            objP = al0Var8;
                        }
                        gq0Var = ((al0) objP).c;
                        i20 = (i12 & 896) ^ 384;
                        boolean zJ112 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                        i21 = i12 & 14;
                        if (i21 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = zJ112 | z;
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        }
                        je1 je1Var9 = (je1) objP2;
                        boolean zJ113 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                        if (i21 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = zJ113 | z3;
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        }
                        le1 le1Var8 = (le1) objP3;
                        objP4 = kk0Var2.P();
                        if (objP4 == Composer$Companion.getEmpty()) {
                            objP4 = kr1.a(0.0f);
                            kk0Var2.l0(objP4);
                        }
                        ueVar = (ue) objP4;
                        boolean zJ114 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                        if (i21 == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zJ114 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        }
                        mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var9, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var8, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                        kk0Var = kk0Var2;
                        if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                            if (i20 <= 256) {
                            }
                            objP6 = kk0Var.P();
                            if (z7) {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            } else {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            }
                            r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                        }
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        if2Var3 = if2Var2;
                        j7 = j6;
                        f7 = f5;
                        rg3Var3 = rg3Var2;
                        j8 = j4;
                        j9 = j5;
                        f8 = f6;
                        ne1Var7 = ne1Var5;
                        ne1Var8 = ne1Var6;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        } else {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        }
                        kk0Var2.s();
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            al0 al0Var9 = new al0(r11.a(x21.c, kk0Var2));
                            kk0Var2.l0(al0Var9);
                            objP = al0Var9;
                        }
                        gq0Var = ((al0) objP).c;
                        i20 = (i12 & 896) ^ 384;
                        boolean zJ115 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                        i21 = i12 & 14;
                        if (i21 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = zJ115 | z;
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        }
                        je1 je1Var10 = (je1) objP2;
                        boolean zJ116 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                        if (i21 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = zJ116 | z3;
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        }
                        le1 le1Var9 = (le1) objP3;
                        objP4 = kk0Var2.P();
                        if (objP4 == Composer$Companion.getEmpty()) {
                            objP4 = kr1.a(0.0f);
                            kk0Var2.l0(objP4);
                        }
                        ueVar = (ue) objP4;
                        boolean zJ117 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                        if (i21 == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zJ117 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        }
                        mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var10, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var9, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                        kk0Var = kk0Var2;
                        if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                            if (i20 <= 256) {
                            }
                            objP6 = kk0Var.P();
                            if (z7) {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            } else {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            }
                            r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                        }
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        if2Var3 = if2Var2;
                        j7 = j6;
                        f7 = f5;
                        rg3Var3 = rg3Var2;
                        j8 = j4;
                        j9 = j5;
                        f8 = f6;
                        ne1Var7 = ne1Var5;
                        ne1Var8 = ne1Var6;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                    }
                }
                i14 |= 384;
                if ((i12 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var10 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var10);
                        objP = al0Var10;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ118 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ118 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var11 = (je1) objP2;
                    boolean zJ119 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ119 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var10 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ1110 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ1110 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var11, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var10, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var11 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var11);
                        objP = al0Var11;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ1111 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ1111 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var12 = (je1) objP2;
                    boolean zJ1112 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ1112 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var11 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ1113 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ1113 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var12, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var11, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                }
            }
            i14 |= 48;
            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                if ((i2 & 384) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i17 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i17 = Uuid.SIZE_BITS;
                    }
                    i14 |= i17;
                }
                if ((i12 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var12 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var12);
                        objP = al0Var12;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ1114 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ1114 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var13 = (je1) objP2;
                    boolean zJ1115 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ1115 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var12 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ1116 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ1116 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var13, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var12, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var13 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var13);
                        objP = al0Var13;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ1117 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ1117 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var14 = (je1) objP2;
                    boolean zJ1118 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ1118 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var13 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ1119 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ1119 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var14, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var13, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                }
            }
            i14 |= 384;
            if ((i12 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                } else {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                }
                kk0Var2.s();
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var14 = new al0(r11.a(x21.c, kk0Var2));
                    kk0Var2.l0(al0Var14);
                    objP = al0Var14;
                }
                gq0Var = ((al0) objP).c;
                i20 = (i12 & 896) ^ 384;
                boolean zJ11110 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                i21 = i12 & 14;
                if (i21 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ11110 | z;
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                }
                je1 je1Var15 = (je1) objP2;
                boolean zJ11111 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                if (i21 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zJ11111 | z3;
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                }
                le1 le1Var14 = (le1) objP3;
                objP4 = kk0Var2.P();
                if (objP4 == Composer$Companion.getEmpty()) {
                    objP4 = kr1.a(0.0f);
                    kk0Var2.l0(objP4);
                }
                ueVar = (ue) objP4;
                boolean zJ11112 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                if (i21 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zJ11112 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                }
                mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var15, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var14, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                kk0Var = kk0Var2;
                if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                    if (i20 <= 256) {
                    }
                    objP6 = kk0Var.P();
                    if (z7) {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    } else {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    }
                    r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                }
                hh3Var2 = hh3VarRememberModalBottomSheetState;
                if2Var3 = if2Var2;
                j7 = j6;
                f7 = f5;
                rg3Var3 = rg3Var2;
                j8 = j4;
                j9 = j5;
                f8 = f6;
                ne1Var7 = ne1Var5;
                ne1Var8 = ne1Var6;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                } else {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                }
                kk0Var2.s();
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var15 = new al0(r11.a(x21.c, kk0Var2));
                    kk0Var2.l0(al0Var15);
                    objP = al0Var15;
                }
                gq0Var = ((al0) objP).c;
                i20 = (i12 & 896) ^ 384;
                boolean zJ11113 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                i21 = i12 & 14;
                if (i21 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ11113 | z;
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                }
                je1 je1Var16 = (je1) objP2;
                boolean zJ11114 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                if (i21 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zJ11114 | z3;
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                }
                le1 le1Var15 = (le1) objP3;
                objP4 = kk0Var2.P();
                if (objP4 == Composer$Companion.getEmpty()) {
                    objP4 = kr1.a(0.0f);
                    kk0Var2.l0(objP4);
                }
                ueVar = (ue) objP4;
                boolean zJ11115 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                if (i21 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zJ11115 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                }
                mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var16, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var15, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                kk0Var = kk0Var2;
                if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                    if (i20 <= 256) {
                    }
                    objP6 = kk0Var.P();
                    if (z7) {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    } else {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    }
                    r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                }
                hh3Var2 = hh3VarRememberModalBottomSheetState;
                if2Var3 = if2Var2;
                j7 = j6;
                f7 = f5;
                rg3Var3 = rg3Var2;
                j8 = j4;
                j9 = j5;
                f8 = f6;
                ne1Var7 = ne1Var5;
                ne1Var8 = ne1Var6;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
            }
        }
        i4 |= 48;
        cVar2 = cVar;
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                hh3VarRememberModalBottomSheetState = hh3Var;
                if (kk0Var2.h(hh3VarRememberModalBottomSheetState)) {
                    i26 = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                i4 |= i26;
            } else {
                hh3VarRememberModalBottomSheetState = hh3Var;
            }
            i26 = Uuid.SIZE_BITS;
            i4 |= i26;
        } else {
            hh3VarRememberModalBottomSheetState = hh3Var;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                if (kk0Var2.e(f)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    expandedShape = rg3Var;
                    if (kk0Var2.h(expandedShape)) {
                        i25 = 16384;
                    }
                    i4 |= i25;
                } else {
                    expandedShape = rg3Var;
                }
                i25 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i4 |= i25;
            } else {
                expandedShape = rg3Var;
            }
            if ((i & 196608) == 0) {
                containerColor = j;
                if ((i3 & 32) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i4 |= i24;
            } else {
                containerColor = j;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i4 |= i23;
            }
            i7 = i3 & Uuid.SIZE_BITS;
            if (i7 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var2.e(f2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                    i22 = i4;
                    if (kk0Var2.g(j3)) {
                    }
                    i9 = i22 | i28;
                } else {
                    i22 = i4;
                }
                i9 = i22 | i28;
            } else {
                i9 = i4;
            }
            i10 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i10 != 0) {
                i12 = i9 | 805306368;
            } else {
                if ((i & 805306368) == 0) {
                    int i211 = i9;
                    if (kk0Var2.j(ne1Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i11 = i211 | i13;
                } else {
                    i11 = i9;
                }
                i12 = i11;
            }
            if ((i2 & 6) == 0) {
                i14 = (((i3 & 1024) == 0 || !kk0Var2.j(ne1Var2)) ? 2 : 4) | i2;
            } else {
                i14 = i2;
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
                if ((i2 & 48) == 0) {
                    if (kk0Var2.h(if2Var)) {
                        i16 = 32;
                    } else {
                        i16 = 16;
                    }
                    i14 |= i16;
                }
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    if ((i2 & 384) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i17 = FontInfo.NUMBER_OF_CHAR_CODES;
                        } else {
                            i17 = Uuid.SIZE_BITS;
                        }
                        i14 |= i17;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        } else {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        }
                        kk0Var2.s();
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            al0 al0Var16 = new al0(r11.a(x21.c, kk0Var2));
                            kk0Var2.l0(al0Var16);
                            objP = al0Var16;
                        }
                        gq0Var = ((al0) objP).c;
                        i20 = (i12 & 896) ^ 384;
                        boolean zJ11116 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                        i21 = i12 & 14;
                        if (i21 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = zJ11116 | z;
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        }
                        je1 je1Var17 = (je1) objP2;
                        boolean zJ11117 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                        if (i21 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = zJ11117 | z3;
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        }
                        le1 le1Var16 = (le1) objP3;
                        objP4 = kk0Var2.P();
                        if (objP4 == Composer$Companion.getEmpty()) {
                            objP4 = kr1.a(0.0f);
                            kk0Var2.l0(objP4);
                        }
                        ueVar = (ue) objP4;
                        boolean zJ11118 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                        if (i21 == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zJ11118 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        }
                        mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var17, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var16, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                        kk0Var = kk0Var2;
                        if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                            if (i20 <= 256) {
                            }
                            objP6 = kk0Var.P();
                            if (z7) {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            } else {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            }
                            r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                        }
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        if2Var3 = if2Var2;
                        j7 = j6;
                        f7 = f5;
                        rg3Var3 = rg3Var2;
                        j8 = j4;
                        j9 = j5;
                        f8 = f6;
                        ne1Var7 = ne1Var5;
                        ne1Var8 = ne1Var6;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        } else {
                            if (i27 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if ((i3 & 4) != 0) {
                                i12 &= -897;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i5 != 0) {
                                f3 = 640.0f;
                            } else {
                                f3 = f;
                            }
                            i18 = i3 & 16;
                            owVar = ow.a;
                            if (i18 != 0) {
                                i19 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i12 &= -57345;
                            } else {
                                i19 = 6;
                            }
                            if ((i3 & 32) != 0) {
                                containerColor = owVar.getContainerColor(kk0Var2, i19);
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i7 != 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                scrimColor = owVar.getScrimColor(kk0Var2, 6);
                                i12 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            if (i10 != 0) {
                                ne1Var3 = cj0.a;
                            } else {
                                ne1Var3 = ne1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                                ne1Var4 = ue2.c;
                            } else {
                                ne1Var4 = ne1Var2;
                            }
                            if (i15 != 0) {
                                if2Var2 = le2.a;
                            } else {
                                if2Var2 = if2Var;
                            }
                            cVar4 = cVar3;
                            ne1Var5 = ne1Var3;
                            f5 = f3;
                            j4 = containerColor;
                            f6 = f4;
                            rg3Var2 = expandedShape;
                            ne1Var6 = ne1Var4;
                            j5 = jM2x310ea166;
                            j6 = scrimColor;
                        }
                        kk0Var2.s();
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            al0 al0Var17 = new al0(r11.a(x21.c, kk0Var2));
                            kk0Var2.l0(al0Var17);
                            objP = al0Var17;
                        }
                        gq0Var = ((al0) objP).c;
                        i20 = (i12 & 896) ^ 384;
                        boolean zJ11119 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                        i21 = i12 & 14;
                        if (i21 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = zJ11119 | z;
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                            kk0Var2.l0(objP2);
                        }
                        je1 je1Var18 = (je1) objP2;
                        boolean zJ111110 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                        if (i21 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = zJ111110 | z3;
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                            kk0Var2.l0(objP3);
                        }
                        le1 le1Var17 = (le1) objP3;
                        objP4 = kk0Var2.P();
                        if (objP4 == Composer$Companion.getEmpty()) {
                            objP4 = kr1.a(0.0f);
                            kk0Var2.l0(objP4);
                        }
                        ueVar = (ue) objP4;
                        boolean zJ111111 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                        if (i21 == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zJ111111 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                            kk0Var2.l0(objP5);
                        }
                        mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var18, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var17, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                        kk0Var = kk0Var2;
                        if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                            if (i20 <= 256) {
                            }
                            objP6 = kk0Var.P();
                            if (z7) {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            } else {
                                objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                                kk0Var.l0(objP6);
                            }
                            r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                        }
                        hh3Var2 = hh3VarRememberModalBottomSheetState;
                        if2Var3 = if2Var2;
                        j7 = j6;
                        f7 = f5;
                        rg3Var3 = rg3Var2;
                        j8 = j4;
                        j9 = j5;
                        f8 = f6;
                        ne1Var7 = ne1Var5;
                        ne1Var8 = ne1Var6;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                    }
                }
                i14 |= 384;
                if ((i12 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var18 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var18);
                        objP = al0Var18;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ111112 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ111112 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var19 = (je1) objP2;
                    boolean zJ111113 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ111113 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var18 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ111114 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ111114 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var19, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var18, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var19 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var19);
                        objP = al0Var19;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ111115 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ111115 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var110 = (je1) objP2;
                    boolean zJ111116 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ111116 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var19 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ111117 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ111117 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var110, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var19, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                }
            }
            i14 |= 48;
            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                if ((i2 & 384) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i17 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i17 = Uuid.SIZE_BITS;
                    }
                    i14 |= i17;
                }
                if ((i12 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var110 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var110);
                        objP = al0Var110;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ111118 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ111118 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var111 = (je1) objP2;
                    boolean zJ111119 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ111119 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var110 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ1111110 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ1111110 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var111, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var110, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var111 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var111);
                        objP = al0Var111;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ1111111 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ1111111 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var112 = (je1) objP2;
                    boolean zJ1111112 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ1111112 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var111 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ1111113 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ1111113 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var112, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var111, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                }
            }
            i14 |= 384;
            if ((i12 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                } else {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                }
                kk0Var2.s();
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var112 = new al0(r11.a(x21.c, kk0Var2));
                    kk0Var2.l0(al0Var112);
                    objP = al0Var112;
                }
                gq0Var = ((al0) objP).c;
                i20 = (i12 & 896) ^ 384;
                boolean zJ1111114 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                i21 = i12 & 14;
                if (i21 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ1111114 | z;
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                }
                je1 je1Var113 = (je1) objP2;
                boolean zJ1111115 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                if (i21 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zJ1111115 | z3;
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                }
                le1 le1Var112 = (le1) objP3;
                objP4 = kk0Var2.P();
                if (objP4 == Composer$Companion.getEmpty()) {
                    objP4 = kr1.a(0.0f);
                    kk0Var2.l0(objP4);
                }
                ueVar = (ue) objP4;
                boolean zJ1111116 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                if (i21 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zJ1111116 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                }
                mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var113, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var112, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                kk0Var = kk0Var2;
                if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                    if (i20 <= 256) {
                    }
                    objP6 = kk0Var.P();
                    if (z7) {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    } else {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    }
                    r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                }
                hh3Var2 = hh3VarRememberModalBottomSheetState;
                if2Var3 = if2Var2;
                j7 = j6;
                f7 = f5;
                rg3Var3 = rg3Var2;
                j8 = j4;
                j9 = j5;
                f8 = f6;
                ne1Var7 = ne1Var5;
                ne1Var8 = ne1Var6;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                } else {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                }
                kk0Var2.s();
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var113 = new al0(r11.a(x21.c, kk0Var2));
                    kk0Var2.l0(al0Var113);
                    objP = al0Var113;
                }
                gq0Var = ((al0) objP).c;
                i20 = (i12 & 896) ^ 384;
                boolean zJ1111117 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                i21 = i12 & 14;
                if (i21 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ1111117 | z;
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                }
                je1 je1Var114 = (je1) objP2;
                boolean zJ1111118 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                if (i21 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zJ1111118 | z3;
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                }
                le1 le1Var113 = (le1) objP3;
                objP4 = kk0Var2.P();
                if (objP4 == Composer$Companion.getEmpty()) {
                    objP4 = kr1.a(0.0f);
                    kk0Var2.l0(objP4);
                }
                ueVar = (ue) objP4;
                boolean zJ1111119 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                if (i21 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zJ1111119 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                }
                mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var114, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var113, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                kk0Var = kk0Var2;
                if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                    if (i20 <= 256) {
                    }
                    objP6 = kk0Var.P();
                    if (z7) {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    } else {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    }
                    r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                }
                hh3Var2 = hh3VarRememberModalBottomSheetState;
                if2Var3 = if2Var2;
                j7 = j6;
                f7 = f5;
                rg3Var3 = rg3Var2;
                j8 = j4;
                j9 = j5;
                f8 = f6;
                ne1Var7 = ne1Var5;
                ne1Var8 = ne1Var6;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
            }
        }
        i4 |= 3072;
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                expandedShape = rg3Var;
                if (kk0Var2.h(expandedShape)) {
                    i25 = 16384;
                }
                i4 |= i25;
            } else {
                expandedShape = rg3Var;
            }
            i25 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i4 |= i25;
        } else {
            expandedShape = rg3Var;
        }
        if ((i & 196608) == 0) {
            containerColor = j;
            if ((i3 & 32) == 0) {
                i24 = 65536;
            } else {
                i24 = 65536;
            }
            i4 |= i24;
        } else {
            containerColor = j;
        }
        if ((i & 1572864) != 0) {
            if ((i3 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i4 |= i23;
        }
        i7 = i3 & Uuid.SIZE_BITS;
        if (i7 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (kk0Var2.e(f2)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i4 |= i8;
        }
        if ((i & 100663296) == 0) {
            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                i22 = i4;
                if (kk0Var2.g(j3)) {
                }
                i9 = i22 | i28;
            } else {
                i22 = i4;
            }
            i9 = i22 | i28;
        } else {
            i9 = i4;
        }
        i10 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i10 != 0) {
            i12 = i9 | 805306368;
        } else {
            if ((i & 805306368) == 0) {
                int i212 = i9;
                if (kk0Var2.j(ne1Var)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i11 = i212 | i13;
            } else {
                i11 = i9;
            }
            i12 = i11;
        }
        if ((i2 & 6) == 0) {
            i14 = (((i3 & 1024) == 0 || !kk0Var2.j(ne1Var2)) ? 2 : 4) | i2;
        } else {
            i14 = i2;
        }
        i15 = i3 & 2048;
        if (i15 != 0) {
            if ((i2 & 48) == 0) {
                if (kk0Var2.h(if2Var)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
                i14 |= i16;
            }
            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                if ((i2 & 384) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i17 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i17 = Uuid.SIZE_BITS;
                    }
                    i14 |= i17;
                }
                if ((i12 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var114 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var114);
                        objP = al0Var114;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ11111110 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ11111110 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var115 = (je1) objP2;
                    boolean zJ11111111 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ11111111 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var114 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ11111112 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ11111112 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var115, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var114, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    } else {
                        if (i27 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if ((i3 & 4) != 0) {
                            i12 &= -897;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i5 != 0) {
                            f3 = 640.0f;
                        } else {
                            f3 = f;
                        }
                        i18 = i3 & 16;
                        owVar = ow.a;
                        if (i18 != 0) {
                            i19 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i12 &= -57345;
                        } else {
                            i19 = 6;
                        }
                        if ((i3 & 32) != 0) {
                            containerColor = owVar.getContainerColor(kk0Var2, i19);
                            i12 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                            i12 &= -3670017;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i7 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            scrimColor = owVar.getScrimColor(kk0Var2, 6);
                            i12 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        if (i10 != 0) {
                            ne1Var3 = cj0.a;
                        } else {
                            ne1Var3 = ne1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            i14 &= -15;
                            ne1Var4 = ue2.c;
                        } else {
                            ne1Var4 = ne1Var2;
                        }
                        if (i15 != 0) {
                            if2Var2 = le2.a;
                        } else {
                            if2Var2 = if2Var;
                        }
                        cVar4 = cVar3;
                        ne1Var5 = ne1Var3;
                        f5 = f3;
                        j4 = containerColor;
                        f6 = f4;
                        rg3Var2 = expandedShape;
                        ne1Var6 = ne1Var4;
                        j5 = jM2x310ea166;
                        j6 = scrimColor;
                    }
                    kk0Var2.s();
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        al0 al0Var115 = new al0(r11.a(x21.c, kk0Var2));
                        kk0Var2.l0(al0Var115);
                        objP = al0Var115;
                    }
                    gq0Var = ((al0) objP).c;
                    i20 = (i12 & 896) ^ 384;
                    boolean zJ11111113 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                    i21 = i12 & 14;
                    if (i21 == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ11111113 | z;
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                        kk0Var2.l0(objP2);
                    }
                    je1 je1Var116 = (je1) objP2;
                    boolean zJ11111114 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                    if (i21 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zJ11111114 | z3;
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                        kk0Var2.l0(objP3);
                    }
                    le1 le1Var115 = (le1) objP3;
                    objP4 = kk0Var2.P();
                    if (objP4 == Composer$Companion.getEmpty()) {
                        objP4 = kr1.a(0.0f);
                        kk0Var2.l0(objP4);
                    }
                    ueVar = (ue) objP4;
                    boolean zJ11111115 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                    if (i21 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zJ11111115 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                        kk0Var2.l0(objP5);
                    }
                    mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var116, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var115, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                    kk0Var = kk0Var2;
                    if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                        if (i20 <= 256) {
                        }
                        objP6 = kk0Var.P();
                        if (z7) {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        } else {
                            objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                            kk0Var.l0(objP6);
                        }
                        r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                    }
                    hh3Var2 = hh3VarRememberModalBottomSheetState;
                    if2Var3 = if2Var2;
                    j7 = j6;
                    f7 = f5;
                    rg3Var3 = rg3Var2;
                    j8 = j4;
                    j9 = j5;
                    f8 = f6;
                    ne1Var7 = ne1Var5;
                    ne1Var8 = ne1Var6;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
                }
            }
            i14 |= 384;
            if ((i12 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                } else {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                }
                kk0Var2.s();
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var116 = new al0(r11.a(x21.c, kk0Var2));
                    kk0Var2.l0(al0Var116);
                    objP = al0Var116;
                }
                gq0Var = ((al0) objP).c;
                i20 = (i12 & 896) ^ 384;
                boolean zJ11111116 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                i21 = i12 & 14;
                if (i21 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ11111116 | z;
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                }
                je1 je1Var117 = (je1) objP2;
                boolean zJ11111117 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                if (i21 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zJ11111117 | z3;
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                }
                le1 le1Var116 = (le1) objP3;
                objP4 = kk0Var2.P();
                if (objP4 == Composer$Companion.getEmpty()) {
                    objP4 = kr1.a(0.0f);
                    kk0Var2.l0(objP4);
                }
                ueVar = (ue) objP4;
                boolean zJ11111118 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                if (i21 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zJ11111118 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                }
                mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var117, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var116, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                kk0Var = kk0Var2;
                if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                    if (i20 <= 256) {
                    }
                    objP6 = kk0Var.P();
                    if (z7) {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    } else {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    }
                    r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                }
                hh3Var2 = hh3VarRememberModalBottomSheetState;
                if2Var3 = if2Var2;
                j7 = j6;
                f7 = f5;
                rg3Var3 = rg3Var2;
                j8 = j4;
                j9 = j5;
                f8 = f6;
                ne1Var7 = ne1Var5;
                ne1Var8 = ne1Var6;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                } else {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                }
                kk0Var2.s();
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var117 = new al0(r11.a(x21.c, kk0Var2));
                    kk0Var2.l0(al0Var117);
                    objP = al0Var117;
                }
                gq0Var = ((al0) objP).c;
                i20 = (i12 & 896) ^ 384;
                boolean zJ11111119 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                i21 = i12 & 14;
                if (i21 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ11111119 | z;
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                }
                je1 je1Var118 = (je1) objP2;
                boolean zJ111111110 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                if (i21 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zJ111111110 | z3;
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                }
                le1 le1Var117 = (le1) objP3;
                objP4 = kk0Var2.P();
                if (objP4 == Composer$Companion.getEmpty()) {
                    objP4 = kr1.a(0.0f);
                    kk0Var2.l0(objP4);
                }
                ueVar = (ue) objP4;
                boolean zJ111111111 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                if (i21 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zJ111111111 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                }
                mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var118, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var117, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                kk0Var = kk0Var2;
                if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                    if (i20 <= 256) {
                    }
                    objP6 = kk0Var.P();
                    if (z7) {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    } else {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    }
                    r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                }
                hh3Var2 = hh3VarRememberModalBottomSheetState;
                if2Var3 = if2Var2;
                j7 = j6;
                f7 = f5;
                rg3Var3 = rg3Var2;
                j8 = j4;
                j9 = j5;
                f8 = f6;
                ne1Var7 = ne1Var5;
                ne1Var8 = ne1Var6;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
            }
        }
        i14 |= 48;
        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
            if ((i2 & 384) == 0) {
                if (kk0Var2.j(oe1Var)) {
                    i17 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i17 = Uuid.SIZE_BITS;
                }
                i14 |= i17;
            }
            if ((i12 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                } else {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                }
                kk0Var2.s();
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var118 = new al0(r11.a(x21.c, kk0Var2));
                    kk0Var2.l0(al0Var118);
                    objP = al0Var118;
                }
                gq0Var = ((al0) objP).c;
                i20 = (i12 & 896) ^ 384;
                boolean zJ111111112 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                i21 = i12 & 14;
                if (i21 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ111111112 | z;
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                }
                je1 je1Var119 = (je1) objP2;
                boolean zJ111111113 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                if (i21 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zJ111111113 | z3;
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                }
                le1 le1Var118 = (le1) objP3;
                objP4 = kk0Var2.P();
                if (objP4 == Composer$Companion.getEmpty()) {
                    objP4 = kr1.a(0.0f);
                    kk0Var2.l0(objP4);
                }
                ueVar = (ue) objP4;
                boolean zJ111111114 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                if (i21 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zJ111111114 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                }
                mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var119, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var118, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                kk0Var = kk0Var2;
                if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                    if (i20 <= 256) {
                    }
                    objP6 = kk0Var.P();
                    if (z7) {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    } else {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    }
                    r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                }
                hh3Var2 = hh3VarRememberModalBottomSheetState;
                if2Var3 = if2Var2;
                j7 = j6;
                f7 = f5;
                rg3Var3 = rg3Var2;
                j8 = j4;
                j9 = j5;
                f8 = f6;
                ne1Var7 = ne1Var5;
                ne1Var8 = ne1Var6;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                } else {
                    if (i27 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i5 != 0) {
                        f3 = 640.0f;
                    } else {
                        f3 = f;
                    }
                    i18 = i3 & 16;
                    owVar = ow.a;
                    if (i18 != 0) {
                        i19 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i12 &= -57345;
                    } else {
                        i19 = 6;
                    }
                    if ((i3 & 32) != 0) {
                        containerColor = owVar.getContainerColor(kk0Var2, i19);
                        i12 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                        i12 &= -3670017;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i7 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        scrimColor = owVar.getScrimColor(kk0Var2, 6);
                        i12 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    if (i10 != 0) {
                        ne1Var3 = cj0.a;
                    } else {
                        ne1Var3 = ne1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i14 &= -15;
                        ne1Var4 = ue2.c;
                    } else {
                        ne1Var4 = ne1Var2;
                    }
                    if (i15 != 0) {
                        if2Var2 = le2.a;
                    } else {
                        if2Var2 = if2Var;
                    }
                    cVar4 = cVar3;
                    ne1Var5 = ne1Var3;
                    f5 = f3;
                    j4 = containerColor;
                    f6 = f4;
                    rg3Var2 = expandedShape;
                    ne1Var6 = ne1Var4;
                    j5 = jM2x310ea166;
                    j6 = scrimColor;
                }
                kk0Var2.s();
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    al0 al0Var119 = new al0(r11.a(x21.c, kk0Var2));
                    kk0Var2.l0(al0Var119);
                    objP = al0Var119;
                }
                gq0Var = ((al0) objP).c;
                i20 = (i12 & 896) ^ 384;
                boolean zJ111111115 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
                i21 = i12 & 14;
                if (i21 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ111111115 | z;
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                    kk0Var2.l0(objP2);
                }
                je1 je1Var1110 = (je1) objP2;
                boolean zJ111111116 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
                if (i21 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zJ111111116 | z3;
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                    kk0Var2.l0(objP3);
                }
                le1 le1Var119 = (le1) objP3;
                objP4 = kk0Var2.P();
                if (objP4 == Composer$Companion.getEmpty()) {
                    objP4 = kr1.a(0.0f);
                    kk0Var2.l0(objP4);
                }
                ueVar = (ue) objP4;
                boolean zJ111111117 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
                if (i21 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zJ111111117 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                    kk0Var2.l0(objP5);
                }
                mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var1110, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var119, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
                kk0Var = kk0Var2;
                if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                    if (i20 <= 256) {
                    }
                    objP6 = kk0Var.P();
                    if (z7) {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    } else {
                        objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                        kk0Var.l0(objP6);
                    }
                    r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
                }
                hh3Var2 = hh3VarRememberModalBottomSheetState;
                if2Var3 = if2Var2;
                j7 = j6;
                f7 = f5;
                rg3Var3 = rg3Var2;
                j8 = j4;
                j9 = j5;
                f8 = f6;
                ne1Var7 = ne1Var5;
                ne1Var8 = ne1Var6;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
            }
        }
        i14 |= 384;
        if ((i12 & 306783379) != 306783378) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i27 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    i12 &= -897;
                    hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i5 != 0) {
                    f3 = 640.0f;
                } else {
                    f3 = f;
                }
                i18 = i3 & 16;
                owVar = ow.a;
                if (i18 != 0) {
                    i19 = 6;
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i12 &= -57345;
                } else {
                    i19 = 6;
                }
                if ((i3 & 32) != 0) {
                    containerColor = owVar.getContainerColor(kk0Var2, i19);
                    i12 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                    i12 &= -3670017;
                } else {
                    jM2x310ea166 = j2;
                }
                if (i7 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                    i12 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                if (i10 != 0) {
                    ne1Var3 = cj0.a;
                } else {
                    ne1Var3 = ne1Var;
                }
                if ((i3 & 1024) != 0) {
                    i14 &= -15;
                    ne1Var4 = ue2.c;
                } else {
                    ne1Var4 = ne1Var2;
                }
                if (i15 != 0) {
                    if2Var2 = le2.a;
                } else {
                    if2Var2 = if2Var;
                }
                cVar4 = cVar3;
                ne1Var5 = ne1Var3;
                f5 = f3;
                j4 = containerColor;
                f6 = f4;
                rg3Var2 = expandedShape;
                ne1Var6 = ne1Var4;
                j5 = jM2x310ea166;
                j6 = scrimColor;
            } else {
                if (i27 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    i12 &= -897;
                    hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i5 != 0) {
                    f3 = 640.0f;
                } else {
                    f3 = f;
                }
                i18 = i3 & 16;
                owVar = ow.a;
                if (i18 != 0) {
                    i19 = 6;
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i12 &= -57345;
                } else {
                    i19 = 6;
                }
                if ((i3 & 32) != 0) {
                    containerColor = owVar.getContainerColor(kk0Var2, i19);
                    i12 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                    i12 &= -3670017;
                } else {
                    jM2x310ea166 = j2;
                }
                if (i7 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                    i12 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                if (i10 != 0) {
                    ne1Var3 = cj0.a;
                } else {
                    ne1Var3 = ne1Var;
                }
                if ((i3 & 1024) != 0) {
                    i14 &= -15;
                    ne1Var4 = ue2.c;
                } else {
                    ne1Var4 = ne1Var2;
                }
                if (i15 != 0) {
                    if2Var2 = le2.a;
                } else {
                    if2Var2 = if2Var;
                }
                cVar4 = cVar3;
                ne1Var5 = ne1Var3;
                f5 = f3;
                j4 = containerColor;
                f6 = f4;
                rg3Var2 = expandedShape;
                ne1Var6 = ne1Var4;
                j5 = jM2x310ea166;
                j6 = scrimColor;
            }
            kk0Var2.s();
            objP = kk0Var2.P();
            if (objP == Composer$Companion.getEmpty()) {
                al0 al0Var1110 = new al0(r11.a(x21.c, kk0Var2));
                kk0Var2.l0(al0Var1110);
                objP = al0Var1110;
            }
            gq0Var = ((al0) objP).c;
            i20 = (i12 & 896) ^ 384;
            boolean zJ111111118 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
            i21 = i12 & 14;
            if (i21 == 4) {
                z = true;
            } else {
                z = false;
            }
            z2 = zJ111111118 | z;
            objP2 = kk0Var2.P();
            if (z2) {
                objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                kk0Var2.l0(objP2);
            } else {
                objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                kk0Var2.l0(objP2);
            }
            je1 je1Var1111 = (je1) objP2;
            boolean zJ111111119 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
            if (i21 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = zJ111111119 | z3;
            objP3 = kk0Var2.P();
            if (z4) {
                objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                kk0Var2.l0(objP3);
            } else {
                objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                kk0Var2.l0(objP3);
            }
            le1 le1Var1110 = (le1) objP3;
            objP4 = kk0Var2.P();
            if (objP4 == Composer$Companion.getEmpty()) {
                objP4 = kr1.a(0.0f);
                kk0Var2.l0(objP4);
            }
            ueVar = (ue) objP4;
            boolean zJ1111111110 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
            if (i21 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = zJ1111111110 | z5;
            objP5 = kk0Var2.P();
            if (z6) {
                objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                kk0Var2.l0(objP5);
            } else {
                objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                kk0Var2.l0(objP5);
            }
            mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var1111, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var1110, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
            kk0Var = kk0Var2;
            if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                if (i20 <= 256) {
                }
                objP6 = kk0Var.P();
                if (z7) {
                    objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                    kk0Var.l0(objP6);
                } else {
                    objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                    kk0Var.l0(objP6);
                }
                r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
            }
            hh3Var2 = hh3VarRememberModalBottomSheetState;
            if2Var3 = if2Var2;
            j7 = j6;
            f7 = f5;
            rg3Var3 = rg3Var2;
            j8 = j4;
            j9 = j5;
            f8 = f6;
            ne1Var7 = ne1Var5;
            ne1Var8 = ne1Var6;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i27 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    i12 &= -897;
                    hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i5 != 0) {
                    f3 = 640.0f;
                } else {
                    f3 = f;
                }
                i18 = i3 & 16;
                owVar = ow.a;
                if (i18 != 0) {
                    i19 = 6;
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i12 &= -57345;
                } else {
                    i19 = 6;
                }
                if ((i3 & 32) != 0) {
                    containerColor = owVar.getContainerColor(kk0Var2, i19);
                    i12 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                    i12 &= -3670017;
                } else {
                    jM2x310ea166 = j2;
                }
                if (i7 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                    i12 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                if (i10 != 0) {
                    ne1Var3 = cj0.a;
                } else {
                    ne1Var3 = ne1Var;
                }
                if ((i3 & 1024) != 0) {
                    i14 &= -15;
                    ne1Var4 = ue2.c;
                } else {
                    ne1Var4 = ne1Var2;
                }
                if (i15 != 0) {
                    if2Var2 = le2.a;
                } else {
                    if2Var2 = if2Var;
                }
                cVar4 = cVar3;
                ne1Var5 = ne1Var3;
                f5 = f3;
                j4 = containerColor;
                f6 = f4;
                rg3Var2 = expandedShape;
                ne1Var6 = ne1Var4;
                j5 = jM2x310ea166;
                j6 = scrimColor;
            } else {
                if (i27 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i3 & 4) != 0) {
                    i12 &= -897;
                    hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i5 != 0) {
                    f3 = 640.0f;
                } else {
                    f3 = f;
                }
                i18 = i3 & 16;
                owVar = ow.a;
                if (i18 != 0) {
                    i19 = 6;
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i12 &= -57345;
                } else {
                    i19 = 6;
                }
                if ((i3 & 32) != 0) {
                    containerColor = owVar.getContainerColor(kk0Var2, i19);
                    i12 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i12 >> 15) & 14);
                    i12 &= -3670017;
                } else {
                    jM2x310ea166 = j2;
                }
                if (i7 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    scrimColor = owVar.getScrimColor(kk0Var2, 6);
                    i12 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                if (i10 != 0) {
                    ne1Var3 = cj0.a;
                } else {
                    ne1Var3 = ne1Var;
                }
                if ((i3 & 1024) != 0) {
                    i14 &= -15;
                    ne1Var4 = ue2.c;
                } else {
                    ne1Var4 = ne1Var2;
                }
                if (i15 != 0) {
                    if2Var2 = le2.a;
                } else {
                    if2Var2 = if2Var;
                }
                cVar4 = cVar3;
                ne1Var5 = ne1Var3;
                f5 = f3;
                j4 = containerColor;
                f6 = f4;
                rg3Var2 = expandedShape;
                ne1Var6 = ne1Var4;
                j5 = jM2x310ea166;
                j6 = scrimColor;
            }
            kk0Var2.s();
            objP = kk0Var2.P();
            if (objP == Composer$Companion.getEmpty()) {
                al0 al0Var1111 = new al0(r11.a(x21.c, kk0Var2));
                kk0Var2.l0(al0Var1111);
                objP = al0Var1111;
            }
            gq0Var = ((al0) objP).c;
            i20 = (i12 & 896) ^ 384;
            boolean zJ1111111111 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var);
            i21 = i12 & 14;
            if (i21 == 4) {
                z = true;
            } else {
                z = false;
            }
            z2 = zJ1111111111 | z;
            objP2 = kk0Var2.P();
            if (z2) {
                objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                kk0Var2.l0(objP2);
            } else {
                objP2 = new oh(hh3VarRememberModalBottomSheetState, gq0Var, je1Var, 7);
                kk0Var2.l0(objP2);
            }
            je1 je1Var1112 = (je1) objP2;
            boolean zJ1111111112 = kk0Var2.j(gq0Var) | ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256);
            if (i21 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = zJ1111111112 | z3;
            objP3 = kk0Var2.P();
            if (z4) {
                objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                kk0Var2.l0(objP3);
            } else {
                objP3 = new ie(gq0Var, hh3VarRememberModalBottomSheetState, je1Var, 16);
                kk0Var2.l0(objP3);
            }
            le1 le1Var1111 = (le1) objP3;
            objP4 = kk0Var2.P();
            if (objP4 == Composer$Companion.getEmpty()) {
                objP4 = kr1.a(0.0f);
                kk0Var2.l0(objP4);
            }
            ueVar = (ue) objP4;
            boolean zJ1111111113 = ((i20 <= 256 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i12 & 384) == 256) | kk0Var2.j(gq0Var) | kk0Var2.j(ueVar);
            if (i21 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = zJ1111111113 | z5;
            objP5 = kk0Var2.P();
            if (z6) {
                objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                kk0Var2.l0(objP5);
            } else {
                objP5 = new qa(hh3VarRememberModalBottomSheetState, gq0Var, ueVar, je1Var);
                kk0Var2.l0(objP5);
            }
            mf2.ModalBottomSheetDialog((je1) objP5, if2Var2, ueVar, zg0.rememberComposableLambda(-314673510, true, new we2(j6, je1Var1112, hh3VarRememberModalBottomSheetState, ueVar, gq0Var, le1Var1111, cVar4, f5, rg3Var2, j4, j5, f6, ne1Var5, ne1Var6, oe1Var), kk0Var2, 54), kk0Var2, (i14 & 112) | 3584);
            kk0Var = kk0Var2;
            if (hh3VarRememberModalBottomSheetState.c.f().a.containsKey(ih3.d)) {
                if (i20 <= 256) {
                }
                objP6 = kk0Var.P();
                if (z7) {
                    objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                    kk0Var.l0(objP6);
                } else {
                    objP6 = new ve2(hh3VarRememberModalBottomSheetState, null, 2);
                    kk0Var.l0(objP6);
                }
                r11.LaunchedEffect(hh3VarRememberModalBottomSheetState, (ne1) objP6, kk0Var, (i12 >> 6) & 14);
            }
            hh3Var2 = hh3VarRememberModalBottomSheetState;
            if2Var3 = if2Var2;
            j7 = j6;
            f7 = f5;
            rg3Var3 = rg3Var2;
            j8 = j4;
            j9 = j5;
            f8 = f6;
            ne1Var7 = ne1Var5;
            ne1Var8 = ne1Var6;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new xe2(je1Var, cVar4, hh3Var2, f7, rg3Var3, j8, j9, f8, j7, ne1Var7, ne1Var8, if2Var3, oe1Var, i, i2, i3, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0143  */
    /* JADX WARN: Code duplicated, block: B:117:0x014c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0151  */
    /* JADX WARN: Code duplicated, block: B:122:0x015a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0163  */
    /* JADX WARN: Code duplicated, block: B:125:0x0167  */
    /* JADX WARN: Code duplicated, block: B:127:0x0171  */
    /* JADX WARN: Code duplicated, block: B:128:0x0174  */
    /* JADX WARN: Code duplicated, block: B:130:0x017b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0185  */
    /* JADX WARN: Code duplicated, block: B:135:0x018a  */
    /* JADX WARN: Code duplicated, block: B:137:0x018e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0196  */
    /* JADX WARN: Code duplicated, block: B:140:0x0199  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:158:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:170:0x0203  */
    /* JADX WARN: Code duplicated, block: B:172:0x0214  */
    /* JADX WARN: Code duplicated, block: B:191:0x024f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x0251  */
    /* JADX WARN: Code duplicated, block: B:195:0x0258  */
    /* JADX WARN: Code duplicated, block: B:197:0x0263  */
    /* JADX WARN: Code duplicated, block: B:200:0x026c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0274  */
    /* JADX WARN: Code duplicated, block: B:204:0x027b  */
    /* JADX WARN: Code duplicated, block: B:205:0x0285  */
    /* JADX WARN: Code duplicated, block: B:208:0x028b  */
    /* JADX WARN: Code duplicated, block: B:209:0x0296  */
    /* JADX WARN: Code duplicated, block: B:211:0x029a  */
    /* JADX WARN: Code duplicated, block: B:212:0x029d  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:218:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:223:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:225:0x0300  */
    /* JADX WARN: Code duplicated, block: B:229:0x030a A[PHI: r24
  0x030a: PHI (r24v3 float) = (r24v1 float), (r24v5 float) binds: [B:228:0x0308, B:226:0x0303] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:230:0x030c  */
    /* JADX WARN: Code duplicated, block: B:233:0x0313  */
    /* JADX WARN: Code duplicated, block: B:235:0x0319  */
    /* JADX WARN: Code duplicated, block: B:238:0x0334  */
    /* JADX WARN: Code duplicated, block: B:240:0x033a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0347  */
    /* JADX WARN: Code duplicated, block: B:248:0x034d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0370  */
    /* JADX WARN: Code duplicated, block: B:252:0x0373  */
    /* JADX WARN: Code duplicated, block: B:255:0x037e  */
    /* JADX WARN: Code duplicated, block: B:256:0x0380  */
    /* JADX WARN: Code duplicated, block: B:259:0x0387  */
    /* JADX WARN: Code duplicated, block: B:261:0x038d  */
    /* JADX WARN: Code duplicated, block: B:264:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:266:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:269:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:271:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:277:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:283:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:286:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:288:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:292:0x0463  */
    /* JADX WARN: Code duplicated, block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ModalBottomSheetContent-IQkwcL4, reason: not valid java name */
    public static final void m207xe7dbe27c(zw zwVar, ue ueVar, gq0 gq0Var, je1 je1Var, le1 le1Var, c cVar, hh3 hh3Var, float f, rg3 rg3Var, long j, long j2, float f2, ne1 ne1Var, ne1 ne1Var2, oe1 oe1Var, ck0 ck0Var, int i, int i2, int i3) {
        int i4;
        int i5;
        je1 je1Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        c cVar2;
        int i11;
        hh3 hh3VarRememberModalBottomSheetState;
        int i12;
        float f3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ne1 ne1Var3;
        int i21;
        int i22;
        int i23;
        int i24;
        ow owVar;
        int i25;
        rg3 expandedShape;
        long containerColor;
        long jM2x310ea166;
        float f4;
        ne1 ne1Var4;
        int i26;
        ne1 ne1Var5;
        int i27;
        c cVar3;
        float f5;
        long j3;
        float f6;
        String strM1830xa862b2cd;
        int i28;
        float f7;
        boolean z;
        Object objP;
        ji4 ji4Var;
        boolean z2;
        Object objP2;
        boolean z3;
        boolean z4;
        Object objP3;
        boolean zH;
        Object objP4;
        boolean z5;
        boolean z6;
        Object objP5;
        ne1 ne1Var6;
        rg3 rg3Var2;
        float f8;
        kk0 kk0Var;
        c cVar4;
        float f9;
        hh3 hh3Var2;
        ne1 ne1Var7;
        long j4;
        long j5;
        w33 w33VarV;
        int i29;
        int i30;
        int i31;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1676960531);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (kk0Var2.h(zwVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? kk0Var2.h(ueVar) : kk0Var2.j(ueVar) ? 32 : 16;
        }
        if ((i3 & 2) == 0) {
            if ((i & 384) == 0) {
                i4 |= kk0Var2.j(gq0Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i5 = 1024;
            if ((i3 & 4) != 0) {
                if ((i & 3072) == 0) {
                    je1Var2 = je1Var;
                    if (kk0Var2.j(je1Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (kk0Var2.j(le1Var)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 16;
                if (i10 != 0) {
                    i4 |= 196608;
                    cVar2 = cVar;
                } else {
                    cVar2 = cVar;
                    if ((i & 196608) == 0) {
                        if (kk0Var2.h(cVar2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                }
                if ((i & 1572864) == 0) {
                    hh3VarRememberModalBottomSheetState = hh3Var;
                    if ((i3 & 32) == 0 || !kk0Var2.h(hh3VarRememberModalBottomSheetState)) {
                        i31 = 524288;
                    } else {
                        i31 = 1048576;
                    }
                    i4 |= i31;
                } else {
                    hh3VarRememberModalBottomSheetState = hh3Var;
                }
                i12 = i3 & 64;
                if (i12 != 0) {
                    i4 |= 12582912;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.e(f3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                }
                if ((i & 100663296) != 0) {
                    i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var2.h(rg3Var)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                        i30 = i4;
                        int i32 = kk0Var2.g(j) ? 536870912 : 268435456;
                        i14 = i30 | i32;
                    } else {
                        i30 = i4;
                    }
                    i14 = i30 | i32;
                } else {
                    i14 = i4;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !kk0Var2.g(j2)) {
                        i29 = 2;
                    } else {
                        i29 = 4;
                    }
                    i15 = i2 | i29;
                } else {
                    i15 = i2;
                }
                i16 = i15;
                i17 = i3 & 1024;
                if (i17 != 0) {
                    i18 = i16 | 48;
                } else if ((i2 & 48) == 0) {
                    if (kk0Var2.e(f2)) {
                        i19 = 32;
                    } else {
                        i19 = 16;
                    }
                    i18 = i16 | i19;
                } else {
                    i18 = i16;
                }
                i20 = i3 & 2048;
                if (i20 != 0) {
                    if ((i2 & 384) == 0) {
                        ne1Var3 = ne1Var;
                        if (kk0Var2.j(ne1Var3)) {
                            i21 = FontInfo.NUMBER_OF_CHAR_CODES;
                        } else {
                            i21 = Uuid.SIZE_BITS;
                        }
                        i18 |= i21;
                    }
                    i22 = i18;
                    if ((i2 & 3072) == 0) {
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0 && kk0Var2.j(ne1Var2)) {
                            i5 = 2048;
                        }
                        i23 = i22 | i5;
                    } else {
                        i23 = i22;
                    }
                    if ((i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                        if ((i2 & 24576) == 0) {
                            if (kk0Var2.j(oe1Var)) {
                                i8 = 16384;
                            }
                            i23 |= i8;
                        }
                        if ((i14 & 306783379) != 306783378 && (i23 & 9363) == 9362 && kk0Var2.F()) {
                            kk0Var2.V();
                            rg3Var2 = rg3Var;
                            ne1Var7 = ne1Var2;
                            kk0Var = kk0Var2;
                            ne1Var6 = ne1Var3;
                            cVar4 = cVar2;
                            f9 = f3;
                            hh3Var2 = hh3VarRememberModalBottomSheetState;
                            j5 = j;
                            j4 = j2;
                            f8 = f2;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0 || kk0Var2.D()) {
                                if (i10 != 0) {
                                    cVar2 = c.i;
                                }
                                if ((i3 & 32) != 0) {
                                    i14 &= -3670017;
                                    hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                                }
                                if (i12 != 0) {
                                    f3 = 640.0f;
                                }
                                i24 = i3 & Uuid.SIZE_BITS;
                                owVar = ow.a;
                                if (i24 != 0) {
                                    i25 = 6;
                                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                    i14 &= -234881025;
                                } else {
                                    i25 = 6;
                                    expandedShape = rg3Var;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i14 &= -1879048193;
                                    containerColor = owVar.getContainerColor(kk0Var2, i25);
                                } else {
                                    containerColor = j;
                                }
                                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                    i23 &= -15;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if (i17 != 0) {
                                    f4 = 1.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i20 != 0) {
                                    ne1Var4 = cj0.b;
                                } else {
                                    ne1Var4 = ne1Var;
                                }
                                float f10 = f4;
                                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i26 = i14;
                                    i27 = i23 & (-7169);
                                    ne1Var5 = ze2.c;
                                } else {
                                    i26 = i14;
                                    ne1Var5 = ne1Var2;
                                    i27 = i23;
                                }
                                cVar3 = cVar2;
                                f5 = f3;
                                j3 = jM2x310ea166;
                                f6 = f10;
                            } else {
                                kk0Var2.V();
                                if ((i3 & 32) != 0) {
                                    i14 &= -3670017;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    i14 &= -234881025;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i14 &= -1879048193;
                                }
                                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                    i23 &= -15;
                                }
                                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i23 &= -7169;
                                }
                                expandedShape = rg3Var;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                                cVar3 = cVar2;
                                f5 = f3;
                                i26 = i14;
                                j3 = j2;
                                f6 = f2;
                                ne1Var4 = ne1Var3;
                                containerColor = j;
                            }
                            kk0Var2.s();
                            rg3 rg3Var3 = expandedShape;
                            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                            c cVar5 = cVar3;
                            c cVarThen = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                            i28 = (i26 & 3670016) ^ 1572864;
                            if (i28 > 1048576 || !kk0Var2.h(hh3VarRememberModalBottomSheetState)) {
                                f7 = f5;
                                if ((i26 & 1572864) != 1048576) {
                                    z = false;
                                }
                                objP = kk0Var2.P();
                                if (z || objP == Composer$Companion.getEmpty()) {
                                    t64 t64Var = fh3.a;
                                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                                    kk0Var2.l0(objP);
                                }
                                c cVarA = a.a(cVarThen, (ck2) objP, null);
                                ji4 ji4Var2 = hh3VarRememberModalBottomSheetState.c;
                                ji4Var = hh3VarRememberModalBottomSheetState.c;
                                long j6 = containerColor;
                                z2 = (i28 <= 1048576 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i26 & 1572864) == 1048576;
                                objP2 = kk0Var2.P();
                                if (z2 || objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                                    kk0Var2.l0(objP2);
                                }
                                c cVarD = androidx.compose.material3.internal.a.d(cVarA, ji4Var2, (ne1) objP2);
                                b9 b9Var = (b9) ji4Var.f;
                                boolean zC = hh3VarRememberModalBottomSheetState.c();
                                if (((ft2) ji4Var.l).getValue() != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if ((i26 & 57344) == 16384) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objP3 = kk0Var2.P();
                                if (z4 || objP3 == Composer$Companion.getEmpty()) {
                                    objP3 = new bf2(le1Var, null);
                                    kk0Var2.l0(objP3);
                                }
                                c cVarA2 = kz0.a(cVarD, b9Var, nq2.c, zC, null, z3, (oe1) objP3, false, 168);
                                zH = kk0Var2.h(strM1830xa862b2cd);
                                objP4 = kk0Var2.P();
                                if (zH || objP4 == Composer$Companion.getEmpty()) {
                                    objP4 = new v7(strM1830xa862b2cd, 6);
                                    kk0Var2.l0(objP4);
                                }
                                c cVarB = we3.b(cVarA2, false, (le1) objP4);
                                boolean z7 = (i28 <= 1048576 && kk0Var2.h(hh3VarRememberModalBottomSheetState)) || (i26 & 1572864) == 1048576;
                                if ((i26 & 112) != 32 || ((i26 & 64) != 0 && kk0Var2.j(ueVar))) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                z6 = z7 | z5;
                                objP5 = kk0Var2.P();
                                if (z6 || objP5 == Composer$Companion.getEmpty()) {
                                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                                    kk0Var2.l0(objP5);
                                }
                                ne1 ne1Var8 = ne1Var4;
                                hh3 hh3Var3 = hh3VarRememberModalBottomSheetState;
                                ne1 ne1Var9 = ne1Var5;
                                int i33 = i26 >> 21;
                                int i34 = i27 << 9;
                                hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB, (le1) objP5), rg3Var3, j6, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var9, ueVar, ne1Var8, hh3Var3, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i33 & 896) | (i33 & 112) | 12582912 | (i34 & 7168) | (57344 & i34), 96);
                                ne1Var6 = ne1Var8;
                                rg3Var2 = rg3Var3;
                                f8 = f6;
                                kk0Var = kk0Var2;
                                cVar4 = cVar5;
                                f9 = f7;
                                hh3Var2 = hh3Var3;
                                ne1Var7 = ne1Var9;
                                j4 = j3;
                                j5 = j6;
                            } else {
                                f7 = f5;
                            }
                            z = true;
                            objP = kk0Var2.P();
                            if (z) {
                                t64 t64Var2 = fh3.a;
                                objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                                kk0Var2.l0(objP);
                            } else {
                                t64 t64Var3 = fh3.a;
                                objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                                kk0Var2.l0(objP);
                            }
                            c cVarA3 = a.a(cVarThen, (ck2) objP, null);
                            ji4 ji4Var3 = hh3VarRememberModalBottomSheetState.c;
                            ji4Var = hh3VarRememberModalBottomSheetState.c;
                            long j7 = containerColor;
                            if (i28 <= 1048576) {
                            }
                            objP2 = kk0Var2.P();
                            if (z2) {
                                objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                                kk0Var2.l0(objP2);
                            } else {
                                objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                                kk0Var2.l0(objP2);
                            }
                            c cVarD2 = androidx.compose.material3.internal.a.d(cVarA3, ji4Var3, (ne1) objP2);
                            b9 b9Var2 = (b9) ji4Var.f;
                            boolean zC2 = hh3VarRememberModalBottomSheetState.c();
                            if (((ft2) ji4Var.l).getValue() != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if ((i26 & 57344) == 16384) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objP3 = kk0Var2.P();
                            if (z4) {
                                objP3 = new bf2(le1Var, null);
                                kk0Var2.l0(objP3);
                            } else {
                                objP3 = new bf2(le1Var, null);
                                kk0Var2.l0(objP3);
                            }
                            c cVarA4 = kz0.a(cVarD2, b9Var2, nq2.c, zC2, null, z3, (oe1) objP3, false, 168);
                            zH = kk0Var2.h(strM1830xa862b2cd);
                            objP4 = kk0Var2.P();
                            if (zH) {
                                objP4 = new v7(strM1830xa862b2cd, 6);
                                kk0Var2.l0(objP4);
                            } else {
                                objP4 = new v7(strM1830xa862b2cd, 6);
                                kk0Var2.l0(objP4);
                            }
                            c cVarB2 = we3.b(cVarA4, false, (le1) objP4);
                            if (i28 <= 1048576) {
                            }
                            if ((i26 & 112) != 32) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            z6 = z7 | z5;
                            objP5 = kk0Var2.P();
                            if (z6) {
                                objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                                kk0Var2.l0(objP5);
                            } else {
                                objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                                kk0Var2.l0(objP5);
                            }
                            ne1 ne1Var10 = ne1Var4;
                            hh3 hh3Var4 = hh3VarRememberModalBottomSheetState;
                            ne1 ne1Var11 = ne1Var5;
                            int i35 = i26 >> 21;
                            int i36 = i27 << 9;
                            hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB2, (le1) objP5), rg3Var3, j7, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var11, ueVar, ne1Var10, hh3Var4, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i35 & 896) | (i35 & 112) | 12582912 | (i36 & 7168) | (57344 & i36), 96);
                            ne1Var6 = ne1Var10;
                            rg3Var2 = rg3Var3;
                            f8 = f6;
                            kk0Var = kk0Var2;
                            cVar4 = cVar5;
                            f9 = f7;
                            hh3Var2 = hh3Var4;
                            ne1Var7 = ne1Var11;
                            j4 = j3;
                            j5 = j7;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                        }
                    }
                    i23 |= 24576;
                    if ((i14 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f11 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f11;
                        } else {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f12 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f12;
                        }
                        kk0Var2.s();
                        rg3 rg3Var4 = expandedShape;
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                        c cVar6 = cVar3;
                        c cVarThen2 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                        i28 = (i26 & 3670016) ^ 1572864;
                        if (i28 > 1048576) {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        objP = kk0Var2.P();
                        if (z) {
                            t64 t64Var4 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        } else {
                            t64 t64Var5 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        }
                        c cVarA5 = a.a(cVarThen2, (ck2) objP, null);
                        ji4 ji4Var4 = hh3VarRememberModalBottomSheetState.c;
                        ji4Var = hh3VarRememberModalBottomSheetState.c;
                        long j8 = containerColor;
                        if (i28 <= 1048576) {
                        }
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        }
                        c cVarD3 = androidx.compose.material3.internal.a.d(cVarA5, ji4Var4, (ne1) objP2);
                        b9 b9Var3 = (b9) ji4Var.f;
                        boolean zC3 = hh3VarRememberModalBottomSheetState.c();
                        if (((ft2) ji4Var.l).getValue() != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i26 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        }
                        c cVarA6 = kz0.a(cVarD3, b9Var3, nq2.c, zC3, null, z3, (oe1) objP3, false, 168);
                        zH = kk0Var2.h(strM1830xa862b2cd);
                        objP4 = kk0Var2.P();
                        if (zH) {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        } else {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        }
                        c cVarB3 = we3.b(cVarA6, false, (le1) objP4);
                        if (i28 <= 1048576) {
                        }
                        if ((i26 & 112) != 32) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        z6 = z7 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        }
                        ne1 ne1Var12 = ne1Var4;
                        hh3 hh3Var5 = hh3VarRememberModalBottomSheetState;
                        ne1 ne1Var13 = ne1Var5;
                        int i37 = i26 >> 21;
                        int i38 = i27 << 9;
                        hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB3, (le1) objP5), rg3Var4, j8, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var13, ueVar, ne1Var12, hh3Var5, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i37 & 896) | (i37 & 112) | 12582912 | (i38 & 7168) | (57344 & i38), 96);
                        ne1Var6 = ne1Var12;
                        rg3Var2 = rg3Var4;
                        f8 = f6;
                        kk0Var = kk0Var2;
                        cVar4 = cVar6;
                        f9 = f7;
                        hh3Var2 = hh3Var5;
                        ne1Var7 = ne1Var13;
                        j4 = j3;
                        j5 = j8;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f13 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f13;
                        } else {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f14 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f14;
                        }
                        kk0Var2.s();
                        rg3 rg3Var5 = expandedShape;
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                        c cVar7 = cVar3;
                        c cVarThen3 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                        i28 = (i26 & 3670016) ^ 1572864;
                        if (i28 > 1048576) {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        objP = kk0Var2.P();
                        if (z) {
                            t64 t64Var6 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        } else {
                            t64 t64Var7 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        }
                        c cVarA7 = a.a(cVarThen3, (ck2) objP, null);
                        ji4 ji4Var5 = hh3VarRememberModalBottomSheetState.c;
                        ji4Var = hh3VarRememberModalBottomSheetState.c;
                        long j9 = containerColor;
                        if (i28 <= 1048576) {
                        }
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        }
                        c cVarD4 = androidx.compose.material3.internal.a.d(cVarA7, ji4Var5, (ne1) objP2);
                        b9 b9Var4 = (b9) ji4Var.f;
                        boolean zC4 = hh3VarRememberModalBottomSheetState.c();
                        if (((ft2) ji4Var.l).getValue() != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i26 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        }
                        c cVarA8 = kz0.a(cVarD4, b9Var4, nq2.c, zC4, null, z3, (oe1) objP3, false, 168);
                        zH = kk0Var2.h(strM1830xa862b2cd);
                        objP4 = kk0Var2.P();
                        if (zH) {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        } else {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        }
                        c cVarB4 = we3.b(cVarA8, false, (le1) objP4);
                        if (i28 <= 1048576) {
                        }
                        if ((i26 & 112) != 32) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        z6 = z7 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        }
                        ne1 ne1Var14 = ne1Var4;
                        hh3 hh3Var6 = hh3VarRememberModalBottomSheetState;
                        ne1 ne1Var15 = ne1Var5;
                        int i39 = i26 >> 21;
                        int i310 = i27 << 9;
                        hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB4, (le1) objP5), rg3Var5, j9, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var15, ueVar, ne1Var14, hh3Var6, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i39 & 896) | (i39 & 112) | 12582912 | (i310 & 7168) | (57344 & i310), 96);
                        ne1Var6 = ne1Var14;
                        rg3Var2 = rg3Var5;
                        f8 = f6;
                        kk0Var = kk0Var2;
                        cVar4 = cVar7;
                        f9 = f7;
                        hh3Var2 = hh3Var6;
                        ne1Var7 = ne1Var15;
                        j4 = j3;
                        j5 = j9;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                    }
                }
                i18 |= 384;
                ne1Var3 = ne1Var;
                i22 = i18;
                if ((i2 & 3072) == 0) {
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
                        i5 = 2048;
                    }
                    i23 = i22 | i5;
                } else {
                    i23 = i22;
                }
                if ((i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                    if ((i2 & 24576) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i8 = 16384;
                        }
                        i23 |= i8;
                    }
                    if ((i14 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f15 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f15;
                        } else {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f16 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f16;
                        }
                        kk0Var2.s();
                        rg3 rg3Var6 = expandedShape;
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                        c cVar8 = cVar3;
                        c cVarThen4 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                        i28 = (i26 & 3670016) ^ 1572864;
                        if (i28 > 1048576) {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        objP = kk0Var2.P();
                        if (z) {
                            t64 t64Var8 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        } else {
                            t64 t64Var9 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        }
                        c cVarA9 = a.a(cVarThen4, (ck2) objP, null);
                        ji4 ji4Var6 = hh3VarRememberModalBottomSheetState.c;
                        ji4Var = hh3VarRememberModalBottomSheetState.c;
                        long j10 = containerColor;
                        if (i28 <= 1048576) {
                        }
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        }
                        c cVarD5 = androidx.compose.material3.internal.a.d(cVarA9, ji4Var6, (ne1) objP2);
                        b9 b9Var5 = (b9) ji4Var.f;
                        boolean zC5 = hh3VarRememberModalBottomSheetState.c();
                        if (((ft2) ji4Var.l).getValue() != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i26 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        }
                        c cVarA10 = kz0.a(cVarD5, b9Var5, nq2.c, zC5, null, z3, (oe1) objP3, false, 168);
                        zH = kk0Var2.h(strM1830xa862b2cd);
                        objP4 = kk0Var2.P();
                        if (zH) {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        } else {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        }
                        c cVarB5 = we3.b(cVarA10, false, (le1) objP4);
                        if (i28 <= 1048576) {
                        }
                        if ((i26 & 112) != 32) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        z6 = z7 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        }
                        ne1 ne1Var16 = ne1Var4;
                        hh3 hh3Var7 = hh3VarRememberModalBottomSheetState;
                        ne1 ne1Var17 = ne1Var5;
                        int i311 = i26 >> 21;
                        int i312 = i27 << 9;
                        hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB5, (le1) objP5), rg3Var6, j10, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var17, ueVar, ne1Var16, hh3Var7, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i311 & 896) | (i311 & 112) | 12582912 | (i312 & 7168) | (57344 & i312), 96);
                        ne1Var6 = ne1Var16;
                        rg3Var2 = rg3Var6;
                        f8 = f6;
                        kk0Var = kk0Var2;
                        cVar4 = cVar8;
                        f9 = f7;
                        hh3Var2 = hh3Var7;
                        ne1Var7 = ne1Var17;
                        j4 = j3;
                        j5 = j10;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f17 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f17;
                        } else {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f18 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f18;
                        }
                        kk0Var2.s();
                        rg3 rg3Var7 = expandedShape;
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                        c cVar9 = cVar3;
                        c cVarThen5 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                        i28 = (i26 & 3670016) ^ 1572864;
                        if (i28 > 1048576) {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        objP = kk0Var2.P();
                        if (z) {
                            t64 t64Var10 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        } else {
                            t64 t64Var11 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        }
                        c cVarA11 = a.a(cVarThen5, (ck2) objP, null);
                        ji4 ji4Var7 = hh3VarRememberModalBottomSheetState.c;
                        ji4Var = hh3VarRememberModalBottomSheetState.c;
                        long j11 = containerColor;
                        if (i28 <= 1048576) {
                        }
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        }
                        c cVarD6 = androidx.compose.material3.internal.a.d(cVarA11, ji4Var7, (ne1) objP2);
                        b9 b9Var6 = (b9) ji4Var.f;
                        boolean zC6 = hh3VarRememberModalBottomSheetState.c();
                        if (((ft2) ji4Var.l).getValue() != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i26 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        }
                        c cVarA12 = kz0.a(cVarD6, b9Var6, nq2.c, zC6, null, z3, (oe1) objP3, false, 168);
                        zH = kk0Var2.h(strM1830xa862b2cd);
                        objP4 = kk0Var2.P();
                        if (zH) {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        } else {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        }
                        c cVarB6 = we3.b(cVarA12, false, (le1) objP4);
                        if (i28 <= 1048576) {
                        }
                        if ((i26 & 112) != 32) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        z6 = z7 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        }
                        ne1 ne1Var18 = ne1Var4;
                        hh3 hh3Var8 = hh3VarRememberModalBottomSheetState;
                        ne1 ne1Var19 = ne1Var5;
                        int i313 = i26 >> 21;
                        int i314 = i27 << 9;
                        hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB6, (le1) objP5), rg3Var7, j11, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var19, ueVar, ne1Var18, hh3Var8, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i313 & 896) | (i313 & 112) | 12582912 | (i314 & 7168) | (57344 & i314), 96);
                        ne1Var6 = ne1Var18;
                        rg3Var2 = rg3Var7;
                        f8 = f6;
                        kk0Var = kk0Var2;
                        cVar4 = cVar9;
                        f9 = f7;
                        hh3Var2 = hh3Var8;
                        ne1Var7 = ne1Var19;
                        j4 = j3;
                        j5 = j11;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                    }
                }
                i23 |= 24576;
                if ((i14 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f19 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f19;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f110 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f110;
                    }
                    kk0Var2.s();
                    rg3 rg3Var8 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar10 = cVar3;
                    c cVarThen6 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var12 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var13 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA13 = a.a(cVarThen6, (ck2) objP, null);
                    ji4 ji4Var8 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j12 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD7 = androidx.compose.material3.internal.a.d(cVarA13, ji4Var8, (ne1) objP2);
                    b9 b9Var7 = (b9) ji4Var.f;
                    boolean zC7 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA14 = kz0.a(cVarD7, b9Var7, nq2.c, zC7, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB7 = we3.b(cVarA14, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var110 = ne1Var4;
                    hh3 hh3Var9 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var111 = ne1Var5;
                    int i315 = i26 >> 21;
                    int i316 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB7, (le1) objP5), rg3Var8, j12, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var111, ueVar, ne1Var110, hh3Var9, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i315 & 896) | (i315 & 112) | 12582912 | (i316 & 7168) | (57344 & i316), 96);
                    ne1Var6 = ne1Var110;
                    rg3Var2 = rg3Var8;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar10;
                    f9 = f7;
                    hh3Var2 = hh3Var9;
                    ne1Var7 = ne1Var111;
                    j4 = j3;
                    j5 = j12;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f111 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f111;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f112 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f112;
                    }
                    kk0Var2.s();
                    rg3 rg3Var9 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar11 = cVar3;
                    c cVarThen7 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var14 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var15 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA15 = a.a(cVarThen7, (ck2) objP, null);
                    ji4 ji4Var9 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j13 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD8 = androidx.compose.material3.internal.a.d(cVarA15, ji4Var9, (ne1) objP2);
                    b9 b9Var8 = (b9) ji4Var.f;
                    boolean zC8 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA16 = kz0.a(cVarD8, b9Var8, nq2.c, zC8, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB8 = we3.b(cVarA16, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var112 = ne1Var4;
                    hh3 hh3Var10 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var113 = ne1Var5;
                    int i317 = i26 >> 21;
                    int i318 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB8, (le1) objP5), rg3Var9, j13, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var113, ueVar, ne1Var112, hh3Var10, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i317 & 896) | (i317 & 112) | 12582912 | (i318 & 7168) | (57344 & i318), 96);
                    ne1Var6 = ne1Var112;
                    rg3Var2 = rg3Var9;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar11;
                    f9 = f7;
                    hh3Var2 = hh3Var10;
                    ne1Var7 = ne1Var113;
                    j4 = j3;
                    j5 = j13;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                }
            }
            i4 |= 3072;
            je1Var2 = je1Var;
            i7 = i3 & 8;
            i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            if (i7 != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (kk0Var2.j(le1Var)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i4 |= i9;
            }
            i10 = i3 & 16;
            if (i10 != 0) {
                i4 |= 196608;
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                if ((i & 196608) == 0) {
                    if (kk0Var2.h(cVar2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
            }
            if ((i & 1572864) == 0) {
                hh3VarRememberModalBottomSheetState = hh3Var;
                if ((i3 & 32) == 0) {
                    i31 = 524288;
                } else {
                    i31 = 524288;
                }
                i4 |= i31;
            } else {
                hh3VarRememberModalBottomSheetState = hh3Var;
            }
            i12 = i3 & 64;
            if (i12 != 0) {
                i4 |= 12582912;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.e(f3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
            }
            if ((i & 100663296) != 0) {
                i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var2.h(rg3Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                    i30 = i4;
                    if (kk0Var2.g(j)) {
                    }
                    i14 = i30 | i32;
                } else {
                    i30 = i4;
                }
                i14 = i30 | i32;
            } else {
                i14 = i4;
            }
            if ((i2 & 6) == 0) {
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
                    i29 = 2;
                } else {
                    i29 = 2;
                }
                i15 = i2 | i29;
            } else {
                i15 = i2;
            }
            i16 = i15;
            i17 = i3 & 1024;
            if (i17 != 0) {
                i18 = i16 | 48;
            } else if ((i2 & 48) == 0) {
                if (kk0Var2.e(f2)) {
                    i19 = 32;
                } else {
                    i19 = 16;
                }
                i18 = i16 | i19;
            } else {
                i18 = i16;
            }
            i20 = i3 & 2048;
            if (i20 != 0) {
                if ((i2 & 384) == 0) {
                    ne1Var3 = ne1Var;
                    if (kk0Var2.j(ne1Var3)) {
                        i21 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i21 = Uuid.SIZE_BITS;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                if ((i2 & 3072) == 0) {
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
                        i5 = 2048;
                    }
                    i23 = i22 | i5;
                } else {
                    i23 = i22;
                }
                if ((i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                    if ((i2 & 24576) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i8 = 16384;
                        }
                        i23 |= i8;
                    }
                    if ((i14 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f113 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f113;
                        } else {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f114 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f114;
                        }
                        kk0Var2.s();
                        rg3 rg3Var10 = expandedShape;
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                        c cVar12 = cVar3;
                        c cVarThen8 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                        i28 = (i26 & 3670016) ^ 1572864;
                        if (i28 > 1048576) {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        objP = kk0Var2.P();
                        if (z) {
                            t64 t64Var16 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        } else {
                            t64 t64Var17 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        }
                        c cVarA17 = a.a(cVarThen8, (ck2) objP, null);
                        ji4 ji4Var10 = hh3VarRememberModalBottomSheetState.c;
                        ji4Var = hh3VarRememberModalBottomSheetState.c;
                        long j14 = containerColor;
                        if (i28 <= 1048576) {
                        }
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        }
                        c cVarD9 = androidx.compose.material3.internal.a.d(cVarA17, ji4Var10, (ne1) objP2);
                        b9 b9Var9 = (b9) ji4Var.f;
                        boolean zC9 = hh3VarRememberModalBottomSheetState.c();
                        if (((ft2) ji4Var.l).getValue() != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i26 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        }
                        c cVarA18 = kz0.a(cVarD9, b9Var9, nq2.c, zC9, null, z3, (oe1) objP3, false, 168);
                        zH = kk0Var2.h(strM1830xa862b2cd);
                        objP4 = kk0Var2.P();
                        if (zH) {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        } else {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        }
                        c cVarB9 = we3.b(cVarA18, false, (le1) objP4);
                        if (i28 <= 1048576) {
                        }
                        if ((i26 & 112) != 32) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        z6 = z7 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        }
                        ne1 ne1Var114 = ne1Var4;
                        hh3 hh3Var11 = hh3VarRememberModalBottomSheetState;
                        ne1 ne1Var115 = ne1Var5;
                        int i319 = i26 >> 21;
                        int i3110 = i27 << 9;
                        hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB9, (le1) objP5), rg3Var10, j14, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var115, ueVar, ne1Var114, hh3Var11, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i319 & 896) | (i319 & 112) | 12582912 | (i3110 & 7168) | (57344 & i3110), 96);
                        ne1Var6 = ne1Var114;
                        rg3Var2 = rg3Var10;
                        f8 = f6;
                        kk0Var = kk0Var2;
                        cVar4 = cVar12;
                        f9 = f7;
                        hh3Var2 = hh3Var11;
                        ne1Var7 = ne1Var115;
                        j4 = j3;
                        j5 = j14;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f115 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f115;
                        } else {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f116 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f116;
                        }
                        kk0Var2.s();
                        rg3 rg3Var11 = expandedShape;
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                        c cVar13 = cVar3;
                        c cVarThen9 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                        i28 = (i26 & 3670016) ^ 1572864;
                        if (i28 > 1048576) {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        objP = kk0Var2.P();
                        if (z) {
                            t64 t64Var18 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        } else {
                            t64 t64Var19 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        }
                        c cVarA19 = a.a(cVarThen9, (ck2) objP, null);
                        ji4 ji4Var11 = hh3VarRememberModalBottomSheetState.c;
                        ji4Var = hh3VarRememberModalBottomSheetState.c;
                        long j15 = containerColor;
                        if (i28 <= 1048576) {
                        }
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        }
                        c cVarD10 = androidx.compose.material3.internal.a.d(cVarA19, ji4Var11, (ne1) objP2);
                        b9 b9Var10 = (b9) ji4Var.f;
                        boolean zC10 = hh3VarRememberModalBottomSheetState.c();
                        if (((ft2) ji4Var.l).getValue() != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i26 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        }
                        c cVarA110 = kz0.a(cVarD10, b9Var10, nq2.c, zC10, null, z3, (oe1) objP3, false, 168);
                        zH = kk0Var2.h(strM1830xa862b2cd);
                        objP4 = kk0Var2.P();
                        if (zH) {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        } else {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        }
                        c cVarB10 = we3.b(cVarA110, false, (le1) objP4);
                        if (i28 <= 1048576) {
                        }
                        if ((i26 & 112) != 32) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        z6 = z7 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        }
                        ne1 ne1Var116 = ne1Var4;
                        hh3 hh3Var12 = hh3VarRememberModalBottomSheetState;
                        ne1 ne1Var117 = ne1Var5;
                        int i3111 = i26 >> 21;
                        int i3112 = i27 << 9;
                        hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB10, (le1) objP5), rg3Var11, j15, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var117, ueVar, ne1Var116, hh3Var12, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i3111 & 896) | (i3111 & 112) | 12582912 | (i3112 & 7168) | (57344 & i3112), 96);
                        ne1Var6 = ne1Var116;
                        rg3Var2 = rg3Var11;
                        f8 = f6;
                        kk0Var = kk0Var2;
                        cVar4 = cVar13;
                        f9 = f7;
                        hh3Var2 = hh3Var12;
                        ne1Var7 = ne1Var117;
                        j4 = j3;
                        j5 = j15;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                    }
                }
                i23 |= 24576;
                if ((i14 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f117 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f117;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f118 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f118;
                    }
                    kk0Var2.s();
                    rg3 rg3Var12 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar14 = cVar3;
                    c cVarThen10 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var110 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var111 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA111 = a.a(cVarThen10, (ck2) objP, null);
                    ji4 ji4Var12 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j16 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD11 = androidx.compose.material3.internal.a.d(cVarA111, ji4Var12, (ne1) objP2);
                    b9 b9Var11 = (b9) ji4Var.f;
                    boolean zC11 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA112 = kz0.a(cVarD11, b9Var11, nq2.c, zC11, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB11 = we3.b(cVarA112, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var118 = ne1Var4;
                    hh3 hh3Var13 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var119 = ne1Var5;
                    int i3113 = i26 >> 21;
                    int i3114 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB11, (le1) objP5), rg3Var12, j16, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var119, ueVar, ne1Var118, hh3Var13, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i3113 & 896) | (i3113 & 112) | 12582912 | (i3114 & 7168) | (57344 & i3114), 96);
                    ne1Var6 = ne1Var118;
                    rg3Var2 = rg3Var12;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar14;
                    f9 = f7;
                    hh3Var2 = hh3Var13;
                    ne1Var7 = ne1Var119;
                    j4 = j3;
                    j5 = j16;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f119 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f119;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f1110 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f1110;
                    }
                    kk0Var2.s();
                    rg3 rg3Var13 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar15 = cVar3;
                    c cVarThen11 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var112 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var113 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA113 = a.a(cVarThen11, (ck2) objP, null);
                    ji4 ji4Var13 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j17 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD12 = androidx.compose.material3.internal.a.d(cVarA113, ji4Var13, (ne1) objP2);
                    b9 b9Var12 = (b9) ji4Var.f;
                    boolean zC12 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA114 = kz0.a(cVarD12, b9Var12, nq2.c, zC12, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB12 = we3.b(cVarA114, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var1110 = ne1Var4;
                    hh3 hh3Var14 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var1111 = ne1Var5;
                    int i3115 = i26 >> 21;
                    int i3116 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB12, (le1) objP5), rg3Var13, j17, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var1111, ueVar, ne1Var1110, hh3Var14, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i3115 & 896) | (i3115 & 112) | 12582912 | (i3116 & 7168) | (57344 & i3116), 96);
                    ne1Var6 = ne1Var1110;
                    rg3Var2 = rg3Var13;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar15;
                    f9 = f7;
                    hh3Var2 = hh3Var14;
                    ne1Var7 = ne1Var1111;
                    j4 = j3;
                    j5 = j17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                }
            }
            i18 |= 384;
            ne1Var3 = ne1Var;
            i22 = i18;
            if ((i2 & 3072) == 0) {
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
                    i5 = 2048;
                }
                i23 = i22 | i5;
            } else {
                i23 = i22;
            }
            if ((i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                if ((i2 & 24576) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i8 = 16384;
                    }
                    i23 |= i8;
                }
                if ((i14 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f1111 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f1111;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f1112 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f1112;
                    }
                    kk0Var2.s();
                    rg3 rg3Var14 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar16 = cVar3;
                    c cVarThen12 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var114 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var115 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA115 = a.a(cVarThen12, (ck2) objP, null);
                    ji4 ji4Var14 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j18 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD13 = androidx.compose.material3.internal.a.d(cVarA115, ji4Var14, (ne1) objP2);
                    b9 b9Var13 = (b9) ji4Var.f;
                    boolean zC13 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA116 = kz0.a(cVarD13, b9Var13, nq2.c, zC13, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB13 = we3.b(cVarA116, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var1112 = ne1Var4;
                    hh3 hh3Var15 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var1113 = ne1Var5;
                    int i3117 = i26 >> 21;
                    int i3118 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB13, (le1) objP5), rg3Var14, j18, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var1113, ueVar, ne1Var1112, hh3Var15, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i3117 & 896) | (i3117 & 112) | 12582912 | (i3118 & 7168) | (57344 & i3118), 96);
                    ne1Var6 = ne1Var1112;
                    rg3Var2 = rg3Var14;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar16;
                    f9 = f7;
                    hh3Var2 = hh3Var15;
                    ne1Var7 = ne1Var1113;
                    j4 = j3;
                    j5 = j18;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f1113 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f1113;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f1114 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f1114;
                    }
                    kk0Var2.s();
                    rg3 rg3Var15 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar17 = cVar3;
                    c cVarThen13 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var116 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var117 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA117 = a.a(cVarThen13, (ck2) objP, null);
                    ji4 ji4Var15 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j19 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD14 = androidx.compose.material3.internal.a.d(cVarA117, ji4Var15, (ne1) objP2);
                    b9 b9Var14 = (b9) ji4Var.f;
                    boolean zC14 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA118 = kz0.a(cVarD14, b9Var14, nq2.c, zC14, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB14 = we3.b(cVarA118, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var1114 = ne1Var4;
                    hh3 hh3Var16 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var1115 = ne1Var5;
                    int i3119 = i26 >> 21;
                    int i31110 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB14, (le1) objP5), rg3Var15, j19, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var1115, ueVar, ne1Var1114, hh3Var16, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i3119 & 896) | (i3119 & 112) | 12582912 | (i31110 & 7168) | (57344 & i31110), 96);
                    ne1Var6 = ne1Var1114;
                    rg3Var2 = rg3Var15;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar17;
                    f9 = f7;
                    hh3Var2 = hh3Var16;
                    ne1Var7 = ne1Var1115;
                    j4 = j3;
                    j5 = j19;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                }
            }
            i23 |= 24576;
            if ((i14 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1115 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1115;
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1116 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1116;
                }
                kk0Var2.s();
                rg3 rg3Var16 = expandedShape;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                c cVar18 = cVar3;
                c cVarThen14 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                i28 = (i26 & 3670016) ^ 1572864;
                if (i28 > 1048576) {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                objP = kk0Var2.P();
                if (z) {
                    t64 t64Var118 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                } else {
                    t64 t64Var119 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                }
                c cVarA119 = a.a(cVarThen14, (ck2) objP, null);
                ji4 ji4Var16 = hh3VarRememberModalBottomSheetState.c;
                ji4Var = hh3VarRememberModalBottomSheetState.c;
                long j110 = containerColor;
                if (i28 <= 1048576) {
                }
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                }
                c cVarD15 = androidx.compose.material3.internal.a.d(cVarA119, ji4Var16, (ne1) objP2);
                b9 b9Var15 = (b9) ji4Var.f;
                boolean zC15 = hh3VarRememberModalBottomSheetState.c();
                if (((ft2) ji4Var.l).getValue() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i26 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                }
                c cVarA1110 = kz0.a(cVarD15, b9Var15, nq2.c, zC15, null, z3, (oe1) objP3, false, 168);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP4 = kk0Var2.P();
                if (zH) {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                }
                c cVarB15 = we3.b(cVarA1110, false, (le1) objP4);
                if (i28 <= 1048576) {
                }
                if ((i26 & 112) != 32) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                z6 = z7 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                }
                ne1 ne1Var1116 = ne1Var4;
                hh3 hh3Var17 = hh3VarRememberModalBottomSheetState;
                ne1 ne1Var1117 = ne1Var5;
                int i31111 = i26 >> 21;
                int i31112 = i27 << 9;
                hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB15, (le1) objP5), rg3Var16, j110, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var1117, ueVar, ne1Var1116, hh3Var17, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i31111 & 896) | (i31111 & 112) | 12582912 | (i31112 & 7168) | (57344 & i31112), 96);
                ne1Var6 = ne1Var1116;
                rg3Var2 = rg3Var16;
                f8 = f6;
                kk0Var = kk0Var2;
                cVar4 = cVar18;
                f9 = f7;
                hh3Var2 = hh3Var17;
                ne1Var7 = ne1Var1117;
                j4 = j3;
                j5 = j110;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1117 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1117;
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1118 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1118;
                }
                kk0Var2.s();
                rg3 rg3Var17 = expandedShape;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                c cVar19 = cVar3;
                c cVarThen15 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                i28 = (i26 & 3670016) ^ 1572864;
                if (i28 > 1048576) {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                objP = kk0Var2.P();
                if (z) {
                    t64 t64Var1110 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                } else {
                    t64 t64Var1111 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                }
                c cVarA1111 = a.a(cVarThen15, (ck2) objP, null);
                ji4 ji4Var17 = hh3VarRememberModalBottomSheetState.c;
                ji4Var = hh3VarRememberModalBottomSheetState.c;
                long j111 = containerColor;
                if (i28 <= 1048576) {
                }
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                }
                c cVarD16 = androidx.compose.material3.internal.a.d(cVarA1111, ji4Var17, (ne1) objP2);
                b9 b9Var16 = (b9) ji4Var.f;
                boolean zC16 = hh3VarRememberModalBottomSheetState.c();
                if (((ft2) ji4Var.l).getValue() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i26 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                }
                c cVarA1112 = kz0.a(cVarD16, b9Var16, nq2.c, zC16, null, z3, (oe1) objP3, false, 168);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP4 = kk0Var2.P();
                if (zH) {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                }
                c cVarB16 = we3.b(cVarA1112, false, (le1) objP4);
                if (i28 <= 1048576) {
                }
                if ((i26 & 112) != 32) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                z6 = z7 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                }
                ne1 ne1Var1118 = ne1Var4;
                hh3 hh3Var18 = hh3VarRememberModalBottomSheetState;
                ne1 ne1Var1119 = ne1Var5;
                int i31113 = i26 >> 21;
                int i31114 = i27 << 9;
                hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB16, (le1) objP5), rg3Var17, j111, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var1119, ueVar, ne1Var1118, hh3Var18, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i31113 & 896) | (i31113 & 112) | 12582912 | (i31114 & 7168) | (57344 & i31114), 96);
                ne1Var6 = ne1Var1118;
                rg3Var2 = rg3Var17;
                f8 = f6;
                kk0Var = kk0Var2;
                cVar4 = cVar19;
                f9 = f7;
                hh3Var2 = hh3Var18;
                ne1Var7 = ne1Var1119;
                j4 = j3;
                j5 = j111;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
            }
        }
        i4 |= 384;
        i5 = 1024;
        if ((i3 & 4) != 0) {
            if ((i & 3072) == 0) {
                je1Var2 = je1Var;
                if (kk0Var2.j(je1Var2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            if (i7 != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (kk0Var2.j(le1Var)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i4 |= i9;
            }
            i10 = i3 & 16;
            if (i10 != 0) {
                i4 |= 196608;
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                if ((i & 196608) == 0) {
                    if (kk0Var2.h(cVar2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
            }
            if ((i & 1572864) == 0) {
                hh3VarRememberModalBottomSheetState = hh3Var;
                if ((i3 & 32) == 0) {
                    i31 = 524288;
                } else {
                    i31 = 524288;
                }
                i4 |= i31;
            } else {
                hh3VarRememberModalBottomSheetState = hh3Var;
            }
            i12 = i3 & 64;
            if (i12 != 0) {
                i4 |= 12582912;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.e(f3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
            }
            if ((i & 100663296) != 0) {
                i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var2.h(rg3Var)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                    i30 = i4;
                    if (kk0Var2.g(j)) {
                    }
                    i14 = i30 | i32;
                } else {
                    i30 = i4;
                }
                i14 = i30 | i32;
            } else {
                i14 = i4;
            }
            if ((i2 & 6) == 0) {
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
                    i29 = 2;
                } else {
                    i29 = 2;
                }
                i15 = i2 | i29;
            } else {
                i15 = i2;
            }
            i16 = i15;
            i17 = i3 & 1024;
            if (i17 != 0) {
                i18 = i16 | 48;
            } else if ((i2 & 48) == 0) {
                if (kk0Var2.e(f2)) {
                    i19 = 32;
                } else {
                    i19 = 16;
                }
                i18 = i16 | i19;
            } else {
                i18 = i16;
            }
            i20 = i3 & 2048;
            if (i20 != 0) {
                if ((i2 & 384) == 0) {
                    ne1Var3 = ne1Var;
                    if (kk0Var2.j(ne1Var3)) {
                        i21 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i21 = Uuid.SIZE_BITS;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                if ((i2 & 3072) == 0) {
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
                        i5 = 2048;
                    }
                    i23 = i22 | i5;
                } else {
                    i23 = i22;
                }
                if ((i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                    if ((i2 & 24576) == 0) {
                        if (kk0Var2.j(oe1Var)) {
                            i8 = 16384;
                        }
                        i23 |= i8;
                    }
                    if ((i14 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f1119 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f1119;
                        } else {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f11110 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f11110;
                        }
                        kk0Var2.s();
                        rg3 rg3Var18 = expandedShape;
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                        c cVar110 = cVar3;
                        c cVarThen16 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                        i28 = (i26 & 3670016) ^ 1572864;
                        if (i28 > 1048576) {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        objP = kk0Var2.P();
                        if (z) {
                            t64 t64Var1112 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        } else {
                            t64 t64Var1113 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        }
                        c cVarA1113 = a.a(cVarThen16, (ck2) objP, null);
                        ji4 ji4Var18 = hh3VarRememberModalBottomSheetState.c;
                        ji4Var = hh3VarRememberModalBottomSheetState.c;
                        long j112 = containerColor;
                        if (i28 <= 1048576) {
                        }
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        }
                        c cVarD17 = androidx.compose.material3.internal.a.d(cVarA1113, ji4Var18, (ne1) objP2);
                        b9 b9Var17 = (b9) ji4Var.f;
                        boolean zC17 = hh3VarRememberModalBottomSheetState.c();
                        if (((ft2) ji4Var.l).getValue() != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i26 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        }
                        c cVarA1114 = kz0.a(cVarD17, b9Var17, nq2.c, zC17, null, z3, (oe1) objP3, false, 168);
                        zH = kk0Var2.h(strM1830xa862b2cd);
                        objP4 = kk0Var2.P();
                        if (zH) {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        } else {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        }
                        c cVarB17 = we3.b(cVarA1114, false, (le1) objP4);
                        if (i28 <= 1048576) {
                        }
                        if ((i26 & 112) != 32) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        z6 = z7 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        }
                        ne1 ne1Var11110 = ne1Var4;
                        hh3 hh3Var19 = hh3VarRememberModalBottomSheetState;
                        ne1 ne1Var11111 = ne1Var5;
                        int i31115 = i26 >> 21;
                        int i31116 = i27 << 9;
                        hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB17, (le1) objP5), rg3Var18, j112, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var11111, ueVar, ne1Var11110, hh3Var19, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i31115 & 896) | (i31115 & 112) | 12582912 | (i31116 & 7168) | (57344 & i31116), 96);
                        ne1Var6 = ne1Var11110;
                        rg3Var2 = rg3Var18;
                        f8 = f6;
                        kk0Var = kk0Var2;
                        cVar4 = cVar110;
                        f9 = f7;
                        hh3Var2 = hh3Var19;
                        ne1Var7 = ne1Var11111;
                        j4 = j3;
                        j5 = j112;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f11111 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f11111;
                        } else {
                            if (i10 != 0) {
                                cVar2 = c.i;
                            }
                            if ((i3 & 32) != 0) {
                                i14 &= -3670017;
                                hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                            }
                            if (i12 != 0) {
                                f3 = 640.0f;
                            }
                            i24 = i3 & Uuid.SIZE_BITS;
                            owVar = ow.a;
                            if (i24 != 0) {
                                i25 = 6;
                                expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                                i14 &= -234881025;
                            } else {
                                i25 = 6;
                                expandedShape = rg3Var;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i14 &= -1879048193;
                                containerColor = owVar.getContainerColor(kk0Var2, i25);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                                i23 &= -15;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if (i17 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i20 != 0) {
                                ne1Var4 = cj0.b;
                            } else {
                                ne1Var4 = ne1Var;
                            }
                            float f11112 = f4;
                            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                i26 = i14;
                                i27 = i23 & (-7169);
                                ne1Var5 = ze2.c;
                            } else {
                                i26 = i14;
                                ne1Var5 = ne1Var2;
                                i27 = i23;
                            }
                            cVar3 = cVar2;
                            f5 = f3;
                            j3 = jM2x310ea166;
                            f6 = f11112;
                        }
                        kk0Var2.s();
                        rg3 rg3Var19 = expandedShape;
                        strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                        c cVar111 = cVar3;
                        c cVarThen17 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                        i28 = (i26 & 3670016) ^ 1572864;
                        if (i28 > 1048576) {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            f7 = f5;
                            if ((i26 & 1572864) != 1048576) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        objP = kk0Var2.P();
                        if (z) {
                            t64 t64Var1114 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        } else {
                            t64 t64Var1115 = fh3.a;
                            objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                            kk0Var2.l0(objP);
                        }
                        c cVarA1115 = a.a(cVarThen17, (ck2) objP, null);
                        ji4 ji4Var19 = hh3VarRememberModalBottomSheetState.c;
                        ji4Var = hh3VarRememberModalBottomSheetState.c;
                        long j113 = containerColor;
                        if (i28 <= 1048576) {
                        }
                        objP2 = kk0Var2.P();
                        if (z2) {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        } else {
                            objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                            kk0Var2.l0(objP2);
                        }
                        c cVarD18 = androidx.compose.material3.internal.a.d(cVarA1115, ji4Var19, (ne1) objP2);
                        b9 b9Var18 = (b9) ji4Var.f;
                        boolean zC18 = hh3VarRememberModalBottomSheetState.c();
                        if (((ft2) ji4Var.l).getValue() != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i26 & 57344) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP3 = kk0Var2.P();
                        if (z4) {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        } else {
                            objP3 = new bf2(le1Var, null);
                            kk0Var2.l0(objP3);
                        }
                        c cVarA1116 = kz0.a(cVarD18, b9Var18, nq2.c, zC18, null, z3, (oe1) objP3, false, 168);
                        zH = kk0Var2.h(strM1830xa862b2cd);
                        objP4 = kk0Var2.P();
                        if (zH) {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        } else {
                            objP4 = new v7(strM1830xa862b2cd, 6);
                            kk0Var2.l0(objP4);
                        }
                        c cVarB18 = we3.b(cVarA1116, false, (le1) objP4);
                        if (i28 <= 1048576) {
                        }
                        if ((i26 & 112) != 32) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        z6 = z7 | z5;
                        objP5 = kk0Var2.P();
                        if (z6) {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        } else {
                            objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                            kk0Var2.l0(objP5);
                        }
                        ne1 ne1Var11112 = ne1Var4;
                        hh3 hh3Var110 = hh3VarRememberModalBottomSheetState;
                        ne1 ne1Var11113 = ne1Var5;
                        int i31117 = i26 >> 21;
                        int i31118 = i27 << 9;
                        hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB18, (le1) objP5), rg3Var19, j113, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var11113, ueVar, ne1Var11112, hh3Var110, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i31117 & 896) | (i31117 & 112) | 12582912 | (i31118 & 7168) | (57344 & i31118), 96);
                        ne1Var6 = ne1Var11112;
                        rg3Var2 = rg3Var19;
                        f8 = f6;
                        kk0Var = kk0Var2;
                        cVar4 = cVar111;
                        f9 = f7;
                        hh3Var2 = hh3Var110;
                        ne1Var7 = ne1Var11113;
                        j4 = j3;
                        j5 = j113;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                    }
                }
                i23 |= 24576;
                if ((i14 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f11113 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f11113;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f11114 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f11114;
                    }
                    kk0Var2.s();
                    rg3 rg3Var110 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar112 = cVar3;
                    c cVarThen18 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var1116 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var1117 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA1117 = a.a(cVarThen18, (ck2) objP, null);
                    ji4 ji4Var110 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j114 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD19 = androidx.compose.material3.internal.a.d(cVarA1117, ji4Var110, (ne1) objP2);
                    b9 b9Var19 = (b9) ji4Var.f;
                    boolean zC19 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA1118 = kz0.a(cVarD19, b9Var19, nq2.c, zC19, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB19 = we3.b(cVarA1118, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var11114 = ne1Var4;
                    hh3 hh3Var111 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var11115 = ne1Var5;
                    int i31119 = i26 >> 21;
                    int i311110 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB19, (le1) objP5), rg3Var110, j114, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var11115, ueVar, ne1Var11114, hh3Var111, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i31119 & 896) | (i31119 & 112) | 12582912 | (i311110 & 7168) | (57344 & i311110), 96);
                    ne1Var6 = ne1Var11114;
                    rg3Var2 = rg3Var110;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar112;
                    f9 = f7;
                    hh3Var2 = hh3Var111;
                    ne1Var7 = ne1Var11115;
                    j4 = j3;
                    j5 = j114;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f11115 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f11115;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f11116 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f11116;
                    }
                    kk0Var2.s();
                    rg3 rg3Var111 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar113 = cVar3;
                    c cVarThen19 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var1118 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var1119 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA1119 = a.a(cVarThen19, (ck2) objP, null);
                    ji4 ji4Var111 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j115 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD110 = androidx.compose.material3.internal.a.d(cVarA1119, ji4Var111, (ne1) objP2);
                    b9 b9Var110 = (b9) ji4Var.f;
                    boolean zC110 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA11110 = kz0.a(cVarD110, b9Var110, nq2.c, zC110, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB110 = we3.b(cVarA11110, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var11116 = ne1Var4;
                    hh3 hh3Var112 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var11117 = ne1Var5;
                    int i311111 = i26 >> 21;
                    int i311112 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB110, (le1) objP5), rg3Var111, j115, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var11117, ueVar, ne1Var11116, hh3Var112, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i311111 & 896) | (i311111 & 112) | 12582912 | (i311112 & 7168) | (57344 & i311112), 96);
                    ne1Var6 = ne1Var11116;
                    rg3Var2 = rg3Var111;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar113;
                    f9 = f7;
                    hh3Var2 = hh3Var112;
                    ne1Var7 = ne1Var11117;
                    j4 = j3;
                    j5 = j115;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                }
            }
            i18 |= 384;
            ne1Var3 = ne1Var;
            i22 = i18;
            if ((i2 & 3072) == 0) {
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
                    i5 = 2048;
                }
                i23 = i22 | i5;
            } else {
                i23 = i22;
            }
            if ((i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                if ((i2 & 24576) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i8 = 16384;
                    }
                    i23 |= i8;
                }
                if ((i14 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f11117 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f11117;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f11118 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f11118;
                    }
                    kk0Var2.s();
                    rg3 rg3Var112 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar114 = cVar3;
                    c cVarThen110 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var11110 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var11111 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA11111 = a.a(cVarThen110, (ck2) objP, null);
                    ji4 ji4Var112 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j116 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD111 = androidx.compose.material3.internal.a.d(cVarA11111, ji4Var112, (ne1) objP2);
                    b9 b9Var111 = (b9) ji4Var.f;
                    boolean zC111 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA11112 = kz0.a(cVarD111, b9Var111, nq2.c, zC111, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB111 = we3.b(cVarA11112, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var11118 = ne1Var4;
                    hh3 hh3Var113 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var11119 = ne1Var5;
                    int i311113 = i26 >> 21;
                    int i311114 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB111, (le1) objP5), rg3Var112, j116, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var11119, ueVar, ne1Var11118, hh3Var113, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i311113 & 896) | (i311113 & 112) | 12582912 | (i311114 & 7168) | (57344 & i311114), 96);
                    ne1Var6 = ne1Var11118;
                    rg3Var2 = rg3Var112;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar114;
                    f9 = f7;
                    hh3Var2 = hh3Var113;
                    ne1Var7 = ne1Var11119;
                    j4 = j3;
                    j5 = j116;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f11119 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f11119;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f111110 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f111110;
                    }
                    kk0Var2.s();
                    rg3 rg3Var113 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar115 = cVar3;
                    c cVarThen111 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var11112 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var11113 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA11113 = a.a(cVarThen111, (ck2) objP, null);
                    ji4 ji4Var113 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j117 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD112 = androidx.compose.material3.internal.a.d(cVarA11113, ji4Var113, (ne1) objP2);
                    b9 b9Var112 = (b9) ji4Var.f;
                    boolean zC112 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA11114 = kz0.a(cVarD112, b9Var112, nq2.c, zC112, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB112 = we3.b(cVarA11114, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var111110 = ne1Var4;
                    hh3 hh3Var114 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var111111 = ne1Var5;
                    int i311115 = i26 >> 21;
                    int i311116 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB112, (le1) objP5), rg3Var113, j117, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var111111, ueVar, ne1Var111110, hh3Var114, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i311115 & 896) | (i311115 & 112) | 12582912 | (i311116 & 7168) | (57344 & i311116), 96);
                    ne1Var6 = ne1Var111110;
                    rg3Var2 = rg3Var113;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar115;
                    f9 = f7;
                    hh3Var2 = hh3Var114;
                    ne1Var7 = ne1Var111111;
                    j4 = j3;
                    j5 = j117;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                }
            }
            i23 |= 24576;
            if ((i14 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f111111 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f111111;
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f111112 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f111112;
                }
                kk0Var2.s();
                rg3 rg3Var114 = expandedShape;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                c cVar116 = cVar3;
                c cVarThen112 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                i28 = (i26 & 3670016) ^ 1572864;
                if (i28 > 1048576) {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                objP = kk0Var2.P();
                if (z) {
                    t64 t64Var11114 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                } else {
                    t64 t64Var11115 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                }
                c cVarA11115 = a.a(cVarThen112, (ck2) objP, null);
                ji4 ji4Var114 = hh3VarRememberModalBottomSheetState.c;
                ji4Var = hh3VarRememberModalBottomSheetState.c;
                long j118 = containerColor;
                if (i28 <= 1048576) {
                }
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                }
                c cVarD113 = androidx.compose.material3.internal.a.d(cVarA11115, ji4Var114, (ne1) objP2);
                b9 b9Var113 = (b9) ji4Var.f;
                boolean zC113 = hh3VarRememberModalBottomSheetState.c();
                if (((ft2) ji4Var.l).getValue() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i26 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                }
                c cVarA11116 = kz0.a(cVarD113, b9Var113, nq2.c, zC113, null, z3, (oe1) objP3, false, 168);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP4 = kk0Var2.P();
                if (zH) {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                }
                c cVarB113 = we3.b(cVarA11116, false, (le1) objP4);
                if (i28 <= 1048576) {
                }
                if ((i26 & 112) != 32) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                z6 = z7 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                }
                ne1 ne1Var111112 = ne1Var4;
                hh3 hh3Var115 = hh3VarRememberModalBottomSheetState;
                ne1 ne1Var111113 = ne1Var5;
                int i311117 = i26 >> 21;
                int i311118 = i27 << 9;
                hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB113, (le1) objP5), rg3Var114, j118, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var111113, ueVar, ne1Var111112, hh3Var115, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i311117 & 896) | (i311117 & 112) | 12582912 | (i311118 & 7168) | (57344 & i311118), 96);
                ne1Var6 = ne1Var111112;
                rg3Var2 = rg3Var114;
                f8 = f6;
                kk0Var = kk0Var2;
                cVar4 = cVar116;
                f9 = f7;
                hh3Var2 = hh3Var115;
                ne1Var7 = ne1Var111113;
                j4 = j3;
                j5 = j118;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f111113 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f111113;
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f111114 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f111114;
                }
                kk0Var2.s();
                rg3 rg3Var115 = expandedShape;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                c cVar117 = cVar3;
                c cVarThen113 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                i28 = (i26 & 3670016) ^ 1572864;
                if (i28 > 1048576) {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                objP = kk0Var2.P();
                if (z) {
                    t64 t64Var11116 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                } else {
                    t64 t64Var11117 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                }
                c cVarA11117 = a.a(cVarThen113, (ck2) objP, null);
                ji4 ji4Var115 = hh3VarRememberModalBottomSheetState.c;
                ji4Var = hh3VarRememberModalBottomSheetState.c;
                long j119 = containerColor;
                if (i28 <= 1048576) {
                }
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                }
                c cVarD114 = androidx.compose.material3.internal.a.d(cVarA11117, ji4Var115, (ne1) objP2);
                b9 b9Var114 = (b9) ji4Var.f;
                boolean zC114 = hh3VarRememberModalBottomSheetState.c();
                if (((ft2) ji4Var.l).getValue() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i26 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                }
                c cVarA11118 = kz0.a(cVarD114, b9Var114, nq2.c, zC114, null, z3, (oe1) objP3, false, 168);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP4 = kk0Var2.P();
                if (zH) {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                }
                c cVarB114 = we3.b(cVarA11118, false, (le1) objP4);
                if (i28 <= 1048576) {
                }
                if ((i26 & 112) != 32) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                z6 = z7 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                }
                ne1 ne1Var111114 = ne1Var4;
                hh3 hh3Var116 = hh3VarRememberModalBottomSheetState;
                ne1 ne1Var111115 = ne1Var5;
                int i311119 = i26 >> 21;
                int i3111110 = i27 << 9;
                hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB114, (le1) objP5), rg3Var115, j119, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var111115, ueVar, ne1Var111114, hh3Var116, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i311119 & 896) | (i311119 & 112) | 12582912 | (i3111110 & 7168) | (57344 & i3111110), 96);
                ne1Var6 = ne1Var111114;
                rg3Var2 = rg3Var115;
                f8 = f6;
                kk0Var = kk0Var2;
                cVar4 = cVar117;
                f9 = f7;
                hh3Var2 = hh3Var116;
                ne1Var7 = ne1Var111115;
                j4 = j3;
                j5 = j119;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
            }
        }
        i4 |= 3072;
        je1Var2 = je1Var;
        i7 = i3 & 8;
        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (kk0Var2.j(le1Var)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        i10 = i3 & 16;
        if (i10 != 0) {
            i4 |= 196608;
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            if ((i & 196608) == 0) {
                if (kk0Var2.h(cVar2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            }
        }
        if ((i & 1572864) == 0) {
            hh3VarRememberModalBottomSheetState = hh3Var;
            if ((i3 & 32) == 0) {
                i31 = 524288;
            } else {
                i31 = 524288;
            }
            i4 |= i31;
        } else {
            hh3VarRememberModalBottomSheetState = hh3Var;
        }
        i12 = i3 & 64;
        if (i12 != 0) {
            i4 |= 12582912;
            f3 = f;
        } else {
            f3 = f;
            if ((i & 12582912) == 0) {
                if (kk0Var2.e(f3)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
        }
        if ((i & 100663296) != 0) {
            i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var2.h(rg3Var)) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                i30 = i4;
                if (kk0Var2.g(j)) {
                }
                i14 = i30 | i32;
            } else {
                i30 = i4;
            }
            i14 = i30 | i32;
        } else {
            i14 = i4;
        }
        if ((i2 & 6) == 0) {
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
                i29 = 2;
            } else {
                i29 = 2;
            }
            i15 = i2 | i29;
        } else {
            i15 = i2;
        }
        i16 = i15;
        i17 = i3 & 1024;
        if (i17 != 0) {
            i18 = i16 | 48;
        } else if ((i2 & 48) == 0) {
            if (kk0Var2.e(f2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i18 = i16 | i19;
        } else {
            i18 = i16;
        }
        i20 = i3 & 2048;
        if (i20 != 0) {
            if ((i2 & 384) == 0) {
                ne1Var3 = ne1Var;
                if (kk0Var2.j(ne1Var3)) {
                    i21 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i21 = Uuid.SIZE_BITS;
                }
                i18 |= i21;
            }
            i22 = i18;
            if ((i2 & 3072) == 0) {
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
                    i5 = 2048;
                }
                i23 = i22 | i5;
            } else {
                i23 = i22;
            }
            if ((i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
                if ((i2 & 24576) == 0) {
                    if (kk0Var2.j(oe1Var)) {
                        i8 = 16384;
                    }
                    i23 |= i8;
                }
                if ((i14 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f111115 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f111115;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f111116 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f111116;
                    }
                    kk0Var2.s();
                    rg3 rg3Var116 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar118 = cVar3;
                    c cVarThen114 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var11118 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var11119 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA11119 = a.a(cVarThen114, (ck2) objP, null);
                    ji4 ji4Var116 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j1110 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD115 = androidx.compose.material3.internal.a.d(cVarA11119, ji4Var116, (ne1) objP2);
                    b9 b9Var115 = (b9) ji4Var.f;
                    boolean zC115 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA111110 = kz0.a(cVarD115, b9Var115, nq2.c, zC115, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB115 = we3.b(cVarA111110, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var111116 = ne1Var4;
                    hh3 hh3Var117 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var111117 = ne1Var5;
                    int i3111111 = i26 >> 21;
                    int i3111112 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB115, (le1) objP5), rg3Var116, j1110, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var111117, ueVar, ne1Var111116, hh3Var117, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i3111111 & 896) | (i3111111 & 112) | 12582912 | (i3111112 & 7168) | (57344 & i3111112), 96);
                    ne1Var6 = ne1Var111116;
                    rg3Var2 = rg3Var116;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar118;
                    f9 = f7;
                    hh3Var2 = hh3Var117;
                    ne1Var7 = ne1Var111117;
                    j4 = j3;
                    j5 = j1110;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f111117 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f111117;
                    } else {
                        if (i10 != 0) {
                            cVar2 = c.i;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -3670017;
                            hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                        }
                        if (i12 != 0) {
                            f3 = 640.0f;
                        }
                        i24 = i3 & Uuid.SIZE_BITS;
                        owVar = ow.a;
                        if (i24 != 0) {
                            i25 = 6;
                            expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                            i14 &= -234881025;
                        } else {
                            i25 = 6;
                            expandedShape = rg3Var;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i14 &= -1879048193;
                            containerColor = owVar.getContainerColor(kk0Var2, i25);
                        } else {
                            containerColor = j;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                            i23 &= -15;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if (i17 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i20 != 0) {
                            ne1Var4 = cj0.b;
                        } else {
                            ne1Var4 = ne1Var;
                        }
                        float f111118 = f4;
                        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i26 = i14;
                            i27 = i23 & (-7169);
                            ne1Var5 = ze2.c;
                        } else {
                            i26 = i14;
                            ne1Var5 = ne1Var2;
                            i27 = i23;
                        }
                        cVar3 = cVar2;
                        f5 = f3;
                        j3 = jM2x310ea166;
                        f6 = f111118;
                    }
                    kk0Var2.s();
                    rg3 rg3Var117 = expandedShape;
                    strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                    c cVar119 = cVar3;
                    c cVarThen115 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                    i28 = (i26 & 3670016) ^ 1572864;
                    if (i28 > 1048576) {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        f7 = f5;
                        if ((i26 & 1572864) != 1048576) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    objP = kk0Var2.P();
                    if (z) {
                        t64 t64Var111110 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    } else {
                        t64 t64Var111111 = fh3.a;
                        objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                        kk0Var2.l0(objP);
                    }
                    c cVarA111111 = a.a(cVarThen115, (ck2) objP, null);
                    ji4 ji4Var117 = hh3VarRememberModalBottomSheetState.c;
                    ji4Var = hh3VarRememberModalBottomSheetState.c;
                    long j1111 = containerColor;
                    if (i28 <= 1048576) {
                    }
                    objP2 = kk0Var2.P();
                    if (z2) {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    } else {
                        objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                        kk0Var2.l0(objP2);
                    }
                    c cVarD116 = androidx.compose.material3.internal.a.d(cVarA111111, ji4Var117, (ne1) objP2);
                    b9 b9Var116 = (b9) ji4Var.f;
                    boolean zC116 = hh3VarRememberModalBottomSheetState.c();
                    if (((ft2) ji4Var.l).getValue() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i26 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP3 = kk0Var2.P();
                    if (z4) {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    } else {
                        objP3 = new bf2(le1Var, null);
                        kk0Var2.l0(objP3);
                    }
                    c cVarA111112 = kz0.a(cVarD116, b9Var116, nq2.c, zC116, null, z3, (oe1) objP3, false, 168);
                    zH = kk0Var2.h(strM1830xa862b2cd);
                    objP4 = kk0Var2.P();
                    if (zH) {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = new v7(strM1830xa862b2cd, 6);
                        kk0Var2.l0(objP4);
                    }
                    c cVarB116 = we3.b(cVarA111112, false, (le1) objP4);
                    if (i28 <= 1048576) {
                    }
                    if ((i26 & 112) != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    z6 = z7 | z5;
                    objP5 = kk0Var2.P();
                    if (z6) {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    } else {
                        objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                        kk0Var2.l0(objP5);
                    }
                    ne1 ne1Var111118 = ne1Var4;
                    hh3 hh3Var118 = hh3VarRememberModalBottomSheetState;
                    ne1 ne1Var111119 = ne1Var5;
                    int i3111113 = i26 >> 21;
                    int i3111114 = i27 << 9;
                    hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB116, (le1) objP5), rg3Var117, j1111, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var111119, ueVar, ne1Var111118, hh3Var118, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i3111113 & 896) | (i3111113 & 112) | 12582912 | (i3111114 & 7168) | (57344 & i3111114), 96);
                    ne1Var6 = ne1Var111118;
                    rg3Var2 = rg3Var117;
                    f8 = f6;
                    kk0Var = kk0Var2;
                    cVar4 = cVar119;
                    f9 = f7;
                    hh3Var2 = hh3Var118;
                    ne1Var7 = ne1Var111119;
                    j4 = j3;
                    j5 = j1111;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
                }
            }
            i23 |= 24576;
            if ((i14 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f111119 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f111119;
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1111110 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1111110;
                }
                kk0Var2.s();
                rg3 rg3Var118 = expandedShape;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                c cVar1110 = cVar3;
                c cVarThen116 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                i28 = (i26 & 3670016) ^ 1572864;
                if (i28 > 1048576) {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                objP = kk0Var2.P();
                if (z) {
                    t64 t64Var111112 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                } else {
                    t64 t64Var111113 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                }
                c cVarA111113 = a.a(cVarThen116, (ck2) objP, null);
                ji4 ji4Var118 = hh3VarRememberModalBottomSheetState.c;
                ji4Var = hh3VarRememberModalBottomSheetState.c;
                long j1112 = containerColor;
                if (i28 <= 1048576) {
                }
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                }
                c cVarD117 = androidx.compose.material3.internal.a.d(cVarA111113, ji4Var118, (ne1) objP2);
                b9 b9Var117 = (b9) ji4Var.f;
                boolean zC117 = hh3VarRememberModalBottomSheetState.c();
                if (((ft2) ji4Var.l).getValue() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i26 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                }
                c cVarA111114 = kz0.a(cVarD117, b9Var117, nq2.c, zC117, null, z3, (oe1) objP3, false, 168);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP4 = kk0Var2.P();
                if (zH) {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                }
                c cVarB117 = we3.b(cVarA111114, false, (le1) objP4);
                if (i28 <= 1048576) {
                }
                if ((i26 & 112) != 32) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                z6 = z7 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                }
                ne1 ne1Var1111110 = ne1Var4;
                hh3 hh3Var119 = hh3VarRememberModalBottomSheetState;
                ne1 ne1Var1111111 = ne1Var5;
                int i3111115 = i26 >> 21;
                int i3111116 = i27 << 9;
                hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB117, (le1) objP5), rg3Var118, j1112, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var1111111, ueVar, ne1Var1111110, hh3Var119, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i3111115 & 896) | (i3111115 & 112) | 12582912 | (i3111116 & 7168) | (57344 & i3111116), 96);
                ne1Var6 = ne1Var1111110;
                rg3Var2 = rg3Var118;
                f8 = f6;
                kk0Var = kk0Var2;
                cVar4 = cVar1110;
                f9 = f7;
                hh3Var2 = hh3Var119;
                ne1Var7 = ne1Var1111111;
                j4 = j3;
                j5 = j1112;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1111111 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1111111;
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1111112 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1111112;
                }
                kk0Var2.s();
                rg3 rg3Var119 = expandedShape;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                c cVar1111 = cVar3;
                c cVarThen117 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                i28 = (i26 & 3670016) ^ 1572864;
                if (i28 > 1048576) {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                objP = kk0Var2.P();
                if (z) {
                    t64 t64Var111114 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                } else {
                    t64 t64Var111115 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                }
                c cVarA111115 = a.a(cVarThen117, (ck2) objP, null);
                ji4 ji4Var119 = hh3VarRememberModalBottomSheetState.c;
                ji4Var = hh3VarRememberModalBottomSheetState.c;
                long j1113 = containerColor;
                if (i28 <= 1048576) {
                }
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                }
                c cVarD118 = androidx.compose.material3.internal.a.d(cVarA111115, ji4Var119, (ne1) objP2);
                b9 b9Var118 = (b9) ji4Var.f;
                boolean zC118 = hh3VarRememberModalBottomSheetState.c();
                if (((ft2) ji4Var.l).getValue() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i26 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                }
                c cVarA111116 = kz0.a(cVarD118, b9Var118, nq2.c, zC118, null, z3, (oe1) objP3, false, 168);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP4 = kk0Var2.P();
                if (zH) {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                }
                c cVarB118 = we3.b(cVarA111116, false, (le1) objP4);
                if (i28 <= 1048576) {
                }
                if ((i26 & 112) != 32) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                z6 = z7 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                }
                ne1 ne1Var1111112 = ne1Var4;
                hh3 hh3Var1110 = hh3VarRememberModalBottomSheetState;
                ne1 ne1Var1111113 = ne1Var5;
                int i3111117 = i26 >> 21;
                int i3111118 = i27 << 9;
                hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB118, (le1) objP5), rg3Var119, j1113, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var1111113, ueVar, ne1Var1111112, hh3Var1110, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i3111117 & 896) | (i3111117 & 112) | 12582912 | (i3111118 & 7168) | (57344 & i3111118), 96);
                ne1Var6 = ne1Var1111112;
                rg3Var2 = rg3Var119;
                f8 = f6;
                kk0Var = kk0Var2;
                cVar4 = cVar1111;
                f9 = f7;
                hh3Var2 = hh3Var1110;
                ne1Var7 = ne1Var1111113;
                j4 = j3;
                j5 = j1113;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
            }
        }
        i18 |= 384;
        ne1Var3 = ne1Var;
        i22 = i18;
        if ((i2 & 3072) == 0) {
            if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
                i5 = 2048;
            }
            i23 = i22 | i5;
        } else {
            i23 = i22;
        }
        if ((i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0) {
            if ((i2 & 24576) == 0) {
                if (kk0Var2.j(oe1Var)) {
                    i8 = 16384;
                }
                i23 |= i8;
            }
            if ((i14 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1111113 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1111113;
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1111114 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1111114;
                }
                kk0Var2.s();
                rg3 rg3Var1110 = expandedShape;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                c cVar1112 = cVar3;
                c cVarThen118 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                i28 = (i26 & 3670016) ^ 1572864;
                if (i28 > 1048576) {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                objP = kk0Var2.P();
                if (z) {
                    t64 t64Var111116 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                } else {
                    t64 t64Var111117 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                }
                c cVarA111117 = a.a(cVarThen118, (ck2) objP, null);
                ji4 ji4Var1110 = hh3VarRememberModalBottomSheetState.c;
                ji4Var = hh3VarRememberModalBottomSheetState.c;
                long j1114 = containerColor;
                if (i28 <= 1048576) {
                }
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                }
                c cVarD119 = androidx.compose.material3.internal.a.d(cVarA111117, ji4Var1110, (ne1) objP2);
                b9 b9Var119 = (b9) ji4Var.f;
                boolean zC119 = hh3VarRememberModalBottomSheetState.c();
                if (((ft2) ji4Var.l).getValue() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i26 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                }
                c cVarA111118 = kz0.a(cVarD119, b9Var119, nq2.c, zC119, null, z3, (oe1) objP3, false, 168);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP4 = kk0Var2.P();
                if (zH) {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                }
                c cVarB119 = we3.b(cVarA111118, false, (le1) objP4);
                if (i28 <= 1048576) {
                }
                if ((i26 & 112) != 32) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                z6 = z7 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                }
                ne1 ne1Var1111114 = ne1Var4;
                hh3 hh3Var1111 = hh3VarRememberModalBottomSheetState;
                ne1 ne1Var1111115 = ne1Var5;
                int i3111119 = i26 >> 21;
                int i31111110 = i27 << 9;
                hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB119, (le1) objP5), rg3Var1110, j1114, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var1111115, ueVar, ne1Var1111114, hh3Var1111, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i3111119 & 896) | (i3111119 & 112) | 12582912 | (i31111110 & 7168) | (57344 & i31111110), 96);
                ne1Var6 = ne1Var1111114;
                rg3Var2 = rg3Var1110;
                f8 = f6;
                kk0Var = kk0Var2;
                cVar4 = cVar1112;
                f9 = f7;
                hh3Var2 = hh3Var1111;
                ne1Var7 = ne1Var1111115;
                j4 = j3;
                j5 = j1114;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1111115 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1111115;
                } else {
                    if (i10 != 0) {
                        cVar2 = c.i;
                    }
                    if ((i3 & 32) != 0) {
                        i14 &= -3670017;
                        hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                    }
                    if (i12 != 0) {
                        f3 = 640.0f;
                    }
                    i24 = i3 & Uuid.SIZE_BITS;
                    owVar = ow.a;
                    if (i24 != 0) {
                        i25 = 6;
                        expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                        i14 &= -234881025;
                    } else {
                        i25 = 6;
                        expandedShape = rg3Var;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i14 &= -1879048193;
                        containerColor = owVar.getContainerColor(kk0Var2, i25);
                    } else {
                        containerColor = j;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                        i23 &= -15;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if (i17 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i20 != 0) {
                        ne1Var4 = cj0.b;
                    } else {
                        ne1Var4 = ne1Var;
                    }
                    float f1111116 = f4;
                    if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i26 = i14;
                        i27 = i23 & (-7169);
                        ne1Var5 = ze2.c;
                    } else {
                        i26 = i14;
                        ne1Var5 = ne1Var2;
                        i27 = i23;
                    }
                    cVar3 = cVar2;
                    f5 = f3;
                    j3 = jM2x310ea166;
                    f6 = f1111116;
                }
                kk0Var2.s();
                rg3 rg3Var1111 = expandedShape;
                strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
                c cVar1113 = cVar3;
                c cVarThen119 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
                i28 = (i26 & 3670016) ^ 1572864;
                if (i28 > 1048576) {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    f7 = f5;
                    if ((i26 & 1572864) != 1048576) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                objP = kk0Var2.P();
                if (z) {
                    t64 t64Var111118 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                } else {
                    t64 t64Var111119 = fh3.a;
                    objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                    kk0Var2.l0(objP);
                }
                c cVarA111119 = a.a(cVarThen119, (ck2) objP, null);
                ji4 ji4Var1111 = hh3VarRememberModalBottomSheetState.c;
                ji4Var = hh3VarRememberModalBottomSheetState.c;
                long j1115 = containerColor;
                if (i28 <= 1048576) {
                }
                objP2 = kk0Var2.P();
                if (z2) {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                } else {
                    objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                    kk0Var2.l0(objP2);
                }
                c cVarD1110 = androidx.compose.material3.internal.a.d(cVarA111119, ji4Var1111, (ne1) objP2);
                b9 b9Var1110 = (b9) ji4Var.f;
                boolean zC1110 = hh3VarRememberModalBottomSheetState.c();
                if (((ft2) ji4Var.l).getValue() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i26 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = kk0Var2.P();
                if (z4) {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new bf2(le1Var, null);
                    kk0Var2.l0(objP3);
                }
                c cVarA1111110 = kz0.a(cVarD1110, b9Var1110, nq2.c, zC1110, null, z3, (oe1) objP3, false, 168);
                zH = kk0Var2.h(strM1830xa862b2cd);
                objP4 = kk0Var2.P();
                if (zH) {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = new v7(strM1830xa862b2cd, 6);
                    kk0Var2.l0(objP4);
                }
                c cVarB1110 = we3.b(cVarA1111110, false, (le1) objP4);
                if (i28 <= 1048576) {
                }
                if ((i26 & 112) != 32) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                z6 = z7 | z5;
                objP5 = kk0Var2.P();
                if (z6) {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                } else {
                    objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                    kk0Var2.l0(objP5);
                }
                ne1 ne1Var1111116 = ne1Var4;
                hh3 hh3Var1112 = hh3VarRememberModalBottomSheetState;
                ne1 ne1Var1111117 = ne1Var5;
                int i31111111 = i26 >> 21;
                int i31111112 = i27 << 9;
                hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB1110, (le1) objP5), rg3Var1111, j1115, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var1111117, ueVar, ne1Var1111116, hh3Var1112, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i31111111 & 896) | (i31111111 & 112) | 12582912 | (i31111112 & 7168) | (57344 & i31111112), 96);
                ne1Var6 = ne1Var1111116;
                rg3Var2 = rg3Var1111;
                f8 = f6;
                kk0Var = kk0Var2;
                cVar4 = cVar1113;
                f9 = f7;
                hh3Var2 = hh3Var1112;
                ne1Var7 = ne1Var1111117;
                j4 = j3;
                j5 = j1115;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
            }
        }
        i23 |= 24576;
        if ((i14 & 306783379) != 306783378) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i3 & 32) != 0) {
                    i14 &= -3670017;
                    hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i12 != 0) {
                    f3 = 640.0f;
                }
                i24 = i3 & Uuid.SIZE_BITS;
                owVar = ow.a;
                if (i24 != 0) {
                    i25 = 6;
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i14 &= -234881025;
                } else {
                    i25 = 6;
                    expandedShape = rg3Var;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i14 &= -1879048193;
                    containerColor = owVar.getContainerColor(kk0Var2, i25);
                } else {
                    containerColor = j;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                    i23 &= -15;
                } else {
                    jM2x310ea166 = j2;
                }
                if (i17 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i20 != 0) {
                    ne1Var4 = cj0.b;
                } else {
                    ne1Var4 = ne1Var;
                }
                float f1111117 = f4;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    i26 = i14;
                    i27 = i23 & (-7169);
                    ne1Var5 = ze2.c;
                } else {
                    i26 = i14;
                    ne1Var5 = ne1Var2;
                    i27 = i23;
                }
                cVar3 = cVar2;
                f5 = f3;
                j3 = jM2x310ea166;
                f6 = f1111117;
            } else {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i3 & 32) != 0) {
                    i14 &= -3670017;
                    hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i12 != 0) {
                    f3 = 640.0f;
                }
                i24 = i3 & Uuid.SIZE_BITS;
                owVar = ow.a;
                if (i24 != 0) {
                    i25 = 6;
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i14 &= -234881025;
                } else {
                    i25 = 6;
                    expandedShape = rg3Var;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i14 &= -1879048193;
                    containerColor = owVar.getContainerColor(kk0Var2, i25);
                } else {
                    containerColor = j;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                    i23 &= -15;
                } else {
                    jM2x310ea166 = j2;
                }
                if (i17 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i20 != 0) {
                    ne1Var4 = cj0.b;
                } else {
                    ne1Var4 = ne1Var;
                }
                float f1111118 = f4;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    i26 = i14;
                    i27 = i23 & (-7169);
                    ne1Var5 = ze2.c;
                } else {
                    i26 = i14;
                    ne1Var5 = ne1Var2;
                    i27 = i23;
                }
                cVar3 = cVar2;
                f5 = f3;
                j3 = jM2x310ea166;
                f6 = f1111118;
            }
            kk0Var2.s();
            rg3 rg3Var1112 = expandedShape;
            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
            c cVar1114 = cVar3;
            c cVarThen1110 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
            i28 = (i26 & 3670016) ^ 1572864;
            if (i28 > 1048576) {
                f7 = f5;
                if ((i26 & 1572864) != 1048576) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                f7 = f5;
                if ((i26 & 1572864) != 1048576) {
                    z = true;
                } else {
                    z = false;
                }
            }
            objP = kk0Var2.P();
            if (z) {
                t64 t64Var1111110 = fh3.a;
                objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                kk0Var2.l0(objP);
            } else {
                t64 t64Var1111111 = fh3.a;
                objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                kk0Var2.l0(objP);
            }
            c cVarA1111111 = a.a(cVarThen1110, (ck2) objP, null);
            ji4 ji4Var1112 = hh3VarRememberModalBottomSheetState.c;
            ji4Var = hh3VarRememberModalBottomSheetState.c;
            long j1116 = containerColor;
            if (i28 <= 1048576) {
            }
            objP2 = kk0Var2.P();
            if (z2) {
                objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                kk0Var2.l0(objP2);
            } else {
                objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                kk0Var2.l0(objP2);
            }
            c cVarD1111 = androidx.compose.material3.internal.a.d(cVarA1111111, ji4Var1112, (ne1) objP2);
            b9 b9Var1111 = (b9) ji4Var.f;
            boolean zC1111 = hh3VarRememberModalBottomSheetState.c();
            if (((ft2) ji4Var.l).getValue() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i26 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP3 = kk0Var2.P();
            if (z4) {
                objP3 = new bf2(le1Var, null);
                kk0Var2.l0(objP3);
            } else {
                objP3 = new bf2(le1Var, null);
                kk0Var2.l0(objP3);
            }
            c cVarA1111112 = kz0.a(cVarD1111, b9Var1111, nq2.c, zC1111, null, z3, (oe1) objP3, false, 168);
            zH = kk0Var2.h(strM1830xa862b2cd);
            objP4 = kk0Var2.P();
            if (zH) {
                objP4 = new v7(strM1830xa862b2cd, 6);
                kk0Var2.l0(objP4);
            } else {
                objP4 = new v7(strM1830xa862b2cd, 6);
                kk0Var2.l0(objP4);
            }
            c cVarB1111 = we3.b(cVarA1111112, false, (le1) objP4);
            if (i28 <= 1048576) {
            }
            if ((i26 & 112) != 32) {
                z5 = true;
            } else {
                z5 = true;
            }
            z6 = z7 | z5;
            objP5 = kk0Var2.P();
            if (z6) {
                objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                kk0Var2.l0(objP5);
            } else {
                objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                kk0Var2.l0(objP5);
            }
            ne1 ne1Var1111118 = ne1Var4;
            hh3 hh3Var1113 = hh3VarRememberModalBottomSheetState;
            ne1 ne1Var1111119 = ne1Var5;
            int i31111113 = i26 >> 21;
            int i31111114 = i27 << 9;
            hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB1111, (le1) objP5), rg3Var1112, j1116, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var1111119, ueVar, ne1Var1111118, hh3Var1113, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i31111113 & 896) | (i31111113 & 112) | 12582912 | (i31111114 & 7168) | (57344 & i31111114), 96);
            ne1Var6 = ne1Var1111118;
            rg3Var2 = rg3Var1112;
            f8 = f6;
            kk0Var = kk0Var2;
            cVar4 = cVar1114;
            f9 = f7;
            hh3Var2 = hh3Var1113;
            ne1Var7 = ne1Var1111119;
            j4 = j3;
            j5 = j1116;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i3 & 32) != 0) {
                    i14 &= -3670017;
                    hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i12 != 0) {
                    f3 = 640.0f;
                }
                i24 = i3 & Uuid.SIZE_BITS;
                owVar = ow.a;
                if (i24 != 0) {
                    i25 = 6;
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i14 &= -234881025;
                } else {
                    i25 = 6;
                    expandedShape = rg3Var;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i14 &= -1879048193;
                    containerColor = owVar.getContainerColor(kk0Var2, i25);
                } else {
                    containerColor = j;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                    i23 &= -15;
                } else {
                    jM2x310ea166 = j2;
                }
                if (i17 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i20 != 0) {
                    ne1Var4 = cj0.b;
                } else {
                    ne1Var4 = ne1Var;
                }
                float f1111119 = f4;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    i26 = i14;
                    i27 = i23 & (-7169);
                    ne1Var5 = ze2.c;
                } else {
                    i26 = i14;
                    ne1Var5 = ne1Var2;
                    i27 = i23;
                }
                cVar3 = cVar2;
                f5 = f3;
                j3 = jM2x310ea166;
                f6 = f1111119;
            } else {
                if (i10 != 0) {
                    cVar2 = c.i;
                }
                if ((i3 & 32) != 0) {
                    i14 &= -3670017;
                    hh3VarRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, kk0Var2, 0, 3);
                }
                if (i12 != 0) {
                    f3 = 640.0f;
                }
                i24 = i3 & Uuid.SIZE_BITS;
                owVar = ow.a;
                if (i24 != 0) {
                    i25 = 6;
                    expandedShape = owVar.getExpandedShape(kk0Var2, 6);
                    i14 &= -234881025;
                } else {
                    i25 = 6;
                    expandedShape = rg3Var;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i14 &= -1879048193;
                    containerColor = owVar.getContainerColor(kk0Var2, i25);
                } else {
                    containerColor = j;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(containerColor, kk0Var2, (i14 >> 27) & 14);
                    i23 &= -15;
                } else {
                    jM2x310ea166 = j2;
                }
                if (i17 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i20 != 0) {
                    ne1Var4 = cj0.b;
                } else {
                    ne1Var4 = ne1Var;
                }
                float f11111110 = f4;
                if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    i26 = i14;
                    i27 = i23 & (-7169);
                    ne1Var5 = ze2.c;
                } else {
                    i26 = i14;
                    ne1Var5 = ne1Var2;
                    i27 = i23;
                }
                cVar3 = cVar2;
                f5 = f3;
                j3 = jM2x310ea166;
                f6 = f11111110;
            }
            kk0Var2.s();
            rg3 rg3Var1113 = expandedShape;
            strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_pane_title, kk0Var2, 0);
            c cVar1115 = cVar3;
            c cVarThen1111 = d.o(zwVar.a(cVar3, Alignment$Companion.getTopCenter()), f5, 1).then(d.a);
            i28 = (i26 & 3670016) ^ 1572864;
            if (i28 > 1048576) {
                f7 = f5;
                if ((i26 & 1572864) != 1048576) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                f7 = f5;
                if ((i26 & 1572864) != 1048576) {
                    z = true;
                } else {
                    z = false;
                }
            }
            objP = kk0Var2.P();
            if (z) {
                t64 t64Var1111112 = fh3.a;
                objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                kk0Var2.l0(objP);
            } else {
                t64 t64Var1111113 = fh3.a;
                objP = new dh3(hh3VarRememberModalBottomSheetState, le1Var);
                kk0Var2.l0(objP);
            }
            c cVarA1111113 = a.a(cVarThen1111, (ck2) objP, null);
            ji4 ji4Var1113 = hh3VarRememberModalBottomSheetState.c;
            ji4Var = hh3VarRememberModalBottomSheetState.c;
            long j1117 = containerColor;
            if (i28 <= 1048576) {
            }
            objP2 = kk0Var2.P();
            if (z2) {
                objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                kk0Var2.l0(objP2);
            } else {
                objP2 = new ea(7, hh3VarRememberModalBottomSheetState);
                kk0Var2.l0(objP2);
            }
            c cVarD1112 = androidx.compose.material3.internal.a.d(cVarA1111113, ji4Var1113, (ne1) objP2);
            b9 b9Var1112 = (b9) ji4Var.f;
            boolean zC1112 = hh3VarRememberModalBottomSheetState.c();
            if (((ft2) ji4Var.l).getValue() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i26 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP3 = kk0Var2.P();
            if (z4) {
                objP3 = new bf2(le1Var, null);
                kk0Var2.l0(objP3);
            } else {
                objP3 = new bf2(le1Var, null);
                kk0Var2.l0(objP3);
            }
            c cVarA1111114 = kz0.a(cVarD1112, b9Var1112, nq2.c, zC1112, null, z3, (oe1) objP3, false, 168);
            zH = kk0Var2.h(strM1830xa862b2cd);
            objP4 = kk0Var2.P();
            if (zH) {
                objP4 = new v7(strM1830xa862b2cd, 6);
                kk0Var2.l0(objP4);
            } else {
                objP4 = new v7(strM1830xa862b2cd, 6);
                kk0Var2.l0(objP4);
            }
            c cVarB1112 = we3.b(cVarA1111114, false, (le1) objP4);
            if (i28 <= 1048576) {
            }
            if ((i26 & 112) != 32) {
                z5 = true;
            } else {
                z5 = true;
            }
            z6 = z7 | z5;
            objP5 = kk0Var2.P();
            if (z6) {
                objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                kk0Var2.l0(objP5);
            } else {
                objP5 = new rc(hh3VarRememberModalBottomSheetState, 29, ueVar);
                kk0Var2.l0(objP5);
            }
            ne1 ne1Var11111110 = ne1Var4;
            hh3 hh3Var1114 = hh3VarRememberModalBottomSheetState;
            ne1 ne1Var11111111 = ne1Var5;
            int i31111115 = i26 >> 21;
            int i31111116 = i27 << 9;
            hq3.m210x8dcae10(androidx.compose.ui.graphics.a.a(cVarB1112, (le1) objP5), rg3Var1113, j1117, j3, f6, 0.0f, null, zg0.rememberComposableLambda(-692668920, true, new cf2(ne1Var11111111, ueVar, ne1Var11111110, hh3Var1114, je1Var2, gq0Var, oe1Var), kk0Var2, 54), kk0Var2, (i31111115 & 896) | (i31111115 & 112) | 12582912 | (i31111116 & 7168) | (57344 & i31111116), 96);
            ne1Var6 = ne1Var11111110;
            rg3Var2 = rg3Var1113;
            f8 = f6;
            kk0Var = kk0Var2;
            cVar4 = cVar1115;
            f9 = f7;
            hh3Var2 = hh3Var1114;
            ne1Var7 = ne1Var11111111;
            j4 = j3;
            j5 = j1117;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new df2(zwVar, ueVar, gq0Var, je1Var, le1Var, cVar4, hh3Var2, f9, rg3Var2, j5, j4, f8, ne1Var6, ne1Var7, oe1Var, i, i2, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m208x3ca40b1c(long j, je1 je1Var, boolean z, ck0 ck0Var, int i) {
        int i2;
        c cVarB;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(951870469);
        if ((i & 6) == 0) {
            i2 = (kk0Var.g(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.i(z) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 147) == 146 && kk0Var.F()) {
            kk0Var.V();
        } else if (j != 16) {
            int i3 = 0;
            gn3 gn3VarAnimateFloatAsState = we.animateFloatAsState(z ? 1.0f : 0.0f, new t64(0, (b11) null, 7), 0.0f, null, null, kk0Var, 48, 28);
            String strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.close_sheet, kk0Var, 0);
            kk0Var.a0(-1785653838);
            if (z) {
                Modifier$Companion modifier$Companion = c.i;
                int i4 = i2 & 112;
                boolean z2 = i4 == 32;
                Object objP = kk0Var.P();
                if (z2 || objP == Composer$Companion.getEmpty()) {
                    objP = new ff2(je1Var, null, i3);
                    kk0Var.l0(objP);
                }
                c cVarThen = modifier$Companion.then(new SuspendPointerInputElement(je1Var, null, null, new nq3((ne1) objP), 6));
                boolean zH = (i4 == 32) | kk0Var.h(strM1830xa862b2cd);
                Object objP2 = kk0Var.P();
                if (zH || objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new gf2(strM1830xa862b2cd, je1Var, 0);
                    kk0Var.l0(objP2);
                }
                cVarB = we3.b(cVarThen, true, (le1) objP2);
            } else {
                cVarB = c.i;
            }
            kk0Var.r(false);
            Modifier$Companion modifier$Companion2 = c.i;
            c cVarThen2 = d.c.then(cVarB);
            boolean zH2 = kk0Var.h(gn3VarAnimateFloatAsState) | ((i2 & 14) == 4);
            Object objP3 = kk0Var.P();
            if (zH2 || objP3 == Composer$Companion.getEmpty()) {
                objP3 = new ir(2, j, gn3VarAnimateFloatAsState);
                kk0Var.l0(objP3);
            }
            c10.Canvas(cVarThen2, (le1) objP3, kk0Var, 0);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ef2(j, je1Var, z, i));
        }
    }

    public static final float b(n63 n63Var, float f) {
        float fD = bi3.d(n63Var.v);
        if (Float.isNaN(fD) || fD == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (g13.F(0.0f, Math.min(n63Var.w.getDensity() * 48.0f, fD), f) / fD);
    }

    public static final float c(n63 n63Var, float f) {
        float fB = bi3.b(n63Var.v);
        if (Float.isNaN(fB) || fB == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (g13.F(0.0f, Math.min(n63Var.w.getDensity() * 24.0f, fB), f) / fB);
    }

    public static final hh3 rememberModalBottomSheetState(boolean z, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            le1Var = fl1.E;
        }
        return fh3.rememberSheetState(z2, le1Var, ih3.c, false, ck0Var, (i & 14) | 384 | (i & 112), 8);
    }
}
