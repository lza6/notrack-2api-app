package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.cn2;
import defpackage.dn2;
import defpackage.f4;
import defpackage.fi2;
import defpackage.gi2;
import defpackage.lq1;
import defpackage.ms0;
import defpackage.py;
import defpackage.qa3;
import defpackage.rh2;
import defpackage.sa3;
import defpackage.th2;
import defpackage.vh2;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class FocusFinderCompat {
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FocusFinderCompat$Companion$FocusFinderThreadLocal$1 FocusFinderThreadLocal = new ThreadLocal<FocusFinderCompat>() { // from class: androidx.compose.ui.platform.FocusFinderCompat$Companion$FocusFinderThreadLocal$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public FocusFinderCompat initialValue() {
            return new FocusFinderCompat();
        }
    };
    private final Rect focusedRect = new Rect();
    private final UserSpecifiedFocusComparator userSpecifiedFocusComparator = new UserSpecifiedFocusComparator(new f4(2, this));
    private final vh2 tmpList = new vh2();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ms0 ms0Var) {
            this();
        }

        public final FocusFinderCompat getInstance() {
            FocusFinderCompat focusFinderCompat = FocusFinderCompat.FocusFinderThreadLocal.get();
            focusFinderCompat.getClass();
            return focusFinderCompat;
        }
    }

    public static final class UserSpecifiedFocusComparator implements Comparator<View> {
        private final fi2 headsOfChains;
        private final gi2 isConnectedTo;
        private final NextFocusGetter mNextFocusGetter;
        private final fi2 nextFoci;
        private final rh2 originalOrdinal;
        private View root;

        public interface NextFocusGetter {
            View get(View view, View view2);
        }

        public UserSpecifiedFocusComparator(NextFocusGetter nextFocusGetter) {
            this.mNextFocusGetter = nextFocusGetter;
            long[] jArr = qa3.a;
            this.nextFoci = new fi2();
            int i = sa3.a;
            this.isConnectedTo = new gi2();
            this.headsOfChains = new fi2();
            rh2 rh2Var = cn2.a;
            this.originalOrdinal = new rh2();
        }

        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            if (view == view2) {
                return 0;
            }
            if (view == null) {
                return -1;
            }
            if (view2 == null) {
                return 1;
            }
            View view3 = (View) this.headsOfChains.g(view);
            View view4 = (View) this.headsOfChains.g(view2);
            if (view3 == view4 && view3 != null) {
                if (view == view3) {
                    return -1;
                }
                return (view2 == view3 || this.nextFoci.g(view) == null) ? 1 : -1;
            }
            if (view3 != null) {
                view = view3;
            }
            if (view4 != null) {
                view2 = view4;
            }
            if (view3 == null && view4 == null) {
                return 0;
            }
            return this.originalOrdinal.e(view) < this.originalOrdinal.e(view2) ? -1 : 1;
        }

        public final void recycle() {
            this.root = null;
            this.headsOfChains.a();
            this.isConnectedTo.b();
            this.originalOrdinal.a();
            this.nextFoci.a();
        }

        public final void setFocusables(dn2 dn2Var, View view) {
            this.root = view;
            Object[] objArr = dn2Var.a;
            int i = dn2Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                this.originalOrdinal.h(i2, (View) objArr[i2]);
            }
            lq1 lq1VarX = py.X(0, dn2Var.b);
            int i3 = lq1VarX.c;
            int i4 = lq1VarX.d;
            if (i3 <= i4) {
                while (true) {
                    View view2 = (View) dn2Var.b(i4);
                    View view3 = this.mNextFocusGetter.get(view, view2);
                    if (view3 != null && this.originalOrdinal.d(view3) >= 0) {
                        this.nextFoci.l(view2, view3);
                        this.isConnectedTo.a(view3);
                    }
                    if (i4 == i3) {
                        break;
                    } else {
                        i4--;
                    }
                }
            }
            lq1 lq1VarX2 = py.X(0, dn2Var.b);
            int i5 = lq1VarX2.c;
            int i6 = lq1VarX2.d;
            if (i5 > i6) {
                return;
            }
            while (true) {
                View view4 = (View) dn2Var.b(i6);
                if (((View) this.nextFoci.g(view4)) != null && !this.isConnectedTo.c(view4)) {
                    setHeadOfChain(view4);
                }
                if (i6 == i5) {
                    return;
                } else {
                    i6--;
                }
            }
        }

        public final void setHeadOfChain(View view) {
            View view2 = view;
            while (view != null) {
                View view3 = (View) this.headsOfChains.g(view);
                if (view3 != null) {
                    if (view3 == view2) {
                        return;
                    }
                    view = view2;
                    view2 = view3;
                }
                this.headsOfChains.l(view, view2);
                view = (View) this.nextFoci.g(view);
            }
        }
    }

    private final void FocusFinder() {
    }

    private final View findNextFocus(ViewGroup viewGroup, View view, int i, vh2 vh2Var) {
        Rect rect = this.focusedRect;
        view.getFocusedRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        return findNextFocusInRelativeDirection(vh2Var, viewGroup, view, i);
    }

    private final View findNextFocusInRelativeDirection(vh2 vh2Var, ViewGroup viewGroup, View view, int i) {
        try {
            UserSpecifiedFocusComparator userSpecifiedFocusComparator = this.userSpecifiedFocusComparator;
            viewGroup.getClass();
            userSpecifiedFocusComparator.setFocusables(vh2Var, viewGroup);
            th2 th2Var = vh2Var.c;
            if (th2Var == null) {
                th2Var = new th2(0, vh2Var);
                vh2Var.c = th2Var;
            }
            Collections.sort(th2Var, this.userSpecifiedFocusComparator);
            this.userSpecifiedFocusComparator.recycle();
            int i2 = vh2Var.b;
            View previousFocusable = null;
            if (i2 < 2) {
                return null;
            }
            boolean[] zArr = new boolean[1];
            if (i == 1) {
                previousFocusable = getPreviousFocusable(view, vh2Var, i2, zArr);
            } else if (i == 2) {
                previousFocusable = getNextFocusable(view, vh2Var, i2, zArr);
            }
            return previousFocusable == null ? (View) vh2Var.b(i2 - 1) : previousFocusable;
        } catch (Throwable th) {
            this.userSpecifiedFocusComparator.recycle();
            throw th;
        }
    }

    private final View findNextUserSpecifiedFocus(ViewGroup viewGroup, View view, int i) {
        View viewFindUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(view, viewGroup, i);
        boolean z = true;
        View viewFindUserSetNextFocus2 = viewFindUserSetNextFocus;
        while (viewFindUserSetNextFocus != null) {
            if (viewFindUserSetNextFocus.isFocusable() && viewFindUserSetNextFocus.getVisibility() == 0 && (!viewFindUserSetNextFocus.isInTouchMode() || viewFindUserSetNextFocus.isFocusableInTouchMode())) {
                return viewFindUserSetNextFocus;
            }
            viewFindUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(viewFindUserSetNextFocus, viewGroup, i);
            boolean z2 = !z;
            if (!z) {
                viewFindUserSetNextFocus2 = viewFindUserSetNextFocus2 != null ? FocusFinderCompat_androidKt.findUserSetNextFocus(viewFindUserSetNextFocus2, viewGroup, i) : null;
                if (viewFindUserSetNextFocus2 == viewFindUserSetNextFocus) {
                    break;
                }
            }
            z = z2;
        }
        return null;
    }

    private final ViewGroup getEffectiveRoot(ViewGroup viewGroup, View view) {
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = null;
            while (parent instanceof ViewGroup) {
                if (parent == viewGroup) {
                    if (viewGroup2 == null) {
                        break;
                    }
                    return viewGroup2;
                }
                ViewGroup viewGroup3 = (ViewGroup) parent;
                if (viewGroup3.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup2 = viewGroup3;
                }
                parent = viewGroup3.getParent();
            }
        }
        return viewGroup;
    }

    private final View getNextFocusable(View view, dn2 dn2Var, int i, boolean[] zArr) {
        int i2;
        if (i < 2) {
            return null;
        }
        int iE = dn2Var.e(view);
        if (iE >= 0 && (i2 = iE + 1) < i) {
            return (View) dn2Var.b(i2);
        }
        zArr[0] = true;
        return (View) dn2Var.b(0);
    }

    private final View getPreviousFocusable(View view, dn2 dn2Var, int i, boolean[] zArr) {
        int iC;
        if (i < 2) {
            return null;
        }
        if (view != null && (iC = dn2Var.c(view)) > 0) {
            return (View) dn2Var.b(iC - 1);
        }
        zArr[0] = true;
        return (View) dn2Var.b(i - 1);
    }

    private final boolean isValidId(int i) {
        return (i == 0 || i == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View userSpecifiedFocusComparator$lambda$0(FocusFinderCompat focusFinderCompat, View view, View view2) {
        if (focusFinderCompat.isValidId(view2.getNextFocusForwardId())) {
            return FocusFinderCompat_androidKt.findUserSetNextFocus(view2, view, 2);
        }
        return null;
    }

    public final View findNextFocus1d(ViewGroup viewGroup, View view, int i) {
        ViewGroup effectiveRoot = getEffectiveRoot(viewGroup, view);
        View viewFindNextUserSpecifiedFocus = findNextUserSpecifiedFocus(effectiveRoot, view, i);
        if (viewFindNextUserSpecifiedFocus != null) {
            return viewFindNextUserSpecifiedFocus;
        }
        vh2 vh2Var = this.tmpList;
        try {
            vh2Var.i();
            FocusFinderCompat_androidKt.addFocusableViews(effectiveRoot, vh2Var, i);
            if (!vh2Var.d()) {
                viewFindNextUserSpecifiedFocus = findNextFocus(effectiveRoot, view, i, vh2Var);
            }
            return viewFindNextUserSpecifiedFocus;
        } finally {
            vh2Var.i();
        }
    }
}
