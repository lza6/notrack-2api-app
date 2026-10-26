package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import app.template.extension.BuildConfig;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import org.scilab.forge.jlatexmath.FontInfo;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class vd2 implements za3 {
    public static final int[] o = new int[0];
    public static final Unsafe p = o94.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final g0 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final ll2 k;
    public final g52 l;
    public final z84 m;
    public final u92 n;

    public vd2(int[] iArr, Object[] objArr, int i, int i2, g0 g0Var, boolean z, int[] iArr2, int i3, int i4, ll2 ll2Var, g52 g52Var, z84 z84Var, c61 c61Var, u92 u92Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = g0Var instanceof ef1;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = ll2Var;
        this.l = g52Var;
        this.m = z84Var;
        this.e = g0Var;
        this.n = u92Var;
    }

    public static vd2 B(o23 o23Var, ll2 ll2Var, g52 g52Var, z84 z84Var, c61 c61Var, u92 u92Var) {
        if (o23Var instanceof o23) {
            return C(o23Var, ll2Var, g52Var, z84Var, c61Var, u92Var);
        }
        m51.t();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x026a  */
    /* JADX WARN: Code duplicated, block: B:125:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0288  */
    /* JADX WARN: Code duplicated, block: B:129:0x028b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0375  */
    public static vd2 C(o23 o23Var, ll2 ll2Var, g52 g52Var, z84 z84Var, c61 c61Var, u92 u92Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        int i18;
        Field fieldO;
        char cCharAt9;
        int i19;
        int i20;
        Object obj;
        Field fieldO2;
        int i21;
        Object obj2;
        Field fieldO3;
        int i22;
        char cCharAt10;
        int i23;
        char cCharAt11;
        int i24;
        int i25;
        char cCharAt12;
        int i26;
        char cCharAt13;
        boolean z = (o23Var.d & 1) != 1;
        String str = o23Var.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i27 = 1;
            while (true) {
                i = i27 + 1;
                if (str.charAt(i27) < 55296) {
                    break;
                }
                i27 = i;
            }
        } else {
            i = 1;
        }
        int i28 = i + 1;
        int iCharAt4 = str.charAt(i);
        if (iCharAt4 >= 55296) {
            int i29 = iCharAt4 & 8191;
            int i30 = 13;
            while (true) {
                i26 = i28 + 1;
                cCharAt13 = str.charAt(i28);
                if (cCharAt13 < 55296) {
                    break;
                }
                i29 |= (cCharAt13 & 8191) << i30;
                i30 += 13;
                i28 = i26;
            }
            iCharAt4 = i29 | (cCharAt13 << i30);
            i28 = i26;
        }
        if (iCharAt4 == 0) {
            i5 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i2 = 0;
            iCharAt3 = 0;
            iArr = o;
            i3 = 0;
            i4 = 0;
        } else {
            int i31 = i28 + 1;
            int iCharAt5 = str.charAt(i28);
            if (iCharAt5 >= 55296) {
                int i32 = iCharAt5 & 8191;
                int i33 = 13;
                while (true) {
                    i13 = i31 + 1;
                    cCharAt8 = str.charAt(i31);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i32 |= (cCharAt8 & 8191) << i33;
                    i33 += 13;
                    i31 = i13;
                }
                iCharAt5 = i32 | (cCharAt8 << i33);
                i31 = i13;
            }
            int i34 = i31 + 1;
            int iCharAt6 = str.charAt(i31);
            if (iCharAt6 >= 55296) {
                int i35 = iCharAt6 & 8191;
                int i36 = 13;
                while (true) {
                    i12 = i34 + 1;
                    cCharAt7 = str.charAt(i34);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt7 & 8191) << i36;
                    i36 += 13;
                    i34 = i12;
                }
                iCharAt6 = i35 | (cCharAt7 << i36);
                i34 = i12;
            }
            int i37 = i34 + 1;
            int iCharAt7 = str.charAt(i34);
            if (iCharAt7 >= 55296) {
                int i38 = iCharAt7 & 8191;
                int i39 = 13;
                while (true) {
                    i11 = i37 + 1;
                    cCharAt6 = str.charAt(i37);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt6 & 8191) << i39;
                    i39 += 13;
                    i37 = i11;
                }
                iCharAt7 = i38 | (cCharAt6 << i39);
                i37 = i11;
            }
            int i40 = i37 + 1;
            int iCharAt8 = str.charAt(i37);
            if (iCharAt8 >= 55296) {
                int i41 = iCharAt8 & 8191;
                int i42 = 13;
                while (true) {
                    i10 = i40 + 1;
                    cCharAt5 = str.charAt(i40);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt5 & 8191) << i42;
                    i42 += 13;
                    i40 = i10;
                }
                iCharAt8 = i41 | (cCharAt5 << i42);
                i40 = i10;
            }
            int i43 = i40 + 1;
            iCharAt = str.charAt(i40);
            if (iCharAt >= 55296) {
                int i44 = iCharAt & 8191;
                int i45 = 13;
                while (true) {
                    i9 = i43 + 1;
                    cCharAt4 = str.charAt(i43);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt4 & 8191) << i45;
                    i45 += 13;
                    i43 = i9;
                }
                iCharAt = i44 | (cCharAt4 << i45);
                i43 = i9;
            }
            int i46 = i43 + 1;
            iCharAt2 = str.charAt(i43);
            if (iCharAt2 >= 55296) {
                int i47 = iCharAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i8 = i46 + 1;
                    cCharAt3 = str.charAt(i46);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt3 & 8191) << i48;
                    i48 += 13;
                    i46 = i8;
                }
                iCharAt2 = i47 | (cCharAt3 << i48);
                i46 = i8;
            }
            int i49 = i46 + 1;
            int iCharAt9 = str.charAt(i46);
            if (iCharAt9 >= 55296) {
                int i50 = iCharAt9 & 8191;
                int i51 = 13;
                while (true) {
                    i7 = i49 + 1;
                    cCharAt2 = str.charAt(i49);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt2 & 8191) << i51;
                    i51 += 13;
                    i49 = i7;
                }
                iCharAt9 = i50 | (cCharAt2 << i51);
                i49 = i7;
            }
            int i52 = i49 + 1;
            iCharAt3 = str.charAt(i49);
            if (iCharAt3 >= 55296) {
                int i53 = iCharAt3 & 8191;
                int i54 = i52;
                int i55 = 13;
                while (true) {
                    i6 = i54 + 1;
                    cCharAt = str.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i53 |= (cCharAt & 8191) << i55;
                    i55 += 13;
                    i54 = i6;
                }
                iCharAt3 = i53 | (cCharAt << i55);
                i52 = i6;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i2 = (iCharAt5 * 2) + iCharAt6;
            i3 = iCharAt7;
            i4 = iCharAt8;
            iArr = iArr2;
            i5 = iCharAt5;
            i28 = i52;
        }
        Unsafe unsafe = p;
        Object[] objArr = o23Var.c;
        Class<?> cls = o23Var.a.getClass();
        int i56 = i5;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i57 = iCharAt2 + iCharAt3;
        int i58 = i57;
        int i59 = iCharAt3;
        int i60 = 0;
        int i61 = 0;
        while (i28 < length) {
            int i62 = i28 + 1;
            int iCharAt10 = str.charAt(i28);
            int[] iArr4 = iArr3;
            if (iCharAt10 >= 55296) {
                int i63 = iCharAt10 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i25 = i64 + 1;
                    cCharAt12 = str.charAt(i64);
                    i14 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt12 & 8191) << i65;
                    i65 += 13;
                    i64 = i25;
                    length = i14;
                }
                iCharAt10 = i63 | (cCharAt12 << i65);
                i15 = i25;
            } else {
                i14 = length;
                i15 = i62;
            }
            int i66 = i15 + 1;
            int iCharAt11 = str.charAt(i15);
            if (iCharAt11 >= 55296) {
                int i67 = iCharAt11 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i23 = i68 + 1;
                    cCharAt11 = str.charAt(i68);
                    i24 = i67;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i67 = i24 | ((cCharAt11 & 8191) << i69);
                    i69 += 13;
                    i68 = i23;
                }
                iCharAt11 = i24 | (cCharAt11 << i69);
                i16 = i23;
            } else {
                i16 = i66;
            }
            int i70 = iCharAt10;
            int i71 = iCharAt11 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i72 = i3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            int i73 = i4;
            if (i71 >= 51) {
                int i74 = i16 + 1;
                int iCharAt12 = str.charAt(i16);
                char c = 55296;
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = 13;
                    while (true) {
                        i22 = i74 + 1;
                        cCharAt10 = str.charAt(i74);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i75 |= (cCharAt10 & 8191) << i76;
                        i76 += 13;
                        i74 = i22;
                        c = 55296;
                    }
                    iCharAt12 = i75 | (cCharAt10 << i76);
                    i74 = i22;
                }
                int i77 = i71 - 51;
                int i78 = iCharAt12;
                if (i77 == 9 || i77 == 17) {
                    i19 = i2 + 1;
                    objArr2[((i61 / 3) * 2) + 1] = objArr[i2];
                } else {
                    if (i77 == 12 && !z) {
                        i19 = i2 + 1;
                        objArr2[((i61 / 3) * 2) + 1] = objArr[i2];
                    }
                    i20 = i78 * 2;
                    obj = objArr[i20];
                    if (obj instanceof Field) {
                        fieldO2 = (Field) obj;
                    } else {
                        fieldO2 = O(cls, (String) obj);
                        objArr[i20] = fieldO2;
                    }
                    int i79 = i74;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO2);
                    i21 = i20 + 1;
                    obj2 = objArr[i21];
                    if (obj2 instanceof Field) {
                        fieldO3 = (Field) obj2;
                    } else {
                        fieldO3 = O(cls, (String) obj2);
                        objArr[i21] = fieldO3;
                    }
                    i17 = i79;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                    i18 = 0;
                }
                i2 = i19;
                i20 = i78 * 2;
                obj = objArr[i20];
                if (obj instanceof Field) {
                    fieldO2 = (Field) obj;
                } else {
                    fieldO2 = O(cls, (String) obj);
                    objArr[i20] = fieldO2;
                }
                int i710 = i74;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldO2);
                i21 = i20 + 1;
                obj2 = objArr[i21];
                if (obj2 instanceof Field) {
                    fieldO3 = (Field) obj2;
                } else {
                    fieldO3 = O(cls, (String) obj2);
                    objArr[i21] = fieldO3;
                }
                i17 = i710;
                iObjectFieldOffset = iObjectFieldOffset4;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                i18 = 0;
            } else {
                int i80 = i2 + 1;
                Field fieldO4 = O(cls, (String) objArr[i2]);
                if (i71 == 9 || i71 == 17) {
                    objArr2[((i61 / 3) * 2) + 1] = fieldO4.getType();
                } else {
                    if (i71 == 27 || i71 == 49) {
                        i2 += 2;
                        objArr2[((i61 / 3) * 2) + 1] = objArr[i80];
                    } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                        if (!z) {
                            i2 += 2;
                            objArr2[((i61 / 3) * 2) + 1] = objArr[i80];
                        }
                    } else if (i71 == 50) {
                        int i81 = i59 + 1;
                        iArr[i59] = i61;
                        int i82 = (i61 / 3) * 2;
                        int i83 = i2 + 2;
                        objArr2[i82] = objArr[i80];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr2[i82 + 1] = objArr[i83];
                            i2 += 3;
                        } else {
                            i2 = i83;
                        }
                        i59 = i81;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                    if ((iCharAt11 & ConstantsKt.DEFAULT_BLOCK_SIZE) == 4096 || i71 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i17 = i16;
                        i18 = 0;
                    } else {
                        int i84 = i16 + 1;
                        int iCharAt13 = str.charAt(i16);
                        if (iCharAt13 >= 55296) {
                            int i85 = iCharAt13 & 8191;
                            int i86 = 13;
                            while (true) {
                                i17 = i84 + 1;
                                cCharAt9 = str.charAt(i84);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i85 |= (cCharAt9 & 8191) << i86;
                                i86 += 13;
                                i84 = i17;
                            }
                            iCharAt13 = i85 | (cCharAt9 << i86);
                        } else {
                            i17 = i84;
                        }
                        int i87 = (iCharAt13 / 32) + (i56 * 2);
                        Object obj3 = objArr[i87];
                        if (obj3 instanceof Field) {
                            fieldO = (Field) obj3;
                        } else {
                            fieldO = O(cls, (String) obj3);
                            objArr[i87] = fieldO;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO);
                        i18 = iCharAt13 % 32;
                    }
                    if (i71 >= 18 && i71 <= 49) {
                        iArr[i58] = iObjectFieldOffset;
                        i58++;
                    }
                }
                i2 = i80;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                if ((iCharAt11 & ConstantsKt.DEFAULT_BLOCK_SIZE) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i17 = i16;
                    i18 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i17 = i16;
                    i18 = 0;
                }
                if (i71 >= 18) {
                    iArr[i58] = iObjectFieldOffset;
                    i58++;
                }
            }
            int i88 = i61 + 1;
            iArr4[i61] = i70;
            int i89 = i61 + 2;
            String str2 = str;
            iArr4[i88] = ((iCharAt11 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 536870912 : 0) | ((iCharAt11 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? 268435456 : 0) | (i71 << 20) | iObjectFieldOffset;
            i61 += 3;
            iArr4[i89] = (i18 << 20) | iObjectFieldOffset2;
            str = str2;
            iArr3 = iArr4;
            i3 = i72;
            length = i14;
            i28 = i17;
            i4 = i73;
        }
        return new vd2(iArr3, objArr2, i3, i4, o23Var.a, z, iArr, iCharAt3, i57, ll2Var, g52Var, z84Var, c61Var, u92Var);
    }

    public static long D(int i) {
        return i & 1048575;
    }

    public static int E(Object obj, long j) {
        return ((Integer) o94.c.i(obj, j)).intValue();
    }

    public static long F(Object obj, long j) {
        return ((Long) o94.c.i(obj, j)).longValue();
    }

    public static Field O(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbS = fq2.s("Field ", str, " for ");
            sbS.append(cls.getName());
            sbS.append(" not found. Known fields are ");
            sbS.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbS.toString());
        }
    }

    public static int U(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void X(int i, Object obj, jb jbVar) throws ee0 {
        if (!(obj instanceof String)) {
            jbVar.C(i, (mz) obj);
            return;
        }
        String str = (String) obj;
        de0 de0Var = (de0) jbVar.d;
        de0Var.r(i, 2);
        int i2 = de0Var.c;
        byte[] bArr = de0Var.b;
        int i3 = de0Var.d;
        try {
            int i4 = de0.i(str.length() * 3);
            int i5 = de0.i(str.length());
            if (i5 != i4) {
                de0Var.s(ha4.b(str));
                int i6 = de0Var.d;
                de0Var.d = ha4.a.p(str, bArr, i6, i2 - i6);
                return;
            }
            int i7 = i3 + i5;
            de0Var.d = i7;
            int iP = ha4.a.p(str, bArr, i7, i2 - i7);
            de0Var.d = i3;
            de0Var.s((iP - i3) - i5);
            de0Var.d = iP;
        } catch (ga4 e) {
            de0Var.d = i3;
            de0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(zq1.a);
            try {
                de0Var.s(bytes.length);
                de0Var.l(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e2) {
                throw new ee0(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new ee0(e3);
        }
    }

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ef1) {
            return ((ef1) obj).n();
        }
        return true;
    }

    public static List v(ef1 ef1Var, long j) {
        return (List) o94.c.i(ef1Var, j);
    }

    public final Object A(int i, int i2, Object obj) {
        za3 za3VarP = p(i2);
        if (!u(i, i2, obj)) {
            return za3VarP.j();
        }
        Object object = p.getObject(obj, V(i2) & 1048575);
        if (t(object)) {
            return object;
        }
        Object objJ = za3VarP.j();
        if (object != null) {
            za3VarP.c(objJ, object);
        }
        return objJ;
    }

    public final void G(int i, long j, Object obj) {
        Unsafe unsafe = p;
        Object objO = o(i);
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((t92) object).c) {
            t92 t92VarC = t92.d.c();
            u92.b(t92VarC, object);
            unsafe.putObject(obj, j, t92VarC);
        }
        fq2.y(objO);
        throw null;
    }

    public final int H(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, jl jlVar) throws sr1 {
        int i9;
        Unsafe unsafe = p;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(sf3.o(i, bArr))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(sf3.n(i, bArr))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iW = sf3.w(bArr, i, jlVar);
                unsafe.putObject(obj, j, Long.valueOf(jlVar.b));
                unsafe.putInt(obj, j2, i4);
                return iW;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iU = sf3.u(bArr, i, jlVar);
                unsafe.putObject(obj, j, Integer.valueOf(jlVar.a));
                unsafe.putInt(obj, j2, i4);
                return iU;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(sf3.o(i, bArr)));
                int i12 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(sf3.n(i, bArr)));
                int i13 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iW2 = sf3.w(bArr, i, jlVar);
                unsafe.putObject(obj, j, Boolean.valueOf(jlVar.b != 0));
                unsafe.putInt(obj, j2, i4);
                return iW2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iU2 = sf3.u(bArr, i, jlVar);
                int i14 = jlVar.a;
                if (i14 == 0) {
                    unsafe.putObject(obj, j, BuildConfig.VERSION_NAME);
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!ha4.a.D(bArr, iU2, iU2 + i14)) {
                            throw sr1.b();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iU2, i14, zq1.a));
                    iU2 += i14;
                }
                unsafe.putInt(obj, j2, i4);
                return iU2;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object objA = A(i4, i8, obj);
                    int iO = sf3.O(objA, p(i8), bArr, i9, i2, jlVar);
                    T(i4, i8, obj, objA);
                    return iO;
                }
                return i9;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int iM = sf3.m(bArr, i9, jlVar);
                    unsafe.putObject(obj, j, jlVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return iM;
                }
                return i9;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int iU3 = sf3.u(bArr, i9, jlVar);
                    int i15 = jlVar.a;
                    n(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return iU3;
                }
                return i9;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int iU4 = sf3.u(bArr, i9, jlVar);
                    unsafe.putObject(obj, j, Integer.valueOf(be0.d(jlVar.a)));
                    unsafe.putInt(obj, j2, i4);
                    return iU4;
                }
                return i9;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int iW3 = sf3.w(bArr, i9, jlVar);
                    unsafe.putObject(obj, j, Long.valueOf(be0.e(jlVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return iW3;
                }
                return i9;
            case 68:
                if (i5 == 3) {
                    Object objA2 = A(i4, i8, obj);
                    int I = ((vd2) p(i8)).I(objA2, bArr, i, i2, (i3 & (-8)) | 4, jlVar);
                    jlVar.c = objA2;
                    T(i4, i8, obj, objA2);
                    return I;
                }
            default:
                return i;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int I(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, defpackage.jl r35) throws defpackage.sr1 {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd2.I(java.lang.Object, byte[], int, int, int, jl):int");
    }

    public final void J(Object obj, byte[] bArr, int i, int i2, jl jlVar) throws sr1 {
        int i3;
        int iR;
        Object obj2;
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        byte b;
        Object obj3;
        byte[] bArr2;
        int i8;
        byte[] bArr3;
        Object obj4;
        byte[] bArr4;
        Unsafe unsafe2;
        int i9;
        Object obj5;
        Object obj6;
        int i10;
        int i11;
        int i12;
        vd2 vd2Var = this;
        Object obj7 = obj;
        byte[] bArr5 = bArr;
        int i13 = i2;
        jl jlVar2 = jlVar;
        l(obj7);
        Unsafe unsafe3 = p;
        int iW = i;
        int i14 = -1;
        int i15 = 0;
        int i16 = 1048575;
        int i17 = 0;
        while (iW < i13) {
            int iT = iW + 1;
            int i18 = bArr5[iW];
            if (i18 < 0) {
                iT = sf3.t(i18, bArr5, iT, jlVar2);
                i18 = jlVar2.a;
            }
            i14 = i18 >>> 3;
            int i19 = i18 & 7;
            int i20 = vd2Var.d;
            int i21 = vd2Var.c;
            if (i14 > i14) {
                iR = (i14 < i21 || i14 > i20) ? -1 : vd2Var.R(i14, i15 / 3);
                i3 = 0;
            } else if (i14 < i21 || i14 > i20) {
                i3 = 0;
                iR = -1;
            } else {
                i3 = 0;
                iR = vd2Var.R(i14, 0);
            }
            i15 = iR;
            if (i15 == -1) {
                int i22 = iT;
                obj2 = obj7;
                i4 = i22;
                unsafe = unsafe3;
                i5 = i18;
                i6 = i14;
                i7 = i3;
            } else {
                int[] iArr = vd2Var.a;
                int i23 = iArr[i15 + 1];
                int iU = U(i23);
                int i24 = i18;
                long j = i23 & 1048575;
                if (iU <= 17) {
                    int i25 = iArr[i15 + 2];
                    int i26 = 1 << (i25 >>> 20);
                    int i27 = i25 & 1048575;
                    if (i27 != i16) {
                        int i28 = 1048575;
                        if (i16 != 1048575) {
                            unsafe3.putInt(obj7, i16, i17);
                            i28 = 1048575;
                        }
                        if (i27 != i28) {
                            i17 = unsafe3.getInt(obj7, i27);
                        }
                        i16 = i27;
                    }
                    switch (iU) {
                        case 0:
                            unsafe3 = unsafe3;
                            bArr2 = bArr5;
                            b = -1;
                            i8 = iT;
                            if (i19 != 1) {
                                obj3 = obj7;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                o94.c.m(obj7, j, Double.longBitsToDouble(sf3.o(i8, bArr2)));
                                iW = i8 + 8;
                                i17 |= i26;
                                bArr5 = bArr2;
                                unsafe3 = unsafe3;
                                i13 = i2;
                            }
                            break;
                        case 1:
                            unsafe3 = unsafe3;
                            bArr2 = bArr5;
                            b = -1;
                            i8 = iT;
                            if (i19 != 5) {
                                obj3 = obj7;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                o94.c.n(obj7, j, Float.intBitsToFloat(sf3.n(i8, bArr2)));
                                iW = i8 + 4;
                                i17 |= i26;
                                bArr5 = bArr2;
                                unsafe3 = unsafe3;
                                i13 = i2;
                            }
                            break;
                        case 2:
                        case 3:
                            bArr3 = bArr5;
                            b = -1;
                            i8 = iT;
                            if (i19 != 0) {
                                unsafe3 = unsafe3;
                                obj3 = obj7;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                int iW2 = sf3.w(bArr3, i8, jlVar2);
                                unsafe3.putLong(obj7, j, jlVar2.b);
                                i17 |= i26;
                                iW = iW2;
                                bArr5 = bArr3;
                                i13 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            bArr3 = bArr5;
                            b = -1;
                            i8 = iT;
                            if (i19 != 0) {
                                unsafe3 = unsafe3;
                                obj3 = obj7;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                int iU2 = sf3.u(bArr3, i8, jlVar2);
                                unsafe3.putInt(obj7, j, jlVar2.a);
                                i17 |= i26;
                                iW = iU2;
                                bArr5 = bArr3;
                                i13 = i2;
                            }
                            break;
                        case 5:
                        case 14:
                            Object obj8 = obj7;
                            bArr3 = bArr5;
                            b = -1;
                            Unsafe unsafe4 = unsafe3;
                            int i29 = iT;
                            if (i19 != 1) {
                                i8 = i29;
                                unsafe3 = unsafe4;
                                obj3 = obj8;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                long jO = sf3.o(i29, bArr3);
                                unsafe3 = unsafe4;
                                obj7 = obj8;
                                unsafe3.putLong(obj7, j, jO);
                                iW = i29 + 8;
                                i17 |= i26;
                                bArr5 = bArr3;
                                i13 = i2;
                            }
                            break;
                        case 6:
                        case 13:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            b = -1;
                            unsafe2 = unsafe3;
                            i9 = iT;
                            if (i19 != 5) {
                                Unsafe unsafe5 = unsafe2;
                                i8 = i9;
                                obj3 = obj4;
                                unsafe3 = unsafe5;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                unsafe2.putInt(obj4, j, sf3.n(i9, bArr4));
                                iW = i9 + 4;
                                i17 |= i26;
                                unsafe3 = unsafe2;
                                bArr5 = bArr4;
                                obj7 = obj4;
                                i13 = i2;
                            }
                            break;
                        case 7:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            b = -1;
                            unsafe2 = unsafe3;
                            i9 = iT;
                            if (i19 != 0) {
                                Unsafe unsafe6 = unsafe2;
                                i8 = i9;
                                obj3 = obj4;
                                unsafe3 = unsafe6;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                iW = sf3.w(bArr4, i9, jlVar2);
                                o94.c.k(obj4, j, jlVar2.b != 0);
                                i17 |= i26;
                                unsafe3 = unsafe2;
                                bArr5 = bArr4;
                                obj7 = obj4;
                                i13 = i2;
                            }
                            break;
                        case 8:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            b = -1;
                            unsafe2 = unsafe3;
                            i9 = iT;
                            if (i19 != 2) {
                                Unsafe unsafe7 = unsafe2;
                                i8 = i9;
                                obj3 = obj4;
                                unsafe3 = unsafe7;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                iW = (i23 & 536870912) == 0 ? sf3.q(bArr4, i9, jlVar2) : sf3.r(bArr4, i9, jlVar2);
                                unsafe2.putObject(obj4, j, jlVar2.c);
                                i17 |= i26;
                                unsafe3 = unsafe2;
                                bArr5 = bArr4;
                                obj7 = obj4;
                                i13 = i2;
                            }
                            break;
                        case 9:
                            obj4 = obj7;
                            b = -1;
                            if (i19 != 2) {
                                Unsafe unsafe8 = unsafe3;
                                obj3 = obj4;
                                unsafe3 = unsafe8;
                                i8 = iT;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                Unsafe unsafe9 = unsafe3;
                                Object objZ = vd2Var.z(i15, obj4);
                                byte[] bArr6 = bArr5;
                                unsafe2 = unsafe9;
                                int iO = sf3.O(objZ, vd2Var.p(i15), bArr6, iT, i13, jlVar2);
                                bArr4 = bArr6;
                                vd2Var.S(obj4, i15, objZ);
                                i17 |= i26;
                                iW = iO;
                                unsafe3 = unsafe2;
                                bArr5 = bArr4;
                                obj7 = obj4;
                                i13 = i2;
                            }
                            break;
                        case 10:
                            obj5 = obj7;
                            b = -1;
                            if (i19 != 2) {
                                obj3 = obj5;
                                i8 = iT;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                iW = sf3.m(bArr5, iT, jlVar2);
                                unsafe3.putObject(obj5, j, jlVar2.c);
                                i17 |= i26;
                                i15 = i15;
                                i14 = i14;
                                obj7 = obj5;
                            }
                            break;
                        case 12:
                            obj5 = obj7;
                            b = -1;
                            if (i19 != 0) {
                                obj3 = obj5;
                                i8 = iT;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                iW = sf3.u(bArr5, iT, jlVar2);
                                unsafe3.putInt(obj5, j, jlVar2.a);
                                i17 |= i26;
                                i15 = i15;
                                i14 = i14;
                                obj7 = obj5;
                            }
                            break;
                        case 15:
                            obj5 = obj7;
                            b = -1;
                            if (i19 != 0) {
                                obj3 = obj5;
                                i8 = iT;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                iW = sf3.u(bArr5, iT, jlVar2);
                                unsafe3.putInt(obj5, j, be0.d(jlVar2.a));
                                i17 |= i26;
                                i15 = i15;
                                i14 = i14;
                                obj7 = obj5;
                            }
                            break;
                        case 16:
                            if (i19 != 0) {
                                b = -1;
                                obj3 = obj7;
                                i8 = iT;
                                i5 = i24 == true ? 1 : 0;
                                obj2 = obj3;
                                i4 = i8;
                                unsafe = unsafe3;
                                i6 = i14;
                                i7 = i15;
                            } else {
                                int iW3 = sf3.w(bArr5, iT, jlVar2);
                                unsafe3.putLong(obj7, j, be0.e(jlVar2.b));
                                i17 |= i26;
                                i15 = i15;
                                i14 = i14;
                                iW = iW3;
                            }
                            break;
                        default:
                            unsafe3 = unsafe3;
                            obj3 = obj7;
                            b = -1;
                            i8 = iT;
                            i5 = i24 == true ? 1 : 0;
                            obj2 = obj3;
                            i4 = i8;
                            unsafe = unsafe3;
                            i6 = i14;
                            i7 = i15;
                            break;
                    }
                } else {
                    Object obj9 = obj7;
                    Unsafe unsafe10 = unsafe3;
                    byte[] bArr7 = bArr5;
                    int i30 = iT;
                    if (iU != 27) {
                        i5 = i24 == true ? 1 : 0;
                        i10 = i30;
                        if (iU <= 49) {
                            unsafe = unsafe10;
                            i6 = i14;
                            int i31 = i16;
                            int i32 = i17;
                            int iK = vd2Var.K(obj, bArr, i10, i2, i5 == true ? 1 : 0, i19, i15, i23, iU, j, jlVar);
                            i7 = i15;
                            if (iK != i10) {
                                bArr5 = bArr;
                                i13 = i2;
                                jlVar2 = jlVar;
                                obj7 = obj;
                                iW = iK;
                                i15 = i7;
                                i16 = i31;
                                i17 = i32;
                                i14 = i6;
                                unsafe3 = unsafe;
                            } else {
                                i4 = iK;
                                i16 = i31;
                                i17 = i32;
                                obj2 = obj;
                            }
                        } else {
                            unsafe = unsafe10;
                            i11 = i16;
                            i6 = i14;
                            obj6 = obj;
                            i7 = i15;
                            i12 = i17;
                            if (iU != 50) {
                                int iH = vd2Var.H(obj6, bArr, i10, i2, i5 == true ? 1 : 0, i6, i19, i23, iU, j, i7, jlVar);
                                obj2 = obj6;
                                if (iH != i10) {
                                    vd2Var = this;
                                    i13 = i2;
                                    jlVar2 = jlVar;
                                    obj7 = obj2;
                                    iW = iH;
                                    i15 = i7;
                                    i16 = i11;
                                    i17 = i12;
                                    i14 = i6;
                                    unsafe3 = unsafe;
                                    bArr5 = bArr;
                                } else {
                                    i4 = iH;
                                    i16 = i11;
                                    i17 = i12;
                                }
                            } else if (i19 == 2) {
                                vd2Var.G(i7, j, obj6);
                                throw null;
                            }
                        }
                    } else if (i19 == 2) {
                        yq1 yq1VarE = (yq1) unsafe10.getObject(obj9, j);
                        if (!((m0) yq1VarE).c) {
                            int size = yq1VarE.size();
                            yq1VarE = yq1VarE.e(size == 0 ? 10 : size * 2);
                            unsafe10.putObject(obj9, j, yq1VarE);
                        }
                        int iP = sf3.p(vd2Var.p(i15), i24 == true ? 1 : 0, bArr7, i30, i2, yq1VarE, jlVar2);
                        obj7 = obj;
                        bArr5 = bArr;
                        jlVar2 = jlVar;
                        iW = iP;
                        unsafe3 = unsafe10;
                        i13 = i2;
                    } else {
                        obj6 = obj;
                        i5 = i24 == true ? 1 : 0;
                        unsafe = unsafe10;
                        i10 = i30;
                        i11 = i16;
                        i12 = i17;
                        i6 = i14;
                        i7 = i15;
                    }
                    i4 = i10;
                    obj2 = obj6;
                    i16 = i11;
                    i17 = i12;
                }
            }
            ef1 ef1Var = (ef1) obj2;
            y84 y84VarC = ef1Var.unknownFields;
            if (y84VarC == y84.f) {
                y84VarC = y84.c();
                ef1Var.unknownFields = y84VarC;
            }
            int iS = sf3.s(i5 == true ? 1 : 0, bArr, i4, i2, y84VarC, jlVar);
            bArr5 = bArr;
            jlVar2 = jlVar;
            i13 = i2;
            obj7 = obj2;
            i15 = i7;
            i14 = i6;
            unsafe3 = unsafe;
            iW = iS;
            vd2Var = this;
        }
        Unsafe unsafe11 = unsafe3;
        Object obj10 = obj7;
        int i33 = i13;
        int i34 = i16;
        int i35 = i17;
        if (i34 != 1048575) {
            unsafe11.putInt(obj10, i34, i35);
        }
        if (iW != i33) {
            throw sr1.f();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int K(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, jl jlVar) throws sr1 {
        int iV;
        Unsafe unsafe = p;
        yq1 yq1VarE = (yq1) unsafe.getObject(obj, j2);
        if (!((m0) yq1VarE).c) {
            int size = yq1VarE.size();
            yq1VarE = yq1VarE.e(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, yq1VarE);
        }
        yq1 yq1Var = yq1VarE;
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    kx0 kx0Var = (kx0) yq1Var;
                    int iU = sf3.u(bArr, i, jlVar);
                    int i7 = jlVar.a + iU;
                    while (iU < i7) {
                        kx0Var.d(Double.longBitsToDouble(sf3.o(iU, bArr)));
                        iU += 8;
                    }
                    if (iU == i7) {
                        return iU;
                    }
                    throw sr1.g();
                }
                if (i4 == 1) {
                    kx0 kx0Var2 = (kx0) yq1Var;
                    kx0Var2.d(Double.longBitsToDouble(sf3.o(i, bArr)));
                    i += 8;
                    while (i < i2) {
                        int iU2 = sf3.u(bArr, i, jlVar);
                        if (i3 == jlVar.a) {
                            kx0Var2.d(Double.longBitsToDouble(sf3.o(iU2, bArr)));
                            i = iU2 + 8;
                        }
                    }
                }
                return i;
            case 19:
            case 36:
                if (i4 == 2) {
                    e81 e81Var = (e81) yq1Var;
                    int iU3 = sf3.u(bArr, i, jlVar);
                    int i8 = jlVar.a + iU3;
                    while (iU3 < i8) {
                        e81Var.d(Float.intBitsToFloat(sf3.n(iU3, bArr)));
                        iU3 += 4;
                    }
                    if (iU3 == i8) {
                        return iU3;
                    }
                    throw sr1.g();
                }
                if (i4 == 5) {
                    e81 e81Var2 = (e81) yq1Var;
                    e81Var2.d(Float.intBitsToFloat(sf3.n(i, bArr)));
                    int i9 = i + 4;
                    while (i9 < i2) {
                        int iU4 = sf3.u(bArr, i9, jlVar);
                        if (i3 != jlVar.a) {
                            return i9;
                        }
                        e81Var2.d(Float.intBitsToFloat(sf3.n(iU4, bArr)));
                        i9 = iU4 + 4;
                    }
                    return i9;
                }
                return i;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    x72 x72Var = (x72) yq1Var;
                    int iU5 = sf3.u(bArr, i, jlVar);
                    int i10 = jlVar.a + iU5;
                    while (iU5 < i10) {
                        iU5 = sf3.w(bArr, iU5, jlVar);
                        x72Var.d(jlVar.b);
                    }
                    if (iU5 == i10) {
                        return iU5;
                    }
                    throw sr1.g();
                }
                if (i4 == 0) {
                    x72 x72Var2 = (x72) yq1Var;
                    int iW = sf3.w(bArr, i, jlVar);
                    x72Var2.d(jlVar.b);
                    while (iW < i2) {
                        int iU6 = sf3.u(bArr, iW, jlVar);
                        if (i3 != jlVar.a) {
                            return iW;
                        }
                        iW = sf3.w(bArr, iU6, jlVar);
                        x72Var2.d(jlVar.b);
                    }
                    return iW;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i4 != 2) {
                    if (i4 == 0) {
                        return sf3.v(i3, bArr, i, i2, yq1Var, jlVar);
                    }
                    return i;
                }
                bq1 bq1Var = (bq1) yq1Var;
                int iU7 = sf3.u(bArr, i, jlVar);
                int i11 = jlVar.a + iU7;
                while (iU7 < i11) {
                    iU7 = sf3.u(bArr, iU7, jlVar);
                    bq1Var.d(jlVar.a);
                }
                if (iU7 == i11) {
                    return iU7;
                }
                throw sr1.g();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i4 == 2) {
                    x72 x72Var3 = (x72) yq1Var;
                    int iU8 = sf3.u(bArr, i, jlVar);
                    int i12 = jlVar.a + iU8;
                    while (iU8 < i12) {
                        x72Var3.d(sf3.o(iU8, bArr));
                        iU8 += 8;
                    }
                    if (iU8 == i12) {
                        return iU8;
                    }
                    throw sr1.g();
                }
                if (i4 == 1) {
                    x72 x72Var4 = (x72) yq1Var;
                    x72Var4.d(sf3.o(i, bArr));
                    int i13 = i + 8;
                    while (i13 < i2) {
                        int iU9 = sf3.u(bArr, i13, jlVar);
                        if (i3 != jlVar.a) {
                            return i13;
                        }
                        x72Var4.d(sf3.o(iU9, bArr));
                        i13 = iU9 + 8;
                    }
                    return i13;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i4 == 2) {
                    bq1 bq1Var2 = (bq1) yq1Var;
                    int iU10 = sf3.u(bArr, i, jlVar);
                    int i14 = jlVar.a + iU10;
                    while (iU10 < i14) {
                        bq1Var2.d(sf3.n(iU10, bArr));
                        iU10 += 4;
                    }
                    if (iU10 == i14) {
                        return iU10;
                    }
                    throw sr1.g();
                }
                if (i4 == 5) {
                    bq1 bq1Var3 = (bq1) yq1Var;
                    bq1Var3.d(sf3.n(i, bArr));
                    int i15 = i + 4;
                    while (i15 < i2) {
                        int iU11 = sf3.u(bArr, i15, jlVar);
                        if (i3 != jlVar.a) {
                            return i15;
                        }
                        bq1Var3.d(sf3.n(iU11, bArr));
                        i15 = iU11 + 4;
                    }
                    return i15;
                }
                return i;
            case 25:
            case 42:
                if (i4 == 2) {
                    aw awVar = (aw) yq1Var;
                    int iU12 = sf3.u(bArr, i, jlVar);
                    int i16 = jlVar.a + iU12;
                    while (iU12 < i16) {
                        iU12 = sf3.w(bArr, iU12, jlVar);
                        awVar.d(jlVar.b != 0);
                    }
                    if (iU12 == i16) {
                        return iU12;
                    }
                    throw sr1.g();
                }
                if (i4 == 0) {
                    aw awVar2 = (aw) yq1Var;
                    int iW2 = sf3.w(bArr, i, jlVar);
                    awVar2.d(jlVar.b != 0);
                    while (iW2 < i2) {
                        int iU13 = sf3.u(bArr, iW2, jlVar);
                        if (i3 != jlVar.a) {
                            return iW2;
                        }
                        iW2 = sf3.w(bArr, iU13, jlVar);
                        awVar2.d(jlVar.b != 0);
                    }
                    return iW2;
                }
                return i;
            case 26:
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int iU14 = sf3.u(bArr, i, jlVar);
                        int i17 = jlVar.a;
                        if (i17 < 0) {
                            throw sr1.e();
                        }
                        if (i17 == 0) {
                            yq1Var.add(BuildConfig.VERSION_NAME);
                        } else {
                            yq1Var.add(new String(bArr, iU14, i17, zq1.a));
                            iU14 += i17;
                        }
                        while (iU14 < i2) {
                            int iU15 = sf3.u(bArr, iU14, jlVar);
                            if (i3 != jlVar.a) {
                                return iU14;
                            }
                            iU14 = sf3.u(bArr, iU15, jlVar);
                            int i18 = jlVar.a;
                            if (i18 < 0) {
                                throw sr1.e();
                            }
                            if (i18 == 0) {
                                yq1Var.add(BuildConfig.VERSION_NAME);
                            } else {
                                yq1Var.add(new String(bArr, iU14, i18, zq1.a));
                                iU14 += i18;
                            }
                        }
                        return iU14;
                    }
                    int iU16 = sf3.u(bArr, i, jlVar);
                    int i19 = jlVar.a;
                    if (i19 < 0) {
                        throw sr1.e();
                    }
                    if (i19 == 0) {
                        yq1Var.add(BuildConfig.VERSION_NAME);
                    } else {
                        int i20 = iU16 + i19;
                        if (!ha4.a.D(bArr, iU16, i20)) {
                            throw sr1.b();
                        }
                        yq1Var.add(new String(bArr, iU16, i19, zq1.a));
                        iU16 = i20;
                    }
                    while (iU16 < i2) {
                        int iU17 = sf3.u(bArr, iU16, jlVar);
                        if (i3 != jlVar.a) {
                            return iU16;
                        }
                        iU16 = sf3.u(bArr, iU17, jlVar);
                        int i21 = jlVar.a;
                        if (i21 < 0) {
                            throw sr1.e();
                        }
                        if (i21 == 0) {
                            yq1Var.add(BuildConfig.VERSION_NAME);
                        } else {
                            int i22 = iU16 + i21;
                            if (!ha4.a.D(bArr, iU16, i22)) {
                                throw sr1.b();
                            }
                            yq1Var.add(new String(bArr, iU16, i21, zq1.a));
                            iU16 = i22;
                        }
                    }
                    return iU16;
                }
                return i;
            case 27:
                if (i4 == 2) {
                    return sf3.p(p(i5), i3, bArr, i, i2, yq1Var, jlVar);
                }
                return i;
            case 28:
                if (i4 == 2) {
                    int iU18 = sf3.u(bArr, i, jlVar);
                    int i23 = jlVar.a;
                    if (i23 < 0) {
                        throw sr1.e();
                    }
                    if (i23 > bArr.length - iU18) {
                        throw sr1.g();
                    }
                    if (i23 == 0) {
                        yq1Var.add(mz.d);
                    } else {
                        yq1Var.add(mz.g(bArr, iU18, i23));
                        iU18 += i23;
                    }
                    while (iU18 < i2) {
                        int iU19 = sf3.u(bArr, iU18, jlVar);
                        if (i3 != jlVar.a) {
                            return iU18;
                        }
                        iU18 = sf3.u(bArr, iU19, jlVar);
                        int i24 = jlVar.a;
                        if (i24 < 0) {
                            throw sr1.e();
                        }
                        if (i24 > bArr.length - iU18) {
                            throw sr1.g();
                        }
                        if (i24 == 0) {
                            yq1Var.add(mz.d);
                        } else {
                            yq1Var.add(mz.g(bArr, iU18, i24));
                            iU18 += i24;
                        }
                    }
                    return iU18;
                }
                return i;
            case 30:
            case 44:
                if (i4 != 2) {
                    if (i4 == 0) {
                        iV = sf3.v(i3, bArr, i, i2, yq1Var, jlVar);
                    }
                    return i;
                }
                bq1 bq1Var4 = (bq1) yq1Var;
                iV = sf3.u(bArr, i, jlVar);
                int i25 = jlVar.a + iV;
                while (iV < i25) {
                    iV = sf3.u(bArr, iV, jlVar);
                    bq1Var4.d(jlVar.a);
                }
                if (iV != i25) {
                    throw sr1.g();
                }
                n(i5);
                Class cls = cb3.a;
                return iV;
            case 33:
            case 47:
                if (i4 == 2) {
                    bq1 bq1Var5 = (bq1) yq1Var;
                    int iU20 = sf3.u(bArr, i, jlVar);
                    int i26 = jlVar.a + iU20;
                    while (iU20 < i26) {
                        iU20 = sf3.u(bArr, iU20, jlVar);
                        bq1Var5.d(be0.d(jlVar.a));
                    }
                    if (iU20 == i26) {
                        return iU20;
                    }
                    throw sr1.g();
                }
                if (i4 == 0) {
                    bq1 bq1Var6 = (bq1) yq1Var;
                    int iU21 = sf3.u(bArr, i, jlVar);
                    bq1Var6.d(be0.d(jlVar.a));
                    while (iU21 < i2) {
                        int iU22 = sf3.u(bArr, iU21, jlVar);
                        if (i3 != jlVar.a) {
                            return iU21;
                        }
                        iU21 = sf3.u(bArr, iU22, jlVar);
                        bq1Var6.d(be0.d(jlVar.a));
                    }
                    return iU21;
                }
                return i;
            case 34:
            case 48:
                if (i4 == 2) {
                    x72 x72Var5 = (x72) yq1Var;
                    int iU23 = sf3.u(bArr, i, jlVar);
                    int i27 = jlVar.a + iU23;
                    while (iU23 < i27) {
                        iU23 = sf3.w(bArr, iU23, jlVar);
                        x72Var5.d(be0.e(jlVar.b));
                    }
                    if (iU23 == i27) {
                        return iU23;
                    }
                    throw sr1.g();
                }
                if (i4 == 0) {
                    x72 x72Var6 = (x72) yq1Var;
                    int iW3 = sf3.w(bArr, i, jlVar);
                    x72Var6.d(be0.e(jlVar.b));
                    while (iW3 < i2) {
                        int iU24 = sf3.u(bArr, iW3, jlVar);
                        if (i3 != jlVar.a) {
                            return iW3;
                        }
                        iW3 = sf3.w(bArr, iU24, jlVar);
                        x72Var6.d(be0.e(jlVar.b));
                    }
                    return iW3;
                }
                return i;
            case 49:
                if (i4 == 3) {
                    za3 za3VarP = p(i5);
                    int i28 = (i3 & (-8)) | 4;
                    Object objJ = za3VarP.j();
                    vd2 vd2Var = (vd2) za3VarP;
                    int I = vd2Var.I(objJ, bArr, i, i2, i28, jlVar);
                    jlVar.c = objJ;
                    za3VarP.d(objJ);
                    jlVar.c = objJ;
                    yq1Var.add(objJ);
                    while (I < i2) {
                        int iU25 = sf3.u(bArr, I, jlVar);
                        if (i3 != jlVar.a) {
                            return I;
                        }
                        Object objJ2 = za3VarP.j();
                        I = vd2Var.I(objJ2, bArr, iU25, i2, i28, jlVar);
                        jlVar.c = objJ2;
                        za3VarP.d(objJ2);
                        jlVar.c = objJ2;
                        yq1Var.add(objJ2);
                    }
                    return I;
                }
                return i;
            default:
                return i;
        }
    }

    public final void L(Object obj, long j, ce0 ce0Var, za3 za3Var, b61 b61Var) throws rr1 {
        int iG;
        List listC = this.l.c(obj, j);
        be0 be0Var = (be0) ce0Var.d;
        int i = ce0Var.a;
        if ((i & 7) != 3) {
            throw sr1.c();
        }
        do {
            Object objJ = za3Var.j();
            ce0Var.d(objJ, za3Var, b61Var);
            za3Var.d(objJ);
            listC.add(objJ);
            if (be0Var.h() || ce0Var.c != 0) {
                return;
            } else {
                iG = be0Var.G();
            }
        } while (iG == i);
        ce0Var.c = iG;
    }

    public final void M(Object obj, int i, ce0 ce0Var, za3 za3Var, b61 b61Var) throws sr1 {
        int iG;
        List listC = this.l.c(obj, i & 1048575);
        be0 be0Var = (be0) ce0Var.d;
        int i2 = ce0Var.a;
        if ((i2 & 7) != 2) {
            throw sr1.c();
        }
        do {
            Object objJ = za3Var.j();
            ce0Var.e(objJ, za3Var, b61Var);
            za3Var.d(objJ);
            listC.add(objJ);
            if (be0Var.h() || ce0Var.c != 0) {
                return;
            } else {
                iG = be0Var.G();
            }
        } while (iG == i2);
        ce0Var.c = iG;
    }

    public final void N(Object obj, int i, ce0 ce0Var) throws rr1 {
        if ((536870912 & i) != 0) {
            ce0Var.x(2);
            o94.p(i & 1048575, obj, ((be0) ce0Var.d).F());
        } else if (!this.f) {
            o94.p(i & 1048575, obj, ce0Var.g());
        } else {
            ce0Var.x(2);
            o94.p(i & 1048575, obj, ((be0) ce0Var.d).E());
        }
    }

    public final void P(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        o94.n((1 << (i2 >>> 20)) | o94.c.g(obj, j), j, obj);
    }

    public final void Q(int i, int i2, Object obj) {
        o94.n(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int R(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void S(Object obj, int i, Object obj2) {
        p.putObject(obj, V(i) & 1048575, obj2);
        P(i, obj);
    }

    public final void T(int i, int i2, Object obj, Object obj2) {
        p.putObject(obj, V(i2) & 1048575, obj2);
        Q(i, i2, obj);
    }

    public final int V(int i) {
        return this.a[i + 1];
    }

    public final void W(Object obj, jb jbVar) throws ee0 {
        int i;
        int i2;
        int i3;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = p;
        int i4 = 1048575;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 = i3 + 3) {
            int iV = V(i6);
            int i7 = iArr[i6];
            int iU = U(iV);
            if (iU <= 17) {
                int i8 = iArr[i6 + 2];
                i = 1048575;
                int i9 = i8 & 1048575;
                if (i9 != i4) {
                    i5 = unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i = 1048575;
                i2 = 0;
            }
            int i10 = i6;
            long j = iV & i;
            switch (iU) {
                case 0:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        double dE = o94.c.e(obj, j);
                        de0 de0Var = (de0) jbVar.d;
                        de0Var.getClass();
                        de0Var.o(Double.doubleToRawLongBits(dE), i7);
                        continue;
                    }
                    break;
                case 1:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        float f = o94.c.f(obj, j);
                        de0 de0Var2 = (de0) jbVar.d;
                        de0Var2.getClass();
                        de0Var2.m(i7, Float.floatToRawIntBits(f));
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((de0) jbVar.d).t(unsafe.getLong(obj, j), i7);
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((de0) jbVar.d).t(unsafe.getLong(obj, j), i7);
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        de0 de0Var3 = (de0) jbVar.d;
                        de0Var3.r(i7, 0);
                        de0Var3.q(i11);
                    }
                    break;
                case 5:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((de0) jbVar.d).o(unsafe.getLong(obj, j), i7);
                    }
                    break;
                case 6:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((de0) jbVar.d).m(i7, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        boolean zC = o94.c.c(obj, j);
                        de0 de0Var4 = (de0) jbVar.d;
                        de0Var4.r(i7, 0);
                        de0Var4.k(zC ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        X(i7, unsafe.getObject(obj, j), jbVar);
                    }
                    break;
                case 9:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        jbVar.E(i7, unsafe.getObject(obj, j), p(i3));
                    }
                    break;
                case 10:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        jbVar.C(i7, (mz) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        de0 de0Var5 = (de0) jbVar.d;
                        de0Var5.r(i7, 0);
                        de0Var5.s(i12);
                    }
                    break;
                case 12:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        de0 de0Var6 = (de0) jbVar.d;
                        de0Var6.r(i7, 0);
                        de0Var6.q(i13);
                    }
                    break;
                case 13:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((de0) jbVar.d).m(i7, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((de0) jbVar.d).o(unsafe.getLong(obj, j), i7);
                    }
                    break;
                case 15:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        de0 de0Var7 = (de0) jbVar.d;
                        de0Var7.r(i7, 0);
                        de0Var7.s((i14 >> 31) ^ (i14 << 1));
                    }
                    break;
                case 16:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        ((de0) jbVar.d).t((j2 << 1) ^ (j2 >> 63), i7);
                    }
                    break;
                case 17:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        jbVar.D(i7, unsafe.getObject(obj, j), p(i3));
                    }
                    break;
                case 18:
                    i3 = i10;
                    cb3.A(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    break;
                case 19:
                    i3 = i10;
                    cb3.E(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                    i3 = i10;
                    cb3.H(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 21:
                    i3 = i10;
                    cb3.P(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 22:
                    i3 = i10;
                    cb3.G(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 23:
                    i3 = i10;
                    cb3.D(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 24:
                    i3 = i10;
                    cb3.C(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 25:
                    i3 = i10;
                    cb3.y(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 26:
                    i3 = i10;
                    cb3.N(iArr[i3], (List) unsafe.getObject(obj, j), jbVar);
                    break;
                case 27:
                    i3 = i10;
                    cb3.I(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, p(i3));
                    break;
                case 28:
                    i3 = i10;
                    cb3.z(iArr[i3], (List) unsafe.getObject(obj, j), jbVar);
                    break;
                case 29:
                    i3 = i10;
                    cb3.O(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    break;
                case 30:
                    i3 = i10;
                    cb3.B(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 31:
                    i3 = i10;
                    cb3.J(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 32:
                    i3 = i10;
                    cb3.K(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 33:
                    i3 = i10;
                    cb3.L(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 34:
                    i3 = i10;
                    cb3.M(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, false);
                    continue;
                    break;
                case 35:
                    i3 = i10;
                    cb3.A(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 36:
                    i3 = i10;
                    cb3.E(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 37:
                    i3 = i10;
                    cb3.H(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 38:
                    i3 = i10;
                    cb3.P(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 39:
                    i3 = i10;
                    cb3.G(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 40:
                    i3 = i10;
                    cb3.D(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 41:
                    i3 = i10;
                    cb3.C(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 42:
                    i3 = i10;
                    cb3.y(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 43:
                    i3 = i10;
                    cb3.O(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 44:
                    i3 = i10;
                    cb3.B(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 45:
                    i3 = i10;
                    cb3.J(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 46:
                    i3 = i10;
                    cb3.K(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 47:
                    i3 = i10;
                    cb3.L(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 48:
                    i3 = i10;
                    cb3.M(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, true);
                    break;
                case 49:
                    i3 = i10;
                    cb3.F(iArr[i3], (List) unsafe.getObject(obj, j), jbVar, p(i3));
                    break;
                case 50:
                    i3 = i10;
                    if (unsafe.getObject(obj, j) != null) {
                        Object objO = o(i3);
                        this.n.getClass();
                        fq2.y(objO);
                        throw null;
                    }
                    break;
                case 51:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        double dDoubleValue = ((Double) o94.c.i(obj, j)).doubleValue();
                        de0 de0Var8 = (de0) jbVar.d;
                        de0Var8.getClass();
                        de0Var8.o(Double.doubleToRawLongBits(dDoubleValue), i7);
                    }
                    break;
                case 52:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        float fFloatValue = ((Float) o94.c.i(obj, j)).floatValue();
                        de0 de0Var9 = (de0) jbVar.d;
                        de0Var9.getClass();
                        de0Var9.m(i7, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        ((de0) jbVar.d).t(F(obj, j), i7);
                    }
                    break;
                case 54:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        ((de0) jbVar.d).t(F(obj, j), i7);
                    }
                    break;
                case 55:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        int iE = E(obj, j);
                        de0 de0Var10 = (de0) jbVar.d;
                        de0Var10.r(i7, 0);
                        de0Var10.q(iE);
                    }
                    break;
                case 56:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        ((de0) jbVar.d).o(F(obj, j), i7);
                    }
                    break;
                case 57:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        ((de0) jbVar.d).m(i7, E(obj, j));
                    }
                    break;
                case 58:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        boolean zBooleanValue = ((Boolean) o94.c.i(obj, j)).booleanValue();
                        de0 de0Var11 = (de0) jbVar.d;
                        de0Var11.r(i7, 0);
                        de0Var11.k(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        X(i7, unsafe.getObject(obj, j), jbVar);
                    }
                    break;
                case 60:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        jbVar.E(i7, unsafe.getObject(obj, j), p(i3));
                    }
                    break;
                case 61:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        jbVar.C(i7, (mz) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        int iE2 = E(obj, j);
                        de0 de0Var12 = (de0) jbVar.d;
                        de0Var12.r(i7, 0);
                        de0Var12.s(iE2);
                    }
                    break;
                case 63:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        int iE3 = E(obj, j);
                        de0 de0Var13 = (de0) jbVar.d;
                        de0Var13.r(i7, 0);
                        de0Var13.q(iE3);
                    }
                    break;
                case 64:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        ((de0) jbVar.d).m(i7, E(obj, j));
                    }
                    break;
                case 65:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        ((de0) jbVar.d).o(F(obj, j), i7);
                    }
                    break;
                case 66:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        int iE4 = E(obj, j);
                        de0 de0Var14 = (de0) jbVar.d;
                        de0Var14.r(i7, 0);
                        de0Var14.s((iE4 >> 31) ^ (iE4 << 1));
                    }
                    break;
                case 67:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        long jF = F(obj, j);
                        ((de0) jbVar.d).t((jF << 1) ^ (jF >> 63), i7);
                    }
                    break;
                case 68:
                    i3 = i10;
                    if (u(i7, i3, obj)) {
                        jbVar.D(i7, unsafe.getObject(obj, j), p(i3));
                    }
                    break;
                default:
                    i3 = i10;
                    break;
            }
        }
        this.m.getClass();
        ((ef1) obj).unknownFields.e(jbVar);
    }

    @Override // defpackage.za3
    public final void a(Object obj, jb jbVar) throws ee0 {
        jbVar.getClass();
        de0 de0Var = (de0) jbVar.d;
        if (!this.g) {
            W(obj, jbVar);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iV = V(i);
            int i2 = iArr[i];
            switch (U(iV)) {
                case 0:
                    if (s(i, obj)) {
                        double dE = o94.c.e(obj, iV & 1048575);
                        de0Var.getClass();
                        de0Var.o(Double.doubleToRawLongBits(dE), i2);
                    }
                    break;
                case 1:
                    if (s(i, obj)) {
                        float f = o94.c.f(obj, iV & 1048575);
                        de0Var.getClass();
                        de0Var.m(i2, Float.floatToRawIntBits(f));
                    }
                    break;
                case 2:
                    if (s(i, obj)) {
                        de0Var.t(o94.c.h(obj, iV & 1048575), i2);
                    }
                    break;
                case 3:
                    if (s(i, obj)) {
                        de0Var.t(o94.c.h(obj, iV & 1048575), i2);
                    }
                    break;
                case 4:
                    if (s(i, obj)) {
                        int iG = o94.c.g(obj, iV & 1048575);
                        de0Var.r(i2, 0);
                        de0Var.q(iG);
                    }
                    break;
                case 5:
                    if (s(i, obj)) {
                        de0Var.o(o94.c.h(obj, iV & 1048575), i2);
                    }
                    break;
                case 6:
                    if (s(i, obj)) {
                        de0Var.m(i2, o94.c.g(obj, iV & 1048575));
                    }
                    break;
                case 7:
                    if (s(i, obj)) {
                        boolean zC = o94.c.c(obj, iV & 1048575);
                        de0Var.r(i2, 0);
                        de0Var.k(zC ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    if (s(i, obj)) {
                        X(i2, o94.c.i(obj, iV & 1048575), jbVar);
                    }
                    break;
                case 9:
                    if (s(i, obj)) {
                        jbVar.E(i2, o94.c.i(obj, iV & 1048575), p(i));
                    }
                    break;
                case 10:
                    if (s(i, obj)) {
                        jbVar.C(i2, (mz) o94.c.i(obj, iV & 1048575));
                    }
                    break;
                case 11:
                    if (s(i, obj)) {
                        int iG2 = o94.c.g(obj, iV & 1048575);
                        de0Var.r(i2, 0);
                        de0Var.s(iG2);
                    }
                    break;
                case 12:
                    if (s(i, obj)) {
                        int iG3 = o94.c.g(obj, iV & 1048575);
                        de0Var.r(i2, 0);
                        de0Var.q(iG3);
                    }
                    break;
                case 13:
                    if (s(i, obj)) {
                        de0Var.m(i2, o94.c.g(obj, iV & 1048575));
                    }
                    break;
                case 14:
                    if (s(i, obj)) {
                        de0Var.o(o94.c.h(obj, iV & 1048575), i2);
                    }
                    break;
                case 15:
                    if (s(i, obj)) {
                        int iG4 = o94.c.g(obj, iV & 1048575);
                        de0Var.r(i2, 0);
                        de0Var.s((iG4 >> 31) ^ (iG4 << 1));
                    }
                    break;
                case 16:
                    if (s(i, obj)) {
                        long jH = o94.c.h(obj, iV & 1048575);
                        de0Var.t((jH >> 63) ^ (jH << 1), i2);
                    }
                    break;
                case 17:
                    if (s(i, obj)) {
                        jbVar.D(i2, o94.c.i(obj, iV & 1048575), p(i));
                    }
                    break;
                case 18:
                    cb3.A(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 19:
                    cb3.E(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                    cb3.H(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 21:
                    cb3.P(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 22:
                    cb3.G(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 23:
                    cb3.D(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 24:
                    cb3.C(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 25:
                    cb3.y(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 26:
                    cb3.N(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar);
                    break;
                case 27:
                    cb3.I(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, p(i));
                    break;
                case 28:
                    cb3.z(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar);
                    break;
                case 29:
                    cb3.O(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 30:
                    cb3.B(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 31:
                    cb3.J(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 32:
                    cb3.K(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 33:
                    cb3.L(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 34:
                    cb3.M(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, false);
                    break;
                case 35:
                    cb3.A(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 36:
                    cb3.E(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 37:
                    cb3.H(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 38:
                    cb3.P(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 39:
                    cb3.G(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 40:
                    cb3.D(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 41:
                    cb3.C(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 42:
                    cb3.y(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 43:
                    cb3.O(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 44:
                    cb3.B(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 45:
                    cb3.J(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 46:
                    cb3.K(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 47:
                    cb3.L(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 48:
                    cb3.M(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, true);
                    break;
                case 49:
                    cb3.F(iArr[i], (List) o94.c.i(obj, iV & 1048575), jbVar, p(i));
                    break;
                case 50:
                    if (o94.c.i(obj, iV & 1048575) != null) {
                        Object objO = o(i);
                        this.n.getClass();
                        fq2.y(objO);
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (u(i2, i, obj)) {
                        double dDoubleValue = ((Double) o94.c.i(obj, iV & 1048575)).doubleValue();
                        de0Var.getClass();
                        de0Var.o(Double.doubleToRawLongBits(dDoubleValue), i2);
                    }
                    break;
                case 52:
                    if (u(i2, i, obj)) {
                        float fFloatValue = ((Float) o94.c.i(obj, iV & 1048575)).floatValue();
                        de0Var.getClass();
                        de0Var.m(i2, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (u(i2, i, obj)) {
                        de0Var.t(F(obj, iV & 1048575), i2);
                    }
                    break;
                case 54:
                    if (u(i2, i, obj)) {
                        de0Var.t(F(obj, iV & 1048575), i2);
                    }
                    break;
                case 55:
                    if (u(i2, i, obj)) {
                        int iE = E(obj, iV & 1048575);
                        de0Var.r(i2, 0);
                        de0Var.q(iE);
                    }
                    break;
                case 56:
                    if (u(i2, i, obj)) {
                        de0Var.o(F(obj, iV & 1048575), i2);
                    }
                    break;
                case 57:
                    if (u(i2, i, obj)) {
                        de0Var.m(i2, E(obj, iV & 1048575));
                    }
                    break;
                case 58:
                    if (u(i2, i, obj)) {
                        boolean zBooleanValue = ((Boolean) o94.c.i(obj, iV & 1048575)).booleanValue();
                        de0Var.r(i2, 0);
                        de0Var.k(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (u(i2, i, obj)) {
                        X(i2, o94.c.i(obj, iV & 1048575), jbVar);
                    }
                    break;
                case 60:
                    if (u(i2, i, obj)) {
                        jbVar.E(i2, o94.c.i(obj, iV & 1048575), p(i));
                    }
                    break;
                case 61:
                    if (u(i2, i, obj)) {
                        jbVar.C(i2, (mz) o94.c.i(obj, iV & 1048575));
                    }
                    break;
                case 62:
                    if (u(i2, i, obj)) {
                        int iE2 = E(obj, iV & 1048575);
                        de0Var.r(i2, 0);
                        de0Var.s(iE2);
                    }
                    break;
                case 63:
                    if (u(i2, i, obj)) {
                        int iE3 = E(obj, iV & 1048575);
                        de0Var.r(i2, 0);
                        de0Var.q(iE3);
                    }
                    break;
                case 64:
                    if (u(i2, i, obj)) {
                        de0Var.m(i2, E(obj, iV & 1048575));
                    }
                    break;
                case 65:
                    if (u(i2, i, obj)) {
                        de0Var.o(F(obj, iV & 1048575), i2);
                    }
                    break;
                case 66:
                    if (u(i2, i, obj)) {
                        int iE4 = E(obj, iV & 1048575);
                        de0Var.r(i2, 0);
                        de0Var.s((iE4 >> 31) ^ (iE4 << 1));
                    }
                    break;
                case 67:
                    if (u(i2, i, obj)) {
                        long jF = F(obj, iV & 1048575);
                        de0Var.t((jF >> 63) ^ (jF << 1), i2);
                    }
                    break;
                case 68:
                    if (u(i2, i, obj)) {
                        jbVar.D(i2, o94.c.i(obj, iV & 1048575), p(i));
                    }
                    break;
            }
        }
        this.m.getClass();
        ((ef1) obj).unknownFields.e(jbVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.za3
    public final int b(ef1 ef1Var) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iV = V(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iV;
            int i6 = 1237;
            int iHashCode = 37;
            switch (U(iV)) {
                case 0:
                    i = i3 * 53;
                    iB = zq1.b(Double.doubleToLongBits(o94.c.e(ef1Var, j)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(o94.c.f(ef1Var, j));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = zq1.b(o94.c.h(ef1Var, j));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = zq1.b(o94.c.h(ef1Var, j));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = o94.c.g(ef1Var, j);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = zq1.b(o94.c.h(ef1Var, j));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = o94.c.g(ef1Var, j);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zC = o94.c.c(ef1Var, j);
                    Charset charset = zq1.a;
                    if (zC) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) o94.c.i(ef1Var, j)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objI = o94.c.i(ef1Var, j);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = o94.c.i(ef1Var, j).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = o94.c.g(ef1Var, j);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = o94.c.g(ef1Var, j);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = o94.c.g(ef1Var, j);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = zq1.b(o94.c.h(ef1Var, j));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = o94.c.g(ef1Var, j);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = zq1.b(o94.c.h(ef1Var, j));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objI2 = o94.c.i(ef1Var, j);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
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
                    i = i3 * 53;
                    iB = o94.c.i(ef1Var, j).hashCode();
                    i3 = iB + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = o94.c.i(ef1Var, j).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = zq1.b(Double.doubleToLongBits(((Double) o94.c.i(ef1Var, j)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) o94.c.i(ef1Var, j)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = zq1.b(F(ef1Var, j));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = zq1.b(F(ef1Var, j));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = E(ef1Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = zq1.b(F(ef1Var, j));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = E(ef1Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (u(i5, i4, ef1Var)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) o94.c.i(ef1Var, j)).booleanValue();
                        Charset charset2 = zq1.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = ((String) o94.c.i(ef1Var, j)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = o94.c.i(ef1Var, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = o94.c.i(ef1Var, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = E(ef1Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = E(ef1Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = E(ef1Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = zq1.b(F(ef1Var, j));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = E(ef1Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = zq1.b(F(ef1Var, j));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (u(i5, i4, ef1Var)) {
                        i = i3 * 53;
                        iB = o94.c.i(ef1Var, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        this.m.getClass();
        return ef1Var.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.za3
    public final void c(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                cb3.w(this.m, obj, obj2);
                return;
            }
            int iV = V(i);
            long j = 1048575 & iV;
            int i2 = iArr[i];
            switch (U(iV)) {
                case 0:
                    if (!s(i, obj2)) {
                        obj3 = obj;
                    } else {
                        n94 n94Var = o94.c;
                        obj3 = obj;
                        n94Var.m(obj3, j, n94Var.e(obj2, j));
                        P(i, obj3);
                    }
                    break;
                case 1:
                    if (s(i, obj2)) {
                        n94 n94Var2 = o94.c;
                        n94Var2.n(obj, j, n94Var2.f(obj2, j));
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i, obj2)) {
                        o94.o(obj, j, o94.c.h(obj2, j));
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i, obj2)) {
                        o94.o(obj, j, o94.c.h(obj2, j));
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i, obj2)) {
                        o94.n(o94.c.g(obj2, j), j, obj);
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i, obj2)) {
                        o94.o(obj, j, o94.c.h(obj2, j));
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i, obj2)) {
                        o94.n(o94.c.g(obj2, j), j, obj);
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i, obj2)) {
                        n94 n94Var3 = o94.c;
                        n94Var3.k(obj, j, n94Var3.c(obj2, j));
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i, obj2)) {
                        o94.p(j, obj, o94.c.i(obj2, j));
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    x(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i, obj2)) {
                        o94.p(j, obj, o94.c.i(obj2, j));
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (s(i, obj2)) {
                        o94.n(o94.c.g(obj2, j), j, obj);
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i, obj2)) {
                        o94.n(o94.c.g(obj2, j), j, obj);
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i, obj2)) {
                        o94.n(o94.c.g(obj2, j), j, obj);
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i, obj2)) {
                        o94.o(obj, j, o94.c.h(obj2, j));
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i, obj2)) {
                        o94.n(o94.c.g(obj2, j), j, obj);
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i, obj2)) {
                        o94.o(obj, j, o94.c.h(obj2, j));
                        P(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    x(obj, i, obj2);
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
                    this.l.b(j, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = cb3.a;
                    n94 n94Var4 = o94.c;
                    Object objI = n94Var4.i(obj, j);
                    Object objI2 = n94Var4.i(obj2, j);
                    this.n.getClass();
                    o94.p(j, obj, u92.b(objI, objI2));
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
                    if (u(i2, i, obj2)) {
                        o94.p(j, obj, o94.c.i(obj2, j));
                        Q(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    y(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(i2, i, obj2)) {
                        o94.p(j, obj, o94.c.i(obj2, j));
                        Q(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    y(obj, i, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[SYNTHETIC] */
    @Override // defpackage.za3
    public final void d(Object obj) {
        if (t(obj)) {
            if (obj instanceof ef1) {
                ef1 ef1Var = (ef1) obj;
                ef1Var.u(IntCompanionObject.MAX_VALUE);
                ef1Var.memoizedHashCode = 0;
                ef1Var.o();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int iV = V(i);
                long j = 1048575 & iV;
                int iU = U(iV);
                if (iU != 9) {
                    switch (iU) {
                        case 17:
                            if (s(i, obj)) {
                                p(i).d(p.getObject(obj, j));
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
                            this.l.a(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = p;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                this.n.getClass();
                                ((t92) object).c = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (s(i, obj)) {
                    p(i).d(p.getObject(obj, j));
                }
            }
            this.m.getClass();
            ((ef1) obj).unknownFields.e = false;
        }
    }

    @Override // defpackage.za3
    public final int e(ef1 ef1Var) {
        return this.g ? r(ef1Var) : q(ef1Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef A[SYNTHETIC] */
    @Override // defpackage.za3
    public final boolean f(Object obj) {
        int iU;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean zS = true;
            if (i2 >= this.i) {
                return true;
            }
            int i4 = this.h[i2];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int iV = V(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = p.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & iV) == 0) {
                iU = U(iV);
                if (iU != 9 || iU == 17) {
                    if (i == 1048575) {
                        zS = s(i4, obj);
                    } else if ((i8 & i3) == 0) {
                        zS = false;
                    }
                    if (zS) {
                        continue;
                    } else if (!p(i4).f(o94.c.i(obj, iV & 1048575))) {
                    }
                    i2++;
                } else {
                    if (iU != 27) {
                        if (iU == 60 || iU == 68) {
                            if (!u(i5, i4, obj)) {
                                continue;
                            } else if (!p(i4).f(o94.c.i(obj, iV & 1048575))) {
                            }
                        } else if (iU != 49) {
                            if (iU != 50) {
                                continue;
                            } else {
                                Object objI = o94.c.i(obj, iV & 1048575);
                                this.n.getClass();
                                if (!((t92) objI).isEmpty()) {
                                    fq2.y(o(i4));
                                    throw null;
                                }
                            }
                        }
                        i2++;
                    }
                    List list = (List) o94.c.i(obj, iV & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        za3 za3VarP = p(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (za3VarP.f(list.get(i9))) {
                            }
                        }
                    }
                    i2++;
                }
            } else {
                if (i == 1048575 ? s(i4, obj) : (i3 & i8) != 0) {
                    iU = U(iV);
                    if (iU != 9) {
                    }
                    if (i == 1048575) {
                        zS = s(i4, obj);
                    } else if ((i8 & i3) == 0) {
                        zS = false;
                    }
                    if (zS) {
                        continue;
                    } else if (!p(i4).f(o94.c.i(obj, iV & 1048575))) {
                    }
                    i2++;
                }
            }
            return false;
        }
    }

    @Override // defpackage.za3
    public final void g(Object obj, byte[] bArr, int i, int i2, jl jlVar) throws sr1 {
        if (this.g) {
            J(obj, bArr, i, i2, jlVar);
        } else {
            I(obj, bArr, i, i2, 0, jlVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // defpackage.za3
    public final boolean h(ef1 ef1Var, ef1 ef1Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zX = true;
            if (i < length) {
                int iV = V(i);
                long j = iV & 1048575;
                switch (U(iV)) {
                    case 0:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var = o94.c;
                            if (Double.doubleToLongBits(n94Var.e(ef1Var, j)) != Double.doubleToLongBits(n94Var.e(ef1Var2, j))) {
                                zX = false;
                            }
                        }
                        break;
                    case 1:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var2 = o94.c;
                            if (Float.floatToIntBits(n94Var2.f(ef1Var, j)) != Float.floatToIntBits(n94Var2.f(ef1Var2, j))) {
                                zX = false;
                            }
                        }
                        break;
                    case 2:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var3 = o94.c;
                            if (n94Var3.h(ef1Var, j) != n94Var3.h(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 3:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var4 = o94.c;
                            if (n94Var4.h(ef1Var, j) != n94Var4.h(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 4:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var5 = o94.c;
                            if (n94Var5.g(ef1Var, j) != n94Var5.g(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 5:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var6 = o94.c;
                            if (n94Var6.h(ef1Var, j) != n94Var6.h(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 6:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var7 = o94.c;
                            if (n94Var7.g(ef1Var, j) != n94Var7.g(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 7:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var8 = o94.c;
                            if (n94Var8.c(ef1Var, j) != n94Var8.c(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 8:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var9 = o94.c;
                            if (!cb3.x(n94Var9.i(ef1Var, j), n94Var9.i(ef1Var2, j))) {
                                zX = false;
                            }
                        }
                        break;
                    case 9:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var10 = o94.c;
                            if (!cb3.x(n94Var10.i(ef1Var, j), n94Var10.i(ef1Var2, j))) {
                                zX = false;
                            }
                        }
                        break;
                    case 10:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var11 = o94.c;
                            if (!cb3.x(n94Var11.i(ef1Var, j), n94Var11.i(ef1Var2, j))) {
                                zX = false;
                            }
                        }
                        break;
                    case 11:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var12 = o94.c;
                            if (n94Var12.g(ef1Var, j) != n94Var12.g(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 12:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var13 = o94.c;
                            if (n94Var13.g(ef1Var, j) != n94Var13.g(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 13:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var14 = o94.c;
                            if (n94Var14.g(ef1Var, j) != n94Var14.g(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 14:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var15 = o94.c;
                            if (n94Var15.h(ef1Var, j) != n94Var15.h(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 15:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var16 = o94.c;
                            if (n94Var16.g(ef1Var, j) != n94Var16.g(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 16:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var17 = o94.c;
                            if (n94Var17.h(ef1Var, j) != n94Var17.h(ef1Var2, j)) {
                                zX = false;
                            }
                        }
                        break;
                    case 17:
                        if (!k(ef1Var, ef1Var2, i)) {
                            zX = false;
                        } else {
                            n94 n94Var18 = o94.c;
                            if (!cb3.x(n94Var18.i(ef1Var, j), n94Var18.i(ef1Var2, j))) {
                                zX = false;
                            }
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
                        n94 n94Var19 = o94.c;
                        zX = cb3.x(n94Var19.i(ef1Var, j), n94Var19.i(ef1Var2, j));
                        break;
                    case 50:
                        n94 n94Var20 = o94.c;
                        zX = cb3.x(n94Var20.i(ef1Var, j), n94Var20.i(ef1Var2, j));
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
                        long j2 = iArr[i + 2] & 1048575;
                        n94 n94Var21 = o94.c;
                        if (n94Var21.g(ef1Var, j2) != n94Var21.g(ef1Var2, j2) || !cb3.x(n94Var21.i(ef1Var, j), n94Var21.i(ef1Var2, j))) {
                            zX = false;
                        }
                        break;
                }
                if (zX) {
                    i += 3;
                }
            } else {
                this.m.getClass();
                if (ef1Var.unknownFields.equals(ef1Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x063c A[Catch: all -> 0x046a, TryCatch #5 {all -> 0x046a, blocks: (B:148:0x0637, B:150:0x063c, B:151:0x0641, B:118:0x045e, B:123:0x0472, B:124:0x048e, B:125:0x04ab, B:126:0x04c8, B:127:0x04e7, B:128:0x0503, B:129:0x0518, B:130:0x0533, B:131:0x0540, B:132:0x055e, B:133:0x057b, B:134:0x0598, B:135:0x05b4, B:136:0x05d0, B:137:0x05ec, B:138:0x060a, B:142:0x0628), top: B:177:0x0637 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0649 A[LOOP:2: B:153:0x0647->B:154:0x0649, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x0663 A[LOOP:3: B:161:0x0661->B:162:0x0663, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x066d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.za3
    public final void i(Object obj, ce0 ce0Var, b61 b61Var) throws Throwable {
        vd2 vd2Var;
        z84 z84Var;
        int[] iArr;
        ce0 ce0Var2;
        vd2 vd2Var2 = this;
        Object obj2 = obj;
        ce0 ce0Var3 = ce0Var;
        b61 b61Var2 = b61Var;
        b61Var2.getClass();
        l(obj2);
        z84 z84Var2 = vd2Var2.m;
        int[] iArr2 = vd2Var2.h;
        int i = vd2Var2.j;
        int i2 = vd2Var2.i;
        y84 y84VarA = null;
        while (true) {
            try {
                int iA = ce0Var3.a();
                int iR = (iA < vd2Var2.c || iA > vd2Var2.d) ? -1 : vd2Var2.R(iA, 0);
                if (iR >= 0) {
                    int iV = vd2Var2.V(iR);
                    try {
                        int iU = U(iV);
                        g52 g52Var = vd2Var2.l;
                        switch (iU) {
                            case 0:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD = D(iV);
                                ce0Var2.x(1);
                                Object obj3 = obj2;
                                try {
                                    o94.c.m(obj3, jD, ((be0) ce0Var2.d).t());
                                    obj2 = obj3;
                                    vd2Var.P(iR, obj2);
                                } catch (rr1 unused) {
                                    obj2 = obj3;
                                    try {
                                        z84Var.getClass();
                                        if (y84VarA == null) {
                                            y84VarA = z84.a(obj2);
                                        }
                                        if (!z84.b(y84VarA, ce0Var2)) {
                                            while (i2 < i) {
                                                vd2Var.m(obj2, iArr[i2], y84VarA);
                                                i2++;
                                            }
                                            if (y84VarA == null) {
                                                return;
                                            }
                                            ((ef1) obj2).unknownFields = y84VarA;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        while (i2 < i) {
                                            vd2Var.m(obj2, iArr[i2], y84VarA);
                                            i2++;
                                        }
                                        if (y84VarA != null) {
                                            z84Var.getClass();
                                            ((ef1) obj2).unknownFields = y84VarA;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj3;
                                    while (i2 < i) {
                                        vd2Var.m(obj2, iArr[i2], y84VarA);
                                        i2++;
                                    }
                                    if (y84VarA != null) {
                                        z84Var.getClass();
                                        ((ef1) obj2).unknownFields = y84VarA;
                                    }
                                    throw th;
                                }
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 1:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD2 = D(iV);
                                ce0Var2.x(5);
                                o94.c.n(obj2, jD2, ((be0) ce0Var2.d).x());
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 2:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD3 = D(iV);
                                ce0Var2.x(0);
                                o94.o(obj2, jD3, ((be0) ce0Var2.d).z());
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 3:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD4 = D(iV);
                                ce0Var2.x(0);
                                o94.o(obj2, jD4, ((be0) ce0Var2.d).I());
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 4:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD5 = D(iV);
                                ce0Var2.x(0);
                                o94.n(((be0) ce0Var2.d).y(), jD5, obj2);
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 5:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD6 = D(iV);
                                ce0Var2.x(1);
                                o94.o(obj2, jD6, ((be0) ce0Var2.d).w());
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 6:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD7 = D(iV);
                                ce0Var2.x(5);
                                o94.n(((be0) ce0Var2.d).v(), jD7, obj2);
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 7:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD8 = D(iV);
                                ce0Var2.x(0);
                                o94.c.k(obj2, jD8, ((be0) ce0Var2.d).r());
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 8:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                vd2Var.N(obj2, iV, ce0Var2);
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 9:
                                ce0Var2 = ce0Var3;
                                b61 b61Var3 = b61Var2;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                g0 g0Var = (g0) vd2Var.z(iR, obj2);
                                za3 za3VarP = vd2Var.p(iR);
                                ce0Var2.x(2);
                                ce0Var2.e(g0Var, za3VarP, b61Var3);
                                vd2Var.S(obj2, iR, g0Var);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 10:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                o94.p(D(iV), obj2, ce0Var2.g());
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 11:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD9 = D(iV);
                                ce0Var2.x(0);
                                o94.n(((be0) ce0Var2.d).H(), jD9, obj2);
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 12:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                ce0Var2.x(0);
                                int iU2 = ((be0) ce0Var2.d).u();
                                vd2Var.n(iR);
                                o94.n(iU2, D(iV), obj2);
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 13:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD10 = D(iV);
                                ce0Var2.x(5);
                                o94.n(((be0) ce0Var2.d).A(), jD10, obj2);
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 14:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD11 = D(iV);
                                ce0Var2.x(1);
                                o94.o(obj2, jD11, ((be0) ce0Var2.d).B());
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 15:
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var = vd2Var2;
                                long jD12 = D(iV);
                                ce0Var2.x(0);
                                o94.n(((be0) ce0Var2.d).C(), jD12, obj2);
                                vd2Var.P(iR, obj2);
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 16:
                                ce0Var2 = ce0Var3;
                                vd2Var = vd2Var2;
                                long jD13 = D(iV);
                                ce0Var2.x(0);
                                z84Var = z84Var2;
                                iArr = iArr2;
                                try {
                                    o94.o(obj2, jD13, ((be0) ce0Var2.d).D());
                                    vd2Var.P(iR, obj2);
                                } catch (rr1 unused2) {
                                    z84Var.getClass();
                                    if (y84VarA == null) {
                                        y84VarA = z84.a(obj2);
                                    }
                                    if (!z84.b(y84VarA, ce0Var2)) {
                                        while (i2 < i) {
                                            vd2Var.m(obj2, iArr[i2], y84VarA);
                                            i2++;
                                        }
                                        if (y84VarA == null) {
                                            return;
                                        }
                                        ((ef1) obj2).unknownFields = y84VarA;
                                    }
                                }
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 17:
                                ce0Var2 = ce0Var3;
                                b61 b61Var4 = b61Var2;
                                vd2Var = vd2Var2;
                                g0 g0Var2 = (g0) vd2Var.z(iR, obj2);
                                za3 za3VarP2 = vd2Var.p(iR);
                                ce0Var2.x(3);
                                ce0Var2.d(g0Var2, za3VarP2, b61Var4);
                                vd2Var.S(obj2, iR, g0Var2);
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 18:
                                ce0Var2 = ce0Var3;
                                vd2Var = vd2Var2;
                                ce0Var2.i(g52Var.c(obj2, D(iV)));
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 19:
                                ce0Var2 = ce0Var3;
                                vd2Var = vd2Var2;
                                ce0Var2.m(g52Var.c(obj2, D(iV)));
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                                ce0Var2 = ce0Var3;
                                vd2Var = vd2Var2;
                                ce0Var2.o(g52Var.c(obj2, D(iV)));
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 21:
                                ce0Var2 = ce0Var3;
                                vd2Var = vd2Var2;
                                ce0Var2.v(g52Var.c(obj2, iV & 1048575));
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 22:
                                ce0Var2 = ce0Var3;
                                vd2Var = vd2Var2;
                                ce0Var2.n(g52Var.c(obj2, iV & 1048575));
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 23:
                                ce0Var2 = ce0Var3;
                                vd2Var = vd2Var2;
                                ce0Var2.l(g52Var.c(obj2, iV & 1048575));
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 24:
                                ce0Var2 = ce0Var3;
                                vd2Var = vd2Var2;
                                ce0Var2.k(g52Var.c(obj2, iV & 1048575));
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 25:
                                ce0Var2 = ce0Var3;
                                vd2Var = vd2Var2;
                                ce0Var2.f(g52Var.c(obj2, iV & 1048575));
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 26:
                                ce0Var2 = ce0Var3;
                                vd2Var = vd2Var2;
                                if ((536870912 & iV) != 0) {
                                    try {
                                        ce0Var2.t(g52Var.c(obj2, iV & 1048575), true);
                                    } catch (rr1 unused3) {
                                        z84Var = z84Var2;
                                        iArr = iArr2;
                                        z84Var.getClass();
                                        if (y84VarA == null) {
                                            y84VarA = z84.a(obj2);
                                        }
                                        if (!z84.b(y84VarA, ce0Var2)) {
                                            while (i2 < i) {
                                                vd2Var.m(obj2, iArr[i2], y84VarA);
                                                i2++;
                                            }
                                            if (y84VarA == null) {
                                                return;
                                            }
                                            ((ef1) obj2).unknownFields = y84VarA;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z84Var = z84Var2;
                                        iArr = iArr2;
                                        while (i2 < i) {
                                            vd2Var.m(obj2, iArr[i2], y84VarA);
                                            i2++;
                                        }
                                        if (y84VarA != null) {
                                            z84Var.getClass();
                                            ((ef1) obj2).unknownFields = y84VarA;
                                        }
                                        throw th;
                                    }
                                } else {
                                    ce0Var2.t(g52Var.c(obj2, iV & 1048575), false);
                                }
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 27:
                                try {
                                    try {
                                        vd2Var2.M(obj2, iV, ce0Var3, vd2Var2.p(iR), b61Var);
                                        ce0Var2 = ce0Var3;
                                        vd2Var = vd2Var2;
                                        z84Var = z84Var2;
                                        iArr = iArr2;
                                    } catch (rr1 unused4) {
                                        ce0Var2 = ce0Var3;
                                        vd2Var = vd2Var2;
                                        z84Var = z84Var2;
                                        iArr = iArr2;
                                        z84Var.getClass();
                                        if (y84VarA == null) {
                                            y84VarA = z84.a(obj2);
                                        }
                                        if (!z84.b(y84VarA, ce0Var2)) {
                                            while (i2 < i) {
                                                vd2Var.m(obj2, iArr[i2], y84VarA);
                                                i2++;
                                            }
                                            if (y84VarA == null) {
                                                return;
                                            }
                                            ((ef1) obj2).unknownFields = y84VarA;
                                        }
                                    }
                                } catch (rr1 unused5) {
                                    vd2Var = vd2Var2;
                                    ce0Var2 = ce0Var3;
                                    z84Var = z84Var2;
                                    iArr = iArr2;
                                    z84Var.getClass();
                                    if (y84VarA == null) {
                                        y84VarA = z84.a(obj2);
                                    }
                                    if (!z84.b(y84VarA, ce0Var2)) {
                                        while (i2 < i) {
                                            vd2Var.m(obj2, iArr[i2], y84VarA);
                                            i2++;
                                        }
                                        if (y84VarA == null) {
                                            return;
                                        }
                                        ((ef1) obj2).unknownFields = y84VarA;
                                    }
                                    vd2Var2 = vd2Var;
                                    z84Var2 = z84Var;
                                    ce0Var3 = ce0Var2;
                                    iArr2 = iArr;
                                    b61Var2 = b61Var;
                                    break;
                                }
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 28:
                                ce0Var3.h(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 29:
                                ce0Var3.u(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 30:
                                ce0Var3.j(g52Var.c(obj2, iV & 1048575));
                                vd2Var2.n(iR);
                                Class cls = cb3.a;
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 31:
                                ce0Var3.p(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 32:
                                ce0Var3.q(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 33:
                                ce0Var3.r(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 34:
                                ce0Var3.s(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 35:
                                ce0Var3.i(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 36:
                                ce0Var3.m(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 37:
                                ce0Var3.o(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 38:
                                ce0Var3.v(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 39:
                                ce0Var3.n(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 40:
                                ce0Var3.l(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 41:
                                ce0Var3.k(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 42:
                                ce0Var3.f(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 43:
                                ce0Var3.u(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 44:
                                ce0Var3.j(g52Var.c(obj2, iV & 1048575));
                                vd2Var2.n(iR);
                                Class cls2 = cb3.a;
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 45:
                                ce0Var3.p(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 46:
                                ce0Var3.q(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 47:
                                ce0Var3.r(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 48:
                                ce0Var3.s(g52Var.c(obj2, iV & 1048575));
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 49:
                                ce0 ce0Var4 = ce0Var3;
                                try {
                                    vd2Var2.L(obj2, iV & 1048575, ce0Var4, vd2Var2.p(iR), b61Var);
                                    ce0Var3 = ce0Var4;
                                    vd2Var = vd2Var2;
                                    ce0Var2 = ce0Var3;
                                    z84Var = z84Var2;
                                    iArr = iArr2;
                                } catch (rr1 unused6) {
                                    vd2Var = vd2Var2;
                                    ce0Var2 = ce0Var4;
                                    z84Var = z84Var2;
                                    iArr = iArr2;
                                    z84Var.getClass();
                                    if (y84VarA == null) {
                                        y84VarA = z84.a(obj2);
                                    }
                                    if (!z84.b(y84VarA, ce0Var2)) {
                                        while (i2 < i) {
                                            vd2Var.m(obj2, iArr[i2], y84VarA);
                                            i2++;
                                        }
                                        if (y84VarA == null) {
                                            return;
                                        }
                                        ((ef1) obj2).unknownFields = y84VarA;
                                    }
                                }
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 50:
                                vd2Var2.w(obj2, iR, vd2Var2.o(iR));
                                throw null;
                            case 51:
                                ce0Var3.x(1);
                                o94.p(iV & 1048575, obj2, Double.valueOf(((be0) ce0Var3.d).t()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 52:
                                ce0Var3.x(5);
                                o94.p(iV & 1048575, obj2, Float.valueOf(((be0) ce0Var3.d).x()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 53:
                                ce0Var3.x(0);
                                o94.p(iV & 1048575, obj2, Long.valueOf(((be0) ce0Var3.d).z()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 54:
                                ce0Var3.x(0);
                                o94.p(iV & 1048575, obj2, Long.valueOf(((be0) ce0Var3.d).I()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 55:
                                ce0Var3.x(0);
                                o94.p(iV & 1048575, obj2, Integer.valueOf(((be0) ce0Var3.d).y()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 56:
                                ce0Var3.x(1);
                                o94.p(iV & 1048575, obj2, Long.valueOf(((be0) ce0Var3.d).w()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 57:
                                ce0Var3.x(5);
                                o94.p(iV & 1048575, obj2, Integer.valueOf(((be0) ce0Var3.d).v()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 58:
                                ce0Var3.x(0);
                                o94.p(iV & 1048575, obj2, Boolean.valueOf(((be0) ce0Var3.d).r()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 59:
                                vd2Var2.N(obj2, iV, ce0Var3);
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 60:
                                g0 g0Var3 = (g0) vd2Var2.A(iA, iR, obj2);
                                za3 za3VarP3 = vd2Var2.p(iR);
                                ce0Var3.x(2);
                                ce0Var3.e(g0Var3, za3VarP3, b61Var2);
                                vd2Var2.T(iA, iR, obj2, g0Var3);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 61:
                                o94.p(iV & 1048575, obj2, ce0Var3.g());
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 62:
                                ce0Var3.x(0);
                                o94.p(iV & 1048575, obj2, Integer.valueOf(((be0) ce0Var3.d).H()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 63:
                                ce0Var3.x(0);
                                int iU3 = ((be0) ce0Var3.d).u();
                                vd2Var2.n(iR);
                                o94.p(iV & 1048575, obj2, Integer.valueOf(iU3));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 64:
                                ce0Var3.x(5);
                                o94.p(iV & 1048575, obj2, Integer.valueOf(((be0) ce0Var3.d).A()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 65:
                                ce0Var3.x(1);
                                o94.p(iV & 1048575, obj2, Long.valueOf(((be0) ce0Var3.d).B()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 66:
                                ce0Var3.x(0);
                                o94.p(iV & 1048575, obj2, Integer.valueOf(((be0) ce0Var3.d).C()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 67:
                                ce0Var3.x(0);
                                o94.p(iV & 1048575, obj2, Long.valueOf(((be0) ce0Var3.d).D()));
                                vd2Var2.Q(iA, iR, obj2);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            case 68:
                                g0 g0Var4 = (g0) vd2Var2.A(iA, iR, obj2);
                                za3 za3VarP4 = vd2Var2.p(iR);
                                ce0Var3.x(3);
                                ce0Var3.d(g0Var4, za3VarP4, b61Var2);
                                vd2Var2.T(iA, iR, obj2, g0Var4);
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                            default:
                                if (y84VarA == null) {
                                    try {
                                        z84Var2.getClass();
                                        y84VarA = z84.a(obj2);
                                    } catch (rr1 unused7) {
                                        vd2Var = vd2Var2;
                                        ce0Var2 = ce0Var3;
                                        z84Var = z84Var2;
                                        iArr = iArr2;
                                        z84Var.getClass();
                                        if (y84VarA == null) {
                                            y84VarA = z84.a(obj2);
                                        }
                                        if (!z84.b(y84VarA, ce0Var2)) {
                                            while (i2 < i) {
                                                vd2Var.m(obj2, iArr[i2], y84VarA);
                                                i2++;
                                            }
                                            if (y84VarA == null) {
                                                return;
                                            }
                                            ((ef1) obj2).unknownFields = y84VarA;
                                        }
                                    }
                                }
                                z84Var2.getClass();
                                if (!z84.b(y84VarA, ce0Var3)) {
                                    while (i2 < i) {
                                        vd2Var2.m(obj2, iArr2[i2], y84VarA);
                                        i2++;
                                    }
                                    if (y84VarA == null) {
                                        return;
                                    }
                                }
                                vd2Var = vd2Var2;
                                ce0Var2 = ce0Var3;
                                z84Var = z84Var2;
                                iArr = iArr2;
                                vd2Var2 = vd2Var;
                                z84Var2 = z84Var;
                                ce0Var3 = ce0Var2;
                                iArr2 = iArr;
                                b61Var2 = b61Var;
                                break;
                        }
                    } catch (rr1 unused8) {
                        vd2Var = vd2Var2;
                        ce0Var2 = ce0Var3;
                        z84Var = z84Var2;
                        iArr = iArr2;
                    }
                } else if (iA == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        vd2Var2.m(obj2, iArr2[i2], y84VarA);
                        i2++;
                    }
                    if (y84VarA == null) {
                        return;
                    } else {
                        z84Var2.getClass();
                    }
                } else {
                    z84Var2.getClass();
                    if (y84VarA == null) {
                        y84VarA = z84.a(obj2);
                    }
                    if (!z84.b(y84VarA, ce0Var3)) {
                        while (i2 < i) {
                            vd2Var2.m(obj2, iArr2[i2], y84VarA);
                            i2++;
                        }
                        if (y84VarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                vd2Var = vd2Var2;
            }
        }
        ((ef1) obj2).unknownFields = y84VarA;
    }

    @Override // defpackage.za3
    public final Object j() {
        this.k.getClass();
        return ((ef1) this.e).q();
    }

    public final boolean k(ef1 ef1Var, ef1 ef1Var2, int i) {
        return s(i, ef1Var) == s(i, ef1Var2);
    }

    public final void m(Object obj, int i, Object obj2) {
        int i2 = this.a[i];
        if (o94.c.i(obj, V(i) & 1048575) == null) {
            return;
        }
        n(i);
    }

    public final void n(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        m51.t();
    }

    public final Object o(int i) {
        return this.b[(i / 3) * 2];
    }

    public final za3 p(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        za3 za3Var = (za3) objArr[i2];
        if (za3Var != null) {
            return za3Var;
        }
        za3 za3VarA = j13.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = za3VarA;
        return za3VarA;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    public final int q(ef1 ef1Var) {
        int i;
        int iH;
        int iJ;
        int iH2;
        int iF;
        int iD;
        int iH3;
        int iG;
        int iH4;
        int size;
        int iH5;
        int iB;
        int iG2;
        int iH6;
        int iE;
        int iG3;
        Unsafe unsafe = p;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int iH7 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                this.m.getClass();
                return ef1Var.unknownFields.b() + iH7;
            }
            int iV = V(i4);
            int i6 = iArr[i4];
            int iU = U(iV);
            if (iU <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                i = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i5 = unsafe.getInt(ef1Var, i8);
                    i3 = i8;
                }
            } else {
                i = 0;
            }
            long j = iV & i2;
            switch (iU) {
                case 0:
                    if ((i5 & i) != 0) {
                        iH7 = ud2.f(i6, 8, iH7);
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        iH7 = ud2.f(i6, 4, iH7);
                    }
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        long j2 = unsafe.getLong(ef1Var, j);
                        iH = de0.h(i6);
                        iJ = de0.j(j2);
                        iD = iJ + iH;
                        iH7 += iD;
                    }
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        long j3 = unsafe.getLong(ef1Var, j);
                        iH = de0.h(i6);
                        iJ = de0.j(j3);
                        iD = iJ + iH;
                        iH7 += iD;
                    }
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        int i9 = unsafe.getInt(ef1Var, j);
                        iH2 = de0.h(i6);
                        iF = de0.f(i9);
                        iD = iF + iH2;
                        iH7 += iD;
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        iD = de0.d(i6);
                        iH7 += iD;
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        iD = de0.c(i6);
                        iH7 += iD;
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        iH7 = ud2.f(i6, 1, iH7);
                    }
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        Object object = unsafe.getObject(ef1Var, j);
                        if (object instanceof mz) {
                            iH4 = de0.h(i6);
                            size = ((mz) object).size();
                            iG3 = ud2.g(size, size, iH4, iH7);
                            iH7 = iG3;
                        } else {
                            iH3 = de0.h(i6);
                            iG = de0.g((String) object);
                            iG3 = iG + iH3 + iH7;
                            iH7 = iG3;
                        }
                    }
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        Object object2 = unsafe.getObject(ef1Var, j);
                        za3 za3VarP = p(i4);
                        Class cls = cb3.a;
                        iH5 = de0.h(i6);
                        iB = ((g0) object2).b(za3VarP);
                        iH7 = ud2.g(iB, iB, iH5, iH7);
                    }
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        iD = de0.a(i6, (mz) unsafe.getObject(ef1Var, j));
                        iH7 += iD;
                    }
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        int i10 = unsafe.getInt(ef1Var, j);
                        iH2 = de0.h(i6);
                        iF = de0.i(i10);
                        iD = iF + iH2;
                        iH7 += iD;
                    }
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        int i11 = unsafe.getInt(ef1Var, j);
                        iH2 = de0.h(i6);
                        iF = de0.f(i11);
                        iD = iF + iH2;
                        iH7 += iD;
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        iH7 = ud2.f(i6, 4, iH7);
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        iH7 = ud2.f(i6, 8, iH7);
                    }
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        int i12 = unsafe.getInt(ef1Var, j);
                        iH2 = de0.h(i6);
                        iF = de0.i((i12 >> 31) ^ (i12 << 1));
                        iD = iF + iH2;
                        iH7 += iD;
                    }
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        long j4 = unsafe.getLong(ef1Var, j);
                        iH = de0.h(i6);
                        iJ = de0.j((j4 >> 63) ^ (j4 << 1));
                        iD = iJ + iH;
                        iH7 += iD;
                    }
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        iD = de0.e(i6, (g0) unsafe.getObject(ef1Var, j), p(i4));
                        iH7 += iD;
                    }
                    break;
                case 18:
                    iD = cb3.f(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 19:
                    iD = cb3.d(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                    iD = cb3.j(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 21:
                    iD = cb3.t(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 22:
                    iD = cb3.h(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 23:
                    iD = cb3.f(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 24:
                    iD = cb3.d(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(ef1Var, j);
                    Class cls2 = cb3.a;
                    int size2 = list.size();
                    iH7 += size2 == 0 ? 0 : (de0.h(i6) + 1) * size2;
                    break;
                case 26:
                    iD = cb3.q(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 27:
                    iD = cb3.l(i6, (List) unsafe.getObject(ef1Var, j), p(i4));
                    iH7 += iD;
                    break;
                case 28:
                    iD = cb3.a(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 29:
                    iD = cb3.r(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 30:
                    iD = cb3.b(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 31:
                    iD = cb3.d(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 32:
                    iD = cb3.f(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 33:
                    iD = cb3.m(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 34:
                    iD = cb3.o(i6, (List) unsafe.getObject(ef1Var, j));
                    iH7 += iD;
                    break;
                case 35:
                    iG2 = cb3.g((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 36:
                    iG2 = cb3.e((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 37:
                    iG2 = cb3.k((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 38:
                    iG2 = cb3.u((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 39:
                    iG2 = cb3.i((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 40:
                    iG2 = cb3.g((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 41:
                    iG2 = cb3.e((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 42:
                    List list2 = (List) unsafe.getObject(ef1Var, j);
                    Class cls3 = cb3.a;
                    iG2 = list2.size();
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 43:
                    iG2 = cb3.s((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 44:
                    iG2 = cb3.c((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 45:
                    iG2 = cb3.e((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 46:
                    iG2 = cb3.g((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 47:
                    iG2 = cb3.n((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 48:
                    iG2 = cb3.p((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH6 = de0.h(i6);
                        iH7 = ud2.g(iG2, iH6, iG2, iH7);
                    }
                    break;
                case 49:
                    List list3 = (List) unsafe.getObject(ef1Var, j);
                    za3 za3VarP2 = p(i4);
                    Class cls4 = cb3.a;
                    int size3 = list3.size();
                    if (size3 == 0) {
                        iE = 0;
                    } else {
                        iE = 0;
                        for (int i13 = 0; i13 < size3; i13++) {
                            iE += de0.e(i6, (g0) list3.get(i13), za3VarP2);
                        }
                    }
                    iH7 += iE;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(ef1Var, j);
                    Object objO = o(i4);
                    this.n.getClass();
                    u92.a(object3, objO);
                    break;
                case 51:
                    if (u(i6, i4, ef1Var)) {
                        iH7 = ud2.f(i6, 8, iH7);
                    }
                    break;
                case 52:
                    if (u(i6, i4, ef1Var)) {
                        iH7 = ud2.f(i6, 4, iH7);
                    }
                    break;
                case 53:
                    if (u(i6, i4, ef1Var)) {
                        long jF = F(ef1Var, j);
                        iH = de0.h(i6);
                        iJ = de0.j(jF);
                        iD = iJ + iH;
                        iH7 += iD;
                    }
                    break;
                case 54:
                    if (u(i6, i4, ef1Var)) {
                        long jF2 = F(ef1Var, j);
                        iH = de0.h(i6);
                        iJ = de0.j(jF2);
                        iD = iJ + iH;
                        iH7 += iD;
                    }
                    break;
                case 55:
                    if (u(i6, i4, ef1Var)) {
                        int iE2 = E(ef1Var, j);
                        iH2 = de0.h(i6);
                        iF = de0.f(iE2);
                        iD = iF + iH2;
                        iH7 += iD;
                    }
                    break;
                case 56:
                    if (u(i6, i4, ef1Var)) {
                        iD = de0.d(i6);
                        iH7 += iD;
                    }
                    break;
                case 57:
                    if (u(i6, i4, ef1Var)) {
                        iD = de0.c(i6);
                        iH7 += iD;
                    }
                    break;
                case 58:
                    if (u(i6, i4, ef1Var)) {
                        iH7 = ud2.f(i6, 1, iH7);
                    }
                    break;
                case 59:
                    if (u(i6, i4, ef1Var)) {
                        Object object4 = unsafe.getObject(ef1Var, j);
                        if (object4 instanceof mz) {
                            iH4 = de0.h(i6);
                            size = ((mz) object4).size();
                            iG3 = ud2.g(size, size, iH4, iH7);
                            iH7 = iG3;
                        } else {
                            iH3 = de0.h(i6);
                            iG = de0.g((String) object4);
                            iG3 = iG + iH3 + iH7;
                            iH7 = iG3;
                        }
                    }
                    break;
                case 60:
                    if (u(i6, i4, ef1Var)) {
                        Object object5 = unsafe.getObject(ef1Var, j);
                        za3 za3VarP3 = p(i4);
                        Class cls5 = cb3.a;
                        iH5 = de0.h(i6);
                        iB = ((g0) object5).b(za3VarP3);
                        iH7 = ud2.g(iB, iB, iH5, iH7);
                    }
                    break;
                case 61:
                    if (u(i6, i4, ef1Var)) {
                        iD = de0.a(i6, (mz) unsafe.getObject(ef1Var, j));
                        iH7 += iD;
                    }
                    break;
                case 62:
                    if (u(i6, i4, ef1Var)) {
                        int iE3 = E(ef1Var, j);
                        iH2 = de0.h(i6);
                        iF = de0.i(iE3);
                        iD = iF + iH2;
                        iH7 += iD;
                    }
                    break;
                case 63:
                    if (u(i6, i4, ef1Var)) {
                        int iE4 = E(ef1Var, j);
                        iH2 = de0.h(i6);
                        iF = de0.f(iE4);
                        iD = iF + iH2;
                        iH7 += iD;
                    }
                    break;
                case 64:
                    if (u(i6, i4, ef1Var)) {
                        iH7 = ud2.f(i6, 4, iH7);
                    }
                    break;
                case 65:
                    if (u(i6, i4, ef1Var)) {
                        iH7 = ud2.f(i6, 8, iH7);
                    }
                    break;
                case 66:
                    if (u(i6, i4, ef1Var)) {
                        int iE5 = E(ef1Var, j);
                        iH2 = de0.h(i6);
                        iF = de0.i((iE5 >> 31) ^ (iE5 << 1));
                        iD = iF + iH2;
                        iH7 += iD;
                    }
                    break;
                case 67:
                    if (u(i6, i4, ef1Var)) {
                        long jF3 = F(ef1Var, j);
                        iH = de0.h(i6);
                        iJ = de0.j((jF3 >> 63) ^ (jF3 << 1));
                        iD = iJ + iH;
                        iH7 += iD;
                    }
                    break;
                case 68:
                    if (u(i6, i4, ef1Var)) {
                        iD = de0.e(i6, (g0) unsafe.getObject(ef1Var, j), p(i4));
                        iH7 += iD;
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    public final int r(ef1 ef1Var) {
        int iH;
        int iJ;
        int iH2;
        int iF;
        int iD;
        int iH3;
        int iG;
        int iH4;
        int size;
        int iH5;
        int iB;
        int iH6;
        int iJ2;
        int iG2;
        int iH7;
        int iE;
        Unsafe unsafe = p;
        int i = 0;
        int iH8 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.m.getClass();
                return ef1Var.unknownFields.b() + iH8;
            }
            int iV = V(i);
            int iU = U(iV);
            int i2 = iArr[i];
            long j = iV & 1048575;
            if (iU >= v61.d.c && iU <= v61.h.c) {
                int i3 = iArr[i + 2];
            }
            switch (iU) {
                case 0:
                    if (s(i, ef1Var)) {
                        iH8 = ud2.f(i2, 8, iH8);
                    }
                    break;
                case 1:
                    if (s(i, ef1Var)) {
                        iH8 = ud2.f(i2, 4, iH8);
                    }
                    break;
                case 2:
                    if (s(i, ef1Var)) {
                        long jH = o94.c.h(ef1Var, j);
                        iH = de0.h(i2);
                        iJ = de0.j(jH);
                        iD = iJ + iH;
                        iH8 += iD;
                    }
                    break;
                case 3:
                    if (s(i, ef1Var)) {
                        long jH2 = o94.c.h(ef1Var, j);
                        iH = de0.h(i2);
                        iJ = de0.j(jH2);
                        iD = iJ + iH;
                        iH8 += iD;
                    }
                    break;
                case 4:
                    if (s(i, ef1Var)) {
                        int iG3 = o94.c.g(ef1Var, j);
                        iH2 = de0.h(i2);
                        iF = de0.f(iG3);
                        iD = iF + iH2;
                        iH8 += iD;
                    }
                    break;
                case 5:
                    if (s(i, ef1Var)) {
                        iD = de0.d(i2);
                        iH8 += iD;
                    }
                    break;
                case 6:
                    if (s(i, ef1Var)) {
                        iD = de0.c(i2);
                        iH8 += iD;
                    }
                    break;
                case 7:
                    if (s(i, ef1Var)) {
                        iH8 = ud2.f(i2, 1, iH8);
                    }
                    break;
                case 8:
                    if (s(i, ef1Var)) {
                        Object objI = o94.c.i(ef1Var, j);
                        if (objI instanceof mz) {
                            iH4 = de0.h(i2);
                            size = ((mz) objI).size();
                            iH8 = ud2.g(size, size, iH4, iH8);
                        } else {
                            iH3 = de0.h(i2);
                            iG = de0.g((String) objI);
                            iH8 = iG + iH3 + iH8;
                        }
                    }
                    break;
                case 9:
                    if (s(i, ef1Var)) {
                        Object objI2 = o94.c.i(ef1Var, j);
                        za3 za3VarP = p(i);
                        Class cls = cb3.a;
                        iH5 = de0.h(i2);
                        iB = ((g0) objI2).b(za3VarP);
                        iH8 = ud2.g(iB, iB, iH5, iH8);
                    }
                    break;
                case 10:
                    if (s(i, ef1Var)) {
                        iD = de0.a(i2, (mz) o94.c.i(ef1Var, j));
                        iH8 += iD;
                    }
                    break;
                case 11:
                    if (s(i, ef1Var)) {
                        int iG4 = o94.c.g(ef1Var, j);
                        iH2 = de0.h(i2);
                        iF = de0.i(iG4);
                        iD = iF + iH2;
                        iH8 += iD;
                    }
                    break;
                case 12:
                    if (s(i, ef1Var)) {
                        int iG5 = o94.c.g(ef1Var, j);
                        iH2 = de0.h(i2);
                        iF = de0.f(iG5);
                        iD = iF + iH2;
                        iH8 += iD;
                    }
                    break;
                case 13:
                    if (s(i, ef1Var)) {
                        iH8 = ud2.f(i2, 4, iH8);
                    }
                    break;
                case 14:
                    if (s(i, ef1Var)) {
                        iH8 = ud2.f(i2, 8, iH8);
                    }
                    break;
                case 15:
                    if (s(i, ef1Var)) {
                        int iG6 = o94.c.g(ef1Var, j);
                        iH2 = de0.h(i2);
                        iF = de0.i((iG6 >> 31) ^ (iG6 << 1));
                        iD = iF + iH2;
                        iH8 += iD;
                    }
                    break;
                case 16:
                    if (s(i, ef1Var)) {
                        long jH3 = o94.c.h(ef1Var, j);
                        iH6 = de0.h(i2);
                        iJ2 = de0.j((jH3 >> 63) ^ (jH3 << 1));
                        iD = iJ2 + iH6;
                        iH8 += iD;
                    }
                    break;
                case 17:
                    if (s(i, ef1Var)) {
                        iD = de0.e(i2, (g0) o94.c.i(ef1Var, j), p(i));
                        iH8 += iD;
                    }
                    break;
                case 18:
                    iD = cb3.f(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 19:
                    iD = cb3.d(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                    iD = cb3.j(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 21:
                    iD = cb3.t(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 22:
                    iD = cb3.h(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 23:
                    iD = cb3.f(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 24:
                    iD = cb3.d(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 25:
                    List listV = v(ef1Var, j);
                    Class cls2 = cb3.a;
                    int size2 = listV.size();
                    iH8 += size2 == 0 ? 0 : (de0.h(i2) + 1) * size2;
                    break;
                case 26:
                    iD = cb3.q(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 27:
                    iD = cb3.l(i2, v(ef1Var, j), p(i));
                    iH8 += iD;
                    break;
                case 28:
                    iD = cb3.a(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 29:
                    iD = cb3.r(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 30:
                    iD = cb3.b(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 31:
                    iD = cb3.d(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 32:
                    iD = cb3.f(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 33:
                    iD = cb3.m(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 34:
                    iD = cb3.o(i2, v(ef1Var, j));
                    iH8 += iD;
                    break;
                case 35:
                    iG2 = cb3.g((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 36:
                    iG2 = cb3.e((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 37:
                    iG2 = cb3.k((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 38:
                    iG2 = cb3.u((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 39:
                    iG2 = cb3.i((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 40:
                    iG2 = cb3.g((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 41:
                    iG2 = cb3.e((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(ef1Var, j);
                    Class cls3 = cb3.a;
                    iG2 = list.size();
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 43:
                    iG2 = cb3.s((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 44:
                    iG2 = cb3.c((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 45:
                    iG2 = cb3.e((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 46:
                    iG2 = cb3.g((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 47:
                    iG2 = cb3.n((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 48:
                    iG2 = cb3.p((List) unsafe.getObject(ef1Var, j));
                    if (iG2 > 0) {
                        iH7 = de0.h(i2);
                        iH8 = ud2.g(iG2, iH7, iG2, iH8);
                    }
                    break;
                case 49:
                    List listV2 = v(ef1Var, j);
                    za3 za3VarP2 = p(i);
                    Class cls4 = cb3.a;
                    int size3 = listV2.size();
                    if (size3 == 0) {
                        iE = 0;
                    } else {
                        iE = 0;
                        for (int i4 = 0; i4 < size3; i4++) {
                            iE += de0.e(i2, (g0) listV2.get(i4), za3VarP2);
                        }
                    }
                    iH8 += iE;
                    break;
                case 50:
                    Object objI3 = o94.c.i(ef1Var, j);
                    Object objO = o(i);
                    this.n.getClass();
                    u92.a(objI3, objO);
                    break;
                case 51:
                    if (u(i2, i, ef1Var)) {
                        iH8 = ud2.f(i2, 8, iH8);
                    }
                    break;
                case 52:
                    if (u(i2, i, ef1Var)) {
                        iH8 = ud2.f(i2, 4, iH8);
                    }
                    break;
                case 53:
                    if (u(i2, i, ef1Var)) {
                        long jF = F(ef1Var, j);
                        iH = de0.h(i2);
                        iJ = de0.j(jF);
                        iD = iJ + iH;
                        iH8 += iD;
                    }
                    break;
                case 54:
                    if (u(i2, i, ef1Var)) {
                        long jF2 = F(ef1Var, j);
                        iH = de0.h(i2);
                        iJ = de0.j(jF2);
                        iD = iJ + iH;
                        iH8 += iD;
                    }
                    break;
                case 55:
                    if (u(i2, i, ef1Var)) {
                        int iE2 = E(ef1Var, j);
                        iH2 = de0.h(i2);
                        iF = de0.f(iE2);
                        iD = iF + iH2;
                        iH8 += iD;
                    }
                    break;
                case 56:
                    if (u(i2, i, ef1Var)) {
                        iD = de0.d(i2);
                        iH8 += iD;
                    }
                    break;
                case 57:
                    if (u(i2, i, ef1Var)) {
                        iD = de0.c(i2);
                        iH8 += iD;
                    }
                    break;
                case 58:
                    if (u(i2, i, ef1Var)) {
                        iH8 = ud2.f(i2, 1, iH8);
                    }
                    break;
                case 59:
                    if (u(i2, i, ef1Var)) {
                        Object objI4 = o94.c.i(ef1Var, j);
                        if (objI4 instanceof mz) {
                            iH4 = de0.h(i2);
                            size = ((mz) objI4).size();
                            iH8 = ud2.g(size, size, iH4, iH8);
                        } else {
                            iH3 = de0.h(i2);
                            iG = de0.g((String) objI4);
                            iH8 = iG + iH3 + iH8;
                        }
                    }
                    break;
                case 60:
                    if (u(i2, i, ef1Var)) {
                        Object objI5 = o94.c.i(ef1Var, j);
                        za3 za3VarP3 = p(i);
                        Class cls5 = cb3.a;
                        iH5 = de0.h(i2);
                        iB = ((g0) objI5).b(za3VarP3);
                        iH8 = ud2.g(iB, iB, iH5, iH8);
                    }
                    break;
                case 61:
                    if (u(i2, i, ef1Var)) {
                        iD = de0.a(i2, (mz) o94.c.i(ef1Var, j));
                        iH8 += iD;
                    }
                    break;
                case 62:
                    if (u(i2, i, ef1Var)) {
                        int iE3 = E(ef1Var, j);
                        iH2 = de0.h(i2);
                        iF = de0.i(iE3);
                        iD = iF + iH2;
                        iH8 += iD;
                    }
                    break;
                case 63:
                    if (u(i2, i, ef1Var)) {
                        int iE4 = E(ef1Var, j);
                        iH2 = de0.h(i2);
                        iF = de0.f(iE4);
                        iD = iF + iH2;
                        iH8 += iD;
                    }
                    break;
                case 64:
                    if (u(i2, i, ef1Var)) {
                        iH8 = ud2.f(i2, 4, iH8);
                    }
                    break;
                case 65:
                    if (u(i2, i, ef1Var)) {
                        iH8 = ud2.f(i2, 8, iH8);
                    }
                    break;
                case 66:
                    if (u(i2, i, ef1Var)) {
                        int iE5 = E(ef1Var, j);
                        iH2 = de0.h(i2);
                        iF = de0.i((iE5 >> 31) ^ (iE5 << 1));
                        iD = iF + iH2;
                        iH8 += iD;
                    }
                    break;
                case 67:
                    if (u(i2, i, ef1Var)) {
                        long jF3 = F(ef1Var, j);
                        iH6 = de0.h(i2);
                        iJ2 = de0.j((jF3 >> 63) ^ (jF3 << 1));
                        iD = iJ2 + iH6;
                        iH8 += iD;
                    }
                    break;
                case 68:
                    if (u(i2, i, ef1Var)) {
                        iD = de0.e(i2, (g0) o94.c.i(ef1Var, j), p(i));
                        iH8 += iD;
                    }
                    break;
            }
            i += 3;
        }
    }

    public final boolean s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iV = V(i);
            long j2 = iV & 1048575;
            switch (U(iV)) {
                case 0:
                    if (Double.doubleToRawLongBits(o94.c.e(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(o94.c.f(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (o94.c.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (o94.c.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (o94.c.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (o94.c.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (o94.c.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return o94.c.c(obj, j2);
                case 8:
                    Object objI = o94.c.i(obj, j2);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof mz) {
                        return !mz.d.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (o94.c.i(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !mz.d.equals(o94.c.i(obj, j2));
                case 11:
                    if (o94.c.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (o94.c.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (o94.c.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (o94.c.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (o94.c.g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (o94.c.h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (o94.c.i(obj, j2) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & o94.c.g(obj, j)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean u(int i, int i2, Object obj) {
        return o94.c.g(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void w(Object obj, int i, Object obj2) {
        long jV = V(i) & 1048575;
        Object objI = o94.c.i(obj, jV);
        u92 u92Var = this.n;
        if (objI != null) {
            u92Var.getClass();
            if (!((t92) objI).c) {
                t92 t92VarC = t92.d.c();
                u92.b(t92VarC, objI);
                o94.p(jV, obj, t92VarC);
                objI = t92VarC;
            }
        } else {
            u92Var.getClass();
            objI = t92.d.c();
            o94.p(jV, obj, objI);
        }
        u92Var.getClass();
        fq2.y(obj2);
        throw null;
    }

    public final void x(Object obj, int i, Object obj2) {
        if (s(i, obj2)) {
            long jV = V(i) & 1048575;
            Unsafe unsafe = p;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            za3 za3VarP = p(i);
            if (!s(i, obj)) {
                if (t(object)) {
                    Object objJ = za3VarP.j();
                    za3VarP.c(objJ, object);
                    unsafe.putObject(obj, jV, objJ);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                P(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!t(object2)) {
                Object objJ2 = za3VarP.j();
                za3VarP.c(objJ2, object2);
                unsafe.putObject(obj, jV, objJ2);
                object2 = objJ2;
            }
            za3VarP.c(object2, object);
        }
    }

    public final void y(Object obj, int i, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (u(i2, i, obj2)) {
            long jV = V(i) & 1048575;
            Unsafe unsafe = p;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            za3 za3VarP = p(i);
            if (!u(i2, i, obj)) {
                if (t(object)) {
                    Object objJ = za3VarP.j();
                    za3VarP.c(objJ, object);
                    unsafe.putObject(obj, jV, objJ);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                Q(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!t(object2)) {
                Object objJ2 = za3VarP.j();
                za3VarP.c(objJ2, object2);
                unsafe.putObject(obj, jV, objJ2);
                object2 = objJ2;
            }
            za3VarP.c(object2, object);
        }
    }

    public final Object z(int i, Object obj) {
        za3 za3VarP = p(i);
        long jV = V(i) & 1048575;
        if (!s(i, obj)) {
            return za3VarP.j();
        }
        Object object = p.getObject(obj, jV);
        if (t(object)) {
            return object;
        }
        Object objJ = za3VarP.j();
        if (object != null) {
            za3VarP.c(objJ, object);
        }
        return objJ;
    }
}
