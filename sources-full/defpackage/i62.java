package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class i62 implements View.OnTouchListener {
    public final /* synthetic */ j62 c;

    public i62(j62 j62Var) {
        this.c = j62Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j62 j62Var = this.c;
        f62 f62Var = j62Var.y;
        Handler handler = j62Var.C;
        jj jjVar = j62Var.G;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && jjVar != null && jjVar.isShowing() && x >= 0 && x < jjVar.getWidth() && y >= 0 && y < jjVar.getHeight()) {
            handler.postDelayed(f62Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(f62Var);
        return false;
    }
}
