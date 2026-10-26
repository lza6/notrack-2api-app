package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class cd1 implements LayoutInflater.Factory2 {
    public final nd1 c;

    public cd1(nd1 nd1Var) {
        this.c = nd1Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        ud1 ud1VarG;
        boolean zEquals = bd1.class.getName().equals(str);
        nd1 nd1Var = this.c;
        if (zEquals) {
            return new bd1(context, attributeSet, nd1Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = xc1.class.isAssignableFrom(hd1.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    xc1 xc1VarC = resourceId != -1 ? nd1Var.C(resourceId) : null;
                    if (xc1VarC == null && string != null) {
                        xc1VarC = nd1Var.D(string);
                    }
                    if (xc1VarC == null && id != -1) {
                        xc1VarC = nd1Var.C(id);
                    }
                    if (xc1VarC == null) {
                        hd1 hd1VarH = nd1Var.H();
                        context.getClassLoader();
                        xc1VarC = hd1VarH.a(attributeValue);
                        xc1VarC.v = true;
                        xc1VarC.F = resourceId != 0 ? resourceId : id;
                        xc1VarC.G = id;
                        xc1VarC.H = string;
                        xc1VarC.w = true;
                        xc1VarC.B = nd1Var;
                        zc1 zc1Var = nd1Var.w;
                        xc1VarC.C = zc1Var;
                        zh zhVar = zc1Var.v;
                        xc1VarC.M = true;
                        if ((zc1Var == null ? null : zc1Var.u) != null) {
                            xc1VarC.M = true;
                        }
                        ud1VarG = nd1Var.a(xc1VarC);
                        if (nd1.K(2)) {
                            Log.v("FragmentManager", "Fragment " + xc1VarC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (xc1VarC.w) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        xc1VarC.w = true;
                        xc1VarC.B = nd1Var;
                        zc1 zc1Var2 = nd1Var.w;
                        xc1VarC.C = zc1Var2;
                        zh zhVar2 = zc1Var2.v;
                        xc1VarC.M = true;
                        if ((zc1Var2 == null ? null : zc1Var2.u) != null) {
                            xc1VarC.M = true;
                        }
                        ud1VarG = nd1Var.g(xc1VarC);
                        if (nd1.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + xc1VarC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    vd1 vd1Var = wd1.a;
                    wd1.b(new sd1(xc1VarC, "Attempting to use <fragment> tag to add fragment " + xc1VarC + " to container " + viewGroup));
                    wd1.a(xc1VarC).getClass();
                    xc1VarC.N = viewGroup;
                    ud1VarG.j();
                    ud1VarG.i();
                    u41.r(fq2.n("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
