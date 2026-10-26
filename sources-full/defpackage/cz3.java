package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class cz3 {
    public final ft2 a = cl3.d(null);
    public hg b;
    public final ml3 c;

    public cz3(hg hgVar) {
        pv3 pv3Var = pv3.x;
        fg fgVar = new fg(hgVar);
        ArrayList arrayList = fgVar.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) pv3Var.invoke(((eg) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                gg ggVar = (gg) list.get(i2);
                arrayList3.add(new eg(ggVar.b, ggVar.c, ggVar.a, ggVar.d));
            }
            pe0.s0(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = fgVar.d();
        this.c = new ml3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void StyleAnnotation(Object[] objArr, le1 le1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-2083052099);
        int i2 = (i & 48) == 0 ? (kk0Var.j(le1Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(this) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        kk0Var.W(-416604407, 0, Integer.valueOf(objArr.length), null);
        for (Object obj : objArr) {
            i2 |= kk0Var.j(obj) ? 4 : 0;
        }
        kk0Var.r(false);
        if ((i2 & 14) == 0) {
            i2 |= 2;
        }
        int i3 = 1;
        if (kk0Var.S(i2 & 1, (i2 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(le1Var);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zJ = ((i2 & 112) == 32) | kk0Var.j(this);
            Object objP = kk0Var.P();
            if (zJ || objP == Composer$Companion.getEmpty()) {
                objP = new dt(this, le1Var, i3);
                kk0Var.l0(objP);
            }
            r11.DisposableEffect(array, (le1) objP, (ck0) kk0Var, 0);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ed(this, objArr, le1Var, i, 4));
        }
    }

    public static gg b(gg ggVar, xy3 xy3Var) {
        pg2 pg2Var = xy3Var.b;
        int iC = pg2Var.c(pg2Var.f - 1, false);
        if (ggVar.b < iC) {
            return gg.a(ggVar, null, 0, Math.min(ggVar.c, iC), 11);
        }
        return null;
    }

    public final void LinksComposables(ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1154651354);
        char c = 2;
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (kk0Var.S(i2 & 1, (i2 & 3) != 2)) {
            UriHandler uriHandler = (UriHandler) kk0Var.l(CompositionLocalsKt.getLocalUriHandler());
            hg hgVar = this.b;
            List listA = hgVar.a(hgVar.d.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                gg ggVar = (gg) listA.get(i3);
                int i4 = ggVar.b;
                Object obj = ggVar.a;
                if (i4 != ggVar.c) {
                    kk0Var.a0(1386075176);
                    Object objP = kk0Var.P();
                    if (objP == Composer$Companion.getEmpty()) {
                        objP = fq2.j(kk0Var);
                    }
                    gh2 gh2Var = (gh2) objP;
                    c cVarI = a.i(we3.b(androidx.compose.ui.graphics.a.a(c.i, new sg2(this, 17, ggVar)), false, pv3.y).then(new kz3(new nj1(this, 3, ggVar))), gh2Var);
                    androidx.compose.ui.input.pointer.a.a.getClass();
                    c cVarY = vl0.Y(cVarI, g13.f);
                    boolean zJ = kk0Var.j(this) | kk0Var.h(ggVar) | kk0Var.j(uriHandler);
                    Object objP2 = kk0Var.P();
                    if (zJ || objP2 == Composer$Companion.getEmpty()) {
                        objP2 = new c9(this, ggVar, uriHandler);
                        kk0Var.l0(objP2);
                    }
                    so0 so0Var = null;
                    vw.Box(a.f(cVarY, gh2Var, null, null, (je1) objP2), kk0Var, 0);
                    m42 m42Var = (m42) obj;
                    dz3 dz3VarA = m42Var.a();
                    if (dz3VarA == null || (dz3VarA.a == null && dz3VarA.b == null && dz3VarA.c == null && dz3VarA.d == null)) {
                        kk0Var.a0(1388926990);
                        kk0Var.r(false);
                    } else {
                        kk0Var.a0(1386898319);
                        Object objP3 = kk0Var.P();
                        if (objP3 == Composer$Companion.getEmpty()) {
                            objP3 = new r42(gh2Var);
                            kk0Var.l0(objP3);
                        }
                        r42 r42Var = (r42) objP3;
                        Object objP4 = kk0Var.P();
                        int i5 = 16;
                        if (objP4 == Composer$Companion.getEmpty()) {
                            objP4 = new f60(r42Var, so0Var, i5);
                            kk0Var.l0(objP4);
                        }
                        r11.LaunchedEffect(w84.a, (ne1) objP4, kk0Var, 6);
                        ct2 ct2Var = r42Var.b;
                        ct2 ct2Var2 = r42Var.b;
                        Boolean boolValueOf = Boolean.valueOf((ct2Var.f() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((ct2Var2.f() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((ct2Var2.f() & 4) != 0);
                        dz3 dz3VarA2 = m42Var.a();
                        em3 em3Var = dz3VarA2 != null ? dz3VarA2.a : null;
                        dz3 dz3VarA3 = m42Var.a();
                        em3 em3Var2 = dz3VarA3 != null ? dz3VarA3.b : null;
                        dz3 dz3VarA4 = m42Var.a();
                        em3 em3Var3 = dz3VarA4 != null ? dz3VarA4.c : null;
                        dz3 dz3VarA5 = m42Var.a();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, em3Var, em3Var2, em3Var3, dz3VarA5 != null ? dz3VarA5.d : null};
                        boolean zJ2 = kk0Var.j(this) | kk0Var.h(ggVar);
                        Object objP5 = kk0Var.P();
                        if (zJ2 || objP5 == Composer$Companion.getEmpty()) {
                            objP5 = new sg2(this, ggVar, r42Var, i5);
                            kk0Var.l0(objP5);
                        }
                        StyleAnnotation(objArr, (le1) objP5, kk0Var, (i2 << 6) & 896);
                        kk0Var.r(false);
                    }
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(1388940878);
                    kk0Var.r(false);
                }
                i3++;
                c = c;
            }
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new uw(i, 5, this));
        }
    }
}
