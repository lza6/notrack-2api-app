package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class sc1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float c;
    public final int d;
    public final int h;
    public final View l;
    public rc1 m;
    public rc1 n;
    public boolean o;
    public int p;
    public final int[] q = new int[2];

    public sc1(View view) {
        this.l = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.c = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.d = tapTimeout;
        this.h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        rc1 rc1Var = this.n;
        View view = this.l;
        if (rc1Var != null) {
            view.removeCallbacks(rc1Var);
        }
        rc1 rc1Var2 = this.m;
        if (rc1Var2 != null) {
            view.removeCallbacks(rc1Var2);
        }
    }

    public abstract mh3 b();

    public abstract boolean c();

    public boolean d() {
        mh3 mh3VarB = b();
        if (mh3VarB == null || !mh3VarB.a()) {
            return true;
        }
        mh3VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        p01 p01VarG;
        boolean z2 = this.o;
        View view2 = this.l;
        if (z2) {
            mh3 mh3VarB = b();
            if (mh3VarB != null && mh3VarB.a() && (p01VarG = mh3VarB.g()) != null && p01VarG.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.q;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                p01VarG.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = p01VarG.b(motionEventObtainNoHistory, this.p);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z3) {
                    z = true;
                } else if (d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.p = motionEvent.getPointerId(0);
                    if (this.m == null) {
                        this.m = new rc1(this, 0);
                    }
                    view2.postDelayed(this.m, this.d);
                    if (this.n == null) {
                        this.n = new rc1(this, 1);
                    }
                    view2.postDelayed(this.n, this.h);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.p);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.c;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.o = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.o = false;
        this.p = -1;
        rc1 rc1Var = this.m;
        if (rc1Var != null) {
            this.l.removeCallbacks(rc1Var);
        }
    }
}
