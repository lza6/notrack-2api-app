package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import defpackage.ao4;
import defpackage.cp4;
import defpackage.ek4;
import defpackage.em4;
import defpackage.f13;
import defpackage.fs4;
import defpackage.g13;
import defpackage.gl4;
import defpackage.if1;
import defpackage.im;
import defpackage.jl4;
import defpackage.lp4;
import defpackage.mg;
import defpackage.ml0;
import defpackage.o61;
import defpackage.p73;
import defpackage.po4;
import defpackage.sk3;
import defpackage.sq4;
import defpackage.ss4;
import defpackage.u41;
import defpackage.vf1;
import defpackage.wf1;
import defpackage.wk1;
import defpackage.xf1;
import defpackage.xr;
import defpackage.yf1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements mg {
    public static final o61[] x = new o61[0];
    public volatile String a;
    public p73 b;
    public final Context c;
    public final ss4 d;
    public final em4 e;
    public final Object f;
    public final Object g;
    public jl4 h;
    public xr i;
    public IInterface j;
    public final ArrayList k;
    public po4 l;
    public int m;
    public final sk3 n;
    public final sk3 o;
    public final int p;
    public final String q;
    public volatile String r;
    public ml0 s;
    public boolean t;
    public volatile sq4 u;
    public final AtomicInteger v;
    public final Set w;

    public a(Context context, Looper looper, int i, f13 f13Var, xf1 xf1Var, yf1 yf1Var) {
        synchronized (ss4.g) {
            try {
                if (ss4.h == null) {
                    ss4.h = new ss4(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ss4 ss4Var = ss4.h;
        Object obj = vf1.b;
        g13.s(xf1Var);
        g13.s(yf1Var);
        sk3 sk3Var = new sk3(19, xf1Var);
        sk3 sk3Var2 = new sk3(20, yf1Var);
        String str = (String) f13Var.d;
        this.a = null;
        this.f = new Object();
        this.g = new Object();
        this.k = new ArrayList();
        this.m = 1;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = new AtomicInteger(0);
        g13.t(context, "Context must not be null");
        this.c = context;
        g13.t(looper, "Looper must not be null");
        g13.t(ss4Var, "Supervisor must not be null");
        this.d = ss4Var;
        this.e = new em4(this, looper);
        this.p = i;
        this.n = sk3Var;
        this.o = sk3Var2;
        this.q = str;
        Set set = (Set) f13Var.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                u41.r("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.w = set;
    }

    @Override // defpackage.mg
    public final void a(sk3 sk3Var) {
        ((ek4) sk3Var.d).o.m.post(new im(15, sk3Var));
    }

    @Override // defpackage.mg
    public final boolean b() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 4;
        }
        return z;
    }

    @Override // defpackage.mg
    public final Set c() {
        return k() ? this.w : Collections.EMPTY_SET;
    }

    @Override // defpackage.mg
    public final void d(String str) {
        this.a = str;
        n();
    }

    @Override // defpackage.mg
    public final boolean f() {
        boolean z;
        synchronized (this.f) {
            int i = this.m;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.mg
    public final o61[] g() {
        sq4 sq4Var = this.u;
        if (sq4Var == null) {
            return null;
        }
        return sq4Var.d;
    }

    @Override // defpackage.mg
    public final void h() {
        if (!b() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // defpackage.mg
    public final void i(xr xrVar) {
        this.i = xrVar;
        v(2, null);
    }

    @Override // defpackage.mg
    public final String j() {
        return this.a;
    }

    @Override // defpackage.mg
    public boolean k() {
        return false;
    }

    @Override // defpackage.mg
    public final void l(wk1 wk1Var, Set set) {
        Bundle bundleP = p();
        String str = this.r;
        int i = this.p;
        int i2 = wf1.a;
        Scope[] scopeArr = if1.w;
        Bundle bundle = new Bundle();
        o61[] o61VarArr = if1.x;
        if1 if1Var = new if1(6, i, i2, null, null, scopeArr, bundle, null, o61VarArr, o61VarArr, true, 0, false, str);
        if1Var.l = this.c.getPackageName();
        if1Var.o = bundleP;
        if (set != null) {
            if1Var.n = (Scope[]) set.toArray(new Scope[0]);
        }
        if (k()) {
            if1Var.p = new Account("<<default account>>", "com.google");
            if (wk1Var != null) {
                if1Var.m = wk1Var.asBinder();
            }
        }
        if1Var.q = x;
        if1Var.r = o();
        try {
            synchronized (this.g) {
                try {
                    jl4 jl4Var = this.h;
                    if (jl4Var != null) {
                        jl4Var.b(new ao4(this, this.v.get()), if1Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.v.get();
            em4 em4Var = this.e;
            em4Var.sendMessage(em4Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.v.get();
            cp4 cp4Var = new cp4(this, 8, null, null);
            em4 em4Var2 = this.e;
            em4Var2.sendMessage(em4Var2.obtainMessage(1, i4, -1, cp4Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.v.get();
            cp4 cp4Var2 = new cp4(this, 8, null, null);
            em4 em4Var3 = this.e;
            em4Var3.sendMessage(em4Var3.obtainMessage(1, i5, -1, cp4Var2));
        }
    }

    public abstract IInterface m(IBinder iBinder);

    public final void n() {
        this.v.incrementAndGet();
        ArrayList arrayList = this.k;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    gl4 gl4Var = (gl4) arrayList.get(i);
                    synchronized (gl4Var) {
                        gl4Var.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.g) {
            this.h = null;
        }
        v(1, null);
    }

    public o61[] o() {
        return x;
    }

    public abstract Bundle p();

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f) {
            try {
                if (this.m == 5) {
                    throw new DeadObjectException();
                }
                if (!b()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.j;
                g13.t(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        return e() >= 211700000;
    }

    public final /* synthetic */ boolean u(int i, int i2, IInterface iInterface) {
        synchronized (this.f) {
            try {
                if (this.m != i) {
                    return false;
                }
                v(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(int i, IInterface iInterface) {
        p73 p73Var;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f) {
            try {
                this.m = i;
                this.j = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    po4 po4Var = this.l;
                    if (po4Var != null) {
                        ss4 ss4Var = this.d;
                        String str = this.b.a;
                        g13.s(str);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        ss4Var.b(str, po4Var, this.b.b);
                        this.l = null;
                    }
                } else if (i == 2 || i == 3) {
                    po4 po4Var2 = this.l;
                    if (po4Var2 != null && (p73Var = this.b) != null) {
                        String str2 = p73Var.a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        ss4 ss4Var2 = this.d;
                        String str3 = this.b.a;
                        g13.s(str3);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        ss4Var2.b(str3, po4Var2, this.b.b);
                        this.v.incrementAndGet();
                    }
                    po4 po4Var3 = new po4(this, this.v.get());
                    this.l = po4Var3;
                    String strS = s();
                    boolean zT = t();
                    this.b = new p73(strS, zT);
                    if (zT && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.a)));
                    }
                    ss4 ss4Var3 = this.d;
                    String str4 = this.b.a;
                    g13.s(str4);
                    this.b.getClass();
                    String name = this.q;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    ml0 ml0VarA = ss4Var3.a(new fs4(str4, this.b.b), po4Var3, name);
                    if (!(ml0VarA.d == 0)) {
                        String str5 = this.b.a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = ml0VarA.d;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (ml0VarA.h != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", ml0VarA.h);
                        }
                        int i3 = this.v.get();
                        lp4 lp4Var = new lp4(this, i2, bundle);
                        em4 em4Var = this.e;
                        em4Var.sendMessage(em4Var.obtainMessage(7, i3, -1, lp4Var));
                    }
                } else if (i == 4) {
                    g13.s(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
