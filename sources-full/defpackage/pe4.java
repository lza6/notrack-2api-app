package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import notrack.ai.data.voice.VoiceConfig;
import notrack.ai.data.voice.VoiceOption;
import notrack.ai.data.voice.VoiceQuota;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class pe4 {
    public static final void QuotaRow(final String str, final String str2, final boolean z, final boolean z2, final boolean z3, ck0 ck0Var, final int i) {
        int i2;
        String str3;
        long jB;
        long jF;
        long jF2;
        str.getClass();
        str2.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1766159146);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= kk0Var.h(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.i(z) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var.i(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= kk0Var.i(z3) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if (kk0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            ab2 ab2Var = ab2.a;
            if (z2) {
                kk0Var.a0(766863261);
                jB = re0.b(0.09f, gx.getBrandGreen(kk0Var, 0));
                kk0Var.r(false);
            } else if (z) {
                kk0Var.a0(766865565);
                jB = re0.b(0.04f, ab2Var.getColorScheme(kk0Var, 0).q);
                kk0Var.r(false);
            } else {
                kk0Var.a0(766866901);
                kk0Var.r(false);
                jB = re0.h;
            }
            Modifier$Companion modifier$Companion = c.i;
            c cVarL = a.l(androidx.compose.foundation.a.b(d.a, jB, k43.a), 14.0f, 11.0f);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var, 48);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarL);
            androidx.compose.ui.node.a.j.getClass();
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
            pe peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            uz3 uz3Var = ab2Var.getTypography(kk0Var, 0).k;
            if (z2) {
                jF = fq2.f(kk0Var, 1689075248, kk0Var, 0, false);
            } else {
                kk0Var.a0(1689076598);
                jF = ab2Var.getColorScheme(kk0Var, 0).s;
                kk0Var.r(false);
            }
            int i3 = i2;
            uy3.m1842xe1e389ce(str, (c) null, jF, 0L, (gc1) null, z2 ? ic1.l : ic1.h, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var, (ck0) kk0Var, i2 & 14, 0, 65498);
            kk0 kk0Var2 = kk0Var;
            if (z) {
                kk0Var2.a0(821897529);
                uy3.m1842xe1e389ce(fq2.m("  ·  ", ko3.stringResource(R.string.voice_gate_yours, kk0Var2, 0)), (c) null, re0.b(0.7f, ab2Var.getColorScheme(kk0Var2, 0).s), 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).o, (ck0) kk0Var2, 0, 0, 65530);
                kk0Var2 = kk0Var2;
            } else {
                kk0Var2.a0(800472220);
            }
            kk0Var2.r(false);
            cm3.Spacer(new LayoutWeightElement(1.0f, true), kk0Var2, 0);
            uz3 uz3Var2 = ab2Var.getTypography(kk0Var2, 0).k;
            ic1 ic1Var = ic1.n;
            if (z2) {
                jF2 = fq2.f(kk0Var2, 1689095280, kk0Var2, 0, false);
            } else {
                kk0Var2.a0(1689096623);
                jF2 = ab2Var.getColorScheme(kk0Var2, 0).q;
                kk0Var2.r(false);
            }
            kk0 kk0Var3 = kk0Var2;
            uy3.m1842xe1e389ce(str3, (c) null, jF2, 0L, (gc1) null, ic1Var, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var2, (ck0) kk0Var3, ((i3 >> 3) & 14) | 196608, 0, 65498);
            kk0Var = kk0Var3;
            kk0Var.r(true);
            if (z3) {
                kk0Var.a0(-2017830632);
            } else {
                kk0Var.a0(-1995870139);
                fx0.m192xfb3e0e9b(null, 0.0f, re0.b(0.06f, ab2Var.getColorScheme(kk0Var, 0).q), kk0Var, 0, 3);
            }
            kk0Var.r(false);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: oe4
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pe4.QuotaRow(str, str2, z, z2, z3, (ck0) obj, sf3.V(i | 1));
                    return w84.a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
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
    public static final void SpeakActionIcon(final boolean z, final boolean z2, final float f, final String str, final je1 je1Var, ck0 ck0Var, final int i) {
        int i2;
        kk0 kk0Var;
        ab2 ab2Var;
        Modifier$Companion modifier$Companion;
        ?? r4;
        kk0 kk0Var2;
        ym1 volume;
        long jB;
        str.getClass();
        je1Var.getClass();
        kk0 kk0Var3 = (kk0) ck0Var;
        kk0Var3.c0(-1318669076);
        if ((i & 6) == 0) {
            i2 = (kk0Var3.i(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var3.i(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var3.e(f) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var3.h(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= kk0Var3.j(je1Var) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if (kk0Var3.S(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier$Companion modifier$Companion2 = c.i;
            c cVarE = androidx.compose.foundation.a.e(xr0.N(d.j(modifier$Companion2, 28.0f), z73.a), false, null, je1Var, 7);
            vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
            su2 su2VarN = kk0Var3.n();
            c cVarD = b.d(kk0Var3, cVarE);
            androidx.compose.ui.node.a.j.getClass();
            je1 constructor = ComposeUiNode$Companion.getConstructor();
            if (kk0Var3.a == null) {
                rj0.a();
                throw null;
            }
            kk0Var3.e0();
            if (kk0Var3.O) {
                kk0Var3.m(constructor);
            } else {
                kk0Var3.o0();
            }
            pe peVarH = fq2.h(kk0Var3, vb2VarC, kk0Var3, su2VarN);
            if (kk0Var3.O || !kr1.n(kk0Var3.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var3, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var3, cVarD, ComposeUiNode$Companion.getSetModifier());
            ab2 ab2Var2 = ab2.a;
            if (z) {
                kk0Var3.a0(1613965159);
                if (z2) {
                    kk0Var3.a0(1613976908);
                    kk0 kk0Var4 = kk0Var3;
                    ab2Var = ab2Var2;
                    r4 = 0;
                    modifier$Companion = modifier$Companion2;
                    z03.m1882xe8727fba(d.j(modifier$Companion2, 22.0f), gx.getBrandGreen(kk0Var3, 0), 2.0f, 0L, 0, kk0Var4, 390, 24);
                    kk0Var4.r(false);
                    kk0Var2 = kk0Var4;
                } else {
                    ab2 ab2Var3 = ab2Var2;
                    modifier$Companion = modifier$Companion2;
                    r4 = 0;
                    kk0Var3.a0(1614193567);
                    boolean z3 = (i2 & 896) == 256;
                    Object objP = kk0Var3.P();
                    if (z3 || objP == Composer$Companion.getEmpty()) {
                        objP = new je1() { // from class: je4
                            @Override // defpackage.je1
                            public final Object invoke() {
                                return Float.valueOf(f);
                            }
                        };
                        kk0Var3.l0(objP);
                    }
                    z03.m1881x4c2c3c0b((je1) objP, d.j(modifier$Companion, 22.0f), gx.getBrandGreen(kk0Var3, 0), 2.0f, re0.b(0.2f, ab2Var3.getColorScheme(kk0Var3, 0).s), 0, 0.0f, kk0Var3, 3120, 96);
                    kk0 kk0Var5 = kk0Var3;
                    kk0Var5.r(false);
                    ab2Var = ab2Var3;
                    kk0Var2 = kk0Var5;
                }
            } else {
                ab2Var = ab2Var2;
                modifier$Companion = modifier$Companion2;
                r4 = 0;
                kk0 kk0Var6 = kk0Var3;
                kk0Var6.a0(1605416444);
                kk0Var2 = kk0Var6;
            }
            kk0Var2.r(r4);
            s22 s22Var = s22.a;
            if (z) {
                kk0Var2.a0(-1194842228);
                volume = s22Var.getSquare(kk0Var2, 6);
            } else {
                kk0Var2.a0(-1194841748);
                volume = s22Var.getVolume(kk0Var2, 6);
            }
            kk0Var2.r(r4);
            c cVarJ = d.j(modifier$Companion, 14.0f);
            if (z) {
                jB = fq2.f(kk0Var2, -1194837296, kk0Var2, r4, r4);
            } else {
                kk0Var2.a0(-1194834792);
                jB = re0.b(0.5f, ab2Var.getColorScheme(kk0Var2, r4).s);
                kk0Var2.r(r4);
            }
            kk0 kk0Var7 = kk0Var2;
            ul1.m1829xf2a7a69(volume, str, cVarJ, jB, kk0Var7, ((i2 >> 6) & 112) | 384, 0);
            kk0 kk0Var8 = kk0Var7;
            kk0Var8.r(true);
            kk0Var = kk0Var8;
        } else {
            kk0 kk0Var9 = kk0Var3;
            kk0Var9.V();
            kk0Var = kk0Var9;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: ke4
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pe4.SpeakActionIcon(z, z2, f, str, je1Var, (ck0) obj, sf3.V(i | 1));
                    return w84.a;
                }
            });
        }
    }

    public static final void VoiceDock(final we4 we4Var, final je1 je1Var, final je1 je1Var2, final je1 je1Var3, final je1 je1Var4, final je1 je1Var5, ck0 ck0Var, final int i) {
        int i2;
        final je1 je1Var6;
        je1 je1Var7;
        je1 je1Var8;
        je1 je1Var9;
        je1 je1Var10;
        we4Var.getClass();
        je1Var.getClass();
        je1Var2.getClass();
        je1Var3.getClass();
        je1Var4.getClass();
        je1Var5.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(245094302);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(we4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            je1Var6 = je1Var;
            i2 |= kk0Var.j(je1Var6) ? 32 : 16;
        } else {
            je1Var6 = je1Var;
        }
        if ((i & 384) == 0) {
            je1Var7 = je1Var2;
            i2 |= kk0Var.j(je1Var7) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        } else {
            je1Var7 = je1Var2;
        }
        if ((i & 3072) == 0) {
            je1Var8 = je1Var3;
            i2 |= kk0Var.j(je1Var8) ? 2048 : 1024;
        } else {
            je1Var8 = je1Var3;
        }
        if ((i & 24576) == 0) {
            je1Var9 = je1Var4;
            i2 |= kk0Var.j(je1Var9) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        } else {
            je1Var9 = je1Var4;
        }
        if ((196608 & i) == 0) {
            je1Var10 = je1Var5;
            i2 |= kk0Var.j(je1Var10) ? 131072 : 65536;
        } else {
            je1Var10 = je1Var5;
        }
        if (kk0Var.S(i2 & 1, (74899 & i2) != 74898)) {
            final je1 je1Var11 = je1Var8;
            final je1 je1Var12 = je1Var7;
            final je1 je1Var13 = je1Var10;
            final je1 je1Var14 = je1Var9;
            nf.AnimatedVisibility(we4Var.a, (c) null, androidx.compose.animation.b.e(null, 3).a(androidx.compose.animation.b.d(null, 15)), androidx.compose.animation.b.f(null, 3).a(androidx.compose.animation.b.j(null, 15)), (String) null, zg0.rememberComposableLambda(-984853898, true, new oe1() { // from class: me4
                @Override // defpackage.oe1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return pe4.VoiceDock$lambda$4(we4Var, je1Var6, je1Var13, je1Var12, je1Var11, je1Var14, (pf) obj, (ck0) obj2, iIntValue);
                }
            }, kk0Var, 54), kk0Var, 200064, 18);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: ne4
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pe4.VoiceDock(we4Var, je1Var, je1Var2, je1Var3, je1Var4, je1Var5, (ck0) obj, sf3.V(i | 1));
                    return w84.a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 VoiceDock$lambda$4(we4 we4Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, je1 je1Var5, pf pfVar, ck0 ck0Var, int i) {
        pfVar.getClass();
        long j = ab2.a.getColorScheme(ck0Var, 0).r;
        y73 y73VarA = z73.a(16.0f);
        Modifier$Companion modifier$Companion = c.i;
        hq3.m210x8dcae10(a.l(d.a, 12.0f, 6.0f), y73VarA, j, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1772378415, true, new k70(we4Var, je1Var, je1Var2, je1Var3, je1Var4, je1Var5), ck0Var, 54), ck0Var, 12582918, 120);
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 VoiceDock$lambda$4$lambda$3(we4 we4Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, je1 je1Var5, ck0 ck0Var, int i) {
        double d;
        double d2;
        String str;
        int i2;
        ym1 pause;
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        boolean zS = kk0Var2.S(i & 1, (i & 3) != 2);
        xk xkVar = kk0Var2.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarK = a.k(modifier$Companion, 8.0f);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(new fl(8.0f), Alignment$Companion.getCenterVertically(), kk0Var2, 54);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN = kk0Var2.n();
            c cVarD = b.d(kk0Var2, cVarK);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor);
            } else {
                kk0Var2.o0();
            }
            pe peVarH = fq2.h(kk0Var2, vb2VarRowMeasurePolicy, kk0Var2, su2VarN);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var2, cVarD, ComposeUiNode$Companion.getSetModifier());
            c cVarB = androidx.compose.foundation.a.b(xr0.N(d.j(modifier$Companion, 44.0f), z73.a(12.0f)), gx.getBrandGreen(kk0Var2, 0), k43.a);
            boolean z = we4Var.d;
            double d3 = we4Var.g;
            double d4 = we4Var.f;
            c cVarE = androidx.compose.foundation.a.e(cVarB, !z, null, je1Var, 6);
            vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN2 = kk0Var2.n();
            c cVarD2 = b.d(kk0Var2, cVarE);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor2);
            } else {
                kk0Var2.o0();
            }
            pe peVarH2 = fq2.h(kk0Var2, vb2VarC, kk0Var2, su2VarN2);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var2, cVarD2, ComposeUiNode$Companion.getSetModifier());
            if (we4Var.d) {
                kk0Var2.a0(492692376);
                d = d3;
                d2 = d4;
                str = null;
                i2 = 6;
                z03.m1882xe8727fba(d.j(modifier$Companion, 20.0f), gx.getBrandOnAccent(kk0Var2, 0), 2.0f, 0L, 0, kk0Var2, 390, 24);
                kk0Var = kk0Var2;
                kk0Var.r(false);
            } else {
                d = d3;
                d2 = d4;
                str = null;
                i2 = 6;
                kk0Var2.a0(492957364);
                boolean z2 = we4Var.e;
                s22 s22Var = s22.a;
                if (z2) {
                    kk0Var2.a0(-399737429);
                    pause = s22Var.getPlay(kk0Var2, 6);
                } else {
                    kk0Var2.a0(-399737012);
                    pause = s22Var.getPause(kk0Var2, 6);
                }
                kk0Var2.r(false);
                ul1.m1829xf2a7a69(pause, (String) null, d.j(modifier$Companion, 22.0f), gx.getBrandOnAccent(kk0Var2, 0), kk0Var2, 432, 0);
                kk0Var = kk0Var2;
                kk0Var.r(false);
            }
            kk0Var.r(true);
            c cVarE2 = androidx.compose.foundation.a.e(new LayoutWeightElement(1.0f, true), false, str, je1Var2, 7);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
            int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN3 = kk0Var.n();
            c cVarD3 = b.d(kk0Var, cVarE2);
            d4 constructor3 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor3);
            } else {
                kk0Var.o0();
            }
            pe peVarH3 = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN3);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
            String str2 = i(d2) + " / " + i(d);
            ab2 ab2Var = ab2.a;
            kk0 kk0Var3 = kk0Var;
            uy3.m1842xe1e389ce(str2, (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).n, (ck0) kk0Var3, 0, 0, 65530);
            cm3.Spacer(d.d(modifier$Companion, 4.0f), kk0Var3, i2);
            VoiceWave(d <= 0.0d ? 0.0f : (float) py.v(d2 / d, 0.0d, 1.0d), kk0Var3, 0);
            kk0Var3.r(true);
            rl1.IconButton(je1Var3, d.j(modifier$Companion, 36.0f), false, null, null, qj0.a, kk0Var3, 196656, 28);
            float f = we4Var.h;
            int i3 = (int) f;
            uy3.m1842xe1e389ce(ud2.p(f == ((float) i3) ? String.valueOf(i3) : mo3.X0(mo3.X0(String.valueOf(f), '0'), '.'), "×"), a.l(androidx.compose.foundation.a.e(xr0.N(modifier$Companion, z73.a(8.0f)), false, null, je1Var4, 7), 8.0f, 6.0f), ab2Var.getColorScheme(kk0Var3, 0).s, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var3, 0).n, (ck0) kk0Var3, 196608, 0, 65496);
            rl1.IconButton(je1Var5, d.j(modifier$Companion, 36.0f), false, null, null, qj0.b, kk0Var3, 196656, 28);
            kk0Var3.r(true);
        } else {
            kk0Var2.V();
        }
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb A[EDGE_INSN: B:81:0x00eb->B:89:0x0105 BREAK  A[LOOP:0: B:83:0x00f1->B:97:?]] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x016f  */
    /* JADX WARN: Code duplicated, block: B:93:0x017c  */
    /* JADX WARN: Code duplicated, block: B:95:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[LOOP:0: B:83:0x00f1->B:97:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x00af, please report this as an issue */
    public static final void VoiceGateDialog(final VoiceQuota voiceQuota, VoiceConfig voiceConfig, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, ck0 ck0Var, int i, int i2) {
        int i3;
        je1 je1Var5;
        int i4;
        je1 je1Var6;
        int i5;
        boolean z;
        kk0 kk0Var;
        je1 je1Var7;
        je1 je1Var8;
        w33 w33VarV;
        je1 je1Var9;
        Map<String, Integer> quotas;
        String plan;
        final String str;
        final Map<String, Integer> map;
        List listU;
        Iterator it;
        final boolean z2;
        int i6;
        voiceQuota.getClass();
        je1Var4.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-35375759);
        if ((i & 6) == 0) {
            i3 = (kk0Var2.h(voiceQuota) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? kk0Var2.h(voiceConfig) : kk0Var2.j(voiceConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= kk0Var2.j(je1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                je1Var5 = je1Var2;
                i3 |= kk0Var2.j(je1Var5) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    je1Var6 = je1Var3;
                    if (kk0Var2.j(je1Var6)) {
                        i5 = 16384;
                    } else {
                        i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    if (kk0Var2.j(je1Var4)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var2.S(i3 & 1, z)) {
                    if (i7 != 0) {
                        je1Var9 = null;
                    } else {
                        je1Var9 = je1Var5;
                    }
                    quotas = null;
                    final je1 je1Var10 = i4 == 0 ? je1Var6 : null;
                    plan = voiceQuota.getPlan();
                    if (mo3.C0(plan)) {
                        str = "free";
                    } else {
                        str = plan;
                    }
                    final boolean z3 = !str.equals("free");
                    if (voiceConfig != null) {
                        quotas = voiceConfig.getQuotas();
                    }
                    if (quotas == null) {
                        quotas = a31.c;
                    }
                    map = quotas;
                    listU = kr1.U("free", "plus", "pro");
                    if (listU.isEmpty()) {
                        it = listU.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z2 = true;
                                break;
                            } else if (map.get((String) it.next()) != null) {
                                z2 = false;
                                break;
                            }
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                    kk0Var = kk0Var2;
                    i9.m215x93865de1(je1Var4, zg0.rememberComposableLambda(-430393927, true, new oj1(je1Var, str, je1Var9, 3), kk0Var2, 54), null, zg0.rememberComposableLambda(236987963, true, new g10(je1Var4, 8), kk0Var2, 54), qj0.f, zg0.rememberComposableLambda(904369853, true, new z70(5, z3), kk0Var2, 54), zg0.rememberComposableLambda(-909422850, true, new ne1() { // from class: ie4
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return pe4.VoiceGateDialog$lambda$35(z3, map, voiceQuota, z2, je1Var10, str, (ck0) obj, iIntValue);
                        }
                    }, kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i3 >> 15) & 14) | 1797168, 0, 16260);
                    je1Var7 = je1Var9;
                    je1Var8 = je1Var10;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    je1Var7 = je1Var5;
                    je1Var8 = je1Var6;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new sr2(voiceQuota, voiceConfig, je1Var, je1Var7, je1Var8, je1Var4, i, i2, 1));
                }
            }
            i3 |= 24576;
            je1Var6 = je1Var3;
            if ((196608 & i) == 0) {
                if (kk0Var2.j(je1Var4)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i3 & 1, z)) {
                if (i7 != 0) {
                    je1Var9 = null;
                } else {
                    je1Var9 = je1Var5;
                }
                quotas = null;
                if (i4 == 0) {
                }
                plan = voiceQuota.getPlan();
                if (mo3.C0(plan)) {
                    str = "free";
                } else {
                    str = plan;
                }
                final boolean z4 = !str.equals("free");
                if (voiceConfig != null) {
                    quotas = voiceConfig.getQuotas();
                }
                if (quotas == null) {
                    quotas = a31.c;
                }
                map = quotas;
                listU = kr1.U("free", "plus", "pro");
                if (listU.isEmpty()) {
                    it = listU.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z2 = true;
                            break;
                        } else if (map.get((String) it.next()) != null) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    z2 = true;
                    break;
                }
                kk0Var = kk0Var2;
                i9.m215x93865de1(je1Var4, zg0.rememberComposableLambda(-430393927, true, new oj1(je1Var, str, je1Var9, 3), kk0Var2, 54), null, zg0.rememberComposableLambda(236987963, true, new g10(je1Var4, 8), kk0Var2, 54), qj0.f, zg0.rememberComposableLambda(904369853, true, new z70(5, z4), kk0Var2, 54), zg0.rememberComposableLambda(-909422850, true, new ne1() { // from class: ie4
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return pe4.VoiceGateDialog$lambda$35(z4, map, voiceQuota, z2, je1Var10, str, (ck0) obj, iIntValue);
                    }
                }, kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i3 >> 15) & 14) | 1797168, 0, 16260);
                je1Var7 = je1Var9;
                je1Var8 = je1Var10;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                je1Var7 = je1Var5;
                je1Var8 = je1Var6;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new sr2(voiceQuota, voiceConfig, je1Var, je1Var7, je1Var8, je1Var4, i, i2, 1));
            }
        }
        i3 |= 3072;
        je1Var5 = je1Var2;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                je1Var6 = je1Var3;
                if (kk0Var2.j(je1Var6)) {
                    i5 = 16384;
                } else {
                    i5 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                if (kk0Var2.j(je1Var4)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i3 & 1, z)) {
                if (i7 != 0) {
                    je1Var9 = null;
                } else {
                    je1Var9 = je1Var5;
                }
                quotas = null;
                if (i4 == 0) {
                }
                plan = voiceQuota.getPlan();
                if (mo3.C0(plan)) {
                    str = "free";
                } else {
                    str = plan;
                }
                final boolean z5 = !str.equals("free");
                if (voiceConfig != null) {
                    quotas = voiceConfig.getQuotas();
                }
                if (quotas == null) {
                    quotas = a31.c;
                }
                map = quotas;
                listU = kr1.U("free", "plus", "pro");
                if (listU.isEmpty()) {
                    it = listU.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z2 = true;
                            break;
                        } else if (map.get((String) it.next()) != null) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    z2 = true;
                    break;
                }
                kk0Var = kk0Var2;
                i9.m215x93865de1(je1Var4, zg0.rememberComposableLambda(-430393927, true, new oj1(je1Var, str, je1Var9, 3), kk0Var2, 54), null, zg0.rememberComposableLambda(236987963, true, new g10(je1Var4, 8), kk0Var2, 54), qj0.f, zg0.rememberComposableLambda(904369853, true, new z70(5, z5), kk0Var2, 54), zg0.rememberComposableLambda(-909422850, true, new ne1() { // from class: ie4
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return pe4.VoiceGateDialog$lambda$35(z5, map, voiceQuota, z2, je1Var10, str, (ck0) obj, iIntValue);
                    }
                }, kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i3 >> 15) & 14) | 1797168, 0, 16260);
                je1Var7 = je1Var9;
                je1Var8 = je1Var10;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                je1Var7 = je1Var5;
                je1Var8 = je1Var6;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new sr2(voiceQuota, voiceConfig, je1Var, je1Var7, je1Var8, je1Var4, i, i2, 1));
            }
        }
        i3 |= 24576;
        je1Var6 = je1Var3;
        if ((196608 & i) == 0) {
            if (kk0Var2.j(je1Var4)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var2.S(i3 & 1, z)) {
            if (i7 != 0) {
                je1Var9 = null;
            } else {
                je1Var9 = je1Var5;
            }
            quotas = null;
            if (i4 == 0) {
            }
            plan = voiceQuota.getPlan();
            if (mo3.C0(plan)) {
                str = "free";
            } else {
                str = plan;
            }
            final boolean z6 = !str.equals("free");
            if (voiceConfig != null) {
                quotas = voiceConfig.getQuotas();
            }
            if (quotas == null) {
                quotas = a31.c;
            }
            map = quotas;
            listU = kr1.U("free", "plus", "pro");
            if (listU.isEmpty()) {
                it = listU.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z2 = true;
                        break;
                    } else if (map.get((String) it.next()) != null) {
                        z2 = false;
                        break;
                    }
                }
            } else {
                z2 = true;
                break;
            }
            kk0Var = kk0Var2;
            i9.m215x93865de1(je1Var4, zg0.rememberComposableLambda(-430393927, true, new oj1(je1Var, str, je1Var9, 3), kk0Var2, 54), null, zg0.rememberComposableLambda(236987963, true, new g10(je1Var4, 8), kk0Var2, 54), qj0.f, zg0.rememberComposableLambda(904369853, true, new z70(5, z6), kk0Var2, 54), zg0.rememberComposableLambda(-909422850, true, new ne1() { // from class: ie4
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return pe4.VoiceGateDialog$lambda$35(z6, map, voiceQuota, z2, je1Var10, str, (ck0) obj, iIntValue);
                }
            }, kk0Var2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i3 >> 15) & 14) | 1797168, 0, 16260);
            je1Var7 = je1Var9;
            je1Var8 = je1Var10;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            je1Var7 = je1Var5;
            je1Var8 = je1Var6;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new sr2(voiceQuota, voiceConfig, je1Var, je1Var7, je1Var8, je1Var4, i, i2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 VoiceGateDialog$lambda$29(je1 je1Var, String str, je1 je1Var2, ck0 ck0Var, int i) {
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        if (kk0Var2.S(i & 1, (i & 3) != 2)) {
            if (je1Var == null || kr1.n(str, "pro")) {
                kk0Var = kk0Var2;
                kk0Var.a0(-1405226583);
            } else {
                kk0Var2.a0(-1387883757);
                wt centerHorizontally = Alignment$Companion.getCenterHorizontally();
                Modifier$Companion modifier$Companion = c.i;
                vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, centerHorizontally, kk0Var2, 48);
                int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
                su2 su2VarN = kk0Var2.n();
                c cVarD = b.d(kk0Var2, modifier$Companion);
                androidx.compose.ui.node.a.j.getClass();
                d4 constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var2.a == null) {
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
                bz.Button(je1Var, null, false, null, uy.a.m1833x1b9ca94(gx.getBrandGreen(kk0Var2, 0), 0L, 0L, 0L, kk0Var2, 0, 14), null, null, null, null, qj0.c, kk0Var2, 805306368, 494);
                kk0Var = kk0Var2;
                if (kr1.n(str, "plus") || kr1.n(str, "pro") || je1Var2 == null) {
                    kk0Var.a0(-187166408);
                } else {
                    kk0Var.a0(-169325815);
                    bz.TextButton(je1Var2, null, false, null, null, null, null, null, null, qj0.d, kk0Var, 805306368, 510);
                    kk0Var = kk0Var;
                }
                kk0Var.r(false);
                kk0Var.r(true);
            }
            kk0Var.r(false);
        } else {
            kk0Var2.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 VoiceGateDialog$lambda$30(je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            bz.OutlinedButton(je1Var, null, false, null, null, null, null, null, null, qj0.e, kk0Var, 805306368, 510);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 VoiceGateDialog$lambda$31(boolean z, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            String strStringResource = ko3.stringResource(z ? R.string.voice_gate_paid_title : R.string.voice_gate_title, kk0Var, 0);
            uz3 uz3Var = ab2.a.getTypography(kk0Var, 0).g;
            ic1 ic1Var = ic1.d;
            uy3.m1842xe1e389ce(strStringResource, (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var, (ck0) kk0Var, 196608, 0, 65502);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 VoiceGateDialog$lambda$35(boolean z, Map map, VoiceQuota voiceQuota, boolean z2, je1 je1Var, String str, ck0 ck0Var, int i) {
        String strStringResource;
        String strValueOf;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i & 1, (i & 3) != 2);
        xk xkVar = kk0Var.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            wt start = Alignment$Companion.getStart();
            dl dlVar = hl.c;
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(dlVar, start, kk0Var, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, modifier$Companion);
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
            pe peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            if (z) {
                kk0Var.a0(-1181971871);
                strStringResource = ko3.stringResource(R.string.voice_gate_paid_body, kk0Var, 0);
                kk0Var.r(false);
            } else {
                kk0Var.a0(-1181969490);
                Integer num = (Integer) map.get("free");
                strStringResource = ko3.stringResource(R.string.voice_gate_body, new Object[]{String.valueOf(num != null ? num.intValue() : voiceQuota.getLimit())}, kk0Var, 0);
                kk0Var.r(false);
            }
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(strStringResource, (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).k, (ck0) kk0Var, 0, 0, 65530);
            if (z2) {
                kk0Var.a0(2014039100);
                cm3.Spacer(d.d(modifier$Companion, 16.0f), kk0Var, 6);
                c cVarB = androidx.compose.foundation.a.b(xr0.N(d.a, z73.a(12.0f)), re0.b(0.5f, ab2Var.getColorScheme(kk0Var, 0).r), k43.a);
                vb2 vb2VarColumnMeasurePolicy2 = if0.columnMeasurePolicy(dlVar, Alignment$Companion.getStart(), kk0Var, 0);
                int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN2 = kk0Var.n();
                c cVarD2 = b.d(kk0Var, cVarB);
                d4 constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                pe peVarH2 = fq2.h(kk0Var, vb2VarColumnMeasurePolicy2, kk0Var, su2VarN2);
                if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                kk0Var.a0(-608472554);
                int i2 = 0;
                for (Object obj : kr1.U("free", "plus", "pro")) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kr1.m0();
                        throw null;
                    }
                    String str2 = (String) obj;
                    String strStringResource2 = ko3.stringResource(kr1.n(str2, "free") ? R.string.voice_gate_free : kr1.n(str2, "plus") ? R.string.voice_gate_plus : R.string.voice_gate_pro, kk0Var, 0);
                    if (kr1.n(str2, "pro")) {
                        kk0Var.a0(-1566868840);
                        strValueOf = ko3.stringResource(R.string.voice_gate_unlimited, kk0Var, 0);
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(-1566865579);
                        kk0Var.r(false);
                        strValueOf = String.valueOf(map.get(str2));
                    }
                    QuotaRow(strStringResource2, strValueOf, kr1.n(str2, str), kr1.n(str2, "pro"), i2 == 2, kk0Var, 0);
                    i2 = i3;
                }
                kk0Var.r(false);
                kk0Var.r(true);
            } else {
                kk0Var.a0(1998912526);
            }
            kk0Var.r(false);
            if (je1Var != null) {
                kk0Var.a0(2015882143);
                cm3.Spacer(d.d(c.i, 14.0f), kk0Var, 6);
                WebSubHint(je1Var, kk0Var, 0);
            } else {
                kk0Var.a0(1998912526);
            }
            kk0Var.r(false);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static final void VoiceMenuSheet(VoiceConfig voiceConfig, String str, le1 le1Var, je1 je1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var;
        voiceConfig.getClass();
        le1Var.getClass();
        je1Var.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(1943264080);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? kk0Var2.h(voiceConfig) : kk0Var2.j(voiceConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var2.h(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var2.j(le1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var2.j(je1Var) ? 2048 : 1024;
        }
        if (kk0Var2.S(i2 & 1, (i2 & 1171) != 1170)) {
            kk0Var = kk0Var2;
            hf2.m206x750f78f8(je1Var, null, hf2.rememberModalBottomSheetState(true, null, kk0Var2, 6, 2), 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, zg0.rememberComposableLambda(900397421, true, new s60(voiceConfig, str, le1Var, 5), kk0Var2, 54), kk0Var, (i2 >> 9) & 14, 384, 4090);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ur2(voiceConfig, str, le1Var, je1Var, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [ck0] */
    /* JADX WARN: Type inference failed for: r10v11, types: [ab2] */
    /* JADX WARN: Type inference failed for: r26v0, types: [ck0] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3, types: [ab2] */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v12, types: [kk0] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3, types: [ck0, kk0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [ck0, kk0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kk0] */
    /* JADX WARN: Type inference failed for: r5v8, types: [ck0, kk0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v11, types: [ab2] */
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
    public static final w84 VoiceMenuSheet$lambda$24(VoiceConfig voiceConfig, String str, le1 le1Var, lf0 lf0Var, ck0 ck0Var, int i) {
        float f;
        int i2;
        ab2 ab2Var;
        kk0 kk0Var;
        float f2;
        ?? r6;
        ?? r0;
        ?? r34;
        ArrayList arrayList;
        ?? r5;
        Object obj;
        long jF;
        lf0Var.getClass();
        ?? r4 = 0;
        kk0 kk0Var2 = (kk0) ck0Var;
        boolean zS = kk0Var2.S(i & 1, (i & 17) != 16);
        xk xkVar = kk0Var2.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarO = a.o(mb3.a(d.a, mb3.rememberScrollState(0, kk0Var2, 0, 1), true), 20.0f, 0.0f, 20.0f, 32.0f, 2);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var2, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN = kk0Var2.n();
            c cVarD = b.d(kk0Var2, cVarO);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
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
            boolean zC0 = mo3.C0(voiceConfig.getStrings().getVoicePick());
            ab2 ab2Var2 = ab2.a;
            if (zC0) {
                f = 12.0f;
                i2 = 6;
                ab2Var = ab2Var2;
                kk0Var2.a0(-574250901);
                kk0Var = kk0Var2;
            } else {
                kk0Var2.a0(-563897056);
                i2 = 6;
                ab2Var = ab2Var2;
                f = 12.0f;
                uy3.m1842xe1e389ce(voiceConfig.getStrings().getVoicePick(), (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var2.getTypography(kk0Var2, 0).h, (ck0) kk0Var2, 196608, 0, 65502);
                kk0 kk0Var3 = kk0Var2;
                cm3.Spacer(d.d(modifier$Companion, 12.0f), kk0Var3, 6);
                kk0Var = kk0Var3;
            }
            kk0Var.r(false);
            kk0Var.a0(1782938420);
            ?? r7 = kk0Var;
            ?? r33 = ab2Var;
            for (String str2 : kr1.U("m", "f")) {
                List<VoiceOption> shownVoices = voiceConfig.getShownVoices();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : shownVoices) {
                    if (kr1.n(((VoiceOption) obj2).getSex(), str2)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    f2 = f;
                    r6 = r4 == true ? 1 : 0;
                    r0 = r33;
                } else {
                    String str3 = voiceConfig.getGroups().get(str2);
                    if (str3 == null || mo3.C0(str3)) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        r7.a0(-1456136830);
                        r7.r(r4);
                        arrayList = arrayList2;
                        r34 = r33;
                        r5 = r7;
                    } else {
                        r7.a0(-1456136829);
                        Modifier$Companion modifier$Companion2 = c.i;
                        cm3.Spacer(d.d(modifier$Companion2, 8.0f), r7, i2);
                        ?? r8 = r33;
                        ?? r26 = r7;
                        r34 = r8;
                        arrayList = arrayList2;
                        uy3.m1842xe1e389ce(str3, (c) null, r8.getColorScheme(r7, r4 == true ? 1 : 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, r8.getTypography(r7, r4 == true ? 1 : 0).n, (ck0) r26, 0, 0, 65530);
                        ?? r9 = r26;
                        cm3.Spacer(d.d(modifier$Companion2, 4.0f), r9, i2);
                        r9.r(r4);
                        r5 = r9;
                    }
                    r5.a0(1782956045);
                    int size = arrayList.size();
                    int i3 = r4 == true ? 1 : 0;
                    ?? r10 = r4;
                    r7 = r5;
                    ?? r35 = r34;
                    while (i3 < size) {
                        ArrayList arrayList3 = arrayList;
                        int i4 = i3 + 1;
                        VoiceOption voiceOption = (VoiceOption) arrayList3.get(i3);
                        boolean zN = kr1.n(voiceOption.getName(), str);
                        Modifier$Companion modifier$Companion3 = c.i;
                        c cVarN = xr0.N(d.a, z73.a(f));
                        boolean zH = r7.h(le1Var) | r7.h(voiceOption);
                        Object objP = r7.P();
                        if (zH || objP == Composer$Companion.getEmpty()) {
                            obj = objP;
                            ye yeVar = new ye(le1Var, 24, voiceOption);
                            r7.l0(yeVar);
                            obj = yeVar;
                        }
                        obj = objP;
                        float f3 = f;
                        c cVarL = a.l(androidx.compose.foundation.a.e(cVarN, r10, null, (je1) obj, 7), f3, f3);
                        vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), r7, 48);
                        int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(r7, r10);
                        su2 su2VarN2 = r7.n();
                        c cVarD2 = b.d(r7, cVarL);
                        androidx.compose.ui.node.a.j.getClass();
                        d4 constructor2 = ComposeUiNode$Companion.getConstructor();
                        r7.e0();
                        if (r7.O) {
                            r7.m(constructor2);
                        } else {
                            r7.o0();
                        }
                        pe peVarH2 = fq2.h(r7, vb2VarRowMeasurePolicy, r7, su2VarN2);
                        if (r7.O || !kr1.n(r7.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                            fq2.v(currentCompositeKeyHash2, r7, currentCompositeKeyHash2, peVarH2);
                        }
                        xp1.E(r7, cVarD2, ComposeUiNode$Companion.getSetModifier());
                        String label = voiceOption.getLabel();
                        ?? r11 = r35;
                        uz3 uz3Var = r11.getTypography(r7, r10).j;
                        ic1 ic1Var = zN ? ic1.m : ic1.h;
                        if (zN) {
                            jF = fq2.f(r7, 61683781, r7, r10, r10);
                        } else {
                            r7.a0(61685124);
                            jF = r11.getColorScheme(r7, r10).q;
                            r7.r(r10);
                        }
                        ?? r36 = r11;
                        ?? r1 = r7;
                        uy3.m1842xe1e389ce(label, (c) new LayoutWeightElement(1.0f, true), jF, 0L, (gc1) null, ic1Var, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var, (ck0) r1, 0, 0, 65496);
                        uy3.m1842xe1e389ce(voiceOption.getHz() + " Hz", (c) null, r36.getColorScheme(r1, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, r36.getTypography(r1, 0).o, (ck0) r1, 0, 0, 65530);
                        ?? r12 = r1;
                        r12.r(true);
                        arrayList = arrayList3;
                        i3 = i4;
                        f = 12.0f;
                        r10 = 0;
                        le1Var = le1Var;
                        r7 = r12;
                        r35 = r36;
                    }
                    r6 = r10;
                    f2 = f;
                    r0 = r35;
                    r7.r(r6);
                }
                r33 = r0;
                r4 = r6;
                f = f2;
                i2 = 6;
                r7 = r7;
            }
            r7.r(r4 == true ? 1 : 0);
            r7.r(true);
        } else {
            kk0Var2.V();
        }
        return w84.a;
    }

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
    private static final void VoiceWave(final float f, ck0 ck0Var, final int i) {
        Object obj;
        long jF;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(695097523);
        int i2 = (i & 6) == 0 ? (kk0Var.e(f) ? 4 : 2) | i : i;
        if (kk0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                ArrayList arrayList = new ArrayList(32);
                for (int i3 = 0; i3 < 32; i3++) {
                    obj = objP;
                    double d = i3;
                    arrayList.add(Float.valueOf((((((float) Math.sin(d * 0.23d)) * 0.45f) + 0.55f) * ((float) Math.abs(Math.sin(0.7d * d))) * 0.58f) + 0.24f));
                }
                obj = objP;
                kk0Var.l0(arrayList);
                obj = arrayList;
            }
            obj = objP;
            List list = (List) obj;
            int i4 = (int) (32.0f * f);
            long jB = re0.b(0.28f, ab2.a.getColorScheme(kk0Var, 0).s);
            Modifier$Companion modifier$Companion = c.i;
            float f2 = 18.0f;
            c cVarD = d.d(d.a, 18.0f);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(new fl(2.0f), Alignment$Companion.getCenterVertically(), kk0Var, 54);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD2 = b.d(kk0Var, cVarD);
            androidx.compose.ui.node.a.j.getClass();
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
            pe peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            kk0Var.a0(906850513);
            int i5 = 0;
            for (Object obj2 : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    kr1.m0();
                    throw null;
                }
                float fFloatValue = ((Number) obj2).floatValue();
                Modifier$Companion modifier$Companion2 = c.i;
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                rx0 rx0Var = new rx0(fFloatValue * f2);
                rx0 rx0Var2 = new rx0(3.0f);
                if (rx0Var.compareTo(rx0Var2) < 0) {
                    rx0Var = rx0Var2;
                }
                c cVarN = xr0.N(d.d(layoutWeightElement, rx0Var.c), z73.a(1.0f));
                if (i5 < i4) {
                    jF = fq2.f(kk0Var, -641541876, kk0Var, 0, false);
                } else {
                    kk0Var.a0(-641541370);
                    kk0Var.r(false);
                    jF = jB;
                }
                vw.Box(androidx.compose.foundation.a.b(cVarN, jF, k43.a), kk0Var, 0);
                i5 = i6;
                f2 = 18.0f;
            }
            kk0Var.r(false);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: le4
                @Override // defpackage.ne1
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    pe4.b(f, (ck0) obj3, i);
                    return w84.a;
                }
            });
        }
    }

    public static final void WebSubHint(je1 je1Var, ck0 ck0Var, int i) {
        int i2;
        je1Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(294147571);
        xk xkVar = kk0Var.a;
        if ((i & 6) == 0) {
            i2 = i | (kk0Var.j(je1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (kk0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarM = a.m(androidx.compose.foundation.a.e(xr0.N(d.a, z73.a(10.0f)), false, null, je1Var, 7), 0.0f, 6.0f, 1);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarM);
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
            pe peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            String strStringResource = ko3.stringResource(R.string.gate_web_q, kk0Var, 0);
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(strStringResource, (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).l, (ck0) kk0Var, 0, 0, 65530);
            cm3.Spacer(d.d(modifier$Companion, 3.0f), kk0Var, 6);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var, 48);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN2 = kk0Var.n();
            c cVarD2 = b.d(kk0Var, modifier$Companion);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            pe peVarH2 = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN2);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            uy3.m1842xe1e389ce(ko3.stringResource(R.string.acc_sign_in, kk0Var, 0), (c) null, gx.getBrandGreen(kk0Var, 0), 0L, (gc1) null, ic1.l, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).l, (ck0) kk0Var, 196608, 0, 65498);
            kk0Var = kk0Var;
            cm3.Spacer(d.n(modifier$Companion, 4.0f), kk0Var, 6);
            ul1.m1829xf2a7a69(s22.a.getArrowRight(kk0Var, 6), (String) null, d.j(modifier$Companion, 14.0f), gx.getBrandGreen(kk0Var, 0), kk0Var, 432, 0);
            kk0Var.r(true);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new m60(i, 2, je1Var));
        }
    }

    public static void b(float f, ck0 ck0Var, int i) {
        VoiceWave(f, ck0Var, sf3.V(i | 1));
    }

    public static final String i(double d) {
        int i = (Math.abs(d) > Double.MAX_VALUE || d <= 0.0d) ? 0 : (int) d;
        return (i / 60) + ":" + mo3.H0(2, String.valueOf(i % 60));
    }
}
