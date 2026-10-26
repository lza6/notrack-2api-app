package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mx implements kx {
    public final oi2 a = new oi2(0, new nx[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.h43 r8, defpackage.uo0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.lx
            if (r0 == 0) goto L13
            r0 = r9
            lx r0 = (defpackage.lx) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            lx r0 = new lx
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.m
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r7 = r0.l
            int r8 = r0.h
            java.lang.Object[] r1 = r0.d
            h43 r3 = r0.c
            defpackage.g13.O(r9)
            r9 = r3
            goto L62
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r7)
            r7 = 0
            return r7
        L35:
            defpackage.g13.O(r9)
            oi2 r7 = r7.a
            java.lang.Object[] r9 = r7.c
            int r7 = r7.h
            r1 = 0
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
        L43:
            if (r8 >= r7) goto L64
            r3 = r1[r8]
            nx r3 = (defpackage.nx) r3
            j r4 = new j
            r5 = 6
            r4.<init>(r5, r9)
            r0.c = r9
            r0.d = r1
            r0.h = r8
            r0.l = r7
            r0.o = r2
            java.lang.Object r3 = defpackage.yo4.i(r3, r4, r0)
            hq0 r4 = defpackage.hq0.c
            if (r3 != r4) goto L62
            return r4
        L62:
            int r8 = r8 + r2
            goto L43
        L64:
            w84 r7 = defpackage.w84.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx.a(h43, uo0):java.lang.Object");
    }
}
