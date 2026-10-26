package androidx.compose.ui.platform;

import defpackage.j93;

/* JADX INFO: loaded from: classes.dex */
public interface AccessibilityManager {

    public static final class DefaultImpls {
    }

    static /* synthetic */ long calculateRecommendedTimeoutMillis$default(AccessibilityManager accessibilityManager, long j, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            j93.k("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
            return 0L;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        return accessibilityManager.calculateRecommendedTimeoutMillis(j, z, z2, z3);
    }

    long calculateRecommendedTimeoutMillis(long j, boolean z, boolean z2, boolean z3);
}
