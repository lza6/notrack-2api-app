package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ud1 {
    public final bv0 a;
    public final ir3 b;
    public final xc1 c;
    public boolean d = false;
    public int e = -1;

    public ud1(bv0 bv0Var, ir3 ir3Var, ClassLoader classLoader, hd1 hd1Var, Bundle bundle) {
        this.a = bv0Var;
        this.b = ir3Var;
        td1 td1Var = (td1) bundle.getParcelable("state");
        xc1 xc1VarA = hd1Var.a(td1Var.c);
        xc1VarA.m = td1Var.d;
        xc1VarA.v = td1Var.h;
        xc1VarA.x = td1Var.l;
        xc1VarA.y = true;
        xc1VarA.F = td1Var.m;
        xc1VarA.G = td1Var.n;
        xc1VarA.H = td1Var.o;
        xc1VarA.K = td1Var.p;
        xc1VarA.t = td1Var.q;
        xc1VarA.J = td1Var.r;
        xc1VarA.I = td1Var.s;
        xc1VarA.U = g32.values()[td1Var.t];
        xc1VarA.p = td1Var.u;
        xc1VarA.q = td1Var.v;
        xc1VarA.P = td1Var.w;
        this.c = xc1VarA;
        xc1VarA.d = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        xc1VarA.H(bundle2);
        if (nd1.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + xc1VarA);
        }
    }

    public ud1(bv0 bv0Var, ir3 ir3Var, xc1 xc1Var) {
        this.a = bv0Var;
        this.b = ir3Var;
        this.c = xc1Var;
    }

    public ud1(bv0 bv0Var, ir3 ir3Var, xc1 xc1Var, Bundle bundle) {
        this.a = bv0Var;
        this.b = ir3Var;
        this.c = xc1Var;
        xc1Var.h = null;
        xc1Var.l = null;
        xc1Var.A = 0;
        xc1Var.w = false;
        xc1Var.s = false;
        xc1 xc1Var2 = xc1Var.o;
        xc1Var.p = xc1Var2 != null ? xc1Var2.m : null;
        xc1Var.o = null;
        xc1Var.d = bundle;
        xc1Var.n = bundle.getBundle("arguments");
    }

    public final void a() {
        boolean zK = nd1.K(3);
        xc1 xc1Var = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + xc1Var);
        }
        Bundle bundle = xc1Var.d;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        xc1Var.D.R();
        xc1Var.c = 3;
        xc1Var.M = false;
        xc1Var.s();
        if (!xc1Var.M) {
            m51.i(xc1Var, " did not call through to super.onActivityCreated()");
            return;
        }
        if (nd1.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + xc1Var);
        }
        xc1Var.d = null;
        nd1 nd1Var = xc1Var.D;
        nd1Var.H = false;
        nd1Var.I = false;
        nd1Var.O.g = false;
        nd1Var.u(4);
        this.a.j(xc1Var, false);
    }

    public final void b() {
        ud1 ud1Var;
        boolean zK = nd1.K(3);
        xc1 xc1Var = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto ATTACHED: " + xc1Var);
        }
        xc1 xc1Var2 = xc1Var.o;
        ir3 ir3Var = this.b;
        if (xc1Var2 != null) {
            ud1Var = (ud1) ((HashMap) ir3Var.d).get(xc1Var2.m);
            if (ud1Var == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(xc1Var);
                xc1 xc1Var3 = xc1Var.o;
                sb.append(" declared target fragment ");
                sb.append(xc1Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            xc1Var.p = xc1Var.o.m;
            xc1Var.o = null;
        } else {
            String str = xc1Var.p;
            if (str != null) {
                ud1Var = (ud1) ((HashMap) ir3Var.d).get(str);
                if (ud1Var == null) {
                    StringBuilder sb2 = new StringBuilder("Fragment ");
                    sb2.append(xc1Var);
                    sb2.append(" declared target fragment ");
                    u41.r(fq2.r(sb2, xc1Var.p, " that does not belong to this FragmentManager!"));
                    return;
                }
            } else {
                ud1Var = null;
            }
        }
        if (ud1Var != null) {
            ud1Var.j();
        }
        nd1 nd1Var = xc1Var.B;
        xc1Var.C = nd1Var.w;
        xc1Var.E = nd1Var.y;
        bv0 bv0Var = this.a;
        bv0Var.p(xc1Var, false);
        ArrayList arrayList = xc1Var.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xc1 xc1Var4 = ((vc1) obj).a;
            xc1Var4.Y.d();
            n93.b(xc1Var4);
            Bundle bundle = xc1Var4.d;
            xc1Var4.Y.e(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        xc1Var.D.b(xc1Var.C, xc1Var.c(), xc1Var);
        xc1Var.c = 0;
        xc1Var.M = false;
        xc1Var.u(xc1Var.C.v);
        if (!xc1Var.M) {
            m51.i(xc1Var, " did not call through to super.onAttach()");
            return;
        }
        Iterator it = xc1Var.B.p.iterator();
        while (it.hasNext()) {
            ((rd1) it.next()).c();
        }
        nd1 nd1Var2 = xc1Var.D;
        nd1Var2.H = false;
        nd1Var2.I = false;
        nd1Var2.O.g = false;
        nd1Var2.u(0);
        bv0Var.k(xc1Var, false);
    }

    public final int c() {
        Object obj;
        Object obj2;
        xc1 xc1Var = this.c;
        if (xc1Var.B == null) {
            return xc1Var.c;
        }
        int iMin = this.e;
        int iOrdinal = xc1Var.U.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (xc1Var.v) {
            boolean z = xc1Var.w;
            int i2 = this.e;
            if (z) {
                iMin = Math.max(i2, 2);
            } else {
                iMin = i2 < 4 ? Math.min(iMin, xc1Var.c) : Math.min(iMin, 1);
            }
        }
        if (xc1Var.x && xc1Var.N == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!xc1Var.s) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = xc1Var.N;
        if (viewGroup != null) {
            vt0 vt0VarE = vt0.e(viewGroup, xc1Var.l());
            ArrayList arrayList = vt0VarE.b;
            int size = arrayList.size();
            int i3 = 0;
            do {
                obj = null;
                if (i3 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i3);
                i3++;
                ((om3) obj2).getClass();
            } while (!kr1.n(null, xc1Var));
            ArrayList arrayList2 = vt0VarE.c;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj3 = arrayList2.get(i);
                i++;
                ((om3) obj3).getClass();
                if (kr1.n(null, xc1Var)) {
                    obj = obj3;
                    break;
                }
            }
        }
        if (xc1Var.t) {
            iMin = xc1Var.r() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (xc1Var.O && xc1Var.c < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (xc1Var.u) {
            iMin = Math.max(iMin, 3);
        }
        if (nd1.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + xc1Var);
        }
        return iMin;
    }

    public final void d() {
        Bundle bundle;
        int i = 3;
        boolean zK = nd1.K(3);
        xc1 xc1Var = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto CREATED: " + xc1Var);
        }
        Bundle bundle2 = xc1Var.d;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (xc1Var.S) {
            xc1Var.c = 1;
            Bundle bundle4 = xc1Var.d;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            xc1Var.D.X(bundle);
            nd1 nd1Var = xc1Var.D;
            nd1Var.H = false;
            nd1Var.I = false;
            nd1Var.O.g = false;
            nd1Var.u(1);
            return;
        }
        bv0 bv0Var = this.a;
        bv0Var.q(xc1Var, false);
        xc1Var.D.R();
        xc1Var.c = 1;
        xc1Var.M = false;
        xc1Var.V.a(new g43(i, xc1Var));
        xc1Var.v(bundle3);
        xc1Var.S = true;
        if (!xc1Var.M) {
            m51.i(xc1Var, " did not call through to super.onCreate()");
        } else {
            xc1Var.V.e(f32.ON_CREATE);
            bv0Var.l(xc1Var, false);
        }
    }

    public final void e() {
        String resourceName;
        xc1 xc1Var = this.c;
        if (xc1Var.v) {
            return;
        }
        if (nd1.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + xc1Var);
        }
        Bundle bundle = xc1Var.d;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterY = xc1Var.y(bundle2);
        ViewGroup viewGroup2 = xc1Var.N;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = xc1Var.G;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + xc1Var + " for a container view with no id");
                }
                viewGroup = (ViewGroup) xc1Var.B.x.M(i);
                if (viewGroup == null) {
                    if (!xc1Var.y && !xc1Var.x) {
                        try {
                            resourceName = xc1Var.F().getResources().getResourceName(xc1Var.G);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(xc1Var.G) + " (" + resourceName + ") for fragment " + xc1Var);
                    }
                } else if (!(viewGroup instanceof bd1)) {
                    vd1 vd1Var = wd1.a;
                    wd1.b(new sd1(xc1Var, "Attempting to add fragment " + xc1Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    wd1.a(xc1Var).getClass();
                }
            }
        }
        xc1Var.N = viewGroup;
        xc1Var.E(layoutInflaterY, viewGroup, bundle2);
        xc1Var.c = 2;
    }

    public final void f() {
        boolean z;
        xc1 xc1VarM;
        boolean zK = nd1.K(3);
        xc1 xc1Var = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATED: " + xc1Var);
        }
        int i = 0;
        boolean z2 = xc1Var.t && !xc1Var.r();
        ir3 ir3Var = this.b;
        if (z2) {
            ir3Var.g0(xc1Var.m, null);
        }
        if (!z2) {
            qd1 qd1Var = (qd1) ir3Var.l;
            if (!((qd1Var.b.containsKey(xc1Var.m) && qd1Var.e) ? qd1Var.f : true)) {
                String str = xc1Var.p;
                if (str != null && (xc1VarM = ir3Var.M(str)) != null && xc1VarM.K) {
                    xc1Var.o = xc1VarM;
                }
                xc1Var.c = 0;
                return;
            }
        }
        zc1 zc1Var = xc1Var.C;
        if (zc1Var != null) {
            z = ((qd1) ir3Var.l).f;
        } else {
            zh zhVar = zc1Var.v;
            z = zhVar != null ? !zhVar.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((qd1) ir3Var.l).e(xc1Var, false);
        }
        xc1Var.D.l();
        xc1Var.V.e(f32.ON_DESTROY);
        xc1Var.c = 0;
        xc1Var.M = false;
        xc1Var.S = false;
        xc1Var.M = true;
        if (!xc1Var.M) {
            m51.i(xc1Var, " did not call through to super.onDestroy()");
            return;
        }
        this.a.m(xc1Var, false);
        ArrayList arrayListR = ir3Var.R();
        int size = arrayListR.size();
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            ud1 ud1Var = (ud1) obj;
            if (ud1Var != null) {
                xc1 xc1Var2 = ud1Var.c;
                if (xc1Var.m.equals(xc1Var2.p)) {
                    xc1Var2.o = xc1Var;
                    xc1Var2.p = null;
                }
            }
        }
        String str2 = xc1Var.p;
        if (str2 != null) {
            xc1Var.o = ir3Var.M(str2);
        }
        ir3Var.c0(this);
    }

    public final void g() {
        boolean zK = nd1.K(3);
        xc1 xc1Var = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + xc1Var);
        }
        ViewGroup viewGroup = xc1Var.N;
        xc1Var.D.u(1);
        xc1Var.c = 1;
        xc1Var.M = false;
        xc1Var.w();
        if (!xc1Var.M) {
            m51.i(xc1Var, " did not call through to super.onDestroyView()");
            return;
        }
        lm3 lm3Var = ((y62) bv0.z(xc1Var).h).b;
        if (lm3Var.h > 0) {
            lm3Var.d(0).getClass();
            m51.t();
            return;
        }
        xc1Var.z = false;
        this.a.v(xc1Var, false);
        xc1Var.N = null;
        xc1Var.W.f(null);
        xc1Var.w = false;
    }

    public final void h() {
        boolean zK = nd1.K(3);
        xc1 xc1Var = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + xc1Var);
        }
        xc1Var.c = -1;
        xc1Var.M = false;
        xc1Var.x();
        if (!xc1Var.M) {
            m51.i(xc1Var, " did not call through to super.onDetach()");
            return;
        }
        nd1 nd1Var = xc1Var.D;
        if (!nd1Var.J) {
            nd1Var.l();
            xc1Var.D = new nd1();
        }
        this.a.n(xc1Var, false);
        xc1Var.c = -1;
        xc1Var.C = null;
        xc1Var.E = null;
        xc1Var.B = null;
        if (!xc1Var.t || xc1Var.r()) {
            qd1 qd1Var = (qd1) this.b.l;
            if (!((qd1Var.b.containsKey(xc1Var.m) && qd1Var.e) ? qd1Var.f : true)) {
                return;
            }
        }
        if (nd1.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + xc1Var);
        }
        xc1Var.o();
    }

    public final void i() {
        xc1 xc1Var = this.c;
        if (xc1Var.v && xc1Var.w && !xc1Var.z) {
            if (nd1.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + xc1Var);
            }
            Bundle bundle = xc1Var.d;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            xc1Var.E(xc1Var.y(bundle2), null, bundle2);
        }
    }

    public final void j() {
        ir3 ir3Var = this.b;
        boolean z = this.d;
        xc1 xc1Var = this.c;
        if (z) {
            if (nd1.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + xc1Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iC = c();
                int i = xc1Var.c;
                if (iC == i) {
                    if (!z2 && i == -1 && xc1Var.t && !xc1Var.r()) {
                        if (nd1.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + xc1Var);
                        }
                        ((qd1) ir3Var.l).e(xc1Var, true);
                        ir3Var.c0(this);
                        if (nd1.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + xc1Var);
                        }
                        xc1Var.o();
                    }
                    if (xc1Var.R) {
                        nd1 nd1Var = xc1Var.B;
                        if (nd1Var != null && xc1Var.s && nd1.L(xc1Var)) {
                            nd1Var.G = true;
                        }
                        xc1Var.R = false;
                        xc1Var.D.o();
                    }
                    return;
                }
                if (iC <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            xc1Var.c = 1;
                            break;
                        case 2:
                            xc1Var.w = false;
                            xc1Var.c = 2;
                            break;
                        case 3:
                            if (nd1.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + xc1Var);
                            }
                            xc1Var.c = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            xc1Var.c = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            xc1Var.c = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            xc1Var.c = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void k() {
        boolean zK = nd1.K(3);
        xc1 xc1Var = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom RESUMED: " + xc1Var);
        }
        xc1Var.D.u(5);
        xc1Var.V.e(f32.ON_PAUSE);
        xc1Var.c = 6;
        xc1Var.M = false;
        xc1Var.z();
        if (xc1Var.M) {
            this.a.o(xc1Var, false);
        } else {
            m51.i(xc1Var, " did not call through to super.onPause()");
        }
    }

    public final void l(ClassLoader classLoader) {
        xc1 xc1Var = this.c;
        Bundle bundle = xc1Var.d;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (xc1Var.d.getBundle("savedInstanceState") == null) {
            xc1Var.d.putBundle("savedInstanceState", new Bundle());
        }
        try {
            xc1Var.h = xc1Var.d.getSparseParcelableArray("viewState");
            xc1Var.l = xc1Var.d.getBundle("viewRegistryState");
            td1 td1Var = (td1) xc1Var.d.getParcelable("state");
            if (td1Var != null) {
                xc1Var.p = td1Var.u;
                xc1Var.q = td1Var.v;
                xc1Var.P = td1Var.w;
            }
            if (xc1Var.P) {
                return;
            }
            xc1Var.O = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + xc1Var, e);
        }
    }

    public final void m() {
        boolean zK = nd1.K(3);
        xc1 xc1Var = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto RESUMED: " + xc1Var);
        }
        wc1 wc1Var = xc1Var.Q;
        View view = wc1Var == null ? null : wc1Var.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        xc1Var.f().j = null;
        xc1Var.D.R();
        xc1Var.D.A(true);
        xc1Var.c = 7;
        xc1Var.M = false;
        xc1Var.A();
        if (!xc1Var.M) {
            m51.i(xc1Var, " did not call through to super.onResume()");
            return;
        }
        xc1Var.V.e(f32.ON_RESUME);
        nd1 nd1Var = xc1Var.D;
        nd1Var.H = false;
        nd1Var.I = false;
        nd1Var.O.g = false;
        nd1Var.u(7);
        this.a.r(xc1Var, false);
        this.b.g0(xc1Var.m, null);
        xc1Var.d = null;
        xc1Var.h = null;
        xc1Var.l = null;
    }

    public final void n() {
        boolean zK = nd1.K(3);
        xc1 xc1Var = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto STARTED: " + xc1Var);
        }
        xc1Var.D.R();
        xc1Var.D.A(true);
        xc1Var.c = 5;
        xc1Var.M = false;
        xc1Var.C();
        if (!xc1Var.M) {
            m51.i(xc1Var, " did not call through to super.onStart()");
            return;
        }
        xc1Var.V.e(f32.ON_START);
        nd1 nd1Var = xc1Var.D;
        nd1Var.H = false;
        nd1Var.I = false;
        nd1Var.O.g = false;
        nd1Var.u(5);
        this.a.t(xc1Var, false);
    }

    public final void o() {
        boolean zK = nd1.K(3);
        xc1 xc1Var = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom STARTED: " + xc1Var);
        }
        nd1 nd1Var = xc1Var.D;
        nd1Var.I = true;
        nd1Var.O.g = true;
        nd1Var.u(4);
        xc1Var.V.e(f32.ON_STOP);
        xc1Var.c = 4;
        xc1Var.M = false;
        xc1Var.D();
        if (xc1Var.M) {
            this.a.u(xc1Var, false);
        } else {
            m51.i(xc1Var, " did not call through to super.onStop()");
        }
    }
}
