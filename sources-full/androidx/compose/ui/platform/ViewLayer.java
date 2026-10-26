package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import defpackage.b10;
import defpackage.e54;
import defpackage.ei2;
import defpackage.gb2;
import defpackage.gg1;
import defpackage.je1;
import defpackage.k43;
import defpackage.ms0;
import defpackage.n63;
import defpackage.ne1;
import defpackage.nt2;
import defpackage.o9;
import defpackage.ob2;
import defpackage.qn0;
import defpackage.wr2;
import defpackage.y00;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends View implements wr2 {
    private static boolean hasRetrievedMethod;
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;
    private static Method updateDisplayListIfDirtyMethod;
    private final b10 canvasHolder;
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private ne1 drawBlock;
    private boolean drawnWithZ;
    private je1 invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;
    private final LayerMatrixCache<View> matrixCache;
    private int mutatedFields;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ne1 getMatrix = ViewLayer$Companion$getMatrix$1.INSTANCE;
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            view.getClass();
            Outline androidOutline = ((ViewLayer) view).outlineResolver.getAndroidOutline();
            androidOutline.getClass();
            outline.set(androidOutline);
        }
    };

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ms0 ms0Var) {
            this();
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.OutlineProvider;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z) {
            ViewLayer.shouldUseDispatchDraw = z;
        }

        public final void updateDisplayList(View view) {
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
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

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, ne1 ne1Var, je1 je1Var) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = ne1Var;
        this.invalidateParentLayer = je1Var;
        this.outlineResolver = new OutlineResolver();
        this.canvasHolder = new b10();
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        int i = e54.c;
        this.mTransformOrigin = e54.b;
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final nt2 getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            return null;
        }
        return this.outlineResolver.getClipPath();
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.getClass();
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.getAndroidOutline() != null ? OutlineProvider : null);
    }

    @Override // defpackage.wr2
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        b10 b10Var = this.canvasHolder;
        o9 o9Var = b10Var.a;
        Canvas canvas2 = o9Var.a;
        o9Var.a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            o9Var.l();
            this.outlineResolver.clipToOutline(o9Var);
            z = true;
        }
        ne1 ne1Var = this.drawBlock;
        if (ne1Var != null) {
            ne1Var.invoke(o9Var, null);
        }
        if (z) {
            o9Var.i();
        }
        b10Var.a.a = canvas2;
        setInvalidated(false);
    }

    @Override // defpackage.wr2
    public void drawLayer(y00 y00Var, gg1 gg1Var) {
        boolean z = getElevation() > 0.0f;
        this.drawnWithZ = z;
        if (z) {
            y00Var.t();
        }
        this.container.drawChild$ui_release(y00Var, this, getDrawingTime());
        if (this.drawnWithZ) {
            y00Var.n();
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
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
        return this.matrixCache.m91x36f3c2da(this);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, defpackage.wr2
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo82x9d378691(float[] fArr) {
        float[] fArrM90x8cb379e6 = this.matrixCache.m90x8cb379e6(this);
        if (fArrM90x8cb379e6 != null) {
            ob2.e(fArr, fArrM90x8cb379e6);
        }
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo83x467a9c69(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.clipToBounds) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.m122x13f07e1a(j);
        }
        return true;
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // defpackage.wr2
    public void mapBounds(ei2 ei2Var, boolean z) {
        LayerMatrixCache<View> layerMatrixCache = this.matrixCache;
        if (z) {
            layerMatrixCache.mapInverse(this, ei2Var);
        } else {
            layerMatrixCache.map(this, ei2Var);
        }
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo84xc59c8b2a(long j, boolean z) {
        LayerMatrixCache<View> layerMatrixCache = this.matrixCache;
        return z ? layerMatrixCache.m93xb52b8e06(this, j) : layerMatrixCache.m92x65d63d2e(this, j);
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo85x3458c3d4(long j) {
        int i = (int) (j >> 32);
        if (i != getLeft()) {
            offsetLeftAndRight(i - getLeft());
            this.matrixCache.invalidate();
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 != getTop()) {
            offsetTopAndBottom(i2 - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo86x27e04be2(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        setPivotX(e54.b(this.mTransformOrigin) * i);
        setPivotY(e54.c(this.mTransformOrigin) * i2);
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        resetClipBounds();
        this.matrixCache.invalidate();
    }

    @Override // defpackage.wr2
    public void reuseLayer(ne1 ne1Var, je1 je1Var) {
        this.container.addView(this);
        this.matrixCache.reset();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        int i = e54.c;
        this.mTransformOrigin = e54.b;
        this.drawBlock = ne1Var;
        this.invalidateParentLayer = je1Var;
        setInvalidated(false);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.wr2
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo87x63595be1(float[] fArr) {
        ob2.e(fArr, this.matrixCache.m91x36f3c2da(this));
    }

    @Override // defpackage.wr2
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        Companion.updateDisplayList(this);
        setInvalidated(false);
    }

    @Override // defpackage.wr2
    public void updateLayerProperties(n63 n63Var) {
        je1 je1Var;
        int i = n63Var.c | this.mutatedFields;
        if ((i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
            long j = n63Var.r;
            this.mTransformOrigin = j;
            setPivotX(e54.b(j) * getWidth());
            setPivotY(e54.c(this.mTransformOrigin) * getHeight());
        }
        if ((i & 1) != 0) {
            setScaleX(n63Var.d);
        }
        if ((i & 2) != 0) {
            setScaleY(n63Var.h);
        }
        if ((i & 4) != 0) {
            setAlpha(n63Var.l);
        }
        if ((i & 8) != 0) {
            setTranslationX(0.0f);
        }
        if ((i & 16) != 0) {
            setTranslationY(0.0f);
        }
        if ((i & 32) != 0) {
            setElevation(n63Var.m);
        }
        if ((i & 1024) != 0) {
            setRotation(n63Var.p);
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
            setRotationX(0.0f);
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            setRotationY(0.0f);
        }
        if ((i & 2048) != 0) {
            setCameraDistancePx(n63Var.q);
        }
        boolean z = false;
        boolean z2 = getManualClipPath() != null;
        boolean z3 = n63Var.t;
        qn0 qn0Var = k43.a;
        boolean z4 = z3 && n63Var.s != qn0Var;
        if ((i & 24576) != 0) {
            this.clipToBounds = z3 && n63Var.s == qn0Var;
            resetClipBounds();
            setClipToOutline(z4);
        }
        boolean zM123x41e70602 = this.outlineResolver.m123x41e70602(n63Var.y, n63Var.l, z4, n63Var.m, n63Var.v);
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            updateOutlineResolver();
        }
        boolean z5 = getManualClipPath() != null;
        if (z2 != z5 || (z5 && zM123x41e70602)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (je1Var = this.invalidateParentLayer) != null) {
            je1Var.invoke();
        }
        if ((i & 7963) != 0) {
            this.matrixCache.invalidate();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if ((i & 64) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, gb2.X(n63Var.n));
            }
            if ((i & Uuid.SIZE_BITS) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, gb2.X(n63Var.o));
            }
        }
        if (i2 >= 31 && (131072 & i) != 0) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, null);
        }
        if ((i & 32768) != 0) {
            int i3 = n63Var.u;
            if (i3 == 1) {
                setLayerType(2, null);
            } else {
                if (i3 == 2) {
                    setLayerType(0, null);
                } else {
                    setLayerType(0, null);
                }
                this.mHasOverlappingRendering = z;
            }
            z = true;
            this.mHasOverlappingRendering = z;
        }
        this.mutatedFields = n63Var.c;
    }
}
