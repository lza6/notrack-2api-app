package defpackage;

import androidx.compose.ui.platform.ViewConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class uy0 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[LOOP:0: B:24:0x009e->B:28:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7 A[EDGE_INSN: B:65:0x00b7->B:30:0x00b7 BREAK  A[LOOP:0: B:24:0x009e->B:28:0x00b2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:23:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.rq3 r17, defpackage.dx2 r18, defpackage.zw2 r19, defpackage.wr r20) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.a(rq3, dx2, zw2, wr):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0067->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EDGE_INSN: B:54:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0067->B:27:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.rq3 r12, long r13, defpackage.uo0 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.jy0
            if (r0 == 0) goto L13
            r0 = r15
            jy0 r0 = (defpackage.jy0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            jy0 r0 = new jy0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.h
            int r1 = r0.l
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            p43 r12 = r0.d
            rq3 r13 = r0.c
            defpackage.g13.O(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5d
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r12)
            return r3
        L33:
            defpackage.g13.O(r15)
            sq3 r15 = r12.n
            yw2 r15 = r15.n
            boolean r15 = i(r15, r13)
            if (r15 == 0) goto L42
            goto Lc2
        L42:
            p43 r15 = new p43
            r15.<init>()
            r15.c = r13
        L49:
            r0.c = r12
            r0.d = r15
            r0.l = r2
            zw2 r13 = defpackage.zw2.d
            java.lang.Object r13 = r12.a(r13, r0)
            hq0 r14 = defpackage.hq0.c
            if (r13 != r14) goto L5a
            return r14
        L5a:
            r11 = r15
            r15 = r13
            r13 = r11
        L5d:
            yw2 r15 = (defpackage.yw2) r15
            java.util.List r14 = r15.a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L67:
            if (r5 >= r1) goto L7e
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            dx2 r7 = (defpackage.dx2) r7
            long r7 = r7.a
            long r9 = r13.c
            boolean r7 = defpackage.xr0.V(r7, r9)
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L67
        L7e:
            r6 = r3
        L7f:
            dx2 r6 = (defpackage.dx2) r6
            if (r6 != 0) goto L85
            r6 = r3
            goto Lb9
        L85:
            boolean r14 = defpackage.py.u(r6)
            if (r14 == 0) goto Lad
            java.util.List r14 = r15.a
            int r15 = r14.size()
        L91:
            if (r4 >= r15) goto La2
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            dx2 r5 = (defpackage.dx2) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L9f
            goto La3
        L9f:
            int r4 = r4 + 1
            goto L91
        La2:
            r1 = r3
        La3:
            dx2 r1 = (defpackage.dx2) r1
            if (r1 != 0) goto La8
            goto Lb9
        La8:
            long r14 = r1.a
            r13.c = r14
            goto Lc3
        Lad:
            long r14 = defpackage.py.L(r6, r2)
            r4 = 0
            boolean r14 = defpackage.ln2.c(r14, r4)
            if (r14 != 0) goto Lc3
        Lb9:
            if (r6 == 0) goto Lc2
            boolean r12 = r6.b()
            if (r12 != 0) goto Lc2
            return r6
        Lc2:
            return r3
        Lc3:
            r15 = r13
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.b(rq3, long, uo0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cf A[LOOP:0: B:26:0x00b6->B:30:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00db A[EDGE_INSN: B:68:0x00db->B:32:0x00db BREAK  A[LOOP:0: B:26:0x00b6->B:30:0x00cf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0167 -> B:62:0x016d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.rq3 r19, long r20, int r22, defpackage.qy0 r23, defpackage.wr r24) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.c(rq3, long, int, qy0, wr):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [q43] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final Object d(rq3 rq3Var, long j, uo0 uo0Var) {
        ly0 ly0Var;
        Object obj;
        dx2 dx2Var;
        l43 l43Var;
        if (uo0Var instanceof ly0) {
            ly0Var = (ly0) uo0Var;
            int i = ly0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ly0Var.m = i - Integer.MIN_VALUE;
            } else {
                ly0Var = new ly0(uo0Var);
            }
        } else {
            ly0Var = new ly0(uo0Var);
        }
        Object obj2 = ly0Var.l;
        int i2 = ly0Var.m;
        try {
            if (i2 == 0) {
                g13.O(obj2);
                if (!i(rq3Var.n.n, j)) {
                    List list = rq3Var.n.n.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (xr0.V(((dx2) obj).a, j)) {
                            break;
                        }
                        i3++;
                    }
                    dx2Var = (dx2) obj;
                    if (dx2Var != null) {
                        q43 q43Var = new q43();
                        q43 q43Var2 = new q43();
                        q43Var2.c = dx2Var;
                        long longPressTimeoutMillis = rq3Var.i().getLongPressTimeoutMillis();
                        l43 l43Var2 = new l43();
                        ne1 my0Var = new my0(l43Var2, q43Var2, q43Var, null);
                        ly0Var.c = dx2Var;
                        ly0Var.d = q43Var;
                        ly0Var.h = l43Var2;
                        ly0Var.m = 1;
                        Object objJ = rq3Var.j(longPressTimeoutMillis, my0Var, ly0Var);
                        Object obj3 = hq0.c;
                        if (objJ == obj3) {
                            return obj3;
                        }
                        l43Var = l43Var2;
                        j = q43Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l43Var = ly0Var.h;
            q43 q43Var3 = ly0Var.d;
            dx2Var = ly0Var.c;
            g13.O(obj2);
            j = q43Var3;
            if (l43Var.c) {
                dx2 dx2Var2 = (dx2) j.c;
                return dx2Var2 == null ? dx2Var : dx2Var2;
            }
            return null;
        } catch (ax2 unused) {
            dx2 dx2Var3 = (dx2) j.c;
            return dx2Var3 == null ? dx2Var : dx2Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb A[LOOP:0: B:26:0x00b2->B:30:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7 A[EDGE_INSN: B:68:0x00d7->B:32:0x00d7 BREAK  A[LOOP:0: B:26:0x00b2->B:30:0x00cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015b -> B:62:0x0161). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(defpackage.rq3 r19, long r20, defpackage.ea r22, defpackage.wr r23) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.e(rq3, long, ea, wr):java.lang.Object");
    }

    public static final Object f(ix2 ix2Var, le1 le1Var, je1 je1Var, je1 je1Var2, ne1 ne1Var, uo0 uo0Var) {
        Object objL = p23.l(ix2Var, new py0(d4.A, new p43(), null, new zg(2, le1Var), ne1Var, je1Var2, new oy0(je1Var, 0), null), uo0Var);
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        if (objL != hq0Var) {
            objL = w84Var;
        }
        return objL == hq0Var ? objL : w84Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(defpackage.rq3 r4, long r5, defpackage.le1 r7, defpackage.uo0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.sy0
            if (r0 == 0) goto L13
            r0 = r8
            sy0 r0 = (defpackage.sy0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            sy0 r0 = new sy0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.h
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            le1 r4 = r0.d
            rq3 r5 = r0.c
            defpackage.g13.O(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r4)
            r4 = 0
            return r4
        L32:
            defpackage.g13.O(r8)
        L35:
            r0.c = r4
            r0.d = r7
            r0.l = r2
            java.lang.Object r8 = b(r4, r5, r0)
            hq0 r5 = defpackage.hq0.c
            if (r8 != r5) goto L44
            return r5
        L44:
            dx2 r8 = (defpackage.dx2) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.py.u(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.a
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.g(rq3, long, le1, uo0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099 A[LOOP:0: B:24:0x0085->B:28:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x009e A[EDGE_INSN: B:72:0x009e->B:30:0x009e BREAK  A[LOOP:0: B:24:0x0085->B:28:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:23:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(defpackage.rq3 r17, long r18, defpackage.le1 r20, defpackage.wr r21) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.h(rq3, long, le1, wr):java.lang.Object");
    }

    public static final boolean i(yw2 yw2Var, long j) {
        Object obj;
        List list = yw2Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (xr0.V(((dx2) obj).a, j)) {
                break;
            }
            i++;
        }
        dx2 dx2Var = (dx2) obj;
        if (dx2Var != null && dx2Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float j(ViewConfiguration viewConfiguration, int i) {
        return i == 2 ? viewConfiguration.getTouchSlop() * a : viewConfiguration.getTouchSlop();
    }
}
