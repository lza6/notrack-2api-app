package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d43 extends qk0 {
    public static final jn3 x = gb2.f(dv2.l);
    public static final AtomicReference y = new AtomicReference(Boolean.FALSE);
    public final wx a;
    public final Object b;
    public gs1 c;
    public Throwable d;
    public final ArrayList e;
    public List f;
    public gi2 g;
    public final oi2 h;
    public final ArrayList i;
    public final ArrayList j;
    public final fi2 k;
    public final fy2 l;
    public final fi2 m;
    public final fi2 n;
    public ArrayList o;
    public LinkedHashSet p;
    public t00 q;
    public sz0 r;
    public boolean s;
    public final jn3 t;
    public final is1 u;
    public final xp0 v;
    public final rn0 w;

    public d43(xp0 xp0Var) {
        wx wxVar = new wx(new j(29, this));
        this.a = wxVar;
        this.b = new Object();
        this.e = new ArrayList();
        this.g = new gi2();
        this.h = new oi2(0, new tk0[16]);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new fi2();
        this.l = new fy2(8);
        this.m = new fi2();
        this.n = new fi2();
        this.t = gb2.f(z33.h);
        new AtomicReference(kr1.k);
        is1 is1Var = new is1((gs1) xp0Var.get(bg1.s));
        is1Var.A(new pj2(5, this));
        this.u = is1Var;
        this.v = xp0Var.plus(wxVar).plus(is1Var);
        this.w = new rn0(26);
    }

    public static final tk0 q(d43 d43Var, tk0 tk0Var, gi2 gi2Var) {
        LinkedHashSet linkedHashSet;
        li2 li2VarC;
        d43Var.getClass();
        if (!tk0Var.A.E && !tk0Var.B && ((linkedHashSet = d43Var.p) == null || !linkedHashSet.contains(tk0Var))) {
            pj2 pj2Var = new pj2(6, tk0Var);
            sg2 sg2Var = new sg2(tk0Var, 4, gi2Var);
            pk3 pk3VarK = vk3.k();
            li2 li2Var = pk3VarK instanceof li2 ? (li2) pk3VarK : null;
            if (li2Var == null || (li2VarC = li2Var.C(pj2Var, sg2Var)) == null) {
                u41.r("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    pk3 pk3VarJ = li2VarC.j();
                    if (gi2Var != null) {
                        try {
                            if (gi2Var.h()) {
                                c9 c9Var = new c9(gi2Var, 21, tk0Var);
                                kk0 kk0Var = tk0Var.A;
                                if (kk0Var.E) {
                                    mk0.c("Preparing a composition while composing is not supported");
                                }
                                kk0Var.E = true;
                                try {
                                    c9Var.invoke();
                                    kk0Var.E = false;
                                } catch (Throwable th) {
                                    kk0Var.E = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            pk3.q(pk3VarJ);
                            throw th2;
                        }
                    }
                    boolean zW = tk0Var.w();
                    pk3.q(pk3VarJ);
                    s(li2VarC);
                    if (zW) {
                        return tk0Var;
                    }
                } catch (Throwable th3) {
                    s(li2VarC);
                    throw th3;
                }
            }
        }
        return null;
    }

    public static final boolean r(d43 d43Var) {
        List listX;
        synchronized (d43Var.b) {
            boolean z = true;
            if (d43Var.g.g()) {
                if (d43Var.h.h == 0 && !d43Var.v()) {
                    z = false;
                }
                return z;
            }
            ta3 ta3Var = new ta3(d43Var.g);
            d43Var.g = new gi2();
            synchronized (d43Var.b) {
                listX = d43Var.x();
            }
            try {
                int size = listX.size();
                for (int i = 0; i < size; i++) {
                    ((tk0) listX.get(i)).x(ta3Var);
                    if (((z33) d43Var.t.getValue()).compareTo(z33.d) <= 0) {
                        break;
                    }
                }
                synchronized (d43Var.b) {
                    d43Var.g = new gi2();
                }
                synchronized (d43Var.b) {
                    if (d43Var.u() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (d43Var.h.h == 0 && !d43Var.v()) {
                        z = false;
                    }
                }
                return z;
            } catch (Throwable th) {
                synchronized (d43Var.b) {
                    gi2 gi2Var = d43Var.g;
                    gi2Var.getClass();
                    Iterator<E> it = ta3Var.iterator();
                    while (it.hasNext()) {
                        gi2Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public static void s(li2 li2Var) {
        try {
            if (li2Var.w() instanceof qk3) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            li2Var.c();
        } catch (Throwable th) {
            li2Var.c();
            throw th;
        }
    }

    public static final void y(ArrayList arrayList, d43 d43Var, tk0 tk0Var) {
        arrayList.clear();
        synchronized (d43Var.b) {
            Iterator it = d43Var.j.iterator();
            if (it.hasNext()) {
                ((jg2) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void A(Throwable th, tk0 tk0Var) throws Throwable {
        if (!((Boolean) y.get()).booleanValue() || (th instanceof wj0)) {
            synchronized (this.b) {
                sz0 sz0Var = this.r;
                if (sz0Var != null) {
                    throw ((Throwable) sz0Var.c);
                }
                this.r = new sz0(th);
            }
            throw th;
        }
        synchronized (this.b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.i.clear();
                this.h.i();
                this.g = new gi2();
                this.j.clear();
                this.k.a();
                this.m.a();
                this.r = new sz0(th);
                if (tk0Var != null) {
                    B(tk0Var);
                }
                u();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void B(tk0 tk0Var) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o = arrayList;
        }
        if (!arrayList.contains(tk0Var)) {
            arrayList.add(tk0Var);
        }
        if (this.e.remove(tk0Var)) {
            this.f = null;
        }
    }

    @Override // defpackage.qk0
    public final void a(tk0 tk0Var, yg0 yg0Var) throws Throwable {
        li2 li2VarC;
        boolean z = tk0Var.A.E;
        try {
            pj2 pj2Var = new pj2(6, tk0Var);
            sg2 sg2Var = new sg2(tk0Var, 4, null);
            pk3 pk3VarK = vk3.k();
            li2 li2Var = pk3VarK instanceof li2 ? (li2) pk3VarK : null;
            if (li2Var == null || (li2VarC = li2Var.C(pj2Var, sg2Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                pk3 pk3VarJ = li2VarC.j();
                try {
                    tk0Var.l(yg0Var);
                    pk3.q(pk3VarJ);
                    s(li2VarC);
                    if (!z) {
                        vk3.k().m();
                    }
                    synchronized (this.b) {
                        if (((z33) this.t.getValue()).compareTo(z33.d) > 0 && !x().contains(tk0Var)) {
                            this.e.add(tk0Var);
                            this.f = null;
                        }
                    }
                    try {
                        synchronized (this.b) {
                            ArrayList arrayList = this.j;
                            if (arrayList.size() > 0) {
                                ((jg2) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            tk0Var.g();
                            tk0Var.i();
                            if (z) {
                                return;
                            }
                            vk3.k().m();
                        } catch (Throwable th) {
                            A(th, null);
                        }
                    } catch (Throwable th2) {
                        A(th2, tk0Var);
                    }
                } catch (Throwable th3) {
                    pk3.q(pk3VarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                s(li2VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            A(th5, tk0Var);
        }
    }

    @Override // defpackage.qk0
    public final boolean c() {
        return ((Boolean) y.get()).booleanValue();
    }

    @Override // defpackage.qk0
    public final boolean d() {
        return false;
    }

    @Override // defpackage.qk0
    public final boolean e() {
        return false;
    }

    @Override // defpackage.qk0
    public final int g() {
        return 1000;
    }

    @Override // defpackage.qk0
    public final xp0 h() {
        return this.v;
    }

    @Override // defpackage.qk0
    public final void i(tk0 tk0Var) {
        r00 r00VarU;
        synchronized (this.b) {
            if (this.h.j(tk0Var)) {
                r00VarU = null;
            } else {
                this.h.c(tk0Var);
                r00VarU = u();
            }
        }
        if (r00VarU != null) {
            ((t00) r00VarU).resumeWith(w84.a);
        }
    }

    @Override // defpackage.qk0
    public final ig2 j(jg2 jg2Var) {
        ig2 ig2Var;
        synchronized (this.b) {
            ig2Var = (ig2) this.m.j(jg2Var);
        }
        return ig2Var;
    }

    @Override // defpackage.qk0
    public final void k(Set set) {
    }

    @Override // defpackage.qk0
    public final void m(tk0 tk0Var) {
        synchronized (this.b) {
            try {
                LinkedHashSet linkedHashSet = this.p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.p = linkedHashSet;
                }
                linkedHashSet.add(tk0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qk0
    public final void p(tk0 tk0Var) {
        synchronized (this.b) {
            if (this.e.remove(tk0Var)) {
                this.f = null;
            }
            this.h.l(tk0Var);
            this.i.remove(tk0Var);
        }
    }

    public final void t() {
        synchronized (this.b) {
            if (((z33) this.t.getValue()).compareTo(z33.m) >= 0) {
                jn3 jn3Var = this.t;
                z33 z33Var = z33.d;
                jn3Var.getClass();
                jn3Var.p(null, z33Var);
            }
        }
        this.u.c(null);
    }

    public final r00 u() {
        jn3 jn3Var = this.t;
        int iCompareTo = ((z33) jn3Var.getValue()).compareTo(z33.d);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.i;
        oi2 oi2Var = this.h;
        if (iCompareTo <= 0) {
            this.e.clear();
            this.f = z21.c;
            this.g = new gi2();
            oi2Var.i();
            arrayList2.clear();
            arrayList.clear();
            this.o = null;
            t00 t00Var = this.q;
            if (t00Var != null) {
                t00Var.g(null);
            }
            this.q = null;
            this.r = null;
            return null;
        }
        sz0 sz0Var = this.r;
        z33 z33Var = z33.n;
        z33 z33Var2 = z33.h;
        if (sz0Var == null) {
            if (this.c == null) {
                this.g = new gi2();
                oi2Var.i();
                if (v()) {
                    z33Var2 = z33.l;
                }
            } else {
                z33Var2 = (oi2Var.h == 0 && !this.g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !v()) ? z33.m : z33Var;
            }
        }
        jn3Var.p(null, z33Var2);
        if (z33Var2 != z33Var) {
            return null;
        }
        t00 t00Var2 = this.q;
        this.q = null;
        return t00Var2;
    }

    public final boolean v() {
        return (this.s || this.a.n.get() == 0) ? false : true;
    }

    public final boolean w() {
        boolean z;
        synchronized (this.b) {
            z = this.g.h() || this.h.h != 0 || v();
        }
        return z;
    }

    public final List x() {
        List arrayList = this.f;
        if (arrayList == null) {
            ArrayList arrayList2 = this.e;
            arrayList = arrayList2.isEmpty() ? z21.c : new ArrayList(arrayList2);
            this.f = arrayList;
        }
        return arrayList;
    }

    public final List z(List list, gi2 gi2Var) {
        li2 li2VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((jg2) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            tk0 tk0Var = (tk0) entry.getKey();
            List list2 = (List) entry.getValue();
            if (tk0Var.A.E) {
                mk0.c("Check failed");
            }
            pj2 pj2Var = new pj2(6, tk0Var);
            sg2 sg2Var = new sg2(tk0Var, 4, gi2Var);
            pk3 pk3VarK = vk3.k();
            li2 li2Var = pk3VarK instanceof li2 ? (li2) pk3VarK : null;
            if (li2Var == null || (li2VarC = li2Var.C(pj2Var, sg2Var)) == null) {
                u41.r("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                pk3 pk3VarJ = li2VarC.j();
                try {
                    synchronized (this.b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                jg2 jg2Var = (jg2) list2.get(i2);
                                fi2 fi2Var = this.k;
                                jg2Var.getClass();
                                Object objA = ug2.a(fi2Var);
                                arrayList.add(new ps2(jg2Var, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                ps2 ps2Var = (ps2) arrayList.get(i3);
                                if (ps2Var.d == null) {
                                    fy2 fy2Var = this.l;
                                    ((jg2) ps2Var.c).getClass();
                                    if (((fi2) fy2Var.c).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(le0.q0(arrayList, 10));
                                        int size4 = arrayList.size();
                                        int i4 = 0;
                                        while (i4 < size4) {
                                            Object obj2 = arrayList.get(i4);
                                            i4++;
                                            ps2 ps2Var2 = (ps2) obj2;
                                            if (ps2Var2.d == null) {
                                                fy2 fy2Var2 = this.l;
                                                ((jg2) ps2Var2.c).getClass();
                                                fi2 fi2Var2 = (fi2) fy2Var2.c;
                                                if (fi2Var2.i()) {
                                                    ((fi2) fy2Var2.d).a();
                                                }
                                            }
                                            arrayList3.add(ps2Var2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((ps2) arrayList.get(i5)).d != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((ps2) arrayList.get(i6)).d == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        ps2 ps2Var3 = (ps2) arrayList.get(i7);
                                        if (ps2Var3.d == null) {
                                        }
                                    }
                                    synchronized (this.b) {
                                        pe0.s0(arrayList4, this.j);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj3 = arrayList.get(i8);
                                        if (((ps2) obj3).d != null) {
                                            arrayList5.add(obj3);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    tk0Var.r(arrayList);
                    pk3.q(pk3VarJ);
                    s(li2VarC);
                } catch (Throwable th2) {
                    pk3.q(pk3VarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                s(li2VarC);
                throw th3;
            }
        }
        return ke0.O0(map.keySet());
    }
}
