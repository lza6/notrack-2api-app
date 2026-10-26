package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class ka3 {
    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0125  */
    /* JADX WARN: Code duplicated, block: B:108:0x012d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0130  */
    /* JADX WARN: Code duplicated, block: B:113:0x013e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:132:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0191  */
    /* JADX WARN: Code duplicated, block: B:135:0x0196  */
    /* JADX WARN: Code duplicated, block: B:137:0x019b  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:159:0x0204  */
    /* JADX WARN: Code duplicated, block: B:161:0x020a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0217  */
    /* JADX WARN: Code duplicated, block: B:169:0x021d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0231  */
    /* JADX WARN: Code duplicated, block: B:174:0x0237  */
    /* JADX WARN: Code duplicated, block: B:180:0x0245  */
    /* JADX WARN: Code duplicated, block: B:182:0x024b  */
    /* JADX WARN: Code duplicated, block: B:185:0x025e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0266  */
    /* JADX WARN: Code duplicated, block: B:190:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
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
    /* JADX INFO: renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    public static final void m220x86c87a4b(c cVar, ne1 ne1Var, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, int i, long j, long j2, e eVar, oe1 oe1Var, ck0 ck0Var, int i2, int i3) {
        c cVar2;
        int i4;
        ne1 ne1Var5;
        int i5;
        ne1 ne1Var6;
        int i6;
        int i7;
        ne1 ne1Var7;
        int i8;
        int i9;
        ne1 ne1Var8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j3;
        long jM2x310ea166;
        int i16;
        long j4;
        c cVar3;
        long j5;
        e contentWindowInsets;
        boolean z;
        Object objP;
        qi2 qi2Var;
        boolean zH;
        Object objP2;
        le1 le1Var;
        le1 noInspectorInfo;
        long j6;
        c cVar4;
        ne1 ne1Var9;
        e eVar2;
        ne1 ne1Var10;
        int i17;
        long j7;
        ne1 ne1Var11;
        ne1 ne1Var12;
        w33 w33VarV;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1219521777);
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i2 | 6;
            cVar2 = cVar;
        } else if ((i2 & 6) == 0) {
            cVar2 = cVar;
            i4 = (kk0Var.h(cVar2) ? 4 : 2) | i2;
        } else {
            cVar2 = cVar;
            i4 = i2;
        }
        int i19 = i3 & 2;
        if (i19 == 0) {
            if ((i2 & 48) == 0) {
                ne1Var5 = ne1Var;
                i4 |= kk0Var.j(ne1Var5) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    ne1Var6 = ne1Var2;
                    if (kk0Var.j(ne1Var6)) {
                        i6 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i6 = Uuid.SIZE_BITS;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        ne1Var7 = ne1Var3;
                        if (kk0Var.j(ne1Var7)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            ne1Var8 = ne1Var4;
                            if (kk0Var.j(ne1Var8)) {
                                i10 = 16384;
                            } else {
                                i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                            }
                            i4 |= i10;
                        }
                        i11 = i3 & 32;
                        if (i11 != 0) {
                            i4 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            if (kk0Var.f(i)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                        if ((i2 & 1572864) == 0) {
                            if ((i3 & 64) == 0) {
                                i13 = i18;
                                int i20 = kk0Var.g(j) ? 1048576 : 524288;
                                i4 |= i20;
                            } else {
                                i13 = i18;
                            }
                            i4 |= i20;
                        } else {
                            i13 = i18;
                        }
                        if ((i2 & 12582912) != 0) {
                            i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                        }
                        if ((i2 & 100663296) != 0) {
                            i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            if ((i2 & 805306368) == 0) {
                                if (kk0Var.j(oe1Var)) {
                                    i14 = 536870912;
                                } else {
                                    i14 = 268435456;
                                }
                                i4 |= i14;
                            }
                            if ((i4 & 306783379) == 306783378 || !kk0Var.F()) {
                                kk0Var.X();
                                if ((i2 & 1) != 0 || kk0Var.D()) {
                                    if (i13 != 0) {
                                        cVar2 = c.i;
                                    }
                                    if (i19 != 0) {
                                        ne1Var5 = lj0.a;
                                    }
                                    if (i5 != 0) {
                                        ne1Var6 = lj0.b;
                                    }
                                    if (i7 != 0) {
                                        ne1Var7 = lj0.c;
                                    }
                                    if (i9 != 0) {
                                        ne1Var8 = lj0.d;
                                    }
                                    if (i11 != 0) {
                                        i15 = 2;
                                    } else {
                                        i15 = i;
                                    }
                                    if ((i3 & 64) != 0) {
                                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                        i4 &= -3670017;
                                    } else {
                                        j3 = j;
                                    }
                                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                        i4 &= -29360129;
                                    } else {
                                        jM2x310ea166 = j2;
                                    }
                                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                        i16 = i4 & (-234881025);
                                        j5 = j3;
                                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                        j4 = jM2x310ea166;
                                        cVar3 = cVar2;
                                    } else {
                                        i16 = i4;
                                        j4 = jM2x310ea166;
                                        cVar3 = cVar2;
                                        j5 = j3;
                                        contentWindowInsets = eVar;
                                    }
                                } else {
                                    kk0Var.V();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                        i4 &= -234881025;
                                    }
                                    i15 = i;
                                    j4 = j2;
                                    contentWindowInsets = eVar;
                                    cVar3 = cVar2;
                                    i16 = i4;
                                    j5 = j;
                                }
                                kk0Var.s();
                                int i21 = (234881024 & i16) ^ 100663296;
                                z = (i21 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864;
                                objP = kk0Var.P();
                                if (z || objP == Composer$Companion.getEmpty()) {
                                    objP = new qi2(contentWindowInsets);
                                    kk0Var.l0(objP);
                                }
                                qi2Var = (qi2) objP;
                                int i22 = i15;
                                zH = ((i21 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                                objP2 = kk0Var.P();
                                if (zH || objP2 == Composer$Companion.getEmpty()) {
                                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                    kk0Var.l0(objP2);
                                }
                                le1Var = (le1) objP2;
                                p13 p13Var = fh4.a;
                                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                    noInspectorInfo = new f01(le1Var, 10);
                                } else {
                                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                                }
                                c cVarA = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                                ne1 ne1Var13 = ne1Var5;
                                ne1 ne1Var14 = ne1Var6;
                                ne1 ne1Var15 = ne1Var7;
                                ne1 ne1Var16 = ne1Var8;
                                wg0 wg0VarRememberComposableLambda = zg0.rememberComposableLambda(-1979205334, true, new fa3(i22, ne1Var13, oe1Var, ne1Var15, ne1Var16, qi2Var, ne1Var14), kk0Var, 54);
                                int i23 = i16 >> 12;
                                int i24 = (i23 & 896) | 12582912 | (i23 & 7168);
                                e eVar3 = contentWindowInsets;
                                long j8 = j4;
                                hq3.m210x8dcae10(cVarA, null, j5, j8, 0.0f, 0.0f, null, wg0VarRememberComposableLambda, kk0Var, i24, 114);
                                j6 = j5;
                                cVar4 = cVar3;
                                ne1Var9 = ne1Var13;
                                eVar2 = eVar3;
                                ne1Var10 = ne1Var14;
                                i17 = i22;
                                j7 = j8;
                                ne1Var11 = ne1Var15;
                                ne1Var12 = ne1Var16;
                            } else {
                                kk0Var.V();
                                i17 = i;
                                eVar2 = eVar;
                                cVar4 = cVar2;
                                ne1Var9 = ne1Var5;
                                ne1Var10 = ne1Var6;
                                ne1Var11 = ne1Var7;
                                ne1Var12 = ne1Var8;
                                j6 = j;
                                j7 = j2;
                            }
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                            }
                        }
                        i4 |= 805306368;
                        if ((i4 & 306783379) == 306783378) {
                            kk0Var.X();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            } else {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            }
                            kk0Var.s();
                            int i25 = (234881024 & i16) ^ 100663296;
                            if (i25 <= 67108864) {
                            }
                            objP = kk0Var.P();
                            if (z) {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            } else {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            }
                            qi2Var = (qi2) objP;
                            int i26 = i15;
                            zH = ((i25 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                            objP2 = kk0Var.P();
                            if (zH) {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            } else {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            }
                            le1Var = (le1) objP2;
                            p13 p13Var2 = fh4.a;
                            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                noInspectorInfo = new f01(le1Var, 10);
                            } else {
                                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                            }
                            c cVarA2 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                            ne1 ne1Var17 = ne1Var5;
                            ne1 ne1Var18 = ne1Var6;
                            ne1 ne1Var19 = ne1Var7;
                            ne1 ne1Var110 = ne1Var8;
                            wg0 wg0VarRememberComposableLambda2 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i26, ne1Var17, oe1Var, ne1Var19, ne1Var110, qi2Var, ne1Var18), kk0Var, 54);
                            int i27 = i16 >> 12;
                            int i28 = (i27 & 896) | 12582912 | (i27 & 7168);
                            e eVar4 = contentWindowInsets;
                            long j9 = j4;
                            hq3.m210x8dcae10(cVarA2, null, j5, j9, 0.0f, 0.0f, null, wg0VarRememberComposableLambda2, kk0Var, i28, 114);
                            j6 = j5;
                            cVar4 = cVar3;
                            ne1Var9 = ne1Var17;
                            eVar2 = eVar4;
                            ne1Var10 = ne1Var18;
                            i17 = i26;
                            j7 = j9;
                            ne1Var11 = ne1Var19;
                            ne1Var12 = ne1Var110;
                        } else {
                            kk0Var.X();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            } else {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            }
                            kk0Var.s();
                            int i29 = (234881024 & i16) ^ 100663296;
                            if (i29 <= 67108864) {
                            }
                            objP = kk0Var.P();
                            if (z) {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            } else {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            }
                            qi2Var = (qi2) objP;
                            int i210 = i15;
                            zH = ((i29 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                            objP2 = kk0Var.P();
                            if (zH) {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            } else {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            }
                            le1Var = (le1) objP2;
                            p13 p13Var3 = fh4.a;
                            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                noInspectorInfo = new f01(le1Var, 10);
                            } else {
                                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                            }
                            c cVarA3 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                            ne1 ne1Var111 = ne1Var5;
                            ne1 ne1Var112 = ne1Var6;
                            ne1 ne1Var113 = ne1Var7;
                            ne1 ne1Var114 = ne1Var8;
                            wg0 wg0VarRememberComposableLambda3 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i210, ne1Var111, oe1Var, ne1Var113, ne1Var114, qi2Var, ne1Var112), kk0Var, 54);
                            int i211 = i16 >> 12;
                            int i212 = (i211 & 896) | 12582912 | (i211 & 7168);
                            e eVar5 = contentWindowInsets;
                            long j10 = j4;
                            hq3.m210x8dcae10(cVarA3, null, j5, j10, 0.0f, 0.0f, null, wg0VarRememberComposableLambda3, kk0Var, i212, 114);
                            j6 = j5;
                            cVar4 = cVar3;
                            ne1Var9 = ne1Var111;
                            eVar2 = eVar5;
                            ne1Var10 = ne1Var112;
                            i17 = i210;
                            j7 = j10;
                            ne1Var11 = ne1Var113;
                            ne1Var12 = ne1Var114;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                        }
                    }
                    i4 |= 24576;
                    ne1Var8 = ne1Var4;
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        if (kk0Var.f(i)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((i2 & 1572864) == 0) {
                        if ((i3 & 64) == 0) {
                            i13 = i18;
                            if (kk0Var.g(j)) {
                            }
                            i4 |= i20;
                        } else {
                            i13 = i18;
                        }
                        i4 |= i20;
                    } else {
                        i13 = i18;
                    }
                    if ((i2 & 12582912) != 0) {
                        i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                    }
                    if ((i2 & 100663296) != 0) {
                        i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (kk0Var.j(oe1Var)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i4 |= i14;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            kk0Var.X();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            } else {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            }
                            kk0Var.s();
                            int i213 = (234881024 & i16) ^ 100663296;
                            if (i213 <= 67108864) {
                            }
                            objP = kk0Var.P();
                            if (z) {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            } else {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            }
                            qi2Var = (qi2) objP;
                            int i214 = i15;
                            zH = ((i213 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                            objP2 = kk0Var.P();
                            if (zH) {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            } else {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            }
                            le1Var = (le1) objP2;
                            p13 p13Var4 = fh4.a;
                            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                noInspectorInfo = new f01(le1Var, 10);
                            } else {
                                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                            }
                            c cVarA4 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                            ne1 ne1Var115 = ne1Var5;
                            ne1 ne1Var116 = ne1Var6;
                            ne1 ne1Var117 = ne1Var7;
                            ne1 ne1Var118 = ne1Var8;
                            wg0 wg0VarRememberComposableLambda4 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i214, ne1Var115, oe1Var, ne1Var117, ne1Var118, qi2Var, ne1Var116), kk0Var, 54);
                            int i215 = i16 >> 12;
                            int i216 = (i215 & 896) | 12582912 | (i215 & 7168);
                            e eVar6 = contentWindowInsets;
                            long j11 = j4;
                            hq3.m210x8dcae10(cVarA4, null, j5, j11, 0.0f, 0.0f, null, wg0VarRememberComposableLambda4, kk0Var, i216, 114);
                            j6 = j5;
                            cVar4 = cVar3;
                            ne1Var9 = ne1Var115;
                            eVar2 = eVar6;
                            ne1Var10 = ne1Var116;
                            i17 = i214;
                            j7 = j11;
                            ne1Var11 = ne1Var117;
                            ne1Var12 = ne1Var118;
                        } else {
                            kk0Var.X();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            } else {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            }
                            kk0Var.s();
                            int i217 = (234881024 & i16) ^ 100663296;
                            if (i217 <= 67108864) {
                            }
                            objP = kk0Var.P();
                            if (z) {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            } else {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            }
                            qi2Var = (qi2) objP;
                            int i218 = i15;
                            zH = ((i217 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                            objP2 = kk0Var.P();
                            if (zH) {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            } else {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            }
                            le1Var = (le1) objP2;
                            p13 p13Var5 = fh4.a;
                            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                noInspectorInfo = new f01(le1Var, 10);
                            } else {
                                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                            }
                            c cVarA5 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                            ne1 ne1Var119 = ne1Var5;
                            ne1 ne1Var1110 = ne1Var6;
                            ne1 ne1Var1111 = ne1Var7;
                            ne1 ne1Var1112 = ne1Var8;
                            wg0 wg0VarRememberComposableLambda5 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i218, ne1Var119, oe1Var, ne1Var1111, ne1Var1112, qi2Var, ne1Var1110), kk0Var, 54);
                            int i219 = i16 >> 12;
                            int i2110 = (i219 & 896) | 12582912 | (i219 & 7168);
                            e eVar7 = contentWindowInsets;
                            long j12 = j4;
                            hq3.m210x8dcae10(cVarA5, null, j5, j12, 0.0f, 0.0f, null, wg0VarRememberComposableLambda5, kk0Var, i2110, 114);
                            j6 = j5;
                            cVar4 = cVar3;
                            ne1Var9 = ne1Var119;
                            eVar2 = eVar7;
                            ne1Var10 = ne1Var1110;
                            i17 = i218;
                            j7 = j12;
                            ne1Var11 = ne1Var1111;
                            ne1Var12 = ne1Var1112;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) == 306783378) {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i2111 = (234881024 & i16) ^ 100663296;
                        if (i2111 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i2112 = i15;
                        zH = ((i2111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var6 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA6 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var1113 = ne1Var5;
                        ne1 ne1Var1114 = ne1Var6;
                        ne1 ne1Var1115 = ne1Var7;
                        ne1 ne1Var1116 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda6 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2112, ne1Var1113, oe1Var, ne1Var1115, ne1Var1116, qi2Var, ne1Var1114), kk0Var, 54);
                        int i2113 = i16 >> 12;
                        int i2114 = (i2113 & 896) | 12582912 | (i2113 & 7168);
                        e eVar8 = contentWindowInsets;
                        long j13 = j4;
                        hq3.m210x8dcae10(cVarA6, null, j5, j13, 0.0f, 0.0f, null, wg0VarRememberComposableLambda6, kk0Var, i2114, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var1113;
                        eVar2 = eVar8;
                        ne1Var10 = ne1Var1114;
                        i17 = i2112;
                        j7 = j13;
                        ne1Var11 = ne1Var1115;
                        ne1Var12 = ne1Var1116;
                    } else {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i2115 = (234881024 & i16) ^ 100663296;
                        if (i2115 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i2116 = i15;
                        zH = ((i2115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var7 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA7 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var1117 = ne1Var5;
                        ne1 ne1Var1118 = ne1Var6;
                        ne1 ne1Var1119 = ne1Var7;
                        ne1 ne1Var11110 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda7 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2116, ne1Var1117, oe1Var, ne1Var1119, ne1Var11110, qi2Var, ne1Var1118), kk0Var, 54);
                        int i2117 = i16 >> 12;
                        int i2118 = (i2117 & 896) | 12582912 | (i2117 & 7168);
                        e eVar9 = contentWindowInsets;
                        long j14 = j4;
                        hq3.m210x8dcae10(cVarA7, null, j5, j14, 0.0f, 0.0f, null, wg0VarRememberComposableLambda7, kk0Var, i2118, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var1117;
                        eVar2 = eVar9;
                        ne1Var10 = ne1Var1118;
                        i17 = i2116;
                        j7 = j14;
                        ne1Var11 = ne1Var1119;
                        ne1Var12 = ne1Var11110;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                    }
                }
                i4 |= 3072;
                ne1Var7 = ne1Var3;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        ne1Var8 = ne1Var4;
                        if (kk0Var.j(ne1Var8)) {
                            i10 = 16384;
                        } else {
                            i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        if (kk0Var.f(i)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((i2 & 1572864) == 0) {
                        if ((i3 & 64) == 0) {
                            i13 = i18;
                            if (kk0Var.g(j)) {
                            }
                            i4 |= i20;
                        } else {
                            i13 = i18;
                        }
                        i4 |= i20;
                    } else {
                        i13 = i18;
                    }
                    if ((i2 & 12582912) != 0) {
                        i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                    }
                    if ((i2 & 100663296) != 0) {
                        i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (kk0Var.j(oe1Var)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i4 |= i14;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            kk0Var.X();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            } else {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            }
                            kk0Var.s();
                            int i2119 = (234881024 & i16) ^ 100663296;
                            if (i2119 <= 67108864) {
                            }
                            objP = kk0Var.P();
                            if (z) {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            } else {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            }
                            qi2Var = (qi2) objP;
                            int i21110 = i15;
                            zH = ((i2119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                            objP2 = kk0Var.P();
                            if (zH) {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            } else {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            }
                            le1Var = (le1) objP2;
                            p13 p13Var8 = fh4.a;
                            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                noInspectorInfo = new f01(le1Var, 10);
                            } else {
                                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                            }
                            c cVarA8 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                            ne1 ne1Var11111 = ne1Var5;
                            ne1 ne1Var11112 = ne1Var6;
                            ne1 ne1Var11113 = ne1Var7;
                            ne1 ne1Var11114 = ne1Var8;
                            wg0 wg0VarRememberComposableLambda8 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21110, ne1Var11111, oe1Var, ne1Var11113, ne1Var11114, qi2Var, ne1Var11112), kk0Var, 54);
                            int i21111 = i16 >> 12;
                            int i21112 = (i21111 & 896) | 12582912 | (i21111 & 7168);
                            e eVar10 = contentWindowInsets;
                            long j15 = j4;
                            hq3.m210x8dcae10(cVarA8, null, j5, j15, 0.0f, 0.0f, null, wg0VarRememberComposableLambda8, kk0Var, i21112, 114);
                            j6 = j5;
                            cVar4 = cVar3;
                            ne1Var9 = ne1Var11111;
                            eVar2 = eVar10;
                            ne1Var10 = ne1Var11112;
                            i17 = i21110;
                            j7 = j15;
                            ne1Var11 = ne1Var11113;
                            ne1Var12 = ne1Var11114;
                        } else {
                            kk0Var.X();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            } else {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            }
                            kk0Var.s();
                            int i21113 = (234881024 & i16) ^ 100663296;
                            if (i21113 <= 67108864) {
                            }
                            objP = kk0Var.P();
                            if (z) {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            } else {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            }
                            qi2Var = (qi2) objP;
                            int i21114 = i15;
                            zH = ((i21113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                            objP2 = kk0Var.P();
                            if (zH) {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            } else {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            }
                            le1Var = (le1) objP2;
                            p13 p13Var9 = fh4.a;
                            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                noInspectorInfo = new f01(le1Var, 10);
                            } else {
                                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                            }
                            c cVarA9 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                            ne1 ne1Var11115 = ne1Var5;
                            ne1 ne1Var11116 = ne1Var6;
                            ne1 ne1Var11117 = ne1Var7;
                            ne1 ne1Var11118 = ne1Var8;
                            wg0 wg0VarRememberComposableLambda9 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21114, ne1Var11115, oe1Var, ne1Var11117, ne1Var11118, qi2Var, ne1Var11116), kk0Var, 54);
                            int i21115 = i16 >> 12;
                            int i21116 = (i21115 & 896) | 12582912 | (i21115 & 7168);
                            e eVar11 = contentWindowInsets;
                            long j16 = j4;
                            hq3.m210x8dcae10(cVarA9, null, j5, j16, 0.0f, 0.0f, null, wg0VarRememberComposableLambda9, kk0Var, i21116, 114);
                            j6 = j5;
                            cVar4 = cVar3;
                            ne1Var9 = ne1Var11115;
                            eVar2 = eVar11;
                            ne1Var10 = ne1Var11116;
                            i17 = i21114;
                            j7 = j16;
                            ne1Var11 = ne1Var11117;
                            ne1Var12 = ne1Var11118;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) == 306783378) {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i21117 = (234881024 & i16) ^ 100663296;
                        if (i21117 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i21118 = i15;
                        zH = ((i21117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var10 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA10 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var11119 = ne1Var5;
                        ne1 ne1Var111110 = ne1Var6;
                        ne1 ne1Var111111 = ne1Var7;
                        ne1 ne1Var111112 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda10 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21118, ne1Var11119, oe1Var, ne1Var111111, ne1Var111112, qi2Var, ne1Var111110), kk0Var, 54);
                        int i21119 = i16 >> 12;
                        int i211110 = (i21119 & 896) | 12582912 | (i21119 & 7168);
                        e eVar12 = contentWindowInsets;
                        long j17 = j4;
                        hq3.m210x8dcae10(cVarA10, null, j5, j17, 0.0f, 0.0f, null, wg0VarRememberComposableLambda10, kk0Var, i211110, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var11119;
                        eVar2 = eVar12;
                        ne1Var10 = ne1Var111110;
                        i17 = i21118;
                        j7 = j17;
                        ne1Var11 = ne1Var111111;
                        ne1Var12 = ne1Var111112;
                    } else {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i211111 = (234881024 & i16) ^ 100663296;
                        if (i211111 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i211112 = i15;
                        zH = ((i211111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var11 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA11 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var111113 = ne1Var5;
                        ne1 ne1Var111114 = ne1Var6;
                        ne1 ne1Var111115 = ne1Var7;
                        ne1 ne1Var111116 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda11 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211112, ne1Var111113, oe1Var, ne1Var111115, ne1Var111116, qi2Var, ne1Var111114), kk0Var, 54);
                        int i211113 = i16 >> 12;
                        int i211114 = (i211113 & 896) | 12582912 | (i211113 & 7168);
                        e eVar13 = contentWindowInsets;
                        long j18 = j4;
                        hq3.m210x8dcae10(cVarA11, null, j5, j18, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11, kk0Var, i211114, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var111113;
                        eVar2 = eVar13;
                        ne1Var10 = ne1Var111114;
                        i17 = i211112;
                        j7 = j18;
                        ne1Var11 = ne1Var111115;
                        ne1Var12 = ne1Var111116;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                    }
                }
                i4 |= 24576;
                ne1Var8 = ne1Var4;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (kk0Var.f(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) == 0) {
                    if ((i3 & 64) == 0) {
                        i13 = i18;
                        if (kk0Var.g(j)) {
                        }
                        i4 |= i20;
                    } else {
                        i13 = i18;
                    }
                    i4 |= i20;
                } else {
                    i13 = i18;
                }
                if ((i2 & 12582912) != 0) {
                    i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i211115 = (234881024 & i16) ^ 100663296;
                        if (i211115 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i211116 = i15;
                        zH = ((i211115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var12 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA12 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var111117 = ne1Var5;
                        ne1 ne1Var111118 = ne1Var6;
                        ne1 ne1Var111119 = ne1Var7;
                        ne1 ne1Var1111110 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda12 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211116, ne1Var111117, oe1Var, ne1Var111119, ne1Var1111110, qi2Var, ne1Var111118), kk0Var, 54);
                        int i211117 = i16 >> 12;
                        int i211118 = (i211117 & 896) | 12582912 | (i211117 & 7168);
                        e eVar14 = contentWindowInsets;
                        long j19 = j4;
                        hq3.m210x8dcae10(cVarA12, null, j5, j19, 0.0f, 0.0f, null, wg0VarRememberComposableLambda12, kk0Var, i211118, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var111117;
                        eVar2 = eVar14;
                        ne1Var10 = ne1Var111118;
                        i17 = i211116;
                        j7 = j19;
                        ne1Var11 = ne1Var111119;
                        ne1Var12 = ne1Var1111110;
                    } else {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i211119 = (234881024 & i16) ^ 100663296;
                        if (i211119 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i2111110 = i15;
                        zH = ((i211119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var13 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA13 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var1111111 = ne1Var5;
                        ne1 ne1Var1111112 = ne1Var6;
                        ne1 ne1Var1111113 = ne1Var7;
                        ne1 ne1Var1111114 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda13 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111110, ne1Var1111111, oe1Var, ne1Var1111113, ne1Var1111114, qi2Var, ne1Var1111112), kk0Var, 54);
                        int i2111111 = i16 >> 12;
                        int i2111112 = (i2111111 & 896) | 12582912 | (i2111111 & 7168);
                        e eVar15 = contentWindowInsets;
                        long j110 = j4;
                        hq3.m210x8dcae10(cVarA13, null, j5, j110, 0.0f, 0.0f, null, wg0VarRememberComposableLambda13, kk0Var, i2111112, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var1111111;
                        eVar2 = eVar15;
                        ne1Var10 = ne1Var1111112;
                        i17 = i2111110;
                        j7 = j110;
                        ne1Var11 = ne1Var1111113;
                        ne1Var12 = ne1Var1111114;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) == 306783378) {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111113 = (234881024 & i16) ^ 100663296;
                    if (i2111113 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i2111114 = i15;
                    zH = ((i2111113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var14 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA14 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var1111115 = ne1Var5;
                    ne1 ne1Var1111116 = ne1Var6;
                    ne1 ne1Var1111117 = ne1Var7;
                    ne1 ne1Var1111118 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda14 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111114, ne1Var1111115, oe1Var, ne1Var1111117, ne1Var1111118, qi2Var, ne1Var1111116), kk0Var, 54);
                    int i2111115 = i16 >> 12;
                    int i2111116 = (i2111115 & 896) | 12582912 | (i2111115 & 7168);
                    e eVar16 = contentWindowInsets;
                    long j111 = j4;
                    hq3.m210x8dcae10(cVarA14, null, j5, j111, 0.0f, 0.0f, null, wg0VarRememberComposableLambda14, kk0Var, i2111116, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var1111115;
                    eVar2 = eVar16;
                    ne1Var10 = ne1Var1111116;
                    i17 = i2111114;
                    j7 = j111;
                    ne1Var11 = ne1Var1111117;
                    ne1Var12 = ne1Var1111118;
                } else {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111117 = (234881024 & i16) ^ 100663296;
                    if (i2111117 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i2111118 = i15;
                    zH = ((i2111117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var15 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA15 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var1111119 = ne1Var5;
                    ne1 ne1Var11111110 = ne1Var6;
                    ne1 ne1Var11111111 = ne1Var7;
                    ne1 ne1Var11111112 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda15 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111118, ne1Var1111119, oe1Var, ne1Var11111111, ne1Var11111112, qi2Var, ne1Var11111110), kk0Var, 54);
                    int i2111119 = i16 >> 12;
                    int i21111110 = (i2111119 & 896) | 12582912 | (i2111119 & 7168);
                    e eVar17 = contentWindowInsets;
                    long j112 = j4;
                    hq3.m210x8dcae10(cVarA15, null, j5, j112, 0.0f, 0.0f, null, wg0VarRememberComposableLambda15, kk0Var, i21111110, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var1111119;
                    eVar2 = eVar17;
                    ne1Var10 = ne1Var11111110;
                    i17 = i2111118;
                    j7 = j112;
                    ne1Var11 = ne1Var11111111;
                    ne1Var12 = ne1Var11111112;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                }
            }
            i4 |= 384;
            ne1Var6 = ne1Var2;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    ne1Var7 = ne1Var3;
                    if (kk0Var.j(ne1Var7)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        ne1Var8 = ne1Var4;
                        if (kk0Var.j(ne1Var8)) {
                            i10 = 16384;
                        } else {
                            i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        if (kk0Var.f(i)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((i2 & 1572864) == 0) {
                        if ((i3 & 64) == 0) {
                            i13 = i18;
                            if (kk0Var.g(j)) {
                            }
                            i4 |= i20;
                        } else {
                            i13 = i18;
                        }
                        i4 |= i20;
                    } else {
                        i13 = i18;
                    }
                    if ((i2 & 12582912) != 0) {
                        i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                    }
                    if ((i2 & 100663296) != 0) {
                        i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (kk0Var.j(oe1Var)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i4 |= i14;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            kk0Var.X();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            } else {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            }
                            kk0Var.s();
                            int i21111111 = (234881024 & i16) ^ 100663296;
                            if (i21111111 <= 67108864) {
                            }
                            objP = kk0Var.P();
                            if (z) {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            } else {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            }
                            qi2Var = (qi2) objP;
                            int i21111112 = i15;
                            zH = ((i21111111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                            objP2 = kk0Var.P();
                            if (zH) {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            } else {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            }
                            le1Var = (le1) objP2;
                            p13 p13Var16 = fh4.a;
                            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                noInspectorInfo = new f01(le1Var, 10);
                            } else {
                                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                            }
                            c cVarA16 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                            ne1 ne1Var11111113 = ne1Var5;
                            ne1 ne1Var11111114 = ne1Var6;
                            ne1 ne1Var11111115 = ne1Var7;
                            ne1 ne1Var11111116 = ne1Var8;
                            wg0 wg0VarRememberComposableLambda16 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111112, ne1Var11111113, oe1Var, ne1Var11111115, ne1Var11111116, qi2Var, ne1Var11111114), kk0Var, 54);
                            int i21111113 = i16 >> 12;
                            int i21111114 = (i21111113 & 896) | 12582912 | (i21111113 & 7168);
                            e eVar18 = contentWindowInsets;
                            long j113 = j4;
                            hq3.m210x8dcae10(cVarA16, null, j5, j113, 0.0f, 0.0f, null, wg0VarRememberComposableLambda16, kk0Var, i21111114, 114);
                            j6 = j5;
                            cVar4 = cVar3;
                            ne1Var9 = ne1Var11111113;
                            eVar2 = eVar18;
                            ne1Var10 = ne1Var11111114;
                            i17 = i21111112;
                            j7 = j113;
                            ne1Var11 = ne1Var11111115;
                            ne1Var12 = ne1Var11111116;
                        } else {
                            kk0Var.X();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            } else {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            }
                            kk0Var.s();
                            int i21111115 = (234881024 & i16) ^ 100663296;
                            if (i21111115 <= 67108864) {
                            }
                            objP = kk0Var.P();
                            if (z) {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            } else {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            }
                            qi2Var = (qi2) objP;
                            int i21111116 = i15;
                            zH = ((i21111115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                            objP2 = kk0Var.P();
                            if (zH) {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            } else {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            }
                            le1Var = (le1) objP2;
                            p13 p13Var17 = fh4.a;
                            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                noInspectorInfo = new f01(le1Var, 10);
                            } else {
                                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                            }
                            c cVarA17 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                            ne1 ne1Var11111117 = ne1Var5;
                            ne1 ne1Var11111118 = ne1Var6;
                            ne1 ne1Var11111119 = ne1Var7;
                            ne1 ne1Var111111110 = ne1Var8;
                            wg0 wg0VarRememberComposableLambda17 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111116, ne1Var11111117, oe1Var, ne1Var11111119, ne1Var111111110, qi2Var, ne1Var11111118), kk0Var, 54);
                            int i21111117 = i16 >> 12;
                            int i21111118 = (i21111117 & 896) | 12582912 | (i21111117 & 7168);
                            e eVar19 = contentWindowInsets;
                            long j114 = j4;
                            hq3.m210x8dcae10(cVarA17, null, j5, j114, 0.0f, 0.0f, null, wg0VarRememberComposableLambda17, kk0Var, i21111118, 114);
                            j6 = j5;
                            cVar4 = cVar3;
                            ne1Var9 = ne1Var11111117;
                            eVar2 = eVar19;
                            ne1Var10 = ne1Var11111118;
                            i17 = i21111116;
                            j7 = j114;
                            ne1Var11 = ne1Var11111119;
                            ne1Var12 = ne1Var111111110;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) == 306783378) {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i21111119 = (234881024 & i16) ^ 100663296;
                        if (i21111119 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i211111110 = i15;
                        zH = ((i21111119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var18 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA18 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var111111111 = ne1Var5;
                        ne1 ne1Var111111112 = ne1Var6;
                        ne1 ne1Var111111113 = ne1Var7;
                        ne1 ne1Var111111114 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda18 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111110, ne1Var111111111, oe1Var, ne1Var111111113, ne1Var111111114, qi2Var, ne1Var111111112), kk0Var, 54);
                        int i211111111 = i16 >> 12;
                        int i211111112 = (i211111111 & 896) | 12582912 | (i211111111 & 7168);
                        e eVar110 = contentWindowInsets;
                        long j115 = j4;
                        hq3.m210x8dcae10(cVarA18, null, j5, j115, 0.0f, 0.0f, null, wg0VarRememberComposableLambda18, kk0Var, i211111112, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var111111111;
                        eVar2 = eVar110;
                        ne1Var10 = ne1Var111111112;
                        i17 = i211111110;
                        j7 = j115;
                        ne1Var11 = ne1Var111111113;
                        ne1Var12 = ne1Var111111114;
                    } else {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i211111113 = (234881024 & i16) ^ 100663296;
                        if (i211111113 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i211111114 = i15;
                        zH = ((i211111113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var19 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA19 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var111111115 = ne1Var5;
                        ne1 ne1Var111111116 = ne1Var6;
                        ne1 ne1Var111111117 = ne1Var7;
                        ne1 ne1Var111111118 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda19 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111114, ne1Var111111115, oe1Var, ne1Var111111117, ne1Var111111118, qi2Var, ne1Var111111116), kk0Var, 54);
                        int i211111115 = i16 >> 12;
                        int i211111116 = (i211111115 & 896) | 12582912 | (i211111115 & 7168);
                        e eVar111 = contentWindowInsets;
                        long j116 = j4;
                        hq3.m210x8dcae10(cVarA19, null, j5, j116, 0.0f, 0.0f, null, wg0VarRememberComposableLambda19, kk0Var, i211111116, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var111111115;
                        eVar2 = eVar111;
                        ne1Var10 = ne1Var111111116;
                        i17 = i211111114;
                        j7 = j116;
                        ne1Var11 = ne1Var111111117;
                        ne1Var12 = ne1Var111111118;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                    }
                }
                i4 |= 24576;
                ne1Var8 = ne1Var4;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (kk0Var.f(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) == 0) {
                    if ((i3 & 64) == 0) {
                        i13 = i18;
                        if (kk0Var.g(j)) {
                        }
                        i4 |= i20;
                    } else {
                        i13 = i18;
                    }
                    i4 |= i20;
                } else {
                    i13 = i18;
                }
                if ((i2 & 12582912) != 0) {
                    i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i211111117 = (234881024 & i16) ^ 100663296;
                        if (i211111117 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i211111118 = i15;
                        zH = ((i211111117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var110 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA110 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var111111119 = ne1Var5;
                        ne1 ne1Var1111111110 = ne1Var6;
                        ne1 ne1Var1111111111 = ne1Var7;
                        ne1 ne1Var1111111112 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda110 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111118, ne1Var111111119, oe1Var, ne1Var1111111111, ne1Var1111111112, qi2Var, ne1Var1111111110), kk0Var, 54);
                        int i211111119 = i16 >> 12;
                        int i2111111110 = (i211111119 & 896) | 12582912 | (i211111119 & 7168);
                        e eVar112 = contentWindowInsets;
                        long j117 = j4;
                        hq3.m210x8dcae10(cVarA110, null, j5, j117, 0.0f, 0.0f, null, wg0VarRememberComposableLambda110, kk0Var, i2111111110, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var111111119;
                        eVar2 = eVar112;
                        ne1Var10 = ne1Var1111111110;
                        i17 = i211111118;
                        j7 = j117;
                        ne1Var11 = ne1Var1111111111;
                        ne1Var12 = ne1Var1111111112;
                    } else {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i2111111111 = (234881024 & i16) ^ 100663296;
                        if (i2111111111 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i2111111112 = i15;
                        zH = ((i2111111111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var111 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA111 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var1111111113 = ne1Var5;
                        ne1 ne1Var1111111114 = ne1Var6;
                        ne1 ne1Var1111111115 = ne1Var7;
                        ne1 ne1Var1111111116 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda111 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111112, ne1Var1111111113, oe1Var, ne1Var1111111115, ne1Var1111111116, qi2Var, ne1Var1111111114), kk0Var, 54);
                        int i2111111113 = i16 >> 12;
                        int i2111111114 = (i2111111113 & 896) | 12582912 | (i2111111113 & 7168);
                        e eVar113 = contentWindowInsets;
                        long j118 = j4;
                        hq3.m210x8dcae10(cVarA111, null, j5, j118, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111, kk0Var, i2111111114, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var1111111113;
                        eVar2 = eVar113;
                        ne1Var10 = ne1Var1111111114;
                        i17 = i2111111112;
                        j7 = j118;
                        ne1Var11 = ne1Var1111111115;
                        ne1Var12 = ne1Var1111111116;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) == 306783378) {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111111115 = (234881024 & i16) ^ 100663296;
                    if (i2111111115 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i2111111116 = i15;
                    zH = ((i2111111115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var112 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA112 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var1111111117 = ne1Var5;
                    ne1 ne1Var1111111118 = ne1Var6;
                    ne1 ne1Var1111111119 = ne1Var7;
                    ne1 ne1Var11111111110 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda112 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111116, ne1Var1111111117, oe1Var, ne1Var1111111119, ne1Var11111111110, qi2Var, ne1Var1111111118), kk0Var, 54);
                    int i2111111117 = i16 >> 12;
                    int i2111111118 = (i2111111117 & 896) | 12582912 | (i2111111117 & 7168);
                    e eVar114 = contentWindowInsets;
                    long j119 = j4;
                    hq3.m210x8dcae10(cVarA112, null, j5, j119, 0.0f, 0.0f, null, wg0VarRememberComposableLambda112, kk0Var, i2111111118, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var1111111117;
                    eVar2 = eVar114;
                    ne1Var10 = ne1Var1111111118;
                    i17 = i2111111116;
                    j7 = j119;
                    ne1Var11 = ne1Var1111111119;
                    ne1Var12 = ne1Var11111111110;
                } else {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111111119 = (234881024 & i16) ^ 100663296;
                    if (i2111111119 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i21111111110 = i15;
                    zH = ((i2111111119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var113 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA113 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var11111111111 = ne1Var5;
                    ne1 ne1Var11111111112 = ne1Var6;
                    ne1 ne1Var11111111113 = ne1Var7;
                    ne1 ne1Var11111111114 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda113 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111110, ne1Var11111111111, oe1Var, ne1Var11111111113, ne1Var11111111114, qi2Var, ne1Var11111111112), kk0Var, 54);
                    int i21111111111 = i16 >> 12;
                    int i21111111112 = (i21111111111 & 896) | 12582912 | (i21111111111 & 7168);
                    e eVar115 = contentWindowInsets;
                    long j1110 = j4;
                    hq3.m210x8dcae10(cVarA113, null, j5, j1110, 0.0f, 0.0f, null, wg0VarRememberComposableLambda113, kk0Var, i21111111112, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var11111111111;
                    eVar2 = eVar115;
                    ne1Var10 = ne1Var11111111112;
                    i17 = i21111111110;
                    j7 = j1110;
                    ne1Var11 = ne1Var11111111113;
                    ne1Var12 = ne1Var11111111114;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                }
            }
            i4 |= 3072;
            ne1Var7 = ne1Var3;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    ne1Var8 = ne1Var4;
                    if (kk0Var.j(ne1Var8)) {
                        i10 = 16384;
                    } else {
                        i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (kk0Var.f(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) == 0) {
                    if ((i3 & 64) == 0) {
                        i13 = i18;
                        if (kk0Var.g(j)) {
                        }
                        i4 |= i20;
                    } else {
                        i13 = i18;
                    }
                    i4 |= i20;
                } else {
                    i13 = i18;
                }
                if ((i2 & 12582912) != 0) {
                    i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i21111111113 = (234881024 & i16) ^ 100663296;
                        if (i21111111113 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i21111111114 = i15;
                        zH = ((i21111111113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var114 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA114 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var11111111115 = ne1Var5;
                        ne1 ne1Var11111111116 = ne1Var6;
                        ne1 ne1Var11111111117 = ne1Var7;
                        ne1 ne1Var11111111118 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda114 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111114, ne1Var11111111115, oe1Var, ne1Var11111111117, ne1Var11111111118, qi2Var, ne1Var11111111116), kk0Var, 54);
                        int i21111111115 = i16 >> 12;
                        int i21111111116 = (i21111111115 & 896) | 12582912 | (i21111111115 & 7168);
                        e eVar116 = contentWindowInsets;
                        long j1111 = j4;
                        hq3.m210x8dcae10(cVarA114, null, j5, j1111, 0.0f, 0.0f, null, wg0VarRememberComposableLambda114, kk0Var, i21111111116, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var11111111115;
                        eVar2 = eVar116;
                        ne1Var10 = ne1Var11111111116;
                        i17 = i21111111114;
                        j7 = j1111;
                        ne1Var11 = ne1Var11111111117;
                        ne1Var12 = ne1Var11111111118;
                    } else {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i21111111117 = (234881024 & i16) ^ 100663296;
                        if (i21111111117 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i21111111118 = i15;
                        zH = ((i21111111117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var115 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA115 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var11111111119 = ne1Var5;
                        ne1 ne1Var111111111110 = ne1Var6;
                        ne1 ne1Var111111111111 = ne1Var7;
                        ne1 ne1Var111111111112 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda115 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111118, ne1Var11111111119, oe1Var, ne1Var111111111111, ne1Var111111111112, qi2Var, ne1Var111111111110), kk0Var, 54);
                        int i21111111119 = i16 >> 12;
                        int i211111111110 = (i21111111119 & 896) | 12582912 | (i21111111119 & 7168);
                        e eVar117 = contentWindowInsets;
                        long j1112 = j4;
                        hq3.m210x8dcae10(cVarA115, null, j5, j1112, 0.0f, 0.0f, null, wg0VarRememberComposableLambda115, kk0Var, i211111111110, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var11111111119;
                        eVar2 = eVar117;
                        ne1Var10 = ne1Var111111111110;
                        i17 = i21111111118;
                        j7 = j1112;
                        ne1Var11 = ne1Var111111111111;
                        ne1Var12 = ne1Var111111111112;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) == 306783378) {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i211111111111 = (234881024 & i16) ^ 100663296;
                    if (i211111111111 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i211111111112 = i15;
                    zH = ((i211111111111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var116 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA116 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var111111111113 = ne1Var5;
                    ne1 ne1Var111111111114 = ne1Var6;
                    ne1 ne1Var111111111115 = ne1Var7;
                    ne1 ne1Var111111111116 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda116 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111112, ne1Var111111111113, oe1Var, ne1Var111111111115, ne1Var111111111116, qi2Var, ne1Var111111111114), kk0Var, 54);
                    int i211111111113 = i16 >> 12;
                    int i211111111114 = (i211111111113 & 896) | 12582912 | (i211111111113 & 7168);
                    e eVar118 = contentWindowInsets;
                    long j1113 = j4;
                    hq3.m210x8dcae10(cVarA116, null, j5, j1113, 0.0f, 0.0f, null, wg0VarRememberComposableLambda116, kk0Var, i211111111114, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var111111111113;
                    eVar2 = eVar118;
                    ne1Var10 = ne1Var111111111114;
                    i17 = i211111111112;
                    j7 = j1113;
                    ne1Var11 = ne1Var111111111115;
                    ne1Var12 = ne1Var111111111116;
                } else {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i211111111115 = (234881024 & i16) ^ 100663296;
                    if (i211111111115 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i211111111116 = i15;
                    zH = ((i211111111115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var117 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA117 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var111111111117 = ne1Var5;
                    ne1 ne1Var111111111118 = ne1Var6;
                    ne1 ne1Var111111111119 = ne1Var7;
                    ne1 ne1Var1111111111110 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda117 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111116, ne1Var111111111117, oe1Var, ne1Var111111111119, ne1Var1111111111110, qi2Var, ne1Var111111111118), kk0Var, 54);
                    int i211111111117 = i16 >> 12;
                    int i211111111118 = (i211111111117 & 896) | 12582912 | (i211111111117 & 7168);
                    e eVar119 = contentWindowInsets;
                    long j1114 = j4;
                    hq3.m210x8dcae10(cVarA117, null, j5, j1114, 0.0f, 0.0f, null, wg0VarRememberComposableLambda117, kk0Var, i211111111118, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var111111111117;
                    eVar2 = eVar119;
                    ne1Var10 = ne1Var111111111118;
                    i17 = i211111111116;
                    j7 = j1114;
                    ne1Var11 = ne1Var111111111119;
                    ne1Var12 = ne1Var1111111111110;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                }
            }
            i4 |= 24576;
            ne1Var8 = ne1Var4;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (kk0Var.f(i)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            if ((i2 & 1572864) == 0) {
                if ((i3 & 64) == 0) {
                    i13 = i18;
                    if (kk0Var.g(j)) {
                    }
                    i4 |= i20;
                } else {
                    i13 = i18;
                }
                i4 |= i20;
            } else {
                i13 = i18;
            }
            if ((i2 & 12582912) != 0) {
                i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
            }
            if ((i2 & 100663296) != 0) {
                i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
            }
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i2 & 805306368) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                if ((i4 & 306783379) == 306783378) {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i211111111119 = (234881024 & i16) ^ 100663296;
                    if (i211111111119 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i2111111111110 = i15;
                    zH = ((i211111111119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var118 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA118 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var1111111111111 = ne1Var5;
                    ne1 ne1Var1111111111112 = ne1Var6;
                    ne1 ne1Var1111111111113 = ne1Var7;
                    ne1 ne1Var1111111111114 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda118 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111110, ne1Var1111111111111, oe1Var, ne1Var1111111111113, ne1Var1111111111114, qi2Var, ne1Var1111111111112), kk0Var, 54);
                    int i2111111111111 = i16 >> 12;
                    int i2111111111112 = (i2111111111111 & 896) | 12582912 | (i2111111111111 & 7168);
                    e eVar1110 = contentWindowInsets;
                    long j1115 = j4;
                    hq3.m210x8dcae10(cVarA118, null, j5, j1115, 0.0f, 0.0f, null, wg0VarRememberComposableLambda118, kk0Var, i2111111111112, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var1111111111111;
                    eVar2 = eVar1110;
                    ne1Var10 = ne1Var1111111111112;
                    i17 = i2111111111110;
                    j7 = j1115;
                    ne1Var11 = ne1Var1111111111113;
                    ne1Var12 = ne1Var1111111111114;
                } else {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111111111113 = (234881024 & i16) ^ 100663296;
                    if (i2111111111113 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i2111111111114 = i15;
                    zH = ((i2111111111113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var119 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA119 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var1111111111115 = ne1Var5;
                    ne1 ne1Var1111111111116 = ne1Var6;
                    ne1 ne1Var1111111111117 = ne1Var7;
                    ne1 ne1Var1111111111118 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda119 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111114, ne1Var1111111111115, oe1Var, ne1Var1111111111117, ne1Var1111111111118, qi2Var, ne1Var1111111111116), kk0Var, 54);
                    int i2111111111115 = i16 >> 12;
                    int i2111111111116 = (i2111111111115 & 896) | 12582912 | (i2111111111115 & 7168);
                    e eVar1111 = contentWindowInsets;
                    long j1116 = j4;
                    hq3.m210x8dcae10(cVarA119, null, j5, j1116, 0.0f, 0.0f, null, wg0VarRememberComposableLambda119, kk0Var, i2111111111116, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var1111111111115;
                    eVar2 = eVar1111;
                    ne1Var10 = ne1Var1111111111116;
                    i17 = i2111111111114;
                    j7 = j1116;
                    ne1Var11 = ne1Var1111111111117;
                    ne1Var12 = ne1Var1111111111118;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                }
            }
            i4 |= 805306368;
            if ((i4 & 306783379) == 306783378) {
                kk0Var.X();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                }
                kk0Var.s();
                int i2111111111117 = (234881024 & i16) ^ 100663296;
                if (i2111111111117 <= 67108864) {
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                } else {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                }
                qi2Var = (qi2) objP;
                int i2111111111118 = i15;
                zH = ((i2111111111117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                }
                le1Var = (le1) objP2;
                p13 p13Var1110 = fh4.a;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new f01(le1Var, 10);
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                c cVarA1110 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                ne1 ne1Var1111111111119 = ne1Var5;
                ne1 ne1Var11111111111110 = ne1Var6;
                ne1 ne1Var11111111111111 = ne1Var7;
                ne1 ne1Var11111111111112 = ne1Var8;
                wg0 wg0VarRememberComposableLambda1110 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111118, ne1Var1111111111119, oe1Var, ne1Var11111111111111, ne1Var11111111111112, qi2Var, ne1Var11111111111110), kk0Var, 54);
                int i2111111111119 = i16 >> 12;
                int i21111111111110 = (i2111111111119 & 896) | 12582912 | (i2111111111119 & 7168);
                e eVar1112 = contentWindowInsets;
                long j1117 = j4;
                hq3.m210x8dcae10(cVarA1110, null, j5, j1117, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1110, kk0Var, i21111111111110, 114);
                j6 = j5;
                cVar4 = cVar3;
                ne1Var9 = ne1Var1111111111119;
                eVar2 = eVar1112;
                ne1Var10 = ne1Var11111111111110;
                i17 = i2111111111118;
                j7 = j1117;
                ne1Var11 = ne1Var11111111111111;
                ne1Var12 = ne1Var11111111111112;
            } else {
                kk0Var.X();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                }
                kk0Var.s();
                int i21111111111111 = (234881024 & i16) ^ 100663296;
                if (i21111111111111 <= 67108864) {
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                } else {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                }
                qi2Var = (qi2) objP;
                int i21111111111112 = i15;
                zH = ((i21111111111111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                }
                le1Var = (le1) objP2;
                p13 p13Var1111 = fh4.a;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new f01(le1Var, 10);
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                c cVarA1111 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                ne1 ne1Var11111111111113 = ne1Var5;
                ne1 ne1Var11111111111114 = ne1Var6;
                ne1 ne1Var11111111111115 = ne1Var7;
                ne1 ne1Var11111111111116 = ne1Var8;
                wg0 wg0VarRememberComposableLambda1111 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111112, ne1Var11111111111113, oe1Var, ne1Var11111111111115, ne1Var11111111111116, qi2Var, ne1Var11111111111114), kk0Var, 54);
                int i21111111111113 = i16 >> 12;
                int i21111111111114 = (i21111111111113 & 896) | 12582912 | (i21111111111113 & 7168);
                e eVar1113 = contentWindowInsets;
                long j1118 = j4;
                hq3.m210x8dcae10(cVarA1111, null, j5, j1118, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1111, kk0Var, i21111111111114, 114);
                j6 = j5;
                cVar4 = cVar3;
                ne1Var9 = ne1Var11111111111113;
                eVar2 = eVar1113;
                ne1Var10 = ne1Var11111111111114;
                i17 = i21111111111112;
                j7 = j1118;
                ne1Var11 = ne1Var11111111111115;
                ne1Var12 = ne1Var11111111111116;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
            }
        }
        i4 |= 48;
        ne1Var5 = ne1Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                ne1Var6 = ne1Var2;
                if (kk0Var.j(ne1Var6)) {
                    i6 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i6 = Uuid.SIZE_BITS;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    ne1Var7 = ne1Var3;
                    if (kk0Var.j(ne1Var7)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        ne1Var8 = ne1Var4;
                        if (kk0Var.j(ne1Var8)) {
                            i10 = 16384;
                        } else {
                            i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        if (kk0Var.f(i)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    if ((i2 & 1572864) == 0) {
                        if ((i3 & 64) == 0) {
                            i13 = i18;
                            if (kk0Var.g(j)) {
                            }
                            i4 |= i20;
                        } else {
                            i13 = i18;
                        }
                        i4 |= i20;
                    } else {
                        i13 = i18;
                    }
                    if ((i2 & 12582912) != 0) {
                        i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                    }
                    if ((i2 & 100663296) != 0) {
                        i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (kk0Var.j(oe1Var)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i4 |= i14;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            kk0Var.X();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            } else {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            }
                            kk0Var.s();
                            int i21111111111115 = (234881024 & i16) ^ 100663296;
                            if (i21111111111115 <= 67108864) {
                            }
                            objP = kk0Var.P();
                            if (z) {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            } else {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            }
                            qi2Var = (qi2) objP;
                            int i21111111111116 = i15;
                            zH = ((i21111111111115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                            objP2 = kk0Var.P();
                            if (zH) {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            } else {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            }
                            le1Var = (le1) objP2;
                            p13 p13Var1112 = fh4.a;
                            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                noInspectorInfo = new f01(le1Var, 10);
                            } else {
                                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                            }
                            c cVarA1112 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                            ne1 ne1Var11111111111117 = ne1Var5;
                            ne1 ne1Var11111111111118 = ne1Var6;
                            ne1 ne1Var11111111111119 = ne1Var7;
                            ne1 ne1Var111111111111110 = ne1Var8;
                            wg0 wg0VarRememberComposableLambda1112 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111116, ne1Var11111111111117, oe1Var, ne1Var11111111111119, ne1Var111111111111110, qi2Var, ne1Var11111111111118), kk0Var, 54);
                            int i21111111111117 = i16 >> 12;
                            int i21111111111118 = (i21111111111117 & 896) | 12582912 | (i21111111111117 & 7168);
                            e eVar1114 = contentWindowInsets;
                            long j1119 = j4;
                            hq3.m210x8dcae10(cVarA1112, null, j5, j1119, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1112, kk0Var, i21111111111118, 114);
                            j6 = j5;
                            cVar4 = cVar3;
                            ne1Var9 = ne1Var11111111111117;
                            eVar2 = eVar1114;
                            ne1Var10 = ne1Var11111111111118;
                            i17 = i21111111111116;
                            j7 = j1119;
                            ne1Var11 = ne1Var11111111111119;
                            ne1Var12 = ne1Var111111111111110;
                        } else {
                            kk0Var.X();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            } else {
                                if (i13 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i19 != 0) {
                                    ne1Var5 = lj0.a;
                                }
                                if (i5 != 0) {
                                    ne1Var6 = lj0.b;
                                }
                                if (i7 != 0) {
                                    ne1Var7 = lj0.c;
                                }
                                if (i9 != 0) {
                                    ne1Var8 = lj0.d;
                                }
                                if (i11 != 0) {
                                    i15 = 2;
                                } else {
                                    i15 = i;
                                }
                                if ((i3 & 64) != 0) {
                                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                    i4 &= -3670017;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & Uuid.SIZE_BITS) != 0) {
                                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                    i4 &= -29360129;
                                } else {
                                    jM2x310ea166 = j2;
                                }
                                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                    i16 = i4 & (-234881025);
                                    j5 = j3;
                                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                } else {
                                    i16 = i4;
                                    j4 = jM2x310ea166;
                                    cVar3 = cVar2;
                                    j5 = j3;
                                    contentWindowInsets = eVar;
                                }
                            }
                            kk0Var.s();
                            int i21111111111119 = (234881024 & i16) ^ 100663296;
                            if (i21111111111119 <= 67108864) {
                            }
                            objP = kk0Var.P();
                            if (z) {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            } else {
                                objP = new qi2(contentWindowInsets);
                                kk0Var.l0(objP);
                            }
                            qi2Var = (qi2) objP;
                            int i211111111111110 = i15;
                            zH = ((i21111111111119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                            objP2 = kk0Var.P();
                            if (zH) {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            } else {
                                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                                kk0Var.l0(objP2);
                            }
                            le1Var = (le1) objP2;
                            p13 p13Var1113 = fh4.a;
                            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                                noInspectorInfo = new f01(le1Var, 10);
                            } else {
                                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                            }
                            c cVarA1113 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                            ne1 ne1Var111111111111111 = ne1Var5;
                            ne1 ne1Var111111111111112 = ne1Var6;
                            ne1 ne1Var111111111111113 = ne1Var7;
                            ne1 ne1Var111111111111114 = ne1Var8;
                            wg0 wg0VarRememberComposableLambda1113 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111110, ne1Var111111111111111, oe1Var, ne1Var111111111111113, ne1Var111111111111114, qi2Var, ne1Var111111111111112), kk0Var, 54);
                            int i211111111111111 = i16 >> 12;
                            int i211111111111112 = (i211111111111111 & 896) | 12582912 | (i211111111111111 & 7168);
                            e eVar1115 = contentWindowInsets;
                            long j11110 = j4;
                            hq3.m210x8dcae10(cVarA1113, null, j5, j11110, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1113, kk0Var, i211111111111112, 114);
                            j6 = j5;
                            cVar4 = cVar3;
                            ne1Var9 = ne1Var111111111111111;
                            eVar2 = eVar1115;
                            ne1Var10 = ne1Var111111111111112;
                            i17 = i211111111111110;
                            j7 = j11110;
                            ne1Var11 = ne1Var111111111111113;
                            ne1Var12 = ne1Var111111111111114;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) == 306783378) {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i211111111111113 = (234881024 & i16) ^ 100663296;
                        if (i211111111111113 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i211111111111114 = i15;
                        zH = ((i211111111111113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var1114 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA1114 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var111111111111115 = ne1Var5;
                        ne1 ne1Var111111111111116 = ne1Var6;
                        ne1 ne1Var111111111111117 = ne1Var7;
                        ne1 ne1Var111111111111118 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda1114 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111114, ne1Var111111111111115, oe1Var, ne1Var111111111111117, ne1Var111111111111118, qi2Var, ne1Var111111111111116), kk0Var, 54);
                        int i211111111111115 = i16 >> 12;
                        int i211111111111116 = (i211111111111115 & 896) | 12582912 | (i211111111111115 & 7168);
                        e eVar1116 = contentWindowInsets;
                        long j11111 = j4;
                        hq3.m210x8dcae10(cVarA1114, null, j5, j11111, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1114, kk0Var, i211111111111116, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var111111111111115;
                        eVar2 = eVar1116;
                        ne1Var10 = ne1Var111111111111116;
                        i17 = i211111111111114;
                        j7 = j11111;
                        ne1Var11 = ne1Var111111111111117;
                        ne1Var12 = ne1Var111111111111118;
                    } else {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i211111111111117 = (234881024 & i16) ^ 100663296;
                        if (i211111111111117 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i211111111111118 = i15;
                        zH = ((i211111111111117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var1115 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA1115 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var111111111111119 = ne1Var5;
                        ne1 ne1Var1111111111111110 = ne1Var6;
                        ne1 ne1Var1111111111111111 = ne1Var7;
                        ne1 ne1Var1111111111111112 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda1115 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111118, ne1Var111111111111119, oe1Var, ne1Var1111111111111111, ne1Var1111111111111112, qi2Var, ne1Var1111111111111110), kk0Var, 54);
                        int i211111111111119 = i16 >> 12;
                        int i2111111111111110 = (i211111111111119 & 896) | 12582912 | (i211111111111119 & 7168);
                        e eVar1117 = contentWindowInsets;
                        long j11112 = j4;
                        hq3.m210x8dcae10(cVarA1115, null, j5, j11112, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1115, kk0Var, i2111111111111110, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var111111111111119;
                        eVar2 = eVar1117;
                        ne1Var10 = ne1Var1111111111111110;
                        i17 = i211111111111118;
                        j7 = j11112;
                        ne1Var11 = ne1Var1111111111111111;
                        ne1Var12 = ne1Var1111111111111112;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                    }
                }
                i4 |= 24576;
                ne1Var8 = ne1Var4;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (kk0Var.f(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) == 0) {
                    if ((i3 & 64) == 0) {
                        i13 = i18;
                        if (kk0Var.g(j)) {
                        }
                        i4 |= i20;
                    } else {
                        i13 = i18;
                    }
                    i4 |= i20;
                } else {
                    i13 = i18;
                }
                if ((i2 & 12582912) != 0) {
                    i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i2111111111111111 = (234881024 & i16) ^ 100663296;
                        if (i2111111111111111 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i2111111111111112 = i15;
                        zH = ((i2111111111111111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var1116 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA1116 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var1111111111111113 = ne1Var5;
                        ne1 ne1Var1111111111111114 = ne1Var6;
                        ne1 ne1Var1111111111111115 = ne1Var7;
                        ne1 ne1Var1111111111111116 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda1116 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111111112, ne1Var1111111111111113, oe1Var, ne1Var1111111111111115, ne1Var1111111111111116, qi2Var, ne1Var1111111111111114), kk0Var, 54);
                        int i2111111111111113 = i16 >> 12;
                        int i2111111111111114 = (i2111111111111113 & 896) | 12582912 | (i2111111111111113 & 7168);
                        e eVar1118 = contentWindowInsets;
                        long j11113 = j4;
                        hq3.m210x8dcae10(cVarA1116, null, j5, j11113, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1116, kk0Var, i2111111111111114, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var1111111111111113;
                        eVar2 = eVar1118;
                        ne1Var10 = ne1Var1111111111111114;
                        i17 = i2111111111111112;
                        j7 = j11113;
                        ne1Var11 = ne1Var1111111111111115;
                        ne1Var12 = ne1Var1111111111111116;
                    } else {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i2111111111111115 = (234881024 & i16) ^ 100663296;
                        if (i2111111111111115 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i2111111111111116 = i15;
                        zH = ((i2111111111111115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var1117 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA1117 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var1111111111111117 = ne1Var5;
                        ne1 ne1Var1111111111111118 = ne1Var6;
                        ne1 ne1Var1111111111111119 = ne1Var7;
                        ne1 ne1Var11111111111111110 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda1117 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111111116, ne1Var1111111111111117, oe1Var, ne1Var1111111111111119, ne1Var11111111111111110, qi2Var, ne1Var1111111111111118), kk0Var, 54);
                        int i2111111111111117 = i16 >> 12;
                        int i2111111111111118 = (i2111111111111117 & 896) | 12582912 | (i2111111111111117 & 7168);
                        e eVar1119 = contentWindowInsets;
                        long j11114 = j4;
                        hq3.m210x8dcae10(cVarA1117, null, j5, j11114, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1117, kk0Var, i2111111111111118, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var1111111111111117;
                        eVar2 = eVar1119;
                        ne1Var10 = ne1Var1111111111111118;
                        i17 = i2111111111111116;
                        j7 = j11114;
                        ne1Var11 = ne1Var1111111111111119;
                        ne1Var12 = ne1Var11111111111111110;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) == 306783378) {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111111111111119 = (234881024 & i16) ^ 100663296;
                    if (i2111111111111119 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i21111111111111110 = i15;
                    zH = ((i2111111111111119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var1118 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA1118 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var11111111111111111 = ne1Var5;
                    ne1 ne1Var11111111111111112 = ne1Var6;
                    ne1 ne1Var11111111111111113 = ne1Var7;
                    ne1 ne1Var11111111111111114 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda1118 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111111110, ne1Var11111111111111111, oe1Var, ne1Var11111111111111113, ne1Var11111111111111114, qi2Var, ne1Var11111111111111112), kk0Var, 54);
                    int i21111111111111111 = i16 >> 12;
                    int i21111111111111112 = (i21111111111111111 & 896) | 12582912 | (i21111111111111111 & 7168);
                    e eVar11110 = contentWindowInsets;
                    long j11115 = j4;
                    hq3.m210x8dcae10(cVarA1118, null, j5, j11115, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1118, kk0Var, i21111111111111112, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var11111111111111111;
                    eVar2 = eVar11110;
                    ne1Var10 = ne1Var11111111111111112;
                    i17 = i21111111111111110;
                    j7 = j11115;
                    ne1Var11 = ne1Var11111111111111113;
                    ne1Var12 = ne1Var11111111111111114;
                } else {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i21111111111111113 = (234881024 & i16) ^ 100663296;
                    if (i21111111111111113 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i21111111111111114 = i15;
                    zH = ((i21111111111111113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var1119 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA1119 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var11111111111111115 = ne1Var5;
                    ne1 ne1Var11111111111111116 = ne1Var6;
                    ne1 ne1Var11111111111111117 = ne1Var7;
                    ne1 ne1Var11111111111111118 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda1119 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111111114, ne1Var11111111111111115, oe1Var, ne1Var11111111111111117, ne1Var11111111111111118, qi2Var, ne1Var11111111111111116), kk0Var, 54);
                    int i21111111111111115 = i16 >> 12;
                    int i21111111111111116 = (i21111111111111115 & 896) | 12582912 | (i21111111111111115 & 7168);
                    e eVar11111 = contentWindowInsets;
                    long j11116 = j4;
                    hq3.m210x8dcae10(cVarA1119, null, j5, j11116, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1119, kk0Var, i21111111111111116, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var11111111111111115;
                    eVar2 = eVar11111;
                    ne1Var10 = ne1Var11111111111111116;
                    i17 = i21111111111111114;
                    j7 = j11116;
                    ne1Var11 = ne1Var11111111111111117;
                    ne1Var12 = ne1Var11111111111111118;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                }
            }
            i4 |= 3072;
            ne1Var7 = ne1Var3;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    ne1Var8 = ne1Var4;
                    if (kk0Var.j(ne1Var8)) {
                        i10 = 16384;
                    } else {
                        i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (kk0Var.f(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) == 0) {
                    if ((i3 & 64) == 0) {
                        i13 = i18;
                        if (kk0Var.g(j)) {
                        }
                        i4 |= i20;
                    } else {
                        i13 = i18;
                    }
                    i4 |= i20;
                } else {
                    i13 = i18;
                }
                if ((i2 & 12582912) != 0) {
                    i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i21111111111111117 = (234881024 & i16) ^ 100663296;
                        if (i21111111111111117 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i21111111111111118 = i15;
                        zH = ((i21111111111111117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var11110 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA11110 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var11111111111111119 = ne1Var5;
                        ne1 ne1Var111111111111111110 = ne1Var6;
                        ne1 ne1Var111111111111111111 = ne1Var7;
                        ne1 ne1Var111111111111111112 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda11110 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111111118, ne1Var11111111111111119, oe1Var, ne1Var111111111111111111, ne1Var111111111111111112, qi2Var, ne1Var111111111111111110), kk0Var, 54);
                        int i21111111111111119 = i16 >> 12;
                        int i211111111111111110 = (i21111111111111119 & 896) | 12582912 | (i21111111111111119 & 7168);
                        e eVar11112 = contentWindowInsets;
                        long j11117 = j4;
                        hq3.m210x8dcae10(cVarA11110, null, j5, j11117, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11110, kk0Var, i211111111111111110, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var11111111111111119;
                        eVar2 = eVar11112;
                        ne1Var10 = ne1Var111111111111111110;
                        i17 = i21111111111111118;
                        j7 = j11117;
                        ne1Var11 = ne1Var111111111111111111;
                        ne1Var12 = ne1Var111111111111111112;
                    } else {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i211111111111111111 = (234881024 & i16) ^ 100663296;
                        if (i211111111111111111 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i211111111111111112 = i15;
                        zH = ((i211111111111111111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var11111 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA11111 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var111111111111111113 = ne1Var5;
                        ne1 ne1Var111111111111111114 = ne1Var6;
                        ne1 ne1Var111111111111111115 = ne1Var7;
                        ne1 ne1Var111111111111111116 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda11111 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111111112, ne1Var111111111111111113, oe1Var, ne1Var111111111111111115, ne1Var111111111111111116, qi2Var, ne1Var111111111111111114), kk0Var, 54);
                        int i211111111111111113 = i16 >> 12;
                        int i211111111111111114 = (i211111111111111113 & 896) | 12582912 | (i211111111111111113 & 7168);
                        e eVar11113 = contentWindowInsets;
                        long j11118 = j4;
                        hq3.m210x8dcae10(cVarA11111, null, j5, j11118, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11111, kk0Var, i211111111111111114, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var111111111111111113;
                        eVar2 = eVar11113;
                        ne1Var10 = ne1Var111111111111111114;
                        i17 = i211111111111111112;
                        j7 = j11118;
                        ne1Var11 = ne1Var111111111111111115;
                        ne1Var12 = ne1Var111111111111111116;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) == 306783378) {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i211111111111111115 = (234881024 & i16) ^ 100663296;
                    if (i211111111111111115 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i211111111111111116 = i15;
                    zH = ((i211111111111111115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var11112 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA11112 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var111111111111111117 = ne1Var5;
                    ne1 ne1Var111111111111111118 = ne1Var6;
                    ne1 ne1Var111111111111111119 = ne1Var7;
                    ne1 ne1Var1111111111111111110 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda11112 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111111116, ne1Var111111111111111117, oe1Var, ne1Var111111111111111119, ne1Var1111111111111111110, qi2Var, ne1Var111111111111111118), kk0Var, 54);
                    int i211111111111111117 = i16 >> 12;
                    int i211111111111111118 = (i211111111111111117 & 896) | 12582912 | (i211111111111111117 & 7168);
                    e eVar11114 = contentWindowInsets;
                    long j11119 = j4;
                    hq3.m210x8dcae10(cVarA11112, null, j5, j11119, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11112, kk0Var, i211111111111111118, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var111111111111111117;
                    eVar2 = eVar11114;
                    ne1Var10 = ne1Var111111111111111118;
                    i17 = i211111111111111116;
                    j7 = j11119;
                    ne1Var11 = ne1Var111111111111111119;
                    ne1Var12 = ne1Var1111111111111111110;
                } else {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i211111111111111119 = (234881024 & i16) ^ 100663296;
                    if (i211111111111111119 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i2111111111111111110 = i15;
                    zH = ((i211111111111111119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var11113 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA11113 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var1111111111111111111 = ne1Var5;
                    ne1 ne1Var1111111111111111112 = ne1Var6;
                    ne1 ne1Var1111111111111111113 = ne1Var7;
                    ne1 ne1Var1111111111111111114 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda11113 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111111111110, ne1Var1111111111111111111, oe1Var, ne1Var1111111111111111113, ne1Var1111111111111111114, qi2Var, ne1Var1111111111111111112), kk0Var, 54);
                    int i2111111111111111111 = i16 >> 12;
                    int i2111111111111111112 = (i2111111111111111111 & 896) | 12582912 | (i2111111111111111111 & 7168);
                    e eVar11115 = contentWindowInsets;
                    long j111110 = j4;
                    hq3.m210x8dcae10(cVarA11113, null, j5, j111110, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11113, kk0Var, i2111111111111111112, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var1111111111111111111;
                    eVar2 = eVar11115;
                    ne1Var10 = ne1Var1111111111111111112;
                    i17 = i2111111111111111110;
                    j7 = j111110;
                    ne1Var11 = ne1Var1111111111111111113;
                    ne1Var12 = ne1Var1111111111111111114;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                }
            }
            i4 |= 24576;
            ne1Var8 = ne1Var4;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (kk0Var.f(i)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            if ((i2 & 1572864) == 0) {
                if ((i3 & 64) == 0) {
                    i13 = i18;
                    if (kk0Var.g(j)) {
                    }
                    i4 |= i20;
                } else {
                    i13 = i18;
                }
                i4 |= i20;
            } else {
                i13 = i18;
            }
            if ((i2 & 12582912) != 0) {
                i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
            }
            if ((i2 & 100663296) != 0) {
                i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
            }
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i2 & 805306368) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                if ((i4 & 306783379) == 306783378) {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111111111111111113 = (234881024 & i16) ^ 100663296;
                    if (i2111111111111111113 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i2111111111111111114 = i15;
                    zH = ((i2111111111111111113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var11114 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA11114 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var1111111111111111115 = ne1Var5;
                    ne1 ne1Var1111111111111111116 = ne1Var6;
                    ne1 ne1Var1111111111111111117 = ne1Var7;
                    ne1 ne1Var1111111111111111118 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda11114 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111111111114, ne1Var1111111111111111115, oe1Var, ne1Var1111111111111111117, ne1Var1111111111111111118, qi2Var, ne1Var1111111111111111116), kk0Var, 54);
                    int i2111111111111111115 = i16 >> 12;
                    int i2111111111111111116 = (i2111111111111111115 & 896) | 12582912 | (i2111111111111111115 & 7168);
                    e eVar11116 = contentWindowInsets;
                    long j111111 = j4;
                    hq3.m210x8dcae10(cVarA11114, null, j5, j111111, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11114, kk0Var, i2111111111111111116, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var1111111111111111115;
                    eVar2 = eVar11116;
                    ne1Var10 = ne1Var1111111111111111116;
                    i17 = i2111111111111111114;
                    j7 = j111111;
                    ne1Var11 = ne1Var1111111111111111117;
                    ne1Var12 = ne1Var1111111111111111118;
                } else {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111111111111111117 = (234881024 & i16) ^ 100663296;
                    if (i2111111111111111117 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i2111111111111111118 = i15;
                    zH = ((i2111111111111111117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var11115 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA11115 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var1111111111111111119 = ne1Var5;
                    ne1 ne1Var11111111111111111110 = ne1Var6;
                    ne1 ne1Var11111111111111111111 = ne1Var7;
                    ne1 ne1Var11111111111111111112 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda11115 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111111111118, ne1Var1111111111111111119, oe1Var, ne1Var11111111111111111111, ne1Var11111111111111111112, qi2Var, ne1Var11111111111111111110), kk0Var, 54);
                    int i2111111111111111119 = i16 >> 12;
                    int i21111111111111111110 = (i2111111111111111119 & 896) | 12582912 | (i2111111111111111119 & 7168);
                    e eVar11117 = contentWindowInsets;
                    long j111112 = j4;
                    hq3.m210x8dcae10(cVarA11115, null, j5, j111112, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11115, kk0Var, i21111111111111111110, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var1111111111111111119;
                    eVar2 = eVar11117;
                    ne1Var10 = ne1Var11111111111111111110;
                    i17 = i2111111111111111118;
                    j7 = j111112;
                    ne1Var11 = ne1Var11111111111111111111;
                    ne1Var12 = ne1Var11111111111111111112;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                }
            }
            i4 |= 805306368;
            if ((i4 & 306783379) == 306783378) {
                kk0Var.X();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                }
                kk0Var.s();
                int i21111111111111111111 = (234881024 & i16) ^ 100663296;
                if (i21111111111111111111 <= 67108864) {
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                } else {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                }
                qi2Var = (qi2) objP;
                int i21111111111111111112 = i15;
                zH = ((i21111111111111111111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                }
                le1Var = (le1) objP2;
                p13 p13Var11116 = fh4.a;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new f01(le1Var, 10);
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                c cVarA11116 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                ne1 ne1Var11111111111111111113 = ne1Var5;
                ne1 ne1Var11111111111111111114 = ne1Var6;
                ne1 ne1Var11111111111111111115 = ne1Var7;
                ne1 ne1Var11111111111111111116 = ne1Var8;
                wg0 wg0VarRememberComposableLambda11116 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111111111112, ne1Var11111111111111111113, oe1Var, ne1Var11111111111111111115, ne1Var11111111111111111116, qi2Var, ne1Var11111111111111111114), kk0Var, 54);
                int i21111111111111111113 = i16 >> 12;
                int i21111111111111111114 = (i21111111111111111113 & 896) | 12582912 | (i21111111111111111113 & 7168);
                e eVar11118 = contentWindowInsets;
                long j111113 = j4;
                hq3.m210x8dcae10(cVarA11116, null, j5, j111113, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11116, kk0Var, i21111111111111111114, 114);
                j6 = j5;
                cVar4 = cVar3;
                ne1Var9 = ne1Var11111111111111111113;
                eVar2 = eVar11118;
                ne1Var10 = ne1Var11111111111111111114;
                i17 = i21111111111111111112;
                j7 = j111113;
                ne1Var11 = ne1Var11111111111111111115;
                ne1Var12 = ne1Var11111111111111111116;
            } else {
                kk0Var.X();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                }
                kk0Var.s();
                int i21111111111111111115 = (234881024 & i16) ^ 100663296;
                if (i21111111111111111115 <= 67108864) {
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                } else {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                }
                qi2Var = (qi2) objP;
                int i21111111111111111116 = i15;
                zH = ((i21111111111111111115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                }
                le1Var = (le1) objP2;
                p13 p13Var11117 = fh4.a;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new f01(le1Var, 10);
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                c cVarA11117 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                ne1 ne1Var11111111111111111117 = ne1Var5;
                ne1 ne1Var11111111111111111118 = ne1Var6;
                ne1 ne1Var11111111111111111119 = ne1Var7;
                ne1 ne1Var111111111111111111110 = ne1Var8;
                wg0 wg0VarRememberComposableLambda11117 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111111111116, ne1Var11111111111111111117, oe1Var, ne1Var11111111111111111119, ne1Var111111111111111111110, qi2Var, ne1Var11111111111111111118), kk0Var, 54);
                int i21111111111111111117 = i16 >> 12;
                int i21111111111111111118 = (i21111111111111111117 & 896) | 12582912 | (i21111111111111111117 & 7168);
                e eVar11119 = contentWindowInsets;
                long j111114 = j4;
                hq3.m210x8dcae10(cVarA11117, null, j5, j111114, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11117, kk0Var, i21111111111111111118, 114);
                j6 = j5;
                cVar4 = cVar3;
                ne1Var9 = ne1Var11111111111111111117;
                eVar2 = eVar11119;
                ne1Var10 = ne1Var11111111111111111118;
                i17 = i21111111111111111116;
                j7 = j111114;
                ne1Var11 = ne1Var11111111111111111119;
                ne1Var12 = ne1Var111111111111111111110;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
            }
        }
        i4 |= 384;
        ne1Var6 = ne1Var2;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                ne1Var7 = ne1Var3;
                if (kk0Var.j(ne1Var7)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    ne1Var8 = ne1Var4;
                    if (kk0Var.j(ne1Var8)) {
                        i10 = 16384;
                    } else {
                        i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (kk0Var.f(i)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                if ((i2 & 1572864) == 0) {
                    if ((i3 & 64) == 0) {
                        i13 = i18;
                        if (kk0Var.g(j)) {
                        }
                        i4 |= i20;
                    } else {
                        i13 = i18;
                    }
                    i4 |= i20;
                } else {
                    i13 = i18;
                }
                if ((i2 & 12582912) != 0) {
                    i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
                }
                if ((i2 & 100663296) != 0) {
                    i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (kk0Var.j(oe1Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i21111111111111111119 = (234881024 & i16) ^ 100663296;
                        if (i21111111111111111119 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i211111111111111111110 = i15;
                        zH = ((i21111111111111111119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var11118 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA11118 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var111111111111111111111 = ne1Var5;
                        ne1 ne1Var111111111111111111112 = ne1Var6;
                        ne1 ne1Var111111111111111111113 = ne1Var7;
                        ne1 ne1Var111111111111111111114 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda11118 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111111111110, ne1Var111111111111111111111, oe1Var, ne1Var111111111111111111113, ne1Var111111111111111111114, qi2Var, ne1Var111111111111111111112), kk0Var, 54);
                        int i211111111111111111111 = i16 >> 12;
                        int i211111111111111111112 = (i211111111111111111111 & 896) | 12582912 | (i211111111111111111111 & 7168);
                        e eVar111110 = contentWindowInsets;
                        long j111115 = j4;
                        hq3.m210x8dcae10(cVarA11118, null, j5, j111115, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11118, kk0Var, i211111111111111111112, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var111111111111111111111;
                        eVar2 = eVar111110;
                        ne1Var10 = ne1Var111111111111111111112;
                        i17 = i211111111111111111110;
                        j7 = j111115;
                        ne1Var11 = ne1Var111111111111111111113;
                        ne1Var12 = ne1Var111111111111111111114;
                    } else {
                        kk0Var.X();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        } else {
                            if (i13 != 0) {
                                cVar2 = c.i;
                            }
                            if (i19 != 0) {
                                ne1Var5 = lj0.a;
                            }
                            if (i5 != 0) {
                                ne1Var6 = lj0.b;
                            }
                            if (i7 != 0) {
                                ne1Var7 = lj0.c;
                            }
                            if (i9 != 0) {
                                ne1Var8 = lj0.d;
                            }
                            if (i11 != 0) {
                                i15 = 2;
                            } else {
                                i15 = i;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                                i4 &= -3670017;
                            } else {
                                j3 = j;
                            }
                            if ((i3 & Uuid.SIZE_BITS) != 0) {
                                jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                                i4 &= -29360129;
                            } else {
                                jM2x310ea166 = j2;
                            }
                            if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                i16 = i4 & (-234881025);
                                j5 = j3;
                                contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                            } else {
                                i16 = i4;
                                j4 = jM2x310ea166;
                                cVar3 = cVar2;
                                j5 = j3;
                                contentWindowInsets = eVar;
                            }
                        }
                        kk0Var.s();
                        int i211111111111111111113 = (234881024 & i16) ^ 100663296;
                        if (i211111111111111111113 <= 67108864) {
                        }
                        objP = kk0Var.P();
                        if (z) {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        } else {
                            objP = new qi2(contentWindowInsets);
                            kk0Var.l0(objP);
                        }
                        qi2Var = (qi2) objP;
                        int i211111111111111111114 = i15;
                        zH = ((i211111111111111111113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                        objP2 = kk0Var.P();
                        if (zH) {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        } else {
                            objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                            kk0Var.l0(objP2);
                        }
                        le1Var = (le1) objP2;
                        p13 p13Var11119 = fh4.a;
                        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            noInspectorInfo = new f01(le1Var, 10);
                        } else {
                            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                        }
                        c cVarA11119 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                        ne1 ne1Var111111111111111111115 = ne1Var5;
                        ne1 ne1Var111111111111111111116 = ne1Var6;
                        ne1 ne1Var111111111111111111117 = ne1Var7;
                        ne1 ne1Var111111111111111111118 = ne1Var8;
                        wg0 wg0VarRememberComposableLambda11119 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111111111114, ne1Var111111111111111111115, oe1Var, ne1Var111111111111111111117, ne1Var111111111111111111118, qi2Var, ne1Var111111111111111111116), kk0Var, 54);
                        int i211111111111111111115 = i16 >> 12;
                        int i211111111111111111116 = (i211111111111111111115 & 896) | 12582912 | (i211111111111111111115 & 7168);
                        e eVar111111 = contentWindowInsets;
                        long j111116 = j4;
                        hq3.m210x8dcae10(cVarA11119, null, j5, j111116, 0.0f, 0.0f, null, wg0VarRememberComposableLambda11119, kk0Var, i211111111111111111116, 114);
                        j6 = j5;
                        cVar4 = cVar3;
                        ne1Var9 = ne1Var111111111111111111115;
                        eVar2 = eVar111111;
                        ne1Var10 = ne1Var111111111111111111116;
                        i17 = i211111111111111111114;
                        j7 = j111116;
                        ne1Var11 = ne1Var111111111111111111117;
                        ne1Var12 = ne1Var111111111111111111118;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) == 306783378) {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i211111111111111111117 = (234881024 & i16) ^ 100663296;
                    if (i211111111111111111117 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i211111111111111111118 = i15;
                    zH = ((i211111111111111111117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var111110 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA111110 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var111111111111111111119 = ne1Var5;
                    ne1 ne1Var1111111111111111111110 = ne1Var6;
                    ne1 ne1Var1111111111111111111111 = ne1Var7;
                    ne1 ne1Var1111111111111111111112 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda111110 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111111111118, ne1Var111111111111111111119, oe1Var, ne1Var1111111111111111111111, ne1Var1111111111111111111112, qi2Var, ne1Var1111111111111111111110), kk0Var, 54);
                    int i211111111111111111119 = i16 >> 12;
                    int i2111111111111111111110 = (i211111111111111111119 & 896) | 12582912 | (i211111111111111111119 & 7168);
                    e eVar111112 = contentWindowInsets;
                    long j111117 = j4;
                    hq3.m210x8dcae10(cVarA111110, null, j5, j111117, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111110, kk0Var, i2111111111111111111110, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var111111111111111111119;
                    eVar2 = eVar111112;
                    ne1Var10 = ne1Var1111111111111111111110;
                    i17 = i211111111111111111118;
                    j7 = j111117;
                    ne1Var11 = ne1Var1111111111111111111111;
                    ne1Var12 = ne1Var1111111111111111111112;
                } else {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111111111111111111111 = (234881024 & i16) ^ 100663296;
                    if (i2111111111111111111111 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i2111111111111111111112 = i15;
                    zH = ((i2111111111111111111111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var111111 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA111111 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var1111111111111111111113 = ne1Var5;
                    ne1 ne1Var1111111111111111111114 = ne1Var6;
                    ne1 ne1Var1111111111111111111115 = ne1Var7;
                    ne1 ne1Var1111111111111111111116 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda111111 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111111111111112, ne1Var1111111111111111111113, oe1Var, ne1Var1111111111111111111115, ne1Var1111111111111111111116, qi2Var, ne1Var1111111111111111111114), kk0Var, 54);
                    int i2111111111111111111113 = i16 >> 12;
                    int i2111111111111111111114 = (i2111111111111111111113 & 896) | 12582912 | (i2111111111111111111113 & 7168);
                    e eVar111113 = contentWindowInsets;
                    long j111118 = j4;
                    hq3.m210x8dcae10(cVarA111111, null, j5, j111118, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111111, kk0Var, i2111111111111111111114, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var1111111111111111111113;
                    eVar2 = eVar111113;
                    ne1Var10 = ne1Var1111111111111111111114;
                    i17 = i2111111111111111111112;
                    j7 = j111118;
                    ne1Var11 = ne1Var1111111111111111111115;
                    ne1Var12 = ne1Var1111111111111111111116;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                }
            }
            i4 |= 24576;
            ne1Var8 = ne1Var4;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (kk0Var.f(i)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            if ((i2 & 1572864) == 0) {
                if ((i3 & 64) == 0) {
                    i13 = i18;
                    if (kk0Var.g(j)) {
                    }
                    i4 |= i20;
                } else {
                    i13 = i18;
                }
                i4 |= i20;
            } else {
                i13 = i18;
            }
            if ((i2 & 12582912) != 0) {
                i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
            }
            if ((i2 & 100663296) != 0) {
                i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
            }
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i2 & 805306368) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                if ((i4 & 306783379) == 306783378) {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111111111111111111115 = (234881024 & i16) ^ 100663296;
                    if (i2111111111111111111115 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i2111111111111111111116 = i15;
                    zH = ((i2111111111111111111115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var111112 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA111112 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var1111111111111111111117 = ne1Var5;
                    ne1 ne1Var1111111111111111111118 = ne1Var6;
                    ne1 ne1Var1111111111111111111119 = ne1Var7;
                    ne1 ne1Var11111111111111111111110 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda111112 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111111111111116, ne1Var1111111111111111111117, oe1Var, ne1Var1111111111111111111119, ne1Var11111111111111111111110, qi2Var, ne1Var1111111111111111111118), kk0Var, 54);
                    int i2111111111111111111117 = i16 >> 12;
                    int i2111111111111111111118 = (i2111111111111111111117 & 896) | 12582912 | (i2111111111111111111117 & 7168);
                    e eVar111114 = contentWindowInsets;
                    long j111119 = j4;
                    hq3.m210x8dcae10(cVarA111112, null, j5, j111119, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111112, kk0Var, i2111111111111111111118, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var1111111111111111111117;
                    eVar2 = eVar111114;
                    ne1Var10 = ne1Var1111111111111111111118;
                    i17 = i2111111111111111111116;
                    j7 = j111119;
                    ne1Var11 = ne1Var1111111111111111111119;
                    ne1Var12 = ne1Var11111111111111111111110;
                } else {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i2111111111111111111119 = (234881024 & i16) ^ 100663296;
                    if (i2111111111111111111119 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i21111111111111111111110 = i15;
                    zH = ((i2111111111111111111119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var111113 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA111113 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var11111111111111111111111 = ne1Var5;
                    ne1 ne1Var11111111111111111111112 = ne1Var6;
                    ne1 ne1Var11111111111111111111113 = ne1Var7;
                    ne1 ne1Var11111111111111111111114 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda111113 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111111111111110, ne1Var11111111111111111111111, oe1Var, ne1Var11111111111111111111113, ne1Var11111111111111111111114, qi2Var, ne1Var11111111111111111111112), kk0Var, 54);
                    int i21111111111111111111111 = i16 >> 12;
                    int i21111111111111111111112 = (i21111111111111111111111 & 896) | 12582912 | (i21111111111111111111111 & 7168);
                    e eVar111115 = contentWindowInsets;
                    long j1111110 = j4;
                    hq3.m210x8dcae10(cVarA111113, null, j5, j1111110, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111113, kk0Var, i21111111111111111111112, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var11111111111111111111111;
                    eVar2 = eVar111115;
                    ne1Var10 = ne1Var11111111111111111111112;
                    i17 = i21111111111111111111110;
                    j7 = j1111110;
                    ne1Var11 = ne1Var11111111111111111111113;
                    ne1Var12 = ne1Var11111111111111111111114;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                }
            }
            i4 |= 805306368;
            if ((i4 & 306783379) == 306783378) {
                kk0Var.X();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                }
                kk0Var.s();
                int i21111111111111111111113 = (234881024 & i16) ^ 100663296;
                if (i21111111111111111111113 <= 67108864) {
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                } else {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                }
                qi2Var = (qi2) objP;
                int i21111111111111111111114 = i15;
                zH = ((i21111111111111111111113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                }
                le1Var = (le1) objP2;
                p13 p13Var111114 = fh4.a;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new f01(le1Var, 10);
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                c cVarA111114 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                ne1 ne1Var11111111111111111111115 = ne1Var5;
                ne1 ne1Var11111111111111111111116 = ne1Var6;
                ne1 ne1Var11111111111111111111117 = ne1Var7;
                ne1 ne1Var11111111111111111111118 = ne1Var8;
                wg0 wg0VarRememberComposableLambda111114 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111111111111114, ne1Var11111111111111111111115, oe1Var, ne1Var11111111111111111111117, ne1Var11111111111111111111118, qi2Var, ne1Var11111111111111111111116), kk0Var, 54);
                int i21111111111111111111115 = i16 >> 12;
                int i21111111111111111111116 = (i21111111111111111111115 & 896) | 12582912 | (i21111111111111111111115 & 7168);
                e eVar111116 = contentWindowInsets;
                long j1111111 = j4;
                hq3.m210x8dcae10(cVarA111114, null, j5, j1111111, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111114, kk0Var, i21111111111111111111116, 114);
                j6 = j5;
                cVar4 = cVar3;
                ne1Var9 = ne1Var11111111111111111111115;
                eVar2 = eVar111116;
                ne1Var10 = ne1Var11111111111111111111116;
                i17 = i21111111111111111111114;
                j7 = j1111111;
                ne1Var11 = ne1Var11111111111111111111117;
                ne1Var12 = ne1Var11111111111111111111118;
            } else {
                kk0Var.X();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                }
                kk0Var.s();
                int i21111111111111111111117 = (234881024 & i16) ^ 100663296;
                if (i21111111111111111111117 <= 67108864) {
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                } else {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                }
                qi2Var = (qi2) objP;
                int i21111111111111111111118 = i15;
                zH = ((i21111111111111111111117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                }
                le1Var = (le1) objP2;
                p13 p13Var111115 = fh4.a;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new f01(le1Var, 10);
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                c cVarA111115 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                ne1 ne1Var11111111111111111111119 = ne1Var5;
                ne1 ne1Var111111111111111111111110 = ne1Var6;
                ne1 ne1Var111111111111111111111111 = ne1Var7;
                ne1 ne1Var111111111111111111111112 = ne1Var8;
                wg0 wg0VarRememberComposableLambda111115 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111111111111118, ne1Var11111111111111111111119, oe1Var, ne1Var111111111111111111111111, ne1Var111111111111111111111112, qi2Var, ne1Var111111111111111111111110), kk0Var, 54);
                int i21111111111111111111119 = i16 >> 12;
                int i211111111111111111111110 = (i21111111111111111111119 & 896) | 12582912 | (i21111111111111111111119 & 7168);
                e eVar111117 = contentWindowInsets;
                long j1111112 = j4;
                hq3.m210x8dcae10(cVarA111115, null, j5, j1111112, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111115, kk0Var, i211111111111111111111110, 114);
                j6 = j5;
                cVar4 = cVar3;
                ne1Var9 = ne1Var11111111111111111111119;
                eVar2 = eVar111117;
                ne1Var10 = ne1Var111111111111111111111110;
                i17 = i21111111111111111111118;
                j7 = j1111112;
                ne1Var11 = ne1Var111111111111111111111111;
                ne1Var12 = ne1Var111111111111111111111112;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
            }
        }
        i4 |= 3072;
        ne1Var7 = ne1Var3;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                ne1Var8 = ne1Var4;
                if (kk0Var.j(ne1Var8)) {
                    i10 = 16384;
                } else {
                    i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i4 |= i10;
            }
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (kk0Var.f(i)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            if ((i2 & 1572864) == 0) {
                if ((i3 & 64) == 0) {
                    i13 = i18;
                    if (kk0Var.g(j)) {
                    }
                    i4 |= i20;
                } else {
                    i13 = i18;
                }
                i4 |= i20;
            } else {
                i13 = i18;
            }
            if ((i2 & 12582912) != 0) {
                i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
            }
            if ((i2 & 100663296) != 0) {
                i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
            }
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i2 & 805306368) == 0) {
                    if (kk0Var.j(oe1Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                if ((i4 & 306783379) == 306783378) {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i211111111111111111111111 = (234881024 & i16) ^ 100663296;
                    if (i211111111111111111111111 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i211111111111111111111112 = i15;
                    zH = ((i211111111111111111111111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var111116 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA111116 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var111111111111111111111113 = ne1Var5;
                    ne1 ne1Var111111111111111111111114 = ne1Var6;
                    ne1 ne1Var111111111111111111111115 = ne1Var7;
                    ne1 ne1Var111111111111111111111116 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda111116 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111111111111112, ne1Var111111111111111111111113, oe1Var, ne1Var111111111111111111111115, ne1Var111111111111111111111116, qi2Var, ne1Var111111111111111111111114), kk0Var, 54);
                    int i211111111111111111111113 = i16 >> 12;
                    int i211111111111111111111114 = (i211111111111111111111113 & 896) | 12582912 | (i211111111111111111111113 & 7168);
                    e eVar111118 = contentWindowInsets;
                    long j1111113 = j4;
                    hq3.m210x8dcae10(cVarA111116, null, j5, j1111113, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111116, kk0Var, i211111111111111111111114, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var111111111111111111111113;
                    eVar2 = eVar111118;
                    ne1Var10 = ne1Var111111111111111111111114;
                    i17 = i211111111111111111111112;
                    j7 = j1111113;
                    ne1Var11 = ne1Var111111111111111111111115;
                    ne1Var12 = ne1Var111111111111111111111116;
                } else {
                    kk0Var.X();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    } else {
                        if (i13 != 0) {
                            cVar2 = c.i;
                        }
                        if (i19 != 0) {
                            ne1Var5 = lj0.a;
                        }
                        if (i5 != 0) {
                            ne1Var6 = lj0.b;
                        }
                        if (i7 != 0) {
                            ne1Var7 = lj0.c;
                        }
                        if (i9 != 0) {
                            ne1Var8 = lj0.d;
                        }
                        if (i11 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                            i4 &= -3670017;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                            i4 &= -29360129;
                        } else {
                            jM2x310ea166 = j2;
                        }
                        if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                            i16 = i4 & (-234881025);
                            j5 = j3;
                            contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                        } else {
                            i16 = i4;
                            j4 = jM2x310ea166;
                            cVar3 = cVar2;
                            j5 = j3;
                            contentWindowInsets = eVar;
                        }
                    }
                    kk0Var.s();
                    int i211111111111111111111115 = (234881024 & i16) ^ 100663296;
                    if (i211111111111111111111115 <= 67108864) {
                    }
                    objP = kk0Var.P();
                    if (z) {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    } else {
                        objP = new qi2(contentWindowInsets);
                        kk0Var.l0(objP);
                    }
                    qi2Var = (qi2) objP;
                    int i211111111111111111111116 = i15;
                    zH = ((i211111111111111111111115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                    objP2 = kk0Var.P();
                    if (zH) {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    } else {
                        objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                        kk0Var.l0(objP2);
                    }
                    le1Var = (le1) objP2;
                    p13 p13Var111117 = fh4.a;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new f01(le1Var, 10);
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    c cVarA111117 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                    ne1 ne1Var111111111111111111111117 = ne1Var5;
                    ne1 ne1Var111111111111111111111118 = ne1Var6;
                    ne1 ne1Var111111111111111111111119 = ne1Var7;
                    ne1 ne1Var1111111111111111111111110 = ne1Var8;
                    wg0 wg0VarRememberComposableLambda111117 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111111111111116, ne1Var111111111111111111111117, oe1Var, ne1Var111111111111111111111119, ne1Var1111111111111111111111110, qi2Var, ne1Var111111111111111111111118), kk0Var, 54);
                    int i211111111111111111111117 = i16 >> 12;
                    int i211111111111111111111118 = (i211111111111111111111117 & 896) | 12582912 | (i211111111111111111111117 & 7168);
                    e eVar111119 = contentWindowInsets;
                    long j1111114 = j4;
                    hq3.m210x8dcae10(cVarA111117, null, j5, j1111114, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111117, kk0Var, i211111111111111111111118, 114);
                    j6 = j5;
                    cVar4 = cVar3;
                    ne1Var9 = ne1Var111111111111111111111117;
                    eVar2 = eVar111119;
                    ne1Var10 = ne1Var111111111111111111111118;
                    i17 = i211111111111111111111116;
                    j7 = j1111114;
                    ne1Var11 = ne1Var111111111111111111111119;
                    ne1Var12 = ne1Var1111111111111111111111110;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
                }
            }
            i4 |= 805306368;
            if ((i4 & 306783379) == 306783378) {
                kk0Var.X();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                }
                kk0Var.s();
                int i211111111111111111111119 = (234881024 & i16) ^ 100663296;
                if (i211111111111111111111119 <= 67108864) {
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                } else {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                }
                qi2Var = (qi2) objP;
                int i2111111111111111111111110 = i15;
                zH = ((i211111111111111111111119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                }
                le1Var = (le1) objP2;
                p13 p13Var111118 = fh4.a;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new f01(le1Var, 10);
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                c cVarA111118 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                ne1 ne1Var1111111111111111111111111 = ne1Var5;
                ne1 ne1Var1111111111111111111111112 = ne1Var6;
                ne1 ne1Var1111111111111111111111113 = ne1Var7;
                ne1 ne1Var1111111111111111111111114 = ne1Var8;
                wg0 wg0VarRememberComposableLambda111118 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111111111111111110, ne1Var1111111111111111111111111, oe1Var, ne1Var1111111111111111111111113, ne1Var1111111111111111111111114, qi2Var, ne1Var1111111111111111111111112), kk0Var, 54);
                int i2111111111111111111111111 = i16 >> 12;
                int i2111111111111111111111112 = (i2111111111111111111111111 & 896) | 12582912 | (i2111111111111111111111111 & 7168);
                e eVar1111110 = contentWindowInsets;
                long j1111115 = j4;
                hq3.m210x8dcae10(cVarA111118, null, j5, j1111115, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111118, kk0Var, i2111111111111111111111112, 114);
                j6 = j5;
                cVar4 = cVar3;
                ne1Var9 = ne1Var1111111111111111111111111;
                eVar2 = eVar1111110;
                ne1Var10 = ne1Var1111111111111111111111112;
                i17 = i2111111111111111111111110;
                j7 = j1111115;
                ne1Var11 = ne1Var1111111111111111111111113;
                ne1Var12 = ne1Var1111111111111111111111114;
            } else {
                kk0Var.X();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                }
                kk0Var.s();
                int i2111111111111111111111113 = (234881024 & i16) ^ 100663296;
                if (i2111111111111111111111113 <= 67108864) {
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                } else {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                }
                qi2Var = (qi2) objP;
                int i2111111111111111111111114 = i15;
                zH = ((i2111111111111111111111113 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                }
                le1Var = (le1) objP2;
                p13 p13Var111119 = fh4.a;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new f01(le1Var, 10);
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                c cVarA111119 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                ne1 ne1Var1111111111111111111111115 = ne1Var5;
                ne1 ne1Var1111111111111111111111116 = ne1Var6;
                ne1 ne1Var1111111111111111111111117 = ne1Var7;
                ne1 ne1Var1111111111111111111111118 = ne1Var8;
                wg0 wg0VarRememberComposableLambda111119 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111111111111111114, ne1Var1111111111111111111111115, oe1Var, ne1Var1111111111111111111111117, ne1Var1111111111111111111111118, qi2Var, ne1Var1111111111111111111111116), kk0Var, 54);
                int i2111111111111111111111115 = i16 >> 12;
                int i2111111111111111111111116 = (i2111111111111111111111115 & 896) | 12582912 | (i2111111111111111111111115 & 7168);
                e eVar1111111 = contentWindowInsets;
                long j1111116 = j4;
                hq3.m210x8dcae10(cVarA111119, null, j5, j1111116, 0.0f, 0.0f, null, wg0VarRememberComposableLambda111119, kk0Var, i2111111111111111111111116, 114);
                j6 = j5;
                cVar4 = cVar3;
                ne1Var9 = ne1Var1111111111111111111111115;
                eVar2 = eVar1111111;
                ne1Var10 = ne1Var1111111111111111111111116;
                i17 = i2111111111111111111111114;
                j7 = j1111116;
                ne1Var11 = ne1Var1111111111111111111111117;
                ne1Var12 = ne1Var1111111111111111111111118;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
            }
        }
        i4 |= 24576;
        ne1Var8 = ne1Var4;
        i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if (kk0Var.f(i)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i4 |= i12;
        }
        if ((i2 & 1572864) == 0) {
            if ((i3 & 64) == 0) {
                i13 = i18;
                if (kk0Var.g(j)) {
                }
                i4 |= i20;
            } else {
                i13 = i18;
            }
            i4 |= i20;
        } else {
            i13 = i18;
        }
        if ((i2 & 12582912) != 0) {
            i4 |= ((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var.g(j2)) ? 4194304 : 8388608;
        }
        if ((i2 & 100663296) != 0) {
            i4 |= ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) == 0 || !kk0Var.h(eVar)) ? 33554432 : 67108864;
        }
        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            if ((i2 & 805306368) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            if ((i4 & 306783379) == 306783378) {
                kk0Var.X();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                }
                kk0Var.s();
                int i2111111111111111111111117 = (234881024 & i16) ^ 100663296;
                if (i2111111111111111111111117 <= 67108864) {
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                } else {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                }
                qi2Var = (qi2) objP;
                int i2111111111111111111111118 = i15;
                zH = ((i2111111111111111111111117 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                }
                le1Var = (le1) objP2;
                p13 p13Var1111110 = fh4.a;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new f01(le1Var, 10);
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                c cVarA1111110 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                ne1 ne1Var1111111111111111111111119 = ne1Var5;
                ne1 ne1Var11111111111111111111111110 = ne1Var6;
                ne1 ne1Var11111111111111111111111111 = ne1Var7;
                ne1 ne1Var11111111111111111111111112 = ne1Var8;
                wg0 wg0VarRememberComposableLambda1111110 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i2111111111111111111111118, ne1Var1111111111111111111111119, oe1Var, ne1Var11111111111111111111111111, ne1Var11111111111111111111111112, qi2Var, ne1Var11111111111111111111111110), kk0Var, 54);
                int i2111111111111111111111119 = i16 >> 12;
                int i21111111111111111111111110 = (i2111111111111111111111119 & 896) | 12582912 | (i2111111111111111111111119 & 7168);
                e eVar1111112 = contentWindowInsets;
                long j1111117 = j4;
                hq3.m210x8dcae10(cVarA1111110, null, j5, j1111117, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1111110, kk0Var, i21111111111111111111111110, 114);
                j6 = j5;
                cVar4 = cVar3;
                ne1Var9 = ne1Var1111111111111111111111119;
                eVar2 = eVar1111112;
                ne1Var10 = ne1Var11111111111111111111111110;
                i17 = i2111111111111111111111118;
                j7 = j1111117;
                ne1Var11 = ne1Var11111111111111111111111111;
                ne1Var12 = ne1Var11111111111111111111111112;
            } else {
                kk0Var.X();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                } else {
                    if (i13 != 0) {
                        cVar2 = c.i;
                    }
                    if (i19 != 0) {
                        ne1Var5 = lj0.a;
                    }
                    if (i5 != 0) {
                        ne1Var6 = lj0.b;
                    }
                    if (i7 != 0) {
                        ne1Var7 = lj0.c;
                    }
                    if (i9 != 0) {
                        ne1Var8 = lj0.d;
                    }
                    if (i11 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                        i4 &= -3670017;
                    } else {
                        j3 = j;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                        i4 &= -29360129;
                    } else {
                        jM2x310ea166 = j2;
                    }
                    if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        i16 = i4 & (-234881025);
                        j5 = j3;
                        contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                    } else {
                        i16 = i4;
                        j4 = jM2x310ea166;
                        cVar3 = cVar2;
                        j5 = j3;
                        contentWindowInsets = eVar;
                    }
                }
                kk0Var.s();
                int i21111111111111111111111111 = (234881024 & i16) ^ 100663296;
                if (i21111111111111111111111111 <= 67108864) {
                }
                objP = kk0Var.P();
                if (z) {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                } else {
                    objP = new qi2(contentWindowInsets);
                    kk0Var.l0(objP);
                }
                qi2Var = (qi2) objP;
                int i21111111111111111111111112 = i15;
                zH = ((i21111111111111111111111111 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
                objP2 = kk0Var.P();
                if (zH) {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                    kk0Var.l0(objP2);
                }
                le1Var = (le1) objP2;
                p13 p13Var1111111 = fh4.a;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new f01(le1Var, 10);
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                c cVarA1111111 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
                ne1 ne1Var11111111111111111111111113 = ne1Var5;
                ne1 ne1Var11111111111111111111111114 = ne1Var6;
                ne1 ne1Var11111111111111111111111115 = ne1Var7;
                ne1 ne1Var11111111111111111111111116 = ne1Var8;
                wg0 wg0VarRememberComposableLambda1111111 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111111111111111112, ne1Var11111111111111111111111113, oe1Var, ne1Var11111111111111111111111115, ne1Var11111111111111111111111116, qi2Var, ne1Var11111111111111111111111114), kk0Var, 54);
                int i21111111111111111111111113 = i16 >> 12;
                int i21111111111111111111111114 = (i21111111111111111111111113 & 896) | 12582912 | (i21111111111111111111111113 & 7168);
                e eVar1111113 = contentWindowInsets;
                long j1111118 = j4;
                hq3.m210x8dcae10(cVarA1111111, null, j5, j1111118, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1111111, kk0Var, i21111111111111111111111114, 114);
                j6 = j5;
                cVar4 = cVar3;
                ne1Var9 = ne1Var11111111111111111111111113;
                eVar2 = eVar1111113;
                ne1Var10 = ne1Var11111111111111111111111114;
                i17 = i21111111111111111111111112;
                j7 = j1111118;
                ne1Var11 = ne1Var11111111111111111111111115;
                ne1Var12 = ne1Var11111111111111111111111116;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
            }
        }
        i4 |= 805306368;
        if ((i4 & 306783379) == 306783378) {
            kk0Var.X();
            if ((i2 & 1) != 0) {
                if (i13 != 0) {
                    cVar2 = c.i;
                }
                if (i19 != 0) {
                    ne1Var5 = lj0.a;
                }
                if (i5 != 0) {
                    ne1Var6 = lj0.b;
                }
                if (i7 != 0) {
                    ne1Var7 = lj0.c;
                }
                if (i9 != 0) {
                    ne1Var8 = lj0.d;
                }
                if (i11 != 0) {
                    i15 = 2;
                } else {
                    i15 = i;
                }
                if ((i3 & 64) != 0) {
                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                    i4 &= -3670017;
                } else {
                    j3 = j;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                    i4 &= -29360129;
                } else {
                    jM2x310ea166 = j2;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i16 = i4 & (-234881025);
                    j5 = j3;
                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                    j4 = jM2x310ea166;
                    cVar3 = cVar2;
                } else {
                    i16 = i4;
                    j4 = jM2x310ea166;
                    cVar3 = cVar2;
                    j5 = j3;
                    contentWindowInsets = eVar;
                }
            } else {
                if (i13 != 0) {
                    cVar2 = c.i;
                }
                if (i19 != 0) {
                    ne1Var5 = lj0.a;
                }
                if (i5 != 0) {
                    ne1Var6 = lj0.b;
                }
                if (i7 != 0) {
                    ne1Var7 = lj0.c;
                }
                if (i9 != 0) {
                    ne1Var8 = lj0.d;
                }
                if (i11 != 0) {
                    i15 = 2;
                } else {
                    i15 = i;
                }
                if ((i3 & 64) != 0) {
                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                    i4 &= -3670017;
                } else {
                    j3 = j;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                    i4 &= -29360129;
                } else {
                    jM2x310ea166 = j2;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i16 = i4 & (-234881025);
                    j5 = j3;
                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                    j4 = jM2x310ea166;
                    cVar3 = cVar2;
                } else {
                    i16 = i4;
                    j4 = jM2x310ea166;
                    cVar3 = cVar2;
                    j5 = j3;
                    contentWindowInsets = eVar;
                }
            }
            kk0Var.s();
            int i21111111111111111111111115 = (234881024 & i16) ^ 100663296;
            if (i21111111111111111111111115 <= 67108864) {
            }
            objP = kk0Var.P();
            if (z) {
                objP = new qi2(contentWindowInsets);
                kk0Var.l0(objP);
            } else {
                objP = new qi2(contentWindowInsets);
                kk0Var.l0(objP);
            }
            qi2Var = (qi2) objP;
            int i21111111111111111111111116 = i15;
            zH = ((i21111111111111111111111115 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
            objP2 = kk0Var.P();
            if (zH) {
                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                kk0Var.l0(objP2);
            } else {
                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                kk0Var.l0(objP2);
            }
            le1Var = (le1) objP2;
            p13 p13Var1111112 = fh4.a;
            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                noInspectorInfo = new f01(le1Var, 10);
            } else {
                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
            }
            c cVarA1111112 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
            ne1 ne1Var11111111111111111111111117 = ne1Var5;
            ne1 ne1Var11111111111111111111111118 = ne1Var6;
            ne1 ne1Var11111111111111111111111119 = ne1Var7;
            ne1 ne1Var111111111111111111111111110 = ne1Var8;
            wg0 wg0VarRememberComposableLambda1111112 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i21111111111111111111111116, ne1Var11111111111111111111111117, oe1Var, ne1Var11111111111111111111111119, ne1Var111111111111111111111111110, qi2Var, ne1Var11111111111111111111111118), kk0Var, 54);
            int i21111111111111111111111117 = i16 >> 12;
            int i21111111111111111111111118 = (i21111111111111111111111117 & 896) | 12582912 | (i21111111111111111111111117 & 7168);
            e eVar1111114 = contentWindowInsets;
            long j1111119 = j4;
            hq3.m210x8dcae10(cVarA1111112, null, j5, j1111119, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1111112, kk0Var, i21111111111111111111111118, 114);
            j6 = j5;
            cVar4 = cVar3;
            ne1Var9 = ne1Var11111111111111111111111117;
            eVar2 = eVar1111114;
            ne1Var10 = ne1Var11111111111111111111111118;
            i17 = i21111111111111111111111116;
            j7 = j1111119;
            ne1Var11 = ne1Var11111111111111111111111119;
            ne1Var12 = ne1Var111111111111111111111111110;
        } else {
            kk0Var.X();
            if ((i2 & 1) != 0) {
                if (i13 != 0) {
                    cVar2 = c.i;
                }
                if (i19 != 0) {
                    ne1Var5 = lj0.a;
                }
                if (i5 != 0) {
                    ne1Var6 = lj0.b;
                }
                if (i7 != 0) {
                    ne1Var7 = lj0.c;
                }
                if (i9 != 0) {
                    ne1Var8 = lj0.d;
                }
                if (i11 != 0) {
                    i15 = 2;
                } else {
                    i15 = i;
                }
                if ((i3 & 64) != 0) {
                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                    i4 &= -3670017;
                } else {
                    j3 = j;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                    i4 &= -29360129;
                } else {
                    jM2x310ea166 = j2;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i16 = i4 & (-234881025);
                    j5 = j3;
                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                    j4 = jM2x310ea166;
                    cVar3 = cVar2;
                } else {
                    i16 = i4;
                    j4 = jM2x310ea166;
                    cVar3 = cVar2;
                    j5 = j3;
                    contentWindowInsets = eVar;
                }
            } else {
                if (i13 != 0) {
                    cVar2 = c.i;
                }
                if (i19 != 0) {
                    ne1Var5 = lj0.a;
                }
                if (i5 != 0) {
                    ne1Var6 = lj0.b;
                }
                if (i7 != 0) {
                    ne1Var7 = lj0.c;
                }
                if (i9 != 0) {
                    ne1Var8 = lj0.d;
                }
                if (i11 != 0) {
                    i15 = 2;
                } else {
                    i15 = i;
                }
                if ((i3 & 64) != 0) {
                    j3 = ab2.a.getColorScheme(kk0Var, 6).n;
                    i4 &= -3670017;
                } else {
                    j3 = j;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    jM2x310ea166 = af0.m2x310ea166(j3, kk0Var, (i4 >> 18) & 14);
                    i4 &= -29360129;
                } else {
                    jM2x310ea166 = j2;
                }
                if ((i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                    i16 = i4 & (-234881025);
                    j5 = j3;
                    contentWindowInsets = ea3.a.getContentWindowInsets(kk0Var, 6);
                    j4 = jM2x310ea166;
                    cVar3 = cVar2;
                } else {
                    i16 = i4;
                    j4 = jM2x310ea166;
                    cVar3 = cVar2;
                    j5 = j3;
                    contentWindowInsets = eVar;
                }
            }
            kk0Var.s();
            int i21111111111111111111111119 = (234881024 & i16) ^ 100663296;
            if (i21111111111111111111111119 <= 67108864) {
            }
            objP = kk0Var.P();
            if (z) {
                objP = new qi2(contentWindowInsets);
                kk0Var.l0(objP);
            } else {
                objP = new qi2(contentWindowInsets);
                kk0Var.l0(objP);
            }
            qi2Var = (qi2) objP;
            int i211111111111111111111111110 = i15;
            zH = ((i21111111111111111111111119 <= 67108864 && kk0Var.h(contentWindowInsets)) || (i16 & 100663296) == 67108864) | kk0Var.h(qi2Var);
            objP2 = kk0Var.P();
            if (zH) {
                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                kk0Var.l0(objP2);
            } else {
                objP2 = new sg2(qi2Var, 5, contentWindowInsets);
                kk0Var.l0(objP2);
            }
            le1Var = (le1) objP2;
            p13 p13Var1111113 = fh4.a;
            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                noInspectorInfo = new f01(le1Var, 10);
            } else {
                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
            }
            c cVarA1111113 = b.a(cVar3, noInspectorInfo, new dh4(le1Var));
            ne1 ne1Var111111111111111111111111111 = ne1Var5;
            ne1 ne1Var111111111111111111111111112 = ne1Var6;
            ne1 ne1Var111111111111111111111111113 = ne1Var7;
            ne1 ne1Var111111111111111111111111114 = ne1Var8;
            wg0 wg0VarRememberComposableLambda1111113 = zg0.rememberComposableLambda(-1979205334, true, new fa3(i211111111111111111111111110, ne1Var111111111111111111111111111, oe1Var, ne1Var111111111111111111111111113, ne1Var111111111111111111111111114, qi2Var, ne1Var111111111111111111111111112), kk0Var, 54);
            int i211111111111111111111111111 = i16 >> 12;
            int i211111111111111111111111112 = (i211111111111111111111111111 & 896) | 12582912 | (i211111111111111111111111111 & 7168);
            e eVar1111115 = contentWindowInsets;
            long j11111110 = j4;
            hq3.m210x8dcae10(cVarA1111113, null, j5, j11111110, 0.0f, 0.0f, null, wg0VarRememberComposableLambda1111113, kk0Var, i211111111111111111111111112, 114);
            j6 = j5;
            cVar4 = cVar3;
            ne1Var9 = ne1Var111111111111111111111111111;
            eVar2 = eVar1111115;
            ne1Var10 = ne1Var111111111111111111111111112;
            i17 = i211111111111111111111111110;
            j7 = j11111110;
            ne1Var11 = ne1Var111111111111111111111111113;
            ne1Var12 = ne1Var111111111111111111111111114;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ga3(cVar4, ne1Var9, ne1Var10, ne1Var11, ne1Var12, i17, j6, j7, eVar2, oe1Var, i2, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m221x7705a90c(int i, ne1 ne1Var, oe1 oe1Var, ne1 ne1Var2, ne1 ne1Var3, e eVar, ne1 ne1Var4, ck0 ck0Var, int i2) {
        int i3;
        oe1 oe1Var2;
        e eVar2;
        ne1 ne1Var5;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-975511942);
        if ((i2 & 6) == 0) {
            i3 = (kk0Var.f(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            oe1Var2 = oe1Var;
            i3 |= kk0Var.j(oe1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        } else {
            oe1Var2 = oe1Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= kk0Var.j(ne1Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= kk0Var.j(ne1Var3) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i2) == 0) {
            eVar2 = eVar;
            i3 |= kk0Var.h(eVar2) ? 131072 : 65536;
        } else {
            eVar2 = eVar;
        }
        if ((1572864 & i2) == 0) {
            ne1Var5 = ne1Var4;
            i3 |= kk0Var.j(ne1Var5) ? 1048576 : 524288;
        } else {
            ne1Var5 = ne1Var4;
        }
        if ((i3 & 599187) == 599186 && kk0Var.F()) {
            kk0Var.V();
        } else {
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576);
            Object objP = kk0Var.P();
            if (z || objP == Composer$Companion.getEmpty()) {
                mf mfVar = new mf(ne1Var, ne1Var2, ne1Var3, i, eVar2, ne1Var5, oe1Var2);
                kk0Var.l0(mfVar);
                objP = mfVar;
            }
            fp3.SubcomposeLayout(null, (ne1) objP, kk0Var, 0, 1);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new hf(i, ne1Var, oe1Var, ne1Var2, ne1Var3, eVar, ne1Var4, i2));
        }
    }
}
