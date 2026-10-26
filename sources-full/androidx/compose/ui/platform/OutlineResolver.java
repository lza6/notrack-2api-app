package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import defpackage.h43;
import defpackage.ic;
import defpackage.j93;
import defpackage.kc;
import defpackage.kr1;
import defpackage.nt2;
import defpackage.oq2;
import defpackage.pq2;
import defpackage.qq2;
import defpackage.rq2;
import defpackage.x73;
import defpackage.y00;
import defpackage.yh4;

/* JADX INFO: loaded from: classes.dex */
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private nt2 cachedRrectPath;
    private boolean isSupportedOutline = true;
    private rq2 outline;
    private boolean outlineNeeded;
    private nt2 outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private nt2 tmpOpPath;
    private nt2 tmpPath;
    private x73 tmpRoundRect;
    private nt2 tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = 0L;
        this.rectSize = 0L;
    }

    /* JADX INFO: renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m121xe1031697(x73 x73Var, long j, long j2, float f) {
        if (x73Var == null || !yh4.K(x73Var)) {
            return false;
        }
        int i = (int) (j >> 32);
        if (x73Var.a != Float.intBitsToFloat(i)) {
            return false;
        }
        int i2 = (int) (j & 4294967295L);
        if (x73Var.b != Float.intBitsToFloat(i2)) {
            return false;
        }
        if (x73Var.c == Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i)) {
            return x73Var.d == Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2) && Float.intBitsToFloat((int) (x73Var.e >> 32)) == f;
        }
        return false;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = 0L;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            rq2 rq2Var = this.outline;
            if (rq2Var == null || !this.outlineNeeded || Float.intBitsToFloat((int) (this.rectSize >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            if (rq2Var instanceof pq2) {
                updateCacheWithRect(((pq2) rq2Var).a);
            } else if (rq2Var instanceof qq2) {
                updateCacheWithRoundRect(((qq2) rq2Var).a);
            } else if (rq2Var instanceof oq2) {
                updateCacheWithPath(((oq2) rq2Var).a);
            }
        }
    }

    private final void updateCacheWithPath(nt2 nt2Var) {
        int i = Build.VERSION.SDK_INT;
        if (i > 28 || ((ic) nt2Var).a.isConvex()) {
            if (i >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(this.cachedOutline, nt2Var);
            } else {
                Outline outline = this.cachedOutline;
                if (!(nt2Var instanceof ic)) {
                    j93.k("Unable to obtain android.graphics.Path");
                    return;
                }
                outline.setConvexPath(((ic) nt2Var).a);
            }
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = nt2Var;
    }

    private final void updateCacheWithRect(h43 h43Var) {
        float f = h43Var.a;
        float f2 = h43Var.b;
        this.rectTopLeft = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        float f3 = h43Var.c;
        float f4 = h43Var.a;
        float f5 = h43Var.d;
        this.rectSize = (((long) Float.floatToRawIntBits(f5 - f2)) & 4294967295L) | (Float.floatToRawIntBits(f3 - f4) << 32);
        this.cachedOutline.setRect(Math.round(f4), Math.round(f2), Math.round(f3), Math.round(f5));
    }

    private final void updateCacheWithRoundRect(x73 x73Var) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (x73Var.e >> 32));
        float f = x73Var.a;
        float f2 = x73Var.b;
        this.rectTopLeft = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        float fB = x73Var.b();
        this.rectSize = (((long) Float.floatToRawIntBits(x73Var.a())) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
        if (yh4.K(x73Var)) {
            this.cachedOutline.setRoundRect(Math.round(f), Math.round(f2), Math.round(x73Var.c), Math.round(x73Var.d), fIntBitsToFloat);
            this.roundedCornerRadius = fIntBitsToFloat;
            return;
        }
        nt2 nt2VarA = this.cachedRrectPath;
        if (nt2VarA == null) {
            nt2VarA = kc.a();
            this.cachedRrectPath = nt2VarA;
        }
        ((ic) nt2VarA).e();
        nt2.b(nt2VarA, x73Var);
        updateCacheWithPath(nt2VarA);
    }

    public final void clipToOutline(y00 y00Var) {
        OutlineResolver outlineResolver;
        nt2 clipPath = getClipPath();
        if (clipPath != null) {
            y00Var.o(clipPath);
            return;
        }
        float f = this.roundedCornerRadius;
        if (f <= 0.0f) {
            y00Var.f(Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), Float.intBitsToFloat((int) (this.rectSize >> 32)) + Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), 1);
            return;
        }
        nt2 nt2VarA = this.tmpPath;
        x73 x73Var = this.tmpRoundRect;
        if (nt2VarA != null) {
            outlineResolver = this;
            if (!outlineResolver.m121xe1031697(x73Var, this.rectTopLeft, this.rectSize, f)) {
            }
            y00Var.o(nt2VarA);
        }
        outlineResolver = this;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (outlineResolver.rectTopLeft >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (outlineResolver.rectTopLeft & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (outlineResolver.rectSize >> 32)) + Float.intBitsToFloat((int) (outlineResolver.rectTopLeft >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (outlineResolver.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (outlineResolver.rectTopLeft & 4294967295L));
        float f2 = outlineResolver.roundedCornerRadius;
        x73 x73VarE = yh4.e(fIntBitsToFloat, fIntBitsToFloat2, (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2))), fIntBitsToFloat3, fIntBitsToFloat4);
        if (nt2VarA == null) {
            nt2VarA = kc.a();
        } else {
            ((ic) nt2VarA).e();
        }
        nt2.b(nt2VarA, x73VarE);
        outlineResolver.tmpRoundRect = x73VarE;
        outlineResolver.tmpPath = nt2VarA;
        y00Var.o(nt2VarA);
    }

    public final Outline getAndroidOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getCacheIsDirty$ui_release() {
        return this.cacheIsDirty;
    }

    public final nt2 getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* JADX INFO: renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m122x13f07e1a(long j) {
        rq2 rq2Var;
        if (this.outlineNeeded && (rq2Var = this.outline) != null) {
            return ShapeContainingUtilKt.isInOutline(rq2Var, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    /* JADX INFO: renamed from: update-S_szKao, reason: not valid java name */
    public final boolean m123x41e70602(rq2 rq2Var, float f, boolean z, float f2, long j) {
        this.cachedOutline.setAlpha(f);
        boolean zN = kr1.n(this.outline, rq2Var);
        boolean z2 = !zN;
        if (!zN) {
            this.outline = rq2Var;
            this.cacheIsDirty = true;
        }
        this.rectSize = j;
        boolean z3 = rq2Var != null && (z || f2 > 0.0f);
        if (this.outlineNeeded != z3) {
            this.outlineNeeded = z3;
            this.cacheIsDirty = true;
        }
        return z2;
    }
}
