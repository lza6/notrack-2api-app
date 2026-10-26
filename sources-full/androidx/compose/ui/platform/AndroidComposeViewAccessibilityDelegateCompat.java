package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.text.style.TextForegroundStyle$Companion;
import app.template.extension.BuildConfig;
import defpackage.bh2;
import defpackage.c1;
import defpackage.cf3;
import defpackage.ch2;
import defpackage.cn2;
import defpackage.df3;
import defpackage.dh2;
import defpackage.e14;
import defpackage.ea4;
import defpackage.eh2;
import defpackage.em3;
import defpackage.eq1;
import defpackage.fb3;
import defpackage.ff3;
import defpackage.fi2;
import defpackage.fq1;
import defpackage.fq2;
import defpackage.g32;
import defpackage.g72;
import defpackage.g84;
import defpackage.gb2;
import defpackage.gc1;
import defpackage.gg;
import defpackage.gm4;
import defpackage.gq1;
import defpackage.h03;
import defpackage.h43;
import defpackage.hg;
import defpackage.hq1;
import defpackage.hy3;
import defpackage.ic1;
import defpackage.ic4;
import defpackage.ig;
import defpackage.ii1;
import defpackage.iy3;
import defpackage.j1;
import defpackage.je1;
import defpackage.jz3;
import defpackage.k1;
import defpackage.k62;
import defpackage.ke0;
import defpackage.kr1;
import defpackage.l42;
import defpackage.le1;
import defpackage.lm3;
import defpackage.ln2;
import defpackage.m3;
import defpackage.m42;
import defpackage.m51;
import defpackage.me;
import defpackage.ms0;
import defpackage.n32;
import defpackage.n63;
import defpackage.n73;
import defpackage.od0;
import defpackage.oe1;
import defpackage.of2;
import defpackage.p1;
import defpackage.p32;
import defpackage.po1;
import defpackage.pq1;
import defpackage.re0;
import defpackage.rh2;
import defpackage.s1;
import defpackage.sf3;
import defpackage.sj0;
import defpackage.te3;
import defpackage.tt3;
import defpackage.u41;
import defpackage.ud2;
import defpackage.ue3;
import defpackage.ul;
import defpackage.ux1;
import defpackage.vh2;
import defpackage.vl;
import defpackage.w20;
import defpackage.w84;
import defpackage.wl2;
import defpackage.wu0;
import defpackage.ww1;
import defpackage.xy3;
import defpackage.y64;
import defpackage.yd;
import defpackage.yh4;
import defpackage.z0;
import defpackage.z21;
import defpackage.ze3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends c1 {
    private static final eq1 AccessibilityActionsResourceIds;
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private int accessibilityCursorPosition;
    private int accessibilityFocusedVirtualViewId;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private lm3 actionIdToLabel;
    private final w20 boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private gq1 currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private p1 currentlyAccessibilityFocusedANI;
    private p1 currentlyFocusedANI;
    private List<AccessibilityServiceInfo> enabledServices;
    private final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final Handler handler;
    private bh2 idToAfterMap;
    private bh2 idToBeforeMap;
    private lm3 labelToActionId;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private eh2 paneDisplayed;
    private final dh2 pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final dh2 pendingVerticalScrollEvents;
    private dh2 previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final le1 scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final ul subtreeChangedLayoutNodes;
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private final g84 urlSpanCache;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private le1 onSendAccessibilityEvent = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);

    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public static final void addSetProgressAction(p1 p1Var, ze3 ze3Var) {
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var)) {
                Object objG = ze3Var.d.c.g(te3.h);
                if (objG == null) {
                    objG = null;
                }
                z0 z0Var = (z0) objG;
                if (z0Var != null) {
                    p1Var.a(new j1(null, R.id.accessibilityActionSetProgress, z0Var.a, null));
                }
            }
        }
    }

    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        public static final void addPageActions(p1 p1Var, ze3 ze3Var) {
            ue3 ue3Var = ze3Var.d;
            fi2 fi2Var = ue3Var.c;
            Object objG = ue3Var.c.g(cf3.w);
            if (objG == null) {
                objG = null;
            }
            n73 n73Var = (n73) objG;
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var)) {
                if (n73Var != null && n73Var.a == 8) {
                    return;
                }
                Object objG2 = fi2Var.g(te3.x);
                if (objG2 == null) {
                    objG2 = null;
                }
                z0 z0Var = (z0) objG2;
                if (z0Var != null) {
                    p1Var.a(new j1(null, R.id.accessibilityActionPageUp, z0Var.a, null));
                }
                Object objG3 = fi2Var.g(te3.z);
                if (objG3 == null) {
                    objG3 = null;
                }
                z0 z0Var2 = (z0) objG3;
                if (z0Var2 != null) {
                    p1Var.a(new j1(null, R.id.accessibilityActionPageDown, z0Var2.a, null));
                }
                Object objG4 = fi2Var.g(te3.y);
                if (objG4 == null) {
                    objG4 = null;
                }
                z0 z0Var3 = (z0) objG4;
                if (z0Var3 != null) {
                    p1Var.a(new j1(null, R.id.accessibilityActionPageLeft, z0Var3.a, null));
                }
                Object objG5 = fi2Var.g(te3.A);
                if (objG5 == null) {
                    objG5 = null;
                }
                z0 z0Var4 = (z0) objG5;
                if (z0Var4 != null) {
                    p1Var.a(new j1(null, R.id.accessibilityActionPageRight, z0Var4.a, null));
                }
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ms0 ms0Var) {
            this();
        }
    }

    public final class ComposeAccessibilityNodeProvider extends s1 {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // defpackage.s1
        public void addExtraDataToAccessibilityNodeInfo(int i, p1 p1Var, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i, p1Var, str, bundle);
        }

        @Override // defpackage.s1
        public p1 createAccessibilityNodeInfo(int i) {
            p1 p1VarCreateNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (i == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = p1VarCreateNodeInfo;
                }
                if (i == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = p1VarCreateNodeInfo;
                }
            }
            return p1VarCreateNodeInfo;
        }

        @Override // defpackage.s1
        public p1 findFocus(int i) {
            if (i == 1) {
                if (AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
            }
            if (i == 2) {
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityFocusedVirtualViewId);
            }
            u41.k(ud2.m(i, "Unknown focus type: "));
            return null;
        }

        @Override // defpackage.s1
        public boolean performAction(int i, int i2, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i, i2, bundle);
        }
    }

    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final ze3 node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(ze3 ze3Var, int i, int i2, int i3, int i4, long j) {
            this.node = ze3Var;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final ze3 getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00081 extends ww1 implements je1 {
        final /* synthetic */ ScrollObservationScope $scrollObservationScope;
        final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00081(ScrollObservationScope scrollObservationScope, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
            super(0);
            this.$scrollObservationScope = scrollObservationScope;
            this.this$0 = androidComposeViewAccessibilityDelegateCompat;
        }

        @Override // defpackage.je1
        public /* bridge */ /* synthetic */ Object invoke() {
            m43invoke();
            return w84.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m43invoke() {
            ze3 semanticsNode;
            ux1 ux1Var;
            fb3 horizontalScrollAxisRange = this.$scrollObservationScope.getHorizontalScrollAxisRange();
            fb3 verticalScrollAxisRange = this.$scrollObservationScope.getVerticalScrollAxisRange();
            Float oldXValue = this.$scrollObservationScope.getOldXValue();
            Float oldYValue = this.$scrollObservationScope.getOldYValue();
            float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : ((Number) horizontalScrollAxisRange.a.invoke()).floatValue() - oldXValue.floatValue();
            float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : ((Number) verticalScrollAxisRange.a.invoke()).floatValue() - oldYValue.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iSemanticsNodeIdToAccessibilityVirtualNodeId = this.this$0.semanticsNodeIdToAccessibilityVirtualNodeId(this.$scrollObservationScope.getSemanticsNodeId());
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) this.this$0.getCurrentSemanticsNodes().b(this.this$0.accessibilityFocusedVirtualViewId);
                if (semanticsNodeWithAdjustedBounds != null) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
                    try {
                        p1 p1Var = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                        if (p1Var != null) {
                            p1Var.a.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds));
                        }
                    } catch (IllegalStateException unused) {
                    }
                }
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) this.this$0.getCurrentSemanticsNodes().b(this.this$0.focusedVirtualViewId);
                if (semanticsNodeWithAdjustedBounds2 != null) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.this$0;
                    try {
                        p1 p1Var2 = androidComposeViewAccessibilityDelegateCompat2.currentlyFocusedANI;
                        if (p1Var2 != null) {
                            p1Var2.a.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat2.boundsInScreen(semanticsNodeWithAdjustedBounds2));
                        }
                    } catch (IllegalStateException unused2) {
                    }
                }
                this.this$0.getView().invalidate();
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) this.this$0.getCurrentSemanticsNodes().b(iSemanticsNodeIdToAccessibilityVirtualNodeId);
                if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.getSemanticsNode()) != null && (ux1Var = semanticsNode.c) != null) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this.this$0;
                    if (horizontalScrollAxisRange != null) {
                        androidComposeViewAccessibilityDelegateCompat3.pendingHorizontalScrollEvents.h(iSemanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                    }
                    if (verticalScrollAxisRange != null) {
                        androidComposeViewAccessibilityDelegateCompat3.pendingVerticalScrollEvents.h(iSemanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                    }
                    androidComposeViewAccessibilityDelegateCompat3.notifySubtreeAccessibilityStateChangedIfNeeded(ux1Var);
                }
            }
            if (horizontalScrollAxisRange != null) {
                this.$scrollObservationScope.setOldXValue((Float) horizontalScrollAxisRange.a.invoke());
            }
            if (verticalScrollAxisRange != null) {
                this.$scrollObservationScope.setOldYValue((Float) verticalScrollAxisRange.a.invoke());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00091 extends ww1 implements le1 {
        public static final C00091 INSTANCE = new C00091();

        public C00091() {
            super(1);
        }

        @Override // defpackage.le1
        public final Boolean invoke(ux1 ux1Var) {
            ue3 ue3VarV = ux1Var.v();
            boolean z = false;
            if (ue3VarV != null && ue3VarV.h) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        int[] iArr = {ai.notrack.app.R.id.accessibility_custom_action_0, ai.notrack.app.R.id.accessibility_custom_action_1, ai.notrack.app.R.id.accessibility_custom_action_2, ai.notrack.app.R.id.accessibility_custom_action_3, ai.notrack.app.R.id.accessibility_custom_action_4, ai.notrack.app.R.id.accessibility_custom_action_5, ai.notrack.app.R.id.accessibility_custom_action_6, ai.notrack.app.R.id.accessibility_custom_action_7, ai.notrack.app.R.id.accessibility_custom_action_8, ai.notrack.app.R.id.accessibility_custom_action_9, ai.notrack.app.R.id.accessibility_custom_action_10, ai.notrack.app.R.id.accessibility_custom_action_11, ai.notrack.app.R.id.accessibility_custom_action_12, ai.notrack.app.R.id.accessibility_custom_action_13, ai.notrack.app.R.id.accessibility_custom_action_14, ai.notrack.app.R.id.accessibility_custom_action_15, ai.notrack.app.R.id.accessibility_custom_action_16, ai.notrack.app.R.id.accessibility_custom_action_17, ai.notrack.app.R.id.accessibility_custom_action_18, ai.notrack.app.R.id.accessibility_custom_action_19, ai.notrack.app.R.id.accessibility_custom_action_20, ai.notrack.app.R.id.accessibility_custom_action_21, ai.notrack.app.R.id.accessibility_custom_action_22, ai.notrack.app.R.id.accessibility_custom_action_23, ai.notrack.app.R.id.accessibility_custom_action_24, ai.notrack.app.R.id.accessibility_custom_action_25, ai.notrack.app.R.id.accessibility_custom_action_26, ai.notrack.app.R.id.accessibility_custom_action_27, ai.notrack.app.R.id.accessibility_custom_action_28, ai.notrack.app.R.id.accessibility_custom_action_29, ai.notrack.app.R.id.accessibility_custom_action_30, ai.notrack.app.R.id.accessibility_custom_action_31};
        ch2 ch2Var = fq1.a;
        ch2 ch2Var2 = new ch2(32);
        int i = ch2Var2.b;
        if (i < 0) {
            m51.s(BuildConfig.VERSION_NAME);
            return;
        }
        int i2 = i + 32;
        ch2Var2.d(i2);
        int[] iArr2 = ch2Var2.a;
        int i3 = ch2Var2.b;
        if (i != i3) {
            vl.i0(i2, i, i3, iArr2, iArr2);
        }
        vl.m0(i, 0, 12, iArr, iArr2);
        ch2Var2.b += 32;
        AccessibilityActionsResourceIds = ch2Var2;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.enabledStateListener = new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener() { // from class: w9
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(this.a, z);
            }
        };
        this.touchExplorationStateListener = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: x9
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(this.a, z);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new dh2();
        this.pendingVerticalScrollEvents = new dh2();
        this.actionIdToLabel = new lm3(0);
        this.labelToActionId = new lm3(0);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ul(0);
        this.boundsUpdateChannel = gm4.b(1, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        dh2 dh2Var = hq1.a;
        dh2Var.getClass();
        this.currentSemanticsNodes = dh2Var;
        this.paneDisplayed = new eh2();
        this.idToBeforeMap = new bh2();
        this.idToAfterMap = new bh2();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new g84();
        this.previousSemanticsNodes = new dh2();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().a(), dh2Var);
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }
        });
        this.semanticsChangeChecker = new m3(2, this);
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, p1 p1Var, String str, Bundle bundle) {
        ze3 semanticsNode;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().b(i);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        ue3 ue3Var = semanticsNode.d;
        fi2 fi2Var = ue3Var.c;
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (kr1.n(str, this.ExtraDataTestTraversalBeforeVal)) {
            int iD = this.idToBeforeMap.d(i);
            if (iD != -1) {
                p1Var.a.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (kr1.n(str, this.ExtraDataTestTraversalAfterVal)) {
            int iD2 = this.idToAfterMap.d(i);
            if (iD2 != -1) {
                p1Var.a.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!fi2Var.c(te3.a) || bundle == null || !kr1.n(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            ff3 ff3Var = cf3.x;
            if (!fi2Var.c(ff3Var) || bundle == null || !kr1.n(str, ExtraDataTestTagKey)) {
                if (kr1.n(str, ExtraDataIdKey)) {
                    p1Var.a.getExtras().putInt(str, semanticsNode.g);
                    return;
                }
                return;
            } else {
                Object objG = fi2Var.g(ff3Var);
                String str2 = (String) (objG != null ? objG : null);
                if (str2 != null) {
                    p1Var.a.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i3 > 0 && i2 >= 0) {
            if (i2 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : IntCompanionObject.MAX_VALUE)) {
                xy3 textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(ue3Var);
                if (textLayoutResult == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i2 + i4;
                    if (i5 >= textLayoutResult.a.a.d.length()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.b(i5)));
                    }
                }
                p1Var.a.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e(LogTag, "Invalid arguments for accessibility character locations");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect boundsInScreen(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        AndroidComposeView androidComposeView = this.view;
        float f = adjustedBounds.left;
        long jMo27x2d3fc342 = androidComposeView.mo27x2d3fc342((((long) Float.floatToRawIntBits(adjustedBounds.top)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        long jMo27x2d3fc343 = this.view.mo27x2d3fc342((((long) Float.floatToRawIntBits(adjustedBounds.right)) << 32) | (((long) Float.floatToRawIntBits(adjustedBounds.bottom)) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (jMo27x2d3fc342 >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jMo27x2d3fc342 & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jMo27x2d3fc343 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jMo27x2d3fc343 & 4294967295L))));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX INFO: renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m41xe0e77911(gq1 gq1Var, boolean z, int i, long j) {
        ff3 ff3Var;
        long[] jArr;
        long[] jArr2;
        int i2;
        if (!ln2.c(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
            if (z) {
                ff3Var = cf3.t;
            } else {
                if (z) {
                    u41.e();
                    return false;
                }
                ff3Var = cf3.s;
            }
            Object[] objArr = gq1Var.c;
            long[] jArr3 = gq1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i3 << 3) + i6];
                                Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
                                float f = adjustedBounds.left;
                                i2 = i4;
                                float f2 = adjustedBounds.top;
                                jArr2 = jArr3;
                                float f3 = adjustedBounds.right;
                                float f4 = adjustedBounds.bottom;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                if ((fIntBitsToFloat < f3) & (fIntBitsToFloat >= f) & (fIntBitsToFloat2 >= f2) & (fIntBitsToFloat2 < f4)) {
                                    Object objG = semanticsNodeWithAdjustedBounds.getSemanticsNode().d.c.g(ff3Var);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    fb3 fb3Var = (fb3) objG;
                                    if (fb3Var != null) {
                                        boolean z3 = fb3Var.c;
                                        int i7 = z3 ? -i : i;
                                        if (i == 0 && z3) {
                                            i7 = -1;
                                        }
                                        je1 je1Var = fb3Var.a;
                                        if (i7 < 0) {
                                            if (((Number) je1Var.invoke()).floatValue() > 0.0f) {
                                                z2 = true;
                                            }
                                        } else if (((Number) je1Var.invoke()).floatValue() < ((Number) fb3Var.b.invoke()).floatValue()) {
                                            z2 = true;
                                        }
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i4;
                            }
                            j2 >>= i2;
                            i6++;
                            i4 = i2;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i5 != i4) {
                            return z2;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i3 == length) {
                        return z2;
                    }
                    i3++;
                    jArr3 = jArr;
                }
            }
        }
        return false;
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui_release()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().a(), this.previousSemanticsRoot);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    private final boolean clearAccessibilityFocus(int i) {
        if (!isAccessibilityFocused(i)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
        return true;
    }

    private final AccessibilityEvent createEvent(int i, int i2) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(ClassName);
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, i);
        if (isEnabled$ui_release() && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().b(i)) != null) {
            accessibilityEventObtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().d.c.c(cf3.I));
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p1 createNodeInfo(int i) {
        n32 lifecycleOwner;
        p32 p32VarH;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (p32VarH = lifecycleOwner.h()) == null) ? null : p32VarH.c) != g32.c) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            p1 p1Var = new p1(accessibilityNodeInfoObtain);
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().b(i);
            if (semanticsNodeWithAdjustedBounds != null) {
                ze3 semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
                if (i == -1) {
                    Object parentForAccessibility = this.view.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                    p1Var.b = -1;
                    accessibilityNodeInfoObtain.setParent(view);
                } else {
                    ze3 ze3VarJ = semanticsNode.j();
                    Integer numValueOf = ze3VarJ != null ? Integer.valueOf(ze3VarJ.g) : null;
                    if (numValueOf == null) {
                        po1.c("semanticsNode " + i + " has null parent");
                        u41.p();
                        return null;
                    }
                    int iIntValue = numValueOf.intValue();
                    int i2 = iIntValue != this.view.getSemanticsOwner().a().g ? iIntValue : -1;
                    AndroidComposeView androidComposeView = this.view;
                    p1Var.b = i2;
                    accessibilityNodeInfoObtain.setParent(androidComposeView, i2);
                }
                AndroidComposeView androidComposeView2 = this.view;
                p1Var.c = i;
                accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                accessibilityNodeInfoObtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
                populateAccessibilityNodeInfoProperties(i, p1Var, semanticsNode);
                return p1Var;
            }
        }
        return null;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i, ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (num != null) {
            accessibilityEventCreateEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventCreateEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventCreateEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventCreateEvent.getText().add(charSequence);
        }
        return accessibilityEventCreateEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = z ? androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1) : z21.c;
    }

    private final int getAccessibilitySelectionEnd(ze3 ze3Var) {
        ue3 ue3Var = ze3Var.d;
        if (!ue3Var.c.c(cf3.a)) {
            ff3 ff3Var = cf3.E;
            if (ue3Var.c.c(ff3Var)) {
                return (int) (((jz3) ue3Var.d(ff3Var)).a & 4294967295L);
            }
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionStart(ze3 ze3Var) {
        ue3 ue3Var = ze3Var.d;
        if (!ue3Var.c.c(cf3.a)) {
            ff3 ff3Var = cf3.E;
            if (ue3Var.c.c(ff3Var)) {
                return (int) (((jz3) ue3Var.d(ff3Var)).a >> 32);
            }
        }
        return this.accessibilityCursorPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gq1 getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            if (isEnabled$ui_release()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.setTraversalValues(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    private final String getIterableTextForAccessibility(ze3 ze3Var) {
        hg hgVar;
        if (ze3Var != null) {
            ue3 ue3Var = ze3Var.d;
            fi2 fi2Var = ue3Var.c;
            ff3 ff3Var = cf3.a;
            if (fi2Var.c(ff3Var)) {
                return k62.a(62, ",", (List) ue3Var.d(ff3Var));
            }
            if (fi2Var.c(cf3.D)) {
                hg textForTextField = getTextForTextField(ue3Var);
                if (textForTextField != null) {
                    return textForTextField.d;
                }
            } else {
                Object objG = fi2Var.g(cf3.z);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (hgVar = (hg) ke0.z0(list)) != null) {
                    return hgVar.d;
                }
            }
        }
        return null;
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(ze3 ze3Var, int i) {
        xy3 textLayoutResult;
        if (ze3Var == null) {
            return null;
        }
        ue3 ue3Var = ze3Var.d;
        String iterableTextForAccessibility = getIterableTextForAccessibility(ze3Var);
        if (iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (i == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator companion = AccessibilityIterators.CharacterTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
            return companion;
        }
        if (i == 2) {
            AccessibilityIterators.WordTextSegmentIterator companion2 = AccessibilityIterators.WordTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion2.initialize(iterableTextForAccessibility);
            return companion2;
        }
        if (i != 4) {
            if (i == 8) {
                AccessibilityIterators.ParagraphTextSegmentIterator companion3 = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                companion3.initialize(iterableTextForAccessibility);
                return companion3;
            }
            if (i != 16) {
                return null;
            }
        }
        if (!ue3Var.c.c(te3.a) || (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(ue3Var)) == null) {
            return null;
        }
        if (i == 4) {
            AccessibilityIterators.LineTextSegmentIterator companion4 = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
            companion4.initialize(iterableTextForAccessibility, textLayoutResult);
            return companion4;
        }
        AccessibilityIterators.PageTextSegmentIterator companion5 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
        companion5.initialize(iterableTextForAccessibility, textLayoutResult, ze3Var);
        return companion5;
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    private final hg getTextForTextField(ue3 ue3Var) {
        ff3 ff3Var = cf3.a;
        return (hg) y64.B(ue3Var, cf3.D);
    }

    private final boolean isAccessibilityFocused(int i) {
        return this.accessibilityFocusedVirtualViewId == i;
    }

    private final boolean isAccessibilitySelectionExtendable(ze3 ze3Var) {
        if (ze3Var.d.c.c(cf3.a)) {
            return false;
        }
        return ze3Var.d.c.c(cf3.D);
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(ux1 ux1Var) {
        if (this.subtreeChangedLayoutNodes.add(ux1Var)) {
            this.boundsUpdateChannel.i(w84.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:139:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:234:0x0311  */
    /* JADX WARN: Code duplicated, block: B:236:0x0315  */
    /* JADX WARN: Code duplicated, block: B:237:0x0317  */
    /* JADX WARN: Code duplicated, block: B:240:0x031c  */
    /* JADX WARN: Code duplicated, block: B:241:0x031e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0324  */
    /* JADX WARN: Code duplicated, block: B:245:0x0326  */
    /* JADX WARN: Code duplicated, block: B:248:0x032c  */
    /* JADX WARN: Code duplicated, block: B:249:0x032e  */
    /* JADX WARN: Code duplicated, block: B:252:0x0334  */
    /* JADX WARN: Code duplicated, block: B:253:0x0336  */
    /* JADX WARN: Code duplicated, block: B:256:0x033c  */
    /* JADX WARN: Code duplicated, block: B:257:0x033e  */
    /* JADX WARN: Code duplicated, block: B:264:0x034a  */
    /* JADX WARN: Code duplicated, block: B:271:0x0356  */
    /* JADX WARN: Code duplicated, block: B:275:0x035c  */
    /* JADX WARN: Code duplicated, block: B:276:0x035f  */
    /* JADX WARN: Code duplicated, block: B:278:0x0367  */
    /* JADX WARN: Code duplicated, block: B:281:0x0372  */
    /* JADX WARN: Code duplicated, block: B:284:0x0377  */
    /* JADX WARN: Code duplicated, block: B:286:0x037d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0385  */
    /* JADX WARN: Code duplicated, block: B:291:0x038e  */
    /* JADX WARN: Code duplicated, block: B:294:0x0393  */
    /* JADX WARN: Code duplicated, block: B:296:0x0398  */
    /* JADX WARN: Code duplicated, block: B:298:0x039e  */
    /* JADX WARN: Code duplicated, block: B:301:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:305:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:309:0x03da  */
    /* JADX WARN: Code duplicated, block: B:311:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:314:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:357:0x0468  */
    /* JADX WARN: Code duplicated, block: B:359:0x0470  */
    /* JADX WARN: Code duplicated, block: B:362:0x0475 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:364:0x0479  */
    /* JADX WARN: Code duplicated, block: B:365:0x047e  */
    /* JADX WARN: Code duplicated, block: B:367:0x048c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:368:0x048e  */
    /* JADX WARN: Code duplicated, block: B:371:0x0493  */
    /* JADX WARN: Code duplicated, block: B:374:0x049a  */
    /* JADX WARN: Code duplicated, block: B:376:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:383:0x04be  */
    /* JADX WARN: Code duplicated, block: B:385:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:388:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:390:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:393:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:396:0x04db  */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0172, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performActionHelper(int r20, int r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 1580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(fb3 fb3Var, float f) {
        if (f >= 0.0f || ((Number) fb3Var.a.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) fb3Var.a.invoke()).floatValue() < ((Number) fb3Var.b.invoke()).floatValue();
        }
        return true;
    }

    private static final float performActionHelper$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    private final void populateAccessibilityNodeInfoProperties(int i, p1 p1Var, ze3 ze3Var) {
        int i2;
        View viewSemanticsIdToView;
        boolean zBooleanValue;
        Resources resources = this.view.getContext().getResources();
        p1Var.f(ClassName);
        AccessibilityNodeInfo accessibilityNodeInfo = p1Var.a;
        ue3 ue3Var = ze3Var.d;
        fi2 fi2Var = ue3Var.c;
        if (ue3Var.c.c(cf3.D)) {
            p1Var.f(TextFieldClassName);
        }
        if (fi2Var.c(cf3.z)) {
            p1Var.f(TextClassName);
        }
        Object objG = fi2Var.g(cf3.w);
        if (objG == null) {
            objG = null;
        }
        n73 n73Var = (n73) objG;
        int i3 = 2;
        if (n73Var != null) {
            int i4 = n73Var.a;
            if (ze3Var.e || ze3.h(ze3Var, 4).isEmpty()) {
                if (i4 == 4) {
                    accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(ai.notrack.app.R.string.tab));
                } else if (i4 == 2) {
                    accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(ai.notrack.app.R.string.switch_role));
                } else {
                    String strM124x239bb0bb = SemanticsUtils_androidKt.m124x239bb0bb(i4);
                    if (i4 != 5 || ze3Var.l() || ue3Var.h) {
                        p1Var.f(strM124x239bb0bb);
                    }
                }
            }
        }
        accessibilityNodeInfo.setPackageName(this.view.getContext().getPackageName());
        accessibilityNodeInfo.setImportantForAccessibility(SemanticsUtils_androidKt.isImportantForAccessibility(ze3Var));
        List listH = ze3.h(ze3Var, 4);
        int size = listH.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i3;
            ze3 ze3Var2 = (ze3) listH.get(i5);
            if (getCurrentSemanticsNodes().a(ze3Var2.g)) {
                View view = (me) this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(ze3Var2.c);
                int i7 = ze3Var2.g;
                if (i7 != -1) {
                    if (view != null) {
                        accessibilityNodeInfo.addChild(view);
                    } else {
                        accessibilityNodeInfo.addChild(this.view, i7);
                    }
                }
            }
            i5++;
            i3 = i6;
        }
        int i8 = i3;
        if (i == this.accessibilityFocusedVirtualViewId) {
            accessibilityNodeInfo.setAccessibilityFocused(true);
            p1Var.a(j1.d);
        } else {
            accessibilityNodeInfo.setAccessibilityFocused(false);
            p1Var.a(j1.c);
        }
        setText(ze3Var, p1Var);
        setContentInvalid(ze3Var, p1Var);
        CharSequence infoStateDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoStateDescriptionOrNull(ze3Var, resources);
        if (Build.VERSION.SDK_INT >= 30) {
            k1.h(accessibilityNodeInfo, infoStateDescriptionOrNull);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", infoStateDescriptionOrNull);
        }
        accessibilityNodeInfo.setCheckable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoIsCheckable(ze3Var));
        Object objG2 = fi2Var.g(cf3.H);
        if (objG2 == null) {
            objG2 = null;
        }
        e14 e14Var = (e14) objG2;
        if (e14Var != null) {
            if (e14Var == e14.c) {
                accessibilityNodeInfo.setChecked(true);
            } else if (e14Var == e14.d) {
                accessibilityNodeInfo.setChecked(false);
            }
        }
        Object objG3 = fi2Var.g(cf3.G);
        if (objG3 == null) {
            objG3 = null;
        }
        Boolean bool = (Boolean) objG3;
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (n73Var == null) {
                i2 = 4;
            } else {
                i2 = 4;
                if (n73Var.a == 4) {
                    accessibilityNodeInfo.setSelected(zBooleanValue2);
                }
            }
            accessibilityNodeInfo.setChecked(zBooleanValue2);
        } else {
            i2 = 4;
        }
        if (!ue3Var.h || ze3.h(ze3Var, i2).isEmpty()) {
            Object objG4 = fi2Var.g(cf3.a);
            if (objG4 == null) {
                objG4 = null;
            }
            List list = (List) objG4;
            accessibilityNodeInfo.setContentDescription(list != null ? (String) ke0.z0(list) : null);
        }
        Object objG5 = fi2Var.g(cf3.x);
        if (objG5 == null) {
            objG5 = null;
        }
        String str = (String) objG5;
        if (str != null) {
            ze3 ze3VarJ = ze3Var;
            while (true) {
                if (ze3VarJ == null) {
                    zBooleanValue = false;
                    break;
                }
                ue3 ue3Var2 = ze3VarJ.d;
                ff3 ff3Var = df3.a;
                if (ue3Var2.c.c(ff3Var)) {
                    zBooleanValue = ((Boolean) ue3Var2.d(ff3Var)).booleanValue();
                    break;
                }
                ze3VarJ = ze3VarJ.j();
            }
            if (zBooleanValue) {
                accessibilityNodeInfo.setViewIdResourceName(str);
            }
        }
        Object objG6 = fi2Var.g(cf3.h);
        if (objG6 == null) {
            objG6 = null;
        }
        if (((w84) objG6) != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityNodeInfo.setHeading(true);
            } else {
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | 2);
                }
            }
        }
        accessibilityNodeInfo.setPassword(fi2Var.c(cf3.I));
        accessibilityNodeInfo.setEditable(fi2Var.c(cf3.L));
        Object objG7 = fi2Var.g(cf3.M);
        if (objG7 == null) {
            objG7 = null;
        }
        Integer num = (Integer) objG7;
        accessibilityNodeInfo.setMaxTextLength(num != null ? num.intValue() : -1);
        accessibilityNodeInfo.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var));
        ff3 ff3Var2 = cf3.k;
        accessibilityNodeInfo.setFocusable(fi2Var.c(ff3Var2));
        if (accessibilityNodeInfo.isFocusable()) {
            accessibilityNodeInfo.setFocused(((Boolean) ue3Var.d(ff3Var2)).booleanValue());
            if (accessibilityNodeInfo.isFocused()) {
                accessibilityNodeInfo.addAction(i8);
                this.focusedVirtualViewId = i;
            } else {
                accessibilityNodeInfo.addAction(1);
            }
        }
        accessibilityNodeInfo.setVisibleToUser(!SemanticsUtils_androidKt.isHidden(ze3Var));
        Object objG8 = fi2Var.g(cf3.j);
        if (objG8 == null) {
            objG8 = null;
        }
        if (objG8 != null) {
            m51.t();
            return;
        }
        accessibilityNodeInfo.setClickable(false);
        Object objG9 = fi2Var.g(te3.b);
        if (objG9 == null) {
            objG9 = null;
        }
        z0 z0Var = (z0) objG9;
        if (z0Var != null) {
            Object objG10 = fi2Var.g(cf3.G);
            if (objG10 == null) {
                objG10 = null;
            }
            boolean zN = kr1.n(objG10, Boolean.TRUE);
            boolean z = (n73Var != null && n73Var.a == 4) || (n73Var != null && n73Var.a == 3);
            accessibilityNodeInfo.setClickable(!z || (z && !zN));
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var) && accessibilityNodeInfo.isClickable()) {
                p1Var.a(new j1(null, 16, z0Var.a, null));
            }
        }
        accessibilityNodeInfo.setLongClickable(false);
        Object objG11 = fi2Var.g(te3.c);
        if (objG11 == null) {
            objG11 = null;
        }
        z0 z0Var2 = (z0) objG11;
        if (z0Var2 != null) {
            accessibilityNodeInfo.setLongClickable(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var)) {
                p1Var.a(new j1(null, 32, z0Var2.a, null));
            }
        }
        Object objG12 = fi2Var.g(te3.p);
        if (objG12 == null) {
            objG12 = null;
        }
        z0 z0Var3 = (z0) objG12;
        if (z0Var3 != null) {
            p1Var.a(new j1(null, 16384, z0Var3.a, null));
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var)) {
            Object objG13 = fi2Var.g(te3.j);
            if (objG13 == null) {
                objG13 = null;
            }
            z0 z0Var4 = (z0) objG13;
            if (z0Var4 != null) {
                p1Var.a(new j1(null, 2097152, z0Var4.a, null));
            }
            Object objG14 = fi2Var.g(te3.o);
            if (objG14 == null) {
                objG14 = null;
            }
            z0 z0Var5 = (z0) objG14;
            if (z0Var5 != null) {
                p1Var.a(new j1(null, R.id.accessibilityActionImeEnter, z0Var5.a, null));
            }
            Object objG15 = fi2Var.g(te3.q);
            if (objG15 == null) {
                objG15 = null;
            }
            z0 z0Var6 = (z0) objG15;
            if (z0Var6 != null) {
                p1Var.a(new j1(null, 65536, z0Var6.a, null));
            }
            Object objG16 = fi2Var.g(te3.r);
            if (objG16 == null) {
                objG16 = null;
            }
            z0 z0Var7 = (z0) objG16;
            if (z0Var7 != null && accessibilityNodeInfo.isFocused() && this.view.getClipboardManager().hasText()) {
                p1Var.a(new j1(null, 32768, z0Var7.a, null));
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(ze3Var);
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            accessibilityNodeInfo.setTextSelection(getAccessibilitySelectionStart(ze3Var), getAccessibilitySelectionEnd(ze3Var));
            Object objG17 = fi2Var.g(te3.i);
            if (objG17 == null) {
                objG17 = null;
            }
            z0 z0Var8 = (z0) objG17;
            p1Var.a(new j1(null, 131072, z0Var8 != null ? z0Var8.a : null, null));
            accessibilityNodeInfo.addAction(FontInfo.NUMBER_OF_CHAR_CODES);
            accessibilityNodeInfo.addAction(ConstantsKt.MINIMUM_BLOCK_SIZE);
            accessibilityNodeInfo.setMovementGranularities(11);
            Object objG18 = fi2Var.g(cf3.a);
            if (objG18 == null) {
                objG18 = null;
            }
            List list2 = (List) objG18;
            if ((list2 == null || list2.isEmpty()) && fi2Var.c(te3.a) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(ze3Var)) {
                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities() | 20);
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ExtraDataIdKey);
            CharSequence charSequenceE = p1Var.e();
            if (charSequenceE != null && charSequenceE.length() != 0 && fi2Var.c(te3.a)) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (fi2Var.c(cf3.x)) {
                arrayList.add(ExtraDataTestTagKey);
            }
            if (i9 >= 26) {
                accessibilityNodeInfo.setAvailableExtraData(arrayList);
            }
        }
        Object objG19 = fi2Var.g(cf3.c);
        if (objG19 == null) {
            objG19 = null;
        }
        h03 h03Var = (h03) objG19;
        if (h03Var != null) {
            float f = h03Var.a;
            od0 od0Var = h03Var.b;
            ff3 ff3Var3 = te3.h;
            if (fi2Var.c(ff3Var3)) {
                p1Var.f("android.widget.SeekBar");
            } else {
                p1Var.f("android.widget.ProgressBar");
            }
            if (h03Var != h03.d) {
                accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, od0Var.a, od0Var.b, f));
            }
            if (fi2Var.c(ff3Var3) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var)) {
                float f2 = od0Var.b;
                float f3 = od0Var.a;
                if (f2 < f3) {
                    f2 = f3;
                }
                if (f < f2) {
                    p1Var.a(j1.e);
                }
                float f4 = od0Var.a;
                float f5 = od0Var.b;
                if (f4 > f5) {
                    f4 = f5;
                }
                if (f > f4) {
                    p1Var.a(j1.f);
                }
            }
        }
        Api24Impl.addSetProgressAction(p1Var, ze3Var);
        CollectionInfo_androidKt.setCollectionInfo(ze3Var, p1Var);
        CollectionInfo_androidKt.setCollectionItemInfo(ze3Var, p1Var);
        Object objG20 = fi2Var.g(cf3.s);
        if (objG20 == null) {
            objG20 = null;
        }
        fb3 fb3Var = (fb3) objG20;
        Object objG21 = fi2Var.g(te3.d);
        if (objG21 == null) {
            objG21 = null;
        }
        z0 z0Var9 = (z0) objG21;
        if (fb3Var != null && z0Var9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(ze3Var)) {
                p1Var.f("android.widget.HorizontalScrollView");
            }
            if (((Number) fb3Var.b.invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfo.setScrollable(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(fb3Var)) {
                    p1Var.a(j1.e);
                    p1Var.a(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(ze3Var) ? j1.j : j1.h);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(fb3Var)) {
                    p1Var.a(j1.f);
                    p1Var.a(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(ze3Var) ? j1.h : j1.j);
                }
            }
        }
        Object objG22 = fi2Var.g(cf3.t);
        if (objG22 == null) {
            objG22 = null;
        }
        fb3 fb3Var2 = (fb3) objG22;
        if (fb3Var2 != null && z0Var9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(ze3Var)) {
                p1Var.f("android.widget.ScrollView");
            }
            if (((Number) fb3Var2.b.invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfo.setScrollable(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(fb3Var2)) {
                    p1Var.a(j1.e);
                    p1Var.a(j1.i);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(fb3Var2)) {
                    p1Var.a(j1.f);
                    p1Var.a(j1.g);
                }
            }
        }
        if (i9 >= 29) {
            Api29Impl.addPageActions(p1Var, ze3Var);
        }
        Object objG23 = fi2Var.g(cf3.d);
        if (objG23 == null) {
            objG23 = null;
        }
        CharSequence charSequence = (CharSequence) objG23;
        if (i9 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var)) {
            Object objG24 = fi2Var.g(te3.s);
            if (objG24 == null) {
                objG24 = null;
            }
            z0 z0Var10 = (z0) objG24;
            if (z0Var10 != null) {
                p1Var.a(new j1(null, 262144, z0Var10.a, null));
            }
            Object objG25 = fi2Var.g(te3.t);
            if (objG25 == null) {
                objG25 = null;
            }
            z0 z0Var11 = (z0) objG25;
            if (z0Var11 != null) {
                p1Var.a(new j1(null, 524288, z0Var11.a, null));
            }
            Object objG26 = fi2Var.g(te3.u);
            if (objG26 == null) {
                objG26 = null;
            }
            z0 z0Var12 = (z0) objG26;
            if (z0Var12 != null) {
                p1Var.a(new j1(null, 1048576, z0Var12.a, null));
            }
            ff3 ff3Var4 = te3.w;
            if (fi2Var.c(ff3Var4)) {
                List list3 = (List) ue3Var.d(ff3Var4);
                int size2 = list3.size();
                eq1 eq1Var = AccessibilityActionsResourceIds;
                if (size2 >= eq1Var.b) {
                    u41.r(fq2.q(new StringBuilder("Can't have more than "), eq1Var.b, " custom actions for one widget"));
                    return;
                }
                lm3 lm3Var = new lm3(0);
                rh2 rh2Var = cn2.a;
                rh2 rh2Var2 = new rh2();
                lm3 lm3Var2 = this.labelToActionId;
                if (gm4.g(lm3Var2.h, i, lm3Var2.c) >= 0) {
                    rh2 rh2Var3 = (rh2) this.labelToActionId.b(i);
                    int[] iArrCopyOf = new int[16];
                    int[] iArr = eq1Var.a;
                    int i10 = eq1Var.b;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < i10) {
                        int i13 = iArr[i11];
                        int i14 = i10;
                        int i15 = i12 + 1;
                        rh2 rh2Var4 = rh2Var3;
                        if (iArrCopyOf.length < i15) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i15, (iArrCopyOf.length * 3) / 2));
                        }
                        iArrCopyOf[i12] = i13;
                        i11++;
                        i12 = i15;
                        i10 = i14;
                        rh2Var3 = rh2Var4;
                    }
                    rh2 rh2Var5 = rh2Var3;
                    ArrayList arrayList2 = new ArrayList();
                    if (list3.size() > 0) {
                        if (list3.get(0) != null) {
                            m51.t();
                            return;
                        } else {
                            rh2Var5.getClass();
                            throw null;
                        }
                    }
                    if (arrayList2.size() > 0) {
                        if (arrayList2.get(0) != null) {
                            m51.t();
                            return;
                        } else if (i12 <= 0) {
                            m51.s("Index must be between 0 and size");
                            return;
                        } else {
                            int i16 = iArrCopyOf[0];
                            throw null;
                        }
                    }
                } else if (list3.size() > 0) {
                    if (list3.get(0) != null) {
                        m51.t();
                        return;
                    } else {
                        eq1Var.a(0);
                        throw null;
                    }
                }
                this.actionIdToLabel.c(i, lm3Var);
                this.labelToActionId.c(i, rh2Var2);
            }
        }
        boolean zIsScreenReaderFocusable = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isScreenReaderFocusable(ze3Var, resources);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(zIsScreenReaderFocusable);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (zIsScreenReaderFocusable ? 1 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        int iD = this.idToBeforeMap.d(i);
        if (iD != -1) {
            View viewSemanticsIdToView2 = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), iD);
            if (viewSemanticsIdToView2 != null) {
                accessibilityNodeInfo.setTraversalBefore(viewSemanticsIdToView2);
            } else {
                accessibilityNodeInfo.setTraversalBefore(this.view, iD);
            }
            addExtraDataToAccessibilityNodeInfoHelper(i, p1Var, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int iD2 = this.idToAfterMap.d(i);
        if (iD2 == -1 || (viewSemanticsIdToView = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), iD2)) == null) {
            return;
        }
        accessibilityNodeInfo.setTraversalAfter(viewSemanticsIdToView);
        addExtraDataToAccessibilityNodeInfoHelper(i, p1Var, this.ExtraDataTestTraversalAfterVal, null);
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(fb3 fb3Var) {
        je1 je1Var = fb3Var.a;
        boolean z = fb3Var.c;
        if (((Number) je1Var.invoke()).floatValue() <= 0.0f || z) {
            return ((Number) fb3Var.a.invoke()).floatValue() < ((Number) fb3Var.b.invoke()).floatValue() && z;
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(fb3 fb3Var) {
        je1 je1Var = fb3Var.a;
        boolean z = fb3Var.c;
        if (((Number) je1Var.invoke()).floatValue() >= ((Number) fb3Var.b.invoke()).floatValue() || z) {
            return ((Number) fb3Var.a.invoke()).floatValue() > 0.0f && z;
        }
        return true;
    }

    private final boolean registerScrollingId(int i, List<ScrollObservationScope> list) {
        boolean z;
        ScrollObservationScope scrollObservationScopeFindById = SemanticsUtils_androidKt.findById(list, i);
        if (scrollObservationScopeFindById != null) {
            z = false;
        } else {
            ScrollObservationScope scrollObservationScope = new ScrollObservationScope(i, this.scrollObservationScopes, null, null, null, null);
            z = true;
            scrollObservationScopeFindById = scrollObservationScope;
        }
        this.scrollObservationScopes.add(scrollObservationScopeFindById);
        return z;
    }

    private final boolean requestAccessibilityFocus(int i) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i)) {
            return false;
        }
        int i2 = this.accessibilityFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i2, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = i;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().a(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new C00081(scrollObservationScope, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$37(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            androidComposeViewAccessibilityDelegateCompat.view.measureAndLayout(true);
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i) {
        if (i == this.view.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:1: B:15:0x0051->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[EDGE_INSN: B:42:0x0090->B:29:0x0090 BREAK  A[LOOP:1: B:15:0x0051->B:28:0x008d], SYNTHETIC] */
    private final void sendAccessibilitySemanticsStructureChangeEvents(ze3 ze3Var, SemanticsNodeCopy semanticsNodeCopy) {
        int[] iArr = pq1.a;
        eh2 eh2Var = new eh2();
        ze3Var.getClass();
        List listH = ze3.h(ze3Var, 4);
        ux1 ux1Var = ze3Var.c;
        int size = listH.size();
        for (int i = 0; i < size; i++) {
            ze3 ze3Var2 = (ze3) listH.get(i);
            gq1 currentSemanticsNodes = getCurrentSemanticsNodes();
            int i2 = ze3Var2.g;
            if (currentSemanticsNodes.a(i2)) {
                if (!semanticsNodeCopy.getChildren().b(i2)) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(ux1Var);
                    return;
                }
                eh2Var.a(i2);
            }
        }
        eh2 children = semanticsNodeCopy.getChildren();
        int[] iArr2 = children.b;
        long[] jArr = children.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !eh2Var.b(iArr2[(i3 << 3) + i5])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(ux1Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listH2 = ze3.h(ze3Var, 4);
        int size2 = listH2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ze3 ze3Var3 = (ze3) listH2.get(i6);
            if (getCurrentSemanticsNodes().a(ze3Var3.g)) {
                Object objB = this.previousSemanticsNodes.b(ze3Var3.g);
                objB.getClass();
                sendAccessibilitySemanticsStructureChangeEvents(ze3Var3, (SemanticsNodeCopy) objB);
            }
        }
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled$ui_release()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return ((Boolean) this.onSendAccessibilityEvent.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean sendEventForVirtualView(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i, i2);
        if (num != null) {
            accessibilityEventCreateEvent.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventCreateEvent.setContentDescription(k62.a(62, ",", list));
        }
        return sendEvent(accessibilityEventCreateEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final void sendPaneChangeEvents(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i), 32);
        accessibilityEventCreateEvent.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventCreateEvent.getText().add(str);
        }
        sendEvent(accessibilityEventCreateEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i != pendingTextTraversedEvent.getNode().g) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().g), 131072);
                accessibilityEventCreateEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                accessibilityEventCreateEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                accessibilityEventCreateEvent.setAction(pendingTextTraversedEvent.getAction());
                accessibilityEventCreateEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                accessibilityEventCreateEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(accessibilityEventCreateEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:105:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:108:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f7 A[LOOP:4: B:112:0x02e6->B:117:0x02f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x0305  */
    /* JADX WARN: Code duplicated, block: B:125:0x0319 A[LOOP:5: B:120:0x0301->B:125:0x0319, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x0346 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x034c  */
    /* JADX WARN: Code duplicated, block: B:134:0x034f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x0356  */
    /* JADX WARN: Code duplicated, block: B:139:0x035a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x035c  */
    /* JADX WARN: Code duplicated, block: B:145:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:149:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:150:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x03db  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:158:0x0423  */
    /* JADX WARN: Code duplicated, block: B:160:0x0429  */
    /* JADX WARN: Code duplicated, block: B:161:0x042b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0433  */
    /* JADX WARN: Code duplicated, block: B:165:0x0445  */
    /* JADX WARN: Code duplicated, block: B:168:0x0454  */
    /* JADX WARN: Code duplicated, block: B:170:0x0460  */
    /* JADX WARN: Code duplicated, block: B:172:0x0468  */
    /* JADX WARN: Code duplicated, block: B:174:0x0473  */
    /* JADX WARN: Code duplicated, block: B:176:0x0491  */
    /* JADX WARN: Code duplicated, block: B:178:0x049b  */
    /* JADX WARN: Code duplicated, block: B:180:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:182:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:184:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:186:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:190:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:195:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:198:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:200:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:202:0x050d  */
    /* JADX WARN: Code duplicated, block: B:233:0x04e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0300 A[EDGE_INSN: B:244:0x0300->B:119:0x0300 BREAK  A[LOOP:4: B:112:0x02e6->B:117:0x02f7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x031e A[EDGE_INSN: B:246:0x031e->B:127:0x031e BREAK  A[LOOP:5: B:120:0x0301->B:125:0x0319], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0117  */
    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x014a  */
    /* JADX WARN: Code duplicated, block: B:52:0x018b  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:72:0x021b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0225  */
    /* JADX WARN: Code duplicated, block: B:76:0x022a  */
    /* JADX WARN: Code duplicated, block: B:79:0x023a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0240  */
    /* JADX WARN: Code duplicated, block: B:83:0x0245  */
    /* JADX WARN: Code duplicated, block: B:85:0x0249  */
    /* JADX WARN: Code duplicated, block: B:87:0x024e  */
    /* JADX WARN: Code duplicated, block: B:89:0x025a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0282  */
    /* JADX WARN: Code duplicated, block: B:93:0x028b  */
    /* JADX WARN: Code duplicated, block: B:94:0x029f  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b9  */
    private final void sendSemanticsPropertyChangeEvents(gq1 gq1Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        int i2;
        int i3;
        Integer num2;
        int i4;
        int i5;
        Integer num3;
        int i6;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i7;
        int i8;
        int i9;
        Integer num4;
        int i10;
        int i11;
        ze3 ze3Var;
        int i12;
        boolean zPropertiesDeleted;
        int i13;
        Object[] objArr;
        fi2 fi2Var;
        Object[] objArr2;
        int i14;
        int i15;
        int i16;
        int i17;
        Integer num5;
        int i18;
        int i19;
        int i20;
        Object[] objArr3;
        Object[] objArr4;
        ArrayList arrayList3;
        int i21;
        fi2 fi2Var2;
        int i22;
        int i23;
        Integer num6;
        boolean zRegisterScrollingId;
        ff3 ff3Var;
        boolean zN;
        Integer num7;
        ff3 ff3Var2;
        Integer num8;
        ff3 ff3Var3;
        boolean zN2;
        ff3 ff3Var4;
        List list;
        List list2;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        Object objG;
        Object objG2;
        hg textForTextField;
        String str;
        hg textForTextField2;
        CharSequence textForTextField3;
        CharSequence charSequenceTrimToSize;
        int length;
        int length2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean zC;
        boolean z;
        boolean z2;
        AccessibilityEvent accessibilityEventCreateTextSelectionChangedEvent;
        Object objG3;
        n73 n73Var;
        Object objG4;
        AccessibilityEvent accessibilityEventCreateEvent;
        Object objG5;
        List list3;
        String strA;
        Object objG6;
        List list4;
        String strA2;
        String str2;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
        gq1 gq1Var2 = gq1Var;
        Integer num9 = 64;
        ArrayList arrayList4 = new ArrayList(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes);
        androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes.clear();
        int[] iArr3 = gq1Var2.b;
        long[] jArr3 = gq1Var2.a;
        int i30 = 2;
        int length3 = jArr3.length - 2;
        int i31 = 0;
        Integer num10 = 0;
        if (length3 < 0) {
            return;
        }
        int i32 = 0;
        while (true) {
            long j = jArr3[i32];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i33 = 8;
                int i34 = 8 - ((~(i32 - length3)) >>> 31);
                long j2 = j;
                int i35 = i31;
                while (i35 < i34) {
                    if ((j2 & 255) < 128) {
                        int i36 = iArr3[(i32 << 3) + i35];
                        SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) androidComposeViewAccessibilityDelegateCompat.previousSemanticsNodes.b(i36);
                        if (semanticsNodeCopy == null) {
                            i5 = i35;
                            num3 = num9;
                            i6 = i34;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i7 = i30;
                            i8 = length3;
                            i9 = i31;
                            num4 = num10;
                            i10 = i32;
                        } else {
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) gq1Var2.b(i36);
                            ze3 semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode == null) {
                                throw fq2.i("no value for specified key");
                            }
                            i7 = i30;
                            ux1 ux1Var = semanticsNode.c;
                            ue3 ue3Var = semanticsNode.d;
                            int i37 = i34;
                            int i38 = semanticsNode.g;
                            fi2 fi2Var3 = ue3Var.c;
                            ze3 ze3Var2 = semanticsNode;
                            Object[] objArr5 = fi2Var3.b;
                            Object[] objArr6 = fi2Var3.c;
                            long[] jArr4 = fi2Var3.a;
                            int i39 = i33;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                Integer num11 = num9;
                                fi2 fi2Var4 = fi2Var3;
                                zPropertiesDeleted = false;
                                int i40 = 0;
                                while (true) {
                                    long j3 = jArr4[i40];
                                    int i41 = length4;
                                    long[] jArr5 = jArr4;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i42 = 8 - ((~(i40 - i41)) >>> 31);
                                        long j4 = j3;
                                        int i43 = 0;
                                        while (i43 < i42) {
                                            if ((j4 & 255) < 128) {
                                                int i44 = (i40 << 3) + i43;
                                                Object obj = objArr5[i44];
                                                Object obj2 = objArr6[i44];
                                                ff3 ff3Var5 = (ff3) obj;
                                                i16 = i35;
                                                ff3 ff3Var6 = cf3.s;
                                                if (kr1.n(ff3Var5, ff3Var6)) {
                                                    i17 = i43;
                                                } else {
                                                    i17 = i43;
                                                    if (!kr1.n(ff3Var5, cf3.t)) {
                                                        zRegisterScrollingId = false;
                                                    }
                                                    if (zRegisterScrollingId || !kr1.n(obj2, y64.B(semanticsNodeCopy.getUnmergedConfig(), ff3Var5))) {
                                                        ff3Var = cf3.d;
                                                        if (kr1.n(ff3Var5, ff3Var)) {
                                                            obj2.getClass();
                                                            str2 = (String) obj2;
                                                            if (semanticsNodeCopy.getUnmergedConfig().c.c(ff3Var)) {
                                                                androidComposeViewAccessibilityDelegateCompat.sendPaneChangeEvents(i36, i39, str2);
                                                            }
                                                        } else {
                                                            if (kr1.n(ff3Var5, cf3.b)) {
                                                                zN = true;
                                                            } else {
                                                                zN = kr1.n(ff3Var5, cf3.H);
                                                            }
                                                            if (zN) {
                                                                int i45 = i38;
                                                                iArr3 = iArr3;
                                                                ze3Var2 = ze3Var2;
                                                                jArr3 = jArr3;
                                                                i15 = i45;
                                                                i23 = i42;
                                                                objArr3 = objArr6;
                                                                Integer num12 = num11;
                                                                i19 = i32;
                                                                objArr4 = objArr5;
                                                                i21 = i40;
                                                                Integer num13 = num10;
                                                                i18 = i37;
                                                                fi2Var2 = fi2Var4;
                                                                arrayList3 = arrayList4;
                                                                i20 = length3;
                                                                i22 = i36;
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i36), 2048, num12, null, 8, null);
                                                                num5 = num12;
                                                                num6 = num13;
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                            } else {
                                                                int i46 = i38;
                                                                iArr3 = iArr3;
                                                                ze3Var2 = ze3Var2;
                                                                jArr3 = jArr3;
                                                                i15 = i46;
                                                                i23 = i42;
                                                                objArr3 = objArr6;
                                                                num5 = num11;
                                                                i19 = i32;
                                                                objArr4 = objArr5;
                                                                i21 = i40;
                                                                num7 = num10;
                                                                i18 = i37;
                                                                fi2Var2 = fi2Var4;
                                                                arrayList3 = arrayList4;
                                                                i20 = length3;
                                                                i22 = i36;
                                                                if (kr1.n(ff3Var5, cf3.c)) {
                                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num5, null, 8, null);
                                                                    num6 = num7;
                                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                                } else {
                                                                    num6 = num7;
                                                                    ff3Var2 = cf3.G;
                                                                    if (kr1.n(ff3Var5, ff3Var2)) {
                                                                        objG3 = fi2Var2.g(cf3.w);
                                                                        if (objG3 == null) {
                                                                            objG3 = null;
                                                                        }
                                                                        n73Var = (n73) objG3;
                                                                        if (n73Var == null && n73Var.a == 4) {
                                                                            objG4 = fi2Var2.g(ff3Var2);
                                                                            if (objG4 == null) {
                                                                                objG4 = null;
                                                                            }
                                                                            if (kr1.n(objG4, Boolean.TRUE)) {
                                                                                accessibilityEventCreateEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 4);
                                                                                ze3 ze3Var3 = new ze3(ze3Var2.a, true, ux1Var, ue3Var);
                                                                                objG5 = ze3Var3.i().c.g(cf3.a);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                list3 = (List) objG5;
                                                                                if (list3 != null) {
                                                                                    strA = k62.a(62, ",", list3);
                                                                                } else {
                                                                                    strA = null;
                                                                                }
                                                                                objG6 = ze3Var3.i().c.g(cf3.z);
                                                                                if (objG6 == null) {
                                                                                    objG6 = null;
                                                                                }
                                                                                list4 = (List) objG6;
                                                                                if (list4 != null) {
                                                                                    strA2 = k62.a(62, ",", list4);
                                                                                } else {
                                                                                    strA2 = null;
                                                                                }
                                                                                if (strA != null) {
                                                                                    accessibilityEventCreateEvent.setContentDescription(strA);
                                                                                }
                                                                                if (strA2 != null) {
                                                                                    accessibilityEventCreateEvent.getText().add(strA2);
                                                                                }
                                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateEvent);
                                                                            } else {
                                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                                            }
                                                                        } else {
                                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num5, null, 8, null);
                                                                            num6 = num6;
                                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                                        }
                                                                    } else if (kr1.n(ff3Var5, cf3.a)) {
                                                                        int iSemanticsNodeIdToAccessibilityVirtualNodeId = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22);
                                                                        obj2.getClass();
                                                                        androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(iSemanticsNodeIdToAccessibilityVirtualNodeId, 2048, 4, (List) obj2);
                                                                    } else {
                                                                        if (!kr1.n(ff3Var5, cf3.D)) {
                                                                            num8 = num6;
                                                                            ff3Var3 = cf3.E;
                                                                            if (kr1.n(ff3Var5, ff3Var3)) {
                                                                                textForTextField = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(ue3Var);
                                                                                if (textForTextField != null || (str = textForTextField.d) == null) {
                                                                                    str = BuildConfig.VERSION_NAME;
                                                                                }
                                                                                long j5 = ((jz3) ue3Var.d(ff3Var3)).a;
                                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (j5 & 4294967295L)), Integer.valueOf(str.length()), androidComposeViewAccessibilityDelegateCompat.trimToSize(str, ParcelSafeTextLength)));
                                                                                androidComposeViewAccessibilityDelegateCompat.sendPendingTextTraversedAtGranularityEvent(i15);
                                                                            } else {
                                                                                if (kr1.n(ff3Var5, ff3Var6)) {
                                                                                    zN2 = true;
                                                                                } else {
                                                                                    zN2 = kr1.n(ff3Var5, cf3.t);
                                                                                }
                                                                                if (zN2) {
                                                                                    androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(ux1Var);
                                                                                    ScrollObservationScope scrollObservationScopeFindById = SemanticsUtils_androidKt.findById(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes, i22);
                                                                                    scrollObservationScopeFindById.getClass();
                                                                                    objG = fi2Var2.g(ff3Var6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    scrollObservationScopeFindById.setHorizontalScrollAxisRange((fb3) objG);
                                                                                    objG2 = fi2Var2.g(cf3.t);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    scrollObservationScopeFindById.setVerticalScrollAxisRange((fb3) objG2);
                                                                                    androidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded(scrollObservationScopeFindById);
                                                                                } else if (kr1.n(ff3Var5, cf3.k)) {
                                                                                    obj2.getClass();
                                                                                    if (((Boolean) obj2).booleanValue()) {
                                                                                        androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i15), 8));
                                                                                    }
                                                                                    num6 = num8;
                                                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i15), 2048, num6, null, 8, null);
                                                                                } else {
                                                                                    num6 = num8;
                                                                                    ff3Var4 = te3.w;
                                                                                    if (kr1.n(ff3Var5, ff3Var4)) {
                                                                                        list = (List) ue3Var.d(ff3Var4);
                                                                                        list2 = (List) y64.B(semanticsNodeCopy.getUnmergedConfig(), ff3Var4);
                                                                                        if (list2 != null) {
                                                                                            linkedHashSet = new LinkedHashSet();
                                                                                            if (list.size() > 0) {
                                                                                                list.get(0).getClass();
                                                                                                m51.t();
                                                                                                return;
                                                                                            }
                                                                                            linkedHashSet2 = new LinkedHashSet();
                                                                                            if (list2.size() > 0) {
                                                                                                list2.get(0).getClass();
                                                                                                m51.t();
                                                                                                return;
                                                                                            } else if (linkedHashSet.containsAll(linkedHashSet2) || !linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                                zPropertiesDeleted = true;
                                                                                            } else {
                                                                                                zPropertiesDeleted = false;
                                                                                            }
                                                                                        } else if (!list.isEmpty()) {
                                                                                            zPropertiesDeleted = true;
                                                                                        }
                                                                                    } else if ((obj2 instanceof z0) || !AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((z0) obj2, y64.B(semanticsNodeCopy.getUnmergedConfig(), ff3Var5))) {
                                                                                        zPropertiesDeleted = true;
                                                                                    } else {
                                                                                        zPropertiesDeleted = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (fi2Var2.c(te3.j)) {
                                                                            textForTextField2 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                                                            if (textForTextField2 == null) {
                                                                                textForTextField2 = BuildConfig.VERSION_NAME;
                                                                            }
                                                                            textForTextField3 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(ue3Var);
                                                                            if (textForTextField3 == null) {
                                                                                textForTextField3 = BuildConfig.VERSION_NAME;
                                                                            }
                                                                            charSequenceTrimToSize = androidComposeViewAccessibilityDelegateCompat.trimToSize(textForTextField3, ParcelSafeTextLength);
                                                                            length = textForTextField2.length();
                                                                            length2 = textForTextField3.length();
                                                                            if (length > length2) {
                                                                                i24 = length2;
                                                                            } else {
                                                                                i24 = length;
                                                                            }
                                                                            num8 = num6;
                                                                            i25 = 0;
                                                                            while (true) {
                                                                                i26 = length;
                                                                                if (i25 >= i24) {
                                                                                    i27 = length2;
                                                                                    break;
                                                                                }
                                                                                i27 = length2;
                                                                                if (textForTextField2.charAt(i25) != textForTextField3.charAt(i25)) {
                                                                                    break;
                                                                                }
                                                                                i25++;
                                                                                length = i26;
                                                                                length2 = i27;
                                                                            }
                                                                            i28 = 0;
                                                                            while (true) {
                                                                                if (i28 >= i24 - i25) {
                                                                                    i29 = i28;
                                                                                    break;
                                                                                }
                                                                                i29 = i28;
                                                                                if (textForTextField2.charAt((i26 - 1) - i28) != textForTextField3.charAt((i27 - 1) - i29)) {
                                                                                    break;
                                                                                } else {
                                                                                    i28 = i29 + 1;
                                                                                }
                                                                            }
                                                                            int i47 = (i26 - i29) - i25;
                                                                            int i48 = (i27 - i29) - i25;
                                                                            ue3 unmergedConfig = semanticsNodeCopy.getUnmergedConfig();
                                                                            ff3 ff3Var7 = cf3.I;
                                                                            boolean zC2 = unmergedConfig.c.c(ff3Var7);
                                                                            boolean zC3 = fi2Var2.c(ff3Var7);
                                                                            zC = semanticsNodeCopy.getUnmergedConfig().c.c(cf3.D);
                                                                            if (zC || zC2 || !zC3) {
                                                                                z = false;
                                                                            } else {
                                                                                z = true;
                                                                            }
                                                                            if (zC || !zC2 || zC3) {
                                                                                z2 = false;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            if (z && !z2) {
                                                                                accessibilityEventCreateTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 16);
                                                                                accessibilityEventCreateTextSelectionChangedEvent.setFromIndex(i25);
                                                                                accessibilityEventCreateTextSelectionChangedEvent.setRemovedCount(i47);
                                                                                accessibilityEventCreateTextSelectionChangedEvent.setAddedCount(i48);
                                                                                accessibilityEventCreateTextSelectionChangedEvent.setBeforeText(textForTextField2);
                                                                                accessibilityEventCreateTextSelectionChangedEvent.getText().add(charSequenceTrimToSize);
                                                                            }
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                                                            if (z || z2) {
                                                                                long j6 = ((jz3) ue3Var.d(cf3.E)).a;
                                                                                accessibilityEventCreateTextSelectionChangedEvent.setFromIndex((int) (j6 >> 32));
                                                                                accessibilityEventCreateTextSelectionChangedEvent.setToIndex((int) (j6 & 4294967295L));
                                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                                                            }
                                                                        } else {
                                                                            num8 = num6;
                                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, Integer.valueOf(i7), null, 8, null);
                                                                        }
                                                                        num6 = num8;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        j4 >>= 8;
                                                        long[] jArr6 = jArr3;
                                                        ze3Var2 = ze3Var2;
                                                        iArr3 = iArr3;
                                                        i38 = i15;
                                                        jArr3 = jArr6;
                                                        i42 = i23;
                                                        objArr5 = objArr4;
                                                        objArr6 = objArr3;
                                                        length3 = i20;
                                                        i39 = 8;
                                                        fi2Var4 = fi2Var2;
                                                        i35 = i16;
                                                        num10 = num6;
                                                        i43 = i17 + 1;
                                                        i36 = i22;
                                                        arrayList4 = arrayList3;
                                                        i37 = i18;
                                                        i40 = i21;
                                                        i32 = i19;
                                                        num11 = num5;
                                                    }
                                                    i15 = i38;
                                                }
                                                zRegisterScrollingId = androidComposeViewAccessibilityDelegateCompat.registerScrollingId(i36, arrayList4);
                                                if (zRegisterScrollingId) {
                                                    ff3Var = cf3.d;
                                                    if (kr1.n(ff3Var5, ff3Var)) {
                                                        obj2.getClass();
                                                        str2 = (String) obj2;
                                                        if (semanticsNodeCopy.getUnmergedConfig().c.c(ff3Var)) {
                                                            androidComposeViewAccessibilityDelegateCompat.sendPaneChangeEvents(i36, i39, str2);
                                                        }
                                                        i15 = i38;
                                                    } else {
                                                        if (kr1.n(ff3Var5, cf3.b)) {
                                                            zN = true;
                                                        } else {
                                                            zN = kr1.n(ff3Var5, cf3.H);
                                                        }
                                                        if (zN) {
                                                            int i49 = i38;
                                                            iArr3 = iArr3;
                                                            ze3Var2 = ze3Var2;
                                                            jArr3 = jArr3;
                                                            i15 = i49;
                                                            i23 = i42;
                                                            objArr3 = objArr6;
                                                            Integer num14 = num11;
                                                            i19 = i32;
                                                            objArr4 = objArr5;
                                                            i21 = i40;
                                                            Integer num15 = num10;
                                                            i18 = i37;
                                                            fi2Var2 = fi2Var4;
                                                            arrayList3 = arrayList4;
                                                            i20 = length3;
                                                            i22 = i36;
                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i36), 2048, num14, null, 8, null);
                                                            num5 = num14;
                                                            num6 = num15;
                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                        } else {
                                                            int i410 = i38;
                                                            iArr3 = iArr3;
                                                            ze3Var2 = ze3Var2;
                                                            jArr3 = jArr3;
                                                            i15 = i410;
                                                            i23 = i42;
                                                            objArr3 = objArr6;
                                                            num5 = num11;
                                                            i19 = i32;
                                                            objArr4 = objArr5;
                                                            i21 = i40;
                                                            num7 = num10;
                                                            i18 = i37;
                                                            fi2Var2 = fi2Var4;
                                                            arrayList3 = arrayList4;
                                                            i20 = length3;
                                                            i22 = i36;
                                                            if (kr1.n(ff3Var5, cf3.c)) {
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num5, null, 8, null);
                                                                num6 = num7;
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                            } else {
                                                                num6 = num7;
                                                                ff3Var2 = cf3.G;
                                                                if (kr1.n(ff3Var5, ff3Var2)) {
                                                                    objG3 = fi2Var2.g(cf3.w);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    n73Var = (n73) objG3;
                                                                    if (n73Var == null) {
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num5, null, 8, null);
                                                                        num6 = num6;
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                                    } else {
                                                                        objG4 = fi2Var2.g(ff3Var2);
                                                                        if (objG4 == null) {
                                                                            objG4 = null;
                                                                        }
                                                                        if (kr1.n(objG4, Boolean.TRUE)) {
                                                                            accessibilityEventCreateEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 4);
                                                                            ze3 ze3Var4 = new ze3(ze3Var2.a, true, ux1Var, ue3Var);
                                                                            objG5 = ze3Var4.i().c.g(cf3.a);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            list3 = (List) objG5;
                                                                            if (list3 != null) {
                                                                                strA = k62.a(62, ",", list3);
                                                                            } else {
                                                                                strA = null;
                                                                            }
                                                                            objG6 = ze3Var4.i().c.g(cf3.z);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            list4 = (List) objG6;
                                                                            if (list4 != null) {
                                                                                strA2 = k62.a(62, ",", list4);
                                                                            } else {
                                                                                strA2 = null;
                                                                            }
                                                                            if (strA != null) {
                                                                                accessibilityEventCreateEvent.setContentDescription(strA);
                                                                            }
                                                                            if (strA2 != null) {
                                                                                accessibilityEventCreateEvent.getText().add(strA2);
                                                                            }
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateEvent);
                                                                        } else {
                                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                                        }
                                                                    }
                                                                } else if (kr1.n(ff3Var5, cf3.a)) {
                                                                    int iSemanticsNodeIdToAccessibilityVirtualNodeId2 = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22);
                                                                    obj2.getClass();
                                                                    androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(iSemanticsNodeIdToAccessibilityVirtualNodeId2, 2048, 4, (List) obj2);
                                                                } else {
                                                                    if (!kr1.n(ff3Var5, cf3.D)) {
                                                                        num8 = num6;
                                                                        ff3Var3 = cf3.E;
                                                                        if (kr1.n(ff3Var5, ff3Var3)) {
                                                                            textForTextField = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(ue3Var);
                                                                            if (textForTextField != null) {
                                                                                str = BuildConfig.VERSION_NAME;
                                                                            } else {
                                                                                str = BuildConfig.VERSION_NAME;
                                                                            }
                                                                            long j7 = ((jz3) ue3Var.d(ff3Var3)).a;
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) (j7 & 4294967295L)), Integer.valueOf(str.length()), androidComposeViewAccessibilityDelegateCompat.trimToSize(str, ParcelSafeTextLength)));
                                                                            androidComposeViewAccessibilityDelegateCompat.sendPendingTextTraversedAtGranularityEvent(i15);
                                                                        } else {
                                                                            if (kr1.n(ff3Var5, ff3Var6)) {
                                                                                zN2 = true;
                                                                            } else {
                                                                                zN2 = kr1.n(ff3Var5, cf3.t);
                                                                            }
                                                                            if (zN2) {
                                                                                androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(ux1Var);
                                                                                ScrollObservationScope scrollObservationScopeFindById2 = SemanticsUtils_androidKt.findById(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes, i22);
                                                                                scrollObservationScopeFindById2.getClass();
                                                                                objG = fi2Var2.g(ff3Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                scrollObservationScopeFindById2.setHorizontalScrollAxisRange((fb3) objG);
                                                                                objG2 = fi2Var2.g(cf3.t);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                scrollObservationScopeFindById2.setVerticalScrollAxisRange((fb3) objG2);
                                                                                androidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded(scrollObservationScopeFindById2);
                                                                            } else if (kr1.n(ff3Var5, cf3.k)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i15), 8));
                                                                                }
                                                                                num6 = num8;
                                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i15), 2048, num6, null, 8, null);
                                                                            } else {
                                                                                num6 = num8;
                                                                                ff3Var4 = te3.w;
                                                                                if (kr1.n(ff3Var5, ff3Var4)) {
                                                                                    list = (List) ue3Var.d(ff3Var4);
                                                                                    list2 = (List) y64.B(semanticsNodeCopy.getUnmergedConfig(), ff3Var4);
                                                                                    if (list2 != null) {
                                                                                        linkedHashSet = new LinkedHashSet();
                                                                                        if (list.size() > 0) {
                                                                                            list.get(0).getClass();
                                                                                            m51.t();
                                                                                            return;
                                                                                        }
                                                                                        linkedHashSet2 = new LinkedHashSet();
                                                                                        if (list2.size() > 0) {
                                                                                            list2.get(0).getClass();
                                                                                            m51.t();
                                                                                            return;
                                                                                        } else if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                                            zPropertiesDeleted = true;
                                                                                        } else {
                                                                                            zPropertiesDeleted = true;
                                                                                        }
                                                                                    } else if (!list.isEmpty()) {
                                                                                        zPropertiesDeleted = true;
                                                                                    }
                                                                                } else if (obj2 instanceof z0) {
                                                                                    zPropertiesDeleted = true;
                                                                                } else {
                                                                                    zPropertiesDeleted = true;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (fi2Var2.c(te3.j)) {
                                                                        textForTextField2 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                                                        if (textForTextField2 == null) {
                                                                            textForTextField2 = BuildConfig.VERSION_NAME;
                                                                        }
                                                                        textForTextField3 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(ue3Var);
                                                                        if (textForTextField3 == null) {
                                                                            textForTextField3 = BuildConfig.VERSION_NAME;
                                                                        }
                                                                        charSequenceTrimToSize = androidComposeViewAccessibilityDelegateCompat.trimToSize(textForTextField3, ParcelSafeTextLength);
                                                                        length = textForTextField2.length();
                                                                        length2 = textForTextField3.length();
                                                                        if (length > length2) {
                                                                            i24 = length2;
                                                                        } else {
                                                                            i24 = length;
                                                                        }
                                                                        num8 = num6;
                                                                        i25 = 0;
                                                                        while (true) {
                                                                            i26 = length;
                                                                            if (i25 >= i24) {
                                                                                i27 = length2;
                                                                                break;
                                                                            }
                                                                            i27 = length2;
                                                                            if (textForTextField2.charAt(i25) != textForTextField3.charAt(i25)) {
                                                                                break;
                                                                                break;
                                                                            } else {
                                                                                i25++;
                                                                                length = i26;
                                                                                length2 = i27;
                                                                            }
                                                                        }
                                                                        i28 = 0;
                                                                        while (true) {
                                                                            if (i28 >= i24 - i25) {
                                                                                i29 = i28;
                                                                                break;
                                                                            }
                                                                            i29 = i28;
                                                                            if (textForTextField2.charAt((i26 - 1) - i28) != textForTextField3.charAt((i27 - 1) - i29)) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            i28 = i29 + 1;
                                                                        }
                                                                        int i411 = (i26 - i29) - i25;
                                                                        int i412 = (i27 - i29) - i25;
                                                                        ue3 unmergedConfig2 = semanticsNodeCopy.getUnmergedConfig();
                                                                        ff3 ff3Var8 = cf3.I;
                                                                        boolean zC4 = unmergedConfig2.c.c(ff3Var8);
                                                                        boolean zC5 = fi2Var2.c(ff3Var8);
                                                                        zC = semanticsNodeCopy.getUnmergedConfig().c.c(cf3.D);
                                                                        if (zC) {
                                                                            z = false;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        if (zC) {
                                                                            z2 = false;
                                                                        } else {
                                                                            z2 = false;
                                                                        }
                                                                        if (z) {
                                                                        }
                                                                        accessibilityEventCreateTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                                                        androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                                                        if (z) {
                                                                            long j8 = ((jz3) ue3Var.d(cf3.E)).a;
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setFromIndex((int) (j8 >> 32));
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setToIndex((int) (j8 & 4294967295L));
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                                                        } else {
                                                                            long j9 = ((jz3) ue3Var.d(cf3.E)).a;
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setFromIndex((int) (j9 >> 32));
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setToIndex((int) (j9 & 4294967295L));
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                                                        }
                                                                    } else {
                                                                        num8 = num6;
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, Integer.valueOf(i7), null, 8, null);
                                                                    }
                                                                    num6 = num8;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    ff3Var = cf3.d;
                                                    if (kr1.n(ff3Var5, ff3Var)) {
                                                        obj2.getClass();
                                                        str2 = (String) obj2;
                                                        if (semanticsNodeCopy.getUnmergedConfig().c.c(ff3Var)) {
                                                            androidComposeViewAccessibilityDelegateCompat.sendPaneChangeEvents(i36, i39, str2);
                                                        }
                                                        i15 = i38;
                                                    } else {
                                                        if (kr1.n(ff3Var5, cf3.b)) {
                                                            zN = true;
                                                        } else {
                                                            zN = kr1.n(ff3Var5, cf3.H);
                                                        }
                                                        if (zN) {
                                                            int i413 = i38;
                                                            iArr3 = iArr3;
                                                            ze3Var2 = ze3Var2;
                                                            jArr3 = jArr3;
                                                            i15 = i413;
                                                            i23 = i42;
                                                            objArr3 = objArr6;
                                                            Integer num16 = num11;
                                                            i19 = i32;
                                                            objArr4 = objArr5;
                                                            i21 = i40;
                                                            Integer num17 = num10;
                                                            i18 = i37;
                                                            fi2Var2 = fi2Var4;
                                                            arrayList3 = arrayList4;
                                                            i20 = length3;
                                                            i22 = i36;
                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i36), 2048, num16, null, 8, null);
                                                            num5 = num16;
                                                            num6 = num17;
                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                        } else {
                                                            int i414 = i38;
                                                            iArr3 = iArr3;
                                                            ze3Var2 = ze3Var2;
                                                            jArr3 = jArr3;
                                                            i15 = i414;
                                                            i23 = i42;
                                                            objArr3 = objArr6;
                                                            num5 = num11;
                                                            i19 = i32;
                                                            objArr4 = objArr5;
                                                            i21 = i40;
                                                            num7 = num10;
                                                            i18 = i37;
                                                            fi2Var2 = fi2Var4;
                                                            arrayList3 = arrayList4;
                                                            i20 = length3;
                                                            i22 = i36;
                                                            if (kr1.n(ff3Var5, cf3.c)) {
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num5, null, 8, null);
                                                                num6 = num7;
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                            } else {
                                                                num6 = num7;
                                                                ff3Var2 = cf3.G;
                                                                if (kr1.n(ff3Var5, ff3Var2)) {
                                                                    objG3 = fi2Var2.g(cf3.w);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    n73Var = (n73) objG3;
                                                                    if (n73Var == null) {
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num5, null, 8, null);
                                                                        num6 = num6;
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                                    } else {
                                                                        objG4 = fi2Var2.g(ff3Var2);
                                                                        if (objG4 == null) {
                                                                            objG4 = null;
                                                                        }
                                                                        if (kr1.n(objG4, Boolean.TRUE)) {
                                                                            accessibilityEventCreateEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 4);
                                                                            ze3 ze3Var5 = new ze3(ze3Var2.a, true, ux1Var, ue3Var);
                                                                            objG5 = ze3Var5.i().c.g(cf3.a);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            list3 = (List) objG5;
                                                                            if (list3 != null) {
                                                                                strA = k62.a(62, ",", list3);
                                                                            } else {
                                                                                strA = null;
                                                                            }
                                                                            objG6 = ze3Var5.i().c.g(cf3.z);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            list4 = (List) objG6;
                                                                            if (list4 != null) {
                                                                                strA2 = k62.a(62, ",", list4);
                                                                            } else {
                                                                                strA2 = null;
                                                                            }
                                                                            if (strA != null) {
                                                                                accessibilityEventCreateEvent.setContentDescription(strA);
                                                                            }
                                                                            if (strA2 != null) {
                                                                                accessibilityEventCreateEvent.getText().add(strA2);
                                                                            }
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateEvent);
                                                                        } else {
                                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, num6, null, 8, null);
                                                                        }
                                                                    }
                                                                } else if (kr1.n(ff3Var5, cf3.a)) {
                                                                    int iSemanticsNodeIdToAccessibilityVirtualNodeId3 = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22);
                                                                    obj2.getClass();
                                                                    androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(iSemanticsNodeIdToAccessibilityVirtualNodeId3, 2048, 4, (List) obj2);
                                                                } else {
                                                                    if (!kr1.n(ff3Var5, cf3.D)) {
                                                                        num8 = num6;
                                                                        ff3Var3 = cf3.E;
                                                                        if (kr1.n(ff3Var5, ff3Var3)) {
                                                                            textForTextField = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(ue3Var);
                                                                            if (textForTextField != null) {
                                                                                str = BuildConfig.VERSION_NAME;
                                                                            } else {
                                                                                str = BuildConfig.VERSION_NAME;
                                                                            }
                                                                            long j10 = ((jz3) ue3Var.d(ff3Var3)).a;
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) (j10 & 4294967295L)), Integer.valueOf(str.length()), androidComposeViewAccessibilityDelegateCompat.trimToSize(str, ParcelSafeTextLength)));
                                                                            androidComposeViewAccessibilityDelegateCompat.sendPendingTextTraversedAtGranularityEvent(i15);
                                                                        } else {
                                                                            if (kr1.n(ff3Var5, ff3Var6)) {
                                                                                zN2 = true;
                                                                            } else {
                                                                                zN2 = kr1.n(ff3Var5, cf3.t);
                                                                            }
                                                                            if (zN2) {
                                                                                androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(ux1Var);
                                                                                ScrollObservationScope scrollObservationScopeFindById3 = SemanticsUtils_androidKt.findById(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes, i22);
                                                                                scrollObservationScopeFindById3.getClass();
                                                                                objG = fi2Var2.g(ff3Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                scrollObservationScopeFindById3.setHorizontalScrollAxisRange((fb3) objG);
                                                                                objG2 = fi2Var2.g(cf3.t);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                scrollObservationScopeFindById3.setVerticalScrollAxisRange((fb3) objG2);
                                                                                androidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded(scrollObservationScopeFindById3);
                                                                            } else if (kr1.n(ff3Var5, cf3.k)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i15), 8));
                                                                                }
                                                                                num6 = num8;
                                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i15), 2048, num6, null, 8, null);
                                                                            } else {
                                                                                num6 = num8;
                                                                                ff3Var4 = te3.w;
                                                                                if (kr1.n(ff3Var5, ff3Var4)) {
                                                                                    list = (List) ue3Var.d(ff3Var4);
                                                                                    list2 = (List) y64.B(semanticsNodeCopy.getUnmergedConfig(), ff3Var4);
                                                                                    if (list2 != null) {
                                                                                        linkedHashSet = new LinkedHashSet();
                                                                                        if (list.size() > 0) {
                                                                                            list.get(0).getClass();
                                                                                            m51.t();
                                                                                            return;
                                                                                        }
                                                                                        linkedHashSet2 = new LinkedHashSet();
                                                                                        if (list2.size() > 0) {
                                                                                            list2.get(0).getClass();
                                                                                            m51.t();
                                                                                            return;
                                                                                        } else if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                                            zPropertiesDeleted = true;
                                                                                        } else {
                                                                                            zPropertiesDeleted = true;
                                                                                        }
                                                                                    } else if (!list.isEmpty()) {
                                                                                        zPropertiesDeleted = true;
                                                                                    }
                                                                                } else if (obj2 instanceof z0) {
                                                                                    zPropertiesDeleted = true;
                                                                                } else {
                                                                                    zPropertiesDeleted = true;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (fi2Var2.c(te3.j)) {
                                                                        textForTextField2 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                                                        if (textForTextField2 == null) {
                                                                            textForTextField2 = BuildConfig.VERSION_NAME;
                                                                        }
                                                                        textForTextField3 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(ue3Var);
                                                                        if (textForTextField3 == null) {
                                                                            textForTextField3 = BuildConfig.VERSION_NAME;
                                                                        }
                                                                        charSequenceTrimToSize = androidComposeViewAccessibilityDelegateCompat.trimToSize(textForTextField3, ParcelSafeTextLength);
                                                                        length = textForTextField2.length();
                                                                        length2 = textForTextField3.length();
                                                                        if (length > length2) {
                                                                            i24 = length2;
                                                                        } else {
                                                                            i24 = length;
                                                                        }
                                                                        num8 = num6;
                                                                        i25 = 0;
                                                                        while (true) {
                                                                            i26 = length;
                                                                            if (i25 >= i24) {
                                                                                i27 = length2;
                                                                                break;
                                                                            }
                                                                            i27 = length2;
                                                                            if (textForTextField2.charAt(i25) != textForTextField3.charAt(i25)) {
                                                                                break;
                                                                                break;
                                                                            } else {
                                                                                i25++;
                                                                                length = i26;
                                                                                length2 = i27;
                                                                            }
                                                                        }
                                                                        i28 = 0;
                                                                        while (true) {
                                                                            if (i28 >= i24 - i25) {
                                                                                i29 = i28;
                                                                                break;
                                                                            }
                                                                            i29 = i28;
                                                                            if (textForTextField2.charAt((i26 - 1) - i28) != textForTextField3.charAt((i27 - 1) - i29)) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            i28 = i29 + 1;
                                                                        }
                                                                        int i415 = (i26 - i29) - i25;
                                                                        int i416 = (i27 - i29) - i25;
                                                                        ue3 unmergedConfig3 = semanticsNodeCopy.getUnmergedConfig();
                                                                        ff3 ff3Var9 = cf3.I;
                                                                        boolean zC6 = unmergedConfig3.c.c(ff3Var9);
                                                                        boolean zC7 = fi2Var2.c(ff3Var9);
                                                                        zC = semanticsNodeCopy.getUnmergedConfig().c.c(cf3.D);
                                                                        if (zC) {
                                                                            z = false;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        if (zC) {
                                                                            z2 = false;
                                                                        } else {
                                                                            z2 = false;
                                                                        }
                                                                        accessibilityEventCreateTextSelectionChangedEvent = z ? androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), num8, num8, Integer.valueOf(i27), charSequenceTrimToSize) : androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), num8, num8, Integer.valueOf(i27), charSequenceTrimToSize);
                                                                        accessibilityEventCreateTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                                                        androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                                                        if (z) {
                                                                            long j11 = ((jz3) ue3Var.d(cf3.E)).a;
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setFromIndex((int) (j11 >> 32));
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setToIndex((int) (j11 & 4294967295L));
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                                                        } else {
                                                                            long j12 = ((jz3) ue3Var.d(cf3.E)).a;
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setFromIndex((int) (j12 >> 32));
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setToIndex((int) (j12 & 4294967295L));
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                                                        }
                                                                    } else {
                                                                        num8 = num6;
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i22), 2048, Integer.valueOf(i7), null, 8, null);
                                                                    }
                                                                    num6 = num8;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                j4 >>= 8;
                                                long[] jArr7 = jArr3;
                                                ze3Var2 = ze3Var2;
                                                iArr3 = iArr3;
                                                i38 = i15;
                                                jArr3 = jArr7;
                                                i42 = i23;
                                                objArr5 = objArr4;
                                                objArr6 = objArr3;
                                                length3 = i20;
                                                i39 = 8;
                                                fi2Var4 = fi2Var2;
                                                i35 = i16;
                                                num10 = num6;
                                                i43 = i17 + 1;
                                                i36 = i22;
                                                arrayList4 = arrayList3;
                                                i37 = i18;
                                                i40 = i21;
                                                i32 = i19;
                                                num11 = num5;
                                            } else {
                                                i15 = i38;
                                                i16 = i35;
                                                i17 = i43;
                                            }
                                            i23 = i42;
                                            num6 = num10;
                                            objArr3 = objArr6;
                                            fi2Var2 = fi2Var4;
                                            num5 = num11;
                                            i20 = length3;
                                            i19 = i32;
                                            objArr4 = objArr5;
                                            i21 = i40;
                                            i18 = i37;
                                            arrayList3 = arrayList4;
                                            i22 = i36;
                                            j4 >>= 8;
                                            long[] jArr8 = jArr3;
                                            ze3Var2 = ze3Var2;
                                            iArr3 = iArr3;
                                            i38 = i15;
                                            jArr3 = jArr8;
                                            i42 = i23;
                                            objArr5 = objArr4;
                                            objArr6 = objArr3;
                                            length3 = i20;
                                            i39 = 8;
                                            fi2Var4 = fi2Var2;
                                            i35 = i16;
                                            num10 = num6;
                                            i43 = i17 + 1;
                                            i36 = i22;
                                            arrayList4 = arrayList3;
                                            i37 = i18;
                                            i40 = i21;
                                            i32 = i19;
                                            num11 = num5;
                                        }
                                        int i50 = i38;
                                        iArr2 = iArr3;
                                        ze3Var = ze3Var2;
                                        jArr2 = jArr3;
                                        i13 = i50;
                                        i5 = i35;
                                        num4 = num10;
                                        int i51 = i39;
                                        fi2Var = fi2Var4;
                                        num3 = num11;
                                        i8 = length3;
                                        i10 = i32;
                                        objArr = objArr6;
                                        i14 = i40;
                                        i9 = 0;
                                        i6 = i37;
                                        objArr2 = objArr5;
                                        arrayList2 = arrayList4;
                                        i12 = i36;
                                        if (i42 != i51) {
                                            break;
                                        }
                                    } else {
                                        int i52 = i38;
                                        iArr2 = iArr3;
                                        ze3Var = ze3Var2;
                                        jArr2 = jArr3;
                                        i13 = i52;
                                        i5 = i35;
                                        num4 = num10;
                                        objArr = objArr6;
                                        fi2Var = fi2Var4;
                                        num3 = num11;
                                        i8 = length3;
                                        i10 = i32;
                                        objArr2 = objArr5;
                                        i14 = i40;
                                        i9 = 0;
                                        i6 = i37;
                                        arrayList2 = arrayList4;
                                        i12 = i36;
                                    }
                                    length4 = i41;
                                    if (i14 == length4) {
                                        break;
                                    }
                                    int i53 = i14 + 1;
                                    long[] jArr9 = jArr2;
                                    ze3Var2 = ze3Var;
                                    iArr3 = iArr2;
                                    i38 = i13;
                                    jArr3 = jArr9;
                                    i36 = i12;
                                    arrayList4 = arrayList2;
                                    objArr5 = objArr2;
                                    objArr6 = objArr;
                                    length3 = i8;
                                    i32 = i10;
                                    i37 = i6;
                                    jArr4 = jArr5;
                                    num11 = num3;
                                    i39 = 8;
                                    i40 = i53;
                                    fi2Var4 = fi2Var;
                                    i35 = i5;
                                    num10 = num4;
                                }
                            } else {
                                i5 = i35;
                                num3 = num9;
                                iArr2 = iArr3;
                                i8 = length3;
                                num4 = num10;
                                i10 = i32;
                                i6 = i37;
                                ze3Var = ze3Var2;
                                i9 = 0;
                                arrayList2 = arrayList4;
                                jArr2 = jArr3;
                                i12 = i36;
                                zPropertiesDeleted = false;
                            }
                            if (!zPropertiesDeleted) {
                                zPropertiesDeleted = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(ze3Var, semanticsNodeCopy.getUnmergedConfig());
                            }
                            if (zPropertiesDeleted) {
                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i12), 2048, num4, null, 8, null);
                            }
                        }
                        i11 = 8;
                    } else {
                        i5 = i35;
                        num3 = num9;
                        i6 = i34;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i7 = i30;
                        i8 = length3;
                        i9 = i31;
                        num4 = num10;
                        i10 = i32;
                        i11 = i33;
                    }
                    j2 >>= i11;
                    gq1Var2 = gq1Var;
                    i33 = i11;
                    num10 = num4;
                    i31 = i9;
                    i30 = i7;
                    arrayList4 = arrayList2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    length3 = i8;
                    i32 = i10;
                    i34 = i6;
                    num9 = num3;
                    i35 = i5 + 1;
                    androidComposeViewAccessibilityDelegateCompat = this;
                }
                num = num9;
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i = i30;
                i2 = length3;
                i3 = i31;
                num2 = num10;
                int i54 = i32;
                if (i34 != i33) {
                    return;
                } else {
                    i4 = i54;
                }
            } else {
                num = num9;
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i = i30;
                i2 = length3;
                i3 = i31;
                num2 = num10;
                i4 = i32;
            }
            int i55 = i2;
            if (i4 == i55) {
                return;
            }
            i32 = i4 + 1;
            androidComposeViewAccessibilityDelegateCompat = this;
            gq1Var2 = gq1Var;
            num10 = num2;
            i31 = i3;
            i30 = i;
            arrayList4 = arrayList;
            iArr3 = iArr;
            jArr3 = jArr;
            num9 = num;
            length3 = i55;
        }
    }

    private final void sendSubtreeChangeAccessibilityEvents(ux1 ux1Var, eh2 eh2Var) {
        ue3 ue3VarV;
        ux1 ux1VarFindClosestParentNode;
        if (ux1Var.F() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(ux1Var)) {
            if (!ux1Var.N.g(8)) {
                ux1Var = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(ux1Var, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.INSTANCE);
            }
            if (ux1Var == null || (ue3VarV = ux1Var.v()) == null) {
                return;
            }
            if (!ue3VarV.h && (ux1VarFindClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(ux1Var, C00091.INSTANCE)) != null) {
                ux1Var = ux1VarFindClosestParentNode;
            }
            int i = ux1Var.d;
            if (eh2Var.a(i)) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i), 2048, 1, null, 8, null);
            }
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(ux1 ux1Var) {
        if (ux1Var.F() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(ux1Var)) {
            int i = ux1Var.d;
            fb3 fb3Var = (fb3) this.pendingHorizontalScrollEvents.b(i);
            fb3 fb3Var2 = (fb3) this.pendingVerticalScrollEvents.b(i);
            if (fb3Var == null && fb3Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventCreateEvent = createEvent(i, ConstantsKt.DEFAULT_BLOCK_SIZE);
            if (fb3Var != null) {
                accessibilityEventCreateEvent.setScrollX((int) ((Number) fb3Var.a.invoke()).floatValue());
                accessibilityEventCreateEvent.setMaxScrollX((int) ((Number) fb3Var.b.invoke()).floatValue());
            }
            if (fb3Var2 != null) {
                accessibilityEventCreateEvent.setScrollY((int) ((Number) fb3Var2.a.invoke()).floatValue());
                accessibilityEventCreateEvent.setMaxScrollY((int) ((Number) fb3Var2.b.invoke()).floatValue());
            }
            sendEvent(accessibilityEventCreateEvent);
        }
    }

    private final boolean setAccessibilitySelection(ze3 ze3Var, int i, int i2, boolean z) {
        String iterableTextForAccessibility;
        ue3 ue3Var = ze3Var.d;
        int i3 = ze3Var.g;
        ff3 ff3Var = te3.i;
        if (ue3Var.c.c(ff3Var) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(ze3Var)) {
            oe1 oe1Var = (oe1) ((z0) ze3Var.d.d(ff3Var)).b;
            if (oe1Var != null) {
                return ((Boolean) oe1Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.accessibilityCursorPosition) && (iterableTextForAccessibility = getIterableTextForAccessibility(ze3Var)) != null) {
            if (i < 0 || i != i2 || i2 > iterableTextForAccessibility.length()) {
                i = -1;
            }
            this.accessibilityCursorPosition = i;
            boolean z2 = iterableTextForAccessibility.length() > 0;
            sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i3), z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
            sendPendingTextTraversedAtGranularityEvent(i3);
            return true;
        }
        return false;
    }

    private final void setContentInvalid(ze3 ze3Var, p1 p1Var) {
        ue3 ue3Var = ze3Var.d;
        ff3 ff3Var = cf3.J;
        if (ue3Var.c.c(ff3Var)) {
            p1Var.a.setContentInvalid(true);
            Object objG = ze3Var.d.c.g(ff3Var);
            if (objG == null) {
                objG = null;
            }
            p1Var.a.setError((CharSequence) objG);
        }
    }

    private final void setText(ze3 ze3Var, p1 p1Var) {
        hg infoText = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoText(ze3Var);
        p1Var.a.setText(infoText != null ? toSpannableString(infoText) : null);
    }

    private final RectF toScreenCoords(ze3 ze3Var, h43 h43Var) {
        if (ze3Var != null) {
            wl2 wl2VarC = ze3Var.c();
            long jL = 0;
            if (wl2VarC != null) {
                if (!wl2VarC.z()) {
                    wl2VarC = null;
                }
                if (wl2VarC != null) {
                    jL = wl2VarC.L(0L);
                }
            }
            h43 h43VarJ = h43Var.j(jL);
            h43 h43VarE = ze3Var.e();
            h43 h43VarF = h43VarJ.h(h43VarE) ? h43VarJ.f(h43VarE) : null;
            if (h43VarF != null) {
                long jMo27x2d3fc342 = this.view.mo27x2d3fc342((((long) Float.floatToRawIntBits(h43VarF.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(h43VarF.a)) << 32));
                long jMo27x2d3fc343 = this.view.mo27x2d3fc342((((long) Float.floatToRawIntBits(h43VarF.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(h43VarF.c)) << 32));
                return new RectF(Float.intBitsToFloat((int) (jMo27x2d3fc342 >> 32)), Float.intBitsToFloat((int) (jMo27x2d3fc342 & 4294967295L)), Float.intBitsToFloat((int) (jMo27x2d3fc343 >> 32)), Float.intBitsToFloat((int) (jMo27x2d3fc343 & 4294967295L)));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [z21] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    private final SpannableString toSpannableString(hg hgVar) {
        ?? arrayList;
        ic1 ic1Var;
        int i;
        int i2;
        this.view.getFontFamilyResolver();
        wu0 density = this.view.getDensity();
        g84 g84Var = this.urlSpanCache;
        String str = hgVar.d;
        List list = hgVar.c;
        SpannableString spannableString = new SpannableString(str);
        ArrayList arrayList2 = hgVar.h;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                gg ggVar = (gg) arrayList2.get(i3);
                em3 em3Var = (em3) ggVar.a;
                int i4 = ggVar.b;
                int i5 = ggVar.c;
                int i6 = size;
                long jA = em3Var.a.a();
                long j = em3Var.b;
                ic1 ic1Var2 = em3Var.c;
                gc1 gc1Var = em3Var.d;
                String str2 = str;
                iy3 iy3Var = em3Var.j;
                ArrayList arrayList3 = arrayList2;
                g72 g72Var = em3Var.k;
                long j2 = em3Var.l;
                tt3 tt3Var = em3Var.m;
                hy3 hy3Var = em3Var.a;
                gb2.T(spannableString, (re0.c(jA, hy3Var.a()) ? hy3Var : TextForegroundStyle$Companion.m138xe5d6173e(jA)).a(), i4, i5);
                gb2.U(spannableString, j, density, i4, i5);
                if (ic1Var2 == null && gc1Var == null) {
                    i2 = 33;
                } else {
                    if (ic1Var2 == null) {
                        ic1Var = ic1.h;
                    }
                    if (gc1Var != null) {
                        ic1Var = ic1Var2;
                        i = gc1Var.a;
                    } else {
                        ic1Var = ic1Var2;
                        i = 0;
                    }
                    StyleSpan styleSpan = new StyleSpan(sf3.E(ic1Var, i));
                    i2 = 33;
                    spannableString.setSpan(styleSpan, i4, i5, 33);
                }
                if (tt3Var != null) {
                    int i7 = tt3Var.a;
                    if ((i7 | 1) == i7) {
                        spannableString.setSpan(new UnderlineSpan(), i4, i5, i2);
                    }
                    if ((i7 | 2) == i7) {
                        spannableString.setSpan(new StrikethroughSpan(), i4, i5, i2);
                    }
                }
                if (iy3Var != null) {
                    spannableString.setSpan(new ScaleXSpan(iy3Var.a), i4, i5, i2);
                }
                gb2.V(spannableString, g72Var, i4, i5);
                if (j2 != 16) {
                    spannableString.setSpan(new BackgroundColorSpan(gb2.X(j2)), i4, i5, i2);
                }
                i3++;
                size = i6;
                str = str2;
                arrayList2 = arrayList3;
            }
        }
        String str3 = str;
        int length = str3.length();
        ?? arrayList4 = z21.c;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Object obj = list.get(i8);
                gg ggVar2 = (gg) obj;
                if ((ggVar2.a instanceof ic4) && ig.b(0, length, ggVar2.b, ggVar2.c)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = arrayList4;
        }
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            gg ggVar3 = (gg) arrayList.get(i9);
            ic4 ic4Var = (ic4) ggVar3.a;
            int i10 = ggVar3.b;
            int i11 = ggVar3.c;
            if (!(ic4Var instanceof ic4)) {
                u41.e();
                return null;
            }
            spannableString.setSpan(new TtsSpan.VerbatimBuilder(ic4Var.a).build(), i10, i11, 33);
        }
        int length2 = str3.length();
        if (list != null) {
            arrayList4 = new ArrayList(list.size());
            int size4 = list.size();
            for (int i12 = 0; i12 < size4; i12++) {
                Object obj2 = list.get(i12);
                gg ggVar4 = (gg) obj2;
                if ((ggVar4.a instanceof ea4) && ig.b(0, length2, ggVar4.b, ggVar4.c)) {
                    arrayList4.add(obj2);
                }
            }
        }
        int size5 = arrayList4.size();
        for (int i13 = 0; i13 < size5; i13++) {
            gg ggVar5 = (gg) arrayList4.get(i13);
            ea4 ea4Var = (ea4) ggVar5.a;
            int i14 = ggVar5.b;
            int i15 = ggVar5.c;
            WeakHashMap weakHashMap = g84Var.a;
            Object uRLSpan = weakHashMap.get(ea4Var);
            if (uRLSpan == null) {
                uRLSpan = new URLSpan(ea4Var.a);
                weakHashMap.put(ea4Var, uRLSpan);
            }
            spannableString.setSpan((URLSpan) uRLSpan, i14, i15, 33);
        }
        List listA = hgVar.a(str3.length());
        int size6 = listA.size();
        for (int i16 = 0; i16 < size6; i16++) {
            gg ggVar6 = (gg) listA.get(i16);
            int i17 = ggVar6.b;
            Object obj3 = ggVar6.a;
            int i18 = ggVar6.c;
            if (i17 != i18) {
                m42 m42Var = (m42) obj3;
                if (m42Var instanceof l42) {
                    obj3.getClass();
                    l42 l42Var = (l42) obj3;
                    gg ggVar7 = new gg(i17, i18, l42Var);
                    WeakHashMap weakHashMap2 = g84Var.b;
                    Object uRLSpan2 = weakHashMap2.get(ggVar7);
                    if (uRLSpan2 == null) {
                        uRLSpan2 = new URLSpan(l42Var.a);
                        weakHashMap2.put(ggVar7, uRLSpan2);
                    }
                    spannableString.setSpan((URLSpan) uRLSpan2, i17, i18, 33);
                } else {
                    WeakHashMap weakHashMap3 = g84Var.c;
                    Object sj0Var = weakHashMap3.get(ggVar6);
                    if (sj0Var == null) {
                        sj0Var = new sj0(m42Var);
                        weakHashMap3.put(ggVar6, sj0Var);
                    }
                    spannableString.setSpan((ClickableSpan) sj0Var, i17, i18, 33);
                }
            }
        }
        return (SpannableString) trimToSize(spannableString, ParcelSafeTextLength);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean traverseAtGranularity(ze3 ze3Var, int i, boolean z, boolean z2) {
        int accessibilitySelectionStart;
        int i2;
        int i3 = ze3Var.g;
        Integer num = this.previousTraversedNode;
        if (num == null || i3 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(ze3Var.g);
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(ze3Var);
        boolean z3 = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            AccessibilityIterators.TextSegmentIterator iteratorForGranularity = getIteratorForGranularity(ze3Var, i);
            if (iteratorForGranularity == null) {
                return false;
            }
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(ze3Var);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = z ? 0 : iterableTextForAccessibility.length();
            }
            int[] iArrFollowing = z ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
            if (iArrFollowing == null) {
                return false;
            }
            int i4 = iArrFollowing[0];
            z3 = true;
            int i5 = iArrFollowing[1];
            if (z2 && isAccessibilitySelectionExtendable(ze3Var)) {
                accessibilitySelectionStart = getAccessibilitySelectionStart(ze3Var);
                if (accessibilitySelectionStart == -1) {
                    accessibilitySelectionStart = z ? i4 : i5;
                }
                i2 = z ? i5 : i4;
            } else {
                accessibilitySelectionStart = z ? i5 : i4;
                i2 = accessibilitySelectionStart;
            }
            this.pendingTextTraversedEvent = new PendingTextTraversedEvent(ze3Var, z ? FontInfo.NUMBER_OF_CHAR_CODES : ConstantsKt.MINIMUM_BLOCK_SIZE, i, i4, i5, SystemClock.uptimeMillis());
            setAccessibilitySelection(ze3Var, accessibilitySelectionStart, i2, true);
        }
        return z3;
    }

    private final <T extends CharSequence> T trimToSize(T t, int i) {
        if (i <= 0) {
            u41.k("size should be greater than 0");
            return null;
        }
        if (t == null || t.length() == 0 || t.length() <= i) {
            return t;
        }
        int i2 = i - 1;
        if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
            i = i2;
        }
        T t2 = (T) t.subSequence(0, i);
        t2.getClass();
        return t2;
    }

    private final void updateHoveredVirtualView(int i) {
        int i2 = this.hoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.hoveredVirtualViewId = i;
        sendEventForVirtualView$default(this, i, Uuid.SIZE_BITS, null, null, 12, null);
        sendEventForVirtualView$default(this, i2, FontInfo.NUMBER_OF_CHAR_CODES, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    private final void updateSemanticsNodesCopyAndPanes() {
        char c;
        long j;
        long j2;
        long j3;
        long j4;
        long[] jArr;
        long[] jArr2;
        long j5;
        int i;
        long j6;
        int iNumberOfTrailingZeros;
        char c2;
        long j7;
        SemanticsNodeCopy semanticsNodeCopy;
        String str;
        ue3 unmergedConfig;
        eh2 eh2Var = new eh2();
        eh2 eh2Var2 = this.paneDisplayed;
        int[] iArr = eh2Var2.b;
        long[] jArr3 = eh2Var2.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j2 = 128;
            while (true) {
                long j9 = jArr3[i3];
                j3 = 255;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j9 & 255) < 128) {
                            c2 = c3;
                            int i6 = iArr[(i3 << 3) + i5];
                            j7 = j8;
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().b(i6);
                            ze3 semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode == null) {
                                eh2Var.a(i6);
                                semanticsNodeCopy = (SemanticsNodeCopy) this.previousSemanticsNodes.b(i6);
                                if (semanticsNodeCopy != null) {
                                    str = null;
                                } else {
                                    str = null;
                                }
                                sendPaneChangeEvents(i6, 32, str);
                            } else if (!semanticsNode.d.c.c(cf3.d)) {
                                eh2Var.a(i6);
                                semanticsNodeCopy = (SemanticsNodeCopy) this.previousSemanticsNodes.b(i6);
                                if (semanticsNodeCopy != null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) {
                                    str = null;
                                } else {
                                    Object objG = unmergedConfig.c.g(cf3.d);
                                    str = (String) (objG == null ? null : objG);
                                }
                                sendPaneChangeEvents(i6, 32, str);
                            }
                        } else {
                            c2 = c3;
                            j7 = j8;
                        }
                        j9 >>= 8;
                        i5++;
                        c3 = c2;
                        j8 = j7;
                    }
                    c = c3;
                    j = j8;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                    j = j8;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                c3 = c;
                j8 = j;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        eh2 eh2Var3 = this.paneDisplayed;
        eh2Var3.getClass();
        int[] iArr2 = eh2Var.b;
        long[] jArr4 = eh2Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j10 = jArr4[i7];
                if ((((~j10) << c) & j10 & j) != j) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j10 & j3) < j2) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = eh2Var3.c;
                            int i14 = (i11 >>> 7) & i13;
                            j6 = j2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = eh2Var3.a;
                                int i16 = i14 >> 3;
                                i = i2;
                                int i17 = (i14 & 7) << 3;
                                j5 = j10;
                                long j11 = (jArr5[i16] >>> i17) | (((-i17) >> 63) & (jArr5[i16 + 1] << (64 - i17)));
                                int i18 = i14;
                                long j12 = (((long) i12) * 72340172838076673L) ^ j11;
                                long j13 = (j12 - 72340172838076673L) & (~j12) & j;
                                while (j13 != 0) {
                                    iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                                    jArr2 = jArr4;
                                    if (eh2Var3.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j13 &= j13 - 1;
                                    jArr4 = jArr2;
                                }
                                jArr2 = jArr4;
                                if ((j11 & ((~j11) << 6) & j) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i18 + i15) & i13;
                                jArr4 = jArr2;
                                i2 = i;
                                j10 = j5;
                            }
                            int i19 = iNumberOfTrailingZeros;
                            if (i19 >= 0) {
                                eh2Var3.f(i19);
                            }
                        } else {
                            jArr2 = jArr4;
                            j5 = j10;
                            i = i2;
                            j6 = j2;
                        }
                        j10 = j5 >> i;
                        i9++;
                        j2 = j6;
                        jArr4 = jArr2;
                        i2 = i;
                    }
                    jArr = jArr4;
                    j4 = j2;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    j4 = j2;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                j2 = j4;
                jArr4 = jArr;
                i2 = 8;
            }
        } else {
            j4 = j2;
        }
        this.previousSemanticsNodes.c();
        gq1 currentSemanticsNodes = getCurrentSemanticsNodes();
        int[] iArr3 = currentSemanticsNodes.b;
        Object[] objArr = currentSemanticsNodes.c;
        long[] jArr6 = currentSemanticsNodes.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i20 = 0;
            while (true) {
                long j14 = jArr6[i20];
                if ((((~j14) << c) & j14 & j) != j) {
                    int i21 = 8 - ((~(i20 - length3)) >>> 31);
                    for (int i22 = 0; i22 < i21; i22++) {
                        if ((j14 & j3) < j4) {
                            int i23 = (i20 << 3) + i22;
                            int i24 = iArr3[i23];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) objArr[i23];
                            ue3 ue3Var = semanticsNodeWithAdjustedBounds2.getSemanticsNode().d;
                            ff3 ff3Var = cf3.d;
                            if (ue3Var.c.c(ff3Var) && this.paneDisplayed.a(i24)) {
                                sendPaneChangeEvents(i24, 16, (String) semanticsNodeWithAdjustedBounds2.getSemanticsNode().d.d(ff3Var));
                            }
                            this.previousSemanticsNodes.h(i24, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.getSemanticsNode(), getCurrentSemanticsNodes()));
                        }
                        j14 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    }
                }
                if (i20 == length3) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().a(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:24:0x006c, B:28:0x0081, B:30:0x0089, B:32:0x0092, B:34:0x009a, B:37:0x00ad, B:39:0x00b5, B:40:0x00d1, B:42:0x00e0, B:43:0x00e9, B:23:0x0061), top: B:51:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0092 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:24:0x006c, B:28:0x0081, B:30:0x0089, B:32:0x0092, B:34:0x009a, B:37:0x00ad, B:39:0x00b5, B:40:0x00d1, B:42:0x00e0, B:43:0x00e9, B:23:0x0061), top: B:51:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009a A[Catch: all -> 0x00ab, LOOP:0: B:33:0x0098->B:34:0x009a, LOOP_END, TryCatch #0 {all -> 0x00ab, blocks: (B:24:0x006c, B:28:0x0081, B:30:0x0089, B:32:0x0092, B:34:0x009a, B:37:0x00ad, B:39:0x00b5, B:40:0x00d1, B:42:0x00e0, B:43:0x00e9, B:23:0x0061), top: B:51:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:24:0x006c, B:28:0x0081, B:30:0x0089, B:32:0x0092, B:34:0x009a, B:37:0x00ad, B:39:0x00b5, B:40:0x00d1, B:42:0x00e0, B:43:0x00e9, B:23:0x0061), top: B:51:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:24:0x006c, B:28:0x0081, B:30:0x0089, B:32:0x0092, B:34:0x009a, B:37:0x00ad, B:39:0x00b5, B:40:0x00d1, B:42:0x00e0, B:43:0x00e9, B:23:0x0061), top: B:51:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x003e: MOVE (r1 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:16:0x003e */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0109 -> B:24:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(defpackage.so0 r18) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui_release(so0):java.lang.Object");
    }

    /* JADX INFO: renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m42x3425ef04(boolean z, int i, long j) {
        if (kr1.n(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m41xe0e77911(getCurrentSemanticsNodes(), z, i, j);
        }
        return false;
    }

    public final boolean dispatchHoverEvent$ui_release(MotionEvent motionEvent) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            updateHoveredVirtualView(iHitTestSemanticsAt$ui_release);
            if (iHitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // defpackage.c1
    public s1 getAccessibilityNodeProvider(View view) {
        return this.nodeProvider;
    }

    public final String getExtraDataTestTraversalAfterVal$ui_release() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    public final String getExtraDataTestTraversalBeforeVal$ui_release() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    public final bh2 getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    public final bh2 getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    public final le1 getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    public final long getSendRecurringAccessibilityEventsIntervalMillis$ui_release() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final int hitTestSemanticsAt$ui_release(float f, float f2) {
        this.view.measureAndLayout(true);
        ii1 ii1Var = new ii1();
        ux1 root = this.view.getRoot();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        yd ydVar = root.N;
        wl2 wl2Var = (wl2) ydVar.d;
        n63 n63Var = wl2.O;
        ((wl2) ydVar.d).U0(wl2.S, wl2Var.L0(jFloatToRawIntBits), ii1Var, 1, true);
        vh2 vh2Var = ii1Var.c;
        for (int i = vh2Var.b - 1; -1 < i; i--) {
            Object objB = vh2Var.b(i);
            objB.getClass();
            ux1 ux1VarM = y64.M((of2) objB);
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(ux1VarM) != null) {
                return Integer.MIN_VALUE;
            }
            if (ux1VarM.N.g(8)) {
                int iSemanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(ux1VarM.d);
                ze3 ze3VarI = yh4.i(ux1VarM, false);
                if (SemanticsUtils_androidKt.isImportantForAccessibility(ze3VarI)) {
                    if (!ze3VarI.i().c.c(cf3.y)) {
                        return iSemanticsNodeIdToAccessibilityVirtualNodeId;
                    }
                } else {
                    continue;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isEnabled$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty();
    }

    public final void onLayoutChange$ui_release(ux1 ux1Var) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(ux1Var);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void setHoveredVirtualViewId$ui_release(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final void setIdToAfterMap$ui_release(bh2 bh2Var) {
        this.idToAfterMap = bh2Var;
    }

    public final void setIdToBeforeMap$ui_release(bh2 bh2Var) {
        this.idToBeforeMap = bh2Var;
    }

    public final void setOnSendAccessibilityEvent$ui_release(le1 le1Var) {
        this.onSendAccessibilityEvent = le1Var;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui_release(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }
}
