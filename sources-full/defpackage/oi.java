package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class oi extends sd4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rd4
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zi ziVar = ((mi) obj).d;
                ziVar.C.setAlpha(1.0f);
                ziVar.F.d(null);
                ziVar.F = null;
                break;
            case 1:
                zi ziVar2 = (zi) obj;
                ziVar2.C.setAlpha(1.0f);
                ziVar2.F.d(null);
                ziVar2.F = null;
                break;
            default:
                zi ziVar3 = (zi) ((bv0) obj).h;
                ziVar3.C.setVisibility(8);
                PopupWindow popupWindow = ziVar3.D;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (ziVar3.C.getParent() instanceof View) {
                    View view = (View) ziVar3.C.getParent();
                    WeakHashMap weakHashMap = zc4.a;
                    qc4.c(view);
                }
                ziVar3.C.e();
                ziVar3.F.d(null);
                ziVar3.F = null;
                ViewGroup viewGroup = ziVar3.H;
                WeakHashMap weakHashMap2 = zc4.a;
                qc4.c(viewGroup);
                break;
        }
    }

    @Override // defpackage.sd4, defpackage.rd4
    public void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((mi) obj).d.C.setVisibility(0);
                break;
            case 1:
                zi ziVar = (zi) obj;
                ziVar.C.setVisibility(0);
                if (ziVar.C.getParent() instanceof View) {
                    View view = (View) ziVar.C.getParent();
                    WeakHashMap weakHashMap = zc4.a;
                    qc4.c(view);
                }
                break;
        }
    }
}
