package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;

/* JADX INFO: loaded from: classes.dex */
public interface yr2 extends vx2 {
    static /* synthetic */ wr2 a(yr2 yr2Var, ne1 ne1Var, tl2 tl2Var, boolean z, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        return yr2Var.createLayer(ne1Var, tl2Var, null, z);
    }

    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U */
    long mo23x4b94afde(long j);

    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U */
    long mo24xc4a27b34(long j);

    wr2 createLayer(ne1 ne1Var, je1 je1Var, gg1 gg1Var, boolean z);

    void forceMeasureTheSubtree(ux1 ux1Var, boolean z);

    AccessibilityManager getAccessibilityManager();

    wo getAutofill();

    bp getAutofillManager();

    cp getAutofillTree();

    Clipboard getClipboard();

    ClipboardManager getClipboardManager();

    xp0 getCoroutineContext();

    wu0 getDensity();

    xx0 getDragAndDropManager();

    qa1 getFocusOwner();

    kb1 getFontFamilyResolver();

    ib1 getFontLoader();

    eg1 getGraphicsContext();

    lh1 getHapticFeedBack();

    hp1 getInputModeManager();

    dx1 getLayoutDirection();

    qf2 getModifierLocalManager();

    mv2 getPlacementScope();

    cx2 getPointerIconService();

    j43 getRectManager();

    ux1 getRoot();

    af3 getSemanticsOwner();

    wx1 getSharedDrawScope();

    boolean getShowLayoutBounds();

    as2 getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    ly3 getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void measureAndLayout(boolean z);

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw */
    void mo28x12711d1e(ux1 ux1Var, long j);

    void onDetach(ux1 ux1Var);

    void onEndApplyChanges();

    void onInteropViewLayoutChange(View view);

    void onLayoutChange(ux1 ux1Var);

    void onLayoutNodeDeactivated(ux1 ux1Var);

    void onPostAttach(ux1 ux1Var);

    void onPostLayoutNodeReused(ux1 ux1Var, int i);

    void onPreAttach(ux1 ux1Var);

    void onPreLayoutNodeReused(ux1 ux1Var, int i);

    void onRequestMeasure(ux1 ux1Var, boolean z, boolean z2, boolean z3);

    void onRequestRelayout(ux1 ux1Var, boolean z, boolean z2);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(je1 je1Var);

    void requestAutofill(ux1 ux1Var);

    void requestOnPositionedCallback(ux1 ux1Var);

    void setShowLayoutBounds(boolean z);

    Object textInputSession(ne1 ne1Var, so0 so0Var);
}
