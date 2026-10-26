package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ek4 implements xf1, yf1 {
    public final mg e;
    public final vg f;
    public final bi4 g;
    public final int j;
    public final ok4 k;
    public boolean l;
    public final /* synthetic */ zf1 o;
    public final LinkedList d = new LinkedList();
    public final HashSet h = new HashSet();
    public final HashMap i = new HashMap();
    public final ArrayList m = new ArrayList();
    public ml0 n = null;

    public ek4(zf1 zf1Var, al4 al4Var) {
        this.o = zf1Var;
        Looper looper = zf1Var.m.getLooper();
        ci4 ci4VarA = al4Var.a();
        f13 f13Var = new f13((String) ci4VarA.h, (String) ci4VarA.l, (ul) ci4VarA.d);
        yj4 yj4Var = (yj4) al4Var.c.d;
        g13.s(yj4Var);
        mg mgVarN = yj4Var.n(al4Var.a, looper, f13Var, al4Var.d, this, this);
        String str = al4Var.b;
        if (str != null && (mgVarN instanceof a)) {
            ((a) mgVarN).r = str;
        }
        if (str != null && (mgVarN instanceof em2)) {
            fq2.y(mgVarN);
            throw null;
        }
        this.e = mgVarN;
        this.f = al4Var.e;
        this.g = new bi4(12);
        this.j = al4Var.f;
        if (!mgVarN.k()) {
            this.k = null;
            return;
        }
        Context context = zf1Var.e;
        el4 el4Var = zf1Var.m;
        ci4 ci4VarA2 = al4Var.a();
        this.k = new ok4(context, el4Var, new f13((String) ci4VarA2.h, (String) ci4VarA2.l, (ul) ci4VarA2.d));
    }

    public final void a(ml0 ml0Var) {
        HashSet hashSet = this.h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            m51.t();
        } else {
            if (gb2.D(ml0Var, ml0.n)) {
                this.e.h();
            }
            throw null;
        }
    }

    @Override // defpackage.xf1
    public final void b(int i) {
        Looper looperMyLooper = Looper.myLooper();
        el4 el4Var = this.o.m;
        if (looperMyLooper == el4Var.getLooper()) {
            i(i);
        } else {
            el4Var.post(new w11(this, i));
        }
    }

    @Override // defpackage.yf1
    public final void c(ml0 ml0Var) {
        o(ml0Var, null);
    }

    public final void d(Status status) {
        g13.r(this.o.m);
        f(status, null, false);
    }

    @Override // defpackage.xf1
    public final void e() {
        Looper looperMyLooper = Looper.myLooper();
        el4 el4Var = this.o.m;
        if (looperMyLooper == el4Var.getLooper()) {
            h();
        } else {
            el4Var.post(new im(14, this));
        }
    }

    public final void f(Status status, Exception exc, boolean z) {
        g13.r(this.o.m);
        if ((status == null) == (exc == null)) {
            u41.k("Status XOR exception should be null");
            return;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            lk4 lk4Var = (lk4) it.next();
            if (!z || lk4Var.a == 2) {
                if (status != null) {
                    lk4Var.c(status);
                } else {
                    lk4Var.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.d;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lk4 lk4Var = (lk4) arrayList.get(i);
            if (!this.e.b()) {
                return;
            }
            if (k(lk4Var)) {
                linkedList.remove(lk4Var);
            }
        }
    }

    public final void h() {
        zf1 zf1Var = this.o;
        g13.r(zf1Var.m);
        this.n = null;
        a(ml0.n);
        el4 el4Var = zf1Var.m;
        if (this.l) {
            vg vgVar = this.f;
            el4Var.removeMessages(11, vgVar);
            el4Var.removeMessages(9, vgVar);
            this.l = false;
        }
        Iterator it = this.i.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            m51.t();
        } else {
            g();
            j();
        }
    }

    public final void i(int i) {
        zf1 zf1Var = this.o;
        el4 el4Var = zf1Var.m;
        g13.r(zf1Var.m);
        this.n = null;
        this.l = true;
        String strJ = this.e.j();
        bi4 bi4Var = this.g;
        bi4Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strJ != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strJ);
        }
        bi4Var.k(true, new Status(20, sb.toString(), null, null));
        vg vgVar = this.f;
        el4Var.sendMessageDelayed(Message.obtain(el4Var, 9, vgVar), 5000L);
        el4Var.sendMessageDelayed(Message.obtain(el4Var, 11, vgVar), 120000L);
        ((SparseIntArray) zf1Var.g.d).clear();
        Iterator it = this.i.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            m51.t();
        }
    }

    public final void j() {
        zf1 zf1Var = this.o;
        el4 el4Var = zf1Var.m;
        vg vgVar = this.f;
        el4Var.removeMessages(12, vgVar);
        el4Var.sendMessageDelayed(el4Var.obtainMessage(12, vgVar), zf1Var.a);
    }

    public final boolean k(lk4 lk4Var) {
        o61 o61Var;
        if (lk4Var == null) {
            bi4 bi4Var = this.g;
            mg mgVar = this.e;
            lk4Var.f(bi4Var, mgVar.k());
            try {
                lk4Var.e(this);
                return true;
            } catch (DeadObjectException unused) {
                b(1);
                mgVar.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        o61[] o61VarArrB = lk4Var.b(this);
        if (o61VarArrB == null || o61VarArrB.length == 0) {
            o61Var = null;
            break;
        }
        o61[] o61VarArrG = this.e.g();
        if (o61VarArrG == null) {
            o61VarArrG = new o61[0];
        }
        sl slVar = new sl(o61VarArrG.length);
        for (o61 o61Var2 : o61VarArrG) {
            slVar.put(o61Var2.c, Long.valueOf(o61Var2.a()));
        }
        int length = o61VarArrB.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                o61Var = null;
                break;
            }
            o61Var = o61VarArrB[i];
            Long l = (Long) slVar.get(o61Var.c);
            if (l == null || l.longValue() < o61Var.a()) {
                break;
            }
            i++;
        }
        if (o61Var == null) {
            bi4 bi4Var2 = this.g;
            mg mgVar2 = this.e;
            lk4Var.f(bi4Var2, mgVar2.k());
            try {
                lk4Var.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                b(1);
                mgVar2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.e.getClass().getName() + " could not execute call because it requires feature (" + o61Var.c + ", " + o61Var.a() + ").");
        if (!this.o.n || !lk4Var.a(this)) {
            lk4Var.d(new q94(o61Var));
            return true;
        }
        fk4 fk4Var = new fk4(this.f, o61Var);
        int iIndexOf = this.m.indexOf(fk4Var);
        ArrayList arrayList = this.m;
        if (iIndexOf >= 0) {
            fk4 fk4Var2 = (fk4) arrayList.get(iIndexOf);
            this.o.m.removeMessages(15, fk4Var2);
            el4 el4Var = this.o.m;
            el4Var.sendMessageDelayed(Message.obtain(el4Var, 15, fk4Var2), 5000L);
            return false;
        }
        arrayList.add(fk4Var);
        el4 el4Var2 = this.o.m;
        el4Var2.sendMessageDelayed(Message.obtain(el4Var2, 15, fk4Var), 5000L);
        el4 el4Var3 = this.o.m;
        el4Var3.sendMessageDelayed(Message.obtain(el4Var3, 16, fk4Var), 120000L);
        ml0 ml0Var = new ml0(2, null, null);
        if (!l(ml0Var)) {
            this.o.a(ml0Var, this.j);
        }
        return false;
    }

    public final boolean l(ml0 ml0Var) {
        synchronized (zf1.q) {
        }
        return false;
    }

    public final void m() {
        zf1 zf1Var = this.o;
        g13.r(zf1Var.m);
        mg mgVar = this.e;
        if (mgVar.b() || mgVar.f()) {
            return;
        }
        try {
            mi4 mi4Var = zf1Var.g;
            Context context = zf1Var.e;
            SparseIntArray sparseIntArray = (SparseIntArray) mi4Var.d;
            g13.s(context);
            int iE = mgVar.e();
            int iB = ((SparseIntArray) mi4Var.d).get(iE, -1);
            if (iB == -1) {
                iB = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iE && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iB == -1) {
                    iB = ((vf1) mi4Var.h).b(context, iE);
                }
                sparseIntArray.put(iE, iB);
            }
            if (iB != 0) {
                ml0 ml0Var = new ml0(iB, null, null);
                Log.w("GoogleApiManager", "The service for " + mgVar.getClass().getName() + " is not available: " + ml0Var.toString());
                o(ml0Var, null);
                return;
            }
            gk4 gk4Var = new gk4(zf1Var, mgVar, this.f);
            if (mgVar.k()) {
                ok4 ok4Var = this.k;
                g13.s(ok4Var);
                Handler handler = ok4Var.f;
                f13 f13Var = ok4Var.i;
                nh3 nh3Var = ok4Var.j;
                if (nh3Var != null) {
                    nh3Var.n();
                }
                f13Var.f = Integer.valueOf(System.identityHashCode(ok4Var));
                ok4Var.j = (nh3) ok4Var.g.n(ok4Var.e, handler.getLooper(), f13Var, (oh3) f13Var.e, ok4Var, ok4Var);
                ok4Var.k = gk4Var;
                Set set = ok4Var.h;
                if (set == null || set.isEmpty()) {
                    handler.post(new im(16, ok4Var));
                } else {
                    nh3 nh3Var2 = ok4Var.j;
                    nh3Var2.getClass();
                    nh3Var2.i(new jb(nh3Var2));
                }
            }
            try {
                mgVar.i(gk4Var);
            } catch (SecurityException e) {
                o(new ml0(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            o(new ml0(10, null, null), e2);
        }
    }

    public final void n(lk4 lk4Var) {
        g13.r(this.o.m);
        boolean zB = this.e.b();
        LinkedList linkedList = this.d;
        if (zB) {
            if (k(lk4Var)) {
                j();
                return;
            } else {
                linkedList.add(lk4Var);
                return;
            }
        }
        linkedList.add(lk4Var);
        ml0 ml0Var = this.n;
        if (ml0Var == null || ml0Var.d == 0 || ml0Var.h == null) {
            m();
        } else {
            o(ml0Var, null);
        }
    }

    public final void o(ml0 ml0Var, RuntimeException runtimeException) {
        nh3 nh3Var;
        g13.r(this.o.m);
        ok4 ok4Var = this.k;
        if (ok4Var != null && (nh3Var = ok4Var.j) != null) {
            nh3Var.n();
        }
        g13.r(this.o.m);
        this.n = null;
        ((SparseIntArray) this.o.g.d).clear();
        a(ml0Var);
        if ((this.e instanceof cl4) && ml0Var.d != 24) {
            zf1 zf1Var = this.o;
            zf1Var.b = true;
            el4 el4Var = zf1Var.m;
            el4Var.sendMessageDelayed(el4Var.obtainMessage(19), 300000L);
        }
        if (ml0Var.d == 4) {
            d(zf1.p);
            return;
        }
        if (this.d.isEmpty()) {
            this.n = ml0Var;
            return;
        }
        zf1 zf1Var2 = this.o;
        if (runtimeException != null) {
            g13.r(zf1Var2.m);
            f(null, runtimeException, false);
            return;
        }
        boolean z = zf1Var2.n;
        vg vgVar = this.f;
        if (!z) {
            d(zf1.b(vgVar, ml0Var));
            return;
        }
        f(zf1.b(vgVar, ml0Var), null, true);
        if (this.d.isEmpty() || l(ml0Var) || this.o.a(ml0Var, this.j)) {
            return;
        }
        if (ml0Var.d == 18) {
            this.l = true;
        }
        if (!this.l) {
            d(zf1.b(this.f, ml0Var));
            return;
        }
        zf1 zf1Var3 = this.o;
        vg vgVar2 = this.f;
        el4 el4Var2 = zf1Var3.m;
        el4Var2.sendMessageDelayed(Message.obtain(el4Var2, 9, vgVar2), 5000L);
    }

    public final void p(ml0 ml0Var) {
        g13.r(this.o.m);
        mg mgVar = this.e;
        mgVar.d("onSignInFailed for " + mgVar.getClass().getName() + " with " + String.valueOf(ml0Var));
        o(ml0Var, null);
    }

    public final void q() {
        g13.r(this.o.m);
        Status status = zf1.o;
        d(status);
        this.g.k(false, status);
        for (t62 t62Var : (t62[]) this.i.keySet().toArray(new t62[0])) {
            n(new xk4(new us3()));
        }
        a(new ml0(4, null, null));
        mg mgVar = this.e;
        if (mgVar.b()) {
            mgVar.a(new sk3(18, this));
        }
    }
}
