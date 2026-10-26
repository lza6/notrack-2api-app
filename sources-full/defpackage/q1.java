package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q1 extends AccessibilityNodeProvider {
    public final s1 a;

    public q1(s1 s1Var) {
        this.a = s1Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        p1 p1VarCreateAccessibilityNodeInfo = this.a.createAccessibilityNodeInfo(i);
        if (p1VarCreateAccessibilityNodeInfo == null) {
            return null;
        }
        return p1VarCreateAccessibilityNodeInfo.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        List<p1> listFindAccessibilityNodeInfosByText = this.a.findAccessibilityNodeInfosByText(str, i);
        if (listFindAccessibilityNodeInfosByText == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listFindAccessibilityNodeInfosByText.get(i2).a);
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        p1 p1VarFindFocus = this.a.findFocus(i);
        if (p1VarFindFocus == null) {
            return null;
        }
        return p1VarFindFocus.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.performAction(i, i2, bundle);
    }
}
