package defpackage;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class v30 {
    public static final Set a = py.S("hearts", "bubbles", "petals", "fireflies", "own");
    public static final Map b = y92.T(new ps2("hearts", new r64(14, 34, Float.valueOf(16000.0f))), new ps2("bubbles", new r64(14, 32, Float.valueOf(15000.0f))), new ps2("petals", new r64(26, 60, Float.valueOf(9500.0f))), new ps2("fireflies", new r64(18, 40, Float.valueOf(12000.0f))), new ps2("own", new r64(12, 30, Float.valueOf(17000.0f))));

    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v5 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v5 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 float[], new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void ChatBgSpriteFx(final String str, final boolean z, final bm1 bm1Var, ck0 ck0Var, final int i) {
        int i2;
        w33 w33VarV;
        ne1 ne1Var;
        Object obj;
        Object obj2;
        str.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-107704900);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.i(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(bm1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if (kk0Var.S(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f);
                kk0Var.l0(objP);
            }
            Boolean bool = (Boolean) objP;
            boolean zBooleanValue = bool.booleanValue();
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP2 = kk0Var.P();
            if (z2 || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new ye1(z);
                kk0Var.l0(objP2);
            }
            ye1 ye1Var = (ye1) objP2;
            Object objP3 = kk0Var.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                objP3 = new dt2(0L);
                kk0Var.l0(objP3);
            }
            dt2 dt2Var = (dt2) objP3;
            int i4 = i2 & 14;
            boolean zH = (i4 == 4) | kk0Var.h(bm1Var);
            Object objP4 = kk0Var.P();
            if (zH || objP4 == Composer$Companion.getEmpty()) {
                objP4 = new ArrayList();
                kk0Var.l0(objP4);
            }
            ArrayList arrayList = (ArrayList) objP4;
            boolean zH2 = (i4 == 4) | kk0Var.h(bm1Var);
            Object objP5 = kk0Var.P();
            if (zH2 || objP5 == Composer$Companion.getEmpty()) {
                obj = objP5;
                float[] fArr = {r15, r15};
                kk0Var.l0(fArr);
                obj = fArr;
            }
            obj = objP5;
            float[] fArr2 = (float[]) obj;
            boolean z3 = i4 == 4;
            Object objP6 = kk0Var.P();
            if (z3 || objP6 == Composer$Companion.getEmpty()) {
                obj2 = objP6;
                float[] fArr3 = {0.0f, 1.0f};
                kk0Var.l0(fArr3);
                obj2 = fArr3;
            }
            obj2 = objP6;
            float[] fArr4 = (float[]) obj2;
            boolean zJ = kk0Var.j(fArr4);
            Object objP7 = kk0Var.P();
            if (zJ || objP7 == Composer$Companion.getEmpty()) {
                objP7 = new u30(zBooleanValue, dt2Var, fArr4, null, 0);
                kk0Var.l0(objP7);
            }
            r11.LaunchedEffect(str, bool, (ne1) objP7, kk0Var, i4 | 48);
            if (str.equals("own") && bm1Var == null) {
                w33VarV = kk0Var.v();
                if (w33VarV == null) {
                    return;
                }
                final int i5 = 0;
                ne1Var = new ne1() { // from class: r30
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj3, Object obj4) {
                        int i6 = i5;
                        w84 w84Var = w84.a;
                        int i7 = i;
                        bm1 bm1Var2 = bm1Var;
                        boolean z4 = z;
                        String str2 = str;
                        ck0 ck0Var2 = (ck0) obj3;
                        ((Integer) obj4).getClass();
                        switch (i6) {
                            case 0:
                                v30.ChatBgSpriteFx(str2, z4, bm1Var2, ck0Var2, sf3.V(i7 | 1));
                                break;
                            default:
                                v30.ChatBgSpriteFx(str2, z4, bm1Var2, ck0Var2, sf3.V(i7 | 1));
                                break;
                        }
                        return w84Var;
                    }
                };
            } else {
                Modifier$Companion modifier$Companion = c.i;
                FillElement fillElement = d.c;
                boolean zJ2 = (i4 == 4) | kk0Var.j(fArr2) | kk0Var.j(arrayList) | kk0Var.j(fArr4) | kk0Var.j(ye1Var) | (i3 == 32) | kk0Var.j(bm1Var);
                Object objP8 = kk0Var.P();
                if (zJ2 || objP8 == Composer$Companion.getEmpty()) {
                    Object s30Var = new s30(fArr2, str, arrayList, fArr4, zBooleanValue, ye1Var, z, bm1Var, dt2Var);
                    kk0Var.l0(s30Var);
                    objP8 = s30Var;
                }
                c10.Canvas(fillElement, (le1) objP8, kk0Var, 6);
            }
            w33VarV.updateScope(ne1Var);
        }
        kk0Var.V();
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            final int i6 = 1;
            ne1Var = new ne1() { // from class: r30
                @Override // defpackage.ne1
                public final Object invoke(Object obj3, Object obj4) {
                    int i7 = i6;
                    w84 w84Var = w84.a;
                    int i8 = i;
                    bm1 bm1Var2 = bm1Var;
                    boolean z4 = z;
                    String str2 = str;
                    ck0 ck0Var2 = (ck0) obj3;
                    ((Integer) obj4).getClass();
                    switch (i7) {
                        case 0:
                            v30.ChatBgSpriteFx(str2, z4, bm1Var2, ck0Var2, sf3.V(i8 | 1));
                            break;
                        default:
                            v30.ChatBgSpriteFx(str2, z4, bm1Var2, ck0Var2, sf3.V(i8 | 1));
                            break;
                    }
                    return w84Var;
                }
            };
            w33VarV.updateScope(ne1Var);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final bm3 a(String str, float f, float f2, float f3, boolean z) {
        i23 i23Var = j23.c;
        float f4 = (i23Var.f() * 0.65f) + 0.35f;
        switch (str.hashCode()) {
            case -1221256979:
                if (str.equals("hearts")) {
                    return new bm3(i23Var.f() * f, z ? i23Var.f() * f2 : (((i23Var.f() * 120.0f) + 30.0f) * f3) + f2, f4, (f4 * 20.0f) + 12.0f, (0.8f * f4) + 0.35f, i23Var.f() * 6.2831855f, i23Var.f() + 0.5f, (i23Var.f() - 0.5f) * 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j23.d.d(4), 16128);
                }
                break;
            case -991674327:
                if (str.equals("petals")) {
                    return new bm3(fq2.c(80.0f, f3, f, i23Var.f()) - (40.0f * f3), z ? i23Var.f() * f2 : (-((i23Var.f() * 120.0f) + 20.0f)) * f3, f4, (17.0f * f4) + 13.0f, (1.05f * f4) + 0.45f, i23Var.f() * 6.2831855f, (i23Var.f() * 1.2f) + 0.6f, i23Var.f() * 6.2831855f, (i23Var.f() - 0.5f) * 0.04f, 0.0f, 0.0f, 0.0f, 0.0f, j23.d.d(3), 15872);
                }
                break;
            case -280000549:
                if (str.equals("fireflies")) {
                    return new bm3(i23Var.f() * f, ((i23Var.f() * 0.75f) + 0.25f) * f2, f4, (16.0f * f4) + 10.0f, 0.0f, i23Var.f() * 6.2831855f, 0.0f, 0.0f, 0.0f, 0.0f, (i23Var.f() * 0.9f) + 0.6f, (i23Var.f() - 0.5f) * 0.4f, (i23Var.f() - 0.5f) * 0.3f, 0, 18304);
                }
                break;
            case 224189799:
                if (str.equals("bubbles")) {
                    return new bm3(i23Var.f() * f, z ? i23Var.f() * f2 : (((i23Var.f() * 80.0f) + 30.0f) * f3) + f2, f4, (34.0f * f4) + 10.0f, (f4 * 0.9f) + 0.3f, i23Var.f() * 6.2831855f, (i23Var.f() * 0.9f) + 0.4f, 0.0f, 0.0f, i23Var.f() * 0.55f * f2, 0.0f, 0.0f, 0.0f, 0, 32128);
                }
                break;
        }
        return new bm3(fq2.c(r6, f3, f, i23Var.f()) - (20.0f * f3), z ? i23Var.f() * f2 : (-((i23Var.f() * 120.0f) + 40.0f)) * f3, f4, (26.0f * f4) + 18.0f, (f4 * 1.0f) + 0.4f, i23Var.f() * 6.2831855f, (i23Var.f() * 1.0f) + 0.4f, 0.6f * (i23Var.f() - 0.5f), (i23Var.f() - 0.5f) * 0.01f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 32256);
    }

    public static final void b(tz0 tz0Var, bm1 bm1Var, float f, float f2, float f3, float f4, float f5, float f6) {
        ci4 ci4Var;
        if (f6 <= 0.004f || f3 < 1.0f) {
            return;
        }
        ((jb) tz0Var.A().d).B(f, f2);
        try {
            ci4 ci4VarA = tz0Var.A();
            long jC = ci4VarA.C();
            ci4VarA.y().l();
            try {
                ((jb) ci4VarA.d).z(57.29578f * f4);
                ci4 ci4VarA2 = tz0Var.A();
                long jC2 = ci4VarA2.C();
                ci4VarA2.y().l();
                try {
                    ((jb) ci4VarA2.d).A(f5, 1.0f, 0L);
                    int iR = gb2.R(f3);
                    int i = -iR;
                    long j = iR;
                    try {
                        tz0.d0(tz0Var, bm1Var, (((long) ((ib) bm1Var).b.getWidth()) << 32) | (((long) ((ib) bm1Var).b.getHeight()) & 4294967295L), (((long) (i / 2)) << 32) | (((long) (i / 2)) & 4294967295L), (j << 32) | (j & 4294967295L), Math.min(1.0f, f6), null, 0, 960);
                        try {
                            ci4VarA2.y().i();
                            ci4VarA2.N(jC2);
                            ci4VarA.y().i();
                            ci4VarA.N(jC);
                            ((jb) tz0Var.A().d).B(-f, -f2);
                        } catch (Throwable th) {
                            th = th;
                            ci4Var = ci4VarA;
                            ci4Var.y().i();
                            ci4Var.N(jC);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ci4Var = ci4VarA;
                        try {
                            ci4VarA2.y().i();
                            ci4VarA2.N(jC2);
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            ci4Var.y().i();
                            ci4Var.N(jC);
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    ci4Var = ci4VarA;
                }
            } catch (Throwable th5) {
                th = th5;
                ci4Var = ci4VarA;
            }
        } catch (Throwable th6) {
            ((jb) tz0Var.A().d).B(-f, -f2);
            throw th6;
        }
    }
}
