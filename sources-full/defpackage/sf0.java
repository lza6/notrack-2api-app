package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class sf0 extends r implements wk0 {
    public je1 B;
    public boolean C;
    public final lh2 D;
    public final lh2 E;

    public sf0(je1 je1Var, je1 je1Var2, ao1 ao1Var, gh2 gh2Var) {
        super(gh2Var, ao1Var, true, null, null, je1Var);
        this.B = je1Var2;
        this.C = true;
        lh2 lh2Var = a82.a;
        this.D = new lh2();
        this.E = new lh2();
    }

    @Override // defpackage.r
    public final void C0() {
        G0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // defpackage.r
    public final boolean D0(KeyEvent keyEvent) {
        boolean z;
        long jY = av1.y(keyEvent);
        so0 so0Var = null;
        if (this.B != null) {
            lh2 lh2Var = this.D;
            if (lh2Var.e(jY) == null) {
                z = true;
                lh2Var.h(py.F(getCoroutineScope(), null, null, new f60(this, so0Var, 1 == true ? 1 : 0), 3), jY);
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // defpackage.r
    public final void E0(KeyEvent keyEvent) {
        long jY = av1.y(keyEvent);
        lh2 lh2Var = this.D;
        boolean z = false;
        if (lh2Var.e(jY) != null) {
            gs1 gs1Var = (gs1) lh2Var.e(jY);
            if (gs1Var != null) {
                if (gs1Var.a()) {
                    gs1Var.c(null);
                } else {
                    z = true;
                }
            }
            lh2Var.g(jY);
        }
        if (z) {
            return;
        }
        this.p.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    public final void G0() {
        char c;
        long j;
        long j2;
        lh2 lh2Var = this.D;
        Object[] objArr = lh2Var.c;
        long[] jArr = lh2Var.a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((gs1) objArr[(i << 3) + i3]).c(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        lh2Var.a();
        lh2 lh2Var2 = this.E;
        Object[] objArr2 = lh2Var2.c;
        long[] jArr2 = lh2Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((qf0) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        lh2Var2.a();
    }

    @Override // defpackage.of2
    public final void onReset() {
        super.onReset();
        G0();
    }

    @Override // defpackage.r
    public final void y0(gf3 gf3Var) {
        if (this.B != null) {
            j jVar = new j(7, this);
            pu1[] pu1VarArr = ef3.a;
            ((ue3) gf3Var).j(te3.c, new z0(null, jVar));
        }
    }

    @Override // defpackage.r
    public final Object z0(ix2 ix2Var, so0 so0Var) {
        so0 so0Var2 = null;
        rf0 rf0Var = (!this.o || this.B == null) ? null : new rf0(this, 0);
        fd0 fd0Var = new fd0(this, so0Var2, 1);
        rf0 rf0Var2 = new rf0(this, 1);
        iz0 iz0Var = os3.a;
        Object objQ = yo4.q(new ve(ix2Var, fd0Var, rf0Var, null, rf0Var2, null, 8, false), so0Var);
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        if (objQ != hq0Var) {
            objQ = w84Var;
        }
        return objQ == hq0Var ? objQ : w84Var;
    }
}
