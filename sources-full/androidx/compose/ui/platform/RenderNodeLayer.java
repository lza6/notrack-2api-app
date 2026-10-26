package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import defpackage.b10;
import defpackage.bc;
import defpackage.e54;
import defpackage.ei2;
import defpackage.gb2;
import defpackage.gg1;
import defpackage.je1;
import defpackage.k43;
import defpackage.ks2;
import defpackage.ms0;
import defpackage.n63;
import defpackage.ne1;
import defpackage.nt2;
import defpackage.ob2;
import defpackage.p9;
import defpackage.qn0;
import defpackage.vl0;
import defpackage.wr2;
import defpackage.y00;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class RenderNodeLayer implements wr2 {
    private ne1 drawBlock;
    private boolean drawnWithZ;
    private je1 invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private ks2 softwareLayerPaint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ne1 getMatrix = RenderNodeLayer$Companion$getMatrix$1.INSTANCE;
    private final OutlineResolver outlineResolver = new OutlineResolver();
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);
    private final b10 canvasHolder = new b10();
    private long transformOrigin = e54.b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ms0 ms0Var) {
            this();
        }
    }

    public static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        public static final long getUniqueDrawingId(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, ne1 ne1Var, je1 je1Var) {
        this.ownerView = androidComposeView;
        this.drawBlock = ne1Var;
        this.invalidateParentLayer = je1Var;
        DeviceRenderNode renderNodeApi29 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29(androidComposeView) : new RenderNodeApi23(androidComposeView);
        renderNodeApi29.setHasOverlappingRendering(true);
        renderNodeApi29.setClipToBounds(false);
        this.renderNode = renderNodeApi29;
    }

    private final void clipRenderNode(y00 y00Var) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(y00Var);
        }
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

    @Override // defpackage.wr2
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // defpackage.wr2
    public void drawLayer(y00 y00Var, gg1 gg1Var) {
        Canvas canvasA = p9.a(y00Var);
        if (canvasA.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z = this.renderNode.getElevation() > 0.0f;
            this.drawnWithZ = z;
            if (z) {
                y00Var.t();
            }
            this.renderNode.drawInto(canvasA);
            if (this.drawnWithZ) {
                y00Var.n();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            ks2 ks2VarF = this.softwareLayerPaint;
            if (ks2VarF == null) {
                ks2VarF = vl0.f();
                this.softwareLayerPaint = ks2VarF;
            }
            bc bcVar = (bc) ks2VarF;
            bcVar.d(this.renderNode.getAlpha());
            canvasA.saveLayer(left, top, right, bottom, (Paint) bcVar.d);
        } else {
            y00Var.l();
        }
        y00Var.g(left, top);
        y00Var.q(this.matrixCache.m91x36f3c2da(this.renderNode));
        clipRenderNode(y00Var);
        ne1 ne1Var = this.drawBlock;
        if (ne1Var != null) {
            ne1Var.invoke(y00Var, null);
        }
        y00Var.i();
        setDirty(false);
    }

    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo81x1f96a075() {
        return this.matrixCache.m91x36f3c2da(this.renderNode);
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
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo82x9d378691(float[] fArr) {
        float[] fArrM90x8cb379e6 = this.matrixCache.m90x8cb379e6(this.renderNode);
        if (fArrM90x8cb379e6 != null) {
            ob2.e(fArr, fArrM90x8cb379e6);
        }
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo83x467a9c69(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) this.renderNode.getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m122x13f07e1a(j);
        }
        return true;
    }

    @Override // defpackage.wr2
    public void mapBounds(ei2 ei2Var, boolean z) {
        LayerMatrixCache<DeviceRenderNode> layerMatrixCache = this.matrixCache;
        if (z) {
            layerMatrixCache.mapInverse(this.renderNode, ei2Var);
        } else {
            layerMatrixCache.map(this.renderNode, ei2Var);
        }
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo84xc59c8b2a(long j, boolean z) {
        LayerMatrixCache<DeviceRenderNode> layerMatrixCache = this.matrixCache;
        return z ? layerMatrixCache.m93xb52b8e06(this.renderNode, j) : layerMatrixCache.m92x65d63d2e(this.renderNode, j);
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo85x3458c3d4(long j) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (left == i && top == i2) {
            return;
        }
        if (left != i) {
            this.renderNode.offsetLeftAndRight(i - left);
        }
        if (top != i2) {
            this.renderNode.offsetTopAndBottom(i2 - top);
        }
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo86x27e04be2(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.renderNode.setPivotX(e54.b(this.transformOrigin) * i);
        this.renderNode.setPivotY(e54.c(this.transformOrigin) * i2);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + i, this.renderNode.getTop() + i2)) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // defpackage.wr2
    public void reuseLayer(ne1 ne1Var, je1 je1Var) {
        this.matrixCache.reset();
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        int i = e54.c;
        this.transformOrigin = e54.b;
        this.drawBlock = ne1Var;
        this.invalidateParentLayer = je1Var;
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo87x63595be1(float[] fArr) {
        ob2.e(fArr, this.matrixCache.m91x36f3c2da(this.renderNode));
    }

    @Override // defpackage.wr2
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            nt2 clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            ne1 ne1Var = this.drawBlock;
            if (ne1Var != null) {
                this.renderNode.record(this.canvasHolder, clipPath, new RenderNodeLayer$updateDisplayList$1$1(ne1Var));
            }
            setDirty(false);
        }
    }

    @Override // defpackage.wr2
    public void updateLayerProperties(n63 n63Var) {
        je1 je1Var;
        int i = n63Var.c | this.mutatedFields;
        int i2 = i & ConstantsKt.DEFAULT_BLOCK_SIZE;
        if (i2 != 0) {
            this.transformOrigin = n63Var.r;
        }
        boolean z = false;
        boolean z2 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        if ((i & 1) != 0) {
            this.renderNode.setScaleX(n63Var.d);
        }
        if ((i & 2) != 0) {
            this.renderNode.setScaleY(n63Var.h);
        }
        if ((i & 4) != 0) {
            this.renderNode.setAlpha(n63Var.l);
        }
        if ((i & 8) != 0) {
            this.renderNode.setTranslationX(0.0f);
        }
        if ((i & 16) != 0) {
            this.renderNode.setTranslationY(0.0f);
        }
        if ((i & 32) != 0) {
            this.renderNode.setElevation(n63Var.m);
        }
        if ((i & 64) != 0) {
            this.renderNode.setAmbientShadowColor(gb2.X(n63Var.n));
        }
        if ((i & Uuid.SIZE_BITS) != 0) {
            this.renderNode.setSpotShadowColor(gb2.X(n63Var.o));
        }
        if ((i & 1024) != 0) {
            this.renderNode.setRotationZ(n63Var.p);
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            this.renderNode.setRotationX(0.0f);
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            this.renderNode.setRotationY(0.0f);
        }
        if ((i & 2048) != 0) {
            this.renderNode.setCameraDistance(n63Var.q);
        }
        if (i2 != 0) {
            this.renderNode.setPivotX(e54.b(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(e54.c(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z3 = n63Var.t;
        qn0 qn0Var = k43.a;
        boolean z4 = z3 && n63Var.s != qn0Var;
        if ((i & 24576) != 0) {
            this.renderNode.setClipToOutline(z4);
            this.renderNode.setClipToBounds(n63Var.t && n63Var.s == qn0Var);
        }
        if ((131072 & i) != 0) {
            this.renderNode.setRenderEffect(null);
        }
        if ((32768 & i) != 0) {
            this.renderNode.mo65x3b703444(n63Var.u);
        }
        boolean zM123x41e70602 = this.outlineResolver.m123x41e70602(n63Var.y, n63Var.l, z4, n63Var.m, n63Var.v);
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
        }
        if (z4 && !this.outlineResolver.getOutlineClipSupported()) {
            z = true;
        }
        if (z2 != z || (z && zM123x41e70602)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (je1Var = this.invalidateParentLayer) != null) {
            je1Var.invoke();
        }
        if ((i & 7963) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = n63Var.c;
    }
}
