package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xf4 extends sd4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf4 b;

    public /* synthetic */ xf4(zf4 zf4Var, int i) {
        this.a = i;
        this.b = zf4Var;
    }

    @Override // defpackage.rd4
    public final void a() {
        View view;
        int i = this.a;
        zf4 zf4Var = this.b;
        switch (i) {
            case 0:
                if (zf4Var.o && (view = zf4Var.g) != null) {
                    view.setTranslationY(0.0f);
                    zf4Var.d.setTranslationY(0.0f);
                }
                zf4Var.d.setVisibility(8);
                zf4Var.d.setTransitioning(false);
                zf4Var.s = null;
                bv0 bv0Var = zf4Var.k;
                if (bv0Var != null) {
                    bv0Var.D(zf4Var.j);
                    zf4Var.j = null;
                    zf4Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = zf4Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = zc4.a;
                    qc4.c(actionBarOverlayLayout);
                }
                break;
            default:
                zf4Var.s = null;
                zf4Var.d.requestLayout();
                break;
        }
    }
}
