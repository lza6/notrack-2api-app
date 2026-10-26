package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.graphics.layer.a;

/* JADX INFO: loaded from: classes.dex */
public final class gg1 {
    public final a a;
    public Outline f;
    public float j;
    public rq2 k;
    public nt2 l;
    public ic m;
    public boolean n;
    public a10 o;
    public bc p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public wu0 b = jr1.b;
    public dx1 c = dx1.c;
    public le1 d = sx.L;
    public final e8 e = new e8(17, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final sd r = new sd();

    static {
        int i = yw1.a;
        int i2 = yw1.a;
    }

    public gg1(a aVar) {
        this.a = aVar;
        aVar.k(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            a aVar = this.a;
            if (z || aVar.s() > 0.0f) {
                nt2 nt2Var = this.l;
                if (nt2Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = nt2Var instanceof ic;
                    if (!z2) {
                        j93.k("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = ((ic) nt2Var).a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                j93.k("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                j93.k("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = nt2Var;
                    if (outline != null) {
                        outline.setAlpha(aVar.getAlpha());
                        outline2 = outline;
                    }
                    aVar.h(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        aVar.k(false);
                        aVar.discardDisplayList();
                    } else {
                        aVar.k(this.w);
                    }
                } else {
                    aVar.k(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jW = y64.W(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jW = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jW >> 32);
                    int i5 = (int) (jW & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(aVar.getAlpha());
                    aVar.h(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                aVar.k(false);
                aVar.h(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            sd sdVar = this.r;
            gg1 gg1Var = (gg1) sdVar.b;
            if (gg1Var != null) {
                gg1Var.q--;
                gg1Var.b();
                sdVar.b = null;
            }
            gi2 gi2Var = (gi2) sdVar.d;
            if (gi2Var != null) {
                Object[] objArr = gi2Var.b;
                long[] jArr = gi2Var.a;
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
                                    gg1 gg1Var2 = (gg1) objArr[(i << 3) + i3];
                                    gg1Var2.q--;
                                    gg1Var2.b();
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
                gi2Var.b();
            }
            this.a.discardDisplayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    public final void c(tz0 tz0Var) {
        sd sdVar = this.r;
        sdVar.c = (gg1) sdVar.b;
        gi2 gi2Var = (gi2) sdVar.d;
        if (gi2Var != null && gi2Var.h()) {
            gi2 gi2Var2 = (gi2) sdVar.e;
            if (gi2Var2 == null) {
                int i = sa3.a;
                gi2Var2 = new gi2();
                sdVar.e = gi2Var2;
            }
            gi2Var2.j(gi2Var);
            gi2Var.b();
        }
        sdVar.a = true;
        this.d.invoke(tz0Var);
        sdVar.a = false;
        gg1 gg1Var = (gg1) sdVar.c;
        if (gg1Var != null) {
            gg1Var.q--;
            gg1Var.b();
        }
        gi2 gi2Var3 = (gi2) sdVar.e;
        if (gi2Var3 == null || !gi2Var3.h()) {
            return;
        }
        Object[] objArr = gi2Var3.b;
        long[] jArr = gi2Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            gg1 gg1Var2 = (gg1) objArr[(i2 << 3) + i4];
                            gg1Var2.q--;
                            gg1Var2.b();
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        gi2Var3.b();
    }

    public final rq2 d() {
        rq2 pq2Var;
        rq2 rq2Var = this.k;
        nt2 nt2Var = this.l;
        if (rq2Var != null) {
            return rq2Var;
        }
        if (nt2Var != null) {
            oq2 oq2Var = new oq2(nt2Var);
            this.k = oq2Var;
            return oq2Var;
        }
        long jW = y64.W(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jW = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jW >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jW & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            pq2Var = new qq2(yh4.e(fIntBitsToFloat, fIntBitsToFloat2, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), fIntBitsToFloat3, fIntBitsToFloat4));
        } else {
            pq2Var = new pq2(new h43(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = pq2Var;
        return pq2Var;
    }

    public final void e(long j, long j2, float f) {
        if (ln2.c(this.h, j) && bi3.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
