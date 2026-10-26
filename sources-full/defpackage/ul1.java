package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.layout.ContentScale$Companion;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class ul1 {
    public static final c a = d.j(c.i, 24.0f);

    /* JADX WARN: Code duplicated, block: B:73:0x00f9  */
    public static final void Icon(ms2 ms2Var, xe0 xe0Var, String str, c cVar, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        c cVarB;
        c cVarB2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1755070997);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(ms2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.j(xe0Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.h(str) ? 256 : Uuid.SIZE_BITS;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= kk0Var.h(cVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && kk0Var.F()) {
            kk0Var.V();
            cVar2 = cVar;
        } else {
            cVar2 = i4 != 0 ? c.i : cVar;
            kk0Var.a0(-2144829472);
            if (str != null) {
                Modifier$Companion modifier$Companion = c.i;
                boolean z = (i3 & 896) == 256;
                Object objP = kk0Var.P();
                if (z || objP == Composer$Companion.getEmpty()) {
                    objP = new v7(str, 4);
                    kk0Var.l0(objP);
                }
                cVarB = we3.b(modifier$Companion, false, (le1) objP);
            } else {
                cVarB = c.i;
            }
            kk0Var.r(false);
            c cVarC = a.c(cVar2);
            if (bi3.a(ms2Var.h(), 9205357640488583168L)) {
                cVarB2 = a;
            } else {
                long jH = ms2Var.h();
                if (Float.isInfinite(bi3.d(jH)) && Float.isInfinite(bi3.b(jH))) {
                    cVarB2 = a;
                } else {
                    long jH2 = ms2Var.h();
                    cVarB2 = androidx.compose.ui.layout.a.b(c.i, new tl1(bi3.d(jH2), bi3.b(jH2)));
                }
            }
            c cVarThen = cVarC.then(cVarB2);
            boolean zJ = kk0Var.j(ms2Var) | kk0Var.j(xe0Var);
            Object objP2 = kk0Var.P();
            if (zJ || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new rc(ms2Var, 20, xe0Var);
                kk0Var.l0(objP2);
            }
            vw.Box(androidx.compose.ui.draw.a.a(cVarThen, (le1) objP2).then(cVarB), kk0Var, 0);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new uc(ms2Var, xe0Var, str, cVar2, i, i2, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1827xf2a7a69(bm1 bm1Var, String str, c cVar, long j, ck0 ck0Var, int i, int i2) {
        int i3;
        String str2;
        c cVar2;
        long j2;
        c cVar3;
        c cVar4;
        long j3;
        boolean zH;
        Object objP;
        c cVar5;
        long j4;
        w33 w33VarV;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1092052280);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(bm1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= kk0Var.h(str2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    int i5 = kk0Var.g(j2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) == 1170 || !kk0Var.F()) {
                kk0Var.X();
                if ((i & 1) != 0 || kk0Var.D()) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        cVar4 = cVar3;
                        j3 = ((re0) kk0Var.l(gn0.a)).a;
                    } else {
                        cVar4 = cVar3;
                    }
                    kk0Var.s();
                    zH = kk0Var.h(bm1Var);
                    objP = kk0Var.P();
                    if (zH || objP == Composer$Companion.getEmpty()) {
                        objP = new hv(bm1Var);
                        kk0Var.l0(objP);
                    }
                    m1828xf2a7a69((hv) objP, str2, cVar4, j3, kk0Var, i3 & 8176, 0);
                    cVar5 = cVar4;
                    j4 = j3;
                } else {
                    kk0Var.V();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    cVar4 = cVar2;
                }
                j3 = j2;
                kk0Var.s();
                zH = kk0Var.h(bm1Var);
                objP = kk0Var.P();
                if (zH) {
                    objP = new hv(bm1Var);
                    kk0Var.l0(objP);
                } else {
                    objP = new hv(bm1Var);
                    kk0Var.l0(objP);
                }
                m1828xf2a7a69((hv) objP, str2, cVar4, j3, kk0Var, i3 & 8176, 0);
                cVar5 = cVar4;
                j4 = j3;
            } else {
                kk0Var.V();
                j4 = j2;
                cVar5 = cVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new sl1(bm1Var, str, cVar5, j4, i, i2, 1));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j2 = j;
                if (kk0Var.g(j2)) {
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) == 1170) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    cVar4 = cVar3;
                    j3 = ((re0) kk0Var.l(gn0.a)).a;
                } else {
                    cVar4 = cVar3;
                    j3 = j2;
                }
            } else {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    cVar4 = cVar3;
                    j3 = ((re0) kk0Var.l(gn0.a)).a;
                } else {
                    cVar4 = cVar3;
                    j3 = j2;
                }
            }
            kk0Var.s();
            zH = kk0Var.h(bm1Var);
            objP = kk0Var.P();
            if (zH) {
                objP = new hv(bm1Var);
                kk0Var.l0(objP);
            } else {
                objP = new hv(bm1Var);
                kk0Var.l0(objP);
            }
            m1828xf2a7a69((hv) objP, str2, cVar4, j3, kk0Var, i3 & 8176, 0);
            cVar5 = cVar4;
            j4 = j3;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    cVar4 = cVar3;
                    j3 = ((re0) kk0Var.l(gn0.a)).a;
                } else {
                    cVar4 = cVar3;
                    j3 = j2;
                }
            } else {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    cVar4 = cVar3;
                    j3 = ((re0) kk0Var.l(gn0.a)).a;
                } else {
                    cVar4 = cVar3;
                    j3 = j2;
                }
            }
            kk0Var.s();
            zH = kk0Var.h(bm1Var);
            objP = kk0Var.P();
            if (zH) {
                objP = new hv(bm1Var);
                kk0Var.l0(objP);
            } else {
                objP = new hv(bm1Var);
                kk0Var.l0(objP);
            }
            m1828xf2a7a69((hv) objP, str2, cVar4, j3, kk0Var, i3 & 8176, 0);
            cVar5 = cVar4;
            j4 = j3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new sl1(bm1Var, str, cVar5, j4, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0149  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:109:0x017a  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1828xf2a7a69(ms2 ms2Var, String str, c cVar, long j, ck0 ck0Var, int i, int i2) {
        ms2 ms2Var2;
        int i3;
        c cVar2;
        long j2;
        c cVar3;
        long j3;
        boolean z;
        Object objP;
        jv jvVar;
        c cVarB;
        c cVar4;
        long j4;
        long jH;
        boolean z2;
        Object objP2;
        w33 w33VarV;
        int i4;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-2142239481);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            ms2Var2 = ms2Var;
        } else {
            ms2Var2 = ms2Var;
            if ((i & 6) == 0) {
                i3 = (kk0Var.j(ms2Var2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !kk0Var.g(j2)) {
                    i4 = 1024;
                } else {
                    i4 = 2048;
                }
                i3 |= i4;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) == 1170 || !kk0Var.F()) {
                kk0Var.X();
                if ((i & 1) != 0 || kk0Var.D()) {
                    if (i5 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((re0) kk0Var.l(gn0.a)).a;
                        i3 &= -7169;
                    }
                } else {
                    kk0Var.V();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    cVar3 = cVar2;
                }
                j3 = j2;
                kk0Var.s();
                z = (((i3 & 7168) ^ 3072) <= 2048 && kk0Var.g(j3)) || (i3 & 3072) == 2048;
                objP = kk0Var.P();
                if (z || objP == Composer$Companion.getEmpty()) {
                    if (re0.c(j3, re0.i)) {
                        jvVar = null;
                    } else {
                        jvVar = new jv(j3, 5);
                    }
                    objP = jvVar;
                    kk0Var.l0(objP);
                }
                te0 te0Var = (te0) objP;
                kk0Var.a0(-2144891392);
                if (str != null) {
                    Modifier$Companion modifier$Companion = c.i;
                    z2 = (i3 & 112) == 32;
                    objP2 = kk0Var.P();
                    if (z2 || objP2 == Composer$Companion.getEmpty()) {
                        objP2 = new v7(str, 3);
                        kk0Var.l0(objP2);
                    }
                    cVarB = we3.b(modifier$Companion, false, (le1) objP2);
                } else {
                    cVarB = c.i;
                }
                kk0Var.r(false);
                c cVarC = a.c(cVar3);
                if (bi3.a(ms2Var2.h(), 9205357640488583168L)) {
                    cVar4 = a;
                } else {
                    jH = ms2Var.h();
                    if (Float.isInfinite(bi3.d(jH)) || !Float.isInfinite(bi3.b(jH))) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = a;
                    }
                }
                vw.Box(androidx.compose.ui.draw.a.d(cVarC.then(cVar4), ms2Var, null, ContentScale$Companion.getFit(), 0.0f, te0Var, 22).then(cVarB), kk0Var, 0);
                j4 = j3;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                j4 = j2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new sl1(ms2Var, str, cVar3, j4, i, i2, 2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i4 = 1024;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) == 1170) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((re0) kk0Var.l(gn0.a)).a;
                    i3 &= -7169;
                }
            } else {
                if (i5 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((re0) kk0Var.l(gn0.a)).a;
                    i3 &= -7169;
                }
            }
            j3 = j2;
            kk0Var.s();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objP = kk0Var.P();
            if (z) {
                if (re0.c(j3, re0.i)) {
                    jvVar = null;
                } else {
                    jvVar = new jv(j3, 5);
                }
                objP = jvVar;
                kk0Var.l0(objP);
            } else {
                if (re0.c(j3, re0.i)) {
                    jvVar = null;
                } else {
                    jvVar = new jv(j3, 5);
                }
                objP = jvVar;
                kk0Var.l0(objP);
            }
            te0 te0Var2 = (te0) objP;
            kk0Var.a0(-2144891392);
            if (str != null) {
                Modifier$Companion modifier$Companion2 = c.i;
                if ((i3 & 112) == 32) {
                }
                objP2 = kk0Var.P();
                if (z2) {
                    objP2 = new v7(str, 3);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new v7(str, 3);
                    kk0Var.l0(objP2);
                }
                cVarB = we3.b(modifier$Companion2, false, (le1) objP2);
            } else {
                cVarB = c.i;
            }
            kk0Var.r(false);
            c cVarC2 = a.c(cVar3);
            if (bi3.a(ms2Var2.h(), 9205357640488583168L)) {
                jH = ms2Var.h();
                if (Float.isInfinite(bi3.d(jH))) {
                }
                cVar4 = c.i;
            } else {
                cVar4 = a;
            }
            vw.Box(androidx.compose.ui.draw.a.d(cVarC2.then(cVar4), ms2Var, null, ContentScale$Companion.getFit(), 0.0f, te0Var2, 22).then(cVarB), kk0Var, 0);
            j4 = j3;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((re0) kk0Var.l(gn0.a)).a;
                    i3 &= -7169;
                }
            } else {
                if (i5 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((re0) kk0Var.l(gn0.a)).a;
                    i3 &= -7169;
                }
            }
            j3 = j2;
            kk0Var.s();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objP = kk0Var.P();
            if (z) {
                if (re0.c(j3, re0.i)) {
                    jvVar = null;
                } else {
                    jvVar = new jv(j3, 5);
                }
                objP = jvVar;
                kk0Var.l0(objP);
            } else {
                if (re0.c(j3, re0.i)) {
                    jvVar = null;
                } else {
                    jvVar = new jv(j3, 5);
                }
                objP = jvVar;
                kk0Var.l0(objP);
            }
            te0 te0Var3 = (te0) objP;
            kk0Var.a0(-2144891392);
            if (str != null) {
                Modifier$Companion modifier$Companion3 = c.i;
                if ((i3 & 112) == 32) {
                }
                objP2 = kk0Var.P();
                if (z2) {
                    objP2 = new v7(str, 3);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new v7(str, 3);
                    kk0Var.l0(objP2);
                }
                cVarB = we3.b(modifier$Companion3, false, (le1) objP2);
            } else {
                cVarB = c.i;
            }
            kk0Var.r(false);
            c cVarC3 = a.c(cVar3);
            if (bi3.a(ms2Var2.h(), 9205357640488583168L)) {
                jH = ms2Var.h();
                if (Float.isInfinite(bi3.d(jH))) {
                }
                cVar4 = c.i;
            } else {
                cVar4 = a;
            }
            vw.Box(androidx.compose.ui.draw.a.d(cVarC3.then(cVar4), ms2Var, null, ContentScale$Companion.getFit(), 0.0f, te0Var3, 22).then(cVarB), kk0Var, 0);
            j4 = j3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new sl1(ms2Var, str, cVar3, j4, i, i2, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1829xf2a7a69(ym1 ym1Var, String str, c cVar, long j, ck0 ck0Var, int i, int i2) {
        int i3;
        String str2;
        c cVar2;
        long j2;
        c cVar3;
        c cVar4;
        long j3;
        c cVar5;
        long j4;
        w33 w33VarV;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-126890956);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(ym1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= kk0Var.h(str2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    int i5 = kk0Var.g(j2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) == 1170 || !kk0Var.F()) {
                kk0Var.X();
                if ((i & 1) != 0 || kk0Var.D()) {
                    if (i4 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        cVar4 = cVar3;
                        j3 = ((re0) kk0Var.l(gn0.a)).a;
                    } else {
                        cVar4 = cVar3;
                    }
                    kk0Var.s();
                    m1828xf2a7a69(ub4.rememberVectorPainter(ym1Var, kk0Var, i3 & 14), str2, cVar4, j3, kk0Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                    cVar5 = cVar4;
                    j4 = j3;
                } else {
                    kk0Var.V();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    cVar4 = cVar2;
                }
                j3 = j2;
                kk0Var.s();
                m1828xf2a7a69(ub4.rememberVectorPainter(ym1Var, kk0Var, i3 & 14), str2, cVar4, j3, kk0Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                cVar5 = cVar4;
                j4 = j3;
            } else {
                kk0Var.V();
                j4 = j2;
                cVar5 = cVar2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new sl1(ym1Var, str, cVar5, j4, i, i2, 0));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j2 = j;
                if (kk0Var.g(j2)) {
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) == 1170) {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    cVar4 = cVar3;
                    j3 = ((re0) kk0Var.l(gn0.a)).a;
                } else {
                    cVar4 = cVar3;
                    j3 = j2;
                }
            } else {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    cVar4 = cVar3;
                    j3 = ((re0) kk0Var.l(gn0.a)).a;
                } else {
                    cVar4 = cVar3;
                    j3 = j2;
                }
            }
            kk0Var.s();
            m1828xf2a7a69(ub4.rememberVectorPainter(ym1Var, kk0Var, i3 & 14), str2, cVar4, j3, kk0Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
            cVar5 = cVar4;
            j4 = j3;
        } else {
            kk0Var.X();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    cVar4 = cVar3;
                    j3 = ((re0) kk0Var.l(gn0.a)).a;
                } else {
                    cVar4 = cVar3;
                    j3 = j2;
                }
            } else {
                if (i4 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    cVar4 = cVar3;
                    j3 = ((re0) kk0Var.l(gn0.a)).a;
                } else {
                    cVar4 = cVar3;
                    j3 = j2;
                }
            }
            kk0Var.s();
            m1828xf2a7a69(ub4.rememberVectorPainter(ym1Var, kk0Var, i3 & 14), str2, cVar4, j3, kk0Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
            cVar5 = cVar4;
            j4 = j3;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new sl1(ym1Var, str, cVar5, j4, i, i2, 0));
        }
    }
}
