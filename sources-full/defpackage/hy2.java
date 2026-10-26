package defpackage;

import android.os.Trace;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class hy2 implements a12 {
    public final int a;
    public final long b;
    public final ir3 c;
    public gp3 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public gy2 h;
    public boolean i;
    public long j;
    public long k;
    public long l = yf2.a();
    public final /* synthetic */ iy2 m;

    public hy2(iy2 iy2Var, int i, long j, ir3 ir3Var) {
        this.m = iy2Var;
        this.a = i;
        this.b = j;
        this.c = ir3Var;
    }

    @Override // defpackage.a12
    public final void a() {
        this.i = true;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0150 A[Catch: all -> 0x0179, TryCatch #2 {all -> 0x0179, blocks: (B:54:0x0107, B:56:0x010f, B:58:0x0115, B:63:0x012b, B:64:0x0141, B:65:0x0148, B:67:0x0150, B:70:0x015f, B:71:0x0168), top: B:125:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015f A[Catch: all -> 0x0179, LOOP:1: B:65:0x0148->B:70:0x015f, LOOP_END, TryCatch #2 {all -> 0x0179, blocks: (B:54:0x0107, B:56:0x010f, B:58:0x0115, B:63:0x012b, B:64:0x0141, B:65:0x0148, B:67:0x0150, B:70:0x015f, B:71:0x0168), top: B:125:0x0107 }] */
    public final boolean b(zc zcVar) {
        long j;
        List list;
        long j2 = zcVar.a;
        iy2 iy2Var = this.m;
        q02 q02Var = (q02) ((n02) iy2Var.d).b.invoke();
        if (!this.f) {
            int iA = q02Var.a();
            int i = this.a;
            if (i >= 0 && i < iA) {
                Object objC = q02Var.c(i);
                this.j = Math.max(0L, j2 - System.nanoTime());
                this.l = yf2.a();
                this.k = 0L;
                gp3 gp3Var = this.d;
                ir3 ir3Var = this.c;
                if (gp3Var != null) {
                    j = 0;
                } else {
                    j = 0;
                    long j3 = this.j;
                    long j4 = ir3Var.T(objC).a;
                    if ((!this.i || j3 <= 0) && j4 >= j3) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:compose");
                    try {
                        if (this.d != null) {
                            so1.a("Request was already composed!");
                        }
                        Object objB = q02Var.b(i);
                        this.d = ((ip3) iy2Var.h).a().f(objB, ((n02) iy2Var.d).a(objB, i, objC));
                        Trace.endSection();
                        d();
                        long j5 = this.k;
                        wq wqVar = (wq) ir3Var.c;
                        long j6 = wqVar.a;
                        wqVar.a = j6 == 0 ? j5 : (j5 / 4) + ((j6 / 4) * 3);
                        wq wqVarT = ir3Var.T(objC);
                        long j7 = wqVarT.a;
                        if (j7 != 0) {
                            j5 = (j5 / 4) + ((j7 / 4) * 3);
                        }
                        wqVarT.a = j5;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                if (!this.i) {
                    if (!this.g) {
                        if (this.j <= j) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.h = c();
                            this.g = true;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    gy2 gy2Var = this.h;
                    if (gy2Var != null) {
                        List[] listArr = (List[]) gy2Var.d;
                        int i2 = gy2Var.a;
                        List list2 = (List) gy2Var.c;
                        if (i2 < list2.size()) {
                            if (((hy2) gy2Var.e).f) {
                                so1.c("Should not execute nested prefetch on canceled request");
                            }
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (gy2Var.a < list2.size()) {
                                try {
                                    if (listArr[gy2Var.a] == null) {
                                        long j8 = j;
                                        if (Math.max(j8, j2 - System.nanoTime()) > j8) {
                                            int i3 = gy2Var.a;
                                            b12 b12Var = (b12) list2.get(i3);
                                            le1 le1Var = b12Var.a;
                                            z02 z02Var = new z02(b12Var);
                                            le1Var.invoke(z02Var);
                                            listArr[i3] = z02Var.a;
                                            list = listArr[gy2Var.a];
                                            list.getClass();
                                            while (gy2Var.b < list.size()) {
                                                if (((hy2) list.get(gy2Var.b)).b(zcVar)) {
                                                    gy2Var.b++;
                                                }
                                            }
                                            gy2Var.b = 0;
                                            gy2Var.a++;
                                            j = 0;
                                        }
                                    } else {
                                        list = listArr[gy2Var.a];
                                        list.getClass();
                                        while (gy2Var.b < list.size()) {
                                            if (((hy2) list.get(gy2Var.b)).b(zcVar)) {
                                                gy2Var.b++;
                                            }
                                        }
                                        gy2Var.b = 0;
                                        gy2Var.a++;
                                        j = 0;
                                    }
                                    Trace.endSection();
                                    return true;
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                            Trace.endSection();
                        }
                    }
                    d();
                }
                if (!this.e) {
                    long j9 = this.b;
                    if (!um0.k(j9)) {
                        long j10 = this.j;
                        long j11 = ir3Var.T(objC).b;
                        if ((!this.i || j10 <= 0) && j11 >= j10) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            if (this.f) {
                                so1.a("Callers should check whether the request is still valid before calling performMeasure()");
                            }
                            if (this.e) {
                                so1.a("Request was already measured!");
                            }
                            this.e = true;
                            gp3 gp3Var2 = this.d;
                            if (gp3Var2 != null) {
                                int iA2 = gp3Var2.a();
                                for (int i4 = 0; i4 < iA2; i4++) {
                                    gp3Var2.c(j9, i4);
                                }
                            } else {
                                so1.b("performComposition() must be called before performMeasure()");
                                u41.p();
                            }
                            Trace.endSection();
                            d();
                            long j12 = this.k;
                            wq wqVar2 = (wq) ir3Var.c;
                            long j13 = wqVar2.b;
                            wqVar2.b = j13 == 0 ? j12 : (j12 / 4) + ((j13 / 4) * 3);
                            wq wqVarT2 = ir3Var.T(objC);
                            long j14 = wqVarT2.b;
                            if (j14 != 0) {
                                j12 = (j12 / 4) + ((j14 / 4) * 3);
                            }
                            wqVarT2.b = j12;
                            return false;
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final gy2 c() {
        gp3 gp3Var = this.d;
        gy2 gy2Var = null;
        if (gp3Var == null) {
            so1.b("Should precompose before resolving nested prefetch states");
            u41.p();
            return null;
        }
        q43 q43Var = new q43();
        gp3Var.b(new r91(4, q43Var));
        List list = (List) q43Var.c;
        if (list != null) {
            gy2Var = new gy2();
            gy2Var.e = this;
            gy2Var.c = list;
            gy2Var.d = new List[list.size()];
            if (list.isEmpty()) {
                so1.a("NestedPrefetchController shouldn't be created with no states");
            }
        }
        return gy2Var;
    }

    @Override // defpackage.a12
    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        gp3 gp3Var = this.d;
        if (gp3Var != null) {
            gp3Var.dispose();
        }
        this.d = null;
    }

    public final void d() {
        long jZ;
        long jA = yf2.a();
        long j = this.l;
        int i = yf2.b;
        long j2 = (j - 1) | 1;
        long j3 = LongCompanionObject.MAX_VALUE;
        if (j2 != LongCompanionObject.MAX_VALUE) {
            jZ = (1 | (jA - 1)) == LongCompanionObject.MAX_VALUE ? jr1.z(jA) : jr1.H(jA, j);
        } else if (jA == j) {
            int i2 = v01.l;
            jZ = 0;
        } else {
            jZ = v01.g(jr1.z(j));
        }
        long j4 = jZ >> 1;
        int i3 = v01.l;
        if ((((int) jZ) & 1) == 0) {
            j3 = j4;
        } else if (j4 <= 9223372036854L) {
            j3 = j4 < -9223372036854L ? Long.MIN_VALUE : j4 * 1000000;
        }
        this.k = j3;
        this.j -= j3;
        this.l = jA;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append((Object) um0.l(this.b));
        sb.append(", isComposed = ");
        sb.append(this.d != null);
        sb.append(", isMeasured = ");
        sb.append(this.e);
        sb.append(", isCanceled = ");
        sb.append(this.f);
        sb.append(" }");
        return sb.toString();
    }
}
