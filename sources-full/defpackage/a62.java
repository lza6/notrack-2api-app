package defpackage;

import ai.notrack.app.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a62 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ b62 b;

    public a62(b62 b62Var) {
        this.b = b62Var;
        a();
    }

    public final void a() {
        hc2 hc2Var = this.b.h;
        mc2 mc2Var = hc2Var.v;
        if (mc2Var != null) {
            hc2Var.i();
            ArrayList arrayList = hc2Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((mc2) arrayList.get(i)) == mc2Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mc2 getItem(int i) {
        b62 b62Var = this.b;
        hc2 hc2Var = b62Var.h;
        hc2Var.i();
        ArrayList arrayList = hc2Var.j;
        b62Var.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (mc2) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        b62 b62Var = this.b;
        hc2 hc2Var = b62Var.h;
        hc2Var.i();
        int size = hc2Var.j.size();
        b62Var.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.d.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((od2) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
