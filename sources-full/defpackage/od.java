package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class od {
    public static final void HandlePopup(pn2 pn2Var, a8 a8Var, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(476043083);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? kk0Var.h(pn2Var) : kk0Var.j(pn2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.h(a8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(ne1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        boolean z = true;
        if (kk0Var.S(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !kk0Var.h(pn2Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objP = kk0Var.P();
            if (z3 || objP == Composer$Companion.getEmpty()) {
                objP = new bh1(a8Var, pn2Var);
                kk0Var.l0(objP);
            }
            yc.Popup((bh1) objP, null, new ux2(false, tc3.c, false), ne1Var, kk0Var, ((i2 << 3) & 7168) | 384, 2);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ed(pn2Var, a8Var, ne1Var, i, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0107  */
    /* JADX INFO: renamed from: SelectionHandle-wLIcFTc, reason: not valid java name */
    public static final void m1779x3a93ba2d(pn2 pn2Var, boolean z, u53 u53Var, boolean z2, long j, float f, c cVar, ck0 ck0Var, int i, int i2) {
        int i3;
        long j2;
        long j3;
        boolean z3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-466280168);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? kk0Var.h(pn2Var) : kk0Var.j(pn2Var) ? 4 : 2) | i;
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
            i3 |= kk0Var.h(u53Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= kk0Var.i(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            j2 = j;
            i3 |= ((i2 & 16) == 0 && kk0Var.g(j2)) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        } else {
            j2 = j;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= kk0Var.h(cVar) ? 1048576 : 524288;
        }
        if (kk0Var.S(i3 & 1, (533651 & i3) != 533650)) {
            kk0Var.X();
            if ((i & 1) != 0 && !kk0Var.D()) {
                kk0Var.V();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            } else if ((i2 & 16) != 0) {
                i3 &= -57345;
                j2 = 9205357640488583168L;
            }
            kk0Var.s();
            u53 u53Var2 = u53.d;
            u53 u53Var3 = u53.c;
            if (z) {
                ff3 ff3Var = ee3.a;
                if ((u53Var != u53Var3 || z2) && !(u53Var == u53Var2 && z2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                ff3 ff3Var2 = ee3.a;
                if ((u53Var != u53Var3 || z2) && !(u53Var == u53Var2 && z2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            vt vtVar = z3 ? vl0.b : vl0.a;
            int i4 = i3 & 14;
            boolean zI = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && kk0Var.j(pn2Var))) | kk0Var.i(z3);
            Object objP = kk0Var.P();
            if (zI || objP == Composer$Companion.getEmpty()) {
                objP = new jd(pn2Var, z, z3);
                kk0Var.l0(objP);
            }
            long j4 = j2;
            boolean z4 = z3;
            j3 = j4;
            HandlePopup(pn2Var, vtVar, zg0.rememberComposableLambda(1365123137, true, new hd((ViewConfiguration) kk0Var.l(CompositionLocalsKt.getLocalViewConfiguration()), j3, z4, we3.b(cVar, false, (le1) objP), pn2Var), kk0Var, 54), kk0Var, i4 | 384);
        } else {
            kk0Var.V();
            j3 = j2;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new id(pn2Var, z, u53Var, z2, j3, f, cVar, i, i2));
        }
    }

    public static final void SelectionHandleIcon(c cVar, je1 je1Var, boolean z, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(2111672474);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.i(z) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if (kk0Var.S(i2 & 1, (i2 & 147) != 146)) {
            ff3 ff3Var = ee3.a;
            cm3.Spacer(b.a(d.k(cVar, 25.0f, 25.0f), InspectableValueKt.getNoInspectorInfo(), new nd(je1Var, z)), kk0Var, 0);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new kd(cVar, je1Var, z, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final bm1 a(rz rzVar, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        ib ibVarB = xr0.e;
        o9 o9VarA = xr0.f;
        a10 a10Var = xr0.g;
        if (ibVarB == null || o9VarA == null) {
            ibVarB = sf3.b(iCeil, iCeil, 1);
            xr0.e = ibVarB;
            o9VarA = g13.a(ibVarB);
            xr0.f = o9VarA;
        } else {
            Bitmap bitmap = ibVarB.b;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                ibVarB = sf3.b(iCeil, iCeil, 1);
                xr0.e = ibVarB;
                o9VarA = g13.a(ibVarB);
                xr0.f = o9VarA;
            }
        }
        ib ibVar = ibVarB;
        o9 o9Var = o9VarA;
        if (a10Var == null) {
            a10Var = new a10();
            xr0.g = a10Var;
        }
        a10 a10Var2 = a10Var;
        z00 z00Var = a10Var2.c;
        dx1 layoutDirection = rzVar.c.getLayoutDirection();
        Bitmap bitmap2 = ibVar.b;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        wu0 wu0Var = z00Var.a;
        dx1 dx1Var = z00Var.b;
        y00 y00Var = z00Var.c;
        long j = z00Var.d;
        z00Var.a = rzVar;
        z00Var.b = layoutDirection;
        z00Var.c = o9Var;
        z00Var.d = jFloatToRawIntBits;
        o9Var.l();
        tz0.f(a10Var2, re0.b, 0L, a10Var2.b(), 0.0f, null, 58);
        tz0.f(a10Var2, gb2.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, null, 120);
        tz0.K(a10Var2, gb2.d(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), null, 120);
        o9Var.i();
        z00Var.a = wu0Var;
        z00Var.b = dx1Var;
        z00Var.c = y00Var;
        z00Var.d = j;
        return ibVar;
    }
}
