package defpackage;

import ai.notrack.app.R;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class vt0 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public vt0(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final vt0 e(ViewGroup viewGroup, nd1 nd1Var) {
        viewGroup.getClass();
        nd1Var.getClass();
        nd1Var.I().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof vt0) {
            return (vt0) tag;
        }
        vt0 vt0Var = new vt0(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, vt0Var);
        return vt0Var;
    }

    public final void a(om3 om3Var) {
        om3Var.getClass();
        if (om3Var.b) {
            throw null;
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((om3) it.next()).getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            ((om3) listIterator.previous()).getClass();
            throw null;
        }
        if (nd1.K(2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ((om3) ke0.E0(arrayList)).getClass();
        if (arrayList.size() > 0) {
            ((om3) arrayList.get(0)).getClass();
            throw null;
        }
        if (arrayList.size() > 0) {
            om3 om3Var = (om3) arrayList.get(0);
            arrayList2.add(new pt0(om3Var, z));
            new ut0(om3Var);
            if (!z) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            if (!((ut0) obj).E()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList4.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList4.get(i2);
            i2++;
            ((ut0) obj2).getClass();
        }
        int size3 = arrayList5.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList5.get(i3);
            i3++;
            ((ut0) obj3).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        if (arrayList2.size() > 0) {
            ((pt0) arrayList2.get(0)).getClass();
            throw null;
        }
        arrayList7.isEmpty();
        int size4 = arrayList2.size();
        int i4 = 0;
        while (i4 < size4) {
            Object obj4 = arrayList2.get(i4);
            i4++;
            pt0 pt0Var = (pt0) obj4;
            Context context = this.a.getContext();
            pt0Var.getClass();
            context.getClass();
            mi4 mi4VarR = pt0Var.R(context);
            if (mi4VarR != null) {
                if (((AnimatorSet) mi4VarR.h) != null) {
                    throw null;
                }
                arrayList6.add(pt0Var);
            }
        }
        if (arrayList6.size() <= 0) {
            return;
        }
        ((pt0) arrayList6.get(0)).getClass();
        throw null;
    }

    public final void c() {
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            d();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList arrayListP0 = ke0.P0(this.c);
                this.c.clear();
                int size = arrayListP0.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListP0.get(i);
                    i++;
                    om3 om3Var = (om3) obj;
                    if (!this.b.isEmpty()) {
                        om3Var.getClass();
                        throw null;
                    }
                    om3Var.getClass();
                }
                int size2 = arrayListP0.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayListP0.get(i2);
                    i2++;
                    om3 om3Var2 = (om3) obj2;
                    if (this.d) {
                        if (nd1.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + om3Var2);
                        }
                        om3Var2.b();
                        throw null;
                    }
                    if (nd1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + om3Var2);
                    }
                    om3Var2.a(this.a);
                    this.d = false;
                    this.c.add(om3Var2);
                }
                if (!this.b.isEmpty()) {
                    g();
                    ArrayList arrayListP1 = ke0.P0(this.b);
                    if (arrayListP1.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayListP1);
                    if (nd1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListP1, this.e);
                    if (arrayListP1.size() > 0) {
                        ((om3) arrayListP1.get(0)).getClass();
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size3 = arrayListP1.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayListP1.get(i3);
                        i3++;
                        ((om3) obj3).getClass();
                        pe0.s0(null, arrayList);
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    boolean z = !zIsEmpty;
                    if (arrayListP1.size() > 0) {
                        ((om3) arrayListP1.get(0)).getClass();
                        throw null;
                    }
                    this.d = !z;
                    if (nd1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + z + " \ntransition = true");
                    }
                    if (!zIsEmpty) {
                        f(arrayListP1);
                        int size4 = arrayListP1.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            a((om3) arrayListP1.get(i4));
                        }
                    }
                    this.e = false;
                    if (nd1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str;
        String str2;
        if (nd1.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                f(this.b);
                ArrayList arrayListP0 = ke0.P0(this.c);
                int size = arrayListP0.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListP0.get(i2);
                    i2++;
                    ((om3) obj).getClass();
                }
                int size2 = arrayListP0.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayListP0.get(i3);
                    i3++;
                    om3 om3Var = (om3) obj2;
                    if (nd1.K(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = BuildConfig.VERSION_NAME;
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + om3Var);
                    }
                    om3Var.a(this.a);
                }
                ArrayList arrayListP1 = ke0.P0(this.b);
                int size3 = arrayListP1.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayListP1.get(i4);
                    i4++;
                    ((om3) obj3).getClass();
                }
                int size4 = arrayListP1.size();
                while (i < size4) {
                    Object obj4 = arrayListP1.get(i);
                    i++;
                    om3 om3Var2 = (om3) obj4;
                    if (nd1.K(2)) {
                        if (zIsAttachedToWindow) {
                            str = BuildConfig.VERSION_NAME;
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + om3Var2);
                    }
                    om3Var2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            om3 om3Var = (om3) list.get(i);
            om3Var.getClass();
            if (!om3Var.a) {
                om3Var.a = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((om3) it.next()).getClass();
            pe0.s0(null, arrayList);
        }
        List listO0 = ke0.O0(ke0.S0(arrayList));
        int size2 = listO0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            nm3 nm3Var = (nm3) listO0.get(i2);
            nm3Var.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!nm3Var.a) {
                nm3Var.c(viewGroup);
            }
            nm3Var.a = true;
        }
    }

    public final void g() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((om3) obj).getClass();
        }
    }
}
