package defpackage;

import androidx.compose.ui.platform.JvmActuals_jvmKt;
import app.template.extension.BuildConfig;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ue3 implements gf3, Iterable, gu1 {
    public final fi2 c;
    public w92 d;
    public boolean h;
    public boolean l;

    public ue3() {
        long[] jArr = qa3.a;
        this.c = new fi2();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005d A[LOOP:0: B:5:0x0026->B:15:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[EDGE_INSN: B:18:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0026->B:15:0x005d], SYNTHETIC] */
    public final ue3 b() {
        ue3 ue3Var = new ue3();
        ue3Var.h = this.h;
        ue3Var.l = this.l;
        fi2 fi2Var = ue3Var.c;
        fi2Var.getClass();
        fi2 fi2Var2 = this.c;
        fi2Var2.getClass();
        Object[] objArr = fi2Var2.b;
        Object[] objArr2 = fi2Var2.c;
        long[] jArr = fi2Var2.a;
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
                            int i4 = (i << 3) + i3;
                            fi2Var.l(objArr[i4], objArr2[i4]);
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
        return ue3Var;
    }

    public final Object d(ff3 ff3Var) {
        Object objG = this.c.g(ff3Var);
        if (objG != null) {
            return objG;
        }
        m51.j(ff3Var, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue3)) {
            return false;
        }
        ue3 ue3Var = (ue3) obj;
        return kr1.n(this.c, ue3Var.c) && this.h == ue3Var.h && this.l == ue3Var.l;
    }

    public final void g(ue3 ue3Var) {
        fi2 fi2Var = ue3Var.c;
        Object[] objArr = fi2Var.b;
        Object[] objArr2 = fi2Var.c;
        long[] jArr = fi2Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        ff3 ff3Var = (ff3) obj;
                        fi2 fi2Var2 = this.c;
                        Object objG = fi2Var2.g(ff3Var);
                        ff3Var.getClass();
                        Object objInvoke = ff3Var.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            fi2Var2.l(ff3Var, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + ud2.k(this.c.hashCode() * 31, 31, this.h);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        w92 w92Var = this.d;
        if (w92Var == null) {
            fi2 fi2Var = this.c;
            fi2Var.getClass();
            w92 w92Var2 = new w92(fi2Var);
            this.d = w92Var2;
            w92Var = w92Var2;
        }
        return ((n41) w92Var.entrySet()).iterator();
    }

    public final void j(ff3 ff3Var, Object obj) {
        boolean z = obj instanceof z0;
        fi2 fi2Var = this.c;
        if (!z || !fi2Var.c(ff3Var)) {
            fi2Var.l(ff3Var, obj);
            return;
        }
        Object objG = fi2Var.g(ff3Var);
        objG.getClass();
        z0 z0Var = (z0) objG;
        z0 z0Var2 = (z0) obj;
        String str = z0Var2.a;
        if (str == null) {
            str = z0Var.a;
        }
        se1 se1Var = z0Var2.b;
        if (se1Var == null) {
            se1Var = z0Var.b;
        }
        fi2Var.l(ff3Var, new z0(str, se1Var));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.h) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        if (this.l) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        fi2 fi2Var = this.c;
        Object[] objArr = fi2Var.b;
        Object[] objArr2 = fi2Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((ff3) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + ((Object) sb) + " }";
    }
}
