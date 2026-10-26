package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class p01 extends ListView {
    public final Rect c;
    public int d;
    public int h;
    public int l;
    public int m;
    public int n;
    public n01 o;
    public boolean p;
    public final boolean q;
    public boolean r;
    public l62 s;
    public im t;

    public p01(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.c = new Rect();
        this.d = 0;
        this.h = 0;
        this.l = 0;
        this.m = 0;
        this.q = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0180  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zA;
        View childAt;
        View childAt2;
        l62 l62Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.r = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.n - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            l62Var = this.s;
            if (z) {
                if (l62Var == null) {
                    this.s = new l62(this);
                }
                l62 l62Var2 = this.s;
                boolean z3 = l62Var2.x;
                l62Var2.x = true;
                l62Var2.onTouch(this, motionEvent);
            } else if (l62Var != null) {
                if (l62Var.x) {
                    l62Var.d();
                }
                l62Var.x = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.r = true;
                k01.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.n;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.n = iPointToPosition;
                k01.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.c;
                rect.set(left, top, right, bottom);
                rect.left -= this.d;
                rect.top -= this.h;
                rect.right += this.l;
                rect.bottom += this.m;
                if (Build.VERSION.SDK_INT >= 33) {
                    zA = m01.a(this);
                } else {
                    Field field = o01.a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z5 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        m01.b(this, z5);
                    } else {
                        Field field2 = o01.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                n01 n01Var = this.o;
                if (n01Var != null) {
                    n01Var.d = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.r = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.n - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.r = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.n - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        l62Var = this.s;
        if (z) {
            if (l62Var == null) {
                this.s = new l62(this);
            }
            l62 l62Var3 = this.s;
            boolean z6 = l62Var3.x;
            l62Var3.x = true;
            l62Var3.onTouch(this, motionEvent);
        } else if (l62Var != null) {
            if (l62Var.x) {
                l62Var.d();
            }
            l62Var.x = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.c;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.t != null) {
            return;
        }
        super.drawableStateChanged();
        n01 n01Var = this.o;
        if (n01Var != null) {
            n01Var.d = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.r && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.q || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.q || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.q || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.q && this.p) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.t = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.t == null) {
            im imVar = new im(3, this);
            this.t = imVar;
            post(imVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !l01.d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        l01.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        l01.b.invoke(this, Integer.valueOf(iPointToPosition));
                        l01.c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.r && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.n = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        im imVar = this.t;
        if (imVar != null) {
            p01 p01Var = (p01) imVar.d;
            p01Var.t = null;
            p01Var.removeCallbacks(imVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.p = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        n01 n01Var = null;
        if (drawable != null) {
            n01 n01Var2 = new n01();
            Drawable drawable2 = n01Var2.c;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            n01Var2.c = drawable;
            drawable.setCallback(n01Var2);
            n01Var2.d = true;
            n01Var = n01Var2;
        }
        this.o = n01Var;
        super.setSelector(n01Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.h = rect.top;
        this.l = rect.right;
        this.m = rect.bottom;
    }
}
