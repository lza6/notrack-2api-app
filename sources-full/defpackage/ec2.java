package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ec2 extends BaseAdapter {
    public final hc2 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public ec2(hc2 hc2Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = hc2Var;
        this.f = i;
        a();
    }

    public final void a() {
        hc2 hc2Var = this.a;
        mc2 mc2Var = hc2Var.v;
        if (mc2Var != null) {
            hc2Var.i();
            ArrayList arrayList = hc2Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((mc2) arrayList.get(i)) == mc2Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mc2 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        hc2 hc2Var = this.a;
        if (z) {
            hc2Var.i();
            arrayListL = hc2Var.j;
        } else {
            arrayListL = hc2Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (mc2) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        hc2 hc2Var = this.a;
        if (z) {
            hc2Var.i();
            arrayListL = hc2Var.j;
        } else {
            arrayListL = hc2Var.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        od2 od2Var = (od2) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        od2Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
