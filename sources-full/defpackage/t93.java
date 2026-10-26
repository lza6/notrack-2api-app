package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t93 {
    public boolean b;
    public Bundle c;
    public boolean d;
    public xh e;
    public final x83 a = new x83();
    public boolean f = true;

    public final Bundle a(String str) {
        if (!this.d) {
            u41.r("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.c = null;
        return bundle2;
    }

    public final s93 b() {
        String str;
        s93 s93Var;
        Iterator it = this.a.iterator();
        do {
            t83 t83Var = (t83) it;
            if (!t83Var.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) t83Var.next();
            entry.getClass();
            str = (String) entry.getKey();
            s93Var = (s93) entry.getValue();
        } while (!kr1.n(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return s93Var;
    }

    public final void c(String str, s93 s93Var) {
        Object obj;
        s93Var.getClass();
        x83 x83Var = this.a;
        u83 u83VarB = x83Var.b(str);
        if (u83VarB != null) {
            obj = u83VarB.d;
        } else {
            u83 u83Var = new u83(str, s93Var);
            x83Var.l++;
            u83 u83Var2 = x83Var.d;
            if (u83Var2 == null) {
                x83Var.c = u83Var;
                x83Var.d = u83Var;
            } else {
                u83Var2.h = u83Var;
                u83Var.l = u83Var2;
                x83Var.d = u83Var;
            }
            obj = null;
        }
        if (((s93) obj) == null) {
            return;
        }
        u41.k("SavedStateProvider with the given key is already registered");
    }

    public final void d() {
        if (!this.f) {
            u41.r("Can not perform this action after onSaveInstanceState");
            return;
        }
        xh xhVar = this.e;
        if (xhVar == null) {
            xhVar = new xh(this);
        }
        this.e = xhVar;
        try {
            y22.class.getDeclaredConstructor(null);
            xh xhVar2 = this.e;
            if (xhVar2 != null) {
                ((LinkedHashSet) xhVar2.b).add(y22.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + y22.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
