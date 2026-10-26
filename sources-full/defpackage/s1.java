package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s1 {
    public static final int HOST_VIEW_ID = -1;
    private final Object mProvider;

    public s1() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mProvider = new r1(this);
        } else {
            this.mProvider = new q1(this);
        }
    }

    public s1(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.mProvider = accessibilityNodeProvider;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i, p1 p1Var, String str, Bundle bundle) {
    }

    public p1 createAccessibilityNodeInfo(int i) {
        return null;
    }

    public List<p1> findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public p1 findFocus(int i) {
        return null;
    }

    public Object getProvider() {
        return this.mProvider;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return false;
    }
}
