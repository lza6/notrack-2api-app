package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.gc2;
import defpackage.hc2;
import defpackage.iy2;
import defpackage.mc2;
import defpackage.pd2;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements gc2, pd2, AdapterView.OnItemClickListener {
    public static final int[] d = {R.attr.background, R.attr.divider};
    public hc2 c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        iy2 iy2VarL = iy2.l(context, attributeSet, d, i);
        TypedArray typedArray = (TypedArray) iy2VarL.h;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(iy2VarL.e(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(iy2VarL.e(1));
        }
        iy2VarL.n();
    }

    @Override // defpackage.gc2
    public final boolean a(mc2 mc2Var) {
        return this.c.q(mc2Var, null, 0);
    }

    @Override // defpackage.pd2
    public final void b(hc2 hc2Var) {
        this.c = hc2Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((mc2) getAdapter().getItem(i));
    }
}
