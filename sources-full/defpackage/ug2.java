package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug2 {
    public final fi2 a;

    public /* synthetic */ ug2(fi2 fi2Var) {
        this.a = fi2Var;
    }

    public static final Object a(fi2 fi2Var) {
        Object objG = fi2Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof vh2)) {
            fi2Var.j(null);
            return objG;
        }
        vh2 vh2Var = (vh2) objG;
        if (vh2Var.d()) {
            j93.g("List is empty.");
            return null;
        }
        int i = vh2Var.b - 1;
        Object objB = vh2Var.b(i);
        vh2Var.k(i);
        objB.getClass();
        if (vh2Var.d()) {
            fi2Var.j(null);
        }
        if (vh2Var.b == 1) {
            fi2Var.l(null, vh2Var.a());
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[LOOP:0: B:9:0x001c->B:28:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[EDGE_INSN: B:31:0x0084->B:29:0x0084 BREAK  A[LOOP:0: B:9:0x001c->B:28:0x0081], SYNTHETIC] */
    public static final vh2 b(fi2 fi2Var) {
        if (fi2Var.i()) {
            vh2 vh2Var = en2.b;
            vh2Var.getClass();
            return vh2Var;
        }
        vh2 vh2Var2 = new vh2();
        Object[] objArr = fi2Var.c;
        long[] jArr = fi2Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof vh2) {
                                vh2 vh2Var3 = (vh2) obj;
                                if (!vh2Var3.d()) {
                                    int i4 = vh2Var2.b + vh2Var3.b;
                                    Object[] objArr2 = vh2Var2.a;
                                    if (objArr2.length < i4) {
                                        vh2Var2.m(i4, objArr2);
                                    }
                                    vl.j0(vh2Var2.b, 0, vh2Var3.b, vh2Var3.a, vh2Var2.a);
                                    vh2Var2.b += vh2Var3.b;
                                }
                            } else {
                                obj.getClass();
                                vh2Var2.g(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return vh2Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ug2) {
            return this.a.equals(((ug2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
