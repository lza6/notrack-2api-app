package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yw2 {
    public final List a;
    public final cr1 b;
    public final int c;
    public int d;

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    public yw2(List list, cr1 cr1Var) {
        this.a = list;
        this.b = cr1Var;
        MotionEvent motionEvent = cr1Var != null ? (MotionEvent) ((fp1) cr1Var.c).d : null;
        int i = 0;
        this.c = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = cr1Var != null ? (MotionEvent) ((fp1) cr1Var.c).d : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = cr1Var != null ? (MotionEvent) ((fp1) cr1Var.c).d : null;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked == 0) {
                i = 1;
            } else if (actionMasked == 1) {
                i = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i = 1;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 3;
                        break;
                    case 8:
                        i = 6;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                }
            } else {
                i = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i < size) {
                    dx2 dx2Var = (dx2) list.get(i);
                    if (py.u(dx2Var)) {
                        i = 2;
                    } else if (py.s(dx2Var)) {
                        i = 1;
                    } else {
                        i++;
                    }
                } else {
                    i = 3;
                }
            }
        }
        this.d = i;
    }
}
