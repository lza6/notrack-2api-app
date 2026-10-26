package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class fx0 {
    @cv0
    /* JADX INFO: renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public static final void m191xb6c3875f(c cVar, float f, long j, ck0 ck0Var, int i, int i2) {
        int i3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1562471785);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.e(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && kk0Var.g(j)) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i3 & 147) == 146 && kk0Var.F()) {
            kk0Var.V();
        } else {
            kk0Var.X();
            if ((i & 1) == 0 || kk0Var.D()) {
                if (i4 != 0) {
                    cVar = c.i;
                }
                if (i5 != 0) {
                    f = 1.0f;
                }
                if ((i2 & 4) != 0) {
                    j = cx0.a.getColor(kk0Var, 6);
                }
            } else {
                kk0Var.V();
            }
            kk0Var.s();
            kk0Var.a0(-433645095);
            float density = rx0.a(f, 0.0f) ? 1.0f / ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).getDensity() : f;
            kk0Var.r(false);
            vw.Box(a.b(d.d(cVar.then(d.a), density), j, k43.a), kk0Var, 0);
        }
        c cVar2 = cVar;
        float f2 = f;
        long j2 = j;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new dx0(cVar2, f2, j2, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX INFO: renamed from: HorizontalDivider-9IZ8Weo, reason: not valid java name */
    public static final void m192xfb3e0e9b(c cVar, float f, long j, ck0 ck0Var, int i, int i2) {
        int i3;
        long color;
        boolean z;
        boolean z2;
        Object objP;
        long j2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.e(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && kk0Var.g(j)) ? 256 : Uuid.SIZE_BITS;
        }
        if ((i3 & 147) == 146 && kk0Var.F()) {
            kk0Var.V();
            j2 = j;
        } else {
            kk0Var.X();
            if ((i & 1) == 0 || kk0Var.D()) {
                if (i4 != 0) {
                    cVar = c.i;
                }
                if (i5 != 0) {
                    f = 1.0f;
                }
                if ((i2 & 4) != 0) {
                    color = cx0.a.getColor(kk0Var, 6);
                    i3 &= -897;
                }
                kk0Var.s();
                c cVarD = d.d(cVar.then(d.a), f);
                boolean z3 = true;
                if ((i3 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                if ((((i3 & 896) ^ 384) > 256 || !kk0Var.g(color)) && (i3 & 384) != 256) {
                }
                z2 = z | z3;
                objP = kk0Var.P();
                if (z2 || objP == Composer$Companion.getEmpty()) {
                    objP = new ex0(f, 0, color);
                    kk0Var.l0(objP);
                }
                c10.Canvas(cVarD, (le1) objP, kk0Var, 0);
                j2 = color;
            } else {
                kk0Var.V();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            color = j;
            kk0Var.s();
            c cVarD2 = d.d(cVar.then(d.a), f);
            boolean z4 = true;
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            z4 = ((i3 & 896) ^ 384) > 256 ? false : false;
            z2 = z | z4;
            objP = kk0Var.P();
            if (z2) {
                objP = new ex0(f, 0, color);
                kk0Var.l0(objP);
            } else {
                objP = new ex0(f, 0, color);
                kk0Var.l0(objP);
            }
            c10.Canvas(cVarD2, (le1) objP, kk0Var, 0);
            j2 = color;
        }
        c cVar2 = cVar;
        float f2 = f;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new dx0(cVar2, f2, j2, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX INFO: renamed from: VerticalDivider-9IZ8Weo, reason: not valid java name */
    public static final void m193x60d55d09(c cVar, float f, long j, ck0 ck0Var, int i, int i2) {
        int i3;
        long color;
        boolean z;
        boolean z2;
        Object objP;
        long j2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1534852205);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.e(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && kk0Var.g(j)) ? 256 : Uuid.SIZE_BITS;
        }
        if ((i3 & 147) == 146 && kk0Var.F()) {
            kk0Var.V();
            j2 = j;
        } else {
            kk0Var.X();
            if ((i & 1) == 0 || kk0Var.D()) {
                if (i4 != 0) {
                    cVar = c.i;
                }
                if (i5 != 0) {
                    f = 1.0f;
                }
                if ((i2 & 4) != 0) {
                    color = cx0.a.getColor(kk0Var, 6);
                    i3 &= -897;
                }
                kk0Var.s();
                c cVarN = d.n(cVar.then(d.b), f);
                if ((i3 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = ((((i3 & 896) ^ 384) <= 256 && kk0Var.g(color)) || (i3 & 384) == 256) | z;
                objP = kk0Var.P();
                if (z2 || objP == Composer$Companion.getEmpty()) {
                    objP = new ex0(f, 1, color);
                    kk0Var.l0(objP);
                }
                c10.Canvas(cVarN, (le1) objP, kk0Var, 0);
                j2 = color;
            } else {
                kk0Var.V();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            color = j;
            kk0Var.s();
            c cVarN2 = d.n(cVar.then(d.b), f);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            z2 = ((((i3 & 896) ^ 384) <= 256 && kk0Var.g(color)) || (i3 & 384) == 256) | z;
            objP = kk0Var.P();
            if (z2) {
                objP = new ex0(f, 1, color);
                kk0Var.l0(objP);
            } else {
                objP = new ex0(f, 1, color);
                kk0Var.l0(objP);
            }
            c10.Canvas(cVarN2, (le1) objP, kk0Var, 0);
            j2 = color;
        }
        c cVar2 = cVar;
        float f2 = f;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new dx0(cVar2, f2, j2, i, i2, 2));
        }
    }
}
