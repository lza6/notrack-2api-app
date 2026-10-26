package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c73 extends ViewGroup {
    public final int c;
    public final ArrayList d;
    public final ArrayList h;
    public final mi4 l;
    public int m;

    public c73(Context context) {
        super(context);
        this.c = 5;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        this.l = new mi4(9);
        setClipChildren(false);
        e73 e73Var = new e73(context);
        addView(e73Var);
        arrayList.add(e73Var);
        arrayList2.add(e73Var);
        this.m = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final e73 a(d73 d73Var) {
        mi4 mi4Var = this.l;
        LinkedHashMap linkedHashMap = (LinkedHashMap) mi4Var.d;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) mi4Var.d;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) mi4Var.h;
        e73 e73Var = (e73) linkedHashMap.get(d73Var);
        if (e73Var != null) {
            return e73Var;
        }
        ArrayList arrayList = this.h;
        arrayList.getClass();
        e73 e73Var2 = (e73) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (e73Var2 == null) {
            int i = this.m;
            ArrayList arrayList2 = this.d;
            if (i > kr1.H(arrayList2)) {
                e73Var2 = new e73(getContext());
                addView(e73Var2);
                arrayList2.add(e73Var2);
            } else {
                e73Var2 = (e73) arrayList2.get(this.m);
                d73 d73Var2 = (d73) linkedHashMap3.get(e73Var2);
                if (d73Var2 != null) {
                    d73Var2.i0();
                    e73 e73Var3 = (e73) linkedHashMap2.get(d73Var2);
                    if (e73Var3 != null) {
                    }
                    linkedHashMap2.remove(d73Var2);
                    e73Var2.c();
                }
            }
            int i2 = this.m;
            if (i2 < this.c - 1) {
                this.m = i2 + 1;
            } else {
                this.m = 0;
            }
        }
        linkedHashMap2.put(d73Var, e73Var2);
        linkedHashMap3.put(e73Var2, d73Var);
        return e73Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
