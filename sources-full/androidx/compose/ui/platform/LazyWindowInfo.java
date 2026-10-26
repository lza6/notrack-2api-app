package androidx.compose.ui.platform;

import defpackage.cl3;
import defpackage.je1;
import defpackage.mi2;
import defpackage.mx2;
import defpackage.qq1;

/* JADX INFO: loaded from: classes.dex */
public final class LazyWindowInfo implements WindowInfo {
    public static final int $stable = 0;
    private mi2 _containerSize;
    private final mi2 isWindowFocused$delegate = cl3.d(Boolean.FALSE);
    private je1 onInitializeContainerSize;

    @Override // androidx.compose.ui.platform.WindowInfo
    /* JADX INFO: renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public long mo94x9ebd3e43() {
        if (this._containerSize == null) {
            je1 je1Var = this.onInitializeContainerSize;
            this._containerSize = cl3.d(new qq1(je1Var != null ? ((qq1) je1Var.invoke()).a : 0L));
            this.onInitializeContainerSize = null;
        }
        mi2 mi2Var = this._containerSize;
        mi2Var.getClass();
        return ((qq1) mi2Var.getValue()).a;
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public int mo95x8ad69978() {
        return ((mx2) WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().getValue()).a;
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m96x1ab3381f(int i) {
        WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().setValue(new mx2(i));
    }

    public final void setOnInitializeContainerSize(je1 je1Var) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = je1Var;
        }
    }

    public void setWindowFocused(boolean z) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z));
    }

    public final void updateContainerSizeIfObserved(je1 je1Var) {
        mi2 mi2Var = this._containerSize;
        if (mi2Var != null) {
            mi2Var.setValue(je1Var.invoke());
        }
    }
}
