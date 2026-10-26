package androidx.compose.ui.platform;

import defpackage.mx2;

/* JADX INFO: loaded from: classes.dex */
public interface WindowInfo {
    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A$annotations, reason: not valid java name */
    static /* synthetic */ void m135xf1cce1f8() {
    }

    /* JADX INFO: renamed from: getContainerSize-YbymL2g */
    default long mo94x9ebd3e43() {
        return -9223372034707292160L;
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A */
    default int mo95x8ad69978() {
        return ((mx2) WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().getValue()).a;
    }

    boolean isWindowFocused();
}
