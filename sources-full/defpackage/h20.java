package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h20 extends dd2 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int A;
    public int B;
    public boolean D;
    public md2 E;
    public ViewTreeObserver F;
    public PopupWindow.OnDismissListener G;
    public boolean H;
    public final Context d;
    public final int h;
    public final int l;
    public final boolean m;
    public final Handler n;
    public View v;
    public View w;
    public int x;
    public boolean y;
    public boolean z;
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final qj q = new qj(2, this);
    public final e20 r = new e20(this, 0);
    public final jb s = new jb(15, this);
    public int t = 0;
    public int u = 0;
    public boolean C = false;

    public h20(Context context, View view, int i, boolean z) {
        this.d = context;
        this.v = view;
        this.l = i;
        this.m = z;
        this.x = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = new Handler();
    }

    @Override // defpackage.mh3
    public final boolean a() {
        ArrayList arrayList = this.p;
        return arrayList.size() > 0 && ((g20) arrayList.get(0)).a.G.isShowing();
    }

    @Override // defpackage.nd2
    public final void b(hc2 hc2Var, boolean z) {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (hc2Var == ((g20) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((g20) arrayList.get(i2)).b.c(false);
        }
        g20 g20Var = (g20) arrayList.remove(i);
        hc2 hc2Var2 = g20Var.b;
        jd2 jd2Var = g20Var.a;
        jj jjVar = jd2Var.G;
        hc2Var2.r(this);
        if (this.H) {
            gd2.b(jjVar, null);
            jjVar.setAnimationStyle(0);
        }
        jd2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.x = ((g20) arrayList.get(size2 - 1)).c;
        } else {
            this.x = this.v.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((g20) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        md2 md2Var = this.E;
        if (md2Var != null) {
            md2Var.b(hc2Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.F.removeGlobalOnLayoutListener(this.q);
            }
            this.F = null;
        }
        this.w.removeOnAttachStateChangeListener(this.r);
        this.G.onDismiss();
    }

    @Override // defpackage.nd2
    public final void d(md2 md2Var) {
        this.E = md2Var;
    }

    @Override // defpackage.mh3
    public final void dismiss() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (size > 0) {
            g20[] g20VarArr = (g20[]) arrayList.toArray(new g20[size]);
            for (int i = size - 1; i >= 0; i--) {
                g20 g20Var = g20VarArr[i];
                if (g20Var.a.G.isShowing()) {
                    g20Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.nd2
    public final void f() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((g20) obj).a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ec2) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.mh3
    public final p01 g() {
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((g20) arrayList.get(arrayList.size() - 1)).a.h;
    }

    @Override // defpackage.nd2
    public final boolean i(ep3 ep3Var) {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g20 g20Var = (g20) obj;
            if (ep3Var == g20Var.b) {
                g20Var.a.h.requestFocus();
                return true;
            }
        }
        if (!ep3Var.hasVisibleItems()) {
            return false;
        }
        k(ep3Var);
        md2 md2Var = this.E;
        if (md2Var != null) {
            md2Var.q(ep3Var);
        }
        return true;
    }

    @Override // defpackage.nd2
    public final boolean j() {
        return false;
    }

    @Override // defpackage.dd2
    public final void k(hc2 hc2Var) {
        hc2Var.b(this, this.d);
        if (a()) {
            t(hc2Var);
        } else {
            this.o.add(hc2Var);
        }
    }

    @Override // defpackage.dd2
    public final void m(View view) {
        if (this.v != view) {
            this.v = view;
            this.u = Gravity.getAbsoluteGravity(this.t, view.getLayoutDirection());
        }
    }

    @Override // defpackage.dd2
    public final void n(boolean z) {
        this.C = z;
    }

    @Override // defpackage.dd2
    public final void o(int i) {
        if (this.t != i) {
            this.t = i;
            this.u = Gravity.getAbsoluteGravity(i, this.v.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        g20 g20Var;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                g20Var = null;
                break;
            }
            g20Var = (g20) arrayList.get(i);
            if (!g20Var.a.G.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (g20Var != null) {
            g20Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.dd2
    public final void p(int i) {
        this.y = true;
        this.A = i;
    }

    @Override // defpackage.dd2
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.G = onDismissListener;
    }

    @Override // defpackage.dd2
    public final void r(boolean z) {
        this.D = z;
    }

    @Override // defpackage.dd2
    public final void s(int i) {
        this.z = true;
        this.B = i;
    }

    @Override // defpackage.mh3
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t((hc2) obj);
        }
        arrayList.clear();
        View view = this.v;
        this.w = view;
        if (view != null) {
            boolean z = this.F == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.F = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.q);
            }
            this.w.addOnAttachStateChangeListener(this.r);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0167  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void t(hc2 hc2Var) {
        boolean z;
        char c;
        View childAt;
        g20 g20Var;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem item;
        ec2 ec2Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.d;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ec2 ec2Var2 = new ec2(hc2Var, layoutInflaterFrom, this.m, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.C) {
            ec2Var2.c = true;
        } else if (a()) {
            int size = hc2Var.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = hc2Var.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            ec2Var2.c = z;
        }
        int iL = dd2.l(ec2Var2, context, this.h);
        jd2 jd2Var = new jd2(context, null, this.l);
        jd2Var.J = this.s;
        jd2Var.x = this;
        jj jjVar = jd2Var.G;
        jjVar.setOnDismissListener(this);
        jd2Var.w = this.v;
        jd2Var.t = this.u;
        jd2Var.F = true;
        jjVar.setFocusable(true);
        jjVar.setInputMethodMode(2);
        jd2Var.o(ec2Var2);
        jd2Var.q(iL);
        jd2Var.t = this.u;
        ArrayList arrayList = this.p;
        if (arrayList.size() > 0) {
            g20Var = (g20) arrayList.get(arrayList.size() - 1);
            hc2 hc2Var2 = g20Var.b;
            int size2 = hc2Var2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = hc2Var2.getItem(i5);
                if (item.hasSubMenu() && hc2Var == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                childAt = null;
                c = 0;
            } else {
                p01 p01Var = g20Var.a.h;
                ListAdapter adapter = p01Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    ec2Var = (ec2) headerViewListAdapter.getWrappedAdapter();
                } else {
                    ec2Var = (ec2) adapter;
                    headersCount = 0;
                }
                int count = ec2Var.getCount();
                int i6 = 0;
                c = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == ec2Var.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - p01Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < p01Var.getChildCount()) ? p01Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            g20Var = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = jd2.K;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(jjVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                hd2.a(jjVar, c);
            }
            gd2.a(jjVar, null);
            p01 p01Var2 = ((g20) arrayList.get(arrayList.size() - 1)).a.h;
            int[] iArr = new int[2];
            p01Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.w.getWindowVisibleDisplayFrame(rect);
            if (this.x == 1) {
                if (p01Var2.getWidth() + iArr[0] + iL > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iL < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.x = i;
            if (Build.VERSION.SDK_INT >= 26) {
                jd2Var.w = childAt;
                i2 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.v.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.u & 7) == 5) {
                    iArr2[0] = this.v.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i7 = iArr3[0] - iArr2[0];
                i2 = iArr3[1] - iArr2[1];
                i3 = i7;
            }
            if ((this.u & 5) != 5) {
                width = z2 ? i3 + childAt.getWidth() : i3 - iL;
            } else if (z2) {
                width = i3 + iL;
            } else {
                iL = childAt.getWidth();
            }
            jd2Var.n = width;
            jd2Var.s = true;
            jd2Var.r = true;
            jd2Var.i(i2);
        } else {
            if (this.y) {
                jd2Var.n = this.A;
            }
            if (this.z) {
                jd2Var.i(this.B);
            }
            Rect rect2 = this.c;
            jd2Var.E = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new g20(jd2Var, hc2Var, this.x));
        jd2Var.show();
        p01 p01Var3 = jd2Var.h;
        p01Var3.setOnKeyListener(this);
        if (g20Var == null && this.D && hc2Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p01Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hc2Var.m);
            p01Var3.addHeaderView(frameLayout, null, false);
            jd2Var.show();
        }
    }
}
