package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class cr1 {
    public boolean a;
    public final Object b;
    public Object c;

    public cr1() {
        this.b = new Object();
    }

    public cr1(gq0 gq0Var, boolean z, ne1 ne1Var, by2 by2Var) {
        this.a = z;
        this.b = gm4.b(-2, 4, fy.c);
        this.c = py.F(gq0Var, null, null, new qb(by2Var, ne1Var, this, (so0) null, 17), 3);
    }

    public cr1(j82 j82Var, fp1 fp1Var) {
        this.b = j82Var;
        this.c = fp1Var;
    }

    public cr1(sk3 sk3Var, o61[] o61VarArr, boolean z) {
        this.c = sk3Var;
        this.b = o61VarArr;
        boolean z2 = false;
        if (o61VarArr != null && z) {
            z2 = true;
        }
        this.a = z2;
    }

    public cr1(u93 u93Var) {
        this.b = u93Var;
        this.c = new t93();
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((fp1) this.c).c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (xr0.V(((fx2) obj).a, j)) {
                break;
            }
            i++;
        }
        fx2 fx2Var = (fx2) obj;
        if (fx2Var != null) {
            return fx2Var.h;
        }
        return false;
    }

    public void b() {
        ((jy) this.b).l(new CancellationException("onBack cancelled"), true);
        ((ym3) this.c).c(null);
    }

    public void c(mg mgVar, us3 us3Var) {
        sk3 sk3Var = (sk3) ((sk3) this.c).d;
        sk3Var.getClass();
        yk4 yk4Var = (yk4) ((cl4) mgVar).q();
        gt3 gt3Var = (gt3) sk3Var.d;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(yk4Var.f);
        int i = kk4.a;
        if (gt3Var == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            gt3Var.writeToParcel(parcelObtain, 0);
        }
        try {
            yk4Var.e.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            sd sdVar = us3Var.a;
            synchronized (sdVar.b) {
                sdVar.i();
                sdVar.a = true;
                sdVar.d = null;
            }
            ((cr1) sdVar.c).h(sdVar);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public void d() {
        u93 u93Var = (u93) this.b;
        p32 p32VarH = u93Var.h();
        if (p32VarH.c != g32.d) {
            u41.r("Restarter must be created only during owner's initialization stage");
            return;
        }
        int i = 0;
        p32VarH.a(new g43(i, u93Var));
        t93 t93Var = (t93) this.c;
        t93Var.getClass();
        if (t93Var.b) {
            u41.r("SavedStateRegistry was already attached.");
            return;
        }
        p32VarH.a(new q93(i, t93Var));
        t93Var.b = true;
        this.a = true;
    }

    public void e(Bundle bundle) {
        if (!this.a) {
            d();
        }
        p32 p32VarH = ((u93) this.b).h();
        if (p32VarH.c.compareTo(g32.l) >= 0) {
            m51.y(p32VarH.c, "performRestore cannot be called when owner is ");
            return;
        }
        t93 t93Var = (t93) this.c;
        if (!t93Var.b) {
            u41.r("You must call performAttach() before calling performRestore(Bundle).");
        } else if (t93Var.d) {
            u41.r("SavedStateRegistry was already restored.");
        } else {
            t93Var.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            t93Var.d = true;
        }
    }

    public void f(Bundle bundle) {
        t93 t93Var = (t93) this.c;
        t93Var.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = t93Var.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        x83 x83Var = t93Var.a;
        x83Var.getClass();
        v83 v83Var = new v83(x83Var);
        x83Var.h.put(v83Var, Boolean.FALSE);
        while (v83Var.hasNext()) {
            Map.Entry entry = (Map.Entry) v83Var.next();
            bundle2.putBundle((String) entry.getKey(), ((s93) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void g(qs4 qs4Var) {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(qs4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(sd sdVar) {
        qs4 qs4Var;
        synchronized (this.b) {
            if (((ArrayDeque) this.c) != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.b) {
                        try {
                            qs4Var = (qs4) ((ArrayDeque) this.c).poll();
                            if (qs4Var == null) {
                                this.a = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    qs4Var.a(sdVar);
                }
            }
        }
    }
}
