package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class es0 {
    public static final u43 a = new u43("^[\\s\\u0020-\\u02AF\\u0370-\\u03FF\\u0400-\\u04FF\\u1E00-\\u1EFF\\u2000-\\u206F\\u00A0]*$");
    public static final u43 b = new u43("[\\u0300-\\u036F]");

    /* JADX WARN: Code duplicated, block: B:105:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0153  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:119:0x015c  */
    /* JADX WARN: Code duplicated, block: B:120:0x015e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0164  */
    /* JADX WARN: Code duplicated, block: B:125:0x016e  */
    /* JADX WARN: Code duplicated, block: B:128:0x017a  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c8 A[LOOP:1: B:141:0x01c6->B:142:0x01c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:152:0x021b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0227  */
    /* JADX WARN: Code duplicated, block: B:159:0x022c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0239  */
    /* JADX WARN: Code duplicated, block: B:164:0x0245  */
    /* JADX WARN: Code duplicated, block: B:166:0x0251  */
    /* JADX WARN: Code duplicated, block: B:167:0x0256  */
    /* JADX WARN: Code duplicated, block: B:170:0x026f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0275  */
    /* JADX WARN: Code duplicated, block: B:176:0x028d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0299  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:186:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:188:0x02c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:191:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:196:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:200:0x0312  */
    /* JADX WARN: Code duplicated, block: B:204:0x032e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0330  */
    /* JADX WARN: Code duplicated, block: B:208:0x033d  */
    /* JADX WARN: Code duplicated, block: B:209:0x033f  */
    /* JADX WARN: Code duplicated, block: B:212:0x034b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0351  */
    /* JADX WARN: Code duplicated, block: B:220:0x0362  */
    /* JADX WARN: Code duplicated, block: B:224:0x036c  */
    /* JADX WARN: Code duplicated, block: B:226:0x03df  */
    /* JADX WARN: Code duplicated, block: B:229:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:241:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX INFO: renamed from: DecodeText-NkCQ2FA, reason: not valid java name */
    public static final void m190xa0c02e10(final String str, c cVar, uz3 uz3Var, long j, long j2, int i, boolean z, Object obj, ck0 ck0Var, final int i2, final int i3) {
        c cVar2;
        int i4;
        uz3 uz3Var2;
        int i5;
        int i6;
        long j3;
        int i7;
        long j4;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        kk0 kk0Var;
        final c cVar3;
        final uz3 uz3Var3;
        final long j5;
        final long j6;
        final int i12;
        final boolean z3;
        final Object obj2;
        w33 w33VarV;
        int i13;
        boolean z4;
        c cVar4;
        Object obj3;
        int i14;
        boolean z5;
        long j7;
        ez3 ez3VarRememberTextMeasurer;
        uz3 uz3VarD;
        boolean zH;
        Object objP;
        int i15;
        float[] fArr;
        int i16;
        kq1 kq1Var;
        Object next;
        Float fValueOf;
        Object next2;
        Float fValueOf2;
        Object obj4;
        Integer num;
        int iIntValue;
        HashMap map;
        int length;
        int i17;
        char cCharAt;
        int i18;
        float fB;
        StringBuilder sb;
        int i19;
        String string;
        Map map2;
        boolean zH2;
        Object objP2;
        hg hgVar;
        oj4 oj4VarD;
        int length2;
        char[] cArr;
        int i20;
        char cCharAt2;
        String str2;
        mi2 mi2Var;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objP3;
        int i21;
        int i22;
        str.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-1332046040);
        int i23 = (i2 & 6) == 0 ? (kk0Var2.h(str) ? 4 : 2) | i2 : i2;
        int i24 = i3 & 2;
        if (i24 == 0) {
            if ((i2 & 48) == 0) {
                cVar2 = cVar;
                i23 |= kk0Var2.h(cVar2) ? 32 : 16;
            }
            i4 = i3 & 4;
            if (i4 != 0) {
                if ((i2 & 384) == 0) {
                    uz3Var2 = uz3Var;
                    if (kk0Var2.h(uz3Var2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i23 |= i5;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i23 |= 3072;
                    j3 = j;
                } else {
                    j3 = j;
                    if ((i2 & 3072) == 0) {
                        if (kk0Var2.g(j3)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i23 |= i7;
                    }
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j4 = j2;
                        if (kk0Var2.g(j4)) {
                            i22 = 16384;
                        }
                        i23 |= i22;
                    } else {
                        j4 = j2;
                    }
                    i22 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i23 |= i22;
                } else {
                    j4 = j2;
                }
                if ((i2 & 196608) == 0) {
                    i8 = i;
                    if ((i3 & 32) == 0 || !kk0Var2.f(i8)) {
                        i21 = 65536;
                    } else {
                        i21 = 131072;
                    }
                    i23 |= i21;
                } else {
                    i8 = i;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (kk0Var2.i(z)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i23 |= i10;
                }
                if ((i2 & 12582912) == 0) {
                    i11 = i23 | (((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var2.j(obj)) ? 4194304 : 8388608);
                } else {
                    i11 = i23;
                }
                if ((i11 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kk0Var2.S(i11 & 1, z2)) {
                    kk0Var2.X();
                    if ((i2 & 1) != 0 || kk0Var2.D()) {
                        if (i24 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            uz3Var2 = uz3.d;
                        }
                        if (i6 != 0) {
                            j3 = re0.i;
                        }
                        if ((i3 & 16) != 0) {
                            i11 &= -57345;
                            j4 = j3;
                        }
                        if ((i3 & 32) != 0) {
                            i13 = 3;
                            i11 &= -458753;
                        } else {
                            i13 = i8;
                        }
                        if (i9 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            i11 &= -29360129;
                            cVar4 = cVar2;
                            obj3 = str;
                        } else {
                            cVar4 = cVar2;
                            obj3 = obj;
                        }
                        i14 = i11;
                    } else {
                        kk0Var2.V();
                        if ((i3 & 16) != 0) {
                            i11 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i11 &= -458753;
                        }
                        if ((i3 & Uuid.SIZE_BITS) != 0) {
                            i11 &= -29360129;
                        }
                        obj3 = obj;
                        j3 = j3;
                        i13 = i8;
                        i14 = i11;
                        cVar4 = cVar2;
                        z4 = z;
                    }
                    kk0Var2.s();
                    if (z4 || !a.c(str) || b.a(str)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    j7 = j3;
                    ez3VarRememberTextMeasurer = fz3.rememberTextMeasurer(0, kk0Var2, 0, 1);
                    uz3VarD = ((uz3) kk0Var2.l(uy3.a)).d(uz3Var2);
                    zH = kk0Var2.h(obj3) | kk0Var2.h(uz3VarD);
                    objP = kk0Var2.P();
                    boolean z9 = z4;
                    uz3 uz3Var4 = uz3Var2;
                    if (zH || objP == Composer$Companion.getEmpty()) {
                        if (z5) {
                            fArr = new float[72];
                            i16 = 0;
                            for (i15 = 72; i16 < i15; i15 = 72) {
                                fArr[i16] = b(ez3VarRememberTextMeasurer, uz3VarD, "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i16));
                                i16++;
                            }
                            kq1Var = (kq1) new lq1(0, 71, 1).iterator();
                            if (kq1Var.h) {
                                next = kq1Var.next();
                                if (kq1Var.h) {
                                    fValueOf = Float.valueOf(fArr[((Number) next).intValue()]);
                                    do {
                                        next2 = kq1Var.next();
                                        fValueOf2 = Float.valueOf(fArr[((Number) next2).intValue()]);
                                        if (fValueOf.compareTo(fValueOf2) > 0) {
                                            fValueOf = fValueOf2;
                                            next = next2;
                                        }
                                    } while (kq1Var.h);
                                }
                                obj4 = next;
                            } else {
                                obj4 = null;
                            }
                            num = (Integer) obj4;
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            map = new HashMap();
                            length = str.length();
                            i17 = 0;
                            while (i17 < length) {
                                int i25 = length;
                                cCharAt = str.charAt(i17);
                                if (yo4.G(cCharAt)) {
                                    i18 = i17;
                                } else {
                                    i18 = i17;
                                    if (!map.containsKey(Character.valueOf(cCharAt))) {
                                        fB = b(ez3VarRememberTextMeasurer, uz3VarD, cCharAt) * 1.02f;
                                        sb = new StringBuilder();
                                        for (i19 = 0; i19 < 72; i19++) {
                                            if (fArr[i19] <= fB) {
                                                sb.append("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i19));
                                            }
                                        }
                                        string = sb.toString();
                                        Character chValueOf = Character.valueOf(cCharAt);
                                        if (string.length() == 0) {
                                            string = String.valueOf("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(iIntValue));
                                        }
                                        map.put(chValueOf, string);
                                    }
                                }
                                i17 = i18 + 1;
                                length = i25;
                                uz3VarD = uz3VarD;
                                ez3VarRememberTextMeasurer = ez3VarRememberTextMeasurer;
                            }
                            objP = map;
                        } else {
                            objP = a31.c;
                        }
                        kk0Var2.l0(objP);
                    }
                    map2 = (Map) objP;
                    zH2 = kk0Var2.h(obj3);
                    objP2 = kk0Var2.P();
                    if (zH2 || objP2 == Composer$Companion.getEmpty()) {
                        if (z5) {
                            oj4VarD = yo4.d(System.nanoTime());
                            length2 = str.length();
                            cArr = new char[length2];
                            i20 = 0;
                            while (i20 < length2) {
                                cCharAt2 = str.charAt(i20);
                                if (!yo4.G(cCharAt2)) {
                                    str2 = (String) map2.get(Character.valueOf(cCharAt2));
                                    if (str2 == null) {
                                        str2 = "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz";
                                    }
                                    cCharAt2 = str2.charAt(oj4VarD.e(str2.length()));
                                }
                                cArr[i20] = cCharAt2;
                                i20++;
                                length2 = length2;
                            }
                            hgVar = new hg(new String(cArr));
                        } else {
                            hgVar = new hg(str);
                        }
                        objP2 = cl3.d(hgVar);
                        kk0Var2.l0(objP2);
                    }
                    mi2Var = (mi2) objP2;
                    boolean zI = kk0Var2.i(z5) | kk0Var2.h(mi2Var);
                    if ((i14 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean zJ = zI | z6 | kk0Var2.j(map2);
                    if ((i14 & 7168) == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = zJ | z7 | ((((57344 & i14) ^ 24576) <= 16384 && kk0Var2.g(j4)) || (i14 & 24576) == 16384);
                    objP3 = kk0Var2.P();
                    if (z8 || objP3 == Composer$Companion.getEmpty()) {
                        objP3 = new ds0(z5, str, j7, j4, mi2Var, map2, null);
                        kk0Var2.l0(objP3);
                    }
                    r11.LaunchedEffect(obj3, (ne1) objP3, kk0Var2, (i14 >> 21) & 14);
                    kk0Var = kk0Var2;
                    uy3.m1843xf9a47e34((hg) mi2Var.getValue(), cVar4, j7, 0L, null, null, null, 0L, null, new jt3(i13), 0L, 0, false, 0, 0, null, null, uz3Var4, kk0Var, (i14 & 112) | ((i14 >> 3) & 896) | ((i14 << 12) & 1879048192), (i14 << 15) & 29360128, 130552);
                    Object obj5 = obj3;
                    i12 = i13;
                    j5 = j4;
                    obj2 = obj5;
                    cVar3 = cVar4;
                    j6 = j7;
                    uz3Var3 = uz3Var4;
                    z3 = z9;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    cVar3 = cVar2;
                    uz3Var3 = uz3Var2;
                    j5 = j4;
                    j6 = j3;
                    i12 = i8;
                    z3 = z;
                    obj2 = obj;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ne1() { // from class: cs0
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj6, Object obj7) {
                            ((Integer) obj7).getClass();
                            es0.m190xa0c02e10(str, cVar3, uz3Var3, j6, j5, i12, z3, obj2, (ck0) obj6, sf3.V(i2 | 1), i3);
                            return w84.a;
                        }
                    });
                }
            }
            i23 |= 384;
            uz3Var2 = uz3Var;
            i6 = i3 & 8;
            if (i6 != 0) {
                i23 |= 3072;
                j3 = j;
            } else {
                j3 = j;
                if ((i2 & 3072) == 0) {
                    if (kk0Var2.g(j3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i23 |= i7;
                }
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (kk0Var2.g(j4)) {
                        i22 = 16384;
                    }
                    i23 |= i22;
                } else {
                    j4 = j2;
                }
                i22 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i23 |= i22;
            } else {
                j4 = j2;
            }
            if ((i2 & 196608) == 0) {
                i8 = i;
                if ((i3 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i23 |= i21;
            } else {
                i8 = i;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i23 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (kk0Var2.i(z)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i23 |= i10;
            }
            if ((i2 & 12582912) == 0) {
                i11 = i23 | (((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var2.j(obj)) ? 4194304 : 8388608);
            } else {
                i11 = i23;
            }
            if ((i11 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (kk0Var2.S(i11 & 1, z2)) {
                kk0Var2.X();
                if ((i2 & 1) != 0) {
                    if (i24 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        uz3Var2 = uz3.d;
                    }
                    if (i6 != 0) {
                        j3 = re0.i;
                    }
                    if ((i3 & 16) != 0) {
                        i11 &= -57345;
                        j4 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        i13 = 3;
                        i11 &= -458753;
                    } else {
                        i13 = i8;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        i11 &= -29360129;
                        cVar4 = cVar2;
                        obj3 = str;
                    } else {
                        cVar4 = cVar2;
                        obj3 = obj;
                    }
                    i14 = i11;
                } else {
                    if (i24 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        uz3Var2 = uz3.d;
                    }
                    if (i6 != 0) {
                        j3 = re0.i;
                    }
                    if ((i3 & 16) != 0) {
                        i11 &= -57345;
                        j4 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        i13 = 3;
                        i11 &= -458753;
                    } else {
                        i13 = i8;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        i11 &= -29360129;
                        cVar4 = cVar2;
                        obj3 = str;
                    } else {
                        cVar4 = cVar2;
                        obj3 = obj;
                    }
                    i14 = i11;
                }
                kk0Var2.s();
                if (z4) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                j7 = j3;
                ez3VarRememberTextMeasurer = fz3.rememberTextMeasurer(0, kk0Var2, 0, 1);
                uz3VarD = ((uz3) kk0Var2.l(uy3.a)).d(uz3Var2);
                zH = kk0Var2.h(obj3) | kk0Var2.h(uz3VarD);
                objP = kk0Var2.P();
                boolean z10 = z4;
                uz3 uz3Var5 = uz3Var2;
                if (zH) {
                    if (z5) {
                        fArr = new float[72];
                        i16 = 0;
                        while (i16 < i15) {
                            fArr[i16] = b(ez3VarRememberTextMeasurer, uz3VarD, "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i16));
                            i16++;
                        }
                        kq1Var = (kq1) new lq1(0, 71, 1).iterator();
                        if (kq1Var.h) {
                            obj4 = null;
                        } else {
                            next = kq1Var.next();
                            if (kq1Var.h) {
                                fValueOf = Float.valueOf(fArr[((Number) next).intValue()]);
                                do {
                                    next2 = kq1Var.next();
                                    fValueOf2 = Float.valueOf(fArr[((Number) next2).intValue()]);
                                    if (fValueOf.compareTo(fValueOf2) > 0) {
                                        fValueOf = fValueOf2;
                                        next = next2;
                                    }
                                } while (kq1Var.h);
                            }
                            obj4 = next;
                        }
                        num = (Integer) obj4;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        map = new HashMap();
                        length = str.length();
                        i17 = 0;
                        while (i17 < length) {
                            int i26 = length;
                            cCharAt = str.charAt(i17);
                            if (yo4.G(cCharAt)) {
                                i18 = i17;
                                if (!map.containsKey(Character.valueOf(cCharAt))) {
                                    fB = b(ez3VarRememberTextMeasurer, uz3VarD, cCharAt) * 1.02f;
                                    sb = new StringBuilder();
                                    while (i19 < 72) {
                                        if (fArr[i19] <= fB) {
                                            sb.append("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i19));
                                        }
                                    }
                                    string = sb.toString();
                                    Character chValueOf2 = Character.valueOf(cCharAt);
                                    if (string.length() == 0) {
                                        string = String.valueOf("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(iIntValue));
                                    }
                                    map.put(chValueOf2, string);
                                }
                            } else {
                                i18 = i17;
                            }
                            i17 = i18 + 1;
                            length = i26;
                            uz3VarD = uz3VarD;
                            ez3VarRememberTextMeasurer = ez3VarRememberTextMeasurer;
                        }
                        objP = map;
                    } else {
                        objP = a31.c;
                    }
                    kk0Var2.l0(objP);
                } else {
                    if (z5) {
                        fArr = new float[72];
                        i16 = 0;
                        while (i16 < i15) {
                            fArr[i16] = b(ez3VarRememberTextMeasurer, uz3VarD, "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i16));
                            i16++;
                        }
                        kq1Var = (kq1) new lq1(0, 71, 1).iterator();
                        if (kq1Var.h) {
                            obj4 = null;
                        } else {
                            next = kq1Var.next();
                            if (kq1Var.h) {
                                fValueOf = Float.valueOf(fArr[((Number) next).intValue()]);
                                do {
                                    next2 = kq1Var.next();
                                    fValueOf2 = Float.valueOf(fArr[((Number) next2).intValue()]);
                                    if (fValueOf.compareTo(fValueOf2) > 0) {
                                        fValueOf = fValueOf2;
                                        next = next2;
                                    }
                                } while (kq1Var.h);
                            }
                            obj4 = next;
                        }
                        num = (Integer) obj4;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        map = new HashMap();
                        length = str.length();
                        i17 = 0;
                        while (i17 < length) {
                            int i27 = length;
                            cCharAt = str.charAt(i17);
                            if (yo4.G(cCharAt)) {
                                i18 = i17;
                                if (!map.containsKey(Character.valueOf(cCharAt))) {
                                    fB = b(ez3VarRememberTextMeasurer, uz3VarD, cCharAt) * 1.02f;
                                    sb = new StringBuilder();
                                    while (i19 < 72) {
                                        if (fArr[i19] <= fB) {
                                            sb.append("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i19));
                                        }
                                    }
                                    string = sb.toString();
                                    Character chValueOf3 = Character.valueOf(cCharAt);
                                    if (string.length() == 0) {
                                        string = String.valueOf("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(iIntValue));
                                    }
                                    map.put(chValueOf3, string);
                                }
                            } else {
                                i18 = i17;
                            }
                            i17 = i18 + 1;
                            length = i27;
                            uz3VarD = uz3VarD;
                            ez3VarRememberTextMeasurer = ez3VarRememberTextMeasurer;
                        }
                        objP = map;
                    } else {
                        objP = a31.c;
                    }
                    kk0Var2.l0(objP);
                }
                map2 = (Map) objP;
                zH2 = kk0Var2.h(obj3);
                objP2 = kk0Var2.P();
                if (zH2) {
                    if (z5) {
                        oj4VarD = yo4.d(System.nanoTime());
                        length2 = str.length();
                        cArr = new char[length2];
                        i20 = 0;
                        while (i20 < length2) {
                            cCharAt2 = str.charAt(i20);
                            if (!yo4.G(cCharAt2)) {
                                str2 = (String) map2.get(Character.valueOf(cCharAt2));
                                if (str2 == null) {
                                    str2 = "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz";
                                }
                                cCharAt2 = str2.charAt(oj4VarD.e(str2.length()));
                            }
                            cArr[i20] = cCharAt2;
                            i20++;
                            length2 = length2;
                        }
                        hgVar = new hg(new String(cArr));
                    } else {
                        hgVar = new hg(str);
                    }
                    objP2 = cl3.d(hgVar);
                    kk0Var2.l0(objP2);
                } else {
                    if (z5) {
                        oj4VarD = yo4.d(System.nanoTime());
                        length2 = str.length();
                        cArr = new char[length2];
                        i20 = 0;
                        while (i20 < length2) {
                            cCharAt2 = str.charAt(i20);
                            if (!yo4.G(cCharAt2)) {
                                str2 = (String) map2.get(Character.valueOf(cCharAt2));
                                if (str2 == null) {
                                    str2 = "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz";
                                }
                                cCharAt2 = str2.charAt(oj4VarD.e(str2.length()));
                            }
                            cArr[i20] = cCharAt2;
                            i20++;
                            length2 = length2;
                        }
                        hgVar = new hg(new String(cArr));
                    } else {
                        hgVar = new hg(str);
                    }
                    objP2 = cl3.d(hgVar);
                    kk0Var2.l0(objP2);
                }
                mi2Var = (mi2) objP2;
                boolean zI2 = kk0Var2.i(z5) | kk0Var2.h(mi2Var);
                if ((i14 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean zJ2 = zI2 | z6 | kk0Var2.j(map2);
                if ((i14 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zJ2 | z7 | ((((57344 & i14) ^ 24576) <= 16384 && kk0Var2.g(j4)) || (i14 & 24576) == 16384);
                objP3 = kk0Var2.P();
                if (z8) {
                    objP3 = new ds0(z5, str, j7, j4, mi2Var, map2, null);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new ds0(z5, str, j7, j4, mi2Var, map2, null);
                    kk0Var2.l0(objP3);
                }
                r11.LaunchedEffect(obj3, (ne1) objP3, kk0Var2, (i14 >> 21) & 14);
                kk0Var = kk0Var2;
                uy3.m1843xf9a47e34((hg) mi2Var.getValue(), cVar4, j7, 0L, null, null, null, 0L, null, new jt3(i13), 0L, 0, false, 0, 0, null, null, uz3Var5, kk0Var, (i14 & 112) | ((i14 >> 3) & 896) | ((i14 << 12) & 1879048192), (i14 << 15) & 29360128, 130552);
                Object obj6 = obj3;
                i12 = i13;
                j5 = j4;
                obj2 = obj6;
                cVar3 = cVar4;
                j6 = j7;
                uz3Var3 = uz3Var5;
                z3 = z10;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar3 = cVar2;
                uz3Var3 = uz3Var2;
                j5 = j4;
                j6 = j3;
                i12 = i8;
                z3 = z;
                obj2 = obj;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: cs0
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj7, Object obj8) {
                        ((Integer) obj8).getClass();
                        es0.m190xa0c02e10(str, cVar3, uz3Var3, j6, j5, i12, z3, obj2, (ck0) obj7, sf3.V(i2 | 1), i3);
                        return w84.a;
                    }
                });
            }
        }
        i23 |= 48;
        cVar2 = cVar;
        i4 = i3 & 4;
        if (i4 != 0) {
            if ((i2 & 384) == 0) {
                uz3Var2 = uz3Var;
                if (kk0Var2.h(uz3Var2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i23 |= i5;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                i23 |= 3072;
                j3 = j;
            } else {
                j3 = j;
                if ((i2 & 3072) == 0) {
                    if (kk0Var2.g(j3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i23 |= i7;
                }
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (kk0Var2.g(j4)) {
                        i22 = 16384;
                    }
                    i23 |= i22;
                } else {
                    j4 = j2;
                }
                i22 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i23 |= i22;
            } else {
                j4 = j2;
            }
            if ((i2 & 196608) == 0) {
                i8 = i;
                if ((i3 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i23 |= i21;
            } else {
                i8 = i;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i23 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (kk0Var2.i(z)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i23 |= i10;
            }
            if ((i2 & 12582912) == 0) {
                i11 = i23 | (((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var2.j(obj)) ? 4194304 : 8388608);
            } else {
                i11 = i23;
            }
            if ((i11 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (kk0Var2.S(i11 & 1, z2)) {
                kk0Var2.X();
                if ((i2 & 1) != 0) {
                    if (i24 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        uz3Var2 = uz3.d;
                    }
                    if (i6 != 0) {
                        j3 = re0.i;
                    }
                    if ((i3 & 16) != 0) {
                        i11 &= -57345;
                        j4 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        i13 = 3;
                        i11 &= -458753;
                    } else {
                        i13 = i8;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        i11 &= -29360129;
                        cVar4 = cVar2;
                        obj3 = str;
                    } else {
                        cVar4 = cVar2;
                        obj3 = obj;
                    }
                    i14 = i11;
                } else {
                    if (i24 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        uz3Var2 = uz3.d;
                    }
                    if (i6 != 0) {
                        j3 = re0.i;
                    }
                    if ((i3 & 16) != 0) {
                        i11 &= -57345;
                        j4 = j3;
                    }
                    if ((i3 & 32) != 0) {
                        i13 = 3;
                        i11 &= -458753;
                    } else {
                        i13 = i8;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & Uuid.SIZE_BITS) != 0) {
                        i11 &= -29360129;
                        cVar4 = cVar2;
                        obj3 = str;
                    } else {
                        cVar4 = cVar2;
                        obj3 = obj;
                    }
                    i14 = i11;
                }
                kk0Var2.s();
                if (z4) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                j7 = j3;
                ez3VarRememberTextMeasurer = fz3.rememberTextMeasurer(0, kk0Var2, 0, 1);
                uz3VarD = ((uz3) kk0Var2.l(uy3.a)).d(uz3Var2);
                zH = kk0Var2.h(obj3) | kk0Var2.h(uz3VarD);
                objP = kk0Var2.P();
                boolean z11 = z4;
                uz3 uz3Var6 = uz3Var2;
                if (zH) {
                    if (z5) {
                        fArr = new float[72];
                        i16 = 0;
                        while (i16 < i15) {
                            fArr[i16] = b(ez3VarRememberTextMeasurer, uz3VarD, "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i16));
                            i16++;
                        }
                        kq1Var = (kq1) new lq1(0, 71, 1).iterator();
                        if (kq1Var.h) {
                            obj4 = null;
                        } else {
                            next = kq1Var.next();
                            if (kq1Var.h) {
                                fValueOf = Float.valueOf(fArr[((Number) next).intValue()]);
                                do {
                                    next2 = kq1Var.next();
                                    fValueOf2 = Float.valueOf(fArr[((Number) next2).intValue()]);
                                    if (fValueOf.compareTo(fValueOf2) > 0) {
                                        fValueOf = fValueOf2;
                                        next = next2;
                                    }
                                } while (kq1Var.h);
                            }
                            obj4 = next;
                        }
                        num = (Integer) obj4;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        map = new HashMap();
                        length = str.length();
                        i17 = 0;
                        while (i17 < length) {
                            int i28 = length;
                            cCharAt = str.charAt(i17);
                            if (yo4.G(cCharAt)) {
                                i18 = i17;
                                if (!map.containsKey(Character.valueOf(cCharAt))) {
                                    fB = b(ez3VarRememberTextMeasurer, uz3VarD, cCharAt) * 1.02f;
                                    sb = new StringBuilder();
                                    while (i19 < 72) {
                                        if (fArr[i19] <= fB) {
                                            sb.append("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i19));
                                        }
                                    }
                                    string = sb.toString();
                                    Character chValueOf4 = Character.valueOf(cCharAt);
                                    if (string.length() == 0) {
                                        string = String.valueOf("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(iIntValue));
                                    }
                                    map.put(chValueOf4, string);
                                }
                            } else {
                                i18 = i17;
                            }
                            i17 = i18 + 1;
                            length = i28;
                            uz3VarD = uz3VarD;
                            ez3VarRememberTextMeasurer = ez3VarRememberTextMeasurer;
                        }
                        objP = map;
                    } else {
                        objP = a31.c;
                    }
                    kk0Var2.l0(objP);
                } else {
                    if (z5) {
                        fArr = new float[72];
                        i16 = 0;
                        while (i16 < i15) {
                            fArr[i16] = b(ez3VarRememberTextMeasurer, uz3VarD, "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i16));
                            i16++;
                        }
                        kq1Var = (kq1) new lq1(0, 71, 1).iterator();
                        if (kq1Var.h) {
                            obj4 = null;
                        } else {
                            next = kq1Var.next();
                            if (kq1Var.h) {
                                fValueOf = Float.valueOf(fArr[((Number) next).intValue()]);
                                do {
                                    next2 = kq1Var.next();
                                    fValueOf2 = Float.valueOf(fArr[((Number) next2).intValue()]);
                                    if (fValueOf.compareTo(fValueOf2) > 0) {
                                        fValueOf = fValueOf2;
                                        next = next2;
                                    }
                                } while (kq1Var.h);
                            }
                            obj4 = next;
                        }
                        num = (Integer) obj4;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        map = new HashMap();
                        length = str.length();
                        i17 = 0;
                        while (i17 < length) {
                            int i29 = length;
                            cCharAt = str.charAt(i17);
                            if (yo4.G(cCharAt)) {
                                i18 = i17;
                                if (!map.containsKey(Character.valueOf(cCharAt))) {
                                    fB = b(ez3VarRememberTextMeasurer, uz3VarD, cCharAt) * 1.02f;
                                    sb = new StringBuilder();
                                    while (i19 < 72) {
                                        if (fArr[i19] <= fB) {
                                            sb.append("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i19));
                                        }
                                    }
                                    string = sb.toString();
                                    Character chValueOf5 = Character.valueOf(cCharAt);
                                    if (string.length() == 0) {
                                        string = String.valueOf("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(iIntValue));
                                    }
                                    map.put(chValueOf5, string);
                                }
                            } else {
                                i18 = i17;
                            }
                            i17 = i18 + 1;
                            length = i29;
                            uz3VarD = uz3VarD;
                            ez3VarRememberTextMeasurer = ez3VarRememberTextMeasurer;
                        }
                        objP = map;
                    } else {
                        objP = a31.c;
                    }
                    kk0Var2.l0(objP);
                }
                map2 = (Map) objP;
                zH2 = kk0Var2.h(obj3);
                objP2 = kk0Var2.P();
                if (zH2) {
                    if (z5) {
                        oj4VarD = yo4.d(System.nanoTime());
                        length2 = str.length();
                        cArr = new char[length2];
                        i20 = 0;
                        while (i20 < length2) {
                            cCharAt2 = str.charAt(i20);
                            if (!yo4.G(cCharAt2)) {
                                str2 = (String) map2.get(Character.valueOf(cCharAt2));
                                if (str2 == null) {
                                    str2 = "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz";
                                }
                                cCharAt2 = str2.charAt(oj4VarD.e(str2.length()));
                            }
                            cArr[i20] = cCharAt2;
                            i20++;
                            length2 = length2;
                        }
                        hgVar = new hg(new String(cArr));
                    } else {
                        hgVar = new hg(str);
                    }
                    objP2 = cl3.d(hgVar);
                    kk0Var2.l0(objP2);
                } else {
                    if (z5) {
                        oj4VarD = yo4.d(System.nanoTime());
                        length2 = str.length();
                        cArr = new char[length2];
                        i20 = 0;
                        while (i20 < length2) {
                            cCharAt2 = str.charAt(i20);
                            if (!yo4.G(cCharAt2)) {
                                str2 = (String) map2.get(Character.valueOf(cCharAt2));
                                if (str2 == null) {
                                    str2 = "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz";
                                }
                                cCharAt2 = str2.charAt(oj4VarD.e(str2.length()));
                            }
                            cArr[i20] = cCharAt2;
                            i20++;
                            length2 = length2;
                        }
                        hgVar = new hg(new String(cArr));
                    } else {
                        hgVar = new hg(str);
                    }
                    objP2 = cl3.d(hgVar);
                    kk0Var2.l0(objP2);
                }
                mi2Var = (mi2) objP2;
                boolean zI3 = kk0Var2.i(z5) | kk0Var2.h(mi2Var);
                if ((i14 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean zJ3 = zI3 | z6 | kk0Var2.j(map2);
                if ((i14 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zJ3 | z7 | ((((57344 & i14) ^ 24576) <= 16384 && kk0Var2.g(j4)) || (i14 & 24576) == 16384);
                objP3 = kk0Var2.P();
                if (z8) {
                    objP3 = new ds0(z5, str, j7, j4, mi2Var, map2, null);
                    kk0Var2.l0(objP3);
                } else {
                    objP3 = new ds0(z5, str, j7, j4, mi2Var, map2, null);
                    kk0Var2.l0(objP3);
                }
                r11.LaunchedEffect(obj3, (ne1) objP3, kk0Var2, (i14 >> 21) & 14);
                kk0Var = kk0Var2;
                uy3.m1843xf9a47e34((hg) mi2Var.getValue(), cVar4, j7, 0L, null, null, null, 0L, null, new jt3(i13), 0L, 0, false, 0, 0, null, null, uz3Var6, kk0Var, (i14 & 112) | ((i14 >> 3) & 896) | ((i14 << 12) & 1879048192), (i14 << 15) & 29360128, 130552);
                Object obj7 = obj3;
                i12 = i13;
                j5 = j4;
                obj2 = obj7;
                cVar3 = cVar4;
                j6 = j7;
                uz3Var3 = uz3Var6;
                z3 = z11;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar3 = cVar2;
                uz3Var3 = uz3Var2;
                j5 = j4;
                j6 = j3;
                i12 = i8;
                z3 = z;
                obj2 = obj;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: cs0
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj8, Object obj9) {
                        ((Integer) obj9).getClass();
                        es0.m190xa0c02e10(str, cVar3, uz3Var3, j6, j5, i12, z3, obj2, (ck0) obj8, sf3.V(i2 | 1), i3);
                        return w84.a;
                    }
                });
            }
        }
        i23 |= 384;
        uz3Var2 = uz3Var;
        i6 = i3 & 8;
        if (i6 != 0) {
            i23 |= 3072;
            j3 = j;
        } else {
            j3 = j;
            if ((i2 & 3072) == 0) {
                if (kk0Var2.g(j3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i23 |= i7;
            }
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                j4 = j2;
                if (kk0Var2.g(j4)) {
                    i22 = 16384;
                }
                i23 |= i22;
            } else {
                j4 = j2;
            }
            i22 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i23 |= i22;
        } else {
            j4 = j2;
        }
        if ((i2 & 196608) == 0) {
            i8 = i;
            if ((i3 & 32) == 0) {
                i21 = 65536;
            } else {
                i21 = 65536;
            }
            i23 |= i21;
        } else {
            i8 = i;
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i23 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (kk0Var2.i(z)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i23 |= i10;
        }
        if ((i2 & 12582912) == 0) {
            i11 = i23 | (((i3 & Uuid.SIZE_BITS) == 0 || !kk0Var2.j(obj)) ? 4194304 : 8388608);
        } else {
            i11 = i23;
        }
        if ((i11 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kk0Var2.S(i11 & 1, z2)) {
            kk0Var2.X();
            if ((i2 & 1) != 0) {
                if (i24 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    uz3Var2 = uz3.d;
                }
                if (i6 != 0) {
                    j3 = re0.i;
                }
                if ((i3 & 16) != 0) {
                    i11 &= -57345;
                    j4 = j3;
                }
                if ((i3 & 32) != 0) {
                    i13 = 3;
                    i11 &= -458753;
                } else {
                    i13 = i8;
                }
                if (i9 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    i11 &= -29360129;
                    cVar4 = cVar2;
                    obj3 = str;
                } else {
                    cVar4 = cVar2;
                    obj3 = obj;
                }
                i14 = i11;
            } else {
                if (i24 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    uz3Var2 = uz3.d;
                }
                if (i6 != 0) {
                    j3 = re0.i;
                }
                if ((i3 & 16) != 0) {
                    i11 &= -57345;
                    j4 = j3;
                }
                if ((i3 & 32) != 0) {
                    i13 = 3;
                    i11 &= -458753;
                } else {
                    i13 = i8;
                }
                if (i9 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i3 & Uuid.SIZE_BITS) != 0) {
                    i11 &= -29360129;
                    cVar4 = cVar2;
                    obj3 = str;
                } else {
                    cVar4 = cVar2;
                    obj3 = obj;
                }
                i14 = i11;
            }
            kk0Var2.s();
            if (z4) {
                z5 = false;
            } else {
                z5 = false;
            }
            j7 = j3;
            ez3VarRememberTextMeasurer = fz3.rememberTextMeasurer(0, kk0Var2, 0, 1);
            uz3VarD = ((uz3) kk0Var2.l(uy3.a)).d(uz3Var2);
            zH = kk0Var2.h(obj3) | kk0Var2.h(uz3VarD);
            objP = kk0Var2.P();
            boolean z12 = z4;
            uz3 uz3Var7 = uz3Var2;
            if (zH) {
                if (z5) {
                    fArr = new float[72];
                    i16 = 0;
                    while (i16 < i15) {
                        fArr[i16] = b(ez3VarRememberTextMeasurer, uz3VarD, "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i16));
                        i16++;
                    }
                    kq1Var = (kq1) new lq1(0, 71, 1).iterator();
                    if (kq1Var.h) {
                        obj4 = null;
                    } else {
                        next = kq1Var.next();
                        if (kq1Var.h) {
                            fValueOf = Float.valueOf(fArr[((Number) next).intValue()]);
                            do {
                                next2 = kq1Var.next();
                                fValueOf2 = Float.valueOf(fArr[((Number) next2).intValue()]);
                                if (fValueOf.compareTo(fValueOf2) > 0) {
                                    fValueOf = fValueOf2;
                                    next = next2;
                                }
                            } while (kq1Var.h);
                        }
                        obj4 = next;
                    }
                    num = (Integer) obj4;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    map = new HashMap();
                    length = str.length();
                    i17 = 0;
                    while (i17 < length) {
                        int i210 = length;
                        cCharAt = str.charAt(i17);
                        if (yo4.G(cCharAt)) {
                            i18 = i17;
                            if (!map.containsKey(Character.valueOf(cCharAt))) {
                                fB = b(ez3VarRememberTextMeasurer, uz3VarD, cCharAt) * 1.02f;
                                sb = new StringBuilder();
                                while (i19 < 72) {
                                    if (fArr[i19] <= fB) {
                                        sb.append("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i19));
                                    }
                                }
                                string = sb.toString();
                                Character chValueOf6 = Character.valueOf(cCharAt);
                                if (string.length() == 0) {
                                    string = String.valueOf("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(iIntValue));
                                }
                                map.put(chValueOf6, string);
                            }
                        } else {
                            i18 = i17;
                        }
                        i17 = i18 + 1;
                        length = i210;
                        uz3VarD = uz3VarD;
                        ez3VarRememberTextMeasurer = ez3VarRememberTextMeasurer;
                    }
                    objP = map;
                } else {
                    objP = a31.c;
                }
                kk0Var2.l0(objP);
            } else {
                if (z5) {
                    fArr = new float[72];
                    i16 = 0;
                    while (i16 < i15) {
                        fArr[i16] = b(ez3VarRememberTextMeasurer, uz3VarD, "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i16));
                        i16++;
                    }
                    kq1Var = (kq1) new lq1(0, 71, 1).iterator();
                    if (kq1Var.h) {
                        obj4 = null;
                    } else {
                        next = kq1Var.next();
                        if (kq1Var.h) {
                            fValueOf = Float.valueOf(fArr[((Number) next).intValue()]);
                            do {
                                next2 = kq1Var.next();
                                fValueOf2 = Float.valueOf(fArr[((Number) next2).intValue()]);
                                if (fValueOf.compareTo(fValueOf2) > 0) {
                                    fValueOf = fValueOf2;
                                    next = next2;
                                }
                            } while (kq1Var.h);
                        }
                        obj4 = next;
                    }
                    num = (Integer) obj4;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    map = new HashMap();
                    length = str.length();
                    i17 = 0;
                    while (i17 < length) {
                        int i211 = length;
                        cCharAt = str.charAt(i17);
                        if (yo4.G(cCharAt)) {
                            i18 = i17;
                            if (!map.containsKey(Character.valueOf(cCharAt))) {
                                fB = b(ez3VarRememberTextMeasurer, uz3VarD, cCharAt) * 1.02f;
                                sb = new StringBuilder();
                                while (i19 < 72) {
                                    if (fArr[i19] <= fB) {
                                        sb.append("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(i19));
                                    }
                                }
                                string = sb.toString();
                                Character chValueOf7 = Character.valueOf(cCharAt);
                                if (string.length() == 0) {
                                    string = String.valueOf("!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz".charAt(iIntValue));
                                }
                                map.put(chValueOf7, string);
                            }
                        } else {
                            i18 = i17;
                        }
                        i17 = i18 + 1;
                        length = i211;
                        uz3VarD = uz3VarD;
                        ez3VarRememberTextMeasurer = ez3VarRememberTextMeasurer;
                    }
                    objP = map;
                } else {
                    objP = a31.c;
                }
                kk0Var2.l0(objP);
            }
            map2 = (Map) objP;
            zH2 = kk0Var2.h(obj3);
            objP2 = kk0Var2.P();
            if (zH2) {
                if (z5) {
                    oj4VarD = yo4.d(System.nanoTime());
                    length2 = str.length();
                    cArr = new char[length2];
                    i20 = 0;
                    while (i20 < length2) {
                        cCharAt2 = str.charAt(i20);
                        if (!yo4.G(cCharAt2)) {
                            str2 = (String) map2.get(Character.valueOf(cCharAt2));
                            if (str2 == null) {
                                str2 = "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz";
                            }
                            cCharAt2 = str2.charAt(oj4VarD.e(str2.length()));
                        }
                        cArr[i20] = cCharAt2;
                        i20++;
                        length2 = length2;
                    }
                    hgVar = new hg(new String(cArr));
                } else {
                    hgVar = new hg(str);
                }
                objP2 = cl3.d(hgVar);
                kk0Var2.l0(objP2);
            } else {
                if (z5) {
                    oj4VarD = yo4.d(System.nanoTime());
                    length2 = str.length();
                    cArr = new char[length2];
                    i20 = 0;
                    while (i20 < length2) {
                        cCharAt2 = str.charAt(i20);
                        if (!yo4.G(cCharAt2)) {
                            str2 = (String) map2.get(Character.valueOf(cCharAt2));
                            if (str2 == null) {
                                str2 = "!<>-_/[]{}=+*?#$%&|:;0123456789ABCDEFGHKLNPRSTVXZabcdefghijklmnprstuvxyz";
                            }
                            cCharAt2 = str2.charAt(oj4VarD.e(str2.length()));
                        }
                        cArr[i20] = cCharAt2;
                        i20++;
                        length2 = length2;
                    }
                    hgVar = new hg(new String(cArr));
                } else {
                    hgVar = new hg(str);
                }
                objP2 = cl3.d(hgVar);
                kk0Var2.l0(objP2);
            }
            mi2Var = (mi2) objP2;
            boolean zI4 = kk0Var2.i(z5) | kk0Var2.h(mi2Var);
            if ((i14 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean zJ4 = zI4 | z6 | kk0Var2.j(map2);
            if ((i14 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = zJ4 | z7 | ((((57344 & i14) ^ 24576) <= 16384 && kk0Var2.g(j4)) || (i14 & 24576) == 16384);
            objP3 = kk0Var2.P();
            if (z8) {
                objP3 = new ds0(z5, str, j7, j4, mi2Var, map2, null);
                kk0Var2.l0(objP3);
            } else {
                objP3 = new ds0(z5, str, j7, j4, mi2Var, map2, null);
                kk0Var2.l0(objP3);
            }
            r11.LaunchedEffect(obj3, (ne1) objP3, kk0Var2, (i14 >> 21) & 14);
            kk0Var = kk0Var2;
            uy3.m1843xf9a47e34((hg) mi2Var.getValue(), cVar4, j7, 0L, null, null, null, 0L, null, new jt3(i13), 0L, 0, false, 0, 0, null, null, uz3Var7, kk0Var, (i14 & 112) | ((i14 >> 3) & 896) | ((i14 << 12) & 1879048192), (i14 << 15) & 29360128, 130552);
            Object obj8 = obj3;
            i12 = i13;
            j5 = j4;
            obj2 = obj8;
            cVar3 = cVar4;
            j6 = j7;
            uz3Var3 = uz3Var7;
            z3 = z12;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar3 = cVar2;
            uz3Var3 = uz3Var2;
            j5 = j4;
            j6 = j3;
            i12 = i8;
            z3 = z;
            obj2 = obj;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: cs0
                @Override // defpackage.ne1
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    es0.m190xa0c02e10(str, cVar3, uz3Var3, j6, j5, i12, z3, obj2, (ck0) obj9, sf3.V(i2 | 1), i3);
                    return w84.a;
                }
            });
        }
    }

    public static final hg a(String str, char[] cArr, boolean[] zArr, long j, long j2) {
        int i;
        fg fgVar;
        if (re0.c(j2, j) || re0.c(j2, re0.i)) {
            return new hg(new String(cArr));
        }
        fg fgVar2 = new fg();
        int i2 = 0;
        for (int length = str.length(); i2 < length; length = length) {
            boolean z = zArr[i2];
            StringBuilder sb = fgVar2.c;
            if (z) {
                sb.append(cArr[i2]);
                fgVar = fgVar2;
                i = i2;
            } else {
                i = i2;
                fgVar = fgVar2;
                int iC = fgVar.c(new em3(j2, 0L, (ic1) null, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65534));
                try {
                    sb.append(cArr[i]);
                    fgVar.b(iC);
                } catch (Throwable th) {
                    fgVar.b(iC);
                    throw th;
                }
            }
            i2 = i + 1;
            fgVar2 = fgVar;
        }
        return fgVar2.d();
    }

    public static final float b(ez3 ez3Var, uz3 uz3Var, char c) {
        Object i63Var;
        try {
            i63Var = Float.valueOf((int) (ez3.a(ez3Var, new hg(String.valueOf(c)), uz3Var, false, 0, 0L, null, null, null, 2036).c >> 32));
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        Object objValueOf = Float.valueOf(0.0f);
        if (i63Var instanceof i63) {
            i63Var = objValueOf;
        }
        return ((Number) i63Var).floatValue();
    }
}
