package androidx.compose.ui.platform;

import android.graphics.Matrix;
import defpackage.ei2;
import defpackage.ne1;
import defpackage.ob2;
import defpackage.y64;
import defpackage.yo4;

/* JADX INFO: loaded from: classes.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;
    private Matrix androidMatrixCache;
    private final ne1 getMatrix;
    private boolean isDirty;
    private boolean isInverseDirty;
    private float[] matrixCache = ob2.a();
    private float[] inverseMatrixCache = ob2.a();
    private boolean isInverseValid = true;
    private boolean isIdentity = true;

    public LayerMatrixCache(ne1 ne1Var) {
        this.getMatrix = ne1Var;
    }

    /* JADX INFO: renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m90x8cb379e6(T t) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m88xf2a295f8(m91x36f3c2da(t), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    /* JADX INFO: renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m91x36f3c2da(T t) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t, matrix);
        yo4.U(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = y64.F(fArr);
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final void map(T t, ei2 ei2Var) {
        float[] fArrM91x36f3c2da = m91x36f3c2da(t);
        if (this.isIdentity) {
            return;
        }
        ob2.c(fArrM91x36f3c2da, ei2Var);
    }

    /* JADX INFO: renamed from: map-R5De75A, reason: not valid java name */
    public final long m92x65d63d2e(T t, long j) {
        return !this.isIdentity ? ob2.b(j, m91x36f3c2da(t)) : j;
    }

    public final void mapInverse(T t, ei2 ei2Var) {
        float[] fArrM90x8cb379e6 = m90x8cb379e6(t);
        if (fArrM90x8cb379e6 != null) {
            if (this.isIdentity) {
                return;
            }
            ob2.c(fArrM90x8cb379e6, ei2Var);
        } else {
            ei2Var.a = 0.0f;
            ei2Var.b = 0.0f;
            ei2Var.c = 0.0f;
            ei2Var.d = 0.0f;
        }
    }

    /* JADX INFO: renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m93xb52b8e06(T t, long j) {
        float[] fArrM90x8cb379e6 = m90x8cb379e6(t);
        if (fArrM90x8cb379e6 == null) {
            return 9187343241974906880L;
        }
        return !this.isIdentity ? ob2.b(j, fArrM90x8cb379e6) : j;
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        ob2.d(this.matrixCache);
        ob2.d(this.inverseMatrixCache);
    }
}
