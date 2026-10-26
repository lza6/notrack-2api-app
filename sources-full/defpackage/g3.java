package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g3 implements nd2 {
    public d3 A;
    public d3 B;
    public io4 C;
    public e3 D;
    public final Context c;
    public Context d;
    public hc2 h;
    public final LayoutInflater l;
    public md2 m;
    public pd2 p;
    public f3 q;
    public Drawable r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public final int n = R.layout.abc_action_menu_layout;
    public final int o = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray z = new SparseBooleanArray();
    public final jb E = new jb(2, this);

    public g3(Context context) {
        this.c = context;
        this.l = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(mc2 mc2Var, View view, ViewGroup viewGroup) {
        View actionView = mc2Var.getActionView();
        if (actionView == null || mc2Var.e()) {
            od2 od2Var = view instanceof od2 ? (od2) view : (od2) this.l.inflate(this.o, viewGroup, false);
            od2Var.a(mc2Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) od2Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.p);
            if (this.D == null) {
                this.D = new e3(this);
            }
            actionMenuItemView.setPopupCallback(this.D);
            actionView = (View) od2Var;
        }
        actionView.setVisibility(mc2Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof i3)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.nd2
    public final void b(hc2 hc2Var, boolean z) {
        g();
        d3 d3Var = this.B;
        if (d3Var != null && d3Var.b()) {
            d3Var.i.dismiss();
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nd2
    public final void f() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.p;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            hc2 hc2Var = this.h;
            if (hc2Var != null) {
                hc2Var.i();
                ArrayList arrayListL = this.h.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    mc2 mc2Var = (mc2) arrayListL.get(i2);
                    if ((mc2Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        mc2 itemData = childAt instanceof od2 ? ((od2) childAt).getItemData() : null;
                        View viewA = a(mc2Var, childAt, viewGroup);
                        if (mc2Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.p).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.q) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.p).requestLayout();
        hc2 hc2Var2 = this.h;
        if (hc2Var2 != null) {
            hc2Var2.i();
            ArrayList arrayList2 = hc2Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                nc2 nc2Var = ((mc2) arrayList2.get(i3)).A;
            }
        }
        hc2 hc2Var3 = this.h;
        if (hc2Var3 != null) {
            hc2Var3.i();
            arrayList = hc2Var3.j;
        }
        if (this.t && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((mc2) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        f3 f3Var = this.q;
        if (z) {
            if (f3Var == null) {
                this.q = new f3(this, this.c);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.q.getParent();
            if (viewGroup3 != this.p) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.q);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.p;
                f3 f3Var2 = this.q;
                actionMenuView.getClass();
                i3 i3VarI = ActionMenuView.i();
                i3VarI.a = true;
                actionMenuView.addView(f3Var2, i3VarI);
            }
        } else if (f3Var != null) {
            Object parent = f3Var.getParent();
            Object obj = this.p;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.q);
            }
        }
        ((ActionMenuView) this.p).setOverflowReserved(this.t);
    }

    public final boolean g() {
        Object obj;
        io4 io4Var = this.C;
        if (io4Var != null && (obj = this.p) != null) {
            ((View) obj).removeCallbacks(io4Var);
            this.C = null;
            return true;
        }
        d3 d3Var = this.A;
        if (d3Var == null) {
            return false;
        }
        if (d3Var.b()) {
            d3Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.nd2
    public final void h(Context context, hc2 hc2Var) {
        this.d = context;
        LayoutInflater.from(context);
        this.h = hc2Var;
        Resources resources = context.getResources();
        if (!this.u) {
            this.t = true;
        }
        int i = 2;
        this.v = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.x = i;
        int measuredWidth = this.v;
        if (this.t) {
            if (this.q == null) {
                f3 f3Var = new f3(this, this.c);
                this.q = f3Var;
                if (this.s) {
                    f3Var.setImageDrawable(this.r);
                    this.r = null;
                    this.s = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.q.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.q.getMeasuredWidth();
        } else {
            this.q = null;
        }
        this.w = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nd2
    public final boolean i(ep3 ep3Var) {
        boolean z;
        if (ep3Var.hasVisibleItems()) {
            ep3 ep3Var2 = ep3Var;
            while (true) {
                hc2 hc2Var = ep3Var2.z;
                if (hc2Var == this.h) {
                    break;
                }
                ep3Var2 = (ep3) hc2Var;
            }
            mc2 mc2Var = ep3Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.p;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof od2) && ((od2) childAt).getItemData() == mc2Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                ep3Var.A.getClass();
                int size = ep3Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = ep3Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                d3 d3Var = new d3(this, this.d, ep3Var, view);
                this.B = d3Var;
                d3Var.g = z;
                dd2 dd2Var = d3Var.i;
                if (dd2Var != null) {
                    dd2Var.n(z);
                }
                d3 d3Var2 = this.B;
                if (!d3Var2.b()) {
                    if (d3Var2.e == null) {
                        u41.r("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    d3Var2.d(0, 0, false, false);
                }
                md2 md2Var = this.m;
                if (md2Var != null) {
                    md2Var.q(ep3Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nd2
    public final boolean j() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        g3 g3Var = this;
        hc2 hc2Var = g3Var.h;
        if (hc2Var != null) {
            arrayListL = hc2Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = g3Var.x;
        int i3 = g3Var.w;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) g3Var.p;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            mc2 mc2Var = (mc2) arrayListL.get(i4);
            int i7 = mc2Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (g3Var.y && mc2Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (g3Var.t && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = g3Var.z;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            mc2 mc2Var2 = (mc2) arrayListL.get(i9);
            int i11 = mc2Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = mc2Var2.b;
            if (z3) {
                View viewA = g3Var.a(mc2Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                mc2Var2.f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = g3Var.a(mc2Var2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            mc2 mc2Var3 = (mc2) arrayListL.get(i13);
                            if (mc2Var3.b == i12) {
                                if ((mc2Var3.x & 32) == 32) {
                                    i8++;
                                }
                                mc2Var3.f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    mc2Var2.f(z5);
                } else {
                    mc2Var2.f(false);
                }
                i9++;
                i = 2;
                g3Var = this;
                z = true;
            }
            i9++;
            i = 2;
            g3Var = this;
            z = true;
        }
        return z;
    }

    public final boolean k() {
        d3 d3Var = this.A;
        return d3Var != null && d3Var.b();
    }

    public final boolean l() {
        hc2 hc2Var;
        boolean z = false;
        if (this.t && !k() && (hc2Var = this.h) != null && this.p != null && this.C == null) {
            hc2Var.i();
            if (!hc2Var.j.isEmpty()) {
                io4 io4Var = new io4(1, this, new d3(this, this.d, this.h, this.q), z);
                this.C = io4Var;
                ((View) this.p).post(io4Var);
                return true;
            }
        }
        return false;
    }
}
