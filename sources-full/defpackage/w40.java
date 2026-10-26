package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.ContentScale$Companion;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectableValueKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class w40 {
    private static final void BgTile(final boolean z, final boolean z2, final c cVar, final je1 je1Var, final ne1 ne1Var, ck0 ck0Var, final int i) {
        int i2;
        long jF;
        boolean z3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-393948199);
        xk xkVar = kk0Var.a;
        if ((i & 6) == 0) {
            i2 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.i(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.h(cVar) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var.j(je1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= kk0Var.j(ne1Var) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if (kk0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            c cVarN = xr0.N(a.d(cVar), z73.a(12.0f));
            ab2 ab2Var = ab2.a;
            if (z) {
                jF = fq2.f(kk0Var, -627088125, kk0Var, 0, false);
            } else {
                kk0Var.a0(-627086784);
                jF = ab2Var.getColorScheme(kk0Var, 0).A;
                kk0Var.r(false);
            }
            c cVarH = sf3.h(cVarN, 2.0f, jF, z73.a(12.0f));
            long j = ab2Var.getColorScheme(kk0Var, 0).r;
            qn0 qn0Var = k43.a;
            c cVarE = androidx.compose.foundation.a.e(androidx.compose.foundation.a.b(cVarH, j, qn0Var), false, null, je1Var, 7);
            vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarE);
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
            ne1Var.invoke(kk0Var, Integer.valueOf((i2 >> 12) & 14));
            if (z2) {
                kk0Var.a0(-601002578);
                Modifier$Companion modifier$Companion = c.i;
                c cVarB = androidx.compose.foundation.a.b(xr0.N(d.j(a.k(androidx.compose.foundation.layout.b.a.a(modifier$Companion, Alignment$Companion.getTopEnd()), 4.0f), 18.0f), z73.a), re0.b(0.45f, re0.b), qn0Var);
                vb2 vb2VarC2 = vw.c(Alignment$Companion.getCenter(), false);
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
                pe peVarH2 = fq2.h(kk0Var, vb2VarC2, kk0Var, su2VarN2);
                if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                ym1 lock = s22.a.getLock(kk0Var, 6);
                long j2 = re0.e;
                c cVarJ = d.j(modifier$Companion, 11.0f);
                z3 = true;
                ul1.m1829xf2a7a69(lock, (String) null, cVarJ, j2, kk0Var, 3504, 0);
                kk0Var.r(true);
            } else {
                z3 = true;
                kk0Var.a0(-618884029);
            }
            kk0Var.r(false);
            kk0Var.r(z3);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: a40
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w40.c(z, z2, cVar, je1Var, ne1Var, (ck0) obj, i);
                    return w84.a;
                }
            });
        }
    }

    public static final void ChatBgSheet(final qt qtVar, final tt ttVar, final boolean z, final String str, final File file, File file2, final long j, final boolean z2, final boolean z3, final le1 le1Var, final le1 le1Var2, final je1 je1Var, final je1 je1Var2, final je1 je1Var3, final je1 je1Var4, je1 je1Var5, final je1 je1Var6, ck0 ck0Var, final int i, final int i2, final int i3) {
        int i4;
        String str2;
        File file3;
        File file4;
        int i5;
        kk0 kk0Var;
        final je1 je1Var7;
        final File file5;
        qtVar.getClass();
        ttVar.getClass();
        str.getClass();
        le1Var.getClass();
        le1Var2.getClass();
        je1Var.getClass();
        je1Var2.getClass();
        je1Var3.getClass();
        je1Var6.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(284273540);
        if ((i & 6) == 0) {
            i4 = (kk0Var2.j(qtVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= kk0Var2.h(ttVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= kk0Var2.i(z) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i4 |= kk0Var2.h(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        int i6 = i & 24576;
        int i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
        if (i6 == 0) {
            file3 = file;
            i4 |= kk0Var2.j(file3) ? 16384 : 8192;
        } else {
            file3 = file;
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= 196608;
            file4 = file2;
        } else {
            file4 = file2;
            if ((i & 196608) == 0) {
                i4 |= kk0Var2.j(file4) ? 131072 : 65536;
            }
        }
        if ((i & 1572864) == 0) {
            i4 |= kk0Var2.g(j) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= kk0Var2.i(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= kk0Var2.i(z3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= kk0Var2.j(le1Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (kk0Var2.j(le1Var2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= kk0Var2.j(je1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= kk0Var2.j(je1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 3072) == 0) {
            i5 |= kk0Var2.j(je1Var3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if (kk0Var2.j(je1Var4)) {
                i7 = 16384;
            }
            i5 |= i7;
        }
        int i9 = i3 & 32768;
        if (i9 != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= kk0Var2.j(je1Var5) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= kk0Var2.j(je1Var6) ? 1048576 : 524288;
        }
        if (kk0Var2.S(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 599187) == 599186) ? false : true)) {
            final File file6 = i8 != 0 ? null : file4;
            final je1 je1Var8 = i9 != 0 ? null : je1Var5;
            hh3 hh3VarRememberModalBottomSheetState = hf2.rememberModalBottomSheetState(true, null, kk0Var2, 6, 2);
            final boolean z4 = (z || ttVar.c(qtVar)) ? false : true;
            final File file7 = file3;
            final String str3 = str2;
            kk0Var = kk0Var2;
            hf2.m206x750f78f8(je1Var6, null, hh3VarRememberModalBottomSheetState, 0.0f, null, ab2.a.getColorScheme(kk0Var2, 0).p, 0L, 0.0f, re0.b(0.14f, re0.b), null, null, null, zg0.rememberComposableLambda(2034363655, true, new oe1() { // from class: j40
                @Override // defpackage.oe1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return w40.ChatBgSheet$lambda$56(z, qtVar, ttVar, le1Var2, z2, le1Var, z3, je1Var6, je1Var4, je1Var8, file7, j, str3, file6, je1Var, je1Var2, z4, je1Var3, (lf0) obj, (ck0) obj2, iIntValue);
                }
            }, kk0Var2, 54), kk0Var, ((i5 >> 18) & 14) | 100663296, 384, 3802);
            file5 = file6;
            je1Var7 = je1Var8;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            je1Var7 = je1Var5;
            file5 = file4;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: k40
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = sf3.V(i | 1);
                    int iV2 = sf3.V(i2);
                    w40.ChatBgSheet(qtVar, ttVar, z, str, file, file5, j, z2, z3, le1Var, le1Var2, je1Var, je1Var2, je1Var3, je1Var4, je1Var7, je1Var6, (ck0) obj, iV, iV2, i3);
                    return w84.a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r10v131 */
    /* JADX WARN: Type inference failed for: r10v23, types: [int] */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r68v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v22, types: [int] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final w84 ChatBgSheet$lambda$56(boolean z, qt qtVar, tt ttVar, le1 le1Var, boolean z2, le1 le1Var2, boolean z3, je1 je1Var, je1 je1Var2, je1 je1Var3, final File file, final long j, final String str, File file2, je1 je1Var4, je1 je1Var5, boolean z4, je1 je1Var6, lf0 lf0Var, ck0 ck0Var, int i) throws Throwable {
        boolean z5;
        boolean z6;
        int i2;
        Throwable th;
        kk0 kk0Var;
        String str2;
        String str3;
        final ?? r0;
        final tt ttVar2;
        String str4;
        cl clVar;
        int i3;
        final qt qtVar2;
        ab2 ab2Var;
        kk0 kk0Var2;
        Object obj;
        Object obj2;
        kk0 kk0Var3;
        int i4;
        Object obj3;
        Object obj4;
        ab2 ab2Var2;
        kk0 kk0Var4;
        Object obj5;
        Object e40Var;
        tt ttVar3;
        String str5;
        boolean z7;
        tt ttVar4;
        boolean z8;
        kk0 kk0Var5;
        boolean z9;
        kk0 kk0Var6;
        boolean z10 = z;
        final qt qtVar3 = qtVar;
        tt ttVar5 = ttVar;
        le1 le1Var3 = le1Var;
        final le1 le1Var4 = le1Var2;
        lf0Var.getClass();
        int i5 = 1;
        kk0 kk0Var7 = (kk0) ck0Var;
        boolean zS = kk0Var7.S(i & 1, (i & 17) != 16);
        xk xkVar = kk0Var7.a;
        if (zS) {
            float f = ((Configuration) kk0Var7.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp * 0.64f;
            Modifier$Companion modifier$Companion = c.i;
            FillElement fillElement = d.a;
            c cVarA = b.a(d.f(fillElement, 0.0f, f, 1), InspectableValueKt.isDebugInspectorInfoEnabled() ? new lb4(i5, 28) : InspectableValueKt.getNoInspectorInfo(), new hh4(3));
            wt start = Alignment$Companion.getStart();
            dl dlVar = hl.c;
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(dlVar, start, kk0Var7, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var7, 0);
            su2 su2VarN = kk0Var7.n();
            c cVarD = b.d(kk0Var7, cVarA);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var7.e0();
            if (kk0Var7.O) {
                kk0Var7.m(constructor);
            } else {
                kk0Var7.o0();
            }
            pe peVarH = fq2.h(kk0Var7, vb2VarColumnMeasurePolicy, kk0Var7, su2VarN);
            if (kk0Var7.O || !kr1.n(kk0Var7.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var7, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var7, cVarD, ComposeUiNode$Companion.getSetModifier());
            c cVarM = a.m(mb3.a(new LayoutWeightElement(1.0f, false), mb3.rememberScrollState(0, kk0Var7, 0, 1), true), 20.0f, 0.0f, 2);
            vb2 vb2VarColumnMeasurePolicy2 = if0.columnMeasurePolicy(dlVar, Alignment$Companion.getStart(), kk0Var7, 0);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var7, 0);
            su2 su2VarN2 = kk0Var7.n();
            c cVarD2 = b.d(kk0Var7, cVarM);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var7.e0();
            if (kk0Var7.O) {
                kk0Var7.m(constructor2);
            } else {
                kk0Var7.o0();
            }
            pe peVarH2 = fq2.h(kk0Var7, vb2VarColumnMeasurePolicy2, kk0Var7, su2VarN2);
            if (kk0Var7.O || !kr1.n(kk0Var7.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var7, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var7, cVarD2, ComposeUiNode$Companion.getSetModifier());
            xt centerVertically = Alignment$Companion.getCenterVertically();
            cl clVar2 = hl.a;
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(clVar2, centerVertically, kk0Var7, 48);
            int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var7, 0);
            su2 su2VarN3 = kk0Var7.n();
            c cVarD3 = b.d(kk0Var7, modifier$Companion);
            d4 constructor3 = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var7.e0();
            if (kk0Var7.O) {
                kk0Var7.m(constructor3);
            } else {
                kk0Var7.o0();
            }
            pe peVarH3 = fq2.h(kk0Var7, vb2VarRowMeasurePolicy, kk0Var7, su2VarN3);
            if (kk0Var7.O || !kr1.n(kk0Var7.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                fq2.v(currentCompositeKeyHash3, kk0Var7, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var7, cVarD3, ComposeUiNode$Companion.getSetModifier());
            c cVarN = xr0.N(d.j(modifier$Companion, 40.0f), z73.a(12.0f));
            long jB = re0.b(0.14f, gx.getBrandGreen(kk0Var7, 0));
            qn0 qn0Var = k43.a;
            c cVarB = androidx.compose.foundation.a.b(cVarN, jB, qn0Var);
            vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var7, 0);
            su2 su2VarN4 = kk0Var7.n();
            c cVarD4 = b.d(kk0Var7, cVarB);
            d4 constructor4 = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var7.e0();
            if (kk0Var7.O) {
                kk0Var7.m(constructor4);
            } else {
                kk0Var7.o0();
            }
            pe peVarH4 = fq2.h(kk0Var7, vb2VarC, kk0Var7, su2VarN4);
            if (kk0Var7.O || !kr1.n(kk0Var7.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                fq2.v(currentCompositeKeyHash4, kk0Var7, currentCompositeKeyHash4, peVarH4);
            }
            xp1.E(kk0Var7, cVarD4, ComposeUiNode$Companion.getSetModifier());
            ul1.m1829xf2a7a69(s22.a.getImage(kk0Var7, 6), (String) null, d.j(modifier$Companion, 20.0f), gx.getBrandGreen(kk0Var7, 0), kk0Var7, 432, 0);
            kk0Var7.r(true);
            cm3.Spacer(d.n(modifier$Companion, 12.0f), kk0Var7, 6);
            String strB = qtVar3.b("title");
            List list = qtVar3.f;
            ab2 ab2Var3 = ab2.a;
            ab2 ab2Var4 = ab2Var3;
            uy3.m1842xe1e389ce(strB, (c) new LayoutWeightElement(1.0f, true), 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var3.getTypography(kk0Var7, 0).g, (ck0) kk0Var7, 196608, 0, 65500);
            rl1.IconButton(je1Var, null, false, null, null, zg0.rememberComposableLambda(1527605428, true, new v40(0, qtVar3), kk0Var7, 54), kk0Var7, 196608, 30);
            kk0 kk0Var8 = kk0Var7;
            kk0Var8.r(true);
            if (z10 || mo3.C0(qtVar3.b("lock"))) {
                clVar2 = clVar2;
                z5 = true;
                z6 = false;
                i2 = 54;
                th = null;
                kk0Var8.a0(-187515281);
                kk0Var8.r(false);
                kk0Var = kk0Var8;
            } else {
                kk0Var8.a0(-181368663);
                c cVarK = a.k(androidx.compose.foundation.a.b(xr0.N(a.o(modifier$Companion, 0.0f, 10.0f, 0.0f, 0.0f, 13).then(fillElement), z73.a(12.0f)), re0.b(0.1f, gx.getBrandGreen(kk0Var8, 0)), qn0Var), 12.0f);
                vb2 vb2VarColumnMeasurePolicy3 = if0.columnMeasurePolicy(dlVar, Alignment$Companion.getStart(), kk0Var8, 0);
                int currentCompositeKeyHash5 = rj0.getCurrentCompositeKeyHash(kk0Var8, 0);
                su2 su2VarN5 = kk0Var8.n();
                c cVarD5 = b.d(kk0Var8, cVarK);
                d4 constructor5 = ComposeUiNode$Companion.getConstructor();
                if (xkVar == null) {
                    rj0.a();
                    throw null;
                }
                kk0Var8.e0();
                if (kk0Var8.O) {
                    kk0Var8.m(constructor5);
                } else {
                    kk0Var8.o0();
                }
                pe peVarH5 = fq2.h(kk0Var8, vb2VarColumnMeasurePolicy3, kk0Var8, su2VarN5);
                if (kk0Var8.O || !kr1.n(kk0Var8.P(), Integer.valueOf(currentCompositeKeyHash5))) {
                    fq2.v(currentCompositeKeyHash5, kk0Var8, currentCompositeKeyHash5, peVarH5);
                }
                xp1.E(kk0Var8, cVarD5, ComposeUiNode$Companion.getSetModifier());
                uy3.m1842xe1e389ce(qtVar3.b("lock"), (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var4.getTypography(kk0Var8, 0).k, (ck0) kk0Var8, 0, 0, 65534);
                kk0 kk0Var9 = kk0Var8;
                if (je1Var2 != null) {
                    kk0Var9.a0(1989905851);
                    cm3.Spacer(d.j(modifier$Companion, 8.0f), kk0Var9, 6);
                    vb2 vb2VarRowMeasurePolicy2 = e83.rowMeasurePolicy(clVar2, Alignment$Companion.getCenterVertically(), kk0Var9, 48);
                    int currentCompositeKeyHash6 = rj0.getCurrentCompositeKeyHash(kk0Var9, 0);
                    su2 su2VarN6 = kk0Var9.n();
                    c cVarD6 = b.d(kk0Var9, modifier$Companion);
                    d4 constructor6 = ComposeUiNode$Companion.getConstructor();
                    if (xkVar == null) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var9.e0();
                    if (kk0Var9.O) {
                        kk0Var9.m(constructor6);
                    } else {
                        kk0Var9.o0();
                    }
                    pe peVarH6 = fq2.h(kk0Var9, vb2VarRowMeasurePolicy2, kk0Var9, su2VarN6);
                    if (kk0Var9.O || !kr1.n(kk0Var9.P(), Integer.valueOf(currentCompositeKeyHash6))) {
                        fq2.v(currentCompositeKeyHash6, kk0Var9, currentCompositeKeyHash6, peVarH6);
                    }
                    xp1.E(kk0Var9, cVarD6, ComposeUiNode$Companion.getSetModifier());
                    final int i6 = 0;
                    ty tyVarM1833x1b9ca94 = uy.a.m1833x1b9ca94(gx.getBrandGreen(kk0Var9, 0), gx.getBrandOnAccent(kk0Var9, 0), 0L, 0L, kk0Var9, 0, 12);
                    wg0 wg0VarRememberComposableLambda = zg0.rememberComposableLambda(-434931533, true, new oe1() { // from class: b40
                        @Override // defpackage.oe1
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i7 = i6;
                            qt qtVar4 = qtVar3;
                            g83 g83Var = (g83) obj6;
                            ck0 ck0Var2 = (ck0) obj7;
                            int iIntValue = ((Integer) obj8).intValue();
                            switch (i7) {
                                case 0:
                                    return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$9$lambda$8$lambda$5(qtVar4, g83Var, ck0Var2, iIntValue);
                                case 1:
                                    return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$9$lambda$8$lambda$7(qtVar4, g83Var, ck0Var2, iIntValue);
                                default:
                                    return w40.ChatBgSheet$lambda$56$lambda$55$lambda$54$lambda$49(qtVar4, g83Var, ck0Var2, iIntValue);
                            }
                        }
                    }, kk0Var9, 54);
                    z5 = true;
                    bz.Button(je1Var2, null, false, null, tyVarM1833x1b9ca94, null, null, null, null, wg0VarRememberComposableLambda, kk0Var9, 805306368, 494);
                    kk0 kk0Var10 = kk0Var9;
                    if (je1Var3 != null) {
                        kk0Var10.a0(-126507158);
                        final int i7 = z5 ? 1 : 0;
                        i2 = 54;
                        bz.TextButton(je1Var3, null, false, null, null, null, null, null, null, zg0.rememberComposableLambda(-1097187813, true, new oe1() { // from class: b40
                            @Override // defpackage.oe1
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                int i8 = i7;
                                qt qtVar4 = qtVar3;
                                g83 g83Var = (g83) obj6;
                                ck0 ck0Var2 = (ck0) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                switch (i8) {
                                    case 0:
                                        return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$9$lambda$8$lambda$5(qtVar4, g83Var, ck0Var2, iIntValue);
                                    case 1:
                                        return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$9$lambda$8$lambda$7(qtVar4, g83Var, ck0Var2, iIntValue);
                                    default:
                                        return w40.ChatBgSheet$lambda$56$lambda$55$lambda$54$lambda$49(qtVar4, g83Var, ck0Var2, iIntValue);
                                }
                            }
                        }, kk0Var10, 54), kk0Var10, 805306368, 510);
                        kk0Var6 = kk0Var10;
                        z9 = false;
                    } else {
                        z9 = false;
                        i2 = 54;
                        kk0Var10.a0(-133497441);
                        kk0Var6 = kk0Var10;
                    }
                    kk0Var6.r(z9);
                    kk0Var6.r(true);
                    kk0Var6.r(z9);
                    th = null;
                    z8 = z9;
                    kk0Var5 = kk0Var6;
                } else {
                    z5 = true;
                    z8 = false;
                    i2 = 54;
                    th = null;
                    kk0Var9.a0(1983396254);
                    kk0Var9.r(false);
                    kk0Var5 = kk0Var9;
                }
                kk0Var5.r(z5);
                kk0Var5.r(z8);
                z6 = z8;
                kk0Var = kk0Var5;
            }
            SectionTitle(qtVar3.b("section"), kk0Var, z6 ? 1 : 0);
            c52 c52VarA = kr1.A();
            String str6 = "none";
            c52VarA.add("none");
            String str7 = "own";
            c52VarA.add("own");
            Iterator it = qtVar3.b.iterator();
            while (it.hasNext()) {
                c52VarA.add("p:".concat(((rt) it.next()).a));
            }
            c52 c52VarQ = kr1.q(c52VarA);
            kk0Var.a0(-975622634);
            ArrayList arrayListU0 = ke0.u0(5, c52VarQ);
            int size = arrayListU0.size();
            int i8 = z6 ? 1 : 0;
            ab2 ab2Var5 = ab2Var4;
            ?? r10 = z6;
            while (i8 < size) {
                int i9 = i8 + 1;
                List<String> list2 = (List) arrayListU0.get(i8);
                fl flVar = new fl(8.0f);
                c cVarO = a.o(c.i, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                vb2 vb2VarRowMeasurePolicy3 = e83.rowMeasurePolicy(flVar, Alignment$Companion.getTop(), kk0Var, 6);
                int currentCompositeKeyHash7 = rj0.getCurrentCompositeKeyHash(kk0Var, r10);
                su2 su2VarN7 = kk0Var.n();
                c cVarD7 = b.d(kk0Var, cVarO);
                androidx.compose.ui.node.a.j.getClass();
                d4 constructor7 = ComposeUiNode$Companion.getConstructor();
                if (xkVar == null) {
                    rj0.a();
                    throw th;
                }
                kk0Var.e0();
                ab2 ab2Var6 = ab2Var5;
                if (kk0Var.O) {
                    kk0Var.m(constructor7);
                } else {
                    kk0Var.o0();
                }
                pe peVarH7 = fq2.h(kk0Var, vb2VarRowMeasurePolicy3, kk0Var, su2VarN7);
                if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash7))) {
                    fq2.v(currentCompositeKeyHash7, kk0Var, currentCompositeKeyHash7, peVarH7);
                }
                xp1.E(kk0Var, cVarD7, ComposeUiNode$Companion.getSetModifier());
                kk0Var.a0(728337075);
                for (final String str8 : list2) {
                    boolean zN = kr1.n(ttVar5.a, str8);
                    boolean zW = w(z10, qtVar3, "bg", str8);
                    Modifier$Companion modifier$Companion2 = c.i;
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    boolean zH = kk0Var.h(str8) | kk0Var.h(le1Var3) | kk0Var.h(le1Var4) | kk0Var.h(ttVar5);
                    Object objP = kk0Var.P();
                    if (zH || objP == Composer$Companion.getEmpty()) {
                        z7 = true;
                        ttVar4 = ttVar5;
                        c40 c40Var = new c40(str8, le1Var, le1Var4, ttVar4, 0);
                        kk0Var.l0(c40Var);
                        objP = c40Var;
                    } else {
                        z7 = true;
                        ttVar4 = ttVar5;
                    }
                    le1Var3 = le1Var;
                    le1Var4 = le1Var2;
                    BgTile(zN, zW, layoutWeightElement, (je1) objP, zg0.rememberComposableLambda(109758464, z7, new ne1() { // from class: d40
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj6, Object obj7) {
                            int iIntValue = ((Integer) obj7).intValue();
                            return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$19$lambda$18$lambda$16$lambda$15(str8, qtVar3, file, j, str, (ck0) obj6, iIntValue);
                        }
                    }, kk0Var, i2), kk0Var, 24576);
                    z10 = z;
                    str7 = str7;
                    str6 = str6;
                    ttVar5 = ttVar4;
                    arrayListU0 = arrayListU0;
                    size = size;
                    qtVar3 = qtVar3;
                }
                qt qtVar4 = qtVar3;
                ArrayList arrayList = arrayListU0;
                int i10 = size;
                String str9 = str7;
                tt ttVar6 = ttVar5;
                String str10 = str6;
                kk0Var.r(false);
                kk0Var.a0(728383776);
                int size2 = 5 - list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Modifier$Companion modifier$Companion3 = c.i;
                    cm3.Spacer(new LayoutWeightElement(1.0f, true), kk0Var, 0);
                }
                kk0Var.u();
                kk0Var.t();
                str7 = str9;
                str6 = str10;
                r10 = 0;
                ttVar5 = ttVar6;
                i8 = i9;
                arrayListU0 = arrayList;
                size = i10;
                z5 = true;
                qtVar3 = qtVar4;
                ab2Var5 = ab2Var6;
                z10 = z;
            }
            ab2 ab2Var7 = ab2Var5;
            ?? r1 = z5;
            qt qtVar5 = qtVar3;
            tt ttVar7 = ttVar5;
            ?? r7 = r10;
            String str11 = str6;
            String str12 = str7;
            float f2 = 1.0f;
            kk0Var.u();
            if (list.size() > r1) {
                kk0Var.a0(-177729325);
                String str13 = "fx";
                SectionTitle(qtVar5.b("fx"), kk0Var, r7 == true ? 1 : 0);
                ab2 ab2Var8 = ab2Var7;
                String str14 = " ";
                boolean z11 = gb2.J(ab2Var8.getColorScheme(kk0Var, r7 == true ? 1 : 0).n) < 0.4f ? r1 == true ? 1 : 0 : r7 == true ? 1 : 0;
                boolean zI = kk0Var.i(z11);
                Object objP2 = kk0Var.P();
                if (zI || objP2 == Composer$Companion.getEmpty()) {
                    obj4 = objP2;
                    ye1 ye1Var = new ye1(z11);
                    kk0Var.l0(ye1Var);
                    obj4 = ye1Var;
                }
                obj4 = objP2;
                ye1 ye1Var2 = (ye1) obj4;
                kk0Var.a0(-975550793);
                ArrayList arrayListU1 = ke0.u0(4, list);
                int size3 = arrayListU1.size();
                int i12 = r7 == true ? 1 : 0;
                ?? r8 = r7;
                ab2 ab2Var9 = ab2Var8;
                kk0 kk0Var11 = kk0Var;
                while (i12 < size3) {
                    int i13 = i12 + 1;
                    List list3 = (List) arrayListU1.get(i12);
                    fl flVar2 = new fl(8.0f);
                    c cVarO2 = a.o(c.i, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    ye1 ye1Var3 = ye1Var2;
                    vb2 vb2VarRowMeasurePolicy4 = e83.rowMeasurePolicy(flVar2, Alignment$Companion.getTop(), kk0Var11, 6);
                    int currentCompositeKeyHash8 = rj0.getCurrentCompositeKeyHash(kk0Var11, r8);
                    su2 su2VarB = kk0Var11.B();
                    c cVarD8 = b.d(kk0Var11, cVarO2);
                    androidx.compose.ui.node.a.j.getClass();
                    d4 constructor8 = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var11.A() == null) {
                        Throwable th2 = th;
                        rj0.a();
                        throw th2;
                    }
                    kk0Var11.e0();
                    if (kk0Var11.E()) {
                        kk0Var11.m(constructor8);
                    } else {
                        kk0Var11.o0();
                    }
                    pe peVarH8 = fq2.h(kk0Var11, vb2VarRowMeasurePolicy4, kk0Var11, su2VarB);
                    if (kk0Var11.E() || !kr1.n(kk0Var11.P(), Integer.valueOf(currentCompositeKeyHash8))) {
                        fq2.v(currentCompositeKeyHash8, kk0Var11, currentCompositeKeyHash8, peVarH8);
                    }
                    xp1.E(kk0Var11, cVarD8, ComposeUiNode$Companion.getSetModifier());
                    kk0Var11.a0(1429931538);
                    Iterator it2 = list3.iterator();
                    ab2 ab2Var10 = ab2Var9;
                    kk0 kk0Var12 = kk0Var11;
                    while (it2.hasNext()) {
                        String str15 = (String) it2.next();
                        String strB2 = qtVar5.b("fx_" + str15);
                        String str16 = mo3.C0(strB2) ? str15 : strB2;
                        boolean zN2 = kr1.n(ttVar7.b, str15);
                        boolean zW2 = w(z, qtVar5, str13, str15);
                        Modifier$Companion modifier$Companion4 = c.i;
                        Iterator it3 = it2;
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                        boolean zH2 = kk0Var12.h(str15) | kk0Var12.j(file2) | kk0Var12.h(le1Var3) | kk0Var12.h(le1Var4) | kk0Var12.h(ttVar7);
                        Object objP3 = kk0Var12.P();
                        if (zH2 || objP3 == Composer$Companion.getEmpty()) {
                            ttVar3 = ttVar7;
                            str5 = str15;
                            e40Var = new e40(str5, file2, le1Var3, le1Var4, ttVar3, 0);
                            kk0Var12.l0(e40Var);
                        } else {
                            e40Var = objP3;
                            ttVar3 = ttVar7;
                            str5 = str15;
                        }
                        kk0 kk0Var13 = kk0Var12;
                        FxTile(str5, str16, ye1Var3, file2, j, zN2, zW2, layoutWeightElement2, (je1) e40Var, kk0Var13, 0);
                        it2 = it3;
                        arrayListU1 = arrayListU1;
                        qtVar5 = qtVar;
                        kk0Var12 = kk0Var13;
                        str13 = str13;
                        ab2Var10 = ab2Var10;
                        str12 = str12;
                        ttVar7 = ttVar3;
                        size3 = size3;
                        str11 = str11;
                    }
                    int i14 = size3;
                    String str17 = str12;
                    String str18 = str11;
                    tt ttVar8 = ttVar7;
                    String str19 = str13;
                    ab2 ab2Var11 = ab2Var10;
                    Throwable th3 = th;
                    String str20 = str14;
                    qt qtVar6 = qtVar5;
                    ArrayList arrayList2 = arrayListU1;
                    kk0Var12.u();
                    kk0Var12.a0(1429950994);
                    int size4 = 4 - list3.size();
                    for (int i15 = 0; i15 < size4; i15++) {
                        Modifier$Companion modifier$Companion5 = c.i;
                        cm3.Spacer(new LayoutWeightElement(1.0f, true), kk0Var12, 0);
                    }
                    kk0Var12.u();
                    kk0Var12.t();
                    th = th3;
                    arrayListU1 = arrayList2;
                    str14 = str20;
                    qtVar5 = qtVar6;
                    ye1Var2 = ye1Var3;
                    i12 = i13;
                    str13 = str19;
                    ab2Var9 = ab2Var11;
                    str12 = str17;
                    ttVar7 = ttVar8;
                    f2 = 1.0f;
                    size3 = i14;
                    str11 = str18;
                    r8 = 0;
                    kk0Var11 = kk0Var12;
                }
                str2 = str12;
                str3 = str11;
                ?? r2 = r8;
                ttVar2 = ttVar7;
                float f3 = f2;
                ab2 ab2Var12 = ab2Var9;
                ?? r68 = th;
                str4 = str14;
                qtVar2 = qtVar5;
                kk0Var11.u();
                if (!kr1.n(ttVar2.b, str2) || mo3.C0(qtVar2.b("fx_own_hint"))) {
                    clVar = clVar2;
                    ab2Var2 = ab2Var12;
                    i3 = -187515281;
                    kk0Var11.a0(-187515281);
                    kk0Var4 = kk0Var11;
                } else {
                    kk0Var11.a0(-176334511);
                    Modifier$Companion modifier$Companion6 = c.i;
                    c cVarO3 = a.o(modifier$Companion6, 0.0f, 0.0f, 0.0f, 6.0f, 7);
                    cl clVar3 = clVar2;
                    vb2 vb2VarRowMeasurePolicy5 = e83.rowMeasurePolicy(clVar3, Alignment$Companion.getTop(), kk0Var11, r2 == true ? 1 : 0);
                    int currentCompositeKeyHash9 = rj0.getCurrentCompositeKeyHash(kk0Var11, r2 == true ? 1 : 0);
                    su2 su2VarB2 = kk0Var11.B();
                    c cVarD9 = b.d(kk0Var11, cVarO3);
                    androidx.compose.ui.node.a.j.getClass();
                    d4 constructor9 = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var11.A() == null) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var11.e0();
                    if (kk0Var11.E()) {
                        kk0Var11.m(constructor9);
                    } else {
                        kk0Var11.o0();
                    }
                    pe peVarH9 = fq2.h(kk0Var11, vb2VarRowMeasurePolicy5, kk0Var11, su2VarB2);
                    if (kk0Var11.E() || !kr1.n(kk0Var11.P(), Integer.valueOf(currentCompositeKeyHash9))) {
                        fq2.v(currentCompositeKeyHash9, kk0Var11, currentCompositeKeyHash9, peVarH9);
                    }
                    xp1.E(kk0Var11, cVarD9, ComposeUiNode$Companion.getSetModifier());
                    String strConcat = qtVar2.b("fx_own_hint").concat(str4);
                    ab2 ab2Var13 = ab2Var12;
                    uz3 uz3VarC = ab2Var13.getTypography(kk0Var11, r2 == true ? 1 : 0).c();
                    long jA = ab2Var13.getColorScheme(kk0Var11, r2 == true ? 1 : 0).a();
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f3, r2);
                    kk0 kk0Var14 = kk0Var11;
                    clVar = clVar3;
                    uy3.m1842xe1e389ce(strConcat, (c) layoutWeightElement3, jA, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3VarC, (ck0) kk0Var14, 0, 0, 65528);
                    kk0 kk0Var15 = kk0Var14;
                    kk0Var15.t();
                    if (mo3.C0(qtVar2.b("fx_own_change"))) {
                        i3 = -187515281;
                        kk0Var15.a0(-187515281);
                        kk0Var15.u();
                        ab2Var2 = ab2Var13;
                        kk0Var4 = kk0Var15;
                    } else {
                        kk0Var15.a0(-175953676);
                        String strB3 = qtVar2.b("fx_own_change");
                        uz3 uz3VarC2 = ab2Var13.getTypography(kk0Var15, r2 == true ? 1 : 0).c();
                        long brandGreen = gx.getBrandGreen(kk0Var15, r2 == true ? 1 : 0);
                        c cVarO4 = a.o(modifier$Companion6, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        boolean zH3 = kk0Var15.h(le1Var3);
                        Object objP4 = kk0Var15.P();
                        if (zH3 || objP4 == Composer$Companion.getEmpty()) {
                            obj5 = objP4;
                            f40 f40Var = new f40(le1Var3, r2 == true ? 1 : 0);
                            kk0Var15.l0(f40Var);
                            obj5 = f40Var;
                        }
                        obj5 = objP4;
                        uy3.m1842xe1e389ce(strB3, androidx.compose.foundation.a.e(cVarO4, r2, r68, (je1) obj5, 7), brandGreen, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3VarC2, (ck0) kk0Var15, 0, 0, 65528);
                        kk0 kk0Var16 = kk0Var15;
                        kk0Var16.u();
                        i3 = -187515281;
                        ab2Var2 = ab2Var13;
                        kk0Var4 = kk0Var16;
                    }
                }
                kk0Var4.u();
                r0 = r2;
                ab2Var = ab2Var2;
                kk0Var2 = kk0Var4;
            } else {
                str2 = str12;
                str3 = str11;
                r0 = r7 == true ? 1 : 0;
                ttVar2 = ttVar7;
                str4 = " ";
                clVar = clVar2;
                i3 = -187515281;
                qtVar2 = qtVar5;
                ab2Var = ab2Var7;
                kk0Var.a0(-187515281);
                kk0Var2 = kk0Var;
            }
            kk0Var2.u();
            String str21 = str3;
            if (kr1.n(ttVar2.a, str21)) {
                kk0Var2.a0(i3);
            } else {
                kk0Var2.a0(-175625231);
                LabeledRow(qtVar2.b("dim"), zg0.rememberComposableLambda(169281179, true, new ne1() { // from class: g40
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj6, Object obj7) {
                        int i16 = r0;
                        le1 le1Var5 = le1Var4;
                        qt qtVar7 = qtVar2;
                        tt ttVar9 = ttVar2;
                        ck0 ck0Var2 = (ck0) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        switch (i16) {
                            case 0:
                                return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$33(ttVar9, qtVar7, le1Var5, ck0Var2, iIntValue);
                            default:
                                return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$47(ttVar9, qtVar7, le1Var5, ck0Var2, iIntValue);
                        }
                    }
                }, kk0Var2, 54), kk0Var2, 48);
            }
            kk0Var2.u();
            SectionTitle(qtVar2.b("pt_section"), kk0Var2, 0);
            String strB4 = qtVar2.b("fx_none");
            if (mo3.C0(strB4)) {
                strB4 = qtVar2.b(str21);
            }
            List listU = kr1.U(y64.S(strB4, str21), y64.S(qtVar2.b("pt_ai"), "ai"), y64.S(qtVar2.b(str2), str2));
            String str22 = ttVar2.d;
            boolean zI2 = kk0Var2.i(z) | kk0Var2.j(qtVar2);
            Object objP5 = kk0Var2.P();
            if (zI2 || objP5 == Composer$Companion.getEmpty()) {
                obj = objP5;
                d10 d10Var = new d10(1, qtVar2, z);
                kk0Var2.l0(d10Var);
                obj = d10Var;
            }
            obj = objP5;
            le1 le1Var5 = (le1) obj;
            Set setR = z2 ? f31.c : py.R("ai");
            boolean zH4 = kk0Var2.h(le1Var3) | kk0Var2.h(le1Var4) | kk0Var2.h(ttVar2);
            Object objP6 = kk0Var2.P();
            if (zH4 || objP6 == Composer$Companion.getEmpty()) {
                obj2 = objP6;
                jq jqVar = new jq(le1Var3, le1Var4, ttVar2, 1);
                kk0Var2.l0(jqVar);
                obj2 = jqVar;
            }
            obj2 = objP6;
            Segments(listU, str22, le1Var5, setR, (le1) obj2, kk0Var2, 0, 0);
            if (z2) {
                kk0Var2.a0(-187515281);
                kk0Var3 = kk0Var2;
            } else {
                kk0Var2.a0(-174949555);
                Modifier$Companion modifier$Companion7 = c.i;
                c cVarO5 = a.o(modifier$Companion7, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                vb2 vb2VarRowMeasurePolicy6 = e83.rowMeasurePolicy(clVar, Alignment$Companion.getTop(), kk0Var2, 0);
                int currentCompositeKeyHash10 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
                su2 su2VarB3 = kk0Var2.B();
                c cVarD10 = b.d(kk0Var2, cVarO5);
                androidx.compose.ui.node.a.j.getClass();
                d4 constructor10 = ComposeUiNode$Companion.getConstructor();
                if (kk0Var2.A() == null) {
                    rj0.a();
                    throw null;
                }
                kk0Var2.e0();
                if (kk0Var2.E()) {
                    kk0Var2.m(constructor10);
                } else {
                    kk0Var2.o0();
                }
                pe peVarH10 = fq2.h(kk0Var2, vb2VarRowMeasurePolicy6, kk0Var2, su2VarB3);
                if (kk0Var2.E() || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash10))) {
                    fq2.v(currentCompositeKeyHash10, kk0Var2, currentCompositeKeyHash10, peVarH10);
                }
                xp1.E(kk0Var2, cVarD10, ComposeUiNode$Companion.getSetModifier());
                kk0 kk0Var17 = kk0Var2;
                uy3.m1842xe1e389ce(qtVar2.b("pt_ai_hint").concat(str4), (c) null, ab2Var.getColorScheme(kk0Var2, 0).a(), 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).c(), (ck0) kk0Var17, 0, 0, 65530);
                uy3.m1842xe1e389ce(qtVar2.b("pt_ai_go"), androidx.compose.foundation.a.e(modifier$Companion7, false, null, je1Var4, 7), gx.getBrandGreen(kk0Var17, 0), 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var17, 0).c(), (ck0) kk0Var17, 0, 0, 65528);
                kk0 kk0Var18 = kk0Var17;
                kk0Var18.t();
                kk0Var3 = kk0Var18;
            }
            kk0Var3.u();
            if (kr1.n(ttVar2.d, str21)) {
                kk0Var3.a0(-187515281);
            } else {
                kk0Var3.a0(-174493328);
                final int i16 = 1;
                LabeledRow(qtVar2.b("pt_size"), zg0.rememberComposableLambda(-1999308899, true, new dn(ttVar2, i16, le1Var4), kk0Var3, 54), kk0Var3, 48);
                LabeledRow(qtVar2.b("pt_opacity"), zg0.rememberComposableLambda(-1254072620, true, new ne1() { // from class: g40
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj6, Object obj7) {
                        int i17 = i16;
                        le1 le1Var6 = le1Var4;
                        qt qtVar7 = qtVar2;
                        tt ttVar9 = ttVar2;
                        ck0 ck0Var2 = (ck0) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        switch (i17) {
                            case 0:
                                return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$33(ttVar9, qtVar7, le1Var6, ck0Var2, iIntValue);
                            default:
                                return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$47(ttVar9, qtVar7, le1Var6, ck0Var2, iIntValue);
                        }
                    }
                }, kk0Var3, 54), kk0Var3, 48);
            }
            kk0Var3.u();
            if (z3) {
                kk0Var3.a0(-975445235);
                i4 = 0;
                m1847xda920920(qtVar2.b("bad_img"), ab2Var.getColorScheme(kk0Var3, 0).w, kk0Var3, 0);
            } else {
                i4 = 0;
                kk0Var3.a0(-187515281);
            }
            kk0Var3.u();
            m1847xda920920(qtVar2.b("local"), ab2Var.getColorScheme(kk0Var3, i4).a(), kk0Var3, i4);
            Modifier$Companion modifier$Companion8 = c.i;
            cm3.Spacer(d.j(modifier$Companion8, 4.0f), kk0Var3, 6);
            kk0Var3.t();
            fx0.m192xfb3e0e9b(a.o(modifier$Companion8, 0.0f, 4.0f, 0.0f, 0.0f, 13), 0.0f, 0L, kk0Var3, 6, 6);
            xt centerVertically2 = Alignment$Companion.getCenterVertically();
            c cVarN2 = a.n(modifier$Companion8, 12.0f, 10.0f, 20.0f, 14.0f);
            vb2 vb2VarRowMeasurePolicy7 = e83.rowMeasurePolicy(clVar, centerVertically2, kk0Var3, 48);
            int currentCompositeKeyHash11 = rj0.getCurrentCompositeKeyHash(kk0Var3, 0);
            su2 su2VarB4 = kk0Var3.B();
            c cVarD11 = b.d(kk0Var3, cVarN2);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor11 = ComposeUiNode$Companion.getConstructor();
            if (kk0Var3.A() == null) {
                rj0.a();
                throw null;
            }
            kk0Var3.e0();
            if (kk0Var3.E()) {
                kk0Var3.m(constructor11);
            } else {
                kk0Var3.o0();
            }
            pe peVarH11 = fq2.h(kk0Var3, vb2VarRowMeasurePolicy7, kk0Var3, su2VarB4);
            if (kk0Var3.E() || !kr1.n(kk0Var3.P(), Integer.valueOf(currentCompositeKeyHash11))) {
                fq2.v(currentCompositeKeyHash11, kk0Var3, currentCompositeKeyHash11, peVarH11);
            }
            xp1.E(kk0Var3, cVarD11, ComposeUiNode$Companion.getSetModifier());
            final int i17 = 2;
            kk0 kk0Var19 = kk0Var3;
            bz.TextButton(je1Var5, null, false, null, null, null, null, null, null, zg0.rememberComposableLambda(1683409310, true, new oe1() { // from class: b40
                @Override // defpackage.oe1
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    int i18 = i17;
                    qt qtVar7 = qtVar2;
                    g83 g83Var = (g83) obj6;
                    ck0 ck0Var2 = (ck0) obj7;
                    int iIntValue = ((Integer) obj8).intValue();
                    switch (i18) {
                        case 0:
                            return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$9$lambda$8$lambda$5(qtVar7, g83Var, ck0Var2, iIntValue);
                        case 1:
                            return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$9$lambda$8$lambda$7(qtVar7, g83Var, ck0Var2, iIntValue);
                        default:
                            return w40.ChatBgSheet$lambda$56$lambda$55$lambda$54$lambda$49(qtVar7, g83Var, ck0Var2, iIntValue);
                    }
                }
            }, kk0Var3, 54), kk0Var19, 805306368, 510);
            cm3.Spacer(new LayoutWeightElement(1.0f, true), kk0Var19, 0);
            boolean zI3 = kk0Var19.i(z4) | kk0Var19.h(je1Var2) | kk0Var19.h(je1Var6);
            Object objP7 = kk0Var19.P();
            if (zI3 || objP7 == Composer$Companion.getEmpty()) {
                obj3 = objP7;
                up upVar = new up(z4, je1Var2, je1Var6, 1);
                kk0Var19.l0(upVar);
                obj3 = upVar;
            }
            obj3 = objP7;
            bz.Button((je1) obj3, null, (z4 && je1Var2 == null) ? false : true, null, uy.a.m1833x1b9ca94(gx.getBrandGreen(kk0Var19, 0), gx.getBrandOnAccent(kk0Var19, 0), 0L, 0L, kk0Var19, 0, 12), null, null, null, null, zg0.rememberComposableLambda(1465454673, true, new eq(i17, qtVar2, z4), kk0Var19, 54), kk0Var19, 805306368, 490);
            kk0Var19.t();
            kk0Var19.t();
        } else {
            kk0Var7.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$19$lambda$18$lambda$16$lambda$15(String str, qt qtVar, File file, long j, String str2, ck0 ck0Var, int i) {
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        if (kk0Var2.S(i & 1, (i & 3) != 2)) {
            boolean zN = kr1.n(str, "none");
            s22 s22Var = s22.a;
            if (zN) {
                kk0Var2.a0(-1896295517);
                TileLabel(s22Var.getBan(kk0Var2, 6), qtVar.b("none"), kk0Var2, 0);
                kk0Var2.r(false);
            } else if (kr1.n(str, "own")) {
                kk0Var2.a0(-1896292253);
                if (file == null || !file.isFile()) {
                    kk0Var = kk0Var2;
                    kk0Var.a0(-1896276381);
                    TileLabel(s22Var.getPlus(kk0Var, 6), qtVar.b("own"), kk0Var, 0);
                    kk0Var.r(false);
                } else {
                    kk0Var2.a0(1344514667);
                    mm1 mm1Var = new mm1((Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext()));
                    mm1Var.c = file;
                    mm1Var.e = ud2.o("chatbg-own-", j);
                    mm1Var.g = ud2.o("chatbg-own-", j);
                    pm1 pm1VarA = mm1Var.a();
                    String strB = qtVar.b("own");
                    qn0 crop = ContentScale$Companion.getCrop();
                    Modifier$Companion modifier$Companion = c.i;
                    vh3.m1845xef24a3e0(pm1VarA, strB, d.c, null, null, null, crop, 0.0f, null, 0, false, kk0Var2, 1573248, 0, 1976);
                    kk0Var = kk0Var2;
                    kk0Var.r(false);
                }
                kk0Var.r(false);
            } else {
                kk0Var2.a0(1345077534);
                rt rtVarA = qtVar.a(str);
                if (rtVarA == null) {
                    kk0Var2.a0(1345077533);
                } else {
                    kk0Var2.a0(1345077534);
                    String strD = z30.d(str2, rtVarA.d);
                    String str3 = rtVarA.b;
                    qn0 crop2 = ContentScale$Companion.getCrop();
                    Modifier$Companion modifier$Companion2 = c.i;
                    vh3.m1845xef24a3e0(strD, str3, d.c, null, null, null, crop2, 0.0f, null, 0, false, kk0Var2, 1573248, 0, 1976);
                }
                kk0Var2.r(false);
                kk0Var2.r(false);
            }
        } else {
            kk0Var2.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$3$lambda$2(qt qtVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            ym1 x = s22.a.getX(kk0Var, 6);
            String strB = qtVar.b("close");
            if (mo3.C0(strB)) {
                strB = null;
            }
            ul1.m1829xf2a7a69(x, strB, (c) null, 0L, kk0Var, 0, 12);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$33(tt ttVar, qt qtVar, le1 le1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            int i2 = ttVar.c;
            st stVar = qtVar.g;
            int i3 = stVar.a;
            int i4 = stVar.b;
            int i5 = stVar.c;
            boolean zH = kk0Var.h(le1Var) | kk0Var.h(ttVar);
            Object objP = kk0Var.P();
            if (zH || objP == Composer$Companion.getEmpty()) {
                objP = new h40(le1Var, ttVar, 0);
                kk0Var.l0(objP);
            }
            RangeSlider(i2, i3, i4, i5, (le1) objP, kk0Var, 0);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$44(tt ttVar, le1 le1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            List listU = kr1.U(new ps2("s", "S"), new ps2("m", "M"), new ps2("l", "L"));
            String str = ttVar.e;
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new f2(8);
                kk0Var.l0(objP);
            }
            le1 le1Var2 = (le1) objP;
            boolean zH = kk0Var.h(le1Var) | kk0Var.h(ttVar);
            Object objP2 = kk0Var.P();
            if (zH || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new h40(le1Var, ttVar, 1);
                kk0Var.l0(objP2);
            }
            Segments(listU, str, le1Var2, null, (le1) objP2, kk0Var, 390, 8);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$47(tt ttVar, qt qtVar, le1 le1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            int i2 = ttVar.f;
            st stVar = qtVar.h;
            int i3 = stVar.a;
            int i4 = stVar.b;
            int i5 = stVar.c;
            boolean zH = kk0Var.h(le1Var) | kk0Var.h(ttVar);
            Object objP = kk0Var.P();
            if (zH || objP == Composer$Companion.getEmpty()) {
                objP = new h40(le1Var, ttVar, 2);
                kk0Var.l0(objP);
            }
            RangeSlider(i2, i3, i4, i5, (le1) objP, kk0Var, 0);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$9$lambda$8$lambda$5(qt qtVar, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            kk0Var.a0(-1357373434);
            String strB = qtVar.b("get_pro");
            if (mo3.C0(strB)) {
                strB = ko3.stringResource(R.string.voice_gate_cta, kk0Var, 0);
            }
            kk0Var.r(false);
            uy3.m1842xe1e389ce(strB, (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131070);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$9$lambda$8$lambda$7(qt qtVar, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            kk0Var.a0(-2130497140);
            String strB = qtVar.b("or_plus");
            if (mo3.C0(strB)) {
                strB = ko3.stringResource(R.string.gate_or_plus, kk0Var, 0);
            }
            String str = strB;
            kk0Var.r(false);
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(str, (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).n, (ck0) kk0Var, 0, 0, 65530);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ChatBgSheet$lambda$56$lambda$55$lambda$54$lambda$49(qt qtVar, g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            uy3.m1842xe1e389ce(qtVar.b("reset"), (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131070);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 ChatBgSheet$lambda$56$lambda$55$lambda$54$lambda$53(boolean z, qt qtVar, g83 g83Var, ck0 ck0Var, int i) {
        String strB;
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            if (z) {
                kk0Var.a0(-982358242);
                strB = qtVar.b("get_pro");
                if (mo3.C0(strB)) {
                    strB = ko3.stringResource(R.string.voice_gate_cta, kk0Var, 0);
                }
                kk0Var.r(false);
            } else {
                kk0Var.a0(-447328966);
                kk0Var.r(false);
                strB = qtVar.b("done");
            }
            uy3.m1842xe1e389ce(strB, (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131070);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01a9 A[PHI: r7
  0x01a9: PHI (r7v18 ??) = (r7v2 ??), (r7v4 ??), (r7v7 ??), (r7v9 ??), (r7v16 ??), (r7v19 ??) binds: [B:66:0x01a7, B:84:?, B:55:0x0134, B:45:0x00ab, B:83:?, B:39:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r15v1, types: [ck0, kk0] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2, types: [kk0] */
    /* JADX WARN: Type inference failed for: r15v3, types: [kk0] */
    /* JADX WARN: Type inference failed for: r15v5, types: [kk0] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r7v11, types: [s22] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v7, types: [ab2] */
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
    private static final void FxIcon(final String str, final ye1 ye1Var, final File file, final long j, ck0 ck0Var, final int i) {
        ?? r15;
        ?? r7;
        Object obj;
        boolean z;
        ?? r16;
        int i2;
        Object objP;
        Object obj2;
        ?? r17 = (kk0) ck0Var;
        r17.c0(-521470144);
        int i3 = (i & 6) == 0 ? (r17.h(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= r17.j(ye1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= r17.j(file) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i3 |= r17.g(j) ? 2048 : 1024;
        }
        if (r17.S(i3 & 1, (i3 & 1171) != 1170)) {
            long j2 = ab2.a.getColorScheme(r17, 0).s;
            switch (str.hashCode()) {
                case -1221256979:
                    r7 = 0;
                    if (!str.equals("hearts")) {
                        r17.a0(1378402301);
                        Modifier$Companion modifier$Companion = c.i;
                        FillElement fillElement = d.c;
                        i2 = (r17.g(j2) ? 1 : 0) | ((i3 & 14) != 4 ? r7 : 1);
                        objP = r17.P();
                        if (i2 == 0 || objP == Composer$Companion.getEmpty()) {
                            obj2 = objP;
                            q40 q40Var = new q40(r7, j2, str);
                            r17.l0(q40Var);
                            obj2 = q40Var;
                        }
                        obj2 = objP;
                        c10.Canvas(fillElement, (le1) obj2, r17, 6);
                        r17.r(r7);
                        r15 = r17;
                    } else {
                        r17.a0(1378372146);
                        bm1 bm1Var = (bm1) ye1Var.a.get(0);
                        Modifier$Companion modifier$Companion2 = c.i;
                        hm1.m209x6798a8b1(bm1Var, null, d.c, null, null, 0.0f, null, 0, r17, 432, 248);
                        r17.r(false);
                        r15 = r17;
                    }
                    break;
                case -991674327:
                    if (!str.equals("petals")) {
                        r7 = 0;
                        r17.a0(1378402301);
                        Modifier$Companion modifier$Companion3 = c.i;
                        FillElement fillElement2 = d.c;
                        i2 = (r17.g(j2) ? 1 : 0) | ((i3 & 14) != 4 ? r7 : 1);
                        objP = r17.P();
                        if (i2 == 0) {
                            obj2 = objP;
                            q40 q40Var2 = new q40(r7, j2, str);
                            r17.l0(q40Var2);
                            obj2 = q40Var2;
                        } else {
                            obj2 = objP;
                            q40 q40Var3 = new q40(r7, j2, str);
                            r17.l0(q40Var3);
                            obj2 = q40Var3;
                        }
                        obj2 = objP;
                        c10.Canvas(fillElement2, (le1) obj2, r17, 6);
                        r17.r(r7);
                        r15 = r17;
                    } else {
                        r17.a0(1378378484);
                        bm1 bm1Var2 = (bm1) ye1Var.c.get(2);
                        Modifier$Companion modifier$Companion4 = c.i;
                        FillElement fillElement3 = d.c;
                        Object objP2 = r17.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            obj = objP2;
                            f2 f2Var = new f2(9);
                            r17.l0(f2Var);
                            obj = f2Var;
                        }
                        obj = objP2;
                        hm1.m209x6798a8b1(bm1Var2, null, androidx.compose.ui.graphics.a.a(fillElement3, (le1) obj), null, null, 0.0f, null, 0, r17, 432, 248);
                        r17.r(false);
                        r15 = r17;
                    }
                    break;
                case -280000549:
                    r7 = 0;
                    if (!str.equals("fireflies")) {
                        r17.a0(1378402301);
                        Modifier$Companion modifier$Companion5 = c.i;
                        FillElement fillElement4 = d.c;
                        i2 = (r17.g(j2) ? 1 : 0) | ((i3 & 14) != 4 ? r7 : 1);
                        objP = r17.P();
                        if (i2 == 0) {
                            obj2 = objP;
                            q40 q40Var4 = new q40(r7, j2, str);
                            r17.l0(q40Var4);
                            obj2 = q40Var4;
                        } else {
                            obj2 = objP;
                            q40 q40Var5 = new q40(r7, j2, str);
                            r17.l0(q40Var5);
                            obj2 = q40Var5;
                        }
                        obj2 = objP;
                        c10.Canvas(fillElement4, (le1) obj2, r17, 6);
                        r17.r(r7);
                        r15 = r17;
                    } else {
                        r17.a0(1378383792);
                        ib ibVar = ye1Var.d;
                        Modifier$Companion modifier$Companion6 = c.i;
                        hm1.m209x6798a8b1(ibVar, null, d.c, null, null, 0.0f, null, 0, r17, 432, 248);
                        r17.r(false);
                        r15 = r17;
                    }
                    break;
                case 110470:
                    r7 = 0;
                    if (!str.equals("own")) {
                        r17.a0(1378402301);
                        Modifier$Companion modifier$Companion7 = c.i;
                        FillElement fillElement5 = d.c;
                        i2 = (r17.g(j2) ? 1 : 0) | ((i3 & 14) != 4 ? r7 : 1);
                        objP = r17.P();
                        if (i2 == 0) {
                            obj2 = objP;
                            q40 q40Var6 = new q40(r7, j2, str);
                            r17.l0(q40Var6);
                            obj2 = q40Var6;
                        } else {
                            obj2 = objP;
                            q40 q40Var7 = new q40(r7, j2, str);
                            r17.l0(q40Var7);
                            obj2 = q40Var7;
                        }
                        obj2 = objP;
                        c10.Canvas(fillElement5, (le1) obj2, r17, 6);
                        r17.r(r7);
                        r15 = r17;
                    } else {
                        r17.a0(1378386282);
                        if (file == null || !file.isFile()) {
                            z = false;
                            r17.a0(-219358983);
                            ym1 imagePlus = s22.a.getImagePlus(r17, 6);
                            Modifier$Companion modifier$Companion8 = c.i;
                            ul1.m1829xf2a7a69(imagePlus, (String) null, d.c, j2, (ck0) r17, 432, 0);
                            r17.r(false);
                            r16 = r17;
                        } else {
                            r17.a0(1378387288);
                            mm1 mm1Var = new mm1((Context) r17.l(AndroidCompositionLocals_androidKt.getLocalContext()));
                            mm1Var.c = file;
                            mm1Var.e = ud2.o("chatbg-fx-", j);
                            mm1Var.g = ud2.o("chatbg-fx-", j);
                            pm1 pm1VarA = mm1Var.a();
                            Modifier$Companion modifier$Companion9 = c.i;
                            z = false;
                            vh3.m1845xef24a3e0(pm1VarA, null, d.c, null, null, null, null, 0.0f, null, 0, false, r17, 432, 0, 2040);
                            ?? r18 = r17;
                            r18.r(false);
                            r16 = r18;
                        }
                        r16.r(z);
                        r15 = r16;
                    }
                    break;
                case 224189799:
                    if (!str.equals("bubbles")) {
                        r7 = 0;
                        r17.a0(1378402301);
                        Modifier$Companion modifier$Companion10 = c.i;
                        FillElement fillElement6 = d.c;
                        i2 = (r17.g(j2) ? 1 : 0) | ((i3 & 14) != 4 ? r7 : 1);
                        objP = r17.P();
                        if (i2 == 0) {
                            obj2 = objP;
                            q40 q40Var8 = new q40(r7, j2, str);
                            r17.l0(q40Var8);
                            obj2 = q40Var8;
                        } else {
                            obj2 = objP;
                            q40 q40Var9 = new q40(r7, j2, str);
                            r17.l0(q40Var9);
                            obj2 = q40Var9;
                        }
                        obj2 = objP;
                        c10.Canvas(fillElement6, (le1) obj2, r17, 6);
                        r17.r(r7);
                        r15 = r17;
                    } else {
                        r17.a0(1378375343);
                        ib ibVar2 = ye1Var.b;
                        Modifier$Companion modifier$Companion11 = c.i;
                        hm1.m209x6798a8b1(ibVar2, null, d.c, null, null, 0.0f, null, 0, r17, 432, 248);
                        r17.r(false);
                        r15 = r17;
                    }
                    break;
                default:
                    r7 = 0;
                    r17.a0(1378402301);
                    Modifier$Companion modifier$Companion12 = c.i;
                    FillElement fillElement7 = d.c;
                    i2 = (r17.g(j2) ? 1 : 0) | ((i3 & 14) != 4 ? r7 : 1);
                    objP = r17.P();
                    if (i2 == 0) {
                        obj2 = objP;
                        q40 q40Var10 = new q40(r7, j2, str);
                        r17.l0(q40Var10);
                        obj2 = q40Var10;
                    } else {
                        obj2 = objP;
                        q40 q40Var11 = new q40(r7, j2, str);
                        r17.l0(q40Var11);
                        obj2 = q40Var11;
                    }
                    obj2 = objP;
                    c10.Canvas(fillElement7, (le1) obj2, r17, 6);
                    r17.r(r7);
                    r15 = r17;
                    break;
            }
        } else {
            r17.V();
            r15 = r17;
        }
        w33 w33VarV = r15.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: r40
                @Override // defpackage.ne1
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    w40.j(str, ye1Var, file, j, (ck0) obj3, i);
                    return w84.a;
                }
            });
        }
    }

    private static final void FxTile(final String str, final String str2, final ye1 ye1Var, final File file, final long j, final boolean z, final boolean z2, final c cVar, final je1 je1Var, ck0 ck0Var, final int i) {
        int i2;
        int i3;
        int i4;
        final float fFloatValue;
        long jB;
        ab2 ab2Var;
        long jF;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1087912181);
        xk xkVar = kk0Var.a;
        int i5 = 2;
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.h(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(ye1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var.j(file) ? 2048 : 1024;
        }
        int i6 = i2;
        if ((i & 24576) == 0) {
            i3 = i6 | (kk0Var.g(j) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE);
        } else {
            i3 = i6;
        }
        if ((i & 196608) == 0) {
            i3 |= kk0Var.i(z) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= kk0Var.i(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= kk0Var.h(cVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= kk0Var.j(je1Var) ? 67108864 : 33554432;
        }
        int i7 = i3;
        if (kk0Var.S(i7 & 1, (i7 & 38347923) != 38347922)) {
            if (z) {
                kk0Var.a0(168797864);
                i4 = 32;
                fFloatValue = ((Number) io1.animateFloat(io1.rememberInfiniteTransition("fxwob", kk0Var, 6, 0), -6.0f, 6.0f, kr1.N(kr1.o0(900, 0, c11.a, 2), 4), "rot", kk0Var, 29064, 0).getValue()).floatValue();
                kk0Var.r(false);
            } else {
                i4 = 32;
                kk0Var.a0(169177705);
                kk0Var.r(false);
                fFloatValue = 0.0f;
            }
            c cVarN = xr0.N(cVar, z73.a(12.0f));
            ab2 ab2Var2 = ab2.a;
            c cVarB = androidx.compose.foundation.a.b(cVarN, re0.b(z ? 0.08f : 0.04f, ab2Var2.getColorScheme(kk0Var, 0).q), k43.a);
            float f = z ? 2.0f : 1.0f;
            if (z) {
                jB = fq2.f(kk0Var, 1806580927, kk0Var, 0, false);
            } else {
                kk0Var.a0(1806582535);
                jB = re0.b(0.3f, ab2Var2.getColorScheme(kk0Var, 0).A);
                kk0Var.r(false);
            }
            c cVarE = androidx.compose.foundation.a.e(sf3.h(cVarB, f, jB, z73.a(r13)), false, null, je1Var, 7);
            boolean z3 = (i7 & 112) == i4;
            Object objP = kk0Var.P();
            if (z3 || objP == Composer$Companion.getEmpty()) {
                objP = new ep(str2, i5);
                kk0Var.l0(objP);
            }
            c cVarL = a.l(we3.b(cVarE, false, (le1) objP), 4.0f, 8.0f);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getCenterHorizontally(), kk0Var, 48);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarL);
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
            Modifier$Companion modifier$Companion = c.i;
            c cVarJ = d.j(modifier$Companion, 30.0f);
            vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN2 = kk0Var.n();
            c cVarD2 = b.d(kk0Var, cVarJ);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            pe peVarH2 = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN2);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            c cVarJ2 = d.j(modifier$Companion, 26.0f);
            boolean zE = kk0Var.e(fFloatValue);
            Object objP2 = kk0Var.P();
            if (zE || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new le1() { // from class: l40
                    @Override // defpackage.le1
                    public final Object invoke(Object obj) {
                        n63 n63Var = (n63) obj;
                        n63Var.getClass();
                        n63Var.e(fFloatValue);
                        return w84.a;
                    }
                };
                kk0Var.l0(objP2);
            }
            c cVarA = androidx.compose.ui.graphics.a.a(cVarJ2, (le1) objP2);
            vb2 vb2VarC2 = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN3 = kk0Var.n();
            c cVarD3 = b.d(kk0Var, cVarA);
            d4 constructor3 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor3);
            } else {
                kk0Var.o0();
            }
            pe peVarH3 = fq2.h(kk0Var, vb2VarC2, kk0Var, su2VarN3);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                fq2.v(currentCompositeKeyHash3, kk0Var, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
            int i8 = i7 >> 3;
            FxIcon(str, ye1Var, file, j, kk0Var, (i7 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168));
            kk0Var.r(true);
            if (z2) {
                kk0Var.a0(-1817412962);
                ab2Var = ab2Var2;
                ul1.m1829xf2a7a69(s22.a.getLock(kk0Var, 6), (String) null, d.j(a.i(androidx.compose.foundation.layout.b.a.a(modifier$Companion, Alignment$Companion.getTopEnd()), 6.0f, -4.0f), 12.0f), ab2Var2.getColorScheme(kk0Var, 0).s, kk0Var, 48, 0);
            } else {
                ab2Var = ab2Var2;
                kk0Var.a0(-525392751);
            }
            kk0Var.r(false);
            kk0Var.r(true);
            cm3.Spacer(d.d(modifier$Companion, 4.0f), kk0Var, 6);
            ab2 ab2Var3 = ab2Var;
            uz3 uz3Var = ab2Var3.getTypography(kk0Var, 0).o;
            if (z) {
                jF = fq2.f(kk0Var, 1791586997, kk0Var, 0, false);
            } else {
                kk0Var.a0(1791588340);
                jF = ab2Var3.getColorScheme(kk0Var, 0).q;
                kk0Var.r(false);
            }
            uy3.m1842xe1e389ce(str2, (c) null, jF, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 2, false, 1, 0, (le1) null, uz3Var, (ck0) kk0Var, i8 & 14, 3120, 55290);
            kk0Var = kk0Var;
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: m40
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w40.f(str, str2, ye1Var, file, j, z, z2, cVar, je1Var, (ck0) obj, i);
                    return w84.a;
                }
            });
        }
    }

    private static final void LabeledRow(String str, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        ne1 ne1Var2;
        kk0 kk0Var;
        boolean z;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(1789543883);
        if ((i & 6) == 0) {
            i2 = i | (kk0Var2.h(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var2.j(ne1Var) ? 32 : 16;
        }
        int i3 = i2;
        if (kk0Var2.S(i3 & 1, (i3 & 19) != 18)) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarO = a.o(d.a, 0.0f, 10.0f, 0.0f, 0.0f, 13);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var2, 0);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN = kk0Var2.n();
            c cVarD = b.d(kk0Var2, cVarO);
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
            if (mo3.C0(str)) {
                kk0Var = kk0Var2;
                z = false;
                kk0Var.a0(-687965535);
            } else {
                kk0Var2.a0(-672713783);
                ab2 ab2Var = ab2.a;
                uy3.m1842xe1e389ce(str, a.o(modifier$Companion, 0.0f, 0.0f, 0.0f, 6.0f, 7), ab2Var.getColorScheme(kk0Var2, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var2, 0).k, (ck0) kk0Var2, (i3 & 14) | 48, 0, 65528);
                kk0Var = kk0Var2;
                z = false;
            }
            kk0Var.r(z);
            ne1Var2 = ne1Var;
            fq2.w((i3 >> 3) & 14, ne1Var2, kk0Var, true);
        } else {
            ne1Var2 = ne1Var;
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new t40(str, ne1Var2, i));
        }
    }

    /* JADX INFO: renamed from: Note-RPmYEkk, reason: not valid java name */
    private static final void m1847xda920920(final String str, final long j, ck0 ck0Var, final int i) {
        int i2;
        kk0 kk0Var;
        w33 w33VarV;
        ne1 ne1Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-626726824);
        if ((i & 6) == 0) {
            i2 = i | (kk0Var2.h(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var2.g(j) ? 32 : 16;
        }
        if (kk0Var2.S(i2 & 1, (i2 & 19) != 18)) {
            if (mo3.C0(str)) {
                w33VarV = kk0Var2.v();
                if (w33VarV == null) {
                    return;
                }
                final int i3 = 0;
                ne1Var = new ne1() { // from class: i40
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        w84 w84Var = w84.a;
                        int i5 = i;
                        long j2 = j;
                        String str2 = str;
                        ck0 ck0Var2 = (ck0) obj;
                        ((Integer) obj2).getClass();
                        switch (i4) {
                            case 0:
                                w40.k(str2, j2, ck0Var2, i5);
                                break;
                            default:
                                w40.i(str2, j2, ck0Var2, i5);
                                break;
                        }
                        return w84Var;
                    }
                };
            } else {
                kk0Var = kk0Var2;
                uy3.m1842xe1e389ce(str, a.o(c.i, 0.0f, 8.0f, 0.0f, 0.0f, 13), j, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2.a.getTypography(kk0Var2, 0).l, (ck0) kk0Var, (i2 & 14) | 48 | ((i2 << 3) & 896), 0, 65528);
            }
            w33VarV.updateScope(ne1Var);
        }
        kk0Var = kk0Var2;
        kk0Var.V();
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            final int i4 = 1;
            ne1Var = new ne1() { // from class: i40
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    w84 w84Var = w84.a;
                    int i6 = i;
                    long j2 = j;
                    String str2 = str;
                    ck0 ck0Var2 = (ck0) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            w40.k(str2, j2, ck0Var2, i6);
                            break;
                        default:
                            w40.i(str2, j2, ck0Var2, i6);
                            break;
                    }
                    return w84Var;
                }
            };
            w33VarV.updateScope(ne1Var);
        }
    }

    private static final void RangeSlider(final int i, final int i2, final int i3, final int i4, final le1 le1Var, ck0 ck0Var, final int i5) {
        int i6;
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(450885557);
        if ((i5 & 6) == 0) {
            i6 = (kk0Var2.f(i) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= kk0Var2.f(i2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= kk0Var2.f(i3) ? 256 : Uuid.SIZE_BITS;
        }
        if ((i5 & 3072) == 0) {
            i6 |= kk0Var2.f(i4) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= kk0Var2.j(le1Var) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if (kk0Var2.S(i6 & 1, (i6 & 9363) != 9362)) {
            float f = i;
            boolean z = ((i6 & 112) == 32) | ((57344 & i6) == 16384) | ((i6 & 7168) == 2048) | ((i6 & 896) == 256);
            Object objP = kk0Var2.P();
            if (z || objP == Composer$Companion.getEmpty()) {
                objP = new le1() { // from class: n40
                    @Override // defpackage.le1
                    public final Object invoke(Object obj) {
                        float fFloatValue = ((Float) obj).floatValue();
                        int i7 = i2;
                        int i8 = i4;
                        le1Var.invoke(Integer.valueOf(py.x((gb2.R((fFloatValue - i7) / i8) * i8) + i7, i7, i3)));
                        return w84.a;
                    }
                };
                kk0Var2.l0(objP);
            }
            kk0Var = kk0Var2;
            rj3.Slider(f, (le1) objP, null, false, new od0(i2, i3), 0, null, ni3.a.m1776xe9175d64(gx.getBrandGreen(kk0Var2, 0), gx.getBrandGreen(kk0Var2, 0), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, kk0Var, 0, 6, 1020), null, kk0Var, 0, 364);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: u40
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w40.b(i, i2, i3, i4, le1Var, (ck0) obj, i5);
                    return w84.a;
                }
            });
        }
    }

    private static final void SectionTitle(String str, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(29722336);
        if ((i & 6) == 0) {
            i2 = (kk0Var2.h(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!kk0Var2.S(i2 & 1, (i2 & 3) != 2)) {
            kk0Var = kk0Var2;
            kk0Var.V();
        } else {
            if (mo3.C0(str)) {
                w33 w33VarV = kk0Var2.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new s40(i, 0, str));
                    return;
                }
                return;
            }
            kk0Var = kk0Var2;
            uy3.m1842xe1e389ce(str, a.o(c.i, 0.0f, 14.0f, 0.0f, 8.0f, 5), 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2.a.getTypography(kk0Var2, 0).i, (ck0) kk0Var, (i2 & 14) | 196656, 0, 65500);
        }
        w33 w33VarV2 = kk0Var.v();
        if (w33VarV2 != null) {
            w33VarV2.updateScope(new s40(i, 1, str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    private static final void Segments(List<ps2> list, String str, le1 le1Var, Set<String> set, le1 le1Var2, ck0 ck0Var, int i, int i2) {
        int i3;
        Set<String> set2;
        boolean z;
        Set<String> set3;
        w33 w33VarV;
        Set<String> set4;
        int i4;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1006470013);
        if ((i & 6) == 0) {
            i3 = (kk0Var.j(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var.h(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= kk0Var.j(le1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                set2 = set;
                i3 |= kk0Var.j(set2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (kk0Var.j(le1Var2)) {
                    i4 = 16384;
                } else {
                    i4 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i5 != 0) {
                    set4 = f31.c;
                } else {
                    set4 = set2;
                }
                u91.FlowRow(null, new fl(6.0f), new fl(6.0f), null, 0, 0, zg0.rememberComposableLambda(1201487288, true, new o40(list, str, set4, le1Var2, le1Var), kk0Var, 54), kk0Var, 1573296, 57);
                set3 = set4;
            } else {
                kk0Var.V();
                set3 = set2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new p40(list, str, le1Var, set3, le1Var2, i, i2));
            }
        }
        i3 |= 3072;
        set2 = set;
        if ((i & 24576) == 0) {
            if (kk0Var.j(le1Var2)) {
                i4 = 16384;
            } else {
                i4 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i5 != 0) {
                set4 = f31.c;
            } else {
                set4 = set2;
            }
            u91.FlowRow(null, new fl(6.0f), new fl(6.0f), null, 0, 0, zg0.rememberComposableLambda(1201487288, true, new o40(list, str, set4, le1Var2, le1Var), kk0Var, 54), kk0Var, 1573296, 57);
            set3 = set4;
        } else {
            kk0Var.V();
            set3 = set2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new p40(list, str, le1Var, set3, le1Var2, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 Segments$lambda$68(List list, String str, Set set, le1 le1Var, le1 le1Var2, ca1 ca1Var, ck0 ck0Var, int i) {
        long jF;
        long jB;
        ca1Var.getClass();
        int i2 = 1;
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                ps2 ps2Var = (ps2) it.next();
                String str2 = (String) ps2Var.c;
                String str3 = (String) ps2Var.d;
                boolean zN = kr1.n(str2, str);
                boolean zContains = set.contains(str2);
                xt centerVertically = Alignment$Companion.getCenterVertically();
                Modifier$Companion modifier$Companion = c.i;
                c cVarF = d.f(modifier$Companion, 40.0f, 0.0f, 2);
                y73 y73Var = z73.a;
                c cVarN = xr0.N(cVarF, y73Var);
                ab2 ab2Var = ab2.a;
                if (zN) {
                    jF = fq2.f(kk0Var, -1680183223, kk0Var, 0, false);
                } else {
                    kk0Var.a0(-1680181882);
                    jF = ab2Var.getColorScheme(kk0Var, 0).A;
                    kk0Var.r(false);
                }
                iw iwVarA = gm4.a(1.0f, jF);
                c cVarThen = cVarN.then(new BorderModifierNodeElement(iwVarA.a, iwVarA.b, y73Var));
                if (zN) {
                    kk0Var.a0(-1680179502);
                    jB = re0.b(0.14f, gx.getBrandGreen(kk0Var, 0));
                } else {
                    kk0Var.a0(-1680177875);
                    jB = ab2Var.getColorScheme(kk0Var, 0).r;
                }
                kk0Var.r(false);
                c cVarB = androidx.compose.foundation.a.b(cVarThen, jB, k43.a);
                boolean z = !zContains;
                boolean zH = kk0Var.h(le1Var) | kk0Var.h(str2);
                Object objP = kk0Var.P();
                if (zH || objP == Composer$Companion.getEmpty()) {
                    objP = new pp(le1Var, str2, i2);
                    kk0Var.l0(objP);
                }
                c cVarM = a.m(androidx.compose.foundation.a.e(cVarB, z, null, (je1) objP, 6), 14.0f, 0.0f, 2);
                vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, centerVertically, kk0Var, 48);
                int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN = kk0Var.n();
                c cVarD = b.d(kk0Var, cVarM);
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
                kk0 kk0Var2 = kk0Var;
                uy3.m1842xe1e389ce(str3, (c) null, re0.b(zContains ? 0.45f : 1.0f, ab2Var.getColorScheme(kk0Var, 0).q), 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).k, (ck0) kk0Var2, 0, 0, 65530);
                kk0Var = kk0Var2;
                if (((Boolean) le1Var2.invoke(str2)).booleanValue()) {
                    kk0Var.a0(-410007809);
                    cm3.Spacer(d.n(modifier$Companion, 6.0f), kk0Var, 6);
                    ul1.m1829xf2a7a69(s22.a.getLock(kk0Var, 6), (String) null, d.j(modifier$Companion, 13.0f), ab2Var.getColorScheme(kk0Var, 0).s, kk0Var, 432, 0);
                } else {
                    kk0Var.a0(-426617857);
                }
                kk0Var.r(false);
                kk0Var.r(true);
                i2 = 1;
            }
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    private static final void TileLabel(ym1 ym1Var, String str, ck0 ck0Var, int i) {
        int i2;
        String str2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(534518007);
        if ((i & 6) == 0) {
            i2 = i | (kk0Var.h(ym1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.h(str) ? 32 : 16;
        }
        int i3 = i2;
        if (kk0Var.S(i3 & 1, (i3 & 19) != 18)) {
            wt centerHorizontally = Alignment$Companion.getCenterHorizontally();
            Modifier$Companion modifier$Companion = c.i;
            c cVarK = a.k(modifier$Companion, 2.0f);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, centerHorizontally, kk0Var, 48);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarK);
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
            pe peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            c cVarJ = d.j(modifier$Companion, 18.0f);
            ab2 ab2Var = ab2.a;
            ul1.m1829xf2a7a69(ym1Var, (String) null, cVarJ, ab2Var.getColorScheme(kk0Var, 0).s, kk0Var, (i3 & 14) | 432, 0);
            str2 = str;
            uy3.m1842xe1e389ce(str2, (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 2, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).o, (ck0) kk0Var, (i3 >> 3) & 14, 3072, 57338);
            kk0Var = kk0Var;
            kk0Var.r(true);
        } else {
            str2 = str;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new t40(i, 0, ym1Var, str2));
        }
    }

    public static void a(String str, ne1 ne1Var, ck0 ck0Var, int i) {
        LabeledRow(str, ne1Var, ck0Var, sf3.V(i | 1));
    }

    public static void b(int i, int i2, int i3, int i4, le1 le1Var, ck0 ck0Var, int i5) {
        RangeSlider(i, i2, i3, i4, le1Var, ck0Var, sf3.V(i5 | 1));
    }

    public static void c(boolean z, boolean z2, c cVar, je1 je1Var, ne1 ne1Var, ck0 ck0Var, int i) {
        BgTile(z, z2, cVar, je1Var, ne1Var, ck0Var, sf3.V(i | 1));
    }

    public static void e(List list, String str, le1 le1Var, Set set, le1 le1Var2, ck0 ck0Var, int i, int i2) {
        Segments(list, str, le1Var, set, le1Var2, ck0Var, sf3.V(i | 1), i2);
    }

    public static void f(String str, String str2, ye1 ye1Var, File file, long j, boolean z, boolean z2, c cVar, je1 je1Var, ck0 ck0Var, int i) {
        FxTile(str, str2, ye1Var, file, j, z, z2, cVar, je1Var, ck0Var, sf3.V(i | 1));
    }

    public static void h(String str, ck0 ck0Var, int i) {
        SectionTitle(str, ck0Var, sf3.V(i | 1));
    }

    public static void i(String str, long j, ck0 ck0Var, int i) {
        m1847xda920920(str, j, ck0Var, sf3.V(i | 1));
    }

    public static void j(String str, ye1 ye1Var, File file, long j, ck0 ck0Var, int i) {
        FxIcon(str, ye1Var, file, j, ck0Var, sf3.V(i | 1));
    }

    public static void k(String str, long j, ck0 ck0Var, int i) {
        m1847xda920920(str, j, ck0Var, sf3.V(i | 1));
    }

    public static void n(String str, ck0 ck0Var, int i) {
        SectionTitle(str, ck0Var, sf3.V(i | 1));
    }

    public static void q(ym1 ym1Var, String str, ck0 ck0Var, int i) {
        TileLabel(ym1Var, str, ck0Var, sf3.V(i | 1));
    }

    public static final boolean w(boolean z, qt qtVar, String str, String str2) {
        if (z) {
            return false;
        }
        if (str.equals("bg")) {
            return !qtVar.c.contains(str2);
        }
        if (str.equals("fx")) {
            return !qtVar.d.contains(str2);
        }
        return !qtVar.e.contains(str2);
    }
}
