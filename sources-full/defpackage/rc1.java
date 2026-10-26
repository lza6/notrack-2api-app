package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class rc1 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ sc1 d;

    public /* synthetic */ rc1(sc1 sc1Var, int i) {
        this.c = i;
        this.d = sc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        sc1 sc1Var = this.d;
        switch (i) {
            case 0:
                ViewParent parent = sc1Var.l.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                sc1Var.a();
                View view = sc1Var.l;
                if (view.isEnabled() && !view.isLongClickable() && sc1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    sc1Var.o = true;
                    break;
                }
                break;
        }
    }
}
