package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uk3 implements Iterable, gu1 {
    public static final uk3 m = new uk3(0, 0, 0, null);
    public final long c;
    public final long d;
    public final long h;
    public final long[] l;

    public uk3(long j, long j2, long j3, long[] jArr) {
        this.c = j;
        this.d = j2;
        this.h = j3;
        this.l = jArr;
    }

    public final uk3 b(uk3 uk3Var) {
        long[] jArr;
        uk3 uk3VarD = this;
        uk3 uk3Var2 = m;
        if (uk3Var == uk3Var2) {
            return uk3VarD;
        }
        if (uk3VarD == uk3Var2) {
            return uk3Var2;
        }
        long j = uk3Var.h;
        long j2 = uk3Var.h;
        long[] jArr2 = uk3Var.l;
        long j3 = uk3Var.d;
        long j4 = uk3Var.c;
        long j5 = uk3VarD.h;
        if (j == j5 && jArr2 == (jArr = uk3VarD.l)) {
            return new uk3(uk3VarD.c & (~j4), uk3VarD.d & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                uk3VarD = uk3VarD.d(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    uk3VarD = uk3VarD.d(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    uk3VarD = uk3VarD.d(((long) i2) + j2 + 64);
                }
            }
        }
        return uk3VarD;
    }

    public final uk3 d(long j) {
        long[] jArr;
        int iE;
        long[] jArr2;
        long j2 = this.h;
        long j3 = j - j2;
        if (j3 >= 0 && j3 < 64) {
            long j4 = 1 << ((int) j3);
            long j5 = this.d;
            if ((j5 & j4) != 0) {
                return new uk3(this.c, j5 & (~j4), j2, this.l);
            }
        } else if (j3 >= 64 && j3 < 128) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.c;
            if ((j7 & j6) != 0) {
                return new uk3(j7 & (~j6), this.d, j2, this.l);
            }
        } else if (j3 < 0 && (jArr = this.l) != null && (iE = xp1.e(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iE > 0) {
                    vl.l0(jArr, jArr3, 0, 0, iE);
                }
                if (iE < i) {
                    vl.l0(jArr, jArr3, iE, iE + 1, length);
                }
                jArr2 = jArr3;
            }
            return new uk3(this.c, this.d, this.h, jArr2);
        }
        return this;
    }

    public final boolean g(long j) {
        long[] jArr;
        long j2 = j - this.h;
        if (j2 >= 0 && j2 < 64) {
            return ((1 << ((int) j2)) & this.d) != 0;
        }
        if (j2 < 64 || j2 >= 128) {
            return j2 <= 0 && (jArr = this.l) != null && xp1.e(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.c) != 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return sf3.M(new tk3(this, null));
    }

    public final uk3 j(uk3 uk3Var) {
        uk3 uk3VarK;
        long[] jArr;
        uk3 uk3VarK2 = this;
        uk3 uk3Var2 = m;
        if (uk3Var == uk3Var2) {
            return uk3VarK2;
        }
        if (uk3VarK2 == uk3Var2) {
            return uk3Var;
        }
        long j = uk3Var.h;
        long j2 = uk3Var.h;
        long[] jArr2 = uk3Var.l;
        long j3 = uk3Var.d;
        long j4 = uk3Var.c;
        long j5 = uk3VarK2.h;
        long j6 = uk3VarK2.d;
        long j7 = uk3VarK2.c;
        if (j == j5 && jArr2 == (jArr = uk3VarK2.l)) {
            return new uk3(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = uk3VarK2.l;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    uk3VarK2 = uk3VarK2.k(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        uk3VarK2 = uk3VarK2.k(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        uk3VarK2 = uk3VarK2.k(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return uk3VarK2;
        }
        if (jArr3 != null) {
            uk3VarK = uk3Var;
            for (long j9 : jArr3) {
                uk3VarK = uk3VarK.k(j9);
            }
        } else {
            uk3VarK = uk3Var;
        }
        long j10 = uk3VarK2.h;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    uk3VarK = uk3VarK.k(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    uk3VarK = uk3VarK.k(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return uk3VarK;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    public final uk3 k(long j) {
        int i;
        long j2;
        long j3;
        long[] jArr;
        long j4 = this.h;
        long j5 = j - j4;
        long j6 = this.c;
        long j7 = this.d;
        long[] jArr2 = this.l;
        if (j5 >= 0 && j5 < 64) {
            long j8 = 1 << ((int) j5);
            if ((j7 & j8) == 0) {
                return new uk3(j6, j8 | j7, j4, jArr2);
            }
        } else if (j5 >= 64 && j5 < 128) {
            long j9 = 1 << (((int) j5) - 64);
            if ((j6 & j9) == 0) {
                return new uk3(j6 | j9, j7, j4, jArr2);
            }
        } else if (j5 < 128) {
            if (jArr2 == null) {
                return new uk3(j6, j7, j4, new long[]{j});
            }
            int iE = xp1.e(jArr2, j);
            if (iE < 0) {
                int i2 = -(iE + 1);
                int length = jArr2.length;
                long[] jArr3 = new long[length + 1];
                vl.l0(jArr2, jArr3, 0, 0, i2);
                vl.l0(jArr2, jArr3, i2 + 1, i2, length);
                jArr3[i2] = j;
                return new uk3(this.c, this.d, this.h, jArr3);
            }
        } else if (!g(j)) {
            long j10 = ((j + 1) / 64) * 64;
            if (j10 < 0) {
                j10 = 9223372036854775680L;
            }
            long j11 = this.h;
            long j12 = j6;
            sk3 sk3Var = null;
            while (true) {
                if (j11 >= j10) {
                    i = 0;
                    j2 = j7;
                    j3 = j11;
                    break;
                }
                if (j7 != 0) {
                    if (sk3Var == null) {
                        sk3Var = new sk3(jArr2);
                    }
                    for (int i3 = 0; i3 < 64; i3++) {
                        if ((j7 & (1 << i3)) != 0) {
                            ((kh2) sk3Var.d).a(((long) i3) + j11);
                        }
                    }
                }
                i = 0;
                if (j12 == 0) {
                    j3 = j10;
                    j2 = 0;
                    break;
                }
                j11 += 64;
                j7 = j12;
                j12 = 0;
            }
            long[] jArr4 = null;
            if (sk3Var == null) {
                jArr = jArr2;
            } else {
                kh2 kh2Var = (kh2) sk3Var.d;
                int i4 = kh2Var.b;
                if (i4 != 0) {
                    jArr4 = new long[i4];
                    long[] jArr5 = kh2Var.a;
                    for (int i5 = i; i5 < i4; i5++) {
                        jArr4[i5] = jArr5[i5];
                    }
                }
                if (jArr4 == null) {
                    jArr = jArr2;
                } else {
                    jArr = jArr4;
                }
            }
            return new uk3(j12, j2, j3, jArr).k(j);
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(le0.q0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) BuildConfig.VERSION_NAME);
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) BuildConfig.VERSION_NAME);
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
