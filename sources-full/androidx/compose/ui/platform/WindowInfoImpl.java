package androidx.compose.ui.platform;

import defpackage.cl3;
import defpackage.mi2;
import defpackage.ms0;
import defpackage.mx2;
import defpackage.qq1;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInfoImpl implements WindowInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final mi2 GlobalKeyboardModifiers = cl3.d(new mx2(0));
    private final mi2 _containerSize = cl3.d(new qq1(0));
    private final mi2 isWindowFocused$delegate = cl3.d(Boolean.FALSE);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ms0 ms0Var) {
            this();
        }

        public final mi2 getGlobalKeyboardModifiers$ui_release() {
            return WindowInfoImpl.GlobalKeyboardModifiers;
        }
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* JADX INFO: renamed from: getContainerSize-YbymL2g */
    public long mo94x9ebd3e43() {
        return ((qq1) this._containerSize.getValue()).a;
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo95x8ad69978() {
        return ((mx2) GlobalKeyboardModifiers.getValue()).a;
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: setContainerSize-ozmzZPI, reason: not valid java name */
    public void m136x22ea5e0e(long j) {
        this._containerSize.setValue(new qq1(j));
    }

    /* JADX INFO: renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m137x1ab3381f(int i) {
        GlobalKeyboardModifiers.setValue(new mx2(i));
    }

    public void setWindowFocused(boolean z) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z));
    }
}
