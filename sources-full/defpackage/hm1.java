package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.layout.ContentScale$Companion;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class hm1 {
    @cv0
    public static final /* synthetic */ void Image(bm1 bm1Var, String str, c cVar, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            cVar = c.i;
        }
        c cVar2 = cVar;
        if ((i2 & 8) != 0) {
            a8Var = Alignment$Companion.getCenter();
        }
        m209x6798a8b1(bm1Var, str, cVar2, a8Var, (i2 & 16) != 0 ? ContentScale$Companion.getFit() : sn0Var, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : te0Var, 1, ck0Var, i & 4194302, 0);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010c  */
    /* JADX WARN: Code duplicated, block: B:102:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x011c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0123  */
    /* JADX WARN: Code duplicated, block: B:108:0x0129  */
    /* JADX WARN: Code duplicated, block: B:110:0x013d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172  */
    /* JADX WARN: Code duplicated, block: B:115:0x0179  */
    /* JADX WARN: Code duplicated, block: B:116:0x017d  */
    /* JADX WARN: Code duplicated, block: B:119:0x019d  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:97:0x0106  */
    /* JADX WARN: Code duplicated, block: B:98:0x0108  */
    public static final void Image(ms2 ms2Var, String str, c cVar, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, ck0 ck0Var, int i, int i2) {
        ms2 ms2Var2;
        int i3;
        c cVar2;
        int i4;
        a8 a8Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        c cVar3;
        a8 a8Var3;
        sn0 sn0Var2;
        te0 te0Var2;
        float f3;
        w33 w33VarV;
        c cVar4;
        a8 center;
        int i13;
        sn0 fit;
        te0 te0Var3;
        int i14;
        c cVarB;
        ua uaVar;
        int currentCompositeKeyHash;
        c cVarD;
        su2 su2VarN;
        d4 constructor;
        pe setCompositeKeyHash;
        boolean z2;
        Object objP;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1142754848);
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
        int i15 = i2 & 4;
        if (i15 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    a8Var2 = a8Var;
                    if (kk0Var.h(a8Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        if (kk0Var.h(sn0Var)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            f2 = f;
                            if (kk0Var.e(f2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            if ((1572864 & i) == 0) {
                                if (kk0Var.h(te0Var)) {
                                    i11 = 1048576;
                                } else {
                                    i11 = 524288;
                                }
                                i3 |= i11;
                            }
                            i12 = i3;
                            if ((i3 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (kk0Var.S(i12 & 1, z)) {
                                if (i15 != 0) {
                                    cVar4 = c.i;
                                } else {
                                    cVar4 = cVar2;
                                }
                                if (i4 != 0) {
                                    center = Alignment$Companion.getCenter();
                                } else {
                                    center = a8Var2;
                                }
                                if (i6 != 0) {
                                    fit = ContentScale$Companion.getFit();
                                    i13 = i8;
                                } else {
                                    i13 = i8;
                                    fit = sn0Var;
                                }
                                if (i13 != 0) {
                                    f2 = 1.0f;
                                }
                                if (i10 != 0) {
                                    te0Var3 = null;
                                } else {
                                    te0Var3 = te0Var;
                                }
                                if (str != null) {
                                    kk0Var.a0(1040425059);
                                    Modifier$Companion modifier$Companion = c.i;
                                    if ((i12 & 112) == 32) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    objP = kk0Var.P();
                                    if (z2 || objP == Composer$Companion.getEmpty()) {
                                        objP = new v7(str, 5);
                                        kk0Var.l0(objP);
                                    }
                                    i14 = 0;
                                    cVarB = we3.b(modifier$Companion, false, (le1) objP);
                                    kk0Var.r(false);
                                } else {
                                    i14 = 0;
                                    kk0Var.a0(1040583841);
                                    kk0Var.r(false);
                                    cVarB = c.i;
                                }
                                c cVarD2 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                                uaVar = ua.h;
                                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                                cVarD = b.d(kk0Var, cVarD2);
                                su2VarN = kk0Var.n();
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
                                xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                                xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                                setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                                if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                                }
                                kk0Var.r(true);
                                cVar3 = cVar4;
                                a8Var3 = center;
                                sn0Var2 = fit;
                                te0Var2 = te0Var3;
                            } else {
                                kk0Var.V();
                                cVar3 = cVar2;
                                a8Var3 = a8Var2;
                                sn0Var2 = sn0Var;
                                te0Var2 = te0Var;
                            }
                            f3 = f2;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                            }
                        }
                        i3 |= 1572864;
                        i12 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i12 & 1, z)) {
                            if (i15 != 0) {
                                cVar4 = c.i;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i4 != 0) {
                                center = Alignment$Companion.getCenter();
                            } else {
                                center = a8Var2;
                            }
                            if (i6 != 0) {
                                fit = ContentScale$Companion.getFit();
                                i13 = i8;
                            } else {
                                i13 = i8;
                                fit = sn0Var;
                            }
                            if (i13 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                te0Var3 = null;
                            } else {
                                te0Var3 = te0Var;
                            }
                            if (str != null) {
                                kk0Var.a0(1040425059);
                                Modifier$Companion modifier$Companion2 = c.i;
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objP = kk0Var.P();
                                if (z2) {
                                    objP = new v7(str, 5);
                                    kk0Var.l0(objP);
                                } else {
                                    objP = new v7(str, 5);
                                    kk0Var.l0(objP);
                                }
                                i14 = 0;
                                cVarB = we3.b(modifier$Companion2, false, (le1) objP);
                                kk0Var.r(false);
                            } else {
                                i14 = 0;
                                kk0Var.a0(1040583841);
                                kk0Var.r(false);
                                cVarB = c.i;
                            }
                            c cVarD3 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                            uaVar = ua.h;
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                            cVarD = b.d(kk0Var, cVarD3);
                            su2VarN = kk0Var.n();
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
                            xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                            if (kk0Var.O) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                            } else {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                            }
                            kk0Var.r(true);
                            cVar3 = cVar4;
                            a8Var3 = center;
                            sn0Var2 = fit;
                            te0Var2 = te0Var3;
                        } else {
                            kk0Var.V();
                            cVar3 = cVar2;
                            a8Var3 = a8Var2;
                            sn0Var2 = sn0Var;
                            te0Var2 = te0Var;
                        }
                        f3 = f2;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                        }
                    }
                    i3 |= 196608;
                    f2 = f;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            if (kk0Var.h(te0Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i12 & 1, z)) {
                            if (i15 != 0) {
                                cVar4 = c.i;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i4 != 0) {
                                center = Alignment$Companion.getCenter();
                            } else {
                                center = a8Var2;
                            }
                            if (i6 != 0) {
                                fit = ContentScale$Companion.getFit();
                                i13 = i8;
                            } else {
                                i13 = i8;
                                fit = sn0Var;
                            }
                            if (i13 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                te0Var3 = null;
                            } else {
                                te0Var3 = te0Var;
                            }
                            if (str != null) {
                                kk0Var.a0(1040425059);
                                Modifier$Companion modifier$Companion3 = c.i;
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objP = kk0Var.P();
                                if (z2) {
                                    objP = new v7(str, 5);
                                    kk0Var.l0(objP);
                                } else {
                                    objP = new v7(str, 5);
                                    kk0Var.l0(objP);
                                }
                                i14 = 0;
                                cVarB = we3.b(modifier$Companion3, false, (le1) objP);
                                kk0Var.r(false);
                            } else {
                                i14 = 0;
                                kk0Var.a0(1040583841);
                                kk0Var.r(false);
                                cVarB = c.i;
                            }
                            c cVarD4 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                            uaVar = ua.h;
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                            cVarD = b.d(kk0Var, cVarD4);
                            su2VarN = kk0Var.n();
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
                            xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                            if (kk0Var.O) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                            } else {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                            }
                            kk0Var.r(true);
                            cVar3 = cVar4;
                            a8Var3 = center;
                            sn0Var2 = fit;
                            te0Var2 = te0Var3;
                        } else {
                            kk0Var.V();
                            cVar3 = cVar2;
                            a8Var3 = a8Var2;
                            sn0Var2 = sn0Var;
                            te0Var2 = te0Var;
                        }
                        f3 = f2;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                        }
                    }
                    i3 |= 1572864;
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i12 & 1, z)) {
                        if (i15 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            center = Alignment$Companion.getCenter();
                        } else {
                            center = a8Var2;
                        }
                        if (i6 != 0) {
                            fit = ContentScale$Companion.getFit();
                            i13 = i8;
                        } else {
                            i13 = i8;
                            fit = sn0Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            te0Var3 = null;
                        } else {
                            te0Var3 = te0Var;
                        }
                        if (str != null) {
                            kk0Var.a0(1040425059);
                            Modifier$Companion modifier$Companion4 = c.i;
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2) {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            } else {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            }
                            i14 = 0;
                            cVarB = we3.b(modifier$Companion4, false, (le1) objP);
                            kk0Var.r(false);
                        } else {
                            i14 = 0;
                            kk0Var.a0(1040583841);
                            kk0Var.r(false);
                            cVarB = c.i;
                        }
                        c cVarD5 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                        uaVar = ua.h;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                        cVarD = b.d(kk0Var, cVarD5);
                        su2VarN = kk0Var.n();
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
                        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        }
                        kk0Var.r(true);
                        cVar3 = cVar4;
                        a8Var3 = center;
                        sn0Var2 = fit;
                        te0Var2 = te0Var3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        a8Var3 = a8Var2;
                        sn0Var2 = sn0Var;
                        te0Var2 = te0Var;
                    }
                    f3 = f2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                    }
                }
                i3 |= 24576;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (kk0Var.e(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            if (kk0Var.h(te0Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i12 & 1, z)) {
                            if (i15 != 0) {
                                cVar4 = c.i;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i4 != 0) {
                                center = Alignment$Companion.getCenter();
                            } else {
                                center = a8Var2;
                            }
                            if (i6 != 0) {
                                fit = ContentScale$Companion.getFit();
                                i13 = i8;
                            } else {
                                i13 = i8;
                                fit = sn0Var;
                            }
                            if (i13 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                te0Var3 = null;
                            } else {
                                te0Var3 = te0Var;
                            }
                            if (str != null) {
                                kk0Var.a0(1040425059);
                                Modifier$Companion modifier$Companion5 = c.i;
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objP = kk0Var.P();
                                if (z2) {
                                    objP = new v7(str, 5);
                                    kk0Var.l0(objP);
                                } else {
                                    objP = new v7(str, 5);
                                    kk0Var.l0(objP);
                                }
                                i14 = 0;
                                cVarB = we3.b(modifier$Companion5, false, (le1) objP);
                                kk0Var.r(false);
                            } else {
                                i14 = 0;
                                kk0Var.a0(1040583841);
                                kk0Var.r(false);
                                cVarB = c.i;
                            }
                            c cVarD6 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                            uaVar = ua.h;
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                            cVarD = b.d(kk0Var, cVarD6);
                            su2VarN = kk0Var.n();
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
                            xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                            if (kk0Var.O) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                            } else {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                            }
                            kk0Var.r(true);
                            cVar3 = cVar4;
                            a8Var3 = center;
                            sn0Var2 = fit;
                            te0Var2 = te0Var3;
                        } else {
                            kk0Var.V();
                            cVar3 = cVar2;
                            a8Var3 = a8Var2;
                            sn0Var2 = sn0Var;
                            te0Var2 = te0Var;
                        }
                        f3 = f2;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                        }
                    }
                    i3 |= 1572864;
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i12 & 1, z)) {
                        if (i15 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            center = Alignment$Companion.getCenter();
                        } else {
                            center = a8Var2;
                        }
                        if (i6 != 0) {
                            fit = ContentScale$Companion.getFit();
                            i13 = i8;
                        } else {
                            i13 = i8;
                            fit = sn0Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            te0Var3 = null;
                        } else {
                            te0Var3 = te0Var;
                        }
                        if (str != null) {
                            kk0Var.a0(1040425059);
                            Modifier$Companion modifier$Companion6 = c.i;
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2) {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            } else {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            }
                            i14 = 0;
                            cVarB = we3.b(modifier$Companion6, false, (le1) objP);
                            kk0Var.r(false);
                        } else {
                            i14 = 0;
                            kk0Var.a0(1040583841);
                            kk0Var.r(false);
                            cVarB = c.i;
                        }
                        c cVarD7 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                        uaVar = ua.h;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                        cVarD = b.d(kk0Var, cVarD7);
                        su2VarN = kk0Var.n();
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
                        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        }
                        kk0Var.r(true);
                        cVar3 = cVar4;
                        a8Var3 = center;
                        sn0Var2 = fit;
                        te0Var2 = te0Var3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        a8Var3 = a8Var2;
                        sn0Var2 = sn0Var;
                        te0Var2 = te0Var;
                    }
                    f3 = f2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (kk0Var.h(te0Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i12 & 1, z)) {
                        if (i15 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            center = Alignment$Companion.getCenter();
                        } else {
                            center = a8Var2;
                        }
                        if (i6 != 0) {
                            fit = ContentScale$Companion.getFit();
                            i13 = i8;
                        } else {
                            i13 = i8;
                            fit = sn0Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            te0Var3 = null;
                        } else {
                            te0Var3 = te0Var;
                        }
                        if (str != null) {
                            kk0Var.a0(1040425059);
                            Modifier$Companion modifier$Companion7 = c.i;
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2) {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            } else {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            }
                            i14 = 0;
                            cVarB = we3.b(modifier$Companion7, false, (le1) objP);
                            kk0Var.r(false);
                        } else {
                            i14 = 0;
                            kk0Var.a0(1040583841);
                            kk0Var.r(false);
                            cVarB = c.i;
                        }
                        c cVarD8 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                        uaVar = ua.h;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                        cVarD = b.d(kk0Var, cVarD8);
                        su2VarN = kk0Var.n();
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
                        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        }
                        kk0Var.r(true);
                        cVar3 = cVar4;
                        a8Var3 = center;
                        sn0Var2 = fit;
                        te0Var2 = te0Var3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        a8Var3 = a8Var2;
                        sn0Var2 = sn0Var;
                        te0Var2 = te0Var;
                    }
                    f3 = f2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i12 & 1, z)) {
                    if (i15 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        center = Alignment$Companion.getCenter();
                    } else {
                        center = a8Var2;
                    }
                    if (i6 != 0) {
                        fit = ContentScale$Companion.getFit();
                        i13 = i8;
                    } else {
                        i13 = i8;
                        fit = sn0Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        te0Var3 = null;
                    } else {
                        te0Var3 = te0Var;
                    }
                    if (str != null) {
                        kk0Var.a0(1040425059);
                        Modifier$Companion modifier$Companion8 = c.i;
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        } else {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        }
                        i14 = 0;
                        cVarB = we3.b(modifier$Companion8, false, (le1) objP);
                        kk0Var.r(false);
                    } else {
                        i14 = 0;
                        kk0Var.a0(1040583841);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarD9 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                    uaVar = ua.h;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                    cVarD = b.d(kk0Var, cVarD9);
                    su2VarN = kk0Var.n();
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
                    xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    kk0Var.r(true);
                    cVar3 = cVar4;
                    a8Var3 = center;
                    sn0Var2 = fit;
                    te0Var2 = te0Var3;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    a8Var3 = a8Var2;
                    sn0Var2 = sn0Var;
                    te0Var2 = te0Var;
                }
                f3 = f2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                }
            }
            i3 |= 3072;
            a8Var2 = a8Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    if (kk0Var.h(sn0Var)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (kk0Var.e(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            if (kk0Var.h(te0Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i12 & 1, z)) {
                            if (i15 != 0) {
                                cVar4 = c.i;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i4 != 0) {
                                center = Alignment$Companion.getCenter();
                            } else {
                                center = a8Var2;
                            }
                            if (i6 != 0) {
                                fit = ContentScale$Companion.getFit();
                                i13 = i8;
                            } else {
                                i13 = i8;
                                fit = sn0Var;
                            }
                            if (i13 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                te0Var3 = null;
                            } else {
                                te0Var3 = te0Var;
                            }
                            if (str != null) {
                                kk0Var.a0(1040425059);
                                Modifier$Companion modifier$Companion9 = c.i;
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objP = kk0Var.P();
                                if (z2) {
                                    objP = new v7(str, 5);
                                    kk0Var.l0(objP);
                                } else {
                                    objP = new v7(str, 5);
                                    kk0Var.l0(objP);
                                }
                                i14 = 0;
                                cVarB = we3.b(modifier$Companion9, false, (le1) objP);
                                kk0Var.r(false);
                            } else {
                                i14 = 0;
                                kk0Var.a0(1040583841);
                                kk0Var.r(false);
                                cVarB = c.i;
                            }
                            c cVarD10 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                            uaVar = ua.h;
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                            cVarD = b.d(kk0Var, cVarD10);
                            su2VarN = kk0Var.n();
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
                            xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                            if (kk0Var.O) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                            } else {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                            }
                            kk0Var.r(true);
                            cVar3 = cVar4;
                            a8Var3 = center;
                            sn0Var2 = fit;
                            te0Var2 = te0Var3;
                        } else {
                            kk0Var.V();
                            cVar3 = cVar2;
                            a8Var3 = a8Var2;
                            sn0Var2 = sn0Var;
                            te0Var2 = te0Var;
                        }
                        f3 = f2;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                        }
                    }
                    i3 |= 1572864;
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i12 & 1, z)) {
                        if (i15 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            center = Alignment$Companion.getCenter();
                        } else {
                            center = a8Var2;
                        }
                        if (i6 != 0) {
                            fit = ContentScale$Companion.getFit();
                            i13 = i8;
                        } else {
                            i13 = i8;
                            fit = sn0Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            te0Var3 = null;
                        } else {
                            te0Var3 = te0Var;
                        }
                        if (str != null) {
                            kk0Var.a0(1040425059);
                            Modifier$Companion modifier$Companion10 = c.i;
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2) {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            } else {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            }
                            i14 = 0;
                            cVarB = we3.b(modifier$Companion10, false, (le1) objP);
                            kk0Var.r(false);
                        } else {
                            i14 = 0;
                            kk0Var.a0(1040583841);
                            kk0Var.r(false);
                            cVarB = c.i;
                        }
                        c cVarD11 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                        uaVar = ua.h;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                        cVarD = b.d(kk0Var, cVarD11);
                        su2VarN = kk0Var.n();
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
                        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        }
                        kk0Var.r(true);
                        cVar3 = cVar4;
                        a8Var3 = center;
                        sn0Var2 = fit;
                        te0Var2 = te0Var3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        a8Var3 = a8Var2;
                        sn0Var2 = sn0Var;
                        te0Var2 = te0Var;
                    }
                    f3 = f2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (kk0Var.h(te0Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i12 & 1, z)) {
                        if (i15 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            center = Alignment$Companion.getCenter();
                        } else {
                            center = a8Var2;
                        }
                        if (i6 != 0) {
                            fit = ContentScale$Companion.getFit();
                            i13 = i8;
                        } else {
                            i13 = i8;
                            fit = sn0Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            te0Var3 = null;
                        } else {
                            te0Var3 = te0Var;
                        }
                        if (str != null) {
                            kk0Var.a0(1040425059);
                            Modifier$Companion modifier$Companion11 = c.i;
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2) {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            } else {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            }
                            i14 = 0;
                            cVarB = we3.b(modifier$Companion11, false, (le1) objP);
                            kk0Var.r(false);
                        } else {
                            i14 = 0;
                            kk0Var.a0(1040583841);
                            kk0Var.r(false);
                            cVarB = c.i;
                        }
                        c cVarD12 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                        uaVar = ua.h;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                        cVarD = b.d(kk0Var, cVarD12);
                        su2VarN = kk0Var.n();
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
                        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        }
                        kk0Var.r(true);
                        cVar3 = cVar4;
                        a8Var3 = center;
                        sn0Var2 = fit;
                        te0Var2 = te0Var3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        a8Var3 = a8Var2;
                        sn0Var2 = sn0Var;
                        te0Var2 = te0Var;
                    }
                    f3 = f2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i12 & 1, z)) {
                    if (i15 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        center = Alignment$Companion.getCenter();
                    } else {
                        center = a8Var2;
                    }
                    if (i6 != 0) {
                        fit = ContentScale$Companion.getFit();
                        i13 = i8;
                    } else {
                        i13 = i8;
                        fit = sn0Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        te0Var3 = null;
                    } else {
                        te0Var3 = te0Var;
                    }
                    if (str != null) {
                        kk0Var.a0(1040425059);
                        Modifier$Companion modifier$Companion12 = c.i;
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        } else {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        }
                        i14 = 0;
                        cVarB = we3.b(modifier$Companion12, false, (le1) objP);
                        kk0Var.r(false);
                    } else {
                        i14 = 0;
                        kk0Var.a0(1040583841);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarD13 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                    uaVar = ua.h;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                    cVarD = b.d(kk0Var, cVarD13);
                    su2VarN = kk0Var.n();
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
                    xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    kk0Var.r(true);
                    cVar3 = cVar4;
                    a8Var3 = center;
                    sn0Var2 = fit;
                    te0Var2 = te0Var3;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    a8Var3 = a8Var2;
                    sn0Var2 = sn0Var;
                    te0Var2 = te0Var;
                }
                f3 = f2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                }
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (kk0Var.e(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (kk0Var.h(te0Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i12 & 1, z)) {
                        if (i15 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            center = Alignment$Companion.getCenter();
                        } else {
                            center = a8Var2;
                        }
                        if (i6 != 0) {
                            fit = ContentScale$Companion.getFit();
                            i13 = i8;
                        } else {
                            i13 = i8;
                            fit = sn0Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            te0Var3 = null;
                        } else {
                            te0Var3 = te0Var;
                        }
                        if (str != null) {
                            kk0Var.a0(1040425059);
                            Modifier$Companion modifier$Companion13 = c.i;
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2) {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            } else {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            }
                            i14 = 0;
                            cVarB = we3.b(modifier$Companion13, false, (le1) objP);
                            kk0Var.r(false);
                        } else {
                            i14 = 0;
                            kk0Var.a0(1040583841);
                            kk0Var.r(false);
                            cVarB = c.i;
                        }
                        c cVarD14 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                        uaVar = ua.h;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                        cVarD = b.d(kk0Var, cVarD14);
                        su2VarN = kk0Var.n();
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
                        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        }
                        kk0Var.r(true);
                        cVar3 = cVar4;
                        a8Var3 = center;
                        sn0Var2 = fit;
                        te0Var2 = te0Var3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        a8Var3 = a8Var2;
                        sn0Var2 = sn0Var;
                        te0Var2 = te0Var;
                    }
                    f3 = f2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i12 & 1, z)) {
                    if (i15 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        center = Alignment$Companion.getCenter();
                    } else {
                        center = a8Var2;
                    }
                    if (i6 != 0) {
                        fit = ContentScale$Companion.getFit();
                        i13 = i8;
                    } else {
                        i13 = i8;
                        fit = sn0Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        te0Var3 = null;
                    } else {
                        te0Var3 = te0Var;
                    }
                    if (str != null) {
                        kk0Var.a0(1040425059);
                        Modifier$Companion modifier$Companion14 = c.i;
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        } else {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        }
                        i14 = 0;
                        cVarB = we3.b(modifier$Companion14, false, (le1) objP);
                        kk0Var.r(false);
                    } else {
                        i14 = 0;
                        kk0Var.a0(1040583841);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarD15 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                    uaVar = ua.h;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                    cVarD = b.d(kk0Var, cVarD15);
                    su2VarN = kk0Var.n();
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
                    xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    kk0Var.r(true);
                    cVar3 = cVar4;
                    a8Var3 = center;
                    sn0Var2 = fit;
                    te0Var2 = te0Var3;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    a8Var3 = a8Var2;
                    sn0Var2 = sn0Var;
                    te0Var2 = te0Var;
                }
                f3 = f2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (kk0Var.h(te0Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i12 & 1, z)) {
                    if (i15 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        center = Alignment$Companion.getCenter();
                    } else {
                        center = a8Var2;
                    }
                    if (i6 != 0) {
                        fit = ContentScale$Companion.getFit();
                        i13 = i8;
                    } else {
                        i13 = i8;
                        fit = sn0Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        te0Var3 = null;
                    } else {
                        te0Var3 = te0Var;
                    }
                    if (str != null) {
                        kk0Var.a0(1040425059);
                        Modifier$Companion modifier$Companion15 = c.i;
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        } else {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        }
                        i14 = 0;
                        cVarB = we3.b(modifier$Companion15, false, (le1) objP);
                        kk0Var.r(false);
                    } else {
                        i14 = 0;
                        kk0Var.a0(1040583841);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarD16 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                    uaVar = ua.h;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                    cVarD = b.d(kk0Var, cVarD16);
                    su2VarN = kk0Var.n();
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
                    xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    kk0Var.r(true);
                    cVar3 = cVar4;
                    a8Var3 = center;
                    sn0Var2 = fit;
                    te0Var2 = te0Var3;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    a8Var3 = a8Var2;
                    sn0Var2 = sn0Var;
                    te0Var2 = te0Var;
                }
                f3 = f2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                }
            }
            i3 |= 1572864;
            i12 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i12 & 1, z)) {
                if (i15 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    center = Alignment$Companion.getCenter();
                } else {
                    center = a8Var2;
                }
                if (i6 != 0) {
                    fit = ContentScale$Companion.getFit();
                    i13 = i8;
                } else {
                    i13 = i8;
                    fit = sn0Var;
                }
                if (i13 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    te0Var3 = null;
                } else {
                    te0Var3 = te0Var;
                }
                if (str != null) {
                    kk0Var.a0(1040425059);
                    Modifier$Companion modifier$Companion16 = c.i;
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new v7(str, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new v7(str, 5);
                        kk0Var.l0(objP);
                    }
                    i14 = 0;
                    cVarB = we3.b(modifier$Companion16, false, (le1) objP);
                    kk0Var.r(false);
                } else {
                    i14 = 0;
                    kk0Var.a0(1040583841);
                    kk0Var.r(false);
                    cVarB = c.i;
                }
                c cVarD17 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                uaVar = ua.h;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                cVarD = b.d(kk0Var, cVarD17);
                su2VarN = kk0Var.n();
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
                xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                }
                kk0Var.r(true);
                cVar3 = cVar4;
                a8Var3 = center;
                sn0Var2 = fit;
                te0Var2 = te0Var3;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                a8Var3 = a8Var2;
                sn0Var2 = sn0Var;
                te0Var2 = te0Var;
            }
            f3 = f2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                a8Var2 = a8Var;
                if (kk0Var.h(a8Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    if (kk0Var.h(sn0Var)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (kk0Var.e(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            if (kk0Var.h(te0Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i12 & 1, z)) {
                            if (i15 != 0) {
                                cVar4 = c.i;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i4 != 0) {
                                center = Alignment$Companion.getCenter();
                            } else {
                                center = a8Var2;
                            }
                            if (i6 != 0) {
                                fit = ContentScale$Companion.getFit();
                                i13 = i8;
                            } else {
                                i13 = i8;
                                fit = sn0Var;
                            }
                            if (i13 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                te0Var3 = null;
                            } else {
                                te0Var3 = te0Var;
                            }
                            if (str != null) {
                                kk0Var.a0(1040425059);
                                Modifier$Companion modifier$Companion17 = c.i;
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objP = kk0Var.P();
                                if (z2) {
                                    objP = new v7(str, 5);
                                    kk0Var.l0(objP);
                                } else {
                                    objP = new v7(str, 5);
                                    kk0Var.l0(objP);
                                }
                                i14 = 0;
                                cVarB = we3.b(modifier$Companion17, false, (le1) objP);
                                kk0Var.r(false);
                            } else {
                                i14 = 0;
                                kk0Var.a0(1040583841);
                                kk0Var.r(false);
                                cVarB = c.i;
                            }
                            c cVarD18 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                            uaVar = ua.h;
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                            cVarD = b.d(kk0Var, cVarD18);
                            su2VarN = kk0Var.n();
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
                            xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                            if (kk0Var.O) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                            } else {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                            }
                            kk0Var.r(true);
                            cVar3 = cVar4;
                            a8Var3 = center;
                            sn0Var2 = fit;
                            te0Var2 = te0Var3;
                        } else {
                            kk0Var.V();
                            cVar3 = cVar2;
                            a8Var3 = a8Var2;
                            sn0Var2 = sn0Var;
                            te0Var2 = te0Var;
                        }
                        f3 = f2;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                        }
                    }
                    i3 |= 1572864;
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i12 & 1, z)) {
                        if (i15 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            center = Alignment$Companion.getCenter();
                        } else {
                            center = a8Var2;
                        }
                        if (i6 != 0) {
                            fit = ContentScale$Companion.getFit();
                            i13 = i8;
                        } else {
                            i13 = i8;
                            fit = sn0Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            te0Var3 = null;
                        } else {
                            te0Var3 = te0Var;
                        }
                        if (str != null) {
                            kk0Var.a0(1040425059);
                            Modifier$Companion modifier$Companion18 = c.i;
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2) {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            } else {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            }
                            i14 = 0;
                            cVarB = we3.b(modifier$Companion18, false, (le1) objP);
                            kk0Var.r(false);
                        } else {
                            i14 = 0;
                            kk0Var.a0(1040583841);
                            kk0Var.r(false);
                            cVarB = c.i;
                        }
                        c cVarD19 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                        uaVar = ua.h;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                        cVarD = b.d(kk0Var, cVarD19);
                        su2VarN = kk0Var.n();
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
                        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        }
                        kk0Var.r(true);
                        cVar3 = cVar4;
                        a8Var3 = center;
                        sn0Var2 = fit;
                        te0Var2 = te0Var3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        a8Var3 = a8Var2;
                        sn0Var2 = sn0Var;
                        te0Var2 = te0Var;
                    }
                    f3 = f2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (kk0Var.h(te0Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i12 & 1, z)) {
                        if (i15 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            center = Alignment$Companion.getCenter();
                        } else {
                            center = a8Var2;
                        }
                        if (i6 != 0) {
                            fit = ContentScale$Companion.getFit();
                            i13 = i8;
                        } else {
                            i13 = i8;
                            fit = sn0Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            te0Var3 = null;
                        } else {
                            te0Var3 = te0Var;
                        }
                        if (str != null) {
                            kk0Var.a0(1040425059);
                            Modifier$Companion modifier$Companion19 = c.i;
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2) {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            } else {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            }
                            i14 = 0;
                            cVarB = we3.b(modifier$Companion19, false, (le1) objP);
                            kk0Var.r(false);
                        } else {
                            i14 = 0;
                            kk0Var.a0(1040583841);
                            kk0Var.r(false);
                            cVarB = c.i;
                        }
                        c cVarD110 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                        uaVar = ua.h;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                        cVarD = b.d(kk0Var, cVarD110);
                        su2VarN = kk0Var.n();
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
                        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        }
                        kk0Var.r(true);
                        cVar3 = cVar4;
                        a8Var3 = center;
                        sn0Var2 = fit;
                        te0Var2 = te0Var3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        a8Var3 = a8Var2;
                        sn0Var2 = sn0Var;
                        te0Var2 = te0Var;
                    }
                    f3 = f2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i12 & 1, z)) {
                    if (i15 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        center = Alignment$Companion.getCenter();
                    } else {
                        center = a8Var2;
                    }
                    if (i6 != 0) {
                        fit = ContentScale$Companion.getFit();
                        i13 = i8;
                    } else {
                        i13 = i8;
                        fit = sn0Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        te0Var3 = null;
                    } else {
                        te0Var3 = te0Var;
                    }
                    if (str != null) {
                        kk0Var.a0(1040425059);
                        Modifier$Companion modifier$Companion110 = c.i;
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        } else {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        }
                        i14 = 0;
                        cVarB = we3.b(modifier$Companion110, false, (le1) objP);
                        kk0Var.r(false);
                    } else {
                        i14 = 0;
                        kk0Var.a0(1040583841);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarD111 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                    uaVar = ua.h;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                    cVarD = b.d(kk0Var, cVarD111);
                    su2VarN = kk0Var.n();
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
                    xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    kk0Var.r(true);
                    cVar3 = cVar4;
                    a8Var3 = center;
                    sn0Var2 = fit;
                    te0Var2 = te0Var3;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    a8Var3 = a8Var2;
                    sn0Var2 = sn0Var;
                    te0Var2 = te0Var;
                }
                f3 = f2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                }
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (kk0Var.e(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (kk0Var.h(te0Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i12 & 1, z)) {
                        if (i15 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            center = Alignment$Companion.getCenter();
                        } else {
                            center = a8Var2;
                        }
                        if (i6 != 0) {
                            fit = ContentScale$Companion.getFit();
                            i13 = i8;
                        } else {
                            i13 = i8;
                            fit = sn0Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            te0Var3 = null;
                        } else {
                            te0Var3 = te0Var;
                        }
                        if (str != null) {
                            kk0Var.a0(1040425059);
                            Modifier$Companion modifier$Companion111 = c.i;
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2) {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            } else {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            }
                            i14 = 0;
                            cVarB = we3.b(modifier$Companion111, false, (le1) objP);
                            kk0Var.r(false);
                        } else {
                            i14 = 0;
                            kk0Var.a0(1040583841);
                            kk0Var.r(false);
                            cVarB = c.i;
                        }
                        c cVarD112 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                        uaVar = ua.h;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                        cVarD = b.d(kk0Var, cVarD112);
                        su2VarN = kk0Var.n();
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
                        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        }
                        kk0Var.r(true);
                        cVar3 = cVar4;
                        a8Var3 = center;
                        sn0Var2 = fit;
                        te0Var2 = te0Var3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        a8Var3 = a8Var2;
                        sn0Var2 = sn0Var;
                        te0Var2 = te0Var;
                    }
                    f3 = f2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i12 & 1, z)) {
                    if (i15 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        center = Alignment$Companion.getCenter();
                    } else {
                        center = a8Var2;
                    }
                    if (i6 != 0) {
                        fit = ContentScale$Companion.getFit();
                        i13 = i8;
                    } else {
                        i13 = i8;
                        fit = sn0Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        te0Var3 = null;
                    } else {
                        te0Var3 = te0Var;
                    }
                    if (str != null) {
                        kk0Var.a0(1040425059);
                        Modifier$Companion modifier$Companion112 = c.i;
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        } else {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        }
                        i14 = 0;
                        cVarB = we3.b(modifier$Companion112, false, (le1) objP);
                        kk0Var.r(false);
                    } else {
                        i14 = 0;
                        kk0Var.a0(1040583841);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarD113 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                    uaVar = ua.h;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                    cVarD = b.d(kk0Var, cVarD113);
                    su2VarN = kk0Var.n();
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
                    xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    kk0Var.r(true);
                    cVar3 = cVar4;
                    a8Var3 = center;
                    sn0Var2 = fit;
                    te0Var2 = te0Var3;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    a8Var3 = a8Var2;
                    sn0Var2 = sn0Var;
                    te0Var2 = te0Var;
                }
                f3 = f2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (kk0Var.h(te0Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i12 & 1, z)) {
                    if (i15 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        center = Alignment$Companion.getCenter();
                    } else {
                        center = a8Var2;
                    }
                    if (i6 != 0) {
                        fit = ContentScale$Companion.getFit();
                        i13 = i8;
                    } else {
                        i13 = i8;
                        fit = sn0Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        te0Var3 = null;
                    } else {
                        te0Var3 = te0Var;
                    }
                    if (str != null) {
                        kk0Var.a0(1040425059);
                        Modifier$Companion modifier$Companion113 = c.i;
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        } else {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        }
                        i14 = 0;
                        cVarB = we3.b(modifier$Companion113, false, (le1) objP);
                        kk0Var.r(false);
                    } else {
                        i14 = 0;
                        kk0Var.a0(1040583841);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarD114 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                    uaVar = ua.h;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                    cVarD = b.d(kk0Var, cVarD114);
                    su2VarN = kk0Var.n();
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
                    xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    kk0Var.r(true);
                    cVar3 = cVar4;
                    a8Var3 = center;
                    sn0Var2 = fit;
                    te0Var2 = te0Var3;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    a8Var3 = a8Var2;
                    sn0Var2 = sn0Var;
                    te0Var2 = te0Var;
                }
                f3 = f2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                }
            }
            i3 |= 1572864;
            i12 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i12 & 1, z)) {
                if (i15 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    center = Alignment$Companion.getCenter();
                } else {
                    center = a8Var2;
                }
                if (i6 != 0) {
                    fit = ContentScale$Companion.getFit();
                    i13 = i8;
                } else {
                    i13 = i8;
                    fit = sn0Var;
                }
                if (i13 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    te0Var3 = null;
                } else {
                    te0Var3 = te0Var;
                }
                if (str != null) {
                    kk0Var.a0(1040425059);
                    Modifier$Companion modifier$Companion114 = c.i;
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new v7(str, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new v7(str, 5);
                        kk0Var.l0(objP);
                    }
                    i14 = 0;
                    cVarB = we3.b(modifier$Companion114, false, (le1) objP);
                    kk0Var.r(false);
                } else {
                    i14 = 0;
                    kk0Var.a0(1040583841);
                    kk0Var.r(false);
                    cVarB = c.i;
                }
                c cVarD115 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                uaVar = ua.h;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                cVarD = b.d(kk0Var, cVarD115);
                su2VarN = kk0Var.n();
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
                xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                }
                kk0Var.r(true);
                cVar3 = cVar4;
                a8Var3 = center;
                sn0Var2 = fit;
                te0Var2 = te0Var3;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                a8Var3 = a8Var2;
                sn0Var2 = sn0Var;
                te0Var2 = te0Var;
            }
            f3 = f2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
            }
        }
        i3 |= 3072;
        a8Var2 = a8Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                if (kk0Var.h(sn0Var)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (kk0Var.e(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (kk0Var.h(te0Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i12 & 1, z)) {
                        if (i15 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            center = Alignment$Companion.getCenter();
                        } else {
                            center = a8Var2;
                        }
                        if (i6 != 0) {
                            fit = ContentScale$Companion.getFit();
                            i13 = i8;
                        } else {
                            i13 = i8;
                            fit = sn0Var;
                        }
                        if (i13 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            te0Var3 = null;
                        } else {
                            te0Var3 = te0Var;
                        }
                        if (str != null) {
                            kk0Var.a0(1040425059);
                            Modifier$Companion modifier$Companion115 = c.i;
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP = kk0Var.P();
                            if (z2) {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            } else {
                                objP = new v7(str, 5);
                                kk0Var.l0(objP);
                            }
                            i14 = 0;
                            cVarB = we3.b(modifier$Companion115, false, (le1) objP);
                            kk0Var.r(false);
                        } else {
                            i14 = 0;
                            kk0Var.a0(1040583841);
                            kk0Var.r(false);
                            cVarB = c.i;
                        }
                        c cVarD116 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                        uaVar = ua.h;
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                        cVarD = b.d(kk0Var, cVarD116);
                        su2VarN = kk0Var.n();
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
                        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                        }
                        kk0Var.r(true);
                        cVar3 = cVar4;
                        a8Var3 = center;
                        sn0Var2 = fit;
                        te0Var2 = te0Var3;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        a8Var3 = a8Var2;
                        sn0Var2 = sn0Var;
                        te0Var2 = te0Var;
                    }
                    f3 = f2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i12 & 1, z)) {
                    if (i15 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        center = Alignment$Companion.getCenter();
                    } else {
                        center = a8Var2;
                    }
                    if (i6 != 0) {
                        fit = ContentScale$Companion.getFit();
                        i13 = i8;
                    } else {
                        i13 = i8;
                        fit = sn0Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        te0Var3 = null;
                    } else {
                        te0Var3 = te0Var;
                    }
                    if (str != null) {
                        kk0Var.a0(1040425059);
                        Modifier$Companion modifier$Companion116 = c.i;
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        } else {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        }
                        i14 = 0;
                        cVarB = we3.b(modifier$Companion116, false, (le1) objP);
                        kk0Var.r(false);
                    } else {
                        i14 = 0;
                        kk0Var.a0(1040583841);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarD117 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                    uaVar = ua.h;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                    cVarD = b.d(kk0Var, cVarD117);
                    su2VarN = kk0Var.n();
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
                    xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    kk0Var.r(true);
                    cVar3 = cVar4;
                    a8Var3 = center;
                    sn0Var2 = fit;
                    te0Var2 = te0Var3;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    a8Var3 = a8Var2;
                    sn0Var2 = sn0Var;
                    te0Var2 = te0Var;
                }
                f3 = f2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (kk0Var.h(te0Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i12 & 1, z)) {
                    if (i15 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        center = Alignment$Companion.getCenter();
                    } else {
                        center = a8Var2;
                    }
                    if (i6 != 0) {
                        fit = ContentScale$Companion.getFit();
                        i13 = i8;
                    } else {
                        i13 = i8;
                        fit = sn0Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        te0Var3 = null;
                    } else {
                        te0Var3 = te0Var;
                    }
                    if (str != null) {
                        kk0Var.a0(1040425059);
                        Modifier$Companion modifier$Companion117 = c.i;
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        } else {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        }
                        i14 = 0;
                        cVarB = we3.b(modifier$Companion117, false, (le1) objP);
                        kk0Var.r(false);
                    } else {
                        i14 = 0;
                        kk0Var.a0(1040583841);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarD118 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                    uaVar = ua.h;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                    cVarD = b.d(kk0Var, cVarD118);
                    su2VarN = kk0Var.n();
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
                    xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    kk0Var.r(true);
                    cVar3 = cVar4;
                    a8Var3 = center;
                    sn0Var2 = fit;
                    te0Var2 = te0Var3;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    a8Var3 = a8Var2;
                    sn0Var2 = sn0Var;
                    te0Var2 = te0Var;
                }
                f3 = f2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                }
            }
            i3 |= 1572864;
            i12 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i12 & 1, z)) {
                if (i15 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    center = Alignment$Companion.getCenter();
                } else {
                    center = a8Var2;
                }
                if (i6 != 0) {
                    fit = ContentScale$Companion.getFit();
                    i13 = i8;
                } else {
                    i13 = i8;
                    fit = sn0Var;
                }
                if (i13 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    te0Var3 = null;
                } else {
                    te0Var3 = te0Var;
                }
                if (str != null) {
                    kk0Var.a0(1040425059);
                    Modifier$Companion modifier$Companion118 = c.i;
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new v7(str, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new v7(str, 5);
                        kk0Var.l0(objP);
                    }
                    i14 = 0;
                    cVarB = we3.b(modifier$Companion118, false, (le1) objP);
                    kk0Var.r(false);
                } else {
                    i14 = 0;
                    kk0Var.a0(1040583841);
                    kk0Var.r(false);
                    cVarB = c.i;
                }
                c cVarD119 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                uaVar = ua.h;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                cVarD = b.d(kk0Var, cVarD119);
                su2VarN = kk0Var.n();
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
                xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                }
                kk0Var.r(true);
                cVar3 = cVar4;
                a8Var3 = center;
                sn0Var2 = fit;
                te0Var2 = te0Var3;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                a8Var3 = a8Var2;
                sn0Var2 = sn0Var;
                te0Var2 = te0Var;
            }
            f3 = f2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
            }
        }
        i3 |= 24576;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (kk0Var.e(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (kk0Var.h(te0Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i12 & 1, z)) {
                    if (i15 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        center = Alignment$Companion.getCenter();
                    } else {
                        center = a8Var2;
                    }
                    if (i6 != 0) {
                        fit = ContentScale$Companion.getFit();
                        i13 = i8;
                    } else {
                        i13 = i8;
                        fit = sn0Var;
                    }
                    if (i13 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        te0Var3 = null;
                    } else {
                        te0Var3 = te0Var;
                    }
                    if (str != null) {
                        kk0Var.a0(1040425059);
                        Modifier$Companion modifier$Companion119 = c.i;
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP = kk0Var.P();
                        if (z2) {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        } else {
                            objP = new v7(str, 5);
                            kk0Var.l0(objP);
                        }
                        i14 = 0;
                        cVarB = we3.b(modifier$Companion119, false, (le1) objP);
                        kk0Var.r(false);
                    } else {
                        i14 = 0;
                        kk0Var.a0(1040583841);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarD1110 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                    uaVar = ua.h;
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                    cVarD = b.d(kk0Var, cVarD1110);
                    su2VarN = kk0Var.n();
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
                    xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    kk0Var.r(true);
                    cVar3 = cVar4;
                    a8Var3 = center;
                    sn0Var2 = fit;
                    te0Var2 = te0Var3;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    a8Var3 = a8Var2;
                    sn0Var2 = sn0Var;
                    te0Var2 = te0Var;
                }
                f3 = f2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
                }
            }
            i3 |= 1572864;
            i12 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i12 & 1, z)) {
                if (i15 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    center = Alignment$Companion.getCenter();
                } else {
                    center = a8Var2;
                }
                if (i6 != 0) {
                    fit = ContentScale$Companion.getFit();
                    i13 = i8;
                } else {
                    i13 = i8;
                    fit = sn0Var;
                }
                if (i13 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    te0Var3 = null;
                } else {
                    te0Var3 = te0Var;
                }
                if (str != null) {
                    kk0Var.a0(1040425059);
                    Modifier$Companion modifier$Companion1110 = c.i;
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new v7(str, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new v7(str, 5);
                        kk0Var.l0(objP);
                    }
                    i14 = 0;
                    cVarB = we3.b(modifier$Companion1110, false, (le1) objP);
                    kk0Var.r(false);
                } else {
                    i14 = 0;
                    kk0Var.a0(1040583841);
                    kk0Var.r(false);
                    cVarB = c.i;
                }
                c cVarD1111 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                uaVar = ua.h;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                cVarD = b.d(kk0Var, cVarD1111);
                su2VarN = kk0Var.n();
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
                xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                }
                kk0Var.r(true);
                cVar3 = cVar4;
                a8Var3 = center;
                sn0Var2 = fit;
                te0Var2 = te0Var3;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                a8Var3 = a8Var2;
                sn0Var2 = sn0Var;
                te0Var2 = te0Var;
            }
            f3 = f2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
            }
        }
        i3 |= 196608;
        f2 = f;
        i10 = i2 & 64;
        if (i10 != 0) {
            if ((1572864 & i) == 0) {
                if (kk0Var.h(te0Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i12 & 1, z)) {
                if (i15 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    center = Alignment$Companion.getCenter();
                } else {
                    center = a8Var2;
                }
                if (i6 != 0) {
                    fit = ContentScale$Companion.getFit();
                    i13 = i8;
                } else {
                    i13 = i8;
                    fit = sn0Var;
                }
                if (i13 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    te0Var3 = null;
                } else {
                    te0Var3 = te0Var;
                }
                if (str != null) {
                    kk0Var.a0(1040425059);
                    Modifier$Companion modifier$Companion1111 = c.i;
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = kk0Var.P();
                    if (z2) {
                        objP = new v7(str, 5);
                        kk0Var.l0(objP);
                    } else {
                        objP = new v7(str, 5);
                        kk0Var.l0(objP);
                    }
                    i14 = 0;
                    cVarB = we3.b(modifier$Companion1111, false, (le1) objP);
                    kk0Var.r(false);
                } else {
                    i14 = 0;
                    kk0Var.a0(1040583841);
                    kk0Var.r(false);
                    cVarB = c.i;
                }
                c cVarD1112 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
                uaVar = ua.h;
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
                cVarD = b.d(kk0Var, cVarD1112);
                su2VarN = kk0Var.n();
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
                xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                }
                kk0Var.r(true);
                cVar3 = cVar4;
                a8Var3 = center;
                sn0Var2 = fit;
                te0Var2 = te0Var3;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                a8Var3 = a8Var2;
                sn0Var2 = sn0Var;
                te0Var2 = te0Var;
            }
            f3 = f2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
            }
        }
        i3 |= 1572864;
        i12 = i3;
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i12 & 1, z)) {
            if (i15 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            if (i4 != 0) {
                center = Alignment$Companion.getCenter();
            } else {
                center = a8Var2;
            }
            if (i6 != 0) {
                fit = ContentScale$Companion.getFit();
                i13 = i8;
            } else {
                i13 = i8;
                fit = sn0Var;
            }
            if (i13 != 0) {
                f2 = 1.0f;
            }
            if (i10 != 0) {
                te0Var3 = null;
            } else {
                te0Var3 = te0Var;
            }
            if (str != null) {
                kk0Var.a0(1040425059);
                Modifier$Companion modifier$Companion1112 = c.i;
                if ((i12 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = kk0Var.P();
                if (z2) {
                    objP = new v7(str, 5);
                    kk0Var.l0(objP);
                } else {
                    objP = new v7(str, 5);
                    kk0Var.l0(objP);
                }
                i14 = 0;
                cVarB = we3.b(modifier$Companion1112, false, (le1) objP);
                kk0Var.r(false);
            } else {
                i14 = 0;
                kk0Var.a0(1040583841);
                kk0Var.r(false);
                cVarB = c.i;
            }
            c cVarD1113 = a.d(xr0.O(cVar4.then(cVarB)), ms2Var2, center, fit, f2, te0Var3, 2);
            uaVar = ua.h;
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i14);
            cVarD = b.d(kk0Var, cVarD1113);
            su2VarN = kk0Var.n();
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
            xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
            }
            kk0Var.r(true);
            cVar3 = cVar4;
            a8Var3 = center;
            sn0Var2 = fit;
            te0Var2 = te0Var3;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
            a8Var3 = a8Var2;
            sn0Var2 = sn0Var;
            te0Var2 = te0Var;
        }
        f3 = f2;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new gm1(ms2Var, str, cVar3, a8Var3, sn0Var2, f3, te0Var2, i, i2));
        }
    }

    public static final void Image(ym1 ym1Var, String str, c cVar, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            cVar = c.i;
        }
        c cVar2 = cVar;
        if ((i2 & 8) != 0) {
            a8Var = Alignment$Companion.getCenter();
        }
        Image(ub4.rememberVectorPainter(ym1Var, ck0Var, i & 14), str, cVar2, a8Var, (i2 & 16) != 0 ? ContentScale$Companion.getFit() : sn0Var, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : te0Var, ck0Var, (i & 112) | 8 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i), 0);
    }

    /* JADX INFO: renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m209x6798a8b1(bm1 bm1Var, String str, c cVar, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, int i, ck0 ck0Var, int i2, int i3) {
        if ((i3 & 4) != 0) {
            cVar = c.i;
        }
        c cVar2 = cVar;
        a8 center = (i3 & 8) != 0 ? Alignment$Companion.getCenter() : a8Var;
        sn0 fit = (i3 & 16) != 0 ? ContentScale$Companion.getFit() : sn0Var;
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        te0 te0Var2 = (i3 & 64) != 0 ? null : te0Var;
        int i4 = (i3 & Uuid.SIZE_BITS) != 0 ? 1 : i;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(bm1Var);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = y64.a(bm1Var, i4);
            kk0Var.l0(objP);
        }
        Image((hv) objP, str, cVar2, center, fit, f2, te0Var2, kk0Var, i2 & 4194288, 0);
    }
}
