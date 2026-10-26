package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public abstract class xc1 implements ComponentCallbacks, View.OnCreateContextMenuListener, n32, nd4, ph1, u93 {
    public static final Object b0 = new Object();
    public int A;
    public nd1 B;
    public zc1 C;
    public xc1 E;
    public int F;
    public int G;
    public String H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean M;
    public ViewGroup N;
    public boolean O;
    public wc1 Q;
    public boolean R;
    public boolean S;
    public String T;
    public g32 U;
    public p32 V;
    public final ih2 W;
    public v93 X;
    public cr1 Y;
    public final ArrayList Z;
    public final vc1 a0;
    public Bundle d;
    public SparseArray h;
    public Bundle l;
    public Bundle n;
    public xc1 o;
    public int q;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int c = -1;
    public String m = UUID.randomUUID().toString();
    public String p = null;
    public Boolean r = null;
    public nd1 D = new nd1();
    public final boolean L = true;
    public boolean P = true;

    public xc1() {
        new im(5, this);
        this.U = g32.m;
        this.W = new ih2();
        new AtomicInteger();
        this.Z = new ArrayList();
        this.a0 = new vc1(this);
        n();
    }

    public void A() {
        this.M = true;
    }

    public void B(Bundle bundle) {
    }

    public abstract void C();

    public abstract void D();

    public void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D.R();
        this.z = true;
        g();
    }

    public final Context F() {
        Context contextJ = j();
        if (contextJ != null) {
            return contextJ;
        }
        m51.j(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final void G(int i, int i2, int i3, int i4) {
        if (this.Q == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().b = i;
        f().c = i2;
        f().d = i3;
        f().e = i4;
    }

    public final void H(Bundle bundle) {
        nd1 nd1Var = this.B;
        if (nd1Var != null) {
            if (nd1Var == null ? false : nd1Var.P()) {
                u41.r("Fragment already added and state has been saved");
                return;
            }
        }
        this.n = bundle;
    }

    @Override // defpackage.u93
    public final t93 b() {
        return (t93) this.Y.c;
    }

    public yh4 c() {
        return new rv0(this);
    }

    @Override // defpackage.ph1
    public final kd4 d() {
        Application application = null;
        if (this.B == null) {
            u41.r("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.X == null) {
            for (Context applicationContext = F().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && nd1.K(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + F().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.X = new v93(application, this, this.n);
        }
        return this.X;
    }

    @Override // defpackage.ph1
    public final zg2 e() {
        Application application;
        Context applicationContext = F().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && nd1.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + F().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        zg2 zg2Var = new zg2(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) zg2Var.a;
        if (application != null) {
            linkedHashMap.put(jd4.d, application);
        }
        linkedHashMap.put(n93.a, this);
        linkedHashMap.put(n93.b, this);
        Bundle bundle = this.n;
        if (bundle != null) {
            linkedHashMap.put(n93.c, bundle);
        }
        return zg2Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final wc1 f() {
        if (this.Q == null) {
            wc1 wc1Var = new wc1();
            Object obj = b0;
            wc1Var.g = obj;
            wc1Var.h = obj;
            wc1Var.i = obj;
            wc1Var.j = null;
            this.Q = wc1Var;
        }
        return this.Q;
    }

    @Override // defpackage.nd4
    public final md4 g() {
        if (this.B == null) {
            u41.r("Can't access ViewModels from detached fragment");
            return null;
        }
        if (k() == 1) {
            u41.r("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.B.O.d;
        md4 md4Var = (md4) map.get(this.m);
        if (md4Var != null) {
            return md4Var;
        }
        md4 md4Var2 = new md4();
        map.put(this.m, md4Var2);
        return md4Var2;
    }

    @Override // defpackage.n32
    public final p32 h() {
        return this.V;
    }

    public final nd1 i() {
        if (this.C != null) {
            return this.D;
        }
        m51.j(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    public final Context j() {
        zc1 zc1Var = this.C;
        if (zc1Var == null) {
            return null;
        }
        return zc1Var.v;
    }

    public final int k() {
        g32 g32Var = this.U;
        return (g32Var == g32.d || this.E == null) ? g32Var.ordinal() : Math.min(g32Var.ordinal(), this.E.k());
    }

    public final nd1 l() {
        nd1 nd1Var = this.B;
        if (nd1Var != null) {
            return nd1Var;
        }
        m51.j(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final String m(int i) {
        return F().getResources().getString(i);
    }

    public final void n() {
        this.V = new p32(this);
        this.Y = new cr1(this);
        this.X = null;
        ArrayList arrayList = this.Z;
        vc1 vc1Var = this.a0;
        if (arrayList.contains(vc1Var)) {
            return;
        }
        if (this.c < 0) {
            arrayList.add(vc1Var);
            return;
        }
        xc1 xc1Var = vc1Var.a;
        xc1Var.Y.d();
        n93.b(xc1Var);
        Bundle bundle = xc1Var.d;
        xc1Var.Y.e(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final void o() {
        n();
        this.T = this.m;
        this.m = UUID.randomUUID().toString();
        this.s = false;
        this.t = false;
        this.v = false;
        this.w = false;
        this.y = false;
        this.A = 0;
        this.B = null;
        this.D = new nd1();
        this.C = null;
        this.F = 0;
        this.G = 0;
        this.H = null;
        this.I = false;
        this.J = false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.M = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        zc1 zc1Var = this.C;
        zh zhVar = zc1Var == null ? null : zc1Var.u;
        if (zhVar != null) {
            zhVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            m51.j(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.M = true;
    }

    public final boolean p() {
        return this.C != null && this.s;
    }

    public final boolean q() {
        if (this.I) {
            return true;
        }
        nd1 nd1Var = this.B;
        if (nd1Var != null) {
            xc1 xc1Var = this.E;
            nd1Var.getClass();
            if (xc1Var == null ? false : xc1Var.q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return this.A > 0;
    }

    public void s() {
        this.M = true;
    }

    public void t(int i, int i2, Intent intent) {
        if (nd1.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.m);
        if (this.F != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.F));
        }
        if (this.H != null) {
            sb.append(" tag=");
            sb.append(this.H);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(Context context) {
        this.M = true;
        zc1 zc1Var = this.C;
        if ((zc1Var == null ? null : zc1Var.u) != null) {
            this.M = true;
        }
    }

    public void v(Bundle bundle) {
        Bundle bundle2;
        this.M = true;
        Bundle bundle3 = this.d;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.D.X(bundle2);
            nd1 nd1Var = this.D;
            nd1Var.H = false;
            nd1Var.I = false;
            nd1Var.O.g = false;
            nd1Var.u(1);
        }
        nd1 nd1Var2 = this.D;
        if (nd1Var2.v >= 1) {
            return;
        }
        nd1Var2.H = false;
        nd1Var2.I = false;
        nd1Var2.O.g = false;
        nd1Var2.u(1);
    }

    public void w() {
        this.M = true;
    }

    public void x() {
        this.M = true;
    }

    public LayoutInflater y(Bundle bundle) {
        zc1 zc1Var = this.C;
        if (zc1Var == null) {
            u41.r("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        zh zhVar = zc1Var.y;
        LayoutInflater layoutInflaterCloneInContext = zhVar.getLayoutInflater().cloneInContext(zhVar);
        layoutInflaterCloneInContext.setFactory2(this.D.f);
        return layoutInflaterCloneInContext;
    }

    public void z() {
        this.M = true;
    }
}
