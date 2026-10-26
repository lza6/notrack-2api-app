package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class os3 {
    public static final iz0 a = new iz0(3, 2, null);

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[LOOP:1: B:22:0x005e->B:26:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.rq3 r7, defpackage.wr r8) {
        /*
            boolean r0 = r8 instanceof defpackage.hs3
            if (r0 == 0) goto L13
            r0 = r8
            hs3 r0 = (defpackage.hs3) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            hs3 r0 = new hs3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            rq3 r7 = r0.c
            defpackage.g13.O(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.g13.O(r8)
        L31:
            r0.c = r7
            r0.h = r2
            zw2 r8 = defpackage.zw2.d
            java.lang.Object r8 = r7.a(r8, r0)
            hq0 r1 = defpackage.hq0.c
            if (r8 != r1) goto L40
            return r1
        L40:
            yw2 r8 = (defpackage.yw2) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            dx2 r6 = (defpackage.dx2) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            dx2 r3 = (defpackage.dx2) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            w84 r7 = defpackage.w84.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os3.a(rq3, wr):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.rq3 r5, boolean r6, defpackage.zw2 r7, defpackage.wr r8) {
        /*
            boolean r0 = r8 instanceof defpackage.fs3
            if (r0 == 0) goto L13
            r0 = r8
            fs3 r0 = (defpackage.fs3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            fs3 r0 = new fs3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.l
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.h
            zw2 r6 = r0.d
            rq3 r7 = r0.c
            defpackage.g13.O(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r5)
            r5 = 0
            return r5
        L36:
            defpackage.g13.O(r8)
        L39:
            r0.c = r5
            r0.d = r7
            r0.h = r6
            r0.m = r2
            java.lang.Object r8 = r5.a(r7, r0)
            hq0 r1 = defpackage.hq0.c
            if (r8 != r1) goto L4a
            return r1
        L4a:
            yw2 r8 = (defpackage.yw2) r8
            r1 = 0
            boolean r3 = g(r8, r6, r1)
            if (r3 == 0) goto L39
            java.util.List r5 = r8.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os3.b(rq3, boolean, zw2, wr):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.rq3 r5, defpackage.zw2 r6, defpackage.wr r7) {
        /*
            boolean r0 = r7 instanceof defpackage.gs3
            if (r0 == 0) goto L13
            r0 = r7
            gs3 r0 = (defpackage.gs3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            gs3 r0 = new gs3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.h
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            zw2 r5 = r0.d
            rq3 r6 = r0.c
            defpackage.g13.O(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r5)
            r5 = 0
            return r5
        L33:
            defpackage.g13.O(r7)
        L36:
            r0.c = r5
            r0.d = r6
            r0.l = r2
            java.lang.Object r7 = r5.a(r6, r0)
            hq0 r1 = defpackage.hq0.c
            if (r7 != r1) goto L45
            return r1
        L45:
            yw2 r7 = (defpackage.yw2) r7
            r1 = 0
            boolean r3 = g(r7, r1, r2)
            if (r3 == 0) goto L36
            java.util.List r5 = r7.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os3.d(rq3, zw2, wr):java.lang.Object");
    }

    public static final Object e(ix2 ix2Var, oe1 oe1Var, le1 le1Var, so0 so0Var) {
        Object objQ = yo4.q(new pb(ix2Var, oe1Var, le1Var, new py2(ix2Var), null), so0Var);
        return objQ == hq0.c ? objQ : w84.a;
    }

    public static Object f(ix2 ix2Var, nq nqVar, qj3 qj3Var, le1 le1Var, so0 so0Var, int i) {
        nq nqVar2 = (i & 1) != 0 ? null : nqVar;
        Object obj = qj3Var;
        if ((i & 4) != 0) {
            obj = a;
        }
        Object objQ = yo4.q(new ve(ix2Var, obj, null, nqVar2, (i & 8) != 0 ? null : le1Var, null, 8, false), so0Var);
        return objQ == hq0.c ? objQ : w84.a;
    }

    public static final boolean g(yw2 yw2Var, boolean z, boolean z2) {
        if (z2) {
            List list = yw2Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    if ((yw2Var.c & 33) != 0) {
                        break;
                    }
                    return false;
                }
                if (((dx2) list.get(i)).i != 2) {
                    break;
                }
                i++;
            }
        }
        List list2 = yw2Var.a;
        int size2 = list2.size();
        int i2 = 0;
        while (true) {
            boolean zS = true;
            if (i2 >= size2) {
                return true;
            }
            dx2 dx2Var = (dx2) list2.get(i2);
            if (!z) {
                zS = py.s(dx2Var);
            } else if (dx2Var.b() || dx2Var.h || !dx2Var.d) {
                zS = false;
            }
            if (!zS) {
                return false;
            }
            i2++;
        }
    }

    public static ym3 h(gq0 gq0Var, gs1 gs1Var, ne1 ne1Var) {
        return py.F(gq0Var, null, jq0.l, new il3(gs1Var, ne1Var, null, 1), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(rq3 rq3Var, zw2 zw2Var, wr wrVar) throws Throwable {
        ms3 ms3Var;
        q43 q43Var;
        if (wrVar instanceof ms3) {
            ms3Var = (ms3) wrVar;
            int i = ms3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ms3Var.h = i - Integer.MIN_VALUE;
            } else {
                ms3Var = new ms3(wrVar);
            }
        } else {
            ms3Var = new ms3(wrVar);
        }
        Object obj = ms3Var.d;
        int i2 = ms3Var.h;
        so0 so0Var = null;
        try {
            if (i2 == 0) {
                g13.O(obj);
                q43 q43Var2 = new q43();
                q43Var2.c = b82.a;
                long longPressTimeoutMillis = rq3Var.i().getLongPressTimeoutMillis();
                ne1 nc1Var = new nc1(zw2Var, q43Var2, so0Var, 4);
                ms3Var.c = q43Var2;
                ms3Var.h = 1;
                Object objJ = rq3Var.j(longPressTimeoutMillis, nc1Var, ms3Var);
                Object obj2 = hq0.c;
                if (objJ == obj2) {
                    return obj2;
                }
                q43Var = q43Var2;
            } else {
                if (i2 != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                q43Var = ms3Var.c;
                g13.O(obj);
            }
            return q43Var.c;
        } catch (ax2 unused) {
            return d82.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[LOOP:1: B:23:0x006e->B:44:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object j(defpackage.rq3 r17, defpackage.zw2 r18, defpackage.wr r19) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os3.j(rq3, zw2, wr):java.lang.Object");
    }
}
