package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class m01 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }
}
