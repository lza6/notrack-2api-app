package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class dt4 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final d5 b;
    public boolean g;
    public final Intent h;
    public zn4 l;
    public dp4 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final os4 j = new IBinder.DeathRecipient() { // from class: os4
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            dt4 dt4Var = this.a;
            int i = 0;
            dt4Var.b.f("reportBinderDeath", new Object[0]);
            if (dt4Var.i.get() != null) {
                m51.t();
                return;
            }
            dt4Var.b.f("%s : Binder has died.", dt4Var.c);
            ArrayList arrayList = dt4Var.d;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                RemoteException remoteException = new RemoteException(String.valueOf(dt4Var.c).concat(" : Binder has died."));
                us3 us3Var = ((gs4) obj).c;
                if (us3Var != null) {
                    us3Var.a(remoteException);
                }
            }
            dt4Var.d.clear();
            synchronized (dt4Var.f) {
                dt4Var.d();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [os4] */
    public dt4(Context context, d5 d5Var, Intent intent) {
        this.a = context;
        this.b = d5Var;
        this.h = intent;
    }

    public static void b(dt4 dt4Var, gs4 gs4Var) {
        dp4 dp4Var = dt4Var.m;
        d5 d5Var = dt4Var.b;
        ArrayList arrayList = dt4Var.d;
        int i = 0;
        if (dp4Var != null || dt4Var.g) {
            if (!dt4Var.g) {
                gs4Var.run();
                return;
            } else {
                d5Var.f("Waiting to bind to the service.", new Object[0]);
                arrayList.add(gs4Var);
                return;
            }
        }
        d5Var.f("Initiate binding to the service.", new Object[0]);
        arrayList.add(gs4Var);
        zn4 zn4Var = new zn4(1, dt4Var);
        dt4Var.l = zn4Var;
        dt4Var.g = true;
        if (dt4Var.a.bindService(dt4Var.h, zn4Var, 1)) {
            return;
        }
        d5Var.f("Failed to bind to the service.", new Object[0]);
        dt4Var.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            eg0 eg0Var = new eg0("Failed to bind to the service.");
            us3 us3Var = ((gs4) obj).c;
            if (us3Var != null) {
                us3Var.a(eg0Var);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(us3 us3Var) {
        synchronized (this.f) {
            this.e.remove(us3Var);
        }
        a().post(new us4(0, this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((us3) it.next()).a(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
