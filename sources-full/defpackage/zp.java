package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.Brush$Companion;
import androidx.compose.ui.layout.ContentScale$Companion;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import notrack.ai.data.avatars.AvatarCatalogue;
import notrack.ai.data.avatars.AvatarItem;
import notrack.ai.data.avatars.AvatarView;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class zp {
    /* JADX WARN: Code duplicated, block: B:101:0x028c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0290  */
    /* JADX WARN: Code duplicated, block: B:105:0x029b  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:113:0x0308  */
    /* JADX WARN: Code duplicated, block: B:115:0x034b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0352  */
    /* JADX WARN: Code duplicated, block: B:118:0x0356  */
    /* JADX WARN: Code duplicated, block: B:121:0x0361  */
    /* JADX WARN: Code duplicated, block: B:123:0x036f  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:129:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:131:0x0404  */
    /* JADX WARN: Code duplicated, block: B:132:0x0408  */
    /* JADX WARN: Code duplicated, block: B:135:0x0413  */
    /* JADX WARN: Code duplicated, block: B:137:0x0421  */
    /* JADX WARN: Code duplicated, block: B:139:0x0452  */
    /* JADX WARN: Code duplicated, block: B:141:0x0456  */
    /* JADX WARN: Code duplicated, block: B:144:0x0461  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:73:0x0118  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x0169  */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x0186  */
    /* JADX WARN: Code duplicated, block: B:86:0x0196  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x0241  */
    /* JADX WARN: Code duplicated, block: B:95:0x0245  */
    /* JADX WARN: Code duplicated, block: B:97:0x0250  */
    /* JADX WARN: Code duplicated, block: B:99:0x0285  */
    /* JADX INFO: renamed from: AvatarFace-TN_CM5M, reason: not valid java name */
    public static final void m1895xb7a067f0(final AvatarView avatarView, final String str, final float f, String str2, c cVar, ck0 ck0Var, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        c cVar2;
        int i5;
        boolean z;
        final String str4;
        final c cVar3;
        w33 w33VarV;
        AvatarView avatarView2;
        y73 y73Var;
        boolean zN;
        qn0 qn0Var;
        ab2 ab2Var;
        vb2 vb2VarC;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        vb2 vb2VarC2;
        int currentCompositeKeyHash2;
        su2 su2VarN2;
        c cVarD2;
        d4 constructor2;
        pe peVarH2;
        vb2 vb2VarC3;
        int currentCompositeKeyHash3;
        su2 su2VarN3;
        c cVarD3;
        d4 constructor3;
        pe peVarH3;
        vb2 vb2VarC4;
        int currentCompositeKeyHash4;
        su2 su2VarN4;
        c cVarD4;
        d4 constructor4;
        pe peVarH4;
        String initial;
        boolean z2;
        String urlSm;
        str.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1925105586);
        xk xkVar = kk0Var.a;
        if ((i & 6) == 0) {
            i3 = (kk0Var.h(avatarView) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var.h(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= kk0Var.e(f) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                str3 = str2;
                i3 |= kk0Var.h(str3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    cVar2 = cVar;
                    if (kk0Var.h(cVar2)) {
                        i5 = 16384;
                    } else {
                        i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i6 != 0) {
                        str4 = "https://notrack.ai";
                    } else {
                        str4 = str3;
                    }
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (avatarView == null) {
                        AvatarView.Companion.getClass();
                        avatarView2 = AvatarView.NONE;
                    } else {
                        avatarView2 = avatarView;
                    }
                    y73Var = z73.a;
                    if (avatarView2.getHasImage()) {
                        kk0Var.a0(122476973);
                        urlSm = avatarView2.getUrlSm();
                        if (urlSm == null) {
                            urlSm = avatarView2.getUrl();
                        }
                        urlSm.getClass();
                        if (!to3.q0(urlSm, "http", false)) {
                            urlSm = ud2.p(str4, urlSm);
                        }
                        vh3.m1845xef24a3e0(urlSm, null, xr0.N(d.j(cVar3, f), y73Var), null, null, null, ContentScale$Companion.getCrop(), 0.0f, null, 0, false, kk0Var, 1572912, 0, 1976);
                        kk0Var = kk0Var;
                        kk0Var.r(false);
                    } else {
                        zN = kr1.n(avatarView2.getKind(), "tile");
                        qn0Var = k43.a;
                        if (zN) {
                            kk0Var.a0(-1104418185);
                            c cVarN = xr0.N(d.j(cVar3, f), y73Var);
                            String bg = avatarView2.getBg();
                            int hue = avatarView2.getHue();
                            int i7 = re0.j;
                            c cVarB = a.b(cVarN, f(bg, Brush$Companion.m8x2ffe3954(py.x(hue, 0, 359))), qn0Var);
                            vb2VarC4 = vw.c(Alignment$Companion.getCenter(), false);
                            currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN4 = kk0Var.n();
                            cVarD4 = b.d(kk0Var, cVarB);
                            androidx.compose.ui.node.a.j.getClass();
                            constructor4 = ComposeUiNode$Companion.getConstructor();
                            if (xkVar != null) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.e0();
                            if (kk0Var.O) {
                                kk0Var.m(constructor4);
                            } else {
                                kk0Var.o0();
                            }
                            peVarH4 = fq2.h(kk0Var, vb2VarC4, kk0Var, su2VarN4);
                            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                                fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                            }
                            xp1.E(kk0Var, cVarD4, ComposeUiNode$Companion.getSetModifier());
                            if (str.equals("ai")) {
                                kk0Var.a0(-711052999);
                                z2 = false;
                                uy3.m1842xe1e389ce("N", (c) null, f(avatarView2.getFg(), re0.e), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196614, 0, 131026);
                                kk0Var = kk0Var;
                                kk0Var.r(false);
                            } else {
                                kk0Var.a0(-710797218);
                                initial = avatarView2.getInitial();
                                if (mo3.C0(initial)) {
                                    initial = "?";
                                }
                                uy3.m1842xe1e389ce(initial, (c) null, f(avatarView2.getFg(), re0.e), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196608, 0, 131026);
                                kk0Var = kk0Var;
                                z2 = false;
                                kk0Var.r(false);
                            }
                            kk0Var.r(true);
                            kk0Var.r(z2);
                        } else if (str.equals("ai")) {
                            kk0Var.a0(-1104397123);
                            c cVarB2 = a.b(xr0.N(d.j(cVar3, f), y73Var), gx.getBrandMark(kk0Var, 0), qn0Var);
                            vb2VarC3 = vw.c(Alignment$Companion.getCenter(), false);
                            currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN3 = kk0Var.n();
                            cVarD3 = b.d(kk0Var, cVarB2);
                            androidx.compose.ui.node.a.j.getClass();
                            constructor3 = ComposeUiNode$Companion.getConstructor();
                            if (xkVar != null) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.e0();
                            if (kk0Var.O) {
                                kk0Var.m(constructor3);
                            } else {
                                kk0Var.o0();
                            }
                            peVarH3 = fq2.h(kk0Var, vb2VarC3, kk0Var, su2VarN3);
                            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                            }
                            xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
                            uy3.m1842xe1e389ce("N", (c) null, gx.getBrandOnMark(kk0Var, 0), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196614, 0, 131026);
                            kk0Var = kk0Var;
                            kk0Var.r(true);
                            kk0Var.r(false);
                        } else if (mo3.C0(avatarView2.getInitial())) {
                            kk0Var.a0(-1104377939);
                            c cVarN2 = xr0.N(d.j(cVar3, f), y73Var);
                            ab2Var = ab2.a;
                            c cVarB3 = a.b(cVarN2, ab2Var.getColorScheme(kk0Var, 0).r, qn0Var);
                            vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN = kk0Var.n();
                            cVarD = b.d(kk0Var, cVarB3);
                            androidx.compose.ui.node.a.j.getClass();
                            constructor = ComposeUiNode$Companion.getConstructor();
                            if (xkVar != null) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.e0();
                            if (kk0Var.O) {
                                kk0Var.m(constructor);
                            } else {
                                kk0Var.o0();
                            }
                            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            }
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            ul1.m1829xf2a7a69(s22.a.getUser(kk0Var, 6), (String) null, d.j(c.i, 0.55f * f), ab2Var.getColorScheme(kk0Var, 0).s, kk0Var, 48, 0);
                            kk0Var.r(true);
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(-1104387449);
                            c cVarN3 = xr0.N(d.j(cVar3, f), y73Var);
                            int hue2 = avatarView2.getHue();
                            int i8 = re0.j;
                            c cVarB4 = a.b(cVarN3, Brush$Companion.m8x2ffe3954(py.x(hue2, 0, 359)), qn0Var);
                            vb2VarC2 = vw.c(Alignment$Companion.getCenter(), false);
                            currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN2 = kk0Var.n();
                            cVarD2 = b.d(kk0Var, cVarB4);
                            androidx.compose.ui.node.a.j.getClass();
                            constructor2 = ComposeUiNode$Companion.getConstructor();
                            if (xkVar != null) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.e0();
                            if (kk0Var.O) {
                                kk0Var.m(constructor2);
                            } else {
                                kk0Var.o0();
                            }
                            peVarH2 = fq2.h(kk0Var, vb2VarC2, kk0Var, su2VarN2);
                            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                            }
                            xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                            uy3.m1842xe1e389ce(avatarView2.getInitial(), (c) null, re0.e, gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196992, 0, 131026);
                            kk0Var = kk0Var;
                            kk0Var.r(true);
                            kk0Var.r(false);
                        }
                    }
                } else {
                    kk0Var.V();
                    str4 = str3;
                    cVar3 = cVar2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ne1() { // from class: hp
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            zp.m1895xb7a067f0(avatarView, str, f, str4, cVar3, (ck0) obj, sf3.V(i | 1), i2);
                            return w84.a;
                        }
                    });
                }
            }
            i3 |= 24576;
            cVar2 = cVar;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i6 != 0) {
                    str4 = "https://notrack.ai";
                } else {
                    str4 = str3;
                }
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (avatarView == null) {
                    AvatarView.Companion.getClass();
                    avatarView2 = AvatarView.NONE;
                } else {
                    avatarView2 = avatarView;
                }
                y73Var = z73.a;
                if (avatarView2.getHasImage()) {
                    kk0Var.a0(122476973);
                    urlSm = avatarView2.getUrlSm();
                    if (urlSm == null) {
                        urlSm = avatarView2.getUrl();
                    }
                    urlSm.getClass();
                    if (!to3.q0(urlSm, "http", false)) {
                        urlSm = ud2.p(str4, urlSm);
                    }
                    vh3.m1845xef24a3e0(urlSm, null, xr0.N(d.j(cVar3, f), y73Var), null, null, null, ContentScale$Companion.getCrop(), 0.0f, null, 0, false, kk0Var, 1572912, 0, 1976);
                    kk0Var = kk0Var;
                    kk0Var.r(false);
                } else {
                    zN = kr1.n(avatarView2.getKind(), "tile");
                    qn0Var = k43.a;
                    if (zN) {
                        kk0Var.a0(-1104418185);
                        c cVarN4 = xr0.N(d.j(cVar3, f), y73Var);
                        String bg2 = avatarView2.getBg();
                        int hue3 = avatarView2.getHue();
                        int i9 = re0.j;
                        c cVarB5 = a.b(cVarN4, f(bg2, Brush$Companion.m8x2ffe3954(py.x(hue3, 0, 359))), qn0Var);
                        vb2VarC4 = vw.c(Alignment$Companion.getCenter(), false);
                        currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN4 = kk0Var.n();
                        cVarD4 = b.d(kk0Var, cVarB5);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor4 = ComposeUiNode$Companion.getConstructor();
                        if (xkVar != null) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor4);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH4 = fq2.h(kk0Var, vb2VarC4, kk0Var, su2VarN4);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                        } else {
                            fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                        }
                        xp1.E(kk0Var, cVarD4, ComposeUiNode$Companion.getSetModifier());
                        if (str.equals("ai")) {
                            kk0Var.a0(-711052999);
                            z2 = false;
                            uy3.m1842xe1e389ce("N", (c) null, f(avatarView2.getFg(), re0.e), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196614, 0, 131026);
                            kk0Var = kk0Var;
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(-710797218);
                            initial = avatarView2.getInitial();
                            if (mo3.C0(initial)) {
                                initial = "?";
                            }
                            uy3.m1842xe1e389ce(initial, (c) null, f(avatarView2.getFg(), re0.e), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196608, 0, 131026);
                            kk0Var = kk0Var;
                            z2 = false;
                            kk0Var.r(false);
                        }
                        kk0Var.r(true);
                        kk0Var.r(z2);
                    } else if (str.equals("ai")) {
                        kk0Var.a0(-1104397123);
                        c cVarB6 = a.b(xr0.N(d.j(cVar3, f), y73Var), gx.getBrandMark(kk0Var, 0), qn0Var);
                        vb2VarC3 = vw.c(Alignment$Companion.getCenter(), false);
                        currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN3 = kk0Var.n();
                        cVarD3 = b.d(kk0Var, cVarB6);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor3 = ComposeUiNode$Companion.getConstructor();
                        if (xkVar != null) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor3);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH3 = fq2.h(kk0Var, vb2VarC3, kk0Var, su2VarN3);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                        } else {
                            fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                        }
                        xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
                        uy3.m1842xe1e389ce("N", (c) null, gx.getBrandOnMark(kk0Var, 0), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196614, 0, 131026);
                        kk0Var = kk0Var;
                        kk0Var.r(true);
                        kk0Var.r(false);
                    } else if (mo3.C0(avatarView2.getInitial())) {
                        kk0Var.a0(-1104387449);
                        c cVarN5 = xr0.N(d.j(cVar3, f), y73Var);
                        int hue4 = avatarView2.getHue();
                        int i10 = re0.j;
                        c cVarB7 = a.b(cVarN5, Brush$Companion.m8x2ffe3954(py.x(hue4, 0, 359)), qn0Var);
                        vb2VarC2 = vw.c(Alignment$Companion.getCenter(), false);
                        currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN2 = kk0Var.n();
                        cVarD2 = b.d(kk0Var, cVarB7);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor2 = ComposeUiNode$Companion.getConstructor();
                        if (xkVar != null) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor2);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH2 = fq2.h(kk0Var, vb2VarC2, kk0Var, su2VarN2);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                        } else {
                            fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                        }
                        xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                        uy3.m1842xe1e389ce(avatarView2.getInitial(), (c) null, re0.e, gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196992, 0, 131026);
                        kk0Var = kk0Var;
                        kk0Var.r(true);
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(-1104377939);
                        c cVarN6 = xr0.N(d.j(cVar3, f), y73Var);
                        ab2Var = ab2.a;
                        c cVarB8 = a.b(cVarN6, ab2Var.getColorScheme(kk0Var, 0).r, qn0Var);
                        vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB8);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor = ComposeUiNode$Companion.getConstructor();
                        if (xkVar != null) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ul1.m1829xf2a7a69(s22.a.getUser(kk0Var, 6), (String) null, d.j(c.i, 0.55f * f), ab2Var.getColorScheme(kk0Var, 0).s, kk0Var, 48, 0);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    }
                }
            } else {
                kk0Var.V();
                str4 = str3;
                cVar3 = cVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: hp
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zp.m1895xb7a067f0(avatarView, str, f, str4, cVar3, (ck0) obj, sf3.V(i | 1), i2);
                        return w84.a;
                    }
                });
            }
        }
        i3 |= 3072;
        str3 = str2;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                cVar2 = cVar;
                if (kk0Var.h(cVar2)) {
                    i5 = 16384;
                } else {
                    i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i6 != 0) {
                    str4 = "https://notrack.ai";
                } else {
                    str4 = str3;
                }
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (avatarView == null) {
                    AvatarView.Companion.getClass();
                    avatarView2 = AvatarView.NONE;
                } else {
                    avatarView2 = avatarView;
                }
                y73Var = z73.a;
                if (avatarView2.getHasImage()) {
                    kk0Var.a0(122476973);
                    urlSm = avatarView2.getUrlSm();
                    if (urlSm == null) {
                        urlSm = avatarView2.getUrl();
                    }
                    urlSm.getClass();
                    if (!to3.q0(urlSm, "http", false)) {
                        urlSm = ud2.p(str4, urlSm);
                    }
                    vh3.m1845xef24a3e0(urlSm, null, xr0.N(d.j(cVar3, f), y73Var), null, null, null, ContentScale$Companion.getCrop(), 0.0f, null, 0, false, kk0Var, 1572912, 0, 1976);
                    kk0Var = kk0Var;
                    kk0Var.r(false);
                } else {
                    zN = kr1.n(avatarView2.getKind(), "tile");
                    qn0Var = k43.a;
                    if (zN) {
                        kk0Var.a0(-1104418185);
                        c cVarN7 = xr0.N(d.j(cVar3, f), y73Var);
                        String bg3 = avatarView2.getBg();
                        int hue5 = avatarView2.getHue();
                        int i11 = re0.j;
                        c cVarB9 = a.b(cVarN7, f(bg3, Brush$Companion.m8x2ffe3954(py.x(hue5, 0, 359))), qn0Var);
                        vb2VarC4 = vw.c(Alignment$Companion.getCenter(), false);
                        currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN4 = kk0Var.n();
                        cVarD4 = b.d(kk0Var, cVarB9);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor4 = ComposeUiNode$Companion.getConstructor();
                        if (xkVar != null) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor4);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH4 = fq2.h(kk0Var, vb2VarC4, kk0Var, su2VarN4);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                        } else {
                            fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                        }
                        xp1.E(kk0Var, cVarD4, ComposeUiNode$Companion.getSetModifier());
                        if (str.equals("ai")) {
                            kk0Var.a0(-711052999);
                            z2 = false;
                            uy3.m1842xe1e389ce("N", (c) null, f(avatarView2.getFg(), re0.e), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196614, 0, 131026);
                            kk0Var = kk0Var;
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(-710797218);
                            initial = avatarView2.getInitial();
                            if (mo3.C0(initial)) {
                                initial = "?";
                            }
                            uy3.m1842xe1e389ce(initial, (c) null, f(avatarView2.getFg(), re0.e), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196608, 0, 131026);
                            kk0Var = kk0Var;
                            z2 = false;
                            kk0Var.r(false);
                        }
                        kk0Var.r(true);
                        kk0Var.r(z2);
                    } else if (str.equals("ai")) {
                        kk0Var.a0(-1104397123);
                        c cVarB10 = a.b(xr0.N(d.j(cVar3, f), y73Var), gx.getBrandMark(kk0Var, 0), qn0Var);
                        vb2VarC3 = vw.c(Alignment$Companion.getCenter(), false);
                        currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN3 = kk0Var.n();
                        cVarD3 = b.d(kk0Var, cVarB10);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor3 = ComposeUiNode$Companion.getConstructor();
                        if (xkVar != null) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor3);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH3 = fq2.h(kk0Var, vb2VarC3, kk0Var, su2VarN3);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                        } else {
                            fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                        }
                        xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
                        uy3.m1842xe1e389ce("N", (c) null, gx.getBrandOnMark(kk0Var, 0), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196614, 0, 131026);
                        kk0Var = kk0Var;
                        kk0Var.r(true);
                        kk0Var.r(false);
                    } else if (mo3.C0(avatarView2.getInitial())) {
                        kk0Var.a0(-1104387449);
                        c cVarN8 = xr0.N(d.j(cVar3, f), y73Var);
                        int hue6 = avatarView2.getHue();
                        int i12 = re0.j;
                        c cVarB11 = a.b(cVarN8, Brush$Companion.m8x2ffe3954(py.x(hue6, 0, 359)), qn0Var);
                        vb2VarC2 = vw.c(Alignment$Companion.getCenter(), false);
                        currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN2 = kk0Var.n();
                        cVarD2 = b.d(kk0Var, cVarB11);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor2 = ComposeUiNode$Companion.getConstructor();
                        if (xkVar != null) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor2);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH2 = fq2.h(kk0Var, vb2VarC2, kk0Var, su2VarN2);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                        } else {
                            fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                        }
                        xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                        uy3.m1842xe1e389ce(avatarView2.getInitial(), (c) null, re0.e, gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196992, 0, 131026);
                        kk0Var = kk0Var;
                        kk0Var.r(true);
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(-1104377939);
                        c cVarN9 = xr0.N(d.j(cVar3, f), y73Var);
                        ab2Var = ab2.a;
                        c cVarB12 = a.b(cVarN9, ab2Var.getColorScheme(kk0Var, 0).r, qn0Var);
                        vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB12);
                        androidx.compose.ui.node.a.j.getClass();
                        constructor = ComposeUiNode$Companion.getConstructor();
                        if (xkVar != null) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(constructor);
                        } else {
                            kk0Var.o0();
                        }
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ul1.m1829xf2a7a69(s22.a.getUser(kk0Var, 6), (String) null, d.j(c.i, 0.55f * f), ab2Var.getColorScheme(kk0Var, 0).s, kk0Var, 48, 0);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    }
                }
            } else {
                kk0Var.V();
                str4 = str3;
                cVar3 = cVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: hp
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zp.m1895xb7a067f0(avatarView, str, f, str4, cVar3, (ck0) obj, sf3.V(i | 1), i2);
                        return w84.a;
                    }
                });
            }
        }
        i3 |= 24576;
        cVar2 = cVar;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i6 != 0) {
                str4 = "https://notrack.ai";
            } else {
                str4 = str3;
            }
            if (i4 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            if (avatarView == null) {
                AvatarView.Companion.getClass();
                avatarView2 = AvatarView.NONE;
            } else {
                avatarView2 = avatarView;
            }
            y73Var = z73.a;
            if (avatarView2.getHasImage()) {
                kk0Var.a0(122476973);
                urlSm = avatarView2.getUrlSm();
                if (urlSm == null) {
                    urlSm = avatarView2.getUrl();
                }
                urlSm.getClass();
                if (!to3.q0(urlSm, "http", false)) {
                    urlSm = ud2.p(str4, urlSm);
                }
                vh3.m1845xef24a3e0(urlSm, null, xr0.N(d.j(cVar3, f), y73Var), null, null, null, ContentScale$Companion.getCrop(), 0.0f, null, 0, false, kk0Var, 1572912, 0, 1976);
                kk0Var = kk0Var;
                kk0Var.r(false);
            } else {
                zN = kr1.n(avatarView2.getKind(), "tile");
                qn0Var = k43.a;
                if (zN) {
                    kk0Var.a0(-1104418185);
                    c cVarN10 = xr0.N(d.j(cVar3, f), y73Var);
                    String bg4 = avatarView2.getBg();
                    int hue7 = avatarView2.getHue();
                    int i13 = re0.j;
                    c cVarB13 = a.b(cVarN10, f(bg4, Brush$Companion.m8x2ffe3954(py.x(hue7, 0, 359))), qn0Var);
                    vb2VarC4 = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN4 = kk0Var.n();
                    cVarD4 = b.d(kk0Var, cVarB13);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor4 = ComposeUiNode$Companion.getConstructor();
                    if (xkVar != null) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor4);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH4 = fq2.h(kk0Var, vb2VarC4, kk0Var, su2VarN4);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                    } else {
                        fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
                    }
                    xp1.E(kk0Var, cVarD4, ComposeUiNode$Companion.getSetModifier());
                    if (str.equals("ai")) {
                        kk0Var.a0(-711052999);
                        z2 = false;
                        uy3.m1842xe1e389ce("N", (c) null, f(avatarView2.getFg(), re0.e), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196614, 0, 131026);
                        kk0Var = kk0Var;
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(-710797218);
                        initial = avatarView2.getInitial();
                        if (mo3.C0(initial)) {
                            initial = "?";
                        }
                        uy3.m1842xe1e389ce(initial, (c) null, f(avatarView2.getFg(), re0.e), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196608, 0, 131026);
                        kk0Var = kk0Var;
                        z2 = false;
                        kk0Var.r(false);
                    }
                    kk0Var.r(true);
                    kk0Var.r(z2);
                } else if (str.equals("ai")) {
                    kk0Var.a0(-1104397123);
                    c cVarB14 = a.b(xr0.N(d.j(cVar3, f), y73Var), gx.getBrandMark(kk0Var, 0), qn0Var);
                    vb2VarC3 = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN3 = kk0Var.n();
                    cVarD3 = b.d(kk0Var, cVarB14);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor3 = ComposeUiNode$Companion.getConstructor();
                    if (xkVar != null) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor3);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH3 = fq2.h(kk0Var, vb2VarC3, kk0Var, su2VarN3);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                    } else {
                        fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
                    }
                    xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
                    uy3.m1842xe1e389ce("N", (c) null, gx.getBrandOnMark(kk0Var, 0), gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196614, 0, 131026);
                    kk0Var = kk0Var;
                    kk0Var.r(true);
                    kk0Var.r(false);
                } else if (mo3.C0(avatarView2.getInitial())) {
                    kk0Var.a0(-1104387449);
                    c cVarN11 = xr0.N(d.j(cVar3, f), y73Var);
                    int hue8 = avatarView2.getHue();
                    int i14 = re0.j;
                    c cVarB15 = a.b(cVarN11, Brush$Companion.m8x2ffe3954(py.x(hue8, 0, 359)), qn0Var);
                    vb2VarC2 = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN2 = kk0Var.n();
                    cVarD2 = b.d(kk0Var, cVarB15);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor2 = ComposeUiNode$Companion.getConstructor();
                    if (xkVar != null) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor2);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH2 = fq2.h(kk0Var, vb2VarC2, kk0Var, su2VarN2);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                    } else {
                        fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                    }
                    xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                    uy3.m1842xe1e389ce(avatarView2.getInitial(), (c) null, re0.e, gm4.L(f * 0.42f, 4294967296L), (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196992, 0, 131026);
                    kk0Var = kk0Var;
                    kk0Var.r(true);
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(-1104377939);
                    c cVarN12 = xr0.N(d.j(cVar3, f), y73Var);
                    ab2Var = ab2.a;
                    c cVarB16 = a.b(cVarN12, ab2Var.getColorScheme(kk0Var, 0).r, qn0Var);
                    vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB16);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (xkVar != null) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ul1.m1829xf2a7a69(s22.a.getUser(kk0Var, 6), (String) null, d.j(c.i, 0.55f * f), ab2Var.getColorScheme(kk0Var, 0).s, kk0Var, 48, 0);
                    kk0Var.r(true);
                    kk0Var.r(false);
                }
            }
        } else {
            kk0Var.V();
            str4 = str3;
            cVar3 = cVar2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: hp
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zp.m1895xb7a067f0(avatarView, str, f, str4, cVar3, (ck0) obj, sf3.V(i | 1), i2);
                    return w84.a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AvatarPickerSheet(final AvatarCatalogue avatarCatalogue, final String str, final le1 le1Var, final AvatarView avatarView, final boolean z, final boolean z2, final String str2, String str3, final le1 le1Var2, final je1 je1Var, final le1 le1Var3, ne1 ne1Var, je1 je1Var2, final je1 je1Var3, ck0 ck0Var, final int i, final int i2, final int i3) {
        int i4;
        String str4;
        int i5;
        ne1 ne1Var2;
        int i6;
        final je1 je1Var4;
        final String str5;
        kk0 kk0Var;
        final ne1 ne1Var3;
        final ne1 ne1Var4;
        int i7;
        je1 je1Var5;
        String str6;
        List<String> categories;
        mi2 mi2Var;
        String str7;
        int i8;
        mi2 mi2Var2;
        mi2 mi2Var3;
        boolean z3;
        str.getClass();
        le1Var.getClass();
        str2.getClass();
        le1Var2.getClass();
        je1Var.getClass();
        le1Var3.getClass();
        je1Var3.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-537844769);
        if ((i & 6) == 0) {
            i4 = (kk0Var2.j(avatarCatalogue) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= kk0Var2.h(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= kk0Var2.j(le1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i4 |= kk0Var2.h(avatarView) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= kk0Var2.i(z) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((i & 1572864) == 0) {
            i4 |= kk0Var2.h(str2) ? 1048576 : 524288;
        }
        int i9 = i3 & Uuid.SIZE_BITS;
        if (i9 != 0) {
            i4 |= 12582912;
            str4 = str3;
        } else {
            str4 = str3;
            if ((i & 12582912) == 0) {
                i4 |= kk0Var2.h(str4) ? 8388608 : 4194304;
            }
        }
        if ((i & 100663296) == 0) {
            i4 |= kk0Var2.j(le1Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= kk0Var2.j(je1Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (kk0Var2.j(le1Var3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2048;
        if (i10 != 0) {
            i5 |= 48;
            ne1Var2 = ne1Var;
        } else {
            ne1Var2 = ne1Var;
            if ((i2 & 48) == 0) {
                i5 |= kk0Var2.j(ne1Var2) ? 32 : 16;
            }
        }
        int i11 = i5;
        int i12 = i4;
        int i13 = i3 & ConstantsKt.DEFAULT_BLOCK_SIZE;
        if (i13 != 0) {
            i6 = i11 | 384;
        } else if ((i2 & 384) == 0) {
            i6 = i11 | (kk0Var2.j(je1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS);
        } else {
            i6 = i11;
        }
        if ((i2 & 3072) == 0) {
            i6 |= kk0Var2.j(je1Var3) ? 2048 : 1024;
        }
        int i14 = i6;
        int i15 = 0;
        if (kk0Var2.S(i12 & 1, ((i12 & 306717843) == 306717842 && (i14 & 1171) == 1170) ? false : true)) {
            String str8 = i9 != 0 ? BuildConfig.VERSION_NAME : str4;
            if (i10 != 0) {
                Object objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = new ip(i15);
                    kk0Var2.l0(objP);
                }
                ne1Var4 = (ne1) objP;
            } else {
                ne1Var4 = ne1Var2;
            }
            if (i13 != 0) {
                Object objP2 = kk0Var2.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    i7 = 2;
                    objP2 = new lg(i7);
                    kk0Var2.l0(objP2);
                } else {
                    i7 = 2;
                }
                je1Var5 = (je1) objP2;
            } else {
                i7 = 2;
                je1Var5 = je1Var2;
            }
            hh3 hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(true, null, kk0Var2, 6, i7);
            boolean zH = kk0Var2.h(avatarCatalogue);
            Object objP3 = kk0Var2.P();
            if (zH || objP3 == Composer$Companion.getEmpty()) {
                if (avatarCatalogue == null || (categories = avatarCatalogue.getCategories()) == null || (str6 = (String) ke0.z0(categories)) == null) {
                    str6 = "basic";
                }
                objP3 = cl3.d(str6);
                kk0Var2.l0(objP3);
            }
            final mi2 mi2Var4 = (mi2) objP3;
            Object objP4 = kk0Var2.P();
            if (objP4 == Composer$Companion.getEmpty()) {
                objP4 = cl3.d(null);
                kk0Var2.l0(objP4);
            }
            final mi2 mi2Var5 = (mi2) objP4;
            Context context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objP5 = kk0Var2.P();
            if (objP5 == Composer$Companion.getEmpty()) {
                objP5 = r11.a(x21.c, kk0Var2);
                kk0Var2.l0(objP5);
            }
            gq0 gq0Var = (gq0) objP5;
            Object objP6 = kk0Var2.P();
            if (objP6 == Composer$Companion.getEmpty()) {
                objP6 = cl3.d(null);
                kk0Var2.l0(objP6);
            }
            mi2 mi2Var6 = (mi2) objP6;
            Object objP7 = kk0Var2.P();
            if (objP7 == Composer$Companion.getEmpty()) {
                objP7 = cl3.d(Boolean.FALSE);
                kk0Var2.l0(objP7);
            }
            final mi2 mi2Var7 = (mi2) objP7;
            Object objP8 = kk0Var2.P();
            if (objP8 == Composer$Companion.getEmpty()) {
                objP8 = cl3.d(null);
                kk0Var2.l0(objP8);
            }
            final mi2 mi2Var8 = (mi2) objP8;
            final String strStringResource = ko3.stringResource(R.string.ava_e_big, kk0Var2, 0);
            String strStringResource2 = ko3.stringResource(R.string.ava_e_bad, kk0Var2, 0);
            Object objP9 = kk0Var2.P();
            if (objP9 == Composer$Companion.getEmpty()) {
                objP9 = cl3.d(null);
                kk0Var2.l0(objP9);
            }
            final mi2 mi2Var9 = (mi2) objP9;
            final String str9 = str8;
            u3 u3Var = new u3(1, false);
            boolean zJ = kk0Var2.j(gq0Var) | kk0Var2.j(context) | kk0Var2.h(strStringResource2);
            Object objP10 = kk0Var2.P();
            if (zJ || objP10 == Composer$Companion.getEmpty()) {
                mi2Var = mi2Var6;
                objP10 = new jp(gq0Var, context, strStringResource2, mi2Var9, mi2Var8, mi2Var);
                str7 = strStringResource2;
                kk0Var2.l0(objP10);
            } else {
                str7 = strStringResource2;
                mi2Var = mi2Var6;
            }
            j92 j92VarRememberLauncherForActivityResult = i4.rememberLauncherForActivityResult(u3Var, (le1) objP10, kk0Var2, 0);
            boolean zJ2 = kk0Var2.j(j92VarRememberLauncherForActivityResult);
            Object objP11 = kk0Var2.P();
            if (zJ2 || objP11 == Composer$Companion.getEmpty()) {
                i8 = 1;
                objP11 = new wl(i8, j92VarRememberLauncherForActivityResult);
                kk0Var2.l0(objP11);
            } else {
                i8 = 1;
            }
            final je1 je1Var6 = (je1) objP11;
            Bitmap bitmap = (Bitmap) mi2Var.getValue();
            if (bitmap == null) {
                kk0Var2.a0(1591924569);
                kk0Var2.r(false);
            } else {
                kk0Var2.a0(1591924570);
                String strStringResource3 = ko3.stringResource(str.equals("ai") ? R.string.ava_ai_label : R.string.ava_title, kk0Var2, 0);
                boolean zBooleanValue = ((Boolean) mi2Var7.getValue()).booleanValue();
                String str10 = (String) mi2Var8.getValue();
                boolean zH2 = ((i14 & 112) == 32) | kk0Var2.h(strStringResource) | kk0Var2.h(str7);
                Object objP12 = kk0Var2.P();
                if (zH2 || objP12 == Composer$Companion.getEmpty()) {
                    final String str11 = str7;
                    final mi2 mi2Var10 = mi2Var;
                    objP12 = new le1() { // from class: kp
                        @Override // defpackage.le1
                        public final Object invoke(Object obj) {
                            byte[] bArr = (byte[]) obj;
                            bArr.getClass();
                            Boolean bool = Boolean.TRUE;
                            mi2 mi2Var11 = mi2Var7;
                            mi2Var11.setValue(bool);
                            mi2 mi2Var12 = mi2Var8;
                            mi2Var12.setValue(null);
                            ne1Var4.invoke(bArr, new jp(strStringResource, str11, mi2Var11, mi2Var5, mi2Var10, mi2Var12));
                            return w84.a;
                        }
                    };
                    mi2Var2 = mi2Var8;
                    mi2Var3 = mi2Var10;
                    kk0Var2.l0(objP12);
                } else {
                    mi2Var2 = mi2Var8;
                    mi2Var3 = mi2Var;
                }
                le1 le1Var4 = (le1) objP12;
                boolean zH3 = kk0Var2.h(je1Var6);
                Object objP13 = kk0Var2.P();
                if (zH3 || objP13 == Composer$Companion.getEmpty()) {
                    objP13 = new lp(je1Var6, 0);
                    kk0Var2.l0(objP13);
                }
                je1 je1Var7 = (je1) objP13;
                Object objP14 = kk0Var2.P();
                if (objP14 == Composer$Companion.getEmpty()) {
                    z3 = false;
                    objP14 = new mp(mi2Var3, mi2Var2, 0 == true ? 1 : 0);
                    kk0Var2.l0(objP14);
                } else {
                    z3 = false;
                }
                qq.AvatarCropDialog(bitmap, strStringResource3, zBooleanValue, str10, le1Var4, je1Var7, (je1) objP14, kk0Var2, 1572864);
                kk0Var2.r(z3);
            }
            final je1 je1Var8 = je1Var5;
            kk0Var = kk0Var2;
            hf2.m206x750f78f8(je1Var3, null, hh3VarRememberModalBottomSheetState, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, zg0.rememberComposableLambda(1966543010, true, new oe1() { // from class: np
                @Override // defpackage.oe1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return zp.AvatarPickerSheet$lambda$81(avatarView, z, avatarCatalogue, le1Var3, le1Var2, str, str9, str2, je1Var6, je1Var8, le1Var, mi2Var4, mi2Var5, mi2Var9, je1Var, je1Var3, (lf0) obj, (ck0) obj2, iIntValue);
                }
            }, kk0Var2, 54), kk0Var, (i14 >> 9) & 14, 384, 4090);
            str5 = str9;
            je1Var4 = je1Var8;
            ne1Var3 = ne1Var4;
        } else {
            kk0Var2.V();
            je1Var4 = je1Var2;
            str5 = str4;
            kk0Var = kk0Var2;
            ne1Var3 = ne1Var2;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: op
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = sf3.V(i | 1);
                    int iV2 = sf3.V(i2);
                    zp.AvatarPickerSheet(avatarCatalogue, str, le1Var, avatarView, z, z2, str2, str5, le1Var2, je1Var, le1Var3, ne1Var3, je1Var4, je1Var3, (ck0) obj, iV, iV2, i3);
                    return w84.a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:220:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:222:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:223:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:233:0x0823  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v33 */
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
    public static final w84 AvatarPickerSheet$lambda$81(final AvatarView avatarView, final boolean z, AvatarCatalogue avatarCatalogue, final le1 le1Var, final le1 le1Var2, final String str, final String str2, final String str3, je1 je1Var, je1 je1Var2, le1 le1Var3, mi2 mi2Var, final mi2 mi2Var2, mi2 mi2Var3, je1 je1Var3, je1 je1Var4, lf0 lf0Var, ck0 ck0Var, int i) {
        boolean z2;
        ?? r13;
        kk0 kk0Var;
        long jF;
        long j;
        Object obj;
        int i2;
        String strStringResource;
        long jF2;
        ?? r14;
        Object obj2;
        Integer numValueOf;
        int i3;
        int i4;
        int i5;
        String str4;
        boolean z3;
        long jB;
        long jF3;
        Map<String, String> labels;
        int i6;
        lf0Var.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        boolean zS = kk0Var2.S(i & 1, (i & 17) != 16);
        xk xkVar = kk0Var2.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarO = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.m(d.a, 20.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 24.0f, 7);
            wt start = Alignment$Companion.getStart();
            dl dlVar = hl.c;
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(dlVar, start, kk0Var2, 0);
            xk xkVar2 = xkVar;
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN = kk0Var2.n();
            c cVarD = b.d(kk0Var2, cVarO);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar2 == null) {
                rj0.a();
                throw null;
            }
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor);
            } else {
                kk0Var2.o0();
            }
            pe peVarH = fq2.h(kk0Var2, vb2VarColumnMeasurePolicy, kk0Var2, su2VarN);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var2, cVarD, ComposeUiNode$Companion.getSetModifier());
            c cVarA = mb3.a(new LayoutWeightElement(1.0f, false), mb3.rememberScrollState(0, kk0Var2, 0, 1), true);
            vb2 vb2VarColumnMeasurePolicy2 = if0.columnMeasurePolicy(dlVar, Alignment$Companion.getStart(), kk0Var2, 0);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN2 = kk0Var2.n();
            c cVarD2 = b.d(kk0Var2, cVarA);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            if (xkVar2 == null) {
                rj0.a();
                throw null;
            }
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor2);
            } else {
                kk0Var2.o0();
            }
            pe peVarH2 = fq2.h(kk0Var2, vb2VarColumnMeasurePolicy2, kk0Var2, su2VarN2);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var2, cVarD2, ComposeUiNode$Companion.getSetModifier());
            String strStringResource2 = ko3.stringResource(R.string.ava_title, kk0Var2, 0);
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(strStringResource2, (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).g, (ck0) kk0Var2, 0, 0, 65534);
            kk0 kk0Var3 = kk0Var2;
            cm3.Spacer(d.d(modifier$Companion, 12.0f), kk0Var3, 6);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(new fl(8.0f), Alignment$Companion.getTop(), kk0Var3, 6);
            int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
            su2 su2VarN3 = kk0Var3.n();
            c cVarD3 = b.d(kk0Var3, modifier$Companion);
            d4 constructor3 = ComposeUiNode$Companion.getConstructor();
            if (xkVar2 == null) {
                rj0.a();
                throw null;
            }
            kk0Var3.e0();
            if (kk0Var3.O) {
                kk0Var3.m(constructor3);
            } else {
                kk0Var3.o0();
            }
            pe peVarH3 = fq2.h(kk0Var3, vb2VarRowMeasurePolicy, kk0Var3, su2VarN3);
            if (kk0Var3.O || !kr1.n(kk0Var3.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                fq2.v(currentCompositeKeyHash3, kk0Var3, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var3, cVarD3, ComposeUiNode$Companion.getSetModifier());
            kk0Var3.a0(-239867572);
            for (ps2 ps2Var : kr1.U(new ps2("me", Integer.valueOf(R.string.ava_who_me)), new ps2("ai", Integer.valueOf(R.string.ava_who_ai)))) {
                String str5 = (String) ps2Var.c;
                int iIntValue = ((Number) ps2Var.d).intValue();
                boolean zN = kr1.n(str, str5);
                boolean zH = kk0Var3.h(le1Var3) | kk0Var3.h(str5);
                Object objP = kk0Var3.P();
                if (zH || objP == Composer$Companion.getEmpty()) {
                    i6 = 0;
                    objP = new pp(le1Var3, str5, i6);
                    kk0Var3.l0(objP);
                } else {
                    i6 = 0;
                }
                kk0 kk0Var4 = kk0Var3;
                pc0.FilterChip(zN, (je1) objP, zg0.rememberComposableLambda(-1337146056, true, new qp(iIntValue, i6), kk0Var3, 54), null, false, zg0.rememberComposableLambda(358255765, true, new rp(str5, str, avatarView, str3), kk0Var3, 54), null, null, d71.a.m179x44404745(0L, 0L, 0L, 0L, 0L, 0L, 0L, re0.b(0.16f, gx.getBrandGreen(kk0Var3, 0)), 0L, ab2Var.getColorScheme(kk0Var3, 0).q, 0L, 0L, kk0Var4, 0, 0, 3455), null, null, null, kk0Var4, 196992, 0, 3800);
                kk0Var3 = kk0Var4;
            }
            kk0Var3.r(false);
            kk0Var3.r(true);
            Modifier$Companion modifier$Companion2 = c.i;
            cm3.Spacer(d.d(modifier$Companion2, 8.0f), kk0Var3, 6);
            uy3.m1842xe1e389ce(ko3.stringResource(z ? R.string.ava_lead : R.string.ava_lead_free, kk0Var3, 0), (c) null, ab2Var.getColorScheme(kk0Var3, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var3, 0).l, (ck0) kk0Var3, 0, 0, 65530);
            cm3.Spacer(d.d(modifier$Companion2, 12.0f), kk0Var3, 6);
            List<String> categories = avatarCatalogue != null ? avatarCatalogue.getCategories() : null;
            List<AvatarItem> list = z21.c;
            if (categories == null) {
                categories = list;
            }
            if (categories.isEmpty()) {
                z2 = false;
                kk0Var3.a0(263651380);
            } else {
                kk0Var3.a0(274405528);
                c cVarA2 = mb3.a(modifier$Companion2, mb3.rememberScrollState(0, kk0Var3, 0, 1), false);
                vb2 vb2VarRowMeasurePolicy2 = e83.rowMeasurePolicy(new fl(8.0f), Alignment$Companion.getTop(), kk0Var3, 6);
                int currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
                su2 su2VarN4 = kk0Var3.n();
                c cVarD4 = b.d(kk0Var3, cVarA2);
                androidx.compose.ui.node.a.j.getClass();
                d4 constructor4 = ComposeUiNode$Companion.getConstructor();
                if (xkVar2 == null) {
                    rj0.a();
                    throw null;
                }
                kk0Var3.e0();
                if (kk0Var3.O) {
                    kk0Var3.m(constructor4);
                } else {
                    kk0Var3.o0();
                }
                pe peVarH4 = fq2.h(kk0Var3, vb2VarRowMeasurePolicy2, kk0Var3, su2VarN4);
                if (kk0Var3.O || !kr1.n(kk0Var3.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                    fq2.v(currentCompositeKeyHash4, kk0Var3, currentCompositeKeyHash4, peVarH4);
                }
                xp1.E(kk0Var3, cVarD4, ComposeUiNode$Companion.getSetModifier());
                kk0Var3.a0(-79674722);
                for (Iterator it = categories.iterator(); it.hasNext(); it = it) {
                    String str6 = (String) it.next();
                    switch (str6) {
                        case "effects":
                            i3 = R.string.ava_cat_effects;
                            numValueOf = Integer.valueOf(i3);
                            break;
                        case "cinema":
                            numValueOf = Integer.valueOf(R.string.ava_cat_cinema);
                            break;
                        case "men":
                            i4 = R.string.ava_cat_men;
                            numValueOf = Integer.valueOf(i4);
                            break;
                        case "anime":
                            i4 = R.string.ava_cat_anime;
                            numValueOf = Integer.valueOf(i4);
                            break;
                        case "basic":
                            i5 = R.string.ava_cat_basic;
                            numValueOf = Integer.valueOf(i5);
                            break;
                        case "women":
                            i5 = R.string.ava_cat_women;
                            numValueOf = Integer.valueOf(i5);
                            break;
                        case "cartoon":
                            i3 = R.string.ava_cat_cartoon;
                            numValueOf = Integer.valueOf(i3);
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                    if (avatarCatalogue == null || (labels = avatarCatalogue.getLabels()) == null || (str4 = labels.get(str6)) == null || mo3.C0(str4)) {
                        str4 = null;
                    }
                    boolean zH2 = kk0Var3.h(mi2Var) | kk0Var3.h(str6);
                    Object objP2 = kk0Var3.P();
                    if (zH2 || objP2 == Composer$Companion.getEmpty()) {
                        z3 = true;
                        objP2 = new ye(str6, true ? 1 : 0, mi2Var);
                        kk0Var3.l0(objP2);
                    } else {
                        z3 = true;
                    }
                    je1 je1Var5 = (je1) objP2;
                    wg0 wg0VarRememberComposableLambda = zg0.rememberComposableLambda(-1526252902, z3, new sp(str4, numValueOf, str6), kk0Var3, 54);
                    if (kr1.n((String) mi2Var.getValue(), str6)) {
                        kk0Var3.a0(-2501456);
                        jB = re0.b(0.16f, gx.getBrandGreen(kk0Var3, 0));
                        kk0Var3.r(false);
                    } else {
                        kk0Var3.a0(-2500472);
                        kk0Var3.r(false);
                        int i7 = re0.j;
                        jB = re0.h;
                    }
                    xb0 xb0VarM160x646e5be3 = bm.a.m160x646e5be3(jB, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var3, 0, 254);
                    if (kr1.n((String) mi2Var.getValue(), str6)) {
                        jF3 = fq2.f(kk0Var3, -2496697, kk0Var3, 0, false);
                    } else {
                        kk0Var3.a0(-2495356);
                        jF3 = ab2Var.getColorScheme(kk0Var3, 0).A;
                        kk0Var3.r(false);
                    }
                    pc0.AssistChip(je1Var5, (ne1) wg0VarRememberComposableLambda, (c) null, false, (ne1) null, (ne1) null, (rg3) null, xb0VarM160x646e5be3, (zb0) null, gm4.a(1.0f, jF3), (gh2) null, (ck0) kk0Var3, 48, 0, 1404);
                }
                z2 = false;
                kk0Var3.r(false);
                kk0Var3.r(true);
                cm3.Spacer(d.d(c.i, 12.0f), kk0Var3, 6);
            }
            kk0Var3.r(z2);
            List<AvatarItem> items = avatarCatalogue != null ? avatarCatalogue.getItems() : null;
            if (items != null) {
                list = items;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (kr1.n(((AvatarItem) obj3).getCat(), (String) mi2Var.getValue())) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj4 = arrayList.get(i8);
                i8++;
                if (((AvatarItem) obj4).isFree()) {
                    arrayList2.add(obj4);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj5 = arrayList.get(i9);
                i9++;
                if (!((AvatarItem) obj5).isFree()) {
                    arrayList3.add(obj5);
                }
            }
            final ArrayList arrayListH0 = ke0.H0(arrayList2, arrayList3);
            if (avatarCatalogue == null) {
                kk0Var3.a0(276253934);
                Modifier$Companion modifier$Companion3 = c.i;
                c cVarD5 = d.d(d.a, 160.0f);
                vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
                int currentCompositeKeyHash5 = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
                su2 su2VarN5 = kk0Var3.n();
                c cVarD6 = b.d(kk0Var3, cVarD5);
                androidx.compose.ui.node.a.j.getClass();
                d4 constructor5 = ComposeUiNode$Companion.getConstructor();
                if (xkVar2 == null) {
                    rj0.a();
                    throw null;
                }
                kk0Var3.e0();
                if (kk0Var3.O) {
                    kk0Var3.m(constructor5);
                } else {
                    kk0Var3.o0();
                }
                pe peVarH5 = fq2.h(kk0Var3, vb2VarC, kk0Var3, su2VarN5);
                if (kk0Var3.O || !kr1.n(kk0Var3.P(), Integer.valueOf(currentCompositeKeyHash5))) {
                    fq2.v(currentCompositeKeyHash5, kk0Var3, currentCompositeKeyHash5, peVarH5);
                }
                xp1.E(kk0Var3, cVarD6, ComposeUiNode$Companion.getSetModifier());
                r13 = 0;
                kk0 kk0Var5 = kk0Var3;
                z03.m1882xe8727fba(null, gx.getBrandGreen(kk0Var3, 0), 0.0f, 0L, 0, kk0Var5, 0, 29);
                kk0Var5.r(true);
                kk0Var5.r(false);
                xkVar2 = xkVar2;
                kk0Var = kk0Var5;
            } else {
                kk0 kk0Var6 = kk0Var3;
                kk0Var6.a0(276553549);
                qg1 qg1Var = new qg1();
                fl flVar = new fl(12.0f);
                fl flVar2 = new fl(12.0f);
                Modifier$Companion modifier$Companion4 = c.i;
                c cVarF = d.f(d.a, 0.0f, 360.0f, 1);
                boolean zJ = kk0Var6.j(arrayListH0) | kk0Var6.i(z) | kk0Var6.h(avatarView) | kk0Var6.h(le1Var) | kk0Var6.h(le1Var2) | kk0Var6.h(str) | kk0Var6.h(str2) | kk0Var6.h(str3);
                Object objP3 = kk0Var6.P();
                if (zJ || objP3 == Composer$Companion.getEmpty()) {
                    le1 le1Var4 = new le1() { // from class: tp
                        @Override // defpackage.le1
                        public final Object invoke(Object obj6) {
                            uy1 uy1Var = (uy1) obj6;
                            uy1Var.getClass();
                            f2 f2Var = new f2(4);
                            ArrayList arrayList4 = arrayListH0;
                            uy1Var.i.c(arrayList4.size(), new ty1(new rc(f2Var, 3, arrayList4), pe.C, new ta(arrayList4, 4), new yg0(699646206, new yp(arrayList4, z, avatarView, le1Var, le1Var2, mi2Var2, str, str2, str3), true)));
                            return w84.a;
                        }
                    };
                    kk0Var6.l0(le1Var4);
                    objP3 = le1Var4;
                }
                sy1.LazyVerticalGrid(qg1Var, cVarF, null, null, false, flVar2, flVar, null, false, null, (le1) objP3, kk0Var6, 1769520, 0, 924);
                kk0 kk0Var7 = kk0Var6;
                r13 = 0;
                kk0Var7.r(false);
                kk0Var = kk0Var7;
            }
            Modifier$Companion modifier$Companion5 = c.i;
            cm3.Spacer(d.d(modifier$Companion5, 14.0f), kk0Var, 6);
            y73 y73Var = z73.a;
            if (z) {
                jF = fq2.f(kk0Var, -1237887912, kk0Var, r13, r13);
            } else {
                kk0Var.a0(-1237886571);
                jF = ab2Var.getColorScheme(kk0Var, r13).A;
                kk0Var.r(r13);
            }
            iw iwVarA = gm4.a(1.0f, jF);
            uy uyVar = uy.a;
            if (z) {
                kk0Var.a0(-1237881833);
                j = ab2Var.getColorScheme(kk0Var, r13).q;
            } else {
                kk0Var.a0(-1237880514);
                j = ab2Var.getColorScheme(kk0Var, r13).s;
            }
            kk0Var.r(r13);
            ty tyVarM1839x817dfa16 = uyVar.m1839x817dfa16(0L, j, 0L, 0L, kk0Var, 0, 13);
            is2 is2VarA = androidx.compose.foundation.layout.a.a(0.0f, 12.0f, 1);
            FillElement fillElement = d.a;
            boolean zI = kk0Var.i(z) | kk0Var.h(je1Var) | kk0Var.h(je1Var2);
            Object objP4 = kk0Var.P();
            if (zI || objP4 == Composer$Companion.getEmpty()) {
                obj = objP4;
                up upVar = new up(z, je1Var, je1Var2, 0);
                kk0Var.l0(upVar);
                obj = upVar;
            }
            obj = objP4;
            bz.OutlinedButton((je1) obj, fillElement, false, y73Var, tyVarM1839x817dfa16, null, iwVarA, is2VarA, null, zg0.rememberComposableLambda(42348800, true, new oe1() { // from class: vp
                @Override // defpackage.oe1
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    int iIntValue2 = ((Integer) obj8).intValue();
                    return zp.AvatarPickerSheet$lambda$81$lambda$80$lambda$76$lambda$74(z, (g83) obj6, (ck0) obj7, iIntValue2);
                }
            }, kk0Var, 54), kk0Var, 817889328, 292);
            String str7 = (String) mi2Var3.getValue();
            if (str7 == null) {
                kk0Var.a0(281039620);
            } else {
                kk0Var.a0(281039621);
                cm3.Spacer(d.d(modifier$Companion5, 6.0f), kk0Var, 6);
                uy3.m1842xe1e389ce(str7, (c) null, ab2Var.getColorScheme(kk0Var, 0).w, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).l, (ck0) kk0Var, 0, 0, 65530);
            }
            kk0Var.r(false);
            kk0Var.r(true);
            cm3.Spacer(d.d(modifier$Companion5, 12.0f), kk0Var, 6);
            if (((String) mi2Var2.getValue()) == null) {
                i2 = 0;
                if (z) {
                    kk0Var.a0(847191718);
                    kk0Var.r(false);
                    strStringResource = BuildConfig.VERSION_NAME;
                } else {
                    kk0Var.a0(997157951);
                    strStringResource = ko3.stringResource(R.string.ava_locked_msg, kk0Var, 0);
                    kk0Var.r(false);
                }
            } else if (kr1.n(avatarView != null ? avatarView.getRef() : null, (String) mi2Var2.getValue())) {
                kk0Var.a0(997155738);
                i2 = 0;
                strStringResource = ko3.stringResource(R.string.ava_saved, kk0Var, 0);
                kk0Var.r(false);
            } else {
                i2 = 0;
                if (z) {
                    kk0Var.a0(997157951);
                    strStringResource = ko3.stringResource(R.string.ava_locked_msg, kk0Var, 0);
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(847191718);
                    kk0Var.r(false);
                    strStringResource = BuildConfig.VERSION_NAME;
                }
            }
            String str8 = strStringResource;
            uz3 uz3Var = ab2Var.getTypography(kk0Var, i2).l;
            if (((String) mi2Var2.getValue()) == null) {
                kk0Var.a0(997167272);
                jF2 = ab2Var.getColorScheme(kk0Var, 0).s;
                kk0Var.r(false);
            } else if (kr1.n(avatarView != null ? avatarView.getRef() : null, (String) mi2Var2.getValue())) {
                jF2 = fq2.f(kk0Var, 997165154, kk0Var, 0, false);
            } else {
                kk0Var.a0(997167272);
                jF2 = ab2Var.getColorScheme(kk0Var, 0).s;
                kk0Var.r(false);
            }
            uy3.m1842xe1e389ce(str8, (c) null, jF2, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 1, (le1) null, uz3Var, (ck0) kk0Var, 0, 24576, 49146);
            cm3.Spacer(d.d(modifier$Companion5, 10.0f), kk0Var, 6);
            vb2 vb2VarRowMeasurePolicy3 = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var, 48);
            int currentCompositeKeyHash6 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN6 = kk0Var.n();
            c cVarD7 = b.d(kk0Var, modifier$Companion5);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor6 = ComposeUiNode$Companion.getConstructor();
            if (xkVar2 == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor6);
            } else {
                kk0Var.o0();
            }
            pe peVarH6 = fq2.h(kk0Var, vb2VarRowMeasurePolicy3, kk0Var, su2VarN6);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash6))) {
                fq2.v(currentCompositeKeyHash6, kk0Var, currentCompositeKeyHash6, peVarH6);
            }
            xp1.E(kk0Var, cVarD7, ComposeUiNode$Companion.getSetModifier());
            if (avatarView == null || kr1.n(avatarView.getKind(), "none")) {
                r14 = 0;
                kk0Var.a0(-1769585338);
            } else {
                kk0Var.a0(-1751071301);
                boolean zH3 = kk0Var.h(je1Var3);
                Object objP5 = kk0Var.P();
                if (zH3 || objP5 == Composer$Companion.getEmpty()) {
                    obj2 = objP5;
                    wp wpVar = new wp(je1Var3, mi2Var2, 0);
                    kk0Var.l0(wpVar);
                    obj2 = wpVar;
                }
                obj2 = objP5;
                bz.TextButton((je1) obj2, null, false, null, null, null, null, null, null, zh0.a, kk0Var, 805306368, 510);
                r14 = 0;
            }
            kk0Var.r(r14);
            cm3.Spacer(new LayoutWeightElement(1.0f, true), kk0Var, r14);
            bz.Button(je1Var4, null, false, y73Var, uyVar.m1833x1b9ca94(gx.getBrandGreen(kk0Var, r14), gx.getBrandOnAccent(kk0Var, r14), 0L, 0L, kk0Var, 0, 12), null, null, new is2(28.0f, 10.0f, 28.0f, 10.0f), null, zh0.b, kk0Var, 817889280, 358);
            kk0Var.r(true);
            kk0Var.r(true);
        } else {
            kk0Var2.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AvatarPickerSheet$lambda$81$lambda$80$lambda$76$lambda$47$lambda$46$lambda$44(int i, ck0 ck0Var, int i2) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i2 & 1, (i2 & 3) != 2)) {
            uy3.m1842xe1e389ce(ko3.stringResource(i, kk0Var, 0), (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131070);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AvatarPickerSheet$lambda$81$lambda$80$lambda$76$lambda$47$lambda$46$lambda$45(String str, String str2, AvatarView avatarView, String str3, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            if (!kr1.n(str, str2)) {
                avatarView = null;
            }
            m1895xb7a067f0(avatarView, str, 20.0f, str3, null, kk0Var, 384, 16);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AvatarPickerSheet$lambda$81$lambda$80$lambda$76$lambda$54$lambda$53$lambda$52(String str, Integer num, String str2, ck0 ck0Var, int i) {
        String strStringResource;
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            if (str == null) {
                kk0Var.a0(-2076378450);
                if (num == null) {
                    kk0Var.a0(-2076378451);
                    kk0Var.r(false);
                    strStringResource = null;
                } else {
                    kk0Var.a0(-2076378450);
                    strStringResource = ko3.stringResource(num.intValue(), kk0Var, 0);
                    kk0Var.r(false);
                }
                kk0Var.r(false);
            } else {
                kk0Var.a0(-2145190614);
                kk0Var.r(false);
                strStringResource = str;
            }
            uy3.m1842xe1e389ce(strStringResource == null ? str2 : strStringResource, (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131070);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 AvatarPickerSheet$lambda$81$lambda$80$lambda$76$lambda$74(boolean z, g83 g83Var, ck0 ck0Var, int i) {
        ym1 lock;
        long jF;
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            s22 s22Var = s22.a;
            if (z) {
                kk0Var.a0(2042493993);
                lock = s22Var.getImagePlus(kk0Var, 6);
            } else {
                kk0Var.a0(2042494564);
                lock = s22Var.getLock(kk0Var, 6);
            }
            kk0Var.r(false);
            ym1 ym1Var = lock;
            Modifier$Companion modifier$Companion = c.i;
            c cVarJ = d.j(modifier$Companion, 18.0f);
            if (z) {
                jF = fq2.f(kk0Var, 2042497994, kk0Var, 0, false);
            } else {
                kk0Var.a0(2042499344);
                jF = ab2.a.getColorScheme(kk0Var, 0).s;
                kk0Var.r(false);
            }
            ul1.m1829xf2a7a69(ym1Var, (String) null, cVarJ, jF, kk0Var, 432, 0);
            cm3.Spacer(d.n(modifier$Companion, 8.0f), kk0Var, 6);
            String strStringResource = ko3.stringResource(R.string.ava_upload, kk0Var, 0);
            ic1 ic1Var = ic1.d;
            uy3.m1842xe1e389ce(strStringResource, (c) null, 0L, 0L, (gc1) null, ic1.l, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 196608, 0, 131038);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static final long f(String str, long j) {
        Object i63Var;
        long jB;
        try {
            String strJ0 = mo3.J0(mo3.U0(str).toString(), "#");
            yo4.m(16);
            long j2 = Long.parseLong(strJ0, 16);
            int length = strJ0.length();
            if (length != 6) {
                jB = length != 8 ? j : gb2.b((int) j2);
            } else {
                jB = gb2.b((int) (j2 | 4278190080L));
            }
            i63Var = new re0(jB);
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        Object re0Var = new re0(j);
        if (i63Var instanceof i63) {
            i63Var = re0Var;
        }
        return ((re0) i63Var).a;
    }
}
