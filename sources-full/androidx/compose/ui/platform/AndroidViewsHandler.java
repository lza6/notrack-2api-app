package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.me;
import defpackage.po1;
import defpackage.ux1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidViewsHandler extends ViewGroup {
    public static final int $stable = 8;
    private final HashMap<me, ux1> holderToLayoutNode;
    private final HashMap<ux1, me> layoutNodeToHolder;

    public AndroidViewsHandler(Context context) {
        super(context);
        setClipChildren(false);
        this.holderToLayoutNode = new HashMap<>();
        this.layoutNodeToHolder = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void drawView(me meVar, Canvas canvas) {
        meVar.draw(canvas);
    }

    public final HashMap<me, ux1> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    public final HashMap<ux1, me> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public Void invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (me meVar : this.holderToLayoutNode.keySet()) {
            meVar.layout(meVar.getLeft(), meVar.getTop(), meVar.getRight(), meVar.getBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            po1.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            po1.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (me meVar : this.holderToLayoutNode.keySet()) {
            int i4 = meVar.C;
            if (i4 != Integer.MIN_VALUE && (i3 = meVar.D) != Integer.MIN_VALUE) {
                meVar.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ux1 ux1Var = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && ux1Var != null) {
                ux1.S(ux1Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
