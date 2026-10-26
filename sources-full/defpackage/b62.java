package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class b62 implements nd2, AdapterView.OnItemClickListener {
    public Context c;
    public LayoutInflater d;
    public hc2 h;
    public ExpandedMenuView l;
    public md2 m;
    public a62 n;

    public b62(ContextWrapper contextWrapper) {
        this.c = contextWrapper;
        this.d = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.nd2
    public final void b(hc2 hc2Var, boolean z) {
        md2 md2Var = this.m;
        if (md2Var != null) {
            md2Var.b(hc2Var, z);
        }
    }

    @Override // defpackage.nd2
    public final boolean c(mc2 mc2Var) {
        return false;
    }

    @Override // defpackage.nd2
    public final void d(md2 md2Var) {
        throw null;
    }

    @Override // defpackage.nd2
    public final boolean e(mc2 mc2Var) {
        return false;
    }

    @Override // defpackage.nd2
    public final void f() {
        a62 a62Var = this.n;
        if (a62Var != null) {
            a62Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.nd2
    public final void h(Context context, hc2 hc2Var) {
        if (this.c != null) {
            this.c = context;
            if (this.d == null) {
                this.d = LayoutInflater.from(context);
            }
        }
        this.h = hc2Var;
        a62 a62Var = this.n;
        if (a62Var != null) {
            a62Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.nd2
    public final boolean i(ep3 ep3Var) {
        boolean zHasVisibleItems = ep3Var.hasVisibleItems();
        Context context = ep3Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        jc2 jc2Var = new jc2();
        jc2Var.c = ep3Var;
        kn4 kn4Var = new kn4(context);
        c7 c7Var = (c7) kn4Var.c;
        b62 b62Var = new b62(c7Var.a);
        jc2Var.h = b62Var;
        b62Var.m = jc2Var;
        ep3Var.b(b62Var, context);
        b62 b62Var2 = jc2Var.h;
        if (b62Var2.n == null) {
            b62Var2.n = new a62(b62Var2);
        }
        c7Var.i = b62Var2.n;
        c7Var.j = jc2Var;
        View view = ep3Var.o;
        if (view != null) {
            c7Var.e = view;
        } else {
            c7Var.c = ep3Var.n;
            c7Var.d = ep3Var.m;
        }
        c7Var.h = jc2Var;
        g7 g7VarF = kn4Var.f();
        jc2Var.d = g7VarF;
        g7VarF.setOnDismissListener(jc2Var);
        WindowManager.LayoutParams attributes = jc2Var.d.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        jc2Var.d.show();
        md2 md2Var = this.m;
        if (md2Var == null) {
            return true;
        }
        md2Var.q(ep3Var);
        return true;
    }

    @Override // defpackage.nd2
    public final boolean j() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.q(this.n.getItem(i), this, 0);
    }
}
