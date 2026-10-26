package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import defpackage.ad4;
import defpackage.af3;
import defpackage.ag2;
import defpackage.as2;
import defpackage.av1;
import defpackage.ay0;
import defpackage.b10;
import defpackage.ba;
import defpackage.ba3;
import defpackage.bi2;
import defpackage.bp;
import defpackage.bv0;
import defpackage.c1;
import defpackage.cf3;
import defpackage.cl3;
import defpackage.cp;
import defpackage.cv0;
import defpackage.cx2;
import defpackage.d31;
import defpackage.d4;
import defpackage.db1;
import defpackage.df0;
import defpackage.dh2;
import defpackage.dx1;
import defpackage.e1;
import defpackage.e43;
import defpackage.eg1;
import defpackage.eh2;
import defpackage.en2;
import defpackage.es3;
import defpackage.et0;
import defpackage.ey3;
import defpackage.f4;
import defpackage.fa;
import defpackage.fa1;
import defpackage.fi1;
import defpackage.fi2;
import defpackage.fp1;
import defpackage.fq2;
import defpackage.ft2;
import defpackage.fx2;
import defpackage.g13;
import defpackage.g32;
import defpackage.gb2;
import defpackage.gb3;
import defpackage.gg1;
import defpackage.gn3;
import defpackage.gp1;
import defpackage.gq0;
import defpackage.gx2;
import defpackage.h43;
import defpackage.hb;
import defpackage.hb3;
import defpackage.hg;
import defpackage.hg3;
import defpackage.hp1;
import defpackage.hq0;
import defpackage.hq1;
import defpackage.hx2;
import defpackage.ib1;
import defpackage.ib3;
import defpackage.im2;
import defpackage.in1;
import defpackage.ip1;
import defpackage.iq1;
import defpackage.iw2;
import defpackage.j43;
import defpackage.j82;
import defpackage.j9;
import defpackage.jb;
import defpackage.jb3;
import defpackage.je1;
import defpackage.jr1;
import defpackage.ju0;
import defpackage.jz3;
import defpackage.k62;
import defpackage.kb1;
import defpackage.kr1;
import defpackage.l9;
import defpackage.le1;
import defpackage.lh1;
import defpackage.ly3;
import defpackage.m3;
import defpackage.m51;
import defpackage.m9;
import defpackage.me;
import defpackage.mi2;
import defpackage.mq1;
import defpackage.ms0;
import defpackage.mv2;
import defpackage.n32;
import defpackage.n82;
import defpackage.ne1;
import defpackage.nl3;
import defpackage.ny3;
import defpackage.o04;
import defpackage.o9;
import defpackage.ob2;
import defpackage.of2;
import defpackage.oi2;
import defpackage.ol3;
import defpackage.ov2;
import defpackage.p1;
import defpackage.p23;
import defpackage.p32;
import defpackage.pb2;
import defpackage.po1;
import defpackage.q43;
import defpackage.qa1;
import defpackage.qb;
import defpackage.qf2;
import defpackage.qq1;
import defpackage.r73;
import defpackage.rb2;
import defpackage.s73;
import defpackage.s82;
import defpackage.s9;
import defpackage.sb2;
import defpackage.sk3;
import defpackage.so0;
import defpackage.sq3;
import defpackage.sx1;
import defpackage.sz0;
import defpackage.t73;
import defpackage.te3;
import defpackage.tf2;
import defpackage.th2;
import defpackage.tj0;
import defpackage.tu1;
import defpackage.u41;
import defpackage.u93;
import defpackage.ub2;
import defpackage.ud4;
import defpackage.ue3;
import defpackage.um0;
import defpackage.uo0;
import defpackage.ux1;
import defpackage.v73;
import defpackage.va1;
import defpackage.vd4;
import defpackage.vh2;
import defpackage.vk3;
import defpackage.vr0;
import defpackage.vx1;
import defpackage.w73;
import defpackage.w84;
import defpackage.wl2;
import defpackage.wo;
import defpackage.wr2;
import defpackage.wu0;
import defpackage.wv2;
import defpackage.ww1;
import defpackage.wx1;
import defpackage.xo1;
import defpackage.xp0;
import defpackage.xp1;
import defpackage.xr0;
import defpackage.xr2;
import defpackage.xu0;
import defpackage.y11;
import defpackage.y64;
import defpackage.y9;
import defpackage.ya;
import defpackage.yd;
import defpackage.yh4;
import defpackage.yo;
import defpackage.yo4;
import defpackage.yr2;
import defpackage.yu0;
import defpackage.yx1;
import defpackage.z0;
import defpackage.zc4;
import defpackage.ze3;
import defpackage.zj0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements yr2, ViewRootForTest, pb2, et0 {
    private static Method getBooleanMethod;
    private static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final j9 _autofill;
    private final m9 _autofillManager;
    private final ip1 _inputModeManager;
    private final mi2 _viewTreeOwners$delegate;
    private final LazyWindowInfo _windowInfo;
    private final AndroidAccessibilityManager accessibilityManager;
    private final cp autofillTree;
    private final AndroidComposeView$bringIntoViewNode$1 bringIntoViewNode;
    private final b10 canvasHolder;
    private final AndroidClipboard clipboard;
    private final AndroidClipboardManager clipboardManager;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private le1 configurationChangeObserver;
    private fa contentCaptureManager;
    private xp0 coroutineContext;
    private int currentFontWeightAdjustment;
    private final mi2 density$delegate;
    private final List<wr2> dirtyLayers;
    private final ya dragAndDropManager;
    private final vh2 endApplyChangesListeners;
    private final qa1 focusOwner;
    private final mi2 fontFamilyResolver$delegate;
    private final ib1 fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final eg1 graphicsContext;
    private final lh1 hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;
    private final c keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<wr2> layerCache;
    private final mi2 layoutDirection$delegate;
    private final dh2 layoutNodes;
    private final ny3 legacyTextInputServiceAndroid;
    private final CalculateMatrixToWindow matrixToWindow;
    private final sb2 measureAndLayoutDelegate;
    private final qf2 modifierLocalManager;
    private final ag2 motionEventAdapter;
    private boolean observationClearRequested;
    private um0 onMeasureConstraints;
    private le1 onViewTreeOwnersAvailable;
    private final cx2 pointerIconService;
    private final gx2 pointerInputEventProcessor;
    private List<wr2> postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private boolean processingRequestFocusForNextNonChildView;
    private final j43 rectManager;
    private long relayoutTime;
    private final je1 resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final ux1 root;
    private final r73 rootForTest;
    private final d31 rootSemanticsNode;
    private final c rotaryInputModifier;
    private final ib3 scrollCapture;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final EmptySemanticsElement semanticsModifier;
    private final af3 semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private int sensitiveComponentCount;
    private final wx1 sharedDrawScope;
    private boolean showLayoutBounds;
    private final as2 snapshotObserver;
    private final SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;
    private final ly3 textInputService;
    private final AtomicReference textInputSessionMutex;
    private final TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final gn3 viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ms0 ms0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final n32 lifecycleOwner;
        private final u93 savedStateRegistryOwner;

        public ViewTreeOwners(n32 n32Var, u93 u93Var) {
            this.lifecycleOwner = n32Var;
            this.savedStateRegistryOwner = u93Var;
        }

        public final n32 getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final u93 getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$dispatchKeyEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00021 extends ww1 implements je1 {
        final /* synthetic */ KeyEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00021(KeyEvent keyEvent) {
            super(0);
            this.$event = keyEvent;
        }

        @Override // defpackage.je1
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.$event));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$handleRotaryEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00031 extends ww1 implements je1 {
        final /* synthetic */ MotionEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00031(MotionEvent motionEvent) {
            super(0);
            this.$event = motionEvent;
        }

        @Override // defpackage.je1
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchGenericMotionEvent(this.$event));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$onAttachedToWindow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00041 extends ww1 implements je1 {
        public C00041() {
            super(0);
        }

        @Override // defpackage.je1
        public /* synthetic */ Object invoke() {
            return new qq1(m38x29b8824f());
        }

        /* JADX INFO: renamed from: invoke-YbymL2g, reason: not valid java name */
        public final long m38x29b8824f() {
            return AndroidWindowInfo_androidKt.calculateWindowSize(AndroidComposeView.this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$removeAndroidView$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00051 extends ww1 implements je1 {
        final /* synthetic */ me $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00051(me meVar) {
            super(0);
            this.$view = meVar;
        }

        @Override // defpackage.je1
        public /* bridge */ /* synthetic */ Object invoke() {
            m39invoke();
            return w84.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m39invoke() {
            AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(this.$view);
            AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.$view));
            this.$view.setImportantForAccessibility(0);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$requestFocus$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00061 extends ww1 implements le1 {
        final /* synthetic */ int $focusDirection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00061(int i) {
            super(1);
            this.$focusDirection = i;
        }

        @Override // defpackage.le1
        public final Boolean invoke(db1 db1Var) {
            return Boolean.valueOf(db1Var.z0(this.$focusDirection));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$1, reason: invalid class name and case insensitive filesystem */
    @vr0(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {739}, m = "textInputSession")
    public static final class C00071 extends uo0 {
        int label;
        /* synthetic */ Object result;

        public C00071(so0 so0Var) {
            super(so0Var);
        }

        @Override // defpackage.wr
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidComposeView.this.textInputSession(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ww1 implements le1 {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.le1
        public final AndroidPlatformTextInputSession invoke(gq0 gq0Var) {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            return new AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), gq0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.c, androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1] */
    public AndroidComposeView(Context context, xp0 xp0Var) {
        final AndroidComposeView androidComposeView;
        m9 m9Var;
        dx1 dx1Var;
        super(context);
        this.lastDownPointerPosition = 9205357640488583168L;
        int i = 1;
        this.superclassInitComplete = true;
        this.sharedDrawScope = new wx1();
        yu0 yu0VarD = yh4.d(context);
        t73 t73Var = t73.x;
        this.density$delegate = new ft2(yu0VarD, t73Var);
        d31 d31Var = new d31();
        this.rootSemanticsNode = d31Var;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(d31Var);
        this.semanticsModifier = emptySemanticsElement;
        ?? r4 = new tf2() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // defpackage.nf2, androidx.compose.ui.c
            public /* bridge */ /* synthetic */ boolean all(le1 le1Var) {
                return super.all(le1Var);
            }

            public boolean any(le1 le1Var) {
                return ((Boolean) le1Var.invoke(this)).booleanValue();
            }

            @Override // defpackage.tf2
            public BringIntoViewOnScreenResponderNode create() {
                return new BringIntoViewOnScreenResponderNode(this.this$0);
            }

            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override // defpackage.nf2, androidx.compose.ui.c
            public Object foldIn(Object obj, ne1 ne1Var) {
                return ne1Var.invoke(obj, this);
            }

            public Object foldOut(Object obj, ne1 ne1Var) {
                return ne1Var.invoke(this, obj);
            }

            public int hashCode() {
                return this.this$0.hashCode();
            }

            @Override // defpackage.tf2
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("BringIntoViewOnScreen");
            }

            @Override // androidx.compose.ui.c
            public /* bridge */ /* synthetic */ c then(c cVar) {
                return super.then(cVar);
            }

            @Override // defpackage.tf2
            public void update(BringIntoViewOnScreenResponderNode bringIntoViewOnScreenResponderNode) {
                bringIntoViewOnScreenResponderNode.setView(this.this$0);
            }
        };
        this.bringIntoViewNode = r4;
        this.focusOwner = new va1(new AndroidComposeView$focusOwner$1(this), new AndroidComposeView$focusOwner$2(this), new AndroidComposeView$focusOwner$3(this), new AndroidComposeView$focusOwner$4(this), new AndroidComposeView$focusOwner$5(this), new bi2(this) { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$6
            @Override // defpackage.ou1
            public Object get() {
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            }

            public void set(Object obj) {
                ((AndroidComposeView) this.receiver).setLayoutDirection((dx1) obj);
            }
        });
        this.coroutineContext = xp0Var;
        new AndroidComposeView$dragAndDropManager$1(this);
        this.dragAndDropManager = new ya();
        this._windowInfo = new LazyWindowInfo();
        Modifier$Companion modifier$Companion = c.i;
        c cVarA = androidx.compose.ui.input.key.a.a(modifier$Companion, new AndroidComposeView$keyInputModifier$1(this));
        this.keyInputModifier = cVarA;
        c cVarA2 = androidx.compose.ui.input.rotary.a.a(modifier$Companion, AndroidComposeView$rotaryInputModifier$1.INSTANCE);
        this.rotaryInputModifier = cVarA2;
        this.canvasHolder = new b10();
        this.viewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        ux1 ux1Var = new ux1(3);
        ux1Var.X(s73.c);
        ux1Var.V(getDensity());
        ux1Var.Z(getViewConfiguration());
        ux1Var.Y(emptySemanticsElement.then(cVarA2).then(cVarA).then(((va1) getFocusOwner()).i).then(getDragAndDropManager().c).then(r4));
        this.root = ux1Var;
        dh2 dh2Var = hq1.a;
        this.layoutNodes = new dh2();
        m31x50cad871();
        this.rectManager = new j43();
        this.rootForTest = this;
        this.semanticsOwner = new af3(getRoot(), d31Var, m31x50cad871());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new fa(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.graphicsContext = new hb(this);
        this.autofillTree = new cp();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new ag2();
        this.pointerInputEventProcessor = new gx2(getRoot());
        this.configurationChangeObserver = AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        Object[] objArr = 0;
        this._autofill = autofillSupported() ? new j9(this, getAutofillTree()) : null;
        if (autofillSupported()) {
            AutofillManager autofillManagerH = e1.h(context.getSystemService(e1.l()));
            if (autofillManagerH == null) {
                throw fq2.i("Autofill service could not be located.");
            }
            androidComposeView = this;
            m9Var = new m9(new sz0(autofillManagerH), getSemanticsOwner(), androidComposeView, getRectManager(), context.getPackageName());
        } else {
            androidComposeView = this;
            m9Var = null;
        }
        androidComposeView._autofillManager = m9Var;
        androidComposeView.clipboardManager = new AndroidClipboardManager(context);
        androidComposeView.clipboard = new AndroidClipboard(androidComposeView.getClipboardManager());
        androidComposeView.snapshotObserver = new as2(new AndroidComposeView$snapshotObserver$1(androidComposeView));
        androidComposeView.measureAndLayoutDelegate = new sb2(androidComposeView.getRoot());
        androidComposeView.globalPosition = 9223372034707292159L;
        androidComposeView.tmpPositionArray = new int[]{0, 0};
        float[] fArrA = ob2.a();
        androidComposeView.tmpMatrix = fArrA;
        androidComposeView.viewToWindowMatrix = ob2.a();
        androidComposeView.windowToViewMatrix = ob2.a();
        androidComposeView.lastMatrixRecalculationAnimationTime = -1L;
        androidComposeView.windowPosition = 9187343241974906880L;
        androidComposeView.isRenderNodeCompatible = true;
        androidComposeView._viewTreeOwners$delegate = cl3.d(null);
        androidComposeView.viewTreeOwners$delegate = cl3.b(new AndroidComposeView$viewTreeOwners$2(androidComposeView));
        androidComposeView.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: t9
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.c.updatePositionCacheAndDispatch();
            }
        };
        androidComposeView.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: u9
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.a.updatePositionCacheAndDispatch();
            }
        };
        androidComposeView.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: v9
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.touchModeChangeListener$lambda$8(this.c, z);
            }
        };
        ny3 ny3Var = new ny3(androidComposeView.getView(), androidComposeView);
        androidComposeView.legacyTextInputServiceAndroid = ny3Var;
        androidComposeView.textInputService = new ly3((iw2) AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(ny3Var));
        androidComposeView.textInputSessionMutex = new AtomicReference(null);
        androidComposeView.softwareKeyboardController = new DelegatingSoftwareKeyboardController(androidComposeView.getTextInputService());
        androidComposeView.fontLoader = new AndroidFontResourceLoader(context);
        androidComposeView.fontFamilyResolver$delegate = new ft2(gb2.v(context), t73Var);
        androidComposeView.currentFontWeightAdjustment = androidComposeView.getFontWeightAdjustmentCompat(context.getResources().getConfiguration());
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        dx1 dx1Var2 = dx1.c;
        if (layoutDirection != 0) {
            dx1Var = layoutDirection != 1 ? null : dx1.d;
        } else {
            dx1Var = dx1Var2;
        }
        androidComposeView.layoutDirection$delegate = cl3.d(dx1Var != null ? dx1Var : dx1Var2);
        androidComposeView.hapticFeedBack = new wv2(androidComposeView);
        int i2 = androidComposeView.isInTouchMode() ? 1 : 2;
        new AndroidComposeView$_inputModeManager$1(androidComposeView);
        androidComposeView._inputModeManager = new ip1(i2);
        androidComposeView.modifierLocalManager = new qf2(androidComposeView);
        androidComposeView.textToolbar = new AndroidTextToolbar(androidComposeView);
        androidComposeView.layerCache = new WeakCache<>();
        androidComposeView.endApplyChangesListeners = new vh2();
        androidComposeView.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                this.this$0.removeCallbacks(this);
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i3 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i3 = 2;
                    }
                    AndroidComposeView androidComposeView2 = this.this$0;
                    androidComposeView2.sendSimulatedEvent(motionEvent, i3, androidComposeView2.relayoutTime, false);
                }
            }
        };
        androidComposeView.sendHoverExitEvent = new m3(i, androidComposeView);
        androidComposeView.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(androidComposeView);
        int i3 = Build.VERSION.SDK_INT;
        androidComposeView.matrixToWindow = i3 < 29 ? new CalculateMatrixToWindowApi21(fArrA, objArr == true ? 1 : 0) : new CalculateMatrixToWindowApi29();
        androidComposeView.addOnAttachStateChangeListener(androidComposeView.contentCaptureManager);
        androidComposeView.setWillNotDraw(false);
        androidComposeView.setFocusable(true);
        if (i3 >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(androidComposeView, 1, false);
        }
        androidComposeView.setFocusableInTouchMode(true);
        androidComposeView.setClipChildren(false);
        zc4.h(androidComposeView, androidComposeViewAccessibilityDelegateCompat);
        le1 onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(androidComposeView);
        }
        androidComposeView.setOnDragListener(androidComposeView.getDragAndDropManager());
        androidComposeView.getRoot().b(androidComposeView);
        if (i3 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(androidComposeView);
        }
        androidComposeView.scrollCapture = i3 >= 31 ? new ib3() : null;
        androidComposeView.pointerIconService = new cx2() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private androidx.compose.ui.input.pointer.a currentMouseCursorIcon;
            private androidx.compose.ui.input.pointer.a currentStylusHoverIcon;

            {
                androidx.compose.ui.input.pointer.a.a.getClass();
                this.currentMouseCursorIcon = g13.e;
            }

            public androidx.compose.ui.input.pointer.a getIcon() {
                return this.currentMouseCursorIcon;
            }

            @Override // defpackage.cx2
            public androidx.compose.ui.input.pointer.a getStylusHoverIcon() {
                return this.currentStylusHoverIcon;
            }

            @Override // defpackage.cx2
            public void setIcon(androidx.compose.ui.input.pointer.a aVar) {
                if (aVar == null) {
                    androidx.compose.ui.input.pointer.a.a.getClass();
                    aVar = g13.e;
                }
                this.currentMouseCursorIcon = aVar;
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this.this$0, aVar);
            }

            @Override // defpackage.cx2
            public void setStylusHoverIcon(androidx.compose.ui.input.pointer.a aVar) {
                this.currentStylusHoverIcon = aVar;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        boolean zN = kr1.n(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui_release());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.composeAccessibilityDelegate;
        if (zN) {
            int iD2 = androidComposeViewAccessibilityDelegateCompat.getIdToBeforeMap$ui_release().d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!kr1.n(str, androidComposeViewAccessibilityDelegateCompat.getExtraDataTestTraversalAfterVal$ui_release()) || (iD = this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    private final boolean autofillSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final boolean childSizeCanAffectParentSize(ux1 ux1Var) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        ux1 ux1VarT = ux1Var.t();
        if (ux1VarT == null) {
            return false;
        }
        long j = ((xo1) ux1VarT.N.c).l;
        return (um0.f(j) && um0.e(j)) ? false : true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m14x676440cf(long j) {
        return (int) (j >>> 32);
    }

    /* JADX INFO: renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m15xfba8afd0(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m16x4afe8aa6(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return m20x96f374b2(0, size);
        }
        if (mode == 0) {
            return m20x96f374b2(0, IntCompanionObject.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return m20x96f374b2(size, size);
        }
        throw new IllegalStateException();
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View findNextNonChildView(int i) {
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            View rootView = getRootView();
            rootView.getClass();
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, i);
            if (viewFindNextFocus != null && !AndroidComposeView_androidKt.containsDescendant(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kr1.n(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i, viewGroup.getChildAt(i2));
                    if (viewFindViewByAccessibilityIdRootedAtCurrentView != null) {
                        return viewFindViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
            }
        }
        return null;
    }

    @cv0
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @cv0
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners$delegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX INFO: renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m17xc3c7b7b1(MotionEvent motionEvent) {
        AndroidComposeView androidComposeView;
        int i;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                boolean z = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null) {
                    try {
                        if (hasChangedDevices(motionEvent, motionEvent2)) {
                            if (isDevicePressEvent(motionEvent2)) {
                                gx2 gx2Var = this.pointerInputEventProcessor;
                                if (!gx2Var.e) {
                                    ((j82) gx2Var.c.c).a();
                                    gx2Var.b.c();
                                }
                            } else if (motionEvent2.getActionMasked() != 10 && z) {
                                sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked == 3 || actionMasked == 9 || !isInBounds(motionEvent)) {
                    androidComposeView = this;
                    i = 9;
                } else {
                    i = 9;
                    androidComposeView = this;
                    sendSimulatedEvent$default(androidComposeView, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != 0) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = androidComposeView.previousMotionEvent;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = androidComposeView.previousMotionEvent;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == i && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            ag2 ag2Var = androidComposeView.motionEventAdapter;
                            ag2Var.c.delete(pointerId);
                            ag2Var.b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = androidComposeView.previousMotionEvent;
                        float x = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = androidComposeView.previousMotionEvent;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = androidComposeView.previousMotionEvent;
                        boolean z4 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                ag2 ag2Var2 = androidComposeView.motionEventAdapter;
                                ag2Var2.c.delete(pointerId);
                                ag2Var2.b.delete(pointerId);
                            }
                            fi1 fi1Var = androidComposeView.pointerInputEventProcessor.b;
                            if (fi1Var.d) {
                                fi1Var.d = true;
                            } else {
                                fi1Var.g.a.i();
                            }
                        }
                    }
                }
                androidComposeView.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int iM21xbe9f1a51 = m21xbe9f1a51(motionEvent);
                Trace.endSection();
                androidComposeView.forceUseMatrixCache = false;
                return iM21xbe9f1a51;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.forceUseMatrixCache = false;
            throw th3;
        }
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        float fA;
        v73 v73Var;
        int size;
        yd ydVar;
        of2 of2VarE;
        yd ydVar2;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        Context context = getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Method method = ad4.a;
            fA = df0.f(viewConfiguration);
        } else {
            fA = ad4.a(viewConfiguration, context);
        }
        w73 w73Var = new w73(fA * f, f * (i >= 26 ? df0.e(viewConfiguration) : ad4.a(viewConfiguration, getContext())), motionEvent.getDeviceId(), motionEvent.getEventTime());
        qa1 focusOwner = getFocusOwner();
        C00031 c00031 = new C00031(motionEvent);
        va1 va1Var = (va1) focusOwner;
        if (va1Var.g.f) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        db1 db1VarQ = av1.q(va1Var.f);
        if (db1VarQ != null) {
            if (!db1VarQ.getNode().isAttached()) {
                po1.b("visitAncestors called on an unattached node");
            }
            of2 node = db1VarQ.getNode();
            ux1 ux1VarM = y64.M(db1VarQ);
            loop0: while (true) {
                if (ux1VarM == null) {
                    of2VarE = null;
                    break;
                }
                if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 16384) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & 16384) != 0) {
                            oi2 oi2Var = null;
                            of2VarE = node;
                            while (of2VarE != null) {
                                if (of2VarE instanceof v73) {
                                    break loop0;
                                }
                                if ((of2VarE.getKindSet$ui_release() & 16384) != 0 && (of2VarE instanceof ju0)) {
                                    int i2 = 0;
                                    for (of2 child$ui_release = ((ju0) of2VarE).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                                        if ((child$ui_release.getKindSet$ui_release() & 16384) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                of2VarE = child$ui_release;
                                            } else {
                                                if (oi2Var == null) {
                                                    oi2Var = new oi2(0, new of2[16]);
                                                }
                                                if (of2VarE != null) {
                                                    oi2Var.c(of2VarE);
                                                    of2VarE = null;
                                                }
                                                oi2Var.c(child$ui_release);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                of2VarE = y64.e(oi2Var);
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                ux1VarM = ux1VarM.t();
                node = (ux1VarM == null || (ydVar2 = ux1VarM.N) == null) ? null : (es3) ydVar2.e;
            }
            v73Var = (v73) of2VarE;
        } else {
            v73Var = null;
        }
        if (v73Var != null) {
            if (!v73Var.getNode().isAttached()) {
                po1.b("visitAncestors called on an unattached node");
            }
            of2 parent$ui_release = v73Var.getNode().getParent$ui_release();
            ux1 ux1VarM2 = y64.M(v73Var);
            ArrayList arrayList = null;
            while (ux1VarM2 != null) {
                if ((((of2) ux1VarM2.N.f).getAggregateChildKindSet$ui_release() & 16384) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & 16384) != 0) {
                            of2 of2VarE2 = parent$ui_release;
                            oi2 oi2Var2 = null;
                            while (of2VarE2 != null) {
                                if (of2VarE2 instanceof v73) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(of2VarE2);
                                } else if ((of2VarE2.getKindSet$ui_release() & 16384) != 0 && (of2VarE2 instanceof ju0)) {
                                    int i3 = 0;
                                    for (of2 child$ui_release2 = ((ju0) of2VarE2).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                        if ((child$ui_release2.getKindSet$ui_release() & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                of2VarE2 = child$ui_release2;
                                            } else {
                                                if (oi2Var2 == null) {
                                                    oi2Var2 = new oi2(0, new of2[16]);
                                                }
                                                if (of2VarE2 != null) {
                                                    oi2Var2.c(of2VarE2);
                                                    of2VarE2 = null;
                                                }
                                                oi2Var2.c(child$ui_release2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                of2VarE2 = y64.e(oi2Var2);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                ux1VarM2 = ux1VarM2.t();
                parent$ui_release = (ux1VarM2 == null || (ydVar = ux1VarM2.N) == null) ? null : (es3) ydVar.e;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i4 = size - 1;
                    ((v73) arrayList.get(size)).getClass();
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            of2 node2 = v73Var.getNode();
            oi2 oi2Var3 = null;
            while (node2 != null) {
                if (!(node2 instanceof v73) && (node2.getKindSet$ui_release() & 16384) != 0 && (node2 instanceof ju0)) {
                    int i5 = 0;
                    for (of2 child$ui_release3 = ((ju0) node2).d; child$ui_release3 != null; child$ui_release3 = child$ui_release3.getChild$ui_release()) {
                        if ((child$ui_release3.getKindSet$ui_release() & 16384) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node2 = child$ui_release3;
                            } else {
                                if (oi2Var3 == null) {
                                    oi2Var3 = new oi2(0, new of2[16]);
                                }
                                if (node2 != null) {
                                    oi2Var3.c(node2);
                                    node2 = null;
                                }
                                oi2Var3.c(child$ui_release3);
                            }
                        }
                    }
                    if (i5 == 1) {
                    }
                }
                node2 = y64.e(oi2Var3);
            }
            if (!((Boolean) c00031.invoke()).booleanValue()) {
                of2 node3 = v73Var.getNode();
                oi2 oi2Var4 = null;
                while (node3 != null) {
                    if (node3 instanceof v73) {
                        le1 le1Var = ((v73) node3).c;
                        if (le1Var != null ? ((Boolean) le1Var.invoke(w73Var)).booleanValue() : false) {
                        }
                    } else if ((node3.getKindSet$ui_release() & 16384) != 0 && (node3 instanceof ju0)) {
                        int i6 = 0;
                        for (of2 child$ui_release4 = ((ju0) node3).d; child$ui_release4 != null; child$ui_release4 = child$ui_release4.getChild$ui_release()) {
                            if ((child$ui_release4.getKindSet$ui_release() & 16384) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    node3 = child$ui_release4;
                                } else {
                                    if (oi2Var4 == null) {
                                        oi2Var4 = new oi2(0, new of2[16]);
                                    }
                                    if (node3 != null) {
                                        oi2Var4.c(node3);
                                        node3 = null;
                                    }
                                    oi2Var4.c(child$ui_release4);
                                }
                            }
                        }
                        if (i6 == 1) {
                        }
                    }
                    node3 = y64.e(oi2Var4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        le1 le1Var2 = ((v73) arrayList.get(i7)).c;
                        if (!(le1Var2 != null ? ((Boolean) le1Var2.invoke(w73Var)).booleanValue() : false)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void invalidateLayers(ux1 ux1Var) {
        ux1Var.B();
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            invalidateLayers((ux1) objArr[i2]);
        }
    }

    private final void invalidateLayoutNodeMeasurement(ux1 ux1Var) {
        this.measureAndLayoutDelegate.q(ux1Var, false);
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            invalidateLayoutNodeMeasurement((ux1) objArr[i2]);
        }
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & IntCompanionObject.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & IntCompanionObject.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & IntCompanionObject.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & IntCompanionObject.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & IntCompanionObject.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & IntCompanionObject.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClearFocusForOwner() {
        if (isFocused() || hasFocus()) {
            clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h43 onFetchFocusRect() {
        if (isFocused()) {
            db1 db1VarQ = av1.q(((va1) getFocusOwner()).f);
            if (db1VarQ != null) {
                return av1.t(db1VarQ);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return xr0.M(viewFindFocus, this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onMoveFocusInChildren-3ESFkO8, reason: not valid java name */
    public final boolean m18xb6ce090e(int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        Integer numU0 = xr0.u0(i);
        if (numU0 == null) {
            u41.r("Invalid focus direction");
            return false;
        }
        int iIntValue = numU0.intValue();
        h43 h43VarOnFetchFocusRect = onFetchFocusRect();
        Rect rectW0 = h43VarOnFetchFocusRect != null ? xr0.w0(h43VarOnFetchFocusRect) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rectW0 == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, rectW0, iIntValue);
        if (viewFindNextFocus != null) {
            return xr0.p0(viewFindNextFocus, Integer.valueOf(iIntValue), rectW0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onRequestFocusForOwner-7o62pno, reason: not valid java name */
    public final boolean m19x618a61a2(fa1 fa1Var, h43 h43Var) {
        Integer numU0;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((fa1Var == null || (numU0 = xr0.u0(fa1Var.a)) == null) ? 130 : numU0.intValue(), h43Var != null ? xr0.w0(h43Var) : null);
    }

    /* JADX INFO: renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m20x96f374b2(int i, int i2) {
        return (((long) i) << 32) | ((long) i2);
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = (((long) Float.floatToRawIntBits(f - iArr2[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr2[1])) & 4294967295L);
        }
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        float[] fArr = this.viewToWindowMatrix;
        float x = motionEvent.getX();
        long jB = ob2.b((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), fArr);
        this.windowPosition = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L);
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo52x8c1ba417(this, this.viewToWindowMatrix);
        InvertMatrixKt.m88xf2a295f8(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(ux1 ux1Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (ux1Var != null) {
            while (ux1Var != null && ux1Var.O.p.t == sx1.c && childSizeCanAffectParentSize(ux1Var)) {
                ux1Var = ux1Var.t();
            }
            if (ux1Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, ux1 ux1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ux1Var = null;
        }
        androidComposeView.scheduleMeasureAndLayout(ux1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$10(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.m21xbe9f1a51(motionEvent);
        } else {
            u41.r("The ACTION_HOVER_EXIT event was not cleared.");
        }
    }

    /* JADX INFO: renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m21xbe9f1a51(MotionEvent motionEvent) {
        Object obj;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m96x1ab3381f(motionEvent.getMetaState());
        }
        fp1 fp1VarA = this.motionEventAdapter.a(this, motionEvent);
        if (fp1VarA == null) {
            gx2 gx2Var = this.pointerInputEventProcessor;
            if (!gx2Var.e) {
                ((j82) gx2Var.c.c).a();
                gx2Var.b.c();
            }
            return 0;
        }
        List list = (List) fp1VarA.c;
        int size = list.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = list.get(size);
            if (((fx2) obj).e) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        fx2 fx2Var = (fx2) obj;
        if (fx2Var != null) {
            this.lastDownPointerPosition = fx2Var.d;
        }
        int iA = this.pointerInputEventProcessor.a(fp1VarA, this, isInBounds(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        ag2 ag2Var = this.motionEventAdapter;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ag2Var.c.delete(pointerId);
        ag2Var.b.delete(pointerId);
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jMo27x2d3fc342 = mo27x2d3fc342((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jMo27x2d3fc342 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jMo27x2d3fc342 & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        fp1 fp1VarA = this.motionEventAdapter.a(this, motionEventObtain);
        fp1VarA.getClass();
        this.pointerInputEventProcessor.a(fp1VarA, this, true);
        motionEventObtain.recycle();
    }

    public static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, z);
    }

    private void setDensity(wu0 wu0Var) {
        this.density$delegate.setValue(wu0Var);
    }

    private void setFontFamilyResolver(kb1 kb1Var) {
        this.fontFamilyResolver$delegate.setValue(kb1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayoutDirection(dx1 dx1Var) {
        this.layoutDirection$delegate.setValue(dx1Var);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m22x73bc27b7(ay0 ay0Var, long j, le1 le1Var) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, ay0Var, new tj0(new xu0(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, le1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$8(AndroidComposeView androidComposeView, boolean z) {
        androidComposeView._inputModeManager.a.setValue(new gp1(z ? 1 : 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    public final void updatePositionCacheAndDispatch() {
        boolean z;
        boolean z2;
        getLocationOnScreen(this.tmpPositionArray);
        long j = this.globalPosition;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        int[] iArr = this.tmpPositionArray;
        int i3 = iArr[0];
        if (i == i3 && i2 == iArr[1] && this.lastMatrixRecalculationAnimationTime >= 0) {
            z = false;
        } else {
            this.globalPosition = (((long) iArr[1]) & 4294967295L) | (((long) i3) << 32);
            if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                z = false;
            } else {
                getRoot().O.p.v0();
                z = true;
            }
        }
        recalculateWindowPosition();
        j43 rectManager = getRectManager();
        long j2 = this.globalPosition;
        long jM = g13.M(this.windowPosition);
        float[] fArr = this.viewToWindowMatrix;
        rectManager.getClass();
        int iC = jr1.c(fArr);
        o04 o04Var = rectManager.b;
        if ((iC & 2) != 0) {
            fArr = null;
        }
        if (iq1.a(jM, o04Var.c)) {
            z2 = false;
        } else {
            o04Var.c = jM;
            z2 = true;
        }
        if (!iq1.a(j2, o04Var.d)) {
            o04Var.d = j2;
            z2 = true;
        }
        if (fArr != null) {
            z2 = true;
        }
        rectManager.e = z2 || rectManager.e;
        this.measureAndLayoutDelegate.b(z);
        getRectManager().a();
    }

    private final void updateWindowMetrics() {
        mi2 mi2Var = this._windowInfo._containerSize;
        if (mi2Var != null) {
            mi2Var.setValue(new qq1(AndroidWindowInfo_androidKt.calculateWindowSize(this)));
        }
    }

    public final void addAndroidView(me meVar, final ux1 ux1Var) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(meVar, ux1Var);
        getAndroidViewsHandler$ui_release().addView(meVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(ux1Var, meVar);
        meVar.setImportantForAccessibility(1);
        zc4.h(meVar, new c1() { // from class: androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1
            /* JADX WARN: Code duplicated, block: B:19:0x004c  */
            @Override // defpackage.c1
            public void onInitializeAccessibilityNodeInfo(View view, p1 p1Var) {
                super.onInitializeAccessibilityNodeInfo(view, p1Var);
                if (AndroidComposeView.this.composeAccessibilityDelegate.isEnabled$ui_release()) {
                    p1Var.a.setVisibleToUser(false);
                }
                ux1 ux1VarT = ux1Var.t();
                while (true) {
                    if (ux1VarT == null) {
                        ux1VarT = null;
                        break;
                    } else if (ux1VarT.N.g(8)) {
                        break;
                    } else {
                        ux1VarT = ux1VarT.t();
                    }
                }
                Integer numValueOf = ux1VarT != null ? Integer.valueOf(ux1VarT.d) : null;
                if (numValueOf != null) {
                    if (numValueOf.intValue() == AndroidComposeView.this.getSemanticsOwner().a().g) {
                        numValueOf = -1;
                    }
                } else {
                    numValueOf = -1;
                }
                AndroidComposeView androidComposeView = this;
                int iIntValue = numValueOf.intValue();
                p1Var.b = iIntValue;
                AccessibilityNodeInfo accessibilityNodeInfo = p1Var.a;
                accessibilityNodeInfo.setParent(androidComposeView, iIntValue);
                int i = ux1Var.d;
                int iD = AndroidComposeView.this.composeAccessibilityDelegate.getIdToBeforeMap$ui_release().d(i);
                if (iD != -1) {
                    View viewSemanticsIdToView = SemanticsUtils_androidKt.semanticsIdToView(AndroidComposeView.this.getAndroidViewsHandler$ui_release(), iD);
                    if (viewSemanticsIdToView != null) {
                        accessibilityNodeInfo.setTraversalBefore(viewSemanticsIdToView);
                    } else {
                        accessibilityNodeInfo.setTraversalBefore(this, iD);
                    }
                    AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                    androidComposeView2.addExtraDataToAccessibilityNodeInfoHelper(i, accessibilityNodeInfo, androidComposeView2.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui_release());
                }
                int iD2 = AndroidComposeView.this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().d(i);
                if (iD2 != -1) {
                    View viewSemanticsIdToView2 = SemanticsUtils_androidKt.semanticsIdToView(AndroidComposeView.this.getAndroidViewsHandler$ui_release(), iD2);
                    if (viewSemanticsIdToView2 != null) {
                        accessibilityNodeInfo.setTraversalAfter(viewSemanticsIdToView2);
                    } else {
                        accessibilityNodeInfo.setTraversalAfter(this, iD2);
                    }
                    AndroidComposeView androidComposeView3 = AndroidComposeView.this;
                    androidComposeView3.addExtraDataToAccessibilityNodeInfoHelper(i, accessibilityNodeInfo, androidComposeView3.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal$ui_release());
                }
            }
        });
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        ue3 ue3VarV;
        le1 le1Var;
        if (autofillSupported()) {
            m9 m9Var = this._autofillManager;
            if (m9Var != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    AutofillValue autofillValueI = e1.i(sparseArray.get(iKeyAt));
                    if (autofillValueI.isText()) {
                        ux1 ux1Var = (ux1) m9Var.b.c.b(iKeyAt);
                        if (ux1Var != null && (ue3VarV = ux1Var.v()) != null) {
                            Object objG = ue3VarV.c.g(te3.g);
                            if (objG == null) {
                                objG = null;
                            }
                            z0 z0Var = (z0) objG;
                            if (z0Var != null && (le1Var = (le1) z0Var.b) != null) {
                            }
                        }
                    } else if (autofillValueI.isDate()) {
                        Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                    } else if (autofillValueI.isList()) {
                        Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                    } else if (autofillValueI.isToggle()) {
                        Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                    }
                }
            }
            j9 j9Var = this._autofill;
            if (j9Var != null) {
                cp cpVar = j9Var.b;
                if (cpVar.a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int iKeyAt2 = sparseArray.keyAt(i2);
                    AutofillValue autofillValueI2 = e1.i(sparseArray.get(iKeyAt2));
                    if (autofillValueI2.isText()) {
                        autofillValueI2.getTextValue().toString();
                        if (cpVar.a.get(Integer.valueOf(iKeyAt2)) != null) {
                            m51.t();
                            return;
                        }
                    } else {
                        if (autofillValueI2.isDate()) {
                            throw new im2("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueI2.isList()) {
                            throw new im2("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueI2.isToggle()) {
                            throw new im2("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    public final Object boundsUpdatesAccessibilityEventLoop(so0 so0Var) {
        Object objBoundsUpdatesEventLoop$ui_release = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui_release(so0Var);
        return objBoundsUpdatesEventLoop$ui_release == hq0.c ? objBoundsUpdatesEventLoop$ui_release : w84.a;
    }

    public final Object boundsUpdatesContentCaptureEventLoop(so0 so0Var) {
        Object objA = this.contentCaptureManager.a(so0Var);
        return objA == hq0.c ? objA : w84.a;
    }

    @Override // defpackage.yr2
    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    public long mo23x4b94afde(long j) {
        recalculateWindowPosition();
        return ob2.b(j, this.windowToViewMatrix);
    }

    @Override // defpackage.yr2
    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    public long mo24xc4a27b34(long j) {
        recalculateWindowPosition();
        return ob2.b(j, this.viewToWindowMatrix);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.composeAccessibilityDelegate.m42x3425ef04(false, i, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.composeAccessibilityDelegate.m42x3425ef04(true, i, this.lastDownPointerPosition);
    }

    @Override // defpackage.yr2
    public wr2 createLayer(ne1 ne1Var, je1 je1Var, gg1 gg1Var, boolean z) {
        if (gg1Var != null) {
            return new GraphicsLayerOwnerLayer(gg1Var, null, this, ne1Var, je1Var);
        }
        if (!z) {
            wr2 wr2VarPop = this.layerCache.pop();
            if (wr2VarPop == null) {
                return new GraphicsLayerOwnerLayer(getGraphicsContext().b(), getGraphicsContext(), this, ne1Var, je1Var);
            }
            wr2VarPop.reuseLayer(ne1Var, je1Var);
            return wr2VarPop;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, ne1Var, je1Var);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.Companion;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            DrawChildContainer drawChildContainer = companion.getShouldUseDispatchDraw() ? new DrawChildContainer(getContext()) : new ViewLayerContainer(getContext());
            this.viewLayersContainer = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.viewLayersContainer;
        drawChildContainer2.getClass();
        return new ViewLayer(this, drawChildContainer2, ne1Var, je1Var);
    }

    public void decrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 1) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), false);
            }
            this.sensitiveComponentCount--;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        measureAndLayout(true);
        vk3.k().m();
        this.isDrawingContent = true;
        b10 b10Var = this.canvasHolder;
        o9 o9Var = b10Var.a;
        Canvas canvas2 = o9Var.a;
        o9Var.a = canvas;
        ((wl2) getRoot().N.d).H0(o9Var, null);
        b10Var.a.a = canvas2;
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i = 0; i < size; i++) {
                this.dirtyLayers.get(i).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<wr2> list = this.postponedDirtyLayers;
        if (list != null) {
            this.dirtyLayers.addAll(list);
            list.clear();
        }
        getRectManager().a();
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            return handleRotaryEvent(motionEvent);
        }
        return (m17xc3c7b7b1(motionEvent) & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (!isBadMotionEvent(motionEvent) && isAttachedToWindow()) {
            this.composeAccessibilityDelegate.dispatchHoverEvent$ui_release(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && isInBounds(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.previousMotionEvent;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                    this.hoverExitReceived = true;
                    postDelayed(this.sendHoverExitEvent, 8L);
                    return false;
                }
            } else if (!isPositionChanged(motionEvent)) {
                return false;
            }
            if ((m17xc3c7b7b1(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((va1) getFocusOwner()).d(keyEvent, new C00021(keyEvent));
        }
        this._windowInfo.m96x1ab3381f(keyEvent.getMetaState());
        return ((va1) getFocusOwner()).d(keyEvent, d4.E) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (isFocused()) {
            ((va1) getFocusOwner()).c();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            AndroidComposeViewAssistHelperMethodsO.INSTANCE.setClassName(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent))) {
            return false;
        }
        int iM17xc3c7b7b1 = m17xc3c7b7b1(motionEvent);
        if ((iM17xc3c7b7b1 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iM17xc3c7b7b1 & 1) != 0;
    }

    public final void drawAndroidView(me meVar, Canvas canvas) {
        getAndroidViewsHandler$ui_release().drawView(meVar, canvas);
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return findViewByAccessibilityIdRootedAtCurrentView(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        h43 h43VarM;
        if (view == null || this.measureAndLayoutDelegate.c) {
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (view == this) {
            db1 db1VarQ = av1.q(((va1) getFocusOwner()).f);
            h43VarM = db1VarQ != null ? av1.t(db1VarQ) : null;
            if (h43VarM == null) {
                h43VarM = xr0.M(view, this);
            }
        } else {
            h43VarM = xr0.M(view, this);
        }
        fa1 fa1VarB0 = xr0.B0(i);
        int i2 = fa1VarB0 != null ? fa1VarB0.a : 6;
        q43 q43Var = new q43();
        if (((va1) getFocusOwner()).e(i2, h43VarM, new AndroidComposeView$focusSearch$searchResult$1(q43Var)) != null) {
            Object obj = q43Var.c;
            if (obj != null) {
                if (viewFindNextFocus != null) {
                    if (i2 == 1 || i2 == 2) {
                        return super.focusSearch(view, i);
                    }
                    obj.getClass();
                    if (yh4.F(av1.t((db1) obj), xr0.M(viewFindNextFocus, this), h43VarM, i2)) {
                    }
                }
                return this;
            }
            if (viewFindNextFocus == null) {
            }
            return viewFindNextFocus;
        }
        return view;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void forceAccessibilityForTesting(boolean z) {
        this.composeAccessibilityDelegate.setAccessibilityForceEnabledForTesting$ui_release(z);
    }

    @Override // defpackage.yr2
    public void forceMeasureTheSubtree(ux1 ux1Var, boolean z) {
        this.measureAndLayoutDelegate.g(ux1Var, z);
    }

    @Override // defpackage.yr2
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        androidViewsHandler2.getClass();
        return androidViewsHandler2;
    }

    @Override // defpackage.yr2
    public wo getAutofill() {
        return this._autofill;
    }

    @Override // defpackage.yr2
    public bp getAutofillManager() {
        return this._autofillManager;
    }

    @Override // defpackage.yr2
    public cp getAutofillTree() {
        return this.autofillTree;
    }

    @Override // defpackage.yr2
    public AndroidClipboard getClipboard() {
        return this.clipboard;
    }

    @Override // defpackage.yr2
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final le1 getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    public final fa getContentCaptureManager$ui_release() {
        return this.contentCaptureManager;
    }

    @Override // defpackage.yr2
    public xp0 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // defpackage.yr2, androidx.compose.ui.platform.ViewRootForTest
    public wu0 getDensity() {
        return (wu0) this.density$delegate.getValue();
    }

    @Override // defpackage.yr2
    public ya getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    /* JADX INFO: renamed from: getFocusDirection-P8AzH3I, reason: not valid java name */
    public fa1 m25x5aa118d(KeyEvent keyEvent) {
        long jY = av1.y(keyEvent);
        if (tu1.a(jY, tu1.g)) {
            return new fa1(keyEvent.isShiftPressed() ? 2 : 1);
        }
        if (tu1.a(jY, tu1.e)) {
            return new fa1(4);
        }
        if (tu1.a(jY, tu1.d)) {
            return new fa1(3);
        }
        if (tu1.a(jY, tu1.b) ? true : tu1.a(jY, tu1.k)) {
            return new fa1(5);
        }
        if (tu1.a(jY, tu1.c) ? true : tu1.a(jY, tu1.l)) {
            return new fa1(6);
        }
        if (tu1.a(jY, tu1.f) ? true : tu1.a(jY, tu1.i) ? true : tu1.a(jY, tu1.m)) {
            return new fa1(7);
        }
        if (tu1.a(jY, tu1.a) ? true : tu1.a(jY, tu1.j)) {
            return new fa1(8);
        }
        return null;
    }

    @Override // defpackage.yr2
    public qa1 getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        w84 w84Var;
        h43 h43VarOnFetchFocusRect = onFetchFocusRect();
        if (h43VarOnFetchFocusRect != null) {
            rect.left = Math.round(h43VarOnFetchFocusRect.a);
            rect.top = Math.round(h43VarOnFetchFocusRect.b);
            rect.right = Math.round(h43VarOnFetchFocusRect.c);
            rect.bottom = Math.round(h43VarOnFetchFocusRect.d);
            w84Var = w84.a;
        } else {
            w84Var = null;
        }
        if (w84Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // defpackage.yr2
    public kb1 getFontFamilyResolver() {
        return (kb1) this.fontFamilyResolver$delegate.getValue();
    }

    @Override // defpackage.yr2
    public ib1 getFontLoader() {
        return this.fontLoader;
    }

    @Override // defpackage.yr2
    public eg1 getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // defpackage.yr2
    public lh1 getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.b.A();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.yr2
    public hp1 getInputModeManager() {
        return this._inputModeManager;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, defpackage.yr2
    public dx1 getLayoutDirection() {
        return (dx1) this.layoutDirection$delegate.getValue();
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public dh2 m31x50cad871() {
        return this.layoutNodes;
    }

    public long getMeasureIteration() {
        sb2 sb2Var = this.measureAndLayoutDelegate;
        if (!sb2Var.c) {
            po1.a("measureIteration should be only used during the measure/layout pass");
        }
        return sb2Var.g;
    }

    @Override // defpackage.yr2
    public qf2 getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // defpackage.yr2
    public mv2 getPlacementScope() {
        int i = ov2.b;
        return new n82(1, this);
    }

    @Override // defpackage.yr2
    public cx2 getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // defpackage.yr2
    public j43 getRectManager() {
        return this.rectManager;
    }

    @Override // defpackage.yr2
    public ux1 getRoot() {
        return this.root;
    }

    public r73 getRootForTest() {
        return this.rootForTest;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        ib3 ib3Var;
        if (Build.VERSION.SDK_INT < 31 || (ib3Var = this.scrollCapture) == null) {
            return false;
        }
        return ((Boolean) ib3Var.a.getValue()).booleanValue();
    }

    @Override // defpackage.yr2, androidx.compose.ui.platform.ViewRootForTest
    public af3 getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // defpackage.yr2
    public wx1 getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // defpackage.yr2
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // defpackage.yr2
    public as2 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // defpackage.yr2
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // defpackage.yr2, androidx.compose.ui.platform.ViewRootForTest
    public ly3 getTextInputService() {
        return this.textInputService;
    }

    @Override // defpackage.yr2
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public View getView() {
        return this;
    }

    @Override // defpackage.yr2
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    @Override // defpackage.yr2
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    public final m9 get_autofillManager$ui_release() {
        return this._autofillManager;
    }

    public void incrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 0) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), true);
            }
            this.sensitiveComponentCount++;
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        n32 lifecycleOwner;
        p32 p32VarH;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (p32VarH = lifecycleOwner.h()) == null) ? null : p32VarH.c) == g32.m;
    }

    @Override // defpackage.pb2
    /* JADX INFO: renamed from: localToScreen-58bKbWc, reason: not valid java name */
    public void mo26x1a2a05c7(float[] fArr) {
        recalculateWindowPosition();
        ob2.e(fArr, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m48xb0c9dbc4(fArr, Float.intBitsToFloat((int) (this.windowPosition >> 32)), Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)), this.tmpMatrix);
    }

    @Override // defpackage.vx2
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    public long mo27x2d3fc342(long j) {
        recalculateWindowPosition();
        long jB = ob2.b(j, this.viewToWindowMatrix);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.windowPosition >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    @Override // defpackage.yr2
    public void measureAndLayout(boolean z) {
        je1 je1Var;
        if (this.measureAndLayoutDelegate.b.A() || ((oi2) this.measureAndLayoutDelegate.e.d).h != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    je1Var = this.resendMotionEventOnLayout;
                } finally {
                    Trace.endSection();
                }
            } else {
                je1Var = null;
            }
            if (this.measureAndLayoutDelegate.k(je1Var)) {
                requestLayout();
            }
            this.measureAndLayoutDelegate.b(false);
            dispatchPendingInteropLayoutCallbacks();
        }
    }

    @Override // defpackage.yr2
    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public void mo28x12711d1e(ux1 ux1Var, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.l(ux1Var, j);
            if (!this.measureAndLayoutDelegate.b.A()) {
                this.measureAndLayoutDelegate.b(false);
                dispatchPendingInteropLayoutCallbacks();
            }
            getRectManager().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void measureAndLayoutForTest() {
        measureAndLayout(true);
    }

    public final void notifyLayerIsDirty$ui_release(wr2 wr2Var, boolean z) {
        boolean z2 = this.isDrawingContent;
        if (!z) {
            if (z2) {
                return;
            }
            this.dirtyLayers.remove(wr2Var);
            List<wr2> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(wr2Var);
                return;
            }
            return;
        }
        if (!z2) {
            this.dirtyLayers.add(wr2Var);
            return;
        }
        List arrayList = this.postponedDirtyLayers;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.postponedDirtyLayers = arrayList;
        }
        arrayList.add(wr2Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        n32 lifecycleOwner;
        p32 p32VarH;
        n32 lifecycleOwner2;
        j9 j9Var;
        super.onAttachedToWindow();
        this._windowInfo.setWindowFocused(hasWindowFocus());
        this._windowInfo.setOnInitializeContainerSize(new C00041());
        updateWindowMetrics();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().a.d();
        if (autofillSupported() && (j9Var = this._autofill) != null) {
            yo yoVar = yo.a;
            yoVar.getClass();
            j9Var.c.registerCallback(e1.g(yoVar));
        }
        n32 n32VarA = ud4.a(this);
        u93 u93VarA = vd4.a(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        p32 p32VarH2 = null;
        if (viewTreeOwners == null || (n32VarA != null && u93VarA != null && (n32VarA != viewTreeOwners.getLifecycleOwner() || u93VarA != viewTreeOwners.getLifecycleOwner()))) {
            if (n32VarA == null) {
                u41.r("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (u93VarA == null) {
                u41.r("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (p32VarH = lifecycleOwner.h()) != null) {
                p32VarH.b(this);
            }
            n32VarA.h().a(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(n32VarA, u93VarA);
            set_viewTreeOwners(viewTreeOwners2);
            le1 le1Var = this.onViewTreeOwnersAvailable;
            if (le1Var != null) {
                le1Var.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.a.setValue(new gp1(isInTouchMode() ? 1 : 2));
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        if (viewTreeOwners3 != null && (lifecycleOwner2 = viewTreeOwners3.getLifecycleOwner()) != null) {
            p32VarH2 = lifecycleOwner2.h();
        }
        if (p32VarH2 == null) {
            throw fq2.i("No lifecycle owner exists");
        }
        p32VarH2.a(this);
        p32VarH2.a(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
        }
        m9 m9Var = this._autofillManager;
        if (m9Var != null) {
            ((va1) getFocusOwner()).k.g(m9Var);
            getSemanticsOwner().d.g(m9Var);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        hg3 hg3Var = (hg3) this.textInputSessionMutex.get();
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) (hg3Var != null ? hg3Var.b : null);
        return androidPlatformTextInputSession == null ? this.legacyTextInputServiceAndroid.d : androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(yh4.d(getContext()));
        updateWindowMetrics();
        if (getFontWeightAdjustmentCompat(configuration) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
            setFontFamilyResolver(gb2.v(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // defpackage.et0
    public void onCreate(n32 n32Var) {
        n32Var.getClass();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        hg3 hg3Var = (hg3) this.textInputSessionMutex.get();
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) (hg3Var != null ? hg3Var.b : null);
        if (androidPlatformTextInputSession != null) {
            return androidPlatformTextInputSession.createInputConnection(editorInfo);
        }
        ny3 ny3Var = this.legacyTextInputServiceAndroid;
        if (!ny3Var.d) {
            return null;
        }
        in1 in1Var = ny3Var.h;
        ey3 ey3Var = ny3Var.g;
        int i2 = in1Var.e;
        boolean z = in1Var.a;
        if (i2 == 1) {
            i = z ? 6 : 0;
        } else if (i2 == 0) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else if (i2 == 6) {
            i = 5;
        } else if (i2 == 5) {
            i = 7;
        } else if (i2 == 3) {
            i = 3;
        } else if (i2 == 4) {
            i = 4;
        } else {
            if (i2 != 7) {
                u41.r("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i3 = in1Var.d;
        int i4 = 8;
        if (i3 == 1) {
            editorInfo.inputType = 1;
        } else if (i3 == 2) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = Integer.MIN_VALUE | i;
        } else if (i3 == 3) {
            editorInfo.inputType = 2;
        } else if (i3 == 4) {
            editorInfo.inputType = 3;
        } else if (i3 == 5) {
            editorInfo.inputType = 17;
        } else if (i3 == 6) {
            editorInfo.inputType = 33;
        } else if (i3 == 7) {
            editorInfo.inputType = 129;
        } else if (i3 == 8) {
            editorInfo.inputType = 18;
        } else {
            if (i3 != 9) {
                u41.r("Invalid Keyboard Type");
                return null;
            }
            editorInfo.inputType = 8194;
        }
        if (!z) {
            int i5 = editorInfo.inputType;
            if ((i5 & 1) == 1) {
                editorInfo.inputType = i5 | 131072;
                if (i2 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 1) == 1) {
            int i7 = in1Var.b;
            if (i7 == 1) {
                editorInfo.inputType = i6 | ConstantsKt.DEFAULT_BLOCK_SIZE;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | ConstantsKt.DEFAULT_BUFFER_SIZE;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (in1Var.c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j = ey3Var.b;
        int i8 = jz3.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        kr1.i0(editorInfo, ey3Var.a.d);
        editorInfo.imeOptions |= 33554432;
        if (y11.d()) {
            y11.a().i(editorInfo);
        }
        e43 e43Var = new e43(ny3Var.g, new sk3(i4, ny3Var), ny3Var.h.c);
        ny3Var.i.add(new WeakReference(e43Var));
        return e43Var;
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        ze3 semanticsNode;
        fa faVar = this.contentCaptureManager;
        faVar.getClass();
        for (long j : jArr) {
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) faVar.c().b((int) j);
            if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                s9.p();
                ViewTranslationRequest.Builder builderL = s9.l(faVar.c.getAutofillId(), semanticsNode.g);
                Object objG = semanticsNode.d.c.g(cf3.z);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builderL.setValue("android:text", TranslationRequestValue.forText(new hg(k62.a(62, "\n", list))));
                    consumer.accept(builderL.build());
                }
            }
        }
    }

    @Override // defpackage.et0
    public void onDestroy(n32 n32Var) {
        n32Var.getClass();
    }

    @Override // defpackage.yr2
    public void onDetach(ux1 ux1Var) {
        m9 m9Var;
        m31x50cad871().g(ux1Var.d);
        sb2 sb2Var = this.measureAndLayoutDelegate;
        bv0 bv0Var = sb2Var.b;
        ((jb) bv0Var.d).y(ux1Var);
        ((jb) bv0Var.h).y(ux1Var);
        ((oi2) sb2Var.e.d).l(ux1Var);
        requestClearInvalidObservations();
        getRectManager().h(ux1Var);
        if (autofillSupported() && (m9Var = this._autofillManager) != null && m9Var.h.e(ux1Var.d)) {
            m9Var.a.s(m9Var.c, ux1Var.d, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        j9 j9Var;
        n32 lifecycleOwner;
        super.onDetachedFromWindow();
        ol3 ol3Var = getSnapshotObserver().a;
        f4 f4Var = ol3Var.h;
        if (f4Var != null) {
            f4Var.g();
        }
        ol3Var.b();
        p32 p32VarH = null;
        this._windowInfo.setOnInitializeContainerSize(null);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null) {
            p32VarH = lifecycleOwner.h();
        }
        if (p32VarH == null) {
            throw fq2.i("No lifecycle owner exists");
        }
        p32VarH.b(this.contentCaptureManager);
        p32VarH.b(this);
        if (autofillSupported() && (j9Var = this._autofill) != null) {
            yo yoVar = yo.a;
            yoVar.getClass();
            j9Var.c.unregisterCallback(e1.g(yoVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
        m9 m9Var = this._autofillManager;
        if (m9Var != null) {
            getSemanticsOwner().d.j(m9Var);
            ((va1) getFocusOwner()).k.j(m9Var);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // defpackage.yr2
    public void onEndApplyChanges() {
        vh2 vh2Var;
        m9 m9Var;
        Object[] objArr;
        if (this.observationClearRequested) {
            ol3 ol3Var = getSnapshotObserver().a;
            synchronized (ol3Var.g) {
                try {
                    oi2 oi2Var = ol3Var.f;
                    int i = oi2Var.h;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = oi2Var.c;
                        if (i2 >= i) {
                            break;
                        }
                        nl3 nl3Var = (nl3) objArr[i2];
                        nl3Var.e();
                        if (!(nl3Var.f.e != 0)) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = oi2Var.c;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    oi2Var.h = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        if (autofillSupported() && (m9Var = this._autofillManager) != null) {
            eh2 eh2Var = m9Var.h;
            if (eh2Var.d == 0 && m9Var.i) {
                ((AutofillManager) m9Var.a.c).commit();
                m9Var.i = false;
            }
            if (eh2Var.d != 0) {
                m9Var.i = true;
            }
        }
        while (true) {
            vh2 vh2Var2 = this.endApplyChangesListeners;
            if (vh2Var2.b == 0 || vh2Var2.b(0) == null) {
                return;
            }
            int i5 = this.endApplyChangesListeners.b;
            int i6 = 0;
            while (true) {
                vh2Var = this.endApplyChangesListeners;
                if (i6 < i5) {
                    je1 je1Var = (je1) vh2Var.b(i6);
                    vh2 vh2Var3 = this.endApplyChangesListeners;
                    if (i6 < 0 || i6 >= vh2Var3.b) {
                        vh2Var3.f(i6);
                        throw null;
                    }
                    Object[] objArr3 = vh2Var3.a;
                    Object obj = objArr3[i6];
                    objArr3[i6] = null;
                    if (je1Var != null) {
                        je1Var.invoke();
                    }
                    i6++;
                }
            }
            vh2Var.l(0, i5);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        kr1.x(((va1) getFocusOwner()).f, true);
    }

    @Override // defpackage.yr2
    public void onInteropViewLayoutChange(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.measureAndLayoutDelegate.k(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // defpackage.yr2
    public void onLayoutChange(ux1 ux1Var) {
        this.composeAccessibilityDelegate.onLayoutChange$ui_release(ux1Var);
        fa faVar = this.contentCaptureManager;
        faVar.o = true;
        if (faVar.d()) {
            faVar.p.i(w84.a);
        }
    }

    @Override // defpackage.yr2
    public void onLayoutNodeDeactivated(ux1 ux1Var) {
        m9 m9Var;
        getRectManager().h(ux1Var);
        if (autofillSupported() && (m9Var = this._autofillManager) != null && m9Var.h.e(ux1Var.d)) {
            m9Var.a.s(m9Var.c, ux1Var.d, false);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long jM16x4afe8aa6 = m16x4afe8aa6(i);
            long jM16x4afe8aa7 = m16x4afe8aa6(i2);
            long jM1783xcb8e775 = Protocol$Companion.m1783xcb8e775((int) (jM16x4afe8aa6 >>> 32), (int) (jM16x4afe8aa6 & 4294967295L), (int) (jM16x4afe8aa7 >>> 32), (int) (4294967295L & jM16x4afe8aa7));
            um0 um0Var = this.onMeasureConstraints;
            if (um0Var == null) {
                this.onMeasureConstraints = new um0(jM1783xcb8e775);
                this.wasMeasuredWithMultipleConstraints = false;
            } else if (!um0.b(um0Var.a, jM1783xcb8e775)) {
                this.wasMeasuredWithMultipleConstraints = true;
            }
            this.measureAndLayoutDelegate.r(jM1783xcb8e775);
            this.measureAndLayoutDelegate.m();
            setMeasuredDimension(getRoot().O.p.c, getRoot().O.p.d);
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().O.p.c, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().O.p.d, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.et0
    public void onPause(n32 n32Var) {
        n32Var.getClass();
    }

    @Override // defpackage.yr2
    public void onPostAttach(ux1 ux1Var) {
        m9 m9Var;
        ue3 ue3VarV;
        if (!autofillSupported() || (m9Var = this._autofillManager) == null || (ue3VarV = ux1Var.v()) == null || !ue3VarV.c.b(cf3.p)) {
            return;
        }
        m9Var.h.a(ux1Var.d);
        m9Var.a.s(m9Var.c, ux1Var.d, true);
    }

    @Override // defpackage.yr2
    public void onPostLayoutNodeReused(ux1 ux1Var, int i) {
        m9 m9Var;
        if (autofillSupported() && (m9Var = this._autofillManager) != null) {
            AndroidComposeView androidComposeView = m9Var.c;
            sz0 sz0Var = m9Var.a;
            eh2 eh2Var = m9Var.h;
            if (eh2Var.e(i)) {
                sz0Var.s(androidComposeView, i, false);
            }
            ue3 ue3VarV = ux1Var.v();
            if (ue3VarV != null && ue3VarV.c.b(cf3.p)) {
                eh2Var.a(ux1Var.d);
                sz0Var.s(androidComposeView, ux1Var.d, true);
            }
        }
        getRectManager().f(ux1Var, ux1Var.O.p.v, true);
    }

    @Override // defpackage.yr2
    public void onPreAttach(ux1 ux1Var) {
        m31x50cad871().h(ux1Var.d, ux1Var);
    }

    @Override // defpackage.yr2
    public void onPreLayoutNodeReused(ux1 ux1Var, int i) {
        m31x50cad871().g(i);
        m31x50cad871().h(ux1Var.d, ux1Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!autofillSupported() || viewStructure == null) {
            return;
        }
        m9 m9Var = this._autofillManager;
        if (m9Var != null) {
            ux1 ux1Var = m9Var.b.a;
            AutofillId autofillId = m9Var.g;
            String str = m9Var.e;
            j43 j43Var = m9Var.d;
            gb2.M(viewStructure, ux1Var, autofillId, str, j43Var);
            Object[] objArr = en2.a;
            vh2 vh2Var = new vh2(2);
            vh2Var.g(ux1Var);
            vh2Var.g(viewStructure);
            while (true) {
                int i2 = vh2Var.b;
                if (i2 == 0) {
                    break;
                }
                Object objK = vh2Var.k(i2 - 1);
                objK.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objK;
                Object objK2 = vh2Var.k(vh2Var.b - 1);
                objK2.getClass();
                th2 th2Var = (th2) ((ux1) objK2).n();
                int i3 = ((oi2) th2Var.d).h;
                for (int i4 = 0; i4 < i3; i4++) {
                    ux1 ux1Var2 = (ux1) th2Var.get(i4);
                    if (!ux1Var2.X && ux1Var2.F() && ux1Var2.G()) {
                        ue3 ue3VarV = ux1Var2.v();
                        if (ue3VarV != null) {
                            fi2 fi2Var = ue3VarV.c;
                            if (fi2Var.b(te3.g) || fi2Var.b(cf3.p) || fi2Var.b(cf3.q)) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                gb2.M(viewStructureNewChild, ux1Var2, m9Var.g, str, j43Var);
                                vh2Var.g(ux1Var2);
                                vh2Var.g(viewStructureNewChild);
                            } else {
                                vh2Var.g(ux1Var2);
                                vh2Var.g(viewStructure2);
                            }
                        } else {
                            vh2Var.g(ux1Var2);
                            vh2Var.g(viewStructure2);
                        }
                    }
                }
            }
        }
        j9 j9Var = this._autofill;
        if (j9Var != null) {
            cp cpVar = j9Var.b;
            LinkedHashMap linkedHashMap = cpVar.a;
            LinkedHashMap linkedHashMap2 = cpVar.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    m51.t();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId(j9Var.d, iIntValue);
                viewStructureNewChild2.setId(iIntValue, j9Var.a.getContext().getPackageName(), null, null);
                viewStructureNewChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // defpackage.yr2
    public void onRequestMeasure(ux1 ux1Var, boolean z, boolean z2, boolean z3) {
        ux1 ux1VarT;
        ux1 ux1VarT2;
        s82 s82Var;
        vx1 vx1Var;
        sb2 sb2Var = this.measureAndLayoutDelegate;
        if (!z) {
            if (sb2Var.q(ux1Var, z2) && z3) {
                scheduleMeasureAndLayout(ux1Var);
                return;
            }
            return;
        }
        bv0 bv0Var = sb2Var.b;
        ux1 ux1Var2 = ux1Var.p;
        yx1 yx1Var = ux1Var.O;
        if (ux1Var2 == null) {
            po1.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = yx1Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    u41.e();
                    return;
                }
                if (!yx1Var.e || z2) {
                    yx1Var.e = true;
                    yx1Var.p.C = true;
                    if (ux1Var.X) {
                        return;
                    }
                    if ((kr1.n(ux1Var.H(), Boolean.TRUE) || (yx1Var.e && (ux1Var.r() == sx1.c || !((s82Var = yx1Var.q) == null || (vx1Var = s82Var.z) == null || !vx1Var.e())))) && ((ux1VarT = ux1Var.t()) == null || !ux1VarT.O.e)) {
                        bv0Var.e(ux1Var, true);
                    } else if ((ux1Var.G() || sb2.i(ux1Var)) && ((ux1VarT2 = ux1Var.t()) == null || !ux1VarT2.q())) {
                        bv0Var.e(ux1Var, false);
                    }
                    if (sb2Var.d || !z3) {
                        return;
                    }
                    scheduleMeasureAndLayout(ux1Var);
                    return;
                }
                return;
            }
        }
        sb2Var.h.c(new rb2(ux1Var, true, z2));
    }

    @Override // defpackage.yr2
    public void onRequestRelayout(ux1 ux1Var, boolean z, boolean z2) {
        sb2 sb2Var = this.measureAndLayoutDelegate;
        if (!z) {
            sb2Var.getClass();
            yx1 yx1Var = ux1Var.O;
            yx1 yx1Var2 = ux1Var.O;
            int iOrdinal = yx1Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                u41.e();
                return;
            }
            ux1 ux1VarT = ux1Var.t();
            boolean z3 = ux1VarT == null || ux1VarT.G();
            if (!z2) {
                if (ux1Var.q()) {
                    return;
                }
                if (ux1Var.p() && ux1Var.G() == z3 && ux1Var.G() == yx1Var2.p.B) {
                    return;
                }
            }
            ub2 ub2Var = yx1Var2.p;
            ub2Var.D = true;
            ub2Var.E = true;
            if (!ux1Var.X && ub2Var.B && z3) {
                if ((ux1VarT == null || !ux1VarT.p()) && (ux1VarT == null || !ux1VarT.q())) {
                    sb2Var.b.e(ux1Var, false);
                }
                if (sb2Var.d) {
                    return;
                }
                scheduleMeasureAndLayout$default(this, null, 1, null);
                return;
            }
            return;
        }
        bv0 bv0Var = sb2Var.b;
        int iOrdinal2 = ux1Var.O.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    u41.e();
                    return;
                }
            }
        }
        yx1 yx1Var3 = ux1Var.O;
        if ((yx1Var3.e || yx1Var3.f) && !z2) {
            return;
        }
        yx1Var3.f = true;
        yx1Var3.g = true;
        ub2 ub2Var2 = yx1Var3.p;
        ub2Var2.D = true;
        ub2Var2.E = true;
        if (ux1Var.X) {
            return;
        }
        ux1 ux1VarT2 = ux1Var.t();
        if (kr1.n(ux1Var.H(), Boolean.TRUE) && ((ux1VarT2 == null || !ux1VarT2.O.e) && (ux1VarT2 == null || !ux1VarT2.O.f))) {
            bv0Var.e(ux1Var, true);
        } else if (ux1Var.G() && ((ux1VarT2 == null || !ux1VarT2.p()) && (ux1VarT2 == null || !ux1VarT2.q()))) {
            bv0Var.e(ux1Var, false);
        }
        if (sb2Var.d) {
            return;
        }
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        androidx.compose.ui.input.pointer.a stylusHoverIcon;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (stylusHoverIcon = getPointerIconService().getStylusHoverIcon()) == null) ? super.onResolvePointerIcon(motionEvent, i) : AndroidComposeViewVerificationHelperMethodsN.INSTANCE.toAndroidPointerIcon(getContext(), stylusHoverIcon);
    }

    @Override // defpackage.et0
    public void onResume(n32 n32Var) {
        setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        dx1 dx1Var;
        if (this.superclassInitComplete) {
            dx1 dx1Var2 = dx1.c;
            if (i != 0) {
                dx1Var = i != 1 ? null : dx1.d;
            } else {
                dx1Var = dx1Var2;
            }
            if (dx1Var != null) {
                dx1Var2 = dx1Var;
            }
            setLayoutDirection(dx1Var2);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        ib3 ib3Var;
        if (Build.VERSION.SDK_INT < 31 || (ib3Var = this.scrollCapture) == null) {
            return;
        }
        af3 semanticsOwner = getSemanticsOwner();
        xp0 coroutineContext = getCoroutineContext();
        oi2 oi2Var = new oi2(0, new jb3[16]);
        xp1.K(semanticsOwner.a(), 0, new hb3(1, 8, oi2.class, oi2Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(oi2Var.c, 0, oi2Var.h, new y9(1, new le1[]{ba3.x, ba3.y}));
        int i = oi2Var.h;
        jb3 jb3Var = (jb3) (i == 0 ? null : oi2Var.c[i - 1]);
        if (jb3Var == null) {
            return;
        }
        mq1 mq1Var = jb3Var.c;
        zj0 zj0Var = new zj0(jb3Var.a, mq1Var, yo4.a(coroutineContext), ib3Var, this);
        wl2 wl2Var = jb3Var.d;
        h43 h43VarG = y64.u(wl2Var).G(wl2Var, true);
        long jC = mq1Var.c();
        ScrollCaptureTarget scrollCaptureTargetB = gb3.b(this, xr0.v0(p23.X(h43VarG)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), zj0Var);
        scrollCaptureTargetB.setScrollBounds(xr0.v0(mq1Var));
        consumer.accept(scrollCaptureTargetB);
    }

    @Override // defpackage.yr2
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui_release();
        fa faVar = this.contentCaptureManager;
        faVar.o = true;
        if (!faVar.d() || faVar.v) {
            return;
        }
        faVar.v = true;
        faVar.q.post(faVar.w);
    }

    @Override // defpackage.et0
    public void onStart(n32 n32Var) {
        n32Var.getClass();
    }

    @Override // defpackage.et0
    public void onStop(n32 n32Var) {
        n32Var.getClass();
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        fa faVar = this.contentCaptureManager;
        faVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (kr1.n(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            y64.r(faVar, longSparseArray);
        } else {
            faVar.c.post(new ba(faVar, 0, longSparseArray));
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(z);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (isShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    public final boolean recycle$ui_release(wr2 wr2Var) {
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(wr2Var);
        this.dirtyLayers.remove(wr2Var);
        return true;
    }

    @Override // defpackage.yr2
    public void registerOnEndApplyChangesListener(je1 je1Var) {
        if (this.endApplyChangesListeners.c(je1Var) >= 0) {
            return;
        }
        this.endApplyChangesListeners.g(je1Var);
    }

    public void registerOnLayoutCompletedListener(xr2 xr2Var) {
        this.measureAndLayoutDelegate.f.c(xr2Var);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    public final void removeAndroidView(me meVar) {
        registerOnEndApplyChangesListener(new C00051(meVar));
    }

    @Override // defpackage.yr2
    public void requestAutofill(ux1 ux1Var) {
        m9 m9Var;
        if (!autofillSupported() || (m9Var = this._autofillManager) == null) {
            return;
        }
        m9Var.d.a.r(ux1Var.d, new l9(m9Var, ux1Var));
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (((va1) getFocusOwner()).f.x0().a()) {
            return super.requestFocus(i, rect);
        }
        fa1 fa1VarB0 = xr0.B0(i);
        int i2 = fa1VarB0 != null ? fa1VarB0.a : 7;
        return kr1.n(((va1) getFocusOwner()).e(i2, rect != null ? new h43(rect.left, rect.top, rect.right, rect.bottom) : null, new C00061(i2)), Boolean.TRUE);
    }

    @Override // defpackage.yr2
    public void requestOnPositionedCallback(ux1 ux1Var) {
        ((oi2) this.measureAndLayoutDelegate.e.d).c(ux1Var);
        ux1Var.W = true;
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // defpackage.vx2
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    public long mo29xf127194(long j) {
        recalculateWindowPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.windowPosition & 4294967295L));
        return ob2.b((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.windowToViewMatrix);
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    /* JADX INFO: renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    public boolean mo30xcbe9678f(KeyEvent keyEvent) {
        ((va1) getFocusOwner()).c();
        return ((va1) getFocusOwner()).d(keyEvent, d4.E);
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui_release(j);
    }

    public final void setConfigurationChangeObserver(le1 le1Var) {
        this.configurationChangeObserver = le1Var;
    }

    public final void setContentCaptureManager$ui_release(fa faVar) {
        this.contentCaptureManager = faVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [of2] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(xp0 xp0Var) {
        this.coroutineContext = xp0Var;
        of2 of2Var = (of2) getRoot().N.f;
        if (of2Var instanceof sq3) {
            ((sq3) of2Var).x0();
        }
        if (!of2Var.getNode().isAttached()) {
            po1.b("visitSubtreeIf called on an unattached node");
        }
        oi2 oi2Var = new oi2(0, new of2[16]);
        of2 child$ui_release = of2Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            y64.d(oi2Var, of2Var.getNode());
        } else {
            oi2Var.c(child$ui_release);
        }
        while (true) {
            int i = oi2Var.h;
            if (i == 0) {
                return;
            }
            of2 of2Var2 = (of2) oi2Var.m(i - 1);
            if ((of2Var2.getAggregateChildKindSet$ui_release() & 16) != 0) {
                for (of2 child$ui_release2 = of2Var2; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & 16) != 0) {
                        ?? E = child$ui_release2;
                        ?? oi2Var2 = 0;
                        while (E != 0) {
                            if (E instanceof hx2) {
                                hx2 hx2Var = (hx2) E;
                                if (hx2Var instanceof sq3) {
                                    ((sq3) hx2Var).x0();
                                }
                            } else if ((E.getKindSet$ui_release() & 16) != 0 && (E instanceof ju0)) {
                                of2 child$ui_release3 = ((ju0) E).d;
                                int i2 = 0;
                                E = E;
                                oi2Var2 = oi2Var2;
                                while (child$ui_release3 != null) {
                                    if ((child$ui_release3.getKindSet$ui_release() & 16) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            oi2Var2 = oi2Var2;
                                            E = child$ui_release3;
                                        } else {
                                            if (oi2Var2 == 0) {
                                                oi2Var2 = new oi2(0, new of2[16]);
                                            }
                                            if (E != 0) {
                                                oi2Var2.c(E);
                                                E = 0;
                                            }
                                            oi2Var2.c(child$ui_release3);
                                        }
                                    }
                                    child$ui_release3 = child$ui_release3.getChild$ui_release();
                                    E = E;
                                    oi2Var2 = oi2Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            E = y64.e(oi2Var2);
                        }
                    }
                }
            }
            y64.d(oi2Var, of2Var2);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnViewTreeOwnersAvailable(le1 le1Var) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            le1Var.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = le1Var;
    }

    @Override // defpackage.yr2
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yr2
    public Object textInputSession(ne1 ne1Var, so0 so0Var) throws Throwable {
        C00071 c00071;
        if (so0Var instanceof C00071) {
            c00071 = (C00071) so0Var;
            int i = c00071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00071.label = i - Integer.MIN_VALUE;
            } else {
                c00071 = new C00071(so0Var);
            }
        } else {
            c00071 = new C00071(so0Var);
        }
        Object obj = c00071.result;
        int i2 = c00071.label;
        if (i2 == 0) {
            g13.O(obj);
            AtomicReference atomicReference = this.textInputSessionMutex;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            c00071.label = 1;
            Object objQ = yo4.q(new qb(anonymousClass2, atomicReference, ne1Var, (so0) null, 18), c00071);
            hq0 hq0Var = hq0.c;
            if (objQ == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        u41.p();
        return null;
    }
}
