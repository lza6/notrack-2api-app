package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import defpackage.le1;
import defpackage.vh2;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class FocusFinderCompat_androidKt {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.FocusFinderCompat_androidKt$findUserSetNextFocus$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements le1 {
        final /* synthetic */ View $root;
        final /* synthetic */ View $startView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(View view, View view2) {
            super(1);
            this.$root = view;
            this.$startView = view2;
        }

        @Override // defpackage.le1
        public final Boolean invoke(View view) {
            return Boolean.valueOf(FocusFinderCompat_androidKt.findViewInsideOutShouldExist(this.$root, view, view.getNextFocusForwardId()) == this.$startView);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00101 extends ww1 implements le1 {
        final /* synthetic */ int $id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00101(int i) {
            super(1);
            this.$id = i;
        }

        @Override // defpackage.le1
        public final Boolean invoke(View view) {
            return Boolean.valueOf(view.getId() == this.$id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addFocusableViews(View view, vh2 vh2Var, int i) {
        addFocusableViews(view, vh2Var, i, view.isInTouchMode());
    }

    private static final void addFocusableViews(View view, vh2 vh2Var, int i, boolean z) {
        if (view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z || view.isFocusableInTouchMode())) {
            vh2Var.g(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                addFocusableViews(viewGroup.getChildAt(i2), vh2Var, i, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findUserSetNextFocus(View view, View view2, int i) {
        int nextFocusForwardId;
        if (i == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return findViewByPredicateInsideOut(view2, view, new AnonymousClass1(view2, view));
        }
        if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return findViewInsideOutShouldExist(view2, view, nextFocusForwardId);
        }
        return null;
    }

    private static final View findViewByPredicateInsideOut(View view, View view2, le1 le1Var) {
        View viewFindViewByPredicateTraversal;
        View view3 = null;
        while (true) {
            viewFindViewByPredicateTraversal = findViewByPredicateTraversal(view2, le1Var, view3);
            if (viewFindViewByPredicateTraversal != null || view2 == view) {
                break;
            }
            Object parent = view2.getParent();
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            View view4 = (View) parent;
            view3 = view2;
            view2 = view4;
        }
        return viewFindViewByPredicateTraversal;
    }

    private static final View findViewByPredicateTraversal(View view, le1 le1Var, View view2) {
        View viewFindViewByPredicateTraversal;
        if (((Boolean) le1Var.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (viewFindViewByPredicateTraversal = findViewByPredicateTraversal(childAt, le1Var, view2)) != null) {
                return viewFindViewByPredicateTraversal;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewInsideOutShouldExist(View view, View view2, int i) {
        return findViewByPredicateInsideOut(view, view2, new C00101(i));
    }
}
