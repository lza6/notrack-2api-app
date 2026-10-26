package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fi2;
import defpackage.fq2;
import defpackage.gi2;
import defpackage.gj;
import defpackage.j02;
import defpackage.k02;
import defpackage.ke0;
import defpackage.kr1;
import defpackage.oe0;
import defpackage.of2;
import defpackage.qa3;
import defpackage.sa3;
import defpackage.t02;
import defpackage.tf2;
import defpackage.u02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final fi2 a;
    public gj b;
    public final gi2 c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final androidx.compose.ui.c i;

    public b() {
        long[] jArr = qa3.a;
        this.a = new fi2();
        int i = sa3.a;
        this.c = new gi2();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new tf2(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement
            public final b c;

            {
                this.c = this;
            }

            @Override // defpackage.tf2
            public final of2 create() {
                j02 j02Var = new j02();
                j02Var.c = this.c;
                return j02Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && this.c == ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).c;
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            @Override // defpackage.tf2
            public final void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("DisplayingDisappearingItemsElement");
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.c + ')';
            }

            @Override // defpackage.tf2
            public final void update(of2 of2Var) {
                j02 j02Var = (j02) of2Var;
                b bVar = j02Var.c;
                b bVar2 = this.c;
                if (kr1.n(bVar, bVar2) || !j02Var.getNode().isAttached()) {
                    return;
                }
                b bVar3 = j02Var.c;
                bVar3.d();
                bVar3.b = null;
                j02Var.c = bVar2;
            }
        };
    }

    public static int e(int[] iArr, t02 t02Var) {
        int i = t02Var.i();
        int iG = t02Var.g() + i;
        int iMax = 0;
        while (i < iG) {
            int iE = t02Var.e() + iArr[i];
            iArr[i] = iE;
            iMax = Math.max(iMax, iE);
            i++;
        }
        return iMax;
    }

    public final void a(int i, Object obj) {
        fq2.y(this.a.g(obj));
    }

    public final long b() {
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        fq2.y(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0094 A[EDGE_INSN: B:111:0x0094->B:34:0x0094 BREAK  A[LOOP:2: B:21:0x005a->B:33:0x0091], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[LOOP:2: B:21:0x005a->B:33:0x0091, LOOP_END] */
    public final void c(int i, int i2, ArrayList arrayList, gj gjVar, u02 u02Var, boolean z, int i3, boolean z2, int i4, int i5) throws Throwable {
        Throwable th;
        Object[] objArr;
        Object[] objArr2;
        int i6;
        gj gjVar2 = this.b;
        this.b = gjVar;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            t02 t02Var = (t02) arrayList.get(i7);
            int iA = t02Var.a();
            for (int i8 = 0; i8 < iA; i8++) {
                t02Var.h(i8);
            }
        }
        fi2 fi2Var = this.a;
        if (fi2Var.i()) {
            d();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr3 = fi2Var.b;
        long[] jArr = fi2Var.a;
        int i9 = 2;
        int length = jArr.length - 2;
        gi2 gi2Var = this.c;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                int i11 = i10;
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i10 = i11 + 1;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    long j2 = j;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j2 & 255) < 128) {
                            gi2Var.a(objArr3[(i11 << 3) + i13]);
                        }
                        j2 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i10 = i11 + 1;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            t02 t02Var2 = (t02) arrayList.get(i14);
            gi2Var.l(t02Var2.getKey());
            int iA2 = t02Var2.a();
            for (int i15 = 0; i15 < iA2; i15++) {
                t02Var2.h(i15);
            }
            fq2.y(fi2Var.j(t02Var2.getKey()));
        }
        int[] iArr = new int[i3];
        Throwable th2 = null;
        ArrayList arrayList2 = this.e;
        ArrayList arrayList3 = this.d;
        if (z3 && gjVar2 != null) {
            if (arrayList3.isEmpty()) {
                i6 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    oe0.r0(arrayList3, new k02(gjVar2, i9));
                }
                if (arrayList3.size() > 0) {
                    t02 t02Var3 = (t02) arrayList3.get(0);
                    e(iArr, t02Var3);
                    Object objG = fi2Var.g(t02Var3.getKey());
                    objG.getClass();
                    fq2.y(objG);
                    t02Var3.f(0);
                    throw null;
                }
                i6 = 0;
                Arrays.fill(iArr, 0, i3, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    oe0.r0(arrayList2, new k02(gjVar2, i6));
                }
                if (arrayList2.size() > 0) {
                    t02 t02Var4 = (t02) arrayList2.get(i6);
                    e(iArr, t02Var4);
                    Object objG2 = fi2Var.g(t02Var4.getKey());
                    objG2.getClass();
                    fq2.y(objG2);
                    t02Var4.f(i6);
                    throw null;
                }
                Arrays.fill(iArr, i6, i3, i6);
            }
        }
        Object[] objArr4 = gi2Var.b;
        long[] jArr2 = gi2Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j3 = jArr2[i16];
                th = th2;
                long[] jArr3 = jArr2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr4;
                            fq2.y(fi2Var.g(objArr2[(i16 << 3) + i18]));
                        } else {
                            objArr2 = objArr4;
                        }
                        j3 >>= 8;
                        i18++;
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    if (i17 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                }
                if (i16 == length2) {
                    break;
                }
                i16++;
                th2 = th;
                jArr2 = jArr3;
                objArr4 = objArr;
            }
        } else {
            th = null;
        }
        ArrayList arrayList4 = this.f;
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() > 1) {
                oe0.r0(arrayList4, new k02(gjVar, 3));
            }
            if (arrayList4.size() > 0) {
                t02 t02Var5 = (t02) arrayList4.get(0);
                Object objG3 = fi2Var.g(t02Var5.getKey());
                objG3.getClass();
                fq2.y(objG3);
                e(iArr, t02Var5);
                if (!z) {
                    throw th;
                }
                ((t02) ke0.y0(arrayList)).f(0);
                throw th;
            }
            Arrays.fill(iArr, 0, i3, 0);
        }
        ArrayList arrayList5 = this.g;
        if (!arrayList5.isEmpty()) {
            int i19 = 1;
            if (arrayList5.size() > 1) {
                oe0.r0(arrayList5, new k02(gjVar, i19));
            }
            if (arrayList5.size() > 0) {
                t02 t02Var6 = (t02) arrayList5.get(0);
                Object objG4 = fi2Var.g(t02Var6.getKey());
                objG4.getClass();
                fq2.y(objG4);
                e(iArr, t02Var6);
                if (!z) {
                    throw th;
                }
                ((t02) ke0.E0(arrayList)).f(0);
                throw th;
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        gi2Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[LOOP:0: B:7:0x0011->B:18:0x0048, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b A[EDGE_INSN: B:22:0x004b->B:19:0x004b BREAK  A[LOOP:0: B:7:0x0011->B:18:0x0048], SYNTHETIC] */
    public final void d() {
        fi2 fi2Var = this.a;
        if (fi2Var.e != 0) {
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
                                fq2.y(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            fi2Var.a();
        }
    }
}
