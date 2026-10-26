package defpackage;

import ai.notrack.app.R;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import app.template.extension.BuildConfig;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class qq {
    public static final Paint a = new Paint(3);

    public static final void AvatarCropDialog(final Bitmap bitmap, final String str, final boolean z, final String str2, final le1 le1Var, final je1 je1Var, final je1 je1Var2, ck0 ck0Var, final int i) {
        int i2;
        String str3;
        kk0 kk0Var;
        bitmap.getClass();
        str.getClass();
        le1Var.getClass();
        je1Var.getClass();
        je1Var2.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(83018810);
        if ((i & 6) == 0) {
            i2 = (kk0Var2.j(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var2.h(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var2.i(z) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            str3 = str2;
            i2 |= kk0Var2.h(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= kk0Var2.j(le1Var) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= kk0Var2.j(je1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= kk0Var2.j(je1Var2) ? 1048576 : 524288;
        }
        if (kk0Var2.S(i2 & 1, (599187 & i2) != 599186)) {
            Object objP = kk0Var2.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = r11.a(x21.c, kk0Var2);
                kk0Var2.l0(objP);
            }
            final gq0 gq0Var = (gq0) objP;
            boolean zH = kk0Var2.h(bitmap);
            Object objP2 = kk0Var2.P();
            if (zH || objP2 == Composer$Companion.getEmpty()) {
                objP2 = cl3.d(new pq0(0, 1.0f, 0.0f, 0.0f));
                kk0Var2.l0(objP2);
            }
            final mi2 mi2Var = (mi2) objP2;
            Object objP3 = kk0Var2.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                objP3 = new bt2(0.0f);
                kk0Var2.l0(objP3);
            }
            final ah2 ah2Var = (ah2) objP3;
            Object objP4 = kk0Var2.P();
            if (objP4 == Composer$Companion.getEmpty()) {
                objP4 = cl3.d(Boolean.FALSE);
                kk0Var2.l0(objP4);
            }
            final mi2 mi2Var2 = (mi2) objP4;
            final gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(Boolean.valueOf(z), kk0Var2, (i2 >> 6) & 14);
            final long jD = gb2.d(4293783532L);
            final long jD2 = gb2.d(4288390046L);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 3670016) == 1048576);
            Object objP5 = kk0Var2.P();
            if (z2 || objP5 == Composer$Companion.getEmpty()) {
                objP5 = new fq(z, je1Var2, 0);
                kk0Var2.l0(objP5);
            }
            uv0 uv0Var = new uv0(5);
            final String str4 = str3;
            ne1 ne1Var = new ne1() { // from class: gq
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return qq.AvatarCropDialog$lambda$42(jD2, str4, je1Var2, z, str, jD, mi2Var, bitmap, gn3VarRememberUpdatedState, ah2Var, je1Var, gq0Var, le1Var, mi2Var2, (ck0) obj, iIntValue);
                }
            };
            kk0Var = kk0Var2;
            wa.Dialog((je1) objP5, uv0Var, zg0.rememberComposableLambda(842786243, true, ne1Var, kk0Var, 54), kk0Var, 432, 0);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: hq
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qq.AvatarCropDialog(bitmap, str, z, str2, le1Var, je1Var, je1Var2, (ck0) obj, sf3.V(i | 1));
                    return w84.a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AvatarCropDialog$lambda$42(long j, String str, je1 je1Var, boolean z, String str2, final long j2, final mi2 mi2Var, final Bitmap bitmap, final gn3 gn3Var, final ah2 ah2Var, je1 je1Var2, final gq0 gq0Var, final le1 le1Var, final mi2 mi2Var2, ck0 ck0Var, int i) {
        final int i2;
        final int i3 = 1;
        int i4 = 2;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i & 1, (i & 3) != 2);
        xk xkVar = kk0Var.a;
        if (zS) {
            View view = (View) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalView());
            boolean zJ = kk0Var.j(view);
            Object objP = kk0Var.P();
            if (zJ || objP == Composer$Companion.getEmpty()) {
                objP = new wl(i4, view);
                kk0Var.l0(objP);
            }
            r11.SideEffect((je1) objP, kk0Var, 0);
            Modifier$Companion modifier$Companion = c.i;
            FillElement fillElement = d.c;
            c cVarB = a.b(fillElement, gb2.d(4278848523L), k43.a);
            vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarB);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            pe peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            c cVarL = androidx.compose.foundation.layout.a.l(b.a(fillElement, InspectableValueKt.isDebugInspectorInfoEnabled() ? new jh4(1, 0) : InspectableValueKt.getNoInspectorInfo(), new kh4(3)), 20.0f, 12.0f);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getCenterHorizontally(), kk0Var, 48);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN2 = kk0Var.n();
            c cVarD2 = b.d(kk0Var, cVarL);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            pe peVarH2 = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN2);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            FillElement fillElement2 = d.a;
            xt centerVertically = Alignment$Companion.getCenterVertically();
            cl clVar = hl.a;
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(clVar, centerVertically, kk0Var, 48);
            int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN3 = kk0Var.n();
            c cVarD3 = b.d(kk0Var, fillElement2);
            d4 constructor3 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor3);
            } else {
                kk0Var.o0();
            }
            pe peVarH3 = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN3);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
            boolean z2 = !z;
            rl1.IconButton(je1Var, null, z2, null, null, zg0.rememberComposableLambda(1217035238, true, new ne1() { // from class: cq
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    ck0 ck0Var2 = (ck0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$35$lambda$34(j2, ck0Var2, iIntValue);
                        case 1:
                            return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$17$lambda$16(j2, ck0Var2, iIntValue);
                        default:
                            return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$35$lambda$29(j2, ck0Var2, iIntValue);
                    }
                }
            }, kk0Var, 54), kk0Var, 196608, 26);
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(str2, (c) new LayoutWeightElement(1.0f, true), j2, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, new jt3(3), 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).h, (ck0) kk0Var, 196992, 0, 64984);
            cm3.Spacer(d.n(modifier$Companion, 48.0f), kk0Var, 6);
            final int i5 = 1;
            kk0Var.r(true);
            cm3.Spacer(d.d(modifier$Companion, 4.0f), kk0Var, 6);
            uy3.m1842xe1e389ce(ko3.stringResource(R.string.ava_crop_hint, kk0Var, 0), (c) null, j, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, new jt3(3), 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).l, (ck0) kk0Var, 384, 0, 65018);
            cm3.Spacer(new LayoutWeightElement(1.0f, true), kk0Var, 0);
            cx.BoxWithConstraints(fillElement2, Alignment$Companion.getCenter(), false, zg0.rememberComposableLambda(-965181775, true, new oe1() { // from class: iq
                @Override // defpackage.oe1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$26(mi2Var, bitmap, gn3Var, ah2Var, (dx) obj, (ck0) obj2, iIntValue);
                }
            }, kk0Var, 54), kk0Var, 3126, 4);
            cm3.Spacer(d.d(modifier$Companion, 20.0f), kk0Var, 6);
            vb2 vb2VarRowMeasurePolicy2 = e83.rowMeasurePolicy(clVar, Alignment$Companion.getCenterVertically(), kk0Var, 48);
            int currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN4 = kk0Var.n();
            c cVarD4 = b.d(kk0Var, fillElement2);
            d4 constructor4 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor4);
            } else {
                kk0Var.o0();
            }
            pe peVarH4 = fq2.h(kk0Var, vb2VarRowMeasurePolicy2, kk0Var, su2VarN4);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
            }
            xp1.E(kk0Var, cVarD4, ComposeUiNode$Companion.getSetModifier());
            boolean zH = kk0Var.h(mi2Var) | kk0Var.j(bitmap);
            Object objP2 = kk0Var.P();
            if (zH || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new je1() { // from class: bq
                    @Override // defpackage.je1
                    public final Object invoke() {
                        int i6 = i5;
                        w84 w84Var = w84.a;
                        ah2 ah2Var2 = ah2Var;
                        mi2 mi2Var3 = mi2Var;
                        Bitmap bitmap2 = bitmap;
                        switch (i6) {
                            case 0:
                                mi2Var3.setValue(qq.g(pq0.a((pq0) mi2Var3.getValue(), (((pq0) mi2Var3.getValue()).a + 1) % 4, 0.0f, 0.0f, 0.0f, 2), bitmap2, ((bt2) ah2Var2).f()));
                                break;
                            default:
                                mi2Var3.setValue(qq.g(pq0.a((pq0) mi2Var3.getValue(), (((pq0) mi2Var3.getValue()).a + 3) % 4, 0.0f, 0.0f, 0.0f, 2), bitmap2, ((bt2) ah2Var2).f()));
                                break;
                        }
                        return w84Var;
                    }
                };
                kk0Var.l0(objP2);
            }
            final int i6 = 2;
            rl1.IconButton((je1) objP2, null, z2, null, null, zg0.rememberComposableLambda(1055159247, true, new ne1() { // from class: cq
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    ck0 ck0Var2 = (ck0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i7) {
                        case 0:
                            return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$35$lambda$34(j2, ck0Var2, iIntValue);
                        case 1:
                            return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$17$lambda$16(j2, ck0Var2, iIntValue);
                        default:
                            return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$35$lambda$29(j2, ck0Var2, iIntValue);
                    }
                }
            }, kk0Var, 54), kk0Var, 196608, 26);
            float f = ((pq0) mi2Var.getValue()).b;
            od0 od0Var = new od0(1.0f, 4.0f);
            ni3 ni3Var = ni3.a;
            long brandGreen = gx.getBrandGreen(kk0Var, 0);
            long brandGreen2 = gx.getBrandGreen(kk0Var, 0);
            long j3 = re0.e;
            ii3 ii3VarM1776xe9175d64 = ni3Var.m1776xe9175d64(brandGreen, brandGreen2, 0L, re0.b(0.18f, j3), 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 3072, 6, 1012);
            c cVarM = androidx.compose.foundation.layout.a.m(new LayoutWeightElement(1.0f, true), 4.0f, 0.0f, 2);
            boolean zH2 = kk0Var.h(mi2Var) | kk0Var.j(bitmap);
            Object objP3 = kk0Var.P();
            if (zH2 || objP3 == Composer$Companion.getEmpty()) {
                objP3 = new jq((Object) bitmap, (Object) mi2Var, (Object) ah2Var, 0);
                kk0Var.l0(objP3);
            }
            rj3.Slider(f, (le1) objP3, cVarM, z2, od0Var, 0, null, ii3VarM1776xe9175d64, null, kk0Var, 0, 352);
            boolean zH3 = kk0Var.h(mi2Var) | kk0Var.j(bitmap);
            Object objP4 = kk0Var.P();
            if (zH3 || objP4 == Composer$Companion.getEmpty()) {
                i2 = 0;
                objP4 = new je1() { // from class: bq
                    @Override // defpackage.je1
                    public final Object invoke() {
                        int i7 = i2;
                        w84 w84Var = w84.a;
                        ah2 ah2Var2 = ah2Var;
                        mi2 mi2Var3 = mi2Var;
                        Bitmap bitmap2 = bitmap;
                        switch (i7) {
                            case 0:
                                mi2Var3.setValue(qq.g(pq0.a((pq0) mi2Var3.getValue(), (((pq0) mi2Var3.getValue()).a + 1) % 4, 0.0f, 0.0f, 0.0f, 2), bitmap2, ((bt2) ah2Var2).f()));
                                break;
                            default:
                                mi2Var3.setValue(qq.g(pq0.a((pq0) mi2Var3.getValue(), (((pq0) mi2Var3.getValue()).a + 3) % 4, 0.0f, 0.0f, 0.0f, 2), bitmap2, ((bt2) ah2Var2).f()));
                                break;
                        }
                        return w84Var;
                    }
                };
                kk0Var.l0(objP4);
            } else {
                i2 = 0;
            }
            rl1.IconButton((je1) objP4, null, z2, null, null, zg0.rememberComposableLambda(-1386718024, true, new ne1() { // from class: cq
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i2;
                    ck0 ck0Var2 = (ck0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i7) {
                        case 0:
                            return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$35$lambda$34(j2, ck0Var2, iIntValue);
                        case 1:
                            return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$17$lambda$16(j2, ck0Var2, iIntValue);
                        default:
                            return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$35$lambda$29(j2, ck0Var2, iIntValue);
                    }
                }
            }, kk0Var, 54), kk0Var, 196608, 26);
            kk0Var.r(true);
            cm3.Spacer(new LayoutWeightElement(1.0f, true), kk0Var, 0);
            uy3.m1842xe1e389ce(str == null ? BuildConfig.VERSION_NAME : str, (c) fillElement2, gb2.d(4294937216L), 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, new jt3(3), 0L, 0, false, 0, 2, (le1) null, ab2Var.getTypography(kk0Var, 0).l, (ck0) kk0Var, 432, 24576, 48632);
            cm3.Spacer(d.d(modifier$Companion, 8.0f), kk0Var, 6);
            vb2 vb2VarRowMeasurePolicy3 = e83.rowMeasurePolicy(new fl(12.0f), Alignment$Companion.getTop(), kk0Var, 6);
            int currentCompositeKeyHash5 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN5 = kk0Var.n();
            c cVarD5 = b.d(kk0Var, fillElement2);
            d4 constructor5 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor5);
            } else {
                kk0Var.o0();
            }
            pe peVarH5 = fq2.h(kk0Var, vb2VarRowMeasurePolicy3, kk0Var, su2VarN5);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash5))) {
                fq2.v(currentCompositeKeyHash5, kk0Var, currentCompositeKeyHash5, peVarH5);
            }
            xp1.E(kk0Var, cVarD5, ComposeUiNode$Companion.getSetModifier());
            y73 y73Var = z73.a;
            uy uyVar = uy.a;
            bz.OutlinedButton(je1Var2, new LayoutWeightElement(1.0f, true), z2, y73Var, uyVar.m1839x817dfa16(0L, j2, 0L, 0L, kk0Var, 48, 13), null, gm4.a(1.0f, re0.b(0.28f, j3)), androidx.compose.foundation.layout.a.a(0.0f, 14.0f, 1), null, ai0.a, kk0Var, 819462144, 288);
            boolean z3 = (z || ((Boolean) mi2Var2.getValue()).booleanValue()) ? false : true;
            ty tyVarM1833x1b9ca94 = uyVar.m1833x1b9ca94(gx.getBrandGreen(kk0Var, 0), gx.getBrandOnAccent(kk0Var, 0), re0.b(0.5f, gx.getBrandGreen(kk0Var, 0)), gx.getBrandOnAccent(kk0Var, 0), kk0Var, 0, 0);
            is2 is2VarA = androidx.compose.foundation.layout.a.a(0.0f, 14.0f, 1);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            boolean zJ2 = kk0Var.j(gq0Var) | kk0Var.h(le1Var) | kk0Var.j(bitmap) | kk0Var.h(mi2Var);
            Object objP5 = kk0Var.P();
            if (zJ2 || objP5 == Composer$Companion.getEmpty()) {
                je1 je1Var3 = new je1() { // from class: dq
                    @Override // defpackage.je1
                    public final Object invoke() {
                        ah2 ah2Var2 = ah2Var;
                        float f2 = ((bt2) ah2Var2).f();
                        w84 w84Var = w84.a;
                        if (f2 > 0.0f) {
                            mi2 mi2Var3 = mi2Var2;
                            if (!((Boolean) mi2Var3.getValue()).booleanValue()) {
                                mi2Var3.setValue(Boolean.TRUE);
                                py.F(gq0Var, null, null, new ve(le1Var, bitmap, mi2Var, ah2Var2, mi2Var3, (so0) null, 2), 3);
                            }
                        }
                        return w84Var;
                    }
                };
                kk0Var.l0(je1Var3);
                objP5 = je1Var3;
            }
            bz.Button((je1) objP5, layoutWeightElement, z3, y73Var, tyVarM1833x1b9ca94, null, null, is2VarA, null, zg0.rememberComposableLambda(-249451781, r6, new eq(0, mi2Var2, z), kk0Var, 54), kk0Var, 817889280, 352);
            kk0Var.r(r6);
            kk0Var.r(r6);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$17$lambda$16(long j, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            ul1.m1829xf2a7a69(s22.a.getX(kk0Var, 6), ko3.stringResource(R.string.ava_crop_back, kk0Var, 0), (c) null, j, kk0Var, 3072, 4);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$26(mi2 mi2Var, Bitmap bitmap, gn3 gn3Var, ah2 ah2Var, dx dxVar, ck0 ck0Var, int i) {
        int i2;
        Object mqVar;
        dxVar.getClass();
        if ((i & 6) == 0) {
            i2 = i | (((kk0) ck0Var).h(dxVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = 0;
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            int i4 = ((Configuration) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp;
            float fMin = Math.min(((androidx.compose.foundation.layout.c) dxVar).b(), 380.0f);
            int i5 = i4 - 340;
            if (i5 < 150) {
                i5 = 150;
            }
            float fMin2 = Math.min(fMin, i5);
            float fW = ((wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity())).w(fMin2);
            Float fValueOf = Float.valueOf(fW);
            boolean zE = kk0Var.e(fW) | kk0Var.h(mi2Var) | kk0Var.j(bitmap);
            Object objP = kk0Var.P();
            if (zE || objP == Composer$Companion.getEmpty()) {
                kq kqVar = new kq(fW, bitmap, ah2Var, mi2Var, null);
                kk0Var.l0(kqVar);
                objP = kqVar;
            }
            r11.LaunchedEffect(fValueOf, (ne1) objP, kk0Var, 0);
            c cVarJ = d.j(c.i, fMin2);
            boolean zH = kk0Var.h(gn3Var) | kk0Var.h(mi2Var) | kk0Var.j(bitmap);
            Object objP2 = kk0Var.P();
            if (zH || objP2 == Composer$Companion.getEmpty()) {
                mqVar = new mq(bitmap, gn3Var, ah2Var, mi2Var, 0);
                kk0Var.l0(mqVar);
            } else {
                mqVar = objP2;
            }
            c cVarB = oq3.b(cVarJ, bitmap, (PointerInputEventHandler) mqVar);
            boolean zH2 = kk0Var.h(gn3Var) | kk0Var.h(mi2Var) | kk0Var.j(bitmap);
            Object objP3 = kk0Var.P();
            if (zH2 || objP3 == Composer$Companion.getEmpty()) {
                mq mqVar2 = new mq(bitmap, gn3Var, ah2Var, mi2Var, 1);
                kk0Var.l0(mqVar2);
                objP3 = mqVar2;
            }
            c cVarB2 = oq3.b(cVarB, bitmap, (PointerInputEventHandler) objP3);
            boolean zJ = kk0Var.j(bitmap) | kk0Var.h(mi2Var);
            Object objP4 = kk0Var.P();
            if (zJ || objP4 == Composer$Companion.getEmpty()) {
                objP4 = new aq(bitmap, i3, mi2Var);
                kk0Var.l0(objP4);
            }
            c10.Canvas(cVarB2, (le1) objP4, kk0Var, 0);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$35$lambda$29(long j, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            ul1.m1829xf2a7a69(s22.a.getRotateCcw(kk0Var, 6), ko3.stringResource(R.string.ava_crop_rot_l, kk0Var, 0), (c) null, j, kk0Var, 3072, 4);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$35$lambda$34(long j, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            ul1.m1829xf2a7a69(s22.a.getRotateCw(kk0Var, 6), ko3.stringResource(R.string.ava_crop_rot_r, kk0Var, 0), (c) null, j, kk0Var, 3072, 4);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$39$lambda$38(boolean z, mi2 mi2Var, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 17) != 16)) {
            kk0Var.V();
        } else if (z || ((Boolean) mi2Var.getValue()).booleanValue()) {
            kk0Var.a0(-1124533950);
            z03.m1882xe8727fba(d.j(c.i, 18.0f), gx.getBrandOnAccent(kk0Var, 0), 2.0f, 0L, 0, kk0Var, 390, 24);
            kk0Var.r(false);
        } else {
            kk0Var.a0(795012886);
            uy3.m1842xe1e389ce(ko3.stringResource(R.string.ava_crop_use, kk0Var, 0), (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 1, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196608, 3072, 122846);
            kk0Var.r(false);
        }
        return w84.a;
    }

    public static final pq0 g(pq0 pq0Var, Bitmap bitmap, float f) {
        float fMin = (f / Math.min(bitmap.getWidth(), bitmap.getHeight())) * pq0Var.b;
        int i = pq0Var.a % 2;
        float height = (i == 1 ? bitmap.getHeight() : bitmap.getWidth()) * fMin;
        int width = i == 1 ? bitmap.getWidth() : bitmap.getHeight();
        float fMax = Math.max(0.0f, (height - f) / 2.0f);
        float fMax2 = Math.max(0.0f, ((width * fMin) - f) / 2.0f);
        return pq0.a(pq0Var, 0, 0.0f, py.w(pq0Var.c, -fMax, fMax), py.w(pq0Var.d, -fMax2, fMax2), 3);
    }

    public static final void h(Canvas canvas, float f, float f2, Bitmap bitmap, pq0 pq0Var) {
        float fMin = (f / Math.min(bitmap.getWidth(), bitmap.getHeight())) * pq0Var.b;
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, f, f);
        canvas.drawColor(-1);
        float f3 = f / 2.0f;
        canvas.translate((pq0Var.c * f2) + f3, (pq0Var.d * f2) + f3);
        canvas.rotate(pq0Var.a * 90.0f);
        canvas.scale(fMin, fMin);
        canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, a);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(Bitmap bitmap, pq0 pq0Var, float f, uo0 uo0Var) throws Throwable {
        oq oqVar;
        if (uo0Var instanceof oq) {
            oqVar = (oq) uo0Var;
            int i = oqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oqVar.d = i - Integer.MIN_VALUE;
            } else {
                oqVar = new oq(uo0Var);
            }
        } else {
            oqVar = new oq(uo0Var);
        }
        Object objY = oqVar.c;
        int i2 = oqVar.d;
        if (i2 == 0) {
            g13.O(objY);
            jt0 jt0Var = sw0.a;
            pq pqVar = new pq(f, bitmap, pq0Var, null);
            oqVar.d = 1;
            objY = py.Y(jt0Var, pqVar, oqVar);
            hq0 hq0Var = hq0.c;
            if (objY == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objY);
        }
        objY.getClass();
        return objY;
    }
}
