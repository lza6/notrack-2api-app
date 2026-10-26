package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qd1 extends gd4 {
    public static final pd1 h = new pd1(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public qd1(boolean z) {
        this.e = z;
    }

    @Override // defpackage.gd4
    public final void d() {
        if (nd1.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void e(xc1 xc1Var, boolean z) {
        if (nd1.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + xc1Var);
        }
        g(xc1Var.m, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qd1.class == obj.getClass()) {
            qd1 qd1Var = (qd1) obj;
            if (this.b.equals(qd1Var.b) && this.c.equals(qd1Var.c) && this.d.equals(qd1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z) {
        if (nd1.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z);
    }

    public final void g(String str, boolean z) {
        HashMap map = this.c;
        qd1 qd1Var = (qd1) map.get(str);
        if (qd1Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(qd1Var.c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    qd1Var.f((String) obj, true);
                }
            }
            qd1Var.d();
            map.remove(str);
        }
        HashMap map2 = this.d;
        md4 md4Var = (md4) map2.get(str);
        if (md4Var != null) {
            md4Var.a();
            map2.remove(str);
        }
    }

    public final void h(xc1 xc1Var) {
        if (this.g) {
            if (nd1.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(xc1Var.m) == null || !nd1.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + xc1Var);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
