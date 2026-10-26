package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class y31 {
    public final g33 a;
    public final sd b;
    public final bi4 c;
    public final sz0 d;

    public y31(g33 g33Var, sd sdVar, bi4 bi4Var) {
        this.a = g33Var;
        this.b = sdVar;
        this.c = bi4Var;
        this.d = new sz0(g33Var, bi4Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0070 A[LOOP:0: B:16:0x0050->B:20:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009f -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.y31 r5, defpackage.xl3 r6, defpackage.vg0 r7, defpackage.pm1 r8, java.lang.Object r9, defpackage.jq2 r10, defpackage.bg1 r11, defpackage.uo0 r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y31.a(y31, xl3, vg0, pm1, java.lang.Object, jq2, bg1, uo0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:52:0x0123  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
    
        if (r1 == r12) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.y31 r15, defpackage.pm1 r16, java.lang.Object r17, defpackage.jq2 r18, defpackage.bg1 r19, defpackage.uo0 r20) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y31.b(y31, pm1, java.lang.Object, jq2, bg1, uo0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00af -> B:28:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.vg0 r8, defpackage.pm1 r9, java.lang.Object r10, defpackage.jq2 r11, defpackage.bg1 r12, defpackage.uo0 r13) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y31.c(vg0, pm1, java.lang.Object, jq2, bg1, uo0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(j33 j33Var, uo0 uo0Var) throws Throwable {
        x31 x31Var;
        j33 j33Var2 = j33Var;
        sz0 sz0Var = this.d;
        if (uo0Var instanceof x31) {
            x31Var = (x31) uo0Var;
            int i = x31Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                x31Var.l = i - Integer.MIN_VALUE;
            } else {
                x31Var = new x31(this, uo0Var);
            }
        } else {
            x31Var = new x31(this, uo0Var);
        }
        x31 x31Var2 = x31Var;
        Object obj = x31Var2.d;
        int i2 = x31Var2.l;
        if (i2 == 0) {
            g13.O(obj);
            try {
                pm1 pm1Var = j33Var2.d;
                Object obj2 = pm1Var.b;
                ai3 ai3Var = j33Var2.e;
                bg1 bg1Var = j33Var2.f;
                jq2 jq2VarI = this.c.i(pm1Var, ai3Var);
                ma3 ma3Var = jq2VarI.c;
                List list = this.a.d.b;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ps2 ps2Var = (ps2) list.get(i3);
                    ce ceVar = (ce) ps2Var.c;
                    if (((vc0) ps2Var.d).b(obj2)) {
                        ceVar.getClass();
                        da4 da4VarA = ceVar.a(obj2, jq2VarI);
                        if (da4VarA != null) {
                            obj2 = da4VarA;
                        }
                    }
                }
                cc2 cc2VarP = sz0Var.p(pm1Var, obj2, jq2VarI, bg1Var);
                dc2 dc2VarL = cc2VarP != null ? sz0Var.l(pm1Var, cc2VarP, ai3Var, ma3Var) : null;
                if (dc2VarL == null) {
                    xp0 xp0Var = pm1Var.i;
                    v31 v31Var = new v31(this, pm1Var, obj2, jq2VarI, bg1Var, cc2VarP, j33Var2, (so0) null);
                    x31Var2.c = j33Var2;
                    x31Var2.l = 1;
                    Object objY = py.Y(xp0Var, v31Var, x31Var2);
                    hq0 hq0Var = hq0.c;
                    return objY == hq0Var ? hq0Var : objY;
                }
                Map map = dc2VarL.b;
                am1 am1Var = dc2VarL.a;
                qr0 qr0Var = qr0.c;
                Object obj3 = map.get("coil#disk_cache_key");
                String str = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = map.get("coil#is_sampled");
                Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                return new np3(am1Var, pm1Var, qr0Var, cc2VarP, str, bool != null ? bool.booleanValue() : false, j33Var2.g);
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j33 j33Var3 = x31Var2.c;
            try {
                g13.O(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                j33Var2 = j33Var3;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return p23.c(j33Var2.d, th);
    }
}
