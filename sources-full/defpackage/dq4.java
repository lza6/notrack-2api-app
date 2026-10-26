package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import app.template.extension.BuildConfig;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;
import org.scilab.forge.jlatexmath.FontInfo;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class dq4 implements jq4 {
    public static final int[] i = new int[0];
    public static final Unsafe j = rq4.e();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final ep4 e;
    public final int[] f;
    public final int g;
    public final int h;

    public dq4(int[] iArr, Object[] objArr, int i2, int i3, ep4 ep4Var, int[] iArr2, int i4, int i5, zf3 zf3Var, sb3 sb3Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.f = iArr2;
        this.g = i4;
        this.h = i5;
        this.e = ep4Var;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbT = fq2.t("Field ", str, " for ", name, " not found. Known fields are ");
            sbT.append(string);
            throw new RuntimeException(sbT.toString(), e);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof sp4) {
            return ((sp4) obj).h();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0259  */
    /* JADX WARN: Code duplicated, block: B:129:0x025c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0278  */
    /* JADX WARN: Code duplicated, block: B:133:0x027b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0348  */
    /* JADX WARN: Code duplicated, block: B:175:0x034e  */
    /* JADX WARN: Code duplicated, block: B:177:0x035b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0367 A[LOOP:6: B:178:0x035f->B:180:0x0367, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0384  */
    /* JADX WARN: Code duplicated, block: B:185:0x0387  */
    /* JADX WARN: Code duplicated, block: B:187:0x039d  */
    /* JADX WARN: Code duplicated, block: B:189:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:216:0x0371 A[EDGE_INSN: B:216:0x0371->B:181:0x0371 BREAK  A[LOOP:6: B:178:0x035f->B:180:0x0367], SYNTHETIC] */
    public static dq4 u(iq4 iq4Var, zf3 zf3Var, sb3 sb3Var) {
        int i2;
        int iCharAt;
        int iCharAt2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int i20;
        int iObjectFieldOffset2;
        int i21;
        int iCharAt3;
        int i22;
        Object obj;
        Field fieldE;
        int i23;
        int i24;
        int i25;
        char cCharAt8;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Object obj2;
        Field fieldE2;
        int i31;
        Object obj3;
        Field fieldE3;
        int i32;
        char cCharAt9;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        Unsafe unsafe = j;
        if (unsafe == null) {
            throw new RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
        }
        if (!(iq4Var instanceof iq4)) {
            m51.t();
            return null;
        }
        String str = iq4Var.b;
        int length = str.length();
        int i36 = 0;
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i2 = i37 + 1;
                if (str.charAt(i37) < 55296) {
                    break;
                }
                i37 = i2;
            }
        } else {
            i2 = 1;
        }
        int i38 = i2 + 1;
        int iCharAt4 = str.charAt(i2);
        if (iCharAt4 >= 55296) {
            int i39 = iCharAt4 & 8191;
            int i40 = 13;
            while (true) {
                i35 = i38 + 1;
                cCharAt12 = str.charAt(i38);
                if (cCharAt12 < 55296) {
                    break;
                }
                i39 |= (cCharAt12 & 8191) << i40;
                i40 += 13;
                i38 = i35;
            }
            iCharAt4 = i39 | (cCharAt12 << i40);
            i38 = i35;
        }
        if (iCharAt4 == 0) {
            iArr = i;
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt5 = str.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt7 = str.charAt(i41);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt5 = i42 | (cCharAt7 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt6 = str.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt6 = str.charAt(i44);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt6 = i45 | (cCharAt6 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt7 = str.charAt(i44);
            if (iCharAt7 >= 55296) {
                int i48 = iCharAt7 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt5 = str.charAt(i47);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt7 = i48 | (cCharAt5 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            int iCharAt8 = str.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt4 = str.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt8 = i51 | (cCharAt4 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            iCharAt = str.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt3 = str.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt = i54 | (cCharAt3 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            iCharAt2 = str.charAt(i53);
            if (iCharAt2 >= 55296) {
                int i57 = iCharAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    cCharAt2 = str.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                iCharAt2 = i57 | (cCharAt2 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            if (str.charAt(i56) >= 55296) {
                while (true) {
                    i8 = i59 + 1;
                    if (str.charAt(i59) < 55296) {
                        break;
                    }
                    i59 = i8;
                }
                i59 = i8;
            }
            int i60 = i59 + 1;
            int iCharAt9 = str.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = 13;
                while (true) {
                    i7 = i60 + 1;
                    cCharAt = str.charAt(i60);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i61 |= (cCharAt & 8191) << i62;
                    i62 += 13;
                    i60 = i7;
                }
                iCharAt9 = i61 | (cCharAt << i62);
                i60 = i7;
            }
            i3 = iCharAt5 + iCharAt5 + iCharAt6;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt5];
            i36 = iCharAt5;
            i4 = iCharAt7;
            i5 = iCharAt8;
            i38 = i60;
            i6 = iCharAt9;
        }
        int[] iArr2 = iArr;
        Object[] objArr = iq4Var.c;
        Class<?> cls = iq4Var.a.getClass();
        int i63 = i6 + iCharAt2;
        int i64 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[i64];
        int i65 = i6;
        int i66 = i63;
        int i67 = 0;
        int i68 = 0;
        while (i38 < length) {
            int i69 = i38 + 1;
            int iCharAt10 = str.charAt(i38);
            if (iCharAt10 >= c) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i34 = i71 + 1;
                    cCharAt11 = str.charAt(i71);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i70 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i71 = i34;
                }
                iCharAt10 = i70 | (cCharAt11 << i72);
                i15 = i34;
            } else {
                i15 = i69;
            }
            int i73 = i15 + 1;
            int iCharAt11 = str.charAt(i15);
            if (iCharAt11 >= c) {
                int i74 = iCharAt11 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i33 = i75 + 1;
                    cCharAt10 = str.charAt(i75);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i74 |= (cCharAt10 & 8191) << i76;
                    i76 += 13;
                    i75 = i33;
                }
                iCharAt11 = i74 | (cCharAt10 << i76);
                i16 = i33;
            } else {
                i16 = i73;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr2[i67] = i68;
                i67++;
            }
            int i77 = iCharAt11 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i78 = length;
            int i79 = iCharAt11 & 2048;
            if (i77 >= 51) {
                int i80 = i16 + 1;
                int iCharAt12 = str.charAt(i16);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i81 = iCharAt12 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i32 = i82 + 1;
                        cCharAt9 = str.charAt(i82);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i81 |= (cCharAt9 & 8191) << i83;
                        i83 += 13;
                        i82 = i32;
                        c2 = 55296;
                    }
                    iCharAt12 = i81 | (cCharAt9 << i83);
                    i27 = i32;
                } else {
                    i27 = i80;
                }
                int i84 = i27;
                int i85 = i77 - 51;
                i17 = i36;
                if (i85 == 9 || i85 == 17) {
                    i28 = i3 + 1;
                    int i86 = i68 / 3;
                    objArr2[i86 + i86 + 1] = objArr[i3];
                } else {
                    if (i85 != 12) {
                        i29 = i79;
                    } else if (iq4Var.a() == 1 || i79 != 0) {
                        i28 = i3 + 1;
                        int i87 = i68 / 3;
                        objArr2[i87 + i87 + 1] = objArr[i3];
                    } else {
                        i29 = 0;
                    }
                    i30 = iCharAt12 + iCharAt12;
                    obj2 = objArr[i30];
                    int i88 = i29;
                    if (obj2 instanceof Field) {
                        fieldE2 = (Field) obj2;
                    } else {
                        fieldE2 = E(cls, (String) obj2);
                        objArr[i30] = fieldE2;
                        iArr2[i66] = i68;
                        i66++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                    i31 = i30 + 1;
                    obj3 = objArr[i31];
                    if (obj3 instanceof Field) {
                        fieldE3 = (Field) obj3;
                    } else {
                        fieldE3 = E(cls, (String) obj3);
                        objArr[i31] = fieldE3;
                    }
                    str = str;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE3);
                    i18 = i88;
                    i16 = i84;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i20 = 0;
                    iCharAt10 = iCharAt10;
                    i19 = i77;
                }
                i3 = i28;
                i29 = i79;
                i30 = iCharAt12 + iCharAt12;
                obj2 = objArr[i30];
                int i89 = i29;
                if (obj2 instanceof Field) {
                    fieldE2 = (Field) obj2;
                } else {
                    fieldE2 = E(cls, (String) obj2);
                    objArr[i30] = fieldE2;
                    iArr2[i66] = i68;
                    i66++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldE2);
                i31 = i30 + 1;
                obj3 = objArr[i31];
                if (obj3 instanceof Field) {
                    fieldE3 = (Field) obj3;
                } else {
                    fieldE3 = E(cls, (String) obj3);
                    objArr[i31] = fieldE3;
                }
                str = str;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE3);
                i18 = i89;
                i16 = i84;
                iObjectFieldOffset = iObjectFieldOffset4;
                i20 = 0;
                iCharAt10 = iCharAt10;
                i19 = i77;
            } else {
                i17 = i36;
                int i90 = i3 + 1;
                Field fieldE4 = E(cls, (String) objArr[i3]);
                if (i77 == 9 || i77 == 17) {
                    int i91 = i68 / 3;
                    objArr2[i91 + i91 + 1] = fieldE4.getType();
                } else {
                    if (i77 != 27) {
                        if (i77 == 49) {
                            i3 += 2;
                            i26 = 1;
                        } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                            iCharAt10 = iCharAt10;
                            if (iq4Var.a() == 1 || i79 != 0) {
                                i3 += 2;
                                int i92 = i68 / 3;
                                objArr2[i92 + i92 + 1] = objArr[i90];
                                i77 = i77;
                                i18 = i79;
                            } else {
                                i77 = i77;
                                i3 = i90;
                                i18 = 0;
                            }
                        } else if (i77 == 50) {
                            int i93 = i3 + 2;
                            i65++;
                            iArr2[i65] = i68;
                            int i94 = i68 / 3;
                            int i95 = i94 + i94;
                            objArr2[i95] = objArr[i90];
                            if (i79 != 0) {
                                i3 += 3;
                                objArr2[i95 + 1] = objArr[i93];
                                i18 = i79;
                            } else {
                                i3 = i93;
                                i18 = 0;
                            }
                            iCharAt10 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                        if ((iCharAt11 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            i19 = i77;
                            if (i19 <= 17) {
                                i21 = i16 + 1;
                                iCharAt3 = str.charAt(i16);
                                int i96 = i18;
                                if (iCharAt3 >= 55296) {
                                    i23 = iCharAt3 & 8191;
                                    i24 = 13;
                                    while (true) {
                                        i25 = i21 + 1;
                                        cCharAt8 = str.charAt(i21);
                                        if (cCharAt8 < 55296) {
                                            break;
                                        }
                                        i23 |= (cCharAt8 & 8191) << i24;
                                        i24 += 13;
                                        i21 = i25;
                                    }
                                    iCharAt3 = i23 | (cCharAt8 << i24);
                                    i21 = i25;
                                }
                                i22 = (iCharAt3 / 32) + i17 + i17;
                                obj = objArr[i22];
                                str = str;
                                if (obj instanceof Field) {
                                    fieldE = (Field) obj;
                                } else {
                                    fieldE = E(cls, (String) obj);
                                    objArr[i22] = fieldE;
                                }
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE);
                                i20 = iCharAt3 % 32;
                                i18 = i96;
                                i16 = i21;
                            }
                        } else {
                            i19 = i77;
                        }
                        i20 = 0;
                        iObjectFieldOffset2 = 1048575;
                    } else {
                        i26 = 1;
                        i3 += 2;
                    }
                    int i97 = i68 / 3;
                    objArr2[i97 + i97 + i26] = objArr[i90];
                    i77 = i77;
                    i18 = i79;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                    if ((iCharAt11 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i19 = i77;
                        if (i19 <= 17) {
                            i21 = i16 + 1;
                            iCharAt3 = str.charAt(i16);
                            int i98 = i18;
                            if (iCharAt3 >= 55296) {
                                i23 = iCharAt3 & 8191;
                                i24 = 13;
                                while (true) {
                                    i25 = i21 + 1;
                                    cCharAt8 = str.charAt(i21);
                                    if (cCharAt8 < 55296) {
                                        break;
                                        break;
                                    }
                                    i23 |= (cCharAt8 & 8191) << i24;
                                    i24 += 13;
                                    i21 = i25;
                                }
                                iCharAt3 = i23 | (cCharAt8 << i24);
                                i21 = i25;
                            }
                            i22 = (iCharAt3 / 32) + i17 + i17;
                            obj = objArr[i22];
                            str = str;
                            if (obj instanceof Field) {
                                fieldE = (Field) obj;
                            } else {
                                fieldE = E(cls, (String) obj);
                                objArr[i22] = fieldE;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE);
                            i20 = iCharAt3 % 32;
                            i18 = i98;
                            i16 = i21;
                        }
                    } else {
                        i19 = i77;
                    }
                    i20 = 0;
                    iObjectFieldOffset2 = 1048575;
                }
                i77 = i77;
                i18 = i79;
                i3 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                if ((iCharAt11 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    i19 = i77;
                    if (i19 <= 17) {
                        i21 = i16 + 1;
                        iCharAt3 = str.charAt(i16);
                        int i99 = i18;
                        if (iCharAt3 >= 55296) {
                            i23 = iCharAt3 & 8191;
                            i24 = 13;
                            while (true) {
                                i25 = i21 + 1;
                                cCharAt8 = str.charAt(i21);
                                if (cCharAt8 < 55296) {
                                    break;
                                    break;
                                }
                                i23 |= (cCharAt8 & 8191) << i24;
                                i24 += 13;
                                i21 = i25;
                            }
                            iCharAt3 = i23 | (cCharAt8 << i24);
                            i21 = i25;
                        }
                        i22 = (iCharAt3 / 32) + i17 + i17;
                        obj = objArr[i22];
                        str = str;
                        if (obj instanceof Field) {
                            fieldE = (Field) obj;
                        } else {
                            fieldE = E(cls, (String) obj);
                            objArr[i22] = fieldE;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE);
                        i20 = iCharAt3 % 32;
                        i18 = i99;
                        i16 = i21;
                    }
                } else {
                    i19 = i77;
                }
                i20 = 0;
                iObjectFieldOffset2 = 1048575;
            }
            int i100 = i68 + 1;
            iArr3[i68] = iCharAt10;
            int i101 = i68 + 2;
            Unsafe unsafe2 = unsafe;
            iArr3[i100] = ((iCharAt11 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 536870912 : 0) | ((iCharAt11 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? 268435456 : 0) | (i18 != 0 ? Integer.MIN_VALUE : 0) | (i19 << 20) | iObjectFieldOffset;
            i68 += 3;
            iArr3[i101] = (i20 << 20) | iObjectFieldOffset2;
            i38 = i16;
            length = i78;
            unsafe = unsafe2;
            str = str;
            i36 = i17;
            c = 55296;
        }
        return new dq4(iArr3, objArr2, i4, i5, iq4Var.a, iArr2, i6, i63, zf3Var, sb3Var);
    }

    public static int v(Object obj, long j2) {
        return ((Integer) rq4.d(obj, j2)).intValue();
    }

    public static int x(int i2) {
        return (i2 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long z(Object obj, long j2) {
        return ((Long) rq4.d(obj, j2)).longValue();
    }

    public final bp4 A(int i2) {
        int i3 = i2 / 3;
        return (bp4) this.b[i3 + i3 + 1];
    }

    public final jq4 B(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.b;
        jq4 jq4Var = (jq4) objArr[i4];
        if (jq4Var != null) {
            return jq4Var;
        }
        jq4 jq4VarA = fq4.b.a((Class) objArr[i4 + 1]);
        objArr[i4] = jq4VarA;
        return jq4VarA;
    }

    public final Object C(int i2, Object obj) {
        jq4 jq4VarB = B(i2);
        int iY = y(i2) & 1048575;
        if (!p(i2, obj)) {
            return jq4VarB.f();
        }
        Object object = j.getObject(obj, iY);
        if (r(object)) {
            return object;
        }
        sp4 sp4VarF = jq4VarB.f();
        if (object != null) {
            jq4VarB.d(sp4VarF, object);
        }
        return sp4VarF;
    }

    public final Object D(int i2, int i3, Object obj) {
        jq4 jq4VarB = B(i3);
        if (!s(i2, i3, obj)) {
            return jq4VarB.f();
        }
        Object object = j.getObject(obj, y(i3) & 1048575);
        if (r(object)) {
            return object;
        }
        sp4 sp4VarF = jq4VarB.f();
        if (object != null) {
            jq4VarB.d(sp4VarF, object);
        }
        return sp4VarF;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // defpackage.jq4
    public final void a(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof sp4) {
            sp4 sp4Var = (sp4) obj;
            sp4Var.g();
            sp4Var.zza = 0;
            sp4Var.e();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                mq4 mq4Var = ((sp4) obj).zzc;
                if (mq4Var.e) {
                    mq4Var.e = false;
                    return;
                }
                return;
            }
            int iY = y(i2);
            int i3 = 1048575 & iY;
            int iX = x(iY);
            long j2 = i3;
            if (iX != 9) {
                if (iX != 60 && iX != 68) {
                    switch (iX) {
                        case 17:
                            if (p(i2, obj)) {
                                B(i2).a(j.getObject(obj, j2));
                            }
                            break;
                        case 18:
                        case 19:
                        case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            fp4 fp4Var = (fp4) ((vp4) rq4.d(obj, j2));
                            if (fp4Var.c) {
                                fp4Var.c = false;
                            }
                            break;
                        case 50:
                            Unsafe unsafe = j;
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((bq4) object).c = false;
                                unsafe.putObject(obj, j2, object);
                            }
                            break;
                    }
                } else if (s(iArr[i2], i2, obj)) {
                    B(i2).a(j.getObject(obj, j2));
                }
            } else if (p(i2, obj)) {
                B(i2).a(j.getObject(obj, j2));
            }
            i2 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.jq4
    public final boolean b(sp4 sp4Var, sp4 sp4Var2) {
        boolean zE;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int iY = y(i2);
                int iX = x(iY);
                if (iX <= 50 || iX >= 69) {
                    long j2 = iY & 1048575;
                    switch (iX) {
                        case 0:
                            if (o(sp4Var, sp4Var2, i2)) {
                                qq4 qq4Var = rq4.c;
                                if (Double.doubleToLongBits(qq4Var.e(sp4Var, j2)) != Double.doubleToLongBits(qq4Var.e(sp4Var2, j2))) {
                                }
                            }
                            break;
                        case 1:
                            if (o(sp4Var, sp4Var2, i2)) {
                                qq4 qq4Var2 = rq4.c;
                                if (Float.floatToIntBits(qq4Var2.f(sp4Var, j2)) != Float.floatToIntBits(qq4Var2.f(sp4Var2, j2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.b(sp4Var, j2) != rq4.b(sp4Var2, j2)) {
                            }
                            break;
                        case 3:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.b(sp4Var, j2) != rq4.b(sp4Var2, j2)) {
                            }
                            break;
                        case 4:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.a(sp4Var, j2) != rq4.a(sp4Var2, j2)) {
                            }
                            break;
                        case 5:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.b(sp4Var, j2) != rq4.b(sp4Var2, j2)) {
                            }
                            break;
                        case 6:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.a(sp4Var, j2) != rq4.a(sp4Var2, j2)) {
                            }
                            break;
                        case 7:
                            if (o(sp4Var, sp4Var2, i2)) {
                                qq4 qq4Var3 = rq4.c;
                                if (qq4Var3.j(sp4Var, j2) != qq4Var3.j(sp4Var2, j2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!o(sp4Var, sp4Var2, i2) || !kq4.e(rq4.d(sp4Var, j2), rq4.d(sp4Var2, j2))) {
                            }
                            break;
                        case 9:
                            if (!o(sp4Var, sp4Var2, i2) || !kq4.e(rq4.d(sp4Var, j2), rq4.d(sp4Var2, j2))) {
                            }
                            break;
                        case 10:
                            if (!o(sp4Var, sp4Var2, i2) || !kq4.e(rq4.d(sp4Var, j2), rq4.d(sp4Var2, j2))) {
                            }
                            break;
                        case 11:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.a(sp4Var, j2) != rq4.a(sp4Var2, j2)) {
                            }
                            break;
                        case 12:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.a(sp4Var, j2) != rq4.a(sp4Var2, j2)) {
                            }
                            break;
                        case 13:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.a(sp4Var, j2) != rq4.a(sp4Var2, j2)) {
                            }
                            break;
                        case 14:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.b(sp4Var, j2) != rq4.b(sp4Var2, j2)) {
                            }
                            break;
                        case 15:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.a(sp4Var, j2) != rq4.a(sp4Var2, j2)) {
                            }
                            break;
                        case 16:
                            if (!o(sp4Var, sp4Var2, i2) || rq4.b(sp4Var, j2) != rq4.b(sp4Var2, j2)) {
                            }
                            break;
                        case 17:
                            if (!o(sp4Var, sp4Var2, i2) || !kq4.e(rq4.d(sp4Var, j2), rq4.d(sp4Var2, j2))) {
                            }
                            break;
                        case 18:
                        case 19:
                        case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            zE = kq4.e(rq4.d(sp4Var, j2), rq4.d(sp4Var2, j2));
                            if (zE) {
                            }
                            break;
                        case 50:
                            zE = kq4.e(rq4.d(sp4Var, j2), rq4.d(sp4Var2, j2));
                            if (zE) {
                            }
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                            long j3 = iArr[i2 + 2] & 1048575;
                            if (rq4.a(sp4Var, j3) == rq4.a(sp4Var2, j3) && kq4.e(rq4.d(sp4Var, j2), rq4.d(sp4Var2, j2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i2 += 3;
            } else {
                int i3 = this.h;
                while (true) {
                    int[] iArr2 = this.f;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j4 = iArr[i4 + 2] & 1048575;
                        if (rq4.a(sp4Var, j4) != rq4.a(sp4Var2, j4)) {
                            return false;
                        }
                        if (!s(0, i4, sp4Var)) {
                            long jY = y(i4) & 1048575;
                            if (!kq4.e(rq4.d(sp4Var, jY), rq4.d(sp4Var2, jY))) {
                            }
                        }
                        i3++;
                    } else if (sp4Var.zzc.equals(sp4Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jq4
    public final void c(Object obj, sk3 sk3Var) throws ee0 {
        int i2;
        bk bkVar = (bk) sk3Var.d;
        Unsafe unsafe = j;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                ((sp4) obj).zzc.d(sk3Var);
                return;
            }
            int iY = y(i5);
            int iX = x(iY);
            int i7 = iArr[i5];
            if (iX <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i2 = 0;
            }
            long j2 = iY & i3;
            switch (iX) {
                case 0:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.w(Double.doubleToRawLongBits(rq4.c.e(obj, j2)), i7);
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.u(i7, Float.floatToRawIntBits(rq4.c.f(obj, j2)));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.D(unsafe.getLong(obj, j2), i7);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.D(unsafe.getLong(obj, j2), i7);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.y(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.w(unsafe.getLong(obj, j2), i7);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.u(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (q(obj, i5, i4, i6, i2)) {
                        boolean zJ = rq4.c.j(obj, j2);
                        bkVar.C(i7 << 3);
                        bkVar.s(zJ ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (q(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            String str = (String) object;
                            bkVar.C((i7 << 3) | 2);
                            byte[] bArr = (byte[]) bkVar.e;
                            int i10 = bkVar.c;
                            try {
                                int iF = bk.F(str.length() * 3);
                                int iF2 = bk.F(str.length());
                                if (iF2 == iF) {
                                    int i11 = i10 + iF2;
                                    bkVar.c = i11;
                                    int iA = yq4.a(str, bArr, i11, bArr.length - i11);
                                    bkVar.c = i10;
                                    bkVar.C((iA - i10) - iF2);
                                    bkVar.c = iA;
                                } else {
                                    int i12 = yq4.a;
                                    bkVar.C(vd4.c(str));
                                    int i13 = bkVar.c;
                                    bkVar.c = yq4.a(str, bArr, i13, bArr.length - i13);
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new ee0("CodedOutputStream was writing to a flat byte array and ran out of space.", (Throwable) e);
                            }
                        } else {
                            jp4 jp4Var = (jp4) object;
                            bkVar.C((i7 << 3) | 2);
                            bkVar.C(jp4Var.g());
                            jp4Var.l(bkVar);
                        }
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (q(obj, i5, i4, i6, i2)) {
                        sk3Var.p(i7, unsafe.getObject(obj, j2), B(i5));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (q(obj, i5, i4, i6, i2)) {
                        jp4 jp4Var2 = (jp4) unsafe.getObject(obj, j2);
                        bkVar.C((i7 << 3) | 2);
                        bkVar.C(jp4Var2.g());
                        jp4Var2.l(bkVar);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.B(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.y(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.u(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (q(obj, i5, i4, i6, i2)) {
                        bkVar.w(unsafe.getLong(obj, j2), i7);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (q(obj, i5, i4, i6, i2)) {
                        int i14 = unsafe.getInt(obj, j2);
                        bkVar.B(i7, (i14 >> 31) ^ (i14 + i14));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (q(obj, i5, i4, i6, i2)) {
                        long j3 = unsafe.getLong(obj, j2);
                        bkVar.D((j3 >> 63) ^ (j3 + j3), i7);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (q(obj, i5, i4, i6, i2)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        bkVar.A(i7, 3);
                        B(i5).c((ep4) object2, sk3Var);
                        bkVar.A(i7, 4);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    kq4.q(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    kq4.u(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                    kq4.w(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    kq4.d(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    kq4.v(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    kq4.t(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    kq4.s(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    kq4.p(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    int i15 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j2);
                    zf3 zf3Var = kq4.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            String str2 = (String) list.get(i16);
                            bkVar.C((i15 << 3) | 2);
                            byte[] bArr2 = (byte[]) bkVar.e;
                            int i17 = bkVar.c;
                            try {
                                int iF3 = bk.F(str2.length() * 3);
                                int iF4 = bk.F(str2.length());
                                if (iF4 == iF3) {
                                    int i18 = i17 + iF4;
                                    bkVar.c = i18;
                                    int iA2 = yq4.a(str2, bArr2, i18, bArr2.length - i18);
                                    bkVar.c = i17;
                                    bkVar.C((iA2 - i17) - iF4);
                                    bkVar.c = iA2;
                                } else {
                                    int i19 = yq4.a;
                                    bkVar.C(vd4.c(str2));
                                    int i20 = bkVar.c;
                                    bkVar.c = yq4.a(str2, bArr2, i20, bArr2.length - i20);
                                }
                            } catch (IndexOutOfBoundsException e2) {
                                throw new ee0("CodedOutputStream was writing to a flat byte array and ran out of space.", (Throwable) e2);
                            }
                        }
                    }
                    break;
                case 27:
                    int i21 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    jq4 jq4VarB = B(i5);
                    zf3 zf3Var2 = kq4.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            sk3Var.p(i21, list2.get(i22), jq4VarB);
                        }
                    }
                    break;
                case 28:
                    int i23 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    zf3 zf3Var3 = kq4.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            jp4 jp4Var3 = (jp4) list3.get(i24);
                            bkVar.C((i23 << 3) | 2);
                            bkVar.C(jp4Var3.g());
                            jp4Var3.l(bkVar);
                        }
                    }
                    break;
                case 29:
                    kq4.c(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    kq4.r(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    kq4.x(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    kq4.y(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    kq4.a(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    kq4.b(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    kq4.q(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 36:
                    kq4.u(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 37:
                    kq4.w(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 38:
                    kq4.d(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 39:
                    kq4.v(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 40:
                    kq4.t(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 41:
                    kq4.s(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 42:
                    kq4.p(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 43:
                    kq4.c(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 44:
                    kq4.r(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 45:
                    kq4.x(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 46:
                    kq4.y(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 47:
                    kq4.a(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 48:
                    kq4.b(iArr[i5], (List) unsafe.getObject(obj, j2), sk3Var, true);
                    break;
                case 49:
                    int i25 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    jq4 jq4VarB2 = B(i5);
                    zf3 zf3Var4 = kq4.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            ep4 ep4Var = (ep4) list4.get(i26);
                            bkVar.A(i25, 3);
                            jq4VarB2.c(ep4Var, sk3Var);
                            bkVar.A(i25, 4);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        int i27 = i5 / 3;
                        this.b[i27 + i27].getClass();
                        m51.t();
                        return;
                    }
                    break;
                case 51:
                    if (s(i7, i5, obj)) {
                        bkVar.w(Double.doubleToRawLongBits(((Double) rq4.d(obj, j2)).doubleValue()), i7);
                    }
                    break;
                case 52:
                    if (s(i7, i5, obj)) {
                        bkVar.u(i7, Float.floatToRawIntBits(((Float) rq4.d(obj, j2)).floatValue()));
                    }
                    break;
                case 53:
                    if (s(i7, i5, obj)) {
                        bkVar.D(z(obj, j2), i7);
                    }
                    break;
                case 54:
                    if (s(i7, i5, obj)) {
                        bkVar.D(z(obj, j2), i7);
                    }
                    break;
                case 55:
                    if (s(i7, i5, obj)) {
                        bkVar.y(i7, v(obj, j2));
                    }
                    break;
                case 56:
                    if (s(i7, i5, obj)) {
                        bkVar.w(z(obj, j2), i7);
                    }
                    break;
                case 57:
                    if (s(i7, i5, obj)) {
                        bkVar.u(i7, v(obj, j2));
                    }
                    break;
                case 58:
                    if (s(i7, i5, obj)) {
                        boolean zBooleanValue = ((Boolean) rq4.d(obj, j2)).booleanValue();
                        bkVar.C(i7 << 3);
                        bkVar.s(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (s(i7, i5, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (!(object3 instanceof String)) {
                            jp4 jp4Var4 = (jp4) object3;
                            bkVar.C((i7 << 3) | 2);
                            bkVar.C(jp4Var4.g());
                            jp4Var4.l(bkVar);
                        } else {
                            String str3 = (String) object3;
                            bkVar.C((i7 << 3) | 2);
                            byte[] bArr3 = (byte[]) bkVar.e;
                            int i28 = bkVar.c;
                            try {
                                int iF5 = bk.F(str3.length() * 3);
                                int iF6 = bk.F(str3.length());
                                if (iF6 == iF5) {
                                    int i29 = i28 + iF6;
                                    bkVar.c = i29;
                                    int iA3 = yq4.a(str3, bArr3, i29, bArr3.length - i29);
                                    bkVar.c = i28;
                                    bkVar.C((iA3 - i28) - iF6);
                                    bkVar.c = iA3;
                                } else {
                                    int i30 = yq4.a;
                                    bkVar.C(vd4.c(str3));
                                    int i31 = bkVar.c;
                                    bkVar.c = yq4.a(str3, bArr3, i31, bArr3.length - i31);
                                }
                            } catch (IndexOutOfBoundsException e3) {
                                throw new ee0("CodedOutputStream was writing to a flat byte array and ran out of space.", (Throwable) e3);
                            }
                        }
                    }
                    break;
                case 60:
                    if (s(i7, i5, obj)) {
                        sk3Var.p(i7, unsafe.getObject(obj, j2), B(i5));
                    }
                    break;
                case 61:
                    if (s(i7, i5, obj)) {
                        jp4 jp4Var5 = (jp4) unsafe.getObject(obj, j2);
                        bkVar.C((i7 << 3) | 2);
                        bkVar.C(jp4Var5.g());
                        jp4Var5.l(bkVar);
                    }
                    break;
                case 62:
                    if (s(i7, i5, obj)) {
                        bkVar.B(i7, v(obj, j2));
                    }
                    break;
                case 63:
                    if (s(i7, i5, obj)) {
                        bkVar.y(i7, v(obj, j2));
                    }
                    break;
                case 64:
                    if (s(i7, i5, obj)) {
                        bkVar.u(i7, v(obj, j2));
                    }
                    break;
                case 65:
                    if (s(i7, i5, obj)) {
                        bkVar.w(z(obj, j2), i7);
                    }
                    break;
                case 66:
                    if (s(i7, i5, obj)) {
                        int iV = v(obj, j2);
                        bkVar.B(i7, (iV >> 31) ^ (iV + iV));
                    }
                    break;
                case 67:
                    if (s(i7, i5, obj)) {
                        long jZ = z(obj, j2);
                        bkVar.D((jZ >> 63) ^ (jZ + jZ), i7);
                    }
                    break;
                case 68:
                    if (s(i7, i5, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        bkVar.A(i7, 3);
                        B(i5).c((ep4) object4, sk3Var);
                        bkVar.A(i7, 4);
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.jq4
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            u41.k("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                kq4.o(obj, obj2);
                return;
            }
            int iY = y(i2);
            int i3 = iY & 1048575;
            int iX = x(iY);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (iX) {
                case 0:
                    if (!p(i2, obj2)) {
                        obj3 = obj;
                    } else {
                        qq4 qq4Var = rq4.c;
                        obj3 = obj;
                        qq4Var.h(obj3, j2, qq4Var.e(obj2, j2));
                        l(i2, obj3);
                    }
                    break;
                case 1:
                    if (p(i2, obj2)) {
                        qq4 qq4Var2 = rq4.c;
                        qq4Var2.i(obj, j2, qq4Var2.f(obj2, j2));
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i2, obj2)) {
                        rq4.i(obj, j2, rq4.b(obj2, j2));
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i2, obj2)) {
                        rq4.i(obj, j2, rq4.b(obj2, j2));
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i2, obj2)) {
                        rq4.h(rq4.a(obj2, j2), j2, obj);
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i2, obj2)) {
                        rq4.i(obj, j2, rq4.b(obj2, j2));
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i2, obj2)) {
                        rq4.h(rq4.a(obj2, j2), j2, obj);
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i2, obj2)) {
                        qq4 qq4Var3 = rq4.c;
                        qq4Var3.g(obj, j2, qq4Var3.j(obj2, j2));
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i2, obj2)) {
                        rq4.j(j2, obj, rq4.d(obj2, j2));
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    j(obj, i2, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i2, obj2)) {
                        rq4.j(j2, obj, rq4.d(obj2, j2));
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i2, obj2)) {
                        rq4.h(rq4.a(obj2, j2), j2, obj);
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i2, obj2)) {
                        rq4.h(rq4.a(obj2, j2), j2, obj);
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i2, obj2)) {
                        rq4.h(rq4.a(obj2, j2), j2, obj);
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i2, obj2)) {
                        rq4.i(obj, j2, rq4.b(obj2, j2));
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i2, obj2)) {
                        rq4.h(rq4.a(obj2, j2), j2, obj);
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i2, obj2)) {
                        rq4.i(obj, j2, rq4.b(obj2, j2));
                        l(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    j(obj, i2, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    vp4 vp4VarA = (vp4) rq4.d(obj, j2);
                    vp4 vp4Var = (vp4) rq4.d(obj2, j2);
                    int size = vp4VarA.size();
                    int size2 = vp4Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((fp4) vp4VarA).c) {
                            vp4VarA = vp4VarA.a(size2 + size);
                        }
                        vp4VarA.addAll(vp4Var);
                    }
                    if (size > 0) {
                        vp4Var = vp4VarA;
                    }
                    rq4.j(j2, obj, vp4Var);
                    obj3 = obj;
                    break;
                case 50:
                    zf3 zf3Var = kq4.a;
                    rq4.j(j2, obj, qj4.a(rq4.d(obj, j2), rq4.d(obj2, j2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (s(i4, i2, obj2)) {
                        rq4.j(j2, obj, rq4.d(obj2, j2));
                        rq4.h(i4, iArr[i2 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    k(obj, i2, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i4, i2, obj2)) {
                        rq4.j(j2, obj, rq4.d(obj2, j2));
                        rq4.h(i4, iArr[i2 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    k(obj, i2, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i2 += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.jq4
    public final void e(Object obj, byte[] bArr, int i2, int i3, hp4 hp4Var) {
        t(obj, bArr, i2, i3, 0, hp4Var);
    }

    @Override // defpackage.jq4
    public final sp4 f() {
        return ((sp4) this.e).n();
    }

    @Override // defpackage.jq4
    public final boolean g(Object obj) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.g) {
            int i7 = this.f[i4];
            int iY = this.y(i7);
            int[] iArr = this.a;
            int i8 = iArr[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i6) {
                if (i9 != 1048575) {
                    i5 = j.getInt(obj, i9);
                }
                i3 = i5;
                i2 = i9;
            } else {
                i2 = i6;
                i3 = i5;
            }
            dq4 dq4Var = this;
            Object obj2 = obj;
            if ((268435456 & iY) == 0 || dq4Var.q(obj2, i7, i2, i3, i10)) {
                int iX = x(iY);
                if (iX != 9 && iX != 17) {
                    if (iX != 27) {
                        if (iX == 60 || iX == 68) {
                            if (!dq4Var.s(iArr[i7], i7, obj2) || dq4Var.B(i7).g(rq4.d(obj2, iY & 1048575))) {
                            }
                        } else if (iX != 49) {
                            if (iX == 50 && !((bq4) rq4.d(obj2, iY & 1048575)).isEmpty()) {
                                int i11 = i7 / 3;
                                dq4Var.b[i11 + i11].getClass();
                                m51.t();
                                return false;
                            }
                        }
                        i4++;
                        this = dq4Var;
                        obj = obj2;
                        i6 = i2;
                        i5 = i3;
                    }
                    List list = (List) rq4.d(obj2, iY & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        jq4 jq4VarB = dq4Var.B(i7);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (jq4VarB.g(list.get(i12))) {
                            }
                        }
                    }
                    i4++;
                    this = dq4Var;
                    obj = obj2;
                    i6 = i2;
                    i5 = i3;
                } else if (!dq4Var.q(obj2, i7, i2, i3, i10) || dq4Var.B(i7).g(rq4.d(obj2, iY & 1048575))) {
                    i4++;
                    this = dq4Var;
                    obj = obj2;
                    i6 = i2;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.jq4
    public final int h(sp4 sp4Var) {
        int i2;
        long jDoubleToLongBits;
        int i3;
        int iFloatToIntBits;
        int i4;
        int i5;
        int iHashCode = 0;
        for (int i6 = 0; i6 < this.a.length; i6 += 3) {
            int iY = y(i6);
            int iX = x(iY);
            if (iX <= 50 || iX >= 69) {
                long j2 = iY & 1048575;
                int iHashCode2 = 37;
                switch (iX) {
                    case 0:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(rq4.c.e(sp4Var, j2));
                        byte[] bArr = wp4.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 1:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(rq4.c.f(sp4Var, j2));
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 2:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = rq4.b(sp4Var, j2);
                        byte[] bArr2 = wp4.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 3:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = rq4.b(sp4Var, j2);
                        byte[] bArr3 = wp4.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 4:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = rq4.a(sp4Var, j2);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 5:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = rq4.b(sp4Var, j2);
                        byte[] bArr4 = wp4.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 6:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = rq4.a(sp4Var, j2);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 7:
                        i2 = iHashCode * 53;
                        boolean zJ = rq4.c.j(sp4Var, j2);
                        byte[] bArr5 = wp4.a;
                        i4 = zJ ? 1231 : 1237;
                        iHashCode = i2 + i4;
                        break;
                    case 8:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = ((String) rq4.d(sp4Var, j2)).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 9:
                        i5 = iHashCode * 53;
                        Object objD = rq4.d(sp4Var, j2);
                        if (objD != null) {
                            iHashCode2 = objD.hashCode();
                        }
                        iHashCode = i5 + iHashCode2;
                        break;
                    case 10:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = rq4.d(sp4Var, j2).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 11:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = rq4.a(sp4Var, j2);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 12:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = rq4.a(sp4Var, j2);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 13:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = rq4.a(sp4Var, j2);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 14:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = rq4.b(sp4Var, j2);
                        byte[] bArr6 = wp4.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 15:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = rq4.a(sp4Var, j2);
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 16:
                        i2 = iHashCode * 53;
                        jDoubleToLongBits = rq4.b(sp4Var, j2);
                        byte[] bArr7 = wp4.a;
                        i4 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i2 + i4;
                        break;
                    case 17:
                        i5 = iHashCode * 53;
                        Object objD2 = rq4.d(sp4Var, j2);
                        if (objD2 != null) {
                            iHashCode2 = objD2.hashCode();
                        }
                        iHashCode = i5 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = rq4.d(sp4Var, j2).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                    case 50:
                        i3 = iHashCode * 53;
                        iFloatToIntBits = rq4.d(sp4Var, j2).hashCode();
                        iHashCode = i3 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i7 = this.h;
        while (true) {
            int[] iArr = this.f;
            if (i7 >= iArr.length) {
                return sp4Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i8 = iArr[i7];
            if (!s(0, i8, sp4Var)) {
                iHashCode = rq4.d(sp4Var, y(i8) & 1048575).hashCode() + (iHashCode * 53);
            }
            i7++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0364  */
    /* JADX WARN: Code duplicated, block: B:191:0x0488  */
    /* JADX WARN: Code duplicated, block: B:223:0x0579  */
    /* JADX WARN: Code duplicated, block: B:226:0x0587  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    @Override // defpackage.jq4
    public final int i(ep4 ep4Var) {
        int i2;
        int iF;
        int iG;
        int iF2;
        int iC;
        int iF3;
        int iC2;
        int i3;
        int iF4;
        int iH;
        int i4;
        int iC3;
        int iF5;
        int size;
        int iN;
        int iF6;
        int iF7;
        int iC4;
        int iF8;
        int size2;
        int iF9;
        int iC5;
        int iF10;
        int iG2;
        int iV;
        int iF11;
        Unsafe unsafe = j;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iW = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                return ((sp4) ep4Var).zzc.a() + iW;
            }
            int iY = y(i7);
            int iX = x(iY);
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i5;
            if (iX <= 17) {
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(ep4Var, i11);
                    i6 = i11;
                }
                i2 = 1 << (i10 >>> 20);
            } else {
                i2 = 0;
            }
            int i12 = iY & i5;
            if (iX >= qp4.d.c) {
                qp4.h.getClass();
            }
            long j2 = i12;
            switch (iX) {
                case 0:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        iW = ud2.w(i9 << 3, 8, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        iW = ud2.w(i9 << 3, 4, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        long j3 = unsafe.getLong(ep4Var, j2);
                        iF = bk.F(i9 << 3);
                        iG = bk.G(j3);
                        iH = iG + iF;
                        iW += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        long j4 = unsafe.getLong(ep4Var, j2);
                        iF = bk.F(i9 << 3);
                        iG = bk.G(j4);
                        iH = iG + iF;
                        iW += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        long j5 = unsafe.getInt(ep4Var, j2);
                        iF = bk.F(i9 << 3);
                        iG = bk.G(j5);
                        iH = iG + iF;
                        iW += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        iW = ud2.w(i9 << 3, 8, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        iW = ud2.w(i9 << 3, 4, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        iW = ud2.w(i9 << 3, 1, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(ep4Var, j2);
                        if (object instanceof jp4) {
                            iF2 = bk.F(i13);
                            iC = ((jp4) object).g();
                        } else {
                            iF2 = bk.F(i13);
                            int i14 = yq4.a;
                            iC = vd4.c((String) object);
                        }
                        iW = ud2.x(iC, iC, iF2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        Object object2 = unsafe.getObject(ep4Var, j2);
                        jq4 jq4VarB = B(i7);
                        zf3 zf3Var = kq4.a;
                        iF3 = bk.F(i9 << 3);
                        iC2 = ((ep4) object2).c(jq4VarB);
                        iW = ud2.x(iC2, iC2, iF3, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 10:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        jp4 jp4Var = (jp4) unsafe.getObject(ep4Var, j2);
                        iF2 = bk.F(i9 << 3);
                        iC = jp4Var.g();
                        iW = ud2.x(iC, iC, iF2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 11:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        i3 = unsafe.getInt(ep4Var, j2);
                        iF4 = bk.F(i9 << 3);
                        iW = ud2.w(i3, iF4, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 12:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        long j6 = unsafe.getInt(ep4Var, j2);
                        iF = bk.F(i9 << 3);
                        iG = bk.G(j6);
                        iH = iG + iF;
                        iW += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        iW = ud2.w(i9 << 3, 4, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        iW = ud2.w(i9 << 3, 8, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        int i15 = unsafe.getInt(ep4Var, j2);
                        iF4 = bk.F(i9 << 3);
                        i3 = (i15 >> 31) ^ (i15 + i15);
                        iW = ud2.w(i3, iF4, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 16:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        long j7 = unsafe.getLong(ep4Var, j2);
                        iF = bk.F(i9 << 3);
                        iG = bk.G((j7 >> 63) ^ (j7 + j7));
                        iH = iG + iF;
                        iW += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (q(ep4Var, i7, i6, i8, i2)) {
                        ep4 ep4Var2 = (ep4) unsafe.getObject(ep4Var, j2);
                        jq4 jq4VarB2 = B(i7);
                        zf3 zf3Var2 = kq4.a;
                        int iF12 = bk.F(i9 << 3);
                        i4 = iF12 + iF12;
                        iC3 = ep4Var2.c(jq4VarB2);
                        iH = iC3 + i4;
                        iW += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    iH = kq4.h(i9, (List) unsafe.getObject(ep4Var, j2));
                    iW += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 19:
                    iH = kq4.g(i9, (List) unsafe.getObject(ep4Var, j2));
                    iW += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                    List list = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var3 = kq4.a;
                    if (list.size() == 0) {
                        iF5 = 0;
                    } else {
                        iF5 = (bk.F(i9 << 3) * list.size()) + kq4.j(list);
                    }
                    iW += iF5;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var4 = kq4.a;
                    size = list2.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iN = kq4.n(list2);
                        iF6 = bk.F(i9 << 3);
                        iF7 = (iF6 * size) + iN;
                    }
                    iW += iF7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var5 = kq4.a;
                    size = list3.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iN = kq4.i(list3);
                        iF6 = bk.F(i9 << 3);
                        iF7 = (iF6 * size) + iN;
                    }
                    iW += iF7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    iH = kq4.h(i9, (List) unsafe.getObject(ep4Var, j2));
                    iW += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    iH = kq4.g(i9, (List) unsafe.getObject(ep4Var, j2));
                    iW += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var6 = kq4.a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iF5 = 0;
                    } else {
                        iF5 = (bk.F(i9 << 3) + 1) * size3;
                    }
                    iW += iF5;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var7 = kq4.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iF7 = 0;
                    } else {
                        iF7 = bk.F(i9 << 3) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof jp4) {
                                iC4 = ((jp4) obj).g();
                            } else {
                                int i17 = yq4.a;
                                iC4 = vd4.c((String) obj);
                            }
                            iF7 = ud2.w(iC4, iC4, iF7);
                        }
                    }
                    iW += iF7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(ep4Var, j2);
                    jq4 jq4VarB3 = B(i7);
                    zf3 zf3Var8 = kq4.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iF8 = 0;
                    } else {
                        iF8 = bk.F(i9 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int iC6 = ((ep4) list6.get(i18)).c(jq4VarB3);
                            iF8 = ud2.w(iC6, iC6, iF8);
                        }
                    }
                    iW += iF8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var9 = kq4.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iF7 = 0;
                    } else {
                        iF7 = bk.F(i9 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int iG3 = ((jp4) list7.get(i19)).g();
                            iF7 = ud2.w(iG3, iG3, iF7);
                        }
                    }
                    iW += iF7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var10 = kq4.a;
                    size = list8.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iN = kq4.m(list8);
                        iF6 = bk.F(i9 << 3);
                        iF7 = (iF6 * size) + iN;
                    }
                    iW += iF7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var11 = kq4.a;
                    size = list9.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iN = kq4.f(list9);
                        iF6 = bk.F(i9 << 3);
                        iF7 = (iF6 * size) + iN;
                    }
                    iW += iF7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    iH = kq4.g(i9, (List) unsafe.getObject(ep4Var, j2));
                    iW += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    iH = kq4.h(i9, (List) unsafe.getObject(ep4Var, j2));
                    iW += iH;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var12 = kq4.a;
                    size = list10.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iN = kq4.k(list10);
                        iF6 = bk.F(i9 << 3);
                        iF7 = (iF6 * size) + iN;
                    }
                    iW += iF7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var13 = kq4.a;
                    size = list11.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iN = kq4.l(list11);
                        iF6 = bk.F(i9 << 3);
                        iF7 = (iF6 * size) + iN;
                    }
                    iW += iF7;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var14 = kq4.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var15 = kq4.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    size2 = kq4.j((List) unsafe.getObject(ep4Var, j2));
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    size2 = kq4.n((List) unsafe.getObject(ep4Var, j2));
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    size2 = kq4.i((List) unsafe.getObject(ep4Var, j2));
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var16 = kq4.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var17 = kq4.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var18 = kq4.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    size2 = kq4.m((List) unsafe.getObject(ep4Var, j2));
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    size2 = kq4.f((List) unsafe.getObject(ep4Var, j2));
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var19 = kq4.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(ep4Var, j2);
                    zf3 zf3Var20 = kq4.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    size2 = kq4.k((List) unsafe.getObject(ep4Var, j2));
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 48:
                    size2 = kq4.l((List) unsafe.getObject(ep4Var, j2));
                    if (size2 > 0) {
                        iF9 = bk.F(i9 << 3);
                        iW = ud2.x(size2, iF9, size2, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(ep4Var, j2);
                    jq4 jq4VarB4 = B(i7);
                    zf3 zf3Var21 = kq4.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iC5 = 0;
                    } else {
                        iC5 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            ep4 ep4Var3 = (ep4) list19.get(i20);
                            int iF13 = bk.F(i9 << 3);
                            iC5 += ep4Var3.c(jq4VarB4) + iF13 + iF13;
                        }
                    }
                    iW += iC5;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    int i21 = i7 / 3;
                    bq4 bq4Var = (bq4) unsafe.getObject(ep4Var, j2);
                    if (this.b[i21 + i21] != null) {
                        m51.t();
                        return 0;
                    }
                    if (bq4Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = bq4Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (s(i9, i7, ep4Var)) {
                        iW = ud2.w(i9 << 3, 8, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (s(i9, i7, ep4Var)) {
                        iW = ud2.w(i9 << 3, 4, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (s(i9, i7, ep4Var)) {
                        long jZ = z(ep4Var, j2);
                        iF10 = bk.F(i9 << 3);
                        iG2 = bk.G(jZ);
                        iW += iG2 + iF10;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (s(i9, i7, ep4Var)) {
                        long jZ2 = z(ep4Var, j2);
                        iF10 = bk.F(i9 << 3);
                        iG2 = bk.G(jZ2);
                        iW += iG2 + iF10;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (s(i9, i7, ep4Var)) {
                        long jV = v(ep4Var, j2);
                        iF10 = bk.F(i9 << 3);
                        iG2 = bk.G(jV);
                        iW += iG2 + iF10;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (s(i9, i7, ep4Var)) {
                        iW = ud2.w(i9 << 3, 8, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (s(i9, i7, ep4Var)) {
                        iW = ud2.w(i9 << 3, 4, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (s(i9, i7, ep4Var)) {
                        iW = ud2.w(i9 << 3, 1, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (s(i9, i7, ep4Var)) {
                        int i22 = i9 << 3;
                        Object object3 = unsafe.getObject(ep4Var, j2);
                        if (object3 instanceof jp4) {
                            iF3 = bk.F(i22);
                            iC2 = ((jp4) object3).g();
                        } else {
                            iF3 = bk.F(i22);
                            int i23 = yq4.a;
                            iC2 = vd4.c((String) object3);
                        }
                        iW = ud2.x(iC2, iC2, iF3, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (s(i9, i7, ep4Var)) {
                        Object object4 = unsafe.getObject(ep4Var, j2);
                        jq4 jq4VarB5 = B(i7);
                        zf3 zf3Var22 = kq4.a;
                        iF3 = bk.F(i9 << 3);
                        iC2 = ((ep4) object4).c(jq4VarB5);
                        iW = ud2.x(iC2, iC2, iF3, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (s(i9, i7, ep4Var)) {
                        jp4 jp4Var2 = (jp4) unsafe.getObject(ep4Var, j2);
                        iF3 = bk.F(i9 << 3);
                        iC2 = jp4Var2.g();
                        iW = ud2.x(iC2, iC2, iF3, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (s(i9, i7, ep4Var)) {
                        iV = v(ep4Var, j2);
                        iF11 = bk.F(i9 << 3);
                        iW = ud2.w(iV, iF11, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (s(i9, i7, ep4Var)) {
                        long jV2 = v(ep4Var, j2);
                        iF10 = bk.F(i9 << 3);
                        iG2 = bk.G(jV2);
                        iW += iG2 + iF10;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 64:
                    if (s(i9, i7, ep4Var)) {
                        iW = ud2.w(i9 << 3, 4, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (s(i9, i7, ep4Var)) {
                        iW = ud2.w(i9 << 3, 8, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (s(i9, i7, ep4Var)) {
                        int iV2 = v(ep4Var, j2);
                        iF11 = bk.F(i9 << 3);
                        iV = (iV2 >> 31) ^ (iV2 + iV2);
                        iW = ud2.w(iV, iF11, iW);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (s(i9, i7, ep4Var)) {
                        long jZ3 = z(ep4Var, j2);
                        iF10 = bk.F(i9 << 3);
                        iG2 = bk.G((jZ3 >> 63) ^ (jZ3 + jZ3));
                        iW += iG2 + iF10;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (s(i9, i7, ep4Var)) {
                        ep4 ep4Var4 = (ep4) unsafe.getObject(ep4Var, j2);
                        jq4 jq4VarB6 = B(i7);
                        zf3 zf3Var23 = kq4.a;
                        int iF14 = bk.F(i9 << 3);
                        i4 = iF14 + iF14;
                        iC3 = ep4Var4.c(jq4VarB6);
                        iH = iC3 + i4;
                        iW += iH;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    public final void j(Object obj, int i2, Object obj2) {
        if (p(i2, obj2)) {
            int iY = y(i2) & 1048575;
            Unsafe unsafe = j;
            long j2 = iY;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i2] + " is present but null: " + obj2.toString());
            }
            jq4 jq4VarB = B(i2);
            if (!p(i2, obj)) {
                if (r(object)) {
                    sp4 sp4VarF = jq4VarB.f();
                    jq4VarB.d(sp4VarF, object);
                    unsafe.putObject(obj, j2, sp4VarF);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                l(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                sp4 sp4VarF2 = jq4VarB.f();
                jq4VarB.d(sp4VarF2, object2);
                unsafe.putObject(obj, j2, sp4VarF2);
                object2 = sp4VarF2;
            }
            jq4VarB.d(object2, object);
        }
    }

    public final void k(Object obj, int i2, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (s(i3, i2, obj2)) {
            int iY = y(i2) & 1048575;
            Unsafe unsafe = j;
            long j2 = iY;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2.toString());
            }
            jq4 jq4VarB = B(i2);
            if (!s(i3, i2, obj)) {
                if (r(object)) {
                    sp4 sp4VarF = jq4VarB.f();
                    jq4VarB.d(sp4VarF, object);
                    unsafe.putObject(obj, j2, sp4VarF);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                rq4.h(i3, iArr[i2 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                sp4 sp4VarF2 = jq4VarB.f();
                jq4VarB.d(sp4VarF2, object2);
                unsafe.putObject(obj, j2, sp4VarF2);
                object2 = sp4VarF2;
            }
            jq4VarB.d(object2, object);
        }
    }

    public final void l(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        rq4.h((1 << (i3 >>> 20)) | rq4.a(obj, j2), j2, obj);
    }

    public final void m(Object obj, int i2, Object obj2) {
        j.putObject(obj, y(i2) & 1048575, obj2);
        l(i2, obj);
    }

    public final void n(int i2, int i3, Object obj, Object obj2) {
        j.putObject(obj, y(i3) & 1048575, obj2);
        rq4.h(i2, this.a[i3 + 2] & 1048575, obj);
    }

    public final boolean o(sp4 sp4Var, sp4 sp4Var2, int i2) {
        return p(i2, sp4Var) == p(i2, sp4Var2);
    }

    public final boolean p(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 == 1048575) {
            int iY = y(i2);
            long j3 = iY & 1048575;
            switch (x(iY)) {
                case 0:
                    if (Double.doubleToRawLongBits(rq4.c.e(obj, j3)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(rq4.c.f(obj, j3)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (rq4.b(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (rq4.b(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (rq4.a(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (rq4.b(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (rq4.a(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return rq4.c.j(obj, j3);
                case 8:
                    Object objD = rq4.d(obj, j3);
                    if (objD instanceof String) {
                        if (((String) objD).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objD instanceof jp4)) {
                            throw new IllegalArgumentException();
                        }
                        if (jp4.d.equals(objD)) {
                            return false;
                        }
                    }
                case 9:
                    if (rq4.d(obj, j3) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (jp4.d.equals(rq4.d(obj, j3))) {
                        return false;
                    }
                    break;
                case 11:
                    if (rq4.a(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (rq4.a(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (rq4.a(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (rq4.b(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (rq4.a(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (rq4.b(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (rq4.d(obj, j3) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i3 >>> 20)) & rq4.a(obj, j2)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return p(i2, obj);
        }
        return (i4 & i5) != 0;
    }

    public final boolean s(int i2, int i3, Object obj) {
        return rq4.a(obj, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0284  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:117:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d8 A[PHI: r3
  0x02d8: PHI (r3v56 byte) = (r3v33 byte), (r3v65 byte) binds: [B:118:0x02d3, B:120:0x02d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x02dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02de  */
    /* JADX WARN: Code duplicated, block: B:125:0x02df A[PHI: r3
  0x02df: PHI (r3v57 byte) = (r3v56 byte), (r3v64 byte) binds: [B:122:0x02da, B:124:0x02de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:133:0x030a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0310  */
    /* JADX WARN: Code duplicated, block: B:137:0x0322  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:457:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:556:0x0cda A[PHI: r1 r4 r8 r10 r11 r28
  0x0cda: PHI (r1v172 byte[]) = 
  (r1v148 byte[])
  (r1v149 byte[])
  (r1v150 byte[])
  (r1v151 byte[])
  (r1v152 byte[])
  (r1v153 byte[])
  (r1v154 byte[])
  (r1v155 byte[])
  (r1v156 byte[])
  (r1v162 byte[])
  (r1v163 byte[])
  (r1v173 byte[])
 binds: [B:554:0x0cc3, B:551:0x0ca2, B:548:0x0c85, B:545:0x0c69, B:542:0x0c4c, B:539:0x0c2e, B:532:0x0c07, B:518:0x0bc7, B:516:0x0bb4, B:495:0x0b21, B:491:0x0afb, B:480:0x0a94] A[DONT_GENERATE, DONT_INLINE]
  0x0cda: PHI (r4v178 hp4) = 
  (r4v150 hp4)
  (r4v151 hp4)
  (r4v152 hp4)
  (r4v153 hp4)
  (r4v154 hp4)
  (r4v155 hp4)
  (r4v156 hp4)
  (r4v157 hp4)
  (r4v159 hp4)
  (r4v165 hp4)
  (r4v167 hp4)
  (r43v0 hp4 A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
 binds: [B:554:0x0cc3, B:551:0x0ca2, B:548:0x0c85, B:545:0x0c69, B:542:0x0c4c, B:539:0x0c2e, B:532:0x0c07, B:518:0x0bc7, B:516:0x0bb4, B:495:0x0b21, B:491:0x0afb, B:480:0x0a94] A[DONT_GENERATE, DONT_INLINE]
  0x0cda: PHI (r8v85 int) = 
  (r8v63 int)
  (r8v64 int)
  (r8v65 int)
  (r8v66 int)
  (r8v67 int)
  (r8v68 int)
  (r8v69 int)
  (r8v70 int)
  (r8v71 int)
  (r8v75 int)
  (r8v76 int)
  (r28v37 int)
 binds: [B:554:0x0cc3, B:551:0x0ca2, B:548:0x0c85, B:545:0x0c69, B:542:0x0c4c, B:539:0x0c2e, B:532:0x0c07, B:518:0x0bc7, B:516:0x0bb4, B:495:0x0b21, B:491:0x0afb, B:480:0x0a94] A[DONT_GENERATE, DONT_INLINE]
  0x0cda: PHI (r10v54 int) = 
  (r10v31 int)
  (r10v32 int)
  (r10v33 int)
  (r10v34 int)
  (r10v35 int)
  (r10v36 int)
  (r10v37 int)
  (r10v38 int)
  (r10v39 int)
  (r10v43 int)
  (r10v44 int)
  (r10v55 int)
 binds: [B:554:0x0cc3, B:551:0x0ca2, B:548:0x0c85, B:545:0x0c69, B:542:0x0c4c, B:539:0x0c2e, B:532:0x0c07, B:518:0x0bc7, B:516:0x0bb4, B:495:0x0b21, B:491:0x0afb, B:480:0x0a94] A[DONT_GENERATE, DONT_INLINE]
  0x0cda: PHI (r11v54 mq4) = 
  (r11v42 mq4)
  (r11v42 mq4)
  (r11v42 mq4)
  (r11v42 mq4)
  (r11v42 mq4)
  (r11v42 mq4)
  (r11v42 mq4)
  (r11v42 mq4)
  (r11v42 mq4)
  (r11v49 mq4)
  (r11v50 mq4)
  (r11v42 mq4)
 binds: [B:554:0x0cc3, B:551:0x0ca2, B:548:0x0c85, B:545:0x0c69, B:542:0x0c4c, B:539:0x0c2e, B:532:0x0c07, B:518:0x0bc7, B:516:0x0bb4, B:495:0x0b21, B:491:0x0afb, B:480:0x0a94] A[DONT_GENERATE, DONT_INLINE]
  0x0cda: PHI (r28v56 int) = 
  (r28v38 int)
  (r28v39 int)
  (r28v40 int)
  (r28v41 int)
  (r28v42 int)
  (r28v43 int)
  (r28v44 int)
  (r28v45 int)
  (r28v46 int)
  (r28v49 int)
  (r28v50 int)
  (r28v57 int)
 binds: [B:554:0x0cc3, B:551:0x0ca2, B:548:0x0c85, B:545:0x0c69, B:542:0x0c4c, B:539:0x0c2e, B:532:0x0c07, B:518:0x0bc7, B:516:0x0bb4, B:495:0x0b21, B:491:0x0afb, B:480:0x0a94] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:561:0x0cfb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:566:0x0d0d  */
    /* JADX WARN: Code duplicated, block: B:602:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x0a06 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0cdd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x0cf2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x025e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final int t(Object obj, byte[] bArr, int i2, int i3, int i4, hp4 hp4Var) {
        int i5;
        int[] iArr;
        Object[] objArr;
        Object obj2;
        int iW;
        mq4 mq4Var;
        int i6;
        int i7;
        byte[] bArr2;
        sp4 sp4Var;
        mq4 mq4VarB;
        Unsafe unsafe;
        Object obj3;
        int i8;
        byte[] bArr3;
        hp4 hp4Var2;
        int i9;
        int i10;
        int iM;
        int i11;
        int i12;
        int i13;
        byte b;
        int i14;
        byte b2;
        int i15;
        byte b3;
        int i16;
        byte b4;
        int i17;
        byte b5;
        byte[] bArr4;
        Unsafe unsafe2;
        hp4 hp4Var3;
        Object obj4;
        Unsafe unsafe3;
        byte[] bArr5;
        hp4 hp4Var4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iK;
        int i23;
        int i24;
        int iM2;
        int i25;
        int iK2;
        int i26;
        mq4 mq4VarB2;
        int i27;
        bq4 bq4Var;
        int i28;
        int i29;
        int iP;
        hp4 hp4Var5;
        int i30;
        int iH;
        mq4 mq4Var2;
        int iM3;
        dq4 dq4Var = this;
        Object obj5 = obj;
        byte[] bArr6 = bArr;
        i3 = i3;
        hp4Var = hp4Var;
        if (!r(obj5)) {
            u41.k("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        Unsafe unsafe4 = j;
        int iM4 = i2;
        int i31 = -1;
        int i32 = 0;
        int i33 = 1048575;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            int i36 = 1048575;
            while (true) {
                Object[] objArr2 = dq4Var.b;
                int[] iArr2 = dq4Var.a;
                if (iM4 < i3) {
                    int iN = iM4 + 1;
                    int i37 = bArr6[iM4];
                    if (i37 < 0) {
                        iN = pi4.n(i37, bArr6, iN, hp4Var);
                        i37 = hp4Var.a;
                    }
                    int i38 = iN;
                    i35 = i37;
                    int i39 = (i35 == true ? 1 : 0) >>> 3;
                    int i40 = dq4Var.d;
                    int i41 = dq4Var.c;
                    if (i39 > i31) {
                        int i42 = i32 / 3;
                        if (i39 < i41 || i39 > i40) {
                            iW = -1;
                        } else {
                            iW = dq4Var.w(i39, i42);
                        }
                    } else if (i39 < i41 || i39 > i40) {
                        iW = -1;
                    } else {
                        iW = dq4Var.w(i39, 0);
                    }
                    mq4 mq4Var3 = mq4.f;
                    if (iW == -1) {
                        mq4Var = mq4Var3;
                        i6 = i39;
                        hp4Var = hp4Var;
                        i5 = i33;
                        iArr = iArr2;
                        objArr = objArr2;
                        i7 = i38;
                        i32 = 0;
                        unsafe4 = unsafe4;
                        obj2 = obj5;
                    } else {
                        boolean z = (i35 == true ? 1 : 0) & 7;
                        int i43 = iArr2[iW + 1];
                        int iX = x(i43);
                        iArr = iArr2;
                        objArr = objArr2;
                        long j2 = i43 & i36;
                        if (iX <= 17) {
                            int i44 = iArr[iW + 2];
                            int i45 = 1 << (i44 >>> 20);
                            int i46 = i44 & i36;
                            if (i46 != i33) {
                                int i47 = i36;
                                if (i33 != i47) {
                                    unsafe4.putInt(obj5, i33, i34);
                                }
                                i34 = i46 == i47 ? 0 : unsafe4.getInt(obj5, i46);
                            } else {
                                i46 = i33;
                            }
                            switch (iX) {
                                case 0:
                                    bArr4 = bArr;
                                    unsafe2 = unsafe4;
                                    i32 = iW;
                                    i8 = i34;
                                    i7 = i38;
                                    i9 = i35 == true ? 1 : 0;
                                    hp4Var3 = hp4Var;
                                    if (z == 1) {
                                        i34 = i8 | i45;
                                        rq4.c.h(obj5, j2, Double.longBitsToDouble(pi4.s(i7, bArr4)));
                                        iM4 = i7 + 8;
                                        unsafe4 = unsafe2;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        bArr6 = bArr4;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                    }
                                    obj4 = obj5;
                                    mq4Var = mq4Var3;
                                    i6 = i39;
                                    i4 = i4;
                                    i5 = i46;
                                    hp4Var = hp4Var3;
                                    i35 = i9;
                                    i34 = i8;
                                    unsafe4 = unsafe2;
                                    obj2 = obj4;
                                    bArr2 = bArr4;
                                    if (i35 == i4 || i4 == 0) {
                                        sp4Var = (sp4) obj2;
                                        mq4VarB = sp4Var.zzc;
                                        if (mq4VarB == mq4Var) {
                                            mq4VarB = mq4.b();
                                            sp4Var.zzc = mq4VarB;
                                        }
                                        int i48 = i35;
                                        int iL = pi4.l(i48 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                        dq4Var = this;
                                        hp4Var = hp4Var;
                                        i35 = i48 == true ? 1 : 0;
                                        i3 = i3;
                                        i31 = i6;
                                        obj5 = obj2;
                                        i32 = i32;
                                        unsafe4 = unsafe4;
                                        i33 = i5;
                                        i36 = 1048575;
                                        iM4 = iL;
                                        bArr6 = bArr;
                                    } else {
                                        i3 = i3;
                                        iM4 = i7;
                                    }
                                    break;
                                case 1:
                                    bArr4 = bArr;
                                    unsafe2 = unsafe4;
                                    i32 = iW;
                                    i8 = i34;
                                    i7 = i38;
                                    i9 = i35 == true ? 1 : 0;
                                    hp4Var3 = hp4Var;
                                    if (z == 5) {
                                        iM4 = i7 + 4;
                                        i34 = i8 | i45;
                                        rq4.c.i(obj5, j2, Float.intBitsToFloat(pi4.i(i7, bArr4)));
                                        unsafe4 = unsafe2;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        bArr6 = bArr4;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                    }
                                    obj4 = obj5;
                                    mq4Var = mq4Var3;
                                    i6 = i39;
                                    i4 = i4;
                                    i5 = i46;
                                    hp4Var = hp4Var3;
                                    i35 = i9;
                                    i34 = i8;
                                    unsafe4 = unsafe2;
                                    obj2 = obj4;
                                    bArr2 = bArr4;
                                    if (i35 == i4) {
                                    }
                                    sp4Var = (sp4) obj2;
                                    mq4VarB = sp4Var.zzc;
                                    if (mq4VarB == mq4Var) {
                                        mq4VarB = mq4.b();
                                        sp4Var.zzc = mq4VarB;
                                    }
                                    int i49 = i35;
                                    int iL2 = pi4.l(i49 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                    dq4Var = this;
                                    hp4Var = hp4Var;
                                    i35 = i49 == true ? 1 : 0;
                                    i3 = i3;
                                    i31 = i6;
                                    obj5 = obj2;
                                    i32 = i32;
                                    unsafe4 = unsafe4;
                                    i33 = i5;
                                    i36 = 1048575;
                                    iM4 = iL2;
                                    bArr6 = bArr;
                                    break;
                                case 2:
                                case 3:
                                    bArr4 = bArr;
                                    i32 = iW;
                                    i8 = i34;
                                    i7 = i38;
                                    i9 = i35 == true ? 1 : 0;
                                    hp4Var3 = hp4Var;
                                    if (z == 0) {
                                        i34 = i8 | i45;
                                        int iP2 = pi4.p(bArr4, i7, hp4Var3);
                                        unsafe4.putLong(obj5, j2, hp4Var3.b);
                                        i3 = i3;
                                        iM4 = iP2;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        bArr6 = bArr4;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                    }
                                    unsafe2 = unsafe4;
                                    obj4 = obj5;
                                    mq4Var = mq4Var3;
                                    i6 = i39;
                                    i4 = i4;
                                    i5 = i46;
                                    hp4Var = hp4Var3;
                                    i35 = i9;
                                    i34 = i8;
                                    unsafe4 = unsafe2;
                                    obj2 = obj4;
                                    bArr2 = bArr4;
                                    if (i35 == i4) {
                                    }
                                    sp4Var = (sp4) obj2;
                                    mq4VarB = sp4Var.zzc;
                                    if (mq4VarB == mq4Var) {
                                        mq4VarB = mq4.b();
                                        sp4Var.zzc = mq4VarB;
                                    }
                                    int i410 = i35;
                                    int iL3 = pi4.l(i410 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                    dq4Var = this;
                                    hp4Var = hp4Var;
                                    i35 = i410 == true ? 1 : 0;
                                    i3 = i3;
                                    i31 = i6;
                                    obj5 = obj2;
                                    i32 = i32;
                                    unsafe4 = unsafe4;
                                    i33 = i5;
                                    i36 = 1048575;
                                    iM4 = iL3;
                                    bArr6 = bArr;
                                    break;
                                case 4:
                                case 11:
                                    bArr4 = bArr;
                                    i32 = iW;
                                    i8 = i34;
                                    i7 = i38;
                                    i9 = i35 == true ? 1 : 0;
                                    hp4Var3 = hp4Var;
                                    if (z == 0) {
                                        i34 = i8 | i45;
                                        iM4 = pi4.m(bArr4, i7, hp4Var3);
                                        unsafe4.putInt(obj5, j2, hp4Var3.a);
                                        i3 = i3;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        bArr6 = bArr4;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                    }
                                    unsafe2 = unsafe4;
                                    obj4 = obj5;
                                    mq4Var = mq4Var3;
                                    i6 = i39;
                                    i4 = i4;
                                    i5 = i46;
                                    hp4Var = hp4Var3;
                                    i35 = i9;
                                    i34 = i8;
                                    unsafe4 = unsafe2;
                                    obj2 = obj4;
                                    bArr2 = bArr4;
                                    if (i35 == i4) {
                                    }
                                    sp4Var = (sp4) obj2;
                                    mq4VarB = sp4Var.zzc;
                                    if (mq4VarB == mq4Var) {
                                        mq4VarB = mq4.b();
                                        sp4Var.zzc = mq4VarB;
                                    }
                                    int i411 = i35;
                                    int iL4 = pi4.l(i411 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                    dq4Var = this;
                                    hp4Var = hp4Var;
                                    i35 = i411 == true ? 1 : 0;
                                    i3 = i3;
                                    i31 = i6;
                                    obj5 = obj2;
                                    i32 = i32;
                                    unsafe4 = unsafe4;
                                    i33 = i5;
                                    i36 = 1048575;
                                    iM4 = iL4;
                                    bArr6 = bArr;
                                    break;
                                case 5:
                                case 14:
                                    Unsafe unsafe5 = unsafe4;
                                    Object obj6 = obj5;
                                    i32 = iW;
                                    i8 = i34;
                                    i7 = i38;
                                    i9 = i35 == true ? 1 : 0;
                                    if (z == 1) {
                                        bArr4 = bArr;
                                        unsafe4 = unsafe5;
                                        hp4Var3 = hp4Var;
                                        obj5 = obj6;
                                        unsafe4.putLong(obj5, j2, pi4.s(i7, bArr));
                                        i3 = i3;
                                        iM4 = i7 + 8;
                                        i34 = i8 | i45;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        bArr6 = bArr4;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                    } else {
                                        bArr4 = bArr;
                                        hp4Var3 = hp4Var;
                                        unsafe2 = unsafe5;
                                        obj4 = obj6;
                                        mq4Var = mq4Var3;
                                        i6 = i39;
                                        i4 = i4;
                                        i5 = i46;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                        i34 = i8;
                                        unsafe4 = unsafe2;
                                        obj2 = obj4;
                                        bArr2 = bArr4;
                                        if (i35 == i4) {
                                        }
                                        sp4Var = (sp4) obj2;
                                        mq4VarB = sp4Var.zzc;
                                        if (mq4VarB == mq4Var) {
                                            mq4VarB = mq4.b();
                                            sp4Var.zzc = mq4VarB;
                                        }
                                        int i412 = i35;
                                        int iL5 = pi4.l(i412 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                        dq4Var = this;
                                        hp4Var = hp4Var;
                                        i35 = i412 == true ? 1 : 0;
                                        i3 = i3;
                                        i31 = i6;
                                        obj5 = obj2;
                                        i32 = i32;
                                        unsafe4 = unsafe4;
                                        i33 = i5;
                                        i36 = 1048575;
                                        iM4 = iL5;
                                        bArr6 = bArr;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    unsafe = unsafe4;
                                    obj3 = obj5;
                                    i32 = iW;
                                    i8 = i34;
                                    i7 = i38;
                                    bArr3 = bArr;
                                    hp4Var2 = hp4Var;
                                    i9 = i35 == true ? 1 : 0;
                                    if (z == 5) {
                                        iM4 = i7 + 4;
                                        i10 = i8 | i45;
                                        unsafe.putInt(obj3, j2, pi4.i(i7, bArr3));
                                        bArr6 = bArr3;
                                        hp4Var = hp4Var2;
                                        i34 = i10;
                                        obj5 = obj3;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        unsafe4 = unsafe;
                                        i35 = i9;
                                        i36 = 1048575;
                                        i3 = i3;
                                    } else {
                                        Unsafe unsafe6 = unsafe;
                                        bArr4 = bArr3;
                                        obj4 = obj3;
                                        unsafe2 = unsafe6;
                                        hp4Var3 = hp4Var2;
                                        mq4Var = mq4Var3;
                                        i6 = i39;
                                        i4 = i4;
                                        i5 = i46;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                        i34 = i8;
                                        unsafe4 = unsafe2;
                                        obj2 = obj4;
                                        bArr2 = bArr4;
                                        if (i35 == i4) {
                                        }
                                        sp4Var = (sp4) obj2;
                                        mq4VarB = sp4Var.zzc;
                                        if (mq4VarB == mq4Var) {
                                            mq4VarB = mq4.b();
                                            sp4Var.zzc = mq4VarB;
                                        }
                                        int i413 = i35;
                                        int iL6 = pi4.l(i413 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                        dq4Var = this;
                                        hp4Var = hp4Var;
                                        i35 = i413 == true ? 1 : 0;
                                        i3 = i3;
                                        i31 = i6;
                                        obj5 = obj2;
                                        i32 = i32;
                                        unsafe4 = unsafe4;
                                        i33 = i5;
                                        i36 = 1048575;
                                        iM4 = iL6;
                                        bArr6 = bArr;
                                    }
                                    break;
                                case 7:
                                    unsafe = unsafe4;
                                    obj3 = obj5;
                                    i32 = iW;
                                    i8 = i34;
                                    i7 = i38;
                                    bArr3 = bArr;
                                    hp4Var2 = hp4Var;
                                    i9 = i35 == true ? 1 : 0;
                                    if (z == 0) {
                                        int i50 = i8 | i45;
                                        int iP3 = pi4.p(bArr3, i7, hp4Var2);
                                        rq4.c.g(obj3, j2, hp4Var2.b != 0);
                                        i3 = i3;
                                        hp4Var = hp4Var2;
                                        i34 = i50;
                                        obj5 = obj3;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        i35 = i9 == true ? 1 : 0;
                                        i36 = 1048575;
                                        iM4 = iP3;
                                        bArr6 = bArr3;
                                        unsafe4 = unsafe;
                                    } else {
                                        Unsafe unsafe7 = unsafe;
                                        bArr4 = bArr3;
                                        obj4 = obj3;
                                        unsafe2 = unsafe7;
                                        hp4Var3 = hp4Var2;
                                        mq4Var = mq4Var3;
                                        i6 = i39;
                                        i4 = i4;
                                        i5 = i46;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                        i34 = i8;
                                        unsafe4 = unsafe2;
                                        obj2 = obj4;
                                        bArr2 = bArr4;
                                        if (i35 == i4) {
                                        }
                                        sp4Var = (sp4) obj2;
                                        mq4VarB = sp4Var.zzc;
                                        if (mq4VarB == mq4Var) {
                                            mq4VarB = mq4.b();
                                            sp4Var.zzc = mq4VarB;
                                        }
                                        int i414 = i35;
                                        int iL7 = pi4.l(i414 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                        dq4Var = this;
                                        hp4Var = hp4Var;
                                        i35 = i414 == true ? 1 : 0;
                                        i3 = i3;
                                        i31 = i6;
                                        obj5 = obj2;
                                        i32 = i32;
                                        unsafe4 = unsafe4;
                                        i33 = i5;
                                        i36 = 1048575;
                                        iM4 = iL7;
                                        bArr6 = bArr;
                                    }
                                    break;
                                case 8:
                                    unsafe = unsafe4;
                                    obj3 = obj5;
                                    i32 = iW;
                                    i8 = i34;
                                    i7 = i38;
                                    bArr3 = bArr;
                                    hp4Var2 = hp4Var;
                                    i9 = i35 == true ? 1 : 0;
                                    if (z == 2) {
                                        if ((i43 & 536870912) != 0) {
                                            int i51 = i8 | i45;
                                            iM = pi4.m(bArr3, i7, hp4Var2);
                                            int i52 = hp4Var2.a;
                                            if (i52 < 0) {
                                                j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i52 == 0) {
                                                hp4Var2.c = BuildConfig.VERSION_NAME;
                                                i11 = i51;
                                            } else {
                                                int i53 = yq4.a;
                                                int length = bArr3.length;
                                                if ((((length - iM) - i52) | iM | i52) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iM), Integer.valueOf(i52)));
                                                }
                                                int i54 = iM + i52;
                                                char[] cArr = new char[i52];
                                                int i55 = 0;
                                                while (iM < i54) {
                                                    byte b6 = bArr3[iM];
                                                    if (b6 >= 0) {
                                                        iM++;
                                                        cArr[i55] = (char) b6;
                                                        i55++;
                                                    } else {
                                                        while (iM < i54) {
                                                            i12 = iM + 1;
                                                            i13 = iM;
                                                            b = bArr3[i13];
                                                            if (b >= 0) {
                                                                i14 = i55 + 1;
                                                                cArr[i55] = (char) b;
                                                                iM = i12;
                                                                while (true) {
                                                                    i55 = i14;
                                                                    if (iM >= i54 || (b2 = bArr3[iM]) < 0) {
                                                                    }
                                                                    iM++;
                                                                    i14 = i55 + 1;
                                                                    cArr[i55] = (char) b2;
                                                                    break;
                                                                }
                                                            } else {
                                                                i51 = i51;
                                                                if (b >= -32) {
                                                                    if (b < -16) {
                                                                        i15 = i54;
                                                                        if (i12 < i15 - 2) {
                                                                            j93.l("Protocol message had invalid UTF-8.");
                                                                            return 0;
                                                                        }
                                                                        b3 = bArr3[i12];
                                                                        int i56 = i13 + 3;
                                                                        byte b7 = bArr3[i13 + 2];
                                                                        int i57 = i13 + 4;
                                                                        byte b8 = bArr3[i56];
                                                                        if (!ud4.c(b3)) {
                                                                            if ((((b3 + 112) + (b << 28)) >> 30) != 0 && !ud4.c(b7) && !ud4.c(b8)) {
                                                                                int i58 = ((b & 7) << 18) | ((b3 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                                                                                cArr[i55] = (char) ((i58 >>> 10) + 55232);
                                                                                cArr[i55 + 1] = (char) ((i58 & 1023) + 56320);
                                                                                i55 += 2;
                                                                                iM = i57;
                                                                            }
                                                                        }
                                                                        j93.l("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    if (i12 < i54 - 1) {
                                                                        j93.l("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    i16 = i55 + 1;
                                                                    int i59 = i13 + 2;
                                                                    b4 = bArr3[i12];
                                                                    i17 = i13 + 3;
                                                                    b5 = bArr3[i59];
                                                                    if (!ud4.c(b4)) {
                                                                        i15 = i54;
                                                                        if (b != -32) {
                                                                            if (b != -19) {
                                                                                if (!ud4.c(b5)) {
                                                                                    cArr[i55] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                    iM = i17;
                                                                                    i55 = i16;
                                                                                }
                                                                            } else if (b4 < -96) {
                                                                                b = -19;
                                                                                if (!ud4.c(b5)) {
                                                                                    cArr[i55] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                    iM = i17;
                                                                                    i55 = i16;
                                                                                }
                                                                            }
                                                                        } else if (b4 >= -96) {
                                                                            b = -32;
                                                                            if (b != -19) {
                                                                                if (!ud4.c(b5)) {
                                                                                    cArr[i55] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                    iM = i17;
                                                                                    i55 = i16;
                                                                                }
                                                                            } else if (b4 < -96) {
                                                                                b = -19;
                                                                                if (!ud4.c(b5)) {
                                                                                    cArr[i55] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                    iM = i17;
                                                                                    i55 = i16;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    j93.l("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                    i54 = i15;
                                                                } else {
                                                                    if (i12 < i54) {
                                                                        j93.l("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    int i60 = i55 + 1;
                                                                    int i61 = i13 + 2;
                                                                    byte b9 = bArr3[i12];
                                                                    if (b >= -62 || ud4.c(b9)) {
                                                                        j93.l("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    cArr[i55] = (char) (((b & 31) << 6) | (b9 & 63));
                                                                    i51 = i51;
                                                                    iM = i61;
                                                                    i55 = i60;
                                                                }
                                                            }
                                                        }
                                                        i11 = i51;
                                                        hp4Var2.c = new String(cArr, 0, i55);
                                                        iM = i54;
                                                    }
                                                }
                                                while (iM < i54) {
                                                    i12 = iM + 1;
                                                    i13 = iM;
                                                    b = bArr3[i13];
                                                    if (b >= 0) {
                                                        i14 = i55 + 1;
                                                        cArr[i55] = (char) b;
                                                        iM = i12;
                                                        while (true) {
                                                            i55 = i14;
                                                            if (iM >= i54) {
                                                            }
                                                            break;
                                                            iM++;
                                                            i14 = i55 + 1;
                                                            cArr[i55] = (char) b2;
                                                        }
                                                    } else {
                                                        i51 = i51;
                                                        if (b >= -32) {
                                                            if (i12 < i54) {
                                                                j93.l("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            int i62 = i55 + 1;
                                                            int i63 = i13 + 2;
                                                            byte b10 = bArr3[i12];
                                                            if (b >= -62) {
                                                            }
                                                            j93.l("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        if (b < -16) {
                                                            i15 = i54;
                                                            if (i12 < i15 - 2) {
                                                                j93.l("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            b3 = bArr3[i12];
                                                            int i510 = i13 + 3;
                                                            byte b11 = bArr3[i13 + 2];
                                                            int i511 = i13 + 4;
                                                            byte b12 = bArr3[i510];
                                                            if (!ud4.c(b3)) {
                                                                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                                                                }
                                                            }
                                                            j93.l("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        if (i12 < i54 - 1) {
                                                            j93.l("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        i16 = i55 + 1;
                                                        int i512 = i13 + 2;
                                                        b4 = bArr3[i12];
                                                        i17 = i13 + 3;
                                                        b5 = bArr3[i512];
                                                        if (!ud4.c(b4)) {
                                                            i15 = i54;
                                                            if (b != -32) {
                                                                if (b != -19) {
                                                                    if (!ud4.c(b5)) {
                                                                        cArr[i55] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                        iM = i17;
                                                                        i55 = i16;
                                                                    }
                                                                } else if (b4 < -96) {
                                                                    b = -19;
                                                                    if (!ud4.c(b5)) {
                                                                        cArr[i55] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                        iM = i17;
                                                                        i55 = i16;
                                                                    }
                                                                }
                                                            } else if (b4 >= -96) {
                                                                b = -32;
                                                                if (b != -19) {
                                                                    if (!ud4.c(b5)) {
                                                                        cArr[i55] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                        iM = i17;
                                                                        i55 = i16;
                                                                    }
                                                                } else if (b4 < -96) {
                                                                    b = -19;
                                                                    if (!ud4.c(b5)) {
                                                                        cArr[i55] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                        iM = i17;
                                                                        i55 = i16;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        j93.l("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                        i54 = i15;
                                                    }
                                                }
                                                i11 = i51;
                                                hp4Var2.c = new String(cArr, 0, i55);
                                                iM = i54;
                                            }
                                            i10 = i11;
                                        } else {
                                            iM = pi4.m(bArr3, i7, hp4Var2);
                                            int i64 = hp4Var2.a;
                                            if (i64 < 0) {
                                                j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            i10 = i8 | i45;
                                            if (i64 == 0) {
                                                hp4Var2.c = BuildConfig.VERSION_NAME;
                                            } else {
                                                hp4Var2.c = new String(bArr3, iM, i64, StandardCharsets.UTF_8);
                                                iM += i64;
                                            }
                                        }
                                        iM4 = iM;
                                        unsafe.putObject(obj3, j2, hp4Var2.c);
                                        bArr6 = bArr3;
                                        hp4Var = hp4Var2;
                                        i34 = i10;
                                        obj5 = obj3;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        unsafe4 = unsafe;
                                        i35 = i9;
                                        i36 = 1048575;
                                        i3 = i3;
                                    } else {
                                        Unsafe unsafe8 = unsafe;
                                        bArr4 = bArr3;
                                        obj4 = obj3;
                                        unsafe2 = unsafe8;
                                        hp4Var3 = hp4Var2;
                                        mq4Var = mq4Var3;
                                        i6 = i39;
                                        i4 = i4;
                                        i5 = i46;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                        i34 = i8;
                                        unsafe4 = unsafe2;
                                        obj2 = obj4;
                                        bArr2 = bArr4;
                                        if (i35 == i4) {
                                        }
                                        sp4Var = (sp4) obj2;
                                        mq4VarB = sp4Var.zzc;
                                        if (mq4VarB == mq4Var) {
                                            mq4VarB = mq4.b();
                                            sp4Var.zzc = mq4VarB;
                                        }
                                        int i415 = i35;
                                        int iL8 = pi4.l(i415 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                        dq4Var = this;
                                        hp4Var = hp4Var;
                                        i35 = i415 == true ? 1 : 0;
                                        i3 = i3;
                                        i31 = i6;
                                        obj5 = obj2;
                                        i32 = i32;
                                        unsafe4 = unsafe4;
                                        i33 = i5;
                                        i36 = 1048575;
                                        iM4 = iL8;
                                        bArr6 = bArr;
                                    }
                                    break;
                                case 9:
                                    Object obj7 = obj5;
                                    Unsafe unsafe9 = unsafe4;
                                    i32 = iW;
                                    i7 = i38;
                                    if (z == 2) {
                                        i34 |= i45;
                                        Object objC = dq4Var.C(i32, obj7);
                                        hp4Var = hp4Var;
                                        i3 = i3;
                                        iM4 = pi4.r(objC, dq4Var.B(i32), bArr, i7, i3, hp4Var);
                                        dq4Var.m(obj7, i32, objC);
                                        bArr6 = bArr;
                                        obj5 = obj7;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        unsafe4 = unsafe9;
                                    } else {
                                        hp4Var2 = hp4Var;
                                        bArr4 = bArr;
                                        obj4 = obj7;
                                        unsafe2 = unsafe9;
                                        i8 = i34;
                                        i9 = i35 == true ? 1 : 0;
                                        hp4Var3 = hp4Var2;
                                        mq4Var = mq4Var3;
                                        i6 = i39;
                                        i4 = i4;
                                        i5 = i46;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                        i34 = i8;
                                        unsafe4 = unsafe2;
                                        obj2 = obj4;
                                        bArr2 = bArr4;
                                        if (i35 == i4) {
                                        }
                                        sp4Var = (sp4) obj2;
                                        mq4VarB = sp4Var.zzc;
                                        if (mq4VarB == mq4Var) {
                                            mq4VarB = mq4.b();
                                            sp4Var.zzc = mq4VarB;
                                        }
                                        int i416 = i35;
                                        int iL9 = pi4.l(i416 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                        dq4Var = this;
                                        hp4Var = hp4Var;
                                        i35 = i416 == true ? 1 : 0;
                                        i3 = i3;
                                        i31 = i6;
                                        obj5 = obj2;
                                        i32 = i32;
                                        unsafe4 = unsafe4;
                                        i33 = i5;
                                        i36 = 1048575;
                                        iM4 = iL9;
                                        bArr6 = bArr;
                                    }
                                    break;
                                case 10:
                                    Object obj8 = obj5;
                                    unsafe3 = unsafe4;
                                    obj4 = obj8;
                                    bArr5 = bArr;
                                    hp4Var4 = hp4Var;
                                    i32 = iW;
                                    i7 = i38;
                                    if (z == 2) {
                                        i34 |= i45;
                                        iM4 = pi4.h(bArr5, i7, hp4Var4);
                                        unsafe3.putObject(obj4, j2, hp4Var4.c);
                                        Unsafe unsafe10 = unsafe3;
                                        obj5 = obj4;
                                        unsafe4 = unsafe10;
                                        bArr6 = bArr5;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        hp4Var = hp4Var4;
                                    }
                                    i8 = i34;
                                    i9 = i35 == true ? 1 : 0;
                                    hp4Var3 = hp4Var4;
                                    bArr4 = bArr5;
                                    unsafe2 = unsafe3;
                                    mq4Var = mq4Var3;
                                    i6 = i39;
                                    i4 = i4;
                                    i5 = i46;
                                    hp4Var = hp4Var3;
                                    i35 = i9;
                                    i34 = i8;
                                    unsafe4 = unsafe2;
                                    obj2 = obj4;
                                    bArr2 = bArr4;
                                    if (i35 == i4) {
                                    }
                                    sp4Var = (sp4) obj2;
                                    mq4VarB = sp4Var.zzc;
                                    if (mq4VarB == mq4Var) {
                                        mq4VarB = mq4.b();
                                        sp4Var.zzc = mq4VarB;
                                    }
                                    int i417 = i35;
                                    int iL10 = pi4.l(i417 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                    dq4Var = this;
                                    hp4Var = hp4Var;
                                    i35 = i417 == true ? 1 : 0;
                                    i3 = i3;
                                    i31 = i6;
                                    obj5 = obj2;
                                    i32 = i32;
                                    unsafe4 = unsafe4;
                                    i33 = i5;
                                    i36 = 1048575;
                                    iM4 = iL10;
                                    bArr6 = bArr;
                                    break;
                                case 12:
                                    Object obj9 = obj5;
                                    unsafe3 = unsafe4;
                                    obj4 = obj9;
                                    bArr5 = bArr;
                                    hp4Var4 = hp4Var;
                                    i32 = iW;
                                    i7 = i38;
                                    if (z == 0) {
                                        int iM5 = pi4.m(bArr5, i7, hp4Var4);
                                        int i65 = hp4Var4.a;
                                        bp4 bp4VarA = dq4Var.A(i32);
                                        if ((i43 & Integer.MIN_VALUE) == 0 || bp4VarA == null || bp4VarA.a(i65)) {
                                            i34 |= i45;
                                            unsafe3.putInt(obj4, j2, i65);
                                        } else {
                                            sp4 sp4Var2 = (sp4) obj4;
                                            mq4 mq4VarB3 = sp4Var2.zzc;
                                            if (mq4VarB3 == mq4Var3) {
                                                mq4VarB3 = mq4.b();
                                                sp4Var2.zzc = mq4VarB3;
                                            }
                                            mq4VarB3.c(i35 == true ? 1 : 0, Long.valueOf(i65));
                                        }
                                        obj5 = obj4;
                                        unsafe4 = unsafe3;
                                        iM4 = iM5;
                                        bArr6 = bArr5;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        hp4Var = hp4Var4;
                                    }
                                    i8 = i34;
                                    i9 = i35 == true ? 1 : 0;
                                    hp4Var3 = hp4Var4;
                                    bArr4 = bArr5;
                                    unsafe2 = unsafe3;
                                    mq4Var = mq4Var3;
                                    i6 = i39;
                                    i4 = i4;
                                    i5 = i46;
                                    hp4Var = hp4Var3;
                                    i35 = i9;
                                    i34 = i8;
                                    unsafe4 = unsafe2;
                                    obj2 = obj4;
                                    bArr2 = bArr4;
                                    if (i35 == i4) {
                                    }
                                    sp4Var = (sp4) obj2;
                                    mq4VarB = sp4Var.zzc;
                                    if (mq4VarB == mq4Var) {
                                        mq4VarB = mq4.b();
                                        sp4Var.zzc = mq4VarB;
                                    }
                                    int i418 = i35;
                                    int iL11 = pi4.l(i418 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                    dq4Var = this;
                                    hp4Var = hp4Var;
                                    i35 = i418 == true ? 1 : 0;
                                    i3 = i3;
                                    i31 = i6;
                                    obj5 = obj2;
                                    i32 = i32;
                                    unsafe4 = unsafe4;
                                    i33 = i5;
                                    i36 = 1048575;
                                    iM4 = iL11;
                                    bArr6 = bArr;
                                    break;
                                case 15:
                                    Object obj10 = obj5;
                                    unsafe3 = unsafe4;
                                    obj4 = obj10;
                                    bArr5 = bArr;
                                    hp4Var4 = hp4Var;
                                    i32 = iW;
                                    i7 = i38;
                                    if (z == 0) {
                                        i34 |= i45;
                                        iM4 = pi4.m(bArr5, i7, hp4Var4);
                                        unsafe3.putInt(obj4, j2, hj4.c(hp4Var4.a));
                                        Unsafe unsafe11 = unsafe3;
                                        obj5 = obj4;
                                        unsafe4 = unsafe11;
                                        bArr6 = bArr5;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        hp4Var = hp4Var4;
                                    }
                                    i8 = i34;
                                    i9 = i35 == true ? 1 : 0;
                                    hp4Var3 = hp4Var4;
                                    bArr4 = bArr5;
                                    unsafe2 = unsafe3;
                                    mq4Var = mq4Var3;
                                    i6 = i39;
                                    i4 = i4;
                                    i5 = i46;
                                    hp4Var = hp4Var3;
                                    i35 = i9;
                                    i34 = i8;
                                    unsafe4 = unsafe2;
                                    obj2 = obj4;
                                    bArr2 = bArr4;
                                    if (i35 == i4) {
                                    }
                                    sp4Var = (sp4) obj2;
                                    mq4VarB = sp4Var.zzc;
                                    if (mq4VarB == mq4Var) {
                                        mq4VarB = mq4.b();
                                        sp4Var.zzc = mq4VarB;
                                    }
                                    int i419 = i35;
                                    int iL12 = pi4.l(i419 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                    dq4Var = this;
                                    hp4Var = hp4Var;
                                    i35 = i419 == true ? 1 : 0;
                                    i3 = i3;
                                    i31 = i6;
                                    obj5 = obj2;
                                    i32 = i32;
                                    unsafe4 = unsafe4;
                                    i33 = i5;
                                    i36 = 1048575;
                                    iM4 = iL12;
                                    bArr6 = bArr;
                                    break;
                                case 16:
                                    bArr5 = bArr;
                                    hp4Var4 = hp4Var;
                                    i32 = iW;
                                    i7 = i38;
                                    if (z == 0) {
                                        i34 |= i45;
                                        int iP4 = pi4.p(bArr5, i7, hp4Var4);
                                        long j3 = hp4Var4.b;
                                        unsafe4.putLong(obj5, j2, (-(j3 & 1)) ^ (j3 >>> 1));
                                        obj5 = obj5;
                                        unsafe4 = unsafe4;
                                        iM4 = iP4;
                                        bArr6 = bArr5;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        hp4Var = hp4Var4;
                                    } else {
                                        Object obj11 = obj5;
                                        unsafe3 = unsafe4;
                                        obj4 = obj11;
                                        i8 = i34;
                                        i9 = i35 == true ? 1 : 0;
                                        hp4Var3 = hp4Var4;
                                        bArr4 = bArr5;
                                        unsafe2 = unsafe3;
                                        mq4Var = mq4Var3;
                                        i6 = i39;
                                        i4 = i4;
                                        i5 = i46;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                        i34 = i8;
                                        unsafe4 = unsafe2;
                                        obj2 = obj4;
                                        bArr2 = bArr4;
                                        if (i35 == i4) {
                                        }
                                        sp4Var = (sp4) obj2;
                                        mq4VarB = sp4Var.zzc;
                                        if (mq4VarB == mq4Var) {
                                            mq4VarB = mq4.b();
                                            sp4Var.zzc = mq4VarB;
                                        }
                                        int i4110 = i35;
                                        int iL13 = pi4.l(i4110 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                        dq4Var = this;
                                        hp4Var = hp4Var;
                                        i35 = i4110 == true ? 1 : 0;
                                        i3 = i3;
                                        i31 = i6;
                                        obj5 = obj2;
                                        i32 = i32;
                                        unsafe4 = unsafe4;
                                        i33 = i5;
                                        i36 = 1048575;
                                        iM4 = iL13;
                                        bArr6 = bArr;
                                    }
                                    break;
                                default:
                                    if (z == 3) {
                                        i34 |= i45;
                                        Object objC2 = dq4Var.C(iW, obj5);
                                        i32 = iW;
                                        iM4 = pi4.q(objC2, dq4Var.B(iW), bArr, i38, i3, (i39 << 3) | 4, hp4Var);
                                        hp4Var4 = hp4Var;
                                        bArr5 = bArr;
                                        dq4Var.m(obj5, i32, objC2);
                                        bArr6 = bArr5;
                                        i32 = i32;
                                        i31 = i39;
                                        i33 = i46;
                                        hp4Var = hp4Var4;
                                    } else {
                                        i32 = iW;
                                        bArr4 = bArr;
                                        unsafe2 = unsafe4;
                                        obj4 = obj5;
                                        i8 = i34;
                                        i7 = i38;
                                        i9 = i35 == true ? 1 : 0;
                                        hp4Var3 = hp4Var;
                                        mq4Var = mq4Var3;
                                        i6 = i39;
                                        i4 = i4;
                                        i5 = i46;
                                        hp4Var = hp4Var3;
                                        i35 = i9;
                                        i34 = i8;
                                        unsafe4 = unsafe2;
                                        obj2 = obj4;
                                        bArr2 = bArr4;
                                        if (i35 == i4) {
                                        }
                                        sp4Var = (sp4) obj2;
                                        mq4VarB = sp4Var.zzc;
                                        if (mq4VarB == mq4Var) {
                                            mq4VarB = mq4.b();
                                            sp4Var.zzc = mq4VarB;
                                        }
                                        int i4111 = i35;
                                        int iL14 = pi4.l(i4111 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                                        dq4Var = this;
                                        hp4Var = hp4Var;
                                        i35 = i4111 == true ? 1 : 0;
                                        i3 = i3;
                                        i31 = i6;
                                        obj5 = obj2;
                                        i32 = i32;
                                        unsafe4 = unsafe4;
                                        i33 = i5;
                                        i36 = 1048575;
                                        iM4 = iL14;
                                        bArr6 = bArr;
                                    }
                                    break;
                            }
                        } else {
                            unsafe4 = unsafe4;
                            Object obj12 = obj5;
                            i32 = iW;
                            i5 = i33;
                            if (iX != 27) {
                                int i66 = i35 == true ? 1 : 0;
                                if (iX <= 49) {
                                    i35 = i66;
                                    int i67 = i34;
                                    long j4 = i43;
                                    vp4 vp4VarA = (vp4) unsafe4.getObject(obj12, j2);
                                    if (!((fp4) vp4VarA).c) {
                                        int size = vp4VarA.size();
                                        vp4VarA = vp4VarA.a(size + size);
                                        unsafe4.putObject(obj12, j2, vp4VarA);
                                    }
                                    switch (iX) {
                                        case 18:
                                        case 35:
                                            i20 = i38;
                                            i39 = i39;
                                            mq4Var = mq4Var3;
                                            if (z == 2) {
                                                m51.t();
                                                return 0;
                                            }
                                            if (z == 1) {
                                                m51.t();
                                                return 0;
                                            }
                                            iM4 = i20;
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                            break;
                                        case 19:
                                        case 36:
                                            i20 = i38;
                                            i39 = i39;
                                            mq4Var = mq4Var3;
                                            if (z == 2) {
                                                m51.t();
                                                return 0;
                                            }
                                            if (z == 5) {
                                                m51.t();
                                                return 0;
                                            }
                                            iM4 = i20;
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                            break;
                                        case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i20 = i38;
                                            i39 = i39;
                                            mq4Var = mq4Var3;
                                            if (z == 2) {
                                                m51.t();
                                                return 0;
                                            }
                                            if (z == 0) {
                                                m51.t();
                                                return 0;
                                            }
                                            iM4 = i20;
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            vp4 vp4Var = vp4VarA;
                                            i21 = i38;
                                            i39 = i39;
                                            mq4Var = mq4Var3;
                                            i22 = i35 == true ? 1 : 0;
                                            if (z != 2) {
                                                if (z == 0) {
                                                    int iO = pi4.o(i22 == true ? 1 : 0, bArr, i21, i3, vp4Var, hp4Var);
                                                    i35 = i22 == true ? 1 : 0;
                                                    i20 = i21;
                                                    iM4 = iO;
                                                }
                                                i35 = i22;
                                                i20 = i21;
                                                iM4 = i20;
                                                if (iM4 != i20) {
                                                    obj5 = obj;
                                                    bArr6 = bArr;
                                                    i3 = i3;
                                                    i34 = i67;
                                                    i31 = i39;
                                                    i33 = i5;
                                                } else {
                                                    obj2 = obj;
                                                    bArr2 = bArr;
                                                    i4 = i4;
                                                    i7 = iM4;
                                                    i34 = i67;
                                                    i6 = i39;
                                                    hp4Var = hp4Var;
                                                }
                                            } else {
                                                iK = pi4.k(bArr, i21, vp4Var, hp4Var);
                                                int i68 = i21;
                                                iM4 = iK;
                                                i20 = i68;
                                                i35 = i22;
                                            }
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i22 = i35 == true ? 1 : 0;
                                            i21 = i38;
                                            i39 = i39;
                                            mq4Var = mq4Var3;
                                            if (z == 2) {
                                                m51.t();
                                                return 0;
                                            }
                                            if (z == 1) {
                                                m51.t();
                                                return 0;
                                            }
                                            i35 = i22;
                                            i20 = i21;
                                            iM4 = i20;
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            vp4 vp4Var2 = vp4VarA;
                                            i21 = i38;
                                            i39 = i39;
                                            mq4Var = mq4Var3;
                                            i22 = i35 == true ? 1 : 0;
                                            if (z != 2) {
                                                if (z == 5) {
                                                    iK = i21 + 4;
                                                    tp4 tp4Var = (tp4) vp4Var2;
                                                    tp4Var.j(pi4.i(i21, bArr));
                                                    while (iK < i3) {
                                                        int iM6 = pi4.m(bArr, iK, hp4Var);
                                                        if (i22 == hp4Var.a) {
                                                            tp4Var.j(pi4.i(iM6, bArr));
                                                            iK = iM6 + 4;
                                                        } else {
                                                            int i69 = i21;
                                                            iM4 = iK;
                                                            i20 = i69;
                                                            i35 = i22;
                                                        }
                                                    }
                                                    int i610 = i21;
                                                    iM4 = iK;
                                                    i20 = i610;
                                                    i35 = i22;
                                                }
                                                i35 = i22;
                                                i20 = i21;
                                                iM4 = i20;
                                                if (iM4 != i20) {
                                                    obj5 = obj;
                                                    bArr6 = bArr;
                                                    i3 = i3;
                                                    i34 = i67;
                                                    i31 = i39;
                                                    i33 = i5;
                                                } else {
                                                    obj2 = obj;
                                                    bArr2 = bArr;
                                                    i4 = i4;
                                                    i7 = iM4;
                                                    i34 = i67;
                                                    i6 = i39;
                                                    hp4Var = hp4Var;
                                                }
                                            } else {
                                                tp4 tp4Var2 = (tp4) vp4Var2;
                                                int iM7 = pi4.m(bArr, i21, hp4Var);
                                                int i70 = hp4Var.a;
                                                if (i70 < 0) {
                                                    j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i70 > bArr.length - iM7) {
                                                    j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                int i71 = iM7 + i70;
                                                int i72 = tp4Var2.h + (i70 >> 2);
                                                int length2 = tp4Var2.d.length;
                                                if (i72 > length2) {
                                                    if (length2 != 0) {
                                                        while (length2 < i72) {
                                                            length2 = Math.max(((length2 * 3) / 2) + 1, 10);
                                                        }
                                                        tp4Var2.d = Arrays.copyOf(tp4Var2.d, length2);
                                                    } else {
                                                        tp4Var2.d = new int[Math.max(i72, 10)];
                                                    }
                                                }
                                                while (iM7 < i71) {
                                                    tp4Var2.j(pi4.i(iM7, bArr));
                                                    iM7 += 4;
                                                }
                                                if (iM7 != i71) {
                                                    j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                i35 = i22 == true ? 1 : 0;
                                                i20 = i21;
                                                iM4 = iM7;
                                            }
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i23 = i35 == true ? 1 : 0;
                                            i24 = i38;
                                            i39 = i39;
                                            mq4Var = mq4Var3;
                                            if (z == 2) {
                                                m51.t();
                                                return 0;
                                            }
                                            if (z == 0) {
                                                m51.t();
                                                return 0;
                                            }
                                            i35 = i23;
                                            i20 = i24;
                                            iM4 = i20;
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                            break;
                                        case 26:
                                            vp4 vp4Var3 = vp4VarA;
                                            i24 = i38;
                                            i39 = i39;
                                            mq4Var = mq4Var3;
                                            i23 = i35 == true ? 1 : 0;
                                            if (z == 2) {
                                                if ((j4 & 536870912) == 0) {
                                                    iM2 = pi4.m(bArr, i24, hp4Var);
                                                    int i73 = hp4Var.a;
                                                    if (i73 < 0) {
                                                        j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i73 == 0) {
                                                        vp4Var3.add(BuildConfig.VERSION_NAME);
                                                    } else {
                                                        vp4Var3.add(new String(bArr, iM2, i73, StandardCharsets.UTF_8));
                                                        iM2 += i73;
                                                    }
                                                    while (iM2 < i3) {
                                                        int iM8 = pi4.m(bArr, iM2, hp4Var);
                                                        if (i23 == hp4Var.a) {
                                                            iM2 = pi4.m(bArr, iM8, hp4Var);
                                                            int i74 = hp4Var.a;
                                                            if (i74 < 0) {
                                                                j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                return 0;
                                                            }
                                                            if (i74 == 0) {
                                                                vp4Var3.add(BuildConfig.VERSION_NAME);
                                                            } else {
                                                                vp4Var3.add(new String(bArr, iM2, i74, StandardCharsets.UTF_8));
                                                                iM2 += i74;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iM2 = pi4.m(bArr, i24, hp4Var);
                                                    int i75 = hp4Var.a;
                                                    if (i75 < 0) {
                                                        j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i75 == 0) {
                                                        vp4Var3.add(BuildConfig.VERSION_NAME);
                                                    } else {
                                                        int i76 = iM2 + i75;
                                                        if (!yq4.b(bArr, iM2, i76)) {
                                                            j93.l("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        vp4Var3.add(new String(bArr, iM2, i75, StandardCharsets.UTF_8));
                                                        iM2 = i76;
                                                    }
                                                    while (iM2 < i3) {
                                                        int iM9 = pi4.m(bArr, iM2, hp4Var);
                                                        if (i23 == hp4Var.a) {
                                                            iM2 = pi4.m(bArr, iM9, hp4Var);
                                                            int i77 = hp4Var.a;
                                                            if (i77 < 0) {
                                                                j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                return 0;
                                                            }
                                                            if (i77 == 0) {
                                                                vp4Var3.add(BuildConfig.VERSION_NAME);
                                                            } else {
                                                                int i78 = iM2 + i77;
                                                                if (!yq4.b(bArr, iM2, i78)) {
                                                                    j93.l("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                vp4Var3.add(new String(bArr, iM2, i77, StandardCharsets.UTF_8));
                                                                iM2 = i78;
                                                            }
                                                        }
                                                    }
                                                }
                                                iM4 = iM2;
                                                i20 = i24;
                                                i35 = i23 == true ? 1 : 0;
                                            } else {
                                                i35 = i23;
                                                i20 = i24;
                                                iM4 = i20;
                                            }
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                        case 27:
                                            vp4 vp4Var4 = vp4VarA;
                                            i22 = i35 == true ? 1 : 0;
                                            i21 = i38;
                                            i39 = i39;
                                            mq4Var = mq4Var3;
                                            if (z == 2) {
                                                iK = pi4.j(dq4Var.B(i32), i22 == true ? 1 : 0, bArr, i21, i3, vp4Var4, hp4Var);
                                                int i611 = i21;
                                                iM4 = iK;
                                                i20 = i611;
                                                i35 = i22;
                                                if (iM4 != i20) {
                                                    obj5 = obj;
                                                    bArr6 = bArr;
                                                    i3 = i3;
                                                    i34 = i67;
                                                    i31 = i39;
                                                    i33 = i5;
                                                } else {
                                                    obj2 = obj;
                                                    bArr2 = bArr;
                                                    i4 = i4;
                                                    i7 = iM4;
                                                    i34 = i67;
                                                    i6 = i39;
                                                    hp4Var = hp4Var;
                                                }
                                            } else {
                                                i35 = i22;
                                                i20 = i21;
                                                iM4 = i20;
                                                if (iM4 != i20) {
                                                    obj5 = obj;
                                                    bArr6 = bArr;
                                                    i3 = i3;
                                                    i34 = i67;
                                                    i31 = i39;
                                                    i33 = i5;
                                                } else {
                                                    obj2 = obj;
                                                    bArr2 = bArr;
                                                    i4 = i4;
                                                    i7 = iM4;
                                                    i34 = i67;
                                                    i6 = i39;
                                                    hp4Var = hp4Var;
                                                }
                                            }
                                            break;
                                        case 28:
                                            vp4 vp4Var5 = vp4VarA;
                                            i22 = i35 == true ? 1 : 0;
                                            i21 = i38;
                                            i39 = i39;
                                            mq4Var = mq4Var3;
                                            if (z == 2) {
                                                int iM10 = pi4.m(bArr, i21, hp4Var);
                                                int i79 = hp4Var.a;
                                                if (i79 < 0) {
                                                    j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i79 > bArr.length - iM10) {
                                                    j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                if (i79 == 0) {
                                                    vp4Var5.add(jp4.d);
                                                } else {
                                                    vp4Var5.add(jp4.o(bArr, iM10, i79));
                                                    iM10 += i79;
                                                }
                                                while (iM10 < i3) {
                                                    int iM11 = pi4.m(bArr, iM10, hp4Var);
                                                    if (i22 == hp4Var.a) {
                                                        iM10 = pi4.m(bArr, iM11, hp4Var);
                                                        int i80 = hp4Var.a;
                                                        if (i80 < 0) {
                                                            j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i80 > bArr.length - iM10) {
                                                            j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                        if (i80 == 0) {
                                                            vp4Var5.add(jp4.d);
                                                        } else {
                                                            vp4Var5.add(jp4.o(bArr, iM10, i80));
                                                            iM10 += i80;
                                                        }
                                                    } else {
                                                        i35 = i22 == true ? 1 : 0;
                                                        i20 = i21;
                                                        iM4 = iM10;
                                                    }
                                                }
                                                i35 = i22 == true ? 1 : 0;
                                                i20 = i21;
                                                iM4 = iM10;
                                            } else {
                                                i35 = i22;
                                                i20 = i21;
                                                iM4 = i20;
                                            }
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            vp4 vp4Var6 = vp4VarA;
                                            i21 = i38;
                                            if (z == 2) {
                                                iK2 = pi4.k(bArr, i21, vp4Var6, hp4Var);
                                                i25 = i35 == true ? 1 : 0;
                                            } else if (z != 0) {
                                                i39 = i39;
                                                mq4Var = mq4Var3;
                                                i20 = i21;
                                                iM4 = i20;
                                                if (iM4 != i20) {
                                                    obj5 = obj;
                                                    bArr6 = bArr;
                                                    i3 = i3;
                                                    i34 = i67;
                                                    i31 = i39;
                                                    i33 = i5;
                                                } else {
                                                    obj2 = obj;
                                                    bArr2 = bArr;
                                                    i4 = i4;
                                                    i7 = iM4;
                                                    i34 = i67;
                                                    i6 = i39;
                                                    hp4Var = hp4Var;
                                                }
                                            } else {
                                                int iO2 = pi4.o(i35 == true ? 1 : 0, bArr, i21, i3, vp4Var6, hp4Var);
                                                i21 = i21;
                                                i25 = i35 == true ? 1 : 0;
                                                iK2 = iO2;
                                            }
                                            bp4 bp4VarA2 = dq4Var.A(i32);
                                            zf3 zf3Var = kq4.a;
                                            if (bp4VarA2 != null) {
                                                int size2 = vp4Var6.size();
                                                i26 = iK2;
                                                mq4 mq4Var4 = null;
                                                int i81 = 0;
                                                int i82 = 0;
                                                while (i81 < size2) {
                                                    int i83 = i39;
                                                    Integer num = (Integer) vp4Var6.get(i81);
                                                    int iIntValue = num.intValue();
                                                    if (bp4VarA2.a(iIntValue)) {
                                                        if (i81 != i82) {
                                                            vp4Var6.set(i82, num);
                                                        }
                                                        i82++;
                                                        i81 = i81;
                                                        mq4Var3 = mq4Var3;
                                                        mq4VarB2 = mq4Var4;
                                                        bp4VarA2 = bp4VarA2;
                                                    } else {
                                                        if (mq4Var4 == null) {
                                                            sp4 sp4Var3 = (sp4) obj;
                                                            mq4VarB2 = sp4Var3.zzc;
                                                            if (mq4VarB2 == mq4Var3) {
                                                                mq4VarB2 = mq4.b();
                                                                sp4Var3.zzc = mq4VarB2;
                                                            }
                                                        } else {
                                                            mq4VarB2 = mq4Var4;
                                                        }
                                                        mq4VarB2.c(i83 << 3, Long.valueOf(iIntValue));
                                                    }
                                                    bp4 bp4Var = bp4VarA2;
                                                    mq4Var4 = mq4VarB2;
                                                    i81++;
                                                    bp4VarA2 = bp4Var;
                                                    mq4Var3 = mq4Var3;
                                                    i39 = i83;
                                                }
                                                i39 = i39;
                                                mq4Var = mq4Var3;
                                                if (i82 != size2) {
                                                    vp4Var6.subList(i82, size2).clear();
                                                }
                                            } else {
                                                i26 = iK2;
                                                i39 = i39;
                                                mq4Var = mq4Var3;
                                            }
                                            i35 = i25;
                                            i20 = i21;
                                            iM4 = i26;
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            vp4 vp4Var7 = vp4VarA;
                                            i27 = i38;
                                            if (z != 2) {
                                                if (z == 0) {
                                                    tp4 tp4Var3 = (tp4) vp4Var7;
                                                    int iM12 = pi4.m(bArr, i27, hp4Var);
                                                    tp4Var3.j(hj4.c(hp4Var.a));
                                                    while (iM12 < i3) {
                                                        int iM13 = pi4.m(bArr, iM12, hp4Var);
                                                        if (i35 == hp4Var.a) {
                                                            iM12 = pi4.m(bArr, iM13, hp4Var);
                                                            tp4Var3.j(hj4.c(hp4Var.a));
                                                        } else {
                                                            i20 = i27;
                                                            i39 = i39;
                                                            iM4 = iM12;
                                                        }
                                                    }
                                                    i20 = i27;
                                                    i39 = i39;
                                                    iM4 = iM12;
                                                }
                                                i20 = i27;
                                                mq4Var = mq4Var3;
                                                iM4 = i20;
                                                if (iM4 != i20) {
                                                    obj5 = obj;
                                                    bArr6 = bArr;
                                                    i3 = i3;
                                                    i34 = i67;
                                                    i31 = i39;
                                                    i33 = i5;
                                                } else {
                                                    obj2 = obj;
                                                    bArr2 = bArr;
                                                    i4 = i4;
                                                    i7 = iM4;
                                                    i34 = i67;
                                                    i6 = i39;
                                                    hp4Var = hp4Var;
                                                }
                                            } else {
                                                tp4 tp4Var4 = (tp4) vp4Var7;
                                                int iM14 = pi4.m(bArr, i27, hp4Var);
                                                int i84 = hp4Var.a;
                                                if (i84 < 0) {
                                                    j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i84 > bArr.length - iM14) {
                                                    j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                int i85 = i84 + iM14;
                                                while (iM14 < i85) {
                                                    iM14 = pi4.m(bArr, iM14, hp4Var);
                                                    tp4Var4.j(hj4.c(hp4Var.a));
                                                }
                                                if (iM14 != i85) {
                                                    j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                i20 = i27;
                                                iM4 = iM14;
                                            }
                                            mq4Var = mq4Var3;
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            i27 = i38;
                                            if (z == 2) {
                                                m51.t();
                                                return 0;
                                            }
                                            if (z == 0) {
                                                m51.t();
                                                return 0;
                                            }
                                            i20 = i27;
                                            mq4Var = mq4Var3;
                                            iM4 = i20;
                                            if (iM4 != i20) {
                                                obj5 = obj;
                                                bArr6 = bArr;
                                                i3 = i3;
                                                i34 = i67;
                                                i31 = i39;
                                                i33 = i5;
                                            } else {
                                                obj2 = obj;
                                                bArr2 = bArr;
                                                i4 = i4;
                                                i7 = iM4;
                                                i34 = i67;
                                                i6 = i39;
                                                hp4Var = hp4Var;
                                            }
                                            break;
                                            break;
                                        default:
                                            if (z == 3) {
                                                int i86 = ((i35 == true ? 1 : 0) & (-8)) | 4;
                                                jq4 jq4VarB = dq4Var.B(i32);
                                                sp4 sp4VarF = jq4VarB.f();
                                                vp4 vp4Var8 = vp4VarA;
                                                int i87 = i38;
                                                int iQ = pi4.q(sp4VarF, jq4VarB, bArr, i87, i3, i86, hp4Var);
                                                int i88 = i86;
                                                hp4 hp4Var6 = hp4Var;
                                                jq4VarB.a(sp4VarF);
                                                hp4Var6.c = sp4VarF;
                                                vp4Var8.add(sp4VarF);
                                                while (iQ < i3) {
                                                    int i89 = i87;
                                                    int iM15 = pi4.m(bArr, iQ, hp4Var6);
                                                    if (i35 != hp4Var6.a) {
                                                        i87 = i89;
                                                        i20 = i87;
                                                        iM4 = iQ;
                                                        mq4Var = mq4Var3;
                                                        if (iM4 != i20) {
                                                            obj5 = obj;
                                                            bArr6 = bArr;
                                                            i3 = i3;
                                                            i34 = i67;
                                                            i31 = i39;
                                                            i33 = i5;
                                                        } else {
                                                            obj2 = obj;
                                                            bArr2 = bArr;
                                                            i4 = i4;
                                                            i7 = iM4;
                                                            i34 = i67;
                                                            i6 = i39;
                                                            hp4Var = hp4Var;
                                                        }
                                                    } else {
                                                        int i90 = i88;
                                                        sp4 sp4VarF2 = jq4VarB.f();
                                                        iQ = pi4.q(sp4VarF2, jq4VarB, bArr, iM15, i3, i90, hp4Var);
                                                        i88 = i90;
                                                        hp4Var6 = hp4Var;
                                                        jq4VarB.a(sp4VarF2);
                                                        hp4Var6.c = sp4VarF2;
                                                        vp4Var8.add(sp4VarF2);
                                                        i87 = i89;
                                                    }
                                                    break;
                                                }
                                                i20 = i87;
                                                iM4 = iQ;
                                                mq4Var = mq4Var3;
                                                if (iM4 != i20) {
                                                    obj5 = obj;
                                                    bArr6 = bArr;
                                                    i3 = i3;
                                                    i34 = i67;
                                                    i31 = i39;
                                                    i33 = i5;
                                                } else {
                                                    obj2 = obj;
                                                    bArr2 = bArr;
                                                    i4 = i4;
                                                    i7 = iM4;
                                                    i34 = i67;
                                                    i6 = i39;
                                                    hp4Var = hp4Var;
                                                }
                                            } else {
                                                i20 = i38;
                                                mq4Var = mq4Var3;
                                                iM4 = i20;
                                                if (iM4 != i20) {
                                                    obj5 = obj;
                                                    bArr6 = bArr;
                                                    i3 = i3;
                                                    i34 = i67;
                                                    i31 = i39;
                                                    i33 = i5;
                                                } else {
                                                    obj2 = obj;
                                                    bArr2 = bArr;
                                                    i4 = i4;
                                                    i7 = iM4;
                                                    i34 = i67;
                                                    i6 = i39;
                                                    hp4Var = hp4Var;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    i19 = i34;
                                    i18 = i38;
                                    i6 = i39;
                                    mq4Var = mq4Var3;
                                    if (iX != 50) {
                                        i35 = i66;
                                        obj2 = obj;
                                        long j5 = iArr[i32 + 2] & 1048575;
                                        switch (iX) {
                                            case 51:
                                                hp4Var = hp4Var;
                                                i6 = i6;
                                                i28 = i32;
                                                i29 = i18;
                                                bArr2 = bArr;
                                                if (z == 1) {
                                                    iP = i29 + 8;
                                                    unsafe4.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(pi4.s(i29, bArr2))));
                                                    unsafe4.putInt(obj2, j5, i6);
                                                } else {
                                                    iP = i29;
                                                }
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 52:
                                                hp4Var = hp4Var;
                                                i6 = i6;
                                                i28 = i32;
                                                i29 = i18;
                                                bArr2 = bArr;
                                                if (z == 5) {
                                                    iP = i29 + 4;
                                                    unsafe4.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(pi4.i(i29, bArr2))));
                                                    unsafe4.putInt(obj2, j5, i6);
                                                } else {
                                                    iP = i29;
                                                }
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                hp4Var = hp4Var;
                                                i6 = i6;
                                                i28 = i32;
                                                i29 = i18;
                                                bArr2 = bArr;
                                                if (z == 0) {
                                                    iP = pi4.p(bArr2, i29, hp4Var);
                                                    unsafe4.putObject(obj2, j2, Long.valueOf(hp4Var.b));
                                                    unsafe4.putInt(obj2, j5, i6);
                                                } else {
                                                    iP = i29;
                                                }
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                hp4Var = hp4Var;
                                                i6 = i6;
                                                i28 = i32;
                                                i29 = i18;
                                                bArr2 = bArr;
                                                if (z == 0) {
                                                    iP = pi4.m(bArr2, i29, hp4Var);
                                                    unsafe4.putObject(obj2, j2, Integer.valueOf(hp4Var.a));
                                                    unsafe4.putInt(obj2, j5, i6);
                                                } else {
                                                    iP = i29;
                                                }
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                hp4Var = hp4Var;
                                                i6 = i6;
                                                i28 = i32;
                                                i29 = i18;
                                                bArr2 = bArr;
                                                if (z == 1) {
                                                    iP = i29 + 8;
                                                    unsafe4.putObject(obj2, j2, Long.valueOf(pi4.s(i29, bArr2)));
                                                    unsafe4.putInt(obj2, j5, i6);
                                                } else {
                                                    iP = i29;
                                                }
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                hp4Var = hp4Var;
                                                i6 = i6;
                                                i28 = i32;
                                                i29 = i18;
                                                bArr2 = bArr;
                                                if (z == 5) {
                                                    iP = i29 + 4;
                                                    unsafe4.putObject(obj2, j2, Integer.valueOf(pi4.i(i29, bArr2)));
                                                    unsafe4.putInt(obj2, j5, i6);
                                                } else {
                                                    iP = i29;
                                                }
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 58:
                                                hp4Var = hp4Var;
                                                i6 = i6;
                                                i28 = i32;
                                                i29 = i18;
                                                bArr2 = bArr;
                                                if (z == 0) {
                                                    iP = pi4.p(bArr2, i29, hp4Var);
                                                    unsafe4.putObject(obj2, j2, Boolean.valueOf(hp4Var.b != 0));
                                                    unsafe4.putInt(obj2, j5, i6);
                                                } else {
                                                    iP = i29;
                                                }
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 59:
                                                i6 = i6;
                                                hp4Var = hp4Var;
                                                i28 = i32;
                                                i29 = i18;
                                                bArr2 = bArr;
                                                if (z == 2) {
                                                    int iM16 = pi4.m(bArr2, i29, hp4Var);
                                                    int i91 = hp4Var.a;
                                                    if (i91 == 0) {
                                                        unsafe4.putObject(obj2, j2, BuildConfig.VERSION_NAME);
                                                    } else {
                                                        int i92 = iM16 + i91;
                                                        if ((i43 & 536870912) != 0 && !yq4.b(bArr2, iM16, i92)) {
                                                            j93.l("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        unsafe4.putObject(obj2, j2, new String(bArr2, iM16, i91, StandardCharsets.UTF_8));
                                                        iM16 = i92;
                                                    }
                                                    unsafe4.putInt(obj2, j5, i6);
                                                    iP = iM16;
                                                } else {
                                                    iP = i29;
                                                }
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 60:
                                                i6 = i6;
                                                bArr2 = bArr;
                                                if (z == 2) {
                                                    Object objD = dq4Var.D(i6, i32, obj2);
                                                    int iR = pi4.r(objD, dq4Var.B(i32), bArr, i18, i3, hp4Var);
                                                    bArr2 = bArr;
                                                    dq4Var.n(i6, i32, obj2, objD);
                                                    iP = iR;
                                                    i28 = i32;
                                                    i29 = i18;
                                                    hp4Var = hp4Var;
                                                } else {
                                                    i28 = i32;
                                                    i29 = i18;
                                                    hp4Var = hp4Var;
                                                    iP = i29;
                                                }
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 61:
                                                hp4Var5 = hp4Var;
                                                i30 = i18;
                                                i6 = i6;
                                                bArr2 = bArr;
                                                if (z == 2) {
                                                    iH = pi4.h(bArr2, i30, hp4Var5);
                                                    unsafe4.putObject(obj2, j2, hp4Var5.c);
                                                    unsafe4.putInt(obj2, j5, i6);
                                                    iP = iH;
                                                    i28 = i32;
                                                    i29 = i30;
                                                    hp4Var = hp4Var5;
                                                    if (iP != i29) {
                                                        i3 = i3;
                                                        bArr6 = bArr2;
                                                        hp4Var = hp4Var;
                                                        i31 = i6;
                                                        obj5 = obj2;
                                                        unsafe4 = unsafe4;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i33 = i5;
                                                        i36 = 1048575;
                                                        iM4 = iP;
                                                        dq4Var = this;
                                                    } else {
                                                        i7 = iP;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i4 = i4;
                                                    }
                                                }
                                                i28 = i32;
                                                i29 = i30;
                                                hp4Var = hp4Var5;
                                                iP = i29;
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 63:
                                                hp4Var5 = hp4Var;
                                                i30 = i18;
                                                i6 = i6;
                                                bArr2 = bArr;
                                                i28 = i32;
                                                if (z == 0) {
                                                    iH = pi4.m(bArr2, i30, hp4Var5);
                                                    int i93 = hp4Var5.a;
                                                    i32 = i28;
                                                    bp4 bp4VarA3 = dq4Var.A(i32);
                                                    if (bp4VarA3 == null || bp4VarA3.a(i93)) {
                                                        mq4Var = mq4Var;
                                                        unsafe4.putObject(obj2, j2, Integer.valueOf(i93));
                                                        unsafe4.putInt(obj2, j5, i6);
                                                    } else {
                                                        sp4 sp4Var4 = (sp4) obj2;
                                                        mq4 mq4VarB4 = sp4Var4.zzc;
                                                        if (mq4VarB4 == mq4Var) {
                                                            mq4Var = mq4Var;
                                                            mq4VarB4 = mq4.b();
                                                            sp4Var4.zzc = mq4VarB4;
                                                        }
                                                        mq4Var = mq4Var;
                                                        mq4VarB4.c(i35 == true ? 1 : 0, Long.valueOf(i93));
                                                    }
                                                    iP = iH;
                                                    i28 = i32;
                                                    i29 = i30;
                                                    hp4Var = hp4Var5;
                                                    if (iP != i29) {
                                                        i3 = i3;
                                                        bArr6 = bArr2;
                                                        hp4Var = hp4Var;
                                                        i31 = i6;
                                                        obj5 = obj2;
                                                        unsafe4 = unsafe4;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i33 = i5;
                                                        i36 = 1048575;
                                                        iM4 = iP;
                                                        dq4Var = this;
                                                    } else {
                                                        i7 = iP;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i4 = i4;
                                                    }
                                                } else {
                                                    mq4Var = mq4Var;
                                                    i29 = i30;
                                                    hp4Var = hp4Var5;
                                                    iP = i29;
                                                    if (iP != i29) {
                                                        i3 = i3;
                                                        bArr6 = bArr2;
                                                        hp4Var = hp4Var;
                                                        i31 = i6;
                                                        obj5 = obj2;
                                                        unsafe4 = unsafe4;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i33 = i5;
                                                        i36 = 1048575;
                                                        iM4 = iP;
                                                        dq4Var = this;
                                                    } else {
                                                        i7 = iP;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i4 = i4;
                                                    }
                                                }
                                                break;
                                            case 66:
                                                hp4Var5 = hp4Var;
                                                i30 = i18;
                                                mq4Var2 = mq4Var;
                                                i6 = i6;
                                                bArr2 = bArr;
                                                i28 = i32;
                                                if (z == 0) {
                                                    iM3 = pi4.m(bArr2, i30, hp4Var5);
                                                    unsafe4.putObject(obj2, j2, Integer.valueOf(hj4.c(hp4Var5.a)));
                                                    unsafe4.putInt(obj2, j5, i6);
                                                    i29 = i30;
                                                    iP = iM3;
                                                    hp4Var = hp4Var5;
                                                    mq4Var = mq4Var2;
                                                    if (iP != i29) {
                                                        i3 = i3;
                                                        bArr6 = bArr2;
                                                        hp4Var = hp4Var;
                                                        i31 = i6;
                                                        obj5 = obj2;
                                                        unsafe4 = unsafe4;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i33 = i5;
                                                        i36 = 1048575;
                                                        iM4 = iP;
                                                        dq4Var = this;
                                                    } else {
                                                        i7 = iP;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i4 = i4;
                                                    }
                                                } else {
                                                    i29 = i30;
                                                    hp4Var = hp4Var5;
                                                    mq4Var = mq4Var2;
                                                    iP = i29;
                                                    if (iP != i29) {
                                                        i3 = i3;
                                                        bArr6 = bArr2;
                                                        hp4Var = hp4Var;
                                                        i31 = i6;
                                                        obj5 = obj2;
                                                        unsafe4 = unsafe4;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i33 = i5;
                                                        i36 = 1048575;
                                                        iM4 = iP;
                                                        dq4Var = this;
                                                    } else {
                                                        i7 = iP;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i4 = i4;
                                                    }
                                                }
                                                break;
                                            case 67:
                                                hp4Var5 = hp4Var;
                                                i30 = i18;
                                                i6 = i6;
                                                bArr2 = bArr;
                                                if (z == 0) {
                                                    iM3 = pi4.p(bArr2, i30, hp4Var5);
                                                    i28 = i32;
                                                    mq4Var2 = mq4Var;
                                                    long j6 = hp4Var5.b;
                                                    unsafe4.putObject(obj2, j2, Long.valueOf((j6 >>> 1) ^ (-(j6 & 1))));
                                                    unsafe4.putInt(obj2, j5, i6);
                                                    i29 = i30;
                                                    iP = iM3;
                                                    hp4Var = hp4Var5;
                                                    mq4Var = mq4Var2;
                                                    if (iP != i29) {
                                                        i3 = i3;
                                                        bArr6 = bArr2;
                                                        hp4Var = hp4Var;
                                                        i31 = i6;
                                                        obj5 = obj2;
                                                        unsafe4 = unsafe4;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i33 = i5;
                                                        i36 = 1048575;
                                                        iM4 = iP;
                                                        dq4Var = this;
                                                    } else {
                                                        i7 = iP;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i4 = i4;
                                                    }
                                                }
                                                i28 = i32;
                                                i29 = i30;
                                                hp4Var = hp4Var5;
                                                iP = i29;
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                            case 68:
                                                if (z == 3) {
                                                    int i94 = ((i35 == true ? 1 : 0) & (-8)) | 4;
                                                    i30 = i18;
                                                    i6 = i6;
                                                    Object objD2 = dq4Var.D(i6, i32, obj2);
                                                    int iQ2 = pi4.q(objD2, dq4Var.B(i32), bArr, i30, i3, i94, hp4Var);
                                                    bArr2 = bArr;
                                                    hp4Var5 = hp4Var;
                                                    dq4Var.n(i6, i32, obj2, objD2);
                                                    iP = iQ2;
                                                    i28 = i32;
                                                    i29 = i30;
                                                    hp4Var = hp4Var5;
                                                    if (iP != i29) {
                                                        i3 = i3;
                                                        bArr6 = bArr2;
                                                        hp4Var = hp4Var;
                                                        i31 = i6;
                                                        obj5 = obj2;
                                                        unsafe4 = unsafe4;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i33 = i5;
                                                        i36 = 1048575;
                                                        iM4 = iP;
                                                        dq4Var = this;
                                                    } else {
                                                        i7 = iP;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i4 = i4;
                                                    }
                                                } else {
                                                    i28 = i32;
                                                    i29 = i18;
                                                    bArr2 = bArr;
                                                    iP = i29;
                                                    if (iP != i29) {
                                                        i3 = i3;
                                                        bArr6 = bArr2;
                                                        hp4Var = hp4Var;
                                                        i31 = i6;
                                                        obj5 = obj2;
                                                        unsafe4 = unsafe4;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i33 = i5;
                                                        i36 = 1048575;
                                                        iM4 = iP;
                                                        dq4Var = this;
                                                    } else {
                                                        i7 = iP;
                                                        i34 = i19;
                                                        i32 = i28;
                                                        i4 = i4;
                                                    }
                                                }
                                                break;
                                            default:
                                                i28 = i32;
                                                i29 = i18;
                                                bArr2 = bArr;
                                                iP = i29;
                                                if (iP != i29) {
                                                    i3 = i3;
                                                    bArr6 = bArr2;
                                                    hp4Var = hp4Var;
                                                    i31 = i6;
                                                    obj5 = obj2;
                                                    unsafe4 = unsafe4;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i33 = i5;
                                                    i36 = 1048575;
                                                    iM4 = iP;
                                                    dq4Var = this;
                                                } else {
                                                    i7 = iP;
                                                    i34 = i19;
                                                    i32 = i28;
                                                    i4 = i4;
                                                }
                                                break;
                                        }
                                    } else {
                                        i35 = i66;
                                        if (z == 2) {
                                            int i95 = i32 / 3;
                                            Object obj13 = objArr[i95 + i95];
                                            Object object = unsafe4.getObject(obj, j2);
                                            if (!((bq4) object).c) {
                                                bq4 bq4Var2 = bq4.d;
                                                if (bq4Var2.isEmpty()) {
                                                    bq4Var = new bq4();
                                                } else {
                                                    bq4 bq4Var3 = new bq4(bq4Var2);
                                                    bq4Var3.c = true;
                                                    bq4Var = bq4Var3;
                                                }
                                                qj4.a(bq4Var, object);
                                                unsafe4.putObject(obj, j2, bq4Var);
                                            }
                                            obj13.getClass();
                                            m51.t();
                                            return 0;
                                        }
                                        obj2 = obj;
                                        hp4Var = hp4Var;
                                        i7 = i18;
                                        i34 = i19;
                                        i6 = i6;
                                    }
                                }
                            } else if (z == 2) {
                                vp4 vp4VarA2 = (vp4) unsafe4.getObject(obj12, j2);
                                if (!((fp4) vp4VarA2).c) {
                                    int size3 = vp4VarA2.size();
                                    vp4VarA2 = vp4VarA2.a(size3 == 0 ? 10 : size3 + size3);
                                    unsafe4.putObject(obj12, j2, vp4VarA2);
                                }
                                bArr6 = bArr;
                                i3 = i3;
                                iM4 = pi4.j(dq4Var.B(i32), i35 == true ? 1 : 0, bArr6, i38, i3, vp4VarA2, hp4Var);
                                i35 = i35 == true ? 1 : 0;
                                obj5 = obj;
                                i31 = i39;
                                i33 = i5;
                            } else {
                                obj2 = obj12;
                                i35 = i35 == true ? 1 : 0;
                                i18 = i38;
                                i6 = i39;
                                i19 = i34;
                                mq4Var = mq4Var3;
                                hp4Var = hp4Var;
                                i7 = i18;
                                i34 = i19;
                                i6 = i6;
                            }
                            if (i35 == i4) {
                            }
                            sp4Var = (sp4) obj2;
                            mq4VarB = sp4Var.zzc;
                            if (mq4VarB == mq4Var) {
                                mq4VarB = mq4.b();
                                sp4Var.zzc = mq4VarB;
                            }
                            int i4112 = i35;
                            int iL15 = pi4.l(i4112 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                            dq4Var = this;
                            hp4Var = hp4Var;
                            i35 = i4112 == true ? 1 : 0;
                            i3 = i3;
                            i31 = i6;
                            obj5 = obj2;
                            i32 = i32;
                            unsafe4 = unsafe4;
                            i33 = i5;
                            i36 = 1048575;
                            iM4 = iL15;
                            bArr6 = bArr;
                        }
                    }
                    bArr2 = bArr;
                    if (i35 == i4) {
                    }
                    sp4Var = (sp4) obj2;
                    mq4VarB = sp4Var.zzc;
                    if (mq4VarB == mq4Var) {
                        mq4VarB = mq4.b();
                        sp4Var.zzc = mq4VarB;
                    }
                    int i4113 = i35;
                    int iL16 = pi4.l(i4113 == true ? 1 : 0, bArr2, i7, i3, mq4VarB, hp4Var);
                    dq4Var = this;
                    hp4Var = hp4Var;
                    i35 = i4113 == true ? 1 : 0;
                    i3 = i3;
                    i31 = i6;
                    obj5 = obj2;
                    i32 = i32;
                    unsafe4 = unsafe4;
                    i33 = i5;
                    i36 = 1048575;
                    iM4 = iL16;
                    bArr6 = bArr;
                } else {
                    i4 = i4;
                    i5 = i33;
                    iArr = iArr2;
                    objArr = objArr2;
                    unsafe4 = unsafe4;
                    obj2 = obj5;
                }
            }
        }
        int i96 = i5;
        if (i96 != 1048575) {
            unsafe4.putInt(obj2, i96, i34);
        }
        for (int i97 = this.g; i97 < this.h; i97++) {
            int i98 = this.f[i97];
            int i99 = iArr[i98];
            Object objD3 = rq4.d(obj2, y(i98) & 1048575);
            if (objD3 != null && A(i98) != null) {
                int i100 = i98 / 3;
                objArr[i100 + i100].getClass();
                m51.t();
                return 0;
            }
        }
        if (i4 == 0) {
            if (iM4 != i3) {
                j93.l("Failed to parse the message.");
                return 0;
            }
        } else if (iM4 > i3 || i35 != i4) {
            j93.l("Failed to parse the message.");
            return 0;
        }
        return iM4;
    }

    public final int w(int i2, int i3) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final int y(int i2) {
        return this.a[i2 + 1];
    }
}
