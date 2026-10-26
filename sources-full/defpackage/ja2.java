package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.io.ConstantsKt;
import kotlin.text.Typography;
import kotlin.uuid.Uuid;
import okhttp3.Headers$Companion;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class ja2 {
    /* JADX WARN: Code duplicated, block: B:100:0x0115  */
    /* JADX WARN: Code duplicated, block: B:104:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:110:0x019b  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c  */
    private static final void CodeAction(final ym1 ym1Var, final String str, final boolean z, final je1 je1Var, boolean z2, boolean z3, String str2, ck0 ck0Var, final int i, final int i2) {
        int i3;
        je1 je1Var2;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        String str3;
        int i7;
        boolean z6;
        kk0 kk0Var;
        final boolean z7;
        final boolean z8;
        final String str4;
        w33 w33VarV;
        final boolean z9;
        final boolean z10;
        String str5;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objP;
        c cVarB;
        long jF;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-457077096);
        if ((i & 6) == 0) {
            i3 = (kk0Var2.h(ym1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var2.h(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= kk0Var2.i(z) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            je1Var2 = je1Var;
            i3 |= kk0Var2.j(je1Var2) ? 2048 : 1024;
        } else {
            je1Var2 = je1Var;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                z4 = z2;
                i3 |= kk0Var2.i(z4) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z5 = z3;
                    if (kk0Var2.i(z5)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        str3 = str2;
                        if (kk0Var2.h(str3)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    if ((599187 & i3) != 599186) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (kk0Var2.S(i3 & 1, z6)) {
                        if (i8 != 0) {
                            z9 = false;
                        } else {
                            z9 = z4;
                        }
                        if (i4 != 0) {
                            z10 = false;
                        } else {
                            z10 = z5;
                        }
                        if (i6 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        is2 is2Var = new is2(8.0f, 0.0f, 8.0f, 0.0f);
                        if (z10 && str5 == null) {
                            kk0Var2.a0(-1164409408);
                            kk0Var2.r(false);
                            cVarB = c.i;
                        } else {
                            kk0Var2.a0(-1164411282);
                            Modifier$Companion modifier$Companion = c.i;
                            if ((3670016 & i3) == 1048576) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((i3 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z13 = z11 | z12;
                            objP = kk0Var2.P();
                            if (z13 || objP == Composer$Companion.getEmpty()) {
                                objP = new dp(str5, str, 1);
                                kk0Var2.l0(objP);
                            }
                            cVarB = we3.b(modifier$Companion, false, (le1) objP);
                            kk0Var2.r(false);
                        }
                        String str6 = str5;
                        c cVar = cVarB;
                        uy uyVar = uy.a;
                        if (z && !z9) {
                            kk0Var2.a0(-1164405048);
                            jF = ab2.a.getColorScheme(kk0Var2, 0).s;
                            kk0Var2.r(false);
                        }
                        bz.TextButton(je1Var2, cVar, false, null, uyVar.m1840x47c3eb61(0L, jF, 0L, 0L, kk0Var2, 0, 13), null, null, is2Var, null, zg0.rememberComposableLambda(-2080755051, true, new oe1() { // from class: da2
                            @Override // defpackage.oe1
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return ja2.CodeAction$lambda$48(ym1Var, z10, z9, str, (g83) obj, (ck0) obj2, iIntValue);
                            }
                        }, kk0Var2, 54), kk0Var2, ((i3 >> 9) & 14) | 817889280, 364);
                        kk0Var = kk0Var2;
                        z7 = z9;
                        z8 = z10;
                        str4 = str6;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        z7 = z4;
                        z8 = z5;
                        str4 = str3;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ne1() { // from class: ea2
                            @Override // defpackage.ne1
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ja2.c(ym1Var, str, z, je1Var, z7, z8, str4, (ck0) obj, i, i2);
                                return w84.a;
                            }
                        });
                    }
                }
                i3 |= 1572864;
                str3 = str2;
                if ((599187 & i3) != 599186) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (kk0Var2.S(i3 & 1, z6)) {
                    if (i8 != 0) {
                        z9 = false;
                    } else {
                        z9 = z4;
                    }
                    if (i4 != 0) {
                        z10 = false;
                    } else {
                        z10 = z5;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    is2 is2Var2 = new is2(8.0f, 0.0f, 8.0f, 0.0f);
                    if (z10) {
                        kk0Var2.a0(-1164411282);
                        Modifier$Companion modifier$Companion2 = c.i;
                        if ((3670016 & i3) == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i3 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z11 | z12;
                        objP = kk0Var2.P();
                        if (z13) {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        }
                        cVarB = we3.b(modifier$Companion2, false, (le1) objP);
                        kk0Var2.r(false);
                    } else {
                        kk0Var2.a0(-1164411282);
                        Modifier$Companion modifier$Companion3 = c.i;
                        if ((3670016 & i3) == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i3 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z11 | z12;
                        objP = kk0Var2.P();
                        if (z13) {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        }
                        cVarB = we3.b(modifier$Companion3, false, (le1) objP);
                        kk0Var2.r(false);
                    }
                    String str7 = str5;
                    c cVar2 = cVarB;
                    uy uyVar2 = uy.a;
                    jF = z ? fq2.f(kk0Var2, -1164406398, kk0Var2, 0, false) : fq2.f(kk0Var2, -1164406398, kk0Var2, 0, false);
                    bz.TextButton(je1Var2, cVar2, false, null, uyVar2.m1840x47c3eb61(0L, jF, 0L, 0L, kk0Var2, 0, 13), null, null, is2Var2, null, zg0.rememberComposableLambda(-2080755051, true, new oe1() { // from class: da2
                        @Override // defpackage.oe1
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return ja2.CodeAction$lambda$48(ym1Var, z10, z9, str, (g83) obj, (ck0) obj2, iIntValue);
                        }
                    }, kk0Var2, 54), kk0Var2, ((i3 >> 9) & 14) | 817889280, 364);
                    kk0Var = kk0Var2;
                    z7 = z9;
                    z8 = z10;
                    str4 = str7;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    z7 = z4;
                    z8 = z5;
                    str4 = str3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ne1() { // from class: ea2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ja2.c(ym1Var, str, z, je1Var, z7, z8, str4, (ck0) obj, i, i2);
                            return w84.a;
                        }
                    });
                }
            }
            i3 |= 196608;
            z5 = z3;
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    str3 = str2;
                    if (kk0Var2.h(str3)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((599187 & i3) != 599186) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (kk0Var2.S(i3 & 1, z6)) {
                    if (i8 != 0) {
                        z9 = false;
                    } else {
                        z9 = z4;
                    }
                    if (i4 != 0) {
                        z10 = false;
                    } else {
                        z10 = z5;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    is2 is2Var3 = new is2(8.0f, 0.0f, 8.0f, 0.0f);
                    if (z10) {
                        kk0Var2.a0(-1164411282);
                        Modifier$Companion modifier$Companion4 = c.i;
                        if ((3670016 & i3) == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i3 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z11 | z12;
                        objP = kk0Var2.P();
                        if (z13) {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        }
                        cVarB = we3.b(modifier$Companion4, false, (le1) objP);
                        kk0Var2.r(false);
                    } else {
                        kk0Var2.a0(-1164411282);
                        Modifier$Companion modifier$Companion5 = c.i;
                        if ((3670016 & i3) == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i3 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z11 | z12;
                        objP = kk0Var2.P();
                        if (z13) {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        }
                        cVarB = we3.b(modifier$Companion5, false, (le1) objP);
                        kk0Var2.r(false);
                    }
                    String str8 = str5;
                    c cVar3 = cVarB;
                    uy uyVar3 = uy.a;
                    if (z) {
                    }
                    bz.TextButton(je1Var2, cVar3, false, null, uyVar3.m1840x47c3eb61(0L, jF, 0L, 0L, kk0Var2, 0, 13), null, null, is2Var3, null, zg0.rememberComposableLambda(-2080755051, true, new oe1() { // from class: da2
                        @Override // defpackage.oe1
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return ja2.CodeAction$lambda$48(ym1Var, z10, z9, str, (g83) obj, (ck0) obj2, iIntValue);
                        }
                    }, kk0Var2, 54), kk0Var2, ((i3 >> 9) & 14) | 817889280, 364);
                    kk0Var = kk0Var2;
                    z7 = z9;
                    z8 = z10;
                    str4 = str8;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    z7 = z4;
                    z8 = z5;
                    str4 = str3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ne1() { // from class: ea2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ja2.c(ym1Var, str, z, je1Var, z7, z8, str4, (ck0) obj, i, i2);
                            return w84.a;
                        }
                    });
                }
            }
            i3 |= 1572864;
            str3 = str2;
            if ((599187 & i3) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (kk0Var2.S(i3 & 1, z6)) {
                if (i8 != 0) {
                    z9 = false;
                } else {
                    z9 = z4;
                }
                if (i4 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                is2 is2Var4 = new is2(8.0f, 0.0f, 8.0f, 0.0f);
                if (z10) {
                    kk0Var2.a0(-1164411282);
                    Modifier$Companion modifier$Companion6 = c.i;
                    if ((3670016 & i3) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objP = kk0Var2.P();
                    if (z13) {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    }
                    cVarB = we3.b(modifier$Companion6, false, (le1) objP);
                    kk0Var2.r(false);
                } else {
                    kk0Var2.a0(-1164411282);
                    Modifier$Companion modifier$Companion7 = c.i;
                    if ((3670016 & i3) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objP = kk0Var2.P();
                    if (z13) {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    }
                    cVarB = we3.b(modifier$Companion7, false, (le1) objP);
                    kk0Var2.r(false);
                }
                String str9 = str5;
                c cVar4 = cVarB;
                uy uyVar4 = uy.a;
                if (z) {
                }
                bz.TextButton(je1Var2, cVar4, false, null, uyVar4.m1840x47c3eb61(0L, jF, 0L, 0L, kk0Var2, 0, 13), null, null, is2Var4, null, zg0.rememberComposableLambda(-2080755051, true, new oe1() { // from class: da2
                    @Override // defpackage.oe1
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return ja2.CodeAction$lambda$48(ym1Var, z10, z9, str, (g83) obj, (ck0) obj2, iIntValue);
                    }
                }, kk0Var2, 54), kk0Var2, ((i3 >> 9) & 14) | 817889280, 364);
                kk0Var = kk0Var2;
                z7 = z9;
                z8 = z10;
                str4 = str9;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                z7 = z4;
                z8 = z5;
                str4 = str3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: ea2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ja2.c(ym1Var, str, z, je1Var, z7, z8, str4, (ck0) obj, i, i2);
                        return w84.a;
                    }
                });
            }
        }
        i3 |= 24576;
        z4 = z2;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z5 = z3;
                if (kk0Var2.i(z5)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    str3 = str2;
                    if (kk0Var2.h(str3)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((599187 & i3) != 599186) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (kk0Var2.S(i3 & 1, z6)) {
                    if (i8 != 0) {
                        z9 = false;
                    } else {
                        z9 = z4;
                    }
                    if (i4 != 0) {
                        z10 = false;
                    } else {
                        z10 = z5;
                    }
                    if (i6 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    is2 is2Var5 = new is2(8.0f, 0.0f, 8.0f, 0.0f);
                    if (z10) {
                        kk0Var2.a0(-1164411282);
                        Modifier$Companion modifier$Companion8 = c.i;
                        if ((3670016 & i3) == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i3 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z11 | z12;
                        objP = kk0Var2.P();
                        if (z13) {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        }
                        cVarB = we3.b(modifier$Companion8, false, (le1) objP);
                        kk0Var2.r(false);
                    } else {
                        kk0Var2.a0(-1164411282);
                        Modifier$Companion modifier$Companion9 = c.i;
                        if ((3670016 & i3) == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i3 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z11 | z12;
                        objP = kk0Var2.P();
                        if (z13) {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        } else {
                            objP = new dp(str5, str, 1);
                            kk0Var2.l0(objP);
                        }
                        cVarB = we3.b(modifier$Companion9, false, (le1) objP);
                        kk0Var2.r(false);
                    }
                    String str10 = str5;
                    c cVar5 = cVarB;
                    uy uyVar5 = uy.a;
                    if (z) {
                    }
                    bz.TextButton(je1Var2, cVar5, false, null, uyVar5.m1840x47c3eb61(0L, jF, 0L, 0L, kk0Var2, 0, 13), null, null, is2Var5, null, zg0.rememberComposableLambda(-2080755051, true, new oe1() { // from class: da2
                        @Override // defpackage.oe1
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return ja2.CodeAction$lambda$48(ym1Var, z10, z9, str, (g83) obj, (ck0) obj2, iIntValue);
                        }
                    }, kk0Var2, 54), kk0Var2, ((i3 >> 9) & 14) | 817889280, 364);
                    kk0Var = kk0Var2;
                    z7 = z9;
                    z8 = z10;
                    str4 = str10;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    z7 = z4;
                    z8 = z5;
                    str4 = str3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ne1() { // from class: ea2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ja2.c(ym1Var, str, z, je1Var, z7, z8, str4, (ck0) obj, i, i2);
                            return w84.a;
                        }
                    });
                }
            }
            i3 |= 1572864;
            str3 = str2;
            if ((599187 & i3) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (kk0Var2.S(i3 & 1, z6)) {
                if (i8 != 0) {
                    z9 = false;
                } else {
                    z9 = z4;
                }
                if (i4 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                is2 is2Var6 = new is2(8.0f, 0.0f, 8.0f, 0.0f);
                if (z10) {
                    kk0Var2.a0(-1164411282);
                    Modifier$Companion modifier$Companion10 = c.i;
                    if ((3670016 & i3) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objP = kk0Var2.P();
                    if (z13) {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    }
                    cVarB = we3.b(modifier$Companion10, false, (le1) objP);
                    kk0Var2.r(false);
                } else {
                    kk0Var2.a0(-1164411282);
                    Modifier$Companion modifier$Companion11 = c.i;
                    if ((3670016 & i3) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objP = kk0Var2.P();
                    if (z13) {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    }
                    cVarB = we3.b(modifier$Companion11, false, (le1) objP);
                    kk0Var2.r(false);
                }
                String str11 = str5;
                c cVar6 = cVarB;
                uy uyVar6 = uy.a;
                if (z) {
                }
                bz.TextButton(je1Var2, cVar6, false, null, uyVar6.m1840x47c3eb61(0L, jF, 0L, 0L, kk0Var2, 0, 13), null, null, is2Var6, null, zg0.rememberComposableLambda(-2080755051, true, new oe1() { // from class: da2
                    @Override // defpackage.oe1
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return ja2.CodeAction$lambda$48(ym1Var, z10, z9, str, (g83) obj, (ck0) obj2, iIntValue);
                    }
                }, kk0Var2, 54), kk0Var2, ((i3 >> 9) & 14) | 817889280, 364);
                kk0Var = kk0Var2;
                z7 = z9;
                z8 = z10;
                str4 = str11;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                z7 = z4;
                z8 = z5;
                str4 = str3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: ea2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ja2.c(ym1Var, str, z, je1Var, z7, z8, str4, (ck0) obj, i, i2);
                        return w84.a;
                    }
                });
            }
        }
        i3 |= 196608;
        z5 = z3;
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                str3 = str2;
                if (kk0Var2.h(str3)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (kk0Var2.S(i3 & 1, z6)) {
                if (i8 != 0) {
                    z9 = false;
                } else {
                    z9 = z4;
                }
                if (i4 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                if (i6 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                is2 is2Var7 = new is2(8.0f, 0.0f, 8.0f, 0.0f);
                if (z10) {
                    kk0Var2.a0(-1164411282);
                    Modifier$Companion modifier$Companion12 = c.i;
                    if ((3670016 & i3) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objP = kk0Var2.P();
                    if (z13) {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    }
                    cVarB = we3.b(modifier$Companion12, false, (le1) objP);
                    kk0Var2.r(false);
                } else {
                    kk0Var2.a0(-1164411282);
                    Modifier$Companion modifier$Companion13 = c.i;
                    if ((3670016 & i3) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i3 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objP = kk0Var2.P();
                    if (z13) {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    } else {
                        objP = new dp(str5, str, 1);
                        kk0Var2.l0(objP);
                    }
                    cVarB = we3.b(modifier$Companion13, false, (le1) objP);
                    kk0Var2.r(false);
                }
                String str12 = str5;
                c cVar7 = cVarB;
                uy uyVar7 = uy.a;
                if (z) {
                }
                bz.TextButton(je1Var2, cVar7, false, null, uyVar7.m1840x47c3eb61(0L, jF, 0L, 0L, kk0Var2, 0, 13), null, null, is2Var7, null, zg0.rememberComposableLambda(-2080755051, true, new oe1() { // from class: da2
                    @Override // defpackage.oe1
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return ja2.CodeAction$lambda$48(ym1Var, z10, z9, str, (g83) obj, (ck0) obj2, iIntValue);
                    }
                }, kk0Var2, 54), kk0Var2, ((i3 >> 9) & 14) | 817889280, 364);
                kk0Var = kk0Var2;
                z7 = z9;
                z8 = z10;
                str4 = str12;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                z7 = z4;
                z8 = z5;
                str4 = str3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: ea2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ja2.c(ym1Var, str, z, je1Var, z7, z8, str4, (ck0) obj, i, i2);
                        return w84.a;
                    }
                });
            }
        }
        i3 |= 1572864;
        str3 = str2;
        if ((599187 & i3) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (kk0Var2.S(i3 & 1, z6)) {
            if (i8 != 0) {
                z9 = false;
            } else {
                z9 = z4;
            }
            if (i4 != 0) {
                z10 = false;
            } else {
                z10 = z5;
            }
            if (i6 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            is2 is2Var8 = new is2(8.0f, 0.0f, 8.0f, 0.0f);
            if (z10) {
                kk0Var2.a0(-1164411282);
                Modifier$Companion modifier$Companion14 = c.i;
                if ((3670016 & i3) == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i3 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objP = kk0Var2.P();
                if (z13) {
                    objP = new dp(str5, str, 1);
                    kk0Var2.l0(objP);
                } else {
                    objP = new dp(str5, str, 1);
                    kk0Var2.l0(objP);
                }
                cVarB = we3.b(modifier$Companion14, false, (le1) objP);
                kk0Var2.r(false);
            } else {
                kk0Var2.a0(-1164411282);
                Modifier$Companion modifier$Companion15 = c.i;
                if ((3670016 & i3) == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i3 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objP = kk0Var2.P();
                if (z13) {
                    objP = new dp(str5, str, 1);
                    kk0Var2.l0(objP);
                } else {
                    objP = new dp(str5, str, 1);
                    kk0Var2.l0(objP);
                }
                cVarB = we3.b(modifier$Companion15, false, (le1) objP);
                kk0Var2.r(false);
            }
            String str13 = str5;
            c cVar8 = cVarB;
            uy uyVar8 = uy.a;
            if (z) {
            }
            bz.TextButton(je1Var2, cVar8, false, null, uyVar8.m1840x47c3eb61(0L, jF, 0L, 0L, kk0Var2, 0, 13), null, null, is2Var8, null, zg0.rememberComposableLambda(-2080755051, true, new oe1() { // from class: da2
                @Override // defpackage.oe1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return ja2.CodeAction$lambda$48(ym1Var, z10, z9, str, (g83) obj, (ck0) obj2, iIntValue);
                }
            }, kk0Var2, 54), kk0Var2, ((i3 >> 9) & 14) | 817889280, 364);
            kk0Var = kk0Var2;
            z7 = z9;
            z8 = z10;
            str4 = str13;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            z7 = z4;
            z8 = z5;
            str4 = str3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: ea2
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ja2.c(ym1Var, str, z, je1Var, z7, z8, str4, (ck0) obj, i, i2);
                    return w84.a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CodeAction$lambda$48(ym1 ym1Var, boolean z, boolean z2, String str, g83 g83Var, ck0 ck0Var, int i) {
        ic1 ic1Var;
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            Modifier$Companion modifier$Companion = c.i;
            ul1.m1829xf2a7a69(ym1Var, (String) null, d.j(modifier$Companion, 15.0f), 0L, kk0Var, 432, 8);
            if (z) {
                kk0Var.a0(1479311053);
            } else {
                kk0Var.a0(1489347582);
                cm3.Spacer(d.n(modifier$Companion, 5.0f), kk0Var, 6);
                uz3 uz3Var = ab2.a.getTypography(kk0Var, 0).n;
                if (z2) {
                    ic1 ic1Var2 = ic1.d;
                    ic1Var = ic1.m;
                } else {
                    ic1Var = null;
                }
                uy3.m1842xe1e389ce(str, (c) null, 0L, 0L, (gc1) null, ic1Var, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, uz3Var, (ck0) kk0Var, 0, 0, 65502);
                kk0Var = kk0Var;
            }
            kk0Var.r(false);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x0178  */
    /* JADX WARN: Code duplicated, block: B:109:0x0188  */
    /* JADX WARN: Code duplicated, block: B:111:0x019e  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:132:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:135:0x0207  */
    /* JADX WARN: Code duplicated, block: B:136:0x020a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0210  */
    /* JADX WARN: Code duplicated, block: B:139:0x0213  */
    /* JADX WARN: Code duplicated, block: B:142:0x021c  */
    /* JADX WARN: Code duplicated, block: B:143:0x021f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0228  */
    /* JADX WARN: Code duplicated, block: B:147:0x022b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0234  */
    /* JADX WARN: Code duplicated, block: B:151:0x0237  */
    /* JADX WARN: Code duplicated, block: B:154:0x0240  */
    /* JADX WARN: Code duplicated, block: B:155:0x0243  */
    /* JADX WARN: Code duplicated, block: B:158:0x024c  */
    /* JADX WARN: Code duplicated, block: B:159:0x024f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0257  */
    /* JADX WARN: Code duplicated, block: B:162:0x025a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0266  */
    /* JADX WARN: Code duplicated, block: B:166:0x0268  */
    /* JADX WARN: Code duplicated, block: B:169:0x0275  */
    /* JADX WARN: Code duplicated, block: B:171:0x027b  */
    /* JADX WARN: Code duplicated, block: B:175:0x030c  */
    /* JADX WARN: Code duplicated, block: B:178:0x031a  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108  */
    /* JADX WARN: Code duplicated, block: B:76:0x0114  */
    /* JADX WARN: Code duplicated, block: B:78:0x011a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:0x012c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0130  */
    /* JADX WARN: Code duplicated, block: B:86:0x0132  */
    /* JADX WARN: Code duplicated, block: B:89:0x013a  */
    /* JADX WARN: Code duplicated, block: B:90:0x013c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    /* JADX WARN: Code duplicated, block: B:95:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x014e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0162  */
    public static final void CodeBlock(final String str, String str2, boolean z, List<ud0> list, ck0 ck0Var, final int i, final int i2) {
        String str3;
        int i3;
        boolean z2;
        int i4;
        int i5;
        List<ud0> list2;
        int i6;
        boolean z3;
        kk0 kk0Var;
        final String str4;
        final boolean z4;
        final List<ud0> list3;
        w33 w33VarV;
        String str5;
        final boolean z5;
        Context context;
        Object objP;
        gq0 gq0Var;
        Object objP2;
        Object objP3;
        mi2 mi2Var;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        boolean z8;
        Object objP4;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objP5;
        boolean z13;
        String lowerCase;
        final boolean zBooleanValue;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objP6;
        final String str6;
        t3 t3Var;
        String str7;
        boolean z18;
        boolean zJ;
        Object objP7;
        gq0 gq0Var2;
        t3 t3Var2;
        Context context2;
        mi2 mi2Var2;
        boolean z19;
        str.getClass();
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(711108327);
        int i9 = (i & 6) == 0 ? (kk0Var2.h(str) ? 4 : 2) | i : i;
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                str3 = str2;
                i9 |= kk0Var2.h(str3) ? 32 : 16;
            }
            i3 = i2 & 4;
            if (i3 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (kk0Var2.i(z2)) {
                        i4 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i4 = Uuid.SIZE_BITS;
                    }
                    i9 |= i4;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    if ((i & 3072) == 0) {
                        list2 = list;
                        if (kk0Var2.j(list2)) {
                            i6 = 2048;
                        } else {
                            i6 = 1024;
                        }
                        i9 |= i6;
                    }
                    if ((i9 & 1171) != 1170) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var2.S(i9 & 1, z3)) {
                        if (i10 != 0) {
                            str5 = BuildConfig.VERSION_NAME;
                        } else {
                            str5 = str3;
                        }
                        if (i3 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i5 != 0) {
                            list2 = z21.c;
                        }
                        final ClipboardManager clipboardManager = (ClipboardManager) kk0Var2.l(CompositionLocalsKt.getLocalClipboardManager());
                        context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
                        final lh1 lh1Var = (lh1) kk0Var2.l(CompositionLocalsKt.getLocalHapticFeedback());
                        objP = kk0Var2.P();
                        if (objP == Composer$Companion.getEmpty()) {
                            objP = r11.a(x21.c, kk0Var2);
                            kk0Var2.l0(objP);
                        }
                        gq0Var = (gq0) objP;
                        objP2 = kk0Var2.P();
                        if (objP2 == Composer$Companion.getEmpty()) {
                            objP2 = cl3.d(Boolean.FALSE);
                            kk0Var2.l0(objP2);
                        }
                        final mi2 mi2Var3 = (mi2) objP2;
                        objP3 = kk0Var2.P();
                        if (objP3 == Composer$Companion.getEmpty()) {
                            objP3 = cl3.d(Boolean.FALSE);
                            kk0Var2.l0(objP3);
                        }
                        mi2Var = (mi2) objP3;
                        i7 = i9 & 112;
                        if (i7 == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        i8 = i9 & 14;
                        if (i8 == 4) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objP4 = kk0Var2.P();
                        if (z8 || objP4 == Composer$Companion.getEmpty()) {
                            objP4 = xd0.d(str5, str);
                            kk0Var2.l0(objP4);
                        }
                        final String str8 = (String) objP4;
                        if (i7 == 32) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (i8 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z20 = z9 | z10;
                        if ((i9 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | z20;
                        objP5 = kk0Var2.P();
                        if (z12 || objP5 == Composer$Companion.getEmpty()) {
                            if (z5) {
                                u43 u43Var = xd0.a;
                                str5.getClass();
                                lowerCase = str5.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                if (!lowerCase.equals("html") || lowerCase.equals("htm") || (lowerCase.length() == 0 && xd0.c(str))) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = false;
                            }
                            objP5 = Boolean.valueOf(z13);
                            kk0Var2.l0(objP5);
                        }
                        zBooleanValue = ((Boolean) objP5).booleanValue();
                        if (zBooleanValue) {
                            kk0Var2.a0(475330963);
                            if (((Configuration) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp <= 440) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            kk0Var2.r(false);
                            z14 = z19;
                        } else {
                            kk0Var2.a0(1850359202);
                            kk0Var2.r(false);
                            z14 = false;
                        }
                        if (i7 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i8 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z15 | z16;
                        objP6 = kk0Var2.P();
                        if (z17 || objP6 == Composer$Companion.getEmpty()) {
                            objP6 = xd0.a(str5, str);
                            kk0Var2.l0(objP6);
                        }
                        str6 = (String) objP6;
                        final float fFloatValue = ((Number) kk0Var2.l(qz3.b)).floatValue();
                        u43 u43Var2 = xd0.a;
                        str6.getClass();
                        switch (mo3.Q0(str6, '.', str6)) {
                            case "js":
                                str7 = "text/javascript";
                                break;
                            case "md":
                                str7 = "text/markdown";
                                break;
                            case "css":
                                str7 = "text/css";
                                break;
                            case "csv":
                                str7 = "text/csv";
                                break;
                            case "svg":
                                str7 = "image/svg+xml";
                                break;
                            case "xml":
                                str7 = "text/xml";
                                break;
                            case "html":
                                str7 = "text/html";
                                break;
                            case "json":
                                str7 = "application/json";
                                break;
                            default:
                                str7 = "text/plain";
                                break;
                        }
                        t3Var = new t3(str7);
                        boolean zJ2 = kk0Var2.j(context);
                        if (i8 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zJ = zJ2 | z18 | kk0Var2.j(gq0Var);
                        objP7 = kk0Var2.P();
                        if (!zJ || objP7 == Composer$Companion.getEmpty()) {
                            gq0Var2 = gq0Var;
                            t3Var2 = t3Var;
                            context2 = context;
                            mi2Var2 = mi2Var;
                            nq nqVar = new nq(gq0Var2, context2, str, mi2Var2, 3);
                            kk0Var2.l0(nqVar);
                            objP7 = nqVar;
                        } else {
                            mi2Var2 = mi2Var;
                            context2 = context;
                            gq0Var2 = gq0Var;
                            t3Var2 = t3Var;
                        }
                        final j92 j92VarRememberLauncherForActivityResult = i4.rememberLauncherForActivityResult(t3Var2, (le1) objP7, kk0Var2, 0);
                        ab2 ab2Var = ab2.a;
                        final gq0 gq0Var3 = gq0Var2;
                        final long j = ab2Var.getColorScheme(kk0Var2, 0).s;
                        Modifier$Companion modifier$Companion = c.i;
                        final Context context3 = context2;
                        c cVarM = a.m(d.a, 0.0f, 8.0f, 1);
                        long j2 = ab2Var.getColorScheme(kk0Var2, 0).r;
                        kk0Var = kk0Var2;
                        final List<ud0> list4 = list2;
                        final mi2 mi2Var4 = mi2Var2;
                        final boolean z21 = z14;
                        hq3.m210x8dcae10(cVarM, z73.a(12.0f), j2, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(48668546, true, new ne1() { // from class: ga2
                            @Override // defpackage.ne1
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ja2.CodeBlock$lambda$44(str8, j, zBooleanValue, context3, str, list4, z5, z21, j92VarRememberLauncherForActivityResult, str6, clipboardManager, lh1Var, gq0Var3, mi2Var4, mi2Var3, fFloatValue, (ck0) obj, iIntValue);
                            }
                        }, kk0Var, 54), kk0Var, 12582918, 120);
                        z4 = z5;
                        list3 = list4;
                        str4 = str5;
                    } else {
                        kk0Var = kk0Var2;
                        kk0Var.V();
                        str4 = str3;
                        z4 = z2;
                        list3 = list2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ne1() { // from class: ha2
                            @Override // defpackage.ne1
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ja2.CodeBlock(str, str4, z4, list3, (ck0) obj, sf3.V(i | 1), i2);
                                return w84.a;
                            }
                        });
                    }
                }
                i9 |= 3072;
                list2 = list;
                if ((i9 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    if (i10 != 0) {
                        str5 = BuildConfig.VERSION_NAME;
                    } else {
                        str5 = str3;
                    }
                    if (i3 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i5 != 0) {
                        list2 = z21.c;
                    }
                    final ClipboardManager clipboardManager2 = (ClipboardManager) kk0Var2.l(CompositionLocalsKt.getLocalClipboardManager());
                    context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
                    final lh1 lh1Var2 = (lh1) kk0Var2.l(CompositionLocalsKt.getLocalHapticFeedback());
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = r11.a(x21.c, kk0Var2);
                        kk0Var2.l0(objP);
                    }
                    gq0Var = (gq0) objP;
                    objP2 = kk0Var2.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(Boolean.FALSE);
                        kk0Var2.l0(objP2);
                    }
                    final mi2 mi2Var5 = (mi2) objP2;
                    objP3 = kk0Var2.P();
                    if (objP3 == Composer$Companion.getEmpty()) {
                        objP3 = cl3.d(Boolean.FALSE);
                        kk0Var2.l0(objP3);
                    }
                    mi2Var = (mi2) objP3;
                    i7 = i9 & 112;
                    if (i7 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    i8 = i9 & 14;
                    if (i8 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objP4 = kk0Var2.P();
                    if (z8) {
                        objP4 = xd0.d(str5, str);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = xd0.d(str5, str);
                        kk0Var2.l0(objP4);
                    }
                    final String str9 = (String) objP4;
                    if (i7 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i8 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z22 = z9 | z10;
                    if ((i9 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | z22;
                    objP5 = kk0Var2.P();
                    if (z12) {
                        if (z5) {
                            u43 u43Var3 = xd0.a;
                            str5.getClass();
                            lowerCase = str5.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (lowerCase.equals("html")) {
                            }
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objP5 = Boolean.valueOf(z13);
                        kk0Var2.l0(objP5);
                    } else {
                        if (z5) {
                            u43 u43Var4 = xd0.a;
                            str5.getClass();
                            lowerCase = str5.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (lowerCase.equals("html")) {
                            }
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objP5 = Boolean.valueOf(z13);
                        kk0Var2.l0(objP5);
                    }
                    zBooleanValue = ((Boolean) objP5).booleanValue();
                    if (zBooleanValue) {
                        kk0Var2.a0(475330963);
                        if (((Configuration) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp <= 440) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        kk0Var2.r(false);
                        z14 = z19;
                    } else {
                        kk0Var2.a0(1850359202);
                        kk0Var2.r(false);
                        z14 = false;
                    }
                    if (i7 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i8 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z15 | z16;
                    objP6 = kk0Var2.P();
                    if (z17) {
                        objP6 = xd0.a(str5, str);
                        kk0Var2.l0(objP6);
                    } else {
                        objP6 = xd0.a(str5, str);
                        kk0Var2.l0(objP6);
                    }
                    str6 = (String) objP6;
                    final float fFloatValue2 = ((Number) kk0Var2.l(qz3.b)).floatValue();
                    u43 u43Var5 = xd0.a;
                    str6.getClass();
                    switch (mo3.Q0(str6, '.', str6)) {
                        case 3401:
                            if (r2.equals("js")) {
                                str7 = "text/javascript";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 3479:
                            if (r2.equals("md")) {
                                str7 = "text/markdown";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 98819:
                            if (r2.equals("css")) {
                                str7 = "text/css";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 98822:
                            if (r2.equals("csv")) {
                                str7 = "text/csv";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 114276:
                            if (r2.equals("svg")) {
                                str7 = "image/svg+xml";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 118807:
                            if (r2.equals("xml")) {
                                str7 = "text/xml";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 3213227:
                            if (r2.equals("html")) {
                                str7 = "text/plain";
                            } else {
                                str7 = "text/html";
                            }
                            break;
                        case 3271912:
                            if (r2.equals("json")) {
                                str7 = "application/json";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        default:
                            str7 = "text/plain";
                            break;
                    }
                    t3Var = new t3(str7);
                    boolean zJ3 = kk0Var2.j(context);
                    if (i8 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zJ = zJ3 | z18 | kk0Var2.j(gq0Var);
                    objP7 = kk0Var2.P();
                    if (zJ) {
                        gq0Var2 = gq0Var;
                        t3Var2 = t3Var;
                        context2 = context;
                        mi2Var2 = mi2Var;
                        nq nqVar2 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                        kk0Var2.l0(nqVar2);
                        objP7 = nqVar2;
                    } else {
                        gq0Var2 = gq0Var;
                        t3Var2 = t3Var;
                        context2 = context;
                        mi2Var2 = mi2Var;
                        nq nqVar3 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                        kk0Var2.l0(nqVar3);
                        objP7 = nqVar3;
                    }
                    final j92 j92VarRememberLauncherForActivityResult2 = i4.rememberLauncherForActivityResult(t3Var2, (le1) objP7, kk0Var2, 0);
                    ab2 ab2Var2 = ab2.a;
                    final gq0 gq0Var4 = gq0Var2;
                    final long j3 = ab2Var2.getColorScheme(kk0Var2, 0).s;
                    Modifier$Companion modifier$Companion2 = c.i;
                    final Context context4 = context2;
                    c cVarM2 = a.m(d.a, 0.0f, 8.0f, 1);
                    long j4 = ab2Var2.getColorScheme(kk0Var2, 0).r;
                    kk0Var = kk0Var2;
                    final List list5 = list2;
                    final mi2 mi2Var6 = mi2Var2;
                    final boolean z23 = z14;
                    hq3.m210x8dcae10(cVarM2, z73.a(12.0f), j4, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(48668546, true, new ne1() { // from class: ga2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ja2.CodeBlock$lambda$44(str9, j3, zBooleanValue, context4, str, list5, z5, z23, j92VarRememberLauncherForActivityResult2, str6, clipboardManager2, lh1Var2, gq0Var4, mi2Var6, mi2Var5, fFloatValue2, (ck0) obj, iIntValue);
                        }
                    }, kk0Var, 54), kk0Var, 12582918, 120);
                    z4 = z5;
                    list3 = list5;
                    str4 = str5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    str4 = str3;
                    z4 = z2;
                    list3 = list2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ne1() { // from class: ha2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ja2.CodeBlock(str, str4, z4, list3, (ck0) obj, sf3.V(i | 1), i2);
                            return w84.a;
                        }
                    });
                }
            }
            i9 |= 384;
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    list2 = list;
                    if (kk0Var2.j(list2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i9 |= i6;
                }
                if ((i9 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    if (i10 != 0) {
                        str5 = BuildConfig.VERSION_NAME;
                    } else {
                        str5 = str3;
                    }
                    if (i3 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i5 != 0) {
                        list2 = z21.c;
                    }
                    final ClipboardManager clipboardManager3 = (ClipboardManager) kk0Var2.l(CompositionLocalsKt.getLocalClipboardManager());
                    context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
                    final lh1 lh1Var3 = (lh1) kk0Var2.l(CompositionLocalsKt.getLocalHapticFeedback());
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = r11.a(x21.c, kk0Var2);
                        kk0Var2.l0(objP);
                    }
                    gq0Var = (gq0) objP;
                    objP2 = kk0Var2.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(Boolean.FALSE);
                        kk0Var2.l0(objP2);
                    }
                    final mi2 mi2Var7 = (mi2) objP2;
                    objP3 = kk0Var2.P();
                    if (objP3 == Composer$Companion.getEmpty()) {
                        objP3 = cl3.d(Boolean.FALSE);
                        kk0Var2.l0(objP3);
                    }
                    mi2Var = (mi2) objP3;
                    i7 = i9 & 112;
                    if (i7 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    i8 = i9 & 14;
                    if (i8 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objP4 = kk0Var2.P();
                    if (z8) {
                        objP4 = xd0.d(str5, str);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = xd0.d(str5, str);
                        kk0Var2.l0(objP4);
                    }
                    final String str10 = (String) objP4;
                    if (i7 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i8 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z24 = z9 | z10;
                    if ((i9 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | z24;
                    objP5 = kk0Var2.P();
                    if (z12) {
                        if (z5) {
                            u43 u43Var6 = xd0.a;
                            str5.getClass();
                            lowerCase = str5.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (lowerCase.equals("html")) {
                            }
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objP5 = Boolean.valueOf(z13);
                        kk0Var2.l0(objP5);
                    } else {
                        if (z5) {
                            u43 u43Var7 = xd0.a;
                            str5.getClass();
                            lowerCase = str5.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (lowerCase.equals("html")) {
                            }
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objP5 = Boolean.valueOf(z13);
                        kk0Var2.l0(objP5);
                    }
                    zBooleanValue = ((Boolean) objP5).booleanValue();
                    if (zBooleanValue) {
                        kk0Var2.a0(475330963);
                        if (((Configuration) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp <= 440) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        kk0Var2.r(false);
                        z14 = z19;
                    } else {
                        kk0Var2.a0(1850359202);
                        kk0Var2.r(false);
                        z14 = false;
                    }
                    if (i7 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i8 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z15 | z16;
                    objP6 = kk0Var2.P();
                    if (z17) {
                        objP6 = xd0.a(str5, str);
                        kk0Var2.l0(objP6);
                    } else {
                        objP6 = xd0.a(str5, str);
                        kk0Var2.l0(objP6);
                    }
                    str6 = (String) objP6;
                    final float fFloatValue3 = ((Number) kk0Var2.l(qz3.b)).floatValue();
                    u43 u43Var8 = xd0.a;
                    str6.getClass();
                    switch (mo3.Q0(str6, '.', str6)) {
                        case 3401:
                            if (r2.equals("js")) {
                                str7 = "text/javascript";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 3479:
                            if (r2.equals("md")) {
                                str7 = "text/markdown";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 98819:
                            if (r2.equals("css")) {
                                str7 = "text/css";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 98822:
                            if (r2.equals("csv")) {
                                str7 = "text/csv";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 114276:
                            if (r2.equals("svg")) {
                                str7 = "image/svg+xml";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 118807:
                            if (r2.equals("xml")) {
                                str7 = "text/xml";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 3213227:
                            if (r2.equals("html")) {
                                str7 = "text/plain";
                            } else {
                                str7 = "text/html";
                            }
                            break;
                        case 3271912:
                            if (r2.equals("json")) {
                                str7 = "application/json";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        default:
                            str7 = "text/plain";
                            break;
                    }
                    t3Var = new t3(str7);
                    boolean zJ4 = kk0Var2.j(context);
                    if (i8 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zJ = zJ4 | z18 | kk0Var2.j(gq0Var);
                    objP7 = kk0Var2.P();
                    if (zJ) {
                        gq0Var2 = gq0Var;
                        t3Var2 = t3Var;
                        context2 = context;
                        mi2Var2 = mi2Var;
                        nq nqVar4 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                        kk0Var2.l0(nqVar4);
                        objP7 = nqVar4;
                    } else {
                        gq0Var2 = gq0Var;
                        t3Var2 = t3Var;
                        context2 = context;
                        mi2Var2 = mi2Var;
                        nq nqVar5 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                        kk0Var2.l0(nqVar5);
                        objP7 = nqVar5;
                    }
                    final j92 j92VarRememberLauncherForActivityResult3 = i4.rememberLauncherForActivityResult(t3Var2, (le1) objP7, kk0Var2, 0);
                    ab2 ab2Var3 = ab2.a;
                    final gq0 gq0Var5 = gq0Var2;
                    final long j5 = ab2Var3.getColorScheme(kk0Var2, 0).s;
                    Modifier$Companion modifier$Companion3 = c.i;
                    final Context context5 = context2;
                    c cVarM3 = a.m(d.a, 0.0f, 8.0f, 1);
                    long j6 = ab2Var3.getColorScheme(kk0Var2, 0).r;
                    kk0Var = kk0Var2;
                    final List list6 = list2;
                    final mi2 mi2Var8 = mi2Var2;
                    final boolean z25 = z14;
                    hq3.m210x8dcae10(cVarM3, z73.a(12.0f), j6, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(48668546, true, new ne1() { // from class: ga2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ja2.CodeBlock$lambda$44(str10, j5, zBooleanValue, context5, str, list6, z5, z25, j92VarRememberLauncherForActivityResult3, str6, clipboardManager3, lh1Var3, gq0Var5, mi2Var8, mi2Var7, fFloatValue3, (ck0) obj, iIntValue);
                        }
                    }, kk0Var, 54), kk0Var, 12582918, 120);
                    z4 = z5;
                    list3 = list6;
                    str4 = str5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    str4 = str3;
                    z4 = z2;
                    list3 = list2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ne1() { // from class: ha2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ja2.CodeBlock(str, str4, z4, list3, (ck0) obj, sf3.V(i | 1), i2);
                            return w84.a;
                        }
                    });
                }
            }
            i9 |= 3072;
            list2 = list;
            if ((i9 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                if (i10 != 0) {
                    str5 = BuildConfig.VERSION_NAME;
                } else {
                    str5 = str3;
                }
                if (i3 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i5 != 0) {
                    list2 = z21.c;
                }
                final ClipboardManager clipboardManager4 = (ClipboardManager) kk0Var2.l(CompositionLocalsKt.getLocalClipboardManager());
                context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
                final lh1 lh1Var4 = (lh1) kk0Var2.l(CompositionLocalsKt.getLocalHapticFeedback());
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = r11.a(x21.c, kk0Var2);
                    kk0Var2.l0(objP);
                }
                gq0Var = (gq0) objP;
                objP2 = kk0Var2.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(Boolean.FALSE);
                    kk0Var2.l0(objP2);
                }
                final mi2 mi2Var9 = (mi2) objP2;
                objP3 = kk0Var2.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    objP3 = cl3.d(Boolean.FALSE);
                    kk0Var2.l0(objP3);
                }
                mi2Var = (mi2) objP3;
                i7 = i9 & 112;
                if (i7 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                i8 = i9 & 14;
                if (i8 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objP4 = kk0Var2.P();
                if (z8) {
                    objP4 = xd0.d(str5, str);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = xd0.d(str5, str);
                    kk0Var2.l0(objP4);
                }
                final String str11 = (String) objP4;
                if (i7 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i8 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z26 = z9 | z10;
                if ((i9 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | z26;
                objP5 = kk0Var2.P();
                if (z12) {
                    if (z5) {
                        u43 u43Var9 = xd0.a;
                        str5.getClass();
                        lowerCase = str5.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("html")) {
                        }
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP5 = Boolean.valueOf(z13);
                    kk0Var2.l0(objP5);
                } else {
                    if (z5) {
                        u43 u43Var10 = xd0.a;
                        str5.getClass();
                        lowerCase = str5.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("html")) {
                        }
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP5 = Boolean.valueOf(z13);
                    kk0Var2.l0(objP5);
                }
                zBooleanValue = ((Boolean) objP5).booleanValue();
                if (zBooleanValue) {
                    kk0Var2.a0(475330963);
                    if (((Configuration) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp <= 440) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    kk0Var2.r(false);
                    z14 = z19;
                } else {
                    kk0Var2.a0(1850359202);
                    kk0Var2.r(false);
                    z14 = false;
                }
                if (i7 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i8 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objP6 = kk0Var2.P();
                if (z17) {
                    objP6 = xd0.a(str5, str);
                    kk0Var2.l0(objP6);
                } else {
                    objP6 = xd0.a(str5, str);
                    kk0Var2.l0(objP6);
                }
                str6 = (String) objP6;
                final float fFloatValue4 = ((Number) kk0Var2.l(qz3.b)).floatValue();
                u43 u43Var11 = xd0.a;
                str6.getClass();
                switch (mo3.Q0(str6, '.', str6)) {
                    case 3401:
                        if (r2.equals("js")) {
                            str7 = "text/javascript";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 3479:
                        if (r2.equals("md")) {
                            str7 = "text/markdown";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 98819:
                        if (r2.equals("css")) {
                            str7 = "text/css";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 98822:
                        if (r2.equals("csv")) {
                            str7 = "text/csv";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 114276:
                        if (r2.equals("svg")) {
                            str7 = "image/svg+xml";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 118807:
                        if (r2.equals("xml")) {
                            str7 = "text/xml";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 3213227:
                        if (r2.equals("html")) {
                            str7 = "text/plain";
                        } else {
                            str7 = "text/html";
                        }
                        break;
                    case 3271912:
                        if (r2.equals("json")) {
                            str7 = "application/json";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    default:
                        str7 = "text/plain";
                        break;
                }
                t3Var = new t3(str7);
                boolean zJ5 = kk0Var2.j(context);
                if (i8 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zJ = zJ5 | z18 | kk0Var2.j(gq0Var);
                objP7 = kk0Var2.P();
                if (zJ) {
                    gq0Var2 = gq0Var;
                    t3Var2 = t3Var;
                    context2 = context;
                    mi2Var2 = mi2Var;
                    nq nqVar6 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                    kk0Var2.l0(nqVar6);
                    objP7 = nqVar6;
                } else {
                    gq0Var2 = gq0Var;
                    t3Var2 = t3Var;
                    context2 = context;
                    mi2Var2 = mi2Var;
                    nq nqVar7 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                    kk0Var2.l0(nqVar7);
                    objP7 = nqVar7;
                }
                final j92 j92VarRememberLauncherForActivityResult4 = i4.rememberLauncherForActivityResult(t3Var2, (le1) objP7, kk0Var2, 0);
                ab2 ab2Var4 = ab2.a;
                final gq0 gq0Var6 = gq0Var2;
                final long j7 = ab2Var4.getColorScheme(kk0Var2, 0).s;
                Modifier$Companion modifier$Companion4 = c.i;
                final Context context6 = context2;
                c cVarM4 = a.m(d.a, 0.0f, 8.0f, 1);
                long j8 = ab2Var4.getColorScheme(kk0Var2, 0).r;
                kk0Var = kk0Var2;
                final List list7 = list2;
                final mi2 mi2Var10 = mi2Var2;
                final boolean z27 = z14;
                hq3.m210x8dcae10(cVarM4, z73.a(12.0f), j8, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(48668546, true, new ne1() { // from class: ga2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ja2.CodeBlock$lambda$44(str11, j7, zBooleanValue, context6, str, list7, z5, z27, j92VarRememberLauncherForActivityResult4, str6, clipboardManager4, lh1Var4, gq0Var6, mi2Var10, mi2Var9, fFloatValue4, (ck0) obj, iIntValue);
                    }
                }, kk0Var, 54), kk0Var, 12582918, 120);
                z4 = z5;
                list3 = list7;
                str4 = str5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                str4 = str3;
                z4 = z2;
                list3 = list2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: ha2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ja2.CodeBlock(str, str4, z4, list3, (ck0) obj, sf3.V(i | 1), i2);
                        return w84.a;
                    }
                });
            }
        }
        i9 |= 48;
        str3 = str2;
        i3 = i2 & 4;
        if (i3 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (kk0Var2.i(z2)) {
                    i4 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i4 = Uuid.SIZE_BITS;
                }
                i9 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    list2 = list;
                    if (kk0Var2.j(list2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i9 |= i6;
                }
                if ((i9 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var2.S(i9 & 1, z3)) {
                    if (i10 != 0) {
                        str5 = BuildConfig.VERSION_NAME;
                    } else {
                        str5 = str3;
                    }
                    if (i3 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i5 != 0) {
                        list2 = z21.c;
                    }
                    final ClipboardManager clipboardManager5 = (ClipboardManager) kk0Var2.l(CompositionLocalsKt.getLocalClipboardManager());
                    context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
                    final lh1 lh1Var5 = (lh1) kk0Var2.l(CompositionLocalsKt.getLocalHapticFeedback());
                    objP = kk0Var2.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = r11.a(x21.c, kk0Var2);
                        kk0Var2.l0(objP);
                    }
                    gq0Var = (gq0) objP;
                    objP2 = kk0Var2.P();
                    if (objP2 == Composer$Companion.getEmpty()) {
                        objP2 = cl3.d(Boolean.FALSE);
                        kk0Var2.l0(objP2);
                    }
                    final mi2 mi2Var11 = (mi2) objP2;
                    objP3 = kk0Var2.P();
                    if (objP3 == Composer$Companion.getEmpty()) {
                        objP3 = cl3.d(Boolean.FALSE);
                        kk0Var2.l0(objP3);
                    }
                    mi2Var = (mi2) objP3;
                    i7 = i9 & 112;
                    if (i7 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    i8 = i9 & 14;
                    if (i8 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objP4 = kk0Var2.P();
                    if (z8) {
                        objP4 = xd0.d(str5, str);
                        kk0Var2.l0(objP4);
                    } else {
                        objP4 = xd0.d(str5, str);
                        kk0Var2.l0(objP4);
                    }
                    final String str12 = (String) objP4;
                    if (i7 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i8 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z28 = z9 | z10;
                    if ((i9 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | z28;
                    objP5 = kk0Var2.P();
                    if (z12) {
                        if (z5) {
                            u43 u43Var12 = xd0.a;
                            str5.getClass();
                            lowerCase = str5.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (lowerCase.equals("html")) {
                            }
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objP5 = Boolean.valueOf(z13);
                        kk0Var2.l0(objP5);
                    } else {
                        if (z5) {
                            u43 u43Var13 = xd0.a;
                            str5.getClass();
                            lowerCase = str5.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (lowerCase.equals("html")) {
                            }
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objP5 = Boolean.valueOf(z13);
                        kk0Var2.l0(objP5);
                    }
                    zBooleanValue = ((Boolean) objP5).booleanValue();
                    if (zBooleanValue) {
                        kk0Var2.a0(475330963);
                        if (((Configuration) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp <= 440) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        kk0Var2.r(false);
                        z14 = z19;
                    } else {
                        kk0Var2.a0(1850359202);
                        kk0Var2.r(false);
                        z14 = false;
                    }
                    if (i7 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i8 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z15 | z16;
                    objP6 = kk0Var2.P();
                    if (z17) {
                        objP6 = xd0.a(str5, str);
                        kk0Var2.l0(objP6);
                    } else {
                        objP6 = xd0.a(str5, str);
                        kk0Var2.l0(objP6);
                    }
                    str6 = (String) objP6;
                    final float fFloatValue5 = ((Number) kk0Var2.l(qz3.b)).floatValue();
                    u43 u43Var14 = xd0.a;
                    str6.getClass();
                    switch (mo3.Q0(str6, '.', str6)) {
                        case 3401:
                            if (r2.equals("js")) {
                                str7 = "text/javascript";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 3479:
                            if (r2.equals("md")) {
                                str7 = "text/markdown";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 98819:
                            if (r2.equals("css")) {
                                str7 = "text/css";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 98822:
                            if (r2.equals("csv")) {
                                str7 = "text/csv";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 114276:
                            if (r2.equals("svg")) {
                                str7 = "image/svg+xml";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 118807:
                            if (r2.equals("xml")) {
                                str7 = "text/xml";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        case 3213227:
                            if (r2.equals("html")) {
                                str7 = "text/plain";
                            } else {
                                str7 = "text/html";
                            }
                            break;
                        case 3271912:
                            if (r2.equals("json")) {
                                str7 = "application/json";
                            } else {
                                str7 = "text/plain";
                            }
                            break;
                        default:
                            str7 = "text/plain";
                            break;
                    }
                    t3Var = new t3(str7);
                    boolean zJ6 = kk0Var2.j(context);
                    if (i8 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zJ = zJ6 | z18 | kk0Var2.j(gq0Var);
                    objP7 = kk0Var2.P();
                    if (zJ) {
                        gq0Var2 = gq0Var;
                        t3Var2 = t3Var;
                        context2 = context;
                        mi2Var2 = mi2Var;
                        nq nqVar8 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                        kk0Var2.l0(nqVar8);
                        objP7 = nqVar8;
                    } else {
                        gq0Var2 = gq0Var;
                        t3Var2 = t3Var;
                        context2 = context;
                        mi2Var2 = mi2Var;
                        nq nqVar9 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                        kk0Var2.l0(nqVar9);
                        objP7 = nqVar9;
                    }
                    final j92 j92VarRememberLauncherForActivityResult5 = i4.rememberLauncherForActivityResult(t3Var2, (le1) objP7, kk0Var2, 0);
                    ab2 ab2Var5 = ab2.a;
                    final gq0 gq0Var7 = gq0Var2;
                    final long j9 = ab2Var5.getColorScheme(kk0Var2, 0).s;
                    Modifier$Companion modifier$Companion5 = c.i;
                    final Context context7 = context2;
                    c cVarM5 = a.m(d.a, 0.0f, 8.0f, 1);
                    long j10 = ab2Var5.getColorScheme(kk0Var2, 0).r;
                    kk0Var = kk0Var2;
                    final List list8 = list2;
                    final mi2 mi2Var12 = mi2Var2;
                    final boolean z29 = z14;
                    hq3.m210x8dcae10(cVarM5, z73.a(12.0f), j10, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(48668546, true, new ne1() { // from class: ga2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ja2.CodeBlock$lambda$44(str12, j9, zBooleanValue, context7, str, list8, z5, z29, j92VarRememberLauncherForActivityResult5, str6, clipboardManager5, lh1Var5, gq0Var7, mi2Var12, mi2Var11, fFloatValue5, (ck0) obj, iIntValue);
                        }
                    }, kk0Var, 54), kk0Var, 12582918, 120);
                    z4 = z5;
                    list3 = list8;
                    str4 = str5;
                } else {
                    kk0Var = kk0Var2;
                    kk0Var.V();
                    str4 = str3;
                    z4 = z2;
                    list3 = list2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ne1() { // from class: ha2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ja2.CodeBlock(str, str4, z4, list3, (ck0) obj, sf3.V(i | 1), i2);
                            return w84.a;
                        }
                    });
                }
            }
            i9 |= 3072;
            list2 = list;
            if ((i9 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                if (i10 != 0) {
                    str5 = BuildConfig.VERSION_NAME;
                } else {
                    str5 = str3;
                }
                if (i3 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i5 != 0) {
                    list2 = z21.c;
                }
                final ClipboardManager clipboardManager6 = (ClipboardManager) kk0Var2.l(CompositionLocalsKt.getLocalClipboardManager());
                context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
                final lh1 lh1Var6 = (lh1) kk0Var2.l(CompositionLocalsKt.getLocalHapticFeedback());
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = r11.a(x21.c, kk0Var2);
                    kk0Var2.l0(objP);
                }
                gq0Var = (gq0) objP;
                objP2 = kk0Var2.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(Boolean.FALSE);
                    kk0Var2.l0(objP2);
                }
                final mi2 mi2Var13 = (mi2) objP2;
                objP3 = kk0Var2.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    objP3 = cl3.d(Boolean.FALSE);
                    kk0Var2.l0(objP3);
                }
                mi2Var = (mi2) objP3;
                i7 = i9 & 112;
                if (i7 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                i8 = i9 & 14;
                if (i8 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objP4 = kk0Var2.P();
                if (z8) {
                    objP4 = xd0.d(str5, str);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = xd0.d(str5, str);
                    kk0Var2.l0(objP4);
                }
                final String str13 = (String) objP4;
                if (i7 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i8 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z210 = z9 | z10;
                if ((i9 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | z210;
                objP5 = kk0Var2.P();
                if (z12) {
                    if (z5) {
                        u43 u43Var15 = xd0.a;
                        str5.getClass();
                        lowerCase = str5.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("html")) {
                        }
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP5 = Boolean.valueOf(z13);
                    kk0Var2.l0(objP5);
                } else {
                    if (z5) {
                        u43 u43Var16 = xd0.a;
                        str5.getClass();
                        lowerCase = str5.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("html")) {
                        }
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP5 = Boolean.valueOf(z13);
                    kk0Var2.l0(objP5);
                }
                zBooleanValue = ((Boolean) objP5).booleanValue();
                if (zBooleanValue) {
                    kk0Var2.a0(475330963);
                    if (((Configuration) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp <= 440) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    kk0Var2.r(false);
                    z14 = z19;
                } else {
                    kk0Var2.a0(1850359202);
                    kk0Var2.r(false);
                    z14 = false;
                }
                if (i7 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i8 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objP6 = kk0Var2.P();
                if (z17) {
                    objP6 = xd0.a(str5, str);
                    kk0Var2.l0(objP6);
                } else {
                    objP6 = xd0.a(str5, str);
                    kk0Var2.l0(objP6);
                }
                str6 = (String) objP6;
                final float fFloatValue6 = ((Number) kk0Var2.l(qz3.b)).floatValue();
                u43 u43Var17 = xd0.a;
                str6.getClass();
                switch (mo3.Q0(str6, '.', str6)) {
                    case 3401:
                        if (r2.equals("js")) {
                            str7 = "text/javascript";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 3479:
                        if (r2.equals("md")) {
                            str7 = "text/markdown";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 98819:
                        if (r2.equals("css")) {
                            str7 = "text/css";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 98822:
                        if (r2.equals("csv")) {
                            str7 = "text/csv";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 114276:
                        if (r2.equals("svg")) {
                            str7 = "image/svg+xml";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 118807:
                        if (r2.equals("xml")) {
                            str7 = "text/xml";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 3213227:
                        if (r2.equals("html")) {
                            str7 = "text/plain";
                        } else {
                            str7 = "text/html";
                        }
                        break;
                    case 3271912:
                        if (r2.equals("json")) {
                            str7 = "application/json";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    default:
                        str7 = "text/plain";
                        break;
                }
                t3Var = new t3(str7);
                boolean zJ7 = kk0Var2.j(context);
                if (i8 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zJ = zJ7 | z18 | kk0Var2.j(gq0Var);
                objP7 = kk0Var2.P();
                if (zJ) {
                    gq0Var2 = gq0Var;
                    t3Var2 = t3Var;
                    context2 = context;
                    mi2Var2 = mi2Var;
                    nq nqVar10 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                    kk0Var2.l0(nqVar10);
                    objP7 = nqVar10;
                } else {
                    gq0Var2 = gq0Var;
                    t3Var2 = t3Var;
                    context2 = context;
                    mi2Var2 = mi2Var;
                    nq nqVar11 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                    kk0Var2.l0(nqVar11);
                    objP7 = nqVar11;
                }
                final j92 j92VarRememberLauncherForActivityResult6 = i4.rememberLauncherForActivityResult(t3Var2, (le1) objP7, kk0Var2, 0);
                ab2 ab2Var6 = ab2.a;
                final gq0 gq0Var8 = gq0Var2;
                final long j11 = ab2Var6.getColorScheme(kk0Var2, 0).s;
                Modifier$Companion modifier$Companion6 = c.i;
                final Context context8 = context2;
                c cVarM6 = a.m(d.a, 0.0f, 8.0f, 1);
                long j12 = ab2Var6.getColorScheme(kk0Var2, 0).r;
                kk0Var = kk0Var2;
                final List list9 = list2;
                final mi2 mi2Var14 = mi2Var2;
                final boolean z211 = z14;
                hq3.m210x8dcae10(cVarM6, z73.a(12.0f), j12, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(48668546, true, new ne1() { // from class: ga2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ja2.CodeBlock$lambda$44(str13, j11, zBooleanValue, context8, str, list9, z5, z211, j92VarRememberLauncherForActivityResult6, str6, clipboardManager6, lh1Var6, gq0Var8, mi2Var14, mi2Var13, fFloatValue6, (ck0) obj, iIntValue);
                    }
                }, kk0Var, 54), kk0Var, 12582918, 120);
                z4 = z5;
                list3 = list9;
                str4 = str5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                str4 = str3;
                z4 = z2;
                list3 = list2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: ha2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ja2.CodeBlock(str, str4, z4, list3, (ck0) obj, sf3.V(i | 1), i2);
                        return w84.a;
                    }
                });
            }
        }
        i9 |= 384;
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                list2 = list;
                if (kk0Var2.j(list2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i9 |= i6;
            }
            if ((i9 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var2.S(i9 & 1, z3)) {
                if (i10 != 0) {
                    str5 = BuildConfig.VERSION_NAME;
                } else {
                    str5 = str3;
                }
                if (i3 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i5 != 0) {
                    list2 = z21.c;
                }
                final ClipboardManager clipboardManager7 = (ClipboardManager) kk0Var2.l(CompositionLocalsKt.getLocalClipboardManager());
                context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
                final lh1 lh1Var7 = (lh1) kk0Var2.l(CompositionLocalsKt.getLocalHapticFeedback());
                objP = kk0Var2.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = r11.a(x21.c, kk0Var2);
                    kk0Var2.l0(objP);
                }
                gq0Var = (gq0) objP;
                objP2 = kk0Var2.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = cl3.d(Boolean.FALSE);
                    kk0Var2.l0(objP2);
                }
                final mi2 mi2Var15 = (mi2) objP2;
                objP3 = kk0Var2.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    objP3 = cl3.d(Boolean.FALSE);
                    kk0Var2.l0(objP3);
                }
                mi2Var = (mi2) objP3;
                i7 = i9 & 112;
                if (i7 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                i8 = i9 & 14;
                if (i8 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objP4 = kk0Var2.P();
                if (z8) {
                    objP4 = xd0.d(str5, str);
                    kk0Var2.l0(objP4);
                } else {
                    objP4 = xd0.d(str5, str);
                    kk0Var2.l0(objP4);
                }
                final String str14 = (String) objP4;
                if (i7 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i8 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z212 = z9 | z10;
                if ((i9 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | z212;
                objP5 = kk0Var2.P();
                if (z12) {
                    if (z5) {
                        u43 u43Var18 = xd0.a;
                        str5.getClass();
                        lowerCase = str5.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("html")) {
                        }
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP5 = Boolean.valueOf(z13);
                    kk0Var2.l0(objP5);
                } else {
                    if (z5) {
                        u43 u43Var19 = xd0.a;
                        str5.getClass();
                        lowerCase = str5.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("html")) {
                        }
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP5 = Boolean.valueOf(z13);
                    kk0Var2.l0(objP5);
                }
                zBooleanValue = ((Boolean) objP5).booleanValue();
                if (zBooleanValue) {
                    kk0Var2.a0(475330963);
                    if (((Configuration) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp <= 440) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    kk0Var2.r(false);
                    z14 = z19;
                } else {
                    kk0Var2.a0(1850359202);
                    kk0Var2.r(false);
                    z14 = false;
                }
                if (i7 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i8 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objP6 = kk0Var2.P();
                if (z17) {
                    objP6 = xd0.a(str5, str);
                    kk0Var2.l0(objP6);
                } else {
                    objP6 = xd0.a(str5, str);
                    kk0Var2.l0(objP6);
                }
                str6 = (String) objP6;
                final float fFloatValue7 = ((Number) kk0Var2.l(qz3.b)).floatValue();
                u43 u43Var110 = xd0.a;
                str6.getClass();
                switch (mo3.Q0(str6, '.', str6)) {
                    case 3401:
                        if (r2.equals("js")) {
                            str7 = "text/javascript";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 3479:
                        if (r2.equals("md")) {
                            str7 = "text/markdown";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 98819:
                        if (r2.equals("css")) {
                            str7 = "text/css";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 98822:
                        if (r2.equals("csv")) {
                            str7 = "text/csv";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 114276:
                        if (r2.equals("svg")) {
                            str7 = "image/svg+xml";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 118807:
                        if (r2.equals("xml")) {
                            str7 = "text/xml";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    case 3213227:
                        if (r2.equals("html")) {
                            str7 = "text/plain";
                        } else {
                            str7 = "text/html";
                        }
                        break;
                    case 3271912:
                        if (r2.equals("json")) {
                            str7 = "application/json";
                        } else {
                            str7 = "text/plain";
                        }
                        break;
                    default:
                        str7 = "text/plain";
                        break;
                }
                t3Var = new t3(str7);
                boolean zJ8 = kk0Var2.j(context);
                if (i8 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zJ = zJ8 | z18 | kk0Var2.j(gq0Var);
                objP7 = kk0Var2.P();
                if (zJ) {
                    gq0Var2 = gq0Var;
                    t3Var2 = t3Var;
                    context2 = context;
                    mi2Var2 = mi2Var;
                    nq nqVar12 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                    kk0Var2.l0(nqVar12);
                    objP7 = nqVar12;
                } else {
                    gq0Var2 = gq0Var;
                    t3Var2 = t3Var;
                    context2 = context;
                    mi2Var2 = mi2Var;
                    nq nqVar13 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                    kk0Var2.l0(nqVar13);
                    objP7 = nqVar13;
                }
                final j92 j92VarRememberLauncherForActivityResult7 = i4.rememberLauncherForActivityResult(t3Var2, (le1) objP7, kk0Var2, 0);
                ab2 ab2Var7 = ab2.a;
                final gq0 gq0Var9 = gq0Var2;
                final long j13 = ab2Var7.getColorScheme(kk0Var2, 0).s;
                Modifier$Companion modifier$Companion7 = c.i;
                final Context context9 = context2;
                c cVarM7 = a.m(d.a, 0.0f, 8.0f, 1);
                long j14 = ab2Var7.getColorScheme(kk0Var2, 0).r;
                kk0Var = kk0Var2;
                final List list10 = list2;
                final mi2 mi2Var16 = mi2Var2;
                final boolean z213 = z14;
                hq3.m210x8dcae10(cVarM7, z73.a(12.0f), j14, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(48668546, true, new ne1() { // from class: ga2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ja2.CodeBlock$lambda$44(str14, j13, zBooleanValue, context9, str, list10, z5, z213, j92VarRememberLauncherForActivityResult7, str6, clipboardManager7, lh1Var7, gq0Var9, mi2Var16, mi2Var15, fFloatValue7, (ck0) obj, iIntValue);
                    }
                }, kk0Var, 54), kk0Var, 12582918, 120);
                z4 = z5;
                list3 = list10;
                str4 = str5;
            } else {
                kk0Var = kk0Var2;
                kk0Var.V();
                str4 = str3;
                z4 = z2;
                list3 = list2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ne1() { // from class: ha2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ja2.CodeBlock(str, str4, z4, list3, (ck0) obj, sf3.V(i | 1), i2);
                        return w84.a;
                    }
                });
            }
        }
        i9 |= 3072;
        list2 = list;
        if ((i9 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kk0Var2.S(i9 & 1, z3)) {
            if (i10 != 0) {
                str5 = BuildConfig.VERSION_NAME;
            } else {
                str5 = str3;
            }
            if (i3 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i5 != 0) {
                list2 = z21.c;
            }
            final ClipboardManager clipboardManager8 = (ClipboardManager) kk0Var2.l(CompositionLocalsKt.getLocalClipboardManager());
            context = (Context) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalContext());
            final lh1 lh1Var8 = (lh1) kk0Var2.l(CompositionLocalsKt.getLocalHapticFeedback());
            objP = kk0Var2.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = r11.a(x21.c, kk0Var2);
                kk0Var2.l0(objP);
            }
            gq0Var = (gq0) objP;
            objP2 = kk0Var2.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = cl3.d(Boolean.FALSE);
                kk0Var2.l0(objP2);
            }
            final mi2 mi2Var17 = (mi2) objP2;
            objP3 = kk0Var2.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                objP3 = cl3.d(Boolean.FALSE);
                kk0Var2.l0(objP3);
            }
            mi2Var = (mi2) objP3;
            i7 = i9 & 112;
            if (i7 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            i8 = i9 & 14;
            if (i8 == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z6 | z7;
            objP4 = kk0Var2.P();
            if (z8) {
                objP4 = xd0.d(str5, str);
                kk0Var2.l0(objP4);
            } else {
                objP4 = xd0.d(str5, str);
                kk0Var2.l0(objP4);
            }
            final String str15 = (String) objP4;
            if (i7 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i8 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z214 = z9 | z10;
            if ((i9 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z214;
            objP5 = kk0Var2.P();
            if (z12) {
                if (z5) {
                    u43 u43Var111 = xd0.a;
                    str5.getClass();
                    lowerCase = str5.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (lowerCase.equals("html")) {
                    }
                    z13 = true;
                } else {
                    z13 = false;
                }
                objP5 = Boolean.valueOf(z13);
                kk0Var2.l0(objP5);
            } else {
                if (z5) {
                    u43 u43Var112 = xd0.a;
                    str5.getClass();
                    lowerCase = str5.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (lowerCase.equals("html")) {
                    }
                    z13 = true;
                } else {
                    z13 = false;
                }
                objP5 = Boolean.valueOf(z13);
                kk0Var2.l0(objP5);
            }
            zBooleanValue = ((Boolean) objP5).booleanValue();
            if (zBooleanValue) {
                kk0Var2.a0(475330963);
                if (((Configuration) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp <= 440) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                kk0Var2.r(false);
                z14 = z19;
            } else {
                kk0Var2.a0(1850359202);
                kk0Var2.r(false);
                z14 = false;
            }
            if (i7 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (i8 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z15 | z16;
            objP6 = kk0Var2.P();
            if (z17) {
                objP6 = xd0.a(str5, str);
                kk0Var2.l0(objP6);
            } else {
                objP6 = xd0.a(str5, str);
                kk0Var2.l0(objP6);
            }
            str6 = (String) objP6;
            final float fFloatValue8 = ((Number) kk0Var2.l(qz3.b)).floatValue();
            u43 u43Var113 = xd0.a;
            str6.getClass();
            switch (mo3.Q0(str6, '.', str6)) {
                case 3401:
                    if (r2.equals("js")) {
                        str7 = "text/javascript";
                    } else {
                        str7 = "text/plain";
                    }
                    break;
                case 3479:
                    if (r2.equals("md")) {
                        str7 = "text/markdown";
                    } else {
                        str7 = "text/plain";
                    }
                    break;
                case 98819:
                    if (r2.equals("css")) {
                        str7 = "text/css";
                    } else {
                        str7 = "text/plain";
                    }
                    break;
                case 98822:
                    if (r2.equals("csv")) {
                        str7 = "text/csv";
                    } else {
                        str7 = "text/plain";
                    }
                    break;
                case 114276:
                    if (r2.equals("svg")) {
                        str7 = "image/svg+xml";
                    } else {
                        str7 = "text/plain";
                    }
                    break;
                case 118807:
                    if (r2.equals("xml")) {
                        str7 = "text/xml";
                    } else {
                        str7 = "text/plain";
                    }
                    break;
                case 3213227:
                    if (r2.equals("html")) {
                        str7 = "text/plain";
                    } else {
                        str7 = "text/html";
                    }
                    break;
                case 3271912:
                    if (r2.equals("json")) {
                        str7 = "application/json";
                    } else {
                        str7 = "text/plain";
                    }
                    break;
                default:
                    str7 = "text/plain";
                    break;
            }
            t3Var = new t3(str7);
            boolean zJ9 = kk0Var2.j(context);
            if (i8 == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            zJ = zJ9 | z18 | kk0Var2.j(gq0Var);
            objP7 = kk0Var2.P();
            if (zJ) {
                gq0Var2 = gq0Var;
                t3Var2 = t3Var;
                context2 = context;
                mi2Var2 = mi2Var;
                nq nqVar14 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                kk0Var2.l0(nqVar14);
                objP7 = nqVar14;
            } else {
                gq0Var2 = gq0Var;
                t3Var2 = t3Var;
                context2 = context;
                mi2Var2 = mi2Var;
                nq nqVar15 = new nq(gq0Var2, context2, str, mi2Var2, 3);
                kk0Var2.l0(nqVar15);
                objP7 = nqVar15;
            }
            final j92 j92VarRememberLauncherForActivityResult8 = i4.rememberLauncherForActivityResult(t3Var2, (le1) objP7, kk0Var2, 0);
            ab2 ab2Var8 = ab2.a;
            final gq0 gq0Var10 = gq0Var2;
            final long j15 = ab2Var8.getColorScheme(kk0Var2, 0).s;
            Modifier$Companion modifier$Companion8 = c.i;
            final Context context10 = context2;
            c cVarM8 = a.m(d.a, 0.0f, 8.0f, 1);
            long j16 = ab2Var8.getColorScheme(kk0Var2, 0).r;
            kk0Var = kk0Var2;
            final List list11 = list2;
            final mi2 mi2Var18 = mi2Var2;
            final boolean z215 = z14;
            hq3.m210x8dcae10(cVarM8, z73.a(12.0f), j16, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(48668546, true, new ne1() { // from class: ga2
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ja2.CodeBlock$lambda$44(str15, j15, zBooleanValue, context10, str, list11, z5, z215, j92VarRememberLauncherForActivityResult8, str6, clipboardManager8, lh1Var8, gq0Var10, mi2Var18, mi2Var17, fFloatValue8, (ck0) obj, iIntValue);
                }
            }, kk0Var, 54), kk0Var, 12582918, 120);
            z4 = z5;
            list3 = list11;
            str4 = str5;
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
            str4 = str3;
            z4 = z2;
            list3 = list2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ne1() { // from class: ha2
                @Override // defpackage.ne1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ja2.CodeBlock(str, str4, z4, list3, (ck0) obj, sf3.V(i | 1), i2);
                    return w84.a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 CodeBlock$lambda$44(String str, long j, boolean z, Context context, String str2, List list, boolean z2, boolean z3, j92 j92Var, String str3, ClipboardManager clipboardManager, lh1 lh1Var, gq0 gq0Var, mi2 mi2Var, mi2 mi2Var2, float f, ck0 ck0Var, int i) {
        int i2;
        s22 s22Var;
        int i3;
        int i4;
        Object e40Var;
        int i5;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i & 1, (i & 3) != 2);
        xk xkVar = kk0Var.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
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
            c cVarO = a.o(androidx.compose.foundation.a.b(d.a, re0.b(0.12f, re0.b), k43.a), 12.0f, 0.0f, 4.0f, 0.0f, 10);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var, 48);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN2 = kk0Var.n();
            c cVarD2 = b.d(kk0Var, cVarO);
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
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(str, (c) new LayoutWeightElement(1.0f, true), j, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).n, (ck0) kk0Var, 0, 0, 65528);
            kk0 kk0Var2 = kk0Var;
            s22 s22Var2 = s22.a;
            if (z) {
                kk0Var2.a0(-1781652558);
                ym1 eye = s22Var2.getEye(kk0Var2, 6);
                String strStringResource = ko3.stringResource(R.string.code_preview, kk0Var2, 0);
                String strStringResource2 = ko3.stringResource(R.string.code_preview_aria, kk0Var2, 0);
                boolean zJ = kk0Var2.j(context) | kk0Var2.h(str2) | kk0Var2.j(list);
                Object objP = kk0Var2.P();
                if (zJ || objP == Composer$Companion.getEmpty()) {
                    objP = new k60(context, str2, list, 12);
                    kk0Var2.l0(objP);
                }
                s22Var = s22Var2;
                i3 = -1789028326;
                i2 = 6;
                CodeAction(eye, strStringResource, false, (je1) objP, true, false, strStringResource2, kk0Var2, 24960, 32);
                kk0Var2 = kk0Var2;
            } else {
                i2 = 6;
                s22Var = s22Var2;
                i3 = -1789028326;
                kk0Var2.a0(-1789028326);
            }
            kk0Var2.r(false);
            if (z2) {
                kk0Var2.a0(-1781173391);
                ym1 download = s22Var.getDownload(kk0Var2, i2);
                if (((Boolean) mi2Var.getValue()).booleanValue()) {
                    kk0Var2.a0(-888737712);
                    i5 = R.string.code_downloaded;
                } else {
                    kk0Var2.a0(-888736242);
                    i5 = R.string.code_download;
                }
                String strStringResource3 = ko3.stringResource(i5, kk0Var2, 0);
                kk0Var2.r(false);
                boolean zBooleanValue = ((Boolean) mi2Var.getValue()).booleanValue();
                boolean z4 = z3 && !((Boolean) mi2Var.getValue()).booleanValue();
                boolean zJ2 = kk0Var2.j(j92Var) | kk0Var2.h(str3);
                Object objP2 = kk0Var2.P();
                if (zJ2 || objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new ye(j92Var, 19, str3);
                    kk0Var2.l0(objP2);
                }
                kk0 kk0Var3 = kk0Var2;
                CodeAction(download, strStringResource3, zBooleanValue, (je1) objP2, false, z4, null, kk0Var3, 0, 80);
                kk0Var2 = kk0Var3;
            } else {
                kk0Var2.a0(i3);
            }
            kk0Var2.r(false);
            ym1 copy = s22Var.getCopy(kk0Var2, i2);
            if (((Boolean) mi2Var2.getValue()).booleanValue()) {
                kk0Var2.a0(-888725650);
                i4 = R.string.action_copied;
            } else {
                kk0Var2.a0(-888724244);
                i4 = R.string.action_copy;
            }
            String strStringResource4 = ko3.stringResource(i4, kk0Var2, 0);
            kk0Var2.r(false);
            boolean zBooleanValue2 = ((Boolean) mi2Var2.getValue()).booleanValue();
            boolean z5 = z3 && !((Boolean) mi2Var2.getValue()).booleanValue();
            boolean zJ3 = kk0Var2.j(clipboardManager) | kk0Var2.h(str2) | kk0Var2.j(lh1Var) | kk0Var2.j(gq0Var);
            Object objP3 = kk0Var2.P();
            if (zJ3 || objP3 == Composer$Companion.getEmpty()) {
                e40Var = new e40(clipboardManager, str2, lh1Var, gq0Var, mi2Var2);
                kk0Var2.l0(e40Var);
            } else {
                e40Var = objP3;
            }
            CodeAction(copy, strStringResource4, zBooleanValue2, (je1) e40Var, false, z5, null, kk0Var2, 0, 80);
            kk0Var2.r(true);
            c cVarK = a.k(mb3.a(modifier$Companion, mb3.rememberScrollState(0, kk0Var2, 0, 1), false), 12.0f);
            vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
            int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN3 = kk0Var2.n();
            c cVarD3 = b.d(kk0Var2, cVarK);
            d4 constructor3 = ComposeUiNode$Companion.getConstructor();
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor3);
            } else {
                kk0Var2.o0();
            }
            pe peVarH3 = fq2.h(kk0Var2, vb2VarC, kk0Var2, su2VarN3);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                fq2.v(currentCompositeKeyHash3, kk0Var2, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var2, cVarD3, ComposeUiNode$Companion.getSetModifier());
            kk0 kk0Var4 = kk0Var2;
            uy3.m1842xe1e389ce(str2, (c) null, ab2Var.getColorScheme(kk0Var2, 0).q, gm4.L(14.0f * f, 4294967296L), (gc1) null, (ic1) null, (lb1) lb1.d, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var4, 0, 0, 130994);
            kk0Var4.r(true);
            kk0Var4.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0252  */
    /* JADX WARN: Code duplicated, block: B:106:0x0267  */
    /* JADX WARN: Code duplicated, block: B:107:0x0269  */
    /* JADX WARN: Code duplicated, block: B:110:0x0270  */
    /* JADX WARN: Code duplicated, block: B:112:0x0276  */
    /* JADX WARN: Code duplicated, block: B:115:0x028a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0293  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:123:0x02be  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:128:0x0305  */
    /* JADX WARN: Code duplicated, block: B:130:0x030c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0310  */
    /* JADX WARN: Code duplicated, block: B:134:0x031b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0329  */
    /* JADX WARN: Code duplicated, block: B:140:0x0343  */
    /* JADX WARN: Code duplicated, block: B:142:0x034d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0361  */
    /* JADX WARN: Code duplicated, block: B:145:0x0365  */
    /* JADX WARN: Code duplicated, block: B:148:0x0384  */
    /* JADX WARN: Code duplicated, block: B:153:0x039c  */
    /* JADX WARN: Code duplicated, block: B:163:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:165:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:168:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:171:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x039a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:82:0x019f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1 A[LOOP:4: B:83:0x01ac->B:87:0x01c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x01da  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:96:0x0208  */
    /* JADX WARN: Code duplicated, block: B:97:0x021a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0221  */
    public static final void MarkdownMessage(final String str, c cVar, boolean z, boolean z2, ck0 ck0Var, final int i, final int i2) {
        c cVar2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        final boolean z5;
        final c cVar3;
        final boolean z6;
        w33 w33VarV;
        c cVar4;
        final boolean z7;
        boolean z8;
        Object objP;
        String str2;
        String str3;
        boolean z9;
        boolean z10;
        c cVar5;
        boolean zH;
        Object objP2;
        ArrayList arrayList;
        StringBuilder sb;
        StringBuilder sb2;
        char c;
        Iterator it;
        Object obj;
        StringBuilder sb3;
        char c2;
        String str4;
        String strY0;
        StringBuilder sb4;
        Iterator it2;
        String str5;
        String string;
        int i7;
        int i8;
        String str6;
        za2 za2VarD;
        Object obj2;
        List<wd0> list;
        wu0 wu0Var;
        Object objP3;
        fh2 fh2Var;
        boolean z11;
        Object objP4;
        c cVarF;
        int i9;
        c cVarE;
        vb2 vb2VarColumnMeasurePolicy;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        ArrayList arrayList2;
        int size;
        int i10;
        ud0 ud0Var;
        Object objP5;
        ct2 ct2Var;
        w33 w33VarV2;
        str.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1762790189);
        int i11 = 2;
        int i12 = (i & 6) == 0 ? (kk0Var.h(str) ? 4 : 2) | i : i;
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i12 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (kk0Var.i(z3)) {
                        i4 = 2048;
                    } else {
                        i4 = 1024;
                    }
                    i12 |= i4;
                }
                i5 = 1;
                i6 = 0;
                if ((i12 & 1043) != 1042) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kk0Var.S(i12 & 1, z4)) {
                    if (i13 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i2 & 4) != 0) {
                        z7 = true;
                    } else {
                        z7 = z;
                    }
                    if (i3 != 0) {
                        z3 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objP = kk0Var.P();
                    str2 = BuildConfig.VERSION_NAME;
                    if (z8 || objP == Composer$Companion.getEmpty()) {
                        Pattern patternCompile = Pattern.compile("<think>.*?</think>", Headers$Companion.access$ensureUnicodeCase(32));
                        patternCompile.getClass();
                        String strReplaceAll = patternCompile.matcher(str).replaceAll(BuildConfig.VERSION_NAME);
                        strReplaceAll.getClass();
                        objP = mo3.U0(strReplaceAll).toString();
                        kk0Var.l0(objP);
                    }
                    str3 = (String) objP;
                    if (str3.length() == 0) {
                        w33VarV2 = kk0Var.v();
                        if (w33VarV2 != null) {
                            final int i14 = 0;
                            final c cVar6 = cVar4;
                            final boolean z12 = z3;
                            w33VarV2.updateScope(new ne1() { // from class: fa2
                                @Override // defpackage.ne1
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i15 = i14;
                                    w84 w84Var = w84.a;
                                    int i16 = i;
                                    switch (i15) {
                                        case 0:
                                            ((Integer) obj4).getClass();
                                            int iV = sf3.V(i16 | 1);
                                            ja2.MarkdownMessage(str, cVar6, z7, z12, (ck0) obj3, iV, i2);
                                            break;
                                        default:
                                            ((Integer) obj4).getClass();
                                            int iV2 = sf3.V(i16 | 1);
                                            ja2.MarkdownMessage(str, cVar6, z7, z12, (ck0) obj3, iV2, i2);
                                            break;
                                    }
                                    return w84Var;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z9 = z7;
                    z10 = z3;
                    cVar5 = cVar4;
                    zH = kk0Var.h(str3);
                    objP2 = kk0Var.P();
                    if (zH || objP2 == Composer$Companion.getEmpty()) {
                        obj2 = objP2;
                        u43 u43Var = xd0.a;
                        arrayList = new ArrayList();
                        sb = new StringBuilder();
                        sb2 = new StringBuilder();
                        c = '\n';
                        it = mo3.N0(str3, new char[]{'\n'}).iterator();
                        obj = null;
                        while (it.hasNext()) {
                            c2 = c;
                            str4 = (String) it.next();
                            if (obj != null) {
                                char[] cArr = new char[i5];
                                cArr[i6] = ' ';
                                strY0 = mo3.Y0(str4, cArr);
                                if (str4.length() - strY0.length() > 3) {
                                    sb4 = sb;
                                    it2 = it;
                                    sb2.append(str4);
                                    sb2.append('\n');
                                    break;
                                    break;
                                }
                                str5 = (String) obj;
                                if (to3.q0(strY0, str5, false)) {
                                    string = mo3.W0(strY0).toString();
                                    sb4 = sb;
                                    it2 = it;
                                    i7 = 0;
                                    while (true) {
                                        if (i7 < string.length()) {
                                            i8 = i7;
                                            str6 = strY0;
                                            if (string.charAt(i7) == str5.charAt(0)) {
                                                i7 = i8 + 1;
                                                strY0 = str6;
                                            }
                                        } else if (mo3.W0(strY0).toString().length() >= str5.length()) {
                                            arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), true));
                                            obj = null;
                                            break;
                                        }
                                    }
                                } else {
                                    sb4 = sb;
                                    it2 = it;
                                }
                                sb2.append(str4);
                                sb2.append('\n');
                                break;
                            }
                            u43 u43Var2 = xd0.a;
                            u43Var2.getClass();
                            str4.getClass();
                            Matcher matcher = u43Var2.c.matcher(str4);
                            matcher.getClass();
                            za2VarD = kr1.d(matcher, i6, str4);
                            if (za2VarD != null) {
                                if (!mo3.C0(sb)) {
                                    String string2 = sb.toString();
                                    char[] cArr2 = new char[i5];
                                    cArr2[i6] = c2;
                                    arrayList.add(new vd0(mo3.X0(string2, cArr2)));
                                }
                                sb.setLength(i6);
                                Object obj3 = ((ya2) za2VarD.a()).get(i5);
                                String str7 = (String) ((ya2) za2VarD.a()).get(i11);
                                sb2.setLength(i6);
                                sb4 = sb;
                                it2 = it;
                                str2 = str7;
                                obj = obj3;
                            } else {
                                sb.append(str4);
                                sb.append(c2);
                                sb4 = sb;
                                it2 = it;
                            }
                            sb = sb4;
                            it = it2;
                            c = '\n';
                            i11 = 2;
                            i5 = 1;
                            i6 = 0;
                        }
                        sb3 = sb;
                        if (obj != null) {
                            arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), false));
                        } else if (!mo3.C0(sb3)) {
                            arrayList.add(new vd0(mo3.X0(sb3.toString(), '\n')));
                        }
                        kk0Var.l0(arrayList);
                        obj2 = arrayList;
                    }
                    obj2 = objP2;
                    list = (List) obj2;
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    objP3 = kk0Var.P();
                    if (objP3 == Composer$Companion.getEmpty()) {
                        objP3 = new ct2(0);
                        kk0Var.l0(objP3);
                    }
                    fh2Var = (fh2) objP3;
                    Boolean boolValueOf = Boolean.valueOf(z10);
                    if ((i12 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objP4 = kk0Var.P();
                    if (z11 || objP4 == Composer$Companion.getEmpty()) {
                        objP4 = new ia2(z10, fh2Var, (so0) null);
                        kk0Var.l0(objP4);
                    }
                    r11.LaunchedEffect(boolValueOf, (ne1) objP4, kk0Var, (i12 >> 9) & 14);
                    if (z10) {
                        ct2Var = (ct2) fh2Var;
                        if (ct2Var.f() > 0) {
                            cVarF = d.f(c.i, wu0Var.q0(ct2Var.f()), 0.0f, 2);
                        } else {
                            cVarF = c.i;
                        }
                    } else {
                        cVarF = c.i;
                    }
                    c cVarThen = cVar5.then(cVarF);
                    if (z10) {
                        kk0Var.a0(-1824213525);
                        Modifier$Companion modifier$Companion = c.i;
                        objP5 = kk0Var.P();
                        if (objP5 == Composer$Companion.getEmpty()) {
                            objP5 = new k10(fh2Var, 1);
                            kk0Var.l0(objP5);
                        }
                        cVarE = androidx.compose.ui.layout.a.e(modifier$Companion, (le1) objP5);
                        i9 = 0;
                        kk0Var.r(false);
                    } else {
                        i9 = 0;
                        kk0Var.a0(-1824211589);
                        kk0Var.r(false);
                        cVarE = c.i;
                    }
                    c cVarThen2 = cVarThen.then(cVarE);
                    vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, i9);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i9);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarThen2);
                    androidx.compose.ui.node.a.j.getClass();
                    constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a != null) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor);
                    } else {
                        kk0Var.o0();
                    }
                    peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
                    if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    kk0Var.a0(681506527);
                    for (wd0 wd0Var : list) {
                        if (wd0Var instanceof vd0) {
                            kk0Var.a0(1712325558);
                            MarkdownSegment(((vd0) wd0Var).a, kk0Var, 0);
                            kk0Var.r(false);
                        } else {
                            if (wd0Var instanceof ud0) {
                                kk0Var.a0(1712324154);
                                kk0Var.r(false);
                                u41.e();
                                return;
                            }
                            kk0Var.a0(1712331394);
                            ud0 ud0Var2 = (ud0) wd0Var;
                            String str8 = ud0Var2.b;
                            String str9 = ud0Var2.a;
                            boolean z13 = ud0Var2.c;
                            arrayList2 = new ArrayList();
                            for (Object obj4 : list) {
                                if (obj4 instanceof ud0) {
                                    arrayList2.add(obj4);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            size = arrayList2.size();
                            i10 = 0;
                            while (i10 < size) {
                                Object obj5 = arrayList2.get(i10);
                                i10++;
                                ud0Var = (ud0) obj5;
                                if (ud0Var == wd0Var && ud0Var.c) {
                                    arrayList3.add(obj5);
                                }
                            }
                            CodeBlock(str8, str9, z13, arrayList3, kk0Var, 0, 0);
                            kk0Var.r(false);
                        }
                        z10 = z10;
                    }
                    kk0Var.r(false);
                    kk0Var.r(true);
                    cVar3 = cVar5;
                    z5 = z9;
                    z6 = z10;
                } else {
                    kk0Var.V();
                    z5 = z;
                    cVar3 = cVar2;
                    z6 = z3;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    final int i15 = 1;
                    w33VarV.updateScope(new ne1() { // from class: fa2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj6, Object obj7) {
                            int i16 = i15;
                            w84 w84Var = w84.a;
                            int i17 = i;
                            switch (i16) {
                                case 0:
                                    ((Integer) obj7).getClass();
                                    int iV = sf3.V(i17 | 1);
                                    ja2.MarkdownMessage(str, cVar3, z5, z6, (ck0) obj6, iV, i2);
                                    break;
                                default:
                                    ((Integer) obj7).getClass();
                                    int iV2 = sf3.V(i17 | 1);
                                    ja2.MarkdownMessage(str, cVar3, z5, z6, (ck0) obj6, iV2, i2);
                                    break;
                            }
                            return w84Var;
                        }
                    });
                }
            }
            i12 |= 3072;
            z3 = z2;
            i5 = 1;
            i6 = 0;
            if ((i12 & 1043) != 1042) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var.S(i12 & 1, z4)) {
                if (i13 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    z7 = true;
                } else {
                    z7 = z;
                }
                if (i3 != 0) {
                    z3 = false;
                }
                if ((i12 & 14) == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objP = kk0Var.P();
                str2 = BuildConfig.VERSION_NAME;
                if (z8) {
                    Pattern patternCompile2 = Pattern.compile("<think>.*?</think>", Headers$Companion.access$ensureUnicodeCase(32));
                    patternCompile2.getClass();
                    String strReplaceAll2 = patternCompile2.matcher(str).replaceAll(BuildConfig.VERSION_NAME);
                    strReplaceAll2.getClass();
                    objP = mo3.U0(strReplaceAll2).toString();
                    kk0Var.l0(objP);
                } else {
                    Pattern patternCompile3 = Pattern.compile("<think>.*?</think>", Headers$Companion.access$ensureUnicodeCase(32));
                    patternCompile3.getClass();
                    String strReplaceAll3 = patternCompile3.matcher(str).replaceAll(BuildConfig.VERSION_NAME);
                    strReplaceAll3.getClass();
                    objP = mo3.U0(strReplaceAll3).toString();
                    kk0Var.l0(objP);
                }
                str3 = (String) objP;
                if (str3.length() == 0) {
                    w33VarV2 = kk0Var.v();
                    if (w33VarV2 != null) {
                        final int i16 = 0;
                        final c cVar7 = cVar4;
                        final boolean z14 = z3;
                        w33VarV2.updateScope(new ne1() { // from class: fa2
                            @Override // defpackage.ne1
                            public final Object invoke(Object obj6, Object obj7) {
                                int i17 = i16;
                                w84 w84Var = w84.a;
                                int i18 = i;
                                switch (i17) {
                                    case 0:
                                        ((Integer) obj7).getClass();
                                        int iV = sf3.V(i18 | 1);
                                        ja2.MarkdownMessage(str, cVar7, z7, z14, (ck0) obj6, iV, i2);
                                        break;
                                    default:
                                        ((Integer) obj7).getClass();
                                        int iV2 = sf3.V(i18 | 1);
                                        ja2.MarkdownMessage(str, cVar7, z7, z14, (ck0) obj6, iV2, i2);
                                        break;
                                }
                                return w84Var;
                            }
                        });
                        return;
                    }
                    return;
                }
                z9 = z7;
                z10 = z3;
                cVar5 = cVar4;
                zH = kk0Var.h(str3);
                objP2 = kk0Var.P();
                if (zH) {
                    obj2 = objP2;
                    u43 u43Var3 = xd0.a;
                    arrayList = new ArrayList();
                    sb = new StringBuilder();
                    sb2 = new StringBuilder();
                    c = '\n';
                    it = mo3.N0(str3, new char[]{'\n'}).iterator();
                    obj = null;
                    while (it.hasNext()) {
                        c2 = c;
                        str4 = (String) it.next();
                        if (obj != null) {
                            char[] cArr3 = new char[i5];
                            cArr3[i6] = ' ';
                            strY0 = mo3.Y0(str4, cArr3);
                            if (str4.length() - strY0.length() > 3) {
                                sb4 = sb;
                                it2 = it;
                                sb2.append(str4);
                                sb2.append('\n');
                                break;
                                break;
                            }
                            str5 = (String) obj;
                            if (to3.q0(strY0, str5, false)) {
                                string = mo3.W0(strY0).toString();
                                sb4 = sb;
                                it2 = it;
                                i7 = 0;
                                while (true) {
                                    if (i7 < string.length()) {
                                        i8 = i7;
                                        str6 = strY0;
                                        if (string.charAt(i7) == str5.charAt(0)) {
                                            i7 = i8 + 1;
                                            strY0 = str6;
                                        }
                                    } else if (mo3.W0(strY0).toString().length() >= str5.length()) {
                                        arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), true));
                                        obj = null;
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                sb4 = sb;
                                it2 = it;
                            }
                            sb2.append(str4);
                            sb2.append('\n');
                            break;
                            break;
                        }
                        u43 u43Var4 = xd0.a;
                        u43Var4.getClass();
                        str4.getClass();
                        Matcher matcher2 = u43Var4.c.matcher(str4);
                        matcher2.getClass();
                        za2VarD = kr1.d(matcher2, i6, str4);
                        if (za2VarD != null) {
                            if (!mo3.C0(sb)) {
                                String string3 = sb.toString();
                                char[] cArr4 = new char[i5];
                                cArr4[i6] = c2;
                                arrayList.add(new vd0(mo3.X0(string3, cArr4)));
                            }
                            sb.setLength(i6);
                            Object obj6 = ((ya2) za2VarD.a()).get(i5);
                            String str10 = (String) ((ya2) za2VarD.a()).get(i11);
                            sb2.setLength(i6);
                            sb4 = sb;
                            it2 = it;
                            str2 = str10;
                            obj = obj6;
                        } else {
                            sb.append(str4);
                            sb.append(c2);
                            sb4 = sb;
                            it2 = it;
                        }
                        sb = sb4;
                        it = it2;
                        c = '\n';
                        i11 = 2;
                        i5 = 1;
                        i6 = 0;
                    }
                    sb3 = sb;
                    if (obj != null) {
                        arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), false));
                    } else if (!mo3.C0(sb3)) {
                        arrayList.add(new vd0(mo3.X0(sb3.toString(), '\n')));
                    }
                    kk0Var.l0(arrayList);
                    obj2 = arrayList;
                } else {
                    obj2 = objP2;
                    u43 u43Var5 = xd0.a;
                    arrayList = new ArrayList();
                    sb = new StringBuilder();
                    sb2 = new StringBuilder();
                    c = '\n';
                    it = mo3.N0(str3, new char[]{'\n'}).iterator();
                    obj = null;
                    while (it.hasNext()) {
                        c2 = c;
                        str4 = (String) it.next();
                        if (obj != null) {
                            char[] cArr5 = new char[i5];
                            cArr5[i6] = ' ';
                            strY0 = mo3.Y0(str4, cArr5);
                            if (str4.length() - strY0.length() > 3) {
                                sb4 = sb;
                                it2 = it;
                                sb2.append(str4);
                                sb2.append('\n');
                                break;
                                break;
                            }
                            str5 = (String) obj;
                            if (to3.q0(strY0, str5, false)) {
                                string = mo3.W0(strY0).toString();
                                sb4 = sb;
                                it2 = it;
                                i7 = 0;
                                while (true) {
                                    if (i7 < string.length()) {
                                        i8 = i7;
                                        str6 = strY0;
                                        if (string.charAt(i7) == str5.charAt(0)) {
                                            i7 = i8 + 1;
                                            strY0 = str6;
                                        }
                                    } else if (mo3.W0(strY0).toString().length() >= str5.length()) {
                                        arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), true));
                                        obj = null;
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                sb4 = sb;
                                it2 = it;
                            }
                            sb2.append(str4);
                            sb2.append('\n');
                            break;
                            break;
                        }
                        u43 u43Var6 = xd0.a;
                        u43Var6.getClass();
                        str4.getClass();
                        Matcher matcher3 = u43Var6.c.matcher(str4);
                        matcher3.getClass();
                        za2VarD = kr1.d(matcher3, i6, str4);
                        if (za2VarD != null) {
                            if (!mo3.C0(sb)) {
                                String string4 = sb.toString();
                                char[] cArr6 = new char[i5];
                                cArr6[i6] = c2;
                                arrayList.add(new vd0(mo3.X0(string4, cArr6)));
                            }
                            sb.setLength(i6);
                            Object obj7 = ((ya2) za2VarD.a()).get(i5);
                            String str11 = (String) ((ya2) za2VarD.a()).get(i11);
                            sb2.setLength(i6);
                            sb4 = sb;
                            it2 = it;
                            str2 = str11;
                            obj = obj7;
                        } else {
                            sb.append(str4);
                            sb.append(c2);
                            sb4 = sb;
                            it2 = it;
                        }
                        sb = sb4;
                        it = it2;
                        c = '\n';
                        i11 = 2;
                        i5 = 1;
                        i6 = 0;
                    }
                    sb3 = sb;
                    if (obj != null) {
                        arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), false));
                    } else if (!mo3.C0(sb3)) {
                        arrayList.add(new vd0(mo3.X0(sb3.toString(), '\n')));
                    }
                    kk0Var.l0(arrayList);
                    obj2 = arrayList;
                }
                obj2 = objP2;
                list = (List) obj2;
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                objP3 = kk0Var.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    objP3 = new ct2(0);
                    kk0Var.l0(objP3);
                }
                fh2Var = (fh2) objP3;
                Boolean boolValueOf2 = Boolean.valueOf(z10);
                if ((i12 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objP4 = kk0Var.P();
                if (z11) {
                    objP4 = new ia2(z10, fh2Var, (so0) null);
                    kk0Var.l0(objP4);
                } else {
                    objP4 = new ia2(z10, fh2Var, (so0) null);
                    kk0Var.l0(objP4);
                }
                r11.LaunchedEffect(boolValueOf2, (ne1) objP4, kk0Var, (i12 >> 9) & 14);
                if (z10) {
                    ct2Var = (ct2) fh2Var;
                    if (ct2Var.f() > 0) {
                        cVarF = d.f(c.i, wu0Var.q0(ct2Var.f()), 0.0f, 2);
                    } else {
                        cVarF = c.i;
                    }
                } else {
                    cVarF = c.i;
                }
                c cVarThen3 = cVar5.then(cVarF);
                if (z10) {
                    kk0Var.a0(-1824213525);
                    Modifier$Companion modifier$Companion2 = c.i;
                    objP5 = kk0Var.P();
                    if (objP5 == Composer$Companion.getEmpty()) {
                        objP5 = new k10(fh2Var, 1);
                        kk0Var.l0(objP5);
                    }
                    cVarE = androidx.compose.ui.layout.a.e(modifier$Companion2, (le1) objP5);
                    i9 = 0;
                    kk0Var.r(false);
                } else {
                    i9 = 0;
                    kk0Var.a0(-1824211589);
                    kk0Var.r(false);
                    cVarE = c.i;
                }
                c cVarThen4 = cVarThen3.then(cVarE);
                vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, i9);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i9);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarThen4);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                kk0Var.a0(681506527);
                while (r8.hasNext()) {
                    if (wd0Var instanceof vd0) {
                        kk0Var.a0(1712325558);
                        MarkdownSegment(((vd0) wd0Var).a, kk0Var, 0);
                        kk0Var.r(false);
                    } else {
                        if (wd0Var instanceof ud0) {
                            kk0Var.a0(1712324154);
                            kk0Var.r(false);
                            u41.e();
                            return;
                        }
                        kk0Var.a0(1712331394);
                        ud0 ud0Var3 = (ud0) wd0Var;
                        String str12 = ud0Var3.b;
                        String str13 = ud0Var3.a;
                        boolean z15 = ud0Var3.c;
                        arrayList2 = new ArrayList();
                        while (r6.hasNext()) {
                            if (obj4 instanceof ud0) {
                                arrayList2.add(obj4);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        size = arrayList2.size();
                        i10 = 0;
                        while (i10 < size) {
                            Object obj8 = arrayList2.get(i10);
                            i10++;
                            ud0Var = (ud0) obj8;
                            if (ud0Var == wd0Var) {
                            }
                        }
                        CodeBlock(str12, str13, z15, arrayList4, kk0Var, 0, 0);
                        kk0Var.r(false);
                    }
                    z10 = z10;
                }
                kk0Var.r(false);
                kk0Var.r(true);
                cVar3 = cVar5;
                z5 = z9;
                z6 = z10;
            } else {
                kk0Var.V();
                z5 = z;
                cVar3 = cVar2;
                z6 = z3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                final int i17 = 1;
                w33VarV.updateScope(new ne1() { // from class: fa2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj9, Object obj10) {
                        int i18 = i17;
                        w84 w84Var = w84.a;
                        int i19 = i;
                        switch (i18) {
                            case 0:
                                ((Integer) obj10).getClass();
                                int iV = sf3.V(i19 | 1);
                                ja2.MarkdownMessage(str, cVar3, z5, z6, (ck0) obj9, iV, i2);
                                break;
                            default:
                                ((Integer) obj10).getClass();
                                int iV2 = sf3.V(i19 | 1);
                                ja2.MarkdownMessage(str, cVar3, z5, z6, (ck0) obj9, iV2, i2);
                                break;
                        }
                        return w84Var;
                    }
                });
            }
        }
        i12 |= 48;
        cVar2 = cVar;
        i3 = i2 & 8;
        if (i3 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (kk0Var.i(z3)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i12 |= i4;
            }
            i5 = 1;
            i6 = 0;
            if ((i12 & 1043) != 1042) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (kk0Var.S(i12 & 1, z4)) {
                if (i13 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if ((i2 & 4) != 0) {
                    z7 = true;
                } else {
                    z7 = z;
                }
                if (i3 != 0) {
                    z3 = false;
                }
                if ((i12 & 14) == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objP = kk0Var.P();
                str2 = BuildConfig.VERSION_NAME;
                if (z8) {
                    Pattern patternCompile4 = Pattern.compile("<think>.*?</think>", Headers$Companion.access$ensureUnicodeCase(32));
                    patternCompile4.getClass();
                    String strReplaceAll4 = patternCompile4.matcher(str).replaceAll(BuildConfig.VERSION_NAME);
                    strReplaceAll4.getClass();
                    objP = mo3.U0(strReplaceAll4).toString();
                    kk0Var.l0(objP);
                } else {
                    Pattern patternCompile5 = Pattern.compile("<think>.*?</think>", Headers$Companion.access$ensureUnicodeCase(32));
                    patternCompile5.getClass();
                    String strReplaceAll5 = patternCompile5.matcher(str).replaceAll(BuildConfig.VERSION_NAME);
                    strReplaceAll5.getClass();
                    objP = mo3.U0(strReplaceAll5).toString();
                    kk0Var.l0(objP);
                }
                str3 = (String) objP;
                if (str3.length() == 0) {
                    w33VarV2 = kk0Var.v();
                    if (w33VarV2 != null) {
                        final int i18 = 0;
                        final c cVar8 = cVar4;
                        final boolean z16 = z3;
                        w33VarV2.updateScope(new ne1() { // from class: fa2
                            @Override // defpackage.ne1
                            public final Object invoke(Object obj9, Object obj10) {
                                int i19 = i18;
                                w84 w84Var = w84.a;
                                int i110 = i;
                                switch (i19) {
                                    case 0:
                                        ((Integer) obj10).getClass();
                                        int iV = sf3.V(i110 | 1);
                                        ja2.MarkdownMessage(str, cVar8, z7, z16, (ck0) obj9, iV, i2);
                                        break;
                                    default:
                                        ((Integer) obj10).getClass();
                                        int iV2 = sf3.V(i110 | 1);
                                        ja2.MarkdownMessage(str, cVar8, z7, z16, (ck0) obj9, iV2, i2);
                                        break;
                                }
                                return w84Var;
                            }
                        });
                        return;
                    }
                    return;
                }
                z9 = z7;
                z10 = z3;
                cVar5 = cVar4;
                zH = kk0Var.h(str3);
                objP2 = kk0Var.P();
                if (zH) {
                    obj2 = objP2;
                    u43 u43Var7 = xd0.a;
                    arrayList = new ArrayList();
                    sb = new StringBuilder();
                    sb2 = new StringBuilder();
                    c = '\n';
                    it = mo3.N0(str3, new char[]{'\n'}).iterator();
                    obj = null;
                    while (it.hasNext()) {
                        c2 = c;
                        str4 = (String) it.next();
                        if (obj != null) {
                            char[] cArr7 = new char[i5];
                            cArr7[i6] = ' ';
                            strY0 = mo3.Y0(str4, cArr7);
                            if (str4.length() - strY0.length() > 3) {
                                sb4 = sb;
                                it2 = it;
                                sb2.append(str4);
                                sb2.append('\n');
                                break;
                                break;
                            }
                            str5 = (String) obj;
                            if (to3.q0(strY0, str5, false)) {
                                string = mo3.W0(strY0).toString();
                                sb4 = sb;
                                it2 = it;
                                i7 = 0;
                                while (true) {
                                    if (i7 < string.length()) {
                                        i8 = i7;
                                        str6 = strY0;
                                        if (string.charAt(i7) == str5.charAt(0)) {
                                            i7 = i8 + 1;
                                            strY0 = str6;
                                        }
                                    } else if (mo3.W0(strY0).toString().length() >= str5.length()) {
                                        arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), true));
                                        obj = null;
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                sb4 = sb;
                                it2 = it;
                            }
                            sb2.append(str4);
                            sb2.append('\n');
                            break;
                            break;
                        }
                        u43 u43Var8 = xd0.a;
                        u43Var8.getClass();
                        str4.getClass();
                        Matcher matcher4 = u43Var8.c.matcher(str4);
                        matcher4.getClass();
                        za2VarD = kr1.d(matcher4, i6, str4);
                        if (za2VarD != null) {
                            if (!mo3.C0(sb)) {
                                String string5 = sb.toString();
                                char[] cArr8 = new char[i5];
                                cArr8[i6] = c2;
                                arrayList.add(new vd0(mo3.X0(string5, cArr8)));
                            }
                            sb.setLength(i6);
                            Object obj9 = ((ya2) za2VarD.a()).get(i5);
                            String str14 = (String) ((ya2) za2VarD.a()).get(i11);
                            sb2.setLength(i6);
                            sb4 = sb;
                            it2 = it;
                            str2 = str14;
                            obj = obj9;
                        } else {
                            sb.append(str4);
                            sb.append(c2);
                            sb4 = sb;
                            it2 = it;
                        }
                        sb = sb4;
                        it = it2;
                        c = '\n';
                        i11 = 2;
                        i5 = 1;
                        i6 = 0;
                    }
                    sb3 = sb;
                    if (obj != null) {
                        arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), false));
                    } else if (!mo3.C0(sb3)) {
                        arrayList.add(new vd0(mo3.X0(sb3.toString(), '\n')));
                    }
                    kk0Var.l0(arrayList);
                    obj2 = arrayList;
                } else {
                    obj2 = objP2;
                    u43 u43Var9 = xd0.a;
                    arrayList = new ArrayList();
                    sb = new StringBuilder();
                    sb2 = new StringBuilder();
                    c = '\n';
                    it = mo3.N0(str3, new char[]{'\n'}).iterator();
                    obj = null;
                    while (it.hasNext()) {
                        c2 = c;
                        str4 = (String) it.next();
                        if (obj != null) {
                            char[] cArr9 = new char[i5];
                            cArr9[i6] = ' ';
                            strY0 = mo3.Y0(str4, cArr9);
                            if (str4.length() - strY0.length() > 3) {
                                sb4 = sb;
                                it2 = it;
                                sb2.append(str4);
                                sb2.append('\n');
                                break;
                                break;
                            }
                            str5 = (String) obj;
                            if (to3.q0(strY0, str5, false)) {
                                string = mo3.W0(strY0).toString();
                                sb4 = sb;
                                it2 = it;
                                i7 = 0;
                                while (true) {
                                    if (i7 < string.length()) {
                                        i8 = i7;
                                        str6 = strY0;
                                        if (string.charAt(i7) == str5.charAt(0)) {
                                            i7 = i8 + 1;
                                            strY0 = str6;
                                        }
                                    } else if (mo3.W0(strY0).toString().length() >= str5.length()) {
                                        arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), true));
                                        obj = null;
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                sb4 = sb;
                                it2 = it;
                            }
                            sb2.append(str4);
                            sb2.append('\n');
                            break;
                            break;
                        }
                        u43 u43Var10 = xd0.a;
                        u43Var10.getClass();
                        str4.getClass();
                        Matcher matcher5 = u43Var10.c.matcher(str4);
                        matcher5.getClass();
                        za2VarD = kr1.d(matcher5, i6, str4);
                        if (za2VarD != null) {
                            if (!mo3.C0(sb)) {
                                String string6 = sb.toString();
                                char[] cArr10 = new char[i5];
                                cArr10[i6] = c2;
                                arrayList.add(new vd0(mo3.X0(string6, cArr10)));
                            }
                            sb.setLength(i6);
                            Object obj10 = ((ya2) za2VarD.a()).get(i5);
                            String str15 = (String) ((ya2) za2VarD.a()).get(i11);
                            sb2.setLength(i6);
                            sb4 = sb;
                            it2 = it;
                            str2 = str15;
                            obj = obj10;
                        } else {
                            sb.append(str4);
                            sb.append(c2);
                            sb4 = sb;
                            it2 = it;
                        }
                        sb = sb4;
                        it = it2;
                        c = '\n';
                        i11 = 2;
                        i5 = 1;
                        i6 = 0;
                    }
                    sb3 = sb;
                    if (obj != null) {
                        arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), false));
                    } else if (!mo3.C0(sb3)) {
                        arrayList.add(new vd0(mo3.X0(sb3.toString(), '\n')));
                    }
                    kk0Var.l0(arrayList);
                    obj2 = arrayList;
                }
                obj2 = objP2;
                list = (List) obj2;
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                objP3 = kk0Var.P();
                if (objP3 == Composer$Companion.getEmpty()) {
                    objP3 = new ct2(0);
                    kk0Var.l0(objP3);
                }
                fh2Var = (fh2) objP3;
                Boolean boolValueOf3 = Boolean.valueOf(z10);
                if ((i12 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objP4 = kk0Var.P();
                if (z11) {
                    objP4 = new ia2(z10, fh2Var, (so0) null);
                    kk0Var.l0(objP4);
                } else {
                    objP4 = new ia2(z10, fh2Var, (so0) null);
                    kk0Var.l0(objP4);
                }
                r11.LaunchedEffect(boolValueOf3, (ne1) objP4, kk0Var, (i12 >> 9) & 14);
                if (z10) {
                    ct2Var = (ct2) fh2Var;
                    if (ct2Var.f() > 0) {
                        cVarF = d.f(c.i, wu0Var.q0(ct2Var.f()), 0.0f, 2);
                    } else {
                        cVarF = c.i;
                    }
                } else {
                    cVarF = c.i;
                }
                c cVarThen5 = cVar5.then(cVarF);
                if (z10) {
                    kk0Var.a0(-1824213525);
                    Modifier$Companion modifier$Companion3 = c.i;
                    objP5 = kk0Var.P();
                    if (objP5 == Composer$Companion.getEmpty()) {
                        objP5 = new k10(fh2Var, 1);
                        kk0Var.l0(objP5);
                    }
                    cVarE = androidx.compose.ui.layout.a.e(modifier$Companion3, (le1) objP5);
                    i9 = 0;
                    kk0Var.r(false);
                } else {
                    i9 = 0;
                    kk0Var.a0(-1824211589);
                    kk0Var.r(false);
                    cVarE = c.i;
                }
                c cVarThen6 = cVarThen5.then(cVarE);
                vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, i9);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i9);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarThen6);
                androidx.compose.ui.node.a.j.getClass();
                constructor = ComposeUiNode$Companion.getConstructor();
                if (kk0Var.a != null) {
                    rj0.a();
                    throw null;
                }
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor);
                } else {
                    kk0Var.o0();
                }
                peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                kk0Var.a0(681506527);
                while (r8.hasNext()) {
                    if (wd0Var instanceof vd0) {
                        kk0Var.a0(1712325558);
                        MarkdownSegment(((vd0) wd0Var).a, kk0Var, 0);
                        kk0Var.r(false);
                    } else {
                        if (wd0Var instanceof ud0) {
                            kk0Var.a0(1712324154);
                            kk0Var.r(false);
                            u41.e();
                            return;
                        }
                        kk0Var.a0(1712331394);
                        ud0 ud0Var4 = (ud0) wd0Var;
                        String str16 = ud0Var4.b;
                        String str17 = ud0Var4.a;
                        boolean z17 = ud0Var4.c;
                        arrayList2 = new ArrayList();
                        while (r6.hasNext()) {
                            if (obj4 instanceof ud0) {
                                arrayList2.add(obj4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        size = arrayList2.size();
                        i10 = 0;
                        while (i10 < size) {
                            Object obj11 = arrayList2.get(i10);
                            i10++;
                            ud0Var = (ud0) obj11;
                            if (ud0Var == wd0Var) {
                            }
                        }
                        CodeBlock(str16, str17, z17, arrayList5, kk0Var, 0, 0);
                        kk0Var.r(false);
                    }
                    z10 = z10;
                }
                kk0Var.r(false);
                kk0Var.r(true);
                cVar3 = cVar5;
                z5 = z9;
                z6 = z10;
            } else {
                kk0Var.V();
                z5 = z;
                cVar3 = cVar2;
                z6 = z3;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                final int i19 = 1;
                w33VarV.updateScope(new ne1() { // from class: fa2
                    @Override // defpackage.ne1
                    public final Object invoke(Object obj12, Object obj13) {
                        int i110 = i19;
                        w84 w84Var = w84.a;
                        int i111 = i;
                        switch (i110) {
                            case 0:
                                ((Integer) obj13).getClass();
                                int iV = sf3.V(i111 | 1);
                                ja2.MarkdownMessage(str, cVar3, z5, z6, (ck0) obj12, iV, i2);
                                break;
                            default:
                                ((Integer) obj13).getClass();
                                int iV2 = sf3.V(i111 | 1);
                                ja2.MarkdownMessage(str, cVar3, z5, z6, (ck0) obj12, iV2, i2);
                                break;
                        }
                        return w84Var;
                    }
                });
            }
        }
        i12 |= 3072;
        z3 = z2;
        i5 = 1;
        i6 = 0;
        if ((i12 & 1043) != 1042) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (kk0Var.S(i12 & 1, z4)) {
            if (i13 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            if ((i2 & 4) != 0) {
                z7 = true;
            } else {
                z7 = z;
            }
            if (i3 != 0) {
                z3 = false;
            }
            if ((i12 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            objP = kk0Var.P();
            str2 = BuildConfig.VERSION_NAME;
            if (z8) {
                Pattern patternCompile6 = Pattern.compile("<think>.*?</think>", Headers$Companion.access$ensureUnicodeCase(32));
                patternCompile6.getClass();
                String strReplaceAll6 = patternCompile6.matcher(str).replaceAll(BuildConfig.VERSION_NAME);
                strReplaceAll6.getClass();
                objP = mo3.U0(strReplaceAll6).toString();
                kk0Var.l0(objP);
            } else {
                Pattern patternCompile7 = Pattern.compile("<think>.*?</think>", Headers$Companion.access$ensureUnicodeCase(32));
                patternCompile7.getClass();
                String strReplaceAll7 = patternCompile7.matcher(str).replaceAll(BuildConfig.VERSION_NAME);
                strReplaceAll7.getClass();
                objP = mo3.U0(strReplaceAll7).toString();
                kk0Var.l0(objP);
            }
            str3 = (String) objP;
            if (str3.length() == 0) {
                w33VarV2 = kk0Var.v();
                if (w33VarV2 != null) {
                    final int i110 = 0;
                    final c cVar9 = cVar4;
                    final boolean z18 = z3;
                    w33VarV2.updateScope(new ne1() { // from class: fa2
                        @Override // defpackage.ne1
                        public final Object invoke(Object obj12, Object obj13) {
                            int i111 = i110;
                            w84 w84Var = w84.a;
                            int i112 = i;
                            switch (i111) {
                                case 0:
                                    ((Integer) obj13).getClass();
                                    int iV = sf3.V(i112 | 1);
                                    ja2.MarkdownMessage(str, cVar9, z7, z18, (ck0) obj12, iV, i2);
                                    break;
                                default:
                                    ((Integer) obj13).getClass();
                                    int iV2 = sf3.V(i112 | 1);
                                    ja2.MarkdownMessage(str, cVar9, z7, z18, (ck0) obj12, iV2, i2);
                                    break;
                            }
                            return w84Var;
                        }
                    });
                    return;
                }
                return;
            }
            z9 = z7;
            z10 = z3;
            cVar5 = cVar4;
            zH = kk0Var.h(str3);
            objP2 = kk0Var.P();
            if (zH) {
                obj2 = objP2;
                u43 u43Var11 = xd0.a;
                arrayList = new ArrayList();
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                c = '\n';
                it = mo3.N0(str3, new char[]{'\n'}).iterator();
                obj = null;
                while (it.hasNext()) {
                    c2 = c;
                    str4 = (String) it.next();
                    if (obj != null) {
                        char[] cArr11 = new char[i5];
                        cArr11[i6] = ' ';
                        strY0 = mo3.Y0(str4, cArr11);
                        if (str4.length() - strY0.length() > 3) {
                            sb4 = sb;
                            it2 = it;
                            sb2.append(str4);
                            sb2.append('\n');
                            break;
                            break;
                        }
                        str5 = (String) obj;
                        if (to3.q0(strY0, str5, false)) {
                            string = mo3.W0(strY0).toString();
                            sb4 = sb;
                            it2 = it;
                            i7 = 0;
                            while (true) {
                                if (i7 < string.length()) {
                                    i8 = i7;
                                    str6 = strY0;
                                    if (string.charAt(i7) == str5.charAt(0)) {
                                        i7 = i8 + 1;
                                        strY0 = str6;
                                    }
                                } else if (mo3.W0(strY0).toString().length() >= str5.length()) {
                                    arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), true));
                                    obj = null;
                                    break;
                                    break;
                                }
                            }
                        } else {
                            sb4 = sb;
                            it2 = it;
                        }
                        sb2.append(str4);
                        sb2.append('\n');
                        break;
                        break;
                    }
                    u43 u43Var12 = xd0.a;
                    u43Var12.getClass();
                    str4.getClass();
                    Matcher matcher6 = u43Var12.c.matcher(str4);
                    matcher6.getClass();
                    za2VarD = kr1.d(matcher6, i6, str4);
                    if (za2VarD != null) {
                        if (!mo3.C0(sb)) {
                            String string7 = sb.toString();
                            char[] cArr12 = new char[i5];
                            cArr12[i6] = c2;
                            arrayList.add(new vd0(mo3.X0(string7, cArr12)));
                        }
                        sb.setLength(i6);
                        Object obj12 = ((ya2) za2VarD.a()).get(i5);
                        String str18 = (String) ((ya2) za2VarD.a()).get(i11);
                        sb2.setLength(i6);
                        sb4 = sb;
                        it2 = it;
                        str2 = str18;
                        obj = obj12;
                    } else {
                        sb.append(str4);
                        sb.append(c2);
                        sb4 = sb;
                        it2 = it;
                    }
                    sb = sb4;
                    it = it2;
                    c = '\n';
                    i11 = 2;
                    i5 = 1;
                    i6 = 0;
                }
                sb3 = sb;
                if (obj != null) {
                    arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), false));
                } else if (!mo3.C0(sb3)) {
                    arrayList.add(new vd0(mo3.X0(sb3.toString(), '\n')));
                }
                kk0Var.l0(arrayList);
                obj2 = arrayList;
            } else {
                obj2 = objP2;
                u43 u43Var13 = xd0.a;
                arrayList = new ArrayList();
                sb = new StringBuilder();
                sb2 = new StringBuilder();
                c = '\n';
                it = mo3.N0(str3, new char[]{'\n'}).iterator();
                obj = null;
                while (it.hasNext()) {
                    c2 = c;
                    str4 = (String) it.next();
                    if (obj != null) {
                        char[] cArr13 = new char[i5];
                        cArr13[i6] = ' ';
                        strY0 = mo3.Y0(str4, cArr13);
                        if (str4.length() - strY0.length() > 3) {
                            sb4 = sb;
                            it2 = it;
                            sb2.append(str4);
                            sb2.append('\n');
                            break;
                            break;
                        }
                        str5 = (String) obj;
                        if (to3.q0(strY0, str5, false)) {
                            string = mo3.W0(strY0).toString();
                            sb4 = sb;
                            it2 = it;
                            i7 = 0;
                            while (true) {
                                if (i7 < string.length()) {
                                    i8 = i7;
                                    str6 = strY0;
                                    if (string.charAt(i7) == str5.charAt(0)) {
                                        i7 = i8 + 1;
                                        strY0 = str6;
                                    }
                                } else if (mo3.W0(strY0).toString().length() >= str5.length()) {
                                    arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), true));
                                    obj = null;
                                    break;
                                    break;
                                }
                            }
                        } else {
                            sb4 = sb;
                            it2 = it;
                        }
                        sb2.append(str4);
                        sb2.append('\n');
                        break;
                        break;
                    }
                    u43 u43Var14 = xd0.a;
                    u43Var14.getClass();
                    str4.getClass();
                    Matcher matcher7 = u43Var14.c.matcher(str4);
                    matcher7.getClass();
                    za2VarD = kr1.d(matcher7, i6, str4);
                    if (za2VarD != null) {
                        if (!mo3.C0(sb)) {
                            String string8 = sb.toString();
                            char[] cArr14 = new char[i5];
                            cArr14[i6] = c2;
                            arrayList.add(new vd0(mo3.X0(string8, cArr14)));
                        }
                        sb.setLength(i6);
                        Object obj13 = ((ya2) za2VarD.a()).get(i5);
                        String str19 = (String) ((ya2) za2VarD.a()).get(i11);
                        sb2.setLength(i6);
                        sb4 = sb;
                        it2 = it;
                        str2 = str19;
                        obj = obj13;
                    } else {
                        sb.append(str4);
                        sb.append(c2);
                        sb4 = sb;
                        it2 = it;
                    }
                    sb = sb4;
                    it = it2;
                    c = '\n';
                    i11 = 2;
                    i5 = 1;
                    i6 = 0;
                }
                sb3 = sb;
                if (obj != null) {
                    arrayList.add(new ud0(str2, mo3.K0(sb2.toString(), "\n"), false));
                } else if (!mo3.C0(sb3)) {
                    arrayList.add(new vd0(mo3.X0(sb3.toString(), '\n')));
                }
                kk0Var.l0(arrayList);
                obj2 = arrayList;
            }
            obj2 = objP2;
            list = (List) obj2;
            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
            objP3 = kk0Var.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                objP3 = new ct2(0);
                kk0Var.l0(objP3);
            }
            fh2Var = (fh2) objP3;
            Boolean boolValueOf4 = Boolean.valueOf(z10);
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objP4 = kk0Var.P();
            if (z11) {
                objP4 = new ia2(z10, fh2Var, (so0) null);
                kk0Var.l0(objP4);
            } else {
                objP4 = new ia2(z10, fh2Var, (so0) null);
                kk0Var.l0(objP4);
            }
            r11.LaunchedEffect(boolValueOf4, (ne1) objP4, kk0Var, (i12 >> 9) & 14);
            if (z10) {
                ct2Var = (ct2) fh2Var;
                if (ct2Var.f() > 0) {
                    cVarF = d.f(c.i, wu0Var.q0(ct2Var.f()), 0.0f, 2);
                } else {
                    cVarF = c.i;
                }
            } else {
                cVarF = c.i;
            }
            c cVarThen7 = cVar5.then(cVarF);
            if (z10) {
                kk0Var.a0(-1824213525);
                Modifier$Companion modifier$Companion4 = c.i;
                objP5 = kk0Var.P();
                if (objP5 == Composer$Companion.getEmpty()) {
                    objP5 = new k10(fh2Var, 1);
                    kk0Var.l0(objP5);
                }
                cVarE = androidx.compose.ui.layout.a.e(modifier$Companion4, (le1) objP5);
                i9 = 0;
                kk0Var.r(false);
            } else {
                i9 = 0;
                kk0Var.a0(-1824211589);
                kk0Var.r(false);
                cVarE = c.i;
            }
            c cVarThen8 = cVarThen7.then(cVarE);
            vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, i9);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i9);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarThen8);
            androidx.compose.ui.node.a.j.getClass();
            constructor = ComposeUiNode$Companion.getConstructor();
            if (kk0Var.a != null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            peVarH = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            kk0Var.a0(681506527);
            while (r8.hasNext()) {
                if (wd0Var instanceof vd0) {
                    kk0Var.a0(1712325558);
                    MarkdownSegment(((vd0) wd0Var).a, kk0Var, 0);
                    kk0Var.r(false);
                } else {
                    if (wd0Var instanceof ud0) {
                        kk0Var.a0(1712324154);
                        kk0Var.r(false);
                        u41.e();
                        return;
                    }
                    kk0Var.a0(1712331394);
                    ud0 ud0Var5 = (ud0) wd0Var;
                    String str110 = ud0Var5.b;
                    String str111 = ud0Var5.a;
                    boolean z19 = ud0Var5.c;
                    arrayList2 = new ArrayList();
                    while (r6.hasNext()) {
                        if (obj4 instanceof ud0) {
                            arrayList2.add(obj4);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    size = arrayList2.size();
                    i10 = 0;
                    while (i10 < size) {
                        Object obj14 = arrayList2.get(i10);
                        i10++;
                        ud0Var = (ud0) obj14;
                        if (ud0Var == wd0Var) {
                        }
                    }
                    CodeBlock(str110, str111, z19, arrayList6, kk0Var, 0, 0);
                    kk0Var.r(false);
                }
                z10 = z10;
            }
            kk0Var.r(false);
            kk0Var.r(true);
            cVar3 = cVar5;
            z5 = z9;
            z6 = z10;
        } else {
            kk0Var.V();
            z5 = z;
            cVar3 = cVar2;
            z6 = z3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            final int i111 = 1;
            w33VarV.updateScope(new ne1() { // from class: fa2
                @Override // defpackage.ne1
                public final Object invoke(Object obj15, Object obj16) {
                    int i112 = i111;
                    w84 w84Var = w84.a;
                    int i113 = i;
                    switch (i112) {
                        case 0:
                            ((Integer) obj16).getClass();
                            int iV = sf3.V(i113 | 1);
                            ja2.MarkdownMessage(str, cVar3, z5, z6, (ck0) obj15, iV, i2);
                            break;
                        default:
                            ((Integer) obj16).getClass();
                            int iV2 = sf3.V(i113 | 1);
                            ja2.MarkdownMessage(str, cVar3, z5, z6, (ck0) obj15, iV2, i2);
                            break;
                    }
                    return w84Var;
                }
            });
        }
    }

    private static final void MarkdownSegment(String str, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1616589500);
        final int i3 = 2;
        final int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i5 = 0;
        final int i6 = 1;
        if (kk0Var.S(i2 & 1, (i2 & 3) != 2)) {
            ab2 ab2Var = ab2.a;
            final long j = ab2Var.getColorScheme(kk0Var, 0).q;
            boolean z = (i2 & 14) == 4;
            Object objP = kk0Var.P();
            if (z || objP == Composer$Companion.getEmpty()) {
                u43 u43Var = nb2.a;
                str.getClass();
                final ArrayList arrayList = new ArrayList();
                final int i7 = 6;
                if (mo3.z0(Typography.dollar, 0, 6, str) == -1 && mo3.z0('\\', 0, 6, str) == -1) {
                    objP = new mb2(str, arrayList);
                } else {
                    final ArrayList arrayList2 = new ArrayList();
                    String strD = nb2.e.d(nb2.d.d(nb2.c.d(str, new le1() { // from class: kb2
                        @Override // defpackage.le1
                        public final Object invoke(Object obj) {
                            int i8 = i5;
                            ArrayList arrayList3 = arrayList2;
                            za2 za2Var = (za2) obj;
                            switch (i8) {
                                case 0:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 1:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 2:
                                    za2Var.getClass();
                                    return !mo3.C0((CharSequence) ((ya2) za2Var.a()).get(1)) ? nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true) : za2Var.c();
                                case 3:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true);
                                case 4:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), false);
                                case 5:
                                    za2Var.getClass();
                                    String str2 = (String) ((ya2) za2Var.a()).get(1);
                                    String str3 = (String) ((ya2) za2Var.a()).get(2);
                                    str3.getClass();
                                    return (!nb2.i.c(str3) && (mo3.z0('\\', 0, 6, str3) != -1 || (!nb2.j.a(str3) && (nb2.k.c(str3) || nb2.l.a(str3) || str3.length() <= 3)))) ? ud2.p(str2, nb2.c(arrayList3, fq2.n("$", str3, "$"), str3, false)) : za2Var.c();
                                default:
                                    za2Var.getClass();
                                    Object obj2 = arrayList3.get(Integer.parseInt((String) ((ya2) za2Var.a()).get(1)));
                                    obj2.getClass();
                                    return (CharSequence) obj2;
                            }
                        }
                    }), new le1() { // from class: kb2
                        @Override // defpackage.le1
                        public final Object invoke(Object obj) {
                            int i8 = i6;
                            ArrayList arrayList3 = arrayList2;
                            za2 za2Var = (za2) obj;
                            switch (i8) {
                                case 0:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 1:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 2:
                                    za2Var.getClass();
                                    return !mo3.C0((CharSequence) ((ya2) za2Var.a()).get(1)) ? nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true) : za2Var.c();
                                case 3:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true);
                                case 4:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), false);
                                case 5:
                                    za2Var.getClass();
                                    String str2 = (String) ((ya2) za2Var.a()).get(1);
                                    String str3 = (String) ((ya2) za2Var.a()).get(2);
                                    str3.getClass();
                                    return (!nb2.i.c(str3) && (mo3.z0('\\', 0, 6, str3) != -1 || (!nb2.j.a(str3) && (nb2.k.c(str3) || nb2.l.a(str3) || str3.length() <= 3)))) ? ud2.p(str2, nb2.c(arrayList3, fq2.n("$", str3, "$"), str3, false)) : za2Var.c();
                                default:
                                    za2Var.getClass();
                                    Object obj2 = arrayList3.get(Integer.parseInt((String) ((ya2) za2Var.a()).get(1)));
                                    obj2.getClass();
                                    return (CharSequence) obj2;
                            }
                        }
                    }), new le1() { // from class: kb2
                        @Override // defpackage.le1
                        public final Object invoke(Object obj) {
                            int i8 = i3;
                            ArrayList arrayList3 = arrayList;
                            za2 za2Var = (za2) obj;
                            switch (i8) {
                                case 0:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 1:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 2:
                                    za2Var.getClass();
                                    return !mo3.C0((CharSequence) ((ya2) za2Var.a()).get(1)) ? nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true) : za2Var.c();
                                case 3:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true);
                                case 4:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), false);
                                case 5:
                                    za2Var.getClass();
                                    String str2 = (String) ((ya2) za2Var.a()).get(1);
                                    String str3 = (String) ((ya2) za2Var.a()).get(2);
                                    str3.getClass();
                                    return (!nb2.i.c(str3) && (mo3.z0('\\', 0, 6, str3) != -1 || (!nb2.j.a(str3) && (nb2.k.c(str3) || nb2.l.a(str3) || str3.length() <= 3)))) ? ud2.p(str2, nb2.c(arrayList3, fq2.n("$", str3, "$"), str3, false)) : za2Var.c();
                                default:
                                    za2Var.getClass();
                                    Object obj2 = arrayList3.get(Integer.parseInt((String) ((ya2) za2Var.a()).get(1)));
                                    obj2.getClass();
                                    return (CharSequence) obj2;
                            }
                        }
                    });
                    final int i8 = 3;
                    final int i9 = 5;
                    objP = new mb2(nb2.b.d(nb2.h.d(nb2.g.d(nb2.f.d(strD, new le1() { // from class: kb2
                        @Override // defpackage.le1
                        public final Object invoke(Object obj) {
                            int i10 = i8;
                            ArrayList arrayList3 = arrayList;
                            za2 za2Var = (za2) obj;
                            switch (i10) {
                                case 0:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 1:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 2:
                                    za2Var.getClass();
                                    return !mo3.C0((CharSequence) ((ya2) za2Var.a()).get(1)) ? nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true) : za2Var.c();
                                case 3:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true);
                                case 4:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), false);
                                case 5:
                                    za2Var.getClass();
                                    String str2 = (String) ((ya2) za2Var.a()).get(1);
                                    String str3 = (String) ((ya2) za2Var.a()).get(2);
                                    str3.getClass();
                                    return (!nb2.i.c(str3) && (mo3.z0('\\', 0, 6, str3) != -1 || (!nb2.j.a(str3) && (nb2.k.c(str3) || nb2.l.a(str3) || str3.length() <= 3)))) ? ud2.p(str2, nb2.c(arrayList3, fq2.n("$", str3, "$"), str3, false)) : za2Var.c();
                                default:
                                    za2Var.getClass();
                                    Object obj2 = arrayList3.get(Integer.parseInt((String) ((ya2) za2Var.a()).get(1)));
                                    obj2.getClass();
                                    return (CharSequence) obj2;
                            }
                        }
                    }), new le1() { // from class: kb2
                        @Override // defpackage.le1
                        public final Object invoke(Object obj) {
                            int i10 = i4;
                            ArrayList arrayList3 = arrayList;
                            za2 za2Var = (za2) obj;
                            switch (i10) {
                                case 0:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 1:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 2:
                                    za2Var.getClass();
                                    return !mo3.C0((CharSequence) ((ya2) za2Var.a()).get(1)) ? nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true) : za2Var.c();
                                case 3:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true);
                                case 4:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), false);
                                case 5:
                                    za2Var.getClass();
                                    String str2 = (String) ((ya2) za2Var.a()).get(1);
                                    String str3 = (String) ((ya2) za2Var.a()).get(2);
                                    str3.getClass();
                                    return (!nb2.i.c(str3) && (mo3.z0('\\', 0, 6, str3) != -1 || (!nb2.j.a(str3) && (nb2.k.c(str3) || nb2.l.a(str3) || str3.length() <= 3)))) ? ud2.p(str2, nb2.c(arrayList3, fq2.n("$", str3, "$"), str3, false)) : za2Var.c();
                                default:
                                    za2Var.getClass();
                                    Object obj2 = arrayList3.get(Integer.parseInt((String) ((ya2) za2Var.a()).get(1)));
                                    obj2.getClass();
                                    return (CharSequence) obj2;
                            }
                        }
                    }), new le1() { // from class: kb2
                        @Override // defpackage.le1
                        public final Object invoke(Object obj) {
                            int i10 = i9;
                            ArrayList arrayList3 = arrayList;
                            za2 za2Var = (za2) obj;
                            switch (i10) {
                                case 0:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 1:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 2:
                                    za2Var.getClass();
                                    return !mo3.C0((CharSequence) ((ya2) za2Var.a()).get(1)) ? nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true) : za2Var.c();
                                case 3:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true);
                                case 4:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), false);
                                case 5:
                                    za2Var.getClass();
                                    String str2 = (String) ((ya2) za2Var.a()).get(1);
                                    String str3 = (String) ((ya2) za2Var.a()).get(2);
                                    str3.getClass();
                                    return (!nb2.i.c(str3) && (mo3.z0('\\', 0, 6, str3) != -1 || (!nb2.j.a(str3) && (nb2.k.c(str3) || nb2.l.a(str3) || str3.length() <= 3)))) ? ud2.p(str2, nb2.c(arrayList3, fq2.n("$", str3, "$"), str3, false)) : za2Var.c();
                                default:
                                    za2Var.getClass();
                                    Object obj2 = arrayList3.get(Integer.parseInt((String) ((ya2) za2Var.a()).get(1)));
                                    obj2.getClass();
                                    return (CharSequence) obj2;
                            }
                        }
                    }), new le1() { // from class: kb2
                        @Override // defpackage.le1
                        public final Object invoke(Object obj) {
                            int i10 = i7;
                            ArrayList arrayList3 = arrayList2;
                            za2 za2Var = (za2) obj;
                            switch (i10) {
                                case 0:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 1:
                                    za2Var.getClass();
                                    arrayList3.add(za2Var.c());
                                    return ud2.q("\ue002", "\ue003", arrayList3.size() - 1);
                                case 2:
                                    za2Var.getClass();
                                    return !mo3.C0((CharSequence) ((ya2) za2Var.a()).get(1)) ? nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true) : za2Var.c();
                                case 3:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), true);
                                case 4:
                                    za2Var.getClass();
                                    return nb2.c(arrayList3, za2Var.c(), (String) ((ya2) za2Var.a()).get(1), false);
                                case 5:
                                    za2Var.getClass();
                                    String str2 = (String) ((ya2) za2Var.a()).get(1);
                                    String str3 = (String) ((ya2) za2Var.a()).get(2);
                                    str3.getClass();
                                    return (!nb2.i.c(str3) && (mo3.z0('\\', 0, 6, str3) != -1 || (!nb2.j.a(str3) && (nb2.k.c(str3) || nb2.l.a(str3) || str3.length() <= 3)))) ? ud2.p(str2, nb2.c(arrayList3, fq2.n("$", str3, "$"), str3, false)) : za2Var.c();
                                default:
                                    za2Var.getClass();
                                    Object obj2 = arrayList3.get(Integer.parseInt((String) ((ya2) za2Var.a()).get(1)));
                                    obj2.getClass();
                                    return (CharSequence) obj2;
                            }
                        }
                    }), arrayList);
                }
                kk0Var.l0(objP);
            }
            final mb2 mb2Var = (mb2) objP;
            gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(mb2Var.b, kk0Var, 0);
            Object objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = new int[1];
                kk0Var.l0(objP2);
            }
            final int[] iArr = (int[]) objP2;
            Object objP3 = kk0Var.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                objP3 = new dn(gn3VarRememberUpdatedState, 10, iArr);
                kk0Var.l0(objP3);
            }
            final ne1 ne1Var = (ne1) objP3;
            final float fFloatValue = ((Number) kk0Var.l(qz3.b)).floatValue();
            final uz3 uz3Var = ab2Var.getTypography(kk0Var, 0).j;
            cx.BoxWithConstraints(null, null, false, zg0.rememberComposableLambda(1368219538, true, new oe1() { // from class: ca2
                @Override // defpackage.oe1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return ja2.MarkdownSegment$lambda$20(iArr, mb2Var, uz3Var, j, fFloatValue, ne1Var, (dx) obj, (ck0) obj2, iIntValue);
                }
            }, kk0Var, 54), kk0Var, 3072, 7);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new s40(i, 2, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 MarkdownSegment$lambda$20(int[] iArr, mb2 mb2Var, uz3 uz3Var, long j, float f, ne1 ne1Var, dx dxVar, ck0 ck0Var, int i) {
        int i2;
        dxVar.getClass();
        if ((i & 6) == 0) {
            i2 = i | (((kk0) ck0Var).h(dxVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            iArr[0] = um0.h(((androidx.compose.foundation.layout.c) dxVar).b);
            String str = mb2Var.a;
            Modifier$Companion modifier$Companion = c.i;
            long jL = gm4.L(16.0f * f, 4294967296L);
            long jL2 = uz3Var.b.c;
            if ((1095216660480L & jL2) == 4294967296L) {
                jL2 = gm4.L(yz3.c(jL2) * f, 4294967296L);
            }
            uz3 uz3VarA = uz3.a(uz3Var, j, jL, null, null, 0L, 0, jL2, null, null, 16646140);
            long brandGreen = gx.getBrandGreen(kk0Var, 0);
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new s80(12);
                kk0Var.l0(objP);
            }
            oa2.m1778xe570e950(str, modifier$Companion, 0L, false, 0, false, null, null, null, uz3VarA, null, null, false, null, 0, false, brandGreen, 0L, 0L, false, 0, false, ne1Var, null, (le1) objP, null, kk0Var, 100663344, 0, 24960, 46071036);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static void c(ym1 ym1Var, String str, boolean z, je1 je1Var, boolean z2, boolean z3, String str2, ck0 ck0Var, int i, int i2) {
        CodeAction(ym1Var, str, z, je1Var, z2, z3, str2, ck0Var, sf3.V(i | 1), i2);
    }

    public static void d(String str, ck0 ck0Var, int i) {
        MarkdownSegment(str, ck0Var, sf3.V(i | 1));
    }
}
