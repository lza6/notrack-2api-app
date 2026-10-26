package defpackage;

import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class le3 {
    public final qe3 a;
    public lh1 e;
    public le1 f;
    public TextToolbar g;
    public ln2 j;
    public cx1 k;
    public fe3 r;
    public boolean s;
    public final ft2 b = cl3.d(null);
    public final ft2 c = cl3.d(Boolean.TRUE);
    public le1 d = new od3(this, 8);
    public final za1 h = new za1();
    public final ft2 i = cl3.d(Boolean.FALSE);
    public final ft2 l = cl3.d(new ln2(0));
    public final ft2 m = cl3.d(new ln2(0));
    public final ft2 n = cl3.d(null);
    public final ft2 o = cl3.d(null);
    public final ft2 p = cl3.d(null);
    public final ft2 q = cl3.d(null);

    public le3(qe3 qe3Var) {
        this.a = qe3Var;
        qe3Var.e = new od3(this, 1);
        int i = 3;
        qe3Var.f = new gc(i, this);
        qe3Var.g = new je3(this);
        qe3Var.h = new kd3(this, 2);
        qe3Var.i = new od3(this, 2);
        qe3Var.j = new od3(this, i);
    }

    public static final long a(le3 le3Var, cx1 cx1Var, long j) {
        cx1 cx1Var2 = le3Var.k;
        if (cx1Var2 == null || !cx1Var2.z()) {
            return 9205357640488583168L;
        }
        return le3Var.j().y(cx1Var, j);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    public final void b() {
        hg hgVarD;
        le1 le1Var;
        if (e() != null) {
            qe3 qe3Var = this.a;
            if (qe3Var.a().e == 0) {
                hgVarD = null;
            } else {
                fg fgVar = new fg();
                ArrayList arrayListC = qe3Var.c(j());
                int size = arrayListC.size();
                for (int i = 0; i < size; i++) {
                    vg2 vg2Var = (vg2) arrayListC.get(i);
                    fd3 fd3Var = (fd3) qe3Var.a().e(vg2Var.a);
                    if (fd3Var != null) {
                        ed3 ed3Var = fd3Var.a;
                        ed3 ed3Var2 = fd3Var.b;
                        hg hgVarD2 = vg2Var.d();
                        fgVar.a(fd3Var.c ? hgVarD2.subSequence(ed3Var2.b, ed3Var.b) : hgVarD2.subSequence(ed3Var.b, ed3Var2.b));
                    }
                }
                hgVarD = fgVar.d();
            }
        } else {
            hgVarD = null;
        }
        if (hgVarD != null) {
            hg hgVar = hgVarD.d.length() > 0 ? hgVarD : null;
            if (hgVar == null || (le1Var = this.f) == null) {
                return;
            }
            le1Var.invoke(hgVar);
        }
    }

    public final vg2 c(ed3 ed3Var) {
        return (vg2) this.a.c.e(ed3Var.c);
    }

    public final ah1 d() {
        return (ah1) this.p.getValue();
    }

    public final fd3 e() {
        return (fd3) this.b.getValue();
    }

    public final boolean f() {
        fd3 fd3Var;
        cx1 cx1VarJ = j();
        qe3 qe3Var = this.a;
        ArrayList arrayListC = qe3Var.c(cx1VarJ);
        if (arrayListC.isEmpty()) {
            return true;
        }
        int size = arrayListC.size();
        for (int i = 0; i < size; i++) {
            vg2 vg2Var = (vg2) arrayListC.get(i);
            hg hgVarD = vg2Var.d();
            if (hgVarD.d.length() != 0 && ((fd3Var = (fd3) qe3Var.a().e(vg2Var.a)) == null || Math.abs(fd3Var.a.b - fd3Var.b.b) != hgVarD.d.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean h() {
        fd3 fd3VarE = e();
        if (fd3VarE != null) {
            ed3 ed3Var = fd3VarE.b;
            ed3 ed3Var2 = fd3VarE.a;
            if (!kr1.n(ed3Var2, ed3Var)) {
                if (ed3Var2.c == ed3Var.c) {
                    return true;
                }
                cx1 cx1VarJ = j();
                qe3 qe3Var = this.a;
                ArrayList arrayListC = qe3Var.c(cx1VarJ);
                int size = arrayListC.size();
                for (int i = 0; i < size; i++) {
                    fd3 fd3Var = (fd3) qe3Var.a().e(((vg2) arrayListC.get(i)).a);
                    if (fd3Var != null && fd3Var.a.b != fd3Var.b.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void i() {
        lh1 lh1Var;
        lh2 lh2Var = a82.a;
        lh2Var.getClass();
        this.a.k.setValue(lh2Var);
        this.s = false;
        p();
        if (e() != null) {
            this.d.invoke(null);
            if (!g() || (lh1Var = this.e) == null) {
                return;
            }
            lh1Var.mo63x70bb4fce(9);
        }
    }

    public final cx1 j() {
        cx1 cx1Var = this.k;
        if (cx1Var != null) {
            if (!cx1Var.z()) {
                so1.a("unattached coordinates");
            }
            return cx1Var;
        }
        so1.b("null coordinates");
        u41.p();
        return null;
    }

    public final void k() {
        fd3 fd3Var;
        cx1 cx1VarJ = j();
        qe3 qe3Var = this.a;
        ArrayList arrayListC = qe3Var.c(cx1VarJ);
        if (arrayListC.isEmpty()) {
            return;
        }
        lh2 lh2Var = a82.a;
        lh2 lh2Var2 = new lh2();
        int i = 0;
        fd3 fd3Var2 = null;
        fd3 fd3Var3 = null;
        for (int size = arrayListC.size(); i < size; size = size) {
            vg2 vg2Var = (vg2) arrayListC.get(i);
            long j = vg2Var.a;
            xy3 xy3Var = (xy3) vg2Var.c.invoke();
            if (xy3Var == null) {
                fd3Var = null;
            } else {
                int length = xy3Var.a.a.d.length();
                fd3Var = new fd3(new ed3(xy3Var.a(0), 0, j), new ed3(xy3Var.a(Math.max(length - 1, 0)), length, j), false);
            }
            if (fd3Var != null) {
                if (fd3Var2 == null) {
                    fd3Var2 = fd3Var;
                }
                long j2 = vg2Var.a;
                int iC = lh2Var2.c(j2);
                Object[] objArr = lh2Var2.c;
                Object obj = objArr[iC];
                lh2Var2.b[iC] = j2;
                objArr[iC] = fd3Var;
                fd3Var3 = fd3Var;
            }
            i++;
            arrayListC = arrayListC;
        }
        if (lh2Var2.e == 0) {
            return;
        }
        if (fd3Var2 != fd3Var3) {
            fd3Var2.getClass();
            ed3 ed3Var = fd3Var2.a;
            fd3Var3.getClass();
            fd3Var2 = new fd3(ed3Var, fd3Var3.b, false);
        }
        qe3Var.k.setValue(lh2Var2);
        this.d.invoke(fd3Var2);
        this.r = null;
    }

    public final void l(boolean z) {
        ft2 ft2Var = this.c;
        if (((Boolean) ft2Var.getValue()).booleanValue() != z) {
            ft2Var.setValue(Boolean.valueOf(z));
            p();
        }
    }

    public final void m(fd3 fd3Var) {
        this.b.setValue(fd3Var);
        if (fd3Var != null) {
            n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    public final void n() {
        long j;
        ln2 ln2Var;
        long jA;
        ln2 ln2Var2;
        ed3 ed3Var;
        ed3 ed3Var2;
        fd3 fd3VarE = e();
        cx1 cx1Var = this.k;
        ln2 ln2Var3 = null;
        vg2 vg2VarC = (fd3VarE == null || (ed3Var2 = fd3VarE.a) == null) ? null : c(ed3Var2);
        vg2 vg2VarC2 = (fd3VarE == null || (ed3Var = fd3VarE.b) == null) ? null : c(ed3Var);
        cx1 cx1VarC = vg2VarC != null ? vg2VarC.c() : null;
        cx1 cx1VarC2 = vg2VarC2 != null ? vg2VarC2.c() : null;
        ft2 ft2Var = this.o;
        ft2 ft2Var2 = this.n;
        if (fd3VarE == null || cx1Var == null || !cx1Var.z() || (cx1VarC == null && cx1VarC2 == null)) {
            ft2Var2.setValue(null);
            ft2Var.setValue(null);
            return;
        }
        h43 h43VarJ0 = vl0.j0(cx1Var);
        if (cx1VarC != null) {
            j = 9205357640488583168L;
            long jA2 = vg2VarC.a(fd3VarE, true);
            if ((jA2 & 9223372034707292159L) != 9205357640488583168L) {
                long jY = cx1Var.y(cx1VarC, jA2);
                ln2Var = new ln2(jY);
                if (d() != ah1.d && !vl0.z(jY, h43VarJ0)) {
                }
            }
            ft2Var2.setValue(ln2Var);
            if (cx1VarC2 != null) {
                jA = vg2VarC2.a(fd3VarE, false);
                if ((jA & 9223372034707292159L) != j) {
                    long jY2 = cx1Var.y(cx1VarC2, jA);
                    ln2Var2 = new ln2(jY2);
                    if (d() != ah1.h || vl0.z(jY2, h43VarJ0)) {
                        ln2Var3 = ln2Var2;
                    }
                }
            }
            ft2Var.setValue(ln2Var3);
        }
        j = 9205357640488583168L;
        ln2Var = null;
        ft2Var2.setValue(ln2Var);
        if (cx1VarC2 != null) {
            jA = vg2VarC2.a(fd3VarE, false);
            if ((jA & 9223372034707292159L) != j) {
                long jY3 = cx1Var.y(cx1VarC2, jA);
                ln2Var2 = new ln2(jY3);
                if (d() != ah1.h) {
                    ln2Var3 = ln2Var2;
                } else {
                    ln2Var3 = ln2Var2;
                }
            }
        }
        ft2Var.setValue(ln2Var3);
    }

    /* JADX WARN: Not found block with instruction: 0x00da: MOVE (r4v1 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    public final boolean o(long j, long j2, boolean z, gd3 gd3Var) {
        ArrayList arrayList;
        fe3 th3Var;
        xy3 xy3Var;
        long j3;
        int i;
        ArrayList arrayList2;
        int i2;
        ge3 ge3Var;
        long j4;
        ew0 ew0VarL;
        ew0 ew0Var;
        ew0 ew0Var2;
        ew0 ew0Var3;
        ew0 ew0Var4;
        ew0 ew0Var5;
        ew0 ew0Var6;
        ge3 ge3Var2;
        int i3;
        int iB0;
        ed3 ed3Var;
        ed3 ed3Var2;
        this.p.setValue(z ? ah1.d : ah1.h);
        this.q.setValue(new ln2(j));
        cx1 cx1VarJ = j();
        qe3 qe3Var = this.a;
        ArrayList arrayListC = qe3Var.c(cx1VarJ);
        int i4 = z72.a;
        jh2 jh2Var = new jh2(6);
        int size = arrayListC.size();
        for (int i5 = 0; i5 < size; i5++) {
            jh2Var.e(((vg2) arrayListC.get(i5)).a, i5);
        }
        int i6 = 1;
        long j5 = 9223372034707292159L;
        ge3 ge3Var3 = new ge3(j, j2, cx1VarJ, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : e(), new o90(i6, jh2Var));
        int size2 = arrayListC.size();
        int i7 = 0;
        while (true) {
            arrayList = ge3Var3.h;
            if (i7 >= size2) {
                break;
            }
            vg2 vg2Var = (vg2) arrayListC.get(i7);
            cx1 cx1VarC = vg2Var.c();
            if (cx1VarC == null || (xy3Var = (xy3) vg2Var.c.invoke()) == null) {
                i2 = size2;
                arrayList2 = arrayListC;
                i = i6;
                j3 = j5;
                ge3Var2 = ge3Var3;
            } else {
                j3 = j5;
                long jY = ge3Var3.c.y(cx1VarC, 0L);
                long jH = ln2.h(ge3Var3.a, jY);
                i = i6;
                arrayList2 = arrayListC;
                long j6 = ge3Var3.b;
                long jH2 = (j6 & j3) == 9205357640488583168L ? 9205357640488583168L : ln2.h(j6, jY);
                long j7 = vg2Var.a;
                long j8 = xy3Var.c;
                float f = (int) (j8 >> 32);
                float f2 = (int) (j8 & 4294967295L);
                i2 = size2;
                int i8 = (int) (jH >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i8);
                ew0 ew0Var7 = ew0.h;
                ew0 ew0Var8 = ew0.c;
                ew0 ew0Var9 = ew0.d;
                if (fIntBitsToFloat < 0.0f) {
                    ew0Var7 = ew0Var8;
                } else if (Float.intBitsToFloat(i8) <= f) {
                    ew0Var7 = ew0Var9;
                }
                int i9 = (int) (jH & 4294967295L);
                ew0 ew0Var10 = Float.intBitsToFloat(i9) < 0.0f ? ew0Var8 : Float.intBitsToFloat(i9) > f2 ? ew0Var7 : ew0Var9;
                boolean z2 = ge3Var3.d;
                fd3 fd3Var = ge3Var3.e;
                if (z2) {
                    ge3Var = ge3Var3;
                    j4 = j7;
                    ew0VarL = xr0.L(ew0Var7, ew0Var10, ge3Var, j4, fd3Var != null ? fd3Var.b : null);
                    ew0Var = ew0Var7;
                    ew0Var3 = ew0Var;
                    ew0Var6 = ew0Var10;
                    ew0Var2 = ew0Var6;
                    ew0Var5 = ew0VarL;
                    ew0Var4 = ew0Var5;
                } else {
                    ge3Var = ge3Var3;
                    j4 = j7;
                    ew0VarL = xr0.L(ew0Var7, ew0Var10, ge3Var, j4, fd3Var != null ? fd3Var.a : null);
                    ew0Var = ew0Var7;
                    ew0Var2 = ew0Var10;
                    ew0Var3 = ew0VarL;
                    ew0Var4 = ew0Var;
                    ew0Var5 = ew0Var2;
                    ew0Var6 = ew0Var3;
                }
                ge3Var2 = ge3Var;
                ew0 ew0VarW = p23.W(ew0Var, ew0Var2);
                if (ew0VarW == ew0Var9 || ew0VarW != ew0VarL) {
                    int length = xy3Var.a.a.d.length();
                    o90 o90Var = ge3Var2.f;
                    if (z2) {
                        iB0 = xr0.b0(jH, xy3Var);
                        if (fd3Var == null || (ed3Var2 = fd3Var.b) == null) {
                            length = iB0;
                        } else {
                            int iCompare = o90Var.compare(Long.valueOf(ed3Var2.c), Long.valueOf(j4));
                            if (iCompare < 0) {
                                length = 0;
                            } else if (iCompare <= 0) {
                                length = ed3Var2.b;
                            }
                        }
                        i3 = length;
                    } else {
                        int iB1 = xr0.b0(jH, xy3Var);
                        if (fd3Var == null || (ed3Var = fd3Var.a) == null) {
                            length = iB1;
                        } else {
                            int iCompare2 = o90Var.compare(Long.valueOf(ed3Var.c), Long.valueOf(j4));
                            if (iCompare2 < 0) {
                                length = 0;
                            } else if (iCompare2 <= 0) {
                                length = ed3Var.b;
                            }
                        }
                        i3 = iB1;
                        iB0 = length;
                    }
                    int iB2 = (jH2 & j3) == 9205357640488583168L ? -1 : xr0.b0(jH2, xy3Var);
                    int i10 = ge3Var2.k + 2;
                    ge3Var2.k = i10;
                    long j9 = j4;
                    bd3 bd3Var = new bd3(j9, i10, iB0, i3, iB2, xy3Var);
                    ge3Var2.i = ge3Var2.a(ge3Var2.i, ew0Var3, ew0Var6);
                    ge3Var2.j = ge3Var2.a(ge3Var2.j, ew0Var4, ew0Var5);
                    ge3Var2.g.e(j9, r7.size());
                    arrayList.add(bd3Var);
                }
            }
            i7++;
            i6 = i;
            size2 = i2;
            ge3Var3 = ge3Var2;
            j5 = j3;
            arrayListC = arrayList2;
        }
        ge3 ge3Var4 = ge3Var3;
        int i11 = i6;
        int i12 = ge3Var4.k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            th3Var = null;
        } else if (size3 != i11) {
            int i13 = ge3Var4.i;
            int i14 = i13 == -1 ? i12 : i13;
            int i15 = ge3Var4.j;
            th3Var = new tg2(ge3Var4.g, arrayList, i14, i15 == -1 ? i12 : i15, ge3Var4.d, ge3Var4.e);
        } else {
            bd3 bd3Var2 = (bd3) ke0.J0(arrayList);
            int i16 = ge3Var4.i;
            int i17 = i16 == -1 ? i12 : i16;
            int i18 = ge3Var4.j;
            th3Var = new th3(ge3Var4.d, i17, i18 == -1 ? i12 : i18, ge3Var4.e, bd3Var2);
        }
        if (th3Var == null || !th3Var.g(this.r)) {
            return false;
        }
        fd3 fd3VarA = gd3Var.a(th3Var);
        if (!kr1.n(fd3VarA, e())) {
            if (g()) {
                ArrayList arrayList3 = qe3Var.b;
                int size4 = arrayList3.size();
                for (int i19 = 0; i19 < size4; i19++) {
                    if (((vg2) arrayList3.get(i19)).d().d.length() > 0) {
                        lh1 lh1Var = this.e;
                        if (lh1Var == null) {
                            break;
                        }
                        lh1Var.mo63x70bb4fce(9);
                        break;
                    }
                }
            }
            qe3Var.k.setValue(th3Var.h(fd3VarA));
            this.d.invoke(fd3VarA);
        }
        this.r = th3Var;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    public final void p() {
        TextToolbar textToolbar;
        cx1 cx1Var;
        List list;
        TextToolbar textToolbar2;
        h43 h43Var;
        TextToolbar textToolbar3;
        int[] iArr;
        vg2 vg2Var;
        int i;
        int i2;
        h43 h43VarA;
        if (((Boolean) this.i.getValue()).booleanValue() && (textToolbar = this.g) != null) {
            if (!this.s || !g()) {
                if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
                    textToolbar.hide();
                    return;
                }
                return;
            }
            h43 h43Var2 = vl0.g;
            if (e() == null || (cx1Var = this.k) == null || !cx1Var.z()) {
                textToolbar2 = textToolbar;
                h43VarA = null;
            } else {
                cx1 cx1VarJ = j();
                qe3 qe3Var = this.a;
                ArrayList arrayListC = qe3Var.c(cx1VarJ);
                ArrayList arrayList = new ArrayList(arrayListC.size());
                int size = arrayListC.size();
                for (int i3 = 0; i3 < size; i3++) {
                    vg2 vg2Var2 = (vg2) arrayListC.get(i3);
                    fd3 fd3Var = (fd3) qe3Var.a().e(vg2Var2.a);
                    ps2 ps2Var = fd3Var != null ? new ps2(vg2Var2, fd3Var) : null;
                    if (ps2Var != null) {
                        arrayList.add(ps2Var);
                    }
                }
                int size2 = arrayList.size();
                int i4 = 1;
                List listU = arrayList;
                listU = arrayList;
                if (size2 != 0 && size2 != 1) {
                    listU = kr1.U(ke0.y0(arrayList), ke0.E0(arrayList));
                }
                if (listU.isEmpty()) {
                    textToolbar2 = textToolbar;
                } else {
                    if (listU.isEmpty()) {
                        h43Var = h43Var2;
                        textToolbar2 = textToolbar;
                    } else {
                        int size3 = listU.size();
                        int i5 = 0;
                        float fMin = Float.POSITIVE_INFINITY;
                        float fMin2 = Float.POSITIVE_INFINITY;
                        float fMax = Float.NEGATIVE_INFINITY;
                        float fMax2 = Float.NEGATIVE_INFINITY;
                        while (i5 < size3) {
                            ps2 ps2Var2 = (ps2) list.get(i5);
                            vg2 vg2Var3 = (vg2) ps2Var2.c;
                            fd3 fd3Var2 = (fd3) ps2Var2.d;
                            int i6 = fd3Var2.a.b;
                            int i7 = fd3Var2.b.b;
                            if (i6 != i7) {
                                int i8 = 0;
                                cx1 cx1VarC = vg2Var3.c();
                                if (cx1VarC == null) {
                                    list = listU;
                                } else {
                                    int i9 = i4;
                                    int iMin = Math.min(i6, i7);
                                    int iMax = Math.max(i6, i7) - 1;
                                    if (iMin == iMax) {
                                        list = listU;
                                        iArr = new int[i9];
                                        iArr[0] = iMin;
                                    } else {
                                        list = listU;
                                        int[] iArr2 = new int[2];
                                        iArr2[0] = iMin;
                                        iArr2[i9] = iMax;
                                        iArr = iArr2;
                                    }
                                    int length = iArr.length;
                                    int[] iArr3 = iArr;
                                    int i10 = 0;
                                    float fMin3 = Float.POSITIVE_INFINITY;
                                    float fMin4 = Float.POSITIVE_INFINITY;
                                    float fMax3 = Float.NEGATIVE_INFINITY;
                                    float fMax4 = Float.NEGATIVE_INFINITY;
                                    while (i10 < length) {
                                        int i11 = length;
                                        int i12 = iArr3[i10];
                                        TextToolbar textToolbar4 = textToolbar;
                                        xy3 xy3Var = (xy3) vg2Var3.c.invoke();
                                        h43 h43VarB = h43.e;
                                        if (xy3Var == null) {
                                            vg2Var = vg2Var3;
                                            i = i10;
                                        } else {
                                            vg2Var = vg2Var3;
                                            int length2 = xy3Var.a.a.d.length();
                                            i = i10;
                                            if (length2 >= 1) {
                                                i2 = i8;
                                                h43VarB = xy3Var.b(py.x(i12, i2, length2 - 1));
                                            }
                                            h43 h43Var3 = h43VarB;
                                            fMin3 = Math.min(fMin3, h43Var3.a);
                                            fMin4 = Math.min(fMin4, h43Var3.b);
                                            fMax3 = Math.max(fMax3, h43Var3.c);
                                            fMax4 = Math.max(fMax4, h43Var3.d);
                                            i8 = i2;
                                            textToolbar = textToolbar4;
                                            vg2Var3 = vg2Var;
                                            i10 = i + 1;
                                            length = i11;
                                        }
                                        i2 = i8;
                                        h43 h43Var4 = h43VarB;
                                        fMin3 = Math.min(fMin3, h43Var4.a);
                                        fMin4 = Math.min(fMin4, h43Var4.b);
                                        fMax3 = Math.max(fMax3, h43Var4.c);
                                        fMax4 = Math.max(fMax4, h43Var4.d);
                                        i8 = i2;
                                        textToolbar = textToolbar4;
                                        vg2Var3 = vg2Var;
                                        i10 = i + 1;
                                        length = i11;
                                    }
                                    textToolbar3 = textToolbar;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMin3)) << 32);
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax3);
                                    long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(fMax4)) & 4294967295L;
                                    long jY = cx1Var.y(cx1VarC, jFloatToRawIntBits);
                                    long jY2 = cx1Var.y(cx1VarC, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
                                    fMin = Math.min(fMin, Float.intBitsToFloat((int) (jY >> 32)));
                                    fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jY & 4294967295L)));
                                    fMax = Math.max(fMax, Float.intBitsToFloat((int) (jY2 >> 32)));
                                    fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jY2 & 4294967295L)));
                                }
                                i5++;
                                size3 = size3;
                                list = list;
                                textToolbar = textToolbar3;
                                i4 = 1;
                            } else {
                                list = listU;
                            }
                            textToolbar3 = textToolbar;
                            i5++;
                            size3 = size3;
                            list = list;
                            textToolbar = textToolbar3;
                            i4 = 1;
                        }
                        list = listU;
                        textToolbar2 = textToolbar;
                        h43Var = new h43(fMin, fMin2, fMax, fMax2);
                    }
                    if (!h43Var.equals(h43Var2)) {
                        h43 h43VarF = vl0.j0(cx1Var).f(h43Var);
                        if (h43VarF.c - h43VarF.a >= 0.0f && h43VarF.d - h43VarF.b >= 0.0f) {
                            h43 h43VarJ = h43VarF.j(cx1Var.L(0L));
                            float f = h43VarJ.d;
                            ff3 ff3Var = ee3.a;
                            h43VarA = h43.a(h43VarJ, 0.0f, 0.0f, f + 100.0f, 7);
                        }
                    }
                }
                h43VarA = null;
            }
            if (h43VarA == null) {
                return;
            }
            TextToolbar.showMenu$default(textToolbar2, h43VarA, h() ? new ia0(0, this, le3.class, "toolbarCopy", "toolbarCopy()V", 0, 13) : null, null, null, f() ? null : new ia0(0, this, le3.class, "selectAll", "selectAll$foundation_release()V", 0, 14), null, 12, null);
        }
    }
}
