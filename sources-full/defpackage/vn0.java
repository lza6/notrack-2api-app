package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class vn0 {
    public static final void ContextMenu(ho0 ho0Var, je1 je1Var, c cVar, le1 le1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(645832757);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(ho0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.h(cVar) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= kk0Var.j(le1Var) ? 2048 : 1024;
        }
        if (kk0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            c cVar3 = i4 != 0 ? c.i : cVar;
            go0 go0Var = (go0) ho0Var.a.getValue();
            if (!(go0Var instanceof fo0)) {
                w33 w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new un0(ho0Var, je1Var, cVar3, le1Var, i, i2, 0));
                    return;
                }
                return;
            }
            c cVar4 = cVar3;
            boolean zH = kk0Var.h(go0Var);
            Object objP = kk0Var.P();
            if (zH || objP == Composer$Companion.getEmpty()) {
                objP = new ao0(g13.M(((fo0) go0Var).a));
                kk0Var.l0(objP);
            }
            ko0.ContextMenuPopup((ao0) objP, je1Var, cVar4, le1Var, kk0Var, i3 & 8176, 0);
            cVar2 = cVar4;
        } else {
            kk0Var.V();
            cVar2 = cVar;
        }
        w33 w33VarV2 = kk0Var.v();
        if (w33VarV2 != null) {
            w33VarV2.updateScope(new un0(ho0Var, je1Var, cVar2, le1Var, i, i2, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x010f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0115  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:109:0x015b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0162  */
    /* JADX WARN: Code duplicated, block: B:112:0x0166  */
    /* JADX WARN: Code duplicated, block: B:115:0x0171  */
    /* JADX WARN: Code duplicated, block: B:117:0x017f  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x0105  */
    /* JADX WARN: Code duplicated, block: B:99:0x0107  */
    public static final void ContextMenuArea(ho0 ho0Var, je1 je1Var, le1 le1Var, c cVar, boolean z, je1 je1Var2, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        je1 je1Var3;
        le1 le1Var2;
        int i4;
        int i5;
        c cVar2;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        je1 je1Var4;
        int i10;
        int i11;
        int i12;
        boolean z3;
        boolean z4;
        je1 je1Var5;
        w33 w33VarV;
        int i13;
        c cVarB;
        vb2 vb2VarC;
        int currentCompositeKeyHash;
        su2 su2VarN;
        c cVarD;
        d4 constructor;
        pe peVarH;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objP;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1969259374);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(ho0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                je1Var3 = je1Var;
                i3 |= kk0Var.j(je1Var3) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 384) == 0) {
                    le1Var2 = le1Var;
                    if (kk0Var.j(le1Var2)) {
                        i4 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i4 = Uuid.SIZE_BITS;
                    }
                    i3 |= i4;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    if ((i & 3072) == 0) {
                        cVar2 = cVar;
                        if (kk0Var.h(cVar2)) {
                            i6 = 2048;
                        } else {
                            i6 = 1024;
                        }
                        i3 |= i6;
                    }
                    i7 = i2 & 16;
                    if (i7 != 0) {
                        if ((i & 24576) == 0) {
                            z2 = z;
                            if (kk0Var.i(z2)) {
                                i8 = 16384;
                            } else {
                                i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                            }
                            i3 |= i8;
                        }
                        i9 = i2 & 32;
                        if (i9 != 0) {
                            if ((196608 & i) == 0) {
                                je1Var4 = je1Var2;
                                if (kk0Var.j(je1Var4)) {
                                    i10 = 131072;
                                } else {
                                    i10 = 65536;
                                }
                                i3 |= i10;
                            }
                            if ((i2 & 64) != 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                if (kk0Var.j(ne1Var)) {
                                    i11 = 1048576;
                                } else {
                                    i11 = 524288;
                                }
                                i3 |= i11;
                            }
                            i12 = 0;
                            if ((599187 & i3) != 599186) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (kk0Var.S(i3 & 1, z3)) {
                                if (i5 != 0) {
                                    cVar2 = c.i;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if (i9 != 0) {
                                    je1Var4 = d4.z;
                                }
                                i13 = 14;
                                if (z2) {
                                    kk0Var.a0(1021907653);
                                    if ((458752 & i3) == 131072) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if ((i3 & 14) == 4) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    z7 = z5 | z6;
                                    objP = kk0Var.P();
                                    if (z7 || objP == Composer$Companion.getEmpty()) {
                                        objP = new rc(je1Var4, i13, ho0Var);
                                        kk0Var.l0(objP);
                                    }
                                    cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                                    kk0Var.r(false);
                                } else {
                                    kk0Var.a0(1022064513);
                                    kk0Var.r(false);
                                    cVarB = cVar2;
                                }
                                vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                                su2VarN = kk0Var.n();
                                cVarD = b.d(kk0Var, cVarB);
                                a.j.getClass();
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
                                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                                if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                                }
                                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                                ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                                ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                                kk0Var.r(true);
                            } else {
                                kk0Var.V();
                            }
                            z4 = z2;
                            je1Var5 = je1Var4;
                            w33VarV = kk0Var.v();
                            if (w33VarV != null) {
                                w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                            }
                        }
                        i3 |= 196608;
                        je1Var4 = je1Var2;
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (kk0Var.j(ne1Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = 0;
                        if ((599187 & i3) != 599186) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i5 != 0) {
                                cVar2 = c.i;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                je1Var4 = d4.z;
                            }
                            i13 = 14;
                            if (z2) {
                                kk0Var.a0(1021907653);
                                if ((458752 & i3) == 131072) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if ((i3 & 14) == 4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z7 = z5 | z6;
                                objP = kk0Var.P();
                                if (z7) {
                                    objP = new rc(je1Var4, i13, ho0Var);
                                    kk0Var.l0(objP);
                                } else {
                                    objP = new rc(je1Var4, i13, ho0Var);
                                    kk0Var.l0(objP);
                                }
                                cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                                kk0Var.r(false);
                            } else {
                                kk0Var.a0(1022064513);
                                kk0Var.r(false);
                                cVarB = cVar2;
                            }
                            vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN = kk0Var.n();
                            cVarD = b.d(kk0Var, cVarB);
                            a.j.getClass();
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
                            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                            if (kk0Var.O) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            } else {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            }
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                            ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                            kk0Var.r(true);
                        } else {
                            kk0Var.V();
                        }
                        z4 = z2;
                        je1Var5 = je1Var4;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                        }
                    }
                    i3 |= 24576;
                    z2 = z;
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            je1Var4 = je1Var2;
                            if (kk0Var.j(je1Var4)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (kk0Var.j(ne1Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = 0;
                        if ((599187 & i3) != 599186) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i5 != 0) {
                                cVar2 = c.i;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                je1Var4 = d4.z;
                            }
                            i13 = 14;
                            if (z2) {
                                kk0Var.a0(1021907653);
                                if ((458752 & i3) == 131072) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if ((i3 & 14) == 4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z7 = z5 | z6;
                                objP = kk0Var.P();
                                if (z7) {
                                    objP = new rc(je1Var4, i13, ho0Var);
                                    kk0Var.l0(objP);
                                } else {
                                    objP = new rc(je1Var4, i13, ho0Var);
                                    kk0Var.l0(objP);
                                }
                                cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                                kk0Var.r(false);
                            } else {
                                kk0Var.a0(1022064513);
                                kk0Var.r(false);
                                cVarB = cVar2;
                            }
                            vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN = kk0Var.n();
                            cVarD = b.d(kk0Var, cVarB);
                            a.j.getClass();
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
                            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                            if (kk0Var.O) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            } else {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            }
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                            ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                            kk0Var.r(true);
                        } else {
                            kk0Var.V();
                        }
                        z4 = z2;
                        je1Var5 = je1Var4;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                        }
                    }
                    i3 |= 196608;
                    je1Var4 = je1Var2;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = 0;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i5 != 0) {
                            cVar2 = c.i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            je1Var4 = d4.z;
                        }
                        i13 = 14;
                        if (z2) {
                            kk0Var.a0(1021907653);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objP = kk0Var.P();
                            if (z7) {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            } else {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            }
                            cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(1022064513);
                            kk0Var.r(false);
                            cVarB = cVar2;
                        }
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        a.j.getClass();
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
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                        kk0Var.r(true);
                    } else {
                        kk0Var.V();
                    }
                    z4 = z2;
                    je1Var5 = je1Var4;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 3072;
                cVar2 = cVar;
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        if (kk0Var.i(z2)) {
                            i8 = 16384;
                        } else {
                            i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            je1Var4 = je1Var2;
                            if (kk0Var.j(je1Var4)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (kk0Var.j(ne1Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = 0;
                        if ((599187 & i3) != 599186) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i5 != 0) {
                                cVar2 = c.i;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                je1Var4 = d4.z;
                            }
                            i13 = 14;
                            if (z2) {
                                kk0Var.a0(1021907653);
                                if ((458752 & i3) == 131072) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if ((i3 & 14) == 4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z7 = z5 | z6;
                                objP = kk0Var.P();
                                if (z7) {
                                    objP = new rc(je1Var4, i13, ho0Var);
                                    kk0Var.l0(objP);
                                } else {
                                    objP = new rc(je1Var4, i13, ho0Var);
                                    kk0Var.l0(objP);
                                }
                                cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                                kk0Var.r(false);
                            } else {
                                kk0Var.a0(1022064513);
                                kk0Var.r(false);
                                cVarB = cVar2;
                            }
                            vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN = kk0Var.n();
                            cVarD = b.d(kk0Var, cVarB);
                            a.j.getClass();
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
                            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                            if (kk0Var.O) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            } else {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            }
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                            ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                            kk0Var.r(true);
                        } else {
                            kk0Var.V();
                        }
                        z4 = z2;
                        je1Var5 = je1Var4;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                        }
                    }
                    i3 |= 196608;
                    je1Var4 = je1Var2;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = 0;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i5 != 0) {
                            cVar2 = c.i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            je1Var4 = d4.z;
                        }
                        i13 = 14;
                        if (z2) {
                            kk0Var.a0(1021907653);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objP = kk0Var.P();
                            if (z7) {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            } else {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            }
                            cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(1022064513);
                            kk0Var.r(false);
                            cVarB = cVar2;
                        }
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        a.j.getClass();
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
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                        kk0Var.r(true);
                    } else {
                        kk0Var.V();
                    }
                    z4 = z2;
                    je1Var5 = je1Var4;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 24576;
                z2 = z;
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        je1Var4 = je1Var2;
                        if (kk0Var.j(je1Var4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = 0;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i5 != 0) {
                            cVar2 = c.i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            je1Var4 = d4.z;
                        }
                        i13 = 14;
                        if (z2) {
                            kk0Var.a0(1021907653);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objP = kk0Var.P();
                            if (z7) {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            } else {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            }
                            cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(1022064513);
                            kk0Var.r(false);
                            cVarB = cVar2;
                        }
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        a.j.getClass();
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
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                        kk0Var.r(true);
                    } else {
                        kk0Var.V();
                    }
                    z4 = z2;
                    je1Var5 = je1Var4;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 196608;
                je1Var4 = je1Var2;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = 0;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i5 != 0) {
                        cVar2 = c.i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        je1Var4 = d4.z;
                    }
                    i13 = 14;
                    if (z2) {
                        kk0Var.a0(1021907653);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objP = kk0Var.P();
                        if (z7) {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        } else {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        }
                        cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1022064513);
                        kk0Var.r(false);
                        cVarB = cVar2;
                    }
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB);
                    a.j.getClass();
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
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                    ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                    kk0Var.r(true);
                } else {
                    kk0Var.V();
                }
                z4 = z2;
                je1Var5 = je1Var4;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                }
            }
            i3 |= 384;
            le1Var2 = le1Var;
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    cVar2 = cVar;
                    if (kk0Var.h(cVar2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        if (kk0Var.i(z2)) {
                            i8 = 16384;
                        } else {
                            i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            je1Var4 = je1Var2;
                            if (kk0Var.j(je1Var4)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (kk0Var.j(ne1Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = 0;
                        if ((599187 & i3) != 599186) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i5 != 0) {
                                cVar2 = c.i;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                je1Var4 = d4.z;
                            }
                            i13 = 14;
                            if (z2) {
                                kk0Var.a0(1021907653);
                                if ((458752 & i3) == 131072) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if ((i3 & 14) == 4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z7 = z5 | z6;
                                objP = kk0Var.P();
                                if (z7) {
                                    objP = new rc(je1Var4, i13, ho0Var);
                                    kk0Var.l0(objP);
                                } else {
                                    objP = new rc(je1Var4, i13, ho0Var);
                                    kk0Var.l0(objP);
                                }
                                cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                                kk0Var.r(false);
                            } else {
                                kk0Var.a0(1022064513);
                                kk0Var.r(false);
                                cVarB = cVar2;
                            }
                            vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN = kk0Var.n();
                            cVarD = b.d(kk0Var, cVarB);
                            a.j.getClass();
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
                            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                            if (kk0Var.O) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            } else {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            }
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                            ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                            kk0Var.r(true);
                        } else {
                            kk0Var.V();
                        }
                        z4 = z2;
                        je1Var5 = je1Var4;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                        }
                    }
                    i3 |= 196608;
                    je1Var4 = je1Var2;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = 0;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i5 != 0) {
                            cVar2 = c.i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            je1Var4 = d4.z;
                        }
                        i13 = 14;
                        if (z2) {
                            kk0Var.a0(1021907653);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objP = kk0Var.P();
                            if (z7) {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            } else {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            }
                            cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(1022064513);
                            kk0Var.r(false);
                            cVarB = cVar2;
                        }
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        a.j.getClass();
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
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                        kk0Var.r(true);
                    } else {
                        kk0Var.V();
                    }
                    z4 = z2;
                    je1Var5 = je1Var4;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 24576;
                z2 = z;
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        je1Var4 = je1Var2;
                        if (kk0Var.j(je1Var4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = 0;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i5 != 0) {
                            cVar2 = c.i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            je1Var4 = d4.z;
                        }
                        i13 = 14;
                        if (z2) {
                            kk0Var.a0(1021907653);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objP = kk0Var.P();
                            if (z7) {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            } else {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            }
                            cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(1022064513);
                            kk0Var.r(false);
                            cVarB = cVar2;
                        }
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        a.j.getClass();
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
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                        kk0Var.r(true);
                    } else {
                        kk0Var.V();
                    }
                    z4 = z2;
                    je1Var5 = je1Var4;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 196608;
                je1Var4 = je1Var2;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = 0;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i5 != 0) {
                        cVar2 = c.i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        je1Var4 = d4.z;
                    }
                    i13 = 14;
                    if (z2) {
                        kk0Var.a0(1021907653);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objP = kk0Var.P();
                        if (z7) {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        } else {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        }
                        cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1022064513);
                        kk0Var.r(false);
                        cVarB = cVar2;
                    }
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB);
                    a.j.getClass();
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
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                    ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                    kk0Var.r(true);
                } else {
                    kk0Var.V();
                }
                z4 = z2;
                je1Var5 = je1Var4;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                }
            }
            i3 |= 3072;
            cVar2 = cVar;
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (kk0Var.i(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        je1Var4 = je1Var2;
                        if (kk0Var.j(je1Var4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = 0;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i5 != 0) {
                            cVar2 = c.i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            je1Var4 = d4.z;
                        }
                        i13 = 14;
                        if (z2) {
                            kk0Var.a0(1021907653);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objP = kk0Var.P();
                            if (z7) {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            } else {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            }
                            cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(1022064513);
                            kk0Var.r(false);
                            cVarB = cVar2;
                        }
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        a.j.getClass();
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
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                        kk0Var.r(true);
                    } else {
                        kk0Var.V();
                    }
                    z4 = z2;
                    je1Var5 = je1Var4;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 196608;
                je1Var4 = je1Var2;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = 0;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i5 != 0) {
                        cVar2 = c.i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        je1Var4 = d4.z;
                    }
                    i13 = 14;
                    if (z2) {
                        kk0Var.a0(1021907653);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objP = kk0Var.P();
                        if (z7) {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        } else {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        }
                        cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1022064513);
                        kk0Var.r(false);
                        cVarB = cVar2;
                    }
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB);
                    a.j.getClass();
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
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                    ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                    kk0Var.r(true);
                } else {
                    kk0Var.V();
                }
                z4 = z2;
                je1Var5 = je1Var4;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                }
            }
            i3 |= 24576;
            z2 = z;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    je1Var4 = je1Var2;
                    if (kk0Var.j(je1Var4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = 0;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i5 != 0) {
                        cVar2 = c.i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        je1Var4 = d4.z;
                    }
                    i13 = 14;
                    if (z2) {
                        kk0Var.a0(1021907653);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objP = kk0Var.P();
                        if (z7) {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        } else {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        }
                        cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1022064513);
                        kk0Var.r(false);
                        cVarB = cVar2;
                    }
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB);
                    a.j.getClass();
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
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                    ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                    kk0Var.r(true);
                } else {
                    kk0Var.V();
                }
                z4 = z2;
                je1Var5 = je1Var4;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                }
            }
            i3 |= 196608;
            je1Var4 = je1Var2;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = 0;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i5 != 0) {
                    cVar2 = c.i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    je1Var4 = d4.z;
                }
                i13 = 14;
                if (z2) {
                    kk0Var.a0(1021907653);
                    if ((458752 & i3) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i3 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objP = kk0Var.P();
                    if (z7) {
                        objP = new rc(je1Var4, i13, ho0Var);
                        kk0Var.l0(objP);
                    } else {
                        objP = new rc(je1Var4, i13, ho0Var);
                        kk0Var.l0(objP);
                    }
                    cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(1022064513);
                    kk0Var.r(false);
                    cVarB = cVar2;
                }
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB);
                a.j.getClass();
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
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                kk0Var.r(true);
            } else {
                kk0Var.V();
            }
            z4 = z2;
            je1Var5 = je1Var4;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
            }
        }
        i3 |= 48;
        je1Var3 = je1Var;
        if ((i2 & 4) != 0) {
            if ((i & 384) == 0) {
                le1Var2 = le1Var;
                if (kk0Var.j(le1Var2)) {
                    i4 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i4 = Uuid.SIZE_BITS;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    cVar2 = cVar;
                    if (kk0Var.h(cVar2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        if (kk0Var.i(z2)) {
                            i8 = 16384;
                        } else {
                            i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            je1Var4 = je1Var2;
                            if (kk0Var.j(je1Var4)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (kk0Var.j(ne1Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = 0;
                        if ((599187 & i3) != 599186) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (kk0Var.S(i3 & 1, z3)) {
                            if (i5 != 0) {
                                cVar2 = c.i;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                je1Var4 = d4.z;
                            }
                            i13 = 14;
                            if (z2) {
                                kk0Var.a0(1021907653);
                                if ((458752 & i3) == 131072) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if ((i3 & 14) == 4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z7 = z5 | z6;
                                objP = kk0Var.P();
                                if (z7) {
                                    objP = new rc(je1Var4, i13, ho0Var);
                                    kk0Var.l0(objP);
                                } else {
                                    objP = new rc(je1Var4, i13, ho0Var);
                                    kk0Var.l0(objP);
                                }
                                cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                                kk0Var.r(false);
                            } else {
                                kk0Var.a0(1022064513);
                                kk0Var.r(false);
                                cVarB = cVar2;
                            }
                            vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            su2VarN = kk0Var.n();
                            cVarD = b.d(kk0Var, cVarB);
                            a.j.getClass();
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
                            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                            if (kk0Var.O) {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            } else {
                                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                            }
                            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                            ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                            ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                            kk0Var.r(true);
                        } else {
                            kk0Var.V();
                        }
                        z4 = z2;
                        je1Var5 = je1Var4;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                        }
                    }
                    i3 |= 196608;
                    je1Var4 = je1Var2;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = 0;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i5 != 0) {
                            cVar2 = c.i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            je1Var4 = d4.z;
                        }
                        i13 = 14;
                        if (z2) {
                            kk0Var.a0(1021907653);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objP = kk0Var.P();
                            if (z7) {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            } else {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            }
                            cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(1022064513);
                            kk0Var.r(false);
                            cVarB = cVar2;
                        }
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        a.j.getClass();
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
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                        kk0Var.r(true);
                    } else {
                        kk0Var.V();
                    }
                    z4 = z2;
                    je1Var5 = je1Var4;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 24576;
                z2 = z;
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        je1Var4 = je1Var2;
                        if (kk0Var.j(je1Var4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = 0;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i5 != 0) {
                            cVar2 = c.i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            je1Var4 = d4.z;
                        }
                        i13 = 14;
                        if (z2) {
                            kk0Var.a0(1021907653);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objP = kk0Var.P();
                            if (z7) {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            } else {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            }
                            cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(1022064513);
                            kk0Var.r(false);
                            cVarB = cVar2;
                        }
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        a.j.getClass();
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
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                        kk0Var.r(true);
                    } else {
                        kk0Var.V();
                    }
                    z4 = z2;
                    je1Var5 = je1Var4;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 196608;
                je1Var4 = je1Var2;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = 0;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i5 != 0) {
                        cVar2 = c.i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        je1Var4 = d4.z;
                    }
                    i13 = 14;
                    if (z2) {
                        kk0Var.a0(1021907653);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objP = kk0Var.P();
                        if (z7) {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        } else {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        }
                        cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1022064513);
                        kk0Var.r(false);
                        cVarB = cVar2;
                    }
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB);
                    a.j.getClass();
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
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                    ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                    kk0Var.r(true);
                } else {
                    kk0Var.V();
                }
                z4 = z2;
                je1Var5 = je1Var4;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                }
            }
            i3 |= 3072;
            cVar2 = cVar;
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (kk0Var.i(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        je1Var4 = je1Var2;
                        if (kk0Var.j(je1Var4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = 0;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i5 != 0) {
                            cVar2 = c.i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            je1Var4 = d4.z;
                        }
                        i13 = 14;
                        if (z2) {
                            kk0Var.a0(1021907653);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objP = kk0Var.P();
                            if (z7) {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            } else {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            }
                            cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(1022064513);
                            kk0Var.r(false);
                            cVarB = cVar2;
                        }
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        a.j.getClass();
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
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                        kk0Var.r(true);
                    } else {
                        kk0Var.V();
                    }
                    z4 = z2;
                    je1Var5 = je1Var4;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 196608;
                je1Var4 = je1Var2;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = 0;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i5 != 0) {
                        cVar2 = c.i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        je1Var4 = d4.z;
                    }
                    i13 = 14;
                    if (z2) {
                        kk0Var.a0(1021907653);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objP = kk0Var.P();
                        if (z7) {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        } else {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        }
                        cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1022064513);
                        kk0Var.r(false);
                        cVarB = cVar2;
                    }
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB);
                    a.j.getClass();
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
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                    ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                    kk0Var.r(true);
                } else {
                    kk0Var.V();
                }
                z4 = z2;
                je1Var5 = je1Var4;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                }
            }
            i3 |= 24576;
            z2 = z;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    je1Var4 = je1Var2;
                    if (kk0Var.j(je1Var4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = 0;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i5 != 0) {
                        cVar2 = c.i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        je1Var4 = d4.z;
                    }
                    i13 = 14;
                    if (z2) {
                        kk0Var.a0(1021907653);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objP = kk0Var.P();
                        if (z7) {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        } else {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        }
                        cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1022064513);
                        kk0Var.r(false);
                        cVarB = cVar2;
                    }
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB);
                    a.j.getClass();
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
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                    ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                    kk0Var.r(true);
                } else {
                    kk0Var.V();
                }
                z4 = z2;
                je1Var5 = je1Var4;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                }
            }
            i3 |= 196608;
            je1Var4 = je1Var2;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = 0;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i5 != 0) {
                    cVar2 = c.i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    je1Var4 = d4.z;
                }
                i13 = 14;
                if (z2) {
                    kk0Var.a0(1021907653);
                    if ((458752 & i3) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i3 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objP = kk0Var.P();
                    if (z7) {
                        objP = new rc(je1Var4, i13, ho0Var);
                        kk0Var.l0(objP);
                    } else {
                        objP = new rc(je1Var4, i13, ho0Var);
                        kk0Var.l0(objP);
                    }
                    cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(1022064513);
                    kk0Var.r(false);
                    cVarB = cVar2;
                }
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB);
                a.j.getClass();
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
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                kk0Var.r(true);
            } else {
                kk0Var.V();
            }
            z4 = z2;
            je1Var5 = je1Var4;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
            }
        }
        i3 |= 384;
        le1Var2 = le1Var;
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                cVar2 = cVar;
                if (kk0Var.h(cVar2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (kk0Var.i(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        je1Var4 = je1Var2;
                        if (kk0Var.j(je1Var4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (kk0Var.j(ne1Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = 0;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (kk0Var.S(i3 & 1, z3)) {
                        if (i5 != 0) {
                            cVar2 = c.i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            je1Var4 = d4.z;
                        }
                        i13 = 14;
                        if (z2) {
                            kk0Var.a0(1021907653);
                            if ((458752 & i3) == 131072) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((i3 & 14) == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = z5 | z6;
                            objP = kk0Var.P();
                            if (z7) {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            } else {
                                objP = new rc(je1Var4, i13, ho0Var);
                                kk0Var.l0(objP);
                            }
                            cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                            kk0Var.r(false);
                        } else {
                            kk0Var.a0(1022064513);
                            kk0Var.r(false);
                            cVarB = cVar2;
                        }
                        vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        su2VarN = kk0Var.n();
                        cVarD = b.d(kk0Var, cVarB);
                        a.j.getClass();
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
                        peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                        if (kk0Var.O) {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        } else {
                            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                        }
                        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                        ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                        kk0Var.r(true);
                    } else {
                        kk0Var.V();
                    }
                    z4 = z2;
                    je1Var5 = je1Var4;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                    }
                }
                i3 |= 196608;
                je1Var4 = je1Var2;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = 0;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i5 != 0) {
                        cVar2 = c.i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        je1Var4 = d4.z;
                    }
                    i13 = 14;
                    if (z2) {
                        kk0Var.a0(1021907653);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objP = kk0Var.P();
                        if (z7) {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        } else {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        }
                        cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1022064513);
                        kk0Var.r(false);
                        cVarB = cVar2;
                    }
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB);
                    a.j.getClass();
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
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                    ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                    kk0Var.r(true);
                } else {
                    kk0Var.V();
                }
                z4 = z2;
                je1Var5 = je1Var4;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                }
            }
            i3 |= 24576;
            z2 = z;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    je1Var4 = je1Var2;
                    if (kk0Var.j(je1Var4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = 0;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i5 != 0) {
                        cVar2 = c.i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        je1Var4 = d4.z;
                    }
                    i13 = 14;
                    if (z2) {
                        kk0Var.a0(1021907653);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objP = kk0Var.P();
                        if (z7) {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        } else {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        }
                        cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1022064513);
                        kk0Var.r(false);
                        cVarB = cVar2;
                    }
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB);
                    a.j.getClass();
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
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                    ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                    kk0Var.r(true);
                } else {
                    kk0Var.V();
                }
                z4 = z2;
                je1Var5 = je1Var4;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                }
            }
            i3 |= 196608;
            je1Var4 = je1Var2;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = 0;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i5 != 0) {
                    cVar2 = c.i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    je1Var4 = d4.z;
                }
                i13 = 14;
                if (z2) {
                    kk0Var.a0(1021907653);
                    if ((458752 & i3) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i3 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objP = kk0Var.P();
                    if (z7) {
                        objP = new rc(je1Var4, i13, ho0Var);
                        kk0Var.l0(objP);
                    } else {
                        objP = new rc(je1Var4, i13, ho0Var);
                        kk0Var.l0(objP);
                    }
                    cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(1022064513);
                    kk0Var.r(false);
                    cVarB = cVar2;
                }
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB);
                a.j.getClass();
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
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                kk0Var.r(true);
            } else {
                kk0Var.V();
            }
            z4 = z2;
            je1Var5 = je1Var4;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
            }
        }
        i3 |= 3072;
        cVar2 = cVar;
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                if (kk0Var.i(z2)) {
                    i8 = 16384;
                } else {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    je1Var4 = je1Var2;
                    if (kk0Var.j(je1Var4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (kk0Var.j(ne1Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = 0;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kk0Var.S(i3 & 1, z3)) {
                    if (i5 != 0) {
                        cVar2 = c.i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        je1Var4 = d4.z;
                    }
                    i13 = 14;
                    if (z2) {
                        kk0Var.a0(1021907653);
                        if ((458752 & i3) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i3 & 14) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objP = kk0Var.P();
                        if (z7) {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        } else {
                            objP = new rc(je1Var4, i13, ho0Var);
                            kk0Var.l0(objP);
                        }
                        cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1022064513);
                        kk0Var.r(false);
                        cVarB = cVar2;
                    }
                    vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    su2VarN = kk0Var.n();
                    cVarD = b.d(kk0Var, cVarB);
                    a.j.getClass();
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
                    peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                    if (kk0Var.O) {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    } else {
                        fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                    }
                    xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                    ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                    ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                    kk0Var.r(true);
                } else {
                    kk0Var.V();
                }
                z4 = z2;
                je1Var5 = je1Var4;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
                }
            }
            i3 |= 196608;
            je1Var4 = je1Var2;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = 0;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i5 != 0) {
                    cVar2 = c.i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    je1Var4 = d4.z;
                }
                i13 = 14;
                if (z2) {
                    kk0Var.a0(1021907653);
                    if ((458752 & i3) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i3 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objP = kk0Var.P();
                    if (z7) {
                        objP = new rc(je1Var4, i13, ho0Var);
                        kk0Var.l0(objP);
                    } else {
                        objP = new rc(je1Var4, i13, ho0Var);
                        kk0Var.l0(objP);
                    }
                    cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(1022064513);
                    kk0Var.r(false);
                    cVarB = cVar2;
                }
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB);
                a.j.getClass();
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
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                kk0Var.r(true);
            } else {
                kk0Var.V();
            }
            z4 = z2;
            je1Var5 = je1Var4;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
            }
        }
        i3 |= 24576;
        z2 = z;
        i9 = i2 & 32;
        if (i9 != 0) {
            if ((196608 & i) == 0) {
                je1Var4 = je1Var2;
                if (kk0Var.j(je1Var4)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (kk0Var.j(ne1Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = 0;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i5 != 0) {
                    cVar2 = c.i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    je1Var4 = d4.z;
                }
                i13 = 14;
                if (z2) {
                    kk0Var.a0(1021907653);
                    if ((458752 & i3) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i3 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objP = kk0Var.P();
                    if (z7) {
                        objP = new rc(je1Var4, i13, ho0Var);
                        kk0Var.l0(objP);
                    } else {
                        objP = new rc(je1Var4, i13, ho0Var);
                        kk0Var.l0(objP);
                    }
                    cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(1022064513);
                    kk0Var.r(false);
                    cVarB = cVar2;
                }
                vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2VarN = kk0Var.n();
                cVarD = b.d(kk0Var, cVarB);
                a.j.getClass();
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
                peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
                if (kk0Var.O) {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                } else {
                    fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
                }
                xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
                ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
                ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
                kk0Var.r(true);
            } else {
                kk0Var.V();
            }
            z4 = z2;
            je1Var5 = je1Var4;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
            }
        }
        i3 |= 196608;
        je1Var4 = je1Var2;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (kk0Var.j(ne1Var)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        i12 = 0;
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kk0Var.S(i3 & 1, z3)) {
            if (i5 != 0) {
                cVar2 = c.i;
            }
            if (i7 != 0) {
                z2 = true;
            }
            if (i9 != 0) {
                je1Var4 = d4.z;
            }
            i13 = 14;
            if (z2) {
                kk0Var.a0(1021907653);
                if ((458752 & i3) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i3 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z5 | z6;
                objP = kk0Var.P();
                if (z7) {
                    objP = new rc(je1Var4, i13, ho0Var);
                    kk0Var.l0(objP);
                } else {
                    objP = new rc(je1Var4, i13, ho0Var);
                    kk0Var.l0(objP);
                }
                cVarB = oq3.b(cVar2, bg1.l, new yn0((le1) objP, i12));
                kk0Var.r(false);
            } else {
                kk0Var.a0(1022064513);
                kk0Var.r(false);
                cVarB = cVar2;
            }
            vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2VarN = kk0Var.n();
            cVarD = b.d(kk0Var, cVarB);
            a.j.getClass();
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
            peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            } else {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            ne1Var.invoke(kk0Var, Integer.valueOf((i3 >> 18) & 14));
            ContextMenu(ho0Var, je1Var3, null, le1Var2, kk0Var, ((i3 << 3) & 7168) | (i3 & 126), 4);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        z4 = z2;
        je1Var5 = je1Var4;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new kf(ho0Var, je1Var, le1Var, cVar2, z4, je1Var5, ne1Var, i, i2));
        }
    }
}
