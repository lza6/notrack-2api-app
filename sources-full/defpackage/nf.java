package defpackage;

import androidx.compose.animation.b;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class nf {
    public static final <T> void AnimatedEnterExitImpl(o54 o54Var, le1 le1Var, c cVar, k41 k41Var, x51 x51Var, ne1 ne1Var, oo2 oo2Var, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        k41 k41Var2;
        x51 x51Var2;
        kk0 kk0Var;
        Throwable th;
        boolean z;
        c cVarB;
        oo2 oo2Var2 = oo2Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-891967166);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var2.h(o54Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var2.j(le1Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var2.h(cVar) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            k41Var2 = k41Var;
        } else {
            k41Var2 = k41Var;
            if ((i & 3072) == 0) {
                i3 |= kk0Var2.h(k41Var2) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            x51Var2 = x51Var;
        } else {
            x51Var2 = x51Var;
            if ((i & 24576) == 0) {
                i3 |= kk0Var2.h(x51Var2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= kk0Var2.j(ne1Var) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        int i5 = 1572864;
        if (i4 != 0) {
            i3 |= i5;
        } else if ((1572864 & i) == 0) {
            i5 = (i & 2097152) == 0 ? kk0Var2.h(oo2Var2) : kk0Var2.j(oo2Var2) ? 1048576 : 524288;
            i3 |= i5;
        }
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= kk0Var2.j(oe1Var) ? 8388608 : 4194304;
        }
        int i6 = i3;
        if (kk0Var2.S(i6 & 1, (i6 & 4793491) != 4793490)) {
            if (i4 != 0) {
                oo2Var2 = null;
            }
            if (((Boolean) le1Var.invoke(o54Var.d.getValue())).booleanValue() || ((Boolean) le1Var.invoke(o54Var.b())).booleanValue() || o54Var.f() || o54Var.c()) {
                kk0Var2.a0(1788522886);
                int i7 = i6 & 14;
                int i8 = i7 | 48;
                int i9 = i8 & 14;
                boolean z2 = ((i9 ^ 6) > 4 && kk0Var2.h(o54Var)) || (i8 & 6) == 4;
                Object objP = kk0Var2.P();
                if (z2 || objP == Composer$Companion.getEmpty()) {
                    objP = o54Var.b();
                    kk0Var2.l0(objP);
                }
                if (o54Var.f()) {
                    objP = o54Var.b();
                }
                kk0Var2.a0(-466616829);
                int i10 = i6 & 126;
                d41 d41VarTargetEnterExit = targetEnterExit(o54Var, le1Var, objP, kk0Var2, i10);
                kk0Var2.r(false);
                Object value = o54Var.d.getValue();
                oo2 oo2Var3 = oo2Var2;
                kk0Var2.a0(-466616829);
                d41 d41VarTargetEnterExit2 = targetEnterExit(o54Var, le1Var, value, kk0Var2, i10);
                kk0Var2.r(false);
                o54 o54VarCreateChildTransitionInternal = b64.createChildTransitionInternal(o54Var, d41VarTargetEnterExit, d41VarTargetEnterExit2, "EnterExitTransition", kk0Var2, i9 | 3072);
                gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(ne1Var, kk0Var2, (i6 >> 15) & 14);
                Object objB = o54VarCreateChildTransitionInternal.b();
                ft2 ft2Var = o54VarCreateChildTransitionInternal.d;
                Object objInvoke = ne1Var.invoke(objB, ft2Var.getValue());
                boolean zH = kk0Var2.h(o54VarCreateChildTransitionInternal) | kk0Var2.h(gn3VarRememberUpdatedState);
                Object objP2 = kk0Var2.P();
                if (zH || objP2 == Composer$Companion.getEmpty()) {
                    th = null;
                    objP2 = new q8(o54VarCreateChildTransitionInternal, gn3VarRememberUpdatedState, (so0) null, 4);
                    kk0Var2.l0(objP2);
                } else {
                    th = null;
                }
                gn3 gn3VarProduceState = cl3.produceState(objInvoke, (ne1) objP2, kk0Var2, 0);
                Object objB2 = o54VarCreateChildTransitionInternal.b();
                d41 d41Var = d41.h;
                if (objB2 == d41Var && ft2Var.getValue() == d41Var && ((Boolean) gn3VarProduceState.getValue()).booleanValue()) {
                    kk0Var2.a0(1790688794);
                    kk0Var2.r(false);
                    z = false;
                    kk0Var = kk0Var2;
                } else {
                    kk0Var2.a0(1789551931);
                    boolean z3 = i7 == 4;
                    Object objP3 = kk0Var2.P();
                    if (z3 || objP3 == Composer$Companion.getEmpty()) {
                        objP3 = new qf(o54VarCreateChildTransitionInternal);
                        kk0Var2.l0(objP3);
                    }
                    qf qfVar = (qf) objP3;
                    int i11 = i6 >> 6;
                    Throwable th2 = th;
                    z = false;
                    c cVarCreateModifier = b.createModifier(o54VarCreateChildTransitionInternal, k41Var2, x51Var2, null, "Built-in", kk0Var2, (i11 & 896) | (i11 & 112) | 24576, 4);
                    kk0Var = kk0Var2;
                    if (oo2Var3 != null) {
                        kk0Var.a0(1789971299);
                        Modifier$Companion modifier$Companion = c.i;
                        boolean z4 = (i6 & 3670016) == 1048576 || ((i6 & 2097152) != 0 && kk0Var.j(oo2Var3));
                        Object objP4 = kk0Var.P();
                        if (z4 || objP4 == Composer$Companion.getEmpty()) {
                            objP4 = new u1(3, 4);
                            kk0Var.l0(objP4);
                        }
                        cVarB = a.b(modifier$Companion, (oe1) objP4);
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1581779440);
                        kk0Var.r(false);
                        cVarB = c.i;
                    }
                    c cVarThen = cVar.then(cVarCreateModifier.then(cVarB));
                    Object objP5 = kk0Var.P();
                    if (objP5 == Composer$Companion.getEmpty()) {
                        objP5 = new xe(qfVar);
                        kk0Var.l0(objP5);
                    }
                    xe xeVar = (xe) objP5;
                    int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2 su2VarN = kk0Var.n();
                    c cVarD = androidx.compose.ui.b.d(kk0Var, cVarThen);
                    androidx.compose.ui.node.a.j.getClass();
                    d4 constructor = ComposeUiNode$Companion.getConstructor();
                    if (kk0Var.a == null) {
                        rj0.a();
                        throw th2;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(constructor);
                    } else {
                        kk0Var.o0();
                    }
                    xp1.E(kk0Var, xeVar, ComposeUiNode$Companion.getSetMeasurePolicy());
                    xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
                    pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
                    if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    oe1Var.invoke(qfVar, kk0Var, Integer.valueOf((i6 >> 18) & 112));
                    kk0Var.r(true);
                    kk0Var.r(false);
                }
                kk0Var.r(z);
            } else {
                kk0Var2.a0(1790694746);
                kk0Var2.r(false);
                kk0Var = kk0Var2;
            }
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ff(o54Var, le1Var, cVar, k41Var, x51Var, ne1Var, oe1Var, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0125  */
    /* JADX WARN: Code duplicated, block: B:92:0x0131  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void AnimatedVisibility(g83 g83Var, ni2 ni2Var, c cVar, k41 k41Var, x51 x51Var, String str, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        k41 k41Var2;
        int i5;
        int i6;
        x51 x51VarA;
        int i7;
        int i8;
        String str2;
        int i9;
        oe1 oe1Var2;
        int i10;
        boolean z;
        k41 k41Var3;
        x51 x51Var2;
        String str3;
        w33 w33VarV;
        c cVar3;
        k41 k41VarA;
        String str4;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(836509870);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? kk0Var.h(ni2Var) : kk0Var.j(ni2Var) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    k41Var2 = k41Var;
                    if (kk0Var.h(k41Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        x51VarA = x51Var;
                        if (kk0Var.h(x51VarA)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            str2 = str;
                            if (kk0Var.h(str2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                            oe1Var2 = oe1Var;
                        } else {
                            oe1Var2 = oe1Var;
                            if ((i & 1572864) == 0) {
                                if (kk0Var.j(oe1Var2)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                                i3 |= i10;
                            }
                        }
                        if ((599185 & i3) != 599184) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i3 & 1, z)) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                k41VarA = b.a().a(b.e(null, 3));
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.g().a(b.f(null, 3));
                            }
                            if (i8 != 0) {
                                str4 = "AnimatedVisibility";
                            } else {
                                str4 = str2;
                            }
                            int i12 = i3 >> 3;
                            x51 x51Var3 = x51VarA;
                            AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i12 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var3, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i12 & 458752));
                            str3 = str4;
                            cVar2 = cVar3;
                            k41Var3 = k41VarA;
                            x51Var2 = x51Var3;
                        } else {
                            kk0Var.V();
                            k41Var3 = k41Var2;
                            x51Var2 = x51VarA;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                        }
                    }
                    i3 |= 196608;
                    str2 = str;
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 1572864) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.a().a(b.e(null, 3));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.g().a(b.f(null, 3));
                        }
                        if (i8 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i13 = i3 >> 3;
                        x51 x51Var4 = x51VarA;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i13 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var4, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i13 & 458752));
                        str3 = str4;
                        cVar2 = cVar3;
                        k41Var3 = k41VarA;
                        x51Var2 = x51Var4;
                    } else {
                        kk0Var.V();
                        k41Var3 = k41Var2;
                        x51Var2 = x51VarA;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 24576;
                x51VarA = x51Var;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 1572864) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.a().a(b.e(null, 3));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.g().a(b.f(null, 3));
                        }
                        if (i8 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i14 = i3 >> 3;
                        x51 x51Var5 = x51VarA;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i14 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var5, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i14 & 458752));
                        str3 = str4;
                        cVar2 = cVar3;
                        k41Var3 = k41VarA;
                        x51Var2 = x51Var5;
                    } else {
                        kk0Var.V();
                        k41Var3 = k41Var2;
                        x51Var2 = x51VarA;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.a().a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.g().a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i15 = i3 >> 3;
                    x51 x51Var6 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i15 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var6, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i15 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    k41Var3 = k41VarA;
                    x51Var2 = x51Var6;
                } else {
                    kk0Var.V();
                    k41Var3 = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 3072;
            k41Var2 = k41Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    x51VarA = x51Var;
                    if (kk0Var.h(x51VarA)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 1572864) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.a().a(b.e(null, 3));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.g().a(b.f(null, 3));
                        }
                        if (i8 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i16 = i3 >> 3;
                        x51 x51Var7 = x51VarA;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i16 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var7, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i16 & 458752));
                        str3 = str4;
                        cVar2 = cVar3;
                        k41Var3 = k41VarA;
                        x51Var2 = x51Var7;
                    } else {
                        kk0Var.V();
                        k41Var3 = k41Var2;
                        x51Var2 = x51VarA;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.a().a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.g().a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i17 = i3 >> 3;
                    x51 x51Var8 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i17 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var8, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i17 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    k41Var3 = k41VarA;
                    x51Var2 = x51Var8;
                } else {
                    kk0Var.V();
                    k41Var3 = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 24576;
            x51VarA = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.a().a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.g().a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i18 = i3 >> 3;
                    x51 x51Var9 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i18 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var9, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i18 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    k41Var3 = k41VarA;
                    x51Var2 = x51Var9;
                } else {
                    kk0Var.V();
                    k41Var3 = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 1572864) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.a().a(b.e(null, 3));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.g().a(b.f(null, 3));
                }
                if (i8 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i19 = i3 >> 3;
                x51 x51Var10 = x51VarA;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i19 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var10, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i19 & 458752));
                str3 = str4;
                cVar2 = cVar3;
                k41Var3 = k41VarA;
                x51Var2 = x51Var10;
            } else {
                kk0Var.V();
                k41Var3 = k41Var2;
                x51Var2 = x51VarA;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                k41Var2 = k41Var;
                if (kk0Var.h(k41Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    x51VarA = x51Var;
                    if (kk0Var.h(x51VarA)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 1572864) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.a().a(b.e(null, 3));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.g().a(b.f(null, 3));
                        }
                        if (i8 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i110 = i3 >> 3;
                        x51 x51Var11 = x51VarA;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i110 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var11, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i110 & 458752));
                        str3 = str4;
                        cVar2 = cVar3;
                        k41Var3 = k41VarA;
                        x51Var2 = x51Var11;
                    } else {
                        kk0Var.V();
                        k41Var3 = k41Var2;
                        x51Var2 = x51VarA;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.a().a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.g().a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i111 = i3 >> 3;
                    x51 x51Var12 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i111 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var12, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    k41Var3 = k41VarA;
                    x51Var2 = x51Var12;
                } else {
                    kk0Var.V();
                    k41Var3 = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 24576;
            x51VarA = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.a().a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.g().a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i112 = i3 >> 3;
                    x51 x51Var13 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i112 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var13, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i112 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    k41Var3 = k41VarA;
                    x51Var2 = x51Var13;
                } else {
                    kk0Var.V();
                    k41Var3 = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 1572864) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.a().a(b.e(null, 3));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.g().a(b.f(null, 3));
                }
                if (i8 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i113 = i3 >> 3;
                x51 x51Var14 = x51VarA;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i113 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var14, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i113 & 458752));
                str3 = str4;
                cVar2 = cVar3;
                k41Var3 = k41VarA;
                x51Var2 = x51Var14;
            } else {
                kk0Var.V();
                k41Var3 = k41Var2;
                x51Var2 = x51VarA;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 3072;
        k41Var2 = k41Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                x51VarA = x51Var;
                if (kk0Var.h(x51VarA)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.a().a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.g().a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i114 = i3 >> 3;
                    x51 x51Var15 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i114 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var15, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i114 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    k41Var3 = k41VarA;
                    x51Var2 = x51Var15;
                } else {
                    kk0Var.V();
                    k41Var3 = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 1572864) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.a().a(b.e(null, 3));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.g().a(b.f(null, 3));
                }
                if (i8 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i115 = i3 >> 3;
                x51 x51Var16 = x51VarA;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i115 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var16, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i115 & 458752));
                str3 = str4;
                cVar2 = cVar3;
                k41Var3 = k41VarA;
                x51Var2 = x51Var16;
            } else {
                kk0Var.V();
                k41Var3 = k41Var2;
                x51Var2 = x51VarA;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 24576;
        x51VarA = x51Var;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                str2 = str;
                if (kk0Var.h(str2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 1572864) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.a().a(b.e(null, 3));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.g().a(b.f(null, 3));
                }
                if (i8 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i116 = i3 >> 3;
                x51 x51Var17 = x51VarA;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i116 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var17, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i116 & 458752));
                str3 = str4;
                cVar2 = cVar3;
                k41Var3 = k41VarA;
                x51Var2 = x51Var17;
            } else {
                kk0Var.V();
                k41Var3 = k41Var2;
                x51Var2 = x51VarA;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 196608;
        str2 = str;
        if ((i2 & 32) != 0) {
            i3 |= 1572864;
            oe1Var2 = oe1Var;
        } else {
            oe1Var2 = oe1Var;
            if ((i & 1572864) == 0) {
                if (kk0Var.j(oe1Var2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
        }
        if ((599185 & i3) != 599184) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i11 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            if (i4 != 0) {
                k41VarA = b.a().a(b.e(null, 3));
            } else {
                k41VarA = k41Var2;
            }
            if (i6 != 0) {
                x51VarA = b.g().a(b.f(null, 3));
            }
            if (i8 != 0) {
                str4 = "AnimatedVisibility";
            } else {
                str4 = str2;
            }
            int i117 = i3 >> 3;
            x51 x51Var18 = x51VarA;
            AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i117 & 14) | ((i3 >> 12) & 112), 0), v1.A, cVar3, k41VarA, x51Var18, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i117 & 458752));
            str3 = str4;
            cVar2 = cVar3;
            k41Var3 = k41VarA;
            x51Var2 = x51Var18;
        } else {
            kk0Var.V();
            k41Var3 = k41Var2;
            x51Var2 = x51VarA;
            str3 = str2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ff(g83Var, ni2Var, cVar2, k41Var3, x51Var2, str3, oe1Var, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0124  */
    /* JADX WARN: Code duplicated, block: B:89:0x0131  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void AnimatedVisibility(g83 g83Var, boolean z, c cVar, k41 k41Var, x51 x51Var, String str, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        boolean z2;
        int i3;
        c cVar2;
        int i4;
        k41 k41Var2;
        int i5;
        int i6;
        x51 x51Var2;
        int i7;
        int i8;
        String str2;
        int i9;
        oe1 oe1Var2;
        int i10;
        boolean z3;
        x51 x51Var3;
        c cVar3;
        String str3;
        w33 w33VarV;
        k41 k41VarA;
        x51 x51VarA;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1741346906);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 = (kk0Var.i(z2) ? 32 : 16) | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    k41Var2 = k41Var;
                    if (kk0Var.h(k41Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        x51Var2 = x51Var;
                        if (kk0Var.h(x51Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            str2 = str;
                            if (kk0Var.h(str2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            if ((i & 1572864) == 0) {
                                oe1Var2 = oe1Var;
                                if (kk0Var.j(oe1Var2)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                                i3 |= i10;
                            }
                            if ((599185 & i3) != 599184) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (kk0Var.S(i3 & 1, z3)) {
                                if (i11 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i4 != 0) {
                                    k41VarA = b.e(null, 3).a(b.a());
                                } else {
                                    k41VarA = k41Var2;
                                }
                                if (i6 != 0) {
                                    x51VarA = b.f(null, 3).a(b.g());
                                } else {
                                    x51VarA = x51Var2;
                                }
                                if (i8 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i12 = i3 >> 3;
                                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i12 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i12 & 458752));
                                x51Var3 = x51VarA;
                                k41Var2 = k41VarA;
                                str3 = str2;
                                cVar3 = cVar2;
                            } else {
                                kk0Var.V();
                                x51Var3 = x51Var2;
                                cVar3 = cVar2;
                                str3 = str2;
                            }
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                            }
                        }
                        i3 |= 1572864;
                        oe1Var2 = oe1Var;
                        if ((599185 & i3) != 599184) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar2 = c.i;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.a());
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.g());
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i13 = i3 >> 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i13 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i13 & 458752));
                            x51Var3 = x51VarA;
                            k41Var2 = k41VarA;
                            str3 = str2;
                            cVar3 = cVar2;
                        } else {
                            kk0Var.V();
                            x51Var3 = x51Var2;
                            cVar3 = cVar2;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                        }
                    }
                    i3 |= 196608;
                    str2 = str;
                    if ((i2 & 32) != 0) {
                        if ((i & 1572864) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar2 = c.i;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.a());
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.g());
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i14 = i3 >> 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i14 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i14 & 458752));
                            x51Var3 = x51VarA;
                            k41Var2 = k41VarA;
                            str3 = str2;
                            cVar3 = cVar2;
                        } else {
                            kk0Var.V();
                            x51Var3 = x51Var2;
                            cVar3 = cVar2;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                        }
                    }
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.a());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.g());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i15 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i15 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i15 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 24576;
                x51Var2 = x51Var;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 1572864) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar2 = c.i;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.a());
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.g());
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i16 = i3 >> 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i16 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i16 & 458752));
                            x51Var3 = x51VarA;
                            k41Var2 = k41VarA;
                            str3 = str2;
                            cVar3 = cVar2;
                        } else {
                            kk0Var.V();
                            x51Var3 = x51Var2;
                            cVar3 = cVar2;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                        }
                    }
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.a());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.g());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i17 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i17 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i17 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.a());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.g());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i18 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i18 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i18 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.a());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.g());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i19 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i19 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i19 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 3072;
            k41Var2 = k41Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    x51Var2 = x51Var;
                    if (kk0Var.h(x51Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 1572864) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar2 = c.i;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.a());
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.g());
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i110 = i3 >> 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i110 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i110 & 458752));
                            x51Var3 = x51VarA;
                            k41Var2 = k41VarA;
                            str3 = str2;
                            cVar3 = cVar2;
                        } else {
                            kk0Var.V();
                            x51Var3 = x51Var2;
                            cVar3 = cVar2;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                        }
                    }
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.a());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.g());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i111 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.a());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.g());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i112 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i112 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i112 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.a());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.g());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i113 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i113 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i113 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 24576;
            x51Var2 = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.a());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.g());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i114 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i114 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i114 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.a());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.g());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i115 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i115 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i115 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 1572864) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.a());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.g());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i116 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i116 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i116 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 1572864;
            oe1Var2 = oe1Var;
            if ((599185 & i3) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.a());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.g());
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i117 = i3 >> 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i117 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i117 & 458752));
                x51Var3 = x51VarA;
                k41Var2 = k41VarA;
                str3 = str2;
                cVar3 = cVar2;
            } else {
                kk0Var.V();
                x51Var3 = x51Var2;
                cVar3 = cVar2;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                k41Var2 = k41Var;
                if (kk0Var.h(k41Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    x51Var2 = x51Var;
                    if (kk0Var.h(x51Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 1572864) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar2 = c.i;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.a());
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.g());
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i118 = i3 >> 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i118 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i118 & 458752));
                            x51Var3 = x51VarA;
                            k41Var2 = k41VarA;
                            str3 = str2;
                            cVar3 = cVar2;
                        } else {
                            kk0Var.V();
                            x51Var3 = x51Var2;
                            cVar3 = cVar2;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                        }
                    }
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.a());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.g());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i119 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i119 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i119 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.a());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.g());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1110 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1110 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1110 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.a());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.g());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1111 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 24576;
            x51Var2 = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.a());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.g());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1112 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1112 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1112 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.a());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.g());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1113 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1113 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1113 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 1572864) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.a());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.g());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1114 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1114 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1114 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 1572864;
            oe1Var2 = oe1Var;
            if ((599185 & i3) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.a());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.g());
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1115 = i3 >> 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1115 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1115 & 458752));
                x51Var3 = x51VarA;
                k41Var2 = k41VarA;
                str3 = str2;
                cVar3 = cVar2;
            } else {
                kk0Var.V();
                x51Var3 = x51Var2;
                cVar3 = cVar2;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
            }
        }
        i3 |= 3072;
        k41Var2 = k41Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                x51Var2 = x51Var;
                if (kk0Var.h(x51Var2)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.a());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.g());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1116 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1116 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1116 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.a());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.g());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1117 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1117 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1117 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 1572864) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.a());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.g());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1118 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1118 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1118 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 1572864;
            oe1Var2 = oe1Var;
            if ((599185 & i3) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.a());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.g());
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1119 = i3 >> 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1119 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1119 & 458752));
                x51Var3 = x51VarA;
                k41Var2 = k41VarA;
                str3 = str2;
                cVar3 = cVar2;
            } else {
                kk0Var.V();
                x51Var3 = x51Var2;
                cVar3 = cVar2;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
            }
        }
        i3 |= 24576;
        x51Var2 = x51Var;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                str2 = str;
                if (kk0Var.h(str2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                if ((i & 1572864) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.a());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.g());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i11110 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i11110 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11110 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
                }
            }
            i3 |= 1572864;
            oe1Var2 = oe1Var;
            if ((599185 & i3) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.a());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.g());
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111 = i3 >> 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i11111 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11111 & 458752));
                x51Var3 = x51VarA;
                k41Var2 = k41VarA;
                str3 = str2;
                cVar3 = cVar2;
            } else {
                kk0Var.V();
                x51Var3 = x51Var2;
                cVar3 = cVar2;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
            }
        }
        i3 |= 196608;
        str2 = str;
        if ((i2 & 32) != 0) {
            if ((i & 1572864) == 0) {
                oe1Var2 = oe1Var;
                if (kk0Var.j(oe1Var2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.a());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.g());
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11112 = i3 >> 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i11112 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11112 & 458752));
                x51Var3 = x51VarA;
                k41Var2 = k41VarA;
                str3 = str2;
                cVar3 = cVar2;
            } else {
                kk0Var.V();
                x51Var3 = x51Var2;
                cVar3 = cVar2;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
            }
        }
        i3 |= 1572864;
        oe1Var2 = oe1Var;
        if ((599185 & i3) != 599184) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kk0Var.S(i3 & 1, z3)) {
            if (i11 != 0) {
                cVar2 = c.i;
            }
            if (i4 != 0) {
                k41VarA = b.e(null, 3).a(b.a());
            } else {
                k41VarA = k41Var2;
            }
            if (i6 != 0) {
                x51VarA = b.f(null, 3).a(b.g());
            } else {
                x51VarA = x51Var2;
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i11113 = i3 >> 3;
            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i11113 & 14) | ((i3 >> 12) & 112), 0), v1.x, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11113 & 458752));
            x51Var3 = x51VarA;
            k41Var2 = k41VarA;
            str3 = str2;
            cVar3 = cVar2;
        } else {
            kk0Var.V();
            x51Var3 = x51Var2;
            cVar3 = cVar2;
            str3 = str2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new kf(g83Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void AnimatedVisibility(lf0 lf0Var, ni2 ni2Var, c cVar, k41 k41Var, x51 x51Var, String str, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        k41 k41Var2;
        int i5;
        int i6;
        x51 x51VarA;
        int i7;
        int i8;
        String str2;
        int i9;
        oe1 oe1Var2;
        int i10;
        boolean z;
        k41 k41VarA;
        x51 x51Var2;
        String str3;
        w33 w33VarV;
        c cVar3;
        String str4;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-850656618);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? kk0Var.h(ni2Var) : kk0Var.j(ni2Var) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    k41Var2 = k41Var;
                    if (kk0Var.h(k41Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        x51VarA = x51Var;
                        if (kk0Var.h(x51VarA)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            str2 = str;
                            if (kk0Var.h(str2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                            oe1Var2 = oe1Var;
                        } else {
                            oe1Var2 = oe1Var;
                            if ((i & 1572864) == 0) {
                                if (kk0Var.j(oe1Var2)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                                i3 |= i10;
                            }
                        }
                        if ((599185 & i3) != 599184) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i3 & 1, z)) {
                            if (i11 != 0) {
                                cVar3 = c.i;
                            } else {
                                cVar3 = cVar2;
                            }
                            if (i4 != 0) {
                                k41VarA = b.d(null, 15).a(b.e(null, 3));
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.j(null, 15).a(b.f(null, 3));
                            }
                            if (i8 != 0) {
                                str4 = "AnimatedVisibility";
                            } else {
                                str4 = str2;
                            }
                            int i12 = i3 >> 3;
                            x51 x51Var3 = x51VarA;
                            AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i12 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var3, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i12 & 458752));
                            str3 = str4;
                            cVar2 = cVar3;
                            x51Var2 = x51Var3;
                        } else {
                            kk0Var.V();
                            k41VarA = k41Var2;
                            x51Var2 = x51VarA;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                        }
                    }
                    i3 |= 196608;
                    str2 = str;
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 1572864) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.d(null, 15).a(b.e(null, 3));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.j(null, 15).a(b.f(null, 3));
                        }
                        if (i8 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i13 = i3 >> 3;
                        x51 x51Var4 = x51VarA;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i13 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var4, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i13 & 458752));
                        str3 = str4;
                        cVar2 = cVar3;
                        x51Var2 = x51Var4;
                    } else {
                        kk0Var.V();
                        k41VarA = k41Var2;
                        x51Var2 = x51VarA;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                    }
                }
                i3 |= 24576;
                x51VarA = x51Var;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 1572864) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.d(null, 15).a(b.e(null, 3));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.j(null, 15).a(b.f(null, 3));
                        }
                        if (i8 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i14 = i3 >> 3;
                        x51 x51Var5 = x51VarA;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i14 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var5, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i14 & 458752));
                        str3 = str4;
                        cVar2 = cVar3;
                        x51Var2 = x51Var5;
                    } else {
                        kk0Var.V();
                        k41VarA = k41Var2;
                        x51Var2 = x51VarA;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.d(null, 15).a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.j(null, 15).a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i15 = i3 >> 3;
                    x51 x51Var6 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i15 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var6, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i15 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    x51Var2 = x51Var6;
                } else {
                    kk0Var.V();
                    k41VarA = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                }
            }
            i3 |= 3072;
            k41Var2 = k41Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    x51VarA = x51Var;
                    if (kk0Var.h(x51VarA)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 1572864) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.d(null, 15).a(b.e(null, 3));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.j(null, 15).a(b.f(null, 3));
                        }
                        if (i8 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i16 = i3 >> 3;
                        x51 x51Var7 = x51VarA;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i16 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var7, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i16 & 458752));
                        str3 = str4;
                        cVar2 = cVar3;
                        x51Var2 = x51Var7;
                    } else {
                        kk0Var.V();
                        k41VarA = k41Var2;
                        x51Var2 = x51VarA;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.d(null, 15).a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.j(null, 15).a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i17 = i3 >> 3;
                    x51 x51Var8 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i17 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var8, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i17 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    x51Var2 = x51Var8;
                } else {
                    kk0Var.V();
                    k41VarA = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                }
            }
            i3 |= 24576;
            x51VarA = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.d(null, 15).a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.j(null, 15).a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i18 = i3 >> 3;
                    x51 x51Var9 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i18 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var9, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i18 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    x51Var2 = x51Var9;
                } else {
                    kk0Var.V();
                    k41VarA = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 1572864) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.d(null, 15).a(b.e(null, 3));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.j(null, 15).a(b.f(null, 3));
                }
                if (i8 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i19 = i3 >> 3;
                x51 x51Var10 = x51VarA;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i19 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var10, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i19 & 458752));
                str3 = str4;
                cVar2 = cVar3;
                x51Var2 = x51Var10;
            } else {
                kk0Var.V();
                k41VarA = k41Var2;
                x51Var2 = x51VarA;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                k41Var2 = k41Var;
                if (kk0Var.h(k41Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    x51VarA = x51Var;
                    if (kk0Var.h(x51VarA)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 1572864) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar3 = c.i;
                        } else {
                            cVar3 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.d(null, 15).a(b.e(null, 3));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.j(null, 15).a(b.f(null, 3));
                        }
                        if (i8 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i110 = i3 >> 3;
                        x51 x51Var11 = x51VarA;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i110 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var11, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i110 & 458752));
                        str3 = str4;
                        cVar2 = cVar3;
                        x51Var2 = x51Var11;
                    } else {
                        kk0Var.V();
                        k41VarA = k41Var2;
                        x51Var2 = x51VarA;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.d(null, 15).a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.j(null, 15).a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i111 = i3 >> 3;
                    x51 x51Var12 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i111 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var12, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    x51Var2 = x51Var12;
                } else {
                    kk0Var.V();
                    k41VarA = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                }
            }
            i3 |= 24576;
            x51VarA = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.d(null, 15).a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.j(null, 15).a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i112 = i3 >> 3;
                    x51 x51Var13 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i112 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var13, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i112 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    x51Var2 = x51Var13;
                } else {
                    kk0Var.V();
                    k41VarA = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 1572864) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.d(null, 15).a(b.e(null, 3));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.j(null, 15).a(b.f(null, 3));
                }
                if (i8 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i113 = i3 >> 3;
                x51 x51Var14 = x51VarA;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i113 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var14, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i113 & 458752));
                str3 = str4;
                cVar2 = cVar3;
                x51Var2 = x51Var14;
            } else {
                kk0Var.V();
                k41VarA = k41Var2;
                x51Var2 = x51VarA;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
            }
        }
        i3 |= 3072;
        k41Var2 = k41Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                x51VarA = x51Var;
                if (kk0Var.h(x51VarA)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 1572864) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar3 = c.i;
                    } else {
                        cVar3 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.d(null, 15).a(b.e(null, 3));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.j(null, 15).a(b.f(null, 3));
                    }
                    if (i8 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i114 = i3 >> 3;
                    x51 x51Var15 = x51VarA;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i114 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var15, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i114 & 458752));
                    str3 = str4;
                    cVar2 = cVar3;
                    x51Var2 = x51Var15;
                } else {
                    kk0Var.V();
                    k41VarA = k41Var2;
                    x51Var2 = x51VarA;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 1572864) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.d(null, 15).a(b.e(null, 3));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.j(null, 15).a(b.f(null, 3));
                }
                if (i8 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i115 = i3 >> 3;
                x51 x51Var16 = x51VarA;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i115 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var16, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i115 & 458752));
                str3 = str4;
                cVar2 = cVar3;
                x51Var2 = x51Var16;
            } else {
                kk0Var.V();
                k41VarA = k41Var2;
                x51Var2 = x51VarA;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
            }
        }
        i3 |= 24576;
        x51VarA = x51Var;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                str2 = str;
                if (kk0Var.h(str2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 1572864) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar3 = c.i;
                } else {
                    cVar3 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.d(null, 15).a(b.e(null, 3));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.j(null, 15).a(b.f(null, 3));
                }
                if (i8 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i116 = i3 >> 3;
                x51 x51Var17 = x51VarA;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i116 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var17, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i116 & 458752));
                str3 = str4;
                cVar2 = cVar3;
                x51Var2 = x51Var17;
            } else {
                kk0Var.V();
                k41VarA = k41Var2;
                x51Var2 = x51VarA;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
            }
        }
        i3 |= 196608;
        str2 = str;
        if ((i2 & 32) != 0) {
            i3 |= 1572864;
            oe1Var2 = oe1Var;
        } else {
            oe1Var2 = oe1Var;
            if ((i & 1572864) == 0) {
                if (kk0Var.j(oe1Var2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
        }
        if ((599185 & i3) != 599184) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i11 != 0) {
                cVar3 = c.i;
            } else {
                cVar3 = cVar2;
            }
            if (i4 != 0) {
                k41VarA = b.d(null, 15).a(b.e(null, 3));
            } else {
                k41VarA = k41Var2;
            }
            if (i6 != 0) {
                x51VarA = b.j(null, 15).a(b.f(null, 3));
            }
            if (i8 != 0) {
                str4 = "AnimatedVisibility";
            } else {
                str4 = str2;
            }
            int i117 = i3 >> 3;
            x51 x51Var18 = x51VarA;
            AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str4, kk0Var, (i117 & 14) | ((i3 >> 12) & 112), 0), v1.v, cVar3, k41VarA, x51Var18, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i117 & 458752));
            str3 = str4;
            cVar2 = cVar3;
            x51Var2 = x51Var18;
        } else {
            kk0Var.V();
            k41VarA = k41Var2;
            x51Var2 = x51VarA;
            str3 = str2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ff(lf0Var, ni2Var, cVar2, k41VarA, x51Var2, str3, oe1Var, i, i2, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0126  */
    /* JADX WARN: Code duplicated, block: B:89:0x0133  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void AnimatedVisibility(lf0 lf0Var, boolean z, c cVar, k41 k41Var, x51 x51Var, String str, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        boolean z2;
        int i3;
        c cVar2;
        int i4;
        k41 k41Var2;
        int i5;
        int i6;
        x51 x51Var2;
        int i7;
        int i8;
        String str2;
        int i9;
        oe1 oe1Var2;
        int i10;
        boolean z3;
        x51 x51Var3;
        c cVar3;
        String str3;
        w33 w33VarV;
        k41 k41VarA;
        x51 x51VarA;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1766503102);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 = (kk0Var.i(z2) ? 32 : 16) | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    k41Var2 = k41Var;
                    if (kk0Var.h(k41Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        x51Var2 = x51Var;
                        if (kk0Var.h(x51Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            str2 = str;
                            if (kk0Var.h(str2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            if ((i & 1572864) == 0) {
                                oe1Var2 = oe1Var;
                                if (kk0Var.j(oe1Var2)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                                i3 |= i10;
                            }
                            if ((599185 & i3) != 599184) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (kk0Var.S(i3 & 1, z3)) {
                                if (i11 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i4 != 0) {
                                    k41VarA = b.e(null, 3).a(b.d(null, 15));
                                } else {
                                    k41VarA = k41Var2;
                                }
                                if (i6 != 0) {
                                    x51VarA = b.f(null, 3).a(b.j(null, 15));
                                } else {
                                    x51VarA = x51Var2;
                                }
                                if (i8 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i12 = i3 >> 3;
                                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i12 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i12 & 458752));
                                x51Var3 = x51VarA;
                                k41Var2 = k41VarA;
                                str3 = str2;
                                cVar3 = cVar2;
                            } else {
                                kk0Var.V();
                                x51Var3 = x51Var2;
                                cVar3 = cVar2;
                                str3 = str2;
                            }
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                            }
                        }
                        i3 |= 1572864;
                        oe1Var2 = oe1Var;
                        if ((599185 & i3) != 599184) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar2 = c.i;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.d(null, 15));
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.j(null, 15));
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i13 = i3 >> 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i13 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i13 & 458752));
                            x51Var3 = x51VarA;
                            k41Var2 = k41VarA;
                            str3 = str2;
                            cVar3 = cVar2;
                        } else {
                            kk0Var.V();
                            x51Var3 = x51Var2;
                            cVar3 = cVar2;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                        }
                    }
                    i3 |= 196608;
                    str2 = str;
                    if ((i2 & 32) != 0) {
                        if ((i & 1572864) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar2 = c.i;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.d(null, 15));
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.j(null, 15));
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i14 = i3 >> 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i14 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i14 & 458752));
                            x51Var3 = x51VarA;
                            k41Var2 = k41VarA;
                            str3 = str2;
                            cVar3 = cVar2;
                        } else {
                            kk0Var.V();
                            x51Var3 = x51Var2;
                            cVar3 = cVar2;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                        }
                    }
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.d(null, 15));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.j(null, 15));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i15 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i15 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i15 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 24576;
                x51Var2 = x51Var;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 1572864) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar2 = c.i;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.d(null, 15));
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.j(null, 15));
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i16 = i3 >> 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i16 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i16 & 458752));
                            x51Var3 = x51VarA;
                            k41Var2 = k41VarA;
                            str3 = str2;
                            cVar3 = cVar2;
                        } else {
                            kk0Var.V();
                            x51Var3 = x51Var2;
                            cVar3 = cVar2;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                        }
                    }
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.d(null, 15));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.j(null, 15));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i17 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i17 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i17 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.d(null, 15));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.j(null, 15));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i18 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i18 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i18 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.d(null, 15));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.j(null, 15));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i19 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i19 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i19 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 3072;
            k41Var2 = k41Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    x51Var2 = x51Var;
                    if (kk0Var.h(x51Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 1572864) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar2 = c.i;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.d(null, 15));
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.j(null, 15));
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i110 = i3 >> 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i110 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i110 & 458752));
                            x51Var3 = x51VarA;
                            k41Var2 = k41VarA;
                            str3 = str2;
                            cVar3 = cVar2;
                        } else {
                            kk0Var.V();
                            x51Var3 = x51Var2;
                            cVar3 = cVar2;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                        }
                    }
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.d(null, 15));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.j(null, 15));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i111 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i111 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i111 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.d(null, 15));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.j(null, 15));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i112 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i112 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i112 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.d(null, 15));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.j(null, 15));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i113 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i113 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i113 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 24576;
            x51Var2 = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.d(null, 15));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.j(null, 15));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i114 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i114 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i114 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.d(null, 15));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.j(null, 15));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i115 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i115 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i115 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 1572864) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.d(null, 15));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.j(null, 15));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i116 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i116 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i116 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 1572864;
            oe1Var2 = oe1Var;
            if ((599185 & i3) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.d(null, 15));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.j(null, 15));
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i117 = i3 >> 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i117 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i117 & 458752));
                x51Var3 = x51VarA;
                k41Var2 = k41VarA;
                str3 = str2;
                cVar3 = cVar2;
            } else {
                kk0Var.V();
                x51Var3 = x51Var2;
                cVar3 = cVar2;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                k41Var2 = k41Var;
                if (kk0Var.h(k41Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    x51Var2 = x51Var;
                    if (kk0Var.h(x51Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        str2 = str;
                        if (kk0Var.h(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 1572864) == 0) {
                            oe1Var2 = oe1Var;
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar2 = c.i;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.d(null, 15));
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.j(null, 15));
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i118 = i3 >> 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i118 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i118 & 458752));
                            x51Var3 = x51VarA;
                            k41Var2 = k41VarA;
                            str3 = str2;
                            cVar3 = cVar2;
                        } else {
                            kk0Var.V();
                            x51Var3 = x51Var2;
                            cVar3 = cVar2;
                            str3 = str2;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                        }
                    }
                    i3 |= 1572864;
                    oe1Var2 = oe1Var;
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.d(null, 15));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.j(null, 15));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i119 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i119 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i119 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.d(null, 15));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.j(null, 15));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1110 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1110 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1110 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.d(null, 15));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.j(null, 15));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1111 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1111 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1111 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 24576;
            x51Var2 = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.d(null, 15));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.j(null, 15));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1112 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1112 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1112 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.d(null, 15));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.j(null, 15));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1113 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1113 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1113 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 1572864) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.d(null, 15));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.j(null, 15));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1114 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1114 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1114 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 1572864;
            oe1Var2 = oe1Var;
            if ((599185 & i3) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.d(null, 15));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.j(null, 15));
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1115 = i3 >> 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1115 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1115 & 458752));
                x51Var3 = x51VarA;
                k41Var2 = k41VarA;
                str3 = str2;
                cVar3 = cVar2;
            } else {
                kk0Var.V();
                x51Var3 = x51Var2;
                cVar3 = cVar2;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 3072;
        k41Var2 = k41Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                x51Var2 = x51Var;
                if (kk0Var.h(x51Var2)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    str2 = str;
                    if (kk0Var.h(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 1572864) == 0) {
                        oe1Var2 = oe1Var;
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar2 = c.i;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.d(null, 15));
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.j(null, 15));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        int i1116 = i3 >> 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1116 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1116 & 458752));
                        x51Var3 = x51VarA;
                        k41Var2 = k41VarA;
                        str3 = str2;
                        cVar3 = cVar2;
                    } else {
                        kk0Var.V();
                        x51Var3 = x51Var2;
                        cVar3 = cVar2;
                        str3 = str2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                    }
                }
                i3 |= 1572864;
                oe1Var2 = oe1Var;
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.d(null, 15));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.j(null, 15));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1117 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1117 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1117 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                if ((i & 1572864) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.d(null, 15));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.j(null, 15));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i1118 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1118 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1118 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 1572864;
            oe1Var2 = oe1Var;
            if ((599185 & i3) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.d(null, 15));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.j(null, 15));
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i1119 = i3 >> 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i1119 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1119 & 458752));
                x51Var3 = x51VarA;
                k41Var2 = k41VarA;
                str3 = str2;
                cVar3 = cVar2;
            } else {
                kk0Var.V();
                x51Var3 = x51Var2;
                cVar3 = cVar2;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 24576;
        x51Var2 = x51Var;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                str2 = str;
                if (kk0Var.h(str2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                if ((i & 1572864) == 0) {
                    oe1Var2 = oe1Var;
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar2 = c.i;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.d(null, 15));
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.j(null, 15));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    int i11110 = i3 >> 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i11110 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11110 & 458752));
                    x51Var3 = x51VarA;
                    k41Var2 = k41VarA;
                    str3 = str2;
                    cVar3 = cVar2;
                } else {
                    kk0Var.V();
                    x51Var3 = x51Var2;
                    cVar3 = cVar2;
                    str3 = str2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
                }
            }
            i3 |= 1572864;
            oe1Var2 = oe1Var;
            if ((599185 & i3) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.d(null, 15));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.j(null, 15));
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11111 = i3 >> 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i11111 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11111 & 458752));
                x51Var3 = x51VarA;
                k41Var2 = k41VarA;
                str3 = str2;
                cVar3 = cVar2;
            } else {
                kk0Var.V();
                x51Var3 = x51Var2;
                cVar3 = cVar2;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 196608;
        str2 = str;
        if ((i2 & 32) != 0) {
            if ((i & 1572864) == 0) {
                oe1Var2 = oe1Var;
                if (kk0Var.j(oe1Var2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar2 = c.i;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.d(null, 15));
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.j(null, 15));
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedVisibility";
                }
                int i11112 = i3 >> 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i11112 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11112 & 458752));
                x51Var3 = x51VarA;
                k41Var2 = k41VarA;
                str3 = str2;
                cVar3 = cVar2;
            } else {
                kk0Var.V();
                x51Var3 = x51Var2;
                cVar3 = cVar2;
                str3 = str2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
            }
        }
        i3 |= 1572864;
        oe1Var2 = oe1Var;
        if ((599185 & i3) != 599184) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kk0Var.S(i3 & 1, z3)) {
            if (i11 != 0) {
                cVar2 = c.i;
            }
            if (i4 != 0) {
                k41VarA = b.e(null, 3).a(b.d(null, 15));
            } else {
                k41VarA = k41Var2;
            }
            if (i6 != 0) {
                x51VarA = b.f(null, 3).a(b.j(null, 15));
            } else {
                x51VarA = x51Var2;
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i11113 = i3 >> 3;
            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str2, kk0Var, (i11113 & 14) | ((i3 >> 12) & 112), 0), v1.y, cVar2, k41VarA, x51VarA, oe1Var2, kk0Var, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i11113 & 458752));
            x51Var3 = x51VarA;
            k41Var2 = k41VarA;
            str3 = str2;
            cVar3 = cVar2;
        } else {
            kk0Var.V();
            x51Var3 = x51Var2;
            cVar3 = cVar2;
            str3 = str2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new kf(lf0Var, z2, cVar3, k41Var2, x51Var3, str3, oe1Var, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void AnimatedVisibility(ni2 ni2Var, c cVar, k41 k41Var, x51 x51Var, String str, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        k41 k41Var2;
        int i5;
        int i6;
        x51 x51Var2;
        int i7;
        int i8;
        int i9;
        oe1 oe1Var2;
        int i10;
        boolean z;
        c cVar3;
        k41 k41Var3;
        x51 x51Var3;
        String str2;
        w33 w33VarV;
        c cVar4;
        k41 k41VarA;
        x51 x51VarA;
        String str3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-222898426);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? kk0Var.h(ni2Var) : kk0Var.j(ni2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    k41Var2 = k41Var;
                    if (kk0Var.h(k41Var2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        x51Var2 = x51Var;
                        if (kk0Var.h(x51Var2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            if (kk0Var.h(str)) {
                                i9 = 16384;
                            } else {
                                i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 196608;
                            oe1Var2 = oe1Var;
                        } else {
                            oe1Var2 = oe1Var;
                            if ((i & 196608) == 0) {
                                if (kk0Var.j(oe1Var2)) {
                                    i10 = 131072;
                                } else {
                                    i10 = 65536;
                                }
                                i3 |= i10;
                            }
                        }
                        if ((74899 & i3) != 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i3 & 1, z)) {
                            if (i11 != 0) {
                                cVar4 = c.i;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.c());
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.f(null, 3).a(b.i());
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            int i12 = i3 << 3;
                            AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i3 & 458752));
                            str2 = str3;
                            cVar3 = cVar4;
                            k41Var3 = k41VarA;
                            x51Var3 = x51VarA;
                        } else {
                            kk0Var.V();
                            cVar3 = cVar2;
                            k41Var3 = k41Var2;
                            x51Var3 = x51Var2;
                            str2 = str;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                        }
                    }
                    i3 |= 24576;
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 196608) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.c());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.i());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i13 = i3 << 3;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i3 & 458752));
                        str2 = str3;
                        cVar3 = cVar4;
                        k41Var3 = k41VarA;
                        x51Var3 = x51VarA;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        k41Var3 = k41Var2;
                        x51Var3 = x51Var2;
                        str2 = str;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                    }
                }
                i3 |= 3072;
                x51Var2 = x51Var;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (kk0Var.h(str)) {
                            i9 = 16384;
                        } else {
                            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 196608) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.c());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.i());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i14 = i3 << 3;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i3 & 458752));
                        str2 = str3;
                        cVar3 = cVar4;
                        k41Var3 = k41VarA;
                        x51Var3 = x51VarA;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        k41Var3 = k41Var2;
                        x51Var3 = x51Var2;
                        str2 = str;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                    }
                }
                i3 |= 24576;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.i());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i15 = i3 << 3;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 384;
            k41Var2 = k41Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    x51Var2 = x51Var;
                    if (kk0Var.h(x51Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (kk0Var.h(str)) {
                            i9 = 16384;
                        } else {
                            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 196608) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.c());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.i());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i16 = i3 << 3;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i3 & 458752));
                        str2 = str3;
                        cVar3 = cVar4;
                        k41Var3 = k41VarA;
                        x51Var3 = x51VarA;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        k41Var3 = k41Var2;
                        x51Var3 = x51Var2;
                        str2 = str;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                    }
                }
                i3 |= 24576;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.i());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i17 = i3 << 3;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i17 & 57344) | (i17 & 896) | 48 | (i17 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 3072;
            x51Var2 = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (kk0Var.h(str)) {
                        i9 = 16384;
                    } else {
                        i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.i());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i18 = i3 << 3;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.i());
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i19 = i3 << 3;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i19 & 57344) | (i19 & 896) | 48 | (i19 & 7168) | (i3 & 458752));
                str2 = str3;
                cVar3 = cVar4;
                k41Var3 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                k41Var3 = k41Var2;
                x51Var3 = x51Var2;
                str2 = str;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                k41Var2 = k41Var;
                if (kk0Var.h(k41Var2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    x51Var2 = x51Var;
                    if (kk0Var.h(x51Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (kk0Var.h(str)) {
                            i9 = 16384;
                        } else {
                            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 196608) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i11 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.c());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.f(null, 3).a(b.i());
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i110 = i3 << 3;
                        AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i110 & 57344) | (i110 & 896) | 48 | (i110 & 7168) | (i3 & 458752));
                        str2 = str3;
                        cVar3 = cVar4;
                        k41Var3 = k41VarA;
                        x51Var3 = x51VarA;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        k41Var3 = k41Var2;
                        x51Var3 = x51Var2;
                        str2 = str;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                    }
                }
                i3 |= 24576;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.i());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i111 = i3 << 3;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i111 & 57344) | (i111 & 896) | 48 | (i111 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 3072;
            x51Var2 = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (kk0Var.h(str)) {
                        i9 = 16384;
                    } else {
                        i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.i());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i112 = i3 << 3;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i112 & 57344) | (i112 & 896) | 48 | (i112 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.i());
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i113 = i3 << 3;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i113 & 57344) | (i113 & 896) | 48 | (i113 & 7168) | (i3 & 458752));
                str2 = str3;
                cVar3 = cVar4;
                k41Var3 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                k41Var3 = k41Var2;
                x51Var3 = x51Var2;
                str2 = str;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
            }
        }
        i3 |= 384;
        k41Var2 = k41Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                x51Var2 = x51Var;
                if (kk0Var.h(x51Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (kk0Var.h(str)) {
                        i9 = 16384;
                    } else {
                        i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.f(null, 3).a(b.i());
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i114 = i3 << 3;
                    AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i114 & 57344) | (i114 & 896) | 48 | (i114 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.i());
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i115 = i3 << 3;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i115 & 57344) | (i115 & 896) | 48 | (i115 & 7168) | (i3 & 458752));
                str2 = str3;
                cVar3 = cVar4;
                k41Var3 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                k41Var3 = k41Var2;
                x51Var3 = x51Var2;
                str2 = str;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
            }
        }
        i3 |= 3072;
        x51Var2 = x51Var;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                if (kk0Var.h(str)) {
                    i9 = 16384;
                } else {
                    i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i11 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.f(null, 3).a(b.i());
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i116 = i3 << 3;
                AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i116 & 57344) | (i116 & 896) | 48 | (i116 & 7168) | (i3 & 458752));
                str2 = str3;
                cVar3 = cVar4;
                k41Var3 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                k41Var3 = k41Var2;
                x51Var3 = x51Var2;
                str2 = str;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
            }
        }
        i3 |= 24576;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            oe1Var2 = oe1Var;
        } else {
            oe1Var2 = oe1Var;
            if ((i & 196608) == 0) {
                if (kk0Var.j(oe1Var2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i11 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            if (i4 != 0) {
                k41VarA = b.e(null, 3).a(b.c());
            } else {
                k41VarA = k41Var2;
            }
            if (i6 != 0) {
                x51VarA = b.f(null, 3).a(b.i());
            } else {
                x51VarA = x51Var2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            int i117 = i3 << 3;
            AnimatedVisibilityImpl(b64.rememberTransition(ni2Var, str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.z, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i117 & 57344) | (i117 & 896) | 48 | (i117 & 7168) | (i3 & 458752));
            str2 = str3;
            cVar3 = cVar4;
            k41Var3 = k41VarA;
            x51Var3 = x51VarA;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
            k41Var3 = k41Var2;
            x51Var3 = x51Var2;
            str2 = str;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new hf(ni2Var, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final <T> void AnimatedVisibility(o54 o54Var, le1 le1Var, c cVar, k41 k41Var, x51 x51Var, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        o54 o54Var2;
        int i3;
        le1 le1Var2;
        c cVar2;
        int i4;
        k41 k41Var2;
        int i5;
        int i6;
        x51 x51Var2;
        int i7;
        oe1 oe1Var2;
        int i8;
        boolean z;
        c cVar3;
        x51 x51Var3;
        w33 w33VarV;
        c cVar4;
        k41 k41VarA;
        x51 x51VarA;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1031950689);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
            o54Var2 = o54Var;
        } else {
            o54Var2 = o54Var;
            if ((i & 6) == 0) {
                i3 = (kk0Var.h(o54Var2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
            le1Var2 = le1Var;
        } else {
            le1Var2 = le1Var;
            if ((i & 48) == 0) {
                i3 |= kk0Var.j(le1Var2) ? 32 : 16;
            }
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    k41Var2 = k41Var;
                    if (kk0Var.h(k41Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        x51Var2 = x51Var;
                        if (kk0Var.h(x51Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 196608;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 196608) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i3 |= i8;
                        }
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i9 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.c());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.i().a(b.f(null, 3));
                        } else {
                            x51VarA = x51Var2;
                        }
                        AnimatedVisibilityImpl(o54Var2, le1Var2, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, i3 & 524286);
                        cVar3 = cVar4;
                        k41Var2 = k41VarA;
                        x51Var3 = x51VarA;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        x51Var3 = x51Var2;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new hf(o54Var, le1Var, cVar3, k41Var2, x51Var3, oe1Var, i, i2));
                    }
                }
                i3 |= 24576;
                x51Var2 = x51Var;
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i9 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.i().a(b.f(null, 3));
                    } else {
                        x51VarA = x51Var2;
                    }
                    AnimatedVisibilityImpl(o54Var2, le1Var2, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, i3 & 524286);
                    cVar3 = cVar4;
                    k41Var2 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    x51Var3 = x51Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hf(o54Var, le1Var, cVar3, k41Var2, x51Var3, oe1Var, i, i2));
                }
            }
            i3 |= 3072;
            k41Var2 = k41Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    x51Var2 = x51Var;
                    if (kk0Var.h(x51Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i9 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.i().a(b.f(null, 3));
                    } else {
                        x51VarA = x51Var2;
                    }
                    AnimatedVisibilityImpl(o54Var2, le1Var2, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, i3 & 524286);
                    cVar3 = cVar4;
                    k41Var2 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    x51Var3 = x51Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hf(o54Var, le1Var, cVar3, k41Var2, x51Var3, oe1Var, i, i2));
                }
            }
            i3 |= 24576;
            x51Var2 = x51Var;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i9 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.i().a(b.f(null, 3));
                } else {
                    x51VarA = x51Var2;
                }
                AnimatedVisibilityImpl(o54Var2, le1Var2, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, i3 & 524286);
                cVar3 = cVar4;
                k41Var2 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                x51Var3 = x51Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hf(o54Var, le1Var, cVar3, k41Var2, x51Var3, oe1Var, i, i2));
            }
        }
        i3 |= 384;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                k41Var2 = k41Var;
                if (kk0Var.h(k41Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    x51Var2 = x51Var;
                    if (kk0Var.h(x51Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i9 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.i().a(b.f(null, 3));
                    } else {
                        x51VarA = x51Var2;
                    }
                    AnimatedVisibilityImpl(o54Var2, le1Var2, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, i3 & 524286);
                    cVar3 = cVar4;
                    k41Var2 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    x51Var3 = x51Var2;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new hf(o54Var, le1Var, cVar3, k41Var2, x51Var3, oe1Var, i, i2));
                }
            }
            i3 |= 24576;
            x51Var2 = x51Var;
            if ((i2 & 16) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i9 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.i().a(b.f(null, 3));
                } else {
                    x51VarA = x51Var2;
                }
                AnimatedVisibilityImpl(o54Var2, le1Var2, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, i3 & 524286);
                cVar3 = cVar4;
                k41Var2 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                x51Var3 = x51Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hf(o54Var, le1Var, cVar3, k41Var2, x51Var3, oe1Var, i, i2));
            }
        }
        i3 |= 3072;
        k41Var2 = k41Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                x51Var2 = x51Var;
                if (kk0Var.h(x51Var2)) {
                    i7 = 16384;
                } else {
                    i7 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i9 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.i().a(b.f(null, 3));
                } else {
                    x51VarA = x51Var2;
                }
                AnimatedVisibilityImpl(o54Var2, le1Var2, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, i3 & 524286);
                cVar3 = cVar4;
                k41Var2 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                x51Var3 = x51Var2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new hf(o54Var, le1Var, cVar3, k41Var2, x51Var3, oe1Var, i, i2));
            }
        }
        i3 |= 24576;
        x51Var2 = x51Var;
        if ((i2 & 16) != 0) {
            i3 |= 196608;
            oe1Var2 = oe1Var;
        } else {
            oe1Var2 = oe1Var;
            if ((i & 196608) == 0) {
                if (kk0Var.j(oe1Var2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i9 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            if (i4 != 0) {
                k41VarA = b.e(null, 3).a(b.c());
            } else {
                k41VarA = k41Var2;
            }
            if (i6 != 0) {
                x51VarA = b.i().a(b.f(null, 3));
            } else {
                x51VarA = x51Var2;
            }
            AnimatedVisibilityImpl(o54Var2, le1Var2, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, i3 & 524286);
            cVar3 = cVar4;
            k41Var2 = k41VarA;
            x51Var3 = x51VarA;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
            x51Var3 = x51Var2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new hf(o54Var, le1Var, cVar3, k41Var2, x51Var3, oe1Var, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0122  */
    /* JADX WARN: Code duplicated, block: B:90:0x0130  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void AnimatedVisibility(boolean z, c cVar, k41 k41Var, x51 x51Var, String str, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        boolean z2;
        int i3;
        c cVar2;
        int i4;
        k41 k41Var2;
        int i5;
        int i6;
        x51 x51Var2;
        int i7;
        int i8;
        int i9;
        oe1 oe1Var2;
        int i10;
        boolean z3;
        c cVar3;
        k41 k41Var3;
        x51 x51Var3;
        String str2;
        w33 w33VarV;
        c cVar4;
        k41 k41VarA;
        x51 x51VarA;
        String str3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(2088733774);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (kk0Var.i(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    k41Var2 = k41Var;
                    if (kk0Var.h(k41Var2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        x51Var2 = x51Var;
                        if (kk0Var.h(x51Var2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            if (kk0Var.h(str)) {
                                i9 = 16384;
                            } else {
                                i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 196608;
                            oe1Var2 = oe1Var;
                        } else {
                            oe1Var2 = oe1Var;
                            if ((i & 196608) == 0) {
                                if (kk0Var.j(oe1Var2)) {
                                    i10 = 131072;
                                } else {
                                    i10 = 65536;
                                }
                                i3 |= i10;
                            }
                        }
                        if ((74899 & i3) != 74898) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i11 != 0) {
                                cVar4 = c.i;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i4 != 0) {
                                k41VarA = b.e(null, 3).a(b.c());
                            } else {
                                k41VarA = k41Var2;
                            }
                            if (i6 != 0) {
                                x51VarA = b.i().a(b.f(null, 3));
                            } else {
                                x51VarA = x51Var2;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            int i12 = i3 << 3;
                            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i3 & 458752));
                            str2 = str3;
                            cVar3 = cVar4;
                            k41Var3 = k41VarA;
                            x51Var3 = x51VarA;
                        } else {
                            kk0Var.V();
                            cVar3 = cVar2;
                            k41Var3 = k41Var2;
                            x51Var3 = x51Var2;
                            str2 = str;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                        }
                    }
                    i3 |= 24576;
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 196608) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.c());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.i().a(b.f(null, 3));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i13 = i3 << 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i3 & 458752));
                        str2 = str3;
                        cVar3 = cVar4;
                        k41Var3 = k41VarA;
                        x51Var3 = x51VarA;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        k41Var3 = k41Var2;
                        x51Var3 = x51Var2;
                        str2 = str;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                    }
                }
                i3 |= 3072;
                x51Var2 = x51Var;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (kk0Var.h(str)) {
                            i9 = 16384;
                        } else {
                            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 196608) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.c());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.i().a(b.f(null, 3));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i14 = i3 << 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i3 & 458752));
                        str2 = str3;
                        cVar3 = cVar4;
                        k41Var3 = k41VarA;
                        x51Var3 = x51VarA;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        k41Var3 = k41Var2;
                        x51Var3 = x51Var2;
                        str2 = str;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                    }
                }
                i3 |= 24576;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.i().a(b.f(null, 3));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i15 = i3 << 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 384;
            k41Var2 = k41Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    x51Var2 = x51Var;
                    if (kk0Var.h(x51Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (kk0Var.h(str)) {
                            i9 = 16384;
                        } else {
                            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 196608) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.c());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.i().a(b.f(null, 3));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i16 = i3 << 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i3 & 458752));
                        str2 = str3;
                        cVar3 = cVar4;
                        k41Var3 = k41VarA;
                        x51Var3 = x51VarA;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        k41Var3 = k41Var2;
                        x51Var3 = x51Var2;
                        str2 = str;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                    }
                }
                i3 |= 24576;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.i().a(b.f(null, 3));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i17 = i3 << 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i17 & 57344) | (i17 & 896) | 48 | (i17 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 3072;
            x51Var2 = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (kk0Var.h(str)) {
                        i9 = 16384;
                    } else {
                        i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.i().a(b.f(null, 3));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i18 = i3 << 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.i().a(b.f(null, 3));
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i19 = i3 << 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i19 & 57344) | (i19 & 896) | 48 | (i19 & 7168) | (i3 & 458752));
                str2 = str3;
                cVar3 = cVar4;
                k41Var3 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                k41Var3 = k41Var2;
                x51Var3 = x51Var2;
                str2 = str;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                k41Var2 = k41Var;
                if (kk0Var.h(k41Var2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    x51Var2 = x51Var;
                    if (kk0Var.h(x51Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (kk0Var.h(str)) {
                            i9 = 16384;
                        } else {
                            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                        oe1Var2 = oe1Var;
                    } else {
                        oe1Var2 = oe1Var;
                        if ((i & 196608) == 0) {
                            if (kk0Var.j(oe1Var2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i11 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            k41VarA = b.e(null, 3).a(b.c());
                        } else {
                            k41VarA = k41Var2;
                        }
                        if (i6 != 0) {
                            x51VarA = b.i().a(b.f(null, 3));
                        } else {
                            x51VarA = x51Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i110 = i3 << 3;
                        AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i110 & 57344) | (i110 & 896) | 48 | (i110 & 7168) | (i3 & 458752));
                        str2 = str3;
                        cVar3 = cVar4;
                        k41Var3 = k41VarA;
                        x51Var3 = x51VarA;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        k41Var3 = k41Var2;
                        x51Var3 = x51Var2;
                        str2 = str;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                    }
                }
                i3 |= 24576;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.i().a(b.f(null, 3));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i111 = i3 << 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i111 & 57344) | (i111 & 896) | 48 | (i111 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 3072;
            x51Var2 = x51Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (kk0Var.h(str)) {
                        i9 = 16384;
                    } else {
                        i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.i().a(b.f(null, 3));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i112 = i3 << 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i112 & 57344) | (i112 & 896) | 48 | (i112 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.i().a(b.f(null, 3));
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i113 = i3 << 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i113 & 57344) | (i113 & 896) | 48 | (i113 & 7168) | (i3 & 458752));
                str2 = str3;
                cVar3 = cVar4;
                k41Var3 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                k41Var3 = k41Var2;
                x51Var3 = x51Var2;
                str2 = str;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
            }
        }
        i3 |= 384;
        k41Var2 = k41Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                x51Var2 = x51Var;
                if (kk0Var.h(x51Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (kk0Var.h(str)) {
                        i9 = 16384;
                    } else {
                        i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                    oe1Var2 = oe1Var;
                } else {
                    oe1Var2 = oe1Var;
                    if ((i & 196608) == 0) {
                        if (kk0Var.j(oe1Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i11 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        k41VarA = b.e(null, 3).a(b.c());
                    } else {
                        k41VarA = k41Var2;
                    }
                    if (i6 != 0) {
                        x51VarA = b.i().a(b.f(null, 3));
                    } else {
                        x51VarA = x51Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i114 = i3 << 3;
                    AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i114 & 57344) | (i114 & 896) | 48 | (i114 & 7168) | (i3 & 458752));
                    str2 = str3;
                    cVar3 = cVar4;
                    k41Var3 = k41VarA;
                    x51Var3 = x51VarA;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    k41Var3 = k41Var2;
                    x51Var3 = x51Var2;
                    str2 = str;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
                }
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.i().a(b.f(null, 3));
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i115 = i3 << 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i115 & 57344) | (i115 & 896) | 48 | (i115 & 7168) | (i3 & 458752));
                str2 = str3;
                cVar3 = cVar4;
                k41Var3 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                k41Var3 = k41Var2;
                x51Var3 = x51Var2;
                str2 = str;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
            }
        }
        i3 |= 3072;
        x51Var2 = x51Var;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                if (kk0Var.h(str)) {
                    i9 = 16384;
                } else {
                    i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
                oe1Var2 = oe1Var;
            } else {
                oe1Var2 = oe1Var;
                if ((i & 196608) == 0) {
                    if (kk0Var.j(oe1Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i11 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    k41VarA = b.e(null, 3).a(b.c());
                } else {
                    k41VarA = k41Var2;
                }
                if (i6 != 0) {
                    x51VarA = b.i().a(b.f(null, 3));
                } else {
                    x51VarA = x51Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i116 = i3 << 3;
                AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i116 & 57344) | (i116 & 896) | 48 | (i116 & 7168) | (i3 & 458752));
                str2 = str3;
                cVar3 = cVar4;
                k41Var3 = k41VarA;
                x51Var3 = x51VarA;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                k41Var3 = k41Var2;
                x51Var3 = x51Var2;
                str2 = str;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
            }
        }
        i3 |= 24576;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            oe1Var2 = oe1Var;
        } else {
            oe1Var2 = oe1Var;
            if ((i & 196608) == 0) {
                if (kk0Var.j(oe1Var2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
        }
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kk0Var.S(i3 & 1, z3)) {
            if (i11 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            if (i4 != 0) {
                k41VarA = b.e(null, 3).a(b.c());
            } else {
                k41VarA = k41Var2;
            }
            if (i6 != 0) {
                x51VarA = b.i().a(b.f(null, 3));
            } else {
                x51VarA = x51Var2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            int i117 = i3 << 3;
            AnimatedVisibilityImpl(b64.updateTransition(Boolean.valueOf(z2), str3, kk0Var, (i3 & 14) | ((i3 >> 9) & 112), 0), v1.w, cVar4, k41VarA, x51VarA, oe1Var2, kk0Var, (i117 & 57344) | (i117 & 896) | 48 | (i117 & 7168) | (i3 & 458752));
            str2 = str3;
            cVar3 = cVar4;
            k41Var3 = k41VarA;
            x51Var3 = x51VarA;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
            k41Var3 = k41Var2;
            x51Var3 = x51Var2;
            str2 = str;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new jf(z2, cVar3, k41Var3, x51Var3, str2, oe1Var, i, i2));
        }
    }

    public static final <T> void AnimatedVisibilityImpl(o54 o54Var, le1 le1Var, c cVar, k41 k41Var, x51 x51Var, oe1 oe1Var, ck0 ck0Var, int i) {
        int i2;
        k41 k41Var2;
        oe1 oe1Var2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(429978603);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(o54Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(le1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.h(cVar) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            k41Var2 = k41Var;
            i2 |= kk0Var.h(k41Var2) ? 2048 : 1024;
        } else {
            k41Var2 = k41Var;
        }
        if ((i & 24576) == 0) {
            i2 |= kk0Var.h(x51Var) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((i & 196608) == 0) {
            oe1Var2 = oe1Var;
            i2 |= kk0Var.j(oe1Var2) ? 131072 : 65536;
        } else {
            oe1Var2 = oe1Var;
        }
        int i3 = 0;
        if (kk0Var.S(i2 & 1, (74899 & i2) != 74898)) {
            int i4 = i2 & 112;
            int i5 = i2 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object objP = kk0Var.P();
            if (z || objP == Composer$Companion.getEmpty()) {
                objP = new lf(le1Var, i3, o54Var);
                kk0Var.l0(objP);
            }
            AnimatedEnterExitImpl(o54Var, le1Var, a.b(cVar, (oe1) objP), k41Var2, x51Var, pe.t, null, oe1Var2, kk0Var, ((i2 << 6) & 29360128) | 196608 | i5 | i4 | (i2 & 7168) | (57344 & i2), 64);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new mf(o54Var, le1Var, cVar, k41Var, x51Var, oe1Var, i, 0));
        }
    }

    private static final <T> d41 targetEnterExit(o54 o54Var, le1 le1Var, T t, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.W(-902032957, 0, o54Var, null);
        boolean zF = o54Var.f();
        d41 d41Var = d41.c;
        d41 d41Var2 = d41.h;
        d41 d41Var3 = d41.d;
        if (zF) {
            kk0Var.a0(2101770115);
            kk0Var.r(false);
            if (((Boolean) le1Var.invoke(t)).booleanValue()) {
                d41Var = d41Var3;
            } else if (((Boolean) le1Var.invoke(o54Var.b())).booleanValue()) {
                d41Var = d41Var2;
            }
        } else {
            kk0Var.a0(2102044248);
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = cl3.d(Boolean.FALSE);
                kk0Var.l0(objP);
            }
            mi2 mi2Var = (mi2) objP;
            if (((Boolean) le1Var.invoke(o54Var.b())).booleanValue()) {
                mi2Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) le1Var.invoke(t)).booleanValue()) {
                d41Var = d41Var3;
            } else if (((Boolean) mi2Var.getValue()).booleanValue()) {
                d41Var = d41Var2;
            }
            kk0Var.r(false);
        }
        kk0Var.r(false);
        return d41Var;
    }
}
