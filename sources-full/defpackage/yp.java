package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.ContentScale$Companion;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import java.util.ArrayList;
import notrack.ai.data.avatars.AvatarItem;
import notrack.ai.data.avatars.AvatarTile;
import notrack.ai.data.avatars.AvatarView;

/* JADX INFO: loaded from: classes.dex */
public final class yp extends ww1 implements pe1 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ AvatarView h;
    public final /* synthetic */ le1 l;
    public final /* synthetic */ le1 m;
    public final /* synthetic */ mi2 n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(ArrayList arrayList, boolean z, AvatarView avatarView, le1 le1Var, le1 le1Var2, mi2 mi2Var, String str, String str2, String str3) {
        super(4);
        this.c = arrayList;
        this.d = z;
        this.h = avatarView;
        this.l = le1Var;
        this.m = le1Var2;
        this.n = mi2Var;
        this.o = str;
        this.p = str2;
        this.q = str3;
    }

    @Override // defpackage.pe1
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((zy1) obj, ((Number) obj2).intValue(), (ck0) obj3, ((Number) obj4).intValue());
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x026a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0272  */
    public final void invoke(zy1 zy1Var, int i, ck0 ck0Var, int i2) {
        int i3;
        c cVarH;
        AvatarItem avatarItem;
        y73 y73Var;
        qn0 qn0Var;
        kk0 kk0Var;
        String str;
        String initial;
        if ((i2 & 6) == 0) {
            i3 = i2 | (((kk0) ck0Var).h(zy1Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ((kk0) ck0Var).f(i) ? 32 : 16;
        }
        kk0 kk0Var2 = (kk0) ck0Var;
        boolean zS = kk0Var2.S(i3 & 1, (i3 & 147) != 146);
        xk xkVar = kk0Var2.a;
        if (!zS) {
            kk0Var2.V();
            return;
        }
        AvatarItem avatarItem2 = (AvatarItem) this.c.get(i);
        kk0Var2.a0(308065313);
        boolean z = (avatarItem2.isFree() || this.d) ? false : true;
        AvatarView avatarView = this.h;
        String strP = null;
        boolean zN = kr1.n(avatarView != null ? avatarView.getRef() : null, avatarItem2.getId());
        yt center = Alignment$Companion.getCenter();
        Modifier$Companion modifier$Companion = c.i;
        vb2 vb2VarC = vw.c(center, false);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
        su2 su2VarN = kk0Var2.n();
        c cVarD = b.d(kk0Var2, modifier$Companion);
        a.j.getClass();
        d4 constructor = ComposeUiNode$Companion.getConstructor();
        if (xkVar == null) {
            rj0.a();
            throw null;
        }
        kk0Var2.e0();
        if (kk0Var2.O) {
            kk0Var2.m(constructor);
        } else {
            kk0Var2.o0();
        }
        pe peVarH = fq2.h(kk0Var2, vb2VarC, kk0Var2, su2VarN);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarH);
        }
        xp1.E(kk0Var2, cVarD, ComposeUiNode$Companion.getSetModifier());
        c cVarD2 = androidx.compose.foundation.layout.a.d(modifier$Companion);
        y73 y73Var2 = z73.a;
        c cVarN = xr0.N(cVarD2, y73Var2);
        if (zN) {
            kk0Var2.a0(1258581112);
            cVarH = sf3.h(modifier$Companion, 2.0f, gx.getBrandGreen(kk0Var2, 0), y73Var2);
            kk0Var2.r(false);
        } else {
            kk0Var2.a0(1258583739);
            kk0Var2.r(false);
            cVarH = modifier$Companion;
        }
        c cVarThen = cVarN.then(cVarH);
        boolean zI = kk0Var2.i(z) | kk0Var2.h(this.l) | kk0Var2.h(avatarItem2) | kk0Var2.h(this.m);
        Object objP = kk0Var2.P();
        if (zI || objP == Composer$Companion.getEmpty()) {
            avatarItem = avatarItem2;
            xp xpVar = new xp(z, this.l, avatarItem, this.m, this.n);
            kk0Var2.l0(xpVar);
            objP = xpVar;
        } else {
            avatarItem = avatarItem2;
        }
        c cVarL = g13.l(androidx.compose.foundation.a.e(cVarThen, false, null, (je1) objP, 7), z != 0 ? 0.45f : 1.0f);
        vb2 vb2VarC2 = vw.c(Alignment$Companion.getTopStart(), false);
        int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
        su2 su2VarN2 = kk0Var2.n();
        c cVarD3 = b.d(kk0Var2, cVarL);
        d4 constructor2 = ComposeUiNode$Companion.getConstructor();
        kk0Var2.e0();
        if (kk0Var2.O) {
            kk0Var2.m(constructor2);
        } else {
            kk0Var2.o0();
        }
        pe peVarH2 = fq2.h(kk0Var2, vb2VarC2, kk0Var2, su2VarN2);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash2))) {
            fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarH2);
        }
        xp1.E(kk0Var2, cVarD3, ComposeUiNode$Companion.getSetModifier());
        AvatarTile tile = avatarItem.getTile();
        qn0 qn0Var2 = k43.a;
        if (tile != null) {
            kk0Var2.a0(326750920);
            c cVarB = androidx.compose.foundation.a.b(d.c, zp.f(avatarItem.getTile().getBg(), re0.c), qn0Var2);
            vb2 vb2VarC3 = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN3 = kk0Var2.n();
            c cVarD4 = b.d(kk0Var2, cVarB);
            d4 constructor3 = ComposeUiNode$Companion.getConstructor();
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor3);
            } else {
                kk0Var2.o0();
            }
            pe peVarH3 = fq2.h(kk0Var2, vb2VarC3, kk0Var2, su2VarN3);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash3))) {
                fq2.v(currentCompositeKeyHash3, kk0Var2, currentCompositeKeyHash3, peVarH3);
            }
            xp1.E(kk0Var2, cVarD4, ComposeUiNode$Companion.getSetModifier());
            if (kr1.n(this.o, "ai")) {
                kk0Var2.a0(196307189);
                qn0Var = qn0Var2;
                uy3.m1842xe1e389ce("N", (c) null, zp.f(avatarItem.getTile().getFg(), re0.e), gm4.D(22), (gc1) null, ic1.n, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var2, 199686, 0, 131026);
                kk0Var = kk0Var2;
                kk0Var.r(false);
                y73Var = y73Var2;
            } else {
                kk0Var2.a0(196500350);
                if (avatarView == null || (initial = avatarView.getInitial()) == null) {
                    str = this.p;
                    if (mo3.C0(str)) {
                        str = "A";
                    }
                    strP = str;
                } else {
                    strP = mo3.C0(initial) ? null : initial;
                    if (strP == null) {
                        str = this.p;
                        if (mo3.C0(str)) {
                            str = "A";
                        }
                        strP = str;
                    }
                }
                qn0Var = qn0Var2;
                y73Var = y73Var2;
                uy3.m1842xe1e389ce(strP, (c) null, zp.f(avatarItem.getTile().getFg(), re0.e), gm4.D(22), (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var2, 199680, 0, 131026);
                kk0Var = kk0Var2;
                kk0Var.r(false);
            }
            kk0Var.r(true);
            kk0Var.r(false);
        } else {
            y73Var = y73Var2;
            modifier$Companion = modifier$Companion;
            kk0Var2.a0(327541203);
            String urlSm = avatarItem.getUrlSm();
            if (urlSm == null) {
                urlSm = avatarItem.getUrl();
            }
            if (urlSm != null) {
                strP = to3.q0(urlSm, "http", false) ? urlSm : ud2.p(this.q, urlSm);
            }
            qn0Var = qn0Var2;
            vh3.m1845xef24a3e0(strP, avatarItem.getId(), d.c, null, null, null, ContentScale$Companion.getCrop(), 0.0f, null, 0, false, kk0Var2, 1573248, 0, 1976);
            kk0Var = kk0Var2;
            kk0Var.r(false);
        }
        kk0Var.r(true);
        if (z) {
            kk0Var.a0(363068773);
            c cVarN2 = xr0.N(d.j(androidx.compose.foundation.layout.b.a.a(modifier$Companion, Alignment$Companion.getBottomEnd()), 20.0f), y73Var);
            ab2 ab2Var = ab2.a;
            c cVarB2 = androidx.compose.foundation.a.b(cVarN2, ab2Var.getColorScheme(kk0Var, 0).p, qn0Var);
            vb2 vb2VarC4 = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN4 = kk0Var.n();
            c cVarD5 = b.d(kk0Var, cVarB2);
            d4 constructor4 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor4);
            } else {
                kk0Var.o0();
            }
            pe peVarH4 = fq2.h(kk0Var, vb2VarC4, kk0Var, su2VarN4);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                fq2.v(currentCompositeKeyHash4, kk0Var, currentCompositeKeyHash4, peVarH4);
            }
            xp1.E(kk0Var, cVarD5, ComposeUiNode$Companion.getSetModifier());
            ul1.m1829xf2a7a69(s22.a.getLock(kk0Var, 6), (String) null, d.j(modifier$Companion, 12.0f), ab2Var.getColorScheme(kk0Var, 0).s, kk0Var, 432, 0);
            kk0Var.r(true);
        } else {
            kk0Var.a0(347634927);
        }
        kk0Var.r(false);
        kk0Var.r(true);
        kk0Var.r(false);
    }
}
