package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class kx2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ lx2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx2(lx2 lx2Var, int i) {
        super(1);
        this.c = i;
        this.d = lx2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        lx2 lx2Var = this.d;
        switch (i) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                ge geVar = lx2Var.c;
                if (geVar != null) {
                    geVar.invoke(motionEvent);
                    return w84Var;
                }
                kr1.n0("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                ge geVar2 = lx2Var.c;
                if (geVar2 != null) {
                    geVar2.invoke(motionEvent2);
                    return w84Var;
                }
                kr1.n0("onTouchEvent");
                throw null;
        }
    }
}
