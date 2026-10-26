package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class m73 {
    public static final boolean a = kr1.n(Build.DEVICE, "layoutlib");

    public static final c73 a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof c73) {
                return (c73) childAt;
            }
        }
        c73 c73Var = new c73(viewGroup.getContext());
        viewGroup.addView(c73Var);
        return c73Var;
    }

    public static final ViewGroup b(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                j93.i(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                return null;
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
