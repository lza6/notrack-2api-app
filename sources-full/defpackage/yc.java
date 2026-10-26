package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
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
public abstract class yc {
    public static final dl0 a = new dl0(d4.m);

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v3 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void Popup(defpackage.tx2 r25, defpackage.je1 r26, defpackage.ux2 r27, defpackage.ne1 r28, defpackage.ck0 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc.Popup(tx2, je1, ux2, ne1, ck0, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Popup-K5zGePQ, reason: not valid java name */
    public static final void m1875xa9da4bae(a8 a8Var, long j, je1 je1Var, ux2 ux2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        a8 a8Var2;
        int i3;
        long j2;
        int i4;
        je1 je1Var2;
        int i5;
        int i6;
        ux2 ux2Var2;
        int i7;
        ne1 ne1Var2;
        int i8;
        boolean z;
        a8 a8Var3;
        je1 je1Var3;
        ux2 ux2Var3;
        long j3;
        w33 w33VarV;
        a8 topStart;
        ux2 ux2Var4;
        boolean z2;
        boolean z3;
        Object objP;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(295309329);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            a8Var2 = a8Var;
        } else if ((i & 6) == 0) {
            a8Var2 = a8Var;
            i3 = (kk0Var.h(a8Var2) ? 4 : 2) | i;
        } else {
            a8Var2 = a8Var;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                j2 = j;
                i3 |= kk0Var.g(j2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    je1Var2 = je1Var;
                    if (kk0Var.j(je1Var2)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        ux2Var2 = ux2Var;
                        if (kk0Var.h(ux2Var2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        if ((i & 24576) == 0) {
                            ne1Var2 = ne1Var;
                            if (kk0Var.j(ne1Var2)) {
                                i8 = 16384;
                            } else {
                                i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                            }
                            i3 |= i8;
                        }
                        if ((i3 & 9363) != 9362) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i3 & 1, z)) {
                            if (i9 != 0) {
                                topStart = Alignment$Companion.getTopStart();
                            } else {
                                topStart = a8Var2;
                            }
                            if (i10 != 0) {
                                j2 = 0;
                            }
                            if (i4 != 0) {
                                je1Var2 = null;
                            }
                            if (i6 != 0) {
                                ux2Var4 = new ux2(15);
                            } else {
                                ux2Var4 = ux2Var2;
                            }
                            if ((i3 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z3 = z2 | ((i3 & 112) == 32);
                            objP = kk0Var.P();
                            if (z3 || objP == Composer$Companion.getEmpty()) {
                                objP = new g8(topStart, j2);
                                kk0Var.l0(objP);
                            }
                            je1 je1Var4 = je1Var2;
                            Popup((g8) objP, je1Var4, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                            ux2Var3 = ux2Var4;
                            je1Var3 = je1Var4;
                            a8Var3 = topStart;
                        } else {
                            kk0Var.V();
                            a8Var3 = a8Var2;
                            je1Var3 = je1Var2;
                            ux2Var3 = ux2Var2;
                        }
                        j3 = j2;
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                        }
                    }
                    i3 |= 24576;
                    ne1Var2 = ne1Var;
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i9 != 0) {
                            topStart = Alignment$Companion.getTopStart();
                        } else {
                            topStart = a8Var2;
                        }
                        if (i10 != 0) {
                            j2 = 0;
                        }
                        if (i4 != 0) {
                            je1Var2 = null;
                        }
                        if (i6 != 0) {
                            ux2Var4 = new ux2(15);
                        } else {
                            ux2Var4 = ux2Var2;
                        }
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | ((i3 & 112) == 32);
                        objP = kk0Var.P();
                        if (z3) {
                            objP = new g8(topStart, j2);
                            kk0Var.l0(objP);
                        } else {
                            objP = new g8(topStart, j2);
                            kk0Var.l0(objP);
                        }
                        je1 je1Var5 = je1Var2;
                        Popup((g8) objP, je1Var5, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                        ux2Var3 = ux2Var4;
                        je1Var3 = je1Var5;
                        a8Var3 = topStart;
                    } else {
                        kk0Var.V();
                        a8Var3 = a8Var2;
                        je1Var3 = je1Var2;
                        ux2Var3 = ux2Var2;
                    }
                    j3 = j2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                    }
                }
                i3 |= 3072;
                ux2Var2 = ux2Var;
                if ((i2 & 16) != 0) {
                    if ((i & 24576) == 0) {
                        ne1Var2 = ne1Var;
                        if (kk0Var.j(ne1Var2)) {
                            i8 = 16384;
                        } else {
                            i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i9 != 0) {
                            topStart = Alignment$Companion.getTopStart();
                        } else {
                            topStart = a8Var2;
                        }
                        if (i10 != 0) {
                            j2 = 0;
                        }
                        if (i4 != 0) {
                            je1Var2 = null;
                        }
                        if (i6 != 0) {
                            ux2Var4 = new ux2(15);
                        } else {
                            ux2Var4 = ux2Var2;
                        }
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | ((i3 & 112) == 32);
                        objP = kk0Var.P();
                        if (z3) {
                            objP = new g8(topStart, j2);
                            kk0Var.l0(objP);
                        } else {
                            objP = new g8(topStart, j2);
                            kk0Var.l0(objP);
                        }
                        je1 je1Var6 = je1Var2;
                        Popup((g8) objP, je1Var6, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                        ux2Var3 = ux2Var4;
                        je1Var3 = je1Var6;
                        a8Var3 = topStart;
                    } else {
                        kk0Var.V();
                        a8Var3 = a8Var2;
                        je1Var3 = je1Var2;
                        ux2Var3 = ux2Var2;
                    }
                    j3 = j2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                    }
                }
                i3 |= 24576;
                ne1Var2 = ne1Var;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i9 != 0) {
                        topStart = Alignment$Companion.getTopStart();
                    } else {
                        topStart = a8Var2;
                    }
                    if (i10 != 0) {
                        j2 = 0;
                    }
                    if (i4 != 0) {
                        je1Var2 = null;
                    }
                    if (i6 != 0) {
                        ux2Var4 = new ux2(15);
                    } else {
                        ux2Var4 = ux2Var2;
                    }
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i3 & 112) == 32);
                    objP = kk0Var.P();
                    if (z3) {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    } else {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    }
                    je1 je1Var7 = je1Var2;
                    Popup((g8) objP, je1Var7, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                    ux2Var3 = ux2Var4;
                    je1Var3 = je1Var7;
                    a8Var3 = topStart;
                } else {
                    kk0Var.V();
                    a8Var3 = a8Var2;
                    je1Var3 = je1Var2;
                    ux2Var3 = ux2Var2;
                }
                j3 = j2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                }
            }
            i3 |= 384;
            je1Var2 = je1Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    ux2Var2 = ux2Var;
                    if (kk0Var.h(ux2Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    if ((i & 24576) == 0) {
                        ne1Var2 = ne1Var;
                        if (kk0Var.j(ne1Var2)) {
                            i8 = 16384;
                        } else {
                            i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i9 != 0) {
                            topStart = Alignment$Companion.getTopStart();
                        } else {
                            topStart = a8Var2;
                        }
                        if (i10 != 0) {
                            j2 = 0;
                        }
                        if (i4 != 0) {
                            je1Var2 = null;
                        }
                        if (i6 != 0) {
                            ux2Var4 = new ux2(15);
                        } else {
                            ux2Var4 = ux2Var2;
                        }
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | ((i3 & 112) == 32);
                        objP = kk0Var.P();
                        if (z3) {
                            objP = new g8(topStart, j2);
                            kk0Var.l0(objP);
                        } else {
                            objP = new g8(topStart, j2);
                            kk0Var.l0(objP);
                        }
                        je1 je1Var8 = je1Var2;
                        Popup((g8) objP, je1Var8, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                        ux2Var3 = ux2Var4;
                        je1Var3 = je1Var8;
                        a8Var3 = topStart;
                    } else {
                        kk0Var.V();
                        a8Var3 = a8Var2;
                        je1Var3 = je1Var2;
                        ux2Var3 = ux2Var2;
                    }
                    j3 = j2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                    }
                }
                i3 |= 24576;
                ne1Var2 = ne1Var;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i9 != 0) {
                        topStart = Alignment$Companion.getTopStart();
                    } else {
                        topStart = a8Var2;
                    }
                    if (i10 != 0) {
                        j2 = 0;
                    }
                    if (i4 != 0) {
                        je1Var2 = null;
                    }
                    if (i6 != 0) {
                        ux2Var4 = new ux2(15);
                    } else {
                        ux2Var4 = ux2Var2;
                    }
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i3 & 112) == 32);
                    objP = kk0Var.P();
                    if (z3) {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    } else {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    }
                    je1 je1Var9 = je1Var2;
                    Popup((g8) objP, je1Var9, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                    ux2Var3 = ux2Var4;
                    je1Var3 = je1Var9;
                    a8Var3 = topStart;
                } else {
                    kk0Var.V();
                    a8Var3 = a8Var2;
                    je1Var3 = je1Var2;
                    ux2Var3 = ux2Var2;
                }
                j3 = j2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                }
            }
            i3 |= 3072;
            ux2Var2 = ux2Var;
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    ne1Var2 = ne1Var;
                    if (kk0Var.j(ne1Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i8;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i9 != 0) {
                        topStart = Alignment$Companion.getTopStart();
                    } else {
                        topStart = a8Var2;
                    }
                    if (i10 != 0) {
                        j2 = 0;
                    }
                    if (i4 != 0) {
                        je1Var2 = null;
                    }
                    if (i6 != 0) {
                        ux2Var4 = new ux2(15);
                    } else {
                        ux2Var4 = ux2Var2;
                    }
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i3 & 112) == 32);
                    objP = kk0Var.P();
                    if (z3) {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    } else {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    }
                    je1 je1Var10 = je1Var2;
                    Popup((g8) objP, je1Var10, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                    ux2Var3 = ux2Var4;
                    je1Var3 = je1Var10;
                    a8Var3 = topStart;
                } else {
                    kk0Var.V();
                    a8Var3 = a8Var2;
                    je1Var3 = je1Var2;
                    ux2Var3 = ux2Var2;
                }
                j3 = j2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                }
            }
            i3 |= 24576;
            ne1Var2 = ne1Var;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i9 != 0) {
                    topStart = Alignment$Companion.getTopStart();
                } else {
                    topStart = a8Var2;
                }
                if (i10 != 0) {
                    j2 = 0;
                }
                if (i4 != 0) {
                    je1Var2 = null;
                }
                if (i6 != 0) {
                    ux2Var4 = new ux2(15);
                } else {
                    ux2Var4 = ux2Var2;
                }
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i3 & 112) == 32);
                objP = kk0Var.P();
                if (z3) {
                    objP = new g8(topStart, j2);
                    kk0Var.l0(objP);
                } else {
                    objP = new g8(topStart, j2);
                    kk0Var.l0(objP);
                }
                je1 je1Var11 = je1Var2;
                Popup((g8) objP, je1Var11, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                ux2Var3 = ux2Var4;
                je1Var3 = je1Var11;
                a8Var3 = topStart;
            } else {
                kk0Var.V();
                a8Var3 = a8Var2;
                je1Var3 = je1Var2;
                ux2Var3 = ux2Var2;
            }
            j3 = j2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
            }
        }
        i3 |= 48;
        j2 = j;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                je1Var2 = je1Var;
                if (kk0Var.j(je1Var2)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    ux2Var2 = ux2Var;
                    if (kk0Var.h(ux2Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    if ((i & 24576) == 0) {
                        ne1Var2 = ne1Var;
                        if (kk0Var.j(ne1Var2)) {
                            i8 = 16384;
                        } else {
                            i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i9 != 0) {
                            topStart = Alignment$Companion.getTopStart();
                        } else {
                            topStart = a8Var2;
                        }
                        if (i10 != 0) {
                            j2 = 0;
                        }
                        if (i4 != 0) {
                            je1Var2 = null;
                        }
                        if (i6 != 0) {
                            ux2Var4 = new ux2(15);
                        } else {
                            ux2Var4 = ux2Var2;
                        }
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | ((i3 & 112) == 32);
                        objP = kk0Var.P();
                        if (z3) {
                            objP = new g8(topStart, j2);
                            kk0Var.l0(objP);
                        } else {
                            objP = new g8(topStart, j2);
                            kk0Var.l0(objP);
                        }
                        je1 je1Var12 = je1Var2;
                        Popup((g8) objP, je1Var12, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                        ux2Var3 = ux2Var4;
                        je1Var3 = je1Var12;
                        a8Var3 = topStart;
                    } else {
                        kk0Var.V();
                        a8Var3 = a8Var2;
                        je1Var3 = je1Var2;
                        ux2Var3 = ux2Var2;
                    }
                    j3 = j2;
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                    }
                }
                i3 |= 24576;
                ne1Var2 = ne1Var;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i9 != 0) {
                        topStart = Alignment$Companion.getTopStart();
                    } else {
                        topStart = a8Var2;
                    }
                    if (i10 != 0) {
                        j2 = 0;
                    }
                    if (i4 != 0) {
                        je1Var2 = null;
                    }
                    if (i6 != 0) {
                        ux2Var4 = new ux2(15);
                    } else {
                        ux2Var4 = ux2Var2;
                    }
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i3 & 112) == 32);
                    objP = kk0Var.P();
                    if (z3) {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    } else {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    }
                    je1 je1Var13 = je1Var2;
                    Popup((g8) objP, je1Var13, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                    ux2Var3 = ux2Var4;
                    je1Var3 = je1Var13;
                    a8Var3 = topStart;
                } else {
                    kk0Var.V();
                    a8Var3 = a8Var2;
                    je1Var3 = je1Var2;
                    ux2Var3 = ux2Var2;
                }
                j3 = j2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                }
            }
            i3 |= 3072;
            ux2Var2 = ux2Var;
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    ne1Var2 = ne1Var;
                    if (kk0Var.j(ne1Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i8;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i9 != 0) {
                        topStart = Alignment$Companion.getTopStart();
                    } else {
                        topStart = a8Var2;
                    }
                    if (i10 != 0) {
                        j2 = 0;
                    }
                    if (i4 != 0) {
                        je1Var2 = null;
                    }
                    if (i6 != 0) {
                        ux2Var4 = new ux2(15);
                    } else {
                        ux2Var4 = ux2Var2;
                    }
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i3 & 112) == 32);
                    objP = kk0Var.P();
                    if (z3) {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    } else {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    }
                    je1 je1Var14 = je1Var2;
                    Popup((g8) objP, je1Var14, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                    ux2Var3 = ux2Var4;
                    je1Var3 = je1Var14;
                    a8Var3 = topStart;
                } else {
                    kk0Var.V();
                    a8Var3 = a8Var2;
                    je1Var3 = je1Var2;
                    ux2Var3 = ux2Var2;
                }
                j3 = j2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                }
            }
            i3 |= 24576;
            ne1Var2 = ne1Var;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i9 != 0) {
                    topStart = Alignment$Companion.getTopStart();
                } else {
                    topStart = a8Var2;
                }
                if (i10 != 0) {
                    j2 = 0;
                }
                if (i4 != 0) {
                    je1Var2 = null;
                }
                if (i6 != 0) {
                    ux2Var4 = new ux2(15);
                } else {
                    ux2Var4 = ux2Var2;
                }
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i3 & 112) == 32);
                objP = kk0Var.P();
                if (z3) {
                    objP = new g8(topStart, j2);
                    kk0Var.l0(objP);
                } else {
                    objP = new g8(topStart, j2);
                    kk0Var.l0(objP);
                }
                je1 je1Var15 = je1Var2;
                Popup((g8) objP, je1Var15, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                ux2Var3 = ux2Var4;
                je1Var3 = je1Var15;
                a8Var3 = topStart;
            } else {
                kk0Var.V();
                a8Var3 = a8Var2;
                je1Var3 = je1Var2;
                ux2Var3 = ux2Var2;
            }
            j3 = j2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
            }
        }
        i3 |= 384;
        je1Var2 = je1Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                ux2Var2 = ux2Var;
                if (kk0Var.h(ux2Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    ne1Var2 = ne1Var;
                    if (kk0Var.j(ne1Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i8;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i9 != 0) {
                        topStart = Alignment$Companion.getTopStart();
                    } else {
                        topStart = a8Var2;
                    }
                    if (i10 != 0) {
                        j2 = 0;
                    }
                    if (i4 != 0) {
                        je1Var2 = null;
                    }
                    if (i6 != 0) {
                        ux2Var4 = new ux2(15);
                    } else {
                        ux2Var4 = ux2Var2;
                    }
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i3 & 112) == 32);
                    objP = kk0Var.P();
                    if (z3) {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    } else {
                        objP = new g8(topStart, j2);
                        kk0Var.l0(objP);
                    }
                    je1 je1Var16 = je1Var2;
                    Popup((g8) objP, je1Var16, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                    ux2Var3 = ux2Var4;
                    je1Var3 = je1Var16;
                    a8Var3 = topStart;
                } else {
                    kk0Var.V();
                    a8Var3 = a8Var2;
                    je1Var3 = je1Var2;
                    ux2Var3 = ux2Var2;
                }
                j3 = j2;
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
                }
            }
            i3 |= 24576;
            ne1Var2 = ne1Var;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i9 != 0) {
                    topStart = Alignment$Companion.getTopStart();
                } else {
                    topStart = a8Var2;
                }
                if (i10 != 0) {
                    j2 = 0;
                }
                if (i4 != 0) {
                    je1Var2 = null;
                }
                if (i6 != 0) {
                    ux2Var4 = new ux2(15);
                } else {
                    ux2Var4 = ux2Var2;
                }
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i3 & 112) == 32);
                objP = kk0Var.P();
                if (z3) {
                    objP = new g8(topStart, j2);
                    kk0Var.l0(objP);
                } else {
                    objP = new g8(topStart, j2);
                    kk0Var.l0(objP);
                }
                je1 je1Var17 = je1Var2;
                Popup((g8) objP, je1Var17, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                ux2Var3 = ux2Var4;
                je1Var3 = je1Var17;
                a8Var3 = topStart;
            } else {
                kk0Var.V();
                a8Var3 = a8Var2;
                je1Var3 = je1Var2;
                ux2Var3 = ux2Var2;
            }
            j3 = j2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
            }
        }
        i3 |= 3072;
        ux2Var2 = ux2Var;
        if ((i2 & 16) != 0) {
            if ((i & 24576) == 0) {
                ne1Var2 = ne1Var;
                if (kk0Var.j(ne1Var2)) {
                    i8 = 16384;
                } else {
                    i8 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i8;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i9 != 0) {
                    topStart = Alignment$Companion.getTopStart();
                } else {
                    topStart = a8Var2;
                }
                if (i10 != 0) {
                    j2 = 0;
                }
                if (i4 != 0) {
                    je1Var2 = null;
                }
                if (i6 != 0) {
                    ux2Var4 = new ux2(15);
                } else {
                    ux2Var4 = ux2Var2;
                }
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i3 & 112) == 32);
                objP = kk0Var.P();
                if (z3) {
                    objP = new g8(topStart, j2);
                    kk0Var.l0(objP);
                } else {
                    objP = new g8(topStart, j2);
                    kk0Var.l0(objP);
                }
                je1 je1Var18 = je1Var2;
                Popup((g8) objP, je1Var18, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
                ux2Var3 = ux2Var4;
                je1Var3 = je1Var18;
                a8Var3 = topStart;
            } else {
                kk0Var.V();
                a8Var3 = a8Var2;
                je1Var3 = je1Var2;
                ux2Var3 = ux2Var2;
            }
            j3 = j2;
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
            }
        }
        i3 |= 24576;
        ne1Var2 = ne1Var;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i9 != 0) {
                topStart = Alignment$Companion.getTopStart();
            } else {
                topStart = a8Var2;
            }
            if (i10 != 0) {
                j2 = 0;
            }
            if (i4 != 0) {
                je1Var2 = null;
            }
            if (i6 != 0) {
                ux2Var4 = new ux2(15);
            } else {
                ux2Var4 = ux2Var2;
            }
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | ((i3 & 112) == 32);
            objP = kk0Var.P();
            if (z3) {
                objP = new g8(topStart, j2);
                kk0Var.l0(objP);
            } else {
                objP = new g8(topStart, j2);
                kk0Var.l0(objP);
            }
            je1 je1Var19 = je1Var2;
            Popup((g8) objP, je1Var19, ux2Var4, ne1Var2, kk0Var, (i3 >> 3) & 8176, 0);
            ux2Var3 = ux2Var4;
            je1Var3 = je1Var19;
            a8Var3 = topStart;
        } else {
            kk0Var.V();
            a8Var3 = a8Var2;
            je1Var3 = je1Var2;
            ux2Var3 = ux2Var2;
        }
        j3 = j2;
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new oc(a8Var3, j3, je1Var3, ux2Var3, ne1Var, i, i2));
        }
    }

    public static final void PopupTestTag(String str, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-498879600);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        int i3 = 0;
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            yk0.CompositionLocalProvider(a.c(str), ne1Var, kk0Var, (i2 & 112) | 8);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, i3, str, ne1Var));
        }
    }

    private static final void SimpleStack(c cVar, ne1 ne1Var, ck0 ck0Var, int i) {
        ua uaVar = ua.c;
        int i2 = ((i << 3) & 112) | ((i >> 3) & 14) | 384;
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN = ((kk0) ck0Var).n();
        c cVarD = b.d(ck0Var, cVar);
        a.j.getClass();
        d4 constructor = ComposeUiNode$Companion.getConstructor();
        int i3 = ((i2 << 6) & 896) | 6;
        kk0 kk0Var = (kk0) ck0Var;
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
        xp1.E(ck0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
        xp1.E(ck0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
        pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        ne1Var.invoke(ck0Var, Integer.valueOf((i3 >> 6) & 14));
        kk0Var.r(true);
    }

    public static final boolean a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) ? false : true;
    }
}
