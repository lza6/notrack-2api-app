package androidx.compose.ui.platform;

import android.os.Build;
import defpackage.a10;
import defpackage.ci4;
import defpackage.dx1;
import defpackage.e54;
import defpackage.eg1;
import defpackage.ei2;
import defpackage.fq2;
import defpackage.gg1;
import defpackage.h43;
import defpackage.ic;
import defpackage.iq1;
import defpackage.je1;
import defpackage.kr1;
import defpackage.ks2;
import defpackage.le1;
import defpackage.ln2;
import defpackage.n63;
import defpackage.ne1;
import defpackage.nt2;
import defpackage.ob2;
import defpackage.oq2;
import defpackage.po1;
import defpackage.pq2;
import defpackage.qq1;
import defpackage.qq2;
import defpackage.re0;
import defpackage.rq2;
import defpackage.sf3;
import defpackage.u41;
import defpackage.vl0;
import defpackage.wr2;
import defpackage.wu0;
import defpackage.x73;
import defpackage.y00;
import defpackage.y64;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayerOwnerLayer implements wr2 {
    public static final int $stable = 8;
    private final eg1 context;
    private ne1 drawBlock;
    private boolean drawnWithEnabledZ;
    private gg1 graphicsLayer;
    private je1 invalidateParentLayer;
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isInverseMatrixDirty;
    private boolean isMatrixDirty;
    private int mutatedFields;
    private rq2 outline;
    private final AndroidComposeView ownerView;
    private ks2 softwareLayerPaint;
    private long size = 9223372034707292159L;
    private final float[] matrixCache = ob2.a();
    private wu0 density = sf3.a();
    private dx1 layoutDirection = dx1.c;
    private final a10 scope = new a10();
    private long transformOrigin = e54.b;
    private boolean isIdentity = true;
    private final le1 recordLambda = new GraphicsLayerOwnerLayer$recordLambda$1(this);

    public GraphicsLayerOwnerLayer(gg1 gg1Var, eg1 eg1Var, AndroidComposeView androidComposeView, ne1 ne1Var, je1 je1Var) {
        this.graphicsLayer = gg1Var;
        this.context = eg1Var;
        this.ownerView = androidComposeView;
        this.drawBlock = ne1Var;
        this.invalidateParentLayer = je1Var;
    }

    /* JADX INFO: renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m79x1a88c081() {
        float[] fArrA = this.inverseMatrixCache;
        if (fArrA == null) {
            fArrA = ob2.a();
            this.inverseMatrixCache = fArrA;
        }
        if (this.isInverseMatrixDirty) {
            this.isInverseMatrixDirty = false;
            float[] fArrM80x8ab76f38 = m80x8ab76f38();
            if (this.isIdentity) {
                return fArrM80x8ab76f38;
            }
            if (!InvertMatrixKt.m88xf2a295f8(fArrM80x8ab76f38, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    /* JADX INFO: renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m80x8ab76f38() {
        updateMatrix();
        return this.matrixCache;
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    private final void updateMatrix() {
        if (this.isMatrixDirty) {
            gg1 gg1Var = this.graphicsLayer;
            long jI = gg1Var.v;
            androidx.compose.ui.graphics.layer.a aVar = gg1Var.a;
            if ((9223372034707292159L & jI) == 9205357640488583168L) {
                jI = vl0.I(y64.W(this.size));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
            float[] fArr = this.matrixCache;
            float translationX = aVar.getTranslationX();
            float translationY = aVar.getTranslationY();
            float rotationX = aVar.getRotationX();
            float rotationY = aVar.getRotationY();
            float rotationZ = aVar.getRotationZ();
            float scaleX = aVar.getScaleX();
            float scaleY = aVar.getScaleY();
            double d = ((double) rotationX) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (translationY * fCos) - (1.0f * fSin);
            float f3 = (1.0f * fCos) + (translationY * fSin);
            double d2 = ((double) rotationY) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (translationX * fCos2);
            float f10 = (f3 * fCos2) + ((-translationX) * fSin2);
            double d3 = ((double) rotationZ) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * scaleX;
            float f16 = f14 * scaleX;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * scaleX;
            float f18 = f12 * scaleY;
            float f19 = fCos * fCos3 * scaleY;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * scaleY;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.isMatrixDirty = false;
            this.isIdentity = y64.F(this.matrixCache);
        }
    }

    private final void updateOutline() {
        je1 je1Var;
        rq2 rq2Var = this.outline;
        if (rq2Var == null) {
            return;
        }
        gg1 gg1Var = this.graphicsLayer;
        if (rq2Var instanceof pq2) {
            h43 h43Var = ((pq2) rq2Var).a;
            float f = h43Var.a;
            float f2 = h43Var.b;
            gg1Var.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(h43Var.c - f)) << 32) | (((long) Float.floatToRawIntBits(h43Var.d - f2)) & 4294967295L), 0.0f);
        } else if (rq2Var instanceof oq2) {
            nt2 nt2Var = ((oq2) rq2Var).a;
            gg1Var.k = null;
            gg1Var.i = 9205357640488583168L;
            gg1Var.h = 0L;
            gg1Var.j = 0.0f;
            gg1Var.g = true;
            gg1Var.n = false;
            gg1Var.l = nt2Var;
            gg1Var.a();
        } else if (rq2Var instanceof qq2) {
            qq2 qq2Var = (qq2) rq2Var;
            ic icVar = qq2Var.b;
            if (icVar != null) {
                gg1Var.k = null;
                gg1Var.i = 9205357640488583168L;
                gg1Var.h = 0L;
                gg1Var.j = 0.0f;
                gg1Var.g = true;
                gg1Var.n = false;
                gg1Var.l = icVar;
                gg1Var.a();
            } else {
                x73 x73Var = qq2Var.a;
                float f3 = x73Var.a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x73Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32);
                float fB = x73Var.b();
                gg1Var.e(jFloatToRawIntBits, (4294967295L & ((long) Float.floatToRawIntBits(x73Var.a()))) | (((long) Float.floatToRawIntBits(fB)) << 32), Float.intBitsToFloat((int) (x73Var.h >> 32)));
            }
        }
        if (!(rq2Var instanceof oq2) || Build.VERSION.SDK_INT >= 33 || (je1Var = this.invalidateParentLayer) == null) {
            return;
        }
        je1Var.invoke();
    }

    @Override // defpackage.wr2
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        eg1 eg1Var = this.context;
        if (eg1Var != null) {
            eg1Var.a(this.graphicsLayer);
            this.ownerView.recycle$ui_release(this);
        }
    }

    @Override // defpackage.wr2
    public void drawLayer(y00 y00Var, gg1 gg1Var) {
        updateDisplayList();
        this.drawnWithEnabledZ = this.graphicsLayer.a.s() > 0.0f;
        ci4 ci4Var = this.scope.d;
        ci4Var.J(y00Var);
        ci4Var.h = gg1Var;
        vl0.C(this.scope, this.graphicsLayer);
    }

    public long getLayerId() {
        return this.graphicsLayer.a.b();
    }

    public long getOwnerViewId() {
        return this.graphicsLayer.a.p();
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo81x1f96a075() {
        return m80x8ab76f38();
    }

    @Override // defpackage.wr2
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    public void mo82x9d378691(float[] fArr) {
        float[] fArrM79x1a88c081 = m79x1a88c081();
        if (fArrM79x1a88c081 != null) {
            ob2.e(fArr, fArrM79x1a88c081);
        }
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    public boolean mo83x467a9c69(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        gg1 gg1Var = this.graphicsLayer;
        if (gg1Var.w) {
            return ShapeContainingUtilKt.isInOutline$default(gg1Var.d(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // defpackage.wr2
    public void mapBounds(ei2 ei2Var, boolean z) {
        float[] fArrM79x1a88c081 = z ? m79x1a88c081() : m80x8ab76f38();
        if (this.isIdentity) {
            return;
        }
        if (fArrM79x1a88c081 != null) {
            ob2.c(fArrM79x1a88c081, ei2Var);
            return;
        }
        ei2Var.a = 0.0f;
        ei2Var.b = 0.0f;
        ei2Var.c = 0.0f;
        ei2Var.d = 0.0f;
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: mapOffset-8S9VItk, reason: not valid java name */
    public long mo84xc59c8b2a(long j, boolean z) {
        float[] fArrM80x8ab76f38;
        if (z) {
            fArrM80x8ab76f38 = m79x1a88c081();
            if (fArrM80x8ab76f38 == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM80x8ab76f38 = m80x8ab76f38();
        }
        return this.isIdentity ? j : ob2.b(j, fArrM80x8ab76f38);
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: move--gyyYBs, reason: not valid java name */
    public void mo85x3458c3d4(long j) {
        gg1 gg1Var = this.graphicsLayer;
        if (!iq1.a(gg1Var.t, j)) {
            gg1Var.t = j;
            gg1Var.a.r((int) (j >> 32), (int) (j & 4294967295L), gg1Var.u);
        }
        triggerRepaint();
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: resize-ozmzZPI, reason: not valid java name */
    public void mo86x27e04be2(long j) {
        if (qq1.a(j, this.size)) {
            return;
        }
        this.size = j;
        invalidate();
    }

    @Override // defpackage.wr2
    public void reuseLayer(ne1 ne1Var, je1 je1Var) {
        eg1 eg1Var = this.context;
        if (eg1Var == null) {
            throw fq2.i("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.graphicsLayer.s) {
            po1.a("layer should have been released before reuse");
        }
        this.graphicsLayer = eg1Var.b();
        this.isDestroyed = false;
        this.drawBlock = ne1Var;
        this.invalidateParentLayer = je1Var;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        ob2.d(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            ob2.d(fArr);
        }
        this.transformOrigin = e54.b;
        this.drawnWithEnabledZ = false;
        this.size = 9223372034707292159L;
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo87x63595be1(float[] fArr) {
        ob2.e(fArr, m80x8ab76f38());
    }

    @Override // defpackage.wr2
    public void updateDisplayList() {
        if (this.isDirty) {
            if (!e54.a(this.transformOrigin, e54.b) && !qq1.a(this.graphicsLayer.u, this.size)) {
                gg1 gg1Var = this.graphicsLayer;
                float fB = e54.b(this.transformOrigin) * ((int) (this.size >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(e54.c(this.transformOrigin) * ((int) (this.size & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!ln2.c(gg1Var.v, jFloatToRawIntBits)) {
                    gg1Var.v = jFloatToRawIntBits;
                    gg1Var.a.u(jFloatToRawIntBits);
                }
            }
            gg1 gg1Var2 = this.graphicsLayer;
            wu0 wu0Var = this.density;
            dx1 dx1Var = this.layoutDirection;
            long j = this.size;
            le1 le1Var = this.recordLambda;
            long j2 = gg1Var2.u;
            androidx.compose.ui.graphics.layer.a aVar = gg1Var2.a;
            if (!qq1.a(j2, j)) {
                gg1Var2.u = j;
                long j3 = gg1Var2.t;
                aVar.r((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (gg1Var2.i == 9205357640488583168L) {
                    gg1Var2.g = true;
                    gg1Var2.a();
                }
            }
            gg1Var2.b = wu0Var;
            gg1Var2.c = dx1Var;
            gg1Var2.d = le1Var;
            aVar.m(wu0Var, dx1Var, gg1Var2, gg1Var2.e);
            setDirty(false);
        }
    }

    @Override // defpackage.wr2
    public void updateLayerProperties(n63 n63Var) {
        int i;
        je1 je1Var;
        int i2 = n63Var.c | this.mutatedFields;
        this.layoutDirection = n63Var.x;
        this.density = n63Var.w;
        int i3 = i2 & ConstantsKt.DEFAULT_BLOCK_SIZE;
        if (i3 != 0) {
            this.transformOrigin = n63Var.r;
        }
        if ((i2 & 1) != 0) {
            gg1 gg1Var = this.graphicsLayer;
            float f = n63Var.d;
            androidx.compose.ui.graphics.layer.a aVar = gg1Var.a;
            if (aVar.getScaleX() != f) {
                aVar.setScaleX(f);
            }
        }
        if ((i2 & 2) != 0) {
            gg1 gg1Var2 = this.graphicsLayer;
            float f2 = n63Var.h;
            androidx.compose.ui.graphics.layer.a aVar2 = gg1Var2.a;
            if (aVar2.getScaleY() != f2) {
                aVar2.setScaleY(f2);
            }
        }
        if ((i2 & 4) != 0) {
            gg1 gg1Var3 = this.graphicsLayer;
            float f3 = n63Var.l;
            androidx.compose.ui.graphics.layer.a aVar3 = gg1Var3.a;
            if (aVar3.getAlpha() != f3) {
                aVar3.setAlpha(f3);
            }
        }
        if ((i2 & 8) != 0) {
            androidx.compose.ui.graphics.layer.a aVar4 = this.graphicsLayer.a;
            if (aVar4.getTranslationX() != 0.0f) {
                aVar4.i();
            }
        }
        if ((i2 & 16) != 0) {
            androidx.compose.ui.graphics.layer.a aVar5 = this.graphicsLayer.a;
            if (aVar5.getTranslationY() != 0.0f) {
                aVar5.d();
            }
        }
        boolean z = true;
        if ((i2 & 32) != 0) {
            gg1 gg1Var4 = this.graphicsLayer;
            float f4 = n63Var.m;
            androidx.compose.ui.graphics.layer.a aVar6 = gg1Var4.a;
            if (aVar6.s() != f4) {
                aVar6.c(f4);
                gg1Var4.g = true;
                gg1Var4.a();
            }
            if (n63Var.m > 0.0f && !this.drawnWithEnabledZ && (je1Var = this.invalidateParentLayer) != null) {
                je1Var.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            gg1 gg1Var5 = this.graphicsLayer;
            long j = n63Var.n;
            androidx.compose.ui.graphics.layer.a aVar7 = gg1Var5.a;
            if (!re0.c(j, aVar7.v())) {
                aVar7.g(j);
            }
        }
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            gg1 gg1Var6 = this.graphicsLayer;
            long j2 = n63Var.o;
            androidx.compose.ui.graphics.layer.a aVar8 = gg1Var6.a;
            if (!re0.c(j2, aVar8.f())) {
                aVar8.o(j2);
            }
        }
        if ((i2 & 1024) != 0) {
            gg1 gg1Var7 = this.graphicsLayer;
            float f5 = n63Var.p;
            androidx.compose.ui.graphics.layer.a aVar9 = gg1Var7.a;
            if (aVar9.getRotationZ() != f5) {
                aVar9.setRotationZ(f5);
            }
        }
        if ((i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            androidx.compose.ui.graphics.layer.a aVar10 = this.graphicsLayer.a;
            if (aVar10.getRotationX() != 0.0f) {
                aVar10.a();
            }
        }
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            androidx.compose.ui.graphics.layer.a aVar11 = this.graphicsLayer.a;
            if (aVar11.getRotationY() != 0.0f) {
                aVar11.e();
            }
        }
        if ((i2 & 2048) != 0) {
            gg1 gg1Var8 = this.graphicsLayer;
            float f6 = n63Var.q;
            androidx.compose.ui.graphics.layer.a aVar12 = gg1Var8.a;
            if (aVar12.getCameraDistance() != f6) {
                aVar12.setCameraDistance(f6);
            }
        }
        if (i3 != 0) {
            boolean zA = e54.a(this.transformOrigin, e54.b);
            gg1 gg1Var9 = this.graphicsLayer;
            if (!zA) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(e54.b(this.transformOrigin) * ((int) (this.size >> 32)))) << 32) | (((long) Float.floatToRawIntBits(e54.c(this.transformOrigin) * ((int) (this.size & 4294967295L)))) & 4294967295L);
                if (!ln2.c(gg1Var9.v, jFloatToRawIntBits)) {
                    gg1Var9.v = jFloatToRawIntBits;
                    gg1Var9.a.u(jFloatToRawIntBits);
                }
            } else if (!ln2.c(gg1Var9.v, 9205357640488583168L)) {
                gg1Var9.v = 9205357640488583168L;
                gg1Var9.a.u(9205357640488583168L);
            }
        }
        if ((i2 & 16384) != 0) {
            gg1 gg1Var10 = this.graphicsLayer;
            boolean z2 = n63Var.t;
            if (gg1Var10.w != z2) {
                gg1Var10.w = z2;
                gg1Var10.g = true;
                gg1Var10.a();
            }
        }
        if ((131072 & i2) != 0) {
            androidx.compose.ui.graphics.layer.a aVar13 = this.graphicsLayer.a;
        }
        if ((32768 & i2) != 0) {
            gg1 gg1Var11 = this.graphicsLayer;
            int i4 = n63Var.u;
            if (i4 == 0) {
                i = 0;
            } else if (i4 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i4 != 2) {
                    u41.r("Not supported composition strategy");
                    return;
                }
            }
            androidx.compose.ui.graphics.layer.a aVar14 = gg1Var11.a;
            if (aVar14.l() != i) {
                aVar14.n(i);
            }
        }
        if ((i2 & 7963) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (kr1.n(this.outline, n63Var.y)) {
            z = false;
        } else {
            this.outline = n63Var.y;
            updateOutline();
        }
        this.mutatedFields = n63Var.c;
        if (i2 != 0 || z) {
            triggerRepaint();
        }
    }
}
