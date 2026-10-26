package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ik2 extends of2 implements i64, ck2 {
    public ck2 c;
    public fk2 d;
    public ik2 h;
    public final String l;

    public ik2(ck2 ck2Var, fk2 fk2Var) {
        this.c = ck2Var;
        this.d = fk2Var == null ? new fk2() : fk2Var;
        this.l = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.i64
    public final Object o() {
        return this.l;
    }

    @Override // defpackage.of2
    public final void onAttach() {
        fk2 fk2Var = this.d;
        fk2Var.a = this;
        fk2Var.b = null;
        this.h = null;
        fk2Var.c = new j(25, this);
        fk2Var.d = getCoroutineScope();
    }

    @Override // defpackage.of2
    public final void onDetach() {
        q43 q43Var = new q43();
        gb2.a0(this, new r91(3, q43Var));
        ik2 ik2Var = (ik2) ((i64) q43Var.c);
        this.h = ik2Var;
        fk2 fk2Var = this.d;
        fk2Var.b = ik2Var;
        if (fk2Var.a == this) {
            fk2Var.a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo111x5577af55(long j, long j2, so0 so0Var) throws Throwable {
        gk2 gk2Var;
        ik2 ik2Var;
        long j3;
        long j4;
        long j5;
        ik2 ik2Var2;
        long j6;
        long j7;
        if (so0Var instanceof gk2) {
            gk2Var = (gk2) so0Var;
            int i = gk2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                gk2Var.n = i - Integer.MIN_VALUE;
            } else {
                gk2Var = new gk2(this, (uo0) so0Var);
            }
        } else {
            gk2Var = new gk2(this, (uo0) so0Var);
        }
        gk2 gk2Var2 = gk2Var;
        Object objMo111x5577af55 = gk2Var2.l;
        int i2 = gk2Var2.n;
        hq0 hq0Var = hq0.c;
        if (i2 == 0) {
            g13.O(objMo111x5577af55);
            ck2 ck2Var = this.c;
            gk2Var2.c = this;
            gk2Var2.d = j;
            gk2Var2.h = j2;
            gk2Var2.n = 1;
            objMo111x5577af55 = ck2Var.mo111x5577af55(j, j2, gk2Var2);
            if (objMo111x5577af55 != hq0Var) {
                ik2Var = this;
                j3 = j;
                j4 = j2;
            }
            return hq0Var;
        }
        if (i2 == 1) {
            j4 = gk2Var2.h;
            j3 = gk2Var2.d;
            ik2Var = gk2Var2.c;
            g13.O(objMo111x5577af55);
        } else {
            if (i2 != 2) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = gk2Var2.d;
            g13.O(objMo111x5577af55);
        }
        j6 = ((dc4) objMo111x5577af55).a;
        j5 = j7;
        return new dc4(dc4.e(j5, j6));
        j5 = ((dc4) objMo111x5577af55).a;
        if (ik2Var.isAttached()) {
            ik2Var2 = (ik2Var.isAttached() && ik2Var.isAttached()) ? (ik2) gb2.E(ik2Var) : null;
        } else {
            ik2Var2 = ik2Var.h;
        }
        if (ik2Var2 != null) {
            long jE = dc4.e(j3, j5);
            long jD = dc4.d(j4, j5);
            gk2Var2.c = null;
            gk2Var2.d = j5;
            gk2Var2.n = 2;
            objMo111x5577af55 = ik2Var2.mo111x5577af55(jE, jD, gk2Var2);
            if (objMo111x5577af55 != hq0Var) {
                j7 = j5;
                j6 = ((dc4) objMo111x5577af55).a;
                j5 = j7;
            }
            return hq0Var;
        }
        j6 = 0;
        return new dc4(dc4.e(j5, j6));
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo112x75b18a1d(long j, long j2, int i) {
        long jMo112x75b18a1d = this.c.mo112x75b18a1d(j, j2, i);
        ik2 ik2Var = null;
        if (isAttached() && isAttached()) {
            ik2Var = (ik2) gb2.E(this);
        }
        ik2 ik2Var2 = ik2Var;
        return ln2.i(jMo112x75b18a1d, ik2Var2 != null ? ik2Var2.mo112x75b18a1d(ln2.i(j, jMo112x75b18a1d), ln2.h(j2, jMo112x75b18a1d), i) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r13 == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r13 == r5) goto L31;
     */
    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo113x43e5835a(long r11, defpackage.so0 r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.hk2
            if (r0 == 0) goto L13
            r0 = r13
            hk2 r0 = (defpackage.hk2) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L1a
        L13:
            hk2 r0 = new hk2
            uo0 r13 = (defpackage.uo0) r13
            r0.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r0.h
            int r1 = r0.m
            r2 = 0
            r3 = 2
            r4 = 1
            hq0 r5 = defpackage.hq0.c
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r10 = r0.d
            defpackage.g13.O(r13)
            goto L82
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r10)
            return r2
        L35:
            long r11 = r0.d
            ik2 r10 = r0.c
            defpackage.g13.O(r13)
            goto L63
        L3d:
            defpackage.g13.O(r13)
            boolean r13 = r10.isAttached()
            if (r13 == 0) goto L53
            boolean r13 = r10.isAttached()
            if (r13 == 0) goto L53
            i64 r13 = defpackage.gb2.E(r10)
            ik2 r13 = (defpackage.ik2) r13
            goto L54
        L53:
            r13 = r2
        L54:
            if (r13 == 0) goto L6c
            r0.c = r10
            r0.d = r11
            r0.m = r4
            java.lang.Object r13 = r13.mo113x43e5835a(r11, r0)
            if (r13 != r5) goto L63
            goto L81
        L63:
            dc4 r13 = (defpackage.dc4) r13
            long r6 = r13.a
        L67:
            r8 = r11
            r12 = r10
            r10 = r6
            r6 = r8
            goto L6f
        L6c:
            r6 = 0
            goto L67
        L6f:
            ck2 r12 = r12.c
            long r6 = defpackage.dc4.d(r6, r10)
            r0.c = r2
            r0.d = r10
            r0.m = r3
            java.lang.Object r13 = r12.mo113x43e5835a(r6, r0)
            if (r13 != r5) goto L82
        L81:
            return r5
        L82:
            dc4 r13 = (defpackage.dc4) r13
            long r12 = r13.a
            long r10 = defpackage.dc4.e(r10, r12)
            dc4 r12 = new dc4
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik2.mo113x43e5835a(long, so0):java.lang.Object");
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo114x38849c55(long j, int i) {
        ik2 ik2Var = null;
        if (isAttached() && isAttached()) {
            ik2Var = (ik2) gb2.E(this);
        }
        long jMo114x38849c55 = ik2Var != null ? ik2Var.mo114x38849c55(j, i) : 0L;
        return ln2.i(jMo114x38849c55, this.c.mo114x38849c55(ln2.h(j, jMo114x38849c55), i));
    }

    public final gq0 v0() {
        ik2 ik2Var = isAttached() ? (ik2) gb2.E(this) : null;
        if (ik2Var != null) {
            return ik2Var.v0();
        }
        gq0 gq0Var = this.d.d;
        if (gq0Var != null) {
            return gq0Var;
        }
        u41.r("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
