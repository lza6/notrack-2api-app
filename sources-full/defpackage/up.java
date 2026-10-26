package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    public /* synthetic */ up(View view, ye0 ye0Var, boolean z) {
        this.c = 2;
        this.h = view;
        this.l = ye0Var;
        this.d = z;
    }

    public /* synthetic */ up(boolean z, je1 je1Var, je1 je1Var2, int i) {
        this.c = i;
        this.d = z;
        this.h = je1Var;
        this.l = je1Var2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        bh4 yg4Var;
        int i = this.c;
        w84 w84Var = w84.a;
        boolean z = this.d;
        Object obj = this.l;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                je1 je1Var = (je1) obj2;
                je1 je1Var2 = (je1) obj;
                if (!z) {
                    je1Var2.invoke();
                } else {
                    je1Var.invoke();
                }
                break;
            case 1:
                je1 je1Var3 = (je1) obj2;
                je1 je1Var4 = (je1) obj;
                if (!z) {
                    je1Var4.invoke();
                } else if (je1Var3 != null) {
                    je1Var3.invoke();
                }
                break;
            default:
                ye0 ye0Var = (ye0) obj;
                Context context = ((View) obj2).getContext();
                context.getClass();
                Window window = ((Activity) context).getWindow();
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(gb2.X(ye0Var.n));
                    window.setNavigationBarColor(gb2.X(ye0Var.n));
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    yg4Var = new ah4(window);
                } else if (i2 >= 30) {
                    yg4Var = new zg4(window);
                } else {
                    yg4Var = i2 >= 26 ? new yg4(window) : new xg4(window);
                }
                boolean z2 = !z;
                yg4Var.b(z2);
                yg4Var.a(z2);
                break;
        }
        return w84Var;
    }
}
