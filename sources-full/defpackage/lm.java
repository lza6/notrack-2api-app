package defpackage;

import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.ContentScale$Companion;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import coil3.compose.internal.ContentPainterElement;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class lm {
    /* JADX INFO: renamed from: AsyncImage-76YX9Dk, reason: not valid java name */
    private static final void m1769x36cc4c34(final ym ymVar, final String str, final c cVar, final le1 le1Var, final le1 le1Var2, final a8 a8Var, final sn0 sn0Var, final float f, final te0 te0Var, final int i, final boolean z, ck0 ck0Var, final int i2, final int i3) {
        int i4;
        String str2;
        le1 le1Var3;
        le1 le1Var4;
        a8 a8Var2;
        int i5;
        boolean z2;
        int i6;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (kk0Var.h(ymVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= kk0Var.h(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i4 |= kk0Var.h(cVar) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 3072) == 0) {
            le1Var3 = le1Var;
            i4 |= kk0Var.j(le1Var3) ? 2048 : 1024;
        } else {
            le1Var3 = le1Var;
        }
        if ((i2 & 24576) == 0) {
            le1Var4 = le1Var2;
            i4 |= kk0Var.j(le1Var4) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        } else {
            le1Var4 = le1Var2;
        }
        if ((196608 & i2) == 0) {
            a8Var2 = a8Var;
            i4 |= kk0Var.h(a8Var2) ? 131072 : 65536;
        } else {
            a8Var2 = a8Var;
        }
        if ((1572864 & i2) == 0) {
            i4 |= kk0Var.h(sn0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= kk0Var.e(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= kk0Var.h(te0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 = i;
            i4 |= kk0Var.f(i5) ? 536870912 : 268435456;
        } else {
            i5 = i;
        }
        if ((i3 & 6) == 0) {
            z2 = z;
            i6 = i3 | (kk0Var.i(z2) ? 4 : 2);
        } else {
            z2 = z;
            i6 = i3;
        }
        if (kk0Var.S(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            pm1 pm1VarRequestOfWithSizeResolver = ra4.requestOfWithSizeResolver(ymVar.a, sn0Var, kk0Var, (i4 >> 15) & 112);
            Object obj = pm1VarRequestOfWithSizeResolver.b;
            if (obj instanceof mm1) {
                u41.k("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                return;
            }
            if (obj instanceof bm1) {
                ra4.b("ImageBitmap");
                throw null;
            }
            if (obj instanceof ym1) {
                ra4.b("ImageVector");
                throw null;
            }
            if (obj instanceof ms2) {
                ra4.b("Painter");
                throw null;
            }
            if (pm1VarRequestOfWithSizeResolver.c != null) {
                u41.k("request.target must be null.");
                return;
            }
            if (((h32) y64.z(pm1VarRequestOfWithSizeResolver, sm1.e)) != null) {
                u41.k("request.lifecycle must be null.");
                return;
            }
            c cVarThen = cVar.then(new ContentPainterElement(pm1VarRequestOfWithSizeResolver, ymVar.c, ymVar.b, le1Var3, le1Var4, i5, a8Var2, sn0Var, f, te0Var, z2, ra4.previewHandler(kk0Var, 0), str2));
            ua uaVar = ua.k;
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            c cVarD = b.d(kk0Var, cVarThen);
            su2 su2VarN = kk0Var.n();
            a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (kk0Var.a == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
            }
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: km
                @Override // defpackage.ne1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    lm.a(ymVar, str, cVar, le1Var, le1Var2, a8Var, sn0Var, f, te0Var, i, z, (ck0) obj2, i2, i3);
                    return w84.a;
                }
            });
        }
    }

    /* JADX INFO: renamed from: AsyncImage-nc27qi8, reason: not valid java name */
    public static final void m1770xded95cb8(Object obj, String str, im1 im1Var, c cVar, ms2 ms2Var, ms2 ms2Var2, ms2 ms2Var3, le1 le1Var, le1 le1Var2, le1 le1Var3, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, int i, boolean z, ck0 ck0Var, int i2, int i3, int i4) {
        c cVar2 = (i4 & 8) != 0 ? c.i : cVar;
        ms2 ms2Var4 = (i4 & 16) != 0 ? null : ms2Var;
        ms2 ms2Var5 = (i4 & 32) != 0 ? null : ms2Var2;
        ms2 ms2Var6 = (i4 & 64) != 0 ? ms2Var5 : ms2Var3;
        le1 le1Var4 = (i4 & Uuid.SIZE_BITS) != 0 ? null : le1Var;
        le1 le1Var5 = (i4 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? null : le1Var2;
        le1 le1Var6 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : le1Var3;
        a8 center = (i4 & 1024) != 0 ? Alignment$Companion.getCenter() : a8Var;
        sn0 fit = (i4 & 2048) != 0 ? ContentScale$Companion.getFit() : sn0Var;
        float f2 = (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? 1.0f : f;
        te0 te0Var2 = (i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : te0Var;
        int i5 = (i4 & 16384) != 0 ? 1 : i;
        boolean z2 = (i4 & 32768) == 0 ? z : true;
        int i6 = i2 >> 3;
        c cVar3 = cVar2;
        kk0 kk0Var = (kk0) ck0Var;
        a8 a8Var2 = center;
        ym ymVar = new ym(obj, (mm) kk0Var.l(a72.a), im1Var);
        int i7 = ra4.b;
        le1 jqVar = (ms2Var4 == null && ms2Var5 == null && ms2Var6 == null) ? tm.D : new jq(ms2Var4, ms2Var6, ms2Var5, 7);
        int i8 = i3 << 15;
        m1769x36cc4c34(ymVar, str, cVar3, jqVar, (le1Var4 == null && le1Var5 == null && le1Var6 == null) ? null : new jq(le1Var4, le1Var5, le1Var6, 8), a8Var2, fit, f2, te0Var2, i5, z2, kk0Var, (i6 & 896) | (i2 & 112) | (458752 & i8) | (3670016 & i8) | (29360128 & i8) | (234881024 & i8) | (i8 & 1879048192), (i3 >> 15) & 14);
    }

    /* JADX INFO: renamed from: AsyncImage-sKDTAoQ, reason: not valid java name */
    public static final void m1771xbf6e588d(Object obj, String str, im1 im1Var, c cVar, le1 le1Var, le1 le1Var2, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, int i, boolean z, ck0 ck0Var, int i2, int i3, int i4) {
        int i5 = i2 >> 3;
        kk0 kk0Var = (kk0) ck0Var;
        m1769x36cc4c34(new ym(obj, (mm) kk0Var.l(a72.a), im1Var), str, (i4 & 8) != 0 ? c.i : cVar, (i4 & 16) != 0 ? tm.D : le1Var, (i4 & 32) != 0 ? null : le1Var2, (i4 & 64) != 0 ? Alignment$Companion.getCenter() : a8Var, (i4 & Uuid.SIZE_BITS) != 0 ? ContentScale$Companion.getFit() : sn0Var, (i4 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? 1.0f : f, (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 ? te0Var : null, (i4 & 1024) != 0 ? 1 : i, (i4 & 2048) == 0 ? z : true, kk0Var, (i2 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024) | ((i3 << 27) & 1879048192), (i3 >> 3) & 14);
    }

    public static void a(ym ymVar, String str, c cVar, le1 le1Var, le1 le1Var2, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, int i, boolean z, ck0 ck0Var, int i2, int i3) {
        m1769x36cc4c34(ymVar, str, cVar, le1Var, le1Var2, a8Var, sn0Var, f, te0Var, i, z, ck0Var, sf3.V(i2 | 1), sf3.V(i3));
    }
}
