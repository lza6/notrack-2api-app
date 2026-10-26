package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qd4 {
    public Interpolator c;
    public rd4 d;
    public boolean e;
    public long b = -1;
    public final n44 f = new n44(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((pd4) obj).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pd4 pd4Var = (pd4) obj;
            long j = this.b;
            if (j >= 0) {
                pd4Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) pd4Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                pd4Var.d(this.f);
            }
            View view2 = (View) pd4Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
