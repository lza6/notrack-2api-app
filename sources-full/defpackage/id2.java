package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class id2 extends p01 {
    public final int u;
    public final int v;
    public lc2 w;
    public mc2 x;

    public id2(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.u = 21;
            this.v = 22;
        } else {
            this.u = 22;
            this.v = 21;
        }
    }

    @Override // defpackage.p01, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ec2 ec2Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.w != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                ec2Var = (ec2) headerViewListAdapter.getWrappedAdapter();
            } else {
                ec2Var = (ec2) adapter;
                headersCount = 0;
            }
            mc2 item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= ec2Var.getCount()) ? null : ec2Var.getItem(i);
            mc2 mc2Var = this.x;
            if (mc2Var != item) {
                hc2 hc2Var = ec2Var.a;
                if (mc2Var != null) {
                    this.w.f(hc2Var, mc2Var);
                }
                this.x = item;
                if (item != null) {
                    this.w.h(hc2Var, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.u) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.v) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (ec2) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (ec2) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(lc2 lc2Var) {
        this.w = lc2Var;
    }

    @Override // defpackage.p01, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
