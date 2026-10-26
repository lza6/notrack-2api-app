package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class dd2 implements mh3, nd2, AdapterView.OnItemClickListener {
    public Rect c;

    public static int l(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // defpackage.nd2
    public final boolean c(mc2 mc2Var) {
        return false;
    }

    @Override // defpackage.nd2
    public final boolean e(mc2 mc2Var) {
        return false;
    }

    @Override // defpackage.nd2
    public final void h(Context context, hc2 hc2Var) {
    }

    public abstract void k(hc2 hc2Var);

    public abstract void m(View view);

    public abstract void n(boolean z);

    public abstract void o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (ec2) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (ec2) listAdapter).a.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof h20) ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z);

    public abstract void s(int i);
}
