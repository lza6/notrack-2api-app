package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fg4 extends WindowInsetsAnimation$Callback {
    public final be0 a;
    public ArrayList b;
    public final HashMap c;

    public fg4(be0 be0Var) {
        super(be0Var.c);
        this.c = new HashMap();
        this.a = be0Var;
    }

    public final ig4 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.c;
        ig4 ig4Var = (ig4) map.get(windowInsetsAnimation);
        if (ig4Var == null) {
            ig4Var = new ig4(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                ig4Var.a = new gg4(windowInsetsAnimation);
            }
            map.put(windowInsetsAnimation, ig4Var);
        }
        return ig4Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.k(a(windowInsetsAnimation));
        this.c.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.l();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.b = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationF = eg4.f(list.get(size));
            ig4 ig4VarA = a(windowInsetsAnimationF);
            ig4VarA.a.c(windowInsetsAnimationF.getFraction());
            this.b.add(ig4VarA);
        }
        return this.a.m(wg4.c(windowInsets, null)).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        mi4 mi4VarN = this.a.n(new mi4(bounds));
        mi4VarN.getClass();
        g1.p();
        return g1.i(((pp1) mi4VarN.d).d(), ((pp1) mi4VarN.h).d());
    }
}
