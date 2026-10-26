package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.c;
import androidx.compose.ui.draw.a;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class wq2 {
    public static final wq2 a = new wq2();

    /* JADX WARN: Code duplicated, block: B:104:0x0118  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x015a  */
    /* JADX WARN: Code duplicated, block: B:124:0x015d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0162  */
    /* JADX WARN: Code duplicated, block: B:128:0x016d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0172  */
    /* JADX WARN: Code duplicated, block: B:132:0x017b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0180  */
    /* JADX WARN: Code duplicated, block: B:136:0x0185  */
    /* JADX WARN: Code duplicated, block: B:139:0x018a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0195  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:149:0x01df  */
    /* JADX WARN: Code duplicated, block: B:153:0x023f  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fa  */
    /* JADX INFO: renamed from: Container-4EFweAY, reason: not valid java name */
    public final void m1869x43ded36f(boolean z, boolean z2, uq1 uq1Var, c cVar, bu3 bu3Var, rg3 rg3Var, float f, float f2, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        bu3 bu3Var2;
        rg3 rg3Var2;
        float f3;
        float f4;
        int i4;
        c cVar3;
        bu3 bu3VarColors;
        rg3 shape;
        float f5;
        int i5;
        float f6;
        rg3 rg3Var3;
        c cVar4;
        bu3 bu3Var3;
        float f7;
        boolean zBooleanValue;
        bu3 bu3Var4;
        long j;
        kk0 kk0Var;
        c cVar5;
        rg3 rg3Var4;
        bu3 bu3Var5;
        float f8;
        float f9;
        w33 w33VarV;
        int i6;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(1035477640);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.i(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var2.i(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var2.h(uq1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var2.h(cVar2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    bu3Var2 = bu3Var;
                    if (kk0Var2.h(bu3Var2)) {
                        i6 = 16384;
                    }
                    i3 |= i6;
                } else {
                    bu3Var2 = bu3Var;
                }
                i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i6;
            } else {
                bu3Var2 = bu3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    rg3Var2 = rg3Var;
                    int i8 = kk0Var2.h(rg3Var2) ? 131072 : 65536;
                    i3 |= i8;
                } else {
                    rg3Var2 = rg3Var;
                }
                i3 |= i8;
            } else {
                rg3Var2 = rg3Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    int i9 = kk0Var2.e(f3) ? 1048576 : 524288;
                    i3 |= i9;
                } else {
                    f3 = f;
                }
                i3 |= i9;
            } else {
                f3 = f;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & Uuid.SIZE_BITS) == 0) {
                    f4 = f2;
                    int i10 = kk0Var2.e(f4) ? 8388608 : 4194304;
                    i3 |= i10;
                } else {
                    f4 = f2;
                }
                i3 |= i10;
            } else {
                f4 = f2;
            }
            if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var2.h(this)) {
                    i4 = 67108864;
                } else {
                    i4 = 33554432;
                }
                i3 |= i4;
            }
            if ((38347923 & i3) == 38347922 || !kk0Var2.F()) {
                kk0Var2.X();
                int i11 = 14;
                if ((i & 1) != 0 || kk0Var2.D()) {
                    if (i7 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 16) != 0) {
                        bu3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                        i3 &= -57345;
                    } else {
                        bu3VarColors = bu3Var2;
                    }
                    if ((i2 & 32) != 0) {
                        shape = a.getShape(kk0Var2, 6);
                        i3 &= -458753;
                    } else {
                        shape = rg3Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f5 = 2.0f;
                    } else {
                        f5 = f3;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        rg3Var3 = shape;
                        i5 = i3 & (-29360129);
                        f6 = 1.0f;
                    } else {
                        rg3 rg3Var5 = shape;
                        i5 = i3;
                        f6 = f4;
                        rg3Var3 = rg3Var5;
                    }
                    cVar4 = cVar3;
                    bu3Var3 = bu3VarColors;
                    f7 = f5;
                } else {
                    kk0Var2.V();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & Uuid.SIZE_BITS) != 0) {
                        i3 &= -29360129;
                    }
                    float f10 = f3;
                    cVar4 = cVar2;
                    f7 = f10;
                    bu3Var3 = bu3Var2;
                    i5 = i3;
                    f6 = f4;
                    rg3Var3 = rg3Var2;
                }
                kk0Var2.s();
                int i12 = i5 >> 6;
                zBooleanValue = ((Boolean) na1.collectIsFocusedAsState(uq1Var, kk0Var2, i12 & 14).getValue()).booleanValue();
                float f11 = f6;
                gn3 gn3VarM1797x7c0e9112 = ov3.m1797x7c0e9112(z, z2, zBooleanValue, bu3Var3, f7, f11, kk0Var2, (i12 & 458752) | (i5 & 126) | ((i5 >> 3) & 7168) | (i12 & 57344));
                bu3Var4 = bu3Var3;
                float f12 = f7;
                if (!z) {
                    j = bu3Var4.g;
                } else if (z2) {
                    j = bu3Var4.h;
                } else if (zBooleanValue) {
                    j = bu3Var4.e;
                } else {
                    j = bu3Var4.f;
                }
                gn3 gn3VarM1818xd84e23a5 = uh3.m1818xd84e23a5(j, kr1.o0(150, 0, null, 6), null, null, kk0Var2, 48, 12);
                iw iwVar = (iw) gn3VarM1797x7c0e9112.getValue();
                vw.Box(a.b(cVar4.then(new BorderModifierNodeElement(iwVar.a, iwVar.b, rg3Var3)), new sg2(rg3Var3, i11, new su3(new ra1(0, 4, gn3.class, gn3VarM1818xd84e23a5, "value", "getValue()Ljava/lang/Object;")))), kk0Var2, 0);
                kk0Var = kk0Var2;
                cVar5 = cVar4;
                rg3Var4 = rg3Var3;
                bu3Var5 = bu3Var4;
                f8 = f12;
                f9 = f11;
            } else {
                kk0Var2.V();
                cVar5 = cVar2;
                kk0Var = kk0Var2;
                bu3Var5 = bu3Var2;
                rg3Var4 = rg3Var2;
                f8 = f3;
                f9 = f4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new sq2(this, z, z2, uq1Var, cVar5, bu3Var5, rg3Var4, f8, f9, i, i2, 0));
            }
        }
        i3 |= 3072;
        cVar2 = cVar;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                bu3Var2 = bu3Var;
                if (kk0Var2.h(bu3Var2)) {
                    i6 = 16384;
                }
                i3 |= i6;
            } else {
                bu3Var2 = bu3Var;
            }
            i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i6;
        } else {
            bu3Var2 = bu3Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                rg3Var2 = rg3Var;
                if (kk0Var2.h(rg3Var2)) {
                }
                i3 |= i8;
            } else {
                rg3Var2 = rg3Var;
            }
            i3 |= i8;
        } else {
            rg3Var2 = rg3Var;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f3 = f;
                if (kk0Var2.e(f3)) {
                }
                i3 |= i9;
            } else {
                f3 = f;
            }
            i3 |= i9;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & Uuid.SIZE_BITS) == 0) {
                f4 = f2;
                if (kk0Var2.e(f4)) {
                }
                i3 |= i10;
            } else {
                f4 = f2;
            }
            i3 |= i10;
        } else {
            f4 = f2;
        }
        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (kk0Var2.h(this)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i3 |= i4;
        }
        if ((38347923 & i3) == 38347922) {
            kk0Var2.X();
            int i13 = 14;
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 16) != 0) {
                    bu3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -57345;
                } else {
                    bu3VarColors = bu3Var2;
                }
                if ((i2 & 32) != 0) {
                    shape = a.getShape(kk0Var2, 6);
                    i3 &= -458753;
                } else {
                    shape = rg3Var2;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f5 = 2.0f;
                } else {
                    f5 = f3;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    rg3Var3 = shape;
                    i5 = i3 & (-29360129);
                    f6 = 1.0f;
                } else {
                    rg3 rg3Var6 = shape;
                    i5 = i3;
                    f6 = f4;
                    rg3Var3 = rg3Var6;
                }
                cVar4 = cVar3;
                bu3Var3 = bu3VarColors;
                f7 = f5;
            } else {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 16) != 0) {
                    bu3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -57345;
                } else {
                    bu3VarColors = bu3Var2;
                }
                if ((i2 & 32) != 0) {
                    shape = a.getShape(kk0Var2, 6);
                    i3 &= -458753;
                } else {
                    shape = rg3Var2;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f5 = 2.0f;
                } else {
                    f5 = f3;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    rg3Var3 = shape;
                    i5 = i3 & (-29360129);
                    f6 = 1.0f;
                } else {
                    rg3 rg3Var7 = shape;
                    i5 = i3;
                    f6 = f4;
                    rg3Var3 = rg3Var7;
                }
                cVar4 = cVar3;
                bu3Var3 = bu3VarColors;
                f7 = f5;
            }
            kk0Var2.s();
            int i14 = i5 >> 6;
            zBooleanValue = ((Boolean) na1.collectIsFocusedAsState(uq1Var, kk0Var2, i14 & 14).getValue()).booleanValue();
            float f13 = f6;
            gn3 gn3VarM1797x7c0e9113 = ov3.m1797x7c0e9112(z, z2, zBooleanValue, bu3Var3, f7, f13, kk0Var2, (i14 & 458752) | (i5 & 126) | ((i5 >> 3) & 7168) | (i14 & 57344));
            bu3Var4 = bu3Var3;
            float f14 = f7;
            if (!z) {
                j = bu3Var4.g;
            } else if (z2) {
                j = bu3Var4.h;
            } else if (zBooleanValue) {
                j = bu3Var4.e;
            } else {
                j = bu3Var4.f;
            }
            gn3 gn3VarM1818xd84e23a6 = uh3.m1818xd84e23a5(j, kr1.o0(150, 0, null, 6), null, null, kk0Var2, 48, 12);
            iw iwVar2 = (iw) gn3VarM1797x7c0e9113.getValue();
            vw.Box(a.b(cVar4.then(new BorderModifierNodeElement(iwVar2.a, iwVar2.b, rg3Var3)), new sg2(rg3Var3, i13, new su3(new ra1(0, 4, gn3.class, gn3VarM1818xd84e23a6, "value", "getValue()Ljava/lang/Object;")))), kk0Var2, 0);
            kk0Var = kk0Var2;
            cVar5 = cVar4;
            rg3Var4 = rg3Var3;
            bu3Var5 = bu3Var4;
            f8 = f14;
            f9 = f13;
        } else {
            kk0Var2.X();
            int i15 = 14;
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 16) != 0) {
                    bu3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -57345;
                } else {
                    bu3VarColors = bu3Var2;
                }
                if ((i2 & 32) != 0) {
                    shape = a.getShape(kk0Var2, 6);
                    i3 &= -458753;
                } else {
                    shape = rg3Var2;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f5 = 2.0f;
                } else {
                    f5 = f3;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    rg3Var3 = shape;
                    i5 = i3 & (-29360129);
                    f6 = 1.0f;
                } else {
                    rg3 rg3Var8 = shape;
                    i5 = i3;
                    f6 = f4;
                    rg3Var3 = rg3Var8;
                }
                cVar4 = cVar3;
                bu3Var3 = bu3VarColors;
                f7 = f5;
            } else {
                if (i7 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 16) != 0) {
                    bu3VarColors = colors(kk0Var2, (i3 >> 24) & 14);
                    i3 &= -57345;
                } else {
                    bu3VarColors = bu3Var2;
                }
                if ((i2 & 32) != 0) {
                    shape = a.getShape(kk0Var2, 6);
                    i3 &= -458753;
                } else {
                    shape = rg3Var2;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f5 = 2.0f;
                } else {
                    f5 = f3;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    rg3Var3 = shape;
                    i5 = i3 & (-29360129);
                    f6 = 1.0f;
                } else {
                    rg3 rg3Var9 = shape;
                    i5 = i3;
                    f6 = f4;
                    rg3Var3 = rg3Var9;
                }
                cVar4 = cVar3;
                bu3Var3 = bu3VarColors;
                f7 = f5;
            }
            kk0Var2.s();
            int i16 = i5 >> 6;
            zBooleanValue = ((Boolean) na1.collectIsFocusedAsState(uq1Var, kk0Var2, i16 & 14).getValue()).booleanValue();
            float f15 = f6;
            gn3 gn3VarM1797x7c0e9114 = ov3.m1797x7c0e9112(z, z2, zBooleanValue, bu3Var3, f7, f15, kk0Var2, (i16 & 458752) | (i5 & 126) | ((i5 >> 3) & 7168) | (i16 & 57344));
            bu3Var4 = bu3Var3;
            float f16 = f7;
            if (!z) {
                j = bu3Var4.g;
            } else if (z2) {
                j = bu3Var4.h;
            } else if (zBooleanValue) {
                j = bu3Var4.e;
            } else {
                j = bu3Var4.f;
            }
            gn3 gn3VarM1818xd84e23a7 = uh3.m1818xd84e23a5(j, kr1.o0(150, 0, null, 6), null, null, kk0Var2, 48, 12);
            iw iwVar3 = (iw) gn3VarM1797x7c0e9114.getValue();
            vw.Box(a.b(cVar4.then(new BorderModifierNodeElement(iwVar3.a, iwVar3.b, rg3Var3)), new sg2(rg3Var3, i15, new su3(new ra1(0, 4, gn3.class, gn3VarM1818xd84e23a7, "value", "getValue()Ljava/lang/Object;")))), kk0Var2, 0);
            kk0Var = kk0Var2;
            cVar5 = cVar4;
            rg3Var4 = rg3Var3;
            bu3Var5 = bu3Var4;
            f8 = f16;
            f9 = f15;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new sq2(this, z, z2, uq1Var, cVar5, bu3Var5, rg3Var4, f8, f9, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x012f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0133  */
    /* JADX WARN: Code duplicated, block: B:117:0x0141  */
    /* JADX WARN: Code duplicated, block: B:120:0x014d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0154  */
    /* JADX WARN: Code duplicated, block: B:127:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    @cv0
    /* JADX INFO: renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    public final void m1870x2fda5121(boolean z, boolean z2, uq1 uq1Var, bu3 bu3Var, rg3 rg3Var, float f, float f2, ck0 ck0Var, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        bu3 bu3VarColors;
        rg3 shape;
        float f3;
        float f4;
        int i5;
        w33 w33VarV;
        int i6;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1461761386);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (kk0Var.i(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                z4 = z2;
                i3 |= kk0Var.i(z4) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 384) == 0) {
                    if (kk0Var.h(uq1Var)) {
                        i4 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i4 = Uuid.SIZE_BITS;
                    }
                    i3 |= i4;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        bu3VarColors = bu3Var;
                        int i7 = kk0Var.h(bu3VarColors) ? 2048 : 1024;
                        i3 |= i7;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    i3 |= i7;
                } else {
                    bu3VarColors = bu3Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape = rg3Var;
                        if (kk0Var.h(shape)) {
                            i6 = 16384;
                        }
                        i3 |= i6;
                    } else {
                        shape = rg3Var;
                    }
                    i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    i3 |= i6;
                } else {
                    shape = rg3Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        f3 = f;
                        int i8 = kk0Var.e(f3) ? 131072 : 65536;
                        i3 |= i8;
                    } else {
                        f3 = f;
                    }
                    i3 |= i8;
                } else {
                    f3 = f;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        f4 = f2;
                        int i9 = kk0Var.e(f4) ? 1048576 : 524288;
                        i3 |= i9;
                    } else {
                        f4 = f2;
                    }
                    i3 |= i9;
                } else {
                    f4 = f2;
                }
                if ((i2 & Uuid.SIZE_BITS) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (kk0Var.h(this)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
                if ((4793491 & i3) == 4793490 || !kk0Var.F()) {
                    kk0Var.X();
                    if ((i & 1) != 0 || kk0Var.D()) {
                        if ((i2 & 8) != 0) {
                            bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            shape = a.getShape(kk0Var, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            f3 = 2.0f;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            f4 = 1.0f;
                        }
                    } else {
                        kk0Var.V();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                    }
                    kk0Var.s();
                    int i10 = (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896);
                    int i11 = i3 << 3;
                    m1869x43ded36f(z3, z4, uq1Var, c.i, bu3VarColors, shape, f3, f4, kk0Var, i10 | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (i11 & 234881024), 0);
                } else {
                    kk0Var.V();
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new tq2(this, z, z2, uq1Var, bu3VarColors, shape, f3, f4, i, i2));
                }
            }
            i3 |= 384;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    bu3VarColors = bu3Var;
                    if (kk0Var.h(bu3VarColors)) {
                    }
                    i3 |= i7;
                } else {
                    bu3VarColors = bu3Var;
                }
                i3 |= i7;
            } else {
                bu3VarColors = bu3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    shape = rg3Var;
                    if (kk0Var.h(shape)) {
                        i6 = 16384;
                    }
                    i3 |= i6;
                } else {
                    shape = rg3Var;
                }
                i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i6;
            } else {
                shape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f3 = f;
                    if (kk0Var.e(f3)) {
                    }
                    i3 |= i8;
                } else {
                    f3 = f;
                }
                i3 |= i8;
            } else {
                f3 = f;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f4 = f2;
                    if (kk0Var.e(f4)) {
                    }
                    i3 |= i9;
                } else {
                    f4 = f2;
                }
                i3 |= i9;
            } else {
                f4 = f2;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.h(this)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if ((i2 & 8) != 0) {
                        bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        shape = a.getShape(kk0Var, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = 2.0f;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = 1.0f;
                    }
                } else {
                    if ((i2 & 8) != 0) {
                        bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        shape = a.getShape(kk0Var, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = 2.0f;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = 1.0f;
                    }
                }
                kk0Var.s();
                int i12 = (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896);
                int i13 = i3 << 3;
                m1869x43ded36f(z3, z4, uq1Var, c.i, bu3VarColors, shape, f3, f4, kk0Var, i12 | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (i13 & 234881024), 0);
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if ((i2 & 8) != 0) {
                        bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        shape = a.getShape(kk0Var, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = 2.0f;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = 1.0f;
                    }
                } else {
                    if ((i2 & 8) != 0) {
                        bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        shape = a.getShape(kk0Var, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = 2.0f;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = 1.0f;
                    }
                }
                kk0Var.s();
                int i14 = (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896);
                int i15 = i3 << 3;
                m1869x43ded36f(z3, z4, uq1Var, c.i, bu3VarColors, shape, f3, f4, kk0Var, i14 | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024), 0);
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new tq2(this, z, z2, uq1Var, bu3VarColors, shape, f3, f4, i, i2));
            }
        }
        i3 |= 48;
        z4 = z2;
        if ((i2 & 4) != 0) {
            if ((i & 384) == 0) {
                if (kk0Var.h(uq1Var)) {
                    i4 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i4 = Uuid.SIZE_BITS;
                }
                i3 |= i4;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    bu3VarColors = bu3Var;
                    if (kk0Var.h(bu3VarColors)) {
                    }
                    i3 |= i7;
                } else {
                    bu3VarColors = bu3Var;
                }
                i3 |= i7;
            } else {
                bu3VarColors = bu3Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    shape = rg3Var;
                    if (kk0Var.h(shape)) {
                        i6 = 16384;
                    }
                    i3 |= i6;
                } else {
                    shape = rg3Var;
                }
                i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                i3 |= i6;
            } else {
                shape = rg3Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f3 = f;
                    if (kk0Var.e(f3)) {
                    }
                    i3 |= i8;
                } else {
                    f3 = f;
                }
                i3 |= i8;
            } else {
                f3 = f;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f4 = f2;
                    if (kk0Var.e(f4)) {
                    }
                    i3 |= i9;
                } else {
                    f4 = f2;
                }
                i3 |= i9;
            } else {
                f4 = f2;
            }
            if ((i2 & Uuid.SIZE_BITS) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (kk0Var.h(this)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            if ((4793491 & i3) == 4793490) {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if ((i2 & 8) != 0) {
                        bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        shape = a.getShape(kk0Var, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = 2.0f;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = 1.0f;
                    }
                } else {
                    if ((i2 & 8) != 0) {
                        bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        shape = a.getShape(kk0Var, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = 2.0f;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = 1.0f;
                    }
                }
                kk0Var.s();
                int i16 = (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896);
                int i17 = i3 << 3;
                m1869x43ded36f(z3, z4, uq1Var, c.i, bu3VarColors, shape, f3, f4, kk0Var, i16 | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024), 0);
            } else {
                kk0Var.X();
                if ((i & 1) != 0) {
                    if ((i2 & 8) != 0) {
                        bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        shape = a.getShape(kk0Var, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = 2.0f;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = 1.0f;
                    }
                } else {
                    if ((i2 & 8) != 0) {
                        bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        shape = a.getShape(kk0Var, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        f3 = 2.0f;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f4 = 1.0f;
                    }
                }
                kk0Var.s();
                int i18 = (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896);
                int i19 = i3 << 3;
                m1869x43ded36f(z3, z4, uq1Var, c.i, bu3VarColors, shape, f3, f4, kk0Var, i18 | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (i19 & 234881024), 0);
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new tq2(this, z, z2, uq1Var, bu3VarColors, shape, f3, f4, i, i2));
            }
        }
        i3 |= 384;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                bu3VarColors = bu3Var;
                if (kk0Var.h(bu3VarColors)) {
                }
                i3 |= i7;
            } else {
                bu3VarColors = bu3Var;
            }
            i3 |= i7;
        } else {
            bu3VarColors = bu3Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                shape = rg3Var;
                if (kk0Var.h(shape)) {
                    i6 = 16384;
                }
                i3 |= i6;
            } else {
                shape = rg3Var;
            }
            i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            i3 |= i6;
        } else {
            shape = rg3Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                if (kk0Var.e(f3)) {
                }
                i3 |= i8;
            } else {
                f3 = f;
            }
            i3 |= i8;
        } else {
            f3 = f;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                if (kk0Var.e(f4)) {
                }
                i3 |= i9;
            } else {
                f4 = f2;
            }
            i3 |= i9;
        } else {
            f4 = f2;
        }
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (kk0Var.h(this)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((4793491 & i3) == 4793490) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if ((i2 & 8) != 0) {
                    bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    shape = a.getShape(kk0Var, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    f3 = 2.0f;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f4 = 1.0f;
                }
            } else {
                if ((i2 & 8) != 0) {
                    bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    shape = a.getShape(kk0Var, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    f3 = 2.0f;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f4 = 1.0f;
                }
            }
            kk0Var.s();
            int i110 = (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896);
            int i111 = i3 << 3;
            m1869x43ded36f(z3, z4, uq1Var, c.i, bu3VarColors, shape, f3, f4, kk0Var, i110 | (57344 & i111) | (458752 & i111) | (3670016 & i111) | (29360128 & i111) | (i111 & 234881024), 0);
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if ((i2 & 8) != 0) {
                    bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    shape = a.getShape(kk0Var, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    f3 = 2.0f;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f4 = 1.0f;
                }
            } else {
                if ((i2 & 8) != 0) {
                    bu3VarColors = colors(kk0Var, (i3 >> 21) & 14);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    shape = a.getShape(kk0Var, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    f3 = 2.0f;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f4 = 1.0f;
                }
            }
            kk0Var.s();
            int i112 = (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896);
            int i113 = i3 << 3;
            m1869x43ded36f(z3, z4, uq1Var, c.i, bu3VarColors, shape, f3, f4, kk0Var, i112 | (57344 & i113) | (458752 & i113) | (3670016 & i113) | (29360128 & i113) | (i113 & 234881024), 0);
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new tq2(this, z, z2, uq1Var, bu3VarColors, shape, f3, f4, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0135  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:105:0x0146  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0155  */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:114:0x0163  */
    /* JADX WARN: Code duplicated, block: B:115:0x0166  */
    /* JADX WARN: Code duplicated, block: B:117:0x016b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0175  */
    /* JADX WARN: Code duplicated, block: B:122:0x017c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x018d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:132:0x019b  */
    /* JADX WARN: Code duplicated, block: B:133:0x019e  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01be  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:165:0x0200  */
    /* JADX WARN: Code duplicated, block: B:168:0x0209  */
    /* JADX WARN: Code duplicated, block: B:170:0x020e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0214  */
    /* JADX WARN: Code duplicated, block: B:174:0x0219  */
    /* JADX WARN: Code duplicated, block: B:176:0x021f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0225  */
    /* JADX WARN: Code duplicated, block: B:182:0x022d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0230  */
    /* JADX WARN: Code duplicated, block: B:185:0x0234  */
    /* JADX WARN: Code duplicated, block: B:187:0x023a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0248  */
    /* JADX WARN: Code duplicated, block: B:197:0x0273  */
    /* JADX WARN: Code duplicated, block: B:199:0x0280  */
    /* JADX WARN: Code duplicated, block: B:209:0x02ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:214:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:219:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:220:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:223:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:226:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:228:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:229:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:232:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:235:0x02df  */
    /* JADX WARN: Code duplicated, block: B:236:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:239:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:240:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:242:0x0302  */
    /* JADX WARN: Code duplicated, block: B:244:0x0324  */
    /* JADX WARN: Code duplicated, block: B:248:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0121  */
    /* JADX WARN: Code duplicated, block: B:94:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    public final void DecorationBox(String str, ne1 ne1Var, boolean z, boolean z2, de4 de4Var, uq1 uq1Var, boolean z3, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, ne1 ne1Var5, ne1 ne1Var6, ne1 ne1Var7, ne1 ne1Var8, bu3 bu3Var, hs2 hs2Var, ne1 ne1Var9, ck0 ck0Var, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        int i14;
        int i15;
        ne1 ne1Var10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z6;
        ne1 ne1Var11;
        ne1 ne1Var12;
        ne1 ne1Var13;
        ne1 ne1Var14;
        ne1 ne1Var15;
        bu3 bu3VarColors;
        hs2 is2Var;
        ne1 ne1VarRememberComposableLambda;
        bu3 bu3Var2;
        ne1 ne1Var16;
        ne1 ne1Var17;
        ne1 ne1Var18;
        ne1 ne1Var19;
        ne1 ne1Var20;
        ne1 ne1Var21;
        boolean z7;
        hs2 hs2Var2;
        kk0 kk0Var;
        ne1 ne1Var22;
        ne1 ne1Var23;
        bu3 bu3Var3;
        ne1 ne1Var24;
        ne1 ne1Var25;
        ne1 ne1Var26;
        ne1 ne1Var27;
        ne1 ne1Var28;
        ne1 ne1Var29;
        w33 w33VarV;
        int i32;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-350442135);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (kk0Var2.h(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) == 0) {
            if ((i & 48) == 0) {
                i4 |= kk0Var2.j(ne1Var) ? 32 : 16;
            }
            i5 = i3 & 4;
            i6 = FontInfo.NUMBER_OF_CHAR_CODES;
            if (i5 != 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                if (kk0Var2.i(z)) {
                    i7 = 256;
                } else {
                    i7 = Uuid.SIZE_BITS;
                }
                i4 |= i7;
            }
            if ((i3 & 8) != 0) {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    if (kk0Var2.i(z4)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                if (i9 != 0) {
                    if ((i & 24576) == 0) {
                        if (kk0Var2.h(de4Var)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i4 |= i11;
                    }
                    if ((i3 & 32) != 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (kk0Var2.h(uq1Var)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                    i13 = i3 & 64;
                    if (i13 != 0) {
                        i4 |= 1572864;
                        z5 = z3;
                    } else {
                        z5 = z3;
                        if ((i & 1572864) == 0) {
                            if (kk0Var2.i(z5)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i4 |= i14;
                        }
                    }
                    i15 = i3 & Uuid.SIZE_BITS;
                    if (i15 != 0) {
                        i4 |= 12582912;
                        ne1Var10 = ne1Var2;
                    } else {
                        ne1Var10 = ne1Var2;
                        if ((i & 12582912) == 0) {
                            if (kk0Var2.j(ne1Var10)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i4 |= i16;
                        }
                    }
                    i17 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
                    if (i17 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (kk0Var2.j(ne1Var3)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i4 |= i18;
                    }
                    i19 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                    if (i19 != 0) {
                        if ((i & 805306368) == 0) {
                            if (kk0Var2.j(ne1Var4)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i4 |= i20;
                        }
                        i21 = i3 & 1024;
                        if (i21 != 0) {
                            i22 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (kk0Var2.j(ne1Var5)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i2 | i23;
                        } else {
                            i22 = i2;
                        }
                        i24 = i3 & 2048;
                        if (i24 != 0) {
                            i22 |= 48;
                        } else if ((i2 & 48) != 0) {
                            if (kk0Var2.j(ne1Var6)) {
                                i25 = 32;
                            } else {
                                i25 = 16;
                            }
                            i22 |= i25;
                        }
                        i26 = i22;
                        i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                        if (i27 != 0) {
                            i28 = i26 | 384;
                        } else if ((i2 & 384) == 0) {
                            if (!kk0Var2.j(ne1Var7)) {
                                i6 = Uuid.SIZE_BITS;
                            }
                            i28 = i26 | i6;
                        } else {
                            i28 = i26;
                        }
                        i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                        if (i29 != 0) {
                            i30 = i28;
                            if ((i2 & 3072) == 0) {
                                i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                            }
                            if ((i2 & 24576) != 0) {
                                if ((i3 & 16384) == 0 && kk0Var2.h(bu3Var)) {
                                    i10 = 16384;
                                }
                                i30 |= i10;
                            }
                            if ((i2 & 196608) != 0) {
                                if ((i3 & 32768) == 0 || !kk0Var2.h(hs2Var)) {
                                    i32 = 65536;
                                } else {
                                    i32 = 131072;
                                }
                                i30 |= i32;
                            }
                            i31 = i3 & 65536;
                            if (i31 != 0) {
                                i30 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                            }
                            if ((i3 & 131072) != 0) {
                                i30 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                            }
                            if ((i4 & 306783379) != 306783378 && (i30 & 4793491) == 4793490 && kk0Var2.F()) {
                                kk0Var2.V();
                                ne1Var25 = ne1Var3;
                                ne1Var26 = ne1Var4;
                                ne1Var22 = ne1Var6;
                                ne1Var23 = ne1Var7;
                                ne1Var27 = ne1Var8;
                                bu3Var3 = bu3Var;
                                hs2Var2 = hs2Var;
                                ne1Var24 = ne1Var9;
                                kk0Var = kk0Var2;
                                ne1Var29 = ne1Var10;
                                ne1Var28 = ne1Var5;
                            } else {
                                kk0Var2.X();
                                if ((i & 1) != 0 || kk0Var2.D()) {
                                    if (i13 != 0) {
                                        z6 = false;
                                    } else {
                                        z6 = z5;
                                    }
                                    if (i15 != 0) {
                                        ne1Var10 = null;
                                    }
                                    if (i17 != 0) {
                                        ne1Var11 = null;
                                    } else {
                                        ne1Var11 = ne1Var3;
                                    }
                                    if (i19 != 0) {
                                        ne1Var12 = null;
                                    } else {
                                        ne1Var12 = ne1Var4;
                                    }
                                    if (i21 != 0) {
                                        ne1Var13 = null;
                                    } else {
                                        ne1Var13 = ne1Var5;
                                    }
                                    if (i24 != 0) {
                                        ne1Var14 = null;
                                    } else {
                                        ne1Var14 = ne1Var6;
                                    }
                                    if (i27 != 0) {
                                        ne1Var15 = null;
                                    } else {
                                        ne1Var15 = ne1Var7;
                                    }
                                    ne1 ne1Var30 = i29 == 0 ? ne1Var8 : null;
                                    if ((i3 & 16384) != 0) {
                                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                        i30 &= -57345;
                                    } else {
                                        bu3VarColors = bu3Var;
                                    }
                                    if ((i3 & 32768) != 0) {
                                        float f = ov3.b;
                                        is2Var = new is2(f, f, f, f);
                                        i30 &= -458753;
                                    } else {
                                        is2Var = hs2Var;
                                    }
                                    if (i31 != 0) {
                                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                    } else {
                                        ne1VarRememberComposableLambda = ne1Var9;
                                    }
                                    bu3Var2 = bu3VarColors;
                                    ne1Var16 = ne1Var11;
                                    ne1Var17 = ne1Var10;
                                    ne1Var18 = ne1Var15;
                                    ne1Var19 = ne1Var14;
                                    ne1Var20 = ne1Var30;
                                    ne1Var21 = ne1Var12;
                                    z7 = z6;
                                    hs2Var2 = is2Var;
                                } else {
                                    kk0Var2.V();
                                    if ((i3 & 16384) != 0) {
                                        i30 &= -57345;
                                    }
                                    if ((i3 & 32768) != 0) {
                                        i30 &= -458753;
                                    }
                                    ne1Var16 = ne1Var3;
                                    ne1Var13 = ne1Var5;
                                    ne1Var19 = ne1Var6;
                                    ne1Var18 = ne1Var7;
                                    bu3Var2 = bu3Var;
                                    hs2Var2 = hs2Var;
                                    ne1VarRememberComposableLambda = ne1Var9;
                                    z7 = z5;
                                    ne1Var17 = ne1Var10;
                                    ne1Var21 = ne1Var4;
                                    ne1Var20 = ne1Var8;
                                }
                                kk0Var2.s();
                                int i33 = i4 << 3;
                                int i34 = i4 >> 3;
                                int i35 = i4 >> 9;
                                int i36 = i30 << 21;
                                int i37 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i35 & 7168) | (i34 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                                kk0Var = kk0Var2;
                                ne1 ne1Var31 = ne1Var13;
                                ne1 ne1Var32 = ne1VarRememberComposableLambda;
                                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var32, kk0Var, (i33 & 896) | (i33 & 112) | 6 | (i34 & 7168) | (i35 & 57344) | (i35 & 458752) | (i35 & 3670016) | (i36 & 29360128) | (i36 & 234881024) | (i36 & 1879048192), i37, 0);
                                ne1Var22 = ne1Var19;
                                ne1Var23 = ne1Var18;
                                bu3Var3 = bu3Var2;
                                ne1Var24 = ne1Var32;
                                ne1Var25 = ne1Var16;
                                ne1Var26 = ne1Var21;
                                z5 = z7;
                                ne1Var27 = ne1Var20;
                                ne1Var28 = ne1Var31;
                                ne1Var29 = ne1Var17;
                            }
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                            }
                        }
                        i30 = i28 | 3072;
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i10 = 16384;
                            }
                            i30 |= i10;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i32 = 65536;
                            } else {
                                i32 = 65536;
                            }
                            i30 |= i32;
                        }
                        i31 = i3 & 65536;
                        if (i31 != 0) {
                            i30 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                        }
                        if ((i3 & 131072) != 0) {
                            i30 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f2 = ov3.b;
                                    is2Var = new is2(f2, f2, f2, f2);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            } else {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f3 = ov3.b;
                                    is2Var = new is2(f3, f3, f3, f3);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            }
                            kk0Var2.s();
                            int i38 = i4 << 3;
                            int i39 = i4 >> 3;
                            int i310 = i4 >> 9;
                            int i311 = i30 << 21;
                            int i312 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i310 & 7168) | (i39 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                            kk0Var = kk0Var2;
                            ne1 ne1Var33 = ne1Var13;
                            ne1 ne1Var34 = ne1VarRememberComposableLambda;
                            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var33, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var34, kk0Var, (i38 & 896) | (i38 & 112) | 6 | (i39 & 7168) | (i310 & 57344) | (i310 & 458752) | (i310 & 3670016) | (i311 & 29360128) | (i311 & 234881024) | (i311 & 1879048192), i312, 0);
                            ne1Var22 = ne1Var19;
                            ne1Var23 = ne1Var18;
                            bu3Var3 = bu3Var2;
                            ne1Var24 = ne1Var34;
                            ne1Var25 = ne1Var16;
                            ne1Var26 = ne1Var21;
                            z5 = z7;
                            ne1Var27 = ne1Var20;
                            ne1Var28 = ne1Var33;
                            ne1Var29 = ne1Var17;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f4 = ov3.b;
                                    is2Var = new is2(f4, f4, f4, f4);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            } else {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f5 = ov3.b;
                                    is2Var = new is2(f5, f5, f5, f5);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            }
                            kk0Var2.s();
                            int i313 = i4 << 3;
                            int i314 = i4 >> 3;
                            int i315 = i4 >> 9;
                            int i316 = i30 << 21;
                            int i317 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i315 & 7168) | (i314 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                            kk0Var = kk0Var2;
                            ne1 ne1Var35 = ne1Var13;
                            ne1 ne1Var36 = ne1VarRememberComposableLambda;
                            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var35, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var36, kk0Var, (i313 & 896) | (i313 & 112) | 6 | (i314 & 7168) | (i315 & 57344) | (i315 & 458752) | (i315 & 3670016) | (i316 & 29360128) | (i316 & 234881024) | (i316 & 1879048192), i317, 0);
                            ne1Var22 = ne1Var19;
                            ne1Var23 = ne1Var18;
                            bu3Var3 = bu3Var2;
                            ne1Var24 = ne1Var36;
                            ne1Var25 = ne1Var16;
                            ne1Var26 = ne1Var21;
                            z5 = z7;
                            ne1Var27 = ne1Var20;
                            ne1Var28 = ne1Var35;
                            ne1Var29 = ne1Var17;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                        }
                    }
                    i4 |= 805306368;
                    i21 = i3 & 1024;
                    if (i21 != 0) {
                        i22 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (kk0Var2.j(ne1Var5)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i2 | i23;
                    } else {
                        i22 = i2;
                    }
                    i24 = i3 & 2048;
                    if (i24 != 0) {
                        i22 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (kk0Var2.j(ne1Var6)) {
                            i25 = 32;
                        } else {
                            i25 = 16;
                        }
                        i22 |= i25;
                    }
                    i26 = i22;
                    i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                    if (i27 != 0) {
                        i28 = i26 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (!kk0Var2.j(ne1Var7)) {
                            i6 = Uuid.SIZE_BITS;
                        }
                        i28 = i26 | i6;
                    } else {
                        i28 = i26;
                    }
                    i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                    if (i29 != 0) {
                        i30 = i28;
                        if ((i2 & 3072) == 0) {
                            i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i10 = 16384;
                            }
                            i30 |= i10;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i32 = 65536;
                            } else {
                                i32 = 65536;
                            }
                            i30 |= i32;
                        }
                        i31 = i3 & 65536;
                        if (i31 != 0) {
                            i30 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                        }
                        if ((i3 & 131072) != 0) {
                            i30 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f6 = ov3.b;
                                    is2Var = new is2(f6, f6, f6, f6);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            } else {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f7 = ov3.b;
                                    is2Var = new is2(f7, f7, f7, f7);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            }
                            kk0Var2.s();
                            int i318 = i4 << 3;
                            int i319 = i4 >> 3;
                            int i3110 = i4 >> 9;
                            int i3111 = i30 << 21;
                            int i3112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3110 & 7168) | (i319 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                            kk0Var = kk0Var2;
                            ne1 ne1Var37 = ne1Var13;
                            ne1 ne1Var38 = ne1VarRememberComposableLambda;
                            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var37, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var38, kk0Var, (i318 & 896) | (i318 & 112) | 6 | (i319 & 7168) | (i3110 & 57344) | (i3110 & 458752) | (i3110 & 3670016) | (i3111 & 29360128) | (i3111 & 234881024) | (i3111 & 1879048192), i3112, 0);
                            ne1Var22 = ne1Var19;
                            ne1Var23 = ne1Var18;
                            bu3Var3 = bu3Var2;
                            ne1Var24 = ne1Var38;
                            ne1Var25 = ne1Var16;
                            ne1Var26 = ne1Var21;
                            z5 = z7;
                            ne1Var27 = ne1Var20;
                            ne1Var28 = ne1Var37;
                            ne1Var29 = ne1Var17;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f8 = ov3.b;
                                    is2Var = new is2(f8, f8, f8, f8);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            } else {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f9 = ov3.b;
                                    is2Var = new is2(f9, f9, f9, f9);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            }
                            kk0Var2.s();
                            int i3113 = i4 << 3;
                            int i3114 = i4 >> 3;
                            int i3115 = i4 >> 9;
                            int i3116 = i30 << 21;
                            int i3117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3115 & 7168) | (i3114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                            kk0Var = kk0Var2;
                            ne1 ne1Var39 = ne1Var13;
                            ne1 ne1Var310 = ne1VarRememberComposableLambda;
                            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var39, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var310, kk0Var, (i3113 & 896) | (i3113 & 112) | 6 | (i3114 & 7168) | (i3115 & 57344) | (i3115 & 458752) | (i3115 & 3670016) | (i3116 & 29360128) | (i3116 & 234881024) | (i3116 & 1879048192), i3117, 0);
                            ne1Var22 = ne1Var19;
                            ne1Var23 = ne1Var18;
                            bu3Var3 = bu3Var2;
                            ne1Var24 = ne1Var310;
                            ne1Var25 = ne1Var16;
                            ne1Var26 = ne1Var21;
                            z5 = z7;
                            ne1Var27 = ne1Var20;
                            ne1Var28 = ne1Var39;
                            ne1Var29 = ne1Var17;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                        }
                    }
                    i30 = i28 | 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i10 = 16384;
                        }
                        i30 |= i10;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    i31 = i3 & 65536;
                    if (i31 != 0) {
                        i30 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                    }
                    if ((i3 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f10 = ov3.b;
                                is2Var = new is2(f10, f10, f10, f10);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11 = ov3.b;
                                is2Var = new is2(f11, f11, f11, f11);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i3118 = i4 << 3;
                        int i3119 = i4 >> 3;
                        int i31110 = i4 >> 9;
                        int i31111 = i30 << 21;
                        int i31112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31110 & 7168) | (i3119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var311 = ne1Var13;
                        ne1 ne1Var312 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var312, kk0Var, (i3118 & 896) | (i3118 & 112) | 6 | (i3119 & 7168) | (i31110 & 57344) | (i31110 & 458752) | (i31110 & 3670016) | (i31111 & 29360128) | (i31111 & 234881024) | (i31111 & 1879048192), i31112, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var312;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var311;
                        ne1Var29 = ne1Var17;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f12 = ov3.b;
                                is2Var = new is2(f12, f12, f12, f12);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f13 = ov3.b;
                                is2Var = new is2(f13, f13, f13, f13);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i31113 = i4 << 3;
                        int i31114 = i4 >> 3;
                        int i31115 = i4 >> 9;
                        int i31116 = i30 << 21;
                        int i31117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31115 & 7168) | (i31114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var313 = ne1Var13;
                        ne1 ne1Var314 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var313, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var314, kk0Var, (i31113 & 896) | (i31113 & 112) | 6 | (i31114 & 7168) | (i31115 & 57344) | (i31115 & 458752) | (i31115 & 3670016) | (i31116 & 29360128) | (i31116 & 234881024) | (i31116 & 1879048192), i31117, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var314;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var313;
                        ne1Var29 = ne1Var17;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                    }
                }
                i4 |= 24576;
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var2.h(uq1Var)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    i4 |= 1572864;
                    z5 = z3;
                } else {
                    z5 = z3;
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.i(z5)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & Uuid.SIZE_BITS;
                if (i15 != 0) {
                    i4 |= 12582912;
                    ne1Var10 = ne1Var2;
                } else {
                    ne1Var10 = ne1Var2;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.j(ne1Var10)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i4 |= i16;
                    }
                }
                i17 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i17 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var2.j(ne1Var3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i4 |= i18;
                }
                i19 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i19 != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(ne1Var4)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i4 |= i20;
                    }
                    i21 = i3 & 1024;
                    if (i21 != 0) {
                        i22 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (kk0Var2.j(ne1Var5)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i2 | i23;
                    } else {
                        i22 = i2;
                    }
                    i24 = i3 & 2048;
                    if (i24 != 0) {
                        i22 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (kk0Var2.j(ne1Var6)) {
                            i25 = 32;
                        } else {
                            i25 = 16;
                        }
                        i22 |= i25;
                    }
                    i26 = i22;
                    i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                    if (i27 != 0) {
                        i28 = i26 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (!kk0Var2.j(ne1Var7)) {
                            i6 = Uuid.SIZE_BITS;
                        }
                        i28 = i26 | i6;
                    } else {
                        i28 = i26;
                    }
                    i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                    if (i29 != 0) {
                        i30 = i28;
                        if ((i2 & 3072) == 0) {
                            i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i10 = 16384;
                            }
                            i30 |= i10;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i32 = 65536;
                            } else {
                                i32 = 65536;
                            }
                            i30 |= i32;
                        }
                        i31 = i3 & 65536;
                        if (i31 != 0) {
                            i30 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                        }
                        if ((i3 & 131072) != 0) {
                            i30 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f14 = ov3.b;
                                    is2Var = new is2(f14, f14, f14, f14);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            } else {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f15 = ov3.b;
                                    is2Var = new is2(f15, f15, f15, f15);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            }
                            kk0Var2.s();
                            int i31118 = i4 << 3;
                            int i31119 = i4 >> 3;
                            int i311110 = i4 >> 9;
                            int i311111 = i30 << 21;
                            int i311112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311110 & 7168) | (i31119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                            kk0Var = kk0Var2;
                            ne1 ne1Var315 = ne1Var13;
                            ne1 ne1Var316 = ne1VarRememberComposableLambda;
                            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var315, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var316, kk0Var, (i31118 & 896) | (i31118 & 112) | 6 | (i31119 & 7168) | (i311110 & 57344) | (i311110 & 458752) | (i311110 & 3670016) | (i311111 & 29360128) | (i311111 & 234881024) | (i311111 & 1879048192), i311112, 0);
                            ne1Var22 = ne1Var19;
                            ne1Var23 = ne1Var18;
                            bu3Var3 = bu3Var2;
                            ne1Var24 = ne1Var316;
                            ne1Var25 = ne1Var16;
                            ne1Var26 = ne1Var21;
                            z5 = z7;
                            ne1Var27 = ne1Var20;
                            ne1Var28 = ne1Var315;
                            ne1Var29 = ne1Var17;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f16 = ov3.b;
                                    is2Var = new is2(f16, f16, f16, f16);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            } else {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f17 = ov3.b;
                                    is2Var = new is2(f17, f17, f17, f17);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            }
                            kk0Var2.s();
                            int i311113 = i4 << 3;
                            int i311114 = i4 >> 3;
                            int i311115 = i4 >> 9;
                            int i311116 = i30 << 21;
                            int i311117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311115 & 7168) | (i311114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                            kk0Var = kk0Var2;
                            ne1 ne1Var317 = ne1Var13;
                            ne1 ne1Var318 = ne1VarRememberComposableLambda;
                            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var317, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var318, kk0Var, (i311113 & 896) | (i311113 & 112) | 6 | (i311114 & 7168) | (i311115 & 57344) | (i311115 & 458752) | (i311115 & 3670016) | (i311116 & 29360128) | (i311116 & 234881024) | (i311116 & 1879048192), i311117, 0);
                            ne1Var22 = ne1Var19;
                            ne1Var23 = ne1Var18;
                            bu3Var3 = bu3Var2;
                            ne1Var24 = ne1Var318;
                            ne1Var25 = ne1Var16;
                            ne1Var26 = ne1Var21;
                            z5 = z7;
                            ne1Var27 = ne1Var20;
                            ne1Var28 = ne1Var317;
                            ne1Var29 = ne1Var17;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                        }
                    }
                    i30 = i28 | 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i10 = 16384;
                        }
                        i30 |= i10;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    i31 = i3 & 65536;
                    if (i31 != 0) {
                        i30 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                    }
                    if ((i3 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f18 = ov3.b;
                                is2Var = new is2(f18, f18, f18, f18);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f19 = ov3.b;
                                is2Var = new is2(f19, f19, f19, f19);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i311118 = i4 << 3;
                        int i311119 = i4 >> 3;
                        int i3111110 = i4 >> 9;
                        int i3111111 = i30 << 21;
                        int i3111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111110 & 7168) | (i311119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var319 = ne1Var13;
                        ne1 ne1Var3110 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var319, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3110, kk0Var, (i311118 & 896) | (i311118 & 112) | 6 | (i311119 & 7168) | (i3111110 & 57344) | (i3111110 & 458752) | (i3111110 & 3670016) | (i3111111 & 29360128) | (i3111111 & 234881024) | (i3111111 & 1879048192), i3111112, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var3110;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var319;
                        ne1Var29 = ne1Var17;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f110 = ov3.b;
                                is2Var = new is2(f110, f110, f110, f110);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f111 = ov3.b;
                                is2Var = new is2(f111, f111, f111, f111);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i3111113 = i4 << 3;
                        int i3111114 = i4 >> 3;
                        int i3111115 = i4 >> 9;
                        int i3111116 = i30 << 21;
                        int i3111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111115 & 7168) | (i3111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var3111 = ne1Var13;
                        ne1 ne1Var3112 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3112, kk0Var, (i3111113 & 896) | (i3111113 & 112) | 6 | (i3111114 & 7168) | (i3111115 & 57344) | (i3111115 & 458752) | (i3111115 & 3670016) | (i3111116 & 29360128) | (i3111116 & 234881024) | (i3111116 & 1879048192), i3111117, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var3112;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var3111;
                        ne1Var29 = ne1Var17;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                    }
                }
                i4 |= 805306368;
                i21 = i3 & 1024;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var2.j(ne1Var5)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                i24 = i3 & 2048;
                if (i24 != 0) {
                    i22 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.j(ne1Var6)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i22 |= i25;
                }
                i26 = i22;
                i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                if (i27 != 0) {
                    i28 = i26 | 384;
                } else if ((i2 & 384) == 0) {
                    if (!kk0Var2.j(ne1Var7)) {
                        i6 = Uuid.SIZE_BITS;
                    }
                    i28 = i26 | i6;
                } else {
                    i28 = i26;
                }
                i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                if (i29 != 0) {
                    i30 = i28;
                    if ((i2 & 3072) == 0) {
                        i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i10 = 16384;
                        }
                        i30 |= i10;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    i31 = i3 & 65536;
                    if (i31 != 0) {
                        i30 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                    }
                    if ((i3 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f112 = ov3.b;
                                is2Var = new is2(f112, f112, f112, f112);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f113 = ov3.b;
                                is2Var = new is2(f113, f113, f113, f113);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i3111118 = i4 << 3;
                        int i3111119 = i4 >> 3;
                        int i31111110 = i4 >> 9;
                        int i31111111 = i30 << 21;
                        int i31111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111110 & 7168) | (i3111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var3113 = ne1Var13;
                        ne1 ne1Var3114 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3114, kk0Var, (i3111118 & 896) | (i3111118 & 112) | 6 | (i3111119 & 7168) | (i31111110 & 57344) | (i31111110 & 458752) | (i31111110 & 3670016) | (i31111111 & 29360128) | (i31111111 & 234881024) | (i31111111 & 1879048192), i31111112, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var3114;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var3113;
                        ne1Var29 = ne1Var17;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f114 = ov3.b;
                                is2Var = new is2(f114, f114, f114, f114);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f115 = ov3.b;
                                is2Var = new is2(f115, f115, f115, f115);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i31111113 = i4 << 3;
                        int i31111114 = i4 >> 3;
                        int i31111115 = i4 >> 9;
                        int i31111116 = i30 << 21;
                        int i31111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111115 & 7168) | (i31111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var3115 = ne1Var13;
                        ne1 ne1Var3116 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3116, kk0Var, (i31111113 & 896) | (i31111113 & 112) | 6 | (i31111114 & 7168) | (i31111115 & 57344) | (i31111115 & 458752) | (i31111115 & 3670016) | (i31111116 & 29360128) | (i31111116 & 234881024) | (i31111116 & 1879048192), i31111117, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var3116;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var3115;
                        ne1Var29 = ne1Var17;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                    }
                }
                i30 = i28 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i30 |= i10;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                i31 = i3 & 65536;
                if (i31 != 0) {
                    i30 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                }
                if ((i3 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f116 = ov3.b;
                            is2Var = new is2(f116, f116, f116, f116);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f117 = ov3.b;
                            is2Var = new is2(f117, f117, f117, f117);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i31111118 = i4 << 3;
                    int i31111119 = i4 >> 3;
                    int i311111110 = i4 >> 9;
                    int i311111111 = i30 << 21;
                    int i311111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111110 & 7168) | (i31111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3117 = ne1Var13;
                    ne1 ne1Var3118 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3117, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3118, kk0Var, (i31111118 & 896) | (i31111118 & 112) | 6 | (i31111119 & 7168) | (i311111110 & 57344) | (i311111110 & 458752) | (i311111110 & 3670016) | (i311111111 & 29360128) | (i311111111 & 234881024) | (i311111111 & 1879048192), i311111112, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var3118;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3117;
                    ne1Var29 = ne1Var17;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f118 = ov3.b;
                            is2Var = new is2(f118, f118, f118, f118);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f119 = ov3.b;
                            is2Var = new is2(f119, f119, f119, f119);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i311111113 = i4 << 3;
                    int i311111114 = i4 >> 3;
                    int i311111115 = i4 >> 9;
                    int i311111116 = i30 << 21;
                    int i311111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111115 & 7168) | (i311111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3119 = ne1Var13;
                    ne1 ne1Var31110 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3119, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31110, kk0Var, (i311111113 & 896) | (i311111113 & 112) | 6 | (i311111114 & 7168) | (i311111115 & 57344) | (i311111115 & 458752) | (i311111115 & 3670016) | (i311111116 & 29360128) | (i311111116 & 234881024) | (i311111116 & 1879048192), i311111117, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var31110;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3119;
                    ne1Var29 = ne1Var17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                }
            }
            i4 |= 3072;
            z4 = z2;
            i9 = i3 & 16;
            i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            if (i9 != 0) {
                if ((i & 24576) == 0) {
                    if (kk0Var2.h(de4Var)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i4 |= i11;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var2.h(uq1Var)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    i4 |= 1572864;
                    z5 = z3;
                } else {
                    z5 = z3;
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.i(z5)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & Uuid.SIZE_BITS;
                if (i15 != 0) {
                    i4 |= 12582912;
                    ne1Var10 = ne1Var2;
                } else {
                    ne1Var10 = ne1Var2;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.j(ne1Var10)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i4 |= i16;
                    }
                }
                i17 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i17 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var2.j(ne1Var3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i4 |= i18;
                }
                i19 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i19 != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(ne1Var4)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i4 |= i20;
                    }
                    i21 = i3 & 1024;
                    if (i21 != 0) {
                        i22 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (kk0Var2.j(ne1Var5)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i2 | i23;
                    } else {
                        i22 = i2;
                    }
                    i24 = i3 & 2048;
                    if (i24 != 0) {
                        i22 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (kk0Var2.j(ne1Var6)) {
                            i25 = 32;
                        } else {
                            i25 = 16;
                        }
                        i22 |= i25;
                    }
                    i26 = i22;
                    i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                    if (i27 != 0) {
                        i28 = i26 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (!kk0Var2.j(ne1Var7)) {
                            i6 = Uuid.SIZE_BITS;
                        }
                        i28 = i26 | i6;
                    } else {
                        i28 = i26;
                    }
                    i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                    if (i29 != 0) {
                        i30 = i28;
                        if ((i2 & 3072) == 0) {
                            i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i10 = 16384;
                            }
                            i30 |= i10;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i32 = 65536;
                            } else {
                                i32 = 65536;
                            }
                            i30 |= i32;
                        }
                        i31 = i3 & 65536;
                        if (i31 != 0) {
                            i30 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                        }
                        if ((i3 & 131072) != 0) {
                            i30 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f1110 = ov3.b;
                                    is2Var = new is2(f1110, f1110, f1110, f1110);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            } else {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f1111 = ov3.b;
                                    is2Var = new is2(f1111, f1111, f1111, f1111);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            }
                            kk0Var2.s();
                            int i311111118 = i4 << 3;
                            int i311111119 = i4 >> 3;
                            int i3111111110 = i4 >> 9;
                            int i3111111111 = i30 << 21;
                            int i3111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111110 & 7168) | (i311111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                            kk0Var = kk0Var2;
                            ne1 ne1Var31111 = ne1Var13;
                            ne1 ne1Var31112 = ne1VarRememberComposableLambda;
                            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31112, kk0Var, (i311111118 & 896) | (i311111118 & 112) | 6 | (i311111119 & 7168) | (i3111111110 & 57344) | (i3111111110 & 458752) | (i3111111110 & 3670016) | (i3111111111 & 29360128) | (i3111111111 & 234881024) | (i3111111111 & 1879048192), i3111111112, 0);
                            ne1Var22 = ne1Var19;
                            ne1Var23 = ne1Var18;
                            bu3Var3 = bu3Var2;
                            ne1Var24 = ne1Var31112;
                            ne1Var25 = ne1Var16;
                            ne1Var26 = ne1Var21;
                            z5 = z7;
                            ne1Var27 = ne1Var20;
                            ne1Var28 = ne1Var31111;
                            ne1Var29 = ne1Var17;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f1112 = ov3.b;
                                    is2Var = new is2(f1112, f1112, f1112, f1112);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            } else {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f1113 = ov3.b;
                                    is2Var = new is2(f1113, f1113, f1113, f1113);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            }
                            kk0Var2.s();
                            int i3111111113 = i4 << 3;
                            int i3111111114 = i4 >> 3;
                            int i3111111115 = i4 >> 9;
                            int i3111111116 = i30 << 21;
                            int i3111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111115 & 7168) | (i3111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                            kk0Var = kk0Var2;
                            ne1 ne1Var31113 = ne1Var13;
                            ne1 ne1Var31114 = ne1VarRememberComposableLambda;
                            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31114, kk0Var, (i3111111113 & 896) | (i3111111113 & 112) | 6 | (i3111111114 & 7168) | (i3111111115 & 57344) | (i3111111115 & 458752) | (i3111111115 & 3670016) | (i3111111116 & 29360128) | (i3111111116 & 234881024) | (i3111111116 & 1879048192), i3111111117, 0);
                            ne1Var22 = ne1Var19;
                            ne1Var23 = ne1Var18;
                            bu3Var3 = bu3Var2;
                            ne1Var24 = ne1Var31114;
                            ne1Var25 = ne1Var16;
                            ne1Var26 = ne1Var21;
                            z5 = z7;
                            ne1Var27 = ne1Var20;
                            ne1Var28 = ne1Var31113;
                            ne1Var29 = ne1Var17;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                        }
                    }
                    i30 = i28 | 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i10 = 16384;
                        }
                        i30 |= i10;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    i31 = i3 & 65536;
                    if (i31 != 0) {
                        i30 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                    }
                    if ((i3 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1114 = ov3.b;
                                is2Var = new is2(f1114, f1114, f1114, f1114);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1115 = ov3.b;
                                is2Var = new is2(f1115, f1115, f1115, f1115);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i3111111118 = i4 << 3;
                        int i3111111119 = i4 >> 3;
                        int i31111111110 = i4 >> 9;
                        int i31111111111 = i30 << 21;
                        int i31111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111110 & 7168) | (i3111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var31115 = ne1Var13;
                        ne1 ne1Var31116 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31116, kk0Var, (i3111111118 & 896) | (i3111111118 & 112) | 6 | (i3111111119 & 7168) | (i31111111110 & 57344) | (i31111111110 & 458752) | (i31111111110 & 3670016) | (i31111111111 & 29360128) | (i31111111111 & 234881024) | (i31111111111 & 1879048192), i31111111112, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var31116;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var31115;
                        ne1Var29 = ne1Var17;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1116 = ov3.b;
                                is2Var = new is2(f1116, f1116, f1116, f1116);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1117 = ov3.b;
                                is2Var = new is2(f1117, f1117, f1117, f1117);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i31111111113 = i4 << 3;
                        int i31111111114 = i4 >> 3;
                        int i31111111115 = i4 >> 9;
                        int i31111111116 = i30 << 21;
                        int i31111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111115 & 7168) | (i31111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var31117 = ne1Var13;
                        ne1 ne1Var31118 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31117, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31118, kk0Var, (i31111111113 & 896) | (i31111111113 & 112) | 6 | (i31111111114 & 7168) | (i31111111115 & 57344) | (i31111111115 & 458752) | (i31111111115 & 3670016) | (i31111111116 & 29360128) | (i31111111116 & 234881024) | (i31111111116 & 1879048192), i31111111117, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var31118;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var31117;
                        ne1Var29 = ne1Var17;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                    }
                }
                i4 |= 805306368;
                i21 = i3 & 1024;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var2.j(ne1Var5)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                i24 = i3 & 2048;
                if (i24 != 0) {
                    i22 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.j(ne1Var6)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i22 |= i25;
                }
                i26 = i22;
                i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                if (i27 != 0) {
                    i28 = i26 | 384;
                } else if ((i2 & 384) == 0) {
                    if (!kk0Var2.j(ne1Var7)) {
                        i6 = Uuid.SIZE_BITS;
                    }
                    i28 = i26 | i6;
                } else {
                    i28 = i26;
                }
                i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                if (i29 != 0) {
                    i30 = i28;
                    if ((i2 & 3072) == 0) {
                        i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i10 = 16384;
                        }
                        i30 |= i10;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    i31 = i3 & 65536;
                    if (i31 != 0) {
                        i30 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                    }
                    if ((i3 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1118 = ov3.b;
                                is2Var = new is2(f1118, f1118, f1118, f1118);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1119 = ov3.b;
                                is2Var = new is2(f1119, f1119, f1119, f1119);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i31111111118 = i4 << 3;
                        int i31111111119 = i4 >> 3;
                        int i311111111110 = i4 >> 9;
                        int i311111111111 = i30 << 21;
                        int i311111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111110 & 7168) | (i31111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var31119 = ne1Var13;
                        ne1 ne1Var311110 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31119, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311110, kk0Var, (i31111111118 & 896) | (i31111111118 & 112) | 6 | (i31111111119 & 7168) | (i311111111110 & 57344) | (i311111111110 & 458752) | (i311111111110 & 3670016) | (i311111111111 & 29360128) | (i311111111111 & 234881024) | (i311111111111 & 1879048192), i311111111112, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var311110;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var31119;
                        ne1Var29 = ne1Var17;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11110 = ov3.b;
                                is2Var = new is2(f11110, f11110, f11110, f11110);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11111 = ov3.b;
                                is2Var = new is2(f11111, f11111, f11111, f11111);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i311111111113 = i4 << 3;
                        int i311111111114 = i4 >> 3;
                        int i311111111115 = i4 >> 9;
                        int i311111111116 = i30 << 21;
                        int i311111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111115 & 7168) | (i311111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var311111 = ne1Var13;
                        ne1 ne1Var311112 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311112, kk0Var, (i311111111113 & 896) | (i311111111113 & 112) | 6 | (i311111111114 & 7168) | (i311111111115 & 57344) | (i311111111115 & 458752) | (i311111111115 & 3670016) | (i311111111116 & 29360128) | (i311111111116 & 234881024) | (i311111111116 & 1879048192), i311111111117, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var311112;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var311111;
                        ne1Var29 = ne1Var17;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                    }
                }
                i30 = i28 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i30 |= i10;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                i31 = i3 & 65536;
                if (i31 != 0) {
                    i30 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                }
                if ((i3 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11112 = ov3.b;
                            is2Var = new is2(f11112, f11112, f11112, f11112);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11113 = ov3.b;
                            is2Var = new is2(f11113, f11113, f11113, f11113);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i311111111118 = i4 << 3;
                    int i311111111119 = i4 >> 3;
                    int i3111111111110 = i4 >> 9;
                    int i3111111111111 = i30 << 21;
                    int i3111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111110 & 7168) | (i311111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var311113 = ne1Var13;
                    ne1 ne1Var311114 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311114, kk0Var, (i311111111118 & 896) | (i311111111118 & 112) | 6 | (i311111111119 & 7168) | (i3111111111110 & 57344) | (i3111111111110 & 458752) | (i3111111111110 & 3670016) | (i3111111111111 & 29360128) | (i3111111111111 & 234881024) | (i3111111111111 & 1879048192), i3111111111112, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var311114;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var311113;
                    ne1Var29 = ne1Var17;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11114 = ov3.b;
                            is2Var = new is2(f11114, f11114, f11114, f11114);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11115 = ov3.b;
                            is2Var = new is2(f11115, f11115, f11115, f11115);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i3111111111113 = i4 << 3;
                    int i3111111111114 = i4 >> 3;
                    int i3111111111115 = i4 >> 9;
                    int i3111111111116 = i30 << 21;
                    int i3111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111115 & 7168) | (i3111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var311115 = ne1Var13;
                    ne1 ne1Var311116 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311116, kk0Var, (i3111111111113 & 896) | (i3111111111113 & 112) | 6 | (i3111111111114 & 7168) | (i3111111111115 & 57344) | (i3111111111115 & 458752) | (i3111111111115 & 3670016) | (i3111111111116 & 29360128) | (i3111111111116 & 234881024) | (i3111111111116 & 1879048192), i3111111111117, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var311116;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var311115;
                    ne1Var29 = ne1Var17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                }
            }
            i4 |= 24576;
            if ((i3 & 32) != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var2.h(uq1Var)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                i4 |= 1572864;
                z5 = z3;
            } else {
                z5 = z3;
                if ((i & 1572864) == 0) {
                    if (kk0Var2.i(z5)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & Uuid.SIZE_BITS;
            if (i15 != 0) {
                i4 |= 12582912;
                ne1Var10 = ne1Var2;
            } else {
                ne1Var10 = ne1Var2;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.j(ne1Var10)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i4 |= i16;
                }
            }
            i17 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i17 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var2.j(ne1Var3)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i4 |= i18;
            }
            i19 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i19 != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(ne1Var4)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i4 |= i20;
                }
                i21 = i3 & 1024;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var2.j(ne1Var5)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                i24 = i3 & 2048;
                if (i24 != 0) {
                    i22 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.j(ne1Var6)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i22 |= i25;
                }
                i26 = i22;
                i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                if (i27 != 0) {
                    i28 = i26 | 384;
                } else if ((i2 & 384) == 0) {
                    if (!kk0Var2.j(ne1Var7)) {
                        i6 = Uuid.SIZE_BITS;
                    }
                    i28 = i26 | i6;
                } else {
                    i28 = i26;
                }
                i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                if (i29 != 0) {
                    i30 = i28;
                    if ((i2 & 3072) == 0) {
                        i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i10 = 16384;
                        }
                        i30 |= i10;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    i31 = i3 & 65536;
                    if (i31 != 0) {
                        i30 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                    }
                    if ((i3 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11116 = ov3.b;
                                is2Var = new is2(f11116, f11116, f11116, f11116);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11117 = ov3.b;
                                is2Var = new is2(f11117, f11117, f11117, f11117);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i3111111111118 = i4 << 3;
                        int i3111111111119 = i4 >> 3;
                        int i31111111111110 = i4 >> 9;
                        int i31111111111111 = i30 << 21;
                        int i31111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111110 & 7168) | (i3111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var311117 = ne1Var13;
                        ne1 ne1Var311118 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311117, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311118, kk0Var, (i3111111111118 & 896) | (i3111111111118 & 112) | 6 | (i3111111111119 & 7168) | (i31111111111110 & 57344) | (i31111111111110 & 458752) | (i31111111111110 & 3670016) | (i31111111111111 & 29360128) | (i31111111111111 & 234881024) | (i31111111111111 & 1879048192), i31111111111112, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var311118;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var311117;
                        ne1Var29 = ne1Var17;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11118 = ov3.b;
                                is2Var = new is2(f11118, f11118, f11118, f11118);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11119 = ov3.b;
                                is2Var = new is2(f11119, f11119, f11119, f11119);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i31111111111113 = i4 << 3;
                        int i31111111111114 = i4 >> 3;
                        int i31111111111115 = i4 >> 9;
                        int i31111111111116 = i30 << 21;
                        int i31111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111115 & 7168) | (i31111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var311119 = ne1Var13;
                        ne1 ne1Var3111110 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311119, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111110, kk0Var, (i31111111111113 & 896) | (i31111111111113 & 112) | 6 | (i31111111111114 & 7168) | (i31111111111115 & 57344) | (i31111111111115 & 458752) | (i31111111111115 & 3670016) | (i31111111111116 & 29360128) | (i31111111111116 & 234881024) | (i31111111111116 & 1879048192), i31111111111117, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var3111110;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var311119;
                        ne1Var29 = ne1Var17;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                    }
                }
                i30 = i28 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i30 |= i10;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                i31 = i3 & 65536;
                if (i31 != 0) {
                    i30 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                }
                if ((i3 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111110 = ov3.b;
                            is2Var = new is2(f111110, f111110, f111110, f111110);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111 = ov3.b;
                            is2Var = new is2(f111111, f111111, f111111, f111111);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i31111111111118 = i4 << 3;
                    int i31111111111119 = i4 >> 3;
                    int i311111111111110 = i4 >> 9;
                    int i311111111111111 = i30 << 21;
                    int i311111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111110 & 7168) | (i31111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3111111 = ne1Var13;
                    ne1 ne1Var3111112 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111112, kk0Var, (i31111111111118 & 896) | (i31111111111118 & 112) | 6 | (i31111111111119 & 7168) | (i311111111111110 & 57344) | (i311111111111110 & 458752) | (i311111111111110 & 3670016) | (i311111111111111 & 29360128) | (i311111111111111 & 234881024) | (i311111111111111 & 1879048192), i311111111111112, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var3111112;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3111111;
                    ne1Var29 = ne1Var17;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111112 = ov3.b;
                            is2Var = new is2(f111112, f111112, f111112, f111112);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111113 = ov3.b;
                            is2Var = new is2(f111113, f111113, f111113, f111113);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i311111111111113 = i4 << 3;
                    int i311111111111114 = i4 >> 3;
                    int i311111111111115 = i4 >> 9;
                    int i311111111111116 = i30 << 21;
                    int i311111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111115 & 7168) | (i311111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3111113 = ne1Var13;
                    ne1 ne1Var3111114 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111114, kk0Var, (i311111111111113 & 896) | (i311111111111113 & 112) | 6 | (i311111111111114 & 7168) | (i311111111111115 & 57344) | (i311111111111115 & 458752) | (i311111111111115 & 3670016) | (i311111111111116 & 29360128) | (i311111111111116 & 234881024) | (i311111111111116 & 1879048192), i311111111111117, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var3111114;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3111113;
                    ne1Var29 = ne1Var17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                }
            }
            i4 |= 805306368;
            i21 = i3 & 1024;
            if (i21 != 0) {
                i22 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (kk0Var2.j(ne1Var5)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i2 | i23;
            } else {
                i22 = i2;
            }
            i24 = i3 & 2048;
            if (i24 != 0) {
                i22 |= 48;
            } else if ((i2 & 48) != 0) {
                if (kk0Var2.j(ne1Var6)) {
                    i25 = 32;
                } else {
                    i25 = 16;
                }
                i22 |= i25;
            }
            i26 = i22;
            i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
            if (i27 != 0) {
                i28 = i26 | 384;
            } else if ((i2 & 384) == 0) {
                if (!kk0Var2.j(ne1Var7)) {
                    i6 = Uuid.SIZE_BITS;
                }
                i28 = i26 | i6;
            } else {
                i28 = i26;
            }
            i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
            if (i29 != 0) {
                i30 = i28;
                if ((i2 & 3072) == 0) {
                    i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i30 |= i10;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                i31 = i3 & 65536;
                if (i31 != 0) {
                    i30 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                }
                if ((i3 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111114 = ov3.b;
                            is2Var = new is2(f111114, f111114, f111114, f111114);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111115 = ov3.b;
                            is2Var = new is2(f111115, f111115, f111115, f111115);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i311111111111118 = i4 << 3;
                    int i311111111111119 = i4 >> 3;
                    int i3111111111111110 = i4 >> 9;
                    int i3111111111111111 = i30 << 21;
                    int i3111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111110 & 7168) | (i311111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3111115 = ne1Var13;
                    ne1 ne1Var3111116 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111116, kk0Var, (i311111111111118 & 896) | (i311111111111118 & 112) | 6 | (i311111111111119 & 7168) | (i3111111111111110 & 57344) | (i3111111111111110 & 458752) | (i3111111111111110 & 3670016) | (i3111111111111111 & 29360128) | (i3111111111111111 & 234881024) | (i3111111111111111 & 1879048192), i3111111111111112, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var3111116;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3111115;
                    ne1Var29 = ne1Var17;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111116 = ov3.b;
                            is2Var = new is2(f111116, f111116, f111116, f111116);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111117 = ov3.b;
                            is2Var = new is2(f111117, f111117, f111117, f111117);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i3111111111111113 = i4 << 3;
                    int i3111111111111114 = i4 >> 3;
                    int i3111111111111115 = i4 >> 9;
                    int i3111111111111116 = i30 << 21;
                    int i3111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111115 & 7168) | (i3111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3111117 = ne1Var13;
                    ne1 ne1Var3111118 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111117, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111118, kk0Var, (i3111111111111113 & 896) | (i3111111111111113 & 112) | 6 | (i3111111111111114 & 7168) | (i3111111111111115 & 57344) | (i3111111111111115 & 458752) | (i3111111111111115 & 3670016) | (i3111111111111116 & 29360128) | (i3111111111111116 & 234881024) | (i3111111111111116 & 1879048192), i3111111111111117, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var3111118;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3111117;
                    ne1Var29 = ne1Var17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                }
            }
            i30 = i28 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i10 = 16384;
                }
                i30 |= i10;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i32 = 65536;
                } else {
                    i32 = 65536;
                }
                i30 |= i32;
            }
            i31 = i3 & 65536;
            if (i31 != 0) {
                i30 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
            }
            if ((i3 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
            }
            if ((i4 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f111118 = ov3.b;
                        is2Var = new is2(f111118, f111118, f111118, f111118);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                } else {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f111119 = ov3.b;
                        is2Var = new is2(f111119, f111119, f111119, f111119);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                }
                kk0Var2.s();
                int i3111111111111118 = i4 << 3;
                int i3111111111111119 = i4 >> 3;
                int i31111111111111110 = i4 >> 9;
                int i31111111111111111 = i30 << 21;
                int i31111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111110 & 7168) | (i3111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                kk0Var = kk0Var2;
                ne1 ne1Var3111119 = ne1Var13;
                ne1 ne1Var31111110 = ne1VarRememberComposableLambda;
                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111119, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111110, kk0Var, (i3111111111111118 & 896) | (i3111111111111118 & 112) | 6 | (i3111111111111119 & 7168) | (i31111111111111110 & 57344) | (i31111111111111110 & 458752) | (i31111111111111110 & 3670016) | (i31111111111111111 & 29360128) | (i31111111111111111 & 234881024) | (i31111111111111111 & 1879048192), i31111111111111112, 0);
                ne1Var22 = ne1Var19;
                ne1Var23 = ne1Var18;
                bu3Var3 = bu3Var2;
                ne1Var24 = ne1Var31111110;
                ne1Var25 = ne1Var16;
                ne1Var26 = ne1Var21;
                z5 = z7;
                ne1Var27 = ne1Var20;
                ne1Var28 = ne1Var3111119;
                ne1Var29 = ne1Var17;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f1111110 = ov3.b;
                        is2Var = new is2(f1111110, f1111110, f1111110, f1111110);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                } else {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f1111111 = ov3.b;
                        is2Var = new is2(f1111111, f1111111, f1111111, f1111111);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                }
                kk0Var2.s();
                int i31111111111111113 = i4 << 3;
                int i31111111111111114 = i4 >> 3;
                int i31111111111111115 = i4 >> 9;
                int i31111111111111116 = i30 << 21;
                int i31111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111115 & 7168) | (i31111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                kk0Var = kk0Var2;
                ne1 ne1Var31111111 = ne1Var13;
                ne1 ne1Var31111112 = ne1VarRememberComposableLambda;
                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111112, kk0Var, (i31111111111111113 & 896) | (i31111111111111113 & 112) | 6 | (i31111111111111114 & 7168) | (i31111111111111115 & 57344) | (i31111111111111115 & 458752) | (i31111111111111115 & 3670016) | (i31111111111111116 & 29360128) | (i31111111111111116 & 234881024) | (i31111111111111116 & 1879048192), i31111111111111117, 0);
                ne1Var22 = ne1Var19;
                ne1Var23 = ne1Var18;
                bu3Var3 = bu3Var2;
                ne1Var24 = ne1Var31111112;
                ne1Var25 = ne1Var16;
                ne1Var26 = ne1Var21;
                z5 = z7;
                ne1Var27 = ne1Var20;
                ne1Var28 = ne1Var31111111;
                ne1Var29 = ne1Var17;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
            }
        }
        i4 |= 48;
        i5 = i3 & 4;
        i6 = FontInfo.NUMBER_OF_CHAR_CODES;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if (kk0Var2.i(z)) {
                i7 = 256;
            } else {
                i7 = Uuid.SIZE_BITS;
            }
            i4 |= i7;
        }
        if ((i3 & 8) != 0) {
            if ((i & 3072) == 0) {
                z4 = z2;
                if (kk0Var2.i(z4)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            if (i9 != 0) {
                if ((i & 24576) == 0) {
                    if (kk0Var2.h(de4Var)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i4 |= i11;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (kk0Var2.h(uq1Var)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    i4 |= 1572864;
                    z5 = z3;
                } else {
                    z5 = z3;
                    if ((i & 1572864) == 0) {
                        if (kk0Var2.i(z5)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & Uuid.SIZE_BITS;
                if (i15 != 0) {
                    i4 |= 12582912;
                    ne1Var10 = ne1Var2;
                } else {
                    ne1Var10 = ne1Var2;
                    if ((i & 12582912) == 0) {
                        if (kk0Var2.j(ne1Var10)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i4 |= i16;
                    }
                }
                i17 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
                if (i17 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (kk0Var2.j(ne1Var3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i4 |= i18;
                }
                i19 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i19 != 0) {
                    if ((i & 805306368) == 0) {
                        if (kk0Var2.j(ne1Var4)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i4 |= i20;
                    }
                    i21 = i3 & 1024;
                    if (i21 != 0) {
                        i22 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (kk0Var2.j(ne1Var5)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i2 | i23;
                    } else {
                        i22 = i2;
                    }
                    i24 = i3 & 2048;
                    if (i24 != 0) {
                        i22 |= 48;
                    } else if ((i2 & 48) != 0) {
                        if (kk0Var2.j(ne1Var6)) {
                            i25 = 32;
                        } else {
                            i25 = 16;
                        }
                        i22 |= i25;
                    }
                    i26 = i22;
                    i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                    if (i27 != 0) {
                        i28 = i26 | 384;
                    } else if ((i2 & 384) == 0) {
                        if (!kk0Var2.j(ne1Var7)) {
                            i6 = Uuid.SIZE_BITS;
                        }
                        i28 = i26 | i6;
                    } else {
                        i28 = i26;
                    }
                    i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                    if (i29 != 0) {
                        i30 = i28;
                        if ((i2 & 3072) == 0) {
                            i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i10 = 16384;
                            }
                            i30 |= i10;
                        }
                        if ((i2 & 196608) != 0) {
                            if ((i3 & 32768) == 0) {
                                i32 = 65536;
                            } else {
                                i32 = 65536;
                            }
                            i30 |= i32;
                        }
                        i31 = i3 & 65536;
                        if (i31 != 0) {
                            i30 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                        }
                        if ((i3 & 131072) != 0) {
                            i30 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f1111112 = ov3.b;
                                    is2Var = new is2(f1111112, f1111112, f1111112, f1111112);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            } else {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f1111113 = ov3.b;
                                    is2Var = new is2(f1111113, f1111113, f1111113, f1111113);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            }
                            kk0Var2.s();
                            int i31111111111111118 = i4 << 3;
                            int i31111111111111119 = i4 >> 3;
                            int i311111111111111110 = i4 >> 9;
                            int i311111111111111111 = i30 << 21;
                            int i311111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111110 & 7168) | (i31111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                            kk0Var = kk0Var2;
                            ne1 ne1Var31111113 = ne1Var13;
                            ne1 ne1Var31111114 = ne1VarRememberComposableLambda;
                            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111114, kk0Var, (i31111111111111118 & 896) | (i31111111111111118 & 112) | 6 | (i31111111111111119 & 7168) | (i311111111111111110 & 57344) | (i311111111111111110 & 458752) | (i311111111111111110 & 3670016) | (i311111111111111111 & 29360128) | (i311111111111111111 & 234881024) | (i311111111111111111 & 1879048192), i311111111111111112, 0);
                            ne1Var22 = ne1Var19;
                            ne1Var23 = ne1Var18;
                            bu3Var3 = bu3Var2;
                            ne1Var24 = ne1Var31111114;
                            ne1Var25 = ne1Var16;
                            ne1Var26 = ne1Var21;
                            z5 = z7;
                            ne1Var27 = ne1Var20;
                            ne1Var28 = ne1Var31111113;
                            ne1Var29 = ne1Var17;
                        } else {
                            kk0Var2.X();
                            if ((i & 1) != 0) {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f1111114 = ov3.b;
                                    is2Var = new is2(f1111114, f1111114, f1111114, f1111114);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            } else {
                                if (i13 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (i15 != 0) {
                                    ne1Var10 = null;
                                }
                                if (i17 != 0) {
                                    ne1Var11 = null;
                                } else {
                                    ne1Var11 = ne1Var3;
                                }
                                if (i19 != 0) {
                                    ne1Var12 = null;
                                } else {
                                    ne1Var12 = ne1Var4;
                                }
                                if (i21 != 0) {
                                    ne1Var13 = null;
                                } else {
                                    ne1Var13 = ne1Var5;
                                }
                                if (i24 != 0) {
                                    ne1Var14 = null;
                                } else {
                                    ne1Var14 = ne1Var6;
                                }
                                if (i27 != 0) {
                                    ne1Var15 = null;
                                } else {
                                    ne1Var15 = ne1Var7;
                                }
                                if (i29 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                    i30 &= -57345;
                                } else {
                                    bu3VarColors = bu3Var;
                                }
                                if ((i3 & 32768) != 0) {
                                    float f1111115 = ov3.b;
                                    is2Var = new is2(f1111115, f1111115, f1111115, f1111115);
                                    i30 &= -458753;
                                } else {
                                    is2Var = hs2Var;
                                }
                                if (i31 != 0) {
                                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                                } else {
                                    ne1VarRememberComposableLambda = ne1Var9;
                                }
                                bu3Var2 = bu3VarColors;
                                ne1Var16 = ne1Var11;
                                ne1Var17 = ne1Var10;
                                ne1Var18 = ne1Var15;
                                ne1Var19 = ne1Var14;
                                ne1Var20 = ne1Var30;
                                ne1Var21 = ne1Var12;
                                z7 = z6;
                                hs2Var2 = is2Var;
                            }
                            kk0Var2.s();
                            int i311111111111111113 = i4 << 3;
                            int i311111111111111114 = i4 >> 3;
                            int i311111111111111115 = i4 >> 9;
                            int i311111111111111116 = i30 << 21;
                            int i311111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111115 & 7168) | (i311111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                            kk0Var = kk0Var2;
                            ne1 ne1Var31111115 = ne1Var13;
                            ne1 ne1Var31111116 = ne1VarRememberComposableLambda;
                            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111116, kk0Var, (i311111111111111113 & 896) | (i311111111111111113 & 112) | 6 | (i311111111111111114 & 7168) | (i311111111111111115 & 57344) | (i311111111111111115 & 458752) | (i311111111111111115 & 3670016) | (i311111111111111116 & 29360128) | (i311111111111111116 & 234881024) | (i311111111111111116 & 1879048192), i311111111111111117, 0);
                            ne1Var22 = ne1Var19;
                            ne1Var23 = ne1Var18;
                            bu3Var3 = bu3Var2;
                            ne1Var24 = ne1Var31111116;
                            ne1Var25 = ne1Var16;
                            ne1Var26 = ne1Var21;
                            z5 = z7;
                            ne1Var27 = ne1Var20;
                            ne1Var28 = ne1Var31111115;
                            ne1Var29 = ne1Var17;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                        }
                    }
                    i30 = i28 | 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i10 = 16384;
                        }
                        i30 |= i10;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    i31 = i3 & 65536;
                    if (i31 != 0) {
                        i30 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                    }
                    if ((i3 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1111116 = ov3.b;
                                is2Var = new is2(f1111116, f1111116, f1111116, f1111116);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1111117 = ov3.b;
                                is2Var = new is2(f1111117, f1111117, f1111117, f1111117);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i311111111111111118 = i4 << 3;
                        int i311111111111111119 = i4 >> 3;
                        int i3111111111111111110 = i4 >> 9;
                        int i3111111111111111111 = i30 << 21;
                        int i3111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111111110 & 7168) | (i311111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var31111117 = ne1Var13;
                        ne1 ne1Var31111118 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111117, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111118, kk0Var, (i311111111111111118 & 896) | (i311111111111111118 & 112) | 6 | (i311111111111111119 & 7168) | (i3111111111111111110 & 57344) | (i3111111111111111110 & 458752) | (i3111111111111111110 & 3670016) | (i3111111111111111111 & 29360128) | (i3111111111111111111 & 234881024) | (i3111111111111111111 & 1879048192), i3111111111111111112, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var31111118;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var31111117;
                        ne1Var29 = ne1Var17;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1111118 = ov3.b;
                                is2Var = new is2(f1111118, f1111118, f1111118, f1111118);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1111119 = ov3.b;
                                is2Var = new is2(f1111119, f1111119, f1111119, f1111119);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i3111111111111111113 = i4 << 3;
                        int i3111111111111111114 = i4 >> 3;
                        int i3111111111111111115 = i4 >> 9;
                        int i3111111111111111116 = i30 << 21;
                        int i3111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111111115 & 7168) | (i3111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var31111119 = ne1Var13;
                        ne1 ne1Var311111110 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111119, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311111110, kk0Var, (i3111111111111111113 & 896) | (i3111111111111111113 & 112) | 6 | (i3111111111111111114 & 7168) | (i3111111111111111115 & 57344) | (i3111111111111111115 & 458752) | (i3111111111111111115 & 3670016) | (i3111111111111111116 & 29360128) | (i3111111111111111116 & 234881024) | (i3111111111111111116 & 1879048192), i3111111111111111117, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var311111110;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var31111119;
                        ne1Var29 = ne1Var17;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                    }
                }
                i4 |= 805306368;
                i21 = i3 & 1024;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var2.j(ne1Var5)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                i24 = i3 & 2048;
                if (i24 != 0) {
                    i22 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.j(ne1Var6)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i22 |= i25;
                }
                i26 = i22;
                i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                if (i27 != 0) {
                    i28 = i26 | 384;
                } else if ((i2 & 384) == 0) {
                    if (!kk0Var2.j(ne1Var7)) {
                        i6 = Uuid.SIZE_BITS;
                    }
                    i28 = i26 | i6;
                } else {
                    i28 = i26;
                }
                i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                if (i29 != 0) {
                    i30 = i28;
                    if ((i2 & 3072) == 0) {
                        i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i10 = 16384;
                        }
                        i30 |= i10;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    i31 = i3 & 65536;
                    if (i31 != 0) {
                        i30 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                    }
                    if ((i3 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11111110 = ov3.b;
                                is2Var = new is2(f11111110, f11111110, f11111110, f11111110);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11111111 = ov3.b;
                                is2Var = new is2(f11111111, f11111111, f11111111, f11111111);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i3111111111111111118 = i4 << 3;
                        int i3111111111111111119 = i4 >> 3;
                        int i31111111111111111110 = i4 >> 9;
                        int i31111111111111111111 = i30 << 21;
                        int i31111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111111110 & 7168) | (i3111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var311111111 = ne1Var13;
                        ne1 ne1Var311111112 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311111112, kk0Var, (i3111111111111111118 & 896) | (i3111111111111111118 & 112) | 6 | (i3111111111111111119 & 7168) | (i31111111111111111110 & 57344) | (i31111111111111111110 & 458752) | (i31111111111111111110 & 3670016) | (i31111111111111111111 & 29360128) | (i31111111111111111111 & 234881024) | (i31111111111111111111 & 1879048192), i31111111111111111112, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var311111112;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var311111111;
                        ne1Var29 = ne1Var17;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11111112 = ov3.b;
                                is2Var = new is2(f11111112, f11111112, f11111112, f11111112);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11111113 = ov3.b;
                                is2Var = new is2(f11111113, f11111113, f11111113, f11111113);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i31111111111111111113 = i4 << 3;
                        int i31111111111111111114 = i4 >> 3;
                        int i31111111111111111115 = i4 >> 9;
                        int i31111111111111111116 = i30 << 21;
                        int i31111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111111115 & 7168) | (i31111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var311111113 = ne1Var13;
                        ne1 ne1Var311111114 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311111114, kk0Var, (i31111111111111111113 & 896) | (i31111111111111111113 & 112) | 6 | (i31111111111111111114 & 7168) | (i31111111111111111115 & 57344) | (i31111111111111111115 & 458752) | (i31111111111111111115 & 3670016) | (i31111111111111111116 & 29360128) | (i31111111111111111116 & 234881024) | (i31111111111111111116 & 1879048192), i31111111111111111117, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var311111114;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var311111113;
                        ne1Var29 = ne1Var17;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                    }
                }
                i30 = i28 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i30 |= i10;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                i31 = i3 & 65536;
                if (i31 != 0) {
                    i30 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                }
                if ((i3 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11111114 = ov3.b;
                            is2Var = new is2(f11111114, f11111114, f11111114, f11111114);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11111115 = ov3.b;
                            is2Var = new is2(f11111115, f11111115, f11111115, f11111115);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i31111111111111111118 = i4 << 3;
                    int i31111111111111111119 = i4 >> 3;
                    int i311111111111111111110 = i4 >> 9;
                    int i311111111111111111111 = i30 << 21;
                    int i311111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111111110 & 7168) | (i31111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var311111115 = ne1Var13;
                    ne1 ne1Var311111116 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311111116, kk0Var, (i31111111111111111118 & 896) | (i31111111111111111118 & 112) | 6 | (i31111111111111111119 & 7168) | (i311111111111111111110 & 57344) | (i311111111111111111110 & 458752) | (i311111111111111111110 & 3670016) | (i311111111111111111111 & 29360128) | (i311111111111111111111 & 234881024) | (i311111111111111111111 & 1879048192), i311111111111111111112, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var311111116;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var311111115;
                    ne1Var29 = ne1Var17;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11111116 = ov3.b;
                            is2Var = new is2(f11111116, f11111116, f11111116, f11111116);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11111117 = ov3.b;
                            is2Var = new is2(f11111117, f11111117, f11111117, f11111117);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i311111111111111111113 = i4 << 3;
                    int i311111111111111111114 = i4 >> 3;
                    int i311111111111111111115 = i4 >> 9;
                    int i311111111111111111116 = i30 << 21;
                    int i311111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111111115 & 7168) | (i311111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var311111117 = ne1Var13;
                    ne1 ne1Var311111118 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111117, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311111118, kk0Var, (i311111111111111111113 & 896) | (i311111111111111111113 & 112) | 6 | (i311111111111111111114 & 7168) | (i311111111111111111115 & 57344) | (i311111111111111111115 & 458752) | (i311111111111111111115 & 3670016) | (i311111111111111111116 & 29360128) | (i311111111111111111116 & 234881024) | (i311111111111111111116 & 1879048192), i311111111111111111117, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var311111118;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var311111117;
                    ne1Var29 = ne1Var17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                }
            }
            i4 |= 24576;
            if ((i3 & 32) != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var2.h(uq1Var)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                i4 |= 1572864;
                z5 = z3;
            } else {
                z5 = z3;
                if ((i & 1572864) == 0) {
                    if (kk0Var2.i(z5)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & Uuid.SIZE_BITS;
            if (i15 != 0) {
                i4 |= 12582912;
                ne1Var10 = ne1Var2;
            } else {
                ne1Var10 = ne1Var2;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.j(ne1Var10)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i4 |= i16;
                }
            }
            i17 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i17 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var2.j(ne1Var3)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i4 |= i18;
            }
            i19 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i19 != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(ne1Var4)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i4 |= i20;
                }
                i21 = i3 & 1024;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var2.j(ne1Var5)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                i24 = i3 & 2048;
                if (i24 != 0) {
                    i22 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.j(ne1Var6)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i22 |= i25;
                }
                i26 = i22;
                i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                if (i27 != 0) {
                    i28 = i26 | 384;
                } else if ((i2 & 384) == 0) {
                    if (!kk0Var2.j(ne1Var7)) {
                        i6 = Uuid.SIZE_BITS;
                    }
                    i28 = i26 | i6;
                } else {
                    i28 = i26;
                }
                i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                if (i29 != 0) {
                    i30 = i28;
                    if ((i2 & 3072) == 0) {
                        i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i10 = 16384;
                        }
                        i30 |= i10;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    i31 = i3 & 65536;
                    if (i31 != 0) {
                        i30 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                    }
                    if ((i3 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11111118 = ov3.b;
                                is2Var = new is2(f11111118, f11111118, f11111118, f11111118);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f11111119 = ov3.b;
                                is2Var = new is2(f11111119, f11111119, f11111119, f11111119);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i311111111111111111118 = i4 << 3;
                        int i311111111111111111119 = i4 >> 3;
                        int i3111111111111111111110 = i4 >> 9;
                        int i3111111111111111111111 = i30 << 21;
                        int i3111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111111111110 & 7168) | (i311111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var311111119 = ne1Var13;
                        ne1 ne1Var3111111110 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111119, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111111110, kk0Var, (i311111111111111111118 & 896) | (i311111111111111111118 & 112) | 6 | (i311111111111111111119 & 7168) | (i3111111111111111111110 & 57344) | (i3111111111111111111110 & 458752) | (i3111111111111111111110 & 3670016) | (i3111111111111111111111 & 29360128) | (i3111111111111111111111 & 234881024) | (i3111111111111111111111 & 1879048192), i3111111111111111111112, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var3111111110;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var311111119;
                        ne1Var29 = ne1Var17;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f111111110 = ov3.b;
                                is2Var = new is2(f111111110, f111111110, f111111110, f111111110);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f111111111 = ov3.b;
                                is2Var = new is2(f111111111, f111111111, f111111111, f111111111);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i3111111111111111111113 = i4 << 3;
                        int i3111111111111111111114 = i4 >> 3;
                        int i3111111111111111111115 = i4 >> 9;
                        int i3111111111111111111116 = i30 << 21;
                        int i3111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111111111115 & 7168) | (i3111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var3111111111 = ne1Var13;
                        ne1 ne1Var3111111112 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111111112, kk0Var, (i3111111111111111111113 & 896) | (i3111111111111111111113 & 112) | 6 | (i3111111111111111111114 & 7168) | (i3111111111111111111115 & 57344) | (i3111111111111111111115 & 458752) | (i3111111111111111111115 & 3670016) | (i3111111111111111111116 & 29360128) | (i3111111111111111111116 & 234881024) | (i3111111111111111111116 & 1879048192), i3111111111111111111117, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var3111111112;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var3111111111;
                        ne1Var29 = ne1Var17;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                    }
                }
                i30 = i28 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i30 |= i10;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                i31 = i3 & 65536;
                if (i31 != 0) {
                    i30 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                }
                if ((i3 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111112 = ov3.b;
                            is2Var = new is2(f111111112, f111111112, f111111112, f111111112);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111113 = ov3.b;
                            is2Var = new is2(f111111113, f111111113, f111111113, f111111113);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i3111111111111111111118 = i4 << 3;
                    int i3111111111111111111119 = i4 >> 3;
                    int i31111111111111111111110 = i4 >> 9;
                    int i31111111111111111111111 = i30 << 21;
                    int i31111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111111111110 & 7168) | (i3111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3111111113 = ne1Var13;
                    ne1 ne1Var3111111114 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111111114, kk0Var, (i3111111111111111111118 & 896) | (i3111111111111111111118 & 112) | 6 | (i3111111111111111111119 & 7168) | (i31111111111111111111110 & 57344) | (i31111111111111111111110 & 458752) | (i31111111111111111111110 & 3670016) | (i31111111111111111111111 & 29360128) | (i31111111111111111111111 & 234881024) | (i31111111111111111111111 & 1879048192), i31111111111111111111112, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var3111111114;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3111111113;
                    ne1Var29 = ne1Var17;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111114 = ov3.b;
                            is2Var = new is2(f111111114, f111111114, f111111114, f111111114);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111115 = ov3.b;
                            is2Var = new is2(f111111115, f111111115, f111111115, f111111115);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i31111111111111111111113 = i4 << 3;
                    int i31111111111111111111114 = i4 >> 3;
                    int i31111111111111111111115 = i4 >> 9;
                    int i31111111111111111111116 = i30 << 21;
                    int i31111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111111111115 & 7168) | (i31111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3111111115 = ne1Var13;
                    ne1 ne1Var3111111116 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111111116, kk0Var, (i31111111111111111111113 & 896) | (i31111111111111111111113 & 112) | 6 | (i31111111111111111111114 & 7168) | (i31111111111111111111115 & 57344) | (i31111111111111111111115 & 458752) | (i31111111111111111111115 & 3670016) | (i31111111111111111111116 & 29360128) | (i31111111111111111111116 & 234881024) | (i31111111111111111111116 & 1879048192), i31111111111111111111117, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var3111111116;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3111111115;
                    ne1Var29 = ne1Var17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                }
            }
            i4 |= 805306368;
            i21 = i3 & 1024;
            if (i21 != 0) {
                i22 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (kk0Var2.j(ne1Var5)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i2 | i23;
            } else {
                i22 = i2;
            }
            i24 = i3 & 2048;
            if (i24 != 0) {
                i22 |= 48;
            } else if ((i2 & 48) != 0) {
                if (kk0Var2.j(ne1Var6)) {
                    i25 = 32;
                } else {
                    i25 = 16;
                }
                i22 |= i25;
            }
            i26 = i22;
            i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
            if (i27 != 0) {
                i28 = i26 | 384;
            } else if ((i2 & 384) == 0) {
                if (!kk0Var2.j(ne1Var7)) {
                    i6 = Uuid.SIZE_BITS;
                }
                i28 = i26 | i6;
            } else {
                i28 = i26;
            }
            i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
            if (i29 != 0) {
                i30 = i28;
                if ((i2 & 3072) == 0) {
                    i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i30 |= i10;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                i31 = i3 & 65536;
                if (i31 != 0) {
                    i30 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                }
                if ((i3 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111116 = ov3.b;
                            is2Var = new is2(f111111116, f111111116, f111111116, f111111116);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111117 = ov3.b;
                            is2Var = new is2(f111111117, f111111117, f111111117, f111111117);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i31111111111111111111118 = i4 << 3;
                    int i31111111111111111111119 = i4 >> 3;
                    int i311111111111111111111110 = i4 >> 9;
                    int i311111111111111111111111 = i30 << 21;
                    int i311111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111111111110 & 7168) | (i31111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3111111117 = ne1Var13;
                    ne1 ne1Var3111111118 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111117, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111111118, kk0Var, (i31111111111111111111118 & 896) | (i31111111111111111111118 & 112) | 6 | (i31111111111111111111119 & 7168) | (i311111111111111111111110 & 57344) | (i311111111111111111111110 & 458752) | (i311111111111111111111110 & 3670016) | (i311111111111111111111111 & 29360128) | (i311111111111111111111111 & 234881024) | (i311111111111111111111111 & 1879048192), i311111111111111111111112, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var3111111118;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3111111117;
                    ne1Var29 = ne1Var17;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111118 = ov3.b;
                            is2Var = new is2(f111111118, f111111118, f111111118, f111111118);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111119 = ov3.b;
                            is2Var = new is2(f111111119, f111111119, f111111119, f111111119);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i311111111111111111111113 = i4 << 3;
                    int i311111111111111111111114 = i4 >> 3;
                    int i311111111111111111111115 = i4 >> 9;
                    int i311111111111111111111116 = i30 << 21;
                    int i311111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111111111115 & 7168) | (i311111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3111111119 = ne1Var13;
                    ne1 ne1Var31111111110 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111119, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111111110, kk0Var, (i311111111111111111111113 & 896) | (i311111111111111111111113 & 112) | 6 | (i311111111111111111111114 & 7168) | (i311111111111111111111115 & 57344) | (i311111111111111111111115 & 458752) | (i311111111111111111111115 & 3670016) | (i311111111111111111111116 & 29360128) | (i311111111111111111111116 & 234881024) | (i311111111111111111111116 & 1879048192), i311111111111111111111117, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var31111111110;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3111111119;
                    ne1Var29 = ne1Var17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                }
            }
            i30 = i28 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i10 = 16384;
                }
                i30 |= i10;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i32 = 65536;
                } else {
                    i32 = 65536;
                }
                i30 |= i32;
            }
            i31 = i3 & 65536;
            if (i31 != 0) {
                i30 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
            }
            if ((i3 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
            }
            if ((i4 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f1111111110 = ov3.b;
                        is2Var = new is2(f1111111110, f1111111110, f1111111110, f1111111110);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                } else {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f1111111111 = ov3.b;
                        is2Var = new is2(f1111111111, f1111111111, f1111111111, f1111111111);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                }
                kk0Var2.s();
                int i311111111111111111111118 = i4 << 3;
                int i311111111111111111111119 = i4 >> 3;
                int i3111111111111111111111110 = i4 >> 9;
                int i3111111111111111111111111 = i30 << 21;
                int i3111111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111111111111110 & 7168) | (i311111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                kk0Var = kk0Var2;
                ne1 ne1Var31111111111 = ne1Var13;
                ne1 ne1Var31111111112 = ne1VarRememberComposableLambda;
                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111111111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111111112, kk0Var, (i311111111111111111111118 & 896) | (i311111111111111111111118 & 112) | 6 | (i311111111111111111111119 & 7168) | (i3111111111111111111111110 & 57344) | (i3111111111111111111111110 & 458752) | (i3111111111111111111111110 & 3670016) | (i3111111111111111111111111 & 29360128) | (i3111111111111111111111111 & 234881024) | (i3111111111111111111111111 & 1879048192), i3111111111111111111111112, 0);
                ne1Var22 = ne1Var19;
                ne1Var23 = ne1Var18;
                bu3Var3 = bu3Var2;
                ne1Var24 = ne1Var31111111112;
                ne1Var25 = ne1Var16;
                ne1Var26 = ne1Var21;
                z5 = z7;
                ne1Var27 = ne1Var20;
                ne1Var28 = ne1Var31111111111;
                ne1Var29 = ne1Var17;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f1111111112 = ov3.b;
                        is2Var = new is2(f1111111112, f1111111112, f1111111112, f1111111112);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                } else {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f1111111113 = ov3.b;
                        is2Var = new is2(f1111111113, f1111111113, f1111111113, f1111111113);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                }
                kk0Var2.s();
                int i3111111111111111111111113 = i4 << 3;
                int i3111111111111111111111114 = i4 >> 3;
                int i3111111111111111111111115 = i4 >> 9;
                int i3111111111111111111111116 = i30 << 21;
                int i3111111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111111111111115 & 7168) | (i3111111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                kk0Var = kk0Var2;
                ne1 ne1Var31111111113 = ne1Var13;
                ne1 ne1Var31111111114 = ne1VarRememberComposableLambda;
                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111111113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111111114, kk0Var, (i3111111111111111111111113 & 896) | (i3111111111111111111111113 & 112) | 6 | (i3111111111111111111111114 & 7168) | (i3111111111111111111111115 & 57344) | (i3111111111111111111111115 & 458752) | (i3111111111111111111111115 & 3670016) | (i3111111111111111111111116 & 29360128) | (i3111111111111111111111116 & 234881024) | (i3111111111111111111111116 & 1879048192), i3111111111111111111111117, 0);
                ne1Var22 = ne1Var19;
                ne1Var23 = ne1Var18;
                bu3Var3 = bu3Var2;
                ne1Var24 = ne1Var31111111114;
                ne1Var25 = ne1Var16;
                ne1Var26 = ne1Var21;
                z5 = z7;
                ne1Var27 = ne1Var20;
                ne1Var28 = ne1Var31111111113;
                ne1Var29 = ne1Var17;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
            }
        }
        i4 |= 3072;
        z4 = z2;
        i9 = i3 & 16;
        i10 = ConstantsKt.DEFAULT_BUFFER_SIZE;
        if (i9 != 0) {
            if ((i & 24576) == 0) {
                if (kk0Var2.h(de4Var)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i4 |= i11;
            }
            if ((i3 & 32) != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (kk0Var2.h(uq1Var)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                i4 |= 1572864;
                z5 = z3;
            } else {
                z5 = z3;
                if ((i & 1572864) == 0) {
                    if (kk0Var2.i(z5)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & Uuid.SIZE_BITS;
            if (i15 != 0) {
                i4 |= 12582912;
                ne1Var10 = ne1Var2;
            } else {
                ne1Var10 = ne1Var2;
                if ((i & 12582912) == 0) {
                    if (kk0Var2.j(ne1Var10)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i4 |= i16;
                }
            }
            i17 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i17 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var2.j(ne1Var3)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i4 |= i18;
            }
            i19 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i19 != 0) {
                if ((i & 805306368) == 0) {
                    if (kk0Var2.j(ne1Var4)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i4 |= i20;
                }
                i21 = i3 & 1024;
                if (i21 != 0) {
                    i22 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (kk0Var2.j(ne1Var5)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i2 | i23;
                } else {
                    i22 = i2;
                }
                i24 = i3 & 2048;
                if (i24 != 0) {
                    i22 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (kk0Var2.j(ne1Var6)) {
                        i25 = 32;
                    } else {
                        i25 = 16;
                    }
                    i22 |= i25;
                }
                i26 = i22;
                i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
                if (i27 != 0) {
                    i28 = i26 | 384;
                } else if ((i2 & 384) == 0) {
                    if (!kk0Var2.j(ne1Var7)) {
                        i6 = Uuid.SIZE_BITS;
                    }
                    i28 = i26 | i6;
                } else {
                    i28 = i26;
                }
                i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
                if (i29 != 0) {
                    i30 = i28;
                    if ((i2 & 3072) == 0) {
                        i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i10 = 16384;
                        }
                        i30 |= i10;
                    }
                    if ((i2 & 196608) != 0) {
                        if ((i3 & 32768) == 0) {
                            i32 = 65536;
                        } else {
                            i32 = 65536;
                        }
                        i30 |= i32;
                    }
                    i31 = i3 & 65536;
                    if (i31 != 0) {
                        i30 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                    }
                    if ((i3 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1111111114 = ov3.b;
                                is2Var = new is2(f1111111114, f1111111114, f1111111114, f1111111114);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1111111115 = ov3.b;
                                is2Var = new is2(f1111111115, f1111111115, f1111111115, f1111111115);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i3111111111111111111111118 = i4 << 3;
                        int i3111111111111111111111119 = i4 >> 3;
                        int i31111111111111111111111110 = i4 >> 9;
                        int i31111111111111111111111111 = i30 << 21;
                        int i31111111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111111111111110 & 7168) | (i3111111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var31111111115 = ne1Var13;
                        ne1 ne1Var31111111116 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111111115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111111116, kk0Var, (i3111111111111111111111118 & 896) | (i3111111111111111111111118 & 112) | 6 | (i3111111111111111111111119 & 7168) | (i31111111111111111111111110 & 57344) | (i31111111111111111111111110 & 458752) | (i31111111111111111111111110 & 3670016) | (i31111111111111111111111111 & 29360128) | (i31111111111111111111111111 & 234881024) | (i31111111111111111111111111 & 1879048192), i31111111111111111111111112, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var31111111116;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var31111111115;
                        ne1Var29 = ne1Var17;
                    } else {
                        kk0Var2.X();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1111111116 = ov3.b;
                                is2Var = new is2(f1111111116, f1111111116, f1111111116, f1111111116);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        } else {
                            if (i13 != 0) {
                                z6 = false;
                            } else {
                                z6 = z5;
                            }
                            if (i15 != 0) {
                                ne1Var10 = null;
                            }
                            if (i17 != 0) {
                                ne1Var11 = null;
                            } else {
                                ne1Var11 = ne1Var3;
                            }
                            if (i19 != 0) {
                                ne1Var12 = null;
                            } else {
                                ne1Var12 = ne1Var4;
                            }
                            if (i21 != 0) {
                                ne1Var13 = null;
                            } else {
                                ne1Var13 = ne1Var5;
                            }
                            if (i24 != 0) {
                                ne1Var14 = null;
                            } else {
                                ne1Var14 = ne1Var6;
                            }
                            if (i27 != 0) {
                                ne1Var15 = null;
                            } else {
                                ne1Var15 = ne1Var7;
                            }
                            if (i29 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                                i30 &= -57345;
                            } else {
                                bu3VarColors = bu3Var;
                            }
                            if ((i3 & 32768) != 0) {
                                float f1111111117 = ov3.b;
                                is2Var = new is2(f1111111117, f1111111117, f1111111117, f1111111117);
                                i30 &= -458753;
                            } else {
                                is2Var = hs2Var;
                            }
                            if (i31 != 0) {
                                ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                            } else {
                                ne1VarRememberComposableLambda = ne1Var9;
                            }
                            bu3Var2 = bu3VarColors;
                            ne1Var16 = ne1Var11;
                            ne1Var17 = ne1Var10;
                            ne1Var18 = ne1Var15;
                            ne1Var19 = ne1Var14;
                            ne1Var20 = ne1Var30;
                            ne1Var21 = ne1Var12;
                            z7 = z6;
                            hs2Var2 = is2Var;
                        }
                        kk0Var2.s();
                        int i31111111111111111111111113 = i4 << 3;
                        int i31111111111111111111111114 = i4 >> 3;
                        int i31111111111111111111111115 = i4 >> 9;
                        int i31111111111111111111111116 = i30 << 21;
                        int i31111111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111111111111115 & 7168) | (i31111111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                        kk0Var = kk0Var2;
                        ne1 ne1Var31111111117 = ne1Var13;
                        ne1 ne1Var31111111118 = ne1VarRememberComposableLambda;
                        ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111111117, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111111118, kk0Var, (i31111111111111111111111113 & 896) | (i31111111111111111111111113 & 112) | 6 | (i31111111111111111111111114 & 7168) | (i31111111111111111111111115 & 57344) | (i31111111111111111111111115 & 458752) | (i31111111111111111111111115 & 3670016) | (i31111111111111111111111116 & 29360128) | (i31111111111111111111111116 & 234881024) | (i31111111111111111111111116 & 1879048192), i31111111111111111111111117, 0);
                        ne1Var22 = ne1Var19;
                        ne1Var23 = ne1Var18;
                        bu3Var3 = bu3Var2;
                        ne1Var24 = ne1Var31111111118;
                        ne1Var25 = ne1Var16;
                        ne1Var26 = ne1Var21;
                        z5 = z7;
                        ne1Var27 = ne1Var20;
                        ne1Var28 = ne1Var31111111117;
                        ne1Var29 = ne1Var17;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                    }
                }
                i30 = i28 | 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i30 |= i10;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                i31 = i3 & 65536;
                if (i31 != 0) {
                    i30 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                }
                if ((i3 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f1111111118 = ov3.b;
                            is2Var = new is2(f1111111118, f1111111118, f1111111118, f1111111118);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f1111111119 = ov3.b;
                            is2Var = new is2(f1111111119, f1111111119, f1111111119, f1111111119);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i31111111111111111111111118 = i4 << 3;
                    int i31111111111111111111111119 = i4 >> 3;
                    int i311111111111111111111111110 = i4 >> 9;
                    int i311111111111111111111111111 = i30 << 21;
                    int i311111111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111111111111110 & 7168) | (i31111111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var31111111119 = ne1Var13;
                    ne1 ne1Var311111111110 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111111119, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311111111110, kk0Var, (i31111111111111111111111118 & 896) | (i31111111111111111111111118 & 112) | 6 | (i31111111111111111111111119 & 7168) | (i311111111111111111111111110 & 57344) | (i311111111111111111111111110 & 458752) | (i311111111111111111111111110 & 3670016) | (i311111111111111111111111111 & 29360128) | (i311111111111111111111111111 & 234881024) | (i311111111111111111111111111 & 1879048192), i311111111111111111111111112, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var311111111110;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var31111111119;
                    ne1Var29 = ne1Var17;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11111111110 = ov3.b;
                            is2Var = new is2(f11111111110, f11111111110, f11111111110, f11111111110);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11111111111 = ov3.b;
                            is2Var = new is2(f11111111111, f11111111111, f11111111111, f11111111111);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i311111111111111111111111113 = i4 << 3;
                    int i311111111111111111111111114 = i4 >> 3;
                    int i311111111111111111111111115 = i4 >> 9;
                    int i311111111111111111111111116 = i30 << 21;
                    int i311111111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111111111111115 & 7168) | (i311111111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var311111111111 = ne1Var13;
                    ne1 ne1Var311111111112 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111111111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311111111112, kk0Var, (i311111111111111111111111113 & 896) | (i311111111111111111111111113 & 112) | 6 | (i311111111111111111111111114 & 7168) | (i311111111111111111111111115 & 57344) | (i311111111111111111111111115 & 458752) | (i311111111111111111111111115 & 3670016) | (i311111111111111111111111116 & 29360128) | (i311111111111111111111111116 & 234881024) | (i311111111111111111111111116 & 1879048192), i311111111111111111111111117, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var311111111112;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var311111111111;
                    ne1Var29 = ne1Var17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                }
            }
            i4 |= 805306368;
            i21 = i3 & 1024;
            if (i21 != 0) {
                i22 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (kk0Var2.j(ne1Var5)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i2 | i23;
            } else {
                i22 = i2;
            }
            i24 = i3 & 2048;
            if (i24 != 0) {
                i22 |= 48;
            } else if ((i2 & 48) != 0) {
                if (kk0Var2.j(ne1Var6)) {
                    i25 = 32;
                } else {
                    i25 = 16;
                }
                i22 |= i25;
            }
            i26 = i22;
            i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
            if (i27 != 0) {
                i28 = i26 | 384;
            } else if ((i2 & 384) == 0) {
                if (!kk0Var2.j(ne1Var7)) {
                    i6 = Uuid.SIZE_BITS;
                }
                i28 = i26 | i6;
            } else {
                i28 = i26;
            }
            i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
            if (i29 != 0) {
                i30 = i28;
                if ((i2 & 3072) == 0) {
                    i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i30 |= i10;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                i31 = i3 & 65536;
                if (i31 != 0) {
                    i30 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                }
                if ((i3 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11111111112 = ov3.b;
                            is2Var = new is2(f11111111112, f11111111112, f11111111112, f11111111112);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11111111113 = ov3.b;
                            is2Var = new is2(f11111111113, f11111111113, f11111111113, f11111111113);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i311111111111111111111111118 = i4 << 3;
                    int i311111111111111111111111119 = i4 >> 3;
                    int i3111111111111111111111111110 = i4 >> 9;
                    int i3111111111111111111111111111 = i30 << 21;
                    int i3111111111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111111111111111110 & 7168) | (i311111111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var311111111113 = ne1Var13;
                    ne1 ne1Var311111111114 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111111113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311111111114, kk0Var, (i311111111111111111111111118 & 896) | (i311111111111111111111111118 & 112) | 6 | (i311111111111111111111111119 & 7168) | (i3111111111111111111111111110 & 57344) | (i3111111111111111111111111110 & 458752) | (i3111111111111111111111111110 & 3670016) | (i3111111111111111111111111111 & 29360128) | (i3111111111111111111111111111 & 234881024) | (i3111111111111111111111111111 & 1879048192), i3111111111111111111111111112, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var311111111114;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var311111111113;
                    ne1Var29 = ne1Var17;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11111111114 = ov3.b;
                            is2Var = new is2(f11111111114, f11111111114, f11111111114, f11111111114);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f11111111115 = ov3.b;
                            is2Var = new is2(f11111111115, f11111111115, f11111111115, f11111111115);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i3111111111111111111111111113 = i4 << 3;
                    int i3111111111111111111111111114 = i4 >> 3;
                    int i3111111111111111111111111115 = i4 >> 9;
                    int i3111111111111111111111111116 = i30 << 21;
                    int i3111111111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111111111111111115 & 7168) | (i3111111111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var311111111115 = ne1Var13;
                    ne1 ne1Var311111111116 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111111115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311111111116, kk0Var, (i3111111111111111111111111113 & 896) | (i3111111111111111111111111113 & 112) | 6 | (i3111111111111111111111111114 & 7168) | (i3111111111111111111111111115 & 57344) | (i3111111111111111111111111115 & 458752) | (i3111111111111111111111111115 & 3670016) | (i3111111111111111111111111116 & 29360128) | (i3111111111111111111111111116 & 234881024) | (i3111111111111111111111111116 & 1879048192), i3111111111111111111111111117, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var311111111116;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var311111111115;
                    ne1Var29 = ne1Var17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                }
            }
            i30 = i28 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i10 = 16384;
                }
                i30 |= i10;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i32 = 65536;
                } else {
                    i32 = 65536;
                }
                i30 |= i32;
            }
            i31 = i3 & 65536;
            if (i31 != 0) {
                i30 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
            }
            if ((i3 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
            }
            if ((i4 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f11111111116 = ov3.b;
                        is2Var = new is2(f11111111116, f11111111116, f11111111116, f11111111116);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                } else {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f11111111117 = ov3.b;
                        is2Var = new is2(f11111111117, f11111111117, f11111111117, f11111111117);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                }
                kk0Var2.s();
                int i3111111111111111111111111118 = i4 << 3;
                int i3111111111111111111111111119 = i4 >> 3;
                int i31111111111111111111111111110 = i4 >> 9;
                int i31111111111111111111111111111 = i30 << 21;
                int i31111111111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111111111111111110 & 7168) | (i3111111111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                kk0Var = kk0Var2;
                ne1 ne1Var311111111117 = ne1Var13;
                ne1 ne1Var311111111118 = ne1VarRememberComposableLambda;
                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111111117, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var311111111118, kk0Var, (i3111111111111111111111111118 & 896) | (i3111111111111111111111111118 & 112) | 6 | (i3111111111111111111111111119 & 7168) | (i31111111111111111111111111110 & 57344) | (i31111111111111111111111111110 & 458752) | (i31111111111111111111111111110 & 3670016) | (i31111111111111111111111111111 & 29360128) | (i31111111111111111111111111111 & 234881024) | (i31111111111111111111111111111 & 1879048192), i31111111111111111111111111112, 0);
                ne1Var22 = ne1Var19;
                ne1Var23 = ne1Var18;
                bu3Var3 = bu3Var2;
                ne1Var24 = ne1Var311111111118;
                ne1Var25 = ne1Var16;
                ne1Var26 = ne1Var21;
                z5 = z7;
                ne1Var27 = ne1Var20;
                ne1Var28 = ne1Var311111111117;
                ne1Var29 = ne1Var17;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f11111111118 = ov3.b;
                        is2Var = new is2(f11111111118, f11111111118, f11111111118, f11111111118);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                } else {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f11111111119 = ov3.b;
                        is2Var = new is2(f11111111119, f11111111119, f11111111119, f11111111119);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                }
                kk0Var2.s();
                int i31111111111111111111111111113 = i4 << 3;
                int i31111111111111111111111111114 = i4 >> 3;
                int i31111111111111111111111111115 = i4 >> 9;
                int i31111111111111111111111111116 = i30 << 21;
                int i31111111111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111111111111111115 & 7168) | (i31111111111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                kk0Var = kk0Var2;
                ne1 ne1Var311111111119 = ne1Var13;
                ne1 ne1Var3111111111110 = ne1VarRememberComposableLambda;
                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var311111111119, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111111111110, kk0Var, (i31111111111111111111111111113 & 896) | (i31111111111111111111111111113 & 112) | 6 | (i31111111111111111111111111114 & 7168) | (i31111111111111111111111111115 & 57344) | (i31111111111111111111111111115 & 458752) | (i31111111111111111111111111115 & 3670016) | (i31111111111111111111111111116 & 29360128) | (i31111111111111111111111111116 & 234881024) | (i31111111111111111111111111116 & 1879048192), i31111111111111111111111111117, 0);
                ne1Var22 = ne1Var19;
                ne1Var23 = ne1Var18;
                bu3Var3 = bu3Var2;
                ne1Var24 = ne1Var3111111111110;
                ne1Var25 = ne1Var16;
                ne1Var26 = ne1Var21;
                z5 = z7;
                ne1Var27 = ne1Var20;
                ne1Var28 = ne1Var311111111119;
                ne1Var29 = ne1Var17;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
            }
        }
        i4 |= 24576;
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (kk0Var2.h(uq1Var)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i4 |= i12;
        }
        i13 = i3 & 64;
        if (i13 != 0) {
            i4 |= 1572864;
            z5 = z3;
        } else {
            z5 = z3;
            if ((i & 1572864) == 0) {
                if (kk0Var2.i(z5)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
        }
        i15 = i3 & Uuid.SIZE_BITS;
        if (i15 != 0) {
            i4 |= 12582912;
            ne1Var10 = ne1Var2;
        } else {
            ne1Var10 = ne1Var2;
            if ((i & 12582912) == 0) {
                if (kk0Var2.j(ne1Var10)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i4 |= i16;
            }
        }
        i17 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
        if (i17 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (kk0Var2.j(ne1Var3)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i4 |= i18;
        }
        i19 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i19 != 0) {
            if ((i & 805306368) == 0) {
                if (kk0Var2.j(ne1Var4)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i4 |= i20;
            }
            i21 = i3 & 1024;
            if (i21 != 0) {
                i22 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (kk0Var2.j(ne1Var5)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i2 | i23;
            } else {
                i22 = i2;
            }
            i24 = i3 & 2048;
            if (i24 != 0) {
                i22 |= 48;
            } else if ((i2 & 48) != 0) {
                if (kk0Var2.j(ne1Var6)) {
                    i25 = 32;
                } else {
                    i25 = 16;
                }
                i22 |= i25;
            }
            i26 = i22;
            i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
            if (i27 != 0) {
                i28 = i26 | 384;
            } else if ((i2 & 384) == 0) {
                if (!kk0Var2.j(ne1Var7)) {
                    i6 = Uuid.SIZE_BITS;
                }
                i28 = i26 | i6;
            } else {
                i28 = i26;
            }
            i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
            if (i29 != 0) {
                i30 = i28;
                if ((i2 & 3072) == 0) {
                    i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i30 |= i10;
                }
                if ((i2 & 196608) != 0) {
                    if ((i3 & 32768) == 0) {
                        i32 = 65536;
                    } else {
                        i32 = 65536;
                    }
                    i30 |= i32;
                }
                i31 = i3 & 65536;
                if (i31 != 0) {
                    i30 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
                }
                if ((i3 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
                }
                if ((i4 & 306783379) != 306783378) {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111111110 = ov3.b;
                            is2Var = new is2(f111111111110, f111111111110, f111111111110, f111111111110);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111111111 = ov3.b;
                            is2Var = new is2(f111111111111, f111111111111, f111111111111, f111111111111);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i31111111111111111111111111118 = i4 << 3;
                    int i31111111111111111111111111119 = i4 >> 3;
                    int i311111111111111111111111111110 = i4 >> 9;
                    int i311111111111111111111111111111 = i30 << 21;
                    int i311111111111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111111111111111110 & 7168) | (i31111111111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3111111111111 = ne1Var13;
                    ne1 ne1Var3111111111112 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111111111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111111111112, kk0Var, (i31111111111111111111111111118 & 896) | (i31111111111111111111111111118 & 112) | 6 | (i31111111111111111111111111119 & 7168) | (i311111111111111111111111111110 & 57344) | (i311111111111111111111111111110 & 458752) | (i311111111111111111111111111110 & 3670016) | (i311111111111111111111111111111 & 29360128) | (i311111111111111111111111111111 & 234881024) | (i311111111111111111111111111111 & 1879048192), i311111111111111111111111111112, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var3111111111112;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3111111111111;
                    ne1Var29 = ne1Var17;
                } else {
                    kk0Var2.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111111112 = ov3.b;
                            is2Var = new is2(f111111111112, f111111111112, f111111111112, f111111111112);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    } else {
                        if (i13 != 0) {
                            z6 = false;
                        } else {
                            z6 = z5;
                        }
                        if (i15 != 0) {
                            ne1Var10 = null;
                        }
                        if (i17 != 0) {
                            ne1Var11 = null;
                        } else {
                            ne1Var11 = ne1Var3;
                        }
                        if (i19 != 0) {
                            ne1Var12 = null;
                        } else {
                            ne1Var12 = ne1Var4;
                        }
                        if (i21 != 0) {
                            ne1Var13 = null;
                        } else {
                            ne1Var13 = ne1Var5;
                        }
                        if (i24 != 0) {
                            ne1Var14 = null;
                        } else {
                            ne1Var14 = ne1Var6;
                        }
                        if (i27 != 0) {
                            ne1Var15 = null;
                        } else {
                            ne1Var15 = ne1Var7;
                        }
                        if (i29 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                            i30 &= -57345;
                        } else {
                            bu3VarColors = bu3Var;
                        }
                        if ((i3 & 32768) != 0) {
                            float f111111111113 = ov3.b;
                            is2Var = new is2(f111111111113, f111111111113, f111111111113, f111111111113);
                            i30 &= -458753;
                        } else {
                            is2Var = hs2Var;
                        }
                        if (i31 != 0) {
                            ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                        } else {
                            ne1VarRememberComposableLambda = ne1Var9;
                        }
                        bu3Var2 = bu3VarColors;
                        ne1Var16 = ne1Var11;
                        ne1Var17 = ne1Var10;
                        ne1Var18 = ne1Var15;
                        ne1Var19 = ne1Var14;
                        ne1Var20 = ne1Var30;
                        ne1Var21 = ne1Var12;
                        z7 = z6;
                        hs2Var2 = is2Var;
                    }
                    kk0Var2.s();
                    int i311111111111111111111111111113 = i4 << 3;
                    int i311111111111111111111111111114 = i4 >> 3;
                    int i311111111111111111111111111115 = i4 >> 9;
                    int i311111111111111111111111111116 = i30 << 21;
                    int i311111111111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111111111111111115 & 7168) | (i311111111111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                    kk0Var = kk0Var2;
                    ne1 ne1Var3111111111113 = ne1Var13;
                    ne1 ne1Var3111111111114 = ne1VarRememberComposableLambda;
                    ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111111113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111111111114, kk0Var, (i311111111111111111111111111113 & 896) | (i311111111111111111111111111113 & 112) | 6 | (i311111111111111111111111111114 & 7168) | (i311111111111111111111111111115 & 57344) | (i311111111111111111111111111115 & 458752) | (i311111111111111111111111111115 & 3670016) | (i311111111111111111111111111116 & 29360128) | (i311111111111111111111111111116 & 234881024) | (i311111111111111111111111111116 & 1879048192), i311111111111111111111111111117, 0);
                    ne1Var22 = ne1Var19;
                    ne1Var23 = ne1Var18;
                    bu3Var3 = bu3Var2;
                    ne1Var24 = ne1Var3111111111114;
                    ne1Var25 = ne1Var16;
                    ne1Var26 = ne1Var21;
                    z5 = z7;
                    ne1Var27 = ne1Var20;
                    ne1Var28 = ne1Var3111111111113;
                    ne1Var29 = ne1Var17;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
                }
            }
            i30 = i28 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i10 = 16384;
                }
                i30 |= i10;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i32 = 65536;
                } else {
                    i32 = 65536;
                }
                i30 |= i32;
            }
            i31 = i3 & 65536;
            if (i31 != 0) {
                i30 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
            }
            if ((i3 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
            }
            if ((i4 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f111111111114 = ov3.b;
                        is2Var = new is2(f111111111114, f111111111114, f111111111114, f111111111114);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                } else {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f111111111115 = ov3.b;
                        is2Var = new is2(f111111111115, f111111111115, f111111111115, f111111111115);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                }
                kk0Var2.s();
                int i311111111111111111111111111118 = i4 << 3;
                int i311111111111111111111111111119 = i4 >> 3;
                int i3111111111111111111111111111110 = i4 >> 9;
                int i3111111111111111111111111111111 = i30 << 21;
                int i3111111111111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111111111111111111110 & 7168) | (i311111111111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                kk0Var = kk0Var2;
                ne1 ne1Var3111111111115 = ne1Var13;
                ne1 ne1Var3111111111116 = ne1VarRememberComposableLambda;
                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111111115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111111111116, kk0Var, (i311111111111111111111111111118 & 896) | (i311111111111111111111111111118 & 112) | 6 | (i311111111111111111111111111119 & 7168) | (i3111111111111111111111111111110 & 57344) | (i3111111111111111111111111111110 & 458752) | (i3111111111111111111111111111110 & 3670016) | (i3111111111111111111111111111111 & 29360128) | (i3111111111111111111111111111111 & 234881024) | (i3111111111111111111111111111111 & 1879048192), i3111111111111111111111111111112, 0);
                ne1Var22 = ne1Var19;
                ne1Var23 = ne1Var18;
                bu3Var3 = bu3Var2;
                ne1Var24 = ne1Var3111111111116;
                ne1Var25 = ne1Var16;
                ne1Var26 = ne1Var21;
                z5 = z7;
                ne1Var27 = ne1Var20;
                ne1Var28 = ne1Var3111111111115;
                ne1Var29 = ne1Var17;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f111111111116 = ov3.b;
                        is2Var = new is2(f111111111116, f111111111116, f111111111116, f111111111116);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                } else {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f111111111117 = ov3.b;
                        is2Var = new is2(f111111111117, f111111111117, f111111111117, f111111111117);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                }
                kk0Var2.s();
                int i3111111111111111111111111111113 = i4 << 3;
                int i3111111111111111111111111111114 = i4 >> 3;
                int i3111111111111111111111111111115 = i4 >> 9;
                int i3111111111111111111111111111116 = i30 << 21;
                int i3111111111111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i3111111111111111111111111111115 & 7168) | (i3111111111111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                kk0Var = kk0Var2;
                ne1 ne1Var3111111111117 = ne1Var13;
                ne1 ne1Var3111111111118 = ne1VarRememberComposableLambda;
                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111111117, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var3111111111118, kk0Var, (i3111111111111111111111111111113 & 896) | (i3111111111111111111111111111113 & 112) | 6 | (i3111111111111111111111111111114 & 7168) | (i3111111111111111111111111111115 & 57344) | (i3111111111111111111111111111115 & 458752) | (i3111111111111111111111111111115 & 3670016) | (i3111111111111111111111111111116 & 29360128) | (i3111111111111111111111111111116 & 234881024) | (i3111111111111111111111111111116 & 1879048192), i3111111111111111111111111111117, 0);
                ne1Var22 = ne1Var19;
                ne1Var23 = ne1Var18;
                bu3Var3 = bu3Var2;
                ne1Var24 = ne1Var3111111111118;
                ne1Var25 = ne1Var16;
                ne1Var26 = ne1Var21;
                z5 = z7;
                ne1Var27 = ne1Var20;
                ne1Var28 = ne1Var3111111111117;
                ne1Var29 = ne1Var17;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
            }
        }
        i4 |= 805306368;
        i21 = i3 & 1024;
        if (i21 != 0) {
            i22 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (kk0Var2.j(ne1Var5)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i22 = i2 | i23;
        } else {
            i22 = i2;
        }
        i24 = i3 & 2048;
        if (i24 != 0) {
            i22 |= 48;
        } else if ((i2 & 48) != 0) {
            if (kk0Var2.j(ne1Var6)) {
                i25 = 32;
            } else {
                i25 = 16;
            }
            i22 |= i25;
        }
        i26 = i22;
        i27 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
        if (i27 != 0) {
            i28 = i26 | 384;
        } else if ((i2 & 384) == 0) {
            if (!kk0Var2.j(ne1Var7)) {
                i6 = Uuid.SIZE_BITS;
            }
            i28 = i26 | i6;
        } else {
            i28 = i26;
        }
        i29 = i3 & ConstantsKt.DEFAULT_BUFFER_SIZE;
        if (i29 != 0) {
            i30 = i28;
            if ((i2 & 3072) == 0) {
                i30 |= kk0Var2.j(ne1Var8) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i10 = 16384;
                }
                i30 |= i10;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32768) == 0) {
                    i32 = 65536;
                } else {
                    i32 = 65536;
                }
                i30 |= i32;
            }
            i31 = i3 & 65536;
            if (i31 != 0) {
                i30 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
            }
            if ((i3 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
            }
            if ((i4 & 306783379) != 306783378) {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f111111111118 = ov3.b;
                        is2Var = new is2(f111111111118, f111111111118, f111111111118, f111111111118);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                } else {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f111111111119 = ov3.b;
                        is2Var = new is2(f111111111119, f111111111119, f111111111119, f111111111119);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                }
                kk0Var2.s();
                int i3111111111111111111111111111118 = i4 << 3;
                int i3111111111111111111111111111119 = i4 >> 3;
                int i31111111111111111111111111111110 = i4 >> 9;
                int i31111111111111111111111111111111 = i30 << 21;
                int i31111111111111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111111111111111111110 & 7168) | (i3111111111111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                kk0Var = kk0Var2;
                ne1 ne1Var3111111111119 = ne1Var13;
                ne1 ne1Var31111111111110 = ne1VarRememberComposableLambda;
                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var3111111111119, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111111111110, kk0Var, (i3111111111111111111111111111118 & 896) | (i3111111111111111111111111111118 & 112) | 6 | (i3111111111111111111111111111119 & 7168) | (i31111111111111111111111111111110 & 57344) | (i31111111111111111111111111111110 & 458752) | (i31111111111111111111111111111110 & 3670016) | (i31111111111111111111111111111111 & 29360128) | (i31111111111111111111111111111111 & 234881024) | (i31111111111111111111111111111111 & 1879048192), i31111111111111111111111111111112, 0);
                ne1Var22 = ne1Var19;
                ne1Var23 = ne1Var18;
                bu3Var3 = bu3Var2;
                ne1Var24 = ne1Var31111111111110;
                ne1Var25 = ne1Var16;
                ne1Var26 = ne1Var21;
                z5 = z7;
                ne1Var27 = ne1Var20;
                ne1Var28 = ne1Var3111111111119;
                ne1Var29 = ne1Var17;
            } else {
                kk0Var2.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f1111111111110 = ov3.b;
                        is2Var = new is2(f1111111111110, f1111111111110, f1111111111110, f1111111111110);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                } else {
                    if (i13 != 0) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    if (i15 != 0) {
                        ne1Var10 = null;
                    }
                    if (i17 != 0) {
                        ne1Var11 = null;
                    } else {
                        ne1Var11 = ne1Var3;
                    }
                    if (i19 != 0) {
                        ne1Var12 = null;
                    } else {
                        ne1Var12 = ne1Var4;
                    }
                    if (i21 != 0) {
                        ne1Var13 = null;
                    } else {
                        ne1Var13 = ne1Var5;
                    }
                    if (i24 != 0) {
                        ne1Var14 = null;
                    } else {
                        ne1Var14 = ne1Var6;
                    }
                    if (i27 != 0) {
                        ne1Var15 = null;
                    } else {
                        ne1Var15 = ne1Var7;
                    }
                    if (i29 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                        i30 &= -57345;
                    } else {
                        bu3VarColors = bu3Var;
                    }
                    if ((i3 & 32768) != 0) {
                        float f1111111111111 = ov3.b;
                        is2Var = new is2(f1111111111111, f1111111111111, f1111111111111, f1111111111111);
                        i30 &= -458753;
                    } else {
                        is2Var = hs2Var;
                    }
                    if (i31 != 0) {
                        ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                    } else {
                        ne1VarRememberComposableLambda = ne1Var9;
                    }
                    bu3Var2 = bu3VarColors;
                    ne1Var16 = ne1Var11;
                    ne1Var17 = ne1Var10;
                    ne1Var18 = ne1Var15;
                    ne1Var19 = ne1Var14;
                    ne1Var20 = ne1Var30;
                    ne1Var21 = ne1Var12;
                    z7 = z6;
                    hs2Var2 = is2Var;
                }
                kk0Var2.s();
                int i31111111111111111111111111111113 = i4 << 3;
                int i31111111111111111111111111111114 = i4 >> 3;
                int i31111111111111111111111111111115 = i4 >> 9;
                int i31111111111111111111111111111116 = i30 << 21;
                int i31111111111111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i31111111111111111111111111111115 & 7168) | (i31111111111111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
                kk0Var = kk0Var2;
                ne1 ne1Var31111111111111 = ne1Var13;
                ne1 ne1Var31111111111112 = ne1VarRememberComposableLambda;
                ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111111111111, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111111111112, kk0Var, (i31111111111111111111111111111113 & 896) | (i31111111111111111111111111111113 & 112) | 6 | (i31111111111111111111111111111114 & 7168) | (i31111111111111111111111111111115 & 57344) | (i31111111111111111111111111111115 & 458752) | (i31111111111111111111111111111115 & 3670016) | (i31111111111111111111111111111116 & 29360128) | (i31111111111111111111111111111116 & 234881024) | (i31111111111111111111111111111116 & 1879048192), i31111111111111111111111111111117, 0);
                ne1Var22 = ne1Var19;
                ne1Var23 = ne1Var18;
                bu3Var3 = bu3Var2;
                ne1Var24 = ne1Var31111111111112;
                ne1Var25 = ne1Var16;
                ne1Var26 = ne1Var21;
                z5 = z7;
                ne1Var27 = ne1Var20;
                ne1Var28 = ne1Var31111111111111;
                ne1Var29 = ne1Var17;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
            }
        }
        i30 = i28 | 3072;
        if ((i2 & 24576) != 0) {
            if ((i3 & 16384) == 0) {
                i10 = 16384;
            }
            i30 |= i10;
        }
        if ((i2 & 196608) != 0) {
            if ((i3 & 32768) == 0) {
                i32 = 65536;
            } else {
                i32 = 65536;
            }
            i30 |= i32;
        }
        i31 = i3 & 65536;
        if (i31 != 0) {
            i30 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i30 |= kk0Var2.j(ne1Var9) ? 1048576 : 524288;
        }
        if ((i3 & 131072) != 0) {
            i30 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i30 |= kk0Var2.h(this) ? 8388608 : 4194304;
        }
        if ((i4 & 306783379) != 306783378) {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    z6 = false;
                } else {
                    z6 = z5;
                }
                if (i15 != 0) {
                    ne1Var10 = null;
                }
                if (i17 != 0) {
                    ne1Var11 = null;
                } else {
                    ne1Var11 = ne1Var3;
                }
                if (i19 != 0) {
                    ne1Var12 = null;
                } else {
                    ne1Var12 = ne1Var4;
                }
                if (i21 != 0) {
                    ne1Var13 = null;
                } else {
                    ne1Var13 = ne1Var5;
                }
                if (i24 != 0) {
                    ne1Var14 = null;
                } else {
                    ne1Var14 = ne1Var6;
                }
                if (i27 != 0) {
                    ne1Var15 = null;
                } else {
                    ne1Var15 = ne1Var7;
                }
                if (i29 == 0) {
                }
                if ((i3 & 16384) != 0) {
                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                    i30 &= -57345;
                } else {
                    bu3VarColors = bu3Var;
                }
                if ((i3 & 32768) != 0) {
                    float f1111111111112 = ov3.b;
                    is2Var = new is2(f1111111111112, f1111111111112, f1111111111112, f1111111111112);
                    i30 &= -458753;
                } else {
                    is2Var = hs2Var;
                }
                if (i31 != 0) {
                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                } else {
                    ne1VarRememberComposableLambda = ne1Var9;
                }
                bu3Var2 = bu3VarColors;
                ne1Var16 = ne1Var11;
                ne1Var17 = ne1Var10;
                ne1Var18 = ne1Var15;
                ne1Var19 = ne1Var14;
                ne1Var20 = ne1Var30;
                ne1Var21 = ne1Var12;
                z7 = z6;
                hs2Var2 = is2Var;
            } else {
                if (i13 != 0) {
                    z6 = false;
                } else {
                    z6 = z5;
                }
                if (i15 != 0) {
                    ne1Var10 = null;
                }
                if (i17 != 0) {
                    ne1Var11 = null;
                } else {
                    ne1Var11 = ne1Var3;
                }
                if (i19 != 0) {
                    ne1Var12 = null;
                } else {
                    ne1Var12 = ne1Var4;
                }
                if (i21 != 0) {
                    ne1Var13 = null;
                } else {
                    ne1Var13 = ne1Var5;
                }
                if (i24 != 0) {
                    ne1Var14 = null;
                } else {
                    ne1Var14 = ne1Var6;
                }
                if (i27 != 0) {
                    ne1Var15 = null;
                } else {
                    ne1Var15 = ne1Var7;
                }
                if (i29 == 0) {
                }
                if ((i3 & 16384) != 0) {
                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                    i30 &= -57345;
                } else {
                    bu3VarColors = bu3Var;
                }
                if ((i3 & 32768) != 0) {
                    float f1111111111113 = ov3.b;
                    is2Var = new is2(f1111111111113, f1111111111113, f1111111111113, f1111111111113);
                    i30 &= -458753;
                } else {
                    is2Var = hs2Var;
                }
                if (i31 != 0) {
                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                } else {
                    ne1VarRememberComposableLambda = ne1Var9;
                }
                bu3Var2 = bu3VarColors;
                ne1Var16 = ne1Var11;
                ne1Var17 = ne1Var10;
                ne1Var18 = ne1Var15;
                ne1Var19 = ne1Var14;
                ne1Var20 = ne1Var30;
                ne1Var21 = ne1Var12;
                z7 = z6;
                hs2Var2 = is2Var;
            }
            kk0Var2.s();
            int i31111111111111111111111111111118 = i4 << 3;
            int i31111111111111111111111111111119 = i4 >> 3;
            int i311111111111111111111111111111110 = i4 >> 9;
            int i311111111111111111111111111111111 = i30 << 21;
            int i311111111111111111111111111111112 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111111111111111111110 & 7168) | (i31111111111111111111111111111119 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
            kk0Var = kk0Var2;
            ne1 ne1Var31111111111113 = ne1Var13;
            ne1 ne1Var31111111111114 = ne1VarRememberComposableLambda;
            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111111111113, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111111111114, kk0Var, (i31111111111111111111111111111118 & 896) | (i31111111111111111111111111111118 & 112) | 6 | (i31111111111111111111111111111119 & 7168) | (i311111111111111111111111111111110 & 57344) | (i311111111111111111111111111111110 & 458752) | (i311111111111111111111111111111110 & 3670016) | (i311111111111111111111111111111111 & 29360128) | (i311111111111111111111111111111111 & 234881024) | (i311111111111111111111111111111111 & 1879048192), i311111111111111111111111111111112, 0);
            ne1Var22 = ne1Var19;
            ne1Var23 = ne1Var18;
            bu3Var3 = bu3Var2;
            ne1Var24 = ne1Var31111111111114;
            ne1Var25 = ne1Var16;
            ne1Var26 = ne1Var21;
            z5 = z7;
            ne1Var27 = ne1Var20;
            ne1Var28 = ne1Var31111111111113;
            ne1Var29 = ne1Var17;
        } else {
            kk0Var2.X();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    z6 = false;
                } else {
                    z6 = z5;
                }
                if (i15 != 0) {
                    ne1Var10 = null;
                }
                if (i17 != 0) {
                    ne1Var11 = null;
                } else {
                    ne1Var11 = ne1Var3;
                }
                if (i19 != 0) {
                    ne1Var12 = null;
                } else {
                    ne1Var12 = ne1Var4;
                }
                if (i21 != 0) {
                    ne1Var13 = null;
                } else {
                    ne1Var13 = ne1Var5;
                }
                if (i24 != 0) {
                    ne1Var14 = null;
                } else {
                    ne1Var14 = ne1Var6;
                }
                if (i27 != 0) {
                    ne1Var15 = null;
                } else {
                    ne1Var15 = ne1Var7;
                }
                if (i29 == 0) {
                }
                if ((i3 & 16384) != 0) {
                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                    i30 &= -57345;
                } else {
                    bu3VarColors = bu3Var;
                }
                if ((i3 & 32768) != 0) {
                    float f1111111111114 = ov3.b;
                    is2Var = new is2(f1111111111114, f1111111111114, f1111111111114, f1111111111114);
                    i30 &= -458753;
                } else {
                    is2Var = hs2Var;
                }
                if (i31 != 0) {
                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                } else {
                    ne1VarRememberComposableLambda = ne1Var9;
                }
                bu3Var2 = bu3VarColors;
                ne1Var16 = ne1Var11;
                ne1Var17 = ne1Var10;
                ne1Var18 = ne1Var15;
                ne1Var19 = ne1Var14;
                ne1Var20 = ne1Var30;
                ne1Var21 = ne1Var12;
                z7 = z6;
                hs2Var2 = is2Var;
            } else {
                if (i13 != 0) {
                    z6 = false;
                } else {
                    z6 = z5;
                }
                if (i15 != 0) {
                    ne1Var10 = null;
                }
                if (i17 != 0) {
                    ne1Var11 = null;
                } else {
                    ne1Var11 = ne1Var3;
                }
                if (i19 != 0) {
                    ne1Var12 = null;
                } else {
                    ne1Var12 = ne1Var4;
                }
                if (i21 != 0) {
                    ne1Var13 = null;
                } else {
                    ne1Var13 = ne1Var5;
                }
                if (i24 != 0) {
                    ne1Var14 = null;
                } else {
                    ne1Var14 = ne1Var6;
                }
                if (i27 != 0) {
                    ne1Var15 = null;
                } else {
                    ne1Var15 = ne1Var7;
                }
                if (i29 == 0) {
                }
                if ((i3 & 16384) != 0) {
                    bu3VarColors = colors(kk0Var2, (i30 >> 21) & 14);
                    i30 &= -57345;
                } else {
                    bu3VarColors = bu3Var;
                }
                if ((i3 & 32768) != 0) {
                    float f1111111111115 = ov3.b;
                    is2Var = new is2(f1111111111115, f1111111111115, f1111111111115, f1111111111115);
                    i30 &= -458753;
                } else {
                    is2Var = hs2Var;
                }
                if (i31 != 0) {
                    ne1VarRememberComposableLambda = zg0.rememberComposableLambda(-1448570018, true, new uq2(z, z6, uq1Var, bu3VarColors), kk0Var2, 54);
                } else {
                    ne1VarRememberComposableLambda = ne1Var9;
                }
                bu3Var2 = bu3VarColors;
                ne1Var16 = ne1Var11;
                ne1Var17 = ne1Var10;
                ne1Var18 = ne1Var15;
                ne1Var19 = ne1Var14;
                ne1Var20 = ne1Var30;
                ne1Var21 = ne1Var12;
                z7 = z6;
                hs2Var2 = is2Var;
            }
            kk0Var2.s();
            int i311111111111111111111111111111113 = i4 << 3;
            int i311111111111111111111111111111114 = i4 >> 3;
            int i311111111111111111111111111111115 = i4 >> 9;
            int i311111111111111111111111111111116 = i30 << 21;
            int i311111111111111111111111111111117 = ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i311111111111111111111111111111115 & 7168) | (i311111111111111111111111111111114 & 57344) | (i30 & 458752) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128);
            kk0Var = kk0Var2;
            ne1 ne1Var31111111111115 = ne1Var13;
            ne1 ne1Var31111111111116 = ne1VarRememberComposableLambda;
            ov3.CommonDecorationBox(dy3.d, str, ne1Var, de4Var, ne1Var17, ne1Var16, ne1Var21, ne1Var31111111111115, ne1Var19, ne1Var18, ne1Var20, z4, z, z7, uq1Var, hs2Var2, bu3Var2, ne1Var31111111111116, kk0Var, (i311111111111111111111111111111113 & 896) | (i311111111111111111111111111111113 & 112) | 6 | (i311111111111111111111111111111114 & 7168) | (i311111111111111111111111111111115 & 57344) | (i311111111111111111111111111111115 & 458752) | (i311111111111111111111111111111115 & 3670016) | (i311111111111111111111111111111116 & 29360128) | (i311111111111111111111111111111116 & 234881024) | (i311111111111111111111111111111116 & 1879048192), i311111111111111111111111111111117, 0);
            ne1Var22 = ne1Var19;
            ne1Var23 = ne1Var18;
            bu3Var3 = bu3Var2;
            ne1Var24 = ne1Var31111111111116;
            ne1Var25 = ne1Var16;
            ne1Var26 = ne1Var21;
            z5 = z7;
            ne1Var27 = ne1Var20;
            ne1Var28 = ne1Var31111111111115;
            ne1Var29 = ne1Var17;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new vq2(this, str, ne1Var, z, z2, de4Var, uq1Var, z5, ne1Var29, ne1Var25, ne1Var26, ne1Var28, ne1Var22, ne1Var23, ne1Var27, bu3Var3, hs2Var2, ne1Var24, i, i2, i3));
        }
    }

    public final bu3 colors(ck0 ck0Var, int i) {
        return getDefaultOutlinedTextFieldColors(ab2.a.getColorScheme(ck0Var, 6), ck0Var, (i << 3) & 112);
    }

    /* JADX INFO: renamed from: colors-0hiis_0, reason: not valid java name */
    public final bu3 m1871xda5367af(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, lz3 lz3Var, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, ck0 ck0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return getDefaultOutlinedTextFieldColors(ab2.a.getColorScheme(ck0Var, 6), ck0Var, (i5 >> 6) & 112).a((i6 & 1) != 0 ? re0.i : j, (i6 & 2) != 0 ? re0.i : j2, (i6 & 4) != 0 ? re0.i : j3, (i6 & 8) != 0 ? re0.i : j4, (i6 & 16) != 0 ? re0.i : j5, (i6 & 32) != 0 ? re0.i : j6, (i6 & 64) != 0 ? re0.i : j7, (i6 & Uuid.SIZE_BITS) != 0 ? re0.i : j8, (i6 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? re0.i : j9, (i6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? re0.i : j10, (i6 & 1024) != 0 ? null : lz3Var, (i6 & 2048) != 0 ? re0.i : j11, (i6 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? re0.i : j12, (i6 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? re0.i : j13, (i6 & 16384) != 0 ? re0.i : j14, (32768 & i6) != 0 ? re0.i : j15, (65536 & i6) != 0 ? re0.i : j16, (131072 & i6) != 0 ? re0.i : j17, (262144 & i6) != 0 ? re0.i : j18, (524288 & i6) != 0 ? re0.i : j19, (1048576 & i6) != 0 ? re0.i : j20, (2097152 & i6) != 0 ? re0.i : j21, (4194304 & i6) != 0 ? re0.i : j22, (8388608 & i6) != 0 ? re0.i : j23, (16777216 & i6) != 0 ? re0.i : j24, (33554432 & i6) != 0 ? re0.i : j25, (67108864 & i6) != 0 ? re0.i : j26, (134217728 & i6) != 0 ? re0.i : j27, (268435456 & i6) != 0 ? re0.i : j28, (536870912 & i6) != 0 ? re0.i : j29, (i6 & 1073741824) != 0 ? re0.i : j30, (i7 & 1) != 0 ? re0.i : j31, (i7 & 2) != 0 ? re0.i : j32, (i7 & 4) != 0 ? re0.i : j33, (i7 & 8) != 0 ? re0.i : j34, (i7 & 16) != 0 ? re0.i : j35, (i7 & 32) != 0 ? re0.i : j36, (i7 & 64) != 0 ? re0.i : j37, (i7 & Uuid.SIZE_BITS) != 0 ? re0.i : j38, (i7 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? re0.i : j39, (i7 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? re0.i : j40, (i7 & 1024) != 0 ? re0.i : j41, (i7 & 2048) != 0 ? re0.i : j42);
    }

    public final bu3 getDefaultOutlinedTextFieldColors(ye0 ye0Var, ck0 ck0Var, int i) {
        bu3 bu3Var = ye0Var.l0;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1540400102);
        if (bu3Var == null) {
            ze0 ze0Var = ze0.n;
            long jB = af0.b(ye0Var, ze0Var);
            long jB2 = af0.b(ye0Var, ze0Var);
            long jB3 = re0.b(0.38f, af0.b(ye0Var, ze0Var));
            long jB4 = af0.b(ye0Var, ze0Var);
            long j = re0.h;
            ze0 ze0Var2 = ze0.r;
            long jB5 = af0.b(ye0Var, ze0Var2);
            ze0 ze0Var3 = ze0.c;
            long jB6 = af0.b(ye0Var, ze0Var3);
            lz3 lz3Var = (lz3) kk0Var.l(mz3.a);
            long jB7 = af0.b(ye0Var, ze0Var2);
            long jB8 = af0.b(ye0Var, ze0.p);
            long jB9 = re0.b(0.12f, af0.b(ye0Var, ze0Var));
            long jB10 = af0.b(ye0Var, ze0Var3);
            ze0 ze0Var4 = ze0.o;
            bu3 bu3Var2 = new bu3(jB, jB2, jB3, jB4, j, j, j, j, jB5, jB6, lz3Var, jB7, jB8, jB9, jB10, af0.b(ye0Var, ze0Var4), af0.b(ye0Var, ze0Var4), re0.b(0.38f, af0.b(ye0Var, ze0Var)), af0.b(ye0Var, ze0Var4), af0.b(ye0Var, ze0Var4), af0.b(ye0Var, ze0Var4), re0.b(0.38f, af0.b(ye0Var, ze0Var)), af0.b(ye0Var, ze0Var3), af0.b(ye0Var, ze0Var2), af0.b(ye0Var, ze0Var4), re0.b(0.38f, af0.b(ye0Var, ze0Var)), af0.b(ye0Var, ze0Var3), af0.b(ye0Var, ze0Var4), af0.b(ye0Var, ze0Var4), re0.b(0.38f, af0.b(ye0Var, ze0Var)), af0.b(ye0Var, ze0Var4), af0.b(ye0Var, ze0Var4), af0.b(ye0Var, ze0Var4), re0.b(0.38f, af0.b(ye0Var, ze0Var)), af0.b(ye0Var, ze0Var3), af0.b(ye0Var, ze0Var4), af0.b(ye0Var, ze0Var4), re0.b(0.38f, af0.b(ye0Var, ze0Var4)), af0.b(ye0Var, ze0Var4), af0.b(ye0Var, ze0Var4), af0.b(ye0Var, ze0Var4), re0.b(0.38f, af0.b(ye0Var, ze0Var4)), af0.b(ye0Var, ze0Var4));
            ye0Var.l0 = bu3Var2;
            bu3Var = bu3Var2;
        }
        kk0Var.r(false);
        return bu3Var;
    }

    public final rg3 getShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.h, ck0Var, 6);
    }
}
