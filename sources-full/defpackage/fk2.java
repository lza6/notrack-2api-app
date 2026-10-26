package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fk2 {
    public ik2 a;
    public ik2 b;
    public je1 c = new j(24, this);
    public gq0 d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, defpackage.uo0 r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.dk2
            if (r0 == 0) goto L14
            r0 = r12
            dk2 r0 = (defpackage.dk2) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            dk2 r0 = new dk2
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.c
            int r1 = r12.h
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.g13.O(r0)
            goto L7f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r7)
            return r2
        L31:
            defpackage.g13.O(r0)
            goto L5d
        L35:
            defpackage.g13.O(r0)
            ik2 r0 = r7.a
            if (r0 == 0) goto L49
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L49
            i64 r0 = defpackage.gb2.E(r0)
            ik2 r0 = (defpackage.ik2) r0
            goto L4a
        L49:
            r0 = r2
        L4a:
            r5 = 0
            hq0 r1 = defpackage.hq0.c
            if (r0 != 0) goto L62
            ik2 r7 = r7.b
            if (r7 == 0) goto L83
            r12.h = r4
            java.lang.Object r0 = r7.mo111x5577af55(r8, r10, r12)
            if (r0 != r1) goto L5d
            goto L7e
        L5d:
            dc4 r0 = (defpackage.dc4) r0
            long r5 = r0.a
            goto L83
        L62:
            ik2 r7 = r7.a
            if (r7 == 0) goto L73
            boolean r0 = r7.isAttached()
            if (r0 == 0) goto L73
            i64 r7 = defpackage.gb2.E(r7)
            r2 = r7
            ik2 r2 = (defpackage.ik2) r2
        L73:
            r7 = r2
            if (r7 == 0) goto L83
            r12.h = r3
            java.lang.Object r0 = r7.mo111x5577af55(r8, r10, r12)
            if (r0 != r1) goto L7f
        L7e:
            return r1
        L7f:
            dc4 r0 = (defpackage.dc4) r0
            long r5 = r0.a
        L83:
            dc4 r7 = new dc4
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk2.a(long, long, uo0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, uo0 uo0Var) throws Throwable {
        ek2 ek2Var;
        long j2;
        if (uo0Var instanceof ek2) {
            ek2Var = (ek2) uo0Var;
            int i = ek2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ek2Var.h = i - Integer.MIN_VALUE;
            } else {
                ek2Var = new ek2(this, uo0Var);
            }
        } else {
            ek2Var = new ek2(this, uo0Var);
        }
        Object objMo113x43e5835a = ek2Var.c;
        int i2 = ek2Var.h;
        ik2 ik2Var = null;
        if (i2 == 0) {
            g13.O(objMo113x43e5835a);
            ik2 ik2Var2 = this.a;
            if (ik2Var2 != null && ik2Var2.isAttached()) {
                ik2Var = (ik2) gb2.E(ik2Var2);
            }
            if (ik2Var != null) {
                ek2Var.h = 1;
                objMo113x43e5835a = ik2Var.mo113x43e5835a(j, ek2Var);
                hq0 hq0Var = hq0.c;
                if (objMo113x43e5835a == hq0Var) {
                    return hq0Var;
                }
            } else {
                j2 = 0;
            }
            return new dc4(j2);
        }
        if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g13.O(objMo113x43e5835a);
        j2 = ((dc4) objMo113x43e5835a).a;
        return new dc4(j2);
    }

    public final gq0 c() {
        gq0 gq0Var = (gq0) this.c.invoke();
        if (gq0Var != null) {
            return gq0Var;
        }
        u41.r("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
