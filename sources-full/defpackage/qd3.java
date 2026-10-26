package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.input.key.a;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.TextToolbar;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class qd3 {
    public static final void DisableSelection(ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(336063542);
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(ne1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (kk0Var.S(i2 & 1, (i2 & 3) != 2)) {
            yk0.CompositionLocalProvider(re3.a.c(null), ne1Var, kk0Var, ((i2 << 3) & 112) | 8);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new q11(i, 1, ne1Var));
        }
    }

    public static final void SelectionContainer(c cVar, fd3 fd3Var, le1 le1Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        c cVar2;
        int i3;
        c cVar3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(2078139907);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
            cVar2 = cVar;
        } else if ((i & 6) == 0) {
            cVar2 = cVar;
            i3 = (kk0Var.h(cVar2) ? 4 : 2) | i;
        } else {
            cVar2 = cVar;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(fd3Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.j(le1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 2048 : 1024;
        }
        if (kk0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            c cVar4 = i4 != 0 ? c.i : cVar2;
            qe3 qe3Var = (qe3) d53.rememberSaveable(new Object[0], (x93) qe3.l, (String) null, (je1) bb2.u, (ck0) kk0Var, 3072, 4);
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new le3(qe3Var);
                kk0Var.l0(objP);
            }
            le3 le3Var = (le3) objP;
            Clipboard clipboard = (Clipboard) kk0Var.l(CompositionLocalsKt.getLocalClipboard());
            Object objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = r11.a(x21.c, kk0Var);
                kk0Var.l0(objP2);
            }
            gq0 gq0Var = (gq0) objP2;
            le3Var.e = (lh1) kk0Var.l(CompositionLocalsKt.getLocalHapticFeedback());
            boolean zH = kk0Var.h(gq0Var) | kk0Var.h(clipboard);
            Object objP3 = kk0Var.P();
            if (zH || objP3 == Composer$Companion.getEmpty()) {
                objP3 = new sg2(gq0Var, 7, clipboard);
                kk0Var.l0(objP3);
            }
            le3Var.f = (le1) objP3;
            le3Var.g = (TextToolbar) kk0Var.l(CompositionLocalsKt.getLocalTextToolbar());
            le3Var.d = new sg2(le3Var, 8, le1Var);
            le3Var.m(fd3Var);
            c cVarA = c.i;
            c cVarA2 = a.a(oq3.b(androidx.compose.foundation.a.h(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(androidx.compose.ui.layout.a.d(oq3.b(cVarA, w84.a, new pp0(le3Var, i5, new kd3(le3Var, 3))), new od3(le3Var, 4)), le3Var.h), new od3(le3Var, 5)), true, null), 8675309, new yn0(new od3(le3Var, 6), 1)), new od3(le3Var, 7));
            if (le3Var.d() != null && le3Var.g()) {
                fd3 fd3VarE = le3Var.e();
                if (!(fd3VarE == null ? true : kr1.n(fd3VarE.a, fd3VarE.b)) && b92.a()) {
                    cVarA = b.a(cVarA, InspectableValueKt.getNoInspectorInfo(), new pe3(le3Var));
                }
            }
            rh3.SimpleLayout(cVar4.then(cVarA2.then(cVarA)), zg0.rememberComposableLambda(-1869667463, true, new nd3(ne1Var, le3Var, qe3Var), kk0Var, 54), kk0Var, 48, 0);
            boolean zJ = kk0Var.j(le3Var);
            Object objP4 = kk0Var.P();
            if (zJ || objP4 == Composer$Companion.getEmpty()) {
                objP4 = new od3(le3Var, 0);
                kk0Var.l0(objP4);
            }
            r11.DisposableEffect(le3Var, (le1) objP4, kk0Var, 0);
            cVar3 = cVar4;
        } else {
            kk0Var.V();
            cVar3 = cVar2;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new uc(cVar3, fd3Var, le1Var, ne1Var, i, i2, 4));
        }
    }

    public static final void SelectionContainer(c cVar, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1075498320);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        if (kk0Var.S(i3 & 1, (i3 & 19) != 18)) {
            c cVar3 = i4 != 0 ? c.i : cVar;
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = cl3.d(null);
                kk0Var.l0(objP);
            }
            mi2 mi2Var = (mi2) objP;
            fd3 fd3Var = (fd3) mi2Var.getValue();
            Object objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = new ws(2, mi2Var);
                kk0Var.l0(objP2);
            }
            SelectionContainer(cVar3, fd3Var, (le1) objP2, ne1Var, kk0Var, (i3 & 14) | 384 | ((i3 << 6) & 7168), 0);
            cVar2 = cVar3;
        } else {
            kk0Var.V();
            cVar2 = cVar;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new va(cVar2, ne1Var, i, i2, 1));
        }
    }
}
