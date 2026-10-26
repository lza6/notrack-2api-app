package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class jk2 extends c1 {
    @Override // defpackage.c1
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // defpackage.c1
    public final void onInitializeAccessibilityNodeInfo(View view, p1 p1Var) {
        int scrollRange;
        super.onInitializeAccessibilityNodeInfo(view, p1Var);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        p1Var.f("android.widget.ScrollView");
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        p1Var.a.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            p1Var.a(j1.f);
            p1Var.a(j1.g);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            p1Var.a(j1.e);
            p1Var.a(j1.i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    @Override // defpackage.c1
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i == 4096) {
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.v(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                    return true;
                }
            } else if (i == 8192 || i == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax != nestedScrollView.getScrollY()) {
                    nestedScrollView.v(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                    return true;
                }
            } else if (i == 16908346) {
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.v(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                    return true;
                }
            }
        }
        return false;
    }
}
