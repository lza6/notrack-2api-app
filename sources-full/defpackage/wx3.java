package defpackage;

import android.content.ClipData;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;

/* JADX INFO: loaded from: classes.dex */
public final class wx3 {
    public final c a;
    public final az3 b;
    public wu0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public lh1 h;
    public os i;
    public Clipboard j;
    public je1 l;
    public je1 m;
    public th3 t;
    public ry2 v;
    public final ft2 k = cl3.d(Boolean.TRUE);
    public final ft2 n = cl3.d(new ln2(9205357640488583168L));
    public final ft2 o = cl3.d(new ln2(9205357640488583168L));
    public final ft2 p = cl3.d(null);
    public final ft2 q = cl3.d(dx3.c);
    public final ft2 r = cl3.d(Boolean.FALSE);
    public final ft2 s = cl3.d(vz3.c);
    public int u = -1;

    public wx3(c cVar, az3 az3Var, wu0 wu0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = cVar;
        this.b = az3Var;
        this.c = wu0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object a(wx3 wx3Var, ix2 ix2Var, uo0 uo0Var) throws Throwable {
        jx3 jx3Var;
        Throwable th;
        p43 p43Var;
        wx3 wx3Var2;
        p43 p43Var2;
        wx3Var.getClass();
        if (uo0Var instanceof jx3) {
            jx3Var = (jx3) uo0Var;
            int i = jx3Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                jx3Var.n = i - Integer.MIN_VALUE;
            } else {
                jx3Var = new jx3(wx3Var, uo0Var);
            }
        } else {
            jx3Var = new jx3(wx3Var, uo0Var);
        }
        jx3 jx3Var2 = jx3Var;
        Object obj = jx3Var2.l;
        int i2 = jx3Var2.n;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p43Var2 = jx3Var2.h;
            p43Var = jx3Var2.d;
            wx3Var2 = jx3Var2.c;
            try {
                g13.O(obj);
                h(p43Var, p43Var2, wx3Var2);
                return w84.a;
            } catch (Throwable th2) {
                th = th2;
                h(p43Var, p43Var2, wx3Var2);
                throw th;
            }
        }
        g13.O(obj);
        p43 p43Var3 = new p43();
        p43Var3.c = 9205357640488583168L;
        p43 p43Var4 = new p43();
        p43Var4.c = 9205357640488583168L;
        try {
            ie ieVar = new ie(p43Var3, wx3Var, p43Var4, 26);
            kx3 kx3Var = new kx3(p43Var3, p43Var4, wx3Var, 0);
            kx3 kx3Var2 = new kx3(p43Var3, p43Var4, wx3Var, 1);
            zb3 zb3Var = new zb3(p43Var4, wx3Var, p43Var3, i3);
            jx3Var2.c = wx3Var;
            jx3Var2.d = p43Var3;
            jx3Var2.h = p43Var4;
            jx3Var2.n = 1;
            Object objF = uy0.f(ix2Var, ieVar, kx3Var, kx3Var2, zb3Var, jx3Var2);
            hq0 hq0Var = hq0.c;
            if (objF == hq0Var) {
                return hq0Var;
            }
            wx3Var2 = wx3Var;
            p43Var = p43Var3;
            p43Var2 = p43Var4;
            h(p43Var, p43Var2, wx3Var2);
            return w84.a;
        } catch (Throwable th3) {
            th = th3;
            p43Var = p43Var3;
            wx3Var2 = wx3Var;
            p43Var2 = p43Var4;
            h(p43Var, p43Var2, wx3Var2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object b(wx3 wx3Var, ix2 ix2Var, boolean z, uo0 uo0Var) throws Throwable {
        lx3 lx3Var;
        ah1 ah1Var;
        p43 p43Var;
        p43 p43Var2;
        wx3 wx3Var2;
        p43 p43Var3;
        p43 p43Var4;
        wx3 wx3Var3;
        if (uo0Var instanceof lx3) {
            lx3Var = (lx3) uo0Var;
            int i = lx3Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                lx3Var.o = i - Integer.MIN_VALUE;
            } else {
                lx3Var = new lx3(wx3Var, uo0Var);
            }
        } else {
            lx3Var = new lx3(wx3Var, uo0Var);
        }
        lx3 lx3Var2 = lx3Var;
        Object obj = lx3Var2.m;
        int i2 = lx3Var2.o;
        if (i2 != 0) {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ah1Var = lx3Var2.l;
            p43Var3 = lx3Var2.h;
            p43Var4 = lx3Var2.d;
            wx3 wx3Var4 = lx3Var2.c;
            try {
                g13.O(obj);
                wx3Var3 = wx3Var4;
                if (wx3Var3.m() == ah1Var) {
                    i(p43Var4, p43Var3, wx3Var3);
                }
                return w84.a;
            } catch (Throwable th) {
                th = th;
                wx3Var2 = wx3Var4;
                if (wx3Var2.m() == ah1Var) {
                    i(p43Var4, p43Var3, wx3Var2);
                }
                throw th;
            }
        }
        g13.O(obj);
        p43 p43Var5 = new p43();
        p43Var5.c = 9205357640488583168L;
        p43 p43Var6 = new p43();
        p43Var6.c = 0L;
        ah1Var = z ? ah1.d : ah1.h;
        try {
            sc2 sc2Var = new sc2(ah1Var, p43Var5, p43Var6, wx3Var, z);
            kx3 kx3Var = new kx3(p43Var5, wx3Var, p43Var6, 2);
            kx3 kx3Var2 = new kx3(p43Var5, wx3Var, p43Var6, 3);
            p43Var4 = p43Var5;
            p43Var3 = p43Var6;
            try {
                mx3 mx3Var = new mx3(ah1Var, p43Var3, p43Var4, wx3Var, z);
                p43Var2 = p43Var3;
                p43Var = p43Var4;
                try {
                    lx3Var2.c = wx3Var;
                    lx3Var2.d = p43Var;
                    lx3Var2.h = p43Var2;
                    lx3Var2.l = ah1Var;
                    lx3Var2.o = 1;
                    Object objF = uy0.f(ix2Var, sc2Var, kx3Var, kx3Var2, mx3Var, lx3Var2);
                    hq0 hq0Var = hq0.c;
                    if (objF == hq0Var) {
                        return hq0Var;
                    }
                    wx3Var3 = wx3Var;
                    p43Var3 = p43Var2;
                    p43Var4 = p43Var;
                    if (wx3Var3.m() == ah1Var) {
                        i(p43Var4, p43Var3, wx3Var3);
                    }
                    return w84.a;
                } catch (Throwable th2) {
                    th = th2;
                    wx3Var2 = wx3Var;
                    p43Var3 = p43Var2;
                    p43Var4 = p43Var;
                    if (wx3Var2.m() == ah1Var) {
                        i(p43Var4, p43Var3, wx3Var2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                wx3Var2 = wx3Var;
                if (wx3Var2.m() == ah1Var) {
                    i(p43Var4, p43Var3, wx3Var2);
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            p43Var = p43Var5;
            p43Var2 = p43Var6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    public static final boolean c(wx3 wx3Var, long j) {
        int iG;
        sn1 sn1Var;
        boolean z;
        se3 se3Var;
        int i;
        long jD;
        long j2;
        se3 se3Var2;
        g54 g54Var;
        c cVar = wx3Var.a;
        xy3 xy3VarB = wx3Var.b.b();
        if (xy3VarB == null || (iG = xy3VarB.b.g(j)) == -1) {
            return false;
        }
        fv0 fv0Var = cVar.c;
        ft2 ft2Var = cVar.d;
        rq1 rq1Var = (fv0Var == null || (g54Var = (g54) fv0Var.getValue()) == null) ? null : g54Var.b;
        long jA = rq1Var != null ? rq1Var.a(iG, false) : p23.d(iG, iG);
        long jF = cVar.f(jA);
        if (jz3.c(jA) && jz3.c(jF)) {
            sn1Var = sn1.c;
        } else if (jz3.c(jA) || jz3.c(jF)) {
            sn1Var = (!jz3.c(jA) || jz3.c(jF)) ? sn1.l : sn1.d;
        } else {
            sn1Var = sn1.h;
        }
        int iOrdinal = sn1Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                z = false;
                if (iOrdinal == 2) {
                    h43 h43VarC = xy3VarB.c((int) (jF >> 32));
                    h43 h43VarC2 = xy3VarB.c((int) (jF & 4294967295L));
                    float fV = p23.v(j, h43VarC);
                    float fV2 = p23.v(j, h43VarC2);
                    if (fV == fV2 || fV >= fV2) {
                        j2 = jA & 4294967295L;
                    }
                    i = (int) j2;
                    se3Var = null;
                } else if (iOrdinal != 3) {
                    u41.e();
                    return false;
                }
            } else {
                z = false;
                h43 h43VarC3 = xy3VarB.c((int) (jF >> 32));
                h43 h43VarC4 = xy3VarB.c((int) (jF & 4294967295L));
                float fV3 = p23.v(j, h43VarC3);
                float fV4 = p23.v(j, h43VarC4);
                if (fV3 != fV4 && fV3 < fV4) {
                    qf4 qf4Var = qf4.c;
                    se3Var2 = new se3(qf4Var, qf4Var);
                } else {
                    qf4 qf4Var2 = qf4.d;
                    se3Var2 = new se3(qf4Var2, qf4Var2);
                }
                se3Var = se3Var2;
                i = (int) (jA >> 32);
            }
            jD = p23.d(i, i);
            if (!jz3.b(jD, cVar.a.b().h) && (se3Var == null || se3Var.equals((se3) ft2Var.getValue()))) {
                return z;
            }
            cVar.k(jD);
            if (se3Var != null) {
                ft2Var.setValue(se3Var);
            }
            return true;
        }
        z = false;
        j2 = jA >> 32;
        i = (int) j2;
        se3Var = null;
        jD = p23.d(i, i);
        if (!jz3.b(jD, cVar.a.b().h)) {
        }
        cVar.k(jD);
        if (se3Var != null) {
            ft2Var.setValue(se3Var);
        }
        return true;
    }

    public static final void h(p43 p43Var, p43 p43Var2, wx3 wx3Var) {
        if ((p43Var.c & 9223372034707292159L) != 9205357640488583168L) {
            p43Var.c = 9205357640488583168L;
            p43Var2.c = 9205357640488583168L;
            wx3Var.e();
        }
    }

    public static final void i(p43 p43Var, p43 p43Var2, wx3 wx3Var) {
        if ((p43Var.c & 9223372034707292159L) != 9205357640488583168L) {
            wx3Var.e();
            p43Var.c = 9205357640488583168L;
            p43Var2.c = 0L;
            wx3Var.u = -1;
        }
    }

    public final long A(au3 au3Var, int i, int i2, boolean z, gd3 gd3Var, boolean z2, boolean z3) {
        long jD;
        lh1 lh1Var;
        long j = au3Var.h;
        jz3 jz3Var = new jz3(j);
        if (z3 || (!z2 && jz3.c(j))) {
            jz3Var = null;
        }
        xy3 xy3VarB = this.b.b();
        boolean z4 = false;
        if (xy3VarB == null) {
            jD = jz3.b;
        } else if (jz3Var == null && gd3Var.equals(SelectionAdjustment$Companion.getCharacter())) {
            jD = p23.d(i, i2);
        } else {
            th3 th3VarD = p23.D(xy3VarB, i, i2, this.u, jz3Var != null ? jz3Var.a : jz3.b, jz3Var == null, z);
            if (jz3Var == null || th3VarD.g(this.t)) {
                fd3 fd3VarA = gd3Var.a(th3VarD);
                long jD2 = p23.d(fd3VarA.a.b, fd3VarA.b.b);
                this.t = th3VarD;
                this.u = z ? i : i2;
                jD = jD2;
            } else {
                jD = jz3Var.a;
            }
        }
        if (!jz3.b(jD, j)) {
            if (jz3.g(jD) != jz3.g(j) && jz3.b(p23.d((int) (4294967295L & jD), (int) (jD >> 32)), j)) {
                z4 = true;
            }
            if (((Boolean) this.k.getValue()).booleanValue() && !z4 && (lh1Var = this.h) != null) {
                lh1Var.mo63x70bb4fce(9);
            }
        }
        return jD;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006c A[PHI: r5
  0x006c: PHI (r5v2 'this' wx3) = (r5v0 'this' wx3 A[IMMUTABLE_TYPE, THIS]), (r5v7 'this' wx3), (r5v7 'this' wx3) binds: [B:24:0x0048, B:29:0x0059, B:31:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(uo0 uo0Var) throws Throwable {
        gx3 gx3Var;
        boolean z;
        je1 je1Var;
        if (uo0Var instanceof gx3) {
            gx3Var = (gx3) uo0Var;
            int i = gx3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gx3Var.l = i - Integer.MIN_VALUE;
            } else {
                gx3Var = new gx3(this, uo0Var);
            }
        } else {
            gx3Var = new gx3(this, uo0Var);
        }
        Object clipEntry = gx3Var.d;
        int i2 = gx3Var.l;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 == 1) {
                this = gx3Var.c;
                g13.O(clipEntry);
            } else {
                if (i2 != 2) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(clipEntry);
                if (((ClipEntry) clipEntry) != null) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
        g13.O(clipEntry);
        if (!this.d || this.e) {
            return Boolean.FALSE;
        }
        Clipboard clipboard = this.j;
        if (clipboard != null) {
            gx3Var.c = this;
            gx3Var.l = 1;
            clipEntry = clipboard.getClipEntry(gx3Var);
            hq0 hq0Var = hq0.c;
            if (clipEntry == hq0Var) {
                return hq0Var;
            }
        }
        if (z) {
            return Boolean.TRUE;
        }
        je1Var = this.m;
        if (je1Var != null && je1Var.invoke() != null) {
            m51.t();
            return null;
        }
        return Boolean.valueOf(z2);
        ClipEntry clipEntry2 = (ClipEntry) clipEntry;
        z = clipEntry2 != null && clipEntry2.getClipData().getDescription().hasMimeType("text/*");
        if (z) {
            return Boolean.TRUE;
        }
        je1Var = this.m;
        if (je1Var != null) {
            m51.t();
            return null;
        }
        return Boolean.valueOf(z2);
    }

    public final void e() {
        this.p.setValue(null);
        this.o.setValue(new ln2(9205357640488583168L));
        this.n.setValue(new ln2(9205357640488583168L));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(boolean z, uo0 uo0Var) throws Throwable {
        hx3 hx3Var;
        if (uo0Var instanceof hx3) {
            hx3Var = (hx3) uo0Var;
            int i = hx3Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                hx3Var.m = i - Integer.MIN_VALUE;
            } else {
                hx3Var = new hx3(this, uo0Var);
            }
        } else {
            hx3Var = new hx3(this, uo0Var);
        }
        Object obj = hx3Var.h;
        int i2 = hx3Var.m;
        w84 w84Var = w84.a;
        if (i2 == 0) {
            g13.O(obj);
            au3 au3VarD = this.a.d();
            long j = au3VarD.h;
            long j2 = au3VarD.h;
            if (!jz3.c(j)) {
                hg hgVar = new hg(au3VarD.d.subSequence(jz3.f(j2), jz3.e(j2)).toString());
                Clipboard clipboard = this.j;
                if (clipboard != null) {
                    ClipEntry clipEntryG = xp1.G(hgVar);
                    hx3Var.c = this;
                    hx3Var.d = z;
                    hx3Var.m = 1;
                    Object clipEntry = clipboard.setClipEntry(clipEntryG, hx3Var);
                    hq0 hq0Var = hq0.c;
                    if (clipEntry == hq0Var) {
                        return hq0Var;
                    }
                }
            }
            return w84Var;
        }
        if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = hx3Var.d;
        this = hx3Var.c;
        g13.O(obj);
        if (z) {
            this.a.a();
            return w84Var;
        }
        return w84Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(uo0 uo0Var) throws Throwable {
        ix3 ix3Var;
        if (uo0Var instanceof ix3) {
            ix3Var = (ix3) uo0Var;
            int i = ix3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ix3Var.l = i - Integer.MIN_VALUE;
            } else {
                ix3Var = new ix3(this, uo0Var);
            }
        } else {
            ix3Var = new ix3(this, uo0Var);
        }
        Object obj = ix3Var.d;
        int i2 = ix3Var.l;
        w84 w84Var = w84.a;
        if (i2 == 0) {
            g13.O(obj);
            au3 au3VarD = this.a.d();
            long j = au3VarD.h;
            long j2 = au3VarD.h;
            if (jz3.c(j)) {
                return w84Var;
            }
            hg hgVar = new hg(au3VarD.d.subSequence(jz3.f(j2), jz3.e(j2)).toString());
            Clipboard clipboard = this.j;
            if (clipboard != null) {
                ClipEntry clipEntryG = xp1.G(hgVar);
                ix3Var.c = this;
                ix3Var.l = 1;
                Object clipEntry = clipboard.setClipEntry(clipEntryG, ix3Var);
                hq0 hq0Var = hq0.c;
                if (clipEntry == hq0Var) {
                    return hq0Var;
                }
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = ix3Var.c;
            g13.O(obj);
        }
        this.a.c();
        return w84Var;
    }

    public final Object j(ix2 ix2Var, mq3 mq3Var) {
        Object objV0 = ((sq3) ix2Var).v0(new ab(this, null, 1), mq3Var);
        return objV0 == hq0.c ? objV0 : w84.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if ((r0 != null ? defpackage.vl0.z(r5, defpackage.vl0.j0(r0)) : false) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xu3 k(boolean r12) {
        /*
            r11 = this;
            androidx.compose.foundation.text.input.internal.c r0 = r11.a
            au3 r0 = r0.d()
            ft2 r1 = r11.r
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            ft2 r2 = r11.q
            java.lang.Object r2 = r2.getValue()
            dx3 r2 = (defpackage.dx3) r2
            dx3 r3 = defpackage.dx3.c
            r4 = 0
            if (r2 != r3) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = r4
        L22:
            ah1 r3 = r11.m()
            if (r1 == 0) goto L93
            if (r2 == 0) goto L93
            long r1 = r0.h
            boolean r1 = defpackage.jz3.c(r1)
            if (r1 == 0) goto L93
            ps2 r1 = r0.m
            if (r1 != 0) goto L93
            java.lang.CharSequence r0 = r0.d
            int r0 = r0.length()
            if (r0 <= 0) goto L93
            ah1 r0 = defpackage.ah1.c
            if (r3 == r0) goto L76
            pk3 r1 = okhttp3.Protocol$Companion.getCurrentThreadSnapshot()
            if (r1 == 0) goto L4e
            le1 r0 = r1.e()
        L4c:
            r2 = r0
            goto L50
        L4e:
            r0 = 0
            goto L4c
        L50:
            pk3 r3 = okhttp3.Protocol$Companion.makeCurrentNonObservable(r1)
            h43 r0 = r11.l()     // Catch: java.lang.Throwable -> L70
            long r5 = r0.b()     // Catch: java.lang.Throwable -> L70
            okhttp3.Protocol$Companion.restoreNonObservable(r1, r3, r2)
            cx1 r0 = r11.q()
            if (r0 == 0) goto L6d
            h43 r0 = defpackage.vl0.j0(r0)
            boolean r4 = defpackage.vl0.z(r5, r0)
        L6d:
            if (r4 == 0) goto L93
            goto L76
        L70:
            r0 = move-exception
            r11 = r0
            okhttp3.Protocol$Companion.restoreNonObservable(r1, r3, r2)
            throw r11
        L76:
            xu3 r4 = new xu3
            if (r12 == 0) goto L84
            h43 r11 = r11.l()
            long r11 = r11.b()
        L82:
            r6 = r11
            goto L8a
        L84:
            r11 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L82
        L8a:
            u53 r9 = defpackage.u53.c
            r10 = 0
            r5 = 1
            r8 = 0
            r4.<init>(r5, r6, r8, r9, r10)
            return r4
        L93:
            xu3 r11 = defpackage.xu3.f
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx3.k(boolean):xu3");
    }

    public final h43 l() {
        float f;
        xy3 xy3VarB = this.b.b();
        if (xy3VarB != null) {
            au3 au3VarD = this.a.d();
            if (jz3.c(au3VarD.h)) {
                h43 h43VarC = xy3VarB.c((int) (au3VarD.h >> 32));
                float fFloor = (float) Math.floor(this.c.w(2.0f));
                if (fFloor < 1.0f) {
                    fFloor = 1.0f;
                }
                if (xy3VarB.a.h == dx1.c) {
                    f = (fFloor / 2.0f) + h43VarC.a;
                } else {
                    f = h43VarC.c - (fFloor / 2.0f);
                }
                float f2 = fFloor / 2.0f;
                float f3 = ((int) (xy3VarB.c >> 32)) - f2;
                if (f > f3) {
                    f = f3;
                }
                if (f < f2) {
                    f = f2;
                }
                float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                return new h43(fFloor2 - f2, h43VarC.b, fFloor2 + f2, h43VarC.d);
            }
        }
        return h43.e;
    }

    public final ah1 m() {
        return (ah1) this.p.getValue();
    }

    public final long n() {
        ft2 ft2Var = this.o;
        if ((((ln2) ft2Var.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        ft2 ft2Var2 = this.n;
        if ((((ln2) ft2Var2.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return kr1.E(this.b, ((ln2) ft2Var.getValue()).a);
        }
        long j = ((ln2) ft2Var.getValue()).a;
        long j2 = ((ln2) ft2Var2.getValue()).a;
        cx1 cx1VarQ = q();
        return ln2.i(j, ln2.h(j2, cx1VarQ != null ? cx1VarQ.g(0L) : 9205357640488583168L));
    }

    public final long o(boolean z) {
        long j;
        xy3 xy3VarB = this.b.b();
        if (xy3VarB == null) {
            return 0L;
        }
        long j2 = this.a.d().h;
        if (z) {
            int i = jz3.c;
            j = j2 >> 32;
        } else {
            int i2 = jz3.c;
            j = 4294967295L & j2;
        }
        return y64.C(xy3VarB, (int) j, z, jz3.g(j2));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    public final xu3 p(boolean z, boolean z2) {
        int iMax;
        long j;
        cx1 cx1VarQ;
        ah1 ah1Var = z ? ah1.d : ah1.h;
        xy3 xy3VarB = this.b.b();
        xu3 xu3Var = xu3.f;
        if (xy3VarB == null) {
            return xu3Var;
        }
        c cVar = this.a;
        long j2 = cVar.d().h;
        if (jz3.c(j2)) {
            return xu3Var;
        }
        long jO = o(z);
        if (((dx3) this.q.getValue()) == dx3.c) {
            if (m() != ah1Var) {
                cx1 cx1VarQ2 = q();
                if (cx1VarQ2 != null ? vl0.z(jO, vl0.j0(cx1VarQ2)) : false) {
                    if (cVar.d().m == null) {
                        if (z) {
                            iMax = (int) (j2 >> 32);
                        } else {
                            iMax = Math.max(((int) (j2 & 4294967295L)) - 1, 0);
                        }
                        u53 u53VarA = xy3VarB.a(iMax);
                        boolean zG = jz3.g(j2);
                        if (z2) {
                            cx1VarQ = q();
                            if (cx1VarQ != null) {
                                jO = kr1.y(jO, vl0.j0(cx1VarQ));
                            }
                        } else {
                            jO = 9205357640488583168L;
                        }
                        long j3 = jO;
                        if (z) {
                            j = j2 >> 32;
                        } else {
                            j = j2 & 4294967295L;
                        }
                        return new xu3(true, j3, jr1.u(xy3VarB, (int) j), u53VarA, zG);
                    }
                }
            } else if (cVar.d().m == null) {
                if (z) {
                    iMax = (int) (j2 >> 32);
                } else {
                    iMax = Math.max(((int) (j2 & 4294967295L)) - 1, 0);
                }
                u53 u53VarA2 = xy3VarB.a(iMax);
                boolean zG2 = jz3.g(j2);
                if (z2) {
                    cx1VarQ = q();
                    if (cx1VarQ != null) {
                        jO = kr1.y(jO, vl0.j0(cx1VarQ));
                    }
                } else {
                    jO = 9205357640488583168L;
                }
                long j4 = jO;
                if (z) {
                    j = j2 >> 32;
                } else {
                    j = j2 & 4294967295L;
                }
                return new xu3(true, j4, jr1.u(xy3VarB, (int) j), u53VarA2, zG2);
            }
        }
        return xu3Var;
    }

    public final cx1 q() {
        cx1 cx1VarD = this.b.d();
        if (cx1VarD == null || !cx1VarD.z()) {
            return null;
        }
        return cx1VarD;
    }

    public final vz3 r() {
        return (vz3) this.s.getValue();
    }

    public final void s() {
        os osVar = this.i;
        if (osVar != null) {
            TextToolbar textToolbar = osVar.a;
            if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
                textToolbar.hide();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(uo0 uo0Var) throws Throwable {
        rx3 rx3Var;
        if (uo0Var instanceof rx3) {
            rx3Var = (rx3) uo0Var;
            int i = rx3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                rx3Var.h = i - Integer.MIN_VALUE;
            } else {
                rx3Var = new rx3(this, uo0Var);
            }
        } else {
            rx3Var = new rx3(this, uo0Var);
        }
        Object obj = rx3Var.c;
        int i2 = rx3Var.h;
        w84 w84Var = w84.a;
        if (i2 == 0) {
            g13.O(obj);
            je1 je1Var = this.m;
            if (je1Var != null && je1Var.invoke() != null) {
                m51.t();
                return null;
            }
            rx3Var.h = 1;
            Object objU = u(rx3Var);
            Object obj2 = hq0.c;
            return objU == obj2 ? obj2 : w84Var;
        }
        if (i2 == 1) {
            g13.O(obj);
            return w84Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                g13.O(obj);
                return w84Var;
            }
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g13.O(obj);
        ClipEntry clipEntry = (ClipEntry) obj;
        if (clipEntry == null) {
            rx3Var.h = 3;
            throw null;
        }
        clipEntry.getClipMetadata();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(uo0 uo0Var) throws Throwable {
        sx3 sx3Var;
        CharSequence text;
        if (uo0Var instanceof sx3) {
            sx3Var = (sx3) uo0Var;
            int i = sx3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                sx3Var.l = i - Integer.MIN_VALUE;
            } else {
                sx3Var = new sx3(this, uo0Var);
            }
        } else {
            sx3Var = new sx3(this, uo0Var);
        }
        Object clipEntry = sx3Var.d;
        int i2 = sx3Var.l;
        String string = null;
        w84 w84Var = w84.a;
        if (i2 == 0) {
            g13.O(clipEntry);
            Clipboard clipboard = this.j;
            if (clipboard != null) {
                sx3Var.c = this;
                sx3Var.l = 1;
                clipEntry = clipboard.getClipEntry(sx3Var);
                hq0 hq0Var = hq0.c;
                if (clipEntry == hq0Var) {
                    return hq0Var;
                }
            }
            return w84Var;
        }
        if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = sx3Var.c;
        g13.O(clipEntry);
        ClipEntry clipEntry2 = (ClipEntry) clipEntry;
        if (clipEntry2 != null) {
            ClipData.Item itemAt = clipEntry2.getClipData().getItemAt(0);
            if (itemAt != null && (text = itemAt.getText()) != null) {
                string = text.toString();
            }
            if (string != null) {
                c.h(this.a, string, false, 10);
            }
        }
        return w84Var;
    }

    public final void v() {
        ay3 ay3Var = this.a.a;
        ay3Var.b.a().f();
        zt3 zt3Var = ay3Var.b;
        y64.P(zt3Var, 0, zt3Var.d.length());
        ay3.a(ay3Var, true, wu3.c);
    }

    public final void w(boolean z) {
        this.r.setValue(Boolean.valueOf(z));
    }

    public final void x(vz3 vz3Var) {
        this.s.setValue(vz3Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(uo0 uo0Var) throws Throwable {
        vx3 vx3Var;
        if (uo0Var instanceof vx3) {
            vx3Var = (vx3) uo0Var;
            int i = vx3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vx3Var.l = i - Integer.MIN_VALUE;
            } else {
                vx3Var = new vx3(this, uo0Var);
            }
        } else {
            vx3Var = new vx3(this, uo0Var);
        }
        Object obj = vx3Var.d;
        int i2 = vx3Var.l;
        so0 so0Var = null;
        vz3 vz3Var = vz3.c;
        try {
            if (i2 == 0) {
                g13.O(obj);
                h2 h2Var = new h2(this, so0Var, 8);
                vx3Var.c = this;
                vx3Var.l = 1;
                Object objQ = yo4.q(h2Var, vx3Var);
                hq0 hq0Var = hq0.c;
                if (objQ == hq0Var) {
                    return hq0Var;
                }
            } else {
                if (i2 != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = vx3Var.c;
                g13.O(obj);
            }
            this.w(false);
            if (this.r() != vz3Var) {
                this.s();
            }
            return w84.a;
        } catch (Throwable th) {
            this.w(false);
            if (this.r() != vz3Var) {
                this.s();
            }
            throw th;
        }
    }

    public final void z(ah1 ah1Var, long j) {
        this.p.setValue(ah1Var);
        this.o.setValue(new ln2(j));
    }
}
