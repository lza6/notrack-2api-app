package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class l62 implements View.OnTouchListener {
    public static final int z = ViewConfiguration.getTapTimeout();
    public final eo c;
    public final AccelerateInterpolator d;
    public final p01 h;
    public im l;
    public final float[] m;
    public final float[] n;
    public final int o;
    public final int p;
    public final float[] q;
    public final float[] r;
    public final float[] s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final p01 y;

    public l62(p01 p01Var) {
        eo eoVar = new eo();
        eoVar.e = Long.MIN_VALUE;
        eoVar.g = -1L;
        eoVar.f = 0L;
        this.c = eoVar;
        this.d = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.m = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.n = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.q = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.r = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.s = fArr5;
        this.h = p01Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.o = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.p = z;
        eoVar.a = 500;
        eoVar.b = 500;
        this.y = p01Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f, float f2, float f3, int i) {
        float fB;
        float interpolation;
        float fB2 = b(this.m[i] * f2, 0.0f, this.n[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.d;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.q[i];
            float f5 = this.r[i];
            float f6 = this.s[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.q[i];
        float f9 = this.r[i];
        float f10 = this.s[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.o;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.w && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.u) {
            this.w = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        eo eoVar = this.c;
        int i2 = (int) (jCurrentAnimationTimeMillis - eoVar.e);
        int i3 = eoVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        eoVar.i = i;
        eoVar.h = eoVar.a(jCurrentAnimationTimeMillis);
        eoVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        p01 p01Var;
        int count;
        eo eoVar = this.c;
        float f = eoVar.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(eoVar.c);
        if (iAbs != 0 && (count = (p01Var = this.y).getCount()) != 0) {
            int childCount = p01Var.getChildCount();
            int firstVisiblePosition = p01Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && p01Var.getChildAt(0).getTop() >= 0)) : !(i >= count && p01Var.getChildAt(childCount - 1).getBottom() <= p01Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.x
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r1
        L1b:
            r7.v = r2
            r7.t = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            p01 r4 = r7.h
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            eo r9 = r7.c
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.w
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            im r8 = r7.l
            if (r8 != 0) goto L60
            im r8 = new im
            r8.<init>(r2, r7)
            r7.l = r8
        L60:
            r7.w = r2
            r7.u = r2
            boolean r8 = r7.t
            if (r8 != 0) goto L75
            int r8 = r7.p
            if (r8 <= 0) goto L75
            im r9 = r7.l
            long r5 = (long) r8
            java.util.WeakHashMap r8 = defpackage.zc4.a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            im r8 = r7.l
            r8.run()
        L7a:
            r7.t = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l62.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
