package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.Settings;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.ContentScale$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.File;
import java.util.ArrayList;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class z30 {
    private static final void ChatBgFx(String str, boolean z, ck0 ck0Var, int i) {
        int i2;
        Object obj;
        char c;
        char c2;
        Object obj2;
        Object obj3;
        Object obj4;
        char c3;
        char c4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        boolean z2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1428288654);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.i(z) ? 32 : 16;
        }
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                    obj = objP;
                    z2 = true;
                } else {
                    obj = objP;
                    z2 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                kk0Var.l0(boolValueOf);
                obj = boolValueOf;
            }
            obj = objP;
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            Object objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                c = 0;
                c2 = 1;
                dt2 dt2Var = new dt2(0L);
                kk0Var.l0(dt2Var);
                obj2 = dt2Var;
            } else {
                c = 0;
                c2 = 1;
                obj2 = objP2;
            }
            dt2 dt2Var2 = (dt2) obj2;
            int i3 = i2 & 14;
            char c5 = i3 == 4 ? c2 : c;
            Object objP3 = kk0Var.P();
            if (c5 != 0 || objP3 == Composer$Companion.getEmpty()) {
                obj3 = objP3;
                ArrayList arrayList = new ArrayList();
                kk0Var.l0(arrayList);
                obj3 = arrayList;
            }
            obj3 = objP3;
            ArrayList arrayList2 = (ArrayList) obj3;
            char c6 = i3 == 4 ? c2 : c;
            Object objP4 = kk0Var.P();
            if (c6 != 0 || objP4 == Composer$Companion.getEmpty()) {
                obj4 = objP4;
                ArrayList arrayList3 = new ArrayList();
                kk0Var.l0(arrayList3);
                obj4 = arrayList3;
            }
            obj4 = objP4;
            ArrayList arrayList4 = (ArrayList) obj4;
            if (i3 == 4) {
                c3 = c2;
                c4 = c3;
            } else {
                c3 = c;
                c4 = c2;
            }
            Object objP5 = kk0Var.P();
            if (c3 != 0 || objP5 == Composer$Companion.getEmpty()) {
                obj5 = objP5;
                ArrayList arrayList5 = new ArrayList();
                kk0Var.l0(arrayList5);
                obj5 = arrayList5;
            }
            obj5 = objP5;
            ArrayList arrayList6 = (ArrayList) obj5;
            char c7 = i3 == 4 ? c4 : c;
            Object objP6 = kk0Var.P();
            if (c7 != 0 || objP6 == Composer$Companion.getEmpty()) {
                obj6 = objP6;
                float[] fArr = new float[2];
                fArr[c] = 0.0f;
                fArr[c4] = 0.0f;
                kk0Var.l0(fArr);
                obj6 = fArr;
            }
            obj6 = objP6;
            float[] fArr2 = (float[]) obj6;
            char c8 = i3 == 4 ? c4 : c;
            Object objP7 = kk0Var.P();
            if (c8 != 0 || objP7 == Composer$Companion.getEmpty()) {
                obj7 = objP7;
                float[] fArr3 = new float[2];
                fArr3[c] = 0.0f;
                fArr3[c4] = 1.0f;
                kk0Var.l0(fArr3);
                obj7 = fArr3;
            }
            obj7 = objP7;
            float[] fArr4 = (float[]) obj7;
            boolean zJ = kk0Var.j(fArr4);
            Object objP8 = kk0Var.P();
            if (zJ || objP8 == Composer$Companion.getEmpty()) {
                obj8 = objP8;
                u30 u30Var = new u30(zBooleanValue, dt2Var2, fArr4, null, 1);
                kk0Var.l0(u30Var);
                obj8 = u30Var;
            }
            obj8 = objP8;
            r11.LaunchedEffect(str, bool, (ne1) obj8, kk0Var, i3 | 48);
            Modifier$Companion modifier$Companion = c.i;
            FillElement fillElement = d.c;
            int i4 = (((kk0Var.j(fArr2) ? 1 : 0) | (kk0Var.j(arrayList2) ? 1 : 0)) | (kk0Var.j(arrayList4) ? 1 : 0) ? 1 : 0) | (i3 == 4 ? c4 : c) | (kk0Var.j(fArr4) ? 1 : 0);
            if ((i2 & 112) != 32) {
                c4 = c;
            }
            int i5 = (i4 == true ? 1 : 0) | c4 | (kk0Var.j(arrayList6) ? 1 : 0);
            Object objP9 = kk0Var.P();
            if (i5 != 0 || objP9 == Composer$Companion.getEmpty()) {
                s30 s30Var = new s30(fArr2, arrayList2, arrayList4, str, fArr4, z, zBooleanValue, arrayList6, dt2Var2);
                kk0Var.l0(s30Var);
                objP9 = s30Var;
            }
            c10.Canvas(fillElement, (le1) objP9, kk0Var, 6);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new w30(str, i, z));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0152  */
    /* JADX WARN: Code duplicated, block: B:102:0x0155  */
    /* JADX WARN: Code duplicated, block: B:104:0x015b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0163  */
    /* JADX WARN: Code duplicated, block: B:107:0x0195  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x013a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0140  */
    /* JADX WARN: Code duplicated, block: B:98:0x0147  */
    public static final void ChatBgLayer(final qt qtVar, final tt ttVar, final String str, final File file, final File file2, final long j, File file3, final String str2, c cVar, ck0 ck0Var, final int i, final int i2) {
        int i3;
        File file4;
        String str3;
        int i4;
        int i5;
        boolean z;
        File file5;
        File file6;
        kk0 kk0Var;
        final c cVar2;
        final File file7;
        w33 w33VarV;
        final File file8;
        final c cVar3;
        Context context;
        rt rtVarA;
        Object objD;
        String str4;
        final Object objC;
        w33 w33VarV2;
        int i6;
        qtVar.getClass();
        ttVar.getClass();
        String str5 = ttVar.a;
        str.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(1006932592);
        if ((i & 6) == 0) {
            i3 = (kk0Var2.j(qtVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var2.h(ttVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= kk0Var2.h(str) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i3 |= kk0Var2.j(file) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= kk0Var2.j(file2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i) == 0) {
            i3 |= kk0Var2.g(j) ? 131072 : 65536;
        }
        int i7 = i2 & 64;
        if (i7 == 0) {
            if ((1572864 & i) == 0) {
                file4 = file3;
                i3 |= kk0Var2.j(file4) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                str3 = str2;
                if (kk0Var2.h(str3)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            } else {
                str3 = str2;
            }
            i4 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
            if (i4 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (kk0Var2.h(cVar)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i3 |= i5;
            }
            if ((i3 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var2.S(i3 & 1, z)) {
                if (i7 != 0) {
                    file8 = null;
                } else {
                    file8 = file4;
                }
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar;
                }
                if (!ttVar.e()) {
                    w33VarV2 = kk0Var2.v();
                    if (w33VarV2 != null) {
                        final int i8 = 0;
                        final String str6 = str3;
                        w33VarV2.updateScope(new ne1() { // from class: x30
                            @Override // defpackage.ne1
                            public final Object invoke(Object obj, Object obj2) {
                                int i9 = i8;
                                w84 w84Var = w84.a;
                                int i10 = i;
                                switch (i9) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iV = sf3.V(i10 | 1);
                                        z30.ChatBgLayer(qtVar, ttVar, str, file, file2, j, file8, str6, cVar3, (ck0) obj, iV, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iV2 = sf3.V(i10 | 1);
                                        z30.ChatBgLayer(qtVar, ttVar, str, file, file2, j, file8, str6, cVar3, (ck0) obj, iV2, i2);
                                        break;
                                }
                                return w84Var;
                            }
                        });
                        return;
                    }
                    return;
                }
                file5 = file;
                file6 = file2;
                final File file9 = file8;
                c cVar4 = cVar3;
                context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
                if (kr1.n(str5, "own")) {
                    objD = c(context, j, file5, "bg");
                } else {
                    rtVarA = qtVar.a(str5);
                    if (rtVarA != null) {
                        objD = d(str, rtVarA.c);
                    } else {
                        objD = null;
                    }
                }
                str4 = ttVar.d;
                if (kr1.n(str4, "ai")) {
                    objC = str2;
                } else if (kr1.n(str4, "own")) {
                    objC = c(context, j, file6, "pt");
                } else {
                    objC = null;
                }
                final long j2 = ab2.a.getColorScheme(kk0Var2, 0).n;
                c cVarThen = cVar4.then(d.c);
                final Object obj = objD;
                oe1 oe1Var = new oe1() { // from class: y30
                    @Override // defpackage.oe1
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return z30.ChatBgLayer$lambda$12(obj, j2, ttVar, file9, j, objC, qtVar, (dx) obj2, (ck0) obj3, iIntValue);
                    }
                };
                file7 = file9;
                kk0Var = kk0Var2;
                cx.BoxWithConstraints(cVarThen, null, false, zg0.rememberComposableLambda(1920095174, true, oe1Var, kk0Var2, 54), kk0Var, 3072, 6);
                cVar2 = cVar4;
            } else {
                file5 = file;
                file6 = file2;
                kk0Var = kk0Var2;
                kk0Var.V();
                cVar2 = cVar;
                file7 = file4;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                final int i9 = 1;
                final File file10 = file5;
                final File file11 = file6;
                w33VarV.updateScope(new ne1() { // from class: x30
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj2, Object obj3) {
                        int i10 = i9;
                        w84 w84Var = w84.a;
                        int i11 = i;
                        switch (i10) {
                            case 0:
                                ((Integer) obj3).getClass();
                                int iV = sf3.V(i11 | 1);
                                z30.ChatBgLayer(qtVar, ttVar, str, file10, file11, j, file7, str2, cVar2, (ck0) obj2, iV, i2);
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                int iV2 = sf3.V(i11 | 1);
                                z30.ChatBgLayer(qtVar, ttVar, str, file10, file11, j, file7, str2, cVar2, (ck0) obj2, iV2, i2);
                                break;
                        }
                        return w84Var;
                    }
                });
            }
        }
        i3 |= 1572864;
        file4 = file3;
        if ((12582912 & i) == 0) {
            str3 = str2;
            if (kk0Var2.h(str3)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        } else {
            str3 = str2;
        }
        i4 = i2 & FontInfo.NUMBER_OF_CHAR_CODES;
        if (i4 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (kk0Var2.h(cVar)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i3 |= i5;
        }
        if ((i3 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var2.S(i3 & 1, z)) {
            if (i7 != 0) {
                file8 = null;
            } else {
                file8 = file4;
            }
            if (i4 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar;
            }
            if (!ttVar.e()) {
                w33VarV2 = kk0Var2.v();
                if (w33VarV2 != null) {
                    final int i10 = 0;
                    final String str7 = str3;
                    w33VarV2.updateScope(new ne1() { // from class: x30
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj2, Object obj3) {
                            int i11 = i10;
                            w84 w84Var = w84.a;
                            int i12 = i;
                            switch (i11) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int iV = sf3.V(i12 | 1);
                                    z30.ChatBgLayer(qtVar, ttVar, str, file, file2, j, file8, str7, cVar3, (ck0) obj2, iV, i2);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int iV2 = sf3.V(i12 | 1);
                                    z30.ChatBgLayer(qtVar, ttVar, str, file, file2, j, file8, str7, cVar3, (ck0) obj2, iV2, i2);
                                    break;
                            }
                            return w84Var;
                        }
                    });
                    return;
                }
                return;
            }
            file5 = file;
            file6 = file2;
            final File file12 = file8;
            c cVar5 = cVar3;
            context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
            if (kr1.n(str5, "own")) {
                objD = c(context, j, file5, "bg");
            } else {
                rtVarA = qtVar.a(str5);
                if (rtVarA != null) {
                    objD = d(str, rtVarA.c);
                } else {
                    objD = null;
                }
            }
            str4 = ttVar.d;
            if (kr1.n(str4, "ai")) {
                objC = str2;
            } else if (kr1.n(str4, "own")) {
                objC = c(context, j, file6, "pt");
            } else {
                objC = null;
            }
            final long j3 = ab2.a.getColorScheme(kk0Var2, 0).n;
            c cVarThen2 = cVar5.then(d.c);
            final Object obj2 = objD;
            oe1 oe1Var2 = new oe1() { // from class: y30
                @Override // defpackage.oe1
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    return z30.ChatBgLayer$lambda$12(obj2, j3, ttVar, file12, j, objC, qtVar, (dx) obj3, (ck0) obj4, iIntValue);
                }
            };
            file7 = file12;
            kk0Var = kk0Var2;
            cx.BoxWithConstraints(cVarThen2, null, false, zg0.rememberComposableLambda(1920095174, true, oe1Var2, kk0Var2, 54), kk0Var, 3072, 6);
            cVar2 = cVar5;
        } else {
            file5 = file;
            file6 = file2;
            kk0Var = kk0Var2;
            kk0Var.V();
            cVar2 = cVar;
            file7 = file4;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            final int i11 = 1;
            final File file13 = file5;
            final File file14 = file6;
            w33VarV.updateScope(new ne1() { // from class: x30
                @Override // defpackage.ne1
                public final Object invoke(Object obj3, Object obj4) {
                    int i12 = i11;
                    w84 w84Var = w84.a;
                    int i13 = i;
                    switch (i12) {
                        case 0:
                            ((Integer) obj4).getClass();
                            int iV = sf3.V(i13 | 1);
                            z30.ChatBgLayer(qtVar, ttVar, str, file13, file14, j, file7, str2, cVar2, (ck0) obj3, iV, i2);
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            int iV2 = sf3.V(i13 | 1);
                            z30.ChatBgLayer(qtVar, ttVar, str, file13, file14, j, file7, str2, cVar2, (ck0) obj3, iV2, i2);
                            break;
                    }
                    return w84Var;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    public static final w84 ChatBgLayer$lambda$12(Object obj, long j, tt ttVar, File file, long j2, Object obj2, qt qtVar, dx dxVar, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var;
        int i3;
        long j3;
        bm1 bm1Var;
        Object i63Var;
        dxVar.getClass();
        if ((i & 6) == 0) {
            i2 = i | (((kk0) ck0Var).h(dxVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        kk0 kk0Var2 = (kk0) ck0Var;
        if (kk0Var2.S(i2 & 1, (i2 & 19) != 18)) {
            if (obj != null) {
                kk0Var2.a0(1180919971);
                qn0 crop = ContentScale$Companion.getCrop();
                Modifier$Companion modifier$Companion = c.i;
                FillElement fillElement = d.c;
                i3 = 1177639644;
                vh3.m1845xef24a3e0(obj, null, fillElement, null, null, null, crop, 0.0f, null, 0, false, kk0Var2, 1573296, 0, 1976);
                kk0Var = kk0Var2;
                j3 = j;
                vw.Box(a.b(fillElement, re0.b(ttVar.c / 100.0f, j3), k43.a), kk0Var, 0);
            } else {
                kk0Var = kk0Var2;
                i3 = 1177639644;
                j3 = j;
                kk0Var.a0(1177639644);
            }
            kk0Var.r(false);
            String str = ttVar.b;
            String str2 = ttVar.e;
            if (kr1.n(str, "rain") || kr1.n(str, "snow")) {
                kk0Var.a0(1181247083);
                ChatBgFx(str, gb2.J(j3) < 0.4f, kk0Var, 0);
                kk0Var.r(false);
            } else {
                if (v30.a.contains(str)) {
                    kk0Var.a0(1181369254);
                    boolean zH = kk0Var.h(file != null ? file.getPath() : null) | kk0Var.g(j2);
                    Object objP = kk0Var.P();
                    if (zH || objP == Composer$Companion.getEmpty()) {
                        if (file == null) {
                            bm1Var = null;
                        } else {
                            File file2 = file.isFile() ? file : null;
                            if (file2 != null) {
                                try {
                                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file2.getPath());
                                    i63Var = bitmapDecodeFile != null ? new ib(bitmapDecodeFile) : null;
                                } catch (Throwable th) {
                                    i63Var = new i63(th);
                                }
                                bm1Var = (bm1) (i63Var instanceof i63 ? null : i63Var);
                            } else {
                                bm1Var = null;
                            }
                        }
                        kk0Var.l0(bm1Var);
                        objP = bm1Var;
                    }
                    v30.ChatBgSpriteFx(str, gb2.J(j3) < 0.4f, (bm1) objP, kk0Var, 0);
                } else {
                    kk0Var.a0(i3);
                }
                kk0Var.r(false);
            }
            if (obj2 != null) {
                kk0Var.a0(1181763233);
                Float f = (Float) qtVar.i.get(str2);
                float fFloatValue = f != null ? f.floatValue() : 0.54f;
                androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) dxVar;
                wu0 wu0Var = cVar.a;
                long j4 = cVar.b;
                float fQ0 = (um0.c(j4) ? wu0Var.q0(um0.g(j4)) : Float.POSITIVE_INFINITY) * fFloatValue;
                if (kr1.n(ttVar.d, "ai")) {
                    rx0 rx0Var = new rx0(fQ0);
                    Integer num = (Integer) qtVar.j.get(str2);
                    rx0 rx0Var2 = new rx0(num != null ? num.intValue() : 250);
                    if (rx0Var.compareTo(rx0Var2) > 0) {
                        rx0Var = rx0Var2;
                    }
                    fQ0 = rx0Var.c;
                }
                rn0 fit = ContentScale$Companion.getFit();
                yt bottomEnd = Alignment$Companion.getBottomEnd();
                c cVarL = g13.l(d.o(d.d(androidx.compose.foundation.layout.a.o(b.a.a(c.i, Alignment$Companion.getBottomEnd()), 0.0f, 0.0f, cVar.b() * 0.02f, 80.0f, 3), fQ0), cVar.b() * 0.7f, 1), ttVar.f / 100.0f);
                Object objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new f2(6);
                    kk0Var.l0(objP2);
                }
                c cVarA = androidx.compose.ui.graphics.a.a(cVarL, (le1) objP2);
                Object objP3 = kk0Var.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    objP3 = new f2(7);
                    kk0Var.l0(objP3);
                }
                kk0 kk0Var3 = kk0Var;
                vh3.m1845xef24a3e0(obj2, null, androidx.compose.ui.draw.a.c(cVarA, (le1) objP3), null, null, bottomEnd, fit, 0.0f, null, 0, false, kk0Var3, 1769520, 0, 1944);
                kk0Var = kk0Var3;
            } else {
                kk0Var.a0(i3);
            }
            kk0Var.r(false);
        } else {
            kk0Var2.V();
        }
        return w84.a;
    }

    public static void a(String str, boolean z, ck0 ck0Var, int i) {
        ChatBgFx(str, z, ck0Var, sf3.V(i | 1));
    }

    public static final pm1 c(Context context, long j, File file, String str) {
        if (file == null) {
            return null;
        }
        mm1 mm1Var = new mm1(context);
        mm1Var.c = file;
        mm1Var.e = "chatbg-" + str + "-" + j;
        mm1Var.g = "chatbg-" + str + "-" + j;
        return mm1Var.a();
    }

    public static final String d(String str, String str2) {
        str.getClass();
        if (to3.q0(str2, "http", false)) {
            return str2;
        }
        return mo3.X0(str, '/') + "/" + mo3.Y0(str2, '/');
    }

    public static final j01 e(float f, float f2, float f3, boolean z) {
        float f4;
        float f5;
        i23 i23Var = j23.c;
        if (i23Var.f() < 0.34f) {
            f4 = i23Var.f() * 0.2f;
            f5 = 0.12f;
        } else {
            f4 = i23Var.f() * 0.7f;
            f5 = 0.3f;
        }
        float f6 = f4 + f5;
        return new j01(fq2.c(240.0f, f3, f, i23Var.f()) - (60.0f * f3), z ? i23Var.f() * f2 : ((-30.0f) * f3) - ((i23Var.f() * 240.0f) * f3), f6, fq2.c(f6, 26.0f, 7.0f, f3), (17.0f * f6) + 7.0f, fq2.c(f6, 1.2f, 0.45f, f3), (0.38f * f6) + 0.08f);
    }

    public static final v71 f(float f, float f2, float f3, boolean z) {
        float f4;
        float f5;
        i23 i23Var = j23.c;
        boolean z2 = i23Var.f() < 0.07f;
        float f6 = i23Var.f();
        if (z2) {
            f4 = f6 * 0.5f;
            f5 = 1.25f;
        } else {
            f4 = f6 * 0.8f;
            f5 = 0.2f;
        }
        float f7 = f4 + f5;
        float f8 = 40.0f * f3;
        return new v71(((f + f8) * i23Var.f()) - f8, z ? i23Var.f() * f2 : ((-12.0f) * f3) - ((i23Var.f() * 80.0f) * f3), f7, fq2.c(f7, 2.9f, 0.9f, f3), (f7 * 1.1f) + 0.32f, i23Var.f() * 2.0f * 3.1415927f, (i23Var.f() * 1.2f) + 0.4f, (i23Var.f() * 1.1f) + 0.5f, z2 ? 0.38f : (0.48f * f7) + 0.5f);
    }
}
