package defpackage;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import notrack.ai.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class nb implements l81 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nb(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.l81
    public final Object emit(Object obj, so0 so0Var) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                fp1 fp1Var = (fp1) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    fp1Var.f().startStylusHandwriting((View) fp1Var.c);
                }
                return w84Var;
            case 1:
                ((fy2) obj2).k();
                return w84Var;
            case 2:
                if (((tq1) obj) instanceof dz0) {
                    ((mi2) obj2).setValue(Boolean.FALSE);
                }
                return w84Var;
            case 3:
                fy2 fy2Var = ((br0) obj2).c;
                fy2Var.i().updateCursorAnchorInfo((View) fy2Var.c, (CursorAnchorInfo) obj);
                return w84Var;
            case 4:
                ((q43) obj2).c = obj;
                throw new d(this);
            case 5:
                if (((f50) obj) instanceof x40) {
                    MainActivity mainActivity = (MainActivity) obj2;
                    int i2 = MainActivity.L;
                    MainActivity.x(mainActivity, mainActivity.y());
                }
                return w84Var;
            default:
                ((nu3) obj2).F.setValue(Boolean.FALSE);
                return w84Var;
        }
    }
}
