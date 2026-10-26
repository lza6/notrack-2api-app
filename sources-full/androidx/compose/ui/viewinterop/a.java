package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.bd4;
import defpackage.ck0;
import defpackage.d72;
import defpackage.db1;
import defpackage.dx1;
import defpackage.fq2;
import defpackage.g93;
import defpackage.i93;
import defpackage.je1;
import defpackage.kk0;
import defpackage.kr1;
import defpackage.le1;
import defpackage.m84;
import defpackage.n32;
import defpackage.of2;
import defpackage.pe;
import defpackage.qe;
import defpackage.qk0;
import defpackage.ra;
import defpackage.re;
import defpackage.rj0;
import defpackage.su2;
import defpackage.tf2;
import defpackage.u93;
import defpackage.ux1;
import defpackage.v1;
import defpackage.w33;
import defpackage.wu0;
import defpackage.xk;
import defpackage.xp1;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final <T extends View> void AndroidView(le1 le1Var, c cVar, le1 le1Var2, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        le1 le1Var3;
        v1 v1Var = v1.u;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1783766393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(le1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(cVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.j(le1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if (kk0Var.S(i3 & 1, (i3 & 147) != 146)) {
            c cVar3 = i4 != 0 ? c.i : cVar;
            le1 le1Var4 = i5 != 0 ? v1Var : le1Var2;
            AndroidView(le1Var, cVar3, null, v1Var, le1Var4, kk0Var, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
            le1Var3 = le1Var4;
            cVar2 = cVar3;
        } else {
            kk0Var.V();
            cVar2 = cVar;
            le1Var3 = le1Var2;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ra(i, i2, 1, le1Var3, le1Var, cVar2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0108  */
    /* JADX WARN: Code duplicated, block: B:77:0x011a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:81:0x012b  */
    /* JADX WARN: Code duplicated, block: B:83:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0150  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x019b  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ad  */
    public static final <T extends View> void AndroidView(le1 le1Var, c cVar, le1 le1Var2, le1 le1Var3, le1 le1Var4, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        int i4;
        le1 le1Var5;
        int i5;
        int i6;
        le1 le1Var6;
        int i7;
        int i8;
        le1 le1Var7;
        int i9;
        boolean z;
        c cVar3;
        le1 le1Var8;
        le1 le1Var9;
        le1 le1Var10;
        w33 w33VarV;
        c cVar4;
        le1 le1Var11;
        int currentCompositeKeyHash;
        c cVarD;
        wu0 wu0Var;
        dx1 dx1Var;
        su2 su2VarN;
        n32 n32Var;
        u93 u93Var;
        le1 le1Var12;
        je1 je1VarCreateAndroidViewNodeFactory;
        je1 je1VarCreateAndroidViewNodeFactory2;
        v1 v1Var = v1.u;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-180024211);
        xk xkVar = kk0Var.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(le1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                cVar2 = cVar;
                i3 |= kk0Var.h(cVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    le1Var5 = le1Var2;
                    if (kk0Var.j(le1Var5)) {
                        i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                    } else {
                        i5 = Uuid.SIZE_BITS;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        le1Var6 = le1Var3;
                        if (kk0Var.j(le1Var6)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            le1Var7 = le1Var4;
                            if (kk0Var.j(le1Var7)) {
                                i9 = 16384;
                            } else {
                                i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 9363) != 9362) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (kk0Var.S(i3 & 1, z)) {
                            if (i10 != 0) {
                                cVar4 = c.i;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i4 != 0) {
                                le1Var11 = null;
                            } else {
                                le1Var11 = le1Var5;
                            }
                            if (i6 != 0) {
                                le1Var6 = v1Var;
                            }
                            if (i8 != 0) {
                                le1Var7 = v1Var;
                            }
                            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                            c cVarThen = cVar4.then(FocusGroupPropertiesElement.c);
                            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                                @Override // defpackage.tf2
                                public final of2 create() {
                                    return new db1(0, 7, null);
                                }

                                public final boolean equals(Object obj) {
                                    return obj == this;
                                }

                                public final int hashCode() {
                                    return 1739042953;
                                }

                                @Override // defpackage.tf2
                                public final void inspectableProperties(InspectorInfo inspectorInfo) {
                                    inspectorInfo.setName("focusTarget");
                                }

                                @Override // defpackage.tf2
                                public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                                }
                            };
                            cVarD = b.d(kk0Var, cVarThen.then(focusTargetNode$FocusTargetElement).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement));
                            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                            dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                            su2VarN = kk0Var.n();
                            n32Var = (n32) kk0Var.l(d72.a);
                            u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                            if (le1Var11 != null) {
                                kk0Var.a0(607780130);
                                je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                                if (xkVar instanceof m84) {
                                    rj0.a();
                                    throw null;
                                }
                                kk0Var.e0();
                                if (kk0Var.O) {
                                    kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                                } else {
                                    kk0Var.o0();
                                }
                                le1Var12 = le1Var6;
                                le1Var10 = le1Var7;
                                b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                                xp1.E(kk0Var, le1Var11, pe.d);
                                xp1.E(kk0Var, le1Var10, pe.h);
                                xp1.E(kk0Var, le1Var12, pe.l);
                                kk0Var.r(true);
                                kk0Var.r(false);
                            } else {
                                le1Var12 = le1Var6;
                                le1Var10 = le1Var7;
                                kk0Var.a0(608635513);
                                je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                                if (xkVar instanceof m84) {
                                    rj0.a();
                                    throw null;
                                }
                                kk0Var.W(125, 1, null, null);
                                kk0Var.q = true;
                                if (kk0Var.O) {
                                    kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                                } else {
                                    kk0Var.o0();
                                }
                                b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                                xp1.E(kk0Var, le1Var10, pe.m);
                                xp1.E(kk0Var, le1Var12, pe.n);
                                kk0Var.r(true);
                                kk0Var.r(false);
                            }
                            le1Var9 = le1Var12;
                            le1Var8 = le1Var11;
                            cVar3 = cVar4;
                        } else {
                            kk0Var.V();
                            cVar3 = cVar2;
                            le1Var8 = le1Var5;
                            le1Var9 = le1Var6;
                            le1Var10 = le1Var7;
                        }
                        w33VarV = kk0Var.v();
                        if (w33VarV != null) {
                            w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                        }
                    }
                    i3 |= 24576;
                    le1Var7 = le1Var4;
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i10 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            le1Var11 = null;
                        } else {
                            le1Var11 = le1Var5;
                        }
                        if (i6 != 0) {
                            le1Var6 = v1Var;
                        }
                        if (i8 != 0) {
                            le1Var7 = v1Var;
                        }
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        c cVarThen2 = cVar4.then(FocusGroupPropertiesElement.c);
                        FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement2 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                            @Override // defpackage.tf2
                            public final of2 create() {
                                return new db1(0, 7, null);
                            }

                            public final boolean equals(Object obj) {
                                return obj == this;
                            }

                            public final int hashCode() {
                                return 1739042953;
                            }

                            @Override // defpackage.tf2
                            public final void inspectableProperties(InspectorInfo inspectorInfo) {
                                inspectorInfo.setName("focusTarget");
                            }

                            @Override // defpackage.tf2
                            public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                            }
                        };
                        cVarD = b.d(kk0Var, cVarThen2.then(focusTargetNode$FocusTargetElement2).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement2));
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                        su2VarN = kk0Var.n();
                        n32Var = (n32) kk0Var.l(d72.a);
                        u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (le1Var11 != null) {
                            kk0Var.a0(607780130);
                            je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                            if (xkVar instanceof m84) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.e0();
                            if (kk0Var.O) {
                                kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                            } else {
                                kk0Var.o0();
                            }
                            le1Var12 = le1Var6;
                            le1Var10 = le1Var7;
                            b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                            xp1.E(kk0Var, le1Var11, pe.d);
                            xp1.E(kk0Var, le1Var10, pe.h);
                            xp1.E(kk0Var, le1Var12, pe.l);
                            kk0Var.r(true);
                            kk0Var.r(false);
                        } else {
                            le1Var12 = le1Var6;
                            le1Var10 = le1Var7;
                            kk0Var.a0(608635513);
                            je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                            if (xkVar instanceof m84) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.W(125, 1, null, null);
                            kk0Var.q = true;
                            if (kk0Var.O) {
                                kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                            } else {
                                kk0Var.o0();
                            }
                            b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                            xp1.E(kk0Var, le1Var10, pe.m);
                            xp1.E(kk0Var, le1Var12, pe.n);
                            kk0Var.r(true);
                            kk0Var.r(false);
                        }
                        le1Var9 = le1Var12;
                        le1Var8 = le1Var11;
                        cVar3 = cVar4;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        le1Var8 = le1Var5;
                        le1Var9 = le1Var6;
                        le1Var10 = le1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                    }
                }
                i3 |= 3072;
                le1Var6 = le1Var3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        le1Var7 = le1Var4;
                        if (kk0Var.j(le1Var7)) {
                            i9 = 16384;
                        } else {
                            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i10 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            le1Var11 = null;
                        } else {
                            le1Var11 = le1Var5;
                        }
                        if (i6 != 0) {
                            le1Var6 = v1Var;
                        }
                        if (i8 != 0) {
                            le1Var7 = v1Var;
                        }
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        c cVarThen3 = cVar4.then(FocusGroupPropertiesElement.c);
                        FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement3 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                            @Override // defpackage.tf2
                            public final of2 create() {
                                return new db1(0, 7, null);
                            }

                            public final boolean equals(Object obj) {
                                return obj == this;
                            }

                            public final int hashCode() {
                                return 1739042953;
                            }

                            @Override // defpackage.tf2
                            public final void inspectableProperties(InspectorInfo inspectorInfo) {
                                inspectorInfo.setName("focusTarget");
                            }

                            @Override // defpackage.tf2
                            public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                            }
                        };
                        cVarD = b.d(kk0Var, cVarThen3.then(focusTargetNode$FocusTargetElement3).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement3));
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                        su2VarN = kk0Var.n();
                        n32Var = (n32) kk0Var.l(d72.a);
                        u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (le1Var11 != null) {
                            kk0Var.a0(607780130);
                            je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                            if (xkVar instanceof m84) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.e0();
                            if (kk0Var.O) {
                                kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                            } else {
                                kk0Var.o0();
                            }
                            le1Var12 = le1Var6;
                            le1Var10 = le1Var7;
                            b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                            xp1.E(kk0Var, le1Var11, pe.d);
                            xp1.E(kk0Var, le1Var10, pe.h);
                            xp1.E(kk0Var, le1Var12, pe.l);
                            kk0Var.r(true);
                            kk0Var.r(false);
                        } else {
                            le1Var12 = le1Var6;
                            le1Var10 = le1Var7;
                            kk0Var.a0(608635513);
                            je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                            if (xkVar instanceof m84) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.W(125, 1, null, null);
                            kk0Var.q = true;
                            if (kk0Var.O) {
                                kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                            } else {
                                kk0Var.o0();
                            }
                            b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                            xp1.E(kk0Var, le1Var10, pe.m);
                            xp1.E(kk0Var, le1Var12, pe.n);
                            kk0Var.r(true);
                            kk0Var.r(false);
                        }
                        le1Var9 = le1Var12;
                        le1Var8 = le1Var11;
                        cVar3 = cVar4;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        le1Var8 = le1Var5;
                        le1Var9 = le1Var6;
                        le1Var10 = le1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                    }
                }
                i3 |= 24576;
                le1Var7 = le1Var4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i10 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        le1Var11 = null;
                    } else {
                        le1Var11 = le1Var5;
                    }
                    if (i6 != 0) {
                        le1Var6 = v1Var;
                    }
                    if (i8 != 0) {
                        le1Var7 = v1Var;
                    }
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    c cVarThen4 = cVar4.then(FocusGroupPropertiesElement.c);
                    FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement4 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                        @Override // defpackage.tf2
                        public final of2 create() {
                            return new db1(0, 7, null);
                        }

                        public final boolean equals(Object obj) {
                            return obj == this;
                        }

                        public final int hashCode() {
                            return 1739042953;
                        }

                        @Override // defpackage.tf2
                        public final void inspectableProperties(InspectorInfo inspectorInfo) {
                            inspectorInfo.setName("focusTarget");
                        }

                        @Override // defpackage.tf2
                        public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                        }
                    };
                    cVarD = b.d(kk0Var, cVarThen4.then(focusTargetNode$FocusTargetElement4).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement4));
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                    su2VarN = kk0Var.n();
                    n32Var = (n32) kk0Var.l(d72.a);
                    u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (le1Var11 != null) {
                        kk0Var.a0(607780130);
                        je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                        } else {
                            kk0Var.o0();
                        }
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var11, pe.d);
                        xp1.E(kk0Var, le1Var10, pe.h);
                        xp1.E(kk0Var, le1Var12, pe.l);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    } else {
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        kk0Var.a0(608635513);
                        je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.W(125, 1, null, null);
                        kk0Var.q = true;
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                        } else {
                            kk0Var.o0();
                        }
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var10, pe.m);
                        xp1.E(kk0Var, le1Var12, pe.n);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    }
                    le1Var9 = le1Var12;
                    le1Var8 = le1Var11;
                    cVar3 = cVar4;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    le1Var8 = le1Var5;
                    le1Var9 = le1Var6;
                    le1Var10 = le1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                }
            }
            i3 |= 384;
            le1Var5 = le1Var2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    le1Var6 = le1Var3;
                    if (kk0Var.j(le1Var6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        le1Var7 = le1Var4;
                        if (kk0Var.j(le1Var7)) {
                            i9 = 16384;
                        } else {
                            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i10 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            le1Var11 = null;
                        } else {
                            le1Var11 = le1Var5;
                        }
                        if (i6 != 0) {
                            le1Var6 = v1Var;
                        }
                        if (i8 != 0) {
                            le1Var7 = v1Var;
                        }
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        c cVarThen5 = cVar4.then(FocusGroupPropertiesElement.c);
                        FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement5 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                            @Override // defpackage.tf2
                            public final of2 create() {
                                return new db1(0, 7, null);
                            }

                            public final boolean equals(Object obj) {
                                return obj == this;
                            }

                            public final int hashCode() {
                                return 1739042953;
                            }

                            @Override // defpackage.tf2
                            public final void inspectableProperties(InspectorInfo inspectorInfo) {
                                inspectorInfo.setName("focusTarget");
                            }

                            @Override // defpackage.tf2
                            public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                            }
                        };
                        cVarD = b.d(kk0Var, cVarThen5.then(focusTargetNode$FocusTargetElement5).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement5));
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                        su2VarN = kk0Var.n();
                        n32Var = (n32) kk0Var.l(d72.a);
                        u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (le1Var11 != null) {
                            kk0Var.a0(607780130);
                            je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                            if (xkVar instanceof m84) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.e0();
                            if (kk0Var.O) {
                                kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                            } else {
                                kk0Var.o0();
                            }
                            le1Var12 = le1Var6;
                            le1Var10 = le1Var7;
                            b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                            xp1.E(kk0Var, le1Var11, pe.d);
                            xp1.E(kk0Var, le1Var10, pe.h);
                            xp1.E(kk0Var, le1Var12, pe.l);
                            kk0Var.r(true);
                            kk0Var.r(false);
                        } else {
                            le1Var12 = le1Var6;
                            le1Var10 = le1Var7;
                            kk0Var.a0(608635513);
                            je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                            if (xkVar instanceof m84) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.W(125, 1, null, null);
                            kk0Var.q = true;
                            if (kk0Var.O) {
                                kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                            } else {
                                kk0Var.o0();
                            }
                            b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                            xp1.E(kk0Var, le1Var10, pe.m);
                            xp1.E(kk0Var, le1Var12, pe.n);
                            kk0Var.r(true);
                            kk0Var.r(false);
                        }
                        le1Var9 = le1Var12;
                        le1Var8 = le1Var11;
                        cVar3 = cVar4;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        le1Var8 = le1Var5;
                        le1Var9 = le1Var6;
                        le1Var10 = le1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                    }
                }
                i3 |= 24576;
                le1Var7 = le1Var4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i10 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        le1Var11 = null;
                    } else {
                        le1Var11 = le1Var5;
                    }
                    if (i6 != 0) {
                        le1Var6 = v1Var;
                    }
                    if (i8 != 0) {
                        le1Var7 = v1Var;
                    }
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    c cVarThen6 = cVar4.then(FocusGroupPropertiesElement.c);
                    FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement6 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                        @Override // defpackage.tf2
                        public final of2 create() {
                            return new db1(0, 7, null);
                        }

                        public final boolean equals(Object obj) {
                            return obj == this;
                        }

                        public final int hashCode() {
                            return 1739042953;
                        }

                        @Override // defpackage.tf2
                        public final void inspectableProperties(InspectorInfo inspectorInfo) {
                            inspectorInfo.setName("focusTarget");
                        }

                        @Override // defpackage.tf2
                        public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                        }
                    };
                    cVarD = b.d(kk0Var, cVarThen6.then(focusTargetNode$FocusTargetElement6).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement6));
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                    su2VarN = kk0Var.n();
                    n32Var = (n32) kk0Var.l(d72.a);
                    u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (le1Var11 != null) {
                        kk0Var.a0(607780130);
                        je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                        } else {
                            kk0Var.o0();
                        }
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var11, pe.d);
                        xp1.E(kk0Var, le1Var10, pe.h);
                        xp1.E(kk0Var, le1Var12, pe.l);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    } else {
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        kk0Var.a0(608635513);
                        je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.W(125, 1, null, null);
                        kk0Var.q = true;
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                        } else {
                            kk0Var.o0();
                        }
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var10, pe.m);
                        xp1.E(kk0Var, le1Var12, pe.n);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    }
                    le1Var9 = le1Var12;
                    le1Var8 = le1Var11;
                    cVar3 = cVar4;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    le1Var8 = le1Var5;
                    le1Var9 = le1Var6;
                    le1Var10 = le1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                }
            }
            i3 |= 3072;
            le1Var6 = le1Var3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    le1Var7 = le1Var4;
                    if (kk0Var.j(le1Var7)) {
                        i9 = 16384;
                    } else {
                        i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i10 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        le1Var11 = null;
                    } else {
                        le1Var11 = le1Var5;
                    }
                    if (i6 != 0) {
                        le1Var6 = v1Var;
                    }
                    if (i8 != 0) {
                        le1Var7 = v1Var;
                    }
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    c cVarThen7 = cVar4.then(FocusGroupPropertiesElement.c);
                    FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement7 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                        @Override // defpackage.tf2
                        public final of2 create() {
                            return new db1(0, 7, null);
                        }

                        public final boolean equals(Object obj) {
                            return obj == this;
                        }

                        public final int hashCode() {
                            return 1739042953;
                        }

                        @Override // defpackage.tf2
                        public final void inspectableProperties(InspectorInfo inspectorInfo) {
                            inspectorInfo.setName("focusTarget");
                        }

                        @Override // defpackage.tf2
                        public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                        }
                    };
                    cVarD = b.d(kk0Var, cVarThen7.then(focusTargetNode$FocusTargetElement7).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement7));
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                    su2VarN = kk0Var.n();
                    n32Var = (n32) kk0Var.l(d72.a);
                    u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (le1Var11 != null) {
                        kk0Var.a0(607780130);
                        je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                        } else {
                            kk0Var.o0();
                        }
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var11, pe.d);
                        xp1.E(kk0Var, le1Var10, pe.h);
                        xp1.E(kk0Var, le1Var12, pe.l);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    } else {
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        kk0Var.a0(608635513);
                        je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.W(125, 1, null, null);
                        kk0Var.q = true;
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                        } else {
                            kk0Var.o0();
                        }
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var10, pe.m);
                        xp1.E(kk0Var, le1Var12, pe.n);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    }
                    le1Var9 = le1Var12;
                    le1Var8 = le1Var11;
                    cVar3 = cVar4;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    le1Var8 = le1Var5;
                    le1Var9 = le1Var6;
                    le1Var10 = le1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                }
            }
            i3 |= 24576;
            le1Var7 = le1Var4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i10 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    le1Var11 = null;
                } else {
                    le1Var11 = le1Var5;
                }
                if (i6 != 0) {
                    le1Var6 = v1Var;
                }
                if (i8 != 0) {
                    le1Var7 = v1Var;
                }
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                c cVarThen8 = cVar4.then(FocusGroupPropertiesElement.c);
                FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement8 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                    @Override // defpackage.tf2
                    public final of2 create() {
                        return new db1(0, 7, null);
                    }

                    public final boolean equals(Object obj) {
                        return obj == this;
                    }

                    public final int hashCode() {
                        return 1739042953;
                    }

                    @Override // defpackage.tf2
                    public final void inspectableProperties(InspectorInfo inspectorInfo) {
                        inspectorInfo.setName("focusTarget");
                    }

                    @Override // defpackage.tf2
                    public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                    }
                };
                cVarD = b.d(kk0Var, cVarThen8.then(focusTargetNode$FocusTargetElement8).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement8));
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                su2VarN = kk0Var.n();
                n32Var = (n32) kk0Var.l(d72.a);
                u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (le1Var11 != null) {
                    kk0Var.a0(607780130);
                    je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                    if (xkVar instanceof m84) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                    } else {
                        kk0Var.o0();
                    }
                    le1Var12 = le1Var6;
                    le1Var10 = le1Var7;
                    b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                    xp1.E(kk0Var, le1Var11, pe.d);
                    xp1.E(kk0Var, le1Var10, pe.h);
                    xp1.E(kk0Var, le1Var12, pe.l);
                    kk0Var.r(true);
                    kk0Var.r(false);
                } else {
                    le1Var12 = le1Var6;
                    le1Var10 = le1Var7;
                    kk0Var.a0(608635513);
                    je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                    if (xkVar instanceof m84) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.W(125, 1, null, null);
                    kk0Var.q = true;
                    if (kk0Var.O) {
                        kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                    } else {
                        kk0Var.o0();
                    }
                    b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                    xp1.E(kk0Var, le1Var10, pe.m);
                    xp1.E(kk0Var, le1Var12, pe.n);
                    kk0Var.r(true);
                    kk0Var.r(false);
                }
                le1Var9 = le1Var12;
                le1Var8 = le1Var11;
                cVar3 = cVar4;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                le1Var8 = le1Var5;
                le1Var9 = le1Var6;
                le1Var10 = le1Var7;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
            }
        }
        i3 |= 48;
        cVar2 = cVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                le1Var5 = le1Var2;
                if (kk0Var.j(le1Var5)) {
                    i5 = FontInfo.NUMBER_OF_CHAR_CODES;
                } else {
                    i5 = Uuid.SIZE_BITS;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    le1Var6 = le1Var3;
                    if (kk0Var.j(le1Var6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        le1Var7 = le1Var4;
                        if (kk0Var.j(le1Var7)) {
                            i9 = 16384;
                        } else {
                            i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kk0Var.S(i3 & 1, z)) {
                        if (i10 != 0) {
                            cVar4 = c.i;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i4 != 0) {
                            le1Var11 = null;
                        } else {
                            le1Var11 = le1Var5;
                        }
                        if (i6 != 0) {
                            le1Var6 = v1Var;
                        }
                        if (i8 != 0) {
                            le1Var7 = v1Var;
                        }
                        currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                        c cVarThen9 = cVar4.then(FocusGroupPropertiesElement.c);
                        FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement9 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                            @Override // defpackage.tf2
                            public final of2 create() {
                                return new db1(0, 7, null);
                            }

                            public final boolean equals(Object obj) {
                                return obj == this;
                            }

                            public final int hashCode() {
                                return 1739042953;
                            }

                            @Override // defpackage.tf2
                            public final void inspectableProperties(InspectorInfo inspectorInfo) {
                                inspectorInfo.setName("focusTarget");
                            }

                            @Override // defpackage.tf2
                            public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                            }
                        };
                        cVarD = b.d(kk0Var, cVarThen9.then(focusTargetNode$FocusTargetElement9).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement9));
                        wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                        dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                        su2VarN = kk0Var.n();
                        n32Var = (n32) kk0Var.l(d72.a);
                        u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (le1Var11 != null) {
                            kk0Var.a0(607780130);
                            je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                            if (xkVar instanceof m84) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.e0();
                            if (kk0Var.O) {
                                kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                            } else {
                                kk0Var.o0();
                            }
                            le1Var12 = le1Var6;
                            le1Var10 = le1Var7;
                            b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                            xp1.E(kk0Var, le1Var11, pe.d);
                            xp1.E(kk0Var, le1Var10, pe.h);
                            xp1.E(kk0Var, le1Var12, pe.l);
                            kk0Var.r(true);
                            kk0Var.r(false);
                        } else {
                            le1Var12 = le1Var6;
                            le1Var10 = le1Var7;
                            kk0Var.a0(608635513);
                            je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                            if (xkVar instanceof m84) {
                                rj0.a();
                                throw null;
                            }
                            kk0Var.W(125, 1, null, null);
                            kk0Var.q = true;
                            if (kk0Var.O) {
                                kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                            } else {
                                kk0Var.o0();
                            }
                            b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                            xp1.E(kk0Var, le1Var10, pe.m);
                            xp1.E(kk0Var, le1Var12, pe.n);
                            kk0Var.r(true);
                            kk0Var.r(false);
                        }
                        le1Var9 = le1Var12;
                        le1Var8 = le1Var11;
                        cVar3 = cVar4;
                    } else {
                        kk0Var.V();
                        cVar3 = cVar2;
                        le1Var8 = le1Var5;
                        le1Var9 = le1Var6;
                        le1Var10 = le1Var7;
                    }
                    w33VarV = kk0Var.v();
                    if (w33VarV != null) {
                        w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                    }
                }
                i3 |= 24576;
                le1Var7 = le1Var4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i10 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        le1Var11 = null;
                    } else {
                        le1Var11 = le1Var5;
                    }
                    if (i6 != 0) {
                        le1Var6 = v1Var;
                    }
                    if (i8 != 0) {
                        le1Var7 = v1Var;
                    }
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    c cVarThen10 = cVar4.then(FocusGroupPropertiesElement.c);
                    FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement10 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                        @Override // defpackage.tf2
                        public final of2 create() {
                            return new db1(0, 7, null);
                        }

                        public final boolean equals(Object obj) {
                            return obj == this;
                        }

                        public final int hashCode() {
                            return 1739042953;
                        }

                        @Override // defpackage.tf2
                        public final void inspectableProperties(InspectorInfo inspectorInfo) {
                            inspectorInfo.setName("focusTarget");
                        }

                        @Override // defpackage.tf2
                        public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                        }
                    };
                    cVarD = b.d(kk0Var, cVarThen10.then(focusTargetNode$FocusTargetElement10).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement10));
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                    su2VarN = kk0Var.n();
                    n32Var = (n32) kk0Var.l(d72.a);
                    u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (le1Var11 != null) {
                        kk0Var.a0(607780130);
                        je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                        } else {
                            kk0Var.o0();
                        }
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var11, pe.d);
                        xp1.E(kk0Var, le1Var10, pe.h);
                        xp1.E(kk0Var, le1Var12, pe.l);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    } else {
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        kk0Var.a0(608635513);
                        je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.W(125, 1, null, null);
                        kk0Var.q = true;
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                        } else {
                            kk0Var.o0();
                        }
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var10, pe.m);
                        xp1.E(kk0Var, le1Var12, pe.n);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    }
                    le1Var9 = le1Var12;
                    le1Var8 = le1Var11;
                    cVar3 = cVar4;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    le1Var8 = le1Var5;
                    le1Var9 = le1Var6;
                    le1Var10 = le1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                }
            }
            i3 |= 3072;
            le1Var6 = le1Var3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    le1Var7 = le1Var4;
                    if (kk0Var.j(le1Var7)) {
                        i9 = 16384;
                    } else {
                        i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i10 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        le1Var11 = null;
                    } else {
                        le1Var11 = le1Var5;
                    }
                    if (i6 != 0) {
                        le1Var6 = v1Var;
                    }
                    if (i8 != 0) {
                        le1Var7 = v1Var;
                    }
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    c cVarThen11 = cVar4.then(FocusGroupPropertiesElement.c);
                    FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement11 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                        @Override // defpackage.tf2
                        public final of2 create() {
                            return new db1(0, 7, null);
                        }

                        public final boolean equals(Object obj) {
                            return obj == this;
                        }

                        public final int hashCode() {
                            return 1739042953;
                        }

                        @Override // defpackage.tf2
                        public final void inspectableProperties(InspectorInfo inspectorInfo) {
                            inspectorInfo.setName("focusTarget");
                        }

                        @Override // defpackage.tf2
                        public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                        }
                    };
                    cVarD = b.d(kk0Var, cVarThen11.then(focusTargetNode$FocusTargetElement11).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement11));
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                    su2VarN = kk0Var.n();
                    n32Var = (n32) kk0Var.l(d72.a);
                    u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (le1Var11 != null) {
                        kk0Var.a0(607780130);
                        je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                        } else {
                            kk0Var.o0();
                        }
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var11, pe.d);
                        xp1.E(kk0Var, le1Var10, pe.h);
                        xp1.E(kk0Var, le1Var12, pe.l);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    } else {
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        kk0Var.a0(608635513);
                        je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.W(125, 1, null, null);
                        kk0Var.q = true;
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                        } else {
                            kk0Var.o0();
                        }
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var10, pe.m);
                        xp1.E(kk0Var, le1Var12, pe.n);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    }
                    le1Var9 = le1Var12;
                    le1Var8 = le1Var11;
                    cVar3 = cVar4;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    le1Var8 = le1Var5;
                    le1Var9 = le1Var6;
                    le1Var10 = le1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                }
            }
            i3 |= 24576;
            le1Var7 = le1Var4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i10 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    le1Var11 = null;
                } else {
                    le1Var11 = le1Var5;
                }
                if (i6 != 0) {
                    le1Var6 = v1Var;
                }
                if (i8 != 0) {
                    le1Var7 = v1Var;
                }
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                c cVarThen12 = cVar4.then(FocusGroupPropertiesElement.c);
                FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement12 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                    @Override // defpackage.tf2
                    public final of2 create() {
                        return new db1(0, 7, null);
                    }

                    public final boolean equals(Object obj) {
                        return obj == this;
                    }

                    public final int hashCode() {
                        return 1739042953;
                    }

                    @Override // defpackage.tf2
                    public final void inspectableProperties(InspectorInfo inspectorInfo) {
                        inspectorInfo.setName("focusTarget");
                    }

                    @Override // defpackage.tf2
                    public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                    }
                };
                cVarD = b.d(kk0Var, cVarThen12.then(focusTargetNode$FocusTargetElement12).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement12));
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                su2VarN = kk0Var.n();
                n32Var = (n32) kk0Var.l(d72.a);
                u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (le1Var11 != null) {
                    kk0Var.a0(607780130);
                    je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                    if (xkVar instanceof m84) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                    } else {
                        kk0Var.o0();
                    }
                    le1Var12 = le1Var6;
                    le1Var10 = le1Var7;
                    b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                    xp1.E(kk0Var, le1Var11, pe.d);
                    xp1.E(kk0Var, le1Var10, pe.h);
                    xp1.E(kk0Var, le1Var12, pe.l);
                    kk0Var.r(true);
                    kk0Var.r(false);
                } else {
                    le1Var12 = le1Var6;
                    le1Var10 = le1Var7;
                    kk0Var.a0(608635513);
                    je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                    if (xkVar instanceof m84) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.W(125, 1, null, null);
                    kk0Var.q = true;
                    if (kk0Var.O) {
                        kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                    } else {
                        kk0Var.o0();
                    }
                    b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                    xp1.E(kk0Var, le1Var10, pe.m);
                    xp1.E(kk0Var, le1Var12, pe.n);
                    kk0Var.r(true);
                    kk0Var.r(false);
                }
                le1Var9 = le1Var12;
                le1Var8 = le1Var11;
                cVar3 = cVar4;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                le1Var8 = le1Var5;
                le1Var9 = le1Var6;
                le1Var10 = le1Var7;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
            }
        }
        i3 |= 384;
        le1Var5 = le1Var2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                le1Var6 = le1Var3;
                if (kk0Var.j(le1Var6)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    le1Var7 = le1Var4;
                    if (kk0Var.j(le1Var7)) {
                        i9 = 16384;
                    } else {
                        i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (kk0Var.S(i3 & 1, z)) {
                    if (i10 != 0) {
                        cVar4 = c.i;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i4 != 0) {
                        le1Var11 = null;
                    } else {
                        le1Var11 = le1Var5;
                    }
                    if (i6 != 0) {
                        le1Var6 = v1Var;
                    }
                    if (i8 != 0) {
                        le1Var7 = v1Var;
                    }
                    currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                    c cVarThen13 = cVar4.then(FocusGroupPropertiesElement.c);
                    FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement13 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                        @Override // defpackage.tf2
                        public final of2 create() {
                            return new db1(0, 7, null);
                        }

                        public final boolean equals(Object obj) {
                            return obj == this;
                        }

                        public final int hashCode() {
                            return 1739042953;
                        }

                        @Override // defpackage.tf2
                        public final void inspectableProperties(InspectorInfo inspectorInfo) {
                            inspectorInfo.setName("focusTarget");
                        }

                        @Override // defpackage.tf2
                        public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                        }
                    };
                    cVarD = b.d(kk0Var, cVarThen13.then(focusTargetNode$FocusTargetElement13).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement13));
                    wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                    dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                    su2VarN = kk0Var.n();
                    n32Var = (n32) kk0Var.l(d72.a);
                    u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (le1Var11 != null) {
                        kk0Var.a0(607780130);
                        je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.e0();
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                        } else {
                            kk0Var.o0();
                        }
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var11, pe.d);
                        xp1.E(kk0Var, le1Var10, pe.h);
                        xp1.E(kk0Var, le1Var12, pe.l);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    } else {
                        le1Var12 = le1Var6;
                        le1Var10 = le1Var7;
                        kk0Var.a0(608635513);
                        je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                        if (xkVar instanceof m84) {
                            rj0.a();
                            throw null;
                        }
                        kk0Var.W(125, 1, null, null);
                        kk0Var.q = true;
                        if (kk0Var.O) {
                            kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                        } else {
                            kk0Var.o0();
                        }
                        b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                        xp1.E(kk0Var, le1Var10, pe.m);
                        xp1.E(kk0Var, le1Var12, pe.n);
                        kk0Var.r(true);
                        kk0Var.r(false);
                    }
                    le1Var9 = le1Var12;
                    le1Var8 = le1Var11;
                    cVar3 = cVar4;
                } else {
                    kk0Var.V();
                    cVar3 = cVar2;
                    le1Var8 = le1Var5;
                    le1Var9 = le1Var6;
                    le1Var10 = le1Var7;
                }
                w33VarV = kk0Var.v();
                if (w33VarV != null) {
                    w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
                }
            }
            i3 |= 24576;
            le1Var7 = le1Var4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i10 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    le1Var11 = null;
                } else {
                    le1Var11 = le1Var5;
                }
                if (i6 != 0) {
                    le1Var6 = v1Var;
                }
                if (i8 != 0) {
                    le1Var7 = v1Var;
                }
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                c cVarThen14 = cVar4.then(FocusGroupPropertiesElement.c);
                FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement14 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                    @Override // defpackage.tf2
                    public final of2 create() {
                        return new db1(0, 7, null);
                    }

                    public final boolean equals(Object obj) {
                        return obj == this;
                    }

                    public final int hashCode() {
                        return 1739042953;
                    }

                    @Override // defpackage.tf2
                    public final void inspectableProperties(InspectorInfo inspectorInfo) {
                        inspectorInfo.setName("focusTarget");
                    }

                    @Override // defpackage.tf2
                    public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                    }
                };
                cVarD = b.d(kk0Var, cVarThen14.then(focusTargetNode$FocusTargetElement14).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement14));
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                su2VarN = kk0Var.n();
                n32Var = (n32) kk0Var.l(d72.a);
                u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (le1Var11 != null) {
                    kk0Var.a0(607780130);
                    je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                    if (xkVar instanceof m84) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                    } else {
                        kk0Var.o0();
                    }
                    le1Var12 = le1Var6;
                    le1Var10 = le1Var7;
                    b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                    xp1.E(kk0Var, le1Var11, pe.d);
                    xp1.E(kk0Var, le1Var10, pe.h);
                    xp1.E(kk0Var, le1Var12, pe.l);
                    kk0Var.r(true);
                    kk0Var.r(false);
                } else {
                    le1Var12 = le1Var6;
                    le1Var10 = le1Var7;
                    kk0Var.a0(608635513);
                    je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                    if (xkVar instanceof m84) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.W(125, 1, null, null);
                    kk0Var.q = true;
                    if (kk0Var.O) {
                        kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                    } else {
                        kk0Var.o0();
                    }
                    b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                    xp1.E(kk0Var, le1Var10, pe.m);
                    xp1.E(kk0Var, le1Var12, pe.n);
                    kk0Var.r(true);
                    kk0Var.r(false);
                }
                le1Var9 = le1Var12;
                le1Var8 = le1Var11;
                cVar3 = cVar4;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                le1Var8 = le1Var5;
                le1Var9 = le1Var6;
                le1Var10 = le1Var7;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
            }
        }
        i3 |= 3072;
        le1Var6 = le1Var3;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                le1Var7 = le1Var4;
                if (kk0Var.j(le1Var7)) {
                    i9 = 16384;
                } else {
                    i9 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (kk0Var.S(i3 & 1, z)) {
                if (i10 != 0) {
                    cVar4 = c.i;
                } else {
                    cVar4 = cVar2;
                }
                if (i4 != 0) {
                    le1Var11 = null;
                } else {
                    le1Var11 = le1Var5;
                }
                if (i6 != 0) {
                    le1Var6 = v1Var;
                }
                if (i8 != 0) {
                    le1Var7 = v1Var;
                }
                currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                c cVarThen15 = cVar4.then(FocusGroupPropertiesElement.c);
                FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement15 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                    @Override // defpackage.tf2
                    public final of2 create() {
                        return new db1(0, 7, null);
                    }

                    public final boolean equals(Object obj) {
                        return obj == this;
                    }

                    public final int hashCode() {
                        return 1739042953;
                    }

                    @Override // defpackage.tf2
                    public final void inspectableProperties(InspectorInfo inspectorInfo) {
                        inspectorInfo.setName("focusTarget");
                    }

                    @Override // defpackage.tf2
                    public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                    }
                };
                cVarD = b.d(kk0Var, cVarThen15.then(focusTargetNode$FocusTargetElement15).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement15));
                wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
                dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
                su2VarN = kk0Var.n();
                n32Var = (n32) kk0Var.l(d72.a);
                u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (le1Var11 != null) {
                    kk0Var.a0(607780130);
                    je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                    if (xkVar instanceof m84) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.e0();
                    if (kk0Var.O) {
                        kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                    } else {
                        kk0Var.o0();
                    }
                    le1Var12 = le1Var6;
                    le1Var10 = le1Var7;
                    b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                    xp1.E(kk0Var, le1Var11, pe.d);
                    xp1.E(kk0Var, le1Var10, pe.h);
                    xp1.E(kk0Var, le1Var12, pe.l);
                    kk0Var.r(true);
                    kk0Var.r(false);
                } else {
                    le1Var12 = le1Var6;
                    le1Var10 = le1Var7;
                    kk0Var.a0(608635513);
                    je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                    if (xkVar instanceof m84) {
                        rj0.a();
                        throw null;
                    }
                    kk0Var.W(125, 1, null, null);
                    kk0Var.q = true;
                    if (kk0Var.O) {
                        kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                    } else {
                        kk0Var.o0();
                    }
                    b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                    xp1.E(kk0Var, le1Var10, pe.m);
                    xp1.E(kk0Var, le1Var12, pe.n);
                    kk0Var.r(true);
                    kk0Var.r(false);
                }
                le1Var9 = le1Var12;
                le1Var8 = le1Var11;
                cVar3 = cVar4;
            } else {
                kk0Var.V();
                cVar3 = cVar2;
                le1Var8 = le1Var5;
                le1Var9 = le1Var6;
                le1Var10 = le1Var7;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
            }
        }
        i3 |= 24576;
        le1Var7 = le1Var4;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kk0Var.S(i3 & 1, z)) {
            if (i10 != 0) {
                cVar4 = c.i;
            } else {
                cVar4 = cVar2;
            }
            if (i4 != 0) {
                le1Var11 = null;
            } else {
                le1Var11 = le1Var5;
            }
            if (i6 != 0) {
                le1Var6 = v1Var;
            }
            if (i8 != 0) {
                le1Var7 = v1Var;
            }
            currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            c cVarThen16 = cVar4.then(FocusGroupPropertiesElement.c);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement16 = new tf2() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                @Override // defpackage.tf2
                public final of2 create() {
                    return new db1(0, 7, null);
                }

                public final boolean equals(Object obj) {
                    return obj == this;
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // defpackage.tf2
                public final void inspectableProperties(InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("focusTarget");
                }

                @Override // defpackage.tf2
                public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
                }
            };
            cVarD = b.d(kk0Var, cVarThen16.then(focusTargetNode$FocusTargetElement16).then(FocusTargetPropertiesElement.c).then(focusTargetNode$FocusTargetElement16));
            wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
            dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
            su2VarN = kk0Var.n();
            n32Var = (n32) kk0Var.l(d72.a);
            u93Var = (u93) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            if (le1Var11 != null) {
                kk0Var.a0(607780130);
                je1VarCreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                if (xkVar instanceof m84) {
                    rj0.a();
                    throw null;
                }
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(je1VarCreateAndroidViewNodeFactory2);
                } else {
                    kk0Var.o0();
                }
                le1Var12 = le1Var6;
                le1Var10 = le1Var7;
                b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                xp1.E(kk0Var, le1Var11, pe.d);
                xp1.E(kk0Var, le1Var10, pe.h);
                xp1.E(kk0Var, le1Var12, pe.l);
                kk0Var.r(true);
                kk0Var.r(false);
            } else {
                le1Var12 = le1Var6;
                le1Var10 = le1Var7;
                kk0Var.a0(608635513);
                je1VarCreateAndroidViewNodeFactory = createAndroidViewNodeFactory(le1Var, kk0Var, i3 & 14);
                if (xkVar instanceof m84) {
                    rj0.a();
                    throw null;
                }
                kk0Var.W(125, 1, null, null);
                kk0Var.q = true;
                if (kk0Var.O) {
                    kk0Var.m(je1VarCreateAndroidViewNodeFactory);
                } else {
                    kk0Var.o0();
                }
                b(kk0Var, cVarD, currentCompositeKeyHash, wu0Var, n32Var, u93Var, dx1Var, su2VarN);
                xp1.E(kk0Var, le1Var10, pe.m);
                xp1.E(kk0Var, le1Var12, pe.n);
                kk0Var.r(true);
                kk0Var.r(false);
            }
            le1Var9 = le1Var12;
            le1Var8 = le1Var11;
            cVar3 = cVar4;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
            le1Var8 = le1Var5;
            le1Var9 = le1Var6;
            le1Var10 = le1Var7;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new qe(le1Var, cVar3, le1Var8, le1Var9, le1Var10, i, i2));
        }
    }

    public static final bd4 a(ux1 ux1Var) {
        bd4 bd4Var = ux1Var.w;
        if (bd4Var != null) {
            return bd4Var;
        }
        throw fq2.i("Required value was null.");
    }

    public static final void b(kk0 kk0Var, c cVar, int i, wu0 wu0Var, n32 n32Var, u93 u93Var, dx1 dx1Var, su2 su2Var) {
        androidx.compose.ui.node.a.j.getClass();
        xp1.E(kk0Var, su2Var, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
        xp1.E(kk0Var, cVar, pe.o);
        xp1.E(kk0Var, wu0Var, pe.p);
        xp1.E(kk0Var, n32Var, pe.q);
        xp1.E(kk0Var, u93Var, pe.r);
        xp1.E(kk0Var, dx1Var, pe.s);
        pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(i))) {
            fq2.v(i, kk0Var, i, setCompositeKeyHash);
        }
    }

    private static final <T extends View> je1 createAndroidViewNodeFactory(le1 le1Var, ck0 ck0Var, int i) {
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        kk0 kk0Var = (kk0) ck0Var;
        Context context = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
        qk0 qk0VarRememberCompositionContext = rj0.rememberCompositionContext(kk0Var, 0);
        g93 g93Var = (g93) kk0Var.l(i93.a);
        View view = (View) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalView());
        boolean zJ = kk0Var.j(context) | ((((i & 14) ^ 6) > 4 && kk0Var.h(le1Var)) || (i & 6) == 4) | kk0Var.j(qk0VarRememberCompositionContext) | kk0Var.j(g93Var) | kk0Var.f(currentCompositeKeyHash) | kk0Var.j(view);
        Object objP = kk0Var.P();
        if (zJ || objP == Composer$Companion.getEmpty()) {
            re reVar = new re(context, le1Var, qk0VarRememberCompositionContext, g93Var, currentCompositeKeyHash, view);
            kk0Var.l0(reVar);
            objP = reVar;
        }
        return (je1) objP;
    }
}
