package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class po0 {
    public static final void ContextMenuArea(le3 le3Var, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        ne1 ne1Var2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(605522716);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(le3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        int i4 = 9;
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new ho0();
                kk0Var.l0(objP);
            }
            ho0 ho0Var = (ho0) objP;
            Object objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = new lo0(ho0Var, i3);
                kk0Var.l0(objP2);
            }
            ne1Var2 = ne1Var;
            vn0.ContextMenuArea(ho0Var, (je1) objP2, new sg2(ho0Var, i4, le3Var), null, false, null, ne1Var2, kk0Var, ((i2 << 15) & 3670016) | 54, 56);
        } else {
            ne1Var2 = ne1Var;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, i4, le3Var, ne1Var2));
        }
    }

    public static final void ContextMenuArea(wx3 wx3Var, boolean z, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(2103477555);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (kk0Var2.j(wx3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var2.i(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var2.j(ne1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        int i4 = i2;
        int i5 = 1;
        if (kk0Var2.S(i4 & 1, (i4 & 147) != 146)) {
            Object objP = kk0Var2.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new ho0();
                kk0Var2.l0(objP);
            }
            ho0 ho0Var = (ho0) objP;
            Object objP2 = kk0Var2.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = r11.a(x21.c, kk0Var2);
                kk0Var2.l0(objP2);
            }
            gq0 gq0Var = (gq0) objP2;
            Object objP3 = kk0Var2.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                objP3 = cl3.d(new rc2(0));
                kk0Var2.l0(objP3);
            }
            mi2 mi2Var = (mi2) objP3;
            boolean zJ = kk0Var2.j(gq0Var);
            Object objP4 = kk0Var2.P();
            if (zJ || objP4 == Composer$Companion.getEmpty()) {
                objP4 = new ea(i3, gq0Var);
                kk0Var2.l0(objP4);
            }
            cp0 cp0Var = new cp0(mi2Var, ho0Var, (ne1) objP4, wx3Var, 5);
            Object objP5 = kk0Var2.P();
            if (objP5 == Composer$Companion.getEmpty()) {
                objP5 = new lo0(ho0Var, i5);
                kk0Var2.l0(objP5);
            }
            je1 je1Var = (je1) objP5;
            boolean zJ2 = kk0Var2.j(gq0Var) | kk0Var2.j(wx3Var);
            Object objP6 = kk0Var2.P();
            if (zJ2 || objP6 == Composer$Companion.getEmpty()) {
                objP6 = new oh(gq0Var, mi2Var, wx3Var, 5);
                kk0Var2.l0(objP6);
            }
            kk0Var = kk0Var2;
            vn0.ContextMenuArea(ho0Var, je1Var, cp0Var, null, z, (je1) objP6, ne1Var, kk0Var, ((i4 << 9) & 57344) | 54 | ((i4 << 12) & 3670016), 8);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new kd(wx3Var, z, ne1Var, i));
        }
    }

    public static final void ContextMenuArea(xw3 xw3Var, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        ne1 ne1Var2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1985516685);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(xw3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        int i4 = 0;
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new ho0();
                kk0Var.l0(objP);
            }
            ho0 ho0Var = (ho0) objP;
            Object objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = r11.a(x21.c, kk0Var);
                kk0Var.l0(objP2);
            }
            gq0 gq0Var = (gq0) objP2;
            Object objP3 = kk0Var.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                objP3 = cl3.d(new rc2(0));
                kk0Var.l0(objP3);
            }
            mi2 mi2Var = (mi2) objP3;
            Object objP4 = kk0Var.P();
            if (objP4 == Composer$Companion.getEmpty()) {
                objP4 = new lo0(ho0Var, i4);
                kk0Var.l0(objP4);
            }
            je1 je1Var = (je1) objP4;
            ie ieVar = new ie(mi2Var, ho0Var, xw3Var, 25);
            boolean zI = xw3Var.i();
            boolean zJ = kk0Var.j(gq0Var) | kk0Var.j(xw3Var);
            Object objP5 = kk0Var.P();
            if (zJ || objP5 == Composer$Companion.getEmpty()) {
                objP5 = new oh(gq0Var, mi2Var, xw3Var, i3);
                kk0Var.l0(objP5);
            }
            ne1Var2 = ne1Var;
            vn0.ContextMenuArea(ho0Var, je1Var, ieVar, null, zI, (je1) objP5, ne1Var2, kk0Var, ((i2 << 15) & 3670016) | 54, 8);
        } else {
            ne1Var2 = ne1Var;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, 8, xw3Var, ne1Var2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f A[PHI: r1 r4 r8 r9
  0x008f: PHI (r1v3 int) = (r1v1 int), (r1v9 int) binds: [B:20:0x0053, B:34:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r4v2 ??) = (r4v0 ??), (r4v10 ??) binds: [B:20:0x0053, B:34:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r8v3 xw3) = (r8v0 xw3), (r8v8 xw3) binds: [B:20:0x0053, B:34:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r9v10 int) = (r9v6 int), (r9v13 int) binds: [B:20:0x0053, B:34:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    public static final Object a(xw3 xw3Var, uo0 uo0Var) {
        oo0 oo0Var;
        ?? r4;
        int i;
        int i2;
        xw3 xw3Var2;
        int i3;
        int i4;
        ?? r5;
        boolean z;
        boolean z2;
        ?? r9;
        ?? r6;
        boolean z3;
        boolean z4;
        ?? r7;
        if (uo0Var instanceof oo0) {
            oo0Var = (oo0) uo0Var;
            int i5 = oo0Var.n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oo0Var.n = i5 - Integer.MIN_VALUE;
            } else {
                oo0Var = new oo0(uo0Var);
            }
        } else {
            oo0Var = new oo0(uo0Var);
        }
        Object obj = oo0Var.m;
        int i6 = oo0Var.n;
        boolean z5 = false;
        if (i6 == 0) {
            g13.O(obj);
            r4 = xw3Var.f instanceof kt2;
            boolean zC = jz3.c(xw3Var.k().b);
            i = !zC ? 1 : 0;
            i2 = (zC || r4 != 0) ? 0 : 1;
            if (xw3Var.h()) {
                Clipboard clipboard = xw3Var.h;
                if (clipboard != null) {
                    oo0Var.c = xw3Var;
                    oo0Var.d = r4;
                    oo0Var.h = i;
                    oo0Var.l = i2 == true ? 1 : 0;
                    oo0Var.n = 1;
                    Object clipEntry = clipboard.getClipEntry(oo0Var);
                    hq0 hq0Var = hq0.c;
                    if (clipEntry == hq0Var) {
                        r5 = r4;
                        i4 = i2;
                        return hq0Var;
                    }
                    r5 = r4;
                    i4 = i2;
                    xw3Var2 = xw3Var;
                    i3 = i2 == true ? 1 : 0;
                    obj = clipEntry;
                    r7 = r4;
                } else {
                    r5 = r4;
                    i4 = i2;
                    z = false;
                    r4 = r5;
                    i2 = i4;
                }
                if (z) {
                    z2 = true;
                } else {
                    r4 = r7;
                    z2 = false;
                    r6 = r4;
                    r9 = i2;
                }
            } else {
                r4 = r7;
                z2 = false;
                r6 = r4;
                r9 = i2;
            }
            if (i == 0 && xw3Var.h() && r6 == 0) {
                z3 = true;
            } else {
                r4 = r7;
                r6 = r4;
                r9 = i2;
                r4 = r7;
                r6 = r4;
                r9 = i2;
                z3 = false;
            }
            if (jz3.d(xw3Var.k().b) != xw3Var.k().a.d.length()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (xw3Var.h() && jz3.c(xw3Var.k().b)) {
                z5 = true;
            }
            return new rc2(rc2.a(r9, z2, z3, z4, z5));
        }
        if (i6 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i3 = oo0Var.l;
        i = oo0Var.h;
        int i7 = oo0Var.d;
        xw3Var2 = oo0Var.c;
        g13.O(obj);
        r7 = i7;
        ClipEntry clipEntry2 = (ClipEntry) obj;
        if (clipEntry2 == null || !clipEntry2.getClipData().getDescription().hasMimeType("text/*")) {
            i4 = i3;
            xw3Var = xw3Var2;
            r5 = r7;
            r5 = r4;
            i4 = i2;
            z = false;
            r4 = r5;
            i2 = i4;
        } else {
            i2 = i3;
            xw3Var = xw3Var2;
            z = true;
        }
        if (z) {
            z2 = true;
        } else {
            r4 = r7;
            z2 = false;
            r6 = r4;
            r9 = i2;
        }
        if (i == 0) {
            r4 = r7;
            r6 = r4;
            r9 = i2;
            r4 = r7;
            r6 = r4;
            r9 = i2;
            z3 = false;
        } else {
            r4 = r7;
            r6 = r4;
            r9 = i2;
            r4 = r7;
            r6 = r4;
            r9 = i2;
            z3 = false;
        }
        if (jz3.d(xw3Var.k().b) != xw3Var.k().a.d.length()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (xw3Var.h()) {
            z5 = true;
        }
        return new rc2(rc2.a(r9, z2, z3, z4, z5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(wx3 wx3Var, uo0 uo0Var) {
        no0 no0Var;
        wx3 wx3Var2;
        boolean z;
        if (uo0Var instanceof no0) {
            no0Var = (no0) uo0Var;
            int i = no0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                no0Var.l = i - Integer.MIN_VALUE;
            } else {
                no0Var = new no0(uo0Var);
            }
        } else {
            no0Var = new no0(uo0Var);
        }
        Object obj = no0Var.h;
        int i2 = no0Var.l;
        boolean z2 = false;
        if (i2 == 0) {
            g13.O(obj);
            boolean z3 = (jz3.c(wx3Var.a.d().h) || wx3Var.g) ? false : true;
            no0Var.c = wx3Var;
            no0Var.d = z3;
            no0Var.l = 1;
            Object objD = wx3Var.d(no0Var);
            hq0 hq0Var = hq0.c;
            if (objD == hq0Var) {
                return hq0Var;
            }
            wx3Var2 = wx3Var;
            z = z3;
            obj = objD;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = no0Var.d;
            wx3Var2 = no0Var.c;
            g13.O(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c cVar = wx3Var2.a;
        c cVar2 = wx3Var2.a;
        boolean z4 = (jz3.c(cVar.d().h) || !wx3Var2.d || wx3Var2.e || wx3Var2.g) ? false : true;
        boolean z5 = jz3.d(cVar2.d().h) != cVar2.d().d.length();
        if (wx3Var2.d && !wx3Var2.e && jz3.c(cVar2.d().h)) {
            z2 = true;
        }
        return new rc2(rc2.a(z, zBooleanValue, z4, z5, z2));
    }
}
