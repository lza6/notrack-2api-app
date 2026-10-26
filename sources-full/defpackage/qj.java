package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qj implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qj(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                zj zjVar = (zj) obj;
                if (!zjVar.getInternalPopup().a()) {
                    zjVar.n.l(zjVar.getTextDirection(), zjVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = zjVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                wj wjVar = (wj) obj;
                zj zjVar2 = wjVar.N;
                if (zjVar2.isAttachedToWindow() && zjVar2.getGlobalVisibleRect(wjVar.L)) {
                    wjVar.r();
                    wjVar.show();
                } else {
                    wjVar.dismiss();
                }
                break;
            case 2:
                h20 h20Var = (h20) obj;
                ArrayList arrayList = h20Var.p;
                if (h20Var.a() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((g20) arrayList.get(0)).a.F) {
                        View view = h20Var.w;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((g20) obj2).a.show();
                            }
                        } else {
                            h20Var.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                an3 an3Var = (an3) obj;
                jd2 jd2Var = an3Var.p;
                if (an3Var.a() && !jd2Var.F) {
                    View view2 = an3Var.u;
                    if (view2 != null && view2.isShown()) {
                        jd2Var.show();
                    } else {
                        an3Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
